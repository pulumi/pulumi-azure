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
    'ElasticSanSku',
    'VolumeCreateSource',
    'VolumeGroupEncryption',
    'VolumeGroupIdentity',
    'VolumeGroupNetworkRule',
    'GetSkusResult',
    'GetVolumeGroupEncryptionResult',
    'GetVolumeGroupIdentityResult',
    'GetVolumeGroupNetworkRuleResult',
]

@pulumi.output_type
class ElasticSanSku(dict):
    def __init__(__self__, *,
                 name: _builtins.str,
                 tier: Optional[_builtins.str] = None):
        """
        :param _builtins.str name: The SKU name. Possible values are `Premium_LRS` and `Premium_ZRS`. Changing this forces a new resource to be created.
               
               > **Note:** `Premium_ZRS` SKU is only available in limited Azure regions including `France Central`, `North Europe`, `West Europe`, and `West US 2`. Please refer to this [document](https://azure.microsoft.com/updates/regional-expansion-azure-elastic-san-public-preview-is-now-available-in-more-regions) for more details.
        :param _builtins.str tier: The SKU tier. The only possible value is `Premium`. Defaults to `Premium`.
        """
        pulumi.set(__self__, "name", name)
        if tier is not None:
            pulumi.set(__self__, "tier", tier)

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The SKU name. Possible values are `Premium_LRS` and `Premium_ZRS`. Changing this forces a new resource to be created.

        > **Note:** `Premium_ZRS` SKU is only available in limited Azure regions including `France Central`, `North Europe`, `West Europe`, and `West US 2`. Please refer to this [document](https://azure.microsoft.com/updates/regional-expansion-azure-elastic-san-public-preview-is-now-available-in-more-regions) for more details.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def tier(self) -> Optional[_builtins.str]:
        """
        The SKU tier. The only possible value is `Premium`. Defaults to `Premium`.
        """
        return pulumi.get(self, "tier")


@pulumi.output_type
class VolumeCreateSource(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "sourceId":
            suggest = "source_id"
        elif key == "sourceType":
            suggest = "source_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in VolumeCreateSource. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        VolumeCreateSource.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        VolumeCreateSource.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 source_id: _builtins.str,
                 source_type: _builtins.str):
        """
        :param _builtins.str source_id: Specifies the ID of the source to create the Elastic SAN Volume from. Changing this forces a new resource to be created.
        :param _builtins.str source_type: Specifies the type of the source to create the Elastic SAN Volume from. Possible values are `Disk`, `DiskRestorePoint`, `DiskSnapshot` and `VolumeSnapshot`. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "source_id", source_id)
        pulumi.set(__self__, "source_type", source_type)

    @_builtins.property
    @pulumi.getter(name="sourceId")
    def source_id(self) -> _builtins.str:
        """
        Specifies the ID of the source to create the Elastic SAN Volume from. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_id")

    @_builtins.property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> _builtins.str:
        """
        Specifies the type of the source to create the Elastic SAN Volume from. Possible values are `Disk`, `DiskRestorePoint`, `DiskSnapshot` and `VolumeSnapshot`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_type")


@pulumi.output_type
class VolumeGroupEncryption(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "keyVaultKeyId":
            suggest = "key_vault_key_id"
        elif key == "currentVersionedKeyExpirationTimestamp":
            suggest = "current_versioned_key_expiration_timestamp"
        elif key == "currentVersionedKeyId":
            suggest = "current_versioned_key_id"
        elif key == "lastKeyRotationTimestamp":
            suggest = "last_key_rotation_timestamp"
        elif key == "userAssignedIdentityId":
            suggest = "user_assigned_identity_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in VolumeGroupEncryption. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        VolumeGroupEncryption.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        VolumeGroupEncryption.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 key_vault_key_id: _builtins.str,
                 current_versioned_key_expiration_timestamp: Optional[_builtins.str] = None,
                 current_versioned_key_id: Optional[_builtins.str] = None,
                 last_key_rotation_timestamp: Optional[_builtins.str] = None,
                 user_assigned_identity_id: Optional[_builtins.str] = None):
        """
        :param _builtins.str key_vault_key_id: The Key Vault key URI for Customer Managed Key encryption, which can be either a full URI or a versionless URI.
        :param _builtins.str current_versioned_key_expiration_timestamp: The timestamp of the expiration time for the current version of the customer managed key.
        :param _builtins.str current_versioned_key_id: The ID of the current versioned Key Vault Key in use.
        :param _builtins.str last_key_rotation_timestamp: The timestamp of the last rotation of the Key Vault Key.
        :param _builtins.str user_assigned_identity_id: The ID of the User Assigned Identity used by this Elastic SAN Volume Group.
        """
        pulumi.set(__self__, "key_vault_key_id", key_vault_key_id)
        if current_versioned_key_expiration_timestamp is not None:
            pulumi.set(__self__, "current_versioned_key_expiration_timestamp", current_versioned_key_expiration_timestamp)
        if current_versioned_key_id is not None:
            pulumi.set(__self__, "current_versioned_key_id", current_versioned_key_id)
        if last_key_rotation_timestamp is not None:
            pulumi.set(__self__, "last_key_rotation_timestamp", last_key_rotation_timestamp)
        if user_assigned_identity_id is not None:
            pulumi.set(__self__, "user_assigned_identity_id", user_assigned_identity_id)

    @_builtins.property
    @pulumi.getter(name="keyVaultKeyId")
    def key_vault_key_id(self) -> _builtins.str:
        """
        The Key Vault key URI for Customer Managed Key encryption, which can be either a full URI or a versionless URI.
        """
        return pulumi.get(self, "key_vault_key_id")

    @_builtins.property
    @pulumi.getter(name="currentVersionedKeyExpirationTimestamp")
    def current_versioned_key_expiration_timestamp(self) -> Optional[_builtins.str]:
        """
        The timestamp of the expiration time for the current version of the customer managed key.
        """
        return pulumi.get(self, "current_versioned_key_expiration_timestamp")

    @_builtins.property
    @pulumi.getter(name="currentVersionedKeyId")
    def current_versioned_key_id(self) -> Optional[_builtins.str]:
        """
        The ID of the current versioned Key Vault Key in use.
        """
        return pulumi.get(self, "current_versioned_key_id")

    @_builtins.property
    @pulumi.getter(name="lastKeyRotationTimestamp")
    def last_key_rotation_timestamp(self) -> Optional[_builtins.str]:
        """
        The timestamp of the last rotation of the Key Vault Key.
        """
        return pulumi.get(self, "last_key_rotation_timestamp")

    @_builtins.property
    @pulumi.getter(name="userAssignedIdentityId")
    def user_assigned_identity_id(self) -> Optional[_builtins.str]:
        """
        The ID of the User Assigned Identity used by this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "user_assigned_identity_id")


