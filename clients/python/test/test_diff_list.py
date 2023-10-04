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
from lakefs_sdk.models.diff_list import DiffList  # noqa: E501
from lakefs_sdk.rest import ApiException

class TestDiffList(unittest.TestCase):
    """DiffList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test DiffList
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DiffList`
        """
        model = lakefs_sdk.models.diff_list.DiffList()  # noqa: E501
        if include_optional :
            return DiffList(
                pagination = lakefs_sdk.models.pagination.Pagination(
                    has_more = True, 
                    next_offset = '', 
                    results = 0, 
                    max_per_page = 0, ), 
                results = [
                    lakefs_sdk.models.diff.Diff(
                        type = 'added', 
                        path = '', 
                        path_type = 'common_prefix', 
                        size_bytes = 56, )
                    ]
            )
        else :
            return DiffList(
                pagination = lakefs_sdk.models.pagination.Pagination(
                    has_more = True, 
                    next_offset = '', 
                    results = 0, 
                    max_per_page = 0, ),
                results = [
                    lakefs_sdk.models.diff.Diff(
                        type = 'added', 
                        path = '', 
                        path_type = 'common_prefix', 
                        size_bytes = 56, )
                    ],
        )
        """

    def testDiffList(self):
        """Test DiffList"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
