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

__all__ = ['NetworkManagerManagementGroupConnectionArgs', 'NetworkManagerManagementGroupConnection']

@pulumi.input_type
class NetworkManagerManagementGroupConnectionArgs:
    def __init__(__self__, *,
                 management_group_id: pulumi.Input[_builtins.str],
                 network_manager_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a NetworkManagerManagementGroupConnection resource.
        :param pulumi.Input[_builtins.str] management_group_id: Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] network_manager_id: Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] description: A description of the Network Manager Management Group Connection.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
        """
        pulumi.set(__self__, "management_group_id", management_group_id)
        pulumi.set(__self__, "network_manager_id", network_manager_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="managementGroupId")
    def management_group_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "management_group_id")

    @management_group_id.setter
    def management_group_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "management_group_id", value)

    @_builtins.property
    @pulumi.getter(name="networkManagerId")
    def network_manager_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "network_manager_id")

    @network_manager_id.setter
    def network_manager_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "network_manager_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description of the Network Manager Management Group Connection.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _NetworkManagerManagementGroupConnectionState:
    def __init__(__self__, *,
                 connection_state: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 management_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_manager_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering NetworkManagerManagementGroupConnection resources.
        :param pulumi.Input[_builtins.str] connection_state: The Connection state of the Network Manager Management Group Connection.
        :param pulumi.Input[_builtins.str] description: A description of the Network Manager Management Group Connection.
        :param pulumi.Input[_builtins.str] management_group_id: Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
        :param pulumi.Input[_builtins.str] network_manager_id: Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
        """
        if connection_state is not None:
            pulumi.set(__self__, "connection_state", connection_state)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if management_group_id is not None:
            pulumi.set(__self__, "management_group_id", management_group_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_manager_id is not None:
            pulumi.set(__self__, "network_manager_id", network_manager_id)

    @_builtins.property
    @pulumi.getter(name="connectionState")
    def connection_state(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Connection state of the Network Manager Management Group Connection.
        """
        return pulumi.get(self, "connection_state")

    @connection_state.setter
    def connection_state(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "connection_state", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A description of the Network Manager Management Group Connection.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="managementGroupId")
    def management_group_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "management_group_id")

    @management_group_id.setter
    def management_group_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "management_group_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkManagerId")
    def network_manager_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "network_manager_id")

    @network_manager_id.setter
    def network_manager_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network_manager_id", value)


@pulumi.type_token("azure:network/networkManagerManagementGroupConnection:NetworkManagerManagementGroupConnection")
class NetworkManagerManagementGroupConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 management_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_manager_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Network Manager Management Group Connection which may cross tenants.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.management.Group("example")
        alt = azure.core.get_subscription(subscription_id="00000000-0000-0000-0000-000000000000")
        example_group_subscription_association = azure.management.GroupSubscriptionAssociation("example",
            management_group_id=example.id,
            subscription_id=alt.id)
        current = azure.core.get_subscription()
        current_get_client_config = azure.core.get_client_config()
        network_contributor = azure.authorization.Assignment("network_contributor",
            scope=example.id,
            role_definition_name="Network Contributor",
            principal_id=current_get_client_config.object_id)
        example_resource_group = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_network_manager = azure.network.NetworkManager("example",
            name="example-networkmanager",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            scope={
                "subscription_ids": [current.id],
            },
            scope_accesses=["SecurityAdmin"])
        example_network_manager_management_group_connection = azure.network.NetworkManagerManagementGroupConnection("example",
            name="example-nmmgc",
            management_group_id=example.id,
            network_manager_id=example_network_manager.id,
            description="example",
            opts = pulumi.ResourceOptions(depends_on=[network_contributor]))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Management`: 2024-05-01

        ## Import

        Network Manager Management Group Connection can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/networkManagerManagementGroupConnection:NetworkManagerManagementGroupConnection example /providers/Microsoft.Management/managementGroups/00000000-0000-0000-0000-000000000000/providers/Microsoft.Network/networkManagerConnections/networkManagerConnection1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: A description of the Network Manager Management Group Connection.
        :param pulumi.Input[_builtins.str] management_group_id: Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
        :param pulumi.Input[_builtins.str] network_manager_id: Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkManagerManagementGroupConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Network Manager Management Group Connection which may cross tenants.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.management.Group("example")
        alt = azure.core.get_subscription(subscription_id="00000000-0000-0000-0000-000000000000")
        example_group_subscription_association = azure.management.GroupSubscriptionAssociation("example",
            management_group_id=example.id,
            subscription_id=alt.id)
        current = azure.core.get_subscription()
        current_get_client_config = azure.core.get_client_config()
        network_contributor = azure.authorization.Assignment("network_contributor",
            scope=example.id,
            role_definition_name="Network Contributor",
            principal_id=current_get_client_config.object_id)
        example_resource_group = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_network_manager = azure.network.NetworkManager("example",
            name="example-networkmanager",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            scope={
                "subscription_ids": [current.id],
            },
            scope_accesses=["SecurityAdmin"])
        example_network_manager_management_group_connection = azure.network.NetworkManagerManagementGroupConnection("example",
            name="example-nmmgc",
            management_group_id=example.id,
            network_manager_id=example_network_manager.id,
            description="example",
            opts = pulumi.ResourceOptions(depends_on=[network_contributor]))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Management`: 2024-05-01

        ## Import

        Network Manager Management Group Connection can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:network/networkManagerManagementGroupConnection:NetworkManagerManagementGroupConnection example /providers/Microsoft.Management/managementGroups/00000000-0000-0000-0000-000000000000/providers/Microsoft.Network/networkManagerConnections/networkManagerConnection1
        ```

        :param str resource_name: The name of the resource.
        :param NetworkManagerManagementGroupConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkManagerManagementGroupConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 management_group_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_manager_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkManagerManagementGroupConnectionArgs.__new__(NetworkManagerManagementGroupConnectionArgs)

            __props__.__dict__["description"] = description
            if management_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'management_group_id'")
            __props__.__dict__["management_group_id"] = management_group_id
            __props__.__dict__["name"] = name
            if network_manager_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_manager_id'")
            __props__.__dict__["network_manager_id"] = network_manager_id
            __props__.__dict__["connection_state"] = None
        super(NetworkManagerManagementGroupConnection, __self__).__init__(
            'azure:network/networkManagerManagementGroupConnection:NetworkManagerManagementGroupConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connection_state: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            management_group_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            network_manager_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'NetworkManagerManagementGroupConnection':
        """
        Get an existing NetworkManagerManagementGroupConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] connection_state: The Connection state of the Network Manager Management Group Connection.
        :param pulumi.Input[_builtins.str] description: A description of the Network Manager Management Group Connection.
        :param pulumi.Input[_builtins.str] management_group_id: Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
        :param pulumi.Input[_builtins.str] network_manager_id: Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkManagerManagementGroupConnectionState.__new__(_NetworkManagerManagementGroupConnectionState)

        __props__.__dict__["connection_state"] = connection_state
        __props__.__dict__["description"] = description
        __props__.__dict__["management_group_id"] = management_group_id
        __props__.__dict__["name"] = name
        __props__.__dict__["network_manager_id"] = network_manager_id
        return NetworkManagerManagementGroupConnection(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="connectionState")
    def connection_state(self) -> pulumi.Output[_builtins.str]:
        """
        The Connection state of the Network Manager Management Group Connection.
        """
        return pulumi.get(self, "connection_state")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        A description of the Network Manager Management Group Connection.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="managementGroupId")
    def management_group_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "management_group_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkManagerId")
    def network_manager_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "network_manager_id")

