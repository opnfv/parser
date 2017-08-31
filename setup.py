import os
import setuptools

from distutils.command.install_data import install_data
from setuptools.command.build_py import build_py
from setuptools.command.install import install

try:
    import multiprocessing  # noqa
except ImportError:
    pass


class Parser_build_py(build_py):
    """Override build_py to call customized build."""

    def run(self):
        print(" ===  Before nfv parser build === ")
        # self.run_command('xxx')
        super(Parser_build_py, self).run()
        print(" ===  After nfv parser build === ")


class Parser_install(install):
    """Override install to call customized install."""

    def run(self):
        print(" ===  Before nfv parser install === ")
        super(Parser_install, self).run(self)
        # Custom stuff here
        # distutils.command.install actually has some nice helper methods
        # and interfaces. I strongly suggest reading the docstrings.
        print(" === After nfv parser install === ")


class Parser_post_install(install_data):
    """Override install_data to call customized install_data."""

    def run(self):
        print(" === Before nfv parser post install data === ")
        # Call parent
        super(Parser_post_install, self).run(self)
        # Execute commands
        print(" === After nfv parser post install data ===")


setuptools.setup(
    setup_requires=['pbr>=2.0.0'],
    cmdclass={
        "build_py": Parser_build_py,
        "install_data": Parser_install,
        "post_install": Parser_post_install,
    },
    pbr=True)
