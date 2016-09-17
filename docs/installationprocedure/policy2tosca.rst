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

Prerequisites
=============

Parser - POLICY2TOSCA requires the following to be installed.

1. cliff
--------

Install cliff with the following links.
::
- `install <http://docs.openstack.org/developer/cliff/install.html>`
or
- `demoapp <http://docs.openstack.org/developer/cliff/demoapp.html>`

Installation
============================

Please follow the below installation steps to install parser - POLICY2TOSCA.

Step 1: Clone the parser project.

.. code-block:: bash

    git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Install the policy2tosca module.

.. code-block:: bash

    cd parser/policy2tosca
    python setup.py install
