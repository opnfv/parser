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
import yaml
import json


class Add_definition(Command):
    "Add policy definition in a tosca file"

    log = logging.getLogger(__name__)

    def get_parser(self, prog_name):
        parser = super(Add_definition, self).get_parser(prog_name)
        parser.add_argument('--policy_name', dest='policy_name', required=True,
                            help='add policy name')
        parser.add_argument('--policy_type', dest='policy_type', required=True,
                            help='belongs to policy type')
        parser.add_argument('--targets', dest='targets', nargs='*',
                            help='specify N number of targets')
        parser.add_argument('--metadata', dest='metadata', nargs='?',
                            help='metadata')
        parser.add_argument('--description', dest='description', nargs='?',
                            help='description')
        parser.add_argument('--properties', dest='properties', nargs='+',
                            help='properties')
        parser.add_argument('--triggers', dest='triggers', nargs='*',
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
        return policy_def

    def insert_policy_def(self, parsed_args):
        searchline = '  policies:\n'
        f = open(parsed_args.source, "r")
        lines = f.readlines()
        num = lines.index(searchline)
        string = lines[num + 1]
        leading_spaces = len(string) - len(string.lstrip())
        policy_name = "- " + str(parsed_args.policy_name) + ":"
        properties = parsed_args.properties[0]
        prop_str = self.make_list(properties,leading_spaces)
        if (parsed_args.triggers and parsed_args.targets):
            policy = "".join((leading_spaces * " ") + policy_name  + "\n"
            + "".join((leading_spaces * " ")) + "  type: "
            + str(parsed_args.policy_type) + "\n"  + "".join((leading_spaces * " "))
            + "  description: " + str(parsed_args.description) + "\n"
            + "".join((leading_spaces * " ")) + "  metadata: " + str(parsed_args.metadata) + "\n"
            + "".join((leading_spaces * " ")) + "  properties: \n" + "".join((leading_spaces * 2 * " ")) + prop_str
            + "targets: " + str(parsed_args.targets) + "\n"
            + "".join((leading_spaces * " ")) + "  triggers: " + str(parsed_args.triggers) + "\n"
            )
        elif (parsed_args.triggers):
            policy = "".join((leading_spaces * " ") + policy_name  + "\n"
            + "".join((leading_spaces * " ")) + "  type: "
            + str(parsed_args.policy_type) + "\n"  + "".join((leading_spaces * " "))
            + "  description: " + str(parsed_args.description) + "\n"
            + "".join((leading_spaces * " ")) + "  metadata: " + str(parsed_args.metadata) + "\n"
            + "".join((leading_spaces * " ")) + "  properties: \n" + "".join((leading_spaces * 2 * " ")) + prop_str
            + "".join((leading_spaces * " ")) + "  triggers: " + str(parsed_args.triggers) + "\n"
            )
        elif (parsed_args.targets):
            policy = "".join((leading_spaces * " ") + policy_name  + "\n"
            + "".join((leading_spaces * " ")) + "  type: "
            + str(parsed_args.policy_type) + "\n"  + "".join((leading_spaces * " "))
            + "  description: " + str(parsed_args.description) + "\n"
            + "".join((leading_spaces * " ")) + "  metadata: " + str(parsed_args.metadata) + "\n"
            + "".join((leading_spaces * " ")) + "  properties: \n" + "".join((leading_spaces * 2 * " ")) + prop_str
            + "targets: " + str(parsed_args.targets) + "\n"
            )

        lines.insert(num+1,policy)

        f2 = open(parsed_args.source, "w")
        for line in lines:
            f2.write(line)

    def make_list(self, properties, leading_spaces):
        props = properties.split(",")
        lists = []
        i = 0
        for p in props:
            lables = p.split(":")

            lists.insert(i,lables)
            i = i + 1
        title_list=[]
        i =0
        for l in lists:
            title_list.insert(i,l[0])
            i = i + 1
        prop_title = ""
        len_list = len(lists)
        title_list =  set(title_list)
        final_list = []
        i = 0

        for t in title_list:
            final_str = t + ":"
            for l in lists:
                if t == l[0]:
                    final_str = final_str +  " " + l[1] + ","
            final_str = final_str[:-1]
            final_list.insert(i,final_str)
            i =+ 1

        prop_str = ""
        for f in final_list:
            prop_str = prop_str + f +"\n" + "".join((leading_spaces * 2 *" "))
        return prop_str[:-1]

    def check_policy_type(self, parsed_args):
        policy_type = parsed_args.policy_type + ":$"
        inputfile = open(parsed_args.source, 'r').readlines()
        policy_exists = 0
        for line in inputfile:
            if re.search(policy_type, line):
                print "policy type exists"
                policy_exists = 1
                break
        return policy_exists
