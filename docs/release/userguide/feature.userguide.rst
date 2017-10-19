.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0
.. (c) <optionally add copywriters name>



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

**Notes**: heat-translator will call class of ToscaTemplate in tosca-parser firstly to validate and
parse input yaml file, then tranlate the file into hot file, if you only want to validate or
check the input file and don't want to translate, please use tosaca-parser as following:

.. code-block:: bash

    tosca-parser --template-file=<path to the YAML template>  [--nrpv]  [--debug]
    or
        tosca-parser --template-file=<path to the CSAR zip file> [--nrpv]  [--debug]
    or
        tosca-parser --template-file=<URL to the template or CSAR>  [--nrpv]  [--debug]
    options:
      --nrpv Ignore input parameter validation when parse template.
      --debug debug mode for print more details other than raise exceptions when errors happen

Example:

.. code-block:: bash

   tosca-parser --template-file=vRNC.yaml --nrpv

Parser tosca2heat References
============================
Refer two upstream components:
 https://github.com/openstack/tosca-parser/blob/master/doc/source/usage.rst
 https://github.com/openstack/heat-translator/blob/master/doc/source/usage.rst




Parser yang2tosca Execution
===========================

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





Parser policy2tosca Execution
=============================

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

    policy2tosca add-definition \
        --policy_name rule2 --policy_type  tosca.policies.Placement.Geolocation \
        --description "test description" \
        --properties region:us-north-1,region:us-north-2,min_inst:2 \
        --targets VNF2,VNF4 \
        --metadata "map of strings" \
        --triggers "1,2,3,4" \
        --source example.yaml


Step 4: Verify the TOSCA YAMl updated with the injection/removal executed.

.. code-block:: bash

    cat "<source tosca file>"

Example:

.. code-block:: bash

    cat example_tosca.yaml


Parser verigraph Execution
==========================

VeriGraph is accessible via both a RESTful API and a gRPC interface.

**REST API**

Step 1. Change directory to where the service graph examples are present

.. code-block:: bash

   cd parser/verigraph/examples

Step 2. Use a REST client (e.g., cURL) to send a POST request (whose body is one of the JSON
file in the directory)

.. code-block:: bash

   curl -X POST -d @<file_name>.json http://<server_address>:<server_port>/verify/api/graphs
   --header "Content-Type:application/json"

Step 3. Use a REST client to send a GET request to check a reachability-based property between
two nodes of the service graph created in the previous step.

.. code-block:: bash

   curl -X GET http://<server_addr>:<server_port>/verify/api/graphs/<graphID>/
   policy?source=<srcNodeID>&destination=<dstNodeID>&type=<propertyType>

where:

- <graphID> is the identifier of the service graph created at Step 2
- <srcNodeID> is the name of the source node
- <dstNodeID> is the name of the destination node
- <propertyType> can be ``reachability``, ``isolation`` or ``traversal``

Step 4. the output is a JSON with the overall result of the verification process and the partial
result for each path that connects the source and destination nodes in the service graph.

**gRPC API**

VeriGraph exposes a gRPC interface that is self-descriptive by its Protobuf file
(``parser/verigraph/src/main/proto/verigraph.proto``). In the current release, Verigraph
misses a module that receives service graphs in format of JSON and sends the proper
requests to the gRPC server. A testing client has been provided to have an example of how
to create a service graph using the gRPC interface and to trigger the verification step.

1. Run the testing client

.. code-block:: bash

      cd parser/verigraph
      #Client souce code in ``parser/verigraph/src/it/polito/verigraph/grpc/client/Client.java``
      ant -f buildVeriGraph_gRPC.xml run-client
