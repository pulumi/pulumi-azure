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

__all__ = ['FirewallApplicationRuleCollectionArgs', 'FirewallApplicationRuleCollection']

@pulumi.input_type
class FirewallApplicationRuleCollectionArgs:
    def __init__(__self__, *,
                 action: pulumi.Input[_builtins.str],
                 azure_firewall_name: pulumi.Input[_builtins.str],
                 priority: pulumi.Input[_builtins.int],
                 resource_group_name: pulumi.Input[_builtins.str],
                 rules: pulumi.Input[Sequence[pulumi.Input['FirewallApplicationRuleCollectionRuleArgs']]],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a FirewallApplicationRuleCollection resource.
        :param pulumi.Input[_builtins.str] action: Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
        :param pulumi.Input[_builtins.str] azure_firewall_name: Specifies the name of the Firewall in which the Application Rule Collection should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] priority: Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallApplicationRuleCollectionRuleArgs']]] rules: One or more `rule` blocks as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Application Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "azure_firewall_name", azure_firewall_name)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "rules", rules)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def action(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "action", value)

    @_builtins.property
    @pulumi.getter(name="azureFirewallName")
    def azure_firewall_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the Firewall in which the Application Rule Collection should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "azure_firewall_name")

    @azure_firewall_name.setter
    def azure_firewall_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "azure_firewall_name", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> pulumi.Input[_builtins.int]:
        """
        Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def rules(self) -> pulumi.Input[Sequence[pulumi.Input['FirewallApplicationRuleCollectionRuleArgs']]]:
        """
        One or more `rule` blocks as defined below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: pulumi.Input[Sequence[pulumi.Input['FirewallApplicationRuleCollectionRuleArgs']]]):
        pulumi.set(self, "rules", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Application Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FirewallApplicationRuleCollectionState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_firewall_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallApplicationRuleCollectionRuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering FirewallApplicationRuleCollection resources.
        :param pulumi.Input[_builtins.str] action: Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
        :param pulumi.Input[_builtins.str] azure_firewall_name: Specifies the name of the Firewall in which the Application Rule Collection should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Application Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] priority: Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallApplicationRuleCollectionRuleArgs']]] rules: One or more `rule` blocks as defined below.
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if azure_firewall_name is not None:
            pulumi.set(__self__, "azure_firewall_name", azure_firewall_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @_builtins.property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "action", value)

    @_builtins.property
    @pulumi.getter(name="azureFirewallName")
    def azure_firewall_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Firewall in which the Application Rule Collection should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "azure_firewall_name")

    @azure_firewall_name.setter
    def azure_firewall_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_firewall_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Application Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallApplicationRuleCollectionRuleArgs']]]]:
        """
        One or more `rule` blocks as defined below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallApplicationRuleCollectionRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.type_token("azure:network/firewallApplicationRuleCollection:FirewallApplicationRuleCollection")
class FirewallApplicationRuleCollection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_firewall_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallApplicationRuleCollectionRuleArgs', 'FirewallApplicationRuleCollectionRuleArgsDict']]]]] = None,
                 __props__=None):
        """
        Manages an Application Rule Collection within an Azure Firewall.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="testvnet",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="AzureFirewallSubnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.1.0/24"])
        example_public_ip = azure.network.PublicIp("example",
            name="testpip",
            location=example.location,
            resource_group_name=example.name,
            allocation_method="Static",
            sku="Standard")
        example_firewall = azure.network.Firewall("example",
            name="testfirewall",
            location=example.location,
            resource_group_name=example.name,
            sku_name="AZFW_VNet",
            sku_tier="Standard",
            ip_configurations=[{
                "name": "configuration",
                "subnet_id": example_subnet.id,
                "public_ip_address_id": example_public_ip.id,
            }])
        example_firewall_application_rule_collection = azure.network.FirewallApplicationRuleCollection("example",
            name="testcollection",
            azure_firewall_name=example_firewall.name,
            resource_group_name=example.name,
            priority=100,
            action="Allow",
            rules=[{
                "name": "testrule",
                "source_addresses": ["10.0.0.0/16"],
                "target_fqdns": ["*.google.com"],
                "protocols": [{
                    "port": 443,
                    "type": "Https",
                }],
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2024-05-01

        ## Import

        Firewall Application Rule Collections can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/firewallApplicationRuleCollection:FirewallApplicationRuleCollection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/azureFirewalls/myfirewall/applicationRuleCollections/mycollection
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] action: Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
        :param pulumi.Input[_builtins.str] azure_firewall_name: Specifies the name of the Firewall in which the Application Rule Collection should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Application Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] priority: Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['FirewallApplicationRuleCollectionRuleArgs', 'FirewallApplicationRuleCollectionRuleArgsDict']]]] rules: One or more `rule` blocks as defined below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FirewallApplicationRuleCollectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Application Rule Collection within an Azure Firewall.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="testvnet",
            address_spaces=["10.0.0.0/16"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="AzureFirewallSubnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.1.0/24"])
        example_public_ip = azure.network.PublicIp("example",
            name="testpip",
            location=example.location,
            resource_group_name=example.name,
            allocation_method="Static",
            sku="Standard")
        example_firewall = azure.network.Firewall("example",
            name="testfirewall",
            location=example.location,
            resource_group_name=example.name,
            sku_name="AZFW_VNet",
            sku_tier="Standard",
            ip_configurations=[{
                "name": "configuration",
                "subnet_id": example_subnet.id,
                "public_ip_address_id": example_public_ip.id,
            }])
        example_firewall_application_rule_collection = azure.network.FirewallApplicationRuleCollection("example",
            name="testcollection",
            azure_firewall_name=example_firewall.name,
            resource_group_name=example.name,
            priority=100,
            action="Allow",
            rules=[{
                "name": "testrule",
                "source_addresses": ["10.0.0.0/16"],
                "target_fqdns": ["*.google.com"],
                "protocols": [{
                    "port": 443,
                    "type": "Https",
                }],
            }])
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2024-05-01

        ## Import

        Firewall Application Rule Collections can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/firewallApplicationRuleCollection:FirewallApplicationRuleCollection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/azureFirewalls/myfirewall/applicationRuleCollections/mycollection
        ```

        :param str resource_name: The name of the resource.
        :param FirewallApplicationRuleCollectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirewallApplicationRuleCollectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_firewall_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallApplicationRuleCollectionRuleArgs', 'FirewallApplicationRuleCollectionRuleArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirewallApplicationRuleCollectionArgs.__new__(FirewallApplicationRuleCollectionArgs)

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            if azure_firewall_name is None and not opts.urn:
                raise TypeError("Missing required property 'azure_firewall_name'")
            __props__.__dict__["azure_firewall_name"] = azure_firewall_name
            __props__.__dict__["name"] = name
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if rules is None and not opts.urn:
                raise TypeError("Missing required property 'rules'")
            __props__.__dict__["rules"] = rules
        super(FirewallApplicationRuleCollection, __self__).__init__(
            'azure:network/firewallApplicationRuleCollection:FirewallApplicationRuleCollection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[_builtins.str]] = None,
            azure_firewall_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            priority: Optional[pulumi.Input[_builtins.int]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FirewallApplicationRuleCollectionRuleArgs', 'FirewallApplicationRuleCollectionRuleArgsDict']]]]] = None) -> 'FirewallApplicationRuleCollection':
        """
        Get an existing FirewallApplicationRuleCollection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] action: Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
        :param pulumi.Input[_builtins.str] azure_firewall_name: Specifies the name of the Firewall in which the Application Rule Collection should be created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Application Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] priority: Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['FirewallApplicationRuleCollectionRuleArgs', 'FirewallApplicationRuleCollectionRuleArgsDict']]]] rules: One or more `rule` blocks as defined below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirewallApplicationRuleCollectionState.__new__(_FirewallApplicationRuleCollectionState)

        __props__.__dict__["action"] = action
        __props__.__dict__["azure_firewall_name"] = azure_firewall_name
        __props__.__dict__["name"] = name
        __props__.__dict__["priority"] = priority
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["rules"] = rules
        return FirewallApplicationRuleCollection(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def action(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the action the rule will apply to matching traffic. Possible values are `Allow` and `Deny`.
        """
        return pulumi.get(self, "action")

    @_builtins.property
    @pulumi.getter(name="azureFirewallName")
    def azure_firewall_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Firewall in which the Application Rule Collection should be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "azure_firewall_name")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Application Rule Collection which must be unique within the Firewall. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def priority(self) -> pulumi.Output[_builtins.int]:
        """
        Specifies the priority of the rule collection. Possible values are between `100` - `65000`.
        """
        return pulumi.get(self, "priority")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Resource Group in which the Firewall exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.FirewallApplicationRuleCollectionRule']]:
        """
        One or more `rule` blocks as defined below.
        """
        return pulumi.get(self, "rules")

