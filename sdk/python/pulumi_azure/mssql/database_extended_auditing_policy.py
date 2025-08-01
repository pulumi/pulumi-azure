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

__all__ = ['DatabaseExtendedAuditingPolicyArgs', 'DatabaseExtendedAuditingPolicy']

@pulumi.input_type
class DatabaseExtendedAuditingPolicyArgs:
    def __init__(__self__, *,
                 database_id: pulumi.Input[_builtins.str],
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 log_monitoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 retention_in_days: Optional[pulumi.Input[_builtins.int]] = None,
                 storage_account_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_access_key_is_secondary: Optional[pulumi.Input[_builtins.bool]] = None,
                 storage_endpoint: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a DatabaseExtendedAuditingPolicy resource.
        :param pulumi.Input[_builtins.str] database_id: The ID of the SQL database to set the extended auditing policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] enabled: Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.
               
               > **Note:** If `enabled` is `true`, `storage_endpoint` or `log_monitoring_enabled` are required.
        :param pulumi.Input[_builtins.bool] log_monitoring_enabled: Enable audit events to Azure Monitor? Defaults to `true`.
               
               > **Note:** To enable sending audit events to Log Analytics, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_log_analytics` directory within the GitHub Repository.  To enable sending server audit events to Log Analytics, please enable the master database to send audit events to Log Analytics.
               To enable audit events to Eventhub, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_eventhub` directory within the GitHub Repository.
        :param pulumi.Input[_builtins.int] retention_in_days: The number of days to retain logs for in the storage account. Defaults to `0`.
        :param pulumi.Input[_builtins.str] storage_account_access_key: The access key to use for the auditing storage account.
        :param pulumi.Input[_builtins.bool] storage_account_access_key_is_secondary: Is `storage_account_access_key` value the storage's secondary key?
        :param pulumi.Input[_builtins.str] storage_endpoint: The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
        """
        pulumi.set(__self__, "database_id", database_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if log_monitoring_enabled is not None:
            pulumi.set(__self__, "log_monitoring_enabled", log_monitoring_enabled)
        if retention_in_days is not None:
            pulumi.set(__self__, "retention_in_days", retention_in_days)
        if storage_account_access_key is not None:
            pulumi.set(__self__, "storage_account_access_key", storage_account_access_key)
        if storage_account_access_key_is_secondary is not None:
            pulumi.set(__self__, "storage_account_access_key_is_secondary", storage_account_access_key_is_secondary)
        if storage_endpoint is not None:
            pulumi.set(__self__, "storage_endpoint", storage_endpoint)

    @_builtins.property
    @pulumi.getter(name="databaseId")
    def database_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the SQL database to set the extended auditing policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "database_id")

    @database_id.setter
    def database_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "database_id", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.

        > **Note:** If `enabled` is `true`, `storage_endpoint` or `log_monitoring_enabled` are required.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter(name="logMonitoringEnabled")
    def log_monitoring_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable audit events to Azure Monitor? Defaults to `true`.

        > **Note:** To enable sending audit events to Log Analytics, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_log_analytics` directory within the GitHub Repository.  To enable sending server audit events to Log Analytics, please enable the master database to send audit events to Log Analytics.
        To enable audit events to Eventhub, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_eventhub` directory within the GitHub Repository.
        """
        return pulumi.get(self, "log_monitoring_enabled")

    @log_monitoring_enabled.setter
    def log_monitoring_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "log_monitoring_enabled", value)

    @_builtins.property
    @pulumi.getter(name="retentionInDays")
    def retention_in_days(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of days to retain logs for in the storage account. Defaults to `0`.
        """
        return pulumi.get(self, "retention_in_days")

    @retention_in_days.setter
    def retention_in_days(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "retention_in_days", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountAccessKey")
    def storage_account_access_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The access key to use for the auditing storage account.
        """
        return pulumi.get(self, "storage_account_access_key")

    @storage_account_access_key.setter
    def storage_account_access_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_account_access_key", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountAccessKeyIsSecondary")
    def storage_account_access_key_is_secondary(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is `storage_account_access_key` value the storage's secondary key?
        """
        return pulumi.get(self, "storage_account_access_key_is_secondary")

    @storage_account_access_key_is_secondary.setter
    def storage_account_access_key_is_secondary(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "storage_account_access_key_is_secondary", value)

    @_builtins.property
    @pulumi.getter(name="storageEndpoint")
    def storage_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
        """
        return pulumi.get(self, "storage_endpoint")

    @storage_endpoint.setter
    def storage_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_endpoint", value)


@pulumi.input_type
class _DatabaseExtendedAuditingPolicyState:
    def __init__(__self__, *,
                 database_id: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 log_monitoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 retention_in_days: Optional[pulumi.Input[_builtins.int]] = None,
                 storage_account_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_access_key_is_secondary: Optional[pulumi.Input[_builtins.bool]] = None,
                 storage_endpoint: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering DatabaseExtendedAuditingPolicy resources.
        :param pulumi.Input[_builtins.str] database_id: The ID of the SQL database to set the extended auditing policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] enabled: Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.
               
               > **Note:** If `enabled` is `true`, `storage_endpoint` or `log_monitoring_enabled` are required.
        :param pulumi.Input[_builtins.bool] log_monitoring_enabled: Enable audit events to Azure Monitor? Defaults to `true`.
               
               > **Note:** To enable sending audit events to Log Analytics, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_log_analytics` directory within the GitHub Repository.  To enable sending server audit events to Log Analytics, please enable the master database to send audit events to Log Analytics.
               To enable audit events to Eventhub, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_eventhub` directory within the GitHub Repository.
        :param pulumi.Input[_builtins.int] retention_in_days: The number of days to retain logs for in the storage account. Defaults to `0`.
        :param pulumi.Input[_builtins.str] storage_account_access_key: The access key to use for the auditing storage account.
        :param pulumi.Input[_builtins.bool] storage_account_access_key_is_secondary: Is `storage_account_access_key` value the storage's secondary key?
        :param pulumi.Input[_builtins.str] storage_endpoint: The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
        """
        if database_id is not None:
            pulumi.set(__self__, "database_id", database_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if log_monitoring_enabled is not None:
            pulumi.set(__self__, "log_monitoring_enabled", log_monitoring_enabled)
        if retention_in_days is not None:
            pulumi.set(__self__, "retention_in_days", retention_in_days)
        if storage_account_access_key is not None:
            pulumi.set(__self__, "storage_account_access_key", storage_account_access_key)
        if storage_account_access_key_is_secondary is not None:
            pulumi.set(__self__, "storage_account_access_key_is_secondary", storage_account_access_key_is_secondary)
        if storage_endpoint is not None:
            pulumi.set(__self__, "storage_endpoint", storage_endpoint)

    @_builtins.property
    @pulumi.getter(name="databaseId")
    def database_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the SQL database to set the extended auditing policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "database_id")

    @database_id.setter
    def database_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "database_id", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.

        > **Note:** If `enabled` is `true`, `storage_endpoint` or `log_monitoring_enabled` are required.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter(name="logMonitoringEnabled")
    def log_monitoring_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable audit events to Azure Monitor? Defaults to `true`.

        > **Note:** To enable sending audit events to Log Analytics, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_log_analytics` directory within the GitHub Repository.  To enable sending server audit events to Log Analytics, please enable the master database to send audit events to Log Analytics.
        To enable audit events to Eventhub, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_eventhub` directory within the GitHub Repository.
        """
        return pulumi.get(self, "log_monitoring_enabled")

    @log_monitoring_enabled.setter
    def log_monitoring_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "log_monitoring_enabled", value)

    @_builtins.property
    @pulumi.getter(name="retentionInDays")
    def retention_in_days(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The number of days to retain logs for in the storage account. Defaults to `0`.
        """
        return pulumi.get(self, "retention_in_days")

    @retention_in_days.setter
    def retention_in_days(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "retention_in_days", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountAccessKey")
    def storage_account_access_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The access key to use for the auditing storage account.
        """
        return pulumi.get(self, "storage_account_access_key")

    @storage_account_access_key.setter
    def storage_account_access_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_account_access_key", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountAccessKeyIsSecondary")
    def storage_account_access_key_is_secondary(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is `storage_account_access_key` value the storage's secondary key?
        """
        return pulumi.get(self, "storage_account_access_key_is_secondary")

    @storage_account_access_key_is_secondary.setter
    def storage_account_access_key_is_secondary(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "storage_account_access_key_is_secondary", value)

    @_builtins.property
    @pulumi.getter(name="storageEndpoint")
    def storage_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
        """
        return pulumi.get(self, "storage_endpoint")

    @storage_endpoint.setter
    def storage_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_endpoint", value)


@pulumi.type_token("azure:mssql/databaseExtendedAuditingPolicy:DatabaseExtendedAuditingPolicy")
class DatabaseExtendedAuditingPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_id: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 log_monitoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 retention_in_days: Optional[pulumi.Input[_builtins.int]] = None,
                 storage_account_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_access_key_is_secondary: Optional[pulumi.Input[_builtins.bool]] = None,
                 storage_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a MS SQL Database Extended Auditing Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_server = azure.mssql.Server("example",
            name="example-sqlserver",
            resource_group_name=example.name,
            location=example.location,
            version="12.0",
            administrator_login="missadministrator",
            administrator_login_password="AdminPassword123!")
        example_database = azure.mssql.Database("example",
            name="example-db",
            server_id=example_server.id)
        example_account = azure.storage.Account("example",
            name="examplesa",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_database_extended_auditing_policy = azure.mssql.DatabaseExtendedAuditingPolicy("example",
            database_id=example_database.id,
            storage_endpoint=example_account.primary_blob_endpoint,
            storage_account_access_key=example_account.primary_access_key,
            storage_account_access_key_is_secondary=False,
            retention_in_days=6)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Sql`: 2023-08-01-preview

        ## Import

        MS SQL Database Extended Auditing Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mssql/databaseExtendedAuditingPolicy:DatabaseExtendedAuditingPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Sql/servers/sqlServer1/databases/db1/extendedAuditingSettings/default
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] database_id: The ID of the SQL database to set the extended auditing policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] enabled: Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.
               
               > **Note:** If `enabled` is `true`, `storage_endpoint` or `log_monitoring_enabled` are required.
        :param pulumi.Input[_builtins.bool] log_monitoring_enabled: Enable audit events to Azure Monitor? Defaults to `true`.
               
               > **Note:** To enable sending audit events to Log Analytics, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_log_analytics` directory within the GitHub Repository.  To enable sending server audit events to Log Analytics, please enable the master database to send audit events to Log Analytics.
               To enable audit events to Eventhub, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_eventhub` directory within the GitHub Repository.
        :param pulumi.Input[_builtins.int] retention_in_days: The number of days to retain logs for in the storage account. Defaults to `0`.
        :param pulumi.Input[_builtins.str] storage_account_access_key: The access key to use for the auditing storage account.
        :param pulumi.Input[_builtins.bool] storage_account_access_key_is_secondary: Is `storage_account_access_key` value the storage's secondary key?
        :param pulumi.Input[_builtins.str] storage_endpoint: The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseExtendedAuditingPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a MS SQL Database Extended Auditing Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_server = azure.mssql.Server("example",
            name="example-sqlserver",
            resource_group_name=example.name,
            location=example.location,
            version="12.0",
            administrator_login="missadministrator",
            administrator_login_password="AdminPassword123!")
        example_database = azure.mssql.Database("example",
            name="example-db",
            server_id=example_server.id)
        example_account = azure.storage.Account("example",
            name="examplesa",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_database_extended_auditing_policy = azure.mssql.DatabaseExtendedAuditingPolicy("example",
            database_id=example_database.id,
            storage_endpoint=example_account.primary_blob_endpoint,
            storage_account_access_key=example_account.primary_access_key,
            storage_account_access_key_is_secondary=False,
            retention_in_days=6)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Sql`: 2023-08-01-preview

        ## Import

        MS SQL Database Extended Auditing Policies can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mssql/databaseExtendedAuditingPolicy:DatabaseExtendedAuditingPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Sql/servers/sqlServer1/databases/db1/extendedAuditingSettings/default
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseExtendedAuditingPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseExtendedAuditingPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_id: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 log_monitoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 retention_in_days: Optional[pulumi.Input[_builtins.int]] = None,
                 storage_account_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_access_key_is_secondary: Optional[pulumi.Input[_builtins.bool]] = None,
                 storage_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseExtendedAuditingPolicyArgs.__new__(DatabaseExtendedAuditingPolicyArgs)

            if database_id is None and not opts.urn:
                raise TypeError("Missing required property 'database_id'")
            __props__.__dict__["database_id"] = database_id
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["log_monitoring_enabled"] = log_monitoring_enabled
            __props__.__dict__["retention_in_days"] = retention_in_days
            __props__.__dict__["storage_account_access_key"] = None if storage_account_access_key is None else pulumi.Output.secret(storage_account_access_key)
            __props__.__dict__["storage_account_access_key_is_secondary"] = storage_account_access_key_is_secondary
            __props__.__dict__["storage_endpoint"] = storage_endpoint
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["storageAccountAccessKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(DatabaseExtendedAuditingPolicy, __self__).__init__(
            'azure:mssql/databaseExtendedAuditingPolicy:DatabaseExtendedAuditingPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            database_id: Optional[pulumi.Input[_builtins.str]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            log_monitoring_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            retention_in_days: Optional[pulumi.Input[_builtins.int]] = None,
            storage_account_access_key: Optional[pulumi.Input[_builtins.str]] = None,
            storage_account_access_key_is_secondary: Optional[pulumi.Input[_builtins.bool]] = None,
            storage_endpoint: Optional[pulumi.Input[_builtins.str]] = None) -> 'DatabaseExtendedAuditingPolicy':
        """
        Get an existing DatabaseExtendedAuditingPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] database_id: The ID of the SQL database to set the extended auditing policy. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] enabled: Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.
               
               > **Note:** If `enabled` is `true`, `storage_endpoint` or `log_monitoring_enabled` are required.
        :param pulumi.Input[_builtins.bool] log_monitoring_enabled: Enable audit events to Azure Monitor? Defaults to `true`.
               
               > **Note:** To enable sending audit events to Log Analytics, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_log_analytics` directory within the GitHub Repository.  To enable sending server audit events to Log Analytics, please enable the master database to send audit events to Log Analytics.
               To enable audit events to Eventhub, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_eventhub` directory within the GitHub Repository.
        :param pulumi.Input[_builtins.int] retention_in_days: The number of days to retain logs for in the storage account. Defaults to `0`.
        :param pulumi.Input[_builtins.str] storage_account_access_key: The access key to use for the auditing storage account.
        :param pulumi.Input[_builtins.bool] storage_account_access_key_is_secondary: Is `storage_account_access_key` value the storage's secondary key?
        :param pulumi.Input[_builtins.str] storage_endpoint: The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseExtendedAuditingPolicyState.__new__(_DatabaseExtendedAuditingPolicyState)

        __props__.__dict__["database_id"] = database_id
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["log_monitoring_enabled"] = log_monitoring_enabled
        __props__.__dict__["retention_in_days"] = retention_in_days
        __props__.__dict__["storage_account_access_key"] = storage_account_access_key
        __props__.__dict__["storage_account_access_key_is_secondary"] = storage_account_access_key_is_secondary
        __props__.__dict__["storage_endpoint"] = storage_endpoint
        return DatabaseExtendedAuditingPolicy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="databaseId")
    def database_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the SQL database to set the extended auditing policy. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "database_id")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.

        > **Note:** If `enabled` is `true`, `storage_endpoint` or `log_monitoring_enabled` are required.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="logMonitoringEnabled")
    def log_monitoring_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Enable audit events to Azure Monitor? Defaults to `true`.

        > **Note:** To enable sending audit events to Log Analytics, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_log_analytics` directory within the GitHub Repository.  To enable sending server audit events to Log Analytics, please enable the master database to send audit events to Log Analytics.
        To enable audit events to Eventhub, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_eventhub` directory within the GitHub Repository.
        """
        return pulumi.get(self, "log_monitoring_enabled")

    @_builtins.property
    @pulumi.getter(name="retentionInDays")
    def retention_in_days(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The number of days to retain logs for in the storage account. Defaults to `0`.
        """
        return pulumi.get(self, "retention_in_days")

    @_builtins.property
    @pulumi.getter(name="storageAccountAccessKey")
    def storage_account_access_key(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The access key to use for the auditing storage account.
        """
        return pulumi.get(self, "storage_account_access_key")

    @_builtins.property
    @pulumi.getter(name="storageAccountAccessKeyIsSecondary")
    def storage_account_access_key_is_secondary(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Is `storage_account_access_key` value the storage's secondary key?
        """
        return pulumi.get(self, "storage_account_access_key_is_secondary")

    @_builtins.property
    @pulumi.getter(name="storageEndpoint")
    def storage_endpoint(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
        """
        return pulumi.get(self, "storage_endpoint")

