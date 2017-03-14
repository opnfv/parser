.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0

=================
Parser tosca2heat
=================

Tosca2heat is a opnfv sub-project of parser based on openstack two projects: tosca
parser and heat translator.

The TOSCA Parser is developed to parse TOSCA Simple Profile in YAML. It reads the
TOSCA templates and creates an in-memory graph of TOSCA nodes and their relationship.
Heat-Translator is a command line tool which takes non-Heat templates as an input
and produces a Heat Orchestration Template (HOT) which can be deployed by Heat.

More details please refer to openstack related sites.

Tosca2heat intends to enhanced NFV features in tosca template parse and translator,
such as huge page, dpdk and sriov.