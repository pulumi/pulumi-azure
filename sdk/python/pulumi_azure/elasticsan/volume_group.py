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

__all__ = ['VolumeGroupArgs', 'VolumeGroup']

@pulumi.input_type
class VolumeGroupArgs:
    def __init__(__self__, *,
                 elastic_san_id: pulumi.Input[_builtins.str],
                 encryption: Optional[pulumi.Input['VolumeGroupEncryptionArgs']] = None,
                 encryption_type: Optional[pulumi.Input[_builtins.str]] = None,
                 identity: Optional[pulumi.Input['VolumeGroupIdentityArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_rules: Optional[pulumi.Input[Sequence[pulumi.Input['VolumeGroupNetworkRuleArgs']]]] = None,
                 protocol_type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a VolumeGroup resource.
        :param pulumi.Input[_builtins.str] elastic_san_id: Specifies the Elastic SAN ID within which this Elastic SAN Volume Group should exist. Changing this forces a new resource to be created.
        :param pulumi.Input['VolumeGroupEncryptionArgs'] encryption: An `encryption` block as defined below.
               
               > **Note:** The `encryption` block can only be set when `encryption_type` is set to `EncryptionAtRestWithCustomerManagedKey`.
        :param pulumi.Input[_builtins.str] encryption_type: Specifies the type of the key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerManagedKey` and `EncryptionAtRestWithPlatformKey`. Defaults to `EncryptionAtRestWithPlatformKey`.
        :param pulumi.Input['VolumeGroupIdentityArgs'] identity: An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
        :param pulumi.Input[_builtins.str] name: Specifies the name of this Elastic SAN Volume Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['VolumeGroupNetworkRuleArgs']]] network_rules: One or more `network_rule` blocks as defined below.
        :param pulumi.Input[_builtins.str] protocol_type: Specifies the type of the storage target. The only possible value is `Iscsi`. Defaults to `Iscsi`.
        """
        pulumi.set(__self__, "elastic_san_id", elastic_san_id)
        if encryption is not None:
            pulumi.set(__self__, "encryption", encryption)
        if encryption_type is not None:
            pulumi.set(__self__, "encryption_type", encryption_type)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_rules is not None:
            pulumi.set(__self__, "network_rules", network_rules)
        if protocol_type is not None:
            pulumi.set(__self__, "protocol_type", protocol_type)

    @_builtins.property
    @pulumi.getter(name="elasticSanId")
    def elastic_san_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the Elastic SAN ID within which this Elastic SAN Volume Group should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "elastic_san_id")

    @elastic_san_id.setter
    def elastic_san_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "elastic_san_id", value)

    @_builtins.property
    @pulumi.getter
    def encryption(self) -> Optional[pulumi.Input['VolumeGroupEncryptionArgs']]:
        """
        An `encryption` block as defined below.

        > **Note:** The `encryption` block can only be set when `encryption_type` is set to `EncryptionAtRestWithCustomerManagedKey`.
        """
        return pulumi.get(self, "encryption")

    @encryption.setter
    def encryption(self, value: Optional[pulumi.Input['VolumeGroupEncryptionArgs']]):
        pulumi.set(self, "encryption", value)

    @_builtins.property
    @pulumi.getter(name="encryptionType")
    def encryption_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the type of the key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerManagedKey` and `EncryptionAtRestWithPlatformKey`. Defaults to `EncryptionAtRestWithPlatformKey`.
        """
        return pulumi.get(self, "encryption_type")

    @encryption_type.setter
    def encryption_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "encryption_type", value)

    @_builtins.property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['VolumeGroupIdentityArgs']]:
        """
        An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['VolumeGroupIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of this Elastic SAN Volume Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkRules")
    def network_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VolumeGroupNetworkRuleArgs']]]]:
        """
        One or more `network_rule` blocks as defined below.
        """
        return pulumi.get(self, "network_rules")

    @network_rules.setter
    def network_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VolumeGroupNetworkRuleArgs']]]]):
        pulumi.set(self, "network_rules", value)

    @_builtins.property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the type of the storage target. The only possible value is `Iscsi`. Defaults to `Iscsi`.
        """
        return pulumi.get(self, "protocol_type")

    @protocol_type.setter
    def protocol_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "protocol_type", value)


@pulumi.input_type
class _VolumeGroupState:
    def __init__(__self__, *,
                 elastic_san_id: Optional[pulumi.Input[_builtins.str]] = None,
                 encryption: Optional[pulumi.Input['VolumeGroupEncryptionArgs']] = None,
                 encryption_type: Optional[pulumi.Input[_builtins.str]] = None,
                 identity: Optional[pulumi.Input['VolumeGroupIdentityArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_rules: Optional[pulumi.Input[Sequence[pulumi.Input['VolumeGroupNetworkRuleArgs']]]] = None,
                 protocol_type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering VolumeGroup resources.
        :param pulumi.Input[_builtins.str] elastic_san_id: Specifies the Elastic SAN ID within which this Elastic SAN Volume Group should exist. Changing this forces a new resource to be created.
        :param pulumi.Input['VolumeGroupEncryptionArgs'] encryption: An `encryption` block as defined below.
               
               > **Note:** The `encryption` block can only be set when `encryption_type` is set to `EncryptionAtRestWithCustomerManagedKey`.
        :param pulumi.Input[_builtins.str] encryption_type: Specifies the type of the key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerManagedKey` and `EncryptionAtRestWithPlatformKey`. Defaults to `EncryptionAtRestWithPlatformKey`.
        :param pulumi.Input['VolumeGroupIdentityArgs'] identity: An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
        :param pulumi.Input[_builtins.str] name: Specifies the name of this Elastic SAN Volume Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['VolumeGroupNetworkRuleArgs']]] network_rules: One or more `network_rule` blocks as defined below.
        :param pulumi.Input[_builtins.str] protocol_type: Specifies the type of the storage target. The only possible value is `Iscsi`. Defaults to `Iscsi`.
        """
        if elastic_san_id is not None:
            pulumi.set(__self__, "elastic_san_id", elastic_san_id)
        if encryption is not None:
            pulumi.set(__self__, "encryption", encryption)
        if encryption_type is not None:
            pulumi.set(__self__, "encryption_type", encryption_type)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_rules is not None:
            pulumi.set(__self__, "network_rules", network_rules)
        if protocol_type is not None:
            pulumi.set(__self__, "protocol_type", protocol_type)

    @_builtins.property
    @pulumi.getter(name="elasticSanId")
    def elastic_san_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Elastic SAN ID within which this Elastic SAN Volume Group should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "elastic_san_id")

    @elastic_san_id.setter
    def elastic_san_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "elastic_san_id", value)

    @_builtins.property
    @pulumi.getter
    def encryption(self) -> Optional[pulumi.Input['VolumeGroupEncryptionArgs']]:
        """
        An `encryption` block as defined below.

        > **Note:** The `encryption` block can only be set when `encryption_type` is set to `EncryptionAtRestWithCustomerManagedKey`.
        """
        return pulumi.get(self, "encryption")

    @encryption.setter
    def encryption(self, value: Optional[pulumi.Input['VolumeGroupEncryptionArgs']]):
        pulumi.set(self, "encryption", value)

    @_builtins.property
    @pulumi.getter(name="encryptionType")
    def encryption_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the type of the key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerManagedKey` and `EncryptionAtRestWithPlatformKey`. Defaults to `EncryptionAtRestWithPlatformKey`.
        """
        return pulumi.get(self, "encryption_type")

    @encryption_type.setter
    def encryption_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "encryption_type", value)

    @_builtins.property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['VolumeGroupIdentityArgs']]:
        """
        An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['VolumeGroupIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of this Elastic SAN Volume Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkRules")
    def network_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VolumeGroupNetworkRuleArgs']]]]:
        """
        One or more `network_rule` blocks as defined below.
        """
        return pulumi.get(self, "network_rules")

    @network_rules.setter
    def network_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VolumeGroupNetworkRuleArgs']]]]):
        pulumi.set(self, "network_rules", value)

    @_builtins.property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the type of the storage target. The only possible value is `Iscsi`. Defaults to `Iscsi`.
        """
        return pulumi.get(self, "protocol_type")

    @protocol_type.setter
    def protocol_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "protocol_type", value)


@pulumi.type_token("azure:elasticsan/volumeGroup:VolumeGroup")
class VolumeGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 elastic_san_id: Optional[pulumi.Input[_builtins.str]] = None,
                 encryption: Optional[pulumi.Input[Union['VolumeGroupEncryptionArgs', 'VolumeGroupEncryptionArgsDict']]] = None,
                 encryption_type: Optional[pulumi.Input[_builtins.str]] = None,
                 identity: Optional[pulumi.Input[Union['VolumeGroupIdentityArgs', 'VolumeGroupIdentityArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VolumeGroupNetworkRuleArgs', 'VolumeGroupNetworkRuleArgsDict']]]]] = None,
                 protocol_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an Elastic SAN Volume Group resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg",
            location="West Europe")
        example_elastic_san = azure.elasticsan.ElasticSan("example",
            name="examplees-es",
            resource_group_name=example.name,
            location=example.location,
            base_size_in_tib=1,
            sku={
                "name": "Premium_LRS",
            })
        current = azure.core.get_client_config()
        example_user_assigned_identity = azure.authorization.UserAssignedIdentity("example",
            name="example-uai",
            location=example.location,
            resource_group_name=example.name)
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-vnet",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="example-subnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.1.0/24"],
            service_endpoints=["Microsoft.Storage.Global"])
        example_key_vault = azure.keyvault.KeyVault("example",
            name="examplekv",
            location=example.location,
            resource_group_name=example.name,
            enabled_for_disk_encryption=True,
            tenant_id=current.tenant_id,
            soft_delete_retention_days=7,
            purge_protection_enabled=True,
            sku_name="standard")
        user_assigned_identity = azure.keyvault.AccessPolicy("userAssignedIdentity",
            key_vault_id=example_key_vault.id,
            tenant_id=current.tenant_id,
            object_id=example_user_assigned_identity.principal_id,
            key_permissions=[
                "Get",
                "UnwrapKey",
                "WrapKey",
            ],
            secret_permissions=["Get"])
        client = azure.keyvault.AccessPolicy("client",
            key_vault_id=example_key_vault.id,
            tenant_id=current.tenant_id,
            object_id=current.object_id,
            key_permissions=[
                "Get",
                "Create",
                "Delete",
                "List",
                "Restore",
                "Recover",
                "UnwrapKey",
                "WrapKey",
                "Purge",
                "Encrypt",
                "Decrypt",
                "Sign",
                "Verify",
                "GetRotationPolicy",
            ],
            secret_permissions=["Get"])
        example_key = azure.keyvault.Key("example",
            name="example-kvk",
            key_vault_id=example_key_vault.id,
            key_type="RSA",
            key_size=2048,
            key_opts=[
                "decrypt",
                "encrypt",
                "sign",
                "unwrapKey",
                "verify",
                "wrapKey",
            ],
            opts = pulumi.ResourceOptions(depends_on=[
                    user_assigned_identity,
                    client,
                ]))
        example_volume_group = azure.elasticsan.VolumeGroup("example",
            name="example-esvg",
            elastic_san_id=example_elastic_san.id,
            encryption_type="EncryptionAtRestWithCustomerManagedKey",
            encryption={
                "key_vault_key_id": example_key.versionless_id,
                "user_assigned_identity_id": example_user_assigned_identity.id,
            },
            identity={
                "type": "UserAssigned",
                "identity_ids": [example_user_assigned_identity.id],
            },
            network_rules=[{
                "subnet_id": example_subnet.id,
                "action": "Allow",
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ElasticSan`: 2023-01-01

        ## Import

        An existing Elastic SAN Volume Group can be imported into Pulumi using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:elasticsan/volumeGroup:VolumeGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.ElasticSan/elasticSans/esan1/volumeGroups/vg1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] elastic_san_id: Specifies the Elastic SAN ID within which this Elastic SAN Volume Group should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['VolumeGroupEncryptionArgs', 'VolumeGroupEncryptionArgsDict']] encryption: An `encryption` block as defined below.
               
               > **Note:** The `encryption` block can only be set when `encryption_type` is set to `EncryptionAtRestWithCustomerManagedKey`.
        :param pulumi.Input[_builtins.str] encryption_type: Specifies the type of the key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerManagedKey` and `EncryptionAtRestWithPlatformKey`. Defaults to `EncryptionAtRestWithPlatformKey`.
        :param pulumi.Input[Union['VolumeGroupIdentityArgs', 'VolumeGroupIdentityArgsDict']] identity: An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
        :param pulumi.Input[_builtins.str] name: Specifies the name of this Elastic SAN Volume Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VolumeGroupNetworkRuleArgs', 'VolumeGroupNetworkRuleArgsDict']]]] network_rules: One or more `network_rule` blocks as defined below.
        :param pulumi.Input[_builtins.str] protocol_type: Specifies the type of the storage target. The only possible value is `Iscsi`. Defaults to `Iscsi`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VolumeGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Elastic SAN Volume Group resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg",
            location="West Europe")
        example_elastic_san = azure.elasticsan.ElasticSan("example",
            name="examplees-es",
            resource_group_name=example.name,
            location=example.location,
            base_size_in_tib=1,
            sku={
                "name": "Premium_LRS",
            })
        current = azure.core.get_client_config()
        example_user_assigned_identity = azure.authorization.UserAssignedIdentity("example",
            name="example-uai",
            location=example.location,
            resource_group_name=example.name)
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-vnet",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="example-subnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.1.0/24"],
            service_endpoints=["Microsoft.Storage.Global"])
        example_key_vault = azure.keyvault.KeyVault("example",
            name="examplekv",
            location=example.location,
            resource_group_name=example.name,
            enabled_for_disk_encryption=True,
            tenant_id=current.tenant_id,
            soft_delete_retention_days=7,
            purge_protection_enabled=True,
            sku_name="standard")
        user_assigned_identity = azure.keyvault.AccessPolicy("userAssignedIdentity",
            key_vault_id=example_key_vault.id,
            tenant_id=current.tenant_id,
            object_id=example_user_assigned_identity.principal_id,
            key_permissions=[
                "Get",
                "UnwrapKey",
                "WrapKey",
            ],
            secret_permissions=["Get"])
        client = azure.keyvault.AccessPolicy("client",
            key_vault_id=example_key_vault.id,
            tenant_id=current.tenant_id,
            object_id=current.object_id,
            key_permissions=[
                "Get",
                "Create",
                "Delete",
                "List",
                "Restore",
                "Recover",
                "UnwrapKey",
                "WrapKey",
                "Purge",
                "Encrypt",
                "Decrypt",
                "Sign",
                "Verify",
                "GetRotationPolicy",
            ],
            secret_permissions=["Get"])
        example_key = azure.keyvault.Key("example",
            name="example-kvk",
            key_vault_id=example_key_vault.id,
            key_type="RSA",
            key_size=2048,
            key_opts=[
                "decrypt",
                "encrypt",
                "sign",
                "unwrapKey",
                "verify",
                "wrapKey",
            ],
            opts = pulumi.ResourceOptions(depends_on=[
                    user_assigned_identity,
                    client,
                ]))
        example_volume_group = azure.elasticsan.VolumeGroup("example",
            name="example-esvg",
            elastic_san_id=example_elastic_san.id,
            encryption_type="EncryptionAtRestWithCustomerManagedKey",
            encryption={
                "key_vault_key_id": example_key.versionless_id,
                "user_assigned_identity_id": example_user_assigned_identity.id,
            },
            identity={
                "type": "UserAssigned",
                "identity_ids": [example_user_assigned_identity.id],
            },
            network_rules=[{
                "subnet_id": example_subnet.id,
                "action": "Allow",
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.ElasticSan`: 2023-01-01

        ## Import

        An existing Elastic SAN Volume Group can be imported into Pulumi using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:elasticsan/volumeGroup:VolumeGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.ElasticSan/elasticSans/esan1/volumeGroups/vg1
        ```

        :param str resource_name: The name of the resource.
        :param VolumeGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VolumeGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 elastic_san_id: Optional[pulumi.Input[_builtins.str]] = None,
                 encryption: Optional[pulumi.Input[Union['VolumeGroupEncryptionArgs', 'VolumeGroupEncryptionArgsDict']]] = None,
                 encryption_type: Optional[pulumi.Input[_builtins.str]] = None,
                 identity: Optional[pulumi.Input[Union['VolumeGroupIdentityArgs', 'VolumeGroupIdentityArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VolumeGroupNetworkRuleArgs', 'VolumeGroupNetworkRuleArgsDict']]]]] = None,
                 protocol_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VolumeGroupArgs.__new__(VolumeGroupArgs)

            if elastic_san_id is None and not opts.urn:
                raise TypeError("Missing required property 'elastic_san_id'")
            __props__.__dict__["elastic_san_id"] = elastic_san_id
            __props__.__dict__["encryption"] = encryption
            __props__.__dict__["encryption_type"] = encryption_type
            __props__.__dict__["identity"] = identity
            __props__.__dict__["name"] = name
            __props__.__dict__["network_rules"] = network_rules
            __props__.__dict__["protocol_type"] = protocol_type
        super(VolumeGroup, __self__).__init__(
            'azure:elasticsan/volumeGroup:VolumeGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            elastic_san_id: Optional[pulumi.Input[_builtins.str]] = None,
            encryption: Optional[pulumi.Input[Union['VolumeGroupEncryptionArgs', 'VolumeGroupEncryptionArgsDict']]] = None,
            encryption_type: Optional[pulumi.Input[_builtins.str]] = None,
            identity: Optional[pulumi.Input[Union['VolumeGroupIdentityArgs', 'VolumeGroupIdentityArgsDict']]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            network_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VolumeGroupNetworkRuleArgs', 'VolumeGroupNetworkRuleArgsDict']]]]] = None,
            protocol_type: Optional[pulumi.Input[_builtins.str]] = None) -> 'VolumeGroup':
        """
        Get an existing VolumeGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] elastic_san_id: Specifies the Elastic SAN ID within which this Elastic SAN Volume Group should exist. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['VolumeGroupEncryptionArgs', 'VolumeGroupEncryptionArgsDict']] encryption: An `encryption` block as defined below.
               
               > **Note:** The `encryption` block can only be set when `encryption_type` is set to `EncryptionAtRestWithCustomerManagedKey`.
        :param pulumi.Input[_builtins.str] encryption_type: Specifies the type of the key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerManagedKey` and `EncryptionAtRestWithPlatformKey`. Defaults to `EncryptionAtRestWithPlatformKey`.
        :param pulumi.Input[Union['VolumeGroupIdentityArgs', 'VolumeGroupIdentityArgsDict']] identity: An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
        :param pulumi.Input[_builtins.str] name: Specifies the name of this Elastic SAN Volume Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VolumeGroupNetworkRuleArgs', 'VolumeGroupNetworkRuleArgsDict']]]] network_rules: One or more `network_rule` blocks as defined below.
        :param pulumi.Input[_builtins.str] protocol_type: Specifies the type of the storage target. The only possible value is `Iscsi`. Defaults to `Iscsi`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VolumeGroupState.__new__(_VolumeGroupState)

        __props__.__dict__["elastic_san_id"] = elastic_san_id
        __props__.__dict__["encryption"] = encryption
        __props__.__dict__["encryption_type"] = encryption_type
        __props__.__dict__["identity"] = identity
        __props__.__dict__["name"] = name
        __props__.__dict__["network_rules"] = network_rules
        __props__.__dict__["protocol_type"] = protocol_type
        return VolumeGroup(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="elasticSanId")
    def elastic_san_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the Elastic SAN ID within which this Elastic SAN Volume Group should exist. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "elastic_san_id")

    @_builtins.property
    @pulumi.getter
    def encryption(self) -> pulumi.Output[Optional['outputs.VolumeGroupEncryption']]:
        """
        An `encryption` block as defined below.

        > **Note:** The `encryption` block can only be set when `encryption_type` is set to `EncryptionAtRestWithCustomerManagedKey`.
        """
        return pulumi.get(self, "encryption")

    @_builtins.property
    @pulumi.getter(name="encryptionType")
    def encryption_type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the type of the key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerManagedKey` and `EncryptionAtRestWithPlatformKey`. Defaults to `EncryptionAtRestWithPlatformKey`.
        """
        return pulumi.get(self, "encryption_type")

    @_builtins.property
    @pulumi.getter
    def identity(self) -> pulumi.Output[Optional['outputs.VolumeGroupIdentity']]:
        """
        An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Elastic SAN Volume Group.
        """
        return pulumi.get(self, "identity")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of this Elastic SAN Volume Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkRules")
    def network_rules(self) -> pulumi.Output[Optional[Sequence['outputs.VolumeGroupNetworkRule']]]:
        """
        One or more `network_rule` blocks as defined below.
        """
        return pulumi.get(self, "network_rules")

    @_builtins.property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the type of the storage target. The only possible value is `Iscsi`. Defaults to `Iscsi`.
        """
        return pulumi.get(self, "protocol_type")

