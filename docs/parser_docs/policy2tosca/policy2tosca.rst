.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0

===================
Parser POLICY2TOSCA
===================

Overview
========

Parser is an open source project and licensed under Apache 2. Parser will help
to provide a tooling mechanism, by parsing Telecom operators’ VNF descriptors
(YANG templates) into TOSCA templates and then further translate TOSCA
templates into certain common templates, which could be used in IaaS orchestration
projects like OpenStack Heat.

Prerequisites
=============

Parser - POLICY2TOSCA requires the following to be installed.

1. cliff
--------

Install cliff with the following links.
::
- `install <http://docs.openstack.org/developer/cliff/install.html>`
or
- `demoapp <http://docs.openstack.org/developer/cliff/demoapp.html>`

Installation
============================

Please follow the below installation steps to install parser - POLICY2TOSCA.

Step 1: Clone the parser project.

.. code-block:: bash

    git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Install the policy2tosca module.

.. code-block:: bash

	cd parser/policy2tosca
	python setup.py install
	
Execution
===========================

Step 1: To see a list of commands available.

.. code-block:: bash

    policy2tosca --help

Step 2: To see help for an individual command, include the command name on the command line

.. code-block:: bash

	policy2tosca help <service>
		
Step 3: To inject/remove policy types/policy definitions provide the TOSCA file as input to policy2tosca command line. 

.. code-block:: bash

    policy2tosca <service> [arguments]

Example:

.. code-block:: bash

    policy2tosca add-definition --policy_name rule2 --policy_type  tosca.policies.Placement.Geolocation --description "test description" --properties region:us-north-1,region:us-north-2,min_inst:2 --targets VNF2,VNF4 --metadata "map of strings" --triggers "1,2,3,4" --source example.yaml


Step 4: Verify the TOSCA YAMl updated with the injection/removal executed.

.. code-block:: bash

    cat "<source tosca file>"

Example:

.. code-block:: bash

    cat example_tosca.yaml
