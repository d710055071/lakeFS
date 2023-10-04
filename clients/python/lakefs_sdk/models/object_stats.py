# coding: utf-8

"""
    lakeFS API

    lakeFS HTTP API

    The version of the OpenAPI document: 0.1.0
    Contact: services@treeverse.io
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Dict, Optional
from pydantic import BaseModel, Field, StrictInt, StrictStr, validator

class ObjectStats(BaseModel):
    """
    ObjectStats
    """
    path: StrictStr = Field(...)
    path_type: StrictStr = Field(...)
    physical_address: StrictStr = Field(..., description="The location of the object on the underlying object store. Formatted as a native URI with the object store type as scheme (\"s3://...\", \"gs://...\", etc.) Or, in the case of presign=true, will be an HTTP URL to be consumed via regular HTTP GET ")
    physical_address_expiry: Optional[StrictInt] = Field(None, description="If present and nonzero, physical_address is a pre-signed URL and will expire at this Unix Epoch time.  This will be shorter than the pre-signed URL lifetime if an authentication token is about to expire.  This field is *optional*. ")
    checksum: StrictStr = Field(...)
    size_bytes: Optional[StrictInt] = None
    mtime: StrictInt = Field(..., description="Unix Epoch in seconds")
    metadata: Optional[Dict[str, StrictStr]] = None
    content_type: Optional[StrictStr] = Field(None, description="Object media type")
    __properties = ["path", "path_type", "physical_address", "physical_address_expiry", "checksum", "size_bytes", "mtime", "metadata", "content_type"]

    @validator('path_type')
    def path_type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in ('common_prefix', 'object'):
            raise ValueError("must be one of enum values ('common_prefix', 'object')")
        return value

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> ObjectStats:
        """Create an instance of ObjectStats from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> ObjectStats:
        """Create an instance of ObjectStats from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return ObjectStats.parse_obj(obj)

        _obj = ObjectStats.parse_obj({
            "path": obj.get("path"),
            "path_type": obj.get("path_type"),
            "physical_address": obj.get("physical_address"),
            "physical_address_expiry": obj.get("physical_address_expiry"),
            "checksum": obj.get("checksum"),
            "size_bytes": obj.get("size_bytes"),
            "mtime": obj.get("mtime"),
            "metadata": obj.get("metadata"),
            "content_type": obj.get("content_type")
        })
        return _obj


