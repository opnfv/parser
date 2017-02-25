/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.3)",
    comments = "Source: verigraph.proto")
public class VerigraphGrpc {

  private VerigraphGrpc() {}

  public static final String SERVICE_NAME = "verigraph.Verigraph";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.GetRequest,
      io.grpc.verigraph.GraphGrpc> METHOD_GET_GRAPHS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "verigraph.Verigraph", "GetGraphs"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.GetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.GraphGrpc.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.RequestID,
      io.grpc.verigraph.GraphGrpc> METHOD_GET_GRAPH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "GetGraph"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.RequestID.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.GraphGrpc.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.RequestID,
      io.grpc.verigraph.NodeGrpc> METHOD_GET_NODES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "verigraph.Verigraph", "GetNodes"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.RequestID.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NodeGrpc.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.RequestID,
      io.grpc.verigraph.NodeGrpc> METHOD_GET_NODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "GetNode"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.RequestID.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NodeGrpc.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.RequestID,
      io.grpc.verigraph.NeighbourGrpc> METHOD_GET_NEIGHBOURS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "verigraph.Verigraph", "GetNeighbours"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.RequestID.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NeighbourGrpc.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.RequestID,
      io.grpc.verigraph.NeighbourGrpc> METHOD_GET_NEIGHBOUR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "GetNeighbour"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.RequestID.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NeighbourGrpc.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.GraphGrpc,
      io.grpc.verigraph.NewGraph> METHOD_CREATE_GRAPH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "CreateGraph"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.GraphGrpc.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NewGraph.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.RequestID,
      io.grpc.verigraph.Status> METHOD_DELETE_GRAPH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "DeleteGraph"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.RequestID.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.Status.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.GraphGrpc,
      io.grpc.verigraph.NewGraph> METHOD_UPDATE_GRAPH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "UpdateGraph"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.GraphGrpc.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NewGraph.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.Policy,
      io.grpc.verigraph.VerificationGrpc> METHOD_VERIFY_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "VerifyPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.Policy.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.VerificationGrpc.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.NodeGrpc,
      io.grpc.verigraph.NewNode> METHOD_CREATE_NODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "CreateNode"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NodeGrpc.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NewNode.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.RequestID,
      io.grpc.verigraph.Status> METHOD_DELETE_NODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "DeleteNode"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.RequestID.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.Status.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.NodeGrpc,
      io.grpc.verigraph.NewNode> METHOD_UPDATE_NODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "UpdateNode"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NodeGrpc.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NewNode.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.ConfigurationGrpc,
      io.grpc.verigraph.Status> METHOD_CONFIGURE_NODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "ConfigureNode"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.ConfigurationGrpc.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.Status.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.NeighbourGrpc,
      io.grpc.verigraph.NewNeighbour> METHOD_CREATE_NEIGHBOUR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "CreateNeighbour"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NeighbourGrpc.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NewNeighbour.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.RequestID,
      io.grpc.verigraph.Status> METHOD_DELETE_NEIGHBOUR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "DeleteNeighbour"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.RequestID.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.Status.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.verigraph.NeighbourGrpc,
      io.grpc.verigraph.NewNeighbour> METHOD_UPDATE_NEIGHBOUR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "verigraph.Verigraph", "UpdateNeighbour"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NeighbourGrpc.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.verigraph.NewNeighbour.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VerigraphStub newStub(io.grpc.Channel channel) {
    return new VerigraphStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VerigraphBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VerigraphBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static VerigraphFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VerigraphFutureStub(channel);
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static abstract class VerigraphImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Obtains a list of graphs
     * </pre>
     */
    public void getGraphs(io.grpc.verigraph.GetRequest request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.GraphGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GRAPHS, responseObserver);
    }

