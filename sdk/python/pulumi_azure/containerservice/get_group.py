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
from . import outputs

__all__ = [
    'GetGroupResult',
    'AwaitableGetGroupResult',
    'get_group',
    'get_group_output',
]

@pulumi.output_type
class GetGroupResult:
    """
    A collection of values returned by getGroup.
    """
    def __init__(__self__, fqdn=None, id=None, identities=None, ip_address=None, location=None, name=None, resource_group_name=None, subnet_ids=None, tags=None, zones=None):
        if fqdn and not isinstance(fqdn, str):
            raise TypeError("Expected argument 'fqdn' to be a str")
        pulumi.set(__self__, "fqdn", fqdn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identities and not isinstance(identities, list):
            raise TypeError("Expected argument 'identities' to be a list")
        pulumi.set(__self__, "identities", identities)
        if ip_address and not isinstance(ip_address, str):
            raise TypeError("Expected argument 'ip_address' to be a str")
        pulumi.set(__self__, "ip_address", ip_address)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if subnet_ids and not isinstance(subnet_ids, list):
            raise TypeError("Expected argument 'subnet_ids' to be a list")
        pulumi.set(__self__, "subnet_ids", subnet_ids)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if zones and not isinstance(zones, list):
            raise TypeError("Expected argument 'zones' to be a list")
        pulumi.set(__self__, "zones", zones)

    @_builtins.property
    @pulumi.getter
    def fqdn(self) -> _builtins.str:
        """
        The FQDN of the Container Group instance derived from `dns_name_label`.
        """
        return pulumi.get(self, "fqdn")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def identities(self) -> Sequence['outputs.GetGroupIdentityResult']:
        """
        A `identity` block as defined below.
        """
        return pulumi.get(self, "identities")

    @_builtins.property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> _builtins.str:
        """
        The IP address allocated to the Container Group instance.
        """
        return pulumi.get(self, "ip_address")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The Azure Region where the Container Group instance exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Sequence[_builtins.str]:
        """
        The subnet resource IDs for a container group.
        """
        return pulumi.get(self, "subnet_ids")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags assigned to the Container Group instance.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def zones(self) -> Optional[Sequence[_builtins.str]]:
        """
        A list of Availability Zones in which this Container Group is located.
        """
        return pulumi.get(self, "zones")


class AwaitableGetGroupResult(GetGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGroupResult(
            fqdn=self.fqdn,
            id=self.id,
            identities=self.identities,
            ip_address=self.ip_address,
            location=self.location,
            name=self.name,
            resource_group_name=self.resource_group_name,
            subnet_ids=self.subnet_ids,
            tags=self.tags,
            zones=self.zones)


def get_group(name: Optional[_builtins.str] = None,
              resource_group_name: Optional[_builtins.str] = None,
              zones: Optional[Sequence[_builtins.str]] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGroupResult:
    """
    Use this data source to access information about an existing Container Group instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.containerservice.get_group(name="existing",
        resource_group_name="existing")
    pulumi.export("id", example.id)
    pulumi.export("ipAddress", example.ip_address)
    pulumi.export("fqdn", example.fqdn)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.ContainerInstance`: 2023-05-01


    :param _builtins.str name: The name of this Container Group instance.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Container Group instance exists.
    :param Sequence[_builtins.str] zones: A list of Availability Zones in which this Container Group is located.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['zones'] = zones
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:containerservice/getGroup:getGroup', __args__, opts=opts, typ=GetGroupResult).value

    return AwaitableGetGroupResult(
        fqdn=pulumi.get(__ret__, 'fqdn'),
        id=pulumi.get(__ret__, 'id'),
        identities=pulumi.get(__ret__, 'identities'),
        ip_address=pulumi.get(__ret__, 'ip_address'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        subnet_ids=pulumi.get(__ret__, 'subnet_ids'),
        tags=pulumi.get(__ret__, 'tags'),
        zones=pulumi.get(__ret__, 'zones'))
def get_group_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                     resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                     zones: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGroupResult]:
    """
    Use this data source to access information about an existing Container Group instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.containerservice.get_group(name="existing",
        resource_group_name="existing")
    pulumi.export("id", example.id)
    pulumi.export("ipAddress", example.ip_address)
    pulumi.export("fqdn", example.fqdn)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.ContainerInstance`: 2023-05-01


    :param _builtins.str name: The name of this Container Group instance.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Container Group instance exists.
    :param Sequence[_builtins.str] zones: A list of Availability Zones in which this Container Group is located.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['zones'] = zones
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:containerservice/getGroup:getGroup', __args__, opts=opts, typ=GetGroupResult)
    return __ret__.apply(lambda __response__: GetGroupResult(
        fqdn=pulumi.get(__response__, 'fqdn'),
        id=pulumi.get(__response__, 'id'),
        identities=pulumi.get(__response__, 'identities'),
        ip_address=pulumi.get(__response__, 'ip_address'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        subnet_ids=pulumi.get(__response__, 'subnet_ids'),
        tags=pulumi.get(__response__, 'tags'),
        zones=pulumi.get(__response__, 'zones')))
