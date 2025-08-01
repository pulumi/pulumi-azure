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

__all__ = ['PolicyFileShareArgs', 'PolicyFileShare']

@pulumi.input_type
class PolicyFileShareArgs:
    def __init__(__self__, *,
                 backup: pulumi.Input['PolicyFileShareBackupArgs'],
                 recovery_vault_name: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 retention_daily: pulumi.Input['PolicyFileShareRetentionDailyArgs'],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 retention_monthly: Optional[pulumi.Input['PolicyFileShareRetentionMonthlyArgs']] = None,
                 retention_weekly: Optional[pulumi.Input['PolicyFileShareRetentionWeeklyArgs']] = None,
                 retention_yearly: Optional[pulumi.Input['PolicyFileShareRetentionYearlyArgs']] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a PolicyFileShare resource.
        :param pulumi.Input['PolicyFileShareBackupArgs'] backup: Configures the Policy backup frequency and times as documented in the `backup` block below.
        :param pulumi.Input[_builtins.str] recovery_vault_name: Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the policy. Changing this forces a new resource to be created.
        :param pulumi.Input['PolicyFileShareRetentionDailyArgs'] retention_daily: Configures the policy daily retention as documented in the `retention_daily` block below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the policy. Changing this forces a new resource to be created.
        :param pulumi.Input['PolicyFileShareRetentionMonthlyArgs'] retention_monthly: Configures the policy monthly retention as documented in the `retention_monthly` block below.
        :param pulumi.Input['PolicyFileShareRetentionWeeklyArgs'] retention_weekly: Configures the policy weekly retention as documented in the `retention_weekly` block below.
        :param pulumi.Input['PolicyFileShareRetentionYearlyArgs'] retention_yearly: Configures the policy yearly retention as documented in the `retention_yearly` block below.
        :param pulumi.Input[_builtins.str] timezone: Specifies the timezone. [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/). Defaults to `UTC`
               
               > **Note:** The maximum number of snapshots that Azure Files can retain is 200. If your combined snapshot count exceeds 200 based on your retention policies, it will result in an error. See [this](https://docs.microsoft.com/azure/backup/backup-azure-files-faq#what-is-the-maximum-retention-i-can-configure-for-backups) article for more information.
        """
        pulumi.set(__self__, "backup", backup)
        pulumi.set(__self__, "recovery_vault_name", recovery_vault_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "retention_daily", retention_daily)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if retention_monthly is not None:
            pulumi.set(__self__, "retention_monthly", retention_monthly)
        if retention_weekly is not None:
            pulumi.set(__self__, "retention_weekly", retention_weekly)
        if retention_yearly is not None:
            pulumi.set(__self__, "retention_yearly", retention_yearly)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @_builtins.property
    @pulumi.getter
    def backup(self) -> pulumi.Input['PolicyFileShareBackupArgs']:
        """
        Configures the Policy backup frequency and times as documented in the `backup` block below.
        """
        return pulumi.get(self, "backup")

    @backup.setter
    def backup(self, value: pulumi.Input['PolicyFileShareBackupArgs']):
        pulumi.set(self, "backup", value)

    @_builtins.property
    @pulumi.getter(name="recoveryVaultName")
    def recovery_vault_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "recovery_vault_name")

    @recovery_vault_name.setter
    def recovery_vault_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "recovery_vault_name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group in which to create the policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="retentionDaily")
    def retention_daily(self) -> pulumi.Input['PolicyFileShareRetentionDailyArgs']:
        """
        Configures the policy daily retention as documented in the `retention_daily` block below.
        """
        return pulumi.get(self, "retention_daily")

    @retention_daily.setter
    def retention_daily(self, value: pulumi.Input['PolicyFileShareRetentionDailyArgs']):
        pulumi.set(self, "retention_daily", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="retentionMonthly")
    def retention_monthly(self) -> Optional[pulumi.Input['PolicyFileShareRetentionMonthlyArgs']]:
        """
        Configures the policy monthly retention as documented in the `retention_monthly` block below.
        """
        return pulumi.get(self, "retention_monthly")

    @retention_monthly.setter
    def retention_monthly(self, value: Optional[pulumi.Input['PolicyFileShareRetentionMonthlyArgs']]):
        pulumi.set(self, "retention_monthly", value)

    @_builtins.property
    @pulumi.getter(name="retentionWeekly")
    def retention_weekly(self) -> Optional[pulumi.Input['PolicyFileShareRetentionWeeklyArgs']]:
        """
        Configures the policy weekly retention as documented in the `retention_weekly` block below.
        """
        return pulumi.get(self, "retention_weekly")

    @retention_weekly.setter
    def retention_weekly(self, value: Optional[pulumi.Input['PolicyFileShareRetentionWeeklyArgs']]):
        pulumi.set(self, "retention_weekly", value)

    @_builtins.property
    @pulumi.getter(name="retentionYearly")
    def retention_yearly(self) -> Optional[pulumi.Input['PolicyFileShareRetentionYearlyArgs']]:
        """
        Configures the policy yearly retention as documented in the `retention_yearly` block below.
        """
        return pulumi.get(self, "retention_yearly")

    @retention_yearly.setter
    def retention_yearly(self, value: Optional[pulumi.Input['PolicyFileShareRetentionYearlyArgs']]):
        pulumi.set(self, "retention_yearly", value)

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the timezone. [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/). Defaults to `UTC`

        > **Note:** The maximum number of snapshots that Azure Files can retain is 200. If your combined snapshot count exceeds 200 based on your retention policies, it will result in an error. See [this](https://docs.microsoft.com/azure/backup/backup-azure-files-faq#what-is-the-maximum-retention-i-can-configure-for-backups) article for more information.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "timezone", value)


@pulumi.input_type
class _PolicyFileShareState:
    def __init__(__self__, *,
                 backup: Optional[pulumi.Input['PolicyFileShareBackupArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_vault_name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 retention_daily: Optional[pulumi.Input['PolicyFileShareRetentionDailyArgs']] = None,
                 retention_monthly: Optional[pulumi.Input['PolicyFileShareRetentionMonthlyArgs']] = None,
                 retention_weekly: Optional[pulumi.Input['PolicyFileShareRetentionWeeklyArgs']] = None,
                 retention_yearly: Optional[pulumi.Input['PolicyFileShareRetentionYearlyArgs']] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering PolicyFileShare resources.
        :param pulumi.Input['PolicyFileShareBackupArgs'] backup: Configures the Policy backup frequency and times as documented in the `backup` block below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_name: Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the policy. Changing this forces a new resource to be created.
        :param pulumi.Input['PolicyFileShareRetentionDailyArgs'] retention_daily: Configures the policy daily retention as documented in the `retention_daily` block below.
        :param pulumi.Input['PolicyFileShareRetentionMonthlyArgs'] retention_monthly: Configures the policy monthly retention as documented in the `retention_monthly` block below.
        :param pulumi.Input['PolicyFileShareRetentionWeeklyArgs'] retention_weekly: Configures the policy weekly retention as documented in the `retention_weekly` block below.
        :param pulumi.Input['PolicyFileShareRetentionYearlyArgs'] retention_yearly: Configures the policy yearly retention as documented in the `retention_yearly` block below.
        :param pulumi.Input[_builtins.str] timezone: Specifies the timezone. [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/). Defaults to `UTC`
               
               > **Note:** The maximum number of snapshots that Azure Files can retain is 200. If your combined snapshot count exceeds 200 based on your retention policies, it will result in an error. See [this](https://docs.microsoft.com/azure/backup/backup-azure-files-faq#what-is-the-maximum-retention-i-can-configure-for-backups) article for more information.
        """
        if backup is not None:
            pulumi.set(__self__, "backup", backup)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if recovery_vault_name is not None:
            pulumi.set(__self__, "recovery_vault_name", recovery_vault_name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if retention_daily is not None:
            pulumi.set(__self__, "retention_daily", retention_daily)
        if retention_monthly is not None:
            pulumi.set(__self__, "retention_monthly", retention_monthly)
        if retention_weekly is not None:
            pulumi.set(__self__, "retention_weekly", retention_weekly)
        if retention_yearly is not None:
            pulumi.set(__self__, "retention_yearly", retention_yearly)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @_builtins.property
    @pulumi.getter
    def backup(self) -> Optional[pulumi.Input['PolicyFileShareBackupArgs']]:
        """
        Configures the Policy backup frequency and times as documented in the `backup` block below.
        """
        return pulumi.get(self, "backup")

    @backup.setter
    def backup(self, value: Optional[pulumi.Input['PolicyFileShareBackupArgs']]):
        pulumi.set(self, "backup", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="recoveryVaultName")
    def recovery_vault_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "recovery_vault_name")

    @recovery_vault_name.setter
    def recovery_vault_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recovery_vault_name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group in which to create the policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="retentionDaily")
    def retention_daily(self) -> Optional[pulumi.Input['PolicyFileShareRetentionDailyArgs']]:
        """
        Configures the policy daily retention as documented in the `retention_daily` block below.
        """
        return pulumi.get(self, "retention_daily")

    @retention_daily.setter
    def retention_daily(self, value: Optional[pulumi.Input['PolicyFileShareRetentionDailyArgs']]):
        pulumi.set(self, "retention_daily", value)

    @_builtins.property
    @pulumi.getter(name="retentionMonthly")
    def retention_monthly(self) -> Optional[pulumi.Input['PolicyFileShareRetentionMonthlyArgs']]:
        """
        Configures the policy monthly retention as documented in the `retention_monthly` block below.
        """
        return pulumi.get(self, "retention_monthly")

    @retention_monthly.setter
    def retention_monthly(self, value: Optional[pulumi.Input['PolicyFileShareRetentionMonthlyArgs']]):
        pulumi.set(self, "retention_monthly", value)

    @_builtins.property
    @pulumi.getter(name="retentionWeekly")
    def retention_weekly(self) -> Optional[pulumi.Input['PolicyFileShareRetentionWeeklyArgs']]:
        """
        Configures the policy weekly retention as documented in the `retention_weekly` block below.
        """
        return pulumi.get(self, "retention_weekly")

    @retention_weekly.setter
    def retention_weekly(self, value: Optional[pulumi.Input['PolicyFileShareRetentionWeeklyArgs']]):
        pulumi.set(self, "retention_weekly", value)

    @_builtins.property
    @pulumi.getter(name="retentionYearly")
    def retention_yearly(self) -> Optional[pulumi.Input['PolicyFileShareRetentionYearlyArgs']]:
        """
        Configures the policy yearly retention as documented in the `retention_yearly` block below.
        """
        return pulumi.get(self, "retention_yearly")

    @retention_yearly.setter
    def retention_yearly(self, value: Optional[pulumi.Input['PolicyFileShareRetentionYearlyArgs']]):
        pulumi.set(self, "retention_yearly", value)

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the timezone. [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/). Defaults to `UTC`

        > **Note:** The maximum number of snapshots that Azure Files can retain is 200. If your combined snapshot count exceeds 200 based on your retention policies, it will result in an error. See [this](https://docs.microsoft.com/azure/backup/backup-azure-files-faq#what-is-the-maximum-retention-i-can-configure-for-backups) article for more information.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "timezone", value)


@pulumi.type_token("azure:backup/policyFileShare:PolicyFileShare")
class PolicyFileShare(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup: Optional[pulumi.Input[Union['PolicyFileShareBackupArgs', 'PolicyFileShareBackupArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_vault_name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 retention_daily: Optional[pulumi.Input[Union['PolicyFileShareRetentionDailyArgs', 'PolicyFileShareRetentionDailyArgsDict']]] = None,
                 retention_monthly: Optional[pulumi.Input[Union['PolicyFileShareRetentionMonthlyArgs', 'PolicyFileShareRetentionMonthlyArgsDict']]] = None,
                 retention_weekly: Optional[pulumi.Input[Union['PolicyFileShareRetentionWeeklyArgs', 'PolicyFileShareRetentionWeeklyArgsDict']]] = None,
                 retention_yearly: Optional[pulumi.Input[Union['PolicyFileShareRetentionYearlyArgs', 'PolicyFileShareRetentionYearlyArgsDict']]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an Azure File Share Backup Policy within a Recovery Services vault.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="tfex-recovery_vault",
            location="West Europe")
        example_vault = azure.recoveryservices.Vault("example",
            name="tfex-recovery-vault",
            location=example.location,
            resource_group_name=example.name,
            sku="Standard")
        policy = azure.backup.PolicyFileShare("policy",
            name="tfex-recovery-vault-policy",
            resource_group_name=example.name,
            recovery_vault_name=example_vault.name,
            timezone="UTC",
            backup={
                "frequency": "Daily",
                "time": "23:00",
            },
            retention_daily={
                "count": 10,
            },
            retention_weekly={
                "count": 7,
                "weekdays": [
                    "Sunday",
                    "Wednesday",
                    "Friday",
                    "Saturday",
                ],
            },
            retention_monthly={
                "count": 7,
                "weekdays": [
                    "Sunday",
                    "Wednesday",
                ],
                "weeks": [
                    "First",
                    "Last",
                ],
            },
            retention_yearly={
                "count": 7,
                "weekdays": ["Sunday"],
                "weeks": ["Last"],
                "months": ["January"],
            })
        ```

        ## Import

        Azure File Share Backup Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:backup/policyFileShare:PolicyFileShare policy1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.RecoveryServices/vaults/example-recovery-vault/backupPolicies/policy1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['PolicyFileShareBackupArgs', 'PolicyFileShareBackupArgsDict']] backup: Configures the Policy backup frequency and times as documented in the `backup` block below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_name: Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the policy. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['PolicyFileShareRetentionDailyArgs', 'PolicyFileShareRetentionDailyArgsDict']] retention_daily: Configures the policy daily retention as documented in the `retention_daily` block below.
        :param pulumi.Input[Union['PolicyFileShareRetentionMonthlyArgs', 'PolicyFileShareRetentionMonthlyArgsDict']] retention_monthly: Configures the policy monthly retention as documented in the `retention_monthly` block below.
        :param pulumi.Input[Union['PolicyFileShareRetentionWeeklyArgs', 'PolicyFileShareRetentionWeeklyArgsDict']] retention_weekly: Configures the policy weekly retention as documented in the `retention_weekly` block below.
        :param pulumi.Input[Union['PolicyFileShareRetentionYearlyArgs', 'PolicyFileShareRetentionYearlyArgsDict']] retention_yearly: Configures the policy yearly retention as documented in the `retention_yearly` block below.
        :param pulumi.Input[_builtins.str] timezone: Specifies the timezone. [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/). Defaults to `UTC`
               
               > **Note:** The maximum number of snapshots that Azure Files can retain is 200. If your combined snapshot count exceeds 200 based on your retention policies, it will result in an error. See [this](https://docs.microsoft.com/azure/backup/backup-azure-files-faq#what-is-the-maximum-retention-i-can-configure-for-backups) article for more information.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PolicyFileShareArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Azure File Share Backup Policy within a Recovery Services vault.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="tfex-recovery_vault",
            location="West Europe")
        example_vault = azure.recoveryservices.Vault("example",
            name="tfex-recovery-vault",
            location=example.location,
            resource_group_name=example.name,
            sku="Standard")
        policy = azure.backup.PolicyFileShare("policy",
            name="tfex-recovery-vault-policy",
            resource_group_name=example.name,
            recovery_vault_name=example_vault.name,
            timezone="UTC",
            backup={
                "frequency": "Daily",
                "time": "23:00",
            },
            retention_daily={
                "count": 10,
            },
            retention_weekly={
                "count": 7,
                "weekdays": [
                    "Sunday",
                    "Wednesday",
                    "Friday",
                    "Saturday",
                ],
            },
            retention_monthly={
                "count": 7,
                "weekdays": [
                    "Sunday",
                    "Wednesday",
                ],
                "weeks": [
                    "First",
                    "Last",
                ],
            },
            retention_yearly={
                "count": 7,
                "weekdays": ["Sunday"],
                "weeks": ["Last"],
                "months": ["January"],
            })
        ```

        ## Import

        Azure File Share Backup Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:backup/policyFileShare:PolicyFileShare policy1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.RecoveryServices/vaults/example-recovery-vault/backupPolicies/policy1
        ```

        :param str resource_name: The name of the resource.
        :param PolicyFileShareArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyFileShareArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup: Optional[pulumi.Input[Union['PolicyFileShareBackupArgs', 'PolicyFileShareBackupArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_vault_name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 retention_daily: Optional[pulumi.Input[Union['PolicyFileShareRetentionDailyArgs', 'PolicyFileShareRetentionDailyArgsDict']]] = None,
                 retention_monthly: Optional[pulumi.Input[Union['PolicyFileShareRetentionMonthlyArgs', 'PolicyFileShareRetentionMonthlyArgsDict']]] = None,
                 retention_weekly: Optional[pulumi.Input[Union['PolicyFileShareRetentionWeeklyArgs', 'PolicyFileShareRetentionWeeklyArgsDict']]] = None,
                 retention_yearly: Optional[pulumi.Input[Union['PolicyFileShareRetentionYearlyArgs', 'PolicyFileShareRetentionYearlyArgsDict']]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyFileShareArgs.__new__(PolicyFileShareArgs)

            if backup is None and not opts.urn:
                raise TypeError("Missing required property 'backup'")
            __props__.__dict__["backup"] = backup
            __props__.__dict__["name"] = name
            if recovery_vault_name is None and not opts.urn:
                raise TypeError("Missing required property 'recovery_vault_name'")
            __props__.__dict__["recovery_vault_name"] = recovery_vault_name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if retention_daily is None and not opts.urn:
                raise TypeError("Missing required property 'retention_daily'")
            __props__.__dict__["retention_daily"] = retention_daily
            __props__.__dict__["retention_monthly"] = retention_monthly
            __props__.__dict__["retention_weekly"] = retention_weekly
            __props__.__dict__["retention_yearly"] = retention_yearly
            __props__.__dict__["timezone"] = timezone
        super(PolicyFileShare, __self__).__init__(
            'azure:backup/policyFileShare:PolicyFileShare',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup: Optional[pulumi.Input[Union['PolicyFileShareBackupArgs', 'PolicyFileShareBackupArgsDict']]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            recovery_vault_name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            retention_daily: Optional[pulumi.Input[Union['PolicyFileShareRetentionDailyArgs', 'PolicyFileShareRetentionDailyArgsDict']]] = None,
            retention_monthly: Optional[pulumi.Input[Union['PolicyFileShareRetentionMonthlyArgs', 'PolicyFileShareRetentionMonthlyArgsDict']]] = None,
            retention_weekly: Optional[pulumi.Input[Union['PolicyFileShareRetentionWeeklyArgs', 'PolicyFileShareRetentionWeeklyArgsDict']]] = None,
            retention_yearly: Optional[pulumi.Input[Union['PolicyFileShareRetentionYearlyArgs', 'PolicyFileShareRetentionYearlyArgsDict']]] = None,
            timezone: Optional[pulumi.Input[_builtins.str]] = None) -> 'PolicyFileShare':
        """
        Get an existing PolicyFileShare resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['PolicyFileShareBackupArgs', 'PolicyFileShareBackupArgsDict']] backup: Configures the Policy backup frequency and times as documented in the `backup` block below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_name: Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the policy. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['PolicyFileShareRetentionDailyArgs', 'PolicyFileShareRetentionDailyArgsDict']] retention_daily: Configures the policy daily retention as documented in the `retention_daily` block below.
        :param pulumi.Input[Union['PolicyFileShareRetentionMonthlyArgs', 'PolicyFileShareRetentionMonthlyArgsDict']] retention_monthly: Configures the policy monthly retention as documented in the `retention_monthly` block below.
        :param pulumi.Input[Union['PolicyFileShareRetentionWeeklyArgs', 'PolicyFileShareRetentionWeeklyArgsDict']] retention_weekly: Configures the policy weekly retention as documented in the `retention_weekly` block below.
        :param pulumi.Input[Union['PolicyFileShareRetentionYearlyArgs', 'PolicyFileShareRetentionYearlyArgsDict']] retention_yearly: Configures the policy yearly retention as documented in the `retention_yearly` block below.
        :param pulumi.Input[_builtins.str] timezone: Specifies the timezone. [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/). Defaults to `UTC`
               
               > **Note:** The maximum number of snapshots that Azure Files can retain is 200. If your combined snapshot count exceeds 200 based on your retention policies, it will result in an error. See [this](https://docs.microsoft.com/azure/backup/backup-azure-files-faq#what-is-the-maximum-retention-i-can-configure-for-backups) article for more information.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyFileShareState.__new__(_PolicyFileShareState)

        __props__.__dict__["backup"] = backup
        __props__.__dict__["name"] = name
        __props__.__dict__["recovery_vault_name"] = recovery_vault_name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["retention_daily"] = retention_daily
        __props__.__dict__["retention_monthly"] = retention_monthly
        __props__.__dict__["retention_weekly"] = retention_weekly
        __props__.__dict__["retention_yearly"] = retention_yearly
        __props__.__dict__["timezone"] = timezone
        return PolicyFileShare(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def backup(self) -> pulumi.Output['outputs.PolicyFileShareBackup']:
        """
        Configures the Policy backup frequency and times as documented in the `backup` block below.
        """
        return pulumi.get(self, "backup")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="recoveryVaultName")
    def recovery_vault_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "recovery_vault_name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group in which to create the policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="retentionDaily")
    def retention_daily(self) -> pulumi.Output['outputs.PolicyFileShareRetentionDaily']:
        """
        Configures the policy daily retention as documented in the `retention_daily` block below.
        """
        return pulumi.get(self, "retention_daily")

    @_builtins.property
    @pulumi.getter(name="retentionMonthly")
    def retention_monthly(self) -> pulumi.Output[Optional['outputs.PolicyFileShareRetentionMonthly']]:
        """
        Configures the policy monthly retention as documented in the `retention_monthly` block below.
        """
        return pulumi.get(self, "retention_monthly")

    @_builtins.property
    @pulumi.getter(name="retentionWeekly")
    def retention_weekly(self) -> pulumi.Output[Optional['outputs.PolicyFileShareRetentionWeekly']]:
        """
        Configures the policy weekly retention as documented in the `retention_weekly` block below.
        """
        return pulumi.get(self, "retention_weekly")

    @_builtins.property
    @pulumi.getter(name="retentionYearly")
    def retention_yearly(self) -> pulumi.Output[Optional['outputs.PolicyFileShareRetentionYearly']]:
        """
        Configures the policy yearly retention as documented in the `retention_yearly` block below.
        """
        return pulumi.get(self, "retention_yearly")

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the timezone. [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/). Defaults to `UTC`

        > **Note:** The maximum number of snapshots that Azure Files can retain is 200. If your combined snapshot count exceeds 200 based on your retention policies, it will result in an error. See [this](https://docs.microsoft.com/azure/backup/backup-azure-files-faq#what-is-the-maximum-retention-i-can-configure-for-backups) article for more information.
        """
        return pulumi.get(self, "timezone")

