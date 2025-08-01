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

__all__ = ['FirewallRuleArgs', 'FirewallRule']

@pulumi.input_type
class FirewallRuleArgs:
    def __init__(__self__, *,
                 end_ip_address: pulumi.Input[_builtins.str],
                 start_ip_address: pulumi.Input[_builtins.str],
                 synapse_workspace_id: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a FirewallRule resource.
        :param pulumi.Input[_builtins.str] end_ip_address: The ending IP address to allow through the firewall for this rule.
               
               > **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.
               
               > **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        :param pulumi.Input[_builtins.str] start_ip_address: The starting IP address to allow through the firewall for this rule.
        :param pulumi.Input[_builtins.str] synapse_workspace_id: The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The Name of the firewall rule. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "end_ip_address", end_ip_address)
        pulumi.set(__self__, "start_ip_address", start_ip_address)
        pulumi.set(__self__, "synapse_workspace_id", synapse_workspace_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="endIpAddress")
    def end_ip_address(self) -> pulumi.Input[_builtins.str]:
        """
        The ending IP address to allow through the firewall for this rule.

        > **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.

        > **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        """
        return pulumi.get(self, "end_ip_address")

    @end_ip_address.setter
    def end_ip_address(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "end_ip_address", value)

    @_builtins.property
    @pulumi.getter(name="startIpAddress")
    def start_ip_address(self) -> pulumi.Input[_builtins.str]:
        """
        The starting IP address to allow through the firewall for this rule.
        """
        return pulumi.get(self, "start_ip_address")

    @start_ip_address.setter
    def start_ip_address(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "start_ip_address", value)

    @_builtins.property
    @pulumi.getter(name="synapseWorkspaceId")
    def synapse_workspace_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "synapse_workspace_id")

    @synapse_workspace_id.setter
    def synapse_workspace_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "synapse_workspace_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Name of the firewall rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FirewallRuleState:
    def __init__(__self__, *,
                 end_ip_address: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 start_ip_address: Optional[pulumi.Input[_builtins.str]] = None,
                 synapse_workspace_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering FirewallRule resources.
        :param pulumi.Input[_builtins.str] end_ip_address: The ending IP address to allow through the firewall for this rule.
               
               > **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.
               
               > **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        :param pulumi.Input[_builtins.str] name: The Name of the firewall rule. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] start_ip_address: The starting IP address to allow through the firewall for this rule.
        :param pulumi.Input[_builtins.str] synapse_workspace_id: The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        """
        if end_ip_address is not None:
            pulumi.set(__self__, "end_ip_address", end_ip_address)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if start_ip_address is not None:
            pulumi.set(__self__, "start_ip_address", start_ip_address)
        if synapse_workspace_id is not None:
            pulumi.set(__self__, "synapse_workspace_id", synapse_workspace_id)

    @_builtins.property
    @pulumi.getter(name="endIpAddress")
    def end_ip_address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ending IP address to allow through the firewall for this rule.

        > **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.

        > **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        """
        return pulumi.get(self, "end_ip_address")

    @end_ip_address.setter
    def end_ip_address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "end_ip_address", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Name of the firewall rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="startIpAddress")
    def start_ip_address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The starting IP address to allow through the firewall for this rule.
        """
        return pulumi.get(self, "start_ip_address")

    @start_ip_address.setter
    def start_ip_address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "start_ip_address", value)

    @_builtins.property
    @pulumi.getter(name="synapseWorkspaceId")
    def synapse_workspace_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "synapse_workspace_id")

    @synapse_workspace_id.setter
    def synapse_workspace_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "synapse_workspace_id", value)


@pulumi.type_token("azure:synapse/firewallRule:FirewallRule")
class FirewallRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_ip_address: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 start_ip_address: Optional[pulumi.Input[_builtins.str]] = None,
                 synapse_workspace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Allows you to Manages a Synapse Firewall Rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="examplestorageacc",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS",
            account_kind="StorageV2",
            is_hns_enabled=True)
        example_data_lake_gen2_filesystem = azure.storage.DataLakeGen2Filesystem("example",
            name="example",
            storage_account_id=example_account.id)
        example_workspace = azure.synapse.Workspace("example",
            name="example",
            resource_group_name=example.name,
            location=example.location,
            storage_data_lake_gen2_filesystem_id=example_data_lake_gen2_filesystem.id,
            sql_administrator_login="sqladminuser",
            sql_administrator_login_password="H@Sh1CoR3!",
            identity={
                "type": "SystemAssigned",
            })
        example_firewall_rule = azure.synapse.FirewallRule("example",
            name="AllowAll",
            synapse_workspace_id=example_workspace.id,
            start_ip_address="0.0.0.0",
            end_ip_address="255.255.255.255")
        ```

        ## Import

        Synapse Firewall Rule can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:synapse/firewallRule:FirewallRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.Synapse/workspaces/workspace1/firewallRules/rule1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] end_ip_address: The ending IP address to allow through the firewall for this rule.
               
               > **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.
               
               > **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        :param pulumi.Input[_builtins.str] name: The Name of the firewall rule. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] start_ip_address: The starting IP address to allow through the firewall for this rule.
        :param pulumi.Input[_builtins.str] synapse_workspace_id: The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FirewallRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Allows you to Manages a Synapse Firewall Rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="examplestorageacc",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS",
            account_kind="StorageV2",
            is_hns_enabled=True)
        example_data_lake_gen2_filesystem = azure.storage.DataLakeGen2Filesystem("example",
            name="example",
            storage_account_id=example_account.id)
        example_workspace = azure.synapse.Workspace("example",
            name="example",
            resource_group_name=example.name,
            location=example.location,
            storage_data_lake_gen2_filesystem_id=example_data_lake_gen2_filesystem.id,
            sql_administrator_login="sqladminuser",
            sql_administrator_login_password="H@Sh1CoR3!",
            identity={
                "type": "SystemAssigned",
            })
        example_firewall_rule = azure.synapse.FirewallRule("example",
            name="AllowAll",
            synapse_workspace_id=example_workspace.id,
            start_ip_address="0.0.0.0",
            end_ip_address="255.255.255.255")
        ```

        ## Import

        Synapse Firewall Rule can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:synapse/firewallRule:FirewallRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.Synapse/workspaces/workspace1/firewallRules/rule1
        ```

        :param str resource_name: The name of the resource.
        :param FirewallRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirewallRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_ip_address: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 start_ip_address: Optional[pulumi.Input[_builtins.str]] = None,
                 synapse_workspace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirewallRuleArgs.__new__(FirewallRuleArgs)

            if end_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'end_ip_address'")
            __props__.__dict__["end_ip_address"] = end_ip_address
            __props__.__dict__["name"] = name
            if start_ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'start_ip_address'")
            __props__.__dict__["start_ip_address"] = start_ip_address
            if synapse_workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'synapse_workspace_id'")
            __props__.__dict__["synapse_workspace_id"] = synapse_workspace_id
        super(FirewallRule, __self__).__init__(
            'azure:synapse/firewallRule:FirewallRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            end_ip_address: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            start_ip_address: Optional[pulumi.Input[_builtins.str]] = None,
            synapse_workspace_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'FirewallRule':
        """
        Get an existing FirewallRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] end_ip_address: The ending IP address to allow through the firewall for this rule.
               
               > **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.
               
               > **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        :param pulumi.Input[_builtins.str] name: The Name of the firewall rule. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] start_ip_address: The starting IP address to allow through the firewall for this rule.
        :param pulumi.Input[_builtins.str] synapse_workspace_id: The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirewallRuleState.__new__(_FirewallRuleState)

        __props__.__dict__["end_ip_address"] = end_ip_address
        __props__.__dict__["name"] = name
        __props__.__dict__["start_ip_address"] = start_ip_address
        __props__.__dict__["synapse_workspace_id"] = synapse_workspace_id
        return FirewallRule(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="endIpAddress")
    def end_ip_address(self) -> pulumi.Output[_builtins.str]:
        """
        The ending IP address to allow through the firewall for this rule.

        > **Note:** The Azure feature `Allow access to Azure services` can be enabled by setting `start_ip_address` and `end_ip_address` to `0.0.0.0`.

        > **Note:** The Azure feature `Allow access to Azure services` requires the `name` to be `AllowAllWindowsAzureIps`.
        """
        return pulumi.get(self, "end_ip_address")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The Name of the firewall rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="startIpAddress")
    def start_ip_address(self) -> pulumi.Output[_builtins.str]:
        """
        The starting IP address to allow through the firewall for this rule.
        """
        return pulumi.get(self, "start_ip_address")

    @_builtins.property
    @pulumi.getter(name="synapseWorkspaceId")
    def synapse_workspace_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Synapse Workspace on which to create the Firewall Rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "synapse_workspace_id")

