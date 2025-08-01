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
    'GetAppResult',
    'AwaitableGetAppResult',
    'get_app',
    'get_app_output',
]

@pulumi.output_type
class GetAppResult:
    """
    A collection of values returned by getApp.
    """
    def __init__(__self__, container_app_environment_id=None, custom_domain_verification_id=None, daprs=None, id=None, identities=None, ingresses=None, latest_revision_fqdn=None, latest_revision_name=None, location=None, max_inactive_revisions=None, name=None, outbound_ip_addresses=None, registries=None, resource_group_name=None, revision_mode=None, secrets=None, tags=None, templates=None, workload_profile_name=None):
        if container_app_environment_id and not isinstance(container_app_environment_id, str):
            raise TypeError("Expected argument 'container_app_environment_id' to be a str")
        pulumi.set(__self__, "container_app_environment_id", container_app_environment_id)
        if custom_domain_verification_id and not isinstance(custom_domain_verification_id, str):
            raise TypeError("Expected argument 'custom_domain_verification_id' to be a str")
        pulumi.set(__self__, "custom_domain_verification_id", custom_domain_verification_id)
        if daprs and not isinstance(daprs, list):
            raise TypeError("Expected argument 'daprs' to be a list")
        pulumi.set(__self__, "daprs", daprs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identities and not isinstance(identities, list):
            raise TypeError("Expected argument 'identities' to be a list")
        pulumi.set(__self__, "identities", identities)
        if ingresses and not isinstance(ingresses, list):
            raise TypeError("Expected argument 'ingresses' to be a list")
        pulumi.set(__self__, "ingresses", ingresses)
        if latest_revision_fqdn and not isinstance(latest_revision_fqdn, str):
            raise TypeError("Expected argument 'latest_revision_fqdn' to be a str")
        pulumi.set(__self__, "latest_revision_fqdn", latest_revision_fqdn)
        if latest_revision_name and not isinstance(latest_revision_name, str):
            raise TypeError("Expected argument 'latest_revision_name' to be a str")
        pulumi.set(__self__, "latest_revision_name", latest_revision_name)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if max_inactive_revisions and not isinstance(max_inactive_revisions, int):
            raise TypeError("Expected argument 'max_inactive_revisions' to be a int")
        pulumi.set(__self__, "max_inactive_revisions", max_inactive_revisions)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if outbound_ip_addresses and not isinstance(outbound_ip_addresses, list):
            raise TypeError("Expected argument 'outbound_ip_addresses' to be a list")
        pulumi.set(__self__, "outbound_ip_addresses", outbound_ip_addresses)
        if registries and not isinstance(registries, list):
            raise TypeError("Expected argument 'registries' to be a list")
        pulumi.set(__self__, "registries", registries)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if revision_mode and not isinstance(revision_mode, str):
            raise TypeError("Expected argument 'revision_mode' to be a str")
        pulumi.set(__self__, "revision_mode", revision_mode)
        if secrets and not isinstance(secrets, list):
            raise TypeError("Expected argument 'secrets' to be a list")
        pulumi.set(__self__, "secrets", secrets)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if templates and not isinstance(templates, list):
            raise TypeError("Expected argument 'templates' to be a list")
        pulumi.set(__self__, "templates", templates)
        if workload_profile_name and not isinstance(workload_profile_name, str):
            raise TypeError("Expected argument 'workload_profile_name' to be a str")
        pulumi.set(__self__, "workload_profile_name", workload_profile_name)

    @_builtins.property
    @pulumi.getter(name="containerAppEnvironmentId")
    def container_app_environment_id(self) -> _builtins.str:
        """
        The ID of the Container App Environment this Container App is linked to.
        """
        return pulumi.get(self, "container_app_environment_id")

    @_builtins.property
    @pulumi.getter(name="customDomainVerificationId")
    def custom_domain_verification_id(self) -> _builtins.str:
        return pulumi.get(self, "custom_domain_verification_id")

    @_builtins.property
    @pulumi.getter
    def daprs(self) -> Sequence['outputs.GetAppDaprResult']:
        """
        A `dapr` block as detailed below.
        """
        return pulumi.get(self, "daprs")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def identities(self) -> Sequence['outputs.GetAppIdentityResult']:
        """
        Resource ID for the User Assigned Managed identity to use when pulling from the Container Registry.
        """
        return pulumi.get(self, "identities")

    @_builtins.property
    @pulumi.getter
    def ingresses(self) -> Sequence['outputs.GetAppIngressResult']:
        """
        An `ingress` block as detailed below.
        """
        return pulumi.get(self, "ingresses")

    @_builtins.property
    @pulumi.getter(name="latestRevisionFqdn")
    def latest_revision_fqdn(self) -> _builtins.str:
        return pulumi.get(self, "latest_revision_fqdn")

    @_builtins.property
    @pulumi.getter(name="latestRevisionName")
    def latest_revision_name(self) -> _builtins.str:
        return pulumi.get(self, "latest_revision_name")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="maxInactiveRevisions")
    def max_inactive_revisions(self) -> _builtins.int:
        """
        The max inactive revisions for this Container App.
        """
        return pulumi.get(self, "max_inactive_revisions")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name for the IP restriction rule.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="outboundIpAddresses")
    def outbound_ip_addresses(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "outbound_ip_addresses")

    @_builtins.property
    @pulumi.getter
    def registries(self) -> Sequence['outputs.GetAppRegistryResult']:
        """
        A `registry` block as detailed below.
        """
        return pulumi.get(self, "registries")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="revisionMode")
    def revision_mode(self) -> _builtins.str:
        """
        The revision mode of the Container App.
        """
        return pulumi.get(self, "revision_mode")

    @_builtins.property
    @pulumi.getter
    def secrets(self) -> Sequence['outputs.GetAppSecretResult']:
        """
        One or more `secret` block as detailed below.
        """
        return pulumi.get(self, "secrets")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags to assign to the Container App.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def templates(self) -> Sequence['outputs.GetAppTemplateResult']:
        """
        A `template` block as detailed below.
        """
        return pulumi.get(self, "templates")

    @_builtins.property
    @pulumi.getter(name="workloadProfileName")
    def workload_profile_name(self) -> _builtins.str:
        """
        The name of the Workload Profile in the Container App Environment in which this Container App is running.
        """
        return pulumi.get(self, "workload_profile_name")


