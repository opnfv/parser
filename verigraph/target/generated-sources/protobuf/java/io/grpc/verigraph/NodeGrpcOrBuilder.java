/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

public interface NodeGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:verigraph.NodeGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 idGraph = 1;</code>
   */
  long getIdGraph();

  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *long
   * </pre>
   *
   * <code>optional int64 id = 3;</code>
   */
  long getId();

  /**
   * <code>optional .verigraph.NodeGrpc.FunctionalType functional_type = 4;</code>
   */
  int getFunctionalTypeValue();
  /**
   * <code>optional .verigraph.NodeGrpc.FunctionalType functional_type = 4;</code>
   */
  io.grpc.verigraph.NodeGrpc.FunctionalType getFunctionalType();

  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  java.util.List<io.grpc.verigraph.NeighbourGrpc> 
      getNeighbourList();
  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  io.grpc.verigraph.NeighbourGrpc getNeighbour(int index);
  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  int getNeighbourCount();
  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  java.util.List<? extends io.grpc.verigraph.NeighbourGrpcOrBuilder> 
      getNeighbourOrBuilderList();
  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  io.grpc.verigraph.NeighbourGrpcOrBuilder getNeighbourOrBuilder(
      int index);

  /**
   * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
   */
  boolean hasConfiguration();
  /**
   * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
   */
  io.grpc.verigraph.ConfigurationGrpc getConfiguration();
  /**
   * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
   */
  io.grpc.verigraph.ConfigurationGrpcOrBuilder getConfigurationOrBuilder();

  /**
   * <code>optional string errorMessage = 7;</code>
   */
  java.lang.String getErrorMessage();
  /**
   * <code>optional string errorMessage = 7;</code>
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
