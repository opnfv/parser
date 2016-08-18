.. This work is licensed under a Creative Commons Attribution 4.0 International
.. License.
.. http://creativecommons.org/licenses/by/4.0
.. (c) OPNFV, Ericsson AB and others.

=================
Parser User Guide
=================
Parser is an open source project and licensed under Apache 2. Parser will help
to provide a tooling mechanism, by parsing Telecom operators VNF descriptors
(YANG templates) into TOSCA templates and then further translate TOSCA templates
into certain common templates, which could be used in IaaS orchestration projects
like OpenStack Heat(the template file is HOT, which stands for Heat Orchestrator
Template), this document is about simple TOSCA to HOT, and the example is a vRNC
(virtual Radio Network Controller) definition with format translated from simple
TOSCA(parser's input file format) to HOT(parser's output file format), which can
be deployed by heat directly.

Contents:

.. toctree::
   :numbered:
   :maxdepth: 2

.. include:: featureusage.rst
.. include:: testusage.rst
