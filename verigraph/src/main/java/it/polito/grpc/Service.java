/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package it.polito.grpc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import io.grpc.verigraph.ConfigurationGrpc;
import io.grpc.verigraph.GetRequest;
import io.grpc.verigraph.GraphGrpc;
import io.grpc.verigraph.NeighbourGrpc;
import io.grpc.verigraph.NewGraph;
import io.grpc.verigraph.NewNeighbour;
import io.grpc.verigraph.NewNode;
import io.grpc.verigraph.NodeGrpc;
import io.grpc.verigraph.Policy;
import io.grpc.verigraph.RequestID;
import io.grpc.verigraph.Status;
import io.grpc.verigraph.VerificationGrpc;
import io.grpc.verigraph.VerigraphGrpc;
import it.polito.escape.verify.exception.BadRequestException;
import it.polito.escape.verify.exception.DataNotFoundException;
import it.polito.escape.verify.exception.ForbiddenException;
import it.polito.escape.verify.model.Configuration;
import it.polito.escape.verify.model.Graph;
import it.polito.escape.verify.model.Neighbour;
import it.polito.escape.verify.model.Node;
import it.polito.escape.verify.model.Verification;
import it.polito.escape.verify.resources.beans.VerificationBean;
import it.polito.escape.verify.service.GraphService;
import it.polito.escape.verify.service.NeighbourService;
import it.polito.escape.verify.service.NodeService;
import it.polito.escape.verify.service.VerificationService;

public class Service {
	  /** Port on which the server should run. */
	  private static final Logger logger = Logger.getLogger(Service.class.getName());
	  private static final int port = 50051;
	  private static final String internalError = "Internal Server Error";
	  private Server server;
	  private GraphService graphService	= new GraphService();
	  private VerificationService verificationService = new VerificationService();
	  private NodeService nodeService = new NodeService();
	  private NeighbourService neighboursService = new NeighbourService();

	  public Service(int port)  {
		  this(ServerBuilder.forPort(port), port);
	  }

	  /** Create a RouteGuide server using serverBuilder as a base and features as data. */
	  public Service(ServerBuilder<?> serverBuilder, int port) {
		  server = serverBuilder.addService(new VerigraphImpl())
				  .build();
	  }

	  public void start() throws IOException {
		  server.start();
		  logger.info("Server started, listening on "+ port);
		  Runtime.getRuntime().addShutdownHook(new Thread() {
			  @Override
			  public void run() {
				  logger.info("*** Shutting down gRPC server since JVM is shutting down");
				  Service.this.stop();
				  logger.info("*** Server shut down");
			  }
		  });
	  }

	  public void stop() {
		  if (server != null) {
			  server.shutdown();
		  }
	  }

	  private void blockUntilShutdown() throws InterruptedException {
		  if (server != null) {
			  server.awaitTermination();
		  }
	  }

	  /** Main function to launch server from cmd. */
	  public static void main(String[] args) throws IOException, InterruptedException {
		  try{
			  Service server = new Service(port);
			  server.start();
			  server.blockUntilShutdown();
		  }
		  catch(Exception ex){
			  logger.log(Level.WARNING, ex.getMessage());
		  }
	  }

	  /**Here start method of my impementation*/
	  private class VerigraphImpl extends VerigraphGrpc.VerigraphImplBase{

