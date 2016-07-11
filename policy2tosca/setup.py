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
            'add-type = policy2tosca.add_type:add_type',
            'add-definition = policy2tosca.add_definition:add_definition',
        ],
    },

    zip_safe=False,
)
