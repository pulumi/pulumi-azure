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

__all__ = ['TargetArgs', 'Target']

@pulumi.input_type
class TargetArgs:
    def __init__(__self__, *,
                 target_resource_id: pulumi.Input[_builtins.str],
                 target_type: pulumi.Input[_builtins.str],
                 location: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Target resource.
        :param pulumi.Input[_builtins.str] target_resource_id: Specifies the Target Resource Id within which this Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        :param pulumi.Input[_builtins.str] target_type: The name of the Chaos Studio Target. This has the format of [publisher]-[targetType] e.g. `Microsoft-StorageAccount`. For supported values please see this Target Type column in [this table](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-providers). Changing this forces a new Chaos Studio Target to be created.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        """
        pulumi.set(__self__, "target_resource_id", target_resource_id)
        pulumi.set(__self__, "target_type", target_type)
        if location is not None:
            pulumi.set(__self__, "location", location)

    @_builtins.property
    @pulumi.getter(name="targetResourceId")
    def target_resource_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the Target Resource Id within which this Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        """
        return pulumi.get(self, "target_resource_id")

    @target_resource_id.setter
    def target_resource_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "target_resource_id", value)

    @_builtins.property
    @pulumi.getter(name="targetType")
    def target_type(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Chaos Studio Target. This has the format of [publisher]-[targetType] e.g. `Microsoft-StorageAccount`. For supported values please see this Target Type column in [this table](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-providers). Changing this forces a new Chaos Studio Target to be created.
        """
        return pulumi.get(self, "target_type")

    @target_type.setter
    def target_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "target_type", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure Region where the Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)


@pulumi.input_type
class _TargetState:
    def __init__(__self__, *,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 target_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 target_type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Target resources.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        :param pulumi.Input[_builtins.str] target_resource_id: Specifies the Target Resource Id within which this Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        :param pulumi.Input[_builtins.str] target_type: The name of the Chaos Studio Target. This has the format of [publisher]-[targetType] e.g. `Microsoft-StorageAccount`. For supported values please see this Target Type column in [this table](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-providers). Changing this forces a new Chaos Studio Target to be created.
        """
        if location is not None:
            pulumi.set(__self__, "location", location)
        if target_resource_id is not None:
            pulumi.set(__self__, "target_resource_id", target_resource_id)
        if target_type is not None:
            pulumi.set(__self__, "target_type", target_type)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure Region where the Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter(name="targetResourceId")
    def target_resource_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Target Resource Id within which this Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        """
        return pulumi.get(self, "target_resource_id")

    @target_resource_id.setter
    def target_resource_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_resource_id", value)

    @_builtins.property
    @pulumi.getter(name="targetType")
    def target_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Chaos Studio Target. This has the format of [publisher]-[targetType] e.g. `Microsoft-StorageAccount`. For supported values please see this Target Type column in [this table](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-providers). Changing this forces a new Chaos Studio Target to be created.
        """
        return pulumi.get(self, "target_type")

    @target_type.setter
    def target_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_type", value)


@pulumi.type_token("azure:chaosstudio/target:Target")
class Target(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 target_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 target_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        <!-- Note: This documentation is generated. Any manual changes will be overwritten -->

        Manages a Chaos Studio Target.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example = azure.containerservice.KubernetesCluster("example",
            name="example",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            dns_prefix="acctestaksexample",
            default_node_pool={
                "name": "example-value",
                "node_count": "example-value",
                "vm_size": "example-value",
                "upgrade_settings": {
                    "max_surge": "example-value",
                },
            },
            identity={
                "type": "example-value",
            })
        example_target = azure.chaosstudio.Target("example",
            location=example_resource_group.location,
            target_resource_id=example.id,
            target_type="example-value")
        ```

        ## Import

        An existing Chaos Studio Target can be imported into Pulumi using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:chaosstudio/target:Target example /{scope}/providers/Microsoft.Chaos/targets/{targetName}
        ```

        * Where `{scope}` is the ID of the Azure Resource under which the Chaos Studio Target exists. For example `/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/some-resource-group`.

        * Where `{targetName}` is the name of the Target. For example `targetValue`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        :param pulumi.Input[_builtins.str] target_resource_id: Specifies the Target Resource Id within which this Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        :param pulumi.Input[_builtins.str] target_type: The name of the Chaos Studio Target. This has the format of [publisher]-[targetType] e.g. `Microsoft-StorageAccount`. For supported values please see this Target Type column in [this table](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-providers). Changing this forces a new Chaos Studio Target to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TargetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        <!-- Note: This documentation is generated. Any manual changes will be overwritten -->

        Manages a Chaos Studio Target.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example = azure.containerservice.KubernetesCluster("example",
            name="example",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            dns_prefix="acctestaksexample",
            default_node_pool={
                "name": "example-value",
                "node_count": "example-value",
                "vm_size": "example-value",
                "upgrade_settings": {
                    "max_surge": "example-value",
                },
            },
            identity={
                "type": "example-value",
            })
        example_target = azure.chaosstudio.Target("example",
            location=example_resource_group.location,
            target_resource_id=example.id,
            target_type="example-value")
        ```

        ## Import

        An existing Chaos Studio Target can be imported into Pulumi using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:chaosstudio/target:Target example /{scope}/providers/Microsoft.Chaos/targets/{targetName}
        ```

        * Where `{scope}` is the ID of the Azure Resource under which the Chaos Studio Target exists. For example `/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/some-resource-group`.

        * Where `{targetName}` is the name of the Target. For example `targetValue`.

        :param str resource_name: The name of the resource.
        :param TargetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TargetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 target_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
                 target_type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TargetArgs.__new__(TargetArgs)

            __props__.__dict__["location"] = location
            if target_resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'target_resource_id'")
            __props__.__dict__["target_resource_id"] = target_resource_id
            if target_type is None and not opts.urn:
                raise TypeError("Missing required property 'target_type'")
            __props__.__dict__["target_type"] = target_type
        super(Target, __self__).__init__(
            'azure:chaosstudio/target:Target',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            target_resource_id: Optional[pulumi.Input[_builtins.str]] = None,
            target_type: Optional[pulumi.Input[_builtins.str]] = None) -> 'Target':
        """
        Get an existing Target resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        :param pulumi.Input[_builtins.str] target_resource_id: Specifies the Target Resource Id within which this Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        :param pulumi.Input[_builtins.str] target_type: The name of the Chaos Studio Target. This has the format of [publisher]-[targetType] e.g. `Microsoft-StorageAccount`. For supported values please see this Target Type column in [this table](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-providers). Changing this forces a new Chaos Studio Target to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TargetState.__new__(_TargetState)

        __props__.__dict__["location"] = location
        __props__.__dict__["target_resource_id"] = target_resource_id
        __props__.__dict__["target_type"] = target_type
        return Target(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The Azure Region where the Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="targetResourceId")
    def target_resource_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the Target Resource Id within which this Chaos Studio Target should exist. Changing this forces a new Chaos Studio Target to be created.
        """
        return pulumi.get(self, "target_resource_id")

    @_builtins.property
    @pulumi.getter(name="targetType")
    def target_type(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Chaos Studio Target. This has the format of [publisher]-[targetType] e.g. `Microsoft-StorageAccount`. For supported values please see this Target Type column in [this table](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-providers). Changing this forces a new Chaos Studio Target to be created.
        """
        return pulumi.get(self, "target_type")

