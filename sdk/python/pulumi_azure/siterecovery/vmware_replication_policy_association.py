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

__all__ = ['VmwareReplicationPolicyAssociationArgs', 'VmwareReplicationPolicyAssociation']

@pulumi.input_type
class VmwareReplicationPolicyAssociationArgs:
    def __init__(__self__, *,
                 policy_id: pulumi.Input[_builtins.str],
                 recovery_vault_id: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a VmwareReplicationPolicyAssociation resource.
        :param pulumi.Input[_builtins.str] policy_id: The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_id: The ID of the Recovery Service Vault to which the policy should be associated.
               Changing this forces a new association to be created.
        :param pulumi.Input[_builtins.str] name: The name of the replication policy association. Changing this forces a new association to be created.
        """
        pulumi.set(__self__, "policy_id", policy_id)
        pulumi.set(__self__, "recovery_vault_id", recovery_vault_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "policy_id", value)

    @_builtins.property
    @pulumi.getter(name="recoveryVaultId")
    def recovery_vault_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Recovery Service Vault to which the policy should be associated.
        Changing this forces a new association to be created.
        """
        return pulumi.get(self, "recovery_vault_id")

    @recovery_vault_id.setter
    def recovery_vault_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "recovery_vault_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the replication policy association. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _VmwareReplicationPolicyAssociationState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_id: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_vault_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering VmwareReplicationPolicyAssociation resources.
        :param pulumi.Input[_builtins.str] name: The name of the replication policy association. Changing this forces a new association to be created.
        :param pulumi.Input[_builtins.str] policy_id: The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_id: The ID of the Recovery Service Vault to which the policy should be associated.
               Changing this forces a new association to be created.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)
        if recovery_vault_id is not None:
            pulumi.set(__self__, "recovery_vault_id", recovery_vault_id)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the replication policy association. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_id", value)

    @_builtins.property
    @pulumi.getter(name="recoveryVaultId")
    def recovery_vault_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Recovery Service Vault to which the policy should be associated.
        Changing this forces a new association to be created.
        """
        return pulumi.get(self, "recovery_vault_id")

    @recovery_vault_id.setter
    def recovery_vault_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recovery_vault_id", value)


@pulumi.type_token("azure:siterecovery/vmwareReplicationPolicyAssociation:VmwareReplicationPolicyAssociation")
class VmwareReplicationPolicyAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_id: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an Azure Site Recovery replication policy for VMWare within a Recovery Vault.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg",
            location="East US")
        example_vault = azure.recoveryservices.Vault("example",
            name="example-recovery-vault",
            location=example.location,
            resource_group_name=example.name,
            sku="Standard")
        example_vm_ware_replication_policy = azure.siterecovery.VMWareReplicationPolicy("example",
            name="example-policy",
            recovery_vault_id=example_vault.id,
            recovery_point_retention_in_minutes=1440,
            application_consistent_snapshot_frequency_in_minutes=240)
        example_vmware_replication_policy_association = azure.siterecovery.VmwareReplicationPolicyAssociation("example",
            name="example-association",
            recovery_vault_id=example_vault.id,
            policy_id=example_vm_ware_replication_policy.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.RecoveryServices`: 2024-04-01

        ## Import

        Site Recovery Replication Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:siterecovery/vmwareReplicationPolicyAssociation:VmwareReplicationPolicyAssociation mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/site-name/replicationProtectionContainers/container-name/replicationProtectionContainerMappings/mapping-name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: The name of the replication policy association. Changing this forces a new association to be created.
        :param pulumi.Input[_builtins.str] policy_id: The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_id: The ID of the Recovery Service Vault to which the policy should be associated.
               Changing this forces a new association to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VmwareReplicationPolicyAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Azure Site Recovery replication policy for VMWare within a Recovery Vault.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg",
            location="East US")
        example_vault = azure.recoveryservices.Vault("example",
            name="example-recovery-vault",
            location=example.location,
            resource_group_name=example.name,
            sku="Standard")
        example_vm_ware_replication_policy = azure.siterecovery.VMWareReplicationPolicy("example",
            name="example-policy",
            recovery_vault_id=example_vault.id,
            recovery_point_retention_in_minutes=1440,
            application_consistent_snapshot_frequency_in_minutes=240)
        example_vmware_replication_policy_association = azure.siterecovery.VmwareReplicationPolicyAssociation("example",
            name="example-association",
            recovery_vault_id=example_vault.id,
            policy_id=example_vm_ware_replication_policy.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.RecoveryServices`: 2024-04-01

        ## Import

        Site Recovery Replication Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:siterecovery/vmwareReplicationPolicyAssociation:VmwareReplicationPolicyAssociation mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/site-name/replicationProtectionContainers/container-name/replicationProtectionContainerMappings/mapping-name
        ```

        :param str resource_name: The name of the resource.
        :param VmwareReplicationPolicyAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VmwareReplicationPolicyAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_id: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VmwareReplicationPolicyAssociationArgs.__new__(VmwareReplicationPolicyAssociationArgs)

            __props__.__dict__["name"] = name
            if policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'policy_id'")
            __props__.__dict__["policy_id"] = policy_id
            if recovery_vault_id is None and not opts.urn:
                raise TypeError("Missing required property 'recovery_vault_id'")
            __props__.__dict__["recovery_vault_id"] = recovery_vault_id
        super(VmwareReplicationPolicyAssociation, __self__).__init__(
            'azure:siterecovery/vmwareReplicationPolicyAssociation:VmwareReplicationPolicyAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            policy_id: Optional[pulumi.Input[_builtins.str]] = None,
            recovery_vault_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'VmwareReplicationPolicyAssociation':
        """
        Get an existing VmwareReplicationPolicyAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: The name of the replication policy association. Changing this forces a new association to be created.
        :param pulumi.Input[_builtins.str] policy_id: The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_id: The ID of the Recovery Service Vault to which the policy should be associated.
               Changing this forces a new association to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VmwareReplicationPolicyAssociationState.__new__(_VmwareReplicationPolicyAssociationState)

        __props__.__dict__["name"] = name
        __props__.__dict__["policy_id"] = policy_id
        __props__.__dict__["recovery_vault_id"] = recovery_vault_id
        return VmwareReplicationPolicyAssociation(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the replication policy association. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the VMWare replication policy which to be associated. Changing this forces a new association to be created.
        """
        return pulumi.get(self, "policy_id")

    @_builtins.property
    @pulumi.getter(name="recoveryVaultId")
    def recovery_vault_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Recovery Service Vault to which the policy should be associated.
        Changing this forces a new association to be created.
        """
        return pulumi.get(self, "recovery_vault_id")

