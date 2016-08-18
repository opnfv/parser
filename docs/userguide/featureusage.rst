.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0
.. (c) <optionally add copywriters name>

Installation
============================

Please follow the below installation steps to install parser.

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


  **Notes** It must uninstall pre-installed tosca-parser and heat-translator before install the two
  components, and install heat-translator before installing tosca-parser, which is sure to use the
  OPNFV version of tosca-parser and heat-translator other than openstack's components.

Execution
===========================

Step 1: Change directory to where the tosca yaml files are present, example is
below with vRNC definiton.

.. code-block:: bash

    cd parser/tosca2heat/tosca-parser/toscaparser/extensions/nfv/tests/data/vRNC/Definitions


Step 2: Run the python script "parser.py" with the YANG file as an input option.

.. code-block:: bash

    heat-translator --template-file=<input file> --template-type=tosca
                    --outpurt-file=<output hot file>

Example:

.. code-block:: bash

    heat-translator --template-file=vRNC.yaml \
        --template-type=tosca --output-file=vRNC_hot.yaml

Notes: heat-translator will call tosca-parser firsly to validate and parser input yaml file,
then tranlate the file into hot file, if you only want to validate or check the input file
and don't want to translate, please use tosaca-parser as following:

.. code-block:: bash

   tosca-parser --template-file=<input yaml file>

Example:

.. code-block:: bash

   tosca-parser --template-file=vRNC.yaml

References
===========================
Refer two upstream components:
 https://github.com/openstack/tosca-parser/blob/master/doc/source/usage.rst
 https://github.com/openstack/heat-translator/blob/master/doc/source/usage.rst
