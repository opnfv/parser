/******************************************************************************* 
 * Copyright (c) 2017 Politecnico di Torino and others. 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0 
 * which accompanies this distribution, and is available at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *******************************************************************************/ 

package io.grpc.verigraph;

public final class VerigraphProto {
  private VerigraphProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_RequestID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_RequestID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_Policy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_ConfigurationGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_ConfigurationGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_NodeGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_NodeGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_GraphGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_GraphGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_NeighbourGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_NeighbourGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_NewGraph_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_NewGraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_NewNode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_NewNode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_NewNeighbour_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_NewNeighbour_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_TestGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_TestGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_VerificationGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_VerificationGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_verigraph_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_verigraph_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017verigraph.proto\022\tverigraph\"\014\n\nGetReque" +
      "st\"A\n\tRequestID\022\017\n\007idGraph\030\001 \001(\003\022\016\n\006idNo" +
      "de\030\002 \001(\003\022\023\n\013idNeighbour\030\003 \001(\003\"\273\001\n\006Policy" +
      "\022\017\n\007idGraph\030\001 \001(\003\022\016\n\006source\030\002 \001(\t\022\023\n\013des" +
      "tination\030\003 \001(\t\022*\n\004type\030\004 \001(\0162\034.verigraph" +
      ".Policy.PolicyType\022\021\n\tmiddlebox\030\005 \001(\t\"<\n" +
      "\nPolicyType\022\020\n\014reachability\020\000\022\r\n\tisolati" +
      "on\020\001\022\r\n\ttraversal\020\002\"l\n\021ConfigurationGrpc" +
      "\022\017\n\007idGraph\030\001 \001(\003\022\016\n\006idNode\030\002 \001(\003\022\023\n\013des" +
      "cription\030\003 \001(\t\022\025\n\rconfiguration\030\004 \001(\t\022\n\n",
      "\002id\030\005 \001(\t\"\276\003\n\010NodeGrpc\022\017\n\007idGraph\030\001 \001(\003\022" +
      "\014\n\004name\030\002 \001(\t\022\n\n\002id\030\003 \001(\003\022;\n\017functional_" +
      "type\030\004 \001(\0162\".verigraph.NodeGrpc.Function" +
      "alType\022+\n\tneighbour\030\005 \003(\0132\030.verigraph.Ne" +
      "ighbourGrpc\0223\n\rconfiguration\030\006 \001(\0132\034.ver" +
      "igraph.ConfigurationGrpc\022\024\n\014errorMessage" +
      "\030\007 \001(\t\"\321\001\n\016FunctionalType\022\014\n\010antispam\020\000\022" +
      "\t\n\005cache\020\001\022\007\n\003dpi\020\002\022\013\n\007endhost\020\003\022\014\n\010endp" +
      "oint\020\004\022\021\n\rfieldmodifier\020\005\022\014\n\010firewall\020\006\022" +
      "\016\n\nmailclient\020\007\022\016\n\nmailserver\020\010\022\007\n\003nat\020\t",
      "\022\r\n\tvpnaccess\020\n\022\013\n\007vpnexit\020\013\022\r\n\twebclien" +
      "t\020\014\022\r\n\twebserver\020\r\"P\n\tGraphGrpc\022\n\n\002id\030\001 " +
      "\001(\003\022!\n\004node\030\002 \003(\0132\023.verigraph.NodeGrpc\022\024" +
      "\n\014errorMessage\030\003 \001(\t\"`\n\rNeighbourGrpc\022\017\n" +
      "\007idGraph\030\001 \001(\003\022\016\n\006idNode\030\002 \001(\003\022\014\n\004name\030\003" +
      " \001(\t\022\n\n\002id\030\004 \001(\003\022\024\n\014errorMessage\030\005 \001(\t\"V" +
      "\n\010NewGraph\022\017\n\007success\030\001 \001(\010\022#\n\005graph\030\002 \001" +
      "(\0132\024.verigraph.GraphGrpc\022\024\n\014errorMessage" +
      "\030\003 \001(\t\"S\n\007NewNode\022\017\n\007success\030\001 \001(\010\022!\n\004no" +
      "de\030\002 \001(\0132\023.verigraph.NodeGrpc\022\024\n\014errorMe",
      "ssage\030\003 \001(\t\"b\n\014NewNeighbour\022\017\n\007success\030\001" +
      " \001(\010\022+\n\tneighbour\030\002 \001(\0132\030.verigraph.Neig" +
      "hbourGrpc\022\024\n\014errorMessage\030\003 \001(\t\"=\n\010TestG" +
      "rpc\022!\n\004node\030\001 \003(\0132\023.verigraph.NodeGrpc\022\016" +
      "\n\006result\030\002 \001(\t\"\210\001\n\020VerificationGrpc\022\032\n\022s" +
      "uccessOfOperation\030\001 \001(\010\022\016\n\006result\030\002 \001(\t\022" +
      "\017\n\007comment\030\003 \001(\t\022!\n\004test\030\004 \003(\0132\023.verigra" +
      "ph.TestGrpc\022\024\n\014errorMessage\030\005 \001(\t\"/\n\006Sta" +
      "tus\022\017\n\007success\030\001 \001(\010\022\024\n\014errorMessage\030\002 \001" +
      "(\t2\256\010\n\tVerigraph\022<\n\tGetGraphs\022\025.verigrap",
      "h.GetRequest\032\024.verigraph.GraphGrpc\"\0000\001\0228" +
      "\n\010GetGraph\022\024.verigraph.RequestID\032\024.verig" +
      "raph.GraphGrpc\"\000\0229\n\010GetNodes\022\024.verigraph" +
      ".RequestID\032\023.verigraph.NodeGrpc\"\0000\001\0226\n\007G" +
      "etNode\022\024.verigraph.RequestID\032\023.verigraph" +
      ".NodeGrpc\"\000\022C\n\rGetNeighbours\022\024.verigraph" +
      ".RequestID\032\030.verigraph.NeighbourGrpc\"\0000\001" +
      "\022@\n\014GetNeighbour\022\024.verigraph.RequestID\032\030" +
      ".verigraph.NeighbourGrpc\"\000\022:\n\013CreateGrap" +
      "h\022\024.verigraph.GraphGrpc\032\023.verigraph.NewG",
      "raph\"\000\0228\n\013DeleteGraph\022\024.verigraph.Reques" +
      "tID\032\021.verigraph.Status\"\000\022:\n\013UpdateGraph\022" +
      "\024.verigraph.GraphGrpc\032\023.verigraph.NewGra" +
      "ph\"\000\022@\n\014VerifyPolicy\022\021.verigraph.Policy\032" +
      "\033.verigraph.VerificationGrpc\"\000\0227\n\nCreate" +
      "Node\022\023.verigraph.NodeGrpc\032\022.verigraph.Ne" +
      "wNode\"\000\0227\n\nDeleteNode\022\024.verigraph.Reques" +
      "tID\032\021.verigraph.Status\"\000\0227\n\nUpdateNode\022\023" +
      ".verigraph.NodeGrpc\032\022.verigraph.NewNode\"" +
      "\000\022B\n\rConfigureNode\022\034.verigraph.Configura",
      "tionGrpc\032\021.verigraph.Status\"\000\022F\n\017CreateN" +
      "eighbour\022\030.verigraph.NeighbourGrpc\032\027.ver" +
      "igraph.NewNeighbour\"\000\022<\n\017DeleteNeighbour" +
      "\022\024.verigraph.RequestID\032\021.verigraph.Statu" +
      "s\"\000\022F\n\017UpdateNeighbour\022\030.verigraph.Neigh" +
      "bourGrpc\032\027.verigraph.NewNeighbour\"\000B%\n\021i" +
      "o.grpc.verigraphB\016VerigraphProtoP\001b\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_verigraph_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_verigraph_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_GetRequest_descriptor,
        new java.lang.String[] { });
    internal_static_verigraph_RequestID_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_verigraph_RequestID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_RequestID_descriptor,
        new java.lang.String[] { "IdGraph", "IdNode", "IdNeighbour", });
    internal_static_verigraph_Policy_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_verigraph_Policy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_Policy_descriptor,
        new java.lang.String[] { "IdGraph", "Source", "Destination", "Type", "Middlebox", });
    internal_static_verigraph_ConfigurationGrpc_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_verigraph_ConfigurationGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_ConfigurationGrpc_descriptor,
        new java.lang.String[] { "IdGraph", "IdNode", "Description", "Configuration", "Id", });
    internal_static_verigraph_NodeGrpc_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_verigraph_NodeGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_NodeGrpc_descriptor,
        new java.lang.String[] { "IdGraph", "Name", "Id", "FunctionalType", "Neighbour", "Configuration", "ErrorMessage", });
    internal_static_verigraph_GraphGrpc_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_verigraph_GraphGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_GraphGrpc_descriptor,
        new java.lang.String[] { "Id", "Node", "ErrorMessage", });
    internal_static_verigraph_NeighbourGrpc_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_verigraph_NeighbourGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_NeighbourGrpc_descriptor,
        new java.lang.String[] { "IdGraph", "IdNode", "Name", "Id", "ErrorMessage", });
    internal_static_verigraph_NewGraph_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_verigraph_NewGraph_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_NewGraph_descriptor,
        new java.lang.String[] { "Success", "Graph", "ErrorMessage", });
    internal_static_verigraph_NewNode_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_verigraph_NewNode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_NewNode_descriptor,
        new java.lang.String[] { "Success", "Node", "ErrorMessage", });
    internal_static_verigraph_NewNeighbour_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_verigraph_NewNeighbour_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_NewNeighbour_descriptor,
        new java.lang.String[] { "Success", "Neighbour", "ErrorMessage", });
    internal_static_verigraph_TestGrpc_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_verigraph_TestGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_TestGrpc_descriptor,
        new java.lang.String[] { "Node", "Result", });
    internal_static_verigraph_VerificationGrpc_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_verigraph_VerificationGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_VerificationGrpc_descriptor,
        new java.lang.String[] { "SuccessOfOperation", "Result", "Comment", "Test", "ErrorMessage", });
    internal_static_verigraph_Status_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_verigraph_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_verigraph_Status_descriptor,
        new java.lang.String[] { "Success", "ErrorMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
