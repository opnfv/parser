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
BASE_WORK_DIR=$(cd $(dirname $0) && pwd)

OPNFV_REPO_DIR=${1:-""}

# start syslog for loghander
service rsyslog restart && echo "syslog start successfully"

# install requirements for parser
if [ -n "${OPNFV_REPO_DIR}" ]; then
    echo " OPNFV repository directory is ${OPNFV_REPO_DIR}"
    pip install -r ${OPNFV_REPO_DIR}/parser/tosca2heat/tosca-parser/requirements.txt
    pip install -r ${OPNFV_REPO_DIR}/parser/tosca2heat/heat-translator/requirements.txt
else
    echo "No input for OPNFV repository directory, will use local directory"
    pip install -r ${BASE_WORK_DIR}/../tosca2heat/tosca-parser/requirements.txt
    pip install -r ${BASE_WORK_DIR}/../tosca2heat/heat-translator/requirements.txt
fi

# uninstall other tosca-parser and heat-translator for parser
pip uninstall -y tosca-parser
pip uninstall -y heat-translator

# install parser
if [ -n "${OPNFV_REPO_DIR}" ]; then
    cd ${OPNFV_REPO_DIR}/parser/tosca2heat/heat-translator && python setup.py install
    cd ${OPNFV_REPO_DIR}/parser/tosca2heat/tosca-parser && python setup.py install
else
    cd ${BASE_WORK_DIR}/../tosca2heat/heat-translator && python setup.py install
    cd ${BASE_WORK_DIR}/../tosca2heat/tosca-parser && python setup.py install
fi