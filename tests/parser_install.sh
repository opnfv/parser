#!/bin/bash -e
##############################################################################
# Copyright (c) 2016 ZTE Corporation.
#
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Apache License, Version 2.0
# which accompanies this distribution, and is available at
# http://www.apache.org/licenses/LICENSE-2.0
##############################################################################

set +e

parser_repos_dir=$1

# start syslog for loghander
service rsyslog restart && echo "syslog start successfully"

# install requirements for parser
pip install -r ${parser_repos_dir}/parser/tosca2heat/tosca-parser/requirements.txt
pip install -r ${parser_repos_dir}/parser/tosca2heat/heat-translator/requirements.txt

# uninstall other tosca-parser and heat-translator for parser
pip uninstall -y tosca-parser
pip uninstall -y heat-translator

# install parser
cd ${parser_repos_dir}/parser/tosca2heat/tosca-parser && python setup.py install
cd ${parser_repos_dir}/parser/tosca2heat/heat-translator && python setup.py install
