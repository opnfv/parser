.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0


This document provides the release notes for <Danube Release> of <Parser>.

.. contents::
   :depth: 3
   :local:


Version history
---------------

+--------------------+--------------------+--------------------+--------------------+
| **Date**           | **Ver.**           | **Author**         | **Comment**        |
|                    |                    |                    |                    |
+--------------------+--------------------+--------------------+--------------------+
| 2017-03-06         | 1.0                | Howard Huang       | Danube Release     |
|                    |                    |                    |                    |
+--------------------+--------------------+--------------------+--------------------+
|                    |                    |                    |                    |
|                    |                    |                    |                    |
+--------------------+--------------------+--------------------+--------------------+
|                    |                    |                    |                    |
|                    |                    |                    |                    |
+--------------------+--------------------+--------------------+--------------------+

Important notes
===============

**Attention**: Parser's submodules should be installed independantly from OPNFV platform, for
instructions please refer to the installation documention.


Summary
=======

OPNFV Parser Danube release has provides four submodules to serve as translation/prevalidation
tools: tosca2heat, yang2tosca, policy2tosca, and verigraph. Specifically, tosca2heat module
provides an integration of OpenStack tosca-parser and heat-translater
upstream projects 0.7 release with additional Parser unique features.


Release Data
============


+--------------------------------------+--------------------------------------+
| **Project**                          | OPNFV Parser                         |
+--------------------------------------+--------------------------------------+
| **Repo/commit-ID**                   |                                      |
+--------------------------------------+--------------------------------------+
| **Release designation**              | Danube 1.0                           |
+--------------------------------------+--------------------------------------+
| **Release date**                     | E.g. 2015-04-16                      |
+--------------------------------------+--------------------------------------+
| **Purpose of the delivery**          | OPNFV Template Translation/Prevalida-|
|                                      | tion tooling                         |
+--------------------------------------+--------------------------------------+

Version change
^^^^^^^^^^^^^^^^

Module version changes
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

- OpenStack tosca-parser and heat-translator have changed from 0.6 to 0.7

- new verigraph module

- no feature changes in yang2tosca and policy2tosca since Colorado Release.

Document version changes
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

- Parser Dabube Release documentation has adoped a new format.

Reason for version
^^^^^^^^^^^^^^^^^^^^
Feature additions
~~~~~~~~~~~~~~~~~~~~~~~
<STATE ADDED FEATURES BY REFERENCE TO JIRA>

<EXAMPLE>:

**JIRA BACK-LOG:**

+--------------------------------------+--------------------------------------+
| **JIRA REFERENCE**                   | **SLOGAN**                           |
|                                      |                                      |
+--------------------------------------+--------------------------------------+
|                                      |                                      |
+--------------------------------------+--------------------------------------+
|                                      |                                      |
+--------------------------------------+--------------------------------------+
| PARSER-111                           | Verigraph Code Base                  |
|                                      |                                      |
+--------------------------------------+--------------------------------------+


Bug corrections
~~~~~~~~~~~~~~~~~~~~~

**JIRA TICKETS:**

+--------------------------------------+--------------------------------------+
| **JIRA REFERENCE**                   | **SLOGAN**                           |
|                                      |                                      |
+--------------------------------------+--------------------------------------+
|                                      |                                      |
+--------------------------------------+--------------------------------------+
|                                      |                                      |
+--------------------------------------+--------------------------------------+

Deliverables
------------

Software deliverables
^^^^^^^^^^^^^^^^^^^^^

- tosca2heat
- yang2tosca
- policy2tosca
- verigraph

Documentation deliverables
^^^^^^^^^^^^^^^^^^^^^^^^^^

- release document
- design document
- development document
- testing document


Known Limitations, Issues and Workarounds
=========================================

System Limitations
^^^^^^^^^^^^^^^^^^




Known issues
^^^^^^^^^^^^


**JIRA TICKETS:**

+--------------------------------------+--------------------------------------+
| **JIRA REFERENCE**                   | **SLOGAN**                           |
|                                      |                                      |
+--------------------------------------+--------------------------------------+
|                                      |                                      |
+--------------------------------------+--------------------------------------+
|                                      |                                      |
+--------------------------------------+--------------------------------------+

Workarounds
^^^^^^^^^^^

<STATE ALL KNOWN WORKAROUNDS TO THE ISSUES STATED ABOVE>

<EXAMPLE>:

- In case the contact with a compute is lost - restart the compute host
- In case the disk is full on a controller - delete all files in /tmp

Test Result
===========
<STATE THE QA COVERAGE AND RESULTS>

<EXAMPLE>:

Fuel@OPNFV Arno RC2 has undergone QA test runs with the following results:

+--------------------------------------+--------------------------------------+
| **TEST-SUITE**                       | **Results:**                         |
|                                      |                                      |
+--------------------------------------+--------------------------------------+
|                                      |                                      |
+--------------------------------------+--------------------------------------+
|                                      |                                      |
+--------------------------------------+--------------------------------------+

References
==========


For more information on the OPNFV Danube release, please see:

http://opnfv.org/danube
