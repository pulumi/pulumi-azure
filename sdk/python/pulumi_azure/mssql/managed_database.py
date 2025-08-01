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

__all__ = ['ManagedDatabaseArgs', 'ManagedDatabase']

@pulumi.input_type
class ManagedDatabaseArgs:
    def __init__(__self__, *,
                 managed_instance_id: pulumi.Input[_builtins.str],
                 long_term_retention_policy: Optional[pulumi.Input['ManagedDatabaseLongTermRetentionPolicyArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 point_in_time_restore: Optional[pulumi.Input['ManagedDatabasePointInTimeRestoreArgs']] = None,
                 short_term_retention_days: Optional[pulumi.Input[_builtins.int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a ManagedDatabase resource.
        :param pulumi.Input[_builtins.str] managed_instance_id: The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        :param pulumi.Input['ManagedDatabaseLongTermRetentionPolicyArgs'] long_term_retention_policy: A `long_term_retention_policy` block as defined below.
        :param pulumi.Input[_builtins.str] name: The name of the Managed Database to create. Changing this forces a new resource to be created.
        :param pulumi.Input['ManagedDatabasePointInTimeRestoreArgs'] point_in_time_restore: A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] short_term_retention_days: The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "managed_instance_id", managed_instance_id)
        if long_term_retention_policy is not None:
            pulumi.set(__self__, "long_term_retention_policy", long_term_retention_policy)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if point_in_time_restore is not None:
            pulumi.set(__self__, "point_in_time_restore", point_in_time_restore)
        if short_term_retention_days is not None:
            pulumi.set(__self__, "short_term_retention_days", short_term_retention_days)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="managedInstanceId")
    def managed_instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_instance_id")

    @managed_instance_id.setter
    def managed_instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "managed_instance_id", value)

    @_builtins.property
    @pulumi.getter(name="longTermRetentionPolicy")
    def long_term_retention_policy(self) -> Optional[pulumi.Input['ManagedDatabaseLongTermRetentionPolicyArgs']]:
        """
        A `long_term_retention_policy` block as defined below.
        """
        return pulumi.get(self, "long_term_retention_policy")

    @long_term_retention_policy.setter
    def long_term_retention_policy(self, value: Optional[pulumi.Input['ManagedDatabaseLongTermRetentionPolicyArgs']]):
        pulumi.set(self, "long_term_retention_policy", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="pointInTimeRestore")
    def point_in_time_restore(self) -> Optional[pulumi.Input['ManagedDatabasePointInTimeRestoreArgs']]:
        """
        A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "point_in_time_restore")

    @point_in_time_restore.setter
    def point_in_time_restore(self, value: Optional[pulumi.Input['ManagedDatabasePointInTimeRestoreArgs']]):
        pulumi.set(self, "point_in_time_restore", value)

    @_builtins.property
    @pulumi.getter(name="shortTermRetentionDays")
    def short_term_retention_days(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        """
        return pulumi.get(self, "short_term_retention_days")

    @short_term_retention_days.setter
    def short_term_retention_days(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "short_term_retention_days", value)

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


@pulumi.input_type
class _ManagedDatabaseState:
    def __init__(__self__, *,
                 long_term_retention_policy: Optional[pulumi.Input['ManagedDatabaseLongTermRetentionPolicyArgs']] = None,
                 managed_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 point_in_time_restore: Optional[pulumi.Input['ManagedDatabasePointInTimeRestoreArgs']] = None,
                 short_term_retention_days: Optional[pulumi.Input[_builtins.int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering ManagedDatabase resources.
        :param pulumi.Input['ManagedDatabaseLongTermRetentionPolicyArgs'] long_term_retention_policy: A `long_term_retention_policy` block as defined below.
        :param pulumi.Input[_builtins.str] managed_instance_id: The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Managed Database to create. Changing this forces a new resource to be created.
        :param pulumi.Input['ManagedDatabasePointInTimeRestoreArgs'] point_in_time_restore: A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] short_term_retention_days: The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        if long_term_retention_policy is not None:
            pulumi.set(__self__, "long_term_retention_policy", long_term_retention_policy)
        if managed_instance_id is not None:
            pulumi.set(__self__, "managed_instance_id", managed_instance_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if point_in_time_restore is not None:
            pulumi.set(__self__, "point_in_time_restore", point_in_time_restore)
        if short_term_retention_days is not None:
            pulumi.set(__self__, "short_term_retention_days", short_term_retention_days)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="longTermRetentionPolicy")
    def long_term_retention_policy(self) -> Optional[pulumi.Input['ManagedDatabaseLongTermRetentionPolicyArgs']]:
        """
        A `long_term_retention_policy` block as defined below.
        """
        return pulumi.get(self, "long_term_retention_policy")

    @long_term_retention_policy.setter
    def long_term_retention_policy(self, value: Optional[pulumi.Input['ManagedDatabaseLongTermRetentionPolicyArgs']]):
        pulumi.set(self, "long_term_retention_policy", value)

    @_builtins.property
    @pulumi.getter(name="managedInstanceId")
    def managed_instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_instance_id")

    @managed_instance_id.setter
    def managed_instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "managed_instance_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="pointInTimeRestore")
    def point_in_time_restore(self) -> Optional[pulumi.Input['ManagedDatabasePointInTimeRestoreArgs']]:
        """
        A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "point_in_time_restore")

    @point_in_time_restore.setter
    def point_in_time_restore(self, value: Optional[pulumi.Input['ManagedDatabasePointInTimeRestoreArgs']]):
        pulumi.set(self, "point_in_time_restore", value)

    @_builtins.property
    @pulumi.getter(name="shortTermRetentionDays")
    def short_term_retention_days(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        """
        return pulumi.get(self, "short_term_retention_days")

    @short_term_retention_days.setter
    def short_term_retention_days(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "short_term_retention_days", value)

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


@pulumi.type_token("azure:mssql/managedDatabase:ManagedDatabase")
class ManagedDatabase(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 long_term_retention_policy: Optional[pulumi.Input[Union['ManagedDatabaseLongTermRetentionPolicyArgs', 'ManagedDatabaseLongTermRetentionPolicyArgsDict']]] = None,
                 managed_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 point_in_time_restore: Optional[pulumi.Input[Union['ManagedDatabasePointInTimeRestoreArgs', 'ManagedDatabasePointInTimeRestoreArgsDict']]] = None,
                 short_term_retention_days: Optional[pulumi.Input[_builtins.int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example",
            location=example.location,
            resource_group_name=example.name,
            address_spaces=["10.0.0.0/16"])
        example_subnet = azure.network.Subnet("example",
            name="example",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.2.0/24"])
        example_managed_instance = azure.mssql.ManagedInstance("example",
            name="managedsqlinstance",
            resource_group_name=example.name,
            location=example.location,
            license_type="BasePrice",
            sku_name="GP_Gen5",
            storage_size_in_gb=32,
            subnet_id=example_subnet.id,
            vcores=4,
            administrator_login="msadministrator",
            administrator_login_password="thisIsDog11")
        example_managed_database = azure.mssql.ManagedDatabase("example",
            name="example",
            managed_instance_id=example_managed_instance.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Sql`: 2023-08-01-preview

        ## Import

        SQL Managed Databases can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mssql/managedDatabase:ManagedDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/myserver/databases/mydatabase
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ManagedDatabaseLongTermRetentionPolicyArgs', 'ManagedDatabaseLongTermRetentionPolicyArgsDict']] long_term_retention_policy: A `long_term_retention_policy` block as defined below.
        :param pulumi.Input[_builtins.str] managed_instance_id: The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Managed Database to create. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['ManagedDatabasePointInTimeRestoreArgs', 'ManagedDatabasePointInTimeRestoreArgsDict']] point_in_time_restore: A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] short_term_retention_days: The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagedDatabaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example",
            location="West Europe")
        example_virtual_network = azure.network.VirtualNetwork("example",
            name="example",
            location=example.location,
            resource_group_name=example.name,
            address_spaces=["10.0.0.0/16"])
        example_subnet = azure.network.Subnet("example",
            name="example",
            resource_group_name=example.name,
            virtual_network_name=example_virtual_network.name,
            address_prefixes=["10.0.2.0/24"])
        example_managed_instance = azure.mssql.ManagedInstance("example",
            name="managedsqlinstance",
            resource_group_name=example.name,
            location=example.location,
            license_type="BasePrice",
            sku_name="GP_Gen5",
            storage_size_in_gb=32,
            subnet_id=example_subnet.id,
            vcores=4,
            administrator_login="msadministrator",
            administrator_login_password="thisIsDog11")
        example_managed_database = azure.mssql.ManagedDatabase("example",
            name="example",
            managed_instance_id=example_managed_instance.id)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Sql`: 2023-08-01-preview

        ## Import

        SQL Managed Databases can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mssql/managedDatabase:ManagedDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/myserver/databases/mydatabase
        ```

        :param str resource_name: The name of the resource.
        :param ManagedDatabaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagedDatabaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 long_term_retention_policy: Optional[pulumi.Input[Union['ManagedDatabaseLongTermRetentionPolicyArgs', 'ManagedDatabaseLongTermRetentionPolicyArgsDict']]] = None,
                 managed_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 point_in_time_restore: Optional[pulumi.Input[Union['ManagedDatabasePointInTimeRestoreArgs', 'ManagedDatabasePointInTimeRestoreArgsDict']]] = None,
                 short_term_retention_days: Optional[pulumi.Input[_builtins.int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagedDatabaseArgs.__new__(ManagedDatabaseArgs)

            __props__.__dict__["long_term_retention_policy"] = long_term_retention_policy
            if managed_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'managed_instance_id'")
            __props__.__dict__["managed_instance_id"] = managed_instance_id
            __props__.__dict__["name"] = name
            __props__.__dict__["point_in_time_restore"] = point_in_time_restore
            __props__.__dict__["short_term_retention_days"] = short_term_retention_days
            __props__.__dict__["tags"] = tags
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="azure:sql/managedDatabase:ManagedDatabase")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ManagedDatabase, __self__).__init__(
            'azure:mssql/managedDatabase:ManagedDatabase',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            long_term_retention_policy: Optional[pulumi.Input[Union['ManagedDatabaseLongTermRetentionPolicyArgs', 'ManagedDatabaseLongTermRetentionPolicyArgsDict']]] = None,
            managed_instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            point_in_time_restore: Optional[pulumi.Input[Union['ManagedDatabasePointInTimeRestoreArgs', 'ManagedDatabasePointInTimeRestoreArgsDict']]] = None,
            short_term_retention_days: Optional[pulumi.Input[_builtins.int]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'ManagedDatabase':
        """
        Get an existing ManagedDatabase resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ManagedDatabaseLongTermRetentionPolicyArgs', 'ManagedDatabaseLongTermRetentionPolicyArgsDict']] long_term_retention_policy: A `long_term_retention_policy` block as defined below.
        :param pulumi.Input[_builtins.str] managed_instance_id: The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Managed Database to create. Changing this forces a new resource to be created.
        :param pulumi.Input[Union['ManagedDatabasePointInTimeRestoreArgs', 'ManagedDatabasePointInTimeRestoreArgsDict']] point_in_time_restore: A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.int] short_term_retention_days: The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagedDatabaseState.__new__(_ManagedDatabaseState)

        __props__.__dict__["long_term_retention_policy"] = long_term_retention_policy
        __props__.__dict__["managed_instance_id"] = managed_instance_id
        __props__.__dict__["name"] = name
        __props__.__dict__["point_in_time_restore"] = point_in_time_restore
        __props__.__dict__["short_term_retention_days"] = short_term_retention_days
        __props__.__dict__["tags"] = tags
        return ManagedDatabase(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="longTermRetentionPolicy")
    def long_term_retention_policy(self) -> pulumi.Output['outputs.ManagedDatabaseLongTermRetentionPolicy']:
        """
        A `long_term_retention_policy` block as defined below.
        """
        return pulumi.get(self, "long_term_retention_policy")

    @_builtins.property
    @pulumi.getter(name="managedInstanceId")
    def managed_instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "managed_instance_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Managed Database to create. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="pointInTimeRestore")
    def point_in_time_restore(self) -> pulumi.Output[Optional['outputs.ManagedDatabasePointInTimeRestore']]:
        """
        A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "point_in_time_restore")

    @_builtins.property
    @pulumi.getter(name="shortTermRetentionDays")
    def short_term_retention_days(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        """
        return pulumi.get(self, "short_term_retention_days")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

