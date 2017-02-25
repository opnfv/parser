/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

public interface PolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:verigraph.Policy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 idGraph = 1;</code>
   */
  long getIdGraph();

  /**
   * <code>optional string source = 2;</code>
   */
  java.lang.String getSource();
  /**
   * <code>optional string source = 2;</code>
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>optional string destination = 3;</code>
   */
  java.lang.String getDestination();
  /**
   * <code>optional string destination = 3;</code>
   */
  com.google.protobuf.ByteString
      getDestinationBytes();

  /**
   * <code>optional .verigraph.Policy.PolicyType type = 4;</code>
   */
  int getTypeValue();
  /**
   * <code>optional .verigraph.Policy.PolicyType type = 4;</code>
   */
  io.grpc.verigraph.Policy.PolicyType getType();

  /**
   * <code>optional string middlebox = 5;</code>
   */
  java.lang.String getMiddlebox();
  /**
   * <code>optional string middlebox = 5;</code>
   */
  com.google.protobuf.ByteString
      getMiddleboxBytes();
}
