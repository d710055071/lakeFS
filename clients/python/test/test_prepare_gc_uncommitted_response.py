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
from lakefs_sdk.models.prepare_gc_uncommitted_response import PrepareGCUncommittedResponse  # noqa: E501
from lakefs_sdk.rest import ApiException

class TestPrepareGCUncommittedResponse(unittest.TestCase):
    """PrepareGCUncommittedResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test PrepareGCUncommittedResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PrepareGCUncommittedResponse`
        """
        model = lakefs_sdk.models.prepare_gc_uncommitted_response.PrepareGCUncommittedResponse()  # noqa: E501
        if include_optional :
            return PrepareGCUncommittedResponse(
                run_id = '', 
                gc_uncommitted_location = '', 
                continuation_token = ''
            )
        else :
            return PrepareGCUncommittedResponse(
                run_id = '',
                gc_uncommitted_location = '',
        )
        """

    def testPrepareGCUncommittedResponse(self):
        """Test PrepareGCUncommittedResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
