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

Execution
===========================

Step 1: To see a list of commands available.

.. code-block:: bash

    policy2tosca --help

Step 2: To see help for an individual command, include the command name on the command line

.. code-block:: bash

    policy2tosca help <service>

Step 3: To inject/remove policy types/policy definitions provide the TOSCA file as input to policy2tosca command line.

.. code-block:: bash

    policy2tosca <service> [arguments]

Example:

.. code-block:: bash

    policy2tosca add-definition --policy_name rule2 --policy_type  tosca.policies.Placement.Geolocation --description "test description" --properties region:us-north-1,region:us-north-2,min_inst:2 --targets VNF2,VNF4 --metadata "map of strings" --triggers "1,2,3,4" --source example.yaml


Step 4: Verify the TOSCA YAMl updated with the injection/removal executed.

.. code-block:: bash

    cat "<source tosca file>"

Example:

.. code-block:: bash

    cat example_tosca.yaml
