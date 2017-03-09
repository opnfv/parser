.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0


Parser tosca2heat Installation
============================

Please follow the below installation steps to install tosca2heat submodule in parser.

Step 1: Clone the parser project.

.. code-block:: bash

    git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Install the heat-translator sub project.

.. code-block:: bash

    # uninstall pre-installed tosca-parser
    pip uninstall -y heat-translator

    # change directory to heat-translator
    cd parser/tosca2heat/heat-translator

    # install requirements
    pip install -r requirements.txt

    # install heat-translator
    python setup.py install

Step 3: Install the tosca-parser sub project.

.. code-block:: bash

    # uninstall pre-installed tosca-parser
    pip uninstall -y tosca-parser

    # change directory to tosca-parser
    cd parser/tosca2heat/tosca-parser

    # install requirements
    pip install -r requirements.txt

    # install tosca-parser
    python setup.py install


**Notes**: It must uninstall pre-installed tosca-parser and heat-translator before install the two
components, and install heat-translator before installing tosca-parser, which is sure to use the
OPNFV version of tosca-parser and heat-translator other than openstack's components.


Parser yang2tosca Installation
==============================
Parser yang2tosca requires the following to be installed.

Step 1: Clone the parser project.

.. code-block:: bash

   git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Clone pyang tool or download the zip file from the following link.

.. code-block:: bash

    git clone https://github.com/mbj4668/pyang.git

OR

.. code-block:: bash

    wget https://github.com/mbj4668/pyang/archive/master.zip

Step 3: Change directory to the downloaded directory and run the setup file.

.. code-block:: bash

    cd pyang
    python setup.py

Step 4: install python-lxml
--------------

Please follow the below installation link. http://lxml.de/installation.html


Parser policy2tosca installation
================================

Please follow the below installation steps to install parser - POLICY2TOSCA.

Step 1: Clone the parser project.

.. code-block:: bash

   git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Install the policy2tosca module.

.. code-block:: bash

   cd parser/policy2tosca
   python setup.py install


Parser verigraph installation
=============================

In the present release, verigraph requires that the following software is also installed:

- Java 1.8 (with javac compiler)
- Apache Tomcat 8
- Microsoft Z3 (https://github.com/Z3Prover/bin/tree/master/releases)
- Neo4J (https://neo4j.org)

Please follow the below installation steps to install verigraph.

Step 1: Clone the parser project.

.. code-block:: bash

   git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Go to the verigraph directory.

.. code-block:: bash

   cd parser/verigraph

Step3: Follow the instructions in README.rst for downloading verigraph
dependencies and for installing verigraph.
