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
    'GetEndpointConnectionResult',
    'AwaitableGetEndpointConnectionResult',
    'get_endpoint_connection',
    'get_endpoint_connection_output',
]

@pulumi.output_type
class GetEndpointConnectionResult:
    """
    A collection of values returned by getEndpointConnection.
    """
    def __init__(__self__, id=None, location=None, name=None, network_interfaces=None, private_service_connections=None, resource_group_name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network_interfaces and not isinstance(network_interfaces, list):
            raise TypeError("Expected argument 'network_interfaces' to be a list")
        pulumi.set(__self__, "network_interfaces", network_interfaces)
        if private_service_connections and not isinstance(private_service_connections, list):
            raise TypeError("Expected argument 'private_service_connections' to be a list")
        pulumi.set(__self__, "private_service_connections", private_service_connections)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)

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
        """
        The supported Azure location where the resource exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the private endpoint.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkInterfaces")
    def network_interfaces(self) -> Sequence['outputs.GetEndpointConnectionNetworkInterfaceResult']:
        return pulumi.get(self, "network_interfaces")

    @_builtins.property
    @pulumi.getter(name="privateServiceConnections")
    def private_service_connections(self) -> Sequence['outputs.GetEndpointConnectionPrivateServiceConnectionResult']:
        return pulumi.get(self, "private_service_connections")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")


class AwaitableGetEndpointConnectionResult(GetEndpointConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEndpointConnectionResult(
            id=self.id,
            location=self.location,
            name=self.name,
            network_interfaces=self.network_interfaces,
            private_service_connections=self.private_service_connections,
            resource_group_name=self.resource_group_name)


def get_endpoint_connection(name: Optional[_builtins.str] = None,
                            resource_group_name: Optional[_builtins.str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEndpointConnectionResult:
    """
    Use this data source to access the connection status information about an existing Private Endpoint Connection.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.privatelink.get_endpoint_connection(name="example-private-endpoint",
        resource_group_name="example-rg")
    pulumi.export("privateEndpointStatus", example.private_service_connections[0].status)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2024-05-01


    :param _builtins.str name: Specifies the Name of the private endpoint.
    :param _builtins.str resource_group_name: Specifies the Name of the Resource Group within which the private endpoint exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:privatelink/getEndpointConnection:getEndpointConnection', __args__, opts=opts, typ=GetEndpointConnectionResult).value

    return AwaitableGetEndpointConnectionResult(
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        network_interfaces=pulumi.get(__ret__, 'network_interfaces'),
        private_service_connections=pulumi.get(__ret__, 'private_service_connections'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'))
def get_endpoint_connection_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                   resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetEndpointConnectionResult]:
    """
    Use this data source to access the connection status information about an existing Private Endpoint Connection.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.privatelink.get_endpoint_connection(name="example-private-endpoint",
        resource_group_name="example-rg")
    pulumi.export("privateEndpointStatus", example.private_service_connections[0].status)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Network`: 2024-05-01


    :param _builtins.str name: Specifies the Name of the private endpoint.
    :param _builtins.str resource_group_name: Specifies the Name of the Resource Group within which the private endpoint exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:privatelink/getEndpointConnection:getEndpointConnection', __args__, opts=opts, typ=GetEndpointConnectionResult)
    return __ret__.apply(lambda __response__: GetEndpointConnectionResult(
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        network_interfaces=pulumi.get(__response__, 'network_interfaces'),
        private_service_connections=pulumi.get(__response__, 'private_service_connections'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name')))