@pulumi.output_type
class VolumeGroupIdentity(dict):
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
            pulumi.log.warn(f"Key '{key}' not found in VolumeGroupIdentity. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        VolumeGroupIdentity.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        VolumeGroupIdentity.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 type: _builtins.str,
                 identity_ids: Optional[Sequence[_builtins.str]] = None,
                 principal_id: Optional[_builtins.str] = None,
                 tenant_id: Optional[_builtins.str] = None):
        """
        :param _builtins.str type: Specifies the type of Managed Identity that should be assigned to this Elastic SAN Volume Group. Possible values are `SystemAssigned` and `UserAssigned`.
        :param Sequence[_builtins.str] identity_ids: A list of the User Assigned Identity IDs that should be assigned to this Elastic SAN Volume Group.
        :param _builtins.str principal_id: The Principal ID associated with the Managed Service Identity assigned to this Elastic SAN Volume Group.
        :param _builtins.str tenant_id: The Tenant ID associated with this Managed Service Identity assigned to this Elastic SAN Volume Group.
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
        Specifies the type of Managed Identity that should be assigned to this Elastic SAN Volume Group. Possible values are `SystemAssigned` and `UserAssigned`.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Optional[Sequence[_builtins.str]]:
        """
        A list of the User Assigned Identity IDs that should be assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "identity_ids")

    @_builtins.property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> Optional[_builtins.str]:
        """
        The Principal ID associated with the Managed Service Identity assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "principal_id")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[_builtins.str]:
        """
        The Tenant ID associated with this Managed Service Identity assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "tenant_id")


@pulumi.output_type
class VolumeGroupNetworkRule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "subnetId":
            suggest = "subnet_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in VolumeGroupNetworkRule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        VolumeGroupNetworkRule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        VolumeGroupNetworkRule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 subnet_id: _builtins.str,
                 action: Optional[_builtins.str] = None):
        """
        :param _builtins.str subnet_id: The ID of the Subnet which should be allowed to access this Elastic SAN Volume Group.
        :param _builtins.str action: The action to take when the Subnet attempts to access this Elastic SAN Volume Group. The only possible value is `Allow`. Defaults to `Allow`.
        """
        pulumi.set(__self__, "subnet_id", subnet_id)
        if action is not None:
            pulumi.set(__self__, "action", action)

    @_builtins.property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> _builtins.str:
        """
        The ID of the Subnet which should be allowed to access this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "subnet_id")

    @_builtins.property
    @pulumi.getter
    def action(self) -> Optional[_builtins.str]:
        """
        The action to take when the Subnet attempts to access this Elastic SAN Volume Group. The only possible value is `Allow`. Defaults to `Allow`.
        """
        return pulumi.get(self, "action")


@pulumi.output_type
class GetSkusResult(dict):
    def __init__(__self__, *,
                 name: _builtins.str,
                 tier: _builtins.str):
        """
        :param _builtins.str name: The name of this Elastic SAN.
        :param _builtins.str tier: The SKU tier.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "tier", tier)

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The name of this Elastic SAN.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def tier(self) -> _builtins.str:
        """
        The SKU tier.
        """
        return pulumi.get(self, "tier")


