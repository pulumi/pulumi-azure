# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SpringCloudAppCosmosDBAssociationArgs', 'SpringCloudAppCosmosDBAssociation']

@pulumi.input_type
class SpringCloudAppCosmosDBAssociationArgs:
    def __init__(__self__, *,
                 api_type: pulumi.Input[str],
                 cosmosdb_access_key: pulumi.Input[str],
                 cosmosdb_account_id: pulumi.Input[str],
                 spring_cloud_app_id: pulumi.Input[str],
                 cosmosdb_cassandra_keyspace_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_gremlin_database_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_gremlin_graph_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_mongo_database_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_sql_database_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SpringCloudAppCosmosDBAssociation resource.
        :param pulumi.Input[str] api_type: Specifies the api type which should be used when connecting to the CosmosDB Account. Possible values are `cassandra`, `gremlin`, `mongo`, `sql` or `table`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] cosmosdb_access_key: Specifies the CosmosDB Account access key.
        :param pulumi.Input[str] cosmosdb_account_id: Specifies the ID of the CosmosDB Account. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spring_cloud_app_id: Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] cosmosdb_cassandra_keyspace_name: Specifies the name of the Cassandra Keyspace which the Spring Cloud App should be associated with. Should only be set when `api_type` is `cassandra`.
        :param pulumi.Input[str] cosmosdb_gremlin_database_name: Specifies the name of the Gremlin Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        :param pulumi.Input[str] cosmosdb_gremlin_graph_name: Specifies the name of the Gremlin Graph which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        :param pulumi.Input[str] cosmosdb_mongo_database_name: Specifies the name of the Mongo Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `mongo`.
        :param pulumi.Input[str] cosmosdb_sql_database_name: Specifies the name of the Sql Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `sql`.
        :param pulumi.Input[str] name: Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "api_type", api_type)
        pulumi.set(__self__, "cosmosdb_access_key", cosmosdb_access_key)
        pulumi.set(__self__, "cosmosdb_account_id", cosmosdb_account_id)
        pulumi.set(__self__, "spring_cloud_app_id", spring_cloud_app_id)
        if cosmosdb_cassandra_keyspace_name is not None:
            pulumi.set(__self__, "cosmosdb_cassandra_keyspace_name", cosmosdb_cassandra_keyspace_name)
        if cosmosdb_gremlin_database_name is not None:
            pulumi.set(__self__, "cosmosdb_gremlin_database_name", cosmosdb_gremlin_database_name)
        if cosmosdb_gremlin_graph_name is not None:
            pulumi.set(__self__, "cosmosdb_gremlin_graph_name", cosmosdb_gremlin_graph_name)
        if cosmosdb_mongo_database_name is not None:
            pulumi.set(__self__, "cosmosdb_mongo_database_name", cosmosdb_mongo_database_name)
        if cosmosdb_sql_database_name is not None:
            pulumi.set(__self__, "cosmosdb_sql_database_name", cosmosdb_sql_database_name)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="apiType")
    def api_type(self) -> pulumi.Input[str]:
        """
        Specifies the api type which should be used when connecting to the CosmosDB Account. Possible values are `cassandra`, `gremlin`, `mongo`, `sql` or `table`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "api_type")

    @api_type.setter
    def api_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_type", value)

    @property
    @pulumi.getter(name="cosmosdbAccessKey")
    def cosmosdb_access_key(self) -> pulumi.Input[str]:
        """
        Specifies the CosmosDB Account access key.
        """
        return pulumi.get(self, "cosmosdb_access_key")

    @cosmosdb_access_key.setter
    def cosmosdb_access_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "cosmosdb_access_key", value)

    @property
    @pulumi.getter(name="cosmosdbAccountId")
    def cosmosdb_account_id(self) -> pulumi.Input[str]:
        """
        Specifies the ID of the CosmosDB Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cosmosdb_account_id")

    @cosmosdb_account_id.setter
    def cosmosdb_account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cosmosdb_account_id", value)

    @property
    @pulumi.getter(name="springCloudAppId")
    def spring_cloud_app_id(self) -> pulumi.Input[str]:
        """
        Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spring_cloud_app_id")

    @spring_cloud_app_id.setter
    def spring_cloud_app_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "spring_cloud_app_id", value)

    @property
    @pulumi.getter(name="cosmosdbCassandraKeyspaceName")
    def cosmosdb_cassandra_keyspace_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Cassandra Keyspace which the Spring Cloud App should be associated with. Should only be set when `api_type` is `cassandra`.
        """
        return pulumi.get(self, "cosmosdb_cassandra_keyspace_name")

    @cosmosdb_cassandra_keyspace_name.setter
    def cosmosdb_cassandra_keyspace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_cassandra_keyspace_name", value)

    @property
    @pulumi.getter(name="cosmosdbGremlinDatabaseName")
    def cosmosdb_gremlin_database_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Gremlin Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        """
        return pulumi.get(self, "cosmosdb_gremlin_database_name")

    @cosmosdb_gremlin_database_name.setter
    def cosmosdb_gremlin_database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_gremlin_database_name", value)

    @property
    @pulumi.getter(name="cosmosdbGremlinGraphName")
    def cosmosdb_gremlin_graph_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Gremlin Graph which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        """
        return pulumi.get(self, "cosmosdb_gremlin_graph_name")

    @cosmosdb_gremlin_graph_name.setter
    def cosmosdb_gremlin_graph_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_gremlin_graph_name", value)

    @property
    @pulumi.getter(name="cosmosdbMongoDatabaseName")
    def cosmosdb_mongo_database_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Mongo Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `mongo`.
        """
        return pulumi.get(self, "cosmosdb_mongo_database_name")

    @cosmosdb_mongo_database_name.setter
    def cosmosdb_mongo_database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_mongo_database_name", value)

    @property
    @pulumi.getter(name="cosmosdbSqlDatabaseName")
    def cosmosdb_sql_database_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Sql Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `sql`.
        """
        return pulumi.get(self, "cosmosdb_sql_database_name")

    @cosmosdb_sql_database_name.setter
    def cosmosdb_sql_database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_sql_database_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SpringCloudAppCosmosDBAssociationState:
    def __init__(__self__, *,
                 api_type: Optional[pulumi.Input[str]] = None,
                 cosmosdb_access_key: Optional[pulumi.Input[str]] = None,
                 cosmosdb_account_id: Optional[pulumi.Input[str]] = None,
                 cosmosdb_cassandra_keyspace_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_gremlin_database_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_gremlin_graph_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_mongo_database_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_sql_database_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spring_cloud_app_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SpringCloudAppCosmosDBAssociation resources.
        :param pulumi.Input[str] api_type: Specifies the api type which should be used when connecting to the CosmosDB Account. Possible values are `cassandra`, `gremlin`, `mongo`, `sql` or `table`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] cosmosdb_access_key: Specifies the CosmosDB Account access key.
        :param pulumi.Input[str] cosmosdb_account_id: Specifies the ID of the CosmosDB Account. Changing this forces a new resource to be created.
        :param pulumi.Input[str] cosmosdb_cassandra_keyspace_name: Specifies the name of the Cassandra Keyspace which the Spring Cloud App should be associated with. Should only be set when `api_type` is `cassandra`.
        :param pulumi.Input[str] cosmosdb_gremlin_database_name: Specifies the name of the Gremlin Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        :param pulumi.Input[str] cosmosdb_gremlin_graph_name: Specifies the name of the Gremlin Graph which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        :param pulumi.Input[str] cosmosdb_mongo_database_name: Specifies the name of the Mongo Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `mongo`.
        :param pulumi.Input[str] cosmosdb_sql_database_name: Specifies the name of the Sql Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `sql`.
        :param pulumi.Input[str] name: Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spring_cloud_app_id: Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        """
        if api_type is not None:
            pulumi.set(__self__, "api_type", api_type)
        if cosmosdb_access_key is not None:
            pulumi.set(__self__, "cosmosdb_access_key", cosmosdb_access_key)
        if cosmosdb_account_id is not None:
            pulumi.set(__self__, "cosmosdb_account_id", cosmosdb_account_id)
        if cosmosdb_cassandra_keyspace_name is not None:
            pulumi.set(__self__, "cosmosdb_cassandra_keyspace_name", cosmosdb_cassandra_keyspace_name)
        if cosmosdb_gremlin_database_name is not None:
            pulumi.set(__self__, "cosmosdb_gremlin_database_name", cosmosdb_gremlin_database_name)
        if cosmosdb_gremlin_graph_name is not None:
            pulumi.set(__self__, "cosmosdb_gremlin_graph_name", cosmosdb_gremlin_graph_name)
        if cosmosdb_mongo_database_name is not None:
            pulumi.set(__self__, "cosmosdb_mongo_database_name", cosmosdb_mongo_database_name)
        if cosmosdb_sql_database_name is not None:
            pulumi.set(__self__, "cosmosdb_sql_database_name", cosmosdb_sql_database_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if spring_cloud_app_id is not None:
            pulumi.set(__self__, "spring_cloud_app_id", spring_cloud_app_id)

    @property
    @pulumi.getter(name="apiType")
    def api_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the api type which should be used when connecting to the CosmosDB Account. Possible values are `cassandra`, `gremlin`, `mongo`, `sql` or `table`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "api_type")

    @api_type.setter
    def api_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_type", value)

    @property
    @pulumi.getter(name="cosmosdbAccessKey")
    def cosmosdb_access_key(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the CosmosDB Account access key.
        """
        return pulumi.get(self, "cosmosdb_access_key")

    @cosmosdb_access_key.setter
    def cosmosdb_access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_access_key", value)

    @property
    @pulumi.getter(name="cosmosdbAccountId")
    def cosmosdb_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the ID of the CosmosDB Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cosmosdb_account_id")

    @cosmosdb_account_id.setter
    def cosmosdb_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_account_id", value)

    @property
    @pulumi.getter(name="cosmosdbCassandraKeyspaceName")
    def cosmosdb_cassandra_keyspace_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Cassandra Keyspace which the Spring Cloud App should be associated with. Should only be set when `api_type` is `cassandra`.
        """
        return pulumi.get(self, "cosmosdb_cassandra_keyspace_name")

    @cosmosdb_cassandra_keyspace_name.setter
    def cosmosdb_cassandra_keyspace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_cassandra_keyspace_name", value)

    @property
    @pulumi.getter(name="cosmosdbGremlinDatabaseName")
    def cosmosdb_gremlin_database_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Gremlin Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        """
        return pulumi.get(self, "cosmosdb_gremlin_database_name")

    @cosmosdb_gremlin_database_name.setter
    def cosmosdb_gremlin_database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_gremlin_database_name", value)

    @property
    @pulumi.getter(name="cosmosdbGremlinGraphName")
    def cosmosdb_gremlin_graph_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Gremlin Graph which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        """
        return pulumi.get(self, "cosmosdb_gremlin_graph_name")

    @cosmosdb_gremlin_graph_name.setter
    def cosmosdb_gremlin_graph_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_gremlin_graph_name", value)

    @property
    @pulumi.getter(name="cosmosdbMongoDatabaseName")
    def cosmosdb_mongo_database_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Mongo Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `mongo`.
        """
        return pulumi.get(self, "cosmosdb_mongo_database_name")

    @cosmosdb_mongo_database_name.setter
    def cosmosdb_mongo_database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_mongo_database_name", value)

    @property
    @pulumi.getter(name="cosmosdbSqlDatabaseName")
    def cosmosdb_sql_database_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Sql Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `sql`.
        """
        return pulumi.get(self, "cosmosdb_sql_database_name")

    @cosmosdb_sql_database_name.setter
    def cosmosdb_sql_database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cosmosdb_sql_database_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="springCloudAppId")
    def spring_cloud_app_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spring_cloud_app_id")

    @spring_cloud_app_id.setter
    def spring_cloud_app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "spring_cloud_app_id", value)


class SpringCloudAppCosmosDBAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_type: Optional[pulumi.Input[str]] = None,
                 cosmosdb_access_key: Optional[pulumi.Input[str]] = None,
                 cosmosdb_account_id: Optional[pulumi.Input[str]] = None,
                 cosmosdb_cassandra_keyspace_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_gremlin_database_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_gremlin_graph_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_mongo_database_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_sql_database_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spring_cloud_app_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Associates a Spring Cloud Application with a CosmosDB Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_spring_cloud_service = azure.appplatform.SpringCloudService("exampleSpringCloudService",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_spring_cloud_app = azure.appplatform.SpringCloudApp("exampleSpringCloudApp",
            resource_group_name=example_resource_group.name,
            service_name=example_spring_cloud_service.name)
        example_account = azure.cosmosdb.Account("exampleAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            offer_type="Standard",
            kind="GlobalDocumentDB",
            consistency_policy=azure.cosmosdb.AccountConsistencyPolicyArgs(
                consistency_level="Strong",
            ),
            geo_locations=[azure.cosmosdb.AccountGeoLocationArgs(
                location=example_resource_group.location,
                failover_priority=0,
            )])
        example_spring_cloud_app_cosmos_dbassociation = azure.appplatform.SpringCloudAppCosmosDBAssociation("exampleSpringCloudAppCosmosDBAssociation",
            spring_cloud_app_id=example_spring_cloud_app.id,
            cosmosdb_account_id=example_account.id,
            api_type="table",
            cosmosdb_access_key=example_account.primary_key)
        ```

        ## Import

        Spring Cloud Application CosmosDB Association can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:appplatform/springCloudAppCosmosDBAssociation:SpringCloudAppCosmosDBAssociation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.AppPlatform/Spring/service1/apps/app1/bindings/bind1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_type: Specifies the api type which should be used when connecting to the CosmosDB Account. Possible values are `cassandra`, `gremlin`, `mongo`, `sql` or `table`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] cosmosdb_access_key: Specifies the CosmosDB Account access key.
        :param pulumi.Input[str] cosmosdb_account_id: Specifies the ID of the CosmosDB Account. Changing this forces a new resource to be created.
        :param pulumi.Input[str] cosmosdb_cassandra_keyspace_name: Specifies the name of the Cassandra Keyspace which the Spring Cloud App should be associated with. Should only be set when `api_type` is `cassandra`.
        :param pulumi.Input[str] cosmosdb_gremlin_database_name: Specifies the name of the Gremlin Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        :param pulumi.Input[str] cosmosdb_gremlin_graph_name: Specifies the name of the Gremlin Graph which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        :param pulumi.Input[str] cosmosdb_mongo_database_name: Specifies the name of the Mongo Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `mongo`.
        :param pulumi.Input[str] cosmosdb_sql_database_name: Specifies the name of the Sql Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `sql`.
        :param pulumi.Input[str] name: Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spring_cloud_app_id: Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SpringCloudAppCosmosDBAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Associates a Spring Cloud Application with a CosmosDB Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_spring_cloud_service = azure.appplatform.SpringCloudService("exampleSpringCloudService",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_spring_cloud_app = azure.appplatform.SpringCloudApp("exampleSpringCloudApp",
            resource_group_name=example_resource_group.name,
            service_name=example_spring_cloud_service.name)
        example_account = azure.cosmosdb.Account("exampleAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            offer_type="Standard",
            kind="GlobalDocumentDB",
            consistency_policy=azure.cosmosdb.AccountConsistencyPolicyArgs(
                consistency_level="Strong",
            ),
            geo_locations=[azure.cosmosdb.AccountGeoLocationArgs(
                location=example_resource_group.location,
                failover_priority=0,
            )])
        example_spring_cloud_app_cosmos_dbassociation = azure.appplatform.SpringCloudAppCosmosDBAssociation("exampleSpringCloudAppCosmosDBAssociation",
            spring_cloud_app_id=example_spring_cloud_app.id,
            cosmosdb_account_id=example_account.id,
            api_type="table",
            cosmosdb_access_key=example_account.primary_key)
        ```

        ## Import

        Spring Cloud Application CosmosDB Association can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:appplatform/springCloudAppCosmosDBAssociation:SpringCloudAppCosmosDBAssociation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.AppPlatform/Spring/service1/apps/app1/bindings/bind1
        ```

        :param str resource_name: The name of the resource.
        :param SpringCloudAppCosmosDBAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpringCloudAppCosmosDBAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_type: Optional[pulumi.Input[str]] = None,
                 cosmosdb_access_key: Optional[pulumi.Input[str]] = None,
                 cosmosdb_account_id: Optional[pulumi.Input[str]] = None,
                 cosmosdb_cassandra_keyspace_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_gremlin_database_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_gremlin_graph_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_mongo_database_name: Optional[pulumi.Input[str]] = None,
                 cosmosdb_sql_database_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spring_cloud_app_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpringCloudAppCosmosDBAssociationArgs.__new__(SpringCloudAppCosmosDBAssociationArgs)

            if api_type is None and not opts.urn:
                raise TypeError("Missing required property 'api_type'")
            __props__.__dict__["api_type"] = api_type
            if cosmosdb_access_key is None and not opts.urn:
                raise TypeError("Missing required property 'cosmosdb_access_key'")
            __props__.__dict__["cosmosdb_access_key"] = cosmosdb_access_key
            if cosmosdb_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'cosmosdb_account_id'")
            __props__.__dict__["cosmosdb_account_id"] = cosmosdb_account_id
            __props__.__dict__["cosmosdb_cassandra_keyspace_name"] = cosmosdb_cassandra_keyspace_name
            __props__.__dict__["cosmosdb_gremlin_database_name"] = cosmosdb_gremlin_database_name
            __props__.__dict__["cosmosdb_gremlin_graph_name"] = cosmosdb_gremlin_graph_name
            __props__.__dict__["cosmosdb_mongo_database_name"] = cosmosdb_mongo_database_name
            __props__.__dict__["cosmosdb_sql_database_name"] = cosmosdb_sql_database_name
            __props__.__dict__["name"] = name
            if spring_cloud_app_id is None and not opts.urn:
                raise TypeError("Missing required property 'spring_cloud_app_id'")
            __props__.__dict__["spring_cloud_app_id"] = spring_cloud_app_id
        super(SpringCloudAppCosmosDBAssociation, __self__).__init__(
            'azure:appplatform/springCloudAppCosmosDBAssociation:SpringCloudAppCosmosDBAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_type: Optional[pulumi.Input[str]] = None,
            cosmosdb_access_key: Optional[pulumi.Input[str]] = None,
            cosmosdb_account_id: Optional[pulumi.Input[str]] = None,
            cosmosdb_cassandra_keyspace_name: Optional[pulumi.Input[str]] = None,
            cosmosdb_gremlin_database_name: Optional[pulumi.Input[str]] = None,
            cosmosdb_gremlin_graph_name: Optional[pulumi.Input[str]] = None,
            cosmosdb_mongo_database_name: Optional[pulumi.Input[str]] = None,
            cosmosdb_sql_database_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            spring_cloud_app_id: Optional[pulumi.Input[str]] = None) -> 'SpringCloudAppCosmosDBAssociation':
        """
        Get an existing SpringCloudAppCosmosDBAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_type: Specifies the api type which should be used when connecting to the CosmosDB Account. Possible values are `cassandra`, `gremlin`, `mongo`, `sql` or `table`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] cosmosdb_access_key: Specifies the CosmosDB Account access key.
        :param pulumi.Input[str] cosmosdb_account_id: Specifies the ID of the CosmosDB Account. Changing this forces a new resource to be created.
        :param pulumi.Input[str] cosmosdb_cassandra_keyspace_name: Specifies the name of the Cassandra Keyspace which the Spring Cloud App should be associated with. Should only be set when `api_type` is `cassandra`.
        :param pulumi.Input[str] cosmosdb_gremlin_database_name: Specifies the name of the Gremlin Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        :param pulumi.Input[str] cosmosdb_gremlin_graph_name: Specifies the name of the Gremlin Graph which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        :param pulumi.Input[str] cosmosdb_mongo_database_name: Specifies the name of the Mongo Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `mongo`.
        :param pulumi.Input[str] cosmosdb_sql_database_name: Specifies the name of the Sql Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `sql`.
        :param pulumi.Input[str] name: Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spring_cloud_app_id: Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpringCloudAppCosmosDBAssociationState.__new__(_SpringCloudAppCosmosDBAssociationState)

        __props__.__dict__["api_type"] = api_type
        __props__.__dict__["cosmosdb_access_key"] = cosmosdb_access_key
        __props__.__dict__["cosmosdb_account_id"] = cosmosdb_account_id
        __props__.__dict__["cosmosdb_cassandra_keyspace_name"] = cosmosdb_cassandra_keyspace_name
        __props__.__dict__["cosmosdb_gremlin_database_name"] = cosmosdb_gremlin_database_name
        __props__.__dict__["cosmosdb_gremlin_graph_name"] = cosmosdb_gremlin_graph_name
        __props__.__dict__["cosmosdb_mongo_database_name"] = cosmosdb_mongo_database_name
        __props__.__dict__["cosmosdb_sql_database_name"] = cosmosdb_sql_database_name
        __props__.__dict__["name"] = name
        __props__.__dict__["spring_cloud_app_id"] = spring_cloud_app_id
        return SpringCloudAppCosmosDBAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiType")
    def api_type(self) -> pulumi.Output[str]:
        """
        Specifies the api type which should be used when connecting to the CosmosDB Account. Possible values are `cassandra`, `gremlin`, `mongo`, `sql` or `table`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "api_type")

    @property
    @pulumi.getter(name="cosmosdbAccessKey")
    def cosmosdb_access_key(self) -> pulumi.Output[str]:
        """
        Specifies the CosmosDB Account access key.
        """
        return pulumi.get(self, "cosmosdb_access_key")

    @property
    @pulumi.getter(name="cosmosdbAccountId")
    def cosmosdb_account_id(self) -> pulumi.Output[str]:
        """
        Specifies the ID of the CosmosDB Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "cosmosdb_account_id")

    @property
    @pulumi.getter(name="cosmosdbCassandraKeyspaceName")
    def cosmosdb_cassandra_keyspace_name(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the name of the Cassandra Keyspace which the Spring Cloud App should be associated with. Should only be set when `api_type` is `cassandra`.
        """
        return pulumi.get(self, "cosmosdb_cassandra_keyspace_name")

    @property
    @pulumi.getter(name="cosmosdbGremlinDatabaseName")
    def cosmosdb_gremlin_database_name(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the name of the Gremlin Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        """
        return pulumi.get(self, "cosmosdb_gremlin_database_name")

    @property
    @pulumi.getter(name="cosmosdbGremlinGraphName")
    def cosmosdb_gremlin_graph_name(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the name of the Gremlin Graph which the Spring Cloud App should be associated with. Should only be set when `api_type` is `gremlin`.
        """
        return pulumi.get(self, "cosmosdb_gremlin_graph_name")

    @property
    @pulumi.getter(name="cosmosdbMongoDatabaseName")
    def cosmosdb_mongo_database_name(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the name of the Mongo Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `mongo`.
        """
        return pulumi.get(self, "cosmosdb_mongo_database_name")

    @property
    @pulumi.getter(name="cosmosdbSqlDatabaseName")
    def cosmosdb_sql_database_name(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the name of the Sql Database which the Spring Cloud App should be associated with. Should only be set when `api_type` is `sql`.
        """
        return pulumi.get(self, "cosmosdb_sql_database_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="springCloudAppId")
    def spring_cloud_app_id(self) -> pulumi.Output[str]:
        """
        Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spring_cloud_app_id")
