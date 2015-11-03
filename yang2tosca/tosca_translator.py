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

import os
import sys
import getopt
import argparse
from lxml import etree


def tosca_translator(file_name):
    if os.path.exists(file_name):
        var = file_name
        file_format = var.split('.')
        if len(file_format) == 2:
            if file_format[1] == 'yaml' or file_format[1] == 'yang':
                print("Its a yaml file")
                os.system('pyang -f yin '+var + ' -o ' + file_format[0]+'.xml')
            elif file_format[1] == 'xml':
                print ("Its a "+file_format[1]+" file")

            else:
                print ("File format not supported exiting script.")
                exit()
        else:
            print ("File format not supported exiting script.")
            exit()
        tree = etree.parse(file_format[0]+'.xml')

        doc = tree.getroot()

        xslt_root = etree.parse('tosca_transformer.xslt')

        transform = etree.XSLT(xslt_root)

        result_tree = transform(doc)
        output_file = file_format[0]+'_tosca.yaml'

        f = open(output_file, "w")
        f.write(str(result_tree))
        f.close()
        print ("TOSCA file generated with name "+output_file)
    else:
        print ("File does not exist, exiting the script")
        exit()
if __name__ == '__main__':
    parser = argparse.ArgumentParser(add_help=True)
    parser.add_argument('-n', '--filename', dest='filename', required=True,
                        help='Please enter the YANG file name: ')
    args = parser.parse_args()
    file_name = str(args.filename)
    tosca_translator(file_name)
