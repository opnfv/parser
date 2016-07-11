import logging
import os
from cliff.command import Command
from cliff.show import ShowOne

class add_definition(Command):
#class delete_type(ShowOne):
    "Add policy definition in a tosca file"

    log = logging.getLogger(__name__)

    def get_parser(self, prog_name):
        parser = super(add_definition, self).get_parser(prog_name)
        parser.add_argument('--policy_name',dest='policy_name', required=True, help='add policy name')
        parser.add_argument('--policy_type',dest='policy_type', required=True, help='belongs to policy type')
	parser.add_argument('--targets', dest='targets',nargs='+',help='specify N number of targets')
	parser.add_argument('--metadata',dest='metadata',nargs='?',help='metadata')
	parser.add_argument('--description',dest='description',nargs='?',help='description')
	parser.add_argument('--properties',dest='properties',nargs='+',help='properties')
	parser.add_argument('--triggers',dest='triggers',nargs='+',help='triggers')
	parser.add_argument('--source',dest='source',nargs='?',help='source tosca yaml file')
        return parser

    def take_action(self, parsed_args):
	filename = parsed_args.source
	filehandler = open(filename,"r")
	lines = filehandler.readlines()
	filehandle = open(filename,"a")
        policy_name = "    - "+str(parsed_args.policy_name)+":"
	for line in lines:
            if policy_name in line:
                print "policy exists"
                exit()
            else:
                continue
        print "Adding Definition" 
        filehandle.write("    - "+str(parsed_args.policy_name)+":\n")
        filehandle.write("        type: "+str(parsed_args.policy_type)+"\n")
        filehandle.write("        description: "+str(parsed_args.description)+"\n")
        filehandle.write("        metadata: \n          "+str(parsed_args.metadata)+"\n")
        filehandle.write("        properties: \n          "+str(parsed_args.properties)+"\n")
        filehandle.write("        targets:\n          "+str(parsed_args.targets)+"\n" )
        filehandle.write("        triggers: \n          "+str(parsed_args.triggers))
	filehandle.close()
	filehandler.close()
