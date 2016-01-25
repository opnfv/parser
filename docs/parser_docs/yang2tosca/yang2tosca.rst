========================
Parser YANG2TOSCA
========================

Overview
===========================

Parser is an open source project and licensed under Apache 2. Parser will help
to provide a tooling mechanism, by parsing Telecom operators’ VNF descriptors
(YANG templates) into TOSCA templates and then further translate TOSCA
templates into certain common templates, which could be used in IaaS orchestration
projects like OpenStack Heat.

Prerequisites
==========================

Parser requires the following to be installed.

1. PYANG
-----------------

Please follow the below installation steps.

Step 1: Clone pyang tool or download the zip file from the following link.
                git clone https://github.com/mbj4668/pyang.git
                                or
                wget https://github.com/mbj4668/pyang/archive/master.zip

Step 2: Change directory to the downloaded directory and run the setup file.
                cd pyang
                python setup.py

2. python-lxml
--------------------

Please follow the below installation link.
        http://lxml.de/installation.html


Installation
============================

Please follow the below installation steps to install parser.

Step 1: Clone the parser project.
        git clone https://gerrit.opnfv.org/gerrit/parser

Execution
===========================

Step 1: Change directory to where the scripts are present.
        cd parser/yang2tosca

Step 2: Copy the YANG file which needs to be converted into TOSCA to
        current (parser/yang2tosca) folder.

Step 3: Run the python script "parser.py" with the YANG file as an input option.
                python parser.py -n "YANG filename"
        Example:
                python parser.py -n example.yaml

Step 4: Verify the TOSCA YAMl which file has been created with the same name
        as the YANG file with a “_tosca” suffix.
                cat "YANG filename_tosca.yaml"
        Example:
                cat example_tosca.yaml

