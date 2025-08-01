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

__all__ = ['DedicatedHostGroupArgs', 'DedicatedHostGroup']

@pulumi.input_type
class DedicatedHostGroupArgs:
    def __init__(__self__, *,
                 platform_fault_domain_count: pulumi.Input[_builtins.int],
                 resource_group_name: pulumi.Input[_builtins.str],
                 automatic_placement_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a DedicatedHostGroup resource.
        :param pulumi.Input[_builtins.int] platform_fault_domain_count: The number of fault domains that the Dedicated Host Group spans. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the resource group the Dedicated Host Group is located in. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] automatic_placement_enabled: Would virtual machines or virtual machine scale sets be placed automatically on this Dedicated Host Group? Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: The Azure location where the Dedicated Host Group exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dedicated Host Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] zone: Specifies the Availability Zone in which this Dedicated Host Group should be located. Changing this forces a new Dedicated Host Group to be created.
        """
        pulumi.set(__self__, "platform_fault_domain_count", platform_fault_domain_count)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if automatic_placement_enabled is not None:
            pulumi.set(__self__, "automatic_placement_enabled", automatic_placement_enabled)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter(name="platformFaultDomainCount")
    def platform_fault_domain_count(self) -> pulumi.Input[_builtins.int]:
        """
        The number of fault domains that the Dedicated Host Group spans. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "platform_fault_domain_count")

    @platform_fault_domain_count.setter
    def platform_fault_domain_count(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "platform_fault_domain_count", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the resource group the Dedicated Host Group is located in. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="automaticPlacementEnabled")
    def automatic_placement_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Would virtual machines or virtual machine scale sets be placed automatically on this Dedicated Host Group? Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "automatic_placement_enabled")

    @automatic_placement_enabled.setter
    def automatic_placement_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "automatic_placement_enabled", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure location where the Dedicated Host Group exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Dedicated Host Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Availability Zone in which this Dedicated Host Group should be located. Changing this forces a new Dedicated Host Group to be created.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone", value)