    /**
     * <pre>
     * Obtains a graph
     * </pre>
     */
    public void getGraph(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.GraphGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GRAPH, responseObserver);
    }

    /**
     * <pre>
     * Obtains a list of Nodes
     * </pre>
     */
    public void getNodes(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NodeGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NODES, responseObserver);
    }

    /**
     * <pre>
     * Obtains a node
     * </pre>
     */
    public void getNode(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NodeGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NODE, responseObserver);
    }

    /**
     * <pre>
     * Obtains a list of Neighbours
     * </pre>
     */
    public void getNeighbours(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NeighbourGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NEIGHBOURS, responseObserver);
    }

    /**
     * <pre>
     * Obtains a Neighbour
     * </pre>
     */
    public void getNeighbour(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NeighbourGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NEIGHBOUR, responseObserver);
    }

    /**
     * <pre>
     * Creates a graph
     * </pre>
     */
    public void createGraph(io.grpc.verigraph.GraphGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewGraph> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_GRAPH, responseObserver);
    }

    /**
     * <pre>
     * Delete a graph
     * </pre>
     */
    public void deleteGraph(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_GRAPH, responseObserver);
    }

    /**
     * <pre>
     * Updates a graph
     * </pre>
     */
    public void updateGraph(io.grpc.verigraph.GraphGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewGraph> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_GRAPH, responseObserver);
    }

    /**
     * <pre>
     * Verify a policy
     * </pre>
     */
    public void verifyPolicy(io.grpc.verigraph.Policy request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.VerificationGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VERIFY_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Creates a Node
     * </pre>
     */
    public void createNode(io.grpc.verigraph.NodeGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNode> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_NODE, responseObserver);
    }

    /**
     * <pre>
     * Delete a Node
     * </pre>
     */
    public void deleteNode(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_NODE, responseObserver);
    }

    /**
     * <pre>
     * Updates a Node
     * </pre>
     */
    public void updateNode(io.grpc.verigraph.NodeGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNode> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_NODE, responseObserver);
    }

    /**
     * <pre>
     * Configures a Node
     * </pre>
     */
    public void configureNode(io.grpc.verigraph.ConfigurationGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONFIGURE_NODE, responseObserver);
    }

    /**
     * <pre>
     * Creates a neighbour
     * </pre>
     */
    public void createNeighbour(io.grpc.verigraph.NeighbourGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNeighbour> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_NEIGHBOUR, responseObserver);
    }

    /**
     * <pre>
     * Delete a neighbour
     * </pre>
     */
    public void deleteNeighbour(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_NEIGHBOUR, responseObserver);
    }

    /**
     * <pre>
     * Updates a neighbour
     * </pre>
     */
    public void updateNeighbour(io.grpc.verigraph.NeighbourGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNeighbour> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_NEIGHBOUR, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_GRAPHS,
            asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.verigraph.GetRequest,
                io.grpc.verigraph.GraphGrpc>(
                  this, METHODID_GET_GRAPHS)))
          .addMethod(
            METHOD_GET_GRAPH,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.RequestID,
                io.grpc.verigraph.GraphGrpc>(
                  this, METHODID_GET_GRAPH)))
          .addMethod(
            METHOD_GET_NODES,
            asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.verigraph.RequestID,
                io.grpc.verigraph.NodeGrpc>(
                  this, METHODID_GET_NODES)))
          .addMethod(
            METHOD_GET_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.RequestID,
                io.grpc.verigraph.NodeGrpc>(
                  this, METHODID_GET_NODE)))
          .addMethod(
            METHOD_GET_NEIGHBOURS,
            asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.verigraph.RequestID,
                io.grpc.verigraph.NeighbourGrpc>(
                  this, METHODID_GET_NEIGHBOURS)))
          .addMethod(
            METHOD_GET_NEIGHBOUR,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.RequestID,
                io.grpc.verigraph.NeighbourGrpc>(
                  this, METHODID_GET_NEIGHBOUR)))
          .addMethod(
            METHOD_CREATE_GRAPH,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.GraphGrpc,
                io.grpc.verigraph.NewGraph>(
                  this, METHODID_CREATE_GRAPH)))
          .addMethod(
            METHOD_DELETE_GRAPH,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.RequestID,
                io.grpc.verigraph.Status>(
                  this, METHODID_DELETE_GRAPH)))
          .addMethod(
            METHOD_UPDATE_GRAPH,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.GraphGrpc,
                io.grpc.verigraph.NewGraph>(
                  this, METHODID_UPDATE_GRAPH)))
          .addMethod(
            METHOD_VERIFY_POLICY,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.Policy,
                io.grpc.verigraph.VerificationGrpc>(
                  this, METHODID_VERIFY_POLICY)))
          .addMethod(
            METHOD_CREATE_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.NodeGrpc,
                io.grpc.verigraph.NewNode>(
                  this, METHODID_CREATE_NODE)))
          .addMethod(
            METHOD_DELETE_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.RequestID,
                io.grpc.verigraph.Status>(
                  this, METHODID_DELETE_NODE)))
          .addMethod(
            METHOD_UPDATE_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.NodeGrpc,
                io.grpc.verigraph.NewNode>(
                  this, METHODID_UPDATE_NODE)))
          .addMethod(
            METHOD_CONFIGURE_NODE,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.ConfigurationGrpc,
                io.grpc.verigraph.Status>(
                  this, METHODID_CONFIGURE_NODE)))
          .addMethod(
            METHOD_CREATE_NEIGHBOUR,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.NeighbourGrpc,
                io.grpc.verigraph.NewNeighbour>(
                  this, METHODID_CREATE_NEIGHBOUR)))
          .addMethod(
            METHOD_DELETE_NEIGHBOUR,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.RequestID,
                io.grpc.verigraph.Status>(
                  this, METHODID_DELETE_NEIGHBOUR)))
          .addMethod(
            METHOD_UPDATE_NEIGHBOUR,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.verigraph.NeighbourGrpc,
                io.grpc.verigraph.NewNeighbour>(
                  this, METHODID_UPDATE_NEIGHBOUR)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class VerigraphStub extends io.grpc.stub.AbstractStub<VerigraphStub> {
    private VerigraphStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VerigraphStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerigraphStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VerigraphStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains a list of graphs
     * </pre>
     */
    public void getGraphs(io.grpc.verigraph.GetRequest request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.GraphGrpc> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_GRAPHS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Obtains a graph
     * </pre>
     */
    public void getGraph(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.GraphGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GRAPH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Obtains a list of Nodes
     * </pre>
     */
    public void getNodes(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NodeGrpc> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_NODES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Obtains a node
     * </pre>
     */
    public void getNode(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NodeGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Obtains a list of Neighbours
     * </pre>
     */
    public void getNeighbours(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NeighbourGrpc> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_NEIGHBOURS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Obtains a Neighbour
     * </pre>
     */
    public void getNeighbour(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NeighbourGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NEIGHBOUR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a graph
     * </pre>
     */
    public void createGraph(io.grpc.verigraph.GraphGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewGraph> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_GRAPH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a graph
     * </pre>
     */
    public void deleteGraph(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_GRAPH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a graph
     * </pre>
     */
    public void updateGraph(io.grpc.verigraph.GraphGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewGraph> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GRAPH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify a policy
     * </pre>
     */
    public void verifyPolicy(io.grpc.verigraph.Policy request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.VerificationGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VERIFY_POLICY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a Node
     * </pre>
     */
    public void createNode(io.grpc.verigraph.NodeGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNode> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_NODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a Node
     * </pre>
     */
    public void deleteNode(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_NODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a Node
     * </pre>
     */
    public void updateNode(io.grpc.verigraph.NodeGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNode> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configures a Node
     * </pre>
     */
    public void configureNode(io.grpc.verigraph.ConfigurationGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONFIGURE_NODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a neighbour
     * </pre>
     */
    public void createNeighbour(io.grpc.verigraph.NeighbourGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNeighbour> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_NEIGHBOUR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a neighbour
     * </pre>
     */
    public void deleteNeighbour(io.grpc.verigraph.RequestID request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_NEIGHBOUR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a neighbour
     * </pre>
     */
    public void updateNeighbour(io.grpc.verigraph.NeighbourGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNeighbour> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NEIGHBOUR, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class VerigraphBlockingStub extends io.grpc.stub.AbstractStub<VerigraphBlockingStub> {
    private VerigraphBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VerigraphBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerigraphBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VerigraphBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains a list of graphs
     * </pre>
     */
    public java.util.Iterator<io.grpc.verigraph.GraphGrpc> getGraphs(
        io.grpc.verigraph.GetRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_GRAPHS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Obtains a graph
     * </pre>
     */
    public io.grpc.verigraph.GraphGrpc getGraph(io.grpc.verigraph.RequestID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GRAPH, getCallOptions(), request);
    }

    /**
     * <pre>
     * Obtains a list of Nodes
     * </pre>
     */
    public java.util.Iterator<io.grpc.verigraph.NodeGrpc> getNodes(
        io.grpc.verigraph.RequestID request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_NODES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Obtains a node
     * </pre>
     */
    public io.grpc.verigraph.NodeGrpc getNode(io.grpc.verigraph.RequestID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NODE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Obtains a list of Neighbours
     * </pre>
     */
    public java.util.Iterator<io.grpc.verigraph.NeighbourGrpc> getNeighbours(
        io.grpc.verigraph.RequestID request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_NEIGHBOURS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Obtains a Neighbour
     * </pre>
     */
    public io.grpc.verigraph.NeighbourGrpc getNeighbour(io.grpc.verigraph.RequestID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NEIGHBOUR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a graph
     * </pre>
     */
    public io.grpc.verigraph.NewGraph createGraph(io.grpc.verigraph.GraphGrpc request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_GRAPH, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a graph
     * </pre>
     */
    public io.grpc.verigraph.Status deleteGraph(io.grpc.verigraph.RequestID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_GRAPH, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a graph
     * </pre>
     */
    public io.grpc.verigraph.NewGraph updateGraph(io.grpc.verigraph.GraphGrpc request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_GRAPH, getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify a policy
     * </pre>
     */
    public io.grpc.verigraph.VerificationGrpc verifyPolicy(io.grpc.verigraph.Policy request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VERIFY_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a Node
     * </pre>
     */
    public io.grpc.verigraph.NewNode createNode(io.grpc.verigraph.NodeGrpc request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_NODE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a Node
     * </pre>
     */
    public io.grpc.verigraph.Status deleteNode(io.grpc.verigraph.RequestID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_NODE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a Node
     * </pre>
     */
    public io.grpc.verigraph.NewNode updateNode(io.grpc.verigraph.NodeGrpc request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_NODE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Configures a Node
     * </pre>
     */
    public io.grpc.verigraph.Status configureNode(io.grpc.verigraph.ConfigurationGrpc request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONFIGURE_NODE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a neighbour
     * </pre>
     */
    public io.grpc.verigraph.NewNeighbour createNeighbour(io.grpc.verigraph.NeighbourGrpc request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_NEIGHBOUR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a neighbour
     * </pre>
     */
    public io.grpc.verigraph.Status deleteNeighbour(io.grpc.verigraph.RequestID request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_NEIGHBOUR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a neighbour
     * </pre>
     */
    public io.grpc.verigraph.NewNeighbour updateNeighbour(io.grpc.verigraph.NeighbourGrpc request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_NEIGHBOUR, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class VerigraphFutureStub extends io.grpc.stub.AbstractStub<VerigraphFutureStub> {
    private VerigraphFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VerigraphFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VerigraphFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VerigraphFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains a graph
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.GraphGrpc> getGraph(
        io.grpc.verigraph.RequestID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GRAPH, getCallOptions()), request);
    }

    /**
     * <pre>
     * Obtains a node
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.NodeGrpc> getNode(
        io.grpc.verigraph.RequestID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NODE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Obtains a Neighbour
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.NeighbourGrpc> getNeighbour(
        io.grpc.verigraph.RequestID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NEIGHBOUR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a graph
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.NewGraph> createGraph(
        io.grpc.verigraph.GraphGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_GRAPH, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a graph
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.Status> deleteGraph(
        io.grpc.verigraph.RequestID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_GRAPH, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a graph
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.NewGraph> updateGraph(
        io.grpc.verigraph.GraphGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GRAPH, getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify a policy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.VerificationGrpc> verifyPolicy(
        io.grpc.verigraph.Policy request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VERIFY_POLICY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a Node
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.NewNode> createNode(
        io.grpc.verigraph.NodeGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_NODE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a Node
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.Status> deleteNode(
        io.grpc.verigraph.RequestID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_NODE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a Node
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.NewNode> updateNode(
        io.grpc.verigraph.NodeGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NODE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Configures a Node
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.Status> configureNode(
        io.grpc.verigraph.ConfigurationGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONFIGURE_NODE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a neighbour
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.NewNeighbour> createNeighbour(
        io.grpc.verigraph.NeighbourGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_NEIGHBOUR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a neighbour
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.Status> deleteNeighbour(
        io.grpc.verigraph.RequestID request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_NEIGHBOUR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a neighbour
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.verigraph.NewNeighbour> updateNeighbour(
        io.grpc.verigraph.NeighbourGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NEIGHBOUR, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GRAPHS = 0;
  private static final int METHODID_GET_GRAPH = 1;
  private static final int METHODID_GET_NODES = 2;
  private static final int METHODID_GET_NODE = 3;
  private static final int METHODID_GET_NEIGHBOURS = 4;
  private static final int METHODID_GET_NEIGHBOUR = 5;
  private static final int METHODID_CREATE_GRAPH = 6;
  private static final int METHODID_DELETE_GRAPH = 7;
  private static final int METHODID_UPDATE_GRAPH = 8;
  private static final int METHODID_VERIFY_POLICY = 9;
  private static final int METHODID_CREATE_NODE = 10;
  private static final int METHODID_DELETE_NODE = 11;
  private static final int METHODID_UPDATE_NODE = 12;
  private static final int METHODID_CONFIGURE_NODE = 13;
  private static final int METHODID_CREATE_NEIGHBOUR = 14;
  private static final int METHODID_DELETE_NEIGHBOUR = 15;
  private static final int METHODID_UPDATE_NEIGHBOUR = 16;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VerigraphImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(VerigraphImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GRAPHS:
          serviceImpl.getGraphs((io.grpc.verigraph.GetRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.GraphGrpc>) responseObserver);
          break;
        case METHODID_GET_GRAPH:
          serviceImpl.getGraph((io.grpc.verigraph.RequestID) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.GraphGrpc>) responseObserver);
          break;
        case METHODID_GET_NODES:
          serviceImpl.getNodes((io.grpc.verigraph.RequestID) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NodeGrpc>) responseObserver);
          break;
        case METHODID_GET_NODE:
          serviceImpl.getNode((io.grpc.verigraph.RequestID) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NodeGrpc>) responseObserver);
          break;
        case METHODID_GET_NEIGHBOURS:
          serviceImpl.getNeighbours((io.grpc.verigraph.RequestID) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NeighbourGrpc>) responseObserver);
          break;
        case METHODID_GET_NEIGHBOUR:
          serviceImpl.getNeighbour((io.grpc.verigraph.RequestID) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NeighbourGrpc>) responseObserver);
          break;
        case METHODID_CREATE_GRAPH:
          serviceImpl.createGraph((io.grpc.verigraph.GraphGrpc) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NewGraph>) responseObserver);
          break;
        case METHODID_DELETE_GRAPH:
          serviceImpl.deleteGraph((io.grpc.verigraph.RequestID) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.Status>) responseObserver);
          break;
        case METHODID_UPDATE_GRAPH:
          serviceImpl.updateGraph((io.grpc.verigraph.GraphGrpc) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NewGraph>) responseObserver);
          break;
        case METHODID_VERIFY_POLICY:
          serviceImpl.verifyPolicy((io.grpc.verigraph.Policy) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.VerificationGrpc>) responseObserver);
          break;
        case METHODID_CREATE_NODE:
          serviceImpl.createNode((io.grpc.verigraph.NodeGrpc) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNode>) responseObserver);
          break;
        case METHODID_DELETE_NODE:
          serviceImpl.deleteNode((io.grpc.verigraph.RequestID) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.Status>) responseObserver);
          break;
        case METHODID_UPDATE_NODE:
          serviceImpl.updateNode((io.grpc.verigraph.NodeGrpc) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNode>) responseObserver);
          break;
        case METHODID_CONFIGURE_NODE:
          serviceImpl.configureNode((io.grpc.verigraph.ConfigurationGrpc) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.Status>) responseObserver);
          break;
        case METHODID_CREATE_NEIGHBOUR:
          serviceImpl.createNeighbour((io.grpc.verigraph.NeighbourGrpc) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNeighbour>) responseObserver);
          break;
        case METHODID_DELETE_NEIGHBOUR:
          serviceImpl.deleteNeighbour((io.grpc.verigraph.RequestID) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.Status>) responseObserver);
          break;
        case METHODID_UPDATE_NEIGHBOUR:
          serviceImpl.updateNeighbour((io.grpc.verigraph.NeighbourGrpc) request,
              (io.grpc.stub.StreamObserver<io.grpc.verigraph.NewNeighbour>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_GRAPHS,
        METHOD_GET_GRAPH,
        METHOD_GET_NODES,
        METHOD_GET_NODE,
        METHOD_GET_NEIGHBOURS,
        METHOD_GET_NEIGHBOUR,
        METHOD_CREATE_GRAPH,
        METHOD_DELETE_GRAPH,
        METHOD_UPDATE_GRAPH,
        METHOD_VERIFY_POLICY,
        METHOD_CREATE_NODE,
        METHOD_DELETE_NODE,
        METHOD_UPDATE_NODE,
        METHOD_CONFIGURE_NODE,
        METHOD_CREATE_NEIGHBOUR,
        METHOD_DELETE_NEIGHBOUR,
        METHOD_UPDATE_NEIGHBOUR);
  }

}