		  /** Here start methods of GraphResource*/
		  @Override
		  public void getGraphs(GetRequest request, StreamObserver<GraphGrpc> responseObserver) {
			  try{
				  for(Graph item : graphService.getAllGraphs()) {
					  GraphGrpc gr = GrpcUtils.obtainGraph(item);
					  responseObserver.onNext(gr);
				  }
			  }catch(Exception ex){
				  GraphGrpc nr = GraphGrpc.newBuilder().setErrorMessage(internalError).build();
				  responseObserver.onNext(nr);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void createGraph(GraphGrpc request, StreamObserver<NewGraph> responseObserver) {
			  NewGraph.Builder response = NewGraph.newBuilder();
			  try{
				  Graph graph = GrpcUtils.deriveGraph(request);
				  Graph newGraph = graphService.addGraph(graph);
				  response.setSuccess(true).setGraph(GrpcUtils.obtainGraph(newGraph));
			  }catch(BadRequestException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(internalError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void deleteGraph(RequestID request, StreamObserver<Status> responseObserver) {

			  Status.Builder response = Status.newBuilder();
			  try{
				  graphService.removeGraph(request.getIdGraph());
				  response.setSuccess(true);
			  }catch(ForbiddenException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }	catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(internalError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void getGraph(RequestID request, StreamObserver<GraphGrpc> responseObserver) {
			  try{
				  Graph graph = graphService.getGraph(request.getIdGraph());
				  GraphGrpc gr = GrpcUtils.obtainGraph(graph);
				  responseObserver.onNext(gr);
			  }catch(ForbiddenException | DataNotFoundException ex){
				  GraphGrpc grError = GraphGrpc.newBuilder().setErrorMessage(ex.getMessage()).build();
				  responseObserver.onNext(grError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  GraphGrpc grError = GraphGrpc.newBuilder().setErrorMessage(internalError).build();
				  responseObserver.onNext(grError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void updateGraph(GraphGrpc request, StreamObserver<NewGraph> responseObserver) {
			  NewGraph.Builder response = NewGraph.newBuilder();
			  try{
				  Graph graph = GrpcUtils.deriveGraph(request);
				  graph.setId(request.getId());
				  Graph newGraph = graphService.updateGraph(graph);
				  response.setSuccess(true).setGraph(GrpcUtils.obtainGraph(newGraph));
			  }catch(ForbiddenException | DataNotFoundException | BadRequestException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(internalError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void verifyPolicy(Policy request, StreamObserver<VerificationGrpc> responseObserver) {

			  VerificationGrpc.Builder verification;
			  try{
				  //Convert request
				  VerificationBean verify = new VerificationBean();
				  verify.setDestination(request.getDestination());
				  verify.setSource(request.getSource());
				  verify.setType(request.getType().toString());
				  verify.setMiddlebox(request.getMiddlebox());

				  //Convert Response
				  Verification ver = verificationService.verify(request.getIdGraph(), verify);
				  verification = VerificationGrpc.newBuilder(GrpcUtils.obtainVerification(ver))
						  			.setSuccessOfOperation(true);
			  }catch(ForbiddenException | DataNotFoundException | BadRequestException ex){
				  verification = VerificationGrpc.newBuilder().setSuccessOfOperation(false)
						  			.setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }	catch(Exception ex){
				  verification = VerificationGrpc.newBuilder().setSuccessOfOperation(false)
						  			.setErrorMessage(internalError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(verification.build());
			  responseObserver.onCompleted();
		  }

		  /** Here start methods of NodeResource*/

		  @Override
		  public void getNodes(RequestID request, StreamObserver<NodeGrpc> responseObserver) {
			  try{
				  for (Node item : nodeService.getAllNodes(request.getIdGraph())) {
					  NodeGrpc nr = GrpcUtils.obtainNode(item);
					  responseObserver.onNext(nr);
				  }
			  }catch(ForbiddenException | DataNotFoundException ex){
				  NodeGrpc nr = NodeGrpc.newBuilder().setErrorMessage(ex.getMessage()).build();
				  responseObserver.onNext(nr);
				  logger.log(Level.WARNING, ex.getMessage());
			  }	catch(Exception ex){
				  NodeGrpc nr = NodeGrpc.newBuilder().setErrorMessage(internalError).build();
				  responseObserver.onNext(nr);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void createNode(NodeGrpc request, StreamObserver<NewNode> responseObserver) {
			  NewNode.Builder response = NewNode.newBuilder();
			  try{
				  Node node = GrpcUtils.deriveNode(request);
				  Node newNode = nodeService.addNode(request.getIdGraph(), node);
				  response.setSuccess(true).setNode(GrpcUtils.obtainNode(newNode));
			  }catch(ForbiddenException | DataNotFoundException | BadRequestException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(internalError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void deleteNode(RequestID request, StreamObserver<Status> responseObserver) {
			  Status.Builder response = Status.newBuilder();
			  try{
				  nodeService.removeNode(request.getIdGraph(), request.getIdNode());
				  response.setSuccess(true);
			  }catch(ForbiddenException | DataNotFoundException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(internalError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void getNode(RequestID request, StreamObserver<NodeGrpc> responseObserver) {
			  NodeGrpc nr;
			  try{
				  Node node = nodeService.getNode(request.getIdGraph(), request.getIdNode());
				  nr= GrpcUtils.obtainNode(node);
			  }catch(ForbiddenException | DataNotFoundException ex){
				  nr = NodeGrpc.newBuilder().setErrorMessage(ex.getMessage()).build();
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  nr = NodeGrpc.newBuilder().setErrorMessage(internalError).build();
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(nr);
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void updateNode(NodeGrpc request, StreamObserver<NewNode> responseObserver) {
			  NewNode.Builder response = NewNode.newBuilder();
			  try{
				  Node node = GrpcUtils.deriveNode(request);
				  node.setId(request.getId());
				  Node newNode = nodeService.updateNode(request.getIdGraph(), node);
				  response.setSuccess(true).setNode(GrpcUtils.obtainNode(newNode));
			  }catch(ForbiddenException | DataNotFoundException | BadRequestException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(internalError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void configureNode(ConfigurationGrpc request, StreamObserver<Status> responseObserver) {
			  Status.Builder response = Status.newBuilder();
			  try{
				  if (request.getIdGraph() <= 0) {
					  throw new ForbiddenException("Illegal graph id: " + request.getIdGraph());
				  }
				  if (request.getIdNode() <= 0) {
					  throw new ForbiddenException("Illegal node id: " + request.getIdNode());
				  }
				  Graph graph = new GraphService().getGraph(request.getIdGraph());
				  if (graph == null){
					  throw new BadRequestException("Graph with id " + request.getIdGraph() + " not found");
				  }
				  Node node = nodeService.getNode(request.getIdGraph(), request.getIdNode());
				  if (node == null){
					  throw new BadRequestException("Node with id " + request.getIdNode() + " not found in graph with id " + request.getIdGraph());
				  }
				  Configuration nodeConfiguration = GrpcUtils.deriveConfiguration(request);
				  Node nodeCopy = new Node();
				  nodeCopy.setId(node.getId());
				  nodeCopy.setName(node.getName());
				  nodeCopy.setFunctional_type(node.getFunctional_type());
				  Map<Long,Neighbour> nodes = new HashMap<Long,Neighbour>();
				  nodes.putAll(node.getNeighbours());
				  nodeCopy.setNeighbours(nodes);
				  nodeConfiguration.setId(nodeCopy.getName());
				  nodeCopy.setConfiguration(nodeConfiguration);

				  Graph graphCopy = new Graph();
				  graphCopy.setId(graph.getId());
				  graphCopy.setNodes(new HashMap<Long, Node>(graph.getNodes()));
				  graphCopy.getNodes().remove(node.getId());

				  NodeService.validateNode(graphCopy, nodeCopy);

				  graph.getNodes().put(request.getIdNode(), nodeCopy);
				  response.setSuccess(true);
			  }catch(ForbiddenException | BadRequestException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(internalError);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }

		  /** Here start methods of NeighbourResource*/
		  @Override
		  public void getNeighbours(RequestID request, StreamObserver<NeighbourGrpc> responseObserver) {
			  try{
				  for(Neighbour item : neighboursService.getAllNeighbours(request.getIdGraph(), request.getIdNode())) {
					  NeighbourGrpc nr = GrpcUtils.obtainNeighbour(item);
					  responseObserver.onNext(nr);
				  }
			  }catch(ForbiddenException | DataNotFoundException ex){
				  NeighbourGrpc nr = NeighbourGrpc.newBuilder().setErrorMessage(ex.getMessage()).build();
				  responseObserver.onNext(nr);
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  NeighbourGrpc nr = NeighbourGrpc.newBuilder().setErrorMessage(internalError).build();
				  responseObserver.onNext(nr);
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void createNeighbour(NeighbourGrpc request, StreamObserver<NewNeighbour> responseObserver) {
			  NewNeighbour.Builder response = NewNeighbour.newBuilder();
			  try{
				  Neighbour neighbour = GrpcUtils.deriveNeighbour(request);
				  Neighbour newNeighbour = neighboursService.addNeighbour(request.getIdGraph(), request.getIdNode(), neighbour);
				  response.setSuccess(true).setNeighbour(GrpcUtils.obtainNeighbour(newNeighbour));
			  }catch(ForbiddenException | DataNotFoundException | BadRequestException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void deleteNeighbour(RequestID request, StreamObserver<Status> responseObserver) {
			  Status.Builder response = Status.newBuilder();
			  try{
				  neighboursService.removeNeighbour(request.getIdGraph(), request.getIdNode(), request.getIdNeighbour());
				  response.setSuccess(true);
			  }catch(ForbiddenException | DataNotFoundException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void getNeighbour(RequestID request, StreamObserver<NeighbourGrpc> responseObserver) {
			  NeighbourGrpc nr;
			  try{
				  Neighbour neighbour = neighboursService.getNeighbour(request.getIdGraph(),
						  request.getIdNode(), request.getIdNeighbour());
				  nr = GrpcUtils.obtainNeighbour(neighbour);

			  }catch(ForbiddenException | DataNotFoundException ex){
				  nr = NeighbourGrpc.newBuilder().setErrorMessage(ex.getMessage()).build();
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  nr = NeighbourGrpc.newBuilder().setErrorMessage(internalError).build();
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(nr);
			  responseObserver.onCompleted();
		  }

		  @Override
		  public void updateNeighbour(NeighbourGrpc request, StreamObserver<NewNeighbour> responseObserver) {
			  NewNeighbour.Builder response = NewNeighbour.newBuilder();
			  try{
				  Neighbour neighbour = GrpcUtils.deriveNeighbour(request);
				  neighbour.setId(request.getId());
				  Neighbour newNeighbour = neighboursService.updateNeighbour(request.getIdGraph(), request.getIdNode(), neighbour);
				  response.setSuccess(true).setNeighbour(GrpcUtils.obtainNeighbour(newNeighbour));
			  }catch(ForbiddenException | DataNotFoundException | BadRequestException ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }catch(Exception ex){
				  response.setSuccess(false).setErrorMessage(ex.getMessage());
				  logger.log(Level.WARNING, ex.getMessage());
			  }
			  responseObserver.onNext(response.build());
			  responseObserver.onCompleted();
		  }
	  }
}
