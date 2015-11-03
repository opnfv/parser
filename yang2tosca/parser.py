# (c) Copyright [2015] Hewlett-Packard Development Company, L.P.;
#
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

import os,sys
from lxml import etree


var = raw_input("Please enter the YANG file name: ")
lines=var.split('.')
 
if lines[1] == 'yaml' or lines[1] == 'yang':
    print"Its a yaml file"
    os.system('pyang -f yin '+var + ' -o ' + lines[0]+'.xml')
else:
    print "Its a "+lines[1]+" file"
tree = etree.parse(lines[0]+'.xml')

doc = tree.getroot()

#os.system('rm .'+lines[0]+'.xml.swap 2>/home/NULL')
xslt_root = etree.parse('tosca_transformer.xslt')

transform = etree.XSLT(xslt_root)

result_tree = transform(doc)
#print result_tree
output_file=lines[0]+'_tosca.yaml'

f= open(output_file,"w")
f.write(str(result_tree))
f.close()
print "TOSCA file generated with name "+output_file
os.system('rm '+lines[0]+'.xml') 
