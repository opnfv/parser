import logging
import os
from cliff.command import Command
from cliff.show import ShowOne
import yaml
import json

class delete_type(Command):
    "Delete policy type in a tosca file"

    log = logging.getLogger(__name__)

    def get_parser(self, prog_name):
        parser = super(delete_type, self).get_parser(prog_name)
        parser.add_argument('--policy_type',dest='policy_type', nargs='?', help='delete policy type')
        parser.add_argument('--source',dest='source',nargs='?',help='source tosca yaml file')
        return parser

    def take_action(self, parsed_args):
	yml=open(parsed_args.source,"r")
        #lines=filehandle.readlines()
        data = yaml.load(yml)
        json_dump = json.dumps(data)
        info = json.load(json_dump)
        #print json_cump[0] 
        print(info[0])

        """filehandle=open(parsed_args.filename,"r")
	lines=filehandle.readlines()
	text="policies"
	for i, line in enumerate(lines):
	    if text in line:
        	 ln=i-1
		 break
	data_list=lines[ln+1:]
	for line in lines:
		if line.startswith("-"):
			

	fout = open("list2.txt", "w")
	fout.writelines(data_list)
	fout.close()
	filehandle.close()
	print "Policy types deleted"	"""
