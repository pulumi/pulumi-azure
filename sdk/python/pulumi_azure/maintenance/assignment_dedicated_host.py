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

__all__ = ['AssignmentDedicatedHostArgs', 'AssignmentDedicatedHost']

@pulumi.input_type
class AssignmentDedicatedHostArgs:
    def __init__(__self__, *,
                 dedicated_host_id: pulumi.Input[_builtins.str],
                 maintenance_configuration_id: pulumi.Input[_builtins.str],
                 location: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a AssignmentDedicatedHost resource.
        :param pulumi.Input[_builtins.str] dedicated_host_id: Specifies the Dedicated Host ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] maintenance_configuration_id: Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "dedicated_host_id", dedicated_host_id)
        pulumi.set(__self__, "maintenance_configuration_id", maintenance_configuration_id)
        if location is not None:
            pulumi.set(__self__, "location", location)

    @_builtins.property
    @pulumi.getter(name="dedicatedHostId")
    def dedicated_host_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the Dedicated Host ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "dedicated_host_id")

    @dedicated_host_id.setter
    def dedicated_host_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "dedicated_host_id", value)

    @_builtins.property
    @pulumi.getter(name="maintenanceConfigurationId")
    def maintenance_configuration_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "maintenance_configuration_id")

    @maintenance_configuration_id.setter
    def maintenance_configuration_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "maintenance_configuration_id", value)

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


@pulumi.input_type
class _AssignmentDedicatedHostState:
    def __init__(__self__, *,
                 dedicated_host_id: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 maintenance_configuration_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AssignmentDedicatedHost resources.
        :param pulumi.Input[_builtins.str] dedicated_host_id: Specifies the Dedicated Host ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] maintenance_configuration_id: Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        """
        if dedicated_host_id is not None:
            pulumi.set(__self__, "dedicated_host_id", dedicated_host_id)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if maintenance_configuration_id is not None:
            pulumi.set(__self__, "maintenance_configuration_id", maintenance_configuration_id)

    @_builtins.property
    @pulumi.getter(name="dedicatedHostId")
    def dedicated_host_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Dedicated Host ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "dedicated_host_id")

    @dedicated_host_id.setter
    def dedicated_host_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dedicated_host_id", value)

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
    @pulumi.getter(name="maintenanceConfigurationId")
    def maintenance_configuration_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "maintenance_configuration_id")

    @maintenance_configuration_id.setter
    def maintenance_configuration_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "maintenance_configuration_id", value)


@pulumi.type_token("azure:maintenance/assignmentDedicatedHost:AssignmentDedicatedHost")
class AssignmentDedicatedHost(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dedicated_host_id: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 maintenance_configuration_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a maintenance assignment to Dedicated Host.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_dedicated_host_group = azure.compute.DedicatedHostGroup("example",
            name="example-host-group",
            resource_group_name=example.name,
            location=example.location,
            platform_fault_domain_count=2)
        example_dedicated_host = azure.compute.DedicatedHost("example",
            name="example-host",
            location=example.location,
            dedicated_host_group_id=example_dedicated_host_group.id,
            sku_name="DSv3-Type3",
            platform_fault_domain=1)
        example_configuration = azure.maintenance.Configuration("example",
            name="example-mc",
            resource_group_name=example.name,
            location=example.location,
            scope="Host")
        example_assignment_dedicated_host = azure.maintenance.AssignmentDedicatedHost("example",
            location=example.location,
            maintenance_configuration_id=example_configuration.id,
            dedicated_host_id=example_dedicated_host.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Maintenance`: 2023-04-01

        ## Import

        Maintenance Assignment can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:maintenance/assignmentDedicatedHost:AssignmentDedicatedHost example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Compute/hostGroups/group1/hosts/host1/providers/Microsoft.Maintenance/configurationAssignments/assign1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] dedicated_host_id: Specifies the Dedicated Host ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] maintenance_configuration_id: Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AssignmentDedicatedHostArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a maintenance assignment to Dedicated Host.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_dedicated_host_group = azure.compute.DedicatedHostGroup("example",
            name="example-host-group",
            resource_group_name=example.name,
            location=example.location,
            platform_fault_domain_count=2)
        example_dedicated_host = azure.compute.DedicatedHost("example",
            name="example-host",
            location=example.location,
            dedicated_host_group_id=example_dedicated_host_group.id,
            sku_name="DSv3-Type3",
            platform_fault_domain=1)
        example_configuration = azure.maintenance.Configuration("example",
            name="example-mc",
            resource_group_name=example.name,
            location=example.location,
            scope="Host")
        example_assignment_dedicated_host = azure.maintenance.AssignmentDedicatedHost("example",
            location=example.location,
            maintenance_configuration_id=example_configuration.id,
            dedicated_host_id=example_dedicated_host.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Maintenance`: 2023-04-01

        ## Import

        Maintenance Assignment can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:maintenance/assignmentDedicatedHost:AssignmentDedicatedHost example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Compute/hostGroups/group1/hosts/host1/providers/Microsoft.Maintenance/configurationAssignments/assign1
        ```

        :param str resource_name: The name of the resource.
        :param AssignmentDedicatedHostArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AssignmentDedicatedHostArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dedicated_host_id: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 maintenance_configuration_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AssignmentDedicatedHostArgs.__new__(AssignmentDedicatedHostArgs)

            if dedicated_host_id is None and not opts.urn:
                raise TypeError("Missing required property 'dedicated_host_id'")
            __props__.__dict__["dedicated_host_id"] = dedicated_host_id
            __props__.__dict__["location"] = location
            if maintenance_configuration_id is None and not opts.urn:
                raise TypeError("Missing required property 'maintenance_configuration_id'")
            __props__.__dict__["maintenance_configuration_id"] = maintenance_configuration_id
        super(AssignmentDedicatedHost, __self__).__init__(
            'azure:maintenance/assignmentDedicatedHost:AssignmentDedicatedHost',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dedicated_host_id: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            maintenance_configuration_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'AssignmentDedicatedHost':
        """
        Get an existing AssignmentDedicatedHost resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] dedicated_host_id: Specifies the Dedicated Host ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] location: Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] maintenance_configuration_id: Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AssignmentDedicatedHostState.__new__(_AssignmentDedicatedHostState)

        __props__.__dict__["dedicated_host_id"] = dedicated_host_id
        __props__.__dict__["location"] = location
        __props__.__dict__["maintenance_configuration_id"] = maintenance_configuration_id
        return AssignmentDedicatedHost(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="dedicatedHostId")
    def dedicated_host_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the Dedicated Host ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "dedicated_host_id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="maintenanceConfigurationId")
    def maintenance_configuration_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "maintenance_configuration_id")

