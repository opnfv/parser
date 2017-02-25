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
 * Protobuf type {@code verigraph.VerificationGrpc}
 */
public  final class VerificationGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:verigraph.VerificationGrpc)
    VerificationGrpcOrBuilder {
  // Use VerificationGrpc.newBuilder() to construct.
  private VerificationGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VerificationGrpc() {
    successOfOperation_ = false;
    result_ = "";
    comment_ = "";
    test_ = java.util.Collections.emptyList();
    errorMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private VerificationGrpc(
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

            successOfOperation_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            result_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            comment_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              test_ = new java.util.ArrayList<io.grpc.verigraph.TestGrpc>();
              mutable_bitField0_ |= 0x00000008;
            }
            test_.add(
                input.readMessage(io.grpc.verigraph.TestGrpc.parser(), extensionRegistry));
            break;
          }
          case 42: {
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        test_ = java.util.Collections.unmodifiableList(test_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_VerificationGrpc_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_VerificationGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.verigraph.VerificationGrpc.class, io.grpc.verigraph.VerificationGrpc.Builder.class);
  }

  private int bitField0_;
  public static final int SUCCESSOFOPERATION_FIELD_NUMBER = 1;
  private boolean successOfOperation_;
  /**
   * <code>optional bool successOfOperation = 1;</code>
   */
  public boolean getSuccessOfOperation() {
    return successOfOperation_;
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

  public static final int COMMENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object comment_;
  /**
   * <code>optional string comment = 3;</code>
   */
  public java.lang.String getComment() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comment_ = s;
      return s;
    }
  }
  /**
   * <code>optional string comment = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCommentBytes() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      comment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEST_FIELD_NUMBER = 4;
  private java.util.List<io.grpc.verigraph.TestGrpc> test_;
  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  public java.util.List<io.grpc.verigraph.TestGrpc> getTestList() {
    return test_;
  }
  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  public java.util.List<? extends io.grpc.verigraph.TestGrpcOrBuilder> 
      getTestOrBuilderList() {
    return test_;
  }
  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  public int getTestCount() {
    return test_.size();
  }
  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  public io.grpc.verigraph.TestGrpc getTest(int index) {
    return test_.get(index);
  }
  /**
   * <code>repeated .verigraph.TestGrpc test = 4;</code>
   */
  public io.grpc.verigraph.TestGrpcOrBuilder getTestOrBuilder(
      int index) {
    return test_.get(index);
  }

  public static final int ERRORMESSAGE_FIELD_NUMBER = 5;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>optional string errorMessage = 5;</code>
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
   * <code>optional string errorMessage = 5;</code>
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
    if (successOfOperation_ != false) {
      output.writeBool(1, successOfOperation_);
    }
    if (!getResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, result_);
    }
    if (!getCommentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, comment_);
    }
    for (int i = 0; i < test_.size(); i++) {
      output.writeMessage(4, test_.get(i));
    }
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, errorMessage_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (successOfOperation_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, successOfOperation_);
    }
    if (!getResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, result_);
    }
    if (!getCommentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, comment_);
    }
    for (int i = 0; i < test_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, test_.get(i));
    }
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, errorMessage_);
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
    if (!(obj instanceof io.grpc.verigraph.VerificationGrpc)) {
      return super.equals(obj);
    }
    io.grpc.verigraph.VerificationGrpc other = (io.grpc.verigraph.VerificationGrpc) obj;

    boolean result = true;
    result = result && (getSuccessOfOperation()
        == other.getSuccessOfOperation());
    result = result && getResult()
        .equals(other.getResult());
    result = result && getComment()
        .equals(other.getComment());
    result = result && getTestList()
        .equals(other.getTestList());
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
    hash = (37 * hash) + SUCCESSOFOPERATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccessOfOperation());
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (37 * hash) + COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + getComment().hashCode();
    if (getTestCount() > 0) {
      hash = (37 * hash) + TEST_FIELD_NUMBER;
      hash = (53 * hash) + getTestList().hashCode();
    }
    hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.verigraph.VerificationGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.VerificationGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.VerificationGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.VerificationGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.VerificationGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.VerificationGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.VerificationGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.VerificationGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.VerificationGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.VerificationGrpc parseFrom(
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
  public static Builder newBuilder(io.grpc.verigraph.VerificationGrpc prototype) {
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
   * Protobuf type {@code verigraph.VerificationGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:verigraph.VerificationGrpc)
      io.grpc.verigraph.VerificationGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_VerificationGrpc_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_VerificationGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.verigraph.VerificationGrpc.class, io.grpc.verigraph.VerificationGrpc.Builder.class);
    }

    // Construct using io.grpc.verigraph.VerificationGrpc.newBuilder()
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
        getTestFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      successOfOperation_ = false;

      result_ = "";

      comment_ = "";

      if (testBuilder_ == null) {
        test_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        testBuilder_.clear();
      }
      errorMessage_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_VerificationGrpc_descriptor;
    }

    public io.grpc.verigraph.VerificationGrpc getDefaultInstanceForType() {
      return io.grpc.verigraph.VerificationGrpc.getDefaultInstance();
    }

    public io.grpc.verigraph.VerificationGrpc build() {
      io.grpc.verigraph.VerificationGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.verigraph.VerificationGrpc buildPartial() {
      io.grpc.verigraph.VerificationGrpc result = new io.grpc.verigraph.VerificationGrpc(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.successOfOperation_ = successOfOperation_;
      result.result_ = result_;
      result.comment_ = comment_;
      if (testBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          test_ = java.util.Collections.unmodifiableList(test_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.test_ = test_;
      } else {
        result.test_ = testBuilder_.build();
      }
      result.errorMessage_ = errorMessage_;
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
      if (other instanceof io.grpc.verigraph.VerificationGrpc) {
        return mergeFrom((io.grpc.verigraph.VerificationGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.verigraph.VerificationGrpc other) {
      if (other == io.grpc.verigraph.VerificationGrpc.getDefaultInstance()) return this;
      if (other.getSuccessOfOperation() != false) {
        setSuccessOfOperation(other.getSuccessOfOperation());
      }
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
        onChanged();
      }
      if (!other.getComment().isEmpty()) {
        comment_ = other.comment_;
        onChanged();
      }
      if (testBuilder_ == null) {
        if (!other.test_.isEmpty()) {
          if (test_.isEmpty()) {
            test_ = other.test_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureTestIsMutable();
            test_.addAll(other.test_);
          }
          onChanged();
        }
      } else {
        if (!other.test_.isEmpty()) {
          if (testBuilder_.isEmpty()) {
            testBuilder_.dispose();
            testBuilder_ = null;
            test_ = other.test_;
            bitField0_ = (bitField0_ & ~0x00000008);
            testBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTestFieldBuilder() : null;
          } else {
            testBuilder_.addAllMessages(other.test_);
          }
        }
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
      io.grpc.verigraph.VerificationGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.verigraph.VerificationGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean successOfOperation_ ;
    /**
     * <code>optional bool successOfOperation = 1;</code>
     */
    public boolean getSuccessOfOperation() {
      return successOfOperation_;
    }
    /**
     * <code>optional bool successOfOperation = 1;</code>
     */
    public Builder setSuccessOfOperation(boolean value) {
      
      successOfOperation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool successOfOperation = 1;</code>
     */
    public Builder clearSuccessOfOperation() {
      
      successOfOperation_ = false;
      onChanged();
      return this;
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

    private java.lang.Object comment_ = "";
    /**
     * <code>optional string comment = 3;</code>
     */
    public java.lang.String getComment() {
      java.lang.Object ref = comment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string comment = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCommentBytes() {
      java.lang.Object ref = comment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string comment = 3;</code>
     */
    public Builder setComment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      comment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string comment = 3;</code>
     */
    public Builder clearComment() {
      
      comment_ = getDefaultInstance().getComment();
      onChanged();
      return this;
    }
    /**
     * <code>optional string comment = 3;</code>
     */
    public Builder setCommentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      comment_ = value;
      onChanged();
      return this;
    }

    private java.util.List<io.grpc.verigraph.TestGrpc> test_ =
      java.util.Collections.emptyList();
    private void ensureTestIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        test_ = new java.util.ArrayList<io.grpc.verigraph.TestGrpc>(test_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.verigraph.TestGrpc, io.grpc.verigraph.TestGrpc.Builder, io.grpc.verigraph.TestGrpcOrBuilder> testBuilder_;

    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public java.util.List<io.grpc.verigraph.TestGrpc> getTestList() {
      if (testBuilder_ == null) {
        return java.util.Collections.unmodifiableList(test_);
      } else {
        return testBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public int getTestCount() {
      if (testBuilder_ == null) {
        return test_.size();
      } else {
        return testBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public io.grpc.verigraph.TestGrpc getTest(int index) {
      if (testBuilder_ == null) {
        return test_.get(index);
      } else {
        return testBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public Builder setTest(
        int index, io.grpc.verigraph.TestGrpc value) {
      if (testBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestIsMutable();
        test_.set(index, value);
        onChanged();
      } else {
        testBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public Builder setTest(
        int index, io.grpc.verigraph.TestGrpc.Builder builderForValue) {
      if (testBuilder_ == null) {
        ensureTestIsMutable();
        test_.set(index, builderForValue.build());
        onChanged();
      } else {
        testBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public Builder addTest(io.grpc.verigraph.TestGrpc value) {
      if (testBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestIsMutable();
        test_.add(value);
        onChanged();
      } else {
        testBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public Builder addTest(
        int index, io.grpc.verigraph.TestGrpc value) {
      if (testBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestIsMutable();
        test_.add(index, value);
        onChanged();
      } else {
        testBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public Builder addTest(
        io.grpc.verigraph.TestGrpc.Builder builderForValue) {
      if (testBuilder_ == null) {
        ensureTestIsMutable();
        test_.add(builderForValue.build());
        onChanged();
      } else {
        testBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public Builder addTest(
        int index, io.grpc.verigraph.TestGrpc.Builder builderForValue) {
      if (testBuilder_ == null) {
        ensureTestIsMutable();
        test_.add(index, builderForValue.build());
        onChanged();
      } else {
        testBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public Builder addAllTest(
        java.lang.Iterable<? extends io.grpc.verigraph.TestGrpc> values) {
      if (testBuilder_ == null) {
        ensureTestIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, test_);
        onChanged();
      } else {
        testBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public Builder clearTest() {
      if (testBuilder_ == null) {
        test_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        testBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public Builder removeTest(int index) {
      if (testBuilder_ == null) {
        ensureTestIsMutable();
        test_.remove(index);
        onChanged();
      } else {
        testBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public io.grpc.verigraph.TestGrpc.Builder getTestBuilder(
        int index) {
      return getTestFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public io.grpc.verigraph.TestGrpcOrBuilder getTestOrBuilder(
        int index) {
      if (testBuilder_ == null) {
        return test_.get(index);  } else {
        return testBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public java.util.List<? extends io.grpc.verigraph.TestGrpcOrBuilder> 
         getTestOrBuilderList() {
      if (testBuilder_ != null) {
        return testBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(test_);
      }
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public io.grpc.verigraph.TestGrpc.Builder addTestBuilder() {
      return getTestFieldBuilder().addBuilder(
          io.grpc.verigraph.TestGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public io.grpc.verigraph.TestGrpc.Builder addTestBuilder(
        int index) {
      return getTestFieldBuilder().addBuilder(
          index, io.grpc.verigraph.TestGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .verigraph.TestGrpc test = 4;</code>
     */
    public java.util.List<io.grpc.verigraph.TestGrpc.Builder> 
         getTestBuilderList() {
      return getTestFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.verigraph.TestGrpc, io.grpc.verigraph.TestGrpc.Builder, io.grpc.verigraph.TestGrpcOrBuilder> 
        getTestFieldBuilder() {
      if (testBuilder_ == null) {
        testBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.verigraph.TestGrpc, io.grpc.verigraph.TestGrpc.Builder, io.grpc.verigraph.TestGrpcOrBuilder>(
                test_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        test_ = null;
      }
      return testBuilder_;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>optional string errorMessage = 5;</code>
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
     * <code>optional string errorMessage = 5;</code>
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
     * <code>optional string errorMessage = 5;</code>
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
     * <code>optional string errorMessage = 5;</code>
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorMessage = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:verigraph.VerificationGrpc)
  }

  // @@protoc_insertion_point(class_scope:verigraph.VerificationGrpc)
  private static final io.grpc.verigraph.VerificationGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.verigraph.VerificationGrpc();
  }

  public static io.grpc.verigraph.VerificationGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerificationGrpc>
      PARSER = new com.google.protobuf.AbstractParser<VerificationGrpc>() {
    public VerificationGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VerificationGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VerificationGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerificationGrpc> getParserForType() {
    return PARSER;
  }

  public io.grpc.verigraph.VerificationGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