@pulumi.output_type
class GetVolumeGroupEncryptionResult(dict):
    def __init__(__self__, *,
                 current_versioned_key_expiration_timestamp: _builtins.str,
                 current_versioned_key_id: _builtins.str,
                 key_vault_key_id: _builtins.str,
                 last_key_rotation_timestamp: _builtins.str,
                 user_assigned_identity_id: _builtins.str):
        """
        :param _builtins.str current_versioned_key_expiration_timestamp: The timestamp of the expiration time for the current version of the Customer Managed Key.
        :param _builtins.str current_versioned_key_id: The ID of the current versioned Key Vault Key in use.
        :param _builtins.str key_vault_key_id: The Key Vault Key URI for Customer Managed Key encryption, which can be either a full URI or a versionless URI.
        :param _builtins.str last_key_rotation_timestamp: The timestamp of the last rotation of the Key Vault Key.
        :param _builtins.str user_assigned_identity_id: The ID of the User Assigned Identity used by this Elastic SAN Volume Group.
        """
        pulumi.set(__self__, "current_versioned_key_expiration_timestamp", current_versioned_key_expiration_timestamp)
        pulumi.set(__self__, "current_versioned_key_id", current_versioned_key_id)
        pulumi.set(__self__, "key_vault_key_id", key_vault_key_id)
        pulumi.set(__self__, "last_key_rotation_timestamp", last_key_rotation_timestamp)
        pulumi.set(__self__, "user_assigned_identity_id", user_assigned_identity_id)

    @_builtins.property
    @pulumi.getter(name="currentVersionedKeyExpirationTimestamp")
    def current_versioned_key_expiration_timestamp(self) -> _builtins.str:
        """
        The timestamp of the expiration time for the current version of the Customer Managed Key.
        """
        return pulumi.get(self, "current_versioned_key_expiration_timestamp")

    @_builtins.property
    @pulumi.getter(name="currentVersionedKeyId")
    def current_versioned_key_id(self) -> _builtins.str:
        """
        The ID of the current versioned Key Vault Key in use.
        """
        return pulumi.get(self, "current_versioned_key_id")

    @_builtins.property
    @pulumi.getter(name="keyVaultKeyId")
    def key_vault_key_id(self) -> _builtins.str:
        """
        The Key Vault Key URI for Customer Managed Key encryption, which can be either a full URI or a versionless URI.
        """
        return pulumi.get(self, "key_vault_key_id")

    @_builtins.property
    @pulumi.getter(name="lastKeyRotationTimestamp")
    def last_key_rotation_timestamp(self) -> _builtins.str:
        """
        The timestamp of the last rotation of the Key Vault Key.
        """
        return pulumi.get(self, "last_key_rotation_timestamp")

    @_builtins.property
    @pulumi.getter(name="userAssignedIdentityId")
    def user_assigned_identity_id(self) -> _builtins.str:
        """
        The ID of the User Assigned Identity used by this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "user_assigned_identity_id")


@pulumi.output_type
class GetVolumeGroupIdentityResult(dict):
    def __init__(__self__, *,
                 identity_ids: Sequence[_builtins.str],
                 principal_id: _builtins.str,
                 tenant_id: _builtins.str,
                 type: _builtins.str):
        """
        :param Sequence[_builtins.str] identity_ids: A list of the User Assigned Identity IDs assigned to this Elastic SAN Volume Group.
        :param _builtins.str principal_id: The Principal ID associated with the Managed Service Identity assigned to this Elastic SAN Volume Group.
        :param _builtins.str tenant_id: The Tenant ID associated with this Managed Service Identity assigned to this Elastic SAN Volume Group.
        :param _builtins.str type: The type of Managed Identity assigned to this Elastic SAN Volume Group.
        """
        pulumi.set(__self__, "identity_ids", identity_ids)
        pulumi.set(__self__, "principal_id", principal_id)
        pulumi.set(__self__, "tenant_id", tenant_id)
        pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Sequence[_builtins.str]:
        """
        A list of the User Assigned Identity IDs assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "identity_ids")

    @_builtins.property
    @pulumi.getter(name="principalId")
    def principal_id(self) -> _builtins.str:
        """
        The Principal ID associated with the Managed Service Identity assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "principal_id")

    @_builtins.property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> _builtins.str:
        """
        The Tenant ID associated with this Managed Service Identity assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "tenant_id")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        The type of Managed Identity assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetVolumeGroupNetworkRuleResult(dict):
    def __init__(__self__, *,
                 action: _builtins.str,
                 subnet_id: _builtins.str):
        """
        :param _builtins.str action: The action to take when an access attempt to this Elastic SAN Volume Group from this Subnet is made.
        :param _builtins.str subnet_id: The ID of the Subnet from which access to this Elastic SAN Volume Group is allowed.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "subnet_id", subnet_id)

    @_builtins.property
    @pulumi.getter
    def action(self) -> _builtins.str:
        """
        The action to take when an access attempt to this Elastic SAN Volume Group from this Subnet is made.
        """
        return pulumi.get(self, "action")

    @_builtins.property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> _builtins.str:
        """
        The ID of the Subnet from which access to this Elastic SAN Volume Group is allowed.
        """
        return pulumi.get(self, "subnet_id")


