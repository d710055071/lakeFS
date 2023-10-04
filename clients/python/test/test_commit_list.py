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
from lakefs_sdk.models.commit_list import CommitList  # noqa: E501
from lakefs_sdk.rest import ApiException

class TestCommitList(unittest.TestCase):
    """CommitList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test CommitList
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CommitList`
        """
        model = lakefs_sdk.models.commit_list.CommitList()  # noqa: E501
        if include_optional :
            return CommitList(
                pagination = lakefs_sdk.models.pagination.Pagination(
                    has_more = True, 
                    next_offset = '', 
                    results = 0, 
                    max_per_page = 0, ), 
                results = [
                    lakefs_sdk.models.commit.Commit(
                        id = '', 
                        parents = [
                            ''
                            ], 
                        committer = '', 
                        message = '', 
                        creation_date = 56, 
                        meta_range_id = '', 
                        metadata = {
                            'key' : ''
                            }, )
                    ]
            )
        else :
            return CommitList(
                pagination = lakefs_sdk.models.pagination.Pagination(
                    has_more = True, 
                    next_offset = '', 
                    results = 0, 
                    max_per_page = 0, ),
                results = [
                    lakefs_sdk.models.commit.Commit(
                        id = '', 
                        parents = [
                            ''
                            ], 
                        committer = '', 
                        message = '', 
                        creation_date = 56, 
                        meta_range_id = '', 
                        metadata = {
                            'key' : ''
                            }, )
                    ],
        )
        """

    def testCommitList(self):
        """Test CommitList"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
