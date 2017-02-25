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
 * Protobuf type {@code verigraph.RequestID}
 */
public  final class RequestID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:verigraph.RequestID)
    RequestIDOrBuilder {
  // Use RequestID.newBuilder() to construct.
  private RequestID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestID() {
    idGraph_ = 0L;
    idNode_ = 0L;
    idNeighbour_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RequestID(
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

            idGraph_ = input.readInt64();
            break;
          }
          case 16: {

            idNode_ = input.readInt64();
            break;
          }
          case 24: {

            idNeighbour_ = input.readInt64();
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
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_RequestID_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_RequestID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.verigraph.RequestID.class, io.grpc.verigraph.RequestID.Builder.class);
  }

  public static final int IDGRAPH_FIELD_NUMBER = 1;
  private long idGraph_;
  /**
   * <code>optional int64 idGraph = 1;</code>
   */
  public long getIdGraph() {
    return idGraph_;
  }

  public static final int IDNODE_FIELD_NUMBER = 2;
  private long idNode_;
  /**
   * <code>optional int64 idNode = 2;</code>
   */
  public long getIdNode() {
    return idNode_;
  }

  public static final int IDNEIGHBOUR_FIELD_NUMBER = 3;
  private long idNeighbour_;
  /**
   * <code>optional int64 idNeighbour = 3;</code>
   */
  public long getIdNeighbour() {
    return idNeighbour_;
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
    if (idGraph_ != 0L) {
      output.writeInt64(1, idGraph_);
    }
    if (idNode_ != 0L) {
      output.writeInt64(2, idNode_);
    }
    if (idNeighbour_ != 0L) {
      output.writeInt64(3, idNeighbour_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idGraph_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, idGraph_);
    }
    if (idNode_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, idNode_);
    }
    if (idNeighbour_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, idNeighbour_);
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
    if (!(obj instanceof io.grpc.verigraph.RequestID)) {
      return super.equals(obj);
    }
    io.grpc.verigraph.RequestID other = (io.grpc.verigraph.RequestID) obj;

    boolean result = true;
    result = result && (getIdGraph()
        == other.getIdGraph());
    result = result && (getIdNode()
        == other.getIdNode());
    result = result && (getIdNeighbour()
        == other.getIdNeighbour());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + IDGRAPH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIdGraph());
    hash = (37 * hash) + IDNODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIdNode());
    hash = (37 * hash) + IDNEIGHBOUR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIdNeighbour());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.verigraph.RequestID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.RequestID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.RequestID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.RequestID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.RequestID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.RequestID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.RequestID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.RequestID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.RequestID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.RequestID parseFrom(
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
  public static Builder newBuilder(io.grpc.verigraph.RequestID prototype) {
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
   * Protobuf type {@code verigraph.RequestID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:verigraph.RequestID)
      io.grpc.verigraph.RequestIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_RequestID_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_RequestID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.verigraph.RequestID.class, io.grpc.verigraph.RequestID.Builder.class);
    }

    // Construct using io.grpc.verigraph.RequestID.newBuilder()
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
      idGraph_ = 0L;

      idNode_ = 0L;

      idNeighbour_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_RequestID_descriptor;
    }

    public io.grpc.verigraph.RequestID getDefaultInstanceForType() {
      return io.grpc.verigraph.RequestID.getDefaultInstance();
    }

    public io.grpc.verigraph.RequestID build() {
      io.grpc.verigraph.RequestID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.verigraph.RequestID buildPartial() {
      io.grpc.verigraph.RequestID result = new io.grpc.verigraph.RequestID(this);
      result.idGraph_ = idGraph_;
      result.idNode_ = idNode_;
      result.idNeighbour_ = idNeighbour_;
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
      if (other instanceof io.grpc.verigraph.RequestID) {
        return mergeFrom((io.grpc.verigraph.RequestID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.verigraph.RequestID other) {
      if (other == io.grpc.verigraph.RequestID.getDefaultInstance()) return this;
      if (other.getIdGraph() != 0L) {
        setIdGraph(other.getIdGraph());
      }
      if (other.getIdNode() != 0L) {
        setIdNode(other.getIdNode());
      }
      if (other.getIdNeighbour() != 0L) {
        setIdNeighbour(other.getIdNeighbour());
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
      io.grpc.verigraph.RequestID parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.verigraph.RequestID) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long idGraph_ ;
    /**
     * <code>optional int64 idGraph = 1;</code>
     */
    public long getIdGraph() {
      return idGraph_;
    }
    /**
     * <code>optional int64 idGraph = 1;</code>
     */
    public Builder setIdGraph(long value) {
      
      idGraph_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 idGraph = 1;</code>
     */
    public Builder clearIdGraph() {
      
      idGraph_ = 0L;
      onChanged();
      return this;
    }

    private long idNode_ ;
    /**
     * <code>optional int64 idNode = 2;</code>
     */
    public long getIdNode() {
      return idNode_;
    }
    /**
     * <code>optional int64 idNode = 2;</code>
     */
    public Builder setIdNode(long value) {
      
      idNode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 idNode = 2;</code>
     */
    public Builder clearIdNode() {
      
      idNode_ = 0L;
      onChanged();
      return this;
    }

    private long idNeighbour_ ;
    /**
     * <code>optional int64 idNeighbour = 3;</code>
     */
    public long getIdNeighbour() {
      return idNeighbour_;
    }
    /**
     * <code>optional int64 idNeighbour = 3;</code>
     */
    public Builder setIdNeighbour(long value) {
      
      idNeighbour_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 idNeighbour = 3;</code>
     */
    public Builder clearIdNeighbour() {
      
      idNeighbour_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:verigraph.RequestID)
  }

  // @@protoc_insertion_point(class_scope:verigraph.RequestID)
  private static final io.grpc.verigraph.RequestID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.verigraph.RequestID();
  }

  public static io.grpc.verigraph.RequestID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestID>
      PARSER = new com.google.protobuf.AbstractParser<RequestID>() {
    public RequestID parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestID(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestID> getParserForType() {
    return PARSER;
  }

  public io.grpc.verigraph.RequestID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

