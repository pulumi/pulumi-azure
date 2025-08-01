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
    'GetRegistryResult',
    'AwaitableGetRegistryResult',
    'get_registry',
    'get_registry_output',
]

@pulumi.output_type
class GetRegistryResult:
    """
    A collection of values returned by getRegistry.
    """
    def __init__(__self__, admin_enabled=None, admin_password=None, admin_username=None, data_endpoint_enabled=None, id=None, location=None, login_server=None, name=None, resource_group_name=None, sku=None, tags=None):
        if admin_enabled and not isinstance(admin_enabled, bool):
            raise TypeError("Expected argument 'admin_enabled' to be a bool")
        pulumi.set(__self__, "admin_enabled", admin_enabled)
        if admin_password and not isinstance(admin_password, str):
            raise TypeError("Expected argument 'admin_password' to be a str")
        pulumi.set(__self__, "admin_password", admin_password)
        if admin_username and not isinstance(admin_username, str):
            raise TypeError("Expected argument 'admin_username' to be a str")
        pulumi.set(__self__, "admin_username", admin_username)
        if data_endpoint_enabled and not isinstance(data_endpoint_enabled, bool):
            raise TypeError("Expected argument 'data_endpoint_enabled' to be a bool")
        pulumi.set(__self__, "data_endpoint_enabled", data_endpoint_enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if login_server and not isinstance(login_server, str):
            raise TypeError("Expected argument 'login_server' to be a str")
        pulumi.set(__self__, "login_server", login_server)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if sku and not isinstance(sku, str):
            raise TypeError("Expected argument 'sku' to be a str")
        pulumi.set(__self__, "sku", sku)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="adminEnabled")
    def admin_enabled(self) -> _builtins.bool:
        """
        Is the Administrator account enabled for this Container Registry.
        """
        return pulumi.get(self, "admin_enabled")

    @_builtins.property
    @pulumi.getter(name="adminPassword")
    def admin_password(self) -> _builtins.str:
        """
        The Password associated with the Container Registry Admin account - if the admin account is enabled.
        """
        return pulumi.get(self, "admin_password")

    @_builtins.property
    @pulumi.getter(name="adminUsername")
    def admin_username(self) -> _builtins.str:
        """
        The Username associated with the Container Registry Admin account - if the admin account is enabled.
        """
        return pulumi.get(self, "admin_username")

    @_builtins.property
    @pulumi.getter(name="dataEndpointEnabled")
    def data_endpoint_enabled(self) -> _builtins.bool:
        """
        Whether dedicated data endpoints for this Container Registry are enabled?
        """
        return pulumi.get(self, "data_endpoint_enabled")

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
        The Azure Region in which this Container Registry exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="loginServer")
    def login_server(self) -> _builtins.str:
        """
        The URL that can be used to log into the container registry.
        """
        return pulumi.get(self, "login_server")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def sku(self) -> _builtins.str:
        """
        The SKU of this Container Registry, such as `Basic`.
        """
        return pulumi.get(self, "sku")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A map of tags assigned to the Container Registry.
        """
        return pulumi.get(self, "tags")


class AwaitableGetRegistryResult(GetRegistryResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRegistryResult(
            admin_enabled=self.admin_enabled,
            admin_password=self.admin_password,
            admin_username=self.admin_username,
            data_endpoint_enabled=self.data_endpoint_enabled,
            id=self.id,
            location=self.location,
            login_server=self.login_server,
            name=self.name,
            resource_group_name=self.resource_group_name,
            sku=self.sku,
            tags=self.tags)


def get_registry(name: Optional[_builtins.str] = None,
                 resource_group_name: Optional[_builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRegistryResult:
    """
    Use this data source to access information about an existing Container Registry.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.containerservice.get_registry(name="testacr",
        resource_group_name="test")
    pulumi.export("loginServer", example.login_server)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.ContainerRegistry`: 2023-11-01-preview


    :param _builtins.str name: The name of the Container Registry.
    :param _builtins.str resource_group_name: The Name of the Resource Group where this Container Registry exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:containerservice/getRegistry:getRegistry', __args__, opts=opts, typ=GetRegistryResult).value

    return AwaitableGetRegistryResult(
        admin_enabled=pulumi.get(__ret__, 'admin_enabled'),
        admin_password=pulumi.get(__ret__, 'admin_password'),
        admin_username=pulumi.get(__ret__, 'admin_username'),
        data_endpoint_enabled=pulumi.get(__ret__, 'data_endpoint_enabled'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        login_server=pulumi.get(__ret__, 'login_server'),
        name=pulumi.get(__ret__, 'name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        sku=pulumi.get(__ret__, 'sku'),
        tags=pulumi.get(__ret__, 'tags'))
def get_registry_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                        resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRegistryResult]:
    """
    Use this data source to access information about an existing Container Registry.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.containerservice.get_registry(name="testacr",
        resource_group_name="test")
    pulumi.export("loginServer", example.login_server)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.ContainerRegistry`: 2023-11-01-preview


    :param _builtins.str name: The name of the Container Registry.
    :param _builtins.str resource_group_name: The Name of the Resource Group where this Container Registry exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:containerservice/getRegistry:getRegistry', __args__, opts=opts, typ=GetRegistryResult)
    return __ret__.apply(lambda __response__: GetRegistryResult(
        admin_enabled=pulumi.get(__response__, 'admin_enabled'),
        admin_password=pulumi.get(__response__, 'admin_password'),
        admin_username=pulumi.get(__response__, 'admin_username'),
        data_endpoint_enabled=pulumi.get(__response__, 'data_endpoint_enabled'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        login_server=pulumi.get(__response__, 'login_server'),
        name=pulumi.get(__response__, 'name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        sku=pulumi.get(__response__, 'sku'),
        tags=pulumi.get(__response__, 'tags')))
