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
    'GetAppServiceResult',
    'AwaitableGetAppServiceResult',
    'get_app_service',
    'get_app_service_output',
]

@pulumi.output_type
class GetAppServiceResult:
    """
    A collection of values returned by getAppService.
    """
    def __init__(__self__, app_service_plan_id=None, app_settings=None, client_affinity_enabled=None, client_cert_enabled=None, connection_strings=None, custom_domain_verification_id=None, default_site_hostname=None, enabled=None, https_only=None, id=None, location=None, name=None, outbound_ip_address_lists=None, outbound_ip_addresses=None, possible_outbound_ip_address_lists=None, possible_outbound_ip_addresses=None, resource_group_name=None, site_configs=None, site_credentials=None, source_controls=None, tags=None):
        if app_service_plan_id and not isinstance(app_service_plan_id, str):
            raise TypeError("Expected argument 'app_service_plan_id' to be a str")
        pulumi.set(__self__, "app_service_plan_id", app_service_plan_id)
        if app_settings and not isinstance(app_settings, dict):
            raise TypeError("Expected argument 'app_settings' to be a dict")
        pulumi.set(__self__, "app_settings", app_settings)
        if client_affinity_enabled and not isinstance(client_affinity_enabled, bool):
            raise TypeError("Expected argument 'client_affinity_enabled' to be a bool")
        pulumi.set(__self__, "client_affinity_enabled", client_affinity_enabled)
        if client_cert_enabled and not isinstance(client_cert_enabled, bool):
            raise TypeError("Expected argument 'client_cert_enabled' to be a bool")
        pulumi.set(__self__, "client_cert_enabled", client_cert_enabled)
        if connection_strings and not isinstance(connection_strings, list):
            raise TypeError("Expected argument 'connection_strings' to be a list")
        pulumi.set(__self__, "connection_strings", connection_strings)
        if custom_domain_verification_id and not isinstance(custom_domain_verification_id, str):
            raise TypeError("Expected argument 'custom_domain_verification_id' to be a str")
        pulumi.set(__self__, "custom_domain_verification_id", custom_domain_verification_id)
        if default_site_hostname and not isinstance(default_site_hostname, str):
            raise TypeError("Expected argument 'default_site_hostname' to be a str")
        pulumi.set(__self__, "default_site_hostname", default_site_hostname)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if https_only and not isinstance(https_only, bool):
            raise TypeError("Expected argument 'https_only' to be a bool")
        pulumi.set(__self__, "https_only", https_only)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if outbound_ip_address_lists and not isinstance(outbound_ip_address_lists, list):
            raise TypeError("Expected argument 'outbound_ip_address_lists' to be a list")
        pulumi.set(__self__, "outbound_ip_address_lists", outbound_ip_address_lists)
        if outbound_ip_addresses and not isinstance(outbound_ip_addresses, str):
            raise TypeError("Expected argument 'outbound_ip_addresses' to be a str")
        pulumi.set(__self__, "outbound_ip_addresses", outbound_ip_addresses)
        if possible_outbound_ip_address_lists and not isinstance(possible_outbound_ip_address_lists, list):
            raise TypeError("Expected argument 'possible_outbound_ip_address_lists' to be a list")
        pulumi.set(__self__, "possible_outbound_ip_address_lists", possible_outbound_ip_address_lists)
        if possible_outbound_ip_addresses and not isinstance(possible_outbound_ip_addresses, str):
            raise TypeError("Expected argument 'possible_outbound_ip_addresses' to be a str")
        pulumi.set(__self__, "possible_outbound_ip_addresses", possible_outbound_ip_addresses)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if site_configs and not isinstance(site_configs, list):
            raise TypeError("Expected argument 'site_configs' to be a list")
        pulumi.set(__self__, "site_configs", site_configs)
        if site_credentials and not isinstance(site_credentials, list):
            raise TypeError("Expected argument 'site_credentials' to be a list")
        pulumi.set(__self__, "site_credentials", site_credentials)
        if source_controls and not isinstance(source_controls, list):
            raise TypeError("Expected argument 'source_controls' to be a list")
        pulumi.set(__self__, "source_controls", source_controls)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="appServicePlanId")
    def app_service_plan_id(self) -> _builtins.str:
        """
        The ID of the App Service Plan within which the App Service exists.
        """
        return pulumi.get(self, "app_service_plan_id")

    @_builtins.property
    @pulumi.getter(name="appSettings")
    def app_settings(self) -> Mapping[str, _builtins.str]:
        """
        A key-value pair of App Settings for the App Service.
        """
        return pulumi.get(self, "app_settings")

    @_builtins.property
    @pulumi.getter(name="clientAffinityEnabled")
    def client_affinity_enabled(self) -> _builtins.bool:
        """
        Does the App Service send session affinity cookies, which route client requests in the same session to the same instance?
        """
        return pulumi.get(self, "client_affinity_enabled")

    @_builtins.property
    @pulumi.getter(name="clientCertEnabled")
    def client_cert_enabled(self) -> _builtins.bool:
        """
        Does the App Service require client certificates for incoming requests?
        """
        return pulumi.get(self, "client_cert_enabled")

    @_builtins.property
    @pulumi.getter(name="connectionStrings")
    def connection_strings(self) -> Sequence['outputs.GetAppServiceConnectionStringResult']:
        """
        An `connection_string` block as defined below.
        """
        return pulumi.get(self, "connection_strings")

    @_builtins.property
    @pulumi.getter(name="customDomainVerificationId")
    def custom_domain_verification_id(self) -> _builtins.str:
        """
        An identifier used by App Service to perform domain ownership verification via DNS TXT record.
        """
        return pulumi.get(self, "custom_domain_verification_id")

    @_builtins.property
    @pulumi.getter(name="defaultSiteHostname")
    def default_site_hostname(self) -> _builtins.str:
        """
        The Default Hostname associated with the App Service - such as `mysite.azurewebsites.net`
        """
        return pulumi.get(self, "default_site_hostname")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> _builtins.bool:
        """
        Is the App Service Enabled?
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="httpsOnly")
    def https_only(self) -> _builtins.bool:
        """
        Can the App Service only be accessed via HTTPS?
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
    def location(self) -> _builtins.str:
        """
        The Azure location where the App Service exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name for this IP Restriction.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="outboundIpAddressLists")
    def outbound_ip_address_lists(self) -> Sequence[_builtins.str]:
        """
        A list of outbound IP addresses - such as `["52.23.25.3", "52.143.43.12"]`
        """
        return pulumi.get(self, "outbound_ip_address_lists")

    @_builtins.property
    @pulumi.getter(name="outboundIpAddresses")
    def outbound_ip_addresses(self) -> _builtins.str:
        """
        A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`
        """
        return pulumi.get(self, "outbound_ip_addresses")

    @_builtins.property
    @pulumi.getter(name="possibleOutboundIpAddressLists")
    def possible_outbound_ip_address_lists(self) -> Sequence[_builtins.str]:
        """
        A list of outbound IP addresses - such as `["52.23.25.3", "52.143.43.12", "52.143.43.17"]` - not all of which are necessarily in use. Superset of `outbound_ip_address_list`.
        """
        return pulumi.get(self, "possible_outbound_ip_address_lists")

    @_builtins.property
    @pulumi.getter(name="possibleOutboundIpAddresses")
    def possible_outbound_ip_addresses(self) -> _builtins.str:
        """
        A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
        """
        return pulumi.get(self, "possible_outbound_ip_addresses")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="siteConfigs")
    def site_configs(self) -> Sequence['outputs.GetAppServiceSiteConfigResult']:
        """
        A `site_config` block as defined below.
        """
        return pulumi.get(self, "site_configs")

    @_builtins.property
    @pulumi.getter(name="siteCredentials")
    def site_credentials(self) -> Sequence['outputs.GetAppServiceSiteCredentialResult']:
        return pulumi.get(self, "site_credentials")

    @_builtins.property
    @pulumi.getter(name="sourceControls")
    def source_controls(self) -> Sequence['outputs.GetAppServiceSourceControlResult']:
        """
        A `source_control` block as defined below.
        """
        return pulumi.get(self, "source_controls")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")


class AwaitableGetAppServiceResult(GetAppServiceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppServiceResult(
            app_service_plan_id=self.app_service_plan_id,
            app_settings=self.app_settings,
            client_affinity_enabled=self.client_affinity_enabled,
            client_cert_enabled=self.client_cert_enabled,
            connection_strings=self.connection_strings,
            custom_domain_verification_id=self.custom_domain_verification_id,
            default_site_hostname=self.default_site_hostname,
            enabled=self.enabled,
            https_only=self.https_only,
            id=self.id,
            location=self.location,
            name=self.name,
            outbound_ip_address_lists=self.outbound_ip_address_lists,
            outbound_ip_addresses=self.outbound_ip_addresses,
            possible_outbound_ip_address_lists=self.possible_outbound_ip_address_lists,
            possible_outbound_ip_addresses=self.possible_outbound_ip_addresses,
            resource_group_name=self.resource_group_name,
            site_configs=self.site_configs,
            site_credentials=self.site_credentials,
            source_controls=self.source_controls,
            tags=self.tags)


def get_app_service(name: Optional[_builtins.str] = None,
                    resource_group_name: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppServiceResult:
    """
    Use this data source to access information about an existing App Service.

    !> **Note:** The `appservice.AppService` data source is deprecated in version 5.0 of the provider and will be removed in version 6.0. Please use the `appservice.LinuxWebApp` and `appservice.WindowsWebApp` data sources instead.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.appservice.get_app_service(name="search-app-service",
        resource_group_name="search-service")
    pulumi.export("appServiceId", example.id)
    ```


    :param _builtins.str name: The name of the App Service.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the App Service exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:appservice/getAppService:getAppService', __args__, opts=opts, typ=GetAppServiceResult).value

    return AwaitableGetAppServiceResult(
        app_service_plan_id=pulumi.get(__ret__, 'app_service_plan_id'),
        app_settings=pulumi.get(__ret__, 'app_settings'),
        client_affinity_enabled=pulumi.get(__ret__, 'client_affinity_enabled'),
        client_cert_enabled=pulumi.get(__ret__, 'client_cert_enabled'),
        connection_strings=pulumi.get(__ret__, 'connection_strings'),
        custom_domain_verification_id=pulumi.get(__ret__, 'custom_domain_verification_id'),
        default_site_hostname=pulumi.get(__ret__, 'default_site_hostname'),
        enabled=pulumi.get(__ret__, 'enabled'),
        https_only=pulumi.get(__ret__, 'https_only'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        outbound_ip_address_lists=pulumi.get(__ret__, 'outbound_ip_address_lists'),
        outbound_ip_addresses=pulumi.get(__ret__, 'outbound_ip_addresses'),
        possible_outbound_ip_address_lists=pulumi.get(__ret__, 'possible_outbound_ip_address_lists'),
        possible_outbound_ip_addresses=pulumi.get(__ret__, 'possible_outbound_ip_addresses'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        site_configs=pulumi.get(__ret__, 'site_configs'),
        site_credentials=pulumi.get(__ret__, 'site_credentials'),
        source_controls=pulumi.get(__ret__, 'source_controls'),
        tags=pulumi.get(__ret__, 'tags'))
def get_app_service_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                           resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppServiceResult]:
    """
    Use this data source to access information about an existing App Service.

    !> **Note:** The `appservice.AppService` data source is deprecated in version 5.0 of the provider and will be removed in version 6.0. Please use the `appservice.LinuxWebApp` and `appservice.WindowsWebApp` data sources instead.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.appservice.get_app_service(name="search-app-service",
        resource_group_name="search-service")
    pulumi.export("appServiceId", example.id)
    ```


    :param _builtins.str name: The name of the App Service.
    :param _builtins.str resource_group_name: The Name of the Resource Group where the App Service exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:appservice/getAppService:getAppService', __args__, opts=opts, typ=GetAppServiceResult)
    return __ret__.apply(lambda __response__: GetAppServiceResult(
        app_service_plan_id=pulumi.get(__response__, 'app_service_plan_id'),
        app_settings=pulumi.get(__response__, 'app_settings'),
        client_affinity_enabled=pulumi.get(__response__, 'client_affinity_enabled'),
        client_cert_enabled=pulumi.get(__response__, 'client_cert_enabled'),
        connection_strings=pulumi.get(__response__, 'connection_strings'),
        custom_domain_verification_id=pulumi.get(__response__, 'custom_domain_verification_id'),
        default_site_hostname=pulumi.get(__response__, 'default_site_hostname'),
        enabled=pulumi.get(__response__, 'enabled'),
        https_only=pulumi.get(__response__, 'https_only'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        outbound_ip_address_lists=pulumi.get(__response__, 'outbound_ip_address_lists'),
        outbound_ip_addresses=pulumi.get(__response__, 'outbound_ip_addresses'),
        possible_outbound_ip_address_lists=pulumi.get(__response__, 'possible_outbound_ip_address_lists'),
        possible_outbound_ip_addresses=pulumi.get(__response__, 'possible_outbound_ip_addresses'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        site_configs=pulumi.get(__response__, 'site_configs'),
        site_credentials=pulumi.get(__response__, 'site_credentials'),
        source_controls=pulumi.get(__response__, 'source_controls'),
        tags=pulumi.get(__response__, 'tags')))
