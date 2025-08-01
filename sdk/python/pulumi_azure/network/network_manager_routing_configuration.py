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

__all__ = ['NetworkManagerRoutingConfigurationArgs', 'NetworkManagerRoutingConfiguration']

@pulumi.input_type
class NetworkManagerRoutingConfigurationArgs:
    def __init__(__self__, *,
                 network_manager_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a NetworkManagerRoutingConfiguration resource.
        :param pulumi.Input[_builtins.str] network_manager_id: The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
        :param pulumi.Input[_builtins.str] description: The description of the Network Manager.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        pulumi.set(__self__, "network_manager_id", network_manager_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="networkManagerId")
    def network_manager_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        return pulumi.get(self, "network_manager_id")

    @network_manager_id.setter
    def network_manager_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "network_manager_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the Network Manager.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _NetworkManagerRoutingConfigurationState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_manager_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering NetworkManagerRoutingConfiguration resources.
        :param pulumi.Input[_builtins.str] description: The description of the Network Manager.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
        :param pulumi.Input[_builtins.str] network_manager_id: The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_manager_id is not None:
            pulumi.set(__self__, "network_manager_id", network_manager_id)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the Network Manager.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkManagerId")
    def network_manager_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        return pulumi.get(self, "network_manager_id")

    @network_manager_id.setter
    def network_manager_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network_manager_id", value)


@pulumi.type_token("azure:network/networkManagerRoutingConfiguration:NetworkManagerRoutingConfiguration")
class NetworkManagerRoutingConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_manager_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Network Manager Routing Configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        current = azure.core.get_subscription()
        example_network_manager = azure.network.NetworkManager("example",
            name="example-network-manager",
            location=example.location,
            resource_group_name=example.name,
            scope={
                "subscription_ids": [current.id],
            },
            scope_accesses=["Routing"])
        example_network_manager_routing_configuration = azure.network.NetworkManagerRoutingConfiguration("example",
            name="example-routing-configuration",
            network_manager_id=example_network_manager.id,
            description="example routing configuration")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2024-05-01

        ## Import

        Network Manager Routing Configurations can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/networkManagerRoutingConfiguration:NetworkManagerRoutingConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.Network/networkManagers/manager1/routingConfigurations/conf1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the Network Manager.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
        :param pulumi.Input[_builtins.str] network_manager_id: The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkManagerRoutingConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Network Manager Routing Configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        current = azure.core.get_subscription()
        example_network_manager = azure.network.NetworkManager("example",
            name="example-network-manager",
            location=example.location,
            resource_group_name=example.name,
            scope={
                "subscription_ids": [current.id],
            },
            scope_accesses=["Routing"])
        example_network_manager_routing_configuration = azure.network.NetworkManagerRoutingConfiguration("example",
            name="example-routing-configuration",
            network_manager_id=example_network_manager.id,
            description="example routing configuration")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Network`: 2024-05-01

        ## Import

        Network Manager Routing Configurations can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/networkManagerRoutingConfiguration:NetworkManagerRoutingConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.Network/networkManagers/manager1/routingConfigurations/conf1
        ```

        :param str resource_name: The name of the resource.
        :param NetworkManagerRoutingConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkManagerRoutingConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_manager_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkManagerRoutingConfigurationArgs.__new__(NetworkManagerRoutingConfigurationArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if network_manager_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_manager_id'")
            __props__.__dict__["network_manager_id"] = network_manager_id
        super(NetworkManagerRoutingConfiguration, __self__).__init__(
            'azure:network/networkManagerRoutingConfiguration:NetworkManagerRoutingConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            network_manager_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'NetworkManagerRoutingConfiguration':
        """
        Get an existing NetworkManagerRoutingConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the Network Manager.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
        :param pulumi.Input[_builtins.str] network_manager_id: The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkManagerRoutingConfigurationState.__new__(_NetworkManagerRoutingConfigurationState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["network_manager_id"] = network_manager_id
        return NetworkManagerRoutingConfiguration(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the Network Manager.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Network Manager Routing Configuration. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkManagerId")
    def network_manager_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Network Manager. Changing this forces a new Network Manager Routing Configuration to be created.
        """
        return pulumi.get(self, "network_manager_id")

