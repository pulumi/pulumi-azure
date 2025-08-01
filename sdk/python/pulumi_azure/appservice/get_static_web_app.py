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
    'GetStaticWebAppResult',
    'AwaitableGetStaticWebAppResult',
    'get_static_web_app',
    'get_static_web_app_output',
]

@pulumi.output_type
class GetStaticWebAppResult:
    """
    A collection of values returned by getStaticWebApp.
    """
    def __init__(__self__, api_key=None, app_settings=None, basic_auths=None, configuration_file_changes_enabled=None, default_host_name=None, id=None, identities=None, location=None, name=None, preview_environments_enabled=None, public_network_access_enabled=None, repository_branch=None, repository_url=None, resource_group_name=None, sku_size=None, sku_tier=None, tags=None):
        if api_key and not isinstance(api_key, str):
            raise TypeError("Expected argument 'api_key' to be a str")
        pulumi.set(__self__, "api_key", api_key)
        if app_settings and not isinstance(app_settings, dict):
            raise TypeError("Expected argument 'app_settings' to be a dict")
        pulumi.set(__self__, "app_settings", app_settings)
        if basic_auths and not isinstance(basic_auths, list):
            raise TypeError("Expected argument 'basic_auths' to be a list")
        pulumi.set(__self__, "basic_auths", basic_auths)
        if configuration_file_changes_enabled and not isinstance(configuration_file_changes_enabled, bool):
            raise TypeError("Expected argument 'configuration_file_changes_enabled' to be a bool")
        pulumi.set(__self__, "configuration_file_changes_enabled", configuration_file_changes_enabled)
        if default_host_name and not isinstance(default_host_name, str):
            raise TypeError("Expected argument 'default_host_name' to be a str")
        pulumi.set(__self__, "default_host_name", default_host_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identities and not isinstance(identities, list):
            raise TypeError("Expected argument 'identities' to be a list")
        pulumi.set(__self__, "identities", identities)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if preview_environments_enabled and not isinstance(preview_environments_enabled, bool):
            raise TypeError("Expected argument 'preview_environments_enabled' to be a bool")
        pulumi.set(__self__, "preview_environments_enabled", preview_environments_enabled)
        if public_network_access_enabled and not isinstance(public_network_access_enabled, bool):
            raise TypeError("Expected argument 'public_network_access_enabled' to be a bool")
        pulumi.set(__self__, "public_network_access_enabled", public_network_access_enabled)
        if repository_branch and not isinstance(repository_branch, str):
            raise TypeError("Expected argument 'repository_branch' to be a str")
        pulumi.set(__self__, "repository_branch", repository_branch)
        if repository_url and not isinstance(repository_url, str):
            raise TypeError("Expected argument 'repository_url' to be a str")
        pulumi.set(__self__, "repository_url", repository_url)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if sku_size and not isinstance(sku_size, str):
            raise TypeError("Expected argument 'sku_size' to be a str")
        pulumi.set(__self__, "sku_size", sku_size)
        if sku_tier and not isinstance(sku_tier, str):
            raise TypeError("Expected argument 'sku_tier' to be a str")
        pulumi.set(__self__, "sku_tier", sku_tier)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> _builtins.str:
        return pulumi.get(self, "api_key")

    @_builtins.property
    @pulumi.getter(name="appSettings")
    def app_settings(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "app_settings")

    @_builtins.property
    @pulumi.getter(name="basicAuths")
    def basic_auths(self) -> Sequence['outputs.GetStaticWebAppBasicAuthResult']:
        return pulumi.get(self, "basic_auths")

    @_builtins.property
    @pulumi.getter(name="configurationFileChangesEnabled")
    def configuration_file_changes_enabled(self) -> _builtins.bool:
        return pulumi.get(self, "configuration_file_changes_enabled")

    @_builtins.property
    @pulumi.getter(name="defaultHostName")
    def default_host_name(self) -> _builtins.str:
        return pulumi.get(self, "default_host_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def identities(self) -> Sequence['outputs.GetStaticWebAppIdentityResult']:
        return pulumi.get(self, "identities")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="previewEnvironmentsEnabled")
    def preview_environments_enabled(self) -> _builtins.bool:
        return pulumi.get(self, "preview_environments_enabled")

    @_builtins.property
    @pulumi.getter(name="publicNetworkAccessEnabled")
    def public_network_access_enabled(self) -> _builtins.bool:
        return pulumi.get(self, "public_network_access_enabled")

    @_builtins.property
    @pulumi.getter(name="repositoryBranch")
    def repository_branch(self) -> _builtins.str:
        return pulumi.get(self, "repository_branch")

    @_builtins.property
    @pulumi.getter(name="repositoryUrl")
    def repository_url(self) -> _builtins.str:
        return pulumi.get(self, "repository_url")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="skuSize")
    def sku_size(self) -> _builtins.str:
        return pulumi.get(self, "sku_size")

    @_builtins.property
    @pulumi.getter(name="skuTier")
    def sku_tier(self) -> _builtins.str:
        return pulumi.get(self, "sku_tier")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        return pulumi.get(self, "tags")


