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
from ._inputs import *

__all__ = [
    'GetStandardResult',
    'AwaitableGetStandardResult',
    'get_standard',
    'get_standard_output',
]

@pulumi.output_type
class GetStandardResult:
    """
    A collection of values returned by getStandard.
    """
    def __init__(__self__, app_service_plan_id=None, app_settings=None, bundle_version=None, client_affinity_enabled=None, client_certificate_mode=None, connection_strings=None, custom_domain_verification_id=None, default_hostname=None, enabled=None, ftp_publish_basic_authentication_enabled=None, https_only=None, id=None, identities=None, kind=None, location=None, name=None, outbound_ip_addresses=None, possible_outbound_ip_addresses=None, public_network_access=None, resource_group_name=None, scm_publish_basic_authentication_enabled=None, site_config=None, site_credentials=None, storage_account_access_key=None, storage_account_name=None, storage_account_share_name=None, tags=None, use_extension_bundle=None, version=None, virtual_network_subnet_id=None):
        if app_service_plan_id and not isinstance(app_service_plan_id, str):
            raise TypeError("Expected argument 'app_service_plan_id' to be a str")
        pulumi.set(__self__, "app_service_plan_id", app_service_plan_id)
        if app_settings and not isinstance(app_settings, dict):
            raise TypeError("Expected argument 'app_settings' to be a dict")
        pulumi.set(__self__, "app_settings", app_settings)
        if bundle_version and not isinstance(bundle_version, str):
            raise TypeError("Expected argument 'bundle_version' to be a str")
        pulumi.set(__self__, "bundle_version", bundle_version)
        if client_affinity_enabled and not isinstance(client_affinity_enabled, bool):
            raise TypeError("Expected argument 'client_affinity_enabled' to be a bool")
        pulumi.set(__self__, "client_affinity_enabled", client_affinity_enabled)
        if client_certificate_mode and not isinstance(client_certificate_mode, str):
            raise TypeError("Expected argument 'client_certificate_mode' to be a str")
        pulumi.set(__self__, "client_certificate_mode", client_certificate_mode)
        if connection_strings and not isinstance(connection_strings, list):
            raise TypeError("Expected argument 'connection_strings' to be a list")
        pulumi.set(__self__, "connection_strings", connection_strings)
        if custom_domain_verification_id and not isinstance(custom_domain_verification_id, str):
            raise TypeError("Expected argument 'custom_domain_verification_id' to be a str")
        pulumi.set(__self__, "custom_domain_verification_id", custom_domain_verification_id)
        if default_hostname and not isinstance(default_hostname, str):
            raise TypeError("Expected argument 'default_hostname' to be a str")
        pulumi.set(__self__, "default_hostname", default_hostname)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if ftp_publish_basic_authentication_enabled and not isinstance(ftp_publish_basic_authentication_enabled, bool):
            raise TypeError("Expected argument 'ftp_publish_basic_authentication_enabled' to be a bool")
        pulumi.set(__self__, "ftp_publish_basic_authentication_enabled", ftp_publish_basic_authentication_enabled)
        if https_only and not isinstance(https_only, bool):
            raise TypeError("Expected argument 'https_only' to be a bool")
        pulumi.set(__self__, "https_only", https_only)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identities and not isinstance(identities, list):
            raise TypeError("Expected argument 'identities' to be a list")
        pulumi.set(__self__, "identities", identities)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if outbound_ip_addresses and not isinstance(outbound_ip_addresses, str):
            raise TypeError("Expected argument 'outbound_ip_addresses' to be a str")
        pulumi.set(__self__, "outbound_ip_addresses", outbound_ip_addresses)
        if possible_outbound_ip_addresses and not isinstance(possible_outbound_ip_addresses, str):
            raise TypeError("Expected argument 'possible_outbound_ip_addresses' to be a str")
        pulumi.set(__self__, "possible_outbound_ip_addresses", possible_outbound_ip_addresses)
        if public_network_access and not isinstance(public_network_access, str):
            raise TypeError("Expected argument 'public_network_access' to be a str")
        pulumi.set(__self__, "public_network_access", public_network_access)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if scm_publish_basic_authentication_enabled and not isinstance(scm_publish_basic_authentication_enabled, bool):
            raise TypeError("Expected argument 'scm_publish_basic_authentication_enabled' to be a bool")
        pulumi.set(__self__, "scm_publish_basic_authentication_enabled", scm_publish_basic_authentication_enabled)
        if site_config and not isinstance(site_config, dict):
            raise TypeError("Expected argument 'site_config' to be a dict")
        pulumi.set(__self__, "site_config", site_config)
        if site_credentials and not isinstance(site_credentials, list):
            raise TypeError("Expected argument 'site_credentials' to be a list")
        pulumi.set(__self__, "site_credentials", site_credentials)
        if storage_account_access_key and not isinstance(storage_account_access_key, str):
            raise TypeError("Expected argument 'storage_account_access_key' to be a str")
        pulumi.set(__self__, "storage_account_access_key", storage_account_access_key)
        if storage_account_name and not isinstance(storage_account_name, str):
            raise TypeError("Expected argument 'storage_account_name' to be a str")
        pulumi.set(__self__, "storage_account_name", storage_account_name)
        if storage_account_share_name and not isinstance(storage_account_share_name, str):
            raise TypeError("Expected argument 'storage_account_share_name' to be a str")
        pulumi.set(__self__, "storage_account_share_name", storage_account_share_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if use_extension_bundle and not isinstance(use_extension_bundle, bool):
            raise TypeError("Expected argument 'use_extension_bundle' to be a bool")
        pulumi.set(__self__, "use_extension_bundle", use_extension_bundle)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)
        if virtual_network_subnet_id and not isinstance(virtual_network_subnet_id, str):
            raise TypeError("Expected argument 'virtual_network_subnet_id' to be a str")
        pulumi.set(__self__, "virtual_network_subnet_id", virtual_network_subnet_id)

    @_builtins.property
    @pulumi.getter(name="appServicePlanId")
    def app_service_plan_id(self) -> _builtins.str:
        """
        The ID of the App Service Plan.
        """
        return pulumi.get(self, "app_service_plan_id")

    @_builtins.property
    @pulumi.getter(name="appSettings")
    def app_settings(self) -> Mapping[str, _builtins.str]:
        """
        A map of key-value pairs for [App Settings](https://docs.microsoft.com/azure/azure-functions/functions-app-settings) and custom values.
        """
        return pulumi.get(self, "app_settings")

    @_builtins.property
    @pulumi.getter(name="bundleVersion")
    def bundle_version(self) -> _builtins.str:
        """
        Controls the allowed range for bundle versions.
        """
        return pulumi.get(self, "bundle_version")

    @_builtins.property
    @pulumi.getter(name="clientAffinityEnabled")
    def client_affinity_enabled(self) -> _builtins.bool:
        """
        Should the Logic App send session affinity cookies, which route client requests in the same session to the same instance.
        """
        return pulumi.get(self, "client_affinity_enabled")

    @_builtins.property
    @pulumi.getter(name="clientCertificateMode")
    def client_certificate_mode(self) -> _builtins.str:
        """
        The mode of the Logic App's client certificates requirement for incoming requests.
        """
        return pulumi.get(self, "client_certificate_mode")

    @_builtins.property
    @pulumi.getter(name="connectionStrings")
    def connection_strings(self) -> Sequence['outputs.GetStandardConnectionStringResult']:
        """
        A `connection_string` block as defined below.
        """
        return pulumi.get(self, "connection_strings")

    @_builtins.property
    @pulumi.getter(name="customDomainVerificationId")
    def custom_domain_verification_id(self) -> _builtins.str:
        """
        The custom domain verification of the Logic App.
        """
        return pulumi.get(self, "custom_domain_verification_id")

    @_builtins.property
    @pulumi.getter(name="defaultHostname")
    def default_hostname(self) -> _builtins.str:
        """
        The default hostname of the Logic App.
        """
        return pulumi.get(self, "default_hostname")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> _builtins.bool:
        """
        Whether the Logic App is enabled.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="ftpPublishBasicAuthenticationEnabled")
    def ftp_publish_basic_authentication_enabled(self) -> _builtins.bool:
        """
        Whether the default FTP basic authentication publishing profile is enabled.
        """
        return pulumi.get(self, "ftp_publish_basic_authentication_enabled")

    @_builtins.property
    @pulumi.getter(name="httpsOnly")
    def https_only(self) -> _builtins.bool:
        """
        Whether the Logic App can only be accessed via HTTPS.
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
    def identities(self) -> Sequence['outputs.GetStandardIdentityResult']:
        """
        An `identity` block as defined below.
        """
        return pulumi.get(self, "identities")

    @_builtins.property
    @pulumi.getter
    def kind(self) -> _builtins.str:
        """
        The kind of the Logic App.
        """
        return pulumi.get(self, "kind")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The Azure location where the Logic App Standard exists.
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
    @pulumi.getter(name="outboundIpAddresses")
    def outbound_ip_addresses(self) -> _builtins.str:
        """
        The outbound IP addresses of the Logic App.
        """
        return pulumi.get(self, "outbound_ip_addresses")

    @_builtins.property
    @pulumi.getter(name="possibleOutboundIpAddresses")
    def possible_outbound_ip_addresses(self) -> _builtins.str:
        """
        The possible outbound IP addresses of the Logic App.
        """
        return pulumi.get(self, "possible_outbound_ip_addresses")

    @_builtins.property
    @pulumi.getter(name="publicNetworkAccess")
    def public_network_access(self) -> _builtins.str:
        """
        Whether Public Network Access should be enabled or not.
        """
        return pulumi.get(self, "public_network_access")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="scmPublishBasicAuthenticationEnabled")
    def scm_publish_basic_authentication_enabled(self) -> _builtins.bool:
        """
        Whether the default SCM basic authentication publishing profile is enabled.
        """
        return pulumi.get(self, "scm_publish_basic_authentication_enabled")

    @_builtins.property
    @pulumi.getter(name="siteConfig")
    def site_config(self) -> 'outputs.GetStandardSiteConfigResult':
        """
        A `site_config` object as defined below.
        """
        return pulumi.get(self, "site_config")

    @_builtins.property
    @pulumi.getter(name="siteCredentials")
    def site_credentials(self) -> Sequence['outputs.GetStandardSiteCredentialResult']:
        """
        A `site_credential` block as defined below, which contains the site-level credentials used to publish to this Logic App.
        """
        return pulumi.get(self, "site_credentials")

    @_builtins.property
    @pulumi.getter(name="storageAccountAccessKey")
    def storage_account_access_key(self) -> _builtins.str:
        """
        The access key which will be used to access the backend storage account for the Logic App.
        """
        return pulumi.get(self, "storage_account_access_key")

    @_builtins.property
    @pulumi.getter(name="storageAccountName")
    def storage_account_name(self) -> _builtins.str:
        """
        The backend storage account name which will be used by this Logic App (e.g. for Stateful workflows data).
        """
        return pulumi.get(self, "storage_account_name")

    @_builtins.property
    @pulumi.getter(name="storageAccountShareName")
    def storage_account_share_name(self) -> _builtins.str:
        """
        The name of the share used by the logic app.
        """
        return pulumi.get(self, "storage_account_share_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags assigned to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="useExtensionBundle")
    def use_extension_bundle(self) -> _builtins.bool:
        """
        Whether the logic app should use the bundled extension package.
        """
        return pulumi.get(self, "use_extension_bundle")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.str:
        """
        The runtime version associated with the Logic App.
        """
        return pulumi.get(self, "version")

    @_builtins.property
    @pulumi.getter(name="virtualNetworkSubnetId")
    def virtual_network_subnet_id(self) -> _builtins.str:
        """
        The Virtual Network Subnet ID used for this IP Restriction.
        """
        return pulumi.get(self, "virtual_network_subnet_id")


class AwaitableGetStandardResult(GetStandardResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStandardResult(
            app_service_plan_id=self.app_service_plan_id,
            app_settings=self.app_settings,
            bundle_version=self.bundle_version,
            client_affinity_enabled=self.client_affinity_enabled,
            client_certificate_mode=self.client_certificate_mode,
            connection_strings=self.connection_strings,
            custom_domain_verification_id=self.custom_domain_verification_id,
            default_hostname=self.default_hostname,
            enabled=self.enabled,
            ftp_publish_basic_authentication_enabled=self.ftp_publish_basic_authentication_enabled,
            https_only=self.https_only,
            id=self.id,
            identities=self.identities,
            kind=self.kind,
            location=self.location,
            name=self.name,
            outbound_ip_addresses=self.outbound_ip_addresses,
            possible_outbound_ip_addresses=self.possible_outbound_ip_addresses,
            public_network_access=self.public_network_access,
            resource_group_name=self.resource_group_name,
            scm_publish_basic_authentication_enabled=self.scm_publish_basic_authentication_enabled,
            site_config=self.site_config,
            site_credentials=self.site_credentials,
            storage_account_access_key=self.storage_account_access_key,
            storage_account_name=self.storage_account_name,
            storage_account_share_name=self.storage_account_share_name,
            tags=self.tags,
            use_extension_bundle=self.use_extension_bundle,
            version=self.version,
            virtual_network_subnet_id=self.virtual_network_subnet_id)


def get_standard(name: Optional[_builtins.str] = None,
                 resource_group_name: Optional[_builtins.str] = None,
                 site_config: Optional[Union['GetStandardSiteConfigArgs', 'GetStandardSiteConfigArgsDict']] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStandardResult:
    """
    Use this data source to access information about an existing Logic App Standard instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.logicapps.get_standard(name="example-logic-app",
        resource_group_name="example-rg")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Web`: 2023-12-01


    :param _builtins.str name: The name of the Logic App.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Logic App exists.
    :param Union['GetStandardSiteConfigArgs', 'GetStandardSiteConfigArgsDict'] site_config: A `site_config` object as defined below.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['siteConfig'] = site_config
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:logicapps/getStandard:getStandard', __args__, opts=opts, typ=GetStandardResult).value

    return AwaitableGetStandardResult(
        app_service_plan_id=pulumi.get(__ret__, 'app_service_plan_id'),
        app_settings=pulumi.get(__ret__, 'app_settings'),
        bundle_version=pulumi.get(__ret__, 'bundle_version'),
        client_affinity_enabled=pulumi.get(__ret__, 'client_affinity_enabled'),
        client_certificate_mode=pulumi.get(__ret__, 'client_certificate_mode'),
        connection_strings=pulumi.get(__ret__, 'connection_strings'),
        custom_domain_verification_id=pulumi.get(__ret__, 'custom_domain_verification_id'),
        default_hostname=pulumi.get(__ret__, 'default_hostname'),
        enabled=pulumi.get(__ret__, 'enabled'),
        ftp_publish_basic_authentication_enabled=pulumi.get(__ret__, 'ftp_publish_basic_authentication_enabled'),
        https_only=pulumi.get(__ret__, 'https_only'),
        id=pulumi.get(__ret__, 'id'),
        identities=pulumi.get(__ret__, 'identities'),
        kind=pulumi.get(__ret__, 'kind'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        outbound_ip_addresses=pulumi.get(__ret__, 'outbound_ip_addresses'),
        possible_outbound_ip_addresses=pulumi.get(__ret__, 'possible_outbound_ip_addresses'),
        public_network_access=pulumi.get(__ret__, 'public_network_access'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        scm_publish_basic_authentication_enabled=pulumi.get(__ret__, 'scm_publish_basic_authentication_enabled'),
        site_config=pulumi.get(__ret__, 'site_config'),
        site_credentials=pulumi.get(__ret__, 'site_credentials'),
        storage_account_access_key=pulumi.get(__ret__, 'storage_account_access_key'),
        storage_account_name=pulumi.get(__ret__, 'storage_account_name'),
        storage_account_share_name=pulumi.get(__ret__, 'storage_account_share_name'),
        tags=pulumi.get(__ret__, 'tags'),
        use_extension_bundle=pulumi.get(__ret__, 'use_extension_bundle'),
        version=pulumi.get(__ret__, 'version'),
        virtual_network_subnet_id=pulumi.get(__ret__, 'virtual_network_subnet_id'))
def get_standard_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                        resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                        site_config: Optional[pulumi.Input[Optional[Union['GetStandardSiteConfigArgs', 'GetStandardSiteConfigArgsDict']]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetStandardResult]:
    """
    Use this data source to access information about an existing Logic App Standard instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.logicapps.get_standard(name="example-logic-app",
        resource_group_name="example-rg")
    pulumi.export("id", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Web`: 2023-12-01


    :param _builtins.str name: The name of the Logic App.
    :param _builtins.str resource_group_name: The name of the Resource Group where the Logic App exists.
    :param Union['GetStandardSiteConfigArgs', 'GetStandardSiteConfigArgsDict'] site_config: A `site_config` object as defined below.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['siteConfig'] = site_config
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:logicapps/getStandard:getStandard', __args__, opts=opts, typ=GetStandardResult)
    return __ret__.apply(lambda __response__: GetStandardResult(
        app_service_plan_id=pulumi.get(__response__, 'app_service_plan_id'),
        app_settings=pulumi.get(__response__, 'app_settings'),
        bundle_version=pulumi.get(__response__, 'bundle_version'),
        client_affinity_enabled=pulumi.get(__response__, 'client_affinity_enabled'),
        client_certificate_mode=pulumi.get(__response__, 'client_certificate_mode'),
        connection_strings=pulumi.get(__response__, 'connection_strings'),
        custom_domain_verification_id=pulumi.get(__response__, 'custom_domain_verification_id'),
        default_hostname=pulumi.get(__response__, 'default_hostname'),
        enabled=pulumi.get(__response__, 'enabled'),
        ftp_publish_basic_authentication_enabled=pulumi.get(__response__, 'ftp_publish_basic_authentication_enabled'),
        https_only=pulumi.get(__response__, 'https_only'),
        id=pulumi.get(__response__, 'id'),
        identities=pulumi.get(__response__, 'identities'),
        kind=pulumi.get(__response__, 'kind'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        outbound_ip_addresses=pulumi.get(__response__, 'outbound_ip_addresses'),
        possible_outbound_ip_addresses=pulumi.get(__response__, 'possible_outbound_ip_addresses'),
        public_network_access=pulumi.get(__response__, 'public_network_access'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        scm_publish_basic_authentication_enabled=pulumi.get(__response__, 'scm_publish_basic_authentication_enabled'),
        site_config=pulumi.get(__response__, 'site_config'),
        site_credentials=pulumi.get(__response__, 'site_credentials'),
        storage_account_access_key=pulumi.get(__response__, 'storage_account_access_key'),
        storage_account_name=pulumi.get(__response__, 'storage_account_name'),
        storage_account_share_name=pulumi.get(__response__, 'storage_account_share_name'),
        tags=pulumi.get(__response__, 'tags'),
        use_extension_bundle=pulumi.get(__response__, 'use_extension_bundle'),
        version=pulumi.get(__response__, 'version'),
        virtual_network_subnet_id=pulumi.get(__response__, 'virtual_network_subnet_id')))
