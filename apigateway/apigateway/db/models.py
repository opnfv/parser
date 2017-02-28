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

from sqlalchemy import Column, Integer, String
from sqlalchemy.ext import declarative
from sqlalchemy import Index


Base = declarative.declarative_base()


class User(Base):
    """User table"""

    __tablename__ = 'user'
    __table_args__ = (
        Index('ix_user_user_id', 'user_id'),
    )
    id = Column(Integer, primary_key=True)
    user_id = Column(String(255), nullable=False)
    name = Column(String(64), nullable=False, unique=True)
    email = Column(String(255))
