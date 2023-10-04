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

import lakefs_sdk
from lakefs_sdk.api.refs_api import RefsApi  # noqa: E501
from lakefs_sdk.rest import ApiException


class TestRefsApi(unittest.TestCase):
    """RefsApi unit test stubs"""

    def setUp(self):
        self.api = lakefs_sdk.api.refs_api.RefsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_diff_refs(self):
        """Test case for diff_refs

        diff references  # noqa: E501
        """
        pass

    def test_find_merge_base(self):
        """Test case for find_merge_base

        find the merge base for 2 references  # noqa: E501
        """
        pass

    def test_log_commits(self):
        """Test case for log_commits

        get commit log from ref. If both objects and prefixes are empty, return all commits.  # noqa: E501
        """
        pass

    def test_merge_into_branch(self):
        """Test case for merge_into_branch

        merge references  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
