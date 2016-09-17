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

Step 1: Change directory to where the scripts are present.

.. code-block:: bash

    cd parser/yang2tosca

Step 2: Copy the YANG file which needs to be converted into TOSCA to
        current (parser/yang2tosca) folder.

Step 3: Run the python script "parser.py" with the YANG file as an input option.

.. code-block:: bash

    python parser.py -n "YANG filename"

Example:

.. code-block:: bash

    python parser.py -n example.yaml

Step 4: Verify the TOSCA YAMl which file has been created with the same name
        as the YANG file with a “_tosca” suffix.

.. code-block:: bash

    cat "YANG filename_tosca.yaml"

Example:

.. code-block:: bash

    cat example_tosca.yaml
