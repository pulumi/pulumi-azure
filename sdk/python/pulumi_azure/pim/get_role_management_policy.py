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
    'GetRoleManagementPolicyResult',
    'AwaitableGetRoleManagementPolicyResult',
    'get_role_management_policy',
    'get_role_management_policy_output',
]

@pulumi.output_type
class GetRoleManagementPolicyResult:
    """
    A collection of values returned by getRoleManagementPolicy.
    """
    def __init__(__self__, activation_rules=None, active_assignment_rules=None, description=None, eligible_assignment_rules=None, id=None, name=None, notification_rules=None, role_definition_id=None, scope=None):
        if activation_rules and not isinstance(activation_rules, list):
            raise TypeError("Expected argument 'activation_rules' to be a list")
        pulumi.set(__self__, "activation_rules", activation_rules)
        if active_assignment_rules and not isinstance(active_assignment_rules, list):
            raise TypeError("Expected argument 'active_assignment_rules' to be a list")
        pulumi.set(__self__, "active_assignment_rules", active_assignment_rules)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if eligible_assignment_rules and not isinstance(eligible_assignment_rules, list):
            raise TypeError("Expected argument 'eligible_assignment_rules' to be a list")
        pulumi.set(__self__, "eligible_assignment_rules", eligible_assignment_rules)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if notification_rules and not isinstance(notification_rules, list):
            raise TypeError("Expected argument 'notification_rules' to be a list")
        pulumi.set(__self__, "notification_rules", notification_rules)
        if role_definition_id and not isinstance(role_definition_id, str):
            raise TypeError("Expected argument 'role_definition_id' to be a str")
        pulumi.set(__self__, "role_definition_id", role_definition_id)
        if scope and not isinstance(scope, str):
            raise TypeError("Expected argument 'scope' to be a str")
        pulumi.set(__self__, "scope", scope)

    @_builtins.property
    @pulumi.getter(name="activationRules")
    def activation_rules(self) -> Sequence['outputs.GetRoleManagementPolicyActivationRuleResult']:
        """
        An `activation_rules` block as defined below.
        """
        return pulumi.get(self, "activation_rules")

    @_builtins.property
    @pulumi.getter(name="activeAssignmentRules")
    def active_assignment_rules(self) -> Sequence['outputs.GetRoleManagementPolicyActiveAssignmentRuleResult']:
        """
        An `active_assignment_rules` block as defined below.
        """
        return pulumi.get(self, "active_assignment_rules")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        (String) The description of this policy.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="eligibleAssignmentRules")
    def eligible_assignment_rules(self) -> Sequence['outputs.GetRoleManagementPolicyEligibleAssignmentRuleResult']:
        """
        An `eligible_assignment_rules` block as defined below.
        """
        return pulumi.get(self, "eligible_assignment_rules")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        (String) The name of this policy, which is typically a UUID and may change over time.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="notificationRules")
    def notification_rules(self) -> Sequence['outputs.GetRoleManagementPolicyNotificationRuleResult']:
        """
        A `notification_rules` block as defined below.
        """
        return pulumi.get(self, "notification_rules")

    @_builtins.property
    @pulumi.getter(name="roleDefinitionId")
    def role_definition_id(self) -> _builtins.str:
        return pulumi.get(self, "role_definition_id")

    @_builtins.property
    @pulumi.getter
    def scope(self) -> _builtins.str:
        return pulumi.get(self, "scope")


