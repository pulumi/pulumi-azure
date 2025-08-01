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

__all__ = ['HypervNetworkMappingArgs', 'HypervNetworkMapping']

@pulumi.input_type
class HypervNetworkMappingArgs:
    def __init__(__self__, *,
                 recovery_vault_id: pulumi.Input[_builtins.str],
                 source_network_name: pulumi.Input[_builtins.str],
                 source_system_center_virtual_machine_manager_name: pulumi.Input[_builtins.str],
                 target_network_id: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a HypervNetworkMapping resource.
        :param pulumi.Input[_builtins.str] recovery_vault_id: The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_network_name: The Name of the primary network. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_system_center_virtual_machine_manager_name: Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_network_id: The id of the recovery network. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the HyperV network mapping. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "recovery_vault_id", recovery_vault_id)
        pulumi.set(__self__, "source_network_name", source_network_name)
        pulumi.set(__self__, "source_system_center_virtual_machine_manager_name", source_system_center_virtual_machine_manager_name)
        pulumi.set(__self__, "target_network_id", target_network_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="recoveryVaultId")
    def recovery_vault_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "recovery_vault_id")

    @recovery_vault_id.setter
    def recovery_vault_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "recovery_vault_id", value)

    @_builtins.property
    @pulumi.getter(name="sourceNetworkName")
    def source_network_name(self) -> pulumi.Input[_builtins.str]:
        """
        The Name of the primary network. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_network_name")

    @source_network_name.setter
    def source_network_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "source_network_name", value)

    @_builtins.property
    @pulumi.getter(name="sourceSystemCenterVirtualMachineManagerName")
    def source_system_center_virtual_machine_manager_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_system_center_virtual_machine_manager_name")

    @source_system_center_virtual_machine_manager_name.setter
    def source_system_center_virtual_machine_manager_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "source_system_center_virtual_machine_manager_name", value)

    @_builtins.property
    @pulumi.getter(name="targetNetworkId")
    def target_network_id(self) -> pulumi.Input[_builtins.str]:
        """
        The id of the recovery network. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "target_network_id")

    @target_network_id.setter
    def target_network_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "target_network_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the HyperV network mapping. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _HypervNetworkMappingState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 source_network_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_system_center_virtual_machine_manager_name: Optional[pulumi.Input[_builtins.str]] = None,
                 target_network_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering HypervNetworkMapping resources.
        :param pulumi.Input[_builtins.str] name: The name of the HyperV network mapping. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_id: The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_network_name: The Name of the primary network. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_system_center_virtual_machine_manager_name: Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_network_id: The id of the recovery network. Changing this forces a new resource to be created.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if recovery_vault_id is not None:
            pulumi.set(__self__, "recovery_vault_id", recovery_vault_id)
        if source_network_name is not None:
            pulumi.set(__self__, "source_network_name", source_network_name)
        if source_system_center_virtual_machine_manager_name is not None:
            pulumi.set(__self__, "source_system_center_virtual_machine_manager_name", source_system_center_virtual_machine_manager_name)
        if target_network_id is not None:
            pulumi.set(__self__, "target_network_id", target_network_id)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the HyperV network mapping. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="recoveryVaultId")
    def recovery_vault_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "recovery_vault_id")

    @recovery_vault_id.setter
    def recovery_vault_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "recovery_vault_id", value)

    @_builtins.property
    @pulumi.getter(name="sourceNetworkName")
    def source_network_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Name of the primary network. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_network_name")

    @source_network_name.setter
    def source_network_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_network_name", value)

    @_builtins.property
    @pulumi.getter(name="sourceSystemCenterVirtualMachineManagerName")
    def source_system_center_virtual_machine_manager_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_system_center_virtual_machine_manager_name")

    @source_system_center_virtual_machine_manager_name.setter
    def source_system_center_virtual_machine_manager_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_system_center_virtual_machine_manager_name", value)

    @_builtins.property
    @pulumi.getter(name="targetNetworkId")
    def target_network_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The id of the recovery network. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "target_network_id")

    @target_network_id.setter
    def target_network_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_network_id", value)