@pulumi.input_type
class _DedicatedHostGroupState:
    def __init__(__self__, *,
                 automatic_placement_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 platform_fault_domain_count: Optional[pulumi.Input[_builtins.int]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering DedicatedHostGroup resources.
        :param pulumi.Input[_builtins.bool] automatic_placement_enabled: Would virtual machines or virtual machine scale sets be placed automatically on this Dedicated Host Group? Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: The Azure location where the Dedicated Host Group exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dedicated Host Group. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] platform_fault_domain_count: The number of fault domains that the Dedicated Host Group spans. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the resource group the Dedicated Host Group is located in. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] zone: Specifies the Availability Zone in which this Dedicated Host Group should be located. Changing this forces a new Dedicated Host Group to be created.
        """
        if automatic_placement_enabled is not None:
            pulumi.set(__self__, "automatic_placement_enabled", automatic_placement_enabled)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if platform_fault_domain_count is not None:
            pulumi.set(__self__, "platform_fault_domain_count", platform_fault_domain_count)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @_builtins.property
    @pulumi.getter(name="automaticPlacementEnabled")
    def automatic_placement_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Would virtual machines or virtual machine scale sets be placed automatically on this Dedicated Host Group? Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "automatic_placement_enabled")

    @automatic_placement_enabled.setter
    def automatic_placement_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "automatic_placement_enabled", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure location where the Dedicated Host Group exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Dedicated Host Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="platformFaultDomainCount")
    def platform_fault_domain_count(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of fault domains that the Dedicated Host Group spans. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "platform_fault_domain_count")

    @platform_fault_domain_count.setter
    def platform_fault_domain_count(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "platform_fault_domain_count", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the resource group the Dedicated Host Group is located in. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Availability Zone in which this Dedicated Host Group should be located. Changing this forces a new Dedicated Host Group to be created.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone", value)


@pulumi.type_token("azure:compute/dedicatedHostGroup:DedicatedHostGroup")
class DedicatedHostGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automatic_placement_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 platform_fault_domain_count: Optional[pulumi.Input[_builtins.int]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manage a Dedicated Host Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg-compute",
            location="West Europe")
        example_dedicated_host_group = azure.compute.DedicatedHostGroup("example",
            name="example-dedicated-host-group",
            resource_group_name=example.name,
            location=example.location,
            platform_fault_domain_count=1)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Compute`: 2024-03-01

        ## Import

        Dedicated Host Group can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/dedicatedHostGroup:DedicatedHostGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-rg/providers/Microsoft.Compute/hostGroups/group1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] automatic_placement_enabled: Would virtual machines or virtual machine scale sets be placed automatically on this Dedicated Host Group? Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: The Azure location where the Dedicated Host Group exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dedicated Host Group. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] platform_fault_domain_count: The number of fault domains that the Dedicated Host Group spans. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the resource group the Dedicated Host Group is located in. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] zone: Specifies the Availability Zone in which this Dedicated Host Group should be located. Changing this forces a new Dedicated Host Group to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DedicatedHostGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manage a Dedicated Host Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg-compute",
            location="West Europe")
        example_dedicated_host_group = azure.compute.DedicatedHostGroup("example",
            name="example-dedicated-host-group",
            resource_group_name=example.name,
            location=example.location,
            platform_fault_domain_count=1)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Compute`: 2024-03-01

        ## Import

        Dedicated Host Group can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/dedicatedHostGroup:DedicatedHostGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-rg/providers/Microsoft.Compute/hostGroups/group1
        ```

        :param str resource_name: The name of the resource.
        :param DedicatedHostGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DedicatedHostGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automatic_placement_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 platform_fault_domain_count: Optional[pulumi.Input[_builtins.int]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 zone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DedicatedHostGroupArgs.__new__(DedicatedHostGroupArgs)

            __props__.__dict__["automatic_placement_enabled"] = automatic_placement_enabled
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if platform_fault_domain_count is None and not opts.urn:
                raise TypeError("Missing required property 'platform_fault_domain_count'")
            __props__.__dict__["platform_fault_domain_count"] = platform_fault_domain_count
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["zone"] = zone
        super(DedicatedHostGroup, __self__).__init__(
            'azure:compute/dedicatedHostGroup:DedicatedHostGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            automatic_placement_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            platform_fault_domain_count: Optional[pulumi.Input[_builtins.int]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            zone: Optional[pulumi.Input[_builtins.str]] = None) -> 'DedicatedHostGroup':
        """
        Get an existing DedicatedHostGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] automatic_placement_enabled: Would virtual machines or virtual machine scale sets be placed automatically on this Dedicated Host Group? Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: The Azure location where the Dedicated Host Group exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Dedicated Host Group. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] platform_fault_domain_count: The number of fault domains that the Dedicated Host Group spans. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the resource group the Dedicated Host Group is located in. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[_builtins.str] zone: Specifies the Availability Zone in which this Dedicated Host Group should be located. Changing this forces a new Dedicated Host Group to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DedicatedHostGroupState.__new__(_DedicatedHostGroupState)

        __props__.__dict__["automatic_placement_enabled"] = automatic_placement_enabled
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["platform_fault_domain_count"] = platform_fault_domain_count
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["zone"] = zone
        return DedicatedHostGroup(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="automaticPlacementEnabled")
    def automatic_placement_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Would virtual machines or virtual machine scale sets be placed automatically on this Dedicated Host Group? Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "automatic_placement_enabled")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The Azure location where the Dedicated Host Group exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Dedicated Host Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="platformFaultDomainCount")
    def platform_fault_domain_count(self) -> pulumi.Output[_builtins.int]:
        """
        The number of fault domains that the Dedicated Host Group spans. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "platform_fault_domain_count")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the resource group the Dedicated Host Group is located in. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def zone(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the Availability Zone in which this Dedicated Host Group should be located. Changing this forces a new Dedicated Host Group to be created.
        """
        return pulumi.get(self, "zone")

