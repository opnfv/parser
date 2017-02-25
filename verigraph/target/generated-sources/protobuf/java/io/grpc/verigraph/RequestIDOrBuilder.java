/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

public interface RequestIDOrBuilder extends
    // @@protoc_insertion_point(interface_extends:verigraph.RequestID)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 idGraph = 1;</code>
   */
  long getIdGraph();

  /**
   * <code>optional int64 idNode = 2;</code>
   */
  long getIdNode();

  /**
   * <code>optional int64 idNeighbour = 3;</code>
   */
  long getIdNeighbour();
}
