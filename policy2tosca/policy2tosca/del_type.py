# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
# implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import logging
import os
from cliff.command import Command
from cliff.show import ShowOne
import yaml
import json


class Delete_type(Command):
    "Delete policy type in a tosca file"

    log = logging.getLogger(__name__)

    def get_parser(self, prog_name):
        parser = super(Delete_type, self).get_parser(prog_name)
        parser.add_argument('--policy_type', dest='policy_type', nargs='?',
                            help='delete policy type')
        parser.add_argument('--source', dest='source', nargs='?',
                            help='source tosca yaml file')
        return parser

    def take_action(self, parsed_args):
        yml = open(parsed_args.source, "r")
        #lines=filehandle.readlines()
        data = yaml.load(yml)
        json_dump = json.dumps(data)
        #print json_dump
        tosca_json = json.loads(json_dump)
        del tosca_json['topology_template']['policy_types'][parsed_args.policy_type]
        tosca = json.dumps(tosca_json)
        data2 = json.loads(tosca)
        yml2 = yaml.safe_dump(data2, default_flow_style=False)
        tosca_file = open(parsed_args.source, "w")
        tosca_file.write(yml2)
