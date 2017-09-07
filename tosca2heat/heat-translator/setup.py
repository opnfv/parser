# Copyright (c) 2013 Hewlett-Packard Development Company, L.P.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
# implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# THIS FILE IS MANAGED BY THE GLOBAL REQUIREMENTS REPO - DO NOT EDIT
import os
import setuptools

from distutils.command.install_data import install_data
from setuptools.command.build_py import build_py
from setuptools.command.install import install

# In python < 2.7.4, a lazy loading of package `pbr` will break
# setuptools if some other modules registered functions in `atexit`.
# solution from: http://bugs.python.org/issue15881#msg170215
try:
    import multiprocessing  # noqa
except ImportError:
    pass


class HeatTranslator_build_py(build_py):
    """Override build_py to call customized build."""

    def run(self):
        print(" ===  Before nfv heat translator build === ")
        # self.run_command('xxx')
        super(HeatTranslator_build_py, self).run()
        print(" ===  After nfv heat heat translator build === ")


class HeatTranslator_install(install):
    """Override install to call customized install."""

    def run(self):
        print(" ===  Before nfv heat translator install === ")
        # Make sure uninstall toscaparser from openstack
        os.system("pip uninstall -y heat-translator")

        super(HeatTranslator_install, self).run(self)
        # Custom stuff here
        # distutils.command.install actually has some nice helper methods
        # and interfaces. I strongly suggest reading the docstrings.
        print(" === After nfv heat translator install === ")


class HeatTranslator_post_install(install_data):
    """Override install_data to call customized install_data."""

    def run(self):
        print(" === Before nfv heat translator post install data === ")
        # Call parent
        super(HeatTranslator_post_install, self).run(self)
        # Execute commands
        print(" === After nfv heat translator post install data ===")


setuptools.setup(
    setup_requires=['pbr>=2.0.0'],
    cmdclass={
        "build_py": HeatTranslator_build_py,
        "install_data": HeatTranslator_install,
        "post_install": HeatTranslator_post_install,
    },
    pbr=True)
