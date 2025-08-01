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
    'GetUserAssignedIdentityResult',
    'AwaitableGetUserAssignedIdentityResult',
    'get_user_assigned_identity',
    'get_user_assigned_identity_output',
]

warnings.warn("""azure.core.getUserAssignedIdentity has been deprecated in favor of azure.authorization.getUserAssignedIdentity""", DeprecationWarning)

@pulumi.output_type
class GetUserAssignedIdentityResult:
    """
    A collection of values returned by getUserAssignedIdentity.
    """
    def __init__(__self__, client_id=None, id=None, location=None, name=None, principal_id=None, resource_group_name=None, tags=None, tenant_id=None):
        if client_id and not isinstance(client_id, str):
            raise TypeError("Expected argument 'client_id' to be a str")
        pulumi.set(__self__, "client_id", client_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if principal_id and not isinstance(principal_id, str):
            raise TypeError("Expected argument 'principal_id' to be a str")
        pulumi.set(__self__, "principal_id", principal_id)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if tenant_id and not isinstance(tenant_id, str):
            raise TypeError("Expected argument 'tenant_id' to be a str")
        pulumi.set(__self__, "tenant_id", tenant_id)

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> _builtins.str:
        """
        The Client ID of the User Assigned Identity.
        """
        return pulumi.get(self, "client_id")

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
        The Azure location where the User Assigned Identity exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> _builtins.str:
        """
        The Service Principal ID of the User Assigned Identity.
        """
        return pulumi.get(self, "principal_id")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags assigned to the User Assigned Identity.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> _builtins.str:
        """
        The Tenant ID of the User Assigned Identity.
        """
        return pulumi.get(self, "tenant_id")


class AwaitableGetUserAssignedIdentityResult(GetUserAssignedIdentityResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserAssignedIdentityResult(
            client_id=self.client_id,
            id=self.id,
            location=self.location,
            name=self.name,
            principal_id=self.principal_id,
            resource_group_name=self.resource_group_name,
            tags=self.tags,
            tenant_id=self.tenant_id)


def get_user_assigned_identity(name: Optional[_builtins.str] = None,
                               resource_group_name: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserAssignedIdentityResult:
    """
    Use this data source to access information about an existing User Assigned Identity.

    ## Example Usage

    ### Reference An Existing)

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.authorization.get_user_assigned_identity(name="name_of_user_assigned_identity",
        resource_group_name="name_of_resource_group")
    pulumi.export("uaiClientId", example.client_id)
    pulumi.export("uaiPrincipalId", example.principal_id)
    pulumi.export("uaiTenantId", example.tenant_id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.ManagedIdentity`: 2023-01-31


    :param _builtins.str name: The name of the User Assigned Identity.
    :param _builtins.str resource_group_name: The name of the Resource Group in which the User Assigned Identity exists.
    """
    pulumi.log.warn("""get_user_assigned_identity is deprecated: azure.core.getUserAssignedIdentity has been deprecated in favor of azure.authorization.getUserAssignedIdentity""")
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:core/getUserAssignedIdentity:getUserAssignedIdentity', __args__, opts=opts, typ=GetUserAssignedIdentityResult).value

    return AwaitableGetUserAssignedIdentityResult(
        client_id=pulumi.get(__ret__, 'client_id'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        principal_id=pulumi.get(__ret__, 'principal_id'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        tags=pulumi.get(__ret__, 'tags'),
        tenant_id=pulumi.get(__ret__, 'tenant_id'))
def get_user_assigned_identity_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                      resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetUserAssignedIdentityResult]:
    """
    Use this data source to access information about an existing User Assigned Identity.

    ## Example Usage

    ### Reference An Existing)

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.authorization.get_user_assigned_identity(name="name_of_user_assigned_identity",
        resource_group_name="name_of_resource_group")
    pulumi.export("uaiClientId", example.client_id)
    pulumi.export("uaiPrincipalId", example.principal_id)
    pulumi.export("uaiTenantId", example.tenant_id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.ManagedIdentity`: 2023-01-31


    :param _builtins.str name: The name of the User Assigned Identity.
    :param _builtins.str resource_group_name: The name of the Resource Group in which the User Assigned Identity exists.
    """
    pulumi.log.warn("""get_user_assigned_identity is deprecated: azure.core.getUserAssignedIdentity has been deprecated in favor of azure.authorization.getUserAssignedIdentity""")
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:core/getUserAssignedIdentity:getUserAssignedIdentity', __args__, opts=opts, typ=GetUserAssignedIdentityResult)
    return __ret__.apply(lambda __response__: GetUserAssignedIdentityResult(
        client_id=pulumi.get(__response__, 'client_id'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        principal_id=pulumi.get(__response__, 'principal_id'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        tags=pulumi.get(__response__, 'tags'),
        tenant_id=pulumi.get(__response__, 'tenant_id')))
