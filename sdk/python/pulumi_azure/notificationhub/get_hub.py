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
    'GetHubResult',
    'AwaitableGetHubResult',
    'get_hub',
    'get_hub_output',
]

@pulumi.output_type
class GetHubResult:
    """
    A collection of values returned by getHub.
    """
    def __init__(__self__, apns_credentials=None, gcm_credentials=None, id=None, location=None, name=None, namespace_name=None, resource_group_name=None, tags=None):
        if apns_credentials and not isinstance(apns_credentials, list):
            raise TypeError("Expected argument 'apns_credentials' to be a list")
        pulumi.set(__self__, "apns_credentials", apns_credentials)
        if gcm_credentials and not isinstance(gcm_credentials, list):
            raise TypeError("Expected argument 'gcm_credentials' to be a list")
        pulumi.set(__self__, "gcm_credentials", gcm_credentials)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if namespace_name and not isinstance(namespace_name, str):
            raise TypeError("Expected argument 'namespace_name' to be a str")
        pulumi.set(__self__, "namespace_name", namespace_name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="apnsCredentials")
    def apns_credentials(self) -> Sequence['outputs.GetHubApnsCredentialResult']:
        """
        A `apns_credential` block as defined below.
        """
        return pulumi.get(self, "apns_credentials")

    @_builtins.property
    @pulumi.getter(name="gcmCredentials")
    def gcm_credentials(self) -> Sequence['outputs.GetHubGcmCredentialResult']:
        """
        A `gcm_credential` block as defined below.
        """
        return pulumi.get(self, "gcm_credentials")

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
        The Azure Region in which this Notification Hub exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> _builtins.str:
        return pulumi.get(self, "namespace_name")

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


class AwaitableGetHubResult(GetHubResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHubResult(
            apns_credentials=self.apns_credentials,
            gcm_credentials=self.gcm_credentials,
            id=self.id,
            location=self.location,
            name=self.name,
            namespace_name=self.namespace_name,
            resource_group_name=self.resource_group_name,
            tags=self.tags)


def get_hub(name: Optional[_builtins.str] = None,
            namespace_name: Optional[_builtins.str] = None,
            resource_group_name: Optional[_builtins.str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHubResult:
    """
    Use this data source to access information about an existing Notification Hub within a Notification Hub Namespace.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.notificationhub.get_hub(name="notification-hub",
        namespace_name="namespace-name",
        resource_group_name="resource-group-name")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.NotificationHubs`: 2023-09-01


    :param _builtins.str name: Specifies the Name of the Notification Hub.
    :param _builtins.str namespace_name: Specifies the Name of the Notification Hub Namespace which contains the Notification Hub.
    :param _builtins.str resource_group_name: Specifies the Name of the Resource Group within which the Notification Hub exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['namespaceName'] = namespace_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:notificationhub/getHub:getHub', __args__, opts=opts, typ=GetHubResult).value

    return AwaitableGetHubResult(
        apns_credentials=pulumi.get(__ret__, 'apns_credentials'),
        gcm_credentials=pulumi.get(__ret__, 'gcm_credentials'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        namespace_name=pulumi.get(__ret__, 'namespace_name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        tags=pulumi.get(__ret__, 'tags'))
def get_hub_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                   namespace_name: Optional[pulumi.Input[_builtins.str]] = None,
                   resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetHubResult]:
    """
    Use this data source to access information about an existing Notification Hub within a Notification Hub Namespace.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.notificationhub.get_hub(name="notification-hub",
        namespace_name="namespace-name",
        resource_group_name="resource-group-name")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.NotificationHubs`: 2023-09-01


    :param _builtins.str name: Specifies the Name of the Notification Hub.
    :param _builtins.str namespace_name: Specifies the Name of the Notification Hub Namespace which contains the Notification Hub.
    :param _builtins.str resource_group_name: Specifies the Name of the Resource Group within which the Notification Hub exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['namespaceName'] = namespace_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:notificationhub/getHub:getHub', __args__, opts=opts, typ=GetHubResult)
    return __ret__.apply(lambda __response__: GetHubResult(
        apns_credentials=pulumi.get(__response__, 'apns_credentials'),
        gcm_credentials=pulumi.get(__response__, 'gcm_credentials'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        namespace_name=pulumi.get(__response__, 'namespace_name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        tags=pulumi.get(__response__, 'tags')))
