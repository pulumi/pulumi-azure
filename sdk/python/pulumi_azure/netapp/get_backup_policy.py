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
    'GetBackupPolicyResult',
    'AwaitableGetBackupPolicyResult',
    'get_backup_policy',
    'get_backup_policy_output',
]

@pulumi.output_type
class GetBackupPolicyResult:
    """
    A collection of values returned by getBackupPolicy.
    """
    def __init__(__self__, account_name=None, daily_backups_to_keep=None, enabled=None, id=None, location=None, monthly_backups_to_keep=None, name=None, resource_group_name=None, tags=None, weekly_backups_to_keep=None):
        if account_name and not isinstance(account_name, str):
            raise TypeError("Expected argument 'account_name' to be a str")
        pulumi.set(__self__, "account_name", account_name)
        if daily_backups_to_keep and not isinstance(daily_backups_to_keep, int):
            raise TypeError("Expected argument 'daily_backups_to_keep' to be a int")
        pulumi.set(__self__, "daily_backups_to_keep", daily_backups_to_keep)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if monthly_backups_to_keep and not isinstance(monthly_backups_to_keep, int):
            raise TypeError("Expected argument 'monthly_backups_to_keep' to be a int")
        pulumi.set(__self__, "monthly_backups_to_keep", monthly_backups_to_keep)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if weekly_backups_to_keep and not isinstance(weekly_backups_to_keep, int):
            raise TypeError("Expected argument 'weekly_backups_to_keep' to be a int")
        pulumi.set(__self__, "weekly_backups_to_keep", weekly_backups_to_keep)

    @_builtins.property
    @pulumi.getter(name="accountName")
    def account_name(self) -> _builtins.str:
        """
        The name of the NetApp account in which the NetApp Policy exists.
        """
        return pulumi.get(self, "account_name")

    @_builtins.property
    @pulumi.getter(name="dailyBackupsToKeep")
    def daily_backups_to_keep(self) -> _builtins.int:
        """
        The number of daily backups to keep.
        """
        return pulumi.get(self, "daily_backups_to_keep")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> _builtins.bool:
        """
        Whether the Backup Policy is enabled.
        """
        return pulumi.get(self, "enabled")

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
        NetApp Backup Policy location.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="monthlyBackupsToKeep")
    def monthly_backups_to_keep(self) -> _builtins.int:
        """
        The number of monthly backups to keep.
        """
        return pulumi.get(self, "monthly_backups_to_keep")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        List of tags assigned to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="weeklyBackupsToKeep")
    def weekly_backups_to_keep(self) -> _builtins.int:
        """
        The number of weekly backups to keep.
        """
        return pulumi.get(self, "weekly_backups_to_keep")


class AwaitableGetBackupPolicyResult(GetBackupPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBackupPolicyResult(
            account_name=self.account_name,
            daily_backups_to_keep=self.daily_backups_to_keep,
            enabled=self.enabled,
            id=self.id,
            location=self.location,
            monthly_backups_to_keep=self.monthly_backups_to_keep,
            name=self.name,
            resource_group_name=self.resource_group_name,
            tags=self.tags,
            weekly_backups_to_keep=self.weekly_backups_to_keep)


def get_backup_policy(account_name: Optional[_builtins.str] = None,
                      name: Optional[_builtins.str] = None,
                      resource_group_name: Optional[_builtins.str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBackupPolicyResult:
    """
    Use this data source to access information about an existing NetApp Backup Vault.

    ## NetApp Backup Policy Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.netapp.get_backup_policy(resource_group_name="example-resource-group",
        account_name="example-netappaccount",
        name="example-backuppolicy")
    pulumi.export("backupPolicyId", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.NetApp`: 2025-01-01


    :param _builtins.str account_name: The name of the NetApp Account in which the NetApp Policy exists.
    :param _builtins.str name: The name of the NetApp Backup Policy.
    :param _builtins.str resource_group_name: The name of the resource group where the NetApp Backup Policy exists.
    """
    __args__ = dict()
    __args__['accountName'] = account_name
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:netapp/getBackupPolicy:getBackupPolicy', __args__, opts=opts, typ=GetBackupPolicyResult).value

    return AwaitableGetBackupPolicyResult(
        account_name=pulumi.get(__ret__, 'account_name'),
        daily_backups_to_keep=pulumi.get(__ret__, 'daily_backups_to_keep'),
        enabled=pulumi.get(__ret__, 'enabled'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        monthly_backups_to_keep=pulumi.get(__ret__, 'monthly_backups_to_keep'),
        name=pulumi.get(__ret__, 'name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        tags=pulumi.get(__ret__, 'tags'),
        weekly_backups_to_keep=pulumi.get(__ret__, 'weekly_backups_to_keep'))
def get_backup_policy_output(account_name: Optional[pulumi.Input[_builtins.str]] = None,
                             name: Optional[pulumi.Input[_builtins.str]] = None,
                             resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBackupPolicyResult]:
    """
    Use this data source to access information about an existing NetApp Backup Vault.

    ## NetApp Backup Policy Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.netapp.get_backup_policy(resource_group_name="example-resource-group",
        account_name="example-netappaccount",
        name="example-backuppolicy")
    pulumi.export("backupPolicyId", example.id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.NetApp`: 2025-01-01


    :param _builtins.str account_name: The name of the NetApp Account in which the NetApp Policy exists.
    :param _builtins.str name: The name of the NetApp Backup Policy.
    :param _builtins.str resource_group_name: The name of the resource group where the NetApp Backup Policy exists.
    """
    __args__ = dict()
    __args__['accountName'] = account_name
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:netapp/getBackupPolicy:getBackupPolicy', __args__, opts=opts, typ=GetBackupPolicyResult)
    return __ret__.apply(lambda __response__: GetBackupPolicyResult(
        account_name=pulumi.get(__response__, 'account_name'),
        daily_backups_to_keep=pulumi.get(__response__, 'daily_backups_to_keep'),
        enabled=pulumi.get(__response__, 'enabled'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        monthly_backups_to_keep=pulumi.get(__response__, 'monthly_backups_to_keep'),
        name=pulumi.get(__response__, 'name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        tags=pulumi.get(__response__, 'tags'),
        weekly_backups_to_keep=pulumi.get(__response__, 'weekly_backups_to_keep')))
