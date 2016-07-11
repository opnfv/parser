=================
 Running demoapp
=================

Pre-requisite
-------------

Install cliff with the following links.

http://docs.openstack.org/developer/cliff/install.html
                   or
http://docs.openstack.org/developer/cliff/demoapp.html

Setup
-----

First, you need to create a virtual environment.

Next, install ``cliff`` in the environment.

::

  $ python setup.py install

Now, install the demo application into the virtual environment.

::

  $ cd demoapp
  $ python setup.py install

Usage
-----

To see a list of commands available, run::

  $ policy2tosca --help


To see help for an individual command, include the command name on the
command line::

  $ policy2tosca add_type --help

