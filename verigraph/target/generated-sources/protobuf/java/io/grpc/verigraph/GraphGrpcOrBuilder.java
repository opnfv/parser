/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

public interface GraphGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:verigraph.GraphGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *long
   * </pre>
   *
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>repeated .verigraph.NodeGrpc node = 2;</code>
   */
  java.util.List<io.grpc.verigraph.NodeGrpc> 
      getNodeList();
  /**
   * <code>repeated .verigraph.NodeGrpc node = 2;</code>
   */
  io.grpc.verigraph.NodeGrpc getNode(int index);
  /**
   * <code>repeated .verigraph.NodeGrpc node = 2;</code>
   */
  int getNodeCount();
  /**
   * <code>repeated .verigraph.NodeGrpc node = 2;</code>
   */
  java.util.List<? extends io.grpc.verigraph.NodeGrpcOrBuilder> 
      getNodeOrBuilderList();
  /**
   * <code>repeated .verigraph.NodeGrpc node = 2;</code>
   */
  io.grpc.verigraph.NodeGrpcOrBuilder getNodeOrBuilder(
      int index);

  /**
   * <code>optional string errorMessage = 3;</code>
   */
  java.lang.String getErrorMessage();
  /**
   * <code>optional string errorMessage = 3;</code>
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
