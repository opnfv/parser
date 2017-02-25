#!/usr/bin/python

##############################################################################
# Copyright (c) 2017 Politecnico di Torino and others.
#
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Apache License, Version 2.0
# which accompanies this distribution, and is available at
# http://www.apache.org/licenses/LICENSE-2.0
##############################################################################

import sys, string

class CodeGeneratorBackend:

    def begin(self, tab="\t"):
        self.code = []
        self.tab = tab
        self.level = 0

    def end(self):
        return string.join(self.code, "")

    def write(self, string):
        self.code.append(self.tab * self.level + string)

    def writeln(self, string):
        self.code.append(self.tab * self.level + string + "\n")
        
    def append(self, string):
        self.code.append(string)

    def indent(self):
        self.level = self.level + 1

    def dedent(self):
        if self.level == 0:
            raise SyntaxError, "internal error in code generator"
        self.level = self.level - 1

    def write_list(self, data, delimiter=True, wrapper="'"):
        if delimiter == True:
            self.code.append("{")
        first = True
        for element in data:
            if (first == False):
                self.code.append(", ")
            else:
                first = False
            if wrapper == "'":
                self.code.append("'" + str(element) + "'")
            elif wrapper == "\"":
                self.code.append("\"" + str(element) + "\"")
            elif wrapper == "b":
                self.code.append("(" + str(element) + ")")
            else:
                self.code.append(str(element))
        if delimiter == True:
            self.code.append("}")
