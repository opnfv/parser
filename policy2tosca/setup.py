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

#!/usr/bin/env python

PROJECT = 'policy2tosca'

# Change docs/sphinx/conf.py too!
VERSION = '0.1'

from setuptools import setup, find_packages

try:
    long_description = open('README.rst', 'rt').read()
except IOError:
    long_description = ''

setup(
    name=PROJECT,
    version=VERSION,

    description='Parser policy2tosca',
    long_description=long_description,

    author='Shiva Charan M S',
    author_email='shiva-charan.m-s@hpe.com',

    url='',
    download_url='',

    classifiers=['License :: OSI Approved :: Apache Software License',
                 'Programming Language :: Python',
                 'Programming Language :: Python :: 2',
                 'Programming Language :: Python :: 2.7',
                 'Programming Language :: Python :: 3',
                 'Programming Language :: Python :: 3.2',
                 'Intended Audience :: Developers',
                 'Environment :: Console',
                 ],

    platforms=['Any'],

    scripts=[],

    provides=[],
    install_requires=['cliff'],

    namespace_packages=[],
    packages=find_packages(),
    include_package_data=True,

    entry_points={
        'console_scripts': [
            'policy2tosca = policy2tosca.main:main'
        ],
        'cliff.demo': [
            'delete-type = policy2tosca.del_type:delete_type',
            'delete-definition = policy2tosca.del_definition:delete_definition',
            'add-type = policy2tosca.add_type:add_type',
            'add-definition = policy2tosca.add_definition:add_definition',
        ],
    },

    zip_safe=False,
)
