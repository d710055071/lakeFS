"""
    lakeFS API

    lakeFS HTTP API  # noqa: E501

    The version of the OpenAPI document: 0.1.0
    Contact: services@treeverse.io
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import lakefs_client
from lakefs_client.model.commit import Commit
from lakefs_client.model.error import Error
globals()['Commit'] = Commit
globals()['Error'] = Error
from lakefs_client.model.import_status import ImportStatus


class TestImportStatus(unittest.TestCase):
    """ImportStatus unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testImportStatus(self):
        """Test ImportStatus"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ImportStatus()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
