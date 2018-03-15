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


nfv-toscaparser api
--------------------

 Implementation of nfv-toscaparser derived from openstack tosca parser is based on the following OASIS specification:
    TOSCA Simple Profile YAML 1.2 Referecne  http://docs.oasis-open.org/tosca/TOSCA-Simple-Profile-YAML/v1.2/TOSCA-Simple-Profile-YAML-v1.2.html
    TOSCA Simple Profile YAML NFV 1.0 Referecne  http://docs.oasis-open.org/tosca/tosca-nfv/v1.0/tosca-nfv-v1.0.html

 There are three ways to call nfv-toscaparser service, Python Lib ,CLI and  REST API.

CLI
****
Using cli, which is used to validate tosca simple based service template. It can be used as:
    tosca-parser --template-file=<path to the YAML template>  [--nrpv]  [--debug]

     tosca-parser --template-file=<path to the CSAR zip file> [--nrpv]  [--debug]

     tosca-parser --template-file=<URL to the template or CSAR>  [--nrpv]  [--debug]

    options:

      --nrpv Ignore input parameter validation when parse template.

     --debug debug mode for print more details other than raise exceptions when errors happen



Library(Python)
**************
   Using api, which is used to parse and get the result of service template. it can be used as
   ToscaTemplate(path=None, parsed_params=None, a_file=True, yaml_dict_tpl=None,

                                          sub_mapped_node_template=None,

                                          no_required_paras_valid=False, debug=False )



REST API
***********
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
500 - Internal Server Error	Something went wrong inside the service. This should not happen usually. If it does happen, it means the server has experienced some serious problems.
Request Parameters

No

Response Parameters

template_versions	array	A list of tosca template version object each describes the type name and version information for a template version.


Validates a service template
############################

PATH: /v1/validate
METHOD:  POST
Decription: Validate a service template.

Response Codes
Success
200 - OK	Request was successful.

Error

400 - Bad Request	Some content in the request was invalid.
500 - Internal Server Error	Something went wrong inside the service. This should not happen usually. If it does happen, it means the server has experienced some serious problems.
Request Parameters
environment (Optional)	object	A JSON environment for the template service.
environment_files (Optional)	object	An ordered list of names for environment files found in the files dict.
files (Optional)	object
Supplies the contents of files referenced in the template or the environment.

The value is a JSON object, where each key is a relative or absolute URI which serves as the name of a file, and the associated value provides the contents of the file. The following code shows the general structure of this parameter.

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

This parameter is always provided as a string in the JSON request body. The content of the string is a JSON- or YAML-formatted service template. For example:

"template": {
    "tosca_definitions_version": "tosca_simple_yaml_1_0",
    ...
}
This parameter is required only when you omit the template_url parameter. If you specify both parameters, this value overrides thetemplate_url parameter value.

template_url (Optional)	string	A URI to the location containing the service template on which to perform the operation. See the description of the template parameter for information about the expected template content located at the URI. This parameter is only required when you omit the template parameter. If you specify both parameters, this parameter is ignored.
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
