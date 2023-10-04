# coding: utf-8

"""
    lakeFS API

    lakeFS HTTP API

    The version of the OpenAPI document: 0.1.0
    Contact: services@treeverse.io
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

import lakefs_sdk
from lakefs_sdk.models.garbage_collection_config import GarbageCollectionConfig  # noqa: E501
from lakefs_sdk.rest import ApiException

class TestGarbageCollectionConfig(unittest.TestCase):
    """GarbageCollectionConfig unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test GarbageCollectionConfig
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GarbageCollectionConfig`
        """
        model = lakefs_sdk.models.garbage_collection_config.GarbageCollectionConfig()  # noqa: E501
        if include_optional :
            return GarbageCollectionConfig(
                grace_period = 56
            )
        else :
            return GarbageCollectionConfig(
        )
        """

    def testGarbageCollectionConfig(self):
        """Test GarbageCollectionConfig"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
