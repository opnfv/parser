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
 * Protobuf type {@code verigraph.NewNeighbour}
 */
public  final class NewNeighbour extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:verigraph.NewNeighbour)
    NewNeighbourOrBuilder {
  // Use NewNeighbour.newBuilder() to construct.
  private NewNeighbour(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NewNeighbour() {
    success_ = false;
    errorMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NewNeighbour(
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
            io.grpc.verigraph.NeighbourGrpc.Builder subBuilder = null;
            if (neighbour_ != null) {
              subBuilder = neighbour_.toBuilder();
            }
            neighbour_ = input.readMessage(io.grpc.verigraph.NeighbourGrpc.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(neighbour_);
              neighbour_ = subBuilder.buildPartial();
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
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewNeighbour_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewNeighbour_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.verigraph.NewNeighbour.class, io.grpc.verigraph.NewNeighbour.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>optional bool success = 1;</code>
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int NEIGHBOUR_FIELD_NUMBER = 2;
  private io.grpc.verigraph.NeighbourGrpc neighbour_;
  /**
   * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
   */
  public boolean hasNeighbour() {
    return neighbour_ != null;
  }
  /**
   * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
   */
  public io.grpc.verigraph.NeighbourGrpc getNeighbour() {
    return neighbour_ == null ? io.grpc.verigraph.NeighbourGrpc.getDefaultInstance() : neighbour_;
  }
  /**
   * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
   */
  public io.grpc.verigraph.NeighbourGrpcOrBuilder getNeighbourOrBuilder() {
    return getNeighbour();
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
    if (neighbour_ != null) {
      output.writeMessage(2, getNeighbour());
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
    if (neighbour_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNeighbour());
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
    if (!(obj instanceof io.grpc.verigraph.NewNeighbour)) {
      return super.equals(obj);
    }
    io.grpc.verigraph.NewNeighbour other = (io.grpc.verigraph.NewNeighbour) obj;

    boolean result = true;
    result = result && (getSuccess()
        == other.getSuccess());
    result = result && (hasNeighbour() == other.hasNeighbour());
    if (hasNeighbour()) {
      result = result && getNeighbour()
          .equals(other.getNeighbour());
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
    if (hasNeighbour()) {
      hash = (37 * hash) + NEIGHBOUR_FIELD_NUMBER;
      hash = (53 * hash) + getNeighbour().hashCode();
    }
    hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.verigraph.NewNeighbour parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.NewNeighbour parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.NewNeighbour parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.NewNeighbour parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.NewNeighbour parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.NewNeighbour parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.NewNeighbour parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.NewNeighbour parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.NewNeighbour parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.NewNeighbour parseFrom(
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
  public static Builder newBuilder(io.grpc.verigraph.NewNeighbour prototype) {
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
   * Protobuf type {@code verigraph.NewNeighbour}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:verigraph.NewNeighbour)
      io.grpc.verigraph.NewNeighbourOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewNeighbour_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewNeighbour_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.verigraph.NewNeighbour.class, io.grpc.verigraph.NewNeighbour.Builder.class);
    }

    // Construct using io.grpc.verigraph.NewNeighbour.newBuilder()
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

      if (neighbourBuilder_ == null) {
        neighbour_ = null;
      } else {
        neighbour_ = null;
        neighbourBuilder_ = null;
      }
      errorMessage_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NewNeighbour_descriptor;
    }

    public io.grpc.verigraph.NewNeighbour getDefaultInstanceForType() {
      return io.grpc.verigraph.NewNeighbour.getDefaultInstance();
    }

    public io.grpc.verigraph.NewNeighbour build() {
      io.grpc.verigraph.NewNeighbour result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.verigraph.NewNeighbour buildPartial() {
      io.grpc.verigraph.NewNeighbour result = new io.grpc.verigraph.NewNeighbour(this);
      result.success_ = success_;
      if (neighbourBuilder_ == null) {
        result.neighbour_ = neighbour_;
      } else {
        result.neighbour_ = neighbourBuilder_.build();
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
      if (other instanceof io.grpc.verigraph.NewNeighbour) {
        return mergeFrom((io.grpc.verigraph.NewNeighbour)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.verigraph.NewNeighbour other) {
      if (other == io.grpc.verigraph.NewNeighbour.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (other.hasNeighbour()) {
        mergeNeighbour(other.getNeighbour());
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
      io.grpc.verigraph.NewNeighbour parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.verigraph.NewNeighbour) e.getUnfinishedMessage();
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

    private io.grpc.verigraph.NeighbourGrpc neighbour_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.verigraph.NeighbourGrpc, io.grpc.verigraph.NeighbourGrpc.Builder, io.grpc.verigraph.NeighbourGrpcOrBuilder> neighbourBuilder_;
    /**
     * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
     */
    public boolean hasNeighbour() {
      return neighbourBuilder_ != null || neighbour_ != null;
    }
    /**
     * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
     */
    public io.grpc.verigraph.NeighbourGrpc getNeighbour() {
      if (neighbourBuilder_ == null) {
        return neighbour_ == null ? io.grpc.verigraph.NeighbourGrpc.getDefaultInstance() : neighbour_;
      } else {
        return neighbourBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
     */
    public Builder setNeighbour(io.grpc.verigraph.NeighbourGrpc value) {
      if (neighbourBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        neighbour_ = value;
        onChanged();
      } else {
        neighbourBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
     */
    public Builder setNeighbour(
        io.grpc.verigraph.NeighbourGrpc.Builder builderForValue) {
      if (neighbourBuilder_ == null) {
        neighbour_ = builderForValue.build();
        onChanged();
      } else {
        neighbourBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
     */
    public Builder mergeNeighbour(io.grpc.verigraph.NeighbourGrpc value) {
      if (neighbourBuilder_ == null) {
        if (neighbour_ != null) {
          neighbour_ =
            io.grpc.verigraph.NeighbourGrpc.newBuilder(neighbour_).mergeFrom(value).buildPartial();
        } else {
          neighbour_ = value;
        }
        onChanged();
      } else {
        neighbourBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
     */
    public Builder clearNeighbour() {
      if (neighbourBuilder_ == null) {
        neighbour_ = null;
        onChanged();
      } else {
        neighbour_ = null;
        neighbourBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
     */
    public io.grpc.verigraph.NeighbourGrpc.Builder getNeighbourBuilder() {
      
      onChanged();
      return getNeighbourFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
     */
    public io.grpc.verigraph.NeighbourGrpcOrBuilder getNeighbourOrBuilder() {
      if (neighbourBuilder_ != null) {
        return neighbourBuilder_.getMessageOrBuilder();
      } else {
        return neighbour_ == null ?
            io.grpc.verigraph.NeighbourGrpc.getDefaultInstance() : neighbour_;
      }
    }
    /**
     * <code>optional .verigraph.NeighbourGrpc neighbour = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.verigraph.NeighbourGrpc, io.grpc.verigraph.NeighbourGrpc.Builder, io.grpc.verigraph.NeighbourGrpcOrBuilder> 
        getNeighbourFieldBuilder() {
      if (neighbourBuilder_ == null) {
        neighbourBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.verigraph.NeighbourGrpc, io.grpc.verigraph.NeighbourGrpc.Builder, io.grpc.verigraph.NeighbourGrpcOrBuilder>(
                getNeighbour(),
                getParentForChildren(),
                isClean());
        neighbour_ = null;
      }
      return neighbourBuilder_;
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


    // @@protoc_insertion_point(builder_scope:verigraph.NewNeighbour)
  }

  // @@protoc_insertion_point(class_scope:verigraph.NewNeighbour)
  private static final io.grpc.verigraph.NewNeighbour DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.verigraph.NewNeighbour();
  }

  public static io.grpc.verigraph.NewNeighbour getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NewNeighbour>
      PARSER = new com.google.protobuf.AbstractParser<NewNeighbour>() {
    public NewNeighbour parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NewNeighbour(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NewNeighbour> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NewNeighbour> getParserForType() {
    return PARSER;
  }

  public io.grpc.verigraph.NewNeighbour getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

