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
    'GetNamespaceResult',
    'AwaitableGetNamespaceResult',
    'get_namespace',
    'get_namespace_output',
]

@pulumi.output_type
class GetNamespaceResult:
    """
    A collection of values returned by getNamespace.
    """
    def __init__(__self__, enabled=None, id=None, location=None, name=None, namespace_type=None, resource_group_name=None, servicebus_endpoint=None, sku=None, tags=None):
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if namespace_type and not isinstance(namespace_type, str):
            raise TypeError("Expected argument 'namespace_type' to be a str")
        pulumi.set(__self__, "namespace_type", namespace_type)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if servicebus_endpoint and not isinstance(servicebus_endpoint, str):
            raise TypeError("Expected argument 'servicebus_endpoint' to be a str")
        pulumi.set(__self__, "servicebus_endpoint", servicebus_endpoint)
        if sku and not isinstance(sku, dict):
            raise TypeError("Expected argument 'sku' to be a dict")
        pulumi.set(__self__, "sku", sku)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> _builtins.bool:
        """
        Is this Notification Hub Namespace enabled?
        """
        return pulumi.get(self, "enabled")

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
        The Azure Region in which this Notification Hub Namespace exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of the SKU to use for this Notification Hub Namespace. Possible values are `Free`, `Basic` or `Standard.`
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="namespaceType")
    def namespace_type(self) -> _builtins.str:
        """
        The Type of Namespace, such as `Messaging` or `NotificationHub`.
        """
        return pulumi.get(self, "namespace_type")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="servicebusEndpoint")
    def servicebus_endpoint(self) -> _builtins.str:
        return pulumi.get(self, "servicebus_endpoint")

    @_builtins.property
    @pulumi.getter
    def sku(self) -> 'outputs.GetNamespaceSkuResult':
        """
        A `sku` block as defined below.
        """
        return pulumi.get(self, "sku")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")


class AwaitableGetNamespaceResult(GetNamespaceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNamespaceResult(
            enabled=self.enabled,
            id=self.id,
            location=self.location,
            name=self.name,
            namespace_type=self.namespace_type,
            resource_group_name=self.resource_group_name,
            servicebus_endpoint=self.servicebus_endpoint,
            sku=self.sku,
            tags=self.tags)


def get_namespace(name: Optional[_builtins.str] = None,
                  resource_group_name: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNamespaceResult:
    """
    Use this data source to access information about an existing Notification Hub Namespace.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.notificationhub.get_namespace(name="my-namespace",
        resource_group_name="my-resource-group")
    pulumi.export("servicebusEndpoint", example.servicebus_endpoint)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.NotificationHubs`: 2023-09-01


    :param _builtins.str name: Specifies the Name of the Notification Hub Namespace.
    :param _builtins.str resource_group_name: Specifies the Name of the Resource Group within which the Notification Hub exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:notificationhub/getNamespace:getNamespace', __args__, opts=opts, typ=GetNamespaceResult).value

    return AwaitableGetNamespaceResult(
        enabled=pulumi.get(__ret__, 'enabled'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        namespace_type=pulumi.get(__ret__, 'namespace_type'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        servicebus_endpoint=pulumi.get(__ret__, 'servicebus_endpoint'),
        sku=pulumi.get(__ret__, 'sku'),
        tags=pulumi.get(__ret__, 'tags'))
def get_namespace_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                         resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNamespaceResult]:
    """
    Use this data source to access information about an existing Notification Hub Namespace.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.notificationhub.get_namespace(name="my-namespace",
        resource_group_name="my-resource-group")
    pulumi.export("servicebusEndpoint", example.servicebus_endpoint)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.NotificationHubs`: 2023-09-01


    :param _builtins.str name: Specifies the Name of the Notification Hub Namespace.
    :param _builtins.str resource_group_name: Specifies the Name of the Resource Group within which the Notification Hub exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:notificationhub/getNamespace:getNamespace', __args__, opts=opts, typ=GetNamespaceResult)
    return __ret__.apply(lambda __response__: GetNamespaceResult(
        enabled=pulumi.get(__response__, 'enabled'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        namespace_type=pulumi.get(__response__, 'namespace_type'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        servicebus_endpoint=pulumi.get(__response__, 'servicebus_endpoint'),
        sku=pulumi.get(__response__, 'sku'),
        tags=pulumi.get(__response__, 'tags')))
