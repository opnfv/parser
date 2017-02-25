#!/usr/bin/python

##############################################################################
# Copyright (c) 2017 Politecnico di Torino and others.
#
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Apache License, Version 2.0
# which accompanies this distribution, and is available at
# http://www.apache.org/licenses/LICENSE-2.0
##############################################################################

devices_to_classes = {  "webclient" : "PolitoWebClient",
                        "webserver" : "PolitoWebServer",
                        "cache" : "PolitoCache",
                        "nat" : "PolitoNat",
                        "firewall" : "AclFirewall",
                        "mailclient" : "PolitoMailClient",
                        "mailserver" : "PolitoMailServer",
                        "antispam" : "PolitoAntispam",
                        "endpoint": "EndHost",
                        "dpi": "PolitoIDS",
                        "endhost": "PolitoEndHost",
                        "vpnaccess":"PolitoVpnAccess",
                        "vpnexit":"PolitoVpnExit",
                        "fieldmodifier":"PolitoFieldModifier"
                     }
devices_to_configuration_methods = {"webclient" : "",
                                    "webserver" : "",
                                    "cache" : "installCache",
                                    "nat" : "setInternalAddress",
                                    "firewall" : "addAcls",
                                    "mailclient" : "",
                                    "mailserver" : "",
                                    "antispam" : "",
                                    "endpoint": "",
                                    "dpi": "installIDS",
                                    "endhost": "installEndHost",
                                    "vpnaccess":"vpnAccessModel",
                                    "vpnexit":"vpnAccessModel",
                                    "fieldmodifier":"installFieldModifier"
                                    }
devices_initialization = {  "webclient" : ["webserver"],
                            "webserver" : [],
                            "cache" : [],
                            "nat" : [],
                            "firewall" : [],
                            "mailclient" : ["mailserver"],
                            "mailserver" : [],
                            "antispam" : [],
                            "endpoint": [],
                            "dpi":[] ,
                            "endhost":[],
                            "vpnaccess":[],
                            "vpnexit":[],
                            "fieldmodifier":[]                        
                          }

convert_configuration_property_to_ip = {    "webclient" : ["value"],
                                            "webserver" : [],
                                            "cache" : ["value"],
                                            "nat" : ["value"],
                                            "firewall" : ["key", "value"],
                                            "mailclient" : ["value"],
                                            "mailserver" : [],
                                            "antispam" : [],
                                            "endpoint": [],
                                            "dpi": [],
                                            "endhost": [],
                                            "vpnaccess": ["value"],
                                            "vpnexit": ["value"],
                                            "fieldmodifier": []
                                        }

devices_configuration_fields = {    "webclient" : "",
                                    "webserver" : "",
                                    "cache" : "cached address",
                                    "nat" : "natted address",
                                    "firewall" : "acl entry",
                                    "mailclient" : "",
                                    "mailserver" : "",
                                    "antispam" : "",
                                    "endpoint": "",
                                    "dpi":"words blacklist",
                                    "endhost":"",
                                    "vpnaccess":"vpn access",
                                    "vpnexit":"vpn exit",
                                    "fieldmodifier":"field modifier"
                                 }
