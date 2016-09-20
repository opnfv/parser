.. This work is licensed under a Creative Commons Attribution 4.0 International
.. License.
.. http://creativecommons.org/licenses/by/4.0
.. (c) OPNFV, Ericsson AB and others.

=================
Parser User Guide
=================
Parser is an open source project and licensed under Apache 2. Parser will help
to provide a tooling mechanism, by parsing and then further translating Telecom
operators deployment descriptors into certain common templates, which could be
used in IaaS orchestration projects like OpenStack Heat(the template file is HOT,
which stands for Heat Orchestrator Template).

This document contains installation guide as well as testing guide for Parser's
three submodules: tosca2heat, yang2tosca and policy2tosca.

tosca2heat is about translating simple TOSCA to HOT, and the example is a vRNC
(virtual Radio Network Controller) definition with format translated from simple
TOSCA(parser's input file format) to HOT(parser's output file format), which can
be deployed by heat directly.

yang2tosca is about translating yang based templates to tosca based ones. Users could
further get HOT by using tosca2heat to process the output of yang2tosca.

policy2tosca is about translating policy related templates to tosca based ones. Users could
further get HOT by using tosca2heat to process the output of policy2tosca. Users could also
use policy2tosca together with Donimo project to have policy template distribution functionality.

For OPNFV Colorado release, policy2tosca only supports inject policy descriptions into tosca templates.
More functionalities will be delivered in the later release.

Contents:

.. toctree::
   :numbered:
   :maxdepth: 2

.. include:: featureusage.rst
.. include:: testusage.rst
