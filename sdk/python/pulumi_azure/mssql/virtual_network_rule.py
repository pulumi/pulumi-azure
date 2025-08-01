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

__all__ = ['VirtualNetworkRuleArgs', 'VirtualNetworkRule']

@pulumi.input_type
class VirtualNetworkRuleArgs:
    def __init__(__self__, *,
                 server_id: pulumi.Input[_builtins.str],
                 subnet_id: pulumi.Input[_builtins.str],
                 ignore_missing_vnet_service_endpoint: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a VirtualNetworkRule resource.
        :param pulumi.Input[_builtins.str] server_id: The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] subnet_id: The ID of the subnet from which the SQL server will accept communications.
        :param pulumi.Input[_builtins.bool] ignore_missing_vnet_service_endpoint: Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
               
               > **Note:** If `ignore_missing_vnet_service_endpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `service_endpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
        :param pulumi.Input[_builtins.str] name: The name of the SQL virtual network rule. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "server_id", server_id)
        pulumi.set(__self__, "subnet_id", subnet_id)
        if ignore_missing_vnet_service_endpoint is not None:
            pulumi.set(__self__, "ignore_missing_vnet_service_endpoint", ignore_missing_vnet_service_endpoint)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[_builtins.str]:
        """
        The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "server_id", value)

    @_builtins.property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the subnet from which the SQL server will accept communications.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "subnet_id", value)

    @_builtins.property
    @pulumi.getter(name="ignoreMissingVnetServiceEndpoint")
    def ignore_missing_vnet_service_endpoint(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.

        > **Note:** If `ignore_missing_vnet_service_endpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `service_endpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
        """
        return pulumi.get(self, "ignore_missing_vnet_service_endpoint")

    @ignore_missing_vnet_service_endpoint.setter
    def ignore_missing_vnet_service_endpoint(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "ignore_missing_vnet_service_endpoint", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the SQL virtual network rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _VirtualNetworkRuleState:
    def __init__(__self__, *,
                 ignore_missing_vnet_service_endpoint: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_id: Optional[pulumi.Input[_builtins.str]] = None,
                 subnet_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering VirtualNetworkRule resources.
        :param pulumi.Input[_builtins.bool] ignore_missing_vnet_service_endpoint: Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
               
               > **Note:** If `ignore_missing_vnet_service_endpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `service_endpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
        :param pulumi.Input[_builtins.str] name: The name of the SQL virtual network rule. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] server_id: The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] subnet_id: The ID of the subnet from which the SQL server will accept communications.
        """
        if ignore_missing_vnet_service_endpoint is not None:
            pulumi.set(__self__, "ignore_missing_vnet_service_endpoint", ignore_missing_vnet_service_endpoint)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)
        if subnet_id is not None:
            pulumi.set(__self__, "subnet_id", subnet_id)

    @_builtins.property
    @pulumi.getter(name="ignoreMissingVnetServiceEndpoint")
    def ignore_missing_vnet_service_endpoint(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.

        > **Note:** If `ignore_missing_vnet_service_endpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `service_endpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
        """
        return pulumi.get(self, "ignore_missing_vnet_service_endpoint")

    @ignore_missing_vnet_service_endpoint.setter
    def ignore_missing_vnet_service_endpoint(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "ignore_missing_vnet_service_endpoint", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the SQL virtual network rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "server_id", value)

    @_builtins.property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the subnet from which the SQL server will accept communications.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "subnet_id", value)


