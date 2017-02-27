.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0


Parser general configuration
=====================
Parser can be configured with any installer in current OPNFV.

Pre-configuration activities
-----------------------------
For parser, there is not specific pre-configuration activities.

Hardware configuration
-----------------------
For parser, there is not hardware configuration needed for this specific installer.

Jumphost configuration
-----------------------
For parser, there is not intial Jumphost configuration (network and software)needed in order
to deploy any installer.


Parser tosca2heat configuration
=====================
For tosca2heat components(tosca-parser and heat-translator) in parser,there are not specific
configuration of each component in installer.


Parser yang2tosca configuration
=====================
Parser yang2tosca requires the following to be installed.

1. PYANG
--------

Please follow the below installation steps.

Step 1: Clone pyang tool or download the zip file from the following link.

.. code-block:: bash

    git clone https://github.com/mbj4668/pyang.git

OR

.. code-block:: bash

    wget https://github.com/mbj4668/pyang/archive/master.zip

Step 2: Change directory to the downloaded directory and run the setup file.

.. code-block:: bash

    cd pyang
    python setup.py

2. python-lxml
--------------

Please follow the below installation link. http://lxml.de/installation.html


Parser policy2tosca configuration
============================
Parser - POLICY2TOSCA requires the following to be installed.

1. cliff
--------

Install cliff with the following links.
::
- `install <http://docs.openstack.org/developer/cliff/install.html>`
or
- `demoapp <http://docs.openstack.org/developer/cliff/demoapp.html>


