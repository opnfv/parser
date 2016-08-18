.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0
.. (c) <optionally add copywriters name>

Test use tox
===========================
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

