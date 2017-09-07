.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0

================
Parser verigraph
================

This document provides a description of VeriGraph, a formal verification tool for service graphs.

.. contents::
   :depth: 3
   :local:

Overview
--------
Given a service graph, which can include stateful network functions and their configurations
(e.g., filtering rules for firewalls, and blacklists for anti-spamming filters), VeriGraph can
accurately and quickly check reachability properties in the graph (e.g. if a particular flow of
packets can go from one node of the graph to another node).

VeriGraph exploits Satisfiability Modulo Theories (SMT) and the general-purpose SMT solver Z3.
It includes a library of network function models.

Architecture
------------
VeriGraph exploits two sub-modules:

- **Z3**, the SMT solver developed by Microsoft
- **Neo4J**, a Java-based graph-oriented database

The Neo4J database is used for service graph manipulation and to extract from a
service graph all the VNF chains that are relevant for checking the reachability
properties of that graph.

How the tool works
------------------
VeriGraph accepts JSON service graph descriptions that include endpoints, VNF instances, logical
directed links connecting them, and VNF configurations.

When VeriGraph receives a service graph and a reachability property to verify, it saves the graph
into Neo4J and it extracts the chains that connect the nodes addressed by the property to be
checked. For each one of these chains, VeriGraph builds a set of first order logic formulas that
represent a mathematical model of the forwarding behavior of the chain.
This model takes into account the forwarding behavior of the links and of the VNFs included in the
chain, taking into consideration their configurations. If the formulas that make up the model are
satisfiable, this means that it is possible for a packet to traverse the chain from one end to the
other. VeriGraph passes this model to Z3 which checks its satisfiability.
Based on the satisfiability result of the formulas that model the different paths, VeriGraph finally
derives the overall result (reachability property satisfied or not).

.. image:: /images/verigraph.png
