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
import re


class add_type(Command):

    "Add policy type in a tosca file"
    log = logging.getLogger(__name__)

    def get_parser(self, prog_name):
        parser = super(add_type, self).get_parser(prog_name)
        parser.add_argument('--policy_type', dest='policy_type', nargs='?',
                            help='add policy type')
        parser.add_argument('--derived_from', dest='derived_from', nargs='?',
                            help='policy dervied from')
        parser.add_argument('--version_number', dest='version_number',
                            nargs='?', help='version number of the policy')
        parser.add_argument('--targets', dest='targets', nargs='+',
                            help='specify N number of targets')
        parser.add_argument('--metadata', dest='metadata', nargs='?',
                            help='metadata')
        parser.add_argument('--description', dest='description', nargs='?',
                            help='metadata')
        parser.add_argument('--properties', dest='properties', nargs='+',
                            help='properties')
        parser.add_argument('--triggers', dest='triggers', nargs='+',
                            help='triggers')
        parser.add_argument('--source', dest='source', nargs='?',
                            help='source tosca yaml file')
        return parser

    def take_action(self, parsed_args):
        inputfile = open(parsed_args.source, 'r').readlines()
        policy_block = 0
        for line in inputfile:
            if re.search('policy_types:', line):
                print "policy block exists"
                policy_block = 1
        if policy_block == 0:
            self.insert_policy_block(parsed_args)
            policy_block = 1
        policy_exists = self.check_policy(parsed_args)
        if policy_exists == 0:
            self.insert_policy(parsed_args)

    def insert_policy_block(self, parsed_args):
        inputfile = open(parsed_args.source, 'r').readlines()
        filename = parsed_args.source + "_temp"
        filehandle = open(filename, 'w')
        for line in inputfile:
            filehandle.write(line)
            if re.search('topology_template:', line):
                print "Inserting policy block"
                filehandle.write("\tpolicy_types:\n")

        filehandle.close()
        filehandles = open(parsed_args.source, "w")
        filename = parsed_args.source + "_temp"
        filehandle = open(filename, 'r')
        lines = filehandle.readlines()
        for line in lines:
            filehandles.write(line)
        os.system('rm '+filename)

    def check_policy(self, parsed_args):
        policy_name = parsed_args.policy_type + ":$"
        inputfile = open(parsed_args.source, 'r').readlines()
        policy_exists = 0
        for line in inputfile:
            if re.search(policy_name, line):
                print "policy type exists"
                policy_exists = 1
                break
        return policy_exists

    def insert_policy(self, parsed_args):
        inputfile = open(parsed_args.source, 'r').readlines()
        filename = parsed_args.source + "_temp"
        filehandle = open(filename, 'w')
        for line in inputfile:
            filehandle.write(line)
            if re.search('policy_types:', line):
                print "Inserting policy type"
                filehandle.write("\t  "+str(parsed_args.policy_type) + ":\n")
                filehandle.write("\t    derived_from: "
                                 + str(parsed_args.derived_from) + "\n")
                filehandle.write("\t    version: " +
                                 str(parsed_args.version_number) + "\n")
                filehandle.write("\t    description: " +
                                 str(parsed_args.description) + "\n")
                filehandle.write("\t    metadata: \n\t        " +
                                 str(parsed_args.metadata) + "\n")
                filehandle.write("\t    properties: \n\t        " +
                                 str(parsed_args.properties) + "\n")
                filehandle.write("\t    targets:\n\t        " +
                                 str(parsed_args.targets) + "\n")
                filehandle.write("\t    triggers: \n\t        " +
                                 str(parsed_args.triggers) + "\n")
        filehandle.close()
        filehandles = open(parsed_args.source, "w")
        filehandle = open(filename, 'r')
        lines = filehandle.readlines()
        for line in lines:
            filehandles.write(line)
        os.system('rm ' + filename)
