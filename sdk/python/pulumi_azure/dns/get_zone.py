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
    'GetZoneResult',
    'AwaitableGetZoneResult',
    'get_zone',
    'get_zone_output',
]

@pulumi.output_type
class GetZoneResult:
    """
    A collection of values returned by getZone.
    """
    def __init__(__self__, id=None, max_number_of_record_sets=None, name=None, name_servers=None, number_of_record_sets=None, resource_group_name=None, tags=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if max_number_of_record_sets and not isinstance(max_number_of_record_sets, int):
            raise TypeError("Expected argument 'max_number_of_record_sets' to be a int")
        pulumi.set(__self__, "max_number_of_record_sets", max_number_of_record_sets)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if name_servers and not isinstance(name_servers, list):
            raise TypeError("Expected argument 'name_servers' to be a list")
        pulumi.set(__self__, "name_servers", name_servers)
        if number_of_record_sets and not isinstance(number_of_record_sets, int):
            raise TypeError("Expected argument 'number_of_record_sets' to be a int")
        pulumi.set(__self__, "number_of_record_sets", number_of_record_sets)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="maxNumberOfRecordSets")
    def max_number_of_record_sets(self) -> _builtins.int:
        """
        Maximum number of Records in the zone.
        """
        return pulumi.get(self, "max_number_of_record_sets")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="nameServers")
    def name_servers(self) -> Sequence[_builtins.str]:
        """
        A list of values that make up the NS record for the zone.
        """
        return pulumi.get(self, "name_servers")

    @_builtins.property
    @pulumi.getter(name="numberOfRecordSets")
    def number_of_record_sets(self) -> _builtins.int:
        """
        The number of records already in the zone.
        """
        return pulumi.get(self, "number_of_record_sets")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags assigned to the DNS Zone.
        """
        return pulumi.get(self, "tags")


class AwaitableGetZoneResult(GetZoneResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZoneResult(
            id=self.id,
            max_number_of_record_sets=self.max_number_of_record_sets,
            name=self.name,
            name_servers=self.name_servers,
            number_of_record_sets=self.number_of_record_sets,
            resource_group_name=self.resource_group_name,
            tags=self.tags)


def get_zone(name: Optional[_builtins.str] = None,
             resource_group_name: Optional[_builtins.str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZoneResult:
    """
    Use this data source to access information about an existing DNS Zone.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.dns.get_zone(name="search-eventhubns",
        resource_group_name="search-service")
    pulumi.export("dnsZoneId", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2018-05-01


    :param _builtins.str name: The name of the DNS Zone.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the DNS Zone exists.
           If the Name of the Resource Group is not provided, the first DNS Zone from the list of DNS Zones
           in your subscription that matches `name` will be returned.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:dns/getZone:getZone', __args__, opts=opts, typ=GetZoneResult).value

    return AwaitableGetZoneResult(
        id=pulumi.get(__ret__, 'id'),
        max_number_of_record_sets=pulumi.get(__ret__, 'max_number_of_record_sets'),
        name=pulumi.get(__ret__, 'name'),
        name_servers=pulumi.get(__ret__, 'name_servers'),
        number_of_record_sets=pulumi.get(__ret__, 'number_of_record_sets'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        tags=pulumi.get(__ret__, 'tags'))
def get_zone_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                    resource_group_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetZoneResult]:
    """
    Use this data source to access information about an existing DNS Zone.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.dns.get_zone(name="search-eventhubns",
        resource_group_name="search-service")
    pulumi.export("dnsZoneId", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2018-05-01


    :param _builtins.str name: The name of the DNS Zone.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the DNS Zone exists.
           If the Name of the Resource Group is not provided, the first DNS Zone from the list of DNS Zones
           in your subscription that matches `name` will be returned.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:dns/getZone:getZone', __args__, opts=opts, typ=GetZoneResult)
    return __ret__.apply(lambda __response__: GetZoneResult(
        id=pulumi.get(__response__, 'id'),
        max_number_of_record_sets=pulumi.get(__response__, 'max_number_of_record_sets'),
        name=pulumi.get(__response__, 'name'),
        name_servers=pulumi.get(__response__, 'name_servers'),
        number_of_record_sets=pulumi.get(__response__, 'number_of_record_sets'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        tags=pulumi.get(__response__, 'tags')))
