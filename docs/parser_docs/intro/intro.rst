..
 This work is licensed under a Creative Commons Attribution 3.0 Unported
 License.
..
 http://creativecommons.org/licenses/by/3.0/legalcode

============================
Introduction of Parser Project
============================

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

For Release B, Parser offers the following capabilities:

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