class AwaitableGetRoleManagementPolicyResult(GetRoleManagementPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRoleManagementPolicyResult(
            activation_rules=self.activation_rules,
            active_assignment_rules=self.active_assignment_rules,
            description=self.description,
            eligible_assignment_rules=self.eligible_assignment_rules,
            id=self.id,
            name=self.name,
            notification_rules=self.notification_rules,
            role_definition_id=self.role_definition_id,
            scope=self.scope)


def get_role_management_policy(role_definition_id: Optional[_builtins.str] = None,
                               scope: Optional[_builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRoleManagementPolicyResult:
    """
    Use this data source to get information on a role policy for an Azure Management Group, Subscription, Resource Group or resource.

    ## Example Usage

    ### Resource Group

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.core.get_resource_group(name="example-rg")
    rg_contributor = azure.authorization.get_role_definition(name="Contributor",
        scope=example.id)
    example_get_role_management_policy = azure.pim.get_role_management_policy(scope=test["id"],
        role_definition_id=contributor["id"])
    ```

    ### Management Group

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.management.get_group(name="example-group")
    mg_contributor = azure.authorization.get_role_definition(name="Contributor",
        scope=example_azurerm_management_group["id"])
    example_get_role_management_policy = azure.pim.get_role_management_policy(scope=example.id,
        role_definition_id=mg_contributor.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Authorization`: 2020-10-01


    :param _builtins.str role_definition_id: The scoped Role Definition ID of the role for which this policy applies.
    :param _builtins.str scope: The scope to which this Role Management Policy applies. Can refer to a management group, a subscription, a resource group or a resource.
    """
    __args__ = dict()
    __args__['roleDefinitionId'] = role_definition_id
    __args__['scope'] = scope
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:pim/getRoleManagementPolicy:getRoleManagementPolicy', __args__, opts=opts, typ=GetRoleManagementPolicyResult).value

    return AwaitableGetRoleManagementPolicyResult(
        activation_rules=pulumi.get(__ret__, 'activation_rules'),
        active_assignment_rules=pulumi.get(__ret__, 'active_assignment_rules'),
        description=pulumi.get(__ret__, 'description'),
        eligible_assignment_rules=pulumi.get(__ret__, 'eligible_assignment_rules'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        notification_rules=pulumi.get(__ret__, 'notification_rules'),
        role_definition_id=pulumi.get(__ret__, 'role_definition_id'),
        scope=pulumi.get(__ret__, 'scope'))
def get_role_management_policy_output(role_definition_id: Optional[pulumi.Input[_builtins.str]] = None,
                                      scope: Optional[pulumi.Input[_builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRoleManagementPolicyResult]:
    """
    Use this data source to get information on a role policy for an Azure Management Group, Subscription, Resource Group or resource.

    ## Example Usage

    ### Resource Group

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.core.get_resource_group(name="example-rg")
    rg_contributor = azure.authorization.get_role_definition(name="Contributor",
        scope=example.id)
    example_get_role_management_policy = azure.pim.get_role_management_policy(scope=test["id"],
        role_definition_id=contributor["id"])
    ```

    ### Management Group

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.management.get_group(name="example-group")
    mg_contributor = azure.authorization.get_role_definition(name="Contributor",
        scope=example_azurerm_management_group["id"])
    example_get_role_management_policy = azure.pim.get_role_management_policy(scope=example.id,
        role_definition_id=mg_contributor.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Authorization`: 2020-10-01


    :param _builtins.str role_definition_id: The scoped Role Definition ID of the role for which this policy applies.
    :param _builtins.str scope: The scope to which this Role Management Policy applies. Can refer to a management group, a subscription, a resource group or a resource.
    """
    __args__ = dict()
    __args__['roleDefinitionId'] = role_definition_id
    __args__['scope'] = scope
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:pim/getRoleManagementPolicy:getRoleManagementPolicy', __args__, opts=opts, typ=GetRoleManagementPolicyResult)
    return __ret__.apply(lambda __response__: GetRoleManagementPolicyResult(
        activation_rules=pulumi.get(__response__, 'activation_rules'),
        active_assignment_rules=pulumi.get(__response__, 'active_assignment_rules'),
        description=pulumi.get(__response__, 'description'),
        eligible_assignment_rules=pulumi.get(__response__, 'eligible_assignment_rules'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        notification_rules=pulumi.get(__response__, 'notification_rules'),
        role_definition_id=pulumi.get(__response__, 'role_definition_id'),
        scope=pulumi.get(__response__, 'scope')))
