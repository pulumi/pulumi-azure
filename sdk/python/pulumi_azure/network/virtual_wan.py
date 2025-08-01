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

__all__ = ['VirtualWanArgs', 'VirtualWan']

@pulumi.input_type
class VirtualWanArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[_builtins.str],
                 allow_branch_to_branch_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
                 disable_vpn_encryption: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 office365_local_breakout_category: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a VirtualWan resource.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Virtual WAN. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] allow_branch_to_branch_traffic: Boolean flag to specify whether branch to branch traffic is allowed. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] disable_vpn_encryption: Boolean flag to specify whether VPN encryption is disabled. Defaults to `false`.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Virtual WAN. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] office365_local_breakout_category: Specifies the Office365 local breakout category. Possible values include: `Optimize`, `OptimizeAndAllow`, `All`, `None`. Defaults to `None`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the Virtual WAN.
        :param pulumi.Input[_builtins.str] type: Specifies the Virtual WAN type. Possible Values include: `Basic` and `Standard`. Defaults to `Standard`.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if allow_branch_to_branch_traffic is not None:
            pulumi.set(__self__, "allow_branch_to_branch_traffic", allow_branch_to_branch_traffic)
        if disable_vpn_encryption is not None:
            pulumi.set(__self__, "disable_vpn_encryption", disable_vpn_encryption)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if office365_local_breakout_category is not None:
            pulumi.set(__self__, "office365_local_breakout_category", office365_local_breakout_category)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group in which to create the Virtual WAN. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="allowBranchToBranchTraffic")
    def allow_branch_to_branch_traffic(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Boolean flag to specify whether branch to branch traffic is allowed. Defaults to `true`.
        """
        return pulumi.get(self, "allow_branch_to_branch_traffic")

    @allow_branch_to_branch_traffic.setter
    def allow_branch_to_branch_traffic(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "allow_branch_to_branch_traffic", value)

    @_builtins.property
    @pulumi.getter(name="disableVpnEncryption")
    def disable_vpn_encryption(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Boolean flag to specify whether VPN encryption is disabled. Defaults to `false`.
        """
        return pulumi.get(self, "disable_vpn_encryption")

    @disable_vpn_encryption.setter
    def disable_vpn_encryption(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "disable_vpn_encryption", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Virtual WAN. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="office365LocalBreakoutCategory")
    def office365_local_breakout_category(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Office365 local breakout category. Possible values include: `Optimize`, `OptimizeAndAllow`, `All`, `None`. Defaults to `None`.
        """
        return pulumi.get(self, "office365_local_breakout_category")

    @office365_local_breakout_category.setter
    def office365_local_breakout_category(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "office365_local_breakout_category", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the Virtual WAN.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Virtual WAN type. Possible Values include: `Basic` and `Standard`. Defaults to `Standard`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _VirtualWanState:
    def __init__(__self__, *,
                 allow_branch_to_branch_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
                 disable_vpn_encryption: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 office365_local_breakout_category: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering VirtualWan resources.
        :param pulumi.Input[_builtins.bool] allow_branch_to_branch_traffic: Boolean flag to specify whether branch to branch traffic is allowed. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] disable_vpn_encryption: Boolean flag to specify whether VPN encryption is disabled. Defaults to `false`.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Virtual WAN. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] office365_local_breakout_category: Specifies the Office365 local breakout category. Possible values include: `Optimize`, `OptimizeAndAllow`, `All`, `None`. Defaults to `None`.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Virtual WAN. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the Virtual WAN.
        :param pulumi.Input[_builtins.str] type: Specifies the Virtual WAN type. Possible Values include: `Basic` and `Standard`. Defaults to `Standard`.
        """
        if allow_branch_to_branch_traffic is not None:
            pulumi.set(__self__, "allow_branch_to_branch_traffic", allow_branch_to_branch_traffic)
        if disable_vpn_encryption is not None:
            pulumi.set(__self__, "disable_vpn_encryption", disable_vpn_encryption)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if office365_local_breakout_category is not None:
            pulumi.set(__self__, "office365_local_breakout_category", office365_local_breakout_category)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="allowBranchToBranchTraffic")
    def allow_branch_to_branch_traffic(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Boolean flag to specify whether branch to branch traffic is allowed. Defaults to `true`.
        """
        return pulumi.get(self, "allow_branch_to_branch_traffic")

    @allow_branch_to_branch_traffic.setter
    def allow_branch_to_branch_traffic(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "allow_branch_to_branch_traffic", value)

    @_builtins.property
    @pulumi.getter(name="disableVpnEncryption")
    def disable_vpn_encryption(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Boolean flag to specify whether VPN encryption is disabled. Defaults to `false`.
        """
        return pulumi.get(self, "disable_vpn_encryption")

    @disable_vpn_encryption.setter
    def disable_vpn_encryption(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "disable_vpn_encryption", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Virtual WAN. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="office365LocalBreakoutCategory")
    def office365_local_breakout_category(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Office365 local breakout category. Possible values include: `Optimize`, `OptimizeAndAllow`, `All`, `None`. Defaults to `None`.
        """
        return pulumi.get(self, "office365_local_breakout_category")

    @office365_local_breakout_category.setter
    def office365_local_breakout_category(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "office365_local_breakout_category", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group in which to create the Virtual WAN. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the Virtual WAN.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Virtual WAN type. Possible Values include: `Basic` and `Standard`. Defaults to `Standard`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.type_token("azure:network/virtualWan:VirtualWan")
class VirtualWan(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_branch_to_branch_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
                 disable_vpn_encryption: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 office365_local_breakout_category: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Virtual WAN.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_virtual_wan = azure.network.VirtualWan("example",
            name="example-vwan",
            resource_group_name=example.name,
            location=example.location)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2024-05-01

        ## Import

        Virtual WAN can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/virtualWan:VirtualWan example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualWans/testvwan
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] allow_branch_to_branch_traffic: Boolean flag to specify whether branch to branch traffic is allowed. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] disable_vpn_encryption: Boolean flag to specify whether VPN encryption is disabled. Defaults to `false`.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Virtual WAN. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] office365_local_breakout_category: Specifies the Office365 local breakout category. Possible values include: `Optimize`, `OptimizeAndAllow`, `All`, `None`. Defaults to `None`.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Virtual WAN. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the Virtual WAN.
        :param pulumi.Input[_builtins.str] type: Specifies the Virtual WAN type. Possible Values include: `Basic` and `Standard`. Defaults to `Standard`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VirtualWanArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Virtual WAN.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_virtual_wan = azure.network.VirtualWan("example",
            name="example-vwan",
            resource_group_name=example.name,
            location=example.location)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2024-05-01

        ## Import

        Virtual WAN can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/virtualWan:VirtualWan example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualWans/testvwan
        ```

        :param str resource_name: The name of the resource.
        :param VirtualWanArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VirtualWanArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_branch_to_branch_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
                 disable_vpn_encryption: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 office365_local_breakout_category: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VirtualWanArgs.__new__(VirtualWanArgs)

            __props__.__dict__["allow_branch_to_branch_traffic"] = allow_branch_to_branch_traffic
            __props__.__dict__["disable_vpn_encryption"] = disable_vpn_encryption
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["office365_local_breakout_category"] = office365_local_breakout_category
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["type"] = type
        super(VirtualWan, __self__).__init__(
            'azure:network/virtualWan:VirtualWan',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_branch_to_branch_traffic: Optional[pulumi.Input[_builtins.bool]] = None,
            disable_vpn_encryption: Optional[pulumi.Input[_builtins.bool]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            office365_local_breakout_category: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None) -> 'VirtualWan':
        """
        Get an existing VirtualWan resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] allow_branch_to_branch_traffic: Boolean flag to specify whether branch to branch traffic is allowed. Defaults to `true`.
        :param pulumi.Input[_builtins.bool] disable_vpn_encryption: Boolean flag to specify whether VPN encryption is disabled. Defaults to `false`.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Virtual WAN. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] office365_local_breakout_category: Specifies the Office365 local breakout category. Possible values include: `Optimize`, `OptimizeAndAllow`, `All`, `None`. Defaults to `None`.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which to create the Virtual WAN. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the Virtual WAN.
        :param pulumi.Input[_builtins.str] type: Specifies the Virtual WAN type. Possible Values include: `Basic` and `Standard`. Defaults to `Standard`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VirtualWanState.__new__(_VirtualWanState)

        __props__.__dict__["allow_branch_to_branch_traffic"] = allow_branch_to_branch_traffic
        __props__.__dict__["disable_vpn_encryption"] = disable_vpn_encryption
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["office365_local_breakout_category"] = office365_local_breakout_category
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["type"] = type
        return VirtualWan(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="allowBranchToBranchTraffic")
    def allow_branch_to_branch_traffic(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Boolean flag to specify whether branch to branch traffic is allowed. Defaults to `true`.
        """
        return pulumi.get(self, "allow_branch_to_branch_traffic")

    @_builtins.property
    @pulumi.getter(name="disableVpnEncryption")
    def disable_vpn_encryption(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Boolean flag to specify whether VPN encryption is disabled. Defaults to `false`.
        """
        return pulumi.get(self, "disable_vpn_encryption")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Virtual WAN. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="office365LocalBreakoutCategory")
    def office365_local_breakout_category(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the Office365 local breakout category. Possible values include: `Optimize`, `OptimizeAndAllow`, `All`, `None`. Defaults to `None`.
        """
        return pulumi.get(self, "office365_local_breakout_category")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group in which to create the Virtual WAN. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the Virtual WAN.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the Virtual WAN type. Possible Values include: `Basic` and `Standard`. Defaults to `Standard`.
        """
        return pulumi.get(self, "type")

