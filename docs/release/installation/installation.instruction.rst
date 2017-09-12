.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0


Parser tosca2heat Installation
==============================

Please follow the below installation steps to install tosca2heat submodule in parser.

Step 1: Clone the parser project.

.. code-block:: bash

    git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Install the heat-translator sub project.

.. code-block:: bash

    # uninstall pre-installed tosca-parser
    pip uninstall -y heat-translator

    # change directory to heat-translator
    cd parser/tosca2heat/heat-translator

    # install requirements
    pip install -r requirements.txt

    # install heat-translator
    python setup.py install

Step 3: Install the tosca-parser sub project.

.. code-block:: bash

    # uninstall pre-installed tosca-parser
    pip uninstall -y tosca-parser

    # change directory to tosca-parser
    cd parser/tosca2heat/tosca-parser

    # install requirements
    pip install -r requirements.txt

    # install tosca-parser
    python setup.py install


**Notes**: It must uninstall pre-installed tosca-parser and heat-translator before install the two
components, and install heat-translator before installing tosca-parser, which is sure to use the
OPNFV version of tosca-parser and heat-translator other than openstack's components.


Parser yang2tosca Installation
==============================
Parser yang2tosca requires the following to be installed.

Step 1: Clone the parser project.

.. code-block:: bash

   git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Clone pyang tool or download the zip file from the following link.

.. code-block:: bash

    git clone https://github.com/mbj4668/pyang.git

OR

.. code-block:: bash

    wget https://github.com/mbj4668/pyang/archive/master.zip

Step 3: Change directory to the downloaded directory and run the setup file.

.. code-block:: bash

    cd pyang
    python setup.py

Step 4: install python-lxml
---------------------------

Please follow the below installation link. http://lxml.de/installation.html


Parser policy2tosca installation
================================

Please follow the below installation steps to install parser - POLICY2TOSCA.

Step 1: Clone the parser project.

.. code-block:: bash

   git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Install the policy2tosca module.

.. code-block:: bash

   cd parser/policy2tosca
   python setup.py install


Parser verigraph installation
=============================

In the present release, verigraph requires that the following software is also installed:

- Java 1.8 (with javac compiler)
- Apache Ant 1.9
- Apache Tomcat 8
- Microsoft Z3 (https://github.com/Z3Prover/bin/tree/master/releases)
- Neo4J (https://neo4j.org)

Please follow the below installation steps to install verigraph.

Step 1: Clone the parser project.

.. code-block:: bash

   git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Go to the verigraph directory.

.. code-block:: bash

   cd parser/verigraph

Step3: Set up the execution environment, based on your operating system.

*VeriGraph deployment on Apache Tomcat (Windows)*:

-  set JAVA HOME environment variable to where you installed the jdk
   (e.g. ``C:\Program Files\Java\jdk1.8.XYY``);
-  set CATALINA HOME ambient variable to the directory where you
   installed Apache (e.g.
   ``C:\Program Files\Java\apache-tomcat-8.0.30``);
-  open the file ``%CATALINA_HOME%\conf\tomcat-users.xml`` and under the ``tomcat-users`` tag place,
   initialize an user with roles "tomcat, manager-gui, manager-script". An example is the following
   content: ``xml   <role rolename="tomcat"/>   <role rolename="role1"/>   <user username="tomcat"
   password="tomcat" roles="tomcat,manager-gui"/>   <user username="both" password="tomcat"
   roles="tomcat,role1"/>   <user username="role1" password="tomcat" roles="role1"/>``
-  edit the "to\_be\_defined" fields in tomcat-build.xml with the username and password previously
   configured in Tomcat(e.g. ``name="tomcatUsername" value="tomcat"`` and ``name="tomcatPassword"
   value="tomcat"`` the values set in 'tomcat-users'). Set ``server.location`` property to the
   directory where you installed Apache (e.g. ``C:\Program Files\Java\apache-tomcat-8.0.30``);

*VeriGraph deployment on Apache Tomcat (Unix)*:

- ``sudo nano ~/.bashrc``
-  set a few environment variables by paste the following content at the end of the file
   ``export CATALINA_HOME='/path/to/apache/tomcat/folder'``
   ``export JRE_HOME='/path/to/jdk/folder'``
   ``export JDK_HOME='/path/to/jdk/folder'``
- ``exec bash``
-  open the file ``$CATALINA_HOME\conf\tomcat-users.xml`` and under
   the ``tomcat-users`` tag place, initialize an user with roles
   "tomcat, manager-gui, manager-script". An example is the following content:
   ``xml <role rolename="tomcat"/>   <role rolename="role1"/>   <user username="tomcat"
   password="tomcat" roles="tomcat,manager-gui"/>   <user username="both" password="tomcat"
   roles="tomcat,role1"/>   <user username="role1" password="tomcat" roles="role1"/>``
-  edit the "to\_be\_defined" fields in tomcat-build.xml with the
   username and password previously configured in Tomcat(e.g. ``name="tomcatUsername"
   value="tomcat"`` and ``name="tomcatPassword" value="tomcat"`` the values set in 'tomcat-users').
   Set ``server.location`` property to the directory where you installed Apache
   (e.g. ``C:\Program Files\Java\apache-tomcat-8.0.30``);



Step4a: Deploy Verigraph in Tomcat.

.. code-block:: bash

   ant -f build.xml deployWS

Use the Ant script build.xml to manage Verigraph webservice with the following targets:

-  generate-war: it generates the war file;
-  generate-binding: it generates the JAXB classes from the XML Schema file xml\_components.xsd;
-  start-tomcat : it starts the Apache Tomcat;
-  deployWS: it deploys the verigraph.war file contained in
   verigraph/war folder;
-  startWS: it starts the webservice;
-  run-test: it runs the tests in tester folder. It is possible to
   choose the iterations number for each verification request by
   launching the test with "-Diteration=n run-test" where n is the
   number of iterations you want;
-  stopWS: it stops the webservice;
-  undeployWS: it undeploys the webservice from Apache Tomcat;
-  stop-tomcat: it stops Apache Tomcat.

Step4b: Deploy Verigraph with gRPC interface.

.. code-block:: bash

   ant -f build.xml generate-binding
   ant -f gRPC-build.xml run-server

Use the Ant script gRPC-build.xml to manage Verigraph with the following targets:

- build: compile the program;
- run: run both client and server;
- run-client : run only client;
- run-server : run only server;
- run-test : launch all tests that are present in the package;





Parser apigateway Installation
==============================

In the present release, apigateway requires that the following software is also installed:

 - grpcio (https://github.com/golang/protobuf/protoc-gen-go)

Please follow the below installation steps to install apigateway submodule in parser.

Step 1: Clone the parser project.

.. code-block:: bash

    git clone https://gerrit.opnfv.org/gerrit/parser

Step 2: Install the apigateway submodule.

.. code-block:: bash

    # change directory to apigateway
    cd parser/apigateway

    # install requirements
    pip install -r requirements.txt

    # install apigateway
    python setup.py install

**Notes**: In release D, apigateway submodule is only initial framework code, and more feature will
be provided in the next release.
