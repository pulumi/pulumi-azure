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

__all__ = ['BackupInstanceBlogStorageArgs', 'BackupInstanceBlogStorage']

@pulumi.input_type
class BackupInstanceBlogStorageArgs:
    def __init__(__self__, *,
                 backup_policy_id: pulumi.Input[_builtins.str],
                 storage_account_id: pulumi.Input[_builtins.str],
                 vault_id: pulumi.Input[_builtins.str],
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_container_names: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a BackupInstanceBlogStorage resource.
        :param pulumi.Input[_builtins.str] backup_policy_id: The ID of the Backup Policy.
        :param pulumi.Input[_builtins.str] storage_account_id: The ID of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[_builtins.str] vault_id: The ID of the Backup Vault within which the Backup Instance Blob Storage should exist. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[_builtins.str] location: The location of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Backup Instance Blob Storage. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_account_container_names: The list of the container names of the source Storage Account.
               
               > **Note:** The `storage_account_container_names` should be specified in the vaulted backup policy/operational and vaulted hybrid backup policy. Removing the `storage_account_container_names` will force a new resource to be created since it can't be removed once specified.
        """
        pulumi.set(__self__, "backup_policy_id", backup_policy_id)
        pulumi.set(__self__, "storage_account_id", storage_account_id)
        pulumi.set(__self__, "vault_id", vault_id)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_account_container_names is not None:
            pulumi.set(__self__, "storage_account_container_names", storage_account_container_names)

    @_builtins.property
    @pulumi.getter(name="backupPolicyId")
    def backup_policy_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Backup Policy.
        """
        return pulumi.get(self, "backup_policy_id")

    @backup_policy_id.setter
    def backup_policy_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "backup_policy_id", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "storage_account_id")

    @storage_account_id.setter
    def storage_account_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "storage_account_id", value)

    @_builtins.property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Backup Vault within which the Backup Instance Blob Storage should exist. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "vault_id")

    @vault_id.setter
    def vault_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "vault_id", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Backup Instance Blob Storage. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountContainerNames")
    def storage_account_container_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of the container names of the source Storage Account.

        > **Note:** The `storage_account_container_names` should be specified in the vaulted backup policy/operational and vaulted hybrid backup policy. Removing the `storage_account_container_names` will force a new resource to be created since it can't be removed once specified.
        """
        return pulumi.get(self, "storage_account_container_names")

    @storage_account_container_names.setter
    def storage_account_container_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "storage_account_container_names", value)


@pulumi.input_type
class _BackupInstanceBlogStorageState:
    def __init__(__self__, *,
                 backup_policy_id: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_container_names: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering BackupInstanceBlogStorage resources.
        :param pulumi.Input[_builtins.str] backup_policy_id: The ID of the Backup Policy.
        :param pulumi.Input[_builtins.str] location: The location of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Backup Instance Blob Storage. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_account_container_names: The list of the container names of the source Storage Account.
               
               > **Note:** The `storage_account_container_names` should be specified in the vaulted backup policy/operational and vaulted hybrid backup policy. Removing the `storage_account_container_names` will force a new resource to be created since it can't be removed once specified.
        :param pulumi.Input[_builtins.str] storage_account_id: The ID of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[_builtins.str] vault_id: The ID of the Backup Vault within which the Backup Instance Blob Storage should exist. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        if backup_policy_id is not None:
            pulumi.set(__self__, "backup_policy_id", backup_policy_id)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_account_container_names is not None:
            pulumi.set(__self__, "storage_account_container_names", storage_account_container_names)
        if storage_account_id is not None:
            pulumi.set(__self__, "storage_account_id", storage_account_id)
        if vault_id is not None:
            pulumi.set(__self__, "vault_id", vault_id)

    @_builtins.property
    @pulumi.getter(name="backupPolicyId")
    def backup_policy_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Backup Policy.
        """
        return pulumi.get(self, "backup_policy_id")

    @backup_policy_id.setter
    def backup_policy_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "backup_policy_id", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Backup Instance Blob Storage. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountContainerNames")
    def storage_account_container_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of the container names of the source Storage Account.

        > **Note:** The `storage_account_container_names` should be specified in the vaulted backup policy/operational and vaulted hybrid backup policy. Removing the `storage_account_container_names` will force a new resource to be created since it can't be removed once specified.
        """
        return pulumi.get(self, "storage_account_container_names")

    @storage_account_container_names.setter
    def storage_account_container_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "storage_account_container_names", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "storage_account_id")

    @storage_account_id.setter
    def storage_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_account_id", value)

    @_builtins.property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Backup Vault within which the Backup Instance Blob Storage should exist. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "vault_id")

    @vault_id.setter
    def vault_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vault_id", value)


@pulumi.type_token("azure:dataprotection/backupInstanceBlogStorage:BackupInstanceBlogStorage")
class BackupInstanceBlogStorage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_policy_id: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_container_names: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Backup Instance Blob Storage.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="storageaccountname",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_backup_vault = azure.dataprotection.BackupVault("example",
            name="example-backup-vault",
            resource_group_name=example.name,
            location=example.location,
            datastore_type="VaultStore",
            redundancy="LocallyRedundant",
            identity={
                "type": "SystemAssigned",
            })
        example_assignment = azure.authorization.Assignment("example",
            scope=example_account.id,
            role_definition_name="Storage Account Backup Contributor",
            principal_id=example_backup_vault.identity.principal_id)
        example_backup_policy_blob_storage = azure.dataprotection.BackupPolicyBlobStorage("example",
            name="example-backup-policy",
            vault_id=example_backup_vault.id,
            operational_default_retention_duration="P30D")
        example_backup_instance_blog_storage = azure.dataprotection.BackupInstanceBlogStorage("example",
            name="example-backup-instance",
            vault_id=example_backup_vault.id,
            location=example.location,
            storage_account_id=example_account.id,
            backup_policy_id=example_backup_policy_blob_storage.id,
            opts = pulumi.ResourceOptions(depends_on=[example_assignment]))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DataProtection`: 2024-04-01

        ## Import

        Backup Instance Blob Storages can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:dataprotection/backupInstanceBlogStorage:BackupInstanceBlogStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1/backupInstances/backupInstance1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] backup_policy_id: The ID of the Backup Policy.
        :param pulumi.Input[_builtins.str] location: The location of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Backup Instance Blob Storage. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_account_container_names: The list of the container names of the source Storage Account.
               
               > **Note:** The `storage_account_container_names` should be specified in the vaulted backup policy/operational and vaulted hybrid backup policy. Removing the `storage_account_container_names` will force a new resource to be created since it can't be removed once specified.
        :param pulumi.Input[_builtins.str] storage_account_id: The ID of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[_builtins.str] vault_id: The ID of the Backup Vault within which the Backup Instance Blob Storage should exist. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupInstanceBlogStorageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Backup Instance Blob Storage.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="storageaccountname",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_backup_vault = azure.dataprotection.BackupVault("example",
            name="example-backup-vault",
            resource_group_name=example.name,
            location=example.location,
            datastore_type="VaultStore",
            redundancy="LocallyRedundant",
            identity={
                "type": "SystemAssigned",
            })
        example_assignment = azure.authorization.Assignment("example",
            scope=example_account.id,
            role_definition_name="Storage Account Backup Contributor",
            principal_id=example_backup_vault.identity.principal_id)
        example_backup_policy_blob_storage = azure.dataprotection.BackupPolicyBlobStorage("example",
            name="example-backup-policy",
            vault_id=example_backup_vault.id,
            operational_default_retention_duration="P30D")
        example_backup_instance_blog_storage = azure.dataprotection.BackupInstanceBlogStorage("example",
            name="example-backup-instance",
            vault_id=example_backup_vault.id,
            location=example.location,
            storage_account_id=example_account.id,
            backup_policy_id=example_backup_policy_blob_storage.id,
            opts = pulumi.ResourceOptions(depends_on=[example_assignment]))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DataProtection`: 2024-04-01

        ## Import

        Backup Instance Blob Storages can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:dataprotection/backupInstanceBlogStorage:BackupInstanceBlogStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1/backupInstances/backupInstance1
        ```

        :param str resource_name: The name of the resource.
        :param BackupInstanceBlogStorageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackupInstanceBlogStorageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_policy_id: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_container_names: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupInstanceBlogStorageArgs.__new__(BackupInstanceBlogStorageArgs)

            if backup_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'backup_policy_id'")
            __props__.__dict__["backup_policy_id"] = backup_policy_id
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["storage_account_container_names"] = storage_account_container_names
            if storage_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_account_id'")
            __props__.__dict__["storage_account_id"] = storage_account_id
            if vault_id is None and not opts.urn:
                raise TypeError("Missing required property 'vault_id'")
            __props__.__dict__["vault_id"] = vault_id
        super(BackupInstanceBlogStorage, __self__).__init__(
            'azure:dataprotection/backupInstanceBlogStorage:BackupInstanceBlogStorage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_policy_id: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            storage_account_container_names: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
            vault_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'BackupInstanceBlogStorage':
        """
        Get an existing BackupInstanceBlogStorage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] backup_policy_id: The ID of the Backup Policy.
        :param pulumi.Input[_builtins.str] location: The location of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Backup Instance Blob Storage. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_account_container_names: The list of the container names of the source Storage Account.
               
               > **Note:** The `storage_account_container_names` should be specified in the vaulted backup policy/operational and vaulted hybrid backup policy. Removing the `storage_account_container_names` will force a new resource to be created since it can't be removed once specified.
        :param pulumi.Input[_builtins.str] storage_account_id: The ID of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        :param pulumi.Input[_builtins.str] vault_id: The ID of the Backup Vault within which the Backup Instance Blob Storage should exist. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupInstanceBlogStorageState.__new__(_BackupInstanceBlogStorageState)

        __props__.__dict__["backup_policy_id"] = backup_policy_id
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["storage_account_container_names"] = storage_account_container_names
        __props__.__dict__["storage_account_id"] = storage_account_id
        __props__.__dict__["vault_id"] = vault_id
        return BackupInstanceBlogStorage(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="backupPolicyId")
    def backup_policy_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Backup Policy.
        """
        return pulumi.get(self, "backup_policy_id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The location of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Backup Instance Blob Storage. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="storageAccountContainerNames")
    def storage_account_container_names(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        The list of the container names of the source Storage Account.

        > **Note:** The `storage_account_container_names` should be specified in the vaulted backup policy/operational and vaulted hybrid backup policy. Removing the `storage_account_container_names` will force a new resource to be created since it can't be removed once specified.
        """
        return pulumi.get(self, "storage_account_container_names")

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the source Storage Account. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "storage_account_id")

    @_builtins.property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Backup Vault within which the Backup Instance Blob Storage should exist. Changing this forces a new Backup Instance Blob Storage to be created.
        """
        return pulumi.get(self, "vault_id")