@pulumi.type_token("azure:mssql/virtualNetworkRule:VirtualNetworkRule")
class VirtualNetworkRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ignore_missing_vnet_service_endpoint: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_id: Optional[pulumi.Input[_builtins.str]] = None,
                 subnet_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Allows you to manage rules for allowing traffic between an Azure SQL server and a subnet of a virtual network.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-sql-server-vnet-rule",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-vnet",
            address_spaces=["10.7.29.0/29"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="example-subnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.7.29.0/29"],
            service_endpoints=["Microsoft.Sql"])
        example_server = azure.mssql.Server("example",
            name="uniqueazuresqlserver",
            resource_group_name=example.name,
            location=example.location,
            version="12.0",
            administrator_login="4dm1n157r470r",
            administrator_login_password="4-v3ry-53cr37-p455w0rd")
        example_virtual_network_rule = azure.mssql.VirtualNetworkRule("example",
            name="sql-vnet-rule",
            server_id=example_server.id,
            subnet_id=example_subnet.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Sql`: 2023-08-01-preview

        ## Import

        SQL Virtual Network Rules can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mssql/virtualNetworkRule:VirtualNetworkRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/servers/myserver/virtualNetworkRules/vnetrulename
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] ignore_missing_vnet_service_endpoint: Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
               
               > **Note:** If `ignore_missing_vnet_service_endpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `service_endpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
        :param pulumi.Input[_builtins.str] name: The name of the SQL virtual network rule. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] server_id: The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] subnet_id: The ID of the subnet from which the SQL server will accept communications.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VirtualNetworkRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Allows you to manage rules for allowing traffic between an Azure SQL server and a subnet of a virtual network.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-sql-server-vnet-rule",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example-vnet",
            address_spaces=["10.7.29.0/29"],
            location=example.location,
            resource_group_name=example.name)
        example_subnet = azure.network.Subnet("example",
            name="example-subnet",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.7.29.0/29"],
            service_endpoints=["Microsoft.Sql"])
        example_server = azure.mssql.Server("example",
            name="uniqueazuresqlserver",
            resource_group_name=example.name,
            location=example.location,
            version="12.0",
            administrator_login="4dm1n157r470r",
            administrator_login_password="4-v3ry-53cr37-p455w0rd")
        example_virtual_network_rule = azure.mssql.VirtualNetworkRule("example",
            name="sql-vnet-rule",
            server_id=example_server.id,
            subnet_id=example_subnet.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Sql`: 2023-08-01-preview

        ## Import

        SQL Virtual Network Rules can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mssql/virtualNetworkRule:VirtualNetworkRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/servers/myserver/virtualNetworkRules/vnetrulename
        ```

        :param str resource_name: The name of the resource.
        :param VirtualNetworkRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VirtualNetworkRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ignore_missing_vnet_service_endpoint: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_id: Optional[pulumi.Input[_builtins.str]] = None,
                 subnet_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VirtualNetworkRuleArgs.__new__(VirtualNetworkRuleArgs)

            __props__.__dict__["ignore_missing_vnet_service_endpoint"] = ignore_missing_vnet_service_endpoint
            __props__.__dict__["name"] = name
            if server_id is None and not opts.urn:
                raise TypeError("Missing required property 'server_id'")
            __props__.__dict__["server_id"] = server_id
            if subnet_id is None and not opts.urn:
                raise TypeError("Missing required property 'subnet_id'")
            __props__.__dict__["subnet_id"] = subnet_id
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="azure:sql/virtualNetworkRule:VirtualNetworkRule")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(VirtualNetworkRule, __self__).__init__(
            'azure:mssql/virtualNetworkRule:VirtualNetworkRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ignore_missing_vnet_service_endpoint: Optional[pulumi.Input[_builtins.bool]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            server_id: Optional[pulumi.Input[_builtins.str]] = None,
            subnet_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'VirtualNetworkRule':
        """
        Get an existing VirtualNetworkRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] ignore_missing_vnet_service_endpoint: Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
               
               > **Note:** If `ignore_missing_vnet_service_endpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `service_endpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
        :param pulumi.Input[_builtins.str] name: The name of the SQL virtual network rule. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] server_id: The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] subnet_id: The ID of the subnet from which the SQL server will accept communications.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VirtualNetworkRuleState.__new__(_VirtualNetworkRuleState)

        __props__.__dict__["ignore_missing_vnet_service_endpoint"] = ignore_missing_vnet_service_endpoint
        __props__.__dict__["name"] = name
        __props__.__dict__["server_id"] = server_id
        __props__.__dict__["subnet_id"] = subnet_id
        return VirtualNetworkRule(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="ignoreMissingVnetServiceEndpoint")
    def ignore_missing_vnet_service_endpoint(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.

        > **Note:** If `ignore_missing_vnet_service_endpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `service_endpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
        """
        return pulumi.get(self, "ignore_missing_vnet_service_endpoint")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the SQL virtual network rule. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[_builtins.str]:
        """
        The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_id")

    @_builtins.property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the subnet from which the SQL server will accept communications.
        """
        return pulumi.get(self, "subnet_id")

