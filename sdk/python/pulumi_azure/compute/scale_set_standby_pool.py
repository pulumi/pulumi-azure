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

__all__ = ['ScaleSetStandbyPoolArgs', 'ScaleSetStandbyPool']

@pulumi.input_type
class ScaleSetStandbyPoolArgs:
    def __init__(__self__, *,
                 attached_virtual_machine_scale_set_id: pulumi.Input[_builtins.str],
                 elasticity_profile: pulumi.Input['ScaleSetStandbyPoolElasticityProfileArgs'],
                 resource_group_name: pulumi.Input[_builtins.str],
                 virtual_machine_state: pulumi.Input[_builtins.str],
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a ScaleSetStandbyPool resource.
        :param pulumi.Input[_builtins.str] attached_virtual_machine_scale_set_id: Specifies the fully qualified resource ID of a virtual machine scale set the pool is attached to.
        :param pulumi.Input['ScaleSetStandbyPoolElasticityProfileArgs'] elasticity_profile: An `elasticity_profile` block as defined below.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[_builtins.str] virtual_machine_state: Specifies the desired state of virtual machines in the pool. Possible values are `Running` and `Deallocated`.
        :param pulumi.Input[_builtins.str] location: Specifies the Azure Region where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Standby Pool. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Standby Pool.
        """
        pulumi.set(__self__, "attached_virtual_machine_scale_set_id", attached_virtual_machine_scale_set_id)
        pulumi.set(__self__, "elasticity_profile", elasticity_profile)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "virtual_machine_state", virtual_machine_state)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="attachedVirtualMachineScaleSetId")
    def attached_virtual_machine_scale_set_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the fully qualified resource ID of a virtual machine scale set the pool is attached to.
        """
        return pulumi.get(self, "attached_virtual_machine_scale_set_id")

    @attached_virtual_machine_scale_set_id.setter
    def attached_virtual_machine_scale_set_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "attached_virtual_machine_scale_set_id", value)

    @_builtins.property
    @pulumi.getter(name="elasticityProfile")
    def elasticity_profile(self) -> pulumi.Input['ScaleSetStandbyPoolElasticityProfileArgs']:
        """
        An `elasticity_profile` block as defined below.
        """
        return pulumi.get(self, "elasticity_profile")

    @elasticity_profile.setter
    def elasticity_profile(self, value: pulumi.Input['ScaleSetStandbyPoolElasticityProfileArgs']):
        pulumi.set(self, "elasticity_profile", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the Resource Group where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="virtualMachineState")
    def virtual_machine_state(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the desired state of virtual machines in the pool. Possible values are `Running` and `Deallocated`.
        """
        return pulumi.get(self, "virtual_machine_state")

    @virtual_machine_state.setter
    def virtual_machine_state(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "virtual_machine_state", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Azure Region where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Standby Pool. Changing this forces a new Standby Pool to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the Standby Pool.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ScaleSetStandbyPoolState:
    def __init__(__self__, *,
                 attached_virtual_machine_scale_set_id: Optional[pulumi.Input[_builtins.str]] = None,
                 elasticity_profile: Optional[pulumi.Input['ScaleSetStandbyPoolElasticityProfileArgs']] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 virtual_machine_state: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ScaleSetStandbyPool resources.
        :param pulumi.Input[_builtins.str] attached_virtual_machine_scale_set_id: Specifies the fully qualified resource ID of a virtual machine scale set the pool is attached to.
        :param pulumi.Input['ScaleSetStandbyPoolElasticityProfileArgs'] elasticity_profile: An `elasticity_profile` block as defined below.
        :param pulumi.Input[_builtins.str] location: Specifies the Azure Region where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Standby Pool. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Standby Pool.
        :param pulumi.Input[_builtins.str] virtual_machine_state: Specifies the desired state of virtual machines in the pool. Possible values are `Running` and `Deallocated`.
        """
        if attached_virtual_machine_scale_set_id is not None:
            pulumi.set(__self__, "attached_virtual_machine_scale_set_id", attached_virtual_machine_scale_set_id)
        if elasticity_profile is not None:
            pulumi.set(__self__, "elasticity_profile", elasticity_profile)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if virtual_machine_state is not None:
            pulumi.set(__self__, "virtual_machine_state", virtual_machine_state)

    @_builtins.property
    @pulumi.getter(name="attachedVirtualMachineScaleSetId")
    def attached_virtual_machine_scale_set_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the fully qualified resource ID of a virtual machine scale set the pool is attached to.
        """
        return pulumi.get(self, "attached_virtual_machine_scale_set_id")

    @attached_virtual_machine_scale_set_id.setter
    def attached_virtual_machine_scale_set_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "attached_virtual_machine_scale_set_id", value)

    @_builtins.property
    @pulumi.getter(name="elasticityProfile")
    def elasticity_profile(self) -> Optional[pulumi.Input['ScaleSetStandbyPoolElasticityProfileArgs']]:
        """
        An `elasticity_profile` block as defined below.
        """
        return pulumi.get(self, "elasticity_profile")

    @elasticity_profile.setter
    def elasticity_profile(self, value: Optional[pulumi.Input['ScaleSetStandbyPoolElasticityProfileArgs']]):
        pulumi.set(self, "elasticity_profile", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Azure Region where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Standby Pool. Changing this forces a new Standby Pool to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Resource Group where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the Standby Pool.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="virtualMachineState")
    def virtual_machine_state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the desired state of virtual machines in the pool. Possible values are `Running` and `Deallocated`.
        """
        return pulumi.get(self, "virtual_machine_state")

    @virtual_machine_state.setter
    def virtual_machine_state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "virtual_machine_state", value)


