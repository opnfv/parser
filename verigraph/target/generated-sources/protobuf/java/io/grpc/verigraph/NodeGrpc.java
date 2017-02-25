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
 * Protobuf type {@code verigraph.NodeGrpc}
 */
public  final class NodeGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:verigraph.NodeGrpc)
    NodeGrpcOrBuilder {
  // Use NodeGrpc.newBuilder() to construct.
  private NodeGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeGrpc() {
    idGraph_ = 0L;
    name_ = "";
    id_ = 0L;
    functionalType_ = 0;
    neighbour_ = java.util.Collections.emptyList();
    errorMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NodeGrpc(
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

            name_ = s;
            break;
          }
          case 24: {

            id_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            functionalType_ = rawValue;
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              neighbour_ = new java.util.ArrayList<io.grpc.verigraph.NeighbourGrpc>();
              mutable_bitField0_ |= 0x00000010;
            }
            neighbour_.add(
                input.readMessage(io.grpc.verigraph.NeighbourGrpc.parser(), extensionRegistry));
            break;
          }
          case 50: {
            io.grpc.verigraph.ConfigurationGrpc.Builder subBuilder = null;
            if (configuration_ != null) {
              subBuilder = configuration_.toBuilder();
            }
            configuration_ = input.readMessage(io.grpc.verigraph.ConfigurationGrpc.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(configuration_);
              configuration_ = subBuilder.buildPartial();
            }

            break;
          }
          case 58: {
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        neighbour_ = java.util.Collections.unmodifiableList(neighbour_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NodeGrpc_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NodeGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.verigraph.NodeGrpc.class, io.grpc.verigraph.NodeGrpc.Builder.class);
  }

  /**
   * Protobuf enum {@code verigraph.NodeGrpc.FunctionalType}
   */
  public enum FunctionalType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>antispam = 0;</code>
     */
    antispam(0),
    /**
     * <code>cache = 1;</code>
     */
    cache(1),
    /**
     * <code>dpi = 2;</code>
     */
    dpi(2),
    /**
     * <code>endhost = 3;</code>
     */
    endhost(3),
    /**
     * <code>endpoint = 4;</code>
     */
    endpoint(4),
    /**
     * <code>fieldmodifier = 5;</code>
     */
    fieldmodifier(5),
    /**
     * <code>firewall = 6;</code>
     */
    firewall(6),
    /**
     * <code>mailclient = 7;</code>
     */
    mailclient(7),
    /**
     * <code>mailserver = 8;</code>
     */
    mailserver(8),
    /**
     * <code>nat = 9;</code>
     */
    nat(9),
    /**
     * <code>vpnaccess = 10;</code>
     */
    vpnaccess(10),
    /**
     * <code>vpnexit = 11;</code>
     */
    vpnexit(11),
    /**
     * <code>webclient = 12;</code>
     */
    webclient(12),
    /**
     * <code>webserver = 13;</code>
     */
    webserver(13),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>antispam = 0;</code>
     */
    public static final int antispam_VALUE = 0;
    /**
     * <code>cache = 1;</code>
     */
    public static final int cache_VALUE = 1;
    /**
     * <code>dpi = 2;</code>
     */
    public static final int dpi_VALUE = 2;
    /**
     * <code>endhost = 3;</code>
     */
    public static final int endhost_VALUE = 3;
    /**
     * <code>endpoint = 4;</code>
     */
    public static final int endpoint_VALUE = 4;
    /**
     * <code>fieldmodifier = 5;</code>
     */
    public static final int fieldmodifier_VALUE = 5;
    /**
     * <code>firewall = 6;</code>
     */
    public static final int firewall_VALUE = 6;
    /**
     * <code>mailclient = 7;</code>
     */
    public static final int mailclient_VALUE = 7;
    /**
     * <code>mailserver = 8;</code>
     */
    public static final int mailserver_VALUE = 8;
    /**
     * <code>nat = 9;</code>
     */
    public static final int nat_VALUE = 9;
    /**
     * <code>vpnaccess = 10;</code>
     */
    public static final int vpnaccess_VALUE = 10;
    /**
     * <code>vpnexit = 11;</code>
     */
    public static final int vpnexit_VALUE = 11;
    /**
     * <code>webclient = 12;</code>
     */
    public static final int webclient_VALUE = 12;
    /**
     * <code>webserver = 13;</code>
     */
    public static final int webserver_VALUE = 13;


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
    public static FunctionalType valueOf(int value) {
      return forNumber(value);
    }

    public static FunctionalType forNumber(int value) {
      switch (value) {
        case 0: return antispam;
        case 1: return cache;
        case 2: return dpi;
        case 3: return endhost;
        case 4: return endpoint;
        case 5: return fieldmodifier;
        case 6: return firewall;
        case 7: return mailclient;
        case 8: return mailserver;
        case 9: return nat;
        case 10: return vpnaccess;
        case 11: return vpnexit;
        case 12: return webclient;
        case 13: return webserver;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FunctionalType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FunctionalType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FunctionalType>() {
            public FunctionalType findValueByNumber(int number) {
              return FunctionalType.forNumber(number);
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
      return io.grpc.verigraph.NodeGrpc.getDescriptor().getEnumTypes().get(0);
    }

    private static final FunctionalType[] VALUES = values();

    public static FunctionalType valueOf(
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

    private FunctionalType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:verigraph.NodeGrpc.FunctionalType)
  }

  private int bitField0_;
  public static final int IDGRAPH_FIELD_NUMBER = 1;
  private long idGraph_;
  /**
   * <code>optional int64 idGraph = 1;</code>
   */
  public long getIdGraph() {
    return idGraph_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 3;
  private long id_;
  /**
   * <pre>
   *long
   * </pre>
   *
   * <code>optional int64 id = 3;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int FUNCTIONAL_TYPE_FIELD_NUMBER = 4;
  private int functionalType_;
  /**
   * <code>optional .verigraph.NodeGrpc.FunctionalType functional_type = 4;</code>
   */
  public int getFunctionalTypeValue() {
    return functionalType_;
  }
  /**
   * <code>optional .verigraph.NodeGrpc.FunctionalType functional_type = 4;</code>
   */
  public io.grpc.verigraph.NodeGrpc.FunctionalType getFunctionalType() {
    io.grpc.verigraph.NodeGrpc.FunctionalType result = io.grpc.verigraph.NodeGrpc.FunctionalType.valueOf(functionalType_);
    return result == null ? io.grpc.verigraph.NodeGrpc.FunctionalType.UNRECOGNIZED : result;
  }

  public static final int NEIGHBOUR_FIELD_NUMBER = 5;
  private java.util.List<io.grpc.verigraph.NeighbourGrpc> neighbour_;
  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  public java.util.List<io.grpc.verigraph.NeighbourGrpc> getNeighbourList() {
    return neighbour_;
  }
  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  public java.util.List<? extends io.grpc.verigraph.NeighbourGrpcOrBuilder> 
      getNeighbourOrBuilderList() {
    return neighbour_;
  }
  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  public int getNeighbourCount() {
    return neighbour_.size();
  }
  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  public io.grpc.verigraph.NeighbourGrpc getNeighbour(int index) {
    return neighbour_.get(index);
  }
  /**
   * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
   */
  public io.grpc.verigraph.NeighbourGrpcOrBuilder getNeighbourOrBuilder(
      int index) {
    return neighbour_.get(index);
  }

  public static final int CONFIGURATION_FIELD_NUMBER = 6;
  private io.grpc.verigraph.ConfigurationGrpc configuration_;
  /**
   * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
   */
  public boolean hasConfiguration() {
    return configuration_ != null;
  }
  /**
   * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
   */
  public io.grpc.verigraph.ConfigurationGrpc getConfiguration() {
    return configuration_ == null ? io.grpc.verigraph.ConfigurationGrpc.getDefaultInstance() : configuration_;
  }
  /**
   * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
   */
  public io.grpc.verigraph.ConfigurationGrpcOrBuilder getConfigurationOrBuilder() {
    return getConfiguration();
  }

  public static final int ERRORMESSAGE_FIELD_NUMBER = 7;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>optional string errorMessage = 7;</code>
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
   * <code>optional string errorMessage = 7;</code>
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
    if (idGraph_ != 0L) {
      output.writeInt64(1, idGraph_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (id_ != 0L) {
      output.writeInt64(3, id_);
    }
    if (functionalType_ != io.grpc.verigraph.NodeGrpc.FunctionalType.antispam.getNumber()) {
      output.writeEnum(4, functionalType_);
    }
    for (int i = 0; i < neighbour_.size(); i++) {
      output.writeMessage(5, neighbour_.get(i));
    }
    if (configuration_ != null) {
      output.writeMessage(6, getConfiguration());
    }
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, errorMessage_);
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
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, id_);
    }
    if (functionalType_ != io.grpc.verigraph.NodeGrpc.FunctionalType.antispam.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, functionalType_);
    }
    for (int i = 0; i < neighbour_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, neighbour_.get(i));
    }
    if (configuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getConfiguration());
    }
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, errorMessage_);
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
    if (!(obj instanceof io.grpc.verigraph.NodeGrpc)) {
      return super.equals(obj);
    }
    io.grpc.verigraph.NodeGrpc other = (io.grpc.verigraph.NodeGrpc) obj;

    boolean result = true;
    result = result && (getIdGraph()
        == other.getIdGraph());
    result = result && getName()
        .equals(other.getName());
    result = result && (getId()
        == other.getId());
    result = result && functionalType_ == other.functionalType_;
    result = result && getNeighbourList()
        .equals(other.getNeighbourList());
    result = result && (hasConfiguration() == other.hasConfiguration());
    if (hasConfiguration()) {
      result = result && getConfiguration()
          .equals(other.getConfiguration());
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
    hash = (37 * hash) + IDGRAPH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIdGraph());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + FUNCTIONAL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + functionalType_;
    if (getNeighbourCount() > 0) {
      hash = (37 * hash) + NEIGHBOUR_FIELD_NUMBER;
      hash = (53 * hash) + getNeighbourList().hashCode();
    }
    if (hasConfiguration()) {
      hash = (37 * hash) + CONFIGURATION_FIELD_NUMBER;
      hash = (53 * hash) + getConfiguration().hashCode();
    }
    hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.verigraph.NodeGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.NodeGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.NodeGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.verigraph.NodeGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.verigraph.NodeGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.NodeGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.NodeGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.NodeGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.verigraph.NodeGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.verigraph.NodeGrpc parseFrom(
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
  public static Builder newBuilder(io.grpc.verigraph.NodeGrpc prototype) {
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
   * Protobuf type {@code verigraph.NodeGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:verigraph.NodeGrpc)
      io.grpc.verigraph.NodeGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NodeGrpc_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NodeGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.verigraph.NodeGrpc.class, io.grpc.verigraph.NodeGrpc.Builder.class);
    }

    // Construct using io.grpc.verigraph.NodeGrpc.newBuilder()
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
        getNeighbourFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      idGraph_ = 0L;

      name_ = "";

      id_ = 0L;

      functionalType_ = 0;

      if (neighbourBuilder_ == null) {
        neighbour_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        neighbourBuilder_.clear();
      }
      if (configurationBuilder_ == null) {
        configuration_ = null;
      } else {
        configuration_ = null;
        configurationBuilder_ = null;
      }
      errorMessage_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.verigraph.VerigraphProto.internal_static_verigraph_NodeGrpc_descriptor;
    }

    public io.grpc.verigraph.NodeGrpc getDefaultInstanceForType() {
      return io.grpc.verigraph.NodeGrpc.getDefaultInstance();
    }

    public io.grpc.verigraph.NodeGrpc build() {
      io.grpc.verigraph.NodeGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.verigraph.NodeGrpc buildPartial() {
      io.grpc.verigraph.NodeGrpc result = new io.grpc.verigraph.NodeGrpc(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.idGraph_ = idGraph_;
      result.name_ = name_;
      result.id_ = id_;
      result.functionalType_ = functionalType_;
      if (neighbourBuilder_ == null) {
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          neighbour_ = java.util.Collections.unmodifiableList(neighbour_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.neighbour_ = neighbour_;
      } else {
        result.neighbour_ = neighbourBuilder_.build();
      }
      if (configurationBuilder_ == null) {
        result.configuration_ = configuration_;
      } else {
        result.configuration_ = configurationBuilder_.build();
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
      if (other instanceof io.grpc.verigraph.NodeGrpc) {
        return mergeFrom((io.grpc.verigraph.NodeGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.verigraph.NodeGrpc other) {
      if (other == io.grpc.verigraph.NodeGrpc.getDefaultInstance()) return this;
      if (other.getIdGraph() != 0L) {
        setIdGraph(other.getIdGraph());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.functionalType_ != 0) {
        setFunctionalTypeValue(other.getFunctionalTypeValue());
      }
      if (neighbourBuilder_ == null) {
        if (!other.neighbour_.isEmpty()) {
          if (neighbour_.isEmpty()) {
            neighbour_ = other.neighbour_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureNeighbourIsMutable();
            neighbour_.addAll(other.neighbour_);
          }
          onChanged();
        }
      } else {
        if (!other.neighbour_.isEmpty()) {
          if (neighbourBuilder_.isEmpty()) {
            neighbourBuilder_.dispose();
            neighbourBuilder_ = null;
            neighbour_ = other.neighbour_;
            bitField0_ = (bitField0_ & ~0x00000010);
            neighbourBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNeighbourFieldBuilder() : null;
          } else {
            neighbourBuilder_.addAllMessages(other.neighbour_);
          }
        }
      }
      if (other.hasConfiguration()) {
        mergeConfiguration(other.getConfiguration());
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
      io.grpc.verigraph.NodeGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.verigraph.NodeGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     *long
     * </pre>
     *
     * <code>optional int64 id = 3;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     *long
     * </pre>
     *
     * <code>optional int64 id = 3;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *long
     * </pre>
     *
     * <code>optional int64 id = 3;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private int functionalType_ = 0;
    /**
     * <code>optional .verigraph.NodeGrpc.FunctionalType functional_type = 4;</code>
     */
    public int getFunctionalTypeValue() {
      return functionalType_;
    }
    /**
     * <code>optional .verigraph.NodeGrpc.FunctionalType functional_type = 4;</code>
     */
    public Builder setFunctionalTypeValue(int value) {
      functionalType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .verigraph.NodeGrpc.FunctionalType functional_type = 4;</code>
     */
    public io.grpc.verigraph.NodeGrpc.FunctionalType getFunctionalType() {
      io.grpc.verigraph.NodeGrpc.FunctionalType result = io.grpc.verigraph.NodeGrpc.FunctionalType.valueOf(functionalType_);
      return result == null ? io.grpc.verigraph.NodeGrpc.FunctionalType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .verigraph.NodeGrpc.FunctionalType functional_type = 4;</code>
     */
    public Builder setFunctionalType(io.grpc.verigraph.NodeGrpc.FunctionalType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      functionalType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .verigraph.NodeGrpc.FunctionalType functional_type = 4;</code>
     */
    public Builder clearFunctionalType() {
      
      functionalType_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<io.grpc.verigraph.NeighbourGrpc> neighbour_ =
      java.util.Collections.emptyList();
    private void ensureNeighbourIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        neighbour_ = new java.util.ArrayList<io.grpc.verigraph.NeighbourGrpc>(neighbour_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.verigraph.NeighbourGrpc, io.grpc.verigraph.NeighbourGrpc.Builder, io.grpc.verigraph.NeighbourGrpcOrBuilder> neighbourBuilder_;

    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public java.util.List<io.grpc.verigraph.NeighbourGrpc> getNeighbourList() {
      if (neighbourBuilder_ == null) {
        return java.util.Collections.unmodifiableList(neighbour_);
      } else {
        return neighbourBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public int getNeighbourCount() {
      if (neighbourBuilder_ == null) {
        return neighbour_.size();
      } else {
        return neighbourBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public io.grpc.verigraph.NeighbourGrpc getNeighbour(int index) {
      if (neighbourBuilder_ == null) {
        return neighbour_.get(index);
      } else {
        return neighbourBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public Builder setNeighbour(
        int index, io.grpc.verigraph.NeighbourGrpc value) {
      if (neighbourBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNeighbourIsMutable();
        neighbour_.set(index, value);
        onChanged();
      } else {
        neighbourBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public Builder setNeighbour(
        int index, io.grpc.verigraph.NeighbourGrpc.Builder builderForValue) {
      if (neighbourBuilder_ == null) {
        ensureNeighbourIsMutable();
        neighbour_.set(index, builderForValue.build());
        onChanged();
      } else {
        neighbourBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public Builder addNeighbour(io.grpc.verigraph.NeighbourGrpc value) {
      if (neighbourBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNeighbourIsMutable();
        neighbour_.add(value);
        onChanged();
      } else {
        neighbourBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public Builder addNeighbour(
        int index, io.grpc.verigraph.NeighbourGrpc value) {
      if (neighbourBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNeighbourIsMutable();
        neighbour_.add(index, value);
        onChanged();
      } else {
        neighbourBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public Builder addNeighbour(
        io.grpc.verigraph.NeighbourGrpc.Builder builderForValue) {
      if (neighbourBuilder_ == null) {
        ensureNeighbourIsMutable();
        neighbour_.add(builderForValue.build());
        onChanged();
      } else {
        neighbourBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public Builder addNeighbour(
        int index, io.grpc.verigraph.NeighbourGrpc.Builder builderForValue) {
      if (neighbourBuilder_ == null) {
        ensureNeighbourIsMutable();
        neighbour_.add(index, builderForValue.build());
        onChanged();
      } else {
        neighbourBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public Builder addAllNeighbour(
        java.lang.Iterable<? extends io.grpc.verigraph.NeighbourGrpc> values) {
      if (neighbourBuilder_ == null) {
        ensureNeighbourIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, neighbour_);
        onChanged();
      } else {
        neighbourBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public Builder clearNeighbour() {
      if (neighbourBuilder_ == null) {
        neighbour_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        neighbourBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public Builder removeNeighbour(int index) {
      if (neighbourBuilder_ == null) {
        ensureNeighbourIsMutable();
        neighbour_.remove(index);
        onChanged();
      } else {
        neighbourBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public io.grpc.verigraph.NeighbourGrpc.Builder getNeighbourBuilder(
        int index) {
      return getNeighbourFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public io.grpc.verigraph.NeighbourGrpcOrBuilder getNeighbourOrBuilder(
        int index) {
      if (neighbourBuilder_ == null) {
        return neighbour_.get(index);  } else {
        return neighbourBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public java.util.List<? extends io.grpc.verigraph.NeighbourGrpcOrBuilder> 
         getNeighbourOrBuilderList() {
      if (neighbourBuilder_ != null) {
        return neighbourBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(neighbour_);
      }
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public io.grpc.verigraph.NeighbourGrpc.Builder addNeighbourBuilder() {
      return getNeighbourFieldBuilder().addBuilder(
          io.grpc.verigraph.NeighbourGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public io.grpc.verigraph.NeighbourGrpc.Builder addNeighbourBuilder(
        int index) {
      return getNeighbourFieldBuilder().addBuilder(
          index, io.grpc.verigraph.NeighbourGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .verigraph.NeighbourGrpc neighbour = 5;</code>
     */
    public java.util.List<io.grpc.verigraph.NeighbourGrpc.Builder> 
         getNeighbourBuilderList() {
      return getNeighbourFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.verigraph.NeighbourGrpc, io.grpc.verigraph.NeighbourGrpc.Builder, io.grpc.verigraph.NeighbourGrpcOrBuilder> 
        getNeighbourFieldBuilder() {
      if (neighbourBuilder_ == null) {
        neighbourBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.verigraph.NeighbourGrpc, io.grpc.verigraph.NeighbourGrpc.Builder, io.grpc.verigraph.NeighbourGrpcOrBuilder>(
                neighbour_,
                ((bitField0_ & 0x00000010) == 0x00000010),
                getParentForChildren(),
                isClean());
        neighbour_ = null;
      }
      return neighbourBuilder_;
    }

    private io.grpc.verigraph.ConfigurationGrpc configuration_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.verigraph.ConfigurationGrpc, io.grpc.verigraph.ConfigurationGrpc.Builder, io.grpc.verigraph.ConfigurationGrpcOrBuilder> configurationBuilder_;
    /**
     * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
     */
    public boolean hasConfiguration() {
      return configurationBuilder_ != null || configuration_ != null;
    }
    /**
     * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
     */
    public io.grpc.verigraph.ConfigurationGrpc getConfiguration() {
      if (configurationBuilder_ == null) {
        return configuration_ == null ? io.grpc.verigraph.ConfigurationGrpc.getDefaultInstance() : configuration_;
      } else {
        return configurationBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
     */
    public Builder setConfiguration(io.grpc.verigraph.ConfigurationGrpc value) {
      if (configurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configuration_ = value;
        onChanged();
      } else {
        configurationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
     */
    public Builder setConfiguration(
        io.grpc.verigraph.ConfigurationGrpc.Builder builderForValue) {
      if (configurationBuilder_ == null) {
        configuration_ = builderForValue.build();
        onChanged();
      } else {
        configurationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
     */
    public Builder mergeConfiguration(io.grpc.verigraph.ConfigurationGrpc value) {
      if (configurationBuilder_ == null) {
        if (configuration_ != null) {
          configuration_ =
            io.grpc.verigraph.ConfigurationGrpc.newBuilder(configuration_).mergeFrom(value).buildPartial();
        } else {
          configuration_ = value;
        }
        onChanged();
      } else {
        configurationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
     */
    public Builder clearConfiguration() {
      if (configurationBuilder_ == null) {
        configuration_ = null;
        onChanged();
      } else {
        configuration_ = null;
        configurationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
     */
    public io.grpc.verigraph.ConfigurationGrpc.Builder getConfigurationBuilder() {
      
      onChanged();
      return getConfigurationFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
     */
    public io.grpc.verigraph.ConfigurationGrpcOrBuilder getConfigurationOrBuilder() {
      if (configurationBuilder_ != null) {
        return configurationBuilder_.getMessageOrBuilder();
      } else {
        return configuration_ == null ?
            io.grpc.verigraph.ConfigurationGrpc.getDefaultInstance() : configuration_;
      }
    }
    /**
     * <code>optional .verigraph.ConfigurationGrpc configuration = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.verigraph.ConfigurationGrpc, io.grpc.verigraph.ConfigurationGrpc.Builder, io.grpc.verigraph.ConfigurationGrpcOrBuilder> 
        getConfigurationFieldBuilder() {
      if (configurationBuilder_ == null) {
        configurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.verigraph.ConfigurationGrpc, io.grpc.verigraph.ConfigurationGrpc.Builder, io.grpc.verigraph.ConfigurationGrpcOrBuilder>(
                getConfiguration(),
                getParentForChildren(),
                isClean());
        configuration_ = null;
      }
      return configurationBuilder_;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>optional string errorMessage = 7;</code>
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
     * <code>optional string errorMessage = 7;</code>
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
     * <code>optional string errorMessage = 7;</code>
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
     * <code>optional string errorMessage = 7;</code>
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorMessage = 7;</code>
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


    // @@protoc_insertion_point(builder_scope:verigraph.NodeGrpc)
  }

  // @@protoc_insertion_point(class_scope:verigraph.NodeGrpc)
  private static final io.grpc.verigraph.NodeGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.verigraph.NodeGrpc();
  }

  public static io.grpc.verigraph.NodeGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeGrpc>
      PARSER = new com.google.protobuf.AbstractParser<NodeGrpc>() {
    public NodeGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NodeGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodeGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeGrpc> getParserForType() {
    return PARSER;
  }

  public io.grpc.verigraph.NodeGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

