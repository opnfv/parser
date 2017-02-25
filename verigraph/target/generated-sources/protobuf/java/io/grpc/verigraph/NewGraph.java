/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

/**
 * Protobuf type {@code verigraph.NewGraph}
 */
public  final class NewGraph extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:verigraph.NewGraph)
    NewGraphOrBuilder {
  // Use NewGraph.newBuilder() to construct.
  private NewGraph(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NewGraph() {
    success_ = false;
    errorMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NewGraph(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            success_ = input.readBool();
            break;
          }
          case 18: {
            io.grpc.verigraph.GraphGrpc.Builder subBuilder = null;
            if (graph_ != null) {
              subBuilder = graph_.toBuilder();
            }
            graph_ = input.readMessage(io.grpc.verigraph.GraphGrpc.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(graph_);
              graph_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewGraph_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewGraph_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.verigraph.NewGraph.class, io.grpc.verigraph.NewGraph.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>optional bool success = 1;</code>
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int GRAPH_FIELD_NUMBER = 2;
  private io.grpc.verigraph.GraphGrpc graph_;
  /**
   * <code>optional .verigraph.GraphGrpc graph = 2;</code>
   */
  public boolean hasGraph() {
    return graph_ != null;
  }
  /**
   * <code>optional .verigraph.GraphGrpc graph = 2;</code>
   */
  public io.grpc.verigraph.GraphGrpc getGraph() {
    return graph_ == null ? io.grpc.verigraph.GraphGrpc.getDefaultInstance() : graph_;
  }
  /**
   * <code>optional .verigraph.GraphGrpc graph = 2;</code>
   */
  public io.grpc.verigraph.GraphGrpcOrBuilder getGraphOrBuilder() {
    return getGraph();
  }

  public static final int ERRORMESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>optional string errorMessage = 3;</code>
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <code>optional string errorMessage = 3;</code>
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    if (graph_ != null) {
      output.writeMessage(2, getGraph());
    }
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorMessage_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    if (graph_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGraph());
    }
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorMessage_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.verigraph.NewGraph)) {
      return super.equals(obj);
    }
    io.grpc.verigraph.NewGraph other = (io.grpc.verigraph.NewGraph) obj;

    boolean result = true;
    result = result && (getSuccess()
        == other.getSuccess());
    result = result && (hasGraph() == other.hasGraph());
    if (hasGraph()) {
      result = result && getGraph()
          .equals(other.getGraph());
    }
    result = result && getErrorMessage()
        .equals(other.getErrorMessage());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    if (hasGraph()) {
      hash = (37 * hash) + GRAPH_FIELD_NUMBER;
      hash = (53 * hash) + getGraph().hashCode();
    }
    hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.verigraph.NewGraph parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.NewGraph parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.NewGraph parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.NewGraph parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.NewGraph parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.NewGraph parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.NewGraph parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.NewGraph parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.NewGraph parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.NewGraph parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.verigraph.NewGraph prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code verigraph.NewGraph}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:verigraph.NewGraph)
      io.grpc.verigraph.NewGraphOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewGraph_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewGraph_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.verigraph.NewGraph.class, io.grpc.verigraph.NewGraph.Builder.class);
    }

    // Construct using io.grpc.verigraph.NewGraph.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      success_ = false;

      if (graphBuilder_ == null) {
        graph_ = null;
      } else {
        graph_ = null;
        graphBuilder_ = null;
      }
      errorMessage_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewGraph_descriptor;
    }

    public io.grpc.verigraph.NewGraph getDefaultInstanceForType() {
      return io.grpc.verigraph.NewGraph.getDefaultInstance();
    }

    public io.grpc.verigraph.NewGraph build() {
      io.grpc.verigraph.NewGraph result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.verigraph.NewGraph buildPartial() {
      io.grpc.verigraph.NewGraph result = new io.grpc.verigraph.NewGraph(this);
      result.success_ = success_;
      if (graphBuilder_ == null) {
        result.graph_ = graph_;
      } else {
        result.graph_ = graphBuilder_.build();
      }
      result.errorMessage_ = errorMessage_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.verigraph.NewGraph) {
        return mergeFrom((io.grpc.verigraph.NewGraph)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.verigraph.NewGraph other) {
      if (other == io.grpc.verigraph.NewGraph.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (other.hasGraph()) {
        mergeGraph(other.getGraph());
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.verigraph.NewGraph parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.verigraph.NewGraph) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean success_ ;
    /**
     * <code>optional bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>optional bool success = 1;</code>
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool success = 1;</code>
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private io.grpc.verigraph.GraphGrpc graph_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.verigraph.GraphGrpc, io.grpc.verigraph.GraphGrpc.Builder, io.grpc.verigraph.GraphGrpcOrBuilder> graphBuilder_;
    /**
     * <code>optional .verigraph.GraphGrpc graph = 2;</code>
     */
    public boolean hasGraph() {
      return graphBuilder_ != null || graph_ != null;
    }
    /**
     * <code>optional .verigraph.GraphGrpc graph = 2;</code>
     */
    public io.grpc.verigraph.GraphGrpc getGraph() {
      if (graphBuilder_ == null) {
        return graph_ == null ? io.grpc.verigraph.GraphGrpc.getDefaultInstance() : graph_;
      } else {
        return graphBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .verigraph.GraphGrpc graph = 2;</code>
     */
    public Builder setGraph(io.grpc.verigraph.GraphGrpc value) {
      if (graphBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        graph_ = value;
        onChanged();
      } else {
        graphBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .verigraph.GraphGrpc graph = 2;</code>
     */
    public Builder setGraph(
        io.grpc.verigraph.GraphGrpc.Builder builderForValue) {
      if (graphBuilder_ == null) {
        graph_ = builderForValue.build();
        onChanged();
      } else {
        graphBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .verigraph.GraphGrpc graph = 2;</code>
     */
    public Builder mergeGraph(io.grpc.verigraph.GraphGrpc value) {
      if (graphBuilder_ == null) {
        if (graph_ != null) {
          graph_ =
            io.grpc.verigraph.GraphGrpc.newBuilder(graph_).mergeFrom(value).buildPartial();
        } else {
          graph_ = value;
        }
        onChanged();
      } else {
        graphBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .verigraph.GraphGrpc graph = 2;</code>
     */
    public Builder clearGraph() {
      if (graphBuilder_ == null) {
        graph_ = null;
        onChanged();
      } else {
        graph_ = null;
        graphBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .verigraph.GraphGrpc graph = 2;</code>
     */
    public io.grpc.verigraph.GraphGrpc.Builder getGraphBuilder() {
      
      onChanged();
      return getGraphFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .verigraph.GraphGrpc graph = 2;</code>
     */
    public io.grpc.verigraph.GraphGrpcOrBuilder getGraphOrBuilder() {
      if (graphBuilder_ != null) {
        return graphBuilder_.getMessageOrBuilder();
      } else {
        return graph_ == null ?
            io.grpc.verigraph.GraphGrpc.getDefaultInstance() : graph_;
      }
    }
    /**
     * <code>optional .verigraph.GraphGrpc graph = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.verigraph.GraphGrpc, io.grpc.verigraph.GraphGrpc.Builder, io.grpc.verigraph.GraphGrpcOrBuilder> 
        getGraphFieldBuilder() {
      if (graphBuilder_ == null) {
        graphBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.verigraph.GraphGrpc, io.grpc.verigraph.GraphGrpc.Builder, io.grpc.verigraph.GraphGrpcOrBuilder>(
                getGraph(),
                getParentForChildren(),
                isClean());
        graph_ = null;
      }
      return graphBuilder_;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>optional string errorMessage = 3;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string errorMessage = 3;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string errorMessage = 3;</code>
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorMessage = 3;</code>
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorMessage = 3;</code>
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:verigraph.NewGraph)
  }

  // @@protoc_insertion_point(class_scope:verigraph.NewGraph)
  private static final io.grpc.verigraph.NewGraph DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.verigraph.NewGraph();
  }

  public static io.grpc.verigraph.NewGraph getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NewGraph>
      PARSER = new com.google.protobuf.AbstractParser<NewGraph>() {
    public NewGraph parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NewGraph(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NewGraph> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NewGraph> getParserForType() {
    return PARSER;
  }

  public io.grpc.verigraph.NewGraph getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

