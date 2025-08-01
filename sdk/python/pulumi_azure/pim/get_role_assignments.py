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
    'GetRoleAssignmentsResult',
    'AwaitableGetRoleAssignmentsResult',
    'get_role_assignments',
    'get_role_assignments_output',
]

@pulumi.output_type
class GetRoleAssignmentsResult:
    """
    A collection of values returned by getRoleAssignments.
    """
    def __init__(__self__, id=None, limit_at_scope=None, principal_id=None, role_assignments=None, scope=None, tenant_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if limit_at_scope and not isinstance(limit_at_scope, bool):
            raise TypeError("Expected argument 'limit_at_scope' to be a bool")
        pulumi.set(__self__, "limit_at_scope", limit_at_scope)
        if principal_id and not isinstance(principal_id, str):
            raise TypeError("Expected argument 'principal_id' to be a str")
        pulumi.set(__self__, "principal_id", principal_id)
        if role_assignments and not isinstance(role_assignments, list):
            raise TypeError("Expected argument 'role_assignments' to be a list")
        pulumi.set(__self__, "role_assignments", role_assignments)
        if scope and not isinstance(scope, str):
            raise TypeError("Expected argument 'scope' to be a str")
        pulumi.set(__self__, "scope", scope)
        if tenant_id and not isinstance(tenant_id, str):
            raise TypeError("Expected argument 'tenant_id' to be a str")
        pulumi.set(__self__, "tenant_id", tenant_id)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="limitAtScope")
    def limit_at_scope(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "limit_at_scope")

    @_builtins.property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[_builtins.str]:
        """
        The principal ID.
        """
        return pulumi.get(self, "principal_id")

    @_builtins.property
    @pulumi.getter(name="roleAssignments")
    def role_assignments(self) -> Sequence['outputs.GetRoleAssignmentsRoleAssignmentResult']:
        """
        A `role_assignments` block as defined below.
        """
        return pulumi.get(self, "role_assignments")

    @_builtins.property
    @pulumi.getter
    def scope(self) -> _builtins.str:
        return pulumi.get(self, "scope")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "tenant_id")


class AwaitableGetRoleAssignmentsResult(GetRoleAssignmentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRoleAssignmentsResult(
            id=self.id,
            limit_at_scope=self.limit_at_scope,
            principal_id=self.principal_id,
            role_assignments=self.role_assignments,
            scope=self.scope,
            tenant_id=self.tenant_id)


def get_role_assignments(limit_at_scope: Optional[_builtins.bool] = None,
                         principal_id: Optional[_builtins.str] = None,
                         scope: Optional[_builtins.str] = None,
                         tenant_id: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRoleAssignmentsResult:
    """
    Use this data source to access information about existing Role Assignments.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example_resource_group = azure.core.ResourceGroup("example",
        name="example",
        location="West Europe")
    example = azure.pim.get_role_assignments_output(scope=example_resource_group.id)
    pulumi.export("id", example.role_assignments)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Authorization`: 2022-04-01


    :param _builtins.bool limit_at_scope: Whether to limit the result exactly at the specified scope and not above or below it. Defaults to `false`.
    :param _builtins.str principal_id: The principal ID to filter the list of Role Assignments against.
    :param _builtins.str scope: The scope at which to list Role Assignments.
    :param _builtins.str tenant_id: The tenant ID for cross-tenant requests.
    """
    __args__ = dict()
    __args__['limitAtScope'] = limit_at_scope
    __args__['principalId'] = principal_id
    __args__['scope'] = scope
    __args__['tenantId'] = tenant_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:pim/getRoleAssignments:getRoleAssignments', __args__, opts=opts, typ=GetRoleAssignmentsResult).value

    return AwaitableGetRoleAssignmentsResult(
        id=pulumi.get(__ret__, 'id'),
        limit_at_scope=pulumi.get(__ret__, 'limit_at_scope'),
        principal_id=pulumi.get(__ret__, 'principal_id'),
        role_assignments=pulumi.get(__ret__, 'role_assignments'),
        scope=pulumi.get(__ret__, 'scope'),
        tenant_id=pulumi.get(__ret__, 'tenant_id'))
def get_role_assignments_output(limit_at_scope: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                principal_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                scope: Optional[pulumi.Input[_builtins.str]] = None,
                                tenant_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRoleAssignmentsResult]:
    """
    Use this data source to access information about existing Role Assignments.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example_resource_group = azure.core.ResourceGroup("example",
        name="example",
        location="West Europe")
    example = azure.pim.get_role_assignments_output(scope=example_resource_group.id)
    pulumi.export("id", example.role_assignments)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Authorization`: 2022-04-01


    :param _builtins.bool limit_at_scope: Whether to limit the result exactly at the specified scope and not above or below it. Defaults to `false`.
    :param _builtins.str principal_id: The principal ID to filter the list of Role Assignments against.
    :param _builtins.str scope: The scope at which to list Role Assignments.
    :param _builtins.str tenant_id: The tenant ID for cross-tenant requests.
    """
    __args__ = dict()
    __args__['limitAtScope'] = limit_at_scope
    __args__['principalId'] = principal_id
    __args__['scope'] = scope
    __args__['tenantId'] = tenant_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:pim/getRoleAssignments:getRoleAssignments', __args__, opts=opts, typ=GetRoleAssignmentsResult)
    return __ret__.apply(lambda __response__: GetRoleAssignmentsResult(
        id=pulumi.get(__response__, 'id'),
        limit_at_scope=pulumi.get(__response__, 'limit_at_scope'),
        principal_id=pulumi.get(__response__, 'principal_id'),
        role_assignments=pulumi.get(__response__, 'role_assignments'),
        scope=pulumi.get(__response__, 'scope'),
        tenant_id=pulumi.get(__response__, 'tenant_id')))
