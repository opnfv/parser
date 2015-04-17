#    Licensed under the Apache License, Version 2.0 (the "License"); you may
#    not use this file except in compliance with the License. You may obtain
#    a copy of the License at
#
#         http://www.apache.org/licenses/LICENSE-2.0
#
#    Unless required by applicable law or agreed to in writing, software
#    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
#    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
#    License for the specific language governing permissions and limitations
#    under the License.

from collections import OrderedDict
import yaml

if hasattr(yaml, 'CSafeLoader'):
    yaml_loader = yaml.CSafeLoader
else:
    yaml_loader = yaml.SafeLoader


def load_yaml(path):
    with open(path) as f:
        return yaml.load(f.read(), Loader=yaml_loader)


def simple_parse(tmpl_str):
    try:
        tpl = yaml.load(tmpl_str, Loader=yaml_loader)
    except yaml.YAMLError as yea:
        raise ValueError(yea)
    else:
        if tpl is None:
            tpl = {}
    return tpl


def ordered_load(stream, Loader=yaml.Loader, object_pairs_hook=OrderedDict):
    class OrderedLoader(Loader):
        pass

    def construct_mapping(loader, node):
        loader.flatten_mapping(node)
        return object_pairs_hook(loader.construct_pairs(node))

    OrderedLoader.add_constructor(
        yaml.resolver.BaseResolver.DEFAULT_MAPPING_TAG,
        construct_mapping)
    return yaml.load(stream, OrderedLoader)


def simple_ordered_parse(tmpl_str):
    try:
        tpl = ordered_load(tmpl_str)
    except yaml.YAMLError as yea:
        raise ValueError(yea)
    else:
        if tpl is None:
            tpl = {}
    return tpl
