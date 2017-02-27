/*******************************************************************************
 * Copyright (c) 2017 Politecnico di Torino and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/

package it.polito.grpc.test;

import static org.junit.Assert.assertEquals;

import io.grpc.ManagedChannel;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.verigraph.ConfigurationGrpc;
import io.grpc.verigraph.GetRequest;
import io.grpc.verigraph.GraphGrpc;
import io.grpc.verigraph.NeighbourGrpc;
import io.grpc.verigraph.NewGraph;
import io.grpc.verigraph.NewNeighbour;
import io.grpc.verigraph.NewNode;
import io.grpc.verigraph.NodeGrpc;
import io.grpc.verigraph.NodeGrpc.FunctionalType;
import io.grpc.verigraph.RequestID;
import io.grpc.verigraph.Status;
import io.grpc.verigraph.VerigraphGrpc;
import it.polito.grpc.Client;
import it.polito.grpc.Service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Unit tests for {@link Service}.
 * For testing basic gRPC unit test only.
 * Not intended to provide a high code coverage or to test every major usecase.
 */
@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GrpcServerTest {
	private Service server;
	private ManagedChannel inProcessChannel;

	@Before
	public void setUp() throws Exception {
		String uniqueServerName = "in-process server for " + getClass();
		// use directExecutor for both InProcessServerBuilder and InProcessChannelBuilder can reduce the
		// usage timeouts and latches in test. But we still add timeout and latches where they would be
		// needed if no directExecutor were used, just for demo purpose.
		server = new Service(InProcessServerBuilder.forName(uniqueServerName).directExecutor(),0);
		server.start();
		inProcessChannel = InProcessChannelBuilder.forName(uniqueServerName).directExecutor().build();
	}

	@After
	public void tearDown() throws Exception {
		inProcessChannel.shutdownNow();
		server.stop();
	}

	@Test
	public void test1Graph() throws Exception {
		RequestID request = RequestID.newBuilder().setIdGraph(1).build() ;//id not present
		GraphGrpc ufoundedGraph = GraphGrpc.newBuilder()
				.setErrorMessage("Graph with id 1 not found").build();
		VerigraphGrpc.VerigraphBlockingStub stub = VerigraphGrpc.newBlockingStub(inProcessChannel);

		// graph not found in the server
		GraphGrpc graph = stub.getGraph(request);

		assertEquals(ufoundedGraph, graph);

		// getGraph in the server, but first add it
		GraphGrpc addedGraph = GraphGrpc.newBuilder().build();
		NewGraph response = stub.createGraph(addedGraph);
		addedGraph = response.getGraph();
		request = RequestID.newBuilder().setIdGraph(1).build() ;
		graph = stub.getGraph(request);

		assertEquals(addedGraph.getId(), graph.getId());

		//updateGraph
		GraphGrpc updatedGraph = GraphGrpc.newBuilder().setId(response.getGraph().getId()).build();
		response = stub.updateGraph(updatedGraph);

		assertEquals(response.getSuccess(),true);
	}

	@Test
	public void test2Graphs() throws Exception {
		// setup
		GetRequest request = GetRequest.newBuilder().build();
		GraphGrpc g1 = GraphGrpc.newBuilder().build();
		GraphGrpc g2 = GraphGrpc.newBuilder().build();
		GraphGrpc g3 = GraphGrpc.newBuilder().build();
		GraphGrpc g4 = GraphGrpc.newBuilder().build();

		VerigraphGrpc.VerigraphBlockingStub stub = VerigraphGrpc.newBlockingStub(inProcessChannel);

		stub.createGraph(g1);
		stub.createGraph(g2);
		stub.createGraph(g3);
		stub.createGraph(g4);
		g1 = GraphGrpc.newBuilder(g1).setId(1).build();
		g2 = GraphGrpc.newBuilder(g2).setId(2).build();
		g3 = GraphGrpc.newBuilder(g3).setId(3).build();
		g4 = GraphGrpc.newBuilder(g4).setId(4).build();
		// run
		Iterator<GraphGrpc> graphs = stub.getGraphs(request);

		assertEquals(graphs.next(), g1);
		assertEquals(graphs.next(), g2);
		assertEquals(graphs.next(), g3);
		assertEquals(graphs.next(), g4);

		//deleteGraph
		RequestID req = RequestID.newBuilder().setIdGraph(g1.getId()).build();
		stub.deleteGraph(req);
		// run
		graphs = stub.getGraphs(request);

		assertEquals(graphs.next(), g2);
		assertEquals(graphs.next(), g3);
		assertEquals(graphs.next(), g4);
	}

	@Test
	public void test3Node() throws Exception {
		RequestID request = RequestID.newBuilder().setIdGraph(2).setIdNode(1).build() ;//id not present
		NodeGrpc ufoundedGraph = NodeGrpc.newBuilder()
					.setErrorMessage("Node with id 1 not found in graph with id 2").build();
		VerigraphGrpc.VerigraphBlockingStub stub = VerigraphGrpc.newBlockingStub(inProcessChannel);

		// graph not found in the server
		NodeGrpc node = stub.getNode(request);

		assertEquals(ufoundedGraph, node);

		// graph found in the server, but first add it
		NodeGrpc addedNode = NodeGrpc.newBuilder().setName("client").setIdGraph(2)
				.setFunctionalType(FunctionalType.endhost).build();
		NewNode response = stub.createNode(addedNode);
		addedNode = response.getNode();
		request = RequestID.newBuilder().setIdGraph(2).setIdNode(1).build() ;
		node = stub.getNode(request);

		assertEquals(addedNode.getId(), node.getId());
		assertEquals(addedNode.getName(),"client");

		//updateNode
		NodeGrpc updatedNode = NodeGrpc.newBuilder().setName("Nodo2").setIdGraph(2).setId(1)
				.setFunctionalType(FunctionalType.endhost).build();
		response = stub.updateNode(updatedNode);

		assertEquals(response.getSuccess(),true);
		assertEquals(response.getNode().getName(),"Nodo2");

		//configureNode
		Map<String,String> params = new HashMap<String,String>();
		params.put("url", "www.facebook.com");
		params.put("body", "word");
		params.put("destination","server");
		params.put("protocol", "HTTP_REQUEST");
		ConfigurationGrpc configuration = Client.createConfigurationGrpc(params, null, null, null);
		ConfigurationGrpc config = ConfigurationGrpc.newBuilder(configuration).setIdGraph(2)
							.setIdNode(1).build();

		Status status = stub.configureNode(config);

		assertEquals(status.getSuccess(),true);
	}

	@Test
	public void test4Nodes() throws Exception {
		// setup
		RequestID request = RequestID.newBuilder().setIdGraph(2).build();
		NodeGrpc n1 = NodeGrpc.newBuilder(Client.createNodeGrpc("Node5", "endhost", null, null))
				.setIdGraph(2).build();
		NodeGrpc n2 =  NodeGrpc.newBuilder(Client.createNodeGrpc("Node3", "endhost", null, null))
				.setIdGraph(2).build();
		NodeGrpc n3 =  NodeGrpc.newBuilder(Client.createNodeGrpc("Node4", "endhost", null, null))
				.setIdGraph(2).build();
		NodeGrpc n4 =  NodeGrpc.newBuilder(Client.createNodeGrpc("client", "endhost", null, null))
				.setIdGraph(2).build();

		VerigraphGrpc.VerigraphBlockingStub stub = VerigraphGrpc.newBlockingStub(inProcessChannel);

		stub.createNode(n1);
		stub.createNode(n2);
		stub.createNode(n3);
		stub.createNode(n4);
		n1 = NodeGrpc.newBuilder(n1).setId(2).setIdGraph(0).build();
		n2 = NodeGrpc.newBuilder(n2).setId(3).setIdGraph(0).build();
		n3 = NodeGrpc.newBuilder(n3).setId(4).setIdGraph(0).build();
		n4 = NodeGrpc.newBuilder(n4).setId(5).setIdGraph(0).build();
		// run
		Iterator<NodeGrpc> nodes = stub.getNodes(request);

		nodes.next();
		assertEquals(nodes.next(), n1);
		assertEquals(nodes.next(), n2);
		assertEquals(nodes.next(), n3);
		assertEquals(nodes.next(), n4);

		//deleteNode
		RequestID req = RequestID.newBuilder().setIdGraph(2).setIdNode(1).build();
		stub.deleteNode(req);
		// run
		nodes = stub.getNodes(request);

		assertEquals(nodes.next(), n1);
		assertEquals(nodes.next(), n2);
		assertEquals(nodes.next(), n3);
		assertEquals(nodes.next(), n4);
	}

	@Test
	public void test5Neighbours() throws Exception {
		RequestID request = RequestID.newBuilder().setIdGraph(2).setIdNode(2).setIdNeighbour(1).build() ;//id not present
		NeighbourGrpc ufoundedNeighbour = NeighbourGrpc.newBuilder()
						.setErrorMessage("Neighbour with id 1 not found for node with id 2 in graph with id 2").build();;
		VerigraphGrpc.VerigraphBlockingStub stub = VerigraphGrpc.newBlockingStub(inProcessChannel);

		// Neighbour not found in the server
		NeighbourGrpc neighbour = stub.getNeighbour(request);

		assertEquals(ufoundedNeighbour, neighbour);

		// getNeighbour, but first add it
		NeighbourGrpc addedNeighbour = NeighbourGrpc.newBuilder().setIdGraph(2).setIdNode(2)
										.setName("client").build();
		NewNeighbour response = stub.createNeighbour(addedNeighbour);
		addedNeighbour = response.getNeighbour();
		request = RequestID.newBuilder().setIdGraph(2).setIdNode(2)
						.setIdNeighbour(addedNeighbour.getId()).build();
		neighbour = stub.getNeighbour(request);

		assertEquals(addedNeighbour.getId(), neighbour.getId());

		//updateNeighbour
		NeighbourGrpc updatedNeighbour = Client.createNeighbourGrpc("Node4");
		NeighbourGrpc nu = NeighbourGrpc.newBuilder(updatedNeighbour)
				.setId(response.getNeighbour().getId()).setIdGraph(2).setIdNode(2).build();
		response = stub.updateNeighbour(nu);

		assertEquals(response.getSuccess(),true);
		assertEquals(response.getNeighbour().getName(),"Node4");
	}

	@Test
	public void test6Neighbours() throws Exception {
		// setup
		RequestID request = RequestID.newBuilder().setIdGraph(2).setIdNode(2).build();
		NeighbourGrpc n1 = NeighbourGrpc.newBuilder().setIdGraph(2).setIdNode(2)
							.setName("Node3").build();
		NeighbourGrpc n2 = NeighbourGrpc.newBuilder().setIdGraph(2).setIdNode(2)
							.setName("client").build();

		VerigraphGrpc.VerigraphBlockingStub stub = VerigraphGrpc.newBlockingStub(inProcessChannel);

		stub.createNeighbour(n1);
		stub.createNeighbour(n2);
		n1 = NeighbourGrpc.newBuilder(n1).setId(2).setIdGraph(0).setIdNode(0).build();
		n2 = NeighbourGrpc.newBuilder(n2).setId(3).setIdGraph(0).setIdNode(0).build();
		// run
		Iterator<NeighbourGrpc> neighbours = stub.getNeighbours(request);

		neighbours.next();
		assertEquals(neighbours.next(), n1);
		assertEquals(neighbours.next(), n2);

		//deleteNeighbour
		RequestID req = RequestID.newBuilder().setIdGraph(2).setIdNode(2).setIdNeighbour(1).build();
		stub.deleteNeighbour(req);
		// run
		neighbours = stub.getNeighbours(request);

		assertEquals(neighbours.next(), n1);
		assertEquals(neighbours.next(), n2);
	}
}
