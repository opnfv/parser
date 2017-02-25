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
 * Protobuf type {@code verigraph.TestGrpc}
 */
public  final class TestGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:verigraph.TestGrpc)
    TestGrpcOrBuilder {
  // Use TestGrpc.newBuilder() to construct.
  private TestGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestGrpc() {
    node_ = java.util.Collections.emptyList();
    result_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TestGrpc(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              node_ = new java.util.ArrayList<io.grpc.verigraph.NodeGrpc>();
              mutable_bitField0_ |= 0x00000001;
            }
            node_.add(
                input.readMessage(io.grpc.verigraph.NodeGrpc.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            result_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        node_ = java.util.Collections.unmodifiableList(node_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_TestGrpc_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_TestGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.verigraph.TestGrpc.class, io.grpc.verigraph.TestGrpc.Builder.class);
  }

  private int bitField0_;
  public static final int NODE_FIELD_NUMBER = 1;
  private java.util.List<io.grpc.verigraph.NodeGrpc> node_;
  /**
   * <code>repeated .verigraph.NodeGrpc node = 1;</code>
   */
  public java.util.List<io.grpc.verigraph.NodeGrpc> getNodeList() {
    return node_;
  }
  /**
   * <code>repeated .verigraph.NodeGrpc node = 1;</code>
   */
  public java.util.List<? extends io.grpc.verigraph.NodeGrpcOrBuilder> 
      getNodeOrBuilderList() {
    return node_;
  }
  /**
   * <code>repeated .verigraph.NodeGrpc node = 1;</code>
   */
  public int getNodeCount() {
    return node_.size();
  }
  /**
   * <code>repeated .verigraph.NodeGrpc node = 1;</code>
   */
  public io.grpc.verigraph.NodeGrpc getNode(int index) {
    return node_.get(index);
  }
  /**
   * <code>repeated .verigraph.NodeGrpc node = 1;</code>
   */
  public io.grpc.verigraph.NodeGrpcOrBuilder getNodeOrBuilder(
      int index) {
    return node_.get(index);
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private volatile java.lang.Object result_;
  /**
   * <code>optional string result = 2;</code>
   */
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <code>optional string result = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
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
    for (int i = 0; i < node_.size(); i++) {
      output.writeMessage(1, node_.get(i));
    }
    if (!getResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, result_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < node_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, node_.get(i));
    }
    if (!getResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, result_);
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
    if (!(obj instanceof io.grpc.verigraph.TestGrpc)) {
      return super.equals(obj);
    }
    io.grpc.verigraph.TestGrpc other = (io.grpc.verigraph.TestGrpc) obj;

    boolean result = true;
    result = result && getNodeList()
        .equals(other.getNodeList());
    result = result && getResult()
        .equals(other.getResult());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getNodeCount() > 0) {
      hash = (37 * hash) + NODE_FIELD_NUMBER;
      hash = (53 * hash) + getNodeList().hashCode();
    }
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.verigraph.TestGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.TestGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.TestGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.TestGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.TestGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.TestGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.TestGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.TestGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.TestGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.TestGrpc parseFrom(
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
  public static Builder newBuilder(io.grpc.verigraph.TestGrpc prototype) {
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
   * Protobuf type {@code verigraph.TestGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:verigraph.TestGrpc)
      io.grpc.verigraph.TestGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_TestGrpc_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_TestGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.verigraph.TestGrpc.class, io.grpc.verigraph.TestGrpc.Builder.class);
    }

    // Construct using io.grpc.verigraph.TestGrpc.newBuilder()
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
        getNodeFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (nodeBuilder_ == null) {
        node_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nodeBuilder_.clear();
      }
      result_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_TestGrpc_descriptor;
    }

    public io.grpc.verigraph.TestGrpc getDefaultInstanceForType() {
      return io.grpc.verigraph.TestGrpc.getDefaultInstance();
    }

    public io.grpc.verigraph.TestGrpc build() {
      io.grpc.verigraph.TestGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.verigraph.TestGrpc buildPartial() {
      io.grpc.verigraph.TestGrpc result = new io.grpc.verigraph.TestGrpc(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (nodeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          node_ = java.util.Collections.unmodifiableList(node_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.node_ = node_;
      } else {
        result.node_ = nodeBuilder_.build();
      }
      result.result_ = result_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.grpc.verigraph.TestGrpc) {
        return mergeFrom((io.grpc.verigraph.TestGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.verigraph.TestGrpc other) {
      if (other == io.grpc.verigraph.TestGrpc.getDefaultInstance()) return this;
      if (nodeBuilder_ == null) {
        if (!other.node_.isEmpty()) {
          if (node_.isEmpty()) {
            node_ = other.node_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodeIsMutable();
            node_.addAll(other.node_);
          }
          onChanged();
        }
      } else {
        if (!other.node_.isEmpty()) {
          if (nodeBuilder_.isEmpty()) {
            nodeBuilder_.dispose();
            nodeBuilder_ = null;
            node_ = other.node_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodeBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNodeFieldBuilder() : null;
          } else {
            nodeBuilder_.addAllMessages(other.node_);
          }
        }
      }
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
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
      io.grpc.verigraph.TestGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.verigraph.TestGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grpc.verigraph.NodeGrpc> node_ =
      java.util.Collections.emptyList();
    private void ensureNodeIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        node_ = new java.util.ArrayList<io.grpc.verigraph.NodeGrpc>(node_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.verigraph.NodeGrpc, io.grpc.verigraph.NodeGrpc.Builder, io.grpc.verigraph.NodeGrpcOrBuilder> nodeBuilder_;

    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public java.util.List<io.grpc.verigraph.NodeGrpc> getNodeList() {
      if (nodeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(node_);
      } else {
        return nodeBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public int getNodeCount() {
      if (nodeBuilder_ == null) {
        return node_.size();
      } else {
        return nodeBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public io.grpc.verigraph.NodeGrpc getNode(int index) {
      if (nodeBuilder_ == null) {
        return node_.get(index);
      } else {
        return nodeBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public Builder setNode(
        int index, io.grpc.verigraph.NodeGrpc value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodeIsMutable();
        node_.set(index, value);
        onChanged();
      } else {
        nodeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public Builder setNode(
        int index, io.grpc.verigraph.NodeGrpc.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        ensureNodeIsMutable();
        node_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public Builder addNode(io.grpc.verigraph.NodeGrpc value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodeIsMutable();
        node_.add(value);
        onChanged();
      } else {
        nodeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public Builder addNode(
        int index, io.grpc.verigraph.NodeGrpc value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodeIsMutable();
        node_.add(index, value);
        onChanged();
      } else {
        nodeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public Builder addNode(
        io.grpc.verigraph.NodeGrpc.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        ensureNodeIsMutable();
        node_.add(builderForValue.build());
        onChanged();
      } else {
        nodeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public Builder addNode(
        int index, io.grpc.verigraph.NodeGrpc.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        ensureNodeIsMutable();
        node_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public Builder addAllNode(
        java.lang.Iterable<? extends io.grpc.verigraph.NodeGrpc> values) {
      if (nodeBuilder_ == null) {
        ensureNodeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, node_);
        onChanged();
      } else {
        nodeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public Builder clearNode() {
      if (nodeBuilder_ == null) {
        node_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public Builder removeNode(int index) {
      if (nodeBuilder_ == null) {
        ensureNodeIsMutable();
        node_.remove(index);
        onChanged();
      } else {
        nodeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public io.grpc.verigraph.NodeGrpc.Builder getNodeBuilder(
        int index) {
      return getNodeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public io.grpc.verigraph.NodeGrpcOrBuilder getNodeOrBuilder(
        int index) {
      if (nodeBuilder_ == null) {
        return node_.get(index);  } else {
        return nodeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public java.util.List<? extends io.grpc.verigraph.NodeGrpcOrBuilder> 
         getNodeOrBuilderList() {
      if (nodeBuilder_ != null) {
        return nodeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(node_);
      }
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public io.grpc.verigraph.NodeGrpc.Builder addNodeBuilder() {
      return getNodeFieldBuilder().addBuilder(
          io.grpc.verigraph.NodeGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public io.grpc.verigraph.NodeGrpc.Builder addNodeBuilder(
        int index) {
      return getNodeFieldBuilder().addBuilder(
          index, io.grpc.verigraph.NodeGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .verigraph.NodeGrpc node = 1;</code>
     */
    public java.util.List<io.grpc.verigraph.NodeGrpc.Builder> 
         getNodeBuilderList() {
      return getNodeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.verigraph.NodeGrpc, io.grpc.verigraph.NodeGrpc.Builder, io.grpc.verigraph.NodeGrpcOrBuilder> 
        getNodeFieldBuilder() {
      if (nodeBuilder_ == null) {
        nodeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.verigraph.NodeGrpc, io.grpc.verigraph.NodeGrpc.Builder, io.grpc.verigraph.NodeGrpcOrBuilder>(
                node_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      return nodeBuilder_;
    }

    private java.lang.Object result_ = "";
    /**
     * <code>optional string result = 2;</code>
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string result = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string result = 2;</code>
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string result = 2;</code>
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     * <code>optional string result = 2;</code>
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      result_ = value;
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


    // @@protoc_insertion_point(builder_scope:verigraph.TestGrpc)
  }

  // @@protoc_insertion_point(class_scope:verigraph.TestGrpc)
  private static final io.grpc.verigraph.TestGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.verigraph.TestGrpc();
  }

  public static io.grpc.verigraph.TestGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestGrpc>
      PARSER = new com.google.protobuf.AbstractParser<TestGrpc>() {
    public TestGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TestGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TestGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestGrpc> getParserForType() {
    return PARSER;
  }

  public io.grpc.verigraph.TestGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

