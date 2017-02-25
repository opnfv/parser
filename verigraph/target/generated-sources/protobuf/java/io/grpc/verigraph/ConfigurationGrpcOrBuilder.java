/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

public interface ConfigurationGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:verigraph.ConfigurationGrpc)
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
   * <code>optional string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional string configuration = 4;</code>
   */
  java.lang.String getConfiguration();
  /**
   * <code>optional string configuration = 4;</code>
   */
  com.google.protobuf.ByteString
      getConfigurationBytes();

  /**
   * <code>optional string id = 5;</code>
   */
  java.lang.String getId();
  /**
   * <code>optional string id = 5;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();
}
