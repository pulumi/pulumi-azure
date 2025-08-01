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

__all__ = ['IntegrationRuntimeAzureArgs', 'IntegrationRuntimeAzure']

@pulumi.input_type
class IntegrationRuntimeAzureArgs:
    def __init__(__self__, *,
                 synapse_workspace_id: pulumi.Input[_builtins.str],
                 compute_type: Optional[pulumi.Input[_builtins.str]] = None,
                 core_count: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 time_to_live_min: Optional[pulumi.Input[_builtins.int]] = None):
        """
        The set of arguments for constructing a IntegrationRuntimeAzure resource.
        :param pulumi.Input[_builtins.str] synapse_workspace_id: The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] compute_type: Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
        :param pulumi.Input[_builtins.int] core_count: Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
        :param pulumi.Input[_builtins.str] description: Integration runtime description.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.int] time_to_live_min: Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
        """
        pulumi.set(__self__, "synapse_workspace_id", synapse_workspace_id)
        if compute_type is not None:
            pulumi.set(__self__, "compute_type", compute_type)
        if core_count is not None:
            pulumi.set(__self__, "core_count", core_count)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if time_to_live_min is not None:
            pulumi.set(__self__, "time_to_live_min", time_to_live_min)

    @_builtins.property
    @pulumi.getter(name="synapseWorkspaceId")
    def synapse_workspace_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
        """
        return pulumi.get(self, "synapse_workspace_id")

    @synapse_workspace_id.setter
    def synapse_workspace_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "synapse_workspace_id", value)

    @_builtins.property
    @pulumi.getter(name="computeType")
    def compute_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
        """
        return pulumi.get(self, "compute_type")

    @compute_type.setter
    def compute_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "compute_type", value)

    @_builtins.property
    @pulumi.getter(name="coreCount")
    def core_count(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
        """
        return pulumi.get(self, "core_count")

    @core_count.setter
    def core_count(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "core_count", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Integration runtime description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="timeToLiveMin")
    def time_to_live_min(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
        """
        return pulumi.get(self, "time_to_live_min")

    @time_to_live_min.setter
    def time_to_live_min(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "time_to_live_min", value)


@pulumi.input_type
class _IntegrationRuntimeAzureState:
    def __init__(__self__, *,
                 compute_type: Optional[pulumi.Input[_builtins.str]] = None,
                 core_count: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 synapse_workspace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 time_to_live_min: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering IntegrationRuntimeAzure resources.
        :param pulumi.Input[_builtins.str] compute_type: Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
        :param pulumi.Input[_builtins.int] core_count: Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
        :param pulumi.Input[_builtins.str] description: Integration runtime description.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] synapse_workspace_id: The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.int] time_to_live_min: Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
        """
        if compute_type is not None:
            pulumi.set(__self__, "compute_type", compute_type)
        if core_count is not None:
            pulumi.set(__self__, "core_count", core_count)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if synapse_workspace_id is not None:
            pulumi.set(__self__, "synapse_workspace_id", synapse_workspace_id)
        if time_to_live_min is not None:
            pulumi.set(__self__, "time_to_live_min", time_to_live_min)

    @_builtins.property
    @pulumi.getter(name="computeType")
    def compute_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
        """
        return pulumi.get(self, "compute_type")

    @compute_type.setter
    def compute_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "compute_type", value)

    @_builtins.property
    @pulumi.getter(name="coreCount")
    def core_count(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
        """
        return pulumi.get(self, "core_count")

    @core_count.setter
    def core_count(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "core_count", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Integration runtime description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="synapseWorkspaceId")
    def synapse_workspace_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
        """
        return pulumi.get(self, "synapse_workspace_id")

    @synapse_workspace_id.setter
    def synapse_workspace_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "synapse_workspace_id", value)

    @_builtins.property
    @pulumi.getter(name="timeToLiveMin")
    def time_to_live_min(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
        """
        return pulumi.get(self, "time_to_live_min")

    @time_to_live_min.setter
    def time_to_live_min(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "time_to_live_min", value)


@pulumi.type_token("azure:synapse/integrationRuntimeAzure:IntegrationRuntimeAzure")
class IntegrationRuntimeAzure(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compute_type: Optional[pulumi.Input[_builtins.str]] = None,
                 core_count: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 synapse_workspace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 time_to_live_min: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        """
        Manages a Synapse Azure Integration Runtime.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="example",
            location=example.location,
            resource_group_name=example.name,
            account_tier="Standard",
            account_replication_type="LRS")
        example_container = azure.storage.Container("example",
            name="content",
            storage_account_name=example_account.name,
            container_access_type="private")
        example_data_lake_gen2_filesystem = azure.storage.DataLakeGen2Filesystem("example",
            name="example",
            storage_account_id=example_account.id)
        example_workspace = azure.synapse.Workspace("example",
            name="example",
            location=example.location,
            resource_group_name=example.name,
            storage_data_lake_gen2_filesystem_id=example_data_lake_gen2_filesystem.id,
            sql_administrator_login="sqladminuser",
            sql_administrator_login_password="H@Sh1CoR3!",
            managed_virtual_network_enabled=True,
            identity={
                "type": "SystemAssigned",
            })
        example_firewall_rule = azure.synapse.FirewallRule("example",
            name="AllowAll",
            synapse_workspace_id=example_workspace.id,
            start_ip_address="0.0.0.0",
            end_ip_address="255.255.255.255")
        example_integration_runtime_azure = azure.synapse.IntegrationRuntimeAzure("example",
            name="example",
            synapse_workspace_id=example_workspace.id,
            location=example.location)
        ```

        ## Import

        Synapse Azure Integration Runtimes can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:synapse/integrationRuntimeAzure:IntegrationRuntimeAzure example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Synapse/workspaces/workspace1/integrationRuntimes/IntegrationRuntime1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] compute_type: Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
        :param pulumi.Input[_builtins.int] core_count: Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
        :param pulumi.Input[_builtins.str] description: Integration runtime description.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] synapse_workspace_id: The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.int] time_to_live_min: Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationRuntimeAzureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Synapse Azure Integration Runtime.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="example",
            location=example.location,
            resource_group_name=example.name,
            account_tier="Standard",
            account_replication_type="LRS")
        example_container = azure.storage.Container("example",
            name="content",
            storage_account_name=example_account.name,
            container_access_type="private")
        example_data_lake_gen2_filesystem = azure.storage.DataLakeGen2Filesystem("example",
            name="example",
            storage_account_id=example_account.id)
        example_workspace = azure.synapse.Workspace("example",
            name="example",
            location=example.location,
            resource_group_name=example.name,
            storage_data_lake_gen2_filesystem_id=example_data_lake_gen2_filesystem.id,
            sql_administrator_login="sqladminuser",
            sql_administrator_login_password="H@Sh1CoR3!",
            managed_virtual_network_enabled=True,
            identity={
                "type": "SystemAssigned",
            })
        example_firewall_rule = azure.synapse.FirewallRule("example",
            name="AllowAll",
            synapse_workspace_id=example_workspace.id,
            start_ip_address="0.0.0.0",
            end_ip_address="255.255.255.255")
        example_integration_runtime_azure = azure.synapse.IntegrationRuntimeAzure("example",
            name="example",
            synapse_workspace_id=example_workspace.id,
            location=example.location)
        ```

        ## Import

        Synapse Azure Integration Runtimes can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:synapse/integrationRuntimeAzure:IntegrationRuntimeAzure example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Synapse/workspaces/workspace1/integrationRuntimes/IntegrationRuntime1
        ```

        :param str resource_name: The name of the resource.
        :param IntegrationRuntimeAzureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationRuntimeAzureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compute_type: Optional[pulumi.Input[_builtins.str]] = None,
                 core_count: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 synapse_workspace_id: Optional[pulumi.Input[_builtins.str]] = None,
                 time_to_live_min: Optional[pulumi.Input[_builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IntegrationRuntimeAzureArgs.__new__(IntegrationRuntimeAzureArgs)

            __props__.__dict__["compute_type"] = compute_type
            __props__.__dict__["core_count"] = core_count
            __props__.__dict__["description"] = description
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if synapse_workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'synapse_workspace_id'")
            __props__.__dict__["synapse_workspace_id"] = synapse_workspace_id
            __props__.__dict__["time_to_live_min"] = time_to_live_min
        super(IntegrationRuntimeAzure, __self__).__init__(
            'azure:synapse/integrationRuntimeAzure:IntegrationRuntimeAzure',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            compute_type: Optional[pulumi.Input[_builtins.str]] = None,
            core_count: Optional[pulumi.Input[_builtins.int]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            synapse_workspace_id: Optional[pulumi.Input[_builtins.str]] = None,
            time_to_live_min: Optional[pulumi.Input[_builtins.int]] = None) -> 'IntegrationRuntimeAzure':
        """
        Get an existing IntegrationRuntimeAzure resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] compute_type: Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
        :param pulumi.Input[_builtins.int] core_count: Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
        :param pulumi.Input[_builtins.str] description: Integration runtime description.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.str] synapse_workspace_id: The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
        :param pulumi.Input[_builtins.int] time_to_live_min: Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationRuntimeAzureState.__new__(_IntegrationRuntimeAzureState)

        __props__.__dict__["compute_type"] = compute_type
        __props__.__dict__["core_count"] = core_count
        __props__.__dict__["description"] = description
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["synapse_workspace_id"] = synapse_workspace_id
        __props__.__dict__["time_to_live_min"] = time_to_live_min
        return IntegrationRuntimeAzure(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="computeType")
    def compute_type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
        """
        return pulumi.get(self, "compute_type")

    @_builtins.property
    @pulumi.getter(name="coreCount")
    def core_count(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
        """
        return pulumi.get(self, "core_count")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Integration runtime description.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="synapseWorkspaceId")
    def synapse_workspace_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
        """
        return pulumi.get(self, "synapse_workspace_id")

    @_builtins.property
    @pulumi.getter(name="timeToLiveMin")
    def time_to_live_min(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
        """
        return pulumi.get(self, "time_to_live_min")

