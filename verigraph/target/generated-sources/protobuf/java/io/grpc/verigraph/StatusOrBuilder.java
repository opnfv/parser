/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:verigraph.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool success = 1;</code>
   */
  boolean getSuccess();

  /**
   * <code>optional string errorMessage = 2;</code>
   */
  java.lang.String getErrorMessage();
  /**
   * <code>optional string errorMessage = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
