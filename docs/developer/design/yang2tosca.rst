.. This work is licensed under a Creative Commons Attribution 
.. 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0

=================
Parser yang2tosca
=================

Problem description
-------------------
In NFV, various templates are utilized to describe the deployment requirements,
the post-instantiation records or other purposes. However in order to make
these templates adaptable and feasible for purpose like deployment
orchestration/automation, certain tooling mechanism that provides template
translation is necessary.When an end user needs a translation from YANG to
TOSCA for further deployment this is where the yang2tosca module comes in as
part of parser project.

Design
------
The following modules are implemented in yang2tosca module.

PYANG
-----
PYAG module is used to validate YANG templates, if the user input the YAGN
template in YAML format we use this module to validate and convert it to XML
format of YANG.The “yin” module under PYANG is used for the conversion from
YAML to XML.
Reference for PYANG:
http://www.yang-central.org/twiki/pub/Main/YangTools/pyang.1.html

LXML
----
lxml is another python module that we make use in our design, this module is
used to parse the xml object, which will be the base for translational.
The “etree” module under lxml is used for the translation to TOSCA files.
Reference for lxml: http://lxml.de/

tosca_translator
----------------
All the above module come under this tosca_translator function which can be
invoked and used for translation purposes.

The user inputs the YANG template in either XML or in YAML format to the
yang2tosca module and the output is the TOSCA YAML file.
1.The First step in the module is where the input is checked for the format.
   If the format is YAML then a module called pyang converts this into a YANG
   XML file.
   If the format is XML then then the conversion process is initiated.
2.The conversion process will be with the help of an XSLT which will be invoked
through python scripting.

Input
-----
The user can input either YANG XML or YANG YAML file which should be present
where the scripts/modules are present.

Output
------
The user will get the out TOSCA YAML file under the same directory where the
scripts/modules are executed with same name as the input file with "_tosca"
suffixed to it.
