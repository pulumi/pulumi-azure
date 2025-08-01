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

__all__ = ['FlexibleServerConfigurationArgs', 'FlexibleServerConfiguration']

@pulumi.input_type
class FlexibleServerConfigurationArgs:
    def __init__(__self__, *,
                 server_id: pulumi.Input[_builtins.str],
                 value: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a FlexibleServerConfiguration resource.
        :param pulumi.Input[_builtins.str] server_id: The ID of the PostgreSQL Flexible Server where we want to change configuration. Changing this forces a new PostgreSQL Flexible Server Configuration resource.
        :param pulumi.Input[_builtins.str] value: Specifies the value of the PostgreSQL Configuration. See the PostgreSQL documentation for valid values.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the PostgreSQL Configuration, which needs [to be a valid PostgreSQL configuration name](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIER). Changing this forces a new resource to be created.
               
               > **Note:** PostgreSQL provides the ability to extend the functionality using azure extensions, with PostgreSQL azure extensions you should specify the `name` value as `azure.extensions` and the `value` you wish to allow in the [extensions list](https://learn.microsoft.com/en-us/azure/postgresql/flexible-server/concepts-extensions?WT.mc_id=Portal-Microsoft_Azure_OSSDatabases#extension-versions).
        """
        pulumi.set(__self__, "server_id", server_id)
        pulumi.set(__self__, "value", value)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the PostgreSQL Flexible Server where we want to change configuration. Changing this forces a new PostgreSQL Flexible Server Configuration resource.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "server_id", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the value of the PostgreSQL Configuration. See the PostgreSQL documentation for valid values.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "value", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the PostgreSQL Configuration, which needs [to be a valid PostgreSQL configuration name](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIER). Changing this forces a new resource to be created.

        > **Note:** PostgreSQL provides the ability to extend the functionality using azure extensions, with PostgreSQL azure extensions you should specify the `name` value as `azure.extensions` and the `value` you wish to allow in the [extensions list](https://learn.microsoft.com/en-us/azure/postgresql/flexible-server/concepts-extensions?WT.mc_id=Portal-Microsoft_Azure_OSSDatabases#extension-versions).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FlexibleServerConfigurationState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_id: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering FlexibleServerConfiguration resources.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the PostgreSQL Configuration, which needs [to be a valid PostgreSQL configuration name](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIER). Changing this forces a new resource to be created.
               
               > **Note:** PostgreSQL provides the ability to extend the functionality using azure extensions, with PostgreSQL azure extensions you should specify the `name` value as `azure.extensions` and the `value` you wish to allow in the [extensions list](https://learn.microsoft.com/en-us/azure/postgresql/flexible-server/concepts-extensions?WT.mc_id=Portal-Microsoft_Azure_OSSDatabases#extension-versions).
        :param pulumi.Input[_builtins.str] server_id: The ID of the PostgreSQL Flexible Server where we want to change configuration. Changing this forces a new PostgreSQL Flexible Server Configuration resource.
        :param pulumi.Input[_builtins.str] value: Specifies the value of the PostgreSQL Configuration. See the PostgreSQL documentation for valid values.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the PostgreSQL Configuration, which needs [to be a valid PostgreSQL configuration name](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIER). Changing this forces a new resource to be created.

        > **Note:** PostgreSQL provides the ability to extend the functionality using azure extensions, with PostgreSQL azure extensions you should specify the `name` value as `azure.extensions` and the `value` you wish to allow in the [extensions list](https://learn.microsoft.com/en-us/azure/postgresql/flexible-server/concepts-extensions?WT.mc_id=Portal-Microsoft_Azure_OSSDatabases#extension-versions).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the PostgreSQL Flexible Server where we want to change configuration. Changing this forces a new PostgreSQL Flexible Server Configuration resource.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "server_id", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the value of the PostgreSQL Configuration. See the PostgreSQL documentation for valid values.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "value", value)


@pulumi.type_token("azure:postgresql/flexibleServerConfiguration:FlexibleServerConfiguration")
class FlexibleServerConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_id: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Sets a PostgreSQL Configuration value on a Azure PostgreSQL Flexible Server.

        > **Note:** Changes to static server parameters will automatically trigger Azure Flex Server restart. This behavior can be disabled in the provider `features` block by setting the `restart_server_on_configuration_value_change` field to `false` within the `postgresql_flexible_server` block.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_flexible_server = azure.postgresql.FlexibleServer("example",
            name="example-psqlflexibleserver",
            resource_group_name=example.name,
            location=example.location,
            version="12",
            administrator_login="psqladmin",
            administrator_password="H@Sh1CoR3!",
            storage_mb=32768,
            sku_name="GP_Standard_D4s_v3")
        example_flexible_server_configuration = azure.postgresql.FlexibleServerConfiguration("example",
            name="backslash_quote",
            server_id=example_flexible_server.id,
            value="on")
        ```

        ### Azure Extensions

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_flexible_server = azure.postgresql.FlexibleServer("example",
            name="example-psqlflexibleserver",
            resource_group_name=example.name,
            location=example.location,
            version="12",
            administrator_login="psqladmin",
            administrator_password="H@Sh1CoR3!",
            storage_mb=32768,
            sku_name="GP_Standard_D4s_v3")
        example_flexible_server_configuration = azure.postgresql.FlexibleServerConfiguration("example",
            name="azure.extensions",
            server_id=example_flexible_server.id,
            value="CUBE,CITEXT,BTREE_GIST")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DBforPostgreSQL`: 2024-08-01

        ## Import

        PostgreSQL Configurations can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:postgresql/flexibleServerConfiguration:FlexibleServerConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforPostgreSQL/flexibleServers/server1/configurations/configuration1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the PostgreSQL Configuration, which needs [to be a valid PostgreSQL configuration name](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIER). Changing this forces a new resource to be created.
               
               > **Note:** PostgreSQL provides the ability to extend the functionality using azure extensions, with PostgreSQL azure extensions you should specify the `name` value as `azure.extensions` and the `value` you wish to allow in the [extensions list](https://learn.microsoft.com/en-us/azure/postgresql/flexible-server/concepts-extensions?WT.mc_id=Portal-Microsoft_Azure_OSSDatabases#extension-versions).
        :param pulumi.Input[_builtins.str] server_id: The ID of the PostgreSQL Flexible Server where we want to change configuration. Changing this forces a new PostgreSQL Flexible Server Configuration resource.
        :param pulumi.Input[_builtins.str] value: Specifies the value of the PostgreSQL Configuration. See the PostgreSQL documentation for valid values.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlexibleServerConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Sets a PostgreSQL Configuration value on a Azure PostgreSQL Flexible Server.

        > **Note:** Changes to static server parameters will automatically trigger Azure Flex Server restart. This behavior can be disabled in the provider `features` block by setting the `restart_server_on_configuration_value_change` field to `false` within the `postgresql_flexible_server` block.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_flexible_server = azure.postgresql.FlexibleServer("example",
            name="example-psqlflexibleserver",
            resource_group_name=example.name,
            location=example.location,
            version="12",
            administrator_login="psqladmin",
            administrator_password="H@Sh1CoR3!",
            storage_mb=32768,
            sku_name="GP_Standard_D4s_v3")
        example_flexible_server_configuration = azure.postgresql.FlexibleServerConfiguration("example",
            name="backslash_quote",
            server_id=example_flexible_server.id,
            value="on")
        ```

        ### Azure Extensions

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_flexible_server = azure.postgresql.FlexibleServer("example",
            name="example-psqlflexibleserver",
            resource_group_name=example.name,
            location=example.location,
            version="12",
            administrator_login="psqladmin",
            administrator_password="H@Sh1CoR3!",
            storage_mb=32768,
            sku_name="GP_Standard_D4s_v3")
        example_flexible_server_configuration = azure.postgresql.FlexibleServerConfiguration("example",
            name="azure.extensions",
            server_id=example_flexible_server.id,
            value="CUBE,CITEXT,BTREE_GIST")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DBforPostgreSQL`: 2024-08-01

        ## Import

        PostgreSQL Configurations can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:postgresql/flexibleServerConfiguration:FlexibleServerConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforPostgreSQL/flexibleServers/server1/configurations/configuration1
        ```

        :param str resource_name: The name of the resource.
        :param FlexibleServerConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlexibleServerConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_id: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlexibleServerConfigurationArgs.__new__(FlexibleServerConfigurationArgs)

            __props__.__dict__["name"] = name
            if server_id is None and not opts.urn:
                raise TypeError("Missing required property 'server_id'")
            __props__.__dict__["server_id"] = server_id
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
        super(FlexibleServerConfiguration, __self__).__init__(
            'azure:postgresql/flexibleServerConfiguration:FlexibleServerConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            server_id: Optional[pulumi.Input[_builtins.str]] = None,
            value: Optional[pulumi.Input[_builtins.str]] = None) -> 'FlexibleServerConfiguration':
        """
        Get an existing FlexibleServerConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the PostgreSQL Configuration, which needs [to be a valid PostgreSQL configuration name](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIER). Changing this forces a new resource to be created.
               
               > **Note:** PostgreSQL provides the ability to extend the functionality using azure extensions, with PostgreSQL azure extensions you should specify the `name` value as `azure.extensions` and the `value` you wish to allow in the [extensions list](https://learn.microsoft.com/en-us/azure/postgresql/flexible-server/concepts-extensions?WT.mc_id=Portal-Microsoft_Azure_OSSDatabases#extension-versions).
        :param pulumi.Input[_builtins.str] server_id: The ID of the PostgreSQL Flexible Server where we want to change configuration. Changing this forces a new PostgreSQL Flexible Server Configuration resource.
        :param pulumi.Input[_builtins.str] value: Specifies the value of the PostgreSQL Configuration. See the PostgreSQL documentation for valid values.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlexibleServerConfigurationState.__new__(_FlexibleServerConfigurationState)

        __props__.__dict__["name"] = name
        __props__.__dict__["server_id"] = server_id
        __props__.__dict__["value"] = value
        return FlexibleServerConfiguration(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the PostgreSQL Configuration, which needs [to be a valid PostgreSQL configuration name](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIER). Changing this forces a new resource to be created.

        > **Note:** PostgreSQL provides the ability to extend the functionality using azure extensions, with PostgreSQL azure extensions you should specify the `name` value as `azure.extensions` and the `value` you wish to allow in the [extensions list](https://learn.microsoft.com/en-us/azure/postgresql/flexible-server/concepts-extensions?WT.mc_id=Portal-Microsoft_Azure_OSSDatabases#extension-versions).
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the PostgreSQL Flexible Server where we want to change configuration. Changing this forces a new PostgreSQL Flexible Server Configuration resource.
        """
        return pulumi.get(self, "server_id")

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the value of the PostgreSQL Configuration. See the PostgreSQL documentation for valid values.
        """
        return pulumi.get(self, "value")

