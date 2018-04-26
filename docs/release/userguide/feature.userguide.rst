.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0
.. (c) <optionally add copywriters name>



Parser tosca2heat Execution
===========================

nfv-heattranslator
-------------------

 There only one way to call nfv-heattranslator service: CLI.

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

**Notes**: nfv-heattranslator will call class of ToscaTemplate in nfv-toscaparser firstly to validate and
parse input yaml file, then tranlate the file into hot file.


nfv-toscaparser
----------------

Implementation of nfv-toscaparser derived from openstack tosca parser is based on the following OASIS specification:
    TOSCA Simple Profile YAML 1.2 Referecne  http://docs.oasis-open.org/tosca/TOSCA-Simple-Profile-YAML/v1.2/TOSCA-Simple-Profile-YAML-v1.2.html
    TOSCA Simple Profile YAML NFV 1.0 Referecne  http://docs.oasis-open.org/tosca/tosca-nfv/v1.0/tosca-nfv-v1.0.html

There are three ways to call nfv-toscaparser service, Python Lib ,CLI and  REST API.

CLI
****
Using cli, which is used to validate tosca simple based service template. It can be used as:

.. code-block:: bash

   tosca-parser --template-file=<path to the YAML template>  [--nrpv]  [--debug]
   tosca-parser --template-file=<path to the CSAR zip file> [--nrpv]  [--debug]
   tosca-parser --template-file=<URL to the template or CSAR>  [--nrpv]  [--debug]

   options:
     --nrpv Ignore input parameter validation when parse template.
     --debug debug mode for print more details other than raise exceptions when errors happen


Library(Python)
****************

Using api, which is used to parse and get the result of service template. it can be used as:

.. code-block:: bash

   ToscaTemplate(path=None, parsed_params=None, a_file=True, yaml_dict_tpl=None,
                                          sub_mapped_node_template=None,
                                          no_required_paras_valid=False, debug=False )

REST API
*********

Using RESTfual API, which are listed as following:

List template versions
########################

PATH: /v1/template_versions
METHOD:  GET
Decription: Lists all supported tosca template versions.

Response Codes

Success
200 - OK	Request was successful.

Error

400 - Bad Request	Some content in the request was invalid.
404 - Not Found	The requested resource could not be found.
500 - Internal Server Error	Something went wrong inside the service. This should not happen usually.
If it does happen, it means the server has experienced some serious problems.

Request Parameters

No

Response Parameters

template_versions	array	A list of tosca template version object each describes the type name and
 version information for a template version.


Validates a service template
#############################

PATH: /v1/validate
METHOD:  POST
Decription: Validate a service template.

Response Codes
Success
200 - OK	Request was successful.

Error

400 - Bad Request	Some content in the request was invalid.
500 - Internal Server Error	Something went wrong inside the service. This should not happen usually.
 If it does happen, it means the server has experienced some serious problems.
Request Parameters
environment (Optional)	object	A JSON environment for the template service.
environment_files (Optional)	object	An ordered list of names for environment files found in the files dict.
files (Optional)	object
Supplies the contents of files referenced in the template or the environment.

The value is a JSON object, where each key is a relative or absolute URI which serves as the name of
 a file, and the associated value provides the contents of the file. The following code shows the
 general structure of this parameter.

{ ...
    "files": {
        "fileA.yaml": "Contents of the file",
        "file:///usr/fileB.template": "Contents of the file",
        "http://example.com/fileC.template": "Contents of the file"
    }
...
}
ignore_errors (Optional)	string	List of comma separated error codes to ignore.
show_nested (Optional)	boolean	Set to true to include nested template service in the list.
template (Optional)	object
The service template on which to perform the operation.

This parameter is always provided as a string in the JSON request body. The content of the string is
 a JSON- or YAML-formatted service template. For example:

"template": {
    "tosca_definitions_version": "tosca_simple_yaml_1_0",
    ...
}
This parameter is required only when you omit the template_url parameter. If you specify both
parameters, this value overrides thetemplate_url parameter value.

template_url (Optional)	string	A URI to the location containing the service template on which to
perform the operation. See the description of the template parameter for information about the
expected template content located at the URI. This parameter is only required when you omit the
template parameter. If you specify both parameters, this parameter is ignored.

Request Example
{
    "template_url": "/PATH_TO_TOSCA_TEMPLATES/HelloWord_Instance.csar"
}

Response Parameters
Description	string	The description specified in the template.
Error Information (Optional)	string	Error information

Parse a service template
#########################

PATH: /v1/validate
METHOD:  POST
Decription: Validate a service template.
Response Code: same as "Validates a service template"
Request Parameters: same as "Validates a service template"
Response Parameters
Description	string	The description specified in the template.
Input parameters	object	Input parameter list.
Service Template	object	Service template body
Output parameters	object	Input parameter list.
Error Information (Optional)	string	Error information


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
