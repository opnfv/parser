New Parser keywords
===================

1.NFV-tosca new keywords
------------------------

All keywords in nfv tosca are not implemented in code, and will be
implemented by parser.

1.1 Nodes types
~~~~~~~~~~~~~~~

Basic types
^^^^^^^^^^^

-  tosca.nodes.nfv.VDU
-  tosca.nodes.nfv.CP
-  tosca.nodes.nfv.VL

Extend types
^^^^^^^^^^^^

-  tosca.nodes.nfv.VL.ELine
-  tosca.nodes.nfv.VL.ELAN
-  tosca.nodes.nfv.VL.ETree
-  tosca.nodes.nfv.FP

1.2 Capability types
~~~~~~~~~~~~~~~~~~~~

Basic types
^^^^^^^^^^^

-  tosca.capabilities.nfv.VirtualBindable
-  tosca.capabilities.nfv.VirtualLinkable
-  tosca.capabilities.nfv.HA.ActiveActive
-  tosca.capabilities.nfv.HA.ActivePassive
-  tosca.capabilities.nfv.Metric

Extend types
^^^^^^^^^^^^

-  tosca.capabilities.nfv.Forwarder
-  tosca.capabilities.nfv.CPU\_extension
-  tosca.capabilities.nfv.Memory\_extension
-  tosca.capabilities.nfv.Hypervisors
-  tosca.capabilities.nfv.PCIe
-  tosca.capabilities.nfv.network.Interfaces
-  tosca.capabilities.nfv.network.Virtual\_switches
-  tosca.capabilities.nfv.Storage

1.3 Relationship types
~~~~~~~~~~~~~~~~~~~~~~

Basic types
^^^^^^^^^^^

-  tosca.relationships.nfv.VirtualBindsTo
-  tosca.relationships.nfv.VirtualLinksTo
-  tosca.relationships.nfv.HA
-  tosca.relationships.nfv.Monitor

Extend types
^^^^^^^^^^^^

-  tosca.relationships.nfv.ForwardsTo

1.4 Group Types
~~~~~~~~~~~~~~~

-  tosca.groups.nfv.VNFFG

2.Simple-tosca new keywords
---------------------------

Some keywords are defined in tosca simple profile,but are not
impletmented in code,except policy type, which are not yet defined
completely now.

2.1 topology template keyname
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

-  “substitution\_mappings” syntax

   An optional declaration that exports the topology template as an
   implementation of a Node type, Which is not supported by toscalib.

2.2 Group types
~~~~~~~~~~~~~~~

Basic types
^^^^^^^^^^^

-  tosca.group.root

2.3 Policy Types
~~~~~~~~~~~~~~~~

Basic types
^^^^^^^^^^^

-  tosca.policies.Root
-  tosca.policies.Placement
-  tosca.policies.Scaling

Extend types
^^^^^^^^^^^^

-  tosca.policies.Update
-  tosca.policies.Performance
-  tosca.policy.placement.Antilocate
-  tosca.policy.placement.Colocate

