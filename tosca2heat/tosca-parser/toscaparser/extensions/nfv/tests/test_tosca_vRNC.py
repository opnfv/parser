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

import os

from toscaparser.tests.base import TestCase
from toscaparser.tosca_template import ToscaTemplate


class ToscaVRNCTemplateTest(TestCase):

    '''NFV TOSCA vRNC template.'''
    tosca_tpl = os.path.join(
        os.path.dirname(os.path.abspath(__file__)),
        "data/vRNC/Definitions/vRNC.yaml")
    tosca = ToscaTemplate(tosca_tpl)

    def test_version(self):
        self.assertEqual(self.tosca.version,
                         "tosca_simple_profile_for_nfv_1_0_0")

    def test_input(self):
        first_input_name = "mm_storage_size"
        self.assertEqual(self.tosca.inputs[0].name, first_input_name)

    def test_nodetemplates(self):
        expected_node_list = sorted(
            ["MM_Active", "MM_Passive", "MM_BlockStorage",
             "CM_Active", "CM_Passive", "DM", "LB",
             "EXTERMEDIA_Net", "INTERMEDIA_Net", "EMS_Net", "CTRL_Net",
             "MM_Port_EMS", "MM_Port_CTRL", "MM_Port_EXTERMEDIA",
             "CM_Port_CTRL", "CM_Port_INTERMEDIA",
             "DM_Port_CTRL", "DM_Port_INTERMEDIA",
             "LB_Port_INTERMEDIA", "LB_Port_EXTERMEDIA", "LB_Port_CTRL"])

        node_list = sorted([node.name for node in self.tosca.nodetemplates])
        self.assertEqual(node_list, expected_node_list)

    def test_output(self):
        expected_output_name = sorted(
            ["private_ip_of_CM", "private_ip_of_DM",
             "private_ip_of_LB", "private_ip_of_MM"])

        output_list = sorted([output.name for output in self.tosca.outputs])
        self.assertEqual(output_list, expected_output_name)
