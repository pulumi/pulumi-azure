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
    'GetZoneVirtualNetworkLinkResult',
    'AwaitableGetZoneVirtualNetworkLinkResult',
    'get_zone_virtual_network_link',
    'get_zone_virtual_network_link_output',
]

@pulumi.output_type
class GetZoneVirtualNetworkLinkResult:
    """
    A collection of values returned by getZoneVirtualNetworkLink.
    """
    def __init__(__self__, id=None, name=None, private_dns_zone_name=None, registration_enabled=None, resource_group_name=None, tags=None, virtual_network_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if private_dns_zone_name and not isinstance(private_dns_zone_name, str):
            raise TypeError("Expected argument 'private_dns_zone_name' to be a str")
        pulumi.set(__self__, "private_dns_zone_name", private_dns_zone_name)
        if registration_enabled and not isinstance(registration_enabled, bool):
            raise TypeError("Expected argument 'registration_enabled' to be a bool")
        pulumi.set(__self__, "registration_enabled", registration_enabled)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if virtual_network_id and not isinstance(virtual_network_id, str):
            raise TypeError("Expected argument 'virtual_network_id' to be a str")
        pulumi.set(__self__, "virtual_network_id", virtual_network_id)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="privateDnsZoneName")
    def private_dns_zone_name(self) -> _builtins.str:
        return pulumi.get(self, "private_dns_zone_name")

    @_builtins.property
    @pulumi.getter(name="registrationEnabled")
    def registration_enabled(self) -> _builtins.bool:
        """
        Whether the auto-registration of virtual machine records in the virtual network in the Private DNS zone is enabled or not.
        """
        return pulumi.get(self, "registration_enabled")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> _builtins.str:
        """
        The ID of the Virtual Network that is linked to the DNS Zone.
        """
        return pulumi.get(self, "virtual_network_id")


class AwaitableGetZoneVirtualNetworkLinkResult(GetZoneVirtualNetworkLinkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZoneVirtualNetworkLinkResult(
            id=self.id,
            name=self.name,
            private_dns_zone_name=self.private_dns_zone_name,
            registration_enabled=self.registration_enabled,
            resource_group_name=self.resource_group_name,
            tags=self.tags,
            virtual_network_id=self.virtual_network_id)


def get_zone_virtual_network_link(name: Optional[_builtins.str] = None,
                                  private_dns_zone_name: Optional[_builtins.str] = None,
                                  resource_group_name: Optional[_builtins.str] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZoneVirtualNetworkLinkResult:
    """
    Use this data source to access information about an existing Private DNS zone Virtual Network Link. These Links enable DNS resolution and registration inside Azure Virtual Networks using Azure Private DNS.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.privatedns.get_zone_virtual_network_link(name="test",
        resource_group_name="test-rg",
        private_dns_zone_name="test-zone")
    pulumi.export("privateDnsARecordId", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2024-06-01


    :param _builtins.str name: The name of the Private DNS Zone Virtual Network Link.
    :param _builtins.str private_dns_zone_name: The name of the Private DNS zone (without a terminating dot).
    :param _builtins.str resource_group_name: Specifies the resource group where the Private DNS Zone exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['privateDnsZoneName'] = private_dns_zone_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:privatedns/getZoneVirtualNetworkLink:getZoneVirtualNetworkLink', __args__, opts=opts, typ=GetZoneVirtualNetworkLinkResult).value

    return AwaitableGetZoneVirtualNetworkLinkResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        private_dns_zone_name=pulumi.get(__ret__, 'private_dns_zone_name'),
        registration_enabled=pulumi.get(__ret__, 'registration_enabled'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        tags=pulumi.get(__ret__, 'tags'),
        virtual_network_id=pulumi.get(__ret__, 'virtual_network_id'))
def get_zone_virtual_network_link_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                         private_dns_zone_name: Optional[pulumi.Input[_builtins.str]] = None,
                                         resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetZoneVirtualNetworkLinkResult]:
    """
    Use this data source to access information about an existing Private DNS zone Virtual Network Link. These Links enable DNS resolution and registration inside Azure Virtual Networks using Azure Private DNS.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.privatedns.get_zone_virtual_network_link(name="test",
        resource_group_name="test-rg",
        private_dns_zone_name="test-zone")
    pulumi.export("privateDnsARecordId", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2024-06-01


    :param _builtins.str name: The name of the Private DNS Zone Virtual Network Link.
    :param _builtins.str private_dns_zone_name: The name of the Private DNS zone (without a terminating dot).
    :param _builtins.str resource_group_name: Specifies the resource group where the Private DNS Zone exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['privateDnsZoneName'] = private_dns_zone_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:privatedns/getZoneVirtualNetworkLink:getZoneVirtualNetworkLink', __args__, opts=opts, typ=GetZoneVirtualNetworkLinkResult)
    return __ret__.apply(lambda __response__: GetZoneVirtualNetworkLinkResult(
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        private_dns_zone_name=pulumi.get(__response__, 'private_dns_zone_name'),
        registration_enabled=pulumi.get(__response__, 'registration_enabled'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        tags=pulumi.get(__response__, 'tags'),
        virtual_network_id=pulumi.get(__response__, 'virtual_network_id')))
