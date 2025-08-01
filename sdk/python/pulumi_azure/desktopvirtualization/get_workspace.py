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
    'GetWorkspaceResult',
    'AwaitableGetWorkspaceResult',
    'get_workspace',
    'get_workspace_output',
]

@pulumi.output_type
class GetWorkspaceResult:
    """
    A collection of values returned by getWorkspace.
    """
    def __init__(__self__, description=None, friendly_name=None, id=None, location=None, name=None, public_network_access_enabled=None, resource_group_name=None, tags=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if friendly_name and not isinstance(friendly_name, str):
            raise TypeError("Expected argument 'friendly_name' to be a str")
        pulumi.set(__self__, "friendly_name", friendly_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if public_network_access_enabled and not isinstance(public_network_access_enabled, bool):
            raise TypeError("Expected argument 'public_network_access_enabled' to be a bool")
        pulumi.set(__self__, "public_network_access_enabled", public_network_access_enabled)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The description for the Virtual Desktop Workspace.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="friendlyName")
    def friendly_name(self) -> _builtins.str:
        """
        The friendly name for the Virtual Desktop Workspace.
        """
        return pulumi.get(self, "friendly_name")

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
        The Azure Region where the Virtual Desktop Workspace exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="publicNetworkAccessEnabled")
    def public_network_access_enabled(self) -> _builtins.bool:
        """
        Is public network access enabled?
        """
        return pulumi.get(self, "public_network_access_enabled")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags assigned to the Virtual Desktop Workspace.
        """
        return pulumi.get(self, "tags")


class AwaitableGetWorkspaceResult(GetWorkspaceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWorkspaceResult(
            description=self.description,
            friendly_name=self.friendly_name,
            id=self.id,
            location=self.location,
            name=self.name,
            public_network_access_enabled=self.public_network_access_enabled,
            resource_group_name=self.resource_group_name,
            tags=self.tags)


def get_workspace(name: Optional[_builtins.str] = None,
                  resource_group_name: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWorkspaceResult:
    """
    Use this data source to access information about an existing Virtual Desktop Workspace.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.desktopvirtualization.get_workspace(name="existing",
        resource_group_name="existing")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.DesktopVirtualization`: 2024-04-03


    :param _builtins.str name: The name of this Virtual Desktop Workspace to retrieve.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Virtual Desktop Workspace exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:desktopvirtualization/getWorkspace:getWorkspace', __args__, opts=opts, typ=GetWorkspaceResult).value

    return AwaitableGetWorkspaceResult(
        description=pulumi.get(__ret__, 'description'),
        friendly_name=pulumi.get(__ret__, 'friendly_name'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        public_network_access_enabled=pulumi.get(__ret__, 'public_network_access_enabled'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        tags=pulumi.get(__ret__, 'tags'))
def get_workspace_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                         resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetWorkspaceResult]:
    """
    Use this data source to access information about an existing Virtual Desktop Workspace.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.desktopvirtualization.get_workspace(name="existing",
        resource_group_name="existing")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.DesktopVirtualization`: 2024-04-03


    :param _builtins.str name: The name of this Virtual Desktop Workspace to retrieve.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Virtual Desktop Workspace exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:desktopvirtualization/getWorkspace:getWorkspace', __args__, opts=opts, typ=GetWorkspaceResult)
    return __ret__.apply(lambda __response__: GetWorkspaceResult(
        description=pulumi.get(__response__, 'description'),
        friendly_name=pulumi.get(__response__, 'friendly_name'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        public_network_access_enabled=pulumi.get(__response__, 'public_network_access_enabled'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        tags=pulumi.get(__response__, 'tags')))
