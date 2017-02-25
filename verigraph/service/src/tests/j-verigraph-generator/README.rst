.. This work is licensed under a Creative Commons Attribution 4.0 International License.
.. http://creativecommons.org/licenses/by/4.0

CODE\_GENERATOR Java serializer and formatter

UTILITY Contains utility methods used by other modules

JSON\_GENERATOR Interactive module to generate the configuration files
(default names are "chains.json" and "config.json") "chains.json"
describes all the chains of nodes belonging to a certain scenario

TEST\_CLASS\_GENERATOR Generates one or multiple test scenarios given
the two configuration files above (default names are "chains.json" and
"config.json") All the test scenarios have to be placed in the examples
folder (i. e. under "j-verigraph/service/src/tests/examples"). Here is
the script help:

test\_class\_generator.py -c -f -o

Supposing the module gets executed from the project root directory (i.e.
"j-verigraph"), a sample command is the following:

service/src/tests/j-verigraph-generator/test\_class\_generator.py -c
"service/src/tests/j-verigraph-generator/examples/budapest/chains.json"
-f
"service/src/tests/j-verigraph-generator/examples/budapest/config.json"
-o "service/src/tests/examples/Scenario"

Keep in mind that in the previous command "Scenario" represents a prefix
which will be followed by an underscore and an incremental number
starting from 1, which represents the n-th scenario starting from the
previously mentioned "chains.json" file (this file can indeed contain
multiple chains).

TEST\_GENERATOR Generates a file which performs the verification test
through Z3 (theorem prover from Microsoft Research) given a certain
scenario generated with the above snippet. All the test modules have to
be placed under the "tests" directory (i.e. under
"j-verigraph/service/src/tests"). Here is the module help:

test\_generator.py -i -o -s -d

Supposing the module gets executed from the project root directory (i.e.
"j-verigraph") a sample command given the previously generated scenario
is the following:

service/src/tests/j-verigraph-generator/test\_generator.py -i
service/src/tests/examples/Scenario\_1.java -o
service/src/tests/Test.java -s user1 -d webserver

The aforementioned "Test.java" file can be compiled and executed
normally. Its output will be either "SAT" or "UNSAT". For possible
statistics the test is repeated 10 times and the average execution time
in seconds is printed to the console.
