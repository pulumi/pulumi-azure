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
    'VaultEncryption',
    'VaultIdentity',
    'VaultMonitoring',
    'GetVaultIdentityResult',
]

@pulumi.output_type
class VaultEncryption(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "infrastructureEncryptionEnabled":
            suggest = "infrastructure_encryption_enabled"
        elif key == "keyId":
            suggest = "key_id"
        elif key == "useSystemAssignedIdentity":
            suggest = "use_system_assigned_identity"
        elif key == "userAssignedIdentityId":
            suggest = "user_assigned_identity_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in VaultEncryption. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        VaultEncryption.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        VaultEncryption.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 infrastructure_encryption_enabled: _builtins.bool,
                 key_id: _builtins.str,
                 use_system_assigned_identity: Optional[_builtins.bool] = None,
                 user_assigned_identity_id: Optional[_builtins.str] = None):
        """
        :param _builtins.bool infrastructure_encryption_enabled: Enabling/Disabling the Double Encryption state.
        :param _builtins.str key_id: The Key Vault key id used to encrypt this vault. Key managed by Vault Managed Hardware Security Module is also supported.
        :param _builtins.bool use_system_assigned_identity: Indicate that system assigned identity should be used or not. Defaults to `true`. Must be set to `false` when `user_assigned_identity_id` is set.
               
               !> **Note:** `use_system_assigned_identity` only be able to set to `false` for **new** vaults. Any vaults containing existing items registered or attempted to be registered to it are not supported. Details can be found in [the document](https://learn.microsoft.com/en-us/azure/backup/encryption-at-rest-with-cmk?tabs=portal#before-you-start)
               
               !> **Note:** Once `infrastructure_encryption_enabled` has been set it's not possible to change it.
        :param _builtins.str user_assigned_identity_id: Specifies the user assigned identity ID to be used.
        """
        pulumi.set(__self__, "infrastructure_encryption_enabled", infrastructure_encryption_enabled)
        pulumi.set(__self__, "key_id", key_id)
        if use_system_assigned_identity is not None:
            pulumi.set(__self__, "use_system_assigned_identity", use_system_assigned_identity)
        if user_assigned_identity_id is not None:
            pulumi.set(__self__, "user_assigned_identity_id", user_assigned_identity_id)

    @_builtins.property
    @pulumi.getter(name="infrastructureEncryptionEnabled")
    def infrastructure_encryption_enabled(self) -> _builtins.bool:
        """
        Enabling/Disabling the Double Encryption state.
        """
        return pulumi.get(self, "infrastructure_encryption_enabled")

    @_builtins.property
    @pulumi.getter(name="keyId")
    def key_id(self) -> _builtins.str:
        """
        The Key Vault key id used to encrypt this vault. Key managed by Vault Managed Hardware Security Module is also supported.
        """
        return pulumi.get(self, "key_id")

    @_builtins.property
    @pulumi.getter(name="useSystemAssignedIdentity")
    def use_system_assigned_identity(self) -> Optional[_builtins.bool]:
        """
        Indicate that system assigned identity should be used or not. Defaults to `true`. Must be set to `false` when `user_assigned_identity_id` is set.

        !> **Note:** `use_system_assigned_identity` only be able to set to `false` for **new** vaults. Any vaults containing existing items registered or attempted to be registered to it are not supported. Details can be found in [the document](https://learn.microsoft.com/en-us/azure/backup/encryption-at-rest-with-cmk?tabs=portal#before-you-start)

        !> **Note:** Once `infrastructure_encryption_enabled` has been set it's not possible to change it.
        """
        return pulumi.get(self, "use_system_assigned_identity")

    @_builtins.property
    @pulumi.getter(name="userAssignedIdentityId")
    def user_assigned_identity_id(self) -> Optional[_builtins.str]:
        """
        Specifies the user assigned identity ID to be used.
        """
        return pulumi.get(self, "user_assigned_identity_id")


