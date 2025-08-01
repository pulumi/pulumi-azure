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
    'GetReplicationPolicyResult',
    'AwaitableGetReplicationPolicyResult',
    'get_replication_policy',
    'get_replication_policy_output',
]

@pulumi.output_type
class GetReplicationPolicyResult:
    """
    A collection of values returned by getReplicationPolicy.
    """
    def __init__(__self__, application_consistent_snapshot_frequency_in_minutes=None, id=None, name=None, recovery_point_retention_in_minutes=None, recovery_vault_name=None, resource_group_name=None):
        if application_consistent_snapshot_frequency_in_minutes and not isinstance(application_consistent_snapshot_frequency_in_minutes, int):
            raise TypeError("Expected argument 'application_consistent_snapshot_frequency_in_minutes' to be a int")
        pulumi.set(__self__, "application_consistent_snapshot_frequency_in_minutes", application_consistent_snapshot_frequency_in_minutes)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if recovery_point_retention_in_minutes and not isinstance(recovery_point_retention_in_minutes, int):
            raise TypeError("Expected argument 'recovery_point_retention_in_minutes' to be a int")
        pulumi.set(__self__, "recovery_point_retention_in_minutes", recovery_point_retention_in_minutes)
        if recovery_vault_name and not isinstance(recovery_vault_name, str):
            raise TypeError("Expected argument 'recovery_vault_name' to be a str")
        pulumi.set(__self__, "recovery_vault_name", recovery_vault_name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)

    @_builtins.property
    @pulumi.getter(name="applicationConsistentSnapshotFrequencyInMinutes")
    def application_consistent_snapshot_frequency_in_minutes(self) -> _builtins.int:
        """
        Specifies the frequency (in minutes) at which to create application consistent recovery.
        """
        return pulumi.get(self, "application_consistent_snapshot_frequency_in_minutes")

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
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="recoveryPointRetentionInMinutes")
    def recovery_point_retention_in_minutes(self) -> _builtins.int:
        """
        The duration in minutes for which the recovery points need to be stored.
        """
        return pulumi.get(self, "recovery_point_retention_in_minutes")

    @_builtins.property
    @pulumi.getter(name="recoveryVaultName")
    def recovery_vault_name(self) -> _builtins.str:
        return pulumi.get(self, "recovery_vault_name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")


class AwaitableGetReplicationPolicyResult(GetReplicationPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetReplicationPolicyResult(
            application_consistent_snapshot_frequency_in_minutes=self.application_consistent_snapshot_frequency_in_minutes,
            id=self.id,
            name=self.name,
            recovery_point_retention_in_minutes=self.recovery_point_retention_in_minutes,
            recovery_vault_name=self.recovery_vault_name,
            resource_group_name=self.resource_group_name)


def get_replication_policy(name: Optional[_builtins.str] = None,
                           recovery_vault_name: Optional[_builtins.str] = None,
                           resource_group_name: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetReplicationPolicyResult:
    """
    Use this data source to access information about an existing Azure Site Recovery replication policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    policy = azure.siterecovery.get_replication_policy(name="replication-policy",
        recovery_vault_name="tfex-recovery_vault",
        resource_group_name="tfex-resource_group")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.RecoveryServices`: 2024-04-01


    :param _builtins.str name: Specifies the name of the Azure Site Recovery replication policy.
    :param _builtins.str recovery_vault_name: The name of the Recovery Services Vault that the Azure Site Recovery replication policy is associated witth.
    :param _builtins.str resource_group_name: The name of the resource group in which the associated Azure Site Recovery replication policy resides.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['recoveryVaultName'] = recovery_vault_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:siterecovery/getReplicationPolicy:getReplicationPolicy', __args__, opts=opts, typ=GetReplicationPolicyResult).value

    return AwaitableGetReplicationPolicyResult(
        application_consistent_snapshot_frequency_in_minutes=pulumi.get(__ret__, 'application_consistent_snapshot_frequency_in_minutes'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        recovery_point_retention_in_minutes=pulumi.get(__ret__, 'recovery_point_retention_in_minutes'),
        recovery_vault_name=pulumi.get(__ret__, 'recovery_vault_name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'))
def get_replication_policy_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                  recovery_vault_name: Optional[pulumi.Input[_builtins.str]] = None,
                                  resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetReplicationPolicyResult]:
    """
    Use this data source to access information about an existing Azure Site Recovery replication policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    policy = azure.siterecovery.get_replication_policy(name="replication-policy",
        recovery_vault_name="tfex-recovery_vault",
        resource_group_name="tfex-resource_group")
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.RecoveryServices`: 2024-04-01


    :param _builtins.str name: Specifies the name of the Azure Site Recovery replication policy.
    :param _builtins.str recovery_vault_name: The name of the Recovery Services Vault that the Azure Site Recovery replication policy is associated witth.
    :param _builtins.str resource_group_name: The name of the resource group in which the associated Azure Site Recovery replication policy resides.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['recoveryVaultName'] = recovery_vault_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:siterecovery/getReplicationPolicy:getReplicationPolicy', __args__, opts=opts, typ=GetReplicationPolicyResult)
    return __ret__.apply(lambda __response__: GetReplicationPolicyResult(
        application_consistent_snapshot_frequency_in_minutes=pulumi.get(__response__, 'application_consistent_snapshot_frequency_in_minutes'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        recovery_point_retention_in_minutes=pulumi.get(__response__, 'recovery_point_retention_in_minutes'),
        recovery_vault_name=pulumi.get(__response__, 'recovery_vault_name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name')))
