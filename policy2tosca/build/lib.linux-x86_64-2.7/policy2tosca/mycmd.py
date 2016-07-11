import logging
import os
import subprocess
from cliff.command import Command
class polm_sam(Command):
    """my sample code.
    """

    def take_action(self, parsed_args):
        print ('\nread:')
        proc = subprocess.Popen(['/root/polm/sample_shell.sh'],shell=True,stdin=subprocess.PIPE,stdout=subprocess.PIPE,)
        stdout_value = proc.communicate()[0]
        print ('\tstdout:', repr(stdout_value))


