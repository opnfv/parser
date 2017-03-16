.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0


Parser tosca2heat test usage
============================
1. run tox in tosca-parser sub project

.. code-block:: bash

    # change directory to tosca-parser
    cd parser/tosca2heat/tosca-parser

    # run with pep8
    tox -epep8

    # run unit test
    tox -epy27

or

.. code-block:: bash

    # change directory to tosca-parser
    cd parser/tosca2heat/tosca-parser

    # run tox
    tox


2. run tox in heat-translator sub project

.. code-block:: bash

    # change directory to heat-translator
    cd parser/tosca2heat/heat-translator

    # run with pep8
    tox -epep8

    # run unit test
    tox -epy27
    tox -epy34

or

.. code-block:: bash

    # change directory to heat-translator
    cd parser/tosca2heat/heat-translator

    # run tox
    tox

Parser VeriGraph test usage
===========================

VeriGraph is accessible via both a RESTfull API and a gRPC interface.

**RESTful API**

1. Run the Python tester

.. code-block:: bash

      cd parser/verigraph/tester
      python test.py

**gRPC API**

1. Compile the code

.. code-block:: bash

      cd parser/verigraph
      ant -f buildVeriGraph_gRPC.xml build

2. Run both client and server

.. code-block:: bash

      cd parser/verigraph
      ant -f buildVeriGraph_gRPC.xml run

3. Run only the testing client

.. code-block:: bash

      cd parser/verigraph
      ant -f buildVeriGraph_gRPC.xml run-client

4. Run only the gRPC server

.. code-block:: bash

      cd parser/verigraph
      ant -f buildVeriGraph_gRPC.xml run-server

5. Run all tests and print out the partial results and global result

.. code-block:: bash

      cd parser/verigraph
      # This target has the needed dependencies to compile the code
      # and run both client and server
      ant -f buildVeriGraph_gRPC.xml run-test

Note that the execution of these tests may take up to 1-2 minutes when successful.