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
 * Protobuf type {@code verigraph.Policy}
 */
public  final class Policy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:verigraph.Policy)
    PolicyOrBuilder {
  // Use Policy.newBuilder() to construct.
  private Policy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Policy() {
    idGraph_ = 0L;
    source_ = "";
    destination_ = "";
    type_ = 0;
    middlebox_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Policy(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            source_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            destination_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            middlebox_ = s;
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
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_Policy_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_Policy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.verigraph.Policy.class, io.grpc.verigraph.Policy.Builder.class);
  }

  /**
   * Protobuf enum {@code verigraph.Policy.PolicyType}
   */
  public enum PolicyType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>reachability = 0;</code>
     */
    reachability(0),
    /**
     * <code>isolation = 1;</code>
     */
    isolation(1),
    /**
     * <code>traversal = 2;</code>
     */
    traversal(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>reachability = 0;</code>
     */
    public static final int reachability_VALUE = 0;
    /**
     * <code>isolation = 1;</code>
     */
    public static final int isolation_VALUE = 1;
    /**
     * <code>traversal = 2;</code>
     */
    public static final int traversal_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PolicyType valueOf(int value) {
      return forNumber(value);
    }

    public static PolicyType forNumber(int value) {
      switch (value) {
        case 0: return reachability;
        case 1: return isolation;
        case 2: return traversal;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PolicyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PolicyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PolicyType>() {
            public PolicyType findValueByNumber(int number) {
              return PolicyType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.grpc.verigraph.Policy.getDescriptor().getEnumTypes().get(0);
    }

    private static final PolicyType[] VALUES = values();

    public static PolicyType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PolicyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:verigraph.Policy.PolicyType)
  }

  public static final int IDGRAPH_FIELD_NUMBER = 1;
  private long idGraph_;
  /**
   * <code>optional int64 idGraph = 1;</code>
   */
  public long getIdGraph() {
    return idGraph_;
  }

  public static final int SOURCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object source_;
  /**
   * <code>optional string source = 2;</code>
   */
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <code>optional string source = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_FIELD_NUMBER = 3;
  private volatile java.lang.Object destination_;
  /**
   * <code>optional string destination = 3;</code>
   */
  public java.lang.String getDestination() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destination_ = s;
      return s;
    }
  }
  /**
   * <code>optional string destination = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDestinationBytes() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destination_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_;
  /**
   * <code>optional .verigraph.Policy.PolicyType type = 4;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>optional .verigraph.Policy.PolicyType type = 4;</code>
   */
  public io.grpc.verigraph.Policy.PolicyType getType() {
    io.grpc.verigraph.Policy.PolicyType result = io.grpc.verigraph.Policy.PolicyType.valueOf(type_);
    return result == null ? io.grpc.verigraph.Policy.PolicyType.UNRECOGNIZED : result;
  }

  public static final int MIDDLEBOX_FIELD_NUMBER = 5;
  private volatile java.lang.Object middlebox_;
  /**
   * <code>optional string middlebox = 5;</code>
   */
  public java.lang.String getMiddlebox() {
    java.lang.Object ref = middlebox_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      middlebox_ = s;
      return s;
    }
  }
  /**
   * <code>optional string middlebox = 5;</code>
   */
  public com.google.protobuf.ByteString
      getMiddleboxBytes() {
    java.lang.Object ref = middlebox_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      middlebox_ = b;
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
    if (idGraph_ != 0L) {
      output.writeInt64(1, idGraph_);
    }
    if (!getSourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, source_);
    }
    if (!getDestinationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, destination_);
    }
    if (type_ != io.grpc.verigraph.Policy.PolicyType.reachability.getNumber()) {
      output.writeEnum(4, type_);
    }
    if (!getMiddleboxBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, middlebox_);
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
    if (!getSourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, source_);
    }
    if (!getDestinationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, destination_);
    }
    if (type_ != io.grpc.verigraph.Policy.PolicyType.reachability.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, type_);
    }
    if (!getMiddleboxBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, middlebox_);
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
    if (!(obj instanceof io.grpc.verigraph.Policy)) {
      return super.equals(obj);
    }
    io.grpc.verigraph.Policy other = (io.grpc.verigraph.Policy) obj;

    boolean result = true;
    result = result && (getIdGraph()
        == other.getIdGraph());
    result = result && getSource()
        .equals(other.getSource());
    result = result && getDestination()
        .equals(other.getDestination());
    result = result && type_ == other.type_;
    result = result && getMiddlebox()
        .equals(other.getMiddlebox());
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
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
    hash = (53 * hash) + getDestination().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + MIDDLEBOX_FIELD_NUMBER;
    hash = (53 * hash) + getMiddlebox().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.verigraph.Policy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.Policy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.Policy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.Policy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.Policy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.Policy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.Policy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.Policy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.Policy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.Policy parseFrom(
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
  public static Builder newBuilder(io.grpc.verigraph.Policy prototype) {
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
   * Protobuf type {@code verigraph.Policy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:verigraph.Policy)
      io.grpc.verigraph.PolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_Policy_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_Policy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.verigraph.Policy.class, io.grpc.verigraph.Policy.Builder.class);
    }

    // Construct using io.grpc.verigraph.Policy.newBuilder()
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

      source_ = "";

      destination_ = "";

      type_ = 0;

      middlebox_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_Policy_descriptor;
    }

    public io.grpc.verigraph.Policy getDefaultInstanceForType() {
      return io.grpc.verigraph.Policy.getDefaultInstance();
    }

    public io.grpc.verigraph.Policy build() {
      io.grpc.verigraph.Policy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.verigraph.Policy buildPartial() {
      io.grpc.verigraph.Policy result = new io.grpc.verigraph.Policy(this);
      result.idGraph_ = idGraph_;
      result.source_ = source_;
      result.destination_ = destination_;
      result.type_ = type_;
      result.middlebox_ = middlebox_;
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
      if (other instanceof io.grpc.verigraph.Policy) {
        return mergeFrom((io.grpc.verigraph.Policy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.verigraph.Policy other) {
      if (other == io.grpc.verigraph.Policy.getDefaultInstance()) return this;
      if (other.getIdGraph() != 0L) {
        setIdGraph(other.getIdGraph());
      }
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        onChanged();
      }
      if (!other.getDestination().isEmpty()) {
        destination_ = other.destination_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getMiddlebox().isEmpty()) {
        middlebox_ = other.middlebox_;
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
      io.grpc.verigraph.Policy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.verigraph.Policy) e.getUnfinishedMessage();
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

    private java.lang.Object source_ = "";
    /**
     * <code>optional string source = 2;</code>
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string source = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string source = 2;</code>
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string source = 2;</code>
     */
    public Builder clearSource() {
      
      source_ = getDefaultInstance().getSource();
      onChanged();
      return this;
    }
    /**
     * <code>optional string source = 2;</code>
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      source_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object destination_ = "";
    /**
     * <code>optional string destination = 3;</code>
     */
    public java.lang.String getDestination() {
      java.lang.Object ref = destination_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destination_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string destination = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDestinationBytes() {
      java.lang.Object ref = destination_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destination_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string destination = 3;</code>
     */
    public Builder setDestination(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destination_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string destination = 3;</code>
     */
    public Builder clearDestination() {
      
      destination_ = getDefaultInstance().getDestination();
      onChanged();
      return this;
    }
    /**
     * <code>optional string destination = 3;</code>
     */
    public Builder setDestinationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destination_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>optional .verigraph.Policy.PolicyType type = 4;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>optional .verigraph.Policy.PolicyType type = 4;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .verigraph.Policy.PolicyType type = 4;</code>
     */
    public io.grpc.verigraph.Policy.PolicyType getType() {
      io.grpc.verigraph.Policy.PolicyType result = io.grpc.verigraph.Policy.PolicyType.valueOf(type_);
      return result == null ? io.grpc.verigraph.Policy.PolicyType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .verigraph.Policy.PolicyType type = 4;</code>
     */
    public Builder setType(io.grpc.verigraph.Policy.PolicyType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .verigraph.Policy.PolicyType type = 4;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object middlebox_ = "";
    /**
     * <code>optional string middlebox = 5;</code>
     */
    public java.lang.String getMiddlebox() {
      java.lang.Object ref = middlebox_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        middlebox_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string middlebox = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMiddleboxBytes() {
      java.lang.Object ref = middlebox_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        middlebox_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string middlebox = 5;</code>
     */
    public Builder setMiddlebox(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      middlebox_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string middlebox = 5;</code>
     */
    public Builder clearMiddlebox() {
      
      middlebox_ = getDefaultInstance().getMiddlebox();
      onChanged();
      return this;
    }
    /**
     * <code>optional string middlebox = 5;</code>
     */
    public Builder setMiddleboxBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      middlebox_ = value;
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


    // @@protoc_insertion_point(builder_scope:verigraph.Policy)
  }

  // @@protoc_insertion_point(class_scope:verigraph.Policy)
  private static final io.grpc.verigraph.Policy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.verigraph.Policy();
  }

  public static io.grpc.verigraph.Policy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Policy>
      PARSER = new com.google.protobuf.AbstractParser<Policy>() {
    public Policy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Policy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Policy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Policy> getParserForType() {
    return PARSER;
  }

  public io.grpc.verigraph.Policy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

