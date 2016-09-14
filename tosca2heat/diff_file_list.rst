.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0

===================================
1. tosca-parser difference list 
===================================

[modified] tosca-parser/toscaparser/elements/nodetype.py
[modified] tosca-parser/toscaparser/elements/TOSCA_definition_1_0.yaml
[modified] tosca-parser/toscaparser/elements/tosca_type_validation.py
[new file] tosca-parser/toscaparser/extensions/nfv/tests/data/vRNC/Definitions/vRNC.yaml
[new file] tosca-parser/toscaparser/extensions/nfv/tests/data/vRNC/Definitions/rnc_definition.yaml
[new file] tosca-parser/toscaparser/extensions/nfv/tests/data/vRNC/TOSCA-Metadata/TOSCA.meta 
[new file] tosca-parser/toscaparser/extensions/nfv/tests/data/vRNC/README.txt
[new file] tosca-parser/toscaparser/extensions/nfv/tests/test_tosca_vRNC.py
[modified] tosca-parser/toscaparser/tests/data/functions/test_get_property_with_host.yaml
[new file] tosca-parser/toscaparser/tests/data/topology_template/databasesubsystem.yaml
[modified] tosca-parser/toscaparser/tests/data/topology_template/definitions.yaml
[new file] tosca-parser/toscaparser/tests/data/topology_template/queuingsubsystem.yaml
[del file] tosca-parser/toscaparser/tests/data/topology_template/subsystem.yaml
[modified] tosca-parser/toscaparser/tests/data/topology_template/system.yaml
[new file] tosca-parser/toscaparser/tests/data/topology_template/transactionsubsystem.yaml
[modified] tosca-parser/toscaparser/tests/data/test_tosca_normative_type_by_shortname.yaml
[modified] tosca-parser/toscaparser/tests/data/tosca_single_instance_wordpress.yaml
[modified] tosca-parser/toscaparser/tests/data/tosca_single_instance_wordpress_with_local_abspath_import.yaml
[modified] tosca-parser/toscaparser/tests/data/tosca_single_instance_wordpress_with_url_import.yaml
[modified] tosca-parser/toscaparser/tests/test_functions.py
[modified] tosca-parser/toscaparser/tests/test_topology_template.py
[modified] tosca-parser/toscaparser/tests/test_toscatpl.py
[modified] tosca-parser/toscaparser/tests/test_toscatplvalidation.py
[modified] tosca-parser/toscaparser/imports.py
[modified] tosca-parser/toscaparser/nodetemplate.py
[modified] tosca-parser/toscaparser/parameters.py
[new file] tosca-parser/toscaparser/substitution_mappings.py
[modified] tosca-parser/toscaparser/topology_template.py
[modified] tosca-parser/toscaparser/tosca_template.py
[modified] tosca-parser/MANIFEST.in
[modified] tosca-parser/tox.ini


===================================
2. heat-translator difference list 
===================================

[modified] heat-translator/translator/hot/syntax/hot_resource.py
[modified] heat-translator/translator/hot/tosca/tests/test_tosca_compute.py
[modified] heat-translator/translator/hot/tosca/tests/test_tosca_policies.py
[modified] heat-translator/translator/hot/tosca/tosca_compute.py
[modified] heat-translator/translator/hot/tosca/tosca_network_network.py
[modified] heat-translator/translator/hot/tosca/tosca_policies_antilocate.py
[modified] heat-translator/translator/hot/tosca/tosca_policies_colocate.py
[modified] heat-translator/translator/hot/translate_node_templates.py
[modified] heat-translator/translator/tests/data/hot_output/network/hot_custom_network_nodes.yaml
[modified] heat-translator/translator/tests/data/hot_output/network/hot_one_server_one_network.yaml
[modified] heat-translator/translator/tests/data/hot_output/network/hot_one_server_three_networks.yaml
[modified] heat-translator/translator/tests/data/hot_output/network/hot_server_on_existing_network.yaml
[modified] heat-translator/translator/tests/data/hot_output/network/hot_two_servers_one_network.yaml
[modified] heat-translator/translator/tests/data/hot_output/storage/hot_blockstorage_with_attachment.yaml
[modified] heat-translator/translator/tests/data/hot_output/storage/hot_blockstorage_with_attachment_notation1_alt1.yaml
[modified] heat-translator/translator/tests/data/hot_output/storage/hot_blockstorage_with_attachment_notation1_alt2.yaml
[modified] heat-translator/translator/tests/data/hot_output/storage/hot_blockstorage_with_attachment_notation2_alt1.yaml
[modified] heat-translator/translator/tests/data/hot_output/storage/hot_blockstorage_with_attachment_notation2_alt2.yaml
[modified] heat-translator/translator/tests/data/hot_output/storage/hot_blockstorage_with_custom_relationship_type.yaml
[modified] heat-translator/translator/tests/data/hot_output/storage/hot_blockstorage_with_relationship_template.yaml
[modified] heat-translator/translator/tests/data/hot_output/storage/hot_multiple_blockstorage_with_attachment_alt1.yaml
[modified] heat-translator/translator/tests/data/hot_output/storage/hot_multiple_blockstorage_with_attachment_alt2.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_artifact.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_custom_type.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_custom_type_with_override.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_custom_type_with_param_override.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_elk.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_elk_from_csar.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_flavor_and_image.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_flavor_and_image_params.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_hello_world.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_hello_world_userkey.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_hello_world_userkey.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_nfv_sample.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_nodejs_mongodb_two_instances.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_policies.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_script_types.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_single_instance_wordpress.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_single_instance_wordpress_from_csar.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_single_server.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_single_server_with_defaults_with_input.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_single_server_with_defaults_without_input.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_single_server_without_tosca_os_version.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_software_component.yaml
[new file] heat-translator/translator/tests/data/hot_output/hot_vRNC.yaml
[modified] heat-translator/translator/tests/data/hot_output/hot_web_application.yaml
[new file] heat-translator/translator/tests/data/vRNC/Definitions/rnc_definition.yaml
[new file] heat-translator/translator/tests/data/vRNC/Definitions/vRNC.yaml
[new file] heat-translator/translator/tests/data/vRNC/Scripts/MM/mm_active_configure.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/MM/mm_passivtiv_configure.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/MM/mm_install.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/MM/mm_storage_configure.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/CM/cm_active_configure.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/CM/cm_passivtiv_configure.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/CM/cm_install.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/DM/dm_configure.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/DM/dm_install.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/LB/lb_configure.sh
[new file] heat-translator/translator/tests/data/vRNC/Scripts/LB/lb_install.sh
[new file] heat-translator/translator/tests/data/vRNC/TOSCA-Metadata/TOSCA.meta
[new fiel] heat-translator/translator/tests/data/vRNC/README.txt
[modified] heat-translator/translator/tests/data/test_tosca_nfv_sample.yaml
[modified] heat-translator/translator/tests/test_shell.py
[modified] heat-translator/translator/shell.py
[modified] heat-translator/MANIFEST.in
[modified] heat-translator/tox.ini