@pulumi.type_token("azure:compute/scaleSetStandbyPool:ScaleSetStandbyPool")
class ScaleSetStandbyPool(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attached_virtual_machine_scale_set_id: Optional[pulumi.Input[_builtins.str]] = None,
                 elasticity_profile: Optional[pulumi.Input[Union['ScaleSetStandbyPoolElasticityProfileArgs', 'ScaleSetStandbyPoolElasticityProfileArgsDict']]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 virtual_machine_state: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Standby Pool for Virtual Machine Scale Sets.
        > **Note:** please follow the prerequisites mentioned in this [article](https://learn.microsoft.com/azure/virtual-machine-scale-sets/standby-pools-create?tabs=portal#prerequisites) before using this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_orchestrated_virtual_machine_scale_set = azure.compute.OrchestratedVirtualMachineScaleSet("example",
            name="example-ovmss",
            location=example.location,
            resource_group_name=example.name,
            platform_fault_domain_count=1,
            zones=["1"])
        example_scale_set_standby_pool = azure.compute.ScaleSetStandbyPool("example",
            name="example-spsvmp",
            resource_group_name=example.name,
            location="West Europe",
            attached_virtual_machine_scale_set_id=example_orchestrated_virtual_machine_scale_set.id,
            virtual_machine_state="Running",
            elasticity_profile={
                "max_ready_capacity": 10,
                "min_ready_capacity": 5,
            },
            tags={
                "key": "value",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.StandbyPool`: 2025-03-01

        ## Import

        Standby Pool can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/scaleSetStandbyPool:ScaleSetStandbyPool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StandbyPool/standbyVirtualMachinePools/standbyVirtualMachinePool1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] attached_virtual_machine_scale_set_id: Specifies the fully qualified resource ID of a virtual machine scale set the pool is attached to.
        :param pulumi.Input[Union['ScaleSetStandbyPoolElasticityProfileArgs', 'ScaleSetStandbyPoolElasticityProfileArgsDict']] elasticity_profile: An `elasticity_profile` block as defined below.
        :param pulumi.Input[_builtins.str] location: Specifies the Azure Region where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Standby Pool. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Standby Pool.
        :param pulumi.Input[_builtins.str] virtual_machine_state: Specifies the desired state of virtual machines in the pool. Possible values are `Running` and `Deallocated`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ScaleSetStandbyPoolArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Standby Pool for Virtual Machine Scale Sets.
        > **Note:** please follow the prerequisites mentioned in this [article](https://learn.microsoft.com/azure/virtual-machine-scale-sets/standby-pools-create?tabs=portal#prerequisites) before using this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_orchestrated_virtual_machine_scale_set = azure.compute.OrchestratedVirtualMachineScaleSet("example",
            name="example-ovmss",
            location=example.location,
            resource_group_name=example.name,
            platform_fault_domain_count=1,
            zones=["1"])
        example_scale_set_standby_pool = azure.compute.ScaleSetStandbyPool("example",
            name="example-spsvmp",
            resource_group_name=example.name,
            location="West Europe",
            attached_virtual_machine_scale_set_id=example_orchestrated_virtual_machine_scale_set.id,
            virtual_machine_state="Running",
            elasticity_profile={
                "max_ready_capacity": 10,
                "min_ready_capacity": 5,
            },
            tags={
                "key": "value",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.StandbyPool`: 2025-03-01

        ## Import

        Standby Pool can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:compute/scaleSetStandbyPool:ScaleSetStandbyPool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StandbyPool/standbyVirtualMachinePools/standbyVirtualMachinePool1
        ```

        :param str resource_name: The name of the resource.
        :param ScaleSetStandbyPoolArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScaleSetStandbyPoolArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attached_virtual_machine_scale_set_id: Optional[pulumi.Input[_builtins.str]] = None,
                 elasticity_profile: Optional[pulumi.Input[Union['ScaleSetStandbyPoolElasticityProfileArgs', 'ScaleSetStandbyPoolElasticityProfileArgsDict']]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 virtual_machine_state: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScaleSetStandbyPoolArgs.__new__(ScaleSetStandbyPoolArgs)

            if attached_virtual_machine_scale_set_id is None and not opts.urn:
                raise TypeError("Missing required property 'attached_virtual_machine_scale_set_id'")
            __props__.__dict__["attached_virtual_machine_scale_set_id"] = attached_virtual_machine_scale_set_id
            if elasticity_profile is None and not opts.urn:
                raise TypeError("Missing required property 'elasticity_profile'")
            __props__.__dict__["elasticity_profile"] = elasticity_profile
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
            if virtual_machine_state is None and not opts.urn:
                raise TypeError("Missing required property 'virtual_machine_state'")
            __props__.__dict__["virtual_machine_state"] = virtual_machine_state
        super(ScaleSetStandbyPool, __self__).__init__(
            'azure:compute/scaleSetStandbyPool:ScaleSetStandbyPool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            attached_virtual_machine_scale_set_id: Optional[pulumi.Input[_builtins.str]] = None,
            elasticity_profile: Optional[pulumi.Input[Union['ScaleSetStandbyPoolElasticityProfileArgs', 'ScaleSetStandbyPoolElasticityProfileArgsDict']]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            virtual_machine_state: Optional[pulumi.Input[_builtins.str]] = None) -> 'ScaleSetStandbyPool':
        """
        Get an existing ScaleSetStandbyPool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] attached_virtual_machine_scale_set_id: Specifies the fully qualified resource ID of a virtual machine scale set the pool is attached to.
        :param pulumi.Input[Union['ScaleSetStandbyPoolElasticityProfileArgs', 'ScaleSetStandbyPoolElasticityProfileArgsDict']] elasticity_profile: An `elasticity_profile` block as defined below.
        :param pulumi.Input[_builtins.str] location: Specifies the Azure Region where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Standby Pool. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: Specifies the name of the Resource Group where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Standby Pool.
        :param pulumi.Input[_builtins.str] virtual_machine_state: Specifies the desired state of virtual machines in the pool. Possible values are `Running` and `Deallocated`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScaleSetStandbyPoolState.__new__(_ScaleSetStandbyPoolState)

        __props__.__dict__["attached_virtual_machine_scale_set_id"] = attached_virtual_machine_scale_set_id
        __props__.__dict__["elasticity_profile"] = elasticity_profile
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["virtual_machine_state"] = virtual_machine_state
        return ScaleSetStandbyPool(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="attachedVirtualMachineScaleSetId")
    def attached_virtual_machine_scale_set_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the fully qualified resource ID of a virtual machine scale set the pool is attached to.
        """
        return pulumi.get(self, "attached_virtual_machine_scale_set_id")

    @_builtins.property
    @pulumi.getter(name="elasticityProfile")
    def elasticity_profile(self) -> pulumi.Output['outputs.ScaleSetStandbyPoolElasticityProfile']:
        """
        An `elasticity_profile` block as defined below.
        """
        return pulumi.get(self, "elasticity_profile")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the Azure Region where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name which should be used for this Standby Pool. Changing this forces a new Standby Pool to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Resource Group where the Standby Pool should exist. Changing this forces a new Standby Pool to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags which should be assigned to the Standby Pool.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="virtualMachineState")
    def virtual_machine_state(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the desired state of virtual machines in the pool. Possible values are `Running` and `Deallocated`.
        """
        return pulumi.get(self, "virtual_machine_state")

