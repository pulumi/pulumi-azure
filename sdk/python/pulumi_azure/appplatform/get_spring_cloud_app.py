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
    'GetSpringCloudAppResult',
    'AwaitableGetSpringCloudAppResult',
    'get_spring_cloud_app',
    'get_spring_cloud_app_output',
]

@pulumi.output_type
class GetSpringCloudAppResult:
    """
    A collection of values returned by getSpringCloudApp.
    """
    def __init__(__self__, fqdn=None, https_only=None, id=None, identities=None, is_public=None, name=None, persistent_disks=None, resource_group_name=None, service_name=None, tls_enabled=None, url=None):
        if fqdn and not isinstance(fqdn, str):
            raise TypeError("Expected argument 'fqdn' to be a str")
        pulumi.set(__self__, "fqdn", fqdn)
        if https_only and not isinstance(https_only, bool):
            raise TypeError("Expected argument 'https_only' to be a bool")
        pulumi.set(__self__, "https_only", https_only)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identities and not isinstance(identities, list):
            raise TypeError("Expected argument 'identities' to be a list")
        pulumi.set(__self__, "identities", identities)
        if is_public and not isinstance(is_public, bool):
            raise TypeError("Expected argument 'is_public' to be a bool")
        pulumi.set(__self__, "is_public", is_public)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if persistent_disks and not isinstance(persistent_disks, list):
            raise TypeError("Expected argument 'persistent_disks' to be a list")
        pulumi.set(__self__, "persistent_disks", persistent_disks)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if service_name and not isinstance(service_name, str):
            raise TypeError("Expected argument 'service_name' to be a str")
        pulumi.set(__self__, "service_name", service_name)
        if tls_enabled and not isinstance(tls_enabled, bool):
            raise TypeError("Expected argument 'tls_enabled' to be a bool")
        pulumi.set(__self__, "tls_enabled", tls_enabled)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)

    @_builtins.property
    @pulumi.getter
    def fqdn(self) -> _builtins.str:
        """
        The Fully Qualified DNS Name.
        """
        return pulumi.get(self, "fqdn")

    @_builtins.property
    @pulumi.getter(name="httpsOnly")
    def https_only(self) -> _builtins.bool:
        """
        Is only HTTPS allowed?
        """
        return pulumi.get(self, "https_only")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def identities(self) -> Sequence['outputs.GetSpringCloudAppIdentityResult']:
        """
        An `identity` block as defined below.
        """
        return pulumi.get(self, "identities")

    @_builtins.property
    @pulumi.getter(name="isPublic")
    def is_public(self) -> _builtins.bool:
        """
        Does the Spring Cloud Application have public endpoint?
        """
        return pulumi.get(self, "is_public")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="persistentDisks")
    def persistent_disks(self) -> Sequence['outputs.GetSpringCloudAppPersistentDiskResult']:
        """
        A `persistent_disk` block as defined below.
        """
        return pulumi.get(self, "persistent_disks")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> _builtins.str:
        return pulumi.get(self, "service_name")

    @_builtins.property
    @pulumi.getter(name="tlsEnabled")
    def tls_enabled(self) -> _builtins.bool:
        """
        Is End to End TLS Enabled?
        """
        return pulumi.get(self, "tls_enabled")

    @_builtins.property
    @pulumi.getter
    def url(self) -> _builtins.str:
        """
        The public endpoint of the Spring Cloud Application.
        """
        return pulumi.get(self, "url")


class AwaitableGetSpringCloudAppResult(GetSpringCloudAppResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSpringCloudAppResult(
            fqdn=self.fqdn,
            https_only=self.https_only,
            id=self.id,
            identities=self.identities,
            is_public=self.is_public,
            name=self.name,
            persistent_disks=self.persistent_disks,
            resource_group_name=self.resource_group_name,
            service_name=self.service_name,
            tls_enabled=self.tls_enabled,
            url=self.url)


def get_spring_cloud_app(name: Optional[_builtins.str] = None,
                         resource_group_name: Optional[_builtins.str] = None,
                         service_name: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSpringCloudAppResult:
    """
    Use this data source to access information about an existing Spring Cloud Application.

    !> **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `appplatform.SpringCloudApp` data source is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.appplatform.get_spring_cloud_app(name=example_azurerm_spring_cloud_app["name"],
        resource_group_name=example_azurerm_spring_cloud_app["resourceGroupName"],
        service_name=example_azurerm_spring_cloud_app["serviceName"])
    pulumi.export("springCloudAppId", example.id)
    ```


    :param _builtins.str name: The name of the Spring Cloud Application.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Spring Cloud Application exists.
    :param _builtins.str service_name: The name of the Spring Cloud Service.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['serviceName'] = service_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:appplatform/getSpringCloudApp:getSpringCloudApp', __args__, opts=opts, typ=GetSpringCloudAppResult).value

    return AwaitableGetSpringCloudAppResult(
        fqdn=pulumi.get(__ret__, 'fqdn'),
        https_only=pulumi.get(__ret__, 'https_only'),
        id=pulumi.get(__ret__, 'id'),
        identities=pulumi.get(__ret__, 'identities'),
        is_public=pulumi.get(__ret__, 'is_public'),
        name=pulumi.get(__ret__, 'name'),
        persistent_disks=pulumi.get(__ret__, 'persistent_disks'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        service_name=pulumi.get(__ret__, 'service_name'),
        tls_enabled=pulumi.get(__ret__, 'tls_enabled'),
        url=pulumi.get(__ret__, 'url'))
def get_spring_cloud_app_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                service_name: Optional[pulumi.Input[_builtins.str]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSpringCloudAppResult]:
    """
    Use this data source to access information about an existing Spring Cloud Application.

    !> **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `appplatform.SpringCloudApp` data source is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.appplatform.get_spring_cloud_app(name=example_azurerm_spring_cloud_app["name"],
        resource_group_name=example_azurerm_spring_cloud_app["resourceGroupName"],
        service_name=example_azurerm_spring_cloud_app["serviceName"])
    pulumi.export("springCloudAppId", example.id)
    ```


    :param _builtins.str name: The name of the Spring Cloud Application.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Spring Cloud Application exists.
    :param _builtins.str service_name: The name of the Spring Cloud Service.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['serviceName'] = service_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:appplatform/getSpringCloudApp:getSpringCloudApp', __args__, opts=opts, typ=GetSpringCloudAppResult)
    return __ret__.apply(lambda __response__: GetSpringCloudAppResult(
        fqdn=pulumi.get(__response__, 'fqdn'),
        https_only=pulumi.get(__response__, 'https_only'),
        id=pulumi.get(__response__, 'id'),
        identities=pulumi.get(__response__, 'identities'),
        is_public=pulumi.get(__response__, 'is_public'),
        name=pulumi.get(__response__, 'name'),
        persistent_disks=pulumi.get(__response__, 'persistent_disks'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        service_name=pulumi.get(__response__, 'service_name'),
        tls_enabled=pulumi.get(__response__, 'tls_enabled'),
        url=pulumi.get(__response__, 'url')))
