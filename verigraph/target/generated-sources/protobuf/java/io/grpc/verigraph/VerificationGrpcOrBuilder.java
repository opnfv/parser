/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

public interface VerificationGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:verigraph.VerificationGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool successOfOperation = 1;</code>
   */
  boolean getSuccessOfOperation();

  /**
   * <code>optional string result = 2;</code>
   */
  java.lang.String getResult();
  /**
   * <code>optional string result = 2;</code>
   */
  com.google.protobuf.ByteString
      getResultBytes();

  /**
   * <code>optional string comment = 3;</code>
   */
  java.lang.String getComment();
  /**
   * <code>optional string comment = 3;</code>
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  java.util.List<io.grpc.verigraph.TestGrpc> 
      getTestList();
  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  io.grpc.verigraph.TestGrpc getTest(int index);
  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  int getTestCount();
  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  java.util.List<? extends io.grpc.verigraph.TestGrpcOrBuilder> 
      getTestOrBuilderList();
  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  io.grpc.verigraph.TestGrpcOrBuilder getTestOrBuilder(
      int index);

  /**
   * <code>optional string errorMessage = 5;</code>
   */
  java.lang.String getErrorMessage();
  /**
   * <code>optional string errorMessage = 5;</code>
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