@pulumi.output_type
class VaultIdentity(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "identityIds":
            suggest = "identity_ids"
        elif key == "principalId":
            suggest = "principal_id"
        elif key == "tenantId":
            suggest = "tenant_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in VaultIdentity. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        VaultIdentity.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        VaultIdentity.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 type: _builtins.str,
                 identity_ids: Optional[Sequence[_builtins.str]] = None,
                 principal_id: Optional[_builtins.str] = None,
                 tenant_id: Optional[_builtins.str] = None):
        """
        :param _builtins.str type: Specifies the type of Managed Service Identity that should be configured on this Recovery Services Vault. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
        :param Sequence[_builtins.str] identity_ids: A list of User Assigned Managed Identity IDs to be assigned to this App Configuration.
               
               > **Note:** `identity_ids` is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
        :param _builtins.str principal_id: The Principal ID associated with this Managed Service Identity.
        :param _builtins.str tenant_id: The Tenant ID associated with this Managed Service Identity.
        """
        pulumi.set(__self__, "type", type)
        if identity_ids is not None:
            pulumi.set(__self__, "identity_ids", identity_ids)
        if principal_id is not None:
            pulumi.set(__self__, "principal_id", principal_id)
        if tenant_id is not None:
            pulumi.set(__self__, "tenant_id", tenant_id)

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        Specifies the type of Managed Service Identity that should be configured on this Recovery Services Vault. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Optional[Sequence[_builtins.str]]:
        """
        A list of User Assigned Managed Identity IDs to be assigned to this App Configuration.

        > **Note:** `identity_ids` is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
        """
        return pulumi.get(self, "identity_ids")

    @_builtins.property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[_builtins.str]:
        """
        The Principal ID associated with this Managed Service Identity.
        """
        return pulumi.get(self, "principal_id")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[_builtins.str]:
        """
        The Tenant ID associated with this Managed Service Identity.
        """
        return pulumi.get(self, "tenant_id")


@pulumi.output_type
class VaultMonitoring(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "alertsForAllJobFailuresEnabled":
            suggest = "alerts_for_all_job_failures_enabled"
        elif key == "alertsForCriticalOperationFailuresEnabled":
            suggest = "alerts_for_critical_operation_failures_enabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in VaultMonitoring. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        VaultMonitoring.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        VaultMonitoring.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 alerts_for_all_job_failures_enabled: Optional[_builtins.bool] = None,
                 alerts_for_critical_operation_failures_enabled: Optional[_builtins.bool] = None):
        """
        :param _builtins.bool alerts_for_all_job_failures_enabled: Enabling/Disabling built-in Azure Monitor alerts for security scenarios and job failure scenarios. Defaults to `true`.
        :param _builtins.bool alerts_for_critical_operation_failures_enabled: Enabling/Disabling alerts from the older (classic alerts) solution. Defaults to `true`. More details could be found [here](https://learn.microsoft.com/en-us/azure/backup/monitoring-and-alerts-overview).
        """
        if alerts_for_all_job_failures_enabled is not None:
            pulumi.set(__self__, "alerts_for_all_job_failures_enabled", alerts_for_all_job_failures_enabled)
        if alerts_for_critical_operation_failures_enabled is not None:
            pulumi.set(__self__, "alerts_for_critical_operation_failures_enabled", alerts_for_critical_operation_failures_enabled)

    @_builtins.property
    @pulumi.getter(name="alertsForAllJobFailuresEnabled")
    def alerts_for_all_job_failures_enabled(self) -> Optional[_builtins.bool]:
        """
        Enabling/Disabling built-in Azure Monitor alerts for security scenarios and job failure scenarios. Defaults to `true`.
        """
        return pulumi.get(self, "alerts_for_all_job_failures_enabled")

    @_builtins.property
    @pulumi.getter(name="alertsForCriticalOperationFailuresEnabled")
    def alerts_for_critical_operation_failures_enabled(self) -> Optional[_builtins.bool]:
        """
        Enabling/Disabling alerts from the older (classic alerts) solution. Defaults to `true`. More details could be found [here](https://learn.microsoft.com/en-us/azure/backup/monitoring-and-alerts-overview).
        """
        return pulumi.get(self, "alerts_for_critical_operation_failures_enabled")


@pulumi.output_type
class GetVaultIdentityResult(dict):
    def __init__(__self__, *,
                 identity_ids: Sequence[_builtins.str],
                 principal_id: _builtins.str,
                 tenant_id: _builtins.str,
                 type: _builtins.str):
        """
        :param _builtins.str principal_id: The Principal ID associated with this Managed Service Identity.
        :param _builtins.str tenant_id: The Tenant ID associated with this Managed Service Identity.
        :param _builtins.str type: The identity type of this Managed Service Identity.
        """
        pulumi.set(__self__, "identity_ids", identity_ids)
        pulumi.set(__self__, "principal_id", principal_id)
        pulumi.set(__self__, "tenant_id", tenant_id)
        pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "identity_ids")

    @_builtins.property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> _builtins.str:
        """
        The Principal ID associated with this Managed Service Identity.
        """
        return pulumi.get(self, "principal_id")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> _builtins.str:
        """
        The Tenant ID associated with this Managed Service Identity.
        """
        return pulumi.get(self, "tenant_id")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        The identity type of this Managed Service Identity.
        """
        return pulumi.get(self, "type")


