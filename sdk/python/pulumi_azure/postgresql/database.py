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

__all__ = ['DatabaseArgs', 'Database']

@pulumi.input_type
class DatabaseArgs:
    def __init__(__self__, *,
                 charset: pulumi.Input[_builtins.str],
                 collation: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 server_name: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Database resource.
        :param pulumi.Input[_builtins.str] charset: Specifies the Charset for the PostgreSQL Database, which needs [to be a valid PostgreSQL Charset](https://www.postgresql.org/docs/current/static/multibyte.html). Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] collation: Specifies the Collation for the PostgreSQL Database, which needs [to be a valid PostgreSQL Collation](https://www.postgresql.org/docs/current/static/collation.html). Note that Microsoft uses different [notation](https://msdn.microsoft.com/library/windows/desktop/dd373814.aspx) - en-US instead of en_US. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the PostgreSQL Server exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] server_name: Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the PostgreSQL Database, which needs [to be a valid PostgreSQL identifier](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS). Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "charset", charset)
        pulumi.set(__self__, "collation", collation)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "server_name", server_name)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def charset(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the Charset for the PostgreSQL Database, which needs [to be a valid PostgreSQL Charset](https://www.postgresql.org/docs/current/static/multibyte.html). Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "charset")

    @charset.setter
    def charset(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "charset", value)

    @_builtins.property
    @pulumi.getter
    def collation(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the Collation for the PostgreSQL Database, which needs [to be a valid PostgreSQL Collation](https://www.postgresql.org/docs/current/static/collation.html). Note that Microsoft uses different [notation](https://msdn.microsoft.com/library/windows/desktop/dd373814.aspx) - en-US instead of en_US. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "collation")

    @collation.setter
    def collation(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "collation", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group in which the PostgreSQL Server exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="serverName")
    def server_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_name")

    @server_name.setter
    def server_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "server_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the PostgreSQL Database, which needs [to be a valid PostgreSQL identifier](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS). Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _DatabaseState:
    def __init__(__self__, *,
                 charset: Optional[pulumi.Input[_builtins.str]] = None,
                 collation: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Database resources.
        :param pulumi.Input[_builtins.str] charset: Specifies the Charset for the PostgreSQL Database, which needs [to be a valid PostgreSQL Charset](https://www.postgresql.org/docs/current/static/multibyte.html). Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] collation: Specifies the Collation for the PostgreSQL Database, which needs [to be a valid PostgreSQL Collation](https://www.postgresql.org/docs/current/static/collation.html). Note that Microsoft uses different [notation](https://msdn.microsoft.com/library/windows/desktop/dd373814.aspx) - en-US instead of en_US. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the PostgreSQL Database, which needs [to be a valid PostgreSQL identifier](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS). Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the PostgreSQL Server exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] server_name: Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
        """
        if charset is not None:
            pulumi.set(__self__, "charset", charset)
        if collation is not None:
            pulumi.set(__self__, "collation", collation)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if server_name is not None:
            pulumi.set(__self__, "server_name", server_name)

    @_builtins.property
    @pulumi.getter
    def charset(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Charset for the PostgreSQL Database, which needs [to be a valid PostgreSQL Charset](https://www.postgresql.org/docs/current/static/multibyte.html). Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "charset")

    @charset.setter
    def charset(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "charset", value)

    @_builtins.property
    @pulumi.getter
    def collation(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Collation for the PostgreSQL Database, which needs [to be a valid PostgreSQL Collation](https://www.postgresql.org/docs/current/static/collation.html). Note that Microsoft uses different [notation](https://msdn.microsoft.com/library/windows/desktop/dd373814.aspx) - en-US instead of en_US. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "collation")

    @collation.setter
    def collation(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "collation", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the PostgreSQL Database, which needs [to be a valid PostgreSQL identifier](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS). Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group in which the PostgreSQL Server exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter(name="serverName")
    def server_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_name")

    @server_name.setter
    def server_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "server_name", value)


@pulumi.type_token("azure:postgresql/database:Database")
class Database(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 charset: Optional[pulumi.Input[_builtins.str]] = None,
                 collation: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="api-rg-pro",
            location="West Europe")
        example_server = azure.postgresql.Server("example",
            name="postgresql-server-1",
            location=example.location,
            resource_group_name=example.name,
            sku_name="B_Gen5_2",
            storage_mb=5120,
            backup_retention_days=7,
            geo_redundant_backup_enabled=False,
            auto_grow_enabled=True,
            administrator_login="psqladmin",
            administrator_login_password="H@Sh1CoR3!",
            version="9.5",
            ssl_enforcement_enabled=True)
        example_database = azure.postgresql.Database("example",
            name="exampledb",
            resource_group_name=example.name,
            server_name=example_server.name,
            charset="UTF8",
            collation="English_United States.1252")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DBforPostgreSQL`: 2017-12-01

        ## Import

        PostgreSQL Database's can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:postgresql/database:Database database1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforPostgreSQL/servers/server1/databases/database1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] charset: Specifies the Charset for the PostgreSQL Database, which needs [to be a valid PostgreSQL Charset](https://www.postgresql.org/docs/current/static/multibyte.html). Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] collation: Specifies the Collation for the PostgreSQL Database, which needs [to be a valid PostgreSQL Collation](https://www.postgresql.org/docs/current/static/collation.html). Note that Microsoft uses different [notation](https://msdn.microsoft.com/library/windows/desktop/dd373814.aspx) - en-US instead of en_US. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the PostgreSQL Database, which needs [to be a valid PostgreSQL identifier](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS). Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the PostgreSQL Server exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] server_name: Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="api-rg-pro",
            location="West Europe")
        example_server = azure.postgresql.Server("example",
            name="postgresql-server-1",
            location=example.location,
            resource_group_name=example.name,
            sku_name="B_Gen5_2",
            storage_mb=5120,
            backup_retention_days=7,
            geo_redundant_backup_enabled=False,
            auto_grow_enabled=True,
            administrator_login="psqladmin",
            administrator_login_password="H@Sh1CoR3!",
            version="9.5",
            ssl_enforcement_enabled=True)
        example_database = azure.postgresql.Database("example",
            name="exampledb",
            resource_group_name=example.name,
            server_name=example_server.name,
            charset="UTF8",
            collation="English_United States.1252")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DBforPostgreSQL`: 2017-12-01

        ## Import

        PostgreSQL Database's can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:postgresql/database:Database database1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforPostgreSQL/servers/server1/databases/database1
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 charset: Optional[pulumi.Input[_builtins.str]] = None,
                 collation: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 server_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseArgs.__new__(DatabaseArgs)

            if charset is None and not opts.urn:
                raise TypeError("Missing required property 'charset'")
            __props__.__dict__["charset"] = charset
            if collation is None and not opts.urn:
                raise TypeError("Missing required property 'collation'")
            __props__.__dict__["collation"] = collation
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if server_name is None and not opts.urn:
                raise TypeError("Missing required property 'server_name'")
            __props__.__dict__["server_name"] = server_name
        super(Database, __self__).__init__(
            'azure:postgresql/database:Database',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            charset: Optional[pulumi.Input[_builtins.str]] = None,
            collation: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            server_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'Database':
        """
        Get an existing Database resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] charset: Specifies the Charset for the PostgreSQL Database, which needs [to be a valid PostgreSQL Charset](https://www.postgresql.org/docs/current/static/multibyte.html). Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] collation: Specifies the Collation for the PostgreSQL Database, which needs [to be a valid PostgreSQL Collation](https://www.postgresql.org/docs/current/static/collation.html). Note that Microsoft uses different [notation](https://msdn.microsoft.com/library/windows/desktop/dd373814.aspx) - en-US instead of en_US. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the PostgreSQL Database, which needs [to be a valid PostgreSQL identifier](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS). Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the PostgreSQL Server exists. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] server_name: Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseState.__new__(_DatabaseState)

        __props__.__dict__["charset"] = charset
        __props__.__dict__["collation"] = collation
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["server_name"] = server_name
        return Database(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def charset(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the Charset for the PostgreSQL Database, which needs [to be a valid PostgreSQL Charset](https://www.postgresql.org/docs/current/static/multibyte.html). Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "charset")

    @_builtins.property
    @pulumi.getter
    def collation(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the Collation for the PostgreSQL Database, which needs [to be a valid PostgreSQL Collation](https://www.postgresql.org/docs/current/static/collation.html). Note that Microsoft uses different [notation](https://msdn.microsoft.com/library/windows/desktop/dd373814.aspx) - en-US instead of en_US. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "collation")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the PostgreSQL Database, which needs [to be a valid PostgreSQL identifier](https://www.postgresql.org/docs/current/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS). Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group in which the PostgreSQL Server exists. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="serverName")
    def server_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the PostgreSQL Server. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "server_name")

