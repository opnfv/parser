.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0

==================
Parser polic2tosca
==================

Problem description
-------------------
In NFV, various templates are utilized to describe the deployment requirements,
the post-instantiation records or other purposes.However in order to make these
templates adaptable and feasible for purpose like deployment orchestration/
automation,certain tooling mechanism that provides template translation is
necessary.When an end user needs to inject/remove policies from the TOSCA
file generated the policy2tosca module comes in as part of parser project.

Design
------
The following modules are implemented in policy2tosca module.

CLIFF
-----
cliff is a framework for building command line programs. It uses plugins to
define sub-commands, output formatters, and other extensions.In policy2tosca
we use cliff to define the commands to inject or remove policies from
TOSCA templates.
Reference for PYANG: https://docs.openstack.org/developer/cliff/

policy2tosca
------------
policy2tosca is a custom module written with the plugins of cliff where we
define adding/removing definitions and/or types of policies.
Following are the sub modules under policy2tosca
    * add_definition.py: To inject a policy definition to the TOSCA template.
    * add_type.py: To inject a policy type to the TOSCA template.
    * del_definition.py: To remove a policy definition from the TOSCA template.
    * del_type.py: To remove a policy type from the TOSCA template.

Input
-----
The user specifies the input in command line arguments for the policy2tosca
custom module with the source TOSCA file to which the policies should be
injected/removed.

Output
------
The output TOSCA template will be the input TOSCA file with the
modification of policies.
