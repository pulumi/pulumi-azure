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
    'GetPublicIPsResult',
    'AwaitableGetPublicIPsResult',
    'get_public_i_ps',
    'get_public_i_ps_output',
]

@pulumi.output_type
class GetPublicIPsResult:
    """
    A collection of values returned by getPublicIPs.
    """
    def __init__(__self__, allocation_type=None, attachment_status=None, id=None, name_prefix=None, public_ips=None, resource_group_name=None):
        if allocation_type and not isinstance(allocation_type, str):
            raise TypeError("Expected argument 'allocation_type' to be a str")
        pulumi.set(__self__, "allocation_type", allocation_type)
        if attachment_status and not isinstance(attachment_status, str):
            raise TypeError("Expected argument 'attachment_status' to be a str")
        pulumi.set(__self__, "attachment_status", attachment_status)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name_prefix and not isinstance(name_prefix, str):
            raise TypeError("Expected argument 'name_prefix' to be a str")
        pulumi.set(__self__, "name_prefix", name_prefix)
        if public_ips and not isinstance(public_ips, list):
            raise TypeError("Expected argument 'public_ips' to be a list")
        pulumi.set(__self__, "public_ips", public_ips)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)

    @_builtins.property
    @pulumi.getter(name="allocationType")
    def allocation_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "allocation_type")

    @_builtins.property
    @pulumi.getter(name="attachmentStatus")
    def attachment_status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "attachment_status")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_prefix")

    @_builtins.property
    @pulumi.getter(name="publicIps")
    def public_ips(self) -> Sequence['outputs.GetPublicIPsPublicIpResult']:
        """
        A List of `public_ips` blocks as defined below filtered by the criteria above.
        """
        return pulumi.get(self, "public_ips")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")


class AwaitableGetPublicIPsResult(GetPublicIPsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPublicIPsResult(
            allocation_type=self.allocation_type,
            attachment_status=self.attachment_status,
            id=self.id,
            name_prefix=self.name_prefix,
            public_ips=self.public_ips,
            resource_group_name=self.resource_group_name)


def get_public_i_ps(allocation_type: Optional[_builtins.str] = None,
                    attachment_status: Optional[_builtins.str] = None,
                    name_prefix: Optional[_builtins.str] = None,
                    resource_group_name: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPublicIPsResult:
    """
    Use this data source to access information about a set of existing Public IP Addresses.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.network.get_public_i_ps(resource_group_name="pip-test",
        attachment_status="Attached")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2024-05-01


    :param _builtins.str allocation_type: The Allocation Type for the Public IP Address. Possible values include `Static` or `Dynamic`.
    :param _builtins.str attachment_status: Filter to include IP Addresses which are attached to a device, such as a VM/LB (`Attached`) or unattached (`Unattached`).
    :param _builtins.str name_prefix: A prefix match used for the IP Addresses `name` field, case sensitive.
    :param _builtins.str resource_group_name: Specifies the name of the resource group.
    """
    __args__ = dict()
    __args__['allocationType'] = allocation_type
    __args__['attachmentStatus'] = attachment_status
    __args__['namePrefix'] = name_prefix
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:network/getPublicIPs:getPublicIPs', __args__, opts=opts, typ=GetPublicIPsResult).value

    return AwaitableGetPublicIPsResult(
        allocation_type=pulumi.get(__ret__, 'allocation_type'),
        attachment_status=pulumi.get(__ret__, 'attachment_status'),
        id=pulumi.get(__ret__, 'id'),
        name_prefix=pulumi.get(__ret__, 'name_prefix'),
        public_ips=pulumi.get(__ret__, 'public_ips'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'))
def get_public_i_ps_output(allocation_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           attachment_status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           name_prefix: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPublicIPsResult]:
    """
    Use this data source to access information about a set of existing Public IP Addresses.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.network.get_public_i_ps(resource_group_name="pip-test",
        attachment_status="Attached")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2024-05-01


    :param _builtins.str allocation_type: The Allocation Type for the Public IP Address. Possible values include `Static` or `Dynamic`.
    :param _builtins.str attachment_status: Filter to include IP Addresses which are attached to a device, such as a VM/LB (`Attached`) or unattached (`Unattached`).
    :param _builtins.str name_prefix: A prefix match used for the IP Addresses `name` field, case sensitive.
    :param _builtins.str resource_group_name: Specifies the name of the resource group.
    """
    __args__ = dict()
    __args__['allocationType'] = allocation_type
    __args__['attachmentStatus'] = attachment_status
    __args__['namePrefix'] = name_prefix
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:network/getPublicIPs:getPublicIPs', __args__, opts=opts, typ=GetPublicIPsResult)
    return __ret__.apply(lambda __response__: GetPublicIPsResult(
        allocation_type=pulumi.get(__response__, 'allocation_type'),
        attachment_status=pulumi.get(__response__, 'attachment_status'),
        id=pulumi.get(__response__, 'id'),
        name_prefix=pulumi.get(__response__, 'name_prefix'),
        public_ips=pulumi.get(__response__, 'public_ips'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name')))
