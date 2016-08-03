#    Licensed under the Apache License, Version 2.0 (the "License"); you may
#    not use this file except in compliance with the License. You may obtain
#    a copy of the License at
#
#         http://www.apache.org/licenses/LICENSE-2.0
#
#    Unless required by applicable law or agreed to in writing, software
#    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
#    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
#    License for the specific language governing permissions and limitations
#    under the License.

import logging

from toscaparser.common.exception import ExceptionCollector
from toscaparser.common.exception import InvalidNodeTypeError
from toscaparser.common.exception import MissingRequiredFieldError
from toscaparser.common.exception import UnknownFieldError
# from toscaparser.common.exception import ValidationError
# from toscaparser.utils.gettextutils import _
# from toscaparser.utils import validateutils
# from toscaparser.nodetemplate import NodeTemplate
# from toscaparser.elements.nodetype import NodeType
# from toscaparser.parameters import Input
# from toscaparser.parameters import Output
# from toscaparser.groups import Group
# from toscaparser.policy import Policy


log = logging.getLogger('tosca')


class Substitution_mappings(object):
    '''Substitution_mappings class declaration

    Substitution_mappings exports the topology template as an
    implementation of a Node type.
    '''

    SECTIONS = (NODE_TYPE, CAPABILITIES, REQUIREMENTS) = \
               ('node_type', 'requirements', 'capabilities')

    def __init__(self, sub_mapping_def, nodetemplates, inputs, outputs,
                 sub_mapped_node_template, custom_defs):
        self.nodetemplates = nodetemplates
        self.sub_mapping_def = sub_mapping_def
        self.inputs = inputs or []
        self.outputs = outputs or []
        self.sub_mapped_node_template = sub_mapped_node_template
        self.custom_defs = custom_defs or {}
        self._validate()

        self._capabilities = None
        self._requirements = None

        self.sub_mapped_node_template.substitution_mapped = True

    @classmethod
    def get_node_type(cls, sub_mapping_def):
        if isinstance(sub_mapping_def, dict):
            return sub_mapping_def.get(cls.NODE_TYPE)

    @property
    def node_type(self):
        return self.sub_mapping_def.get(self.NODE_TYPE)

    @property
    def capabilities(self):
        return self.sub_mapping_def.get(self.CAPABILITIES)

    @property
    def requirements(self):
        return self.sub_mapping_def.get(self.REQUIREMENTS)

    def _validate(self):
        self._validate_keys()
        self._validate_type()
        self._validate_inputs()
        self._validate_capabilities()
        self._validate_requirements()
        self._validate_outputs()

    def _validate_keys(self):
        """validate the keys of substitution mappings."""
        for key in self.sub_mapping_def.keys():
            if key not in self.SECTIONS:
                ExceptionCollector.appendException(
                    UnknownFieldError(what='Substitution_mappings',
                                      field=key))

    def _validate_type(self):
        """validate the node_type of substitution mappings."""
        node_type = self.sub_mapping_def.get(self.NODE_TYPE)
        if not node_type:
            ExceptionCollector.appendException(
                MissingRequiredFieldError(
                    what=_('Substitution_mappings used in topology_template'),
                    required=self.NODE_TYPE))

        node_type_def = self.custom_defs.get(node_type)
        if not node_type_def:
            ExceptionCollector.appendException(
                InvalidNodeTypeError(what=node_type_def))

    def _validate_inputs(self):
        """validate the inputs of substitution mappings."""

        # The inputs in service template which defines substutition mappings
        # must be in properties of node template wchich be mapped.
        inputs_names = list(self.sub_mapped_node_template
                                .get_properties().keys())
        for name in inputs_names:
            if name not in [input.name for input in self.inputs]:
                ExceptionCollector.appendException(
                    UnknownFieldError(what='Substitution_mappings',
                                      field=name))

    def _validate_capabilities(self):
        """validate the capabilities of substitution mappings."""

        # The capabilites must be in node template wchich be mapped.
        tpls_capabilities = self.sub_mapping_def.get(self.CAPABILITIES)
        node_capabiliteys = self.sub_mapped_node_template.get_capabilities()
        for cap in node_capabiliteys.keys() if node_capabiliteys else []:
            if (tpls_capabilities and
                    cap not in list(tpls_capabilities.keys())):
                pass
                # ExceptionCollector.appendException(
                #    UnknownFieldError(what='Substitution_mappings',
                #                      field=cap))

    def _validate_requirements(self):
        """validate the requirements of substitution mappings."""

        # The requirements must be in node template wchich be mapped.
        tpls_requirements = self.sub_mapping_def.get(self.REQUIREMENTS)
        node_requirements = self.sub_mapped_node_template.requirements
        for req in node_requirements if node_requirements else []:
            if (tpls_requirements and
                    req not in list(tpls_requirements.keys())):
                pass
                # ExceptionCollector.appendException(
                #    UnknownFieldError(what='Substitution_mappings',
                #                      field=req))

    def _validate_outputs(self):
        """validate the outputs of substitution mappings."""
        pass
        # The outputs in service template which defines substutition mappings
        # must be in atrributes of node template wchich be mapped.
        # outputs_names = self.sub_mapped_node_template.get_properties().keys()
        # for name in outputs_names:
        #    if name not in [output.name for input in self.outputs]:
        #        ExceptionCollector.appendException(
        #            UnknownFieldError(what='Substitution_mappings',
        #                              field=name))
