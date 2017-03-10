.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0

=================
Parser apigateway
=================

This document provides a description of apigateway, a message relay submodule for the other
parser submodules.

.. contents::
   :depth: 3
   :local:

Overview
--------
Provide unified access interfaces for follow independent parser components:
 - tosca2heat
 - yang2tosca
 - policy2tosca
 - verigraph
 - parser ui
 The apigateway will relay message between above submodules throngh gRPC interface, in additon,
apigateway also exposes restful api to provide parser all functions to the 3rd applications.


Architecture
------------
Apigateway exploits three sub-components:

- **APIGW**, the main part of apigateway, which is the message center.
- **gRPC**, provide gRPC client and server for the other parser sub-modules, it can be devided
into defferent pair of client/server according to the function.
- **CLI**, command line tool for apigateway access and management .

Apigateway architecture is shown below:

.. image:: /images/API_gateway_architecture.png