class AwaitableGetStaticWebAppResult(GetStaticWebAppResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStaticWebAppResult(
            api_key=self.api_key,
            app_settings=self.app_settings,
            basic_auths=self.basic_auths,
            configuration_file_changes_enabled=self.configuration_file_changes_enabled,
            default_host_name=self.default_host_name,
            id=self.id,
            identities=self.identities,
            location=self.location,
            name=self.name,
            preview_environments_enabled=self.preview_environments_enabled,
            public_network_access_enabled=self.public_network_access_enabled,
            repository_branch=self.repository_branch,
            repository_url=self.repository_url,
            resource_group_name=self.resource_group_name,
            sku_size=self.sku_size,
            sku_tier=self.sku_tier,
            tags=self.tags)


def get_static_web_app(name: Optional[_builtins.str] = None,
                       resource_group_name: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStaticWebAppResult:
    """
    Use this data source to access information about an existing Static Web App.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.appservice.get_static_web_app(name="existing",
        resource_group_name="existing")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Web`: 2023-01-01


    :param _builtins.str name: The name of this Static Web App.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Static Web App exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:appservice/getStaticWebApp:getStaticWebApp', __args__, opts=opts, typ=GetStaticWebAppResult).value

    return AwaitableGetStaticWebAppResult(
        api_key=pulumi.get(__ret__, 'api_key'),
        app_settings=pulumi.get(__ret__, 'app_settings'),
        basic_auths=pulumi.get(__ret__, 'basic_auths'),
        configuration_file_changes_enabled=pulumi.get(__ret__, 'configuration_file_changes_enabled'),
        default_host_name=pulumi.get(__ret__, 'default_host_name'),
        id=pulumi.get(__ret__, 'id'),
        identities=pulumi.get(__ret__, 'identities'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        preview_environments_enabled=pulumi.get(__ret__, 'preview_environments_enabled'),
        public_network_access_enabled=pulumi.get(__ret__, 'public_network_access_enabled'),
        repository_branch=pulumi.get(__ret__, 'repository_branch'),
        repository_url=pulumi.get(__ret__, 'repository_url'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        sku_size=pulumi.get(__ret__, 'sku_size'),
        sku_tier=pulumi.get(__ret__, 'sku_tier'),
        tags=pulumi.get(__ret__, 'tags'))
def get_static_web_app_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                              resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetStaticWebAppResult]:
    """
    Use this data source to access information about an existing Static Web App.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.appservice.get_static_web_app(name="existing",
        resource_group_name="existing")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Web`: 2023-01-01


    :param _builtins.str name: The name of this Static Web App.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Static Web App exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:appservice/getStaticWebApp:getStaticWebApp', __args__, opts=opts, typ=GetStaticWebAppResult)
    return __ret__.apply(lambda __response__: GetStaticWebAppResult(
        api_key=pulumi.get(__response__, 'api_key'),
        app_settings=pulumi.get(__response__, 'app_settings'),
        basic_auths=pulumi.get(__response__, 'basic_auths'),
        configuration_file_changes_enabled=pulumi.get(__response__, 'configuration_file_changes_enabled'),
        default_host_name=pulumi.get(__response__, 'default_host_name'),
        id=pulumi.get(__response__, 'id'),
        identities=pulumi.get(__response__, 'identities'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        preview_environments_enabled=pulumi.get(__response__, 'preview_environments_enabled'),
        public_network_access_enabled=pulumi.get(__response__, 'public_network_access_enabled'),
        repository_branch=pulumi.get(__response__, 'repository_branch'),
        repository_url=pulumi.get(__response__, 'repository_url'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        sku_size=pulumi.get(__response__, 'sku_size'),
        sku_tier=pulumi.get(__response__, 'sku_tier'),
        tags=pulumi.get(__response__, 'tags')))
