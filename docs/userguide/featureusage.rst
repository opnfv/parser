.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0
.. (c) <optionally add copywriters name>

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


  **Notes** It must uninstall pre-installed tosca-parser and heat-translator before install the two
  components, and install heat-translator before installing tosca-parser, which is sure to use the
  OPNFV version of tosca-parser and heat-translator other than openstack's components.

Parser tosca2heat Execution
===========================

Step 1: Change directory to where the tosca yaml files are present, example is
below with vRNC definiton.

.. code-block:: bash

    cd parser/tosca2heat/tosca-parser/toscaparser/extensions/nfv/tests/data/vRNC/Definitions


Step 2: Run the python command heat-translator with the TOSCA yaml file as an input option.

.. code-block:: bash

    heat-translator --template-file=<input file> --template-type=tosca
                    --outpurt-file=<output hot file>

Example:

.. code-block:: bash

    heat-translator --template-file=vRNC.yaml \
        --template-type=tosca --output-file=vRNC_hot.yaml

Notes: heat-translator will call class of ToscaTemplate in tosca-parser firstly to validate and
parse input yaml file, then tranlate the file into hot file, if you only want to validate or
check the input file and don't want to translate, please use tosaca-parser as following:

.. code-block:: bash

   tosca-parser --template-file=<input yaml file>

Example:

.. code-block:: bash

   tosca-parser --template-file=vRNC.yaml

Parser tosca2heat References
===========================
Refer two upstream components:
 https://github.com/openstack/tosca-parser/blob/master/doc/source/usage.rst
 https://github.com/openstack/heat-translator/blob/master/doc/source/usage.rst




Parser yang2tosca Installation
============================

Step 1: Change directory to where the scripts are present.

.. code-block:: bash

    cd parser/yang2tosca

Step 2: Copy the YANG file which needs to be converted into TOSCA to
        current (parser/yang2tosca) folder.

Step 3: Run the python script "parser.py" with the YANG file as an input option.

.. code-block:: bash

    python parser.py -n "YANG filename"

Example:

.. code-block:: bash

    python parser.py -n example.yaml

Step 4: Verify the TOSCA YAMl which file has been created with the same name
        as the YANG file with a “_tosca” suffix.

.. code-block:: bash

    cat "YANG filename_tosca.yaml"

Example:

.. code-block:: bash

    cat example_tosca.yaml





Parser policy2tosca Installation
============================

Step 1: To see a list of commands available.

.. code-block:: bash

    policy2tosca --help

Step 2: To see help for an individual command, include the command name on the command line

.. code-block:: bash

    policy2tosca help <service>

Step 3: To inject/remove policy types/policy definitions provide the TOSCA file as input to
policy2tosca command line.

.. code-block:: bash

    policy2tosca <service> [arguments]

Example:

.. code-block:: bash

    policy2tosca add-definition --policy_name rule2 --policy_type  tosca.policies.Placement.Geolocation
--description "test description" --properties region:us-north-1,region:us-north-2,min_inst:2 --targets
VNF2,VNF4 --metadata "map of strings" --triggers "1,2,3,4" --source example.yaml


Step 4: Verify the TOSCA YAMl updated with the injection/removal executed.

.. code-block:: bash

    cat "<source tosca file>"

Example:

.. code-block:: bash

    cat example_tosca.yaml

