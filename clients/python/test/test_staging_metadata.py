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
from lakefs_sdk.models.staging_metadata import StagingMetadata  # noqa: E501
from lakefs_sdk.rest import ApiException

class TestStagingMetadata(unittest.TestCase):
    """StagingMetadata unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test StagingMetadata
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `StagingMetadata`
        """
        model = lakefs_sdk.models.staging_metadata.StagingMetadata()  # noqa: E501
        if include_optional :
            return StagingMetadata(
                staging = lakefs_sdk.models.staging_location.StagingLocation(
                    physical_address = '', 
                    token = '', 
                    presigned_url = '', 
                    presigned_url_expiry = 56, ), 
                checksum = '', 
                size_bytes = 56, 
                user_metadata = {
                    'key' : ''
                    }, 
                content_type = ''
            )
        else :
            return StagingMetadata(
                staging = lakefs_sdk.models.staging_location.StagingLocation(
                    physical_address = '', 
                    token = '', 
                    presigned_url = '', 
                    presigned_url_expiry = 56, ),
                checksum = '',
                size_bytes = 56,
        )
        """

    def testStagingMetadata(self):
        """Test StagingMetadata"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
