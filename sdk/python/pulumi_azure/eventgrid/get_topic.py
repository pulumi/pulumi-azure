# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'GetTopicResult',
    'AwaitableGetTopicResult',
    'get_topic',
    'get_topic_output',
]

@pulumi.output_type
class GetTopicResult:
    """
    A collection of values returned by getTopic.
    """
    def __init__(__self__, endpoint=None, id=None, location=None, name=None, primary_access_key=None, resource_group_name=None, secondary_access_key=None, tags=None):
        if endpoint and not isinstance(endpoint, str):
            raise TypeError("Expected argument 'endpoint' to be a str")
        pulumi.set(__self__, "endpoint", endpoint)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if primary_access_key and not isinstance(primary_access_key, str):
            raise TypeError("Expected argument 'primary_access_key' to be a str")
        pulumi.set(__self__, "primary_access_key", primary_access_key)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if secondary_access_key and not isinstance(secondary_access_key, str):
            raise TypeError("Expected argument 'secondary_access_key' to be a str")
        pulumi.set(__self__, "secondary_access_key", secondary_access_key)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def endpoint(self) -> _builtins.str:
        """
        The Endpoint associated with the EventGrid Topic.
        """
        return pulumi.get(self, "endpoint")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="primaryAccessKey")
    def primary_access_key(self) -> _builtins.str:
        """
        The Primary Shared Access Key associated with the EventGrid Topic.
        """
        return pulumi.get(self, "primary_access_key")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="secondaryAccessKey")
    def secondary_access_key(self) -> _builtins.str:
        """
        The Secondary Shared Access Key associated with the EventGrid Topic.
        """
        return pulumi.get(self, "secondary_access_key")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "tags")


class AwaitableGetTopicResult(GetTopicResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTopicResult(
            endpoint=self.endpoint,
            id=self.id,
            location=self.location,
            name=self.name,
            primary_access_key=self.primary_access_key,
            resource_group_name=self.resource_group_name,
            secondary_access_key=self.secondary_access_key,
            tags=self.tags)


def get_topic(name: Optional[_builtins.str] = None,
              resource_group_name: Optional[_builtins.str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTopicResult:
    """
    Use this data source to access information about an existing EventGrid Topic

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.eventgrid.get_topic(name="my-eventgrid-topic",
        resource_group_name="example-resources")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.EventGrid`: 2022-06-15


    :param _builtins.str name: The name of the EventGrid Topic resource.
    :param _builtins.str resource_group_name: The name of the resource group in which the EventGrid Topic exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:eventgrid/getTopic:getTopic', __args__, opts=opts, typ=GetTopicResult).value

    return AwaitableGetTopicResult(
        endpoint=pulumi.get(__ret__, 'endpoint'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        primary_access_key=pulumi.get(__ret__, 'primary_access_key'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        secondary_access_key=pulumi.get(__ret__, 'secondary_access_key'),
        tags=pulumi.get(__ret__, 'tags'))
def get_topic_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                     resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTopicResult]:
    """
    Use this data source to access information about an existing EventGrid Topic

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.eventgrid.get_topic(name="my-eventgrid-topic",
        resource_group_name="example-resources")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.EventGrid`: 2022-06-15


    :param _builtins.str name: The name of the EventGrid Topic resource.
    :param _builtins.str resource_group_name: The name of the resource group in which the EventGrid Topic exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:eventgrid/getTopic:getTopic', __args__, opts=opts, typ=GetTopicResult)
    return __ret__.apply(lambda __response__: GetTopicResult(
        endpoint=pulumi.get(__response__, 'endpoint'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        primary_access_key=pulumi.get(__response__, 'primary_access_key'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        secondary_access_key=pulumi.get(__response__, 'secondary_access_key'),
        tags=pulumi.get(__response__, 'tags')))
