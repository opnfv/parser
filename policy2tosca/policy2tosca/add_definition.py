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
import re
from cliff.command import Command
from cliff.show import ShowOne


class add_definition(Command):
    "Add policy definition in a tosca file"

    log = logging.getLogger(__name__)

    def get_parser(self, prog_name):
        parser = super(add_definition, self).get_parser(prog_name)
        parser.add_argument('--policy_name', dest='policy_name', required=True,
                            help='add policy name')
        parser.add_argument('--policy_type', dest='policy_type', required=True,
                            help='belongs to policy type')
        parser.add_argument('--targets', dest='targets', nargs='+',
                            help='specify N number of targets')
        parser.add_argument('--metadata', dest='metadata', nargs='?',
                            help='metadata')
        parser.add_argument('--description', dest='description', nargs='?',
                            help='description')
        parser.add_argument('--properties', dest='properties', nargs='+',
                            help='properties')
        parser.add_argument('--triggers', dest='triggers', nargs='+',
                            help='triggers')
        parser.add_argument('--source', dest='source', nargs='?',
                            help='source tosca yaml file')
        return parser

    def take_action(self, parsed_args):
        inputfile = open(parsed_args.source, 'r').readlines()
        policy_def = 0
        policy_type = 0
        policy_type = self.check_policy_type(parsed_args)
        policy_def = self.check_definition(parsed_args)
        if policy_def == 0 and policy_type == 0:
            self.insert_policy_def(parsed_args)

    def check_definition(self, parsed_args):
        filename = parsed_args.source
        filehandler = open(filename, "r")
        lines = filehandler.readlines()
        policy_def = 0
        policy_name = "    - " + str(parsed_args.policy_name) + ":"
        for line in lines:
            if policy_name in line:
                print "policy definition exists"
                policy_def = 1
                break
        return policy_def

    def insert_policy_def(self, parsed_args):
        filename = parsed_args.source
        filehandle = open(filename, "a")
        print "Adding Definition"
        filehandle.write("    - " + str(parsed_args.policy_name) + ":\n")
        filehandle.write("        type: " + str(parsed_args.policy_type)
                         + "\n")
        filehandle.write("        description: " + str(parsed_args.description)
                         + "\n")
        filehandle.write("        metadata: \n          "
                         + str(parsed_args.metadata) + "\n")
        filehandle.write("        properties: \n          "
                         + str(parsed_args.properties) + "\n")
        filehandle.write("        targets:\n          "
                         + str(parsed_args.targets) + "\n")
        filehandle.write("        triggers: \n          "
                         + str(parsed_args.triggers) + "\n")

    def check_policy_type(self, parsed_args):
        policy_name = parsed_args.policy_type + ":$"
        inputfile = open(parsed_args.source, 'r').readlines()
        policy_exists = 0
        for line in inputfile:
            if re.search(policy_name, line):
                print "policy type exists"
                policy_exists = 1
                break
        return policy_exists
