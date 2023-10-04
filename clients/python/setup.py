"""
    lakeFS API

    lakeFS HTTP API

    The version of the OpenAPI document: 0.1.0
    Contact: services@treeverse.io
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from setuptools import setup, find_packages  # noqa: H301

NAME = "lakefs-sdk"
VERSION = "0.1.0-SNAPSHOT"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
  "urllib3 >= 1.25.3",
  "python-dateutil",
]

with open('README.md') as f:
    long_description = f.read()

setup(
    name=NAME,
    version=VERSION,
    description="lakeFS API",
    author="Treeverse",
    author_email="services@treeverse.io",
    url="https://github.com/treeverse/lakeFS/tree/master/clients/python",
    keywords=["OpenAPI", "OpenAPI-Generator", "lakeFS API"],
    python_requires=">=3.6",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="Apache 2.0",
    long_description=long_description,
    long_description_content_type='text/markdown'
)