class AwaitableGetAppResult(GetAppResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppResult(
            container_app_environment_id=self.container_app_environment_id,
            custom_domain_verification_id=self.custom_domain_verification_id,
            daprs=self.daprs,
            id=self.id,
            identities=self.identities,
            ingresses=self.ingresses,
            latest_revision_fqdn=self.latest_revision_fqdn,
            latest_revision_name=self.latest_revision_name,
            location=self.location,
            max_inactive_revisions=self.max_inactive_revisions,
            name=self.name,
            outbound_ip_addresses=self.outbound_ip_addresses,
            registries=self.registries,
            resource_group_name=self.resource_group_name,
            revision_mode=self.revision_mode,
            secrets=self.secrets,
            tags=self.tags,
            templates=self.templates,
            workload_profile_name=self.workload_profile_name)


def get_app(name: Optional[_builtins.str] = None,
            resource_group_name: Optional[_builtins.str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppResult:
    """
    Use this data source to access information about an existing Container App.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.containerapp.get_app(name="example-app",
        resource_group_name="example-resources")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.App`: 2025-01-01


    :param _builtins.str name: The name of the Container App.
    :param _builtins.str resource_group_name: The name of the Resource Group where this Container App exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:containerapp/getApp:getApp', __args__, opts=opts, typ=GetAppResult).value

    return AwaitableGetAppResult(
        container_app_environment_id=pulumi.get(__ret__, 'container_app_environment_id'),
        custom_domain_verification_id=pulumi.get(__ret__, 'custom_domain_verification_id'),
        daprs=pulumi.get(__ret__, 'daprs'),
        id=pulumi.get(__ret__, 'id'),
        identities=pulumi.get(__ret__, 'identities'),
        ingresses=pulumi.get(__ret__, 'ingresses'),
        latest_revision_fqdn=pulumi.get(__ret__, 'latest_revision_fqdn'),
        latest_revision_name=pulumi.get(__ret__, 'latest_revision_name'),
        location=pulumi.get(__ret__, 'location'),
        max_inactive_revisions=pulumi.get(__ret__, 'max_inactive_revisions'),
        name=pulumi.get(__ret__, 'name'),
        outbound_ip_addresses=pulumi.get(__ret__, 'outbound_ip_addresses'),
        registries=pulumi.get(__ret__, 'registries'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        revision_mode=pulumi.get(__ret__, 'revision_mode'),
        secrets=pulumi.get(__ret__, 'secrets'),
        tags=pulumi.get(__ret__, 'tags'),
        templates=pulumi.get(__ret__, 'templates'),
        workload_profile_name=pulumi.get(__ret__, 'workload_profile_name'))
def get_app_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                   resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppResult]:
    """
    Use this data source to access information about an existing Container App.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.containerapp.get_app(name="example-app",
        resource_group_name="example-resources")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.App`: 2025-01-01


    :param _builtins.str name: The name of the Container App.
    :param _builtins.str resource_group_name: The name of the Resource Group where this Container App exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:containerapp/getApp:getApp', __args__, opts=opts, typ=GetAppResult)
    return __ret__.apply(lambda __response__: GetAppResult(
        container_app_environment_id=pulumi.get(__response__, 'container_app_environment_id'),
        custom_domain_verification_id=pulumi.get(__response__, 'custom_domain_verification_id'),
        daprs=pulumi.get(__response__, 'daprs'),
        id=pulumi.get(__response__, 'id'),
        identities=pulumi.get(__response__, 'identities'),
        ingresses=pulumi.get(__response__, 'ingresses'),
        latest_revision_fqdn=pulumi.get(__response__, 'latest_revision_fqdn'),
        latest_revision_name=pulumi.get(__response__, 'latest_revision_name'),
        location=pulumi.get(__response__, 'location'),
        max_inactive_revisions=pulumi.get(__response__, 'max_inactive_revisions'),
        name=pulumi.get(__response__, 'name'),
        outbound_ip_addresses=pulumi.get(__response__, 'outbound_ip_addresses'),
        registries=pulumi.get(__response__, 'registries'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        revision_mode=pulumi.get(__response__, 'revision_mode'),
        secrets=pulumi.get(__response__, 'secrets'),
        tags=pulumi.get(__response__, 'tags'),
        templates=pulumi.get(__response__, 'templates'),
        workload_profile_name=pulumi.get(__response__, 'workload_profile_name')))
