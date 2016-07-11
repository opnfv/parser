import logging
import os

from cliff.show import ShowOne


class delete-type():
    "Show details about a file"

    log = logging.getLogger(__name__)

    def get_parser(self, prog_name):
        parser = super(File, self).get_parser(prog_name)
        parser.add_argument('filename', nargs='?', default='.')
        return parser

    def take_action(self, parsed_args):
	filehandle=parsed_args
	text=" policy"
	for i, line in enumerate(filehandle, 1):
	    if text in line:
        	 ln=line
	
        return (ln)
