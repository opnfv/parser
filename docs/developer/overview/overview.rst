.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0

=========================================
OPNFV Parser Danube Overview Doumentation
=========================================

.. contents::
   :depth: 3
   :local:

Introduction
---------------

In NFV, various templates (such as descriptors, records and so on) are utilized
to describe the deployment requirements (such as basic VM requirements – vCPU,
memory, storage, as well as the NFV acceleration management requirement such as
Huge Pages support, SR-IOV, NUMA affinity, DPDK support etc.),
the post-instaniation records (such as storage usage report, CPU performance
report etc.) or other purposes. However in order to make these templates
adaptable and feasible for purpose like deployment orchestration/automation,
certain tooling mechanism that provides template translation is necessary.

Project Parser will help to provide such tooling mechanism, by parsing Telecom
operators’ descriptors/records into TOSCA/CAMP templates and then further
translate TOSCA/CAMP templates into certain common templates, which could be
used in IaaS orchestration projects like OpenStack Heat.

Upgrades from Arno
------------------------

For Release B, Parser offers the following additional capabilities:

* Integration of Heat-Translator Liberty release code. (both heat in-tree code and standalone package are provided)

* Yang2Tosca module which offers the capability to translate yang based
  scriptors to tosca formate templates. Users could further use Heat-translator
  module to translate this tosca template to Heat Orchestration template.
  Yang2Tosca module could be installed seperately after user installed
  OPNFV B release platform.

* The "parser_new_keywords" document demonstrate a set of keywords concluded by
  Parser team that need to be supported in tosca to heat translation. However
  it should be noted that these keywords only serve as a roadmap. We will start
  from Release C to indicate which specific set of keywords are supported in
  Parser.

* The "vRNC_tosca_intro" document describes Parser's use case analysis on vRNC scenario.
  The "example" folder contains examples of tosca-nfv standard and vRNC scenario.
  See also https://wiki.opnfv.org/parser.

Upgrades from Brumapatra
-----------------------

For Release C, Parser offers the following additional capabilities:

* Policy2Tosca module which enables policy related fields in tosca could be translated
  into heat orchestration template correctly. Policy2Tosca module could be installed seperately
  after user installed OPNFV C release platform.

* Tosca2Heat enhancements which includes a set of feature addons (such as substitution mapping)
for OpenStack tosca-parser module which is integrated in the OPNFV C release platform. And the
main details are listed below:

  ** support substitution mapping semantic in tosca-parser:
    - support parse and validation about substitution mapping definition;
    - support import nested template;
    - support deployment a node which is substituted by a template;
    - support deployment a template alone which has substitution mapping definition.

  ** afinity and anti-affinity support when deploy servers:
    - tosca.policies.Placement.Colocate;
    - tosca.policies.Placement.Antilocate;

  ** add validation about input parameters;

  ** add high availability and block volume in compute translation;

  ** add ip output in compute translation;

  ** add deployment a whole vRNC testcase with parser.

* Additional testing support.

Upgrades from Colorado
----------------------

For Release D, Parser offers the following additional capabilities:

