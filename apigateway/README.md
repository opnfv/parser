
Apigateway
==========
A apigateway of web application for parser sub-projects, such as tosca2heat and policy2tosca.

Building
--------

First you need some dependencies:

.. code-block:: bash

  pip install bindep
  apt-get install $(bindep -b)
  pip install -f requirements.txt
  pip install grpcio-tools
  go get -u github.com/golang/protobuf/protoc-gen-go

Then you can build the code:

.. code-block:: bash

  autoreconf -fi
  ./configure
  make