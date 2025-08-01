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
    'GetDpsResult',
    'AwaitableGetDpsResult',
    'get_dps',
    'get_dps_output',
]

@pulumi.output_type
class GetDpsResult:
    """
    A collection of values returned by getDps.
    """
    def __init__(__self__, allocation_policy=None, device_provisioning_host_name=None, id=None, id_scope=None, location=None, name=None, resource_group_name=None, service_operations_host_name=None, tags=None):
        if allocation_policy and not isinstance(allocation_policy, str):
            raise TypeError("Expected argument 'allocation_policy' to be a str")
        pulumi.set(__self__, "allocation_policy", allocation_policy)
        if device_provisioning_host_name and not isinstance(device_provisioning_host_name, str):
            raise TypeError("Expected argument 'device_provisioning_host_name' to be a str")
        pulumi.set(__self__, "device_provisioning_host_name", device_provisioning_host_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if id_scope and not isinstance(id_scope, str):
            raise TypeError("Expected argument 'id_scope' to be a str")
        pulumi.set(__self__, "id_scope", id_scope)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if service_operations_host_name and not isinstance(service_operations_host_name, str):
            raise TypeError("Expected argument 'service_operations_host_name' to be a str")
        pulumi.set(__self__, "service_operations_host_name", service_operations_host_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="allocationPolicy")
    def allocation_policy(self) -> _builtins.str:
        """
        The allocation policy of the IoT Device Provisioning Service.
        """
        return pulumi.get(self, "allocation_policy")

    @_builtins.property
    @pulumi.getter(name="deviceProvisioningHostName")
    def device_provisioning_host_name(self) -> _builtins.str:
        """
        The device endpoint of the IoT Device Provisioning Service.
        """
        return pulumi.get(self, "device_provisioning_host_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="idScope")
    def id_scope(self) -> _builtins.str:
        """
        The unique identifier of the IoT Device Provisioning Service.
        """
        return pulumi.get(self, "id_scope")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        Specifies the supported Azure location where the IoT Device Provisioning Service exists.
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
    @pulumi.getter(name="serviceOperationsHostName")
    def service_operations_host_name(self) -> _builtins.str:
        """
        The service endpoint of the IoT Device Provisioning Service.
        """
        return pulumi.get(self, "service_operations_host_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, _builtins.str]]:
        return pulumi.get(self, "tags")


class AwaitableGetDpsResult(GetDpsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDpsResult(
            allocation_policy=self.allocation_policy,
            device_provisioning_host_name=self.device_provisioning_host_name,
            id=self.id,
            id_scope=self.id_scope,
            location=self.location,
            name=self.name,
            resource_group_name=self.resource_group_name,
            service_operations_host_name=self.service_operations_host_name,
            tags=self.tags)


def get_dps(name: Optional[_builtins.str] = None,
            resource_group_name: Optional[_builtins.str] = None,
            tags: Optional[Mapping[str, _builtins.str]] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDpsResult:
    """
    Use this data source to access information about an existing IotHub Device Provisioning Service.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.iot.get_dps(name="iot_hub_dps_test",
        resource_group_name="iothub_dps_rg")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Devices`: 2022-02-05


    :param _builtins.str name: Specifies the name of the Iot Device Provisioning Service resource.
    :param _builtins.str resource_group_name: The name of the resource group under which the Iot Device Provisioning Service is located in.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:iot/getDps:getDps', __args__, opts=opts, typ=GetDpsResult).value

    return AwaitableGetDpsResult(
        allocation_policy=pulumi.get(__ret__, 'allocation_policy'),
        device_provisioning_host_name=pulumi.get(__ret__, 'device_provisioning_host_name'),
        id=pulumi.get(__ret__, 'id'),
        id_scope=pulumi.get(__ret__, 'id_scope'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        service_operations_host_name=pulumi.get(__ret__, 'service_operations_host_name'),
        tags=pulumi.get(__ret__, 'tags'))
def get_dps_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                   resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                   tags: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDpsResult]:
    """
    Use this data source to access information about an existing IotHub Device Provisioning Service.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.iot.get_dps(name="iot_hub_dps_test",
        resource_group_name="iothub_dps_rg")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Devices`: 2022-02-05


    :param _builtins.str name: Specifies the name of the Iot Device Provisioning Service resource.
    :param _builtins.str resource_group_name: The name of the resource group under which the Iot Device Provisioning Service is located in.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['tags'] = tags
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:iot/getDps:getDps', __args__, opts=opts, typ=GetDpsResult)
    return __ret__.apply(lambda __response__: GetDpsResult(
        allocation_policy=pulumi.get(__response__, 'allocation_policy'),
        device_provisioning_host_name=pulumi.get(__response__, 'device_provisioning_host_name'),
        id=pulumi.get(__response__, 'id'),
        id_scope=pulumi.get(__response__, 'id_scope'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        service_operations_host_name=pulumi.get(__response__, 'service_operations_host_name'),
        tags=pulumi.get(__response__, 'tags')))