@pulumi.type_token("azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping")
class HypervNetworkMapping(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 source_network_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_system_center_virtual_machine_manager_name: Optional[pulumi.Input[_builtins.str]] = None,
                 target_network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a HyperV site recovery network mapping on Azure. A HyperV network mapping decides how to translate connected networks when a VM is migrated from HyperV VMM Center to Azure.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        target = azure.core.ResourceGroup("target",
            name="tfex-network-mapping",
            location="East US")
        vault = azure.recoveryservices.Vault("vault",
            name="example-recovery-vault",
            location=target.location,
            resource_group_name=target.name,
            sku="Standard")
        target_virtual_network = azure.network.VirtualNetwork("target",
            name="network",
            resource_group_name=target.name,
            address_spaces=["192.168.2.0/24"],
            location=target.location)
        recovery_mapping = azure.siterecovery.HypervNetworkMapping("recovery-mapping",
            name="recovery-network-mapping",
            recovery_vault_id=vault.id,
            source_system_center_virtual_machine_manager_name="my-vmm-server",
            source_network_name="my-vmm-network",
            target_network_id=target_virtual_network.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.RecoveryServices`: 2024-04-01

        ## Import

        Site Recovery Network Mapping can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping  azurerm_site_recovery_hyperv_network_mapping.mymapping /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/primary-fabric-name/replicationNetworks/azureNetwork/replicationNetworkMappings/mapping-name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: The name of the HyperV network mapping. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_id: The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_network_name: The Name of the primary network. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_system_center_virtual_machine_manager_name: Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_network_id: The id of the recovery network. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HypervNetworkMappingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a HyperV site recovery network mapping on Azure. A HyperV network mapping decides how to translate connected networks when a VM is migrated from HyperV VMM Center to Azure.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        target = azure.core.ResourceGroup("target",
            name="tfex-network-mapping",
            location="East US")
        vault = azure.recoveryservices.Vault("vault",
            name="example-recovery-vault",
            location=target.location,
            resource_group_name=target.name,
            sku="Standard")
        target_virtual_network = azure.network.VirtualNetwork("target",
            name="network",
            resource_group_name=target.name,
            address_spaces=["192.168.2.0/24"],
            location=target.location)
        recovery_mapping = azure.siterecovery.HypervNetworkMapping("recovery-mapping",
            name="recovery-network-mapping",
            recovery_vault_id=vault.id,
            source_system_center_virtual_machine_manager_name="my-vmm-server",
            source_network_name="my-vmm-network",
            target_network_id=target_virtual_network.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.RecoveryServices`: 2024-04-01

        ## Import

        Site Recovery Network Mapping can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping  azurerm_site_recovery_hyperv_network_mapping.mymapping /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/primary-fabric-name/replicationNetworks/azureNetwork/replicationNetworkMappings/mapping-name
        ```

        :param str resource_name: The name of the resource.
        :param HypervNetworkMappingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HypervNetworkMappingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 recovery_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
                 source_network_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_system_center_virtual_machine_manager_name: Optional[pulumi.Input[_builtins.str]] = None,
                 target_network_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HypervNetworkMappingArgs.__new__(HypervNetworkMappingArgs)

            __props__.__dict__["name"] = name
            if recovery_vault_id is None and not opts.urn:
                raise TypeError("Missing required property 'recovery_vault_id'")
            __props__.__dict__["recovery_vault_id"] = recovery_vault_id
            if source_network_name is None and not opts.urn:
                raise TypeError("Missing required property 'source_network_name'")
            __props__.__dict__["source_network_name"] = source_network_name
            if source_system_center_virtual_machine_manager_name is None and not opts.urn:
                raise TypeError("Missing required property 'source_system_center_virtual_machine_manager_name'")
            __props__.__dict__["source_system_center_virtual_machine_manager_name"] = source_system_center_virtual_machine_manager_name
            if target_network_id is None and not opts.urn:
                raise TypeError("Missing required property 'target_network_id'")
            __props__.__dict__["target_network_id"] = target_network_id
        super(HypervNetworkMapping, __self__).__init__(
            'azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            recovery_vault_id: Optional[pulumi.Input[_builtins.str]] = None,
            source_network_name: Optional[pulumi.Input[_builtins.str]] = None,
            source_system_center_virtual_machine_manager_name: Optional[pulumi.Input[_builtins.str]] = None,
            target_network_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'HypervNetworkMapping':
        """
        Get an existing HypervNetworkMapping resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: The name of the HyperV network mapping. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] recovery_vault_id: The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_network_name: The Name of the primary network. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_system_center_virtual_machine_manager_name: Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_network_id: The id of the recovery network. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HypervNetworkMappingState.__new__(_HypervNetworkMappingState)

        __props__.__dict__["name"] = name
        __props__.__dict__["recovery_vault_id"] = recovery_vault_id
        __props__.__dict__["source_network_name"] = source_network_name
        __props__.__dict__["source_system_center_virtual_machine_manager_name"] = source_system_center_virtual_machine_manager_name
        __props__.__dict__["target_network_id"] = target_network_id
        return HypervNetworkMapping(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the HyperV network mapping. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="recoveryVaultId")
    def recovery_vault_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Recovery Services Vault where the HyperV network mapping should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "recovery_vault_id")

    @_builtins.property
    @pulumi.getter(name="sourceNetworkName")
    def source_network_name(self) -> pulumi.Output[_builtins.str]:
        """
        The Name of the primary network. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_network_name")

    @_builtins.property
    @pulumi.getter(name="sourceSystemCenterVirtualMachineManagerName")
    def source_system_center_virtual_machine_manager_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of source System Center Virtual Machine Manager where the source network exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_system_center_virtual_machine_manager_name")

    @_builtins.property
    @pulumi.getter(name="targetNetworkId")
    def target_network_id(self) -> pulumi.Output[_builtins.str]:
        """
        The id of the recovery network. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "target_network_id")

