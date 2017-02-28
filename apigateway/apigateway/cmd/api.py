#
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

from wsgiref import simple_server

from apigateway.api import app


def main():
    host = '0.0.0.0'
    port = 8080

    application = app.setup_app()
    srv = simple_server.make_server(host, port, application)

    srv.serve_forever()


if __name__ == '__main__':
    main()
