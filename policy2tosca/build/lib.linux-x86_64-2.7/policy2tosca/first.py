import logging
import os
#import argparse
import subprocess
from cliff.command import Command

class first(Command):
    "Show details about a first command"

    log = logging.getLogger(__name__)

    def get_parser(self, prog_name):
        #parser = argparse.ArgumentParser()
        parser = super(first, self).get_parser(prog_name)
        parser.add_argument('--type',dest = 'input_type', required=True, type=str, help='Please enter the specific type. Ex: heat')
        return parser

    def take_action(self, parsed_args):
        print ("The selected type is " + parsed_args.input_type)
        if parsed_args.input_type == 'heat':
            proc = subprocess.Popen(['ssh opnfv:opnfv@192.168.174.137'],shell=True,stdin=subprocess.PIPE,stdout=subprocess.PIPE,)
            stdout_value = proc.communicate()[0]
            print ('\tstdout:', repr(stdout_value))
        elif parsed_args.input_type == 'tosca' :
            print ('Selected type in tosca')
