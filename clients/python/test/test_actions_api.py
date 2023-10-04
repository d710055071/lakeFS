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
from lakefs_sdk.api.actions_api import ActionsApi  # noqa: E501
from lakefs_sdk.rest import ApiException


class TestActionsApi(unittest.TestCase):
    """ActionsApi unit test stubs"""

    def setUp(self):
        self.api = lakefs_sdk.api.actions_api.ActionsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_run(self):
        """Test case for get_run

        get a run  # noqa: E501
        """
        pass

    def test_get_run_hook_output(self):
        """Test case for get_run_hook_output

        get run hook output  # noqa: E501
        """
        pass

    def test_list_repository_runs(self):
        """Test case for list_repository_runs

        list runs  # noqa: E501
        """
        pass

    def test_list_run_hooks(self):
        """Test case for list_run_hooks

        list run hooks  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
