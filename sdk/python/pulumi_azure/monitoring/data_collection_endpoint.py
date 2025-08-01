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

__all__ = ['DataCollectionEndpointArgs', 'DataCollectionEndpoint']

@pulumi.input_type
class DataCollectionEndpointArgs:
    def __init__(__self__, *,
                 resource_group_name: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 public_network_access_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a DataCollectionEndpoint resource.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[_builtins.str] description: Specifies a description for the Data Collection Endpoint.
        :param pulumi.Input[_builtins.str] kind: The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[_builtins.bool] public_network_access_enabled: Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Data Collection Endpoint.
        """
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if public_network_access_enabled is not None:
            pulumi.set(__self__, "public_network_access_enabled", public_network_access_enabled)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a description for the Data Collection Endpoint.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "kind", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="publicNetworkAccessEnabled")
    def public_network_access_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
        """
        return pulumi.get(self, "public_network_access_enabled")

    @public_network_access_enabled.setter
    def public_network_access_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "public_network_access_enabled", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the Data Collection Endpoint.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DataCollectionEndpointState:
    def __init__(__self__, *,
                 configuration_access_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 immutable_id: Optional[pulumi.Input[_builtins.str]] = None,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 logs_ingestion_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 metrics_ingestion_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 public_network_access_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering DataCollectionEndpoint resources.
        :param pulumi.Input[_builtins.str] configuration_access_endpoint: The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
        :param pulumi.Input[_builtins.str] description: Specifies a description for the Data Collection Endpoint.
        :param pulumi.Input[_builtins.str] immutable_id: The immutable ID of the Data Collection Endpoint.
        :param pulumi.Input[_builtins.str] kind: The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[_builtins.str] logs_ingestion_endpoint: The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
        :param pulumi.Input[_builtins.str] metrics_ingestion_endpoint: The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[_builtins.bool] public_network_access_enabled: Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Data Collection Endpoint.
        """
        if configuration_access_endpoint is not None:
            pulumi.set(__self__, "configuration_access_endpoint", configuration_access_endpoint)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if immutable_id is not None:
            pulumi.set(__self__, "immutable_id", immutable_id)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if logs_ingestion_endpoint is not None:
            pulumi.set(__self__, "logs_ingestion_endpoint", logs_ingestion_endpoint)
        if metrics_ingestion_endpoint is not None:
            pulumi.set(__self__, "metrics_ingestion_endpoint", metrics_ingestion_endpoint)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if public_network_access_enabled is not None:
            pulumi.set(__self__, "public_network_access_enabled", public_network_access_enabled)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="configurationAccessEndpoint")
    def configuration_access_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
        """
        return pulumi.get(self, "configuration_access_endpoint")

    @configuration_access_endpoint.setter
    def configuration_access_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "configuration_access_endpoint", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a description for the Data Collection Endpoint.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="immutableId")
    def immutable_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The immutable ID of the Data Collection Endpoint.
        """
        return pulumi.get(self, "immutable_id")

    @immutable_id.setter
    def immutable_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "immutable_id", value)

    @_builtins.property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "kind", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter(name="logsIngestionEndpoint")
    def logs_ingestion_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
        """
        return pulumi.get(self, "logs_ingestion_endpoint")

    @logs_ingestion_endpoint.setter
    def logs_ingestion_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "logs_ingestion_endpoint", value)

    @_builtins.property
    @pulumi.getter(name="metricsIngestionEndpoint")
    def metrics_ingestion_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
        """
        return pulumi.get(self, "metrics_ingestion_endpoint")

    @metrics_ingestion_endpoint.setter
    def metrics_ingestion_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "metrics_ingestion_endpoint", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="publicNetworkAccessEnabled")
    def public_network_access_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
        """
        return pulumi.get(self, "public_network_access_enabled")

    @public_network_access_enabled.setter
    def public_network_access_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "public_network_access_enabled", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the Data Collection Endpoint.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.type_token("azure:monitoring/dataCollectionEndpoint:DataCollectionEndpoint")
class DataCollectionEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 public_network_access_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a Data Collection Endpoint.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg",
            location="West Europe")
        example_data_collection_endpoint = azure.monitoring.DataCollectionEndpoint("example",
            name="example-mdce",
            resource_group_name=example.name,
            location=example.location,
            kind="Windows",
            public_network_access_enabled=True,
            description="monitor_data_collection_endpoint example",
            tags={
                "foo": "bar",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Insights`: 2023-03-11

        ## Import

        Data Collection Endpoints can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:monitoring/dataCollectionEndpoint:DataCollectionEndpoint example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Insights/dataCollectionEndpoints/endpoint1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: Specifies a description for the Data Collection Endpoint.
        :param pulumi.Input[_builtins.str] kind: The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[_builtins.bool] public_network_access_enabled: Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Data Collection Endpoint.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataCollectionEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Data Collection Endpoint.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-rg",
            location="West Europe")
        example_data_collection_endpoint = azure.monitoring.DataCollectionEndpoint("example",
            name="example-mdce",
            resource_group_name=example.name,
            location=example.location,
            kind="Windows",
            public_network_access_enabled=True,
            description="monitor_data_collection_endpoint example",
            tags={
                "foo": "bar",
            })
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Insights`: 2023-03-11

        ## Import

        Data Collection Endpoints can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:monitoring/dataCollectionEndpoint:DataCollectionEndpoint example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Insights/dataCollectionEndpoints/endpoint1
        ```

        :param str resource_name: The name of the resource.
        :param DataCollectionEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataCollectionEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 public_network_access_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataCollectionEndpointArgs.__new__(DataCollectionEndpointArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["kind"] = kind
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["public_network_access_enabled"] = public_network_access_enabled
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["configuration_access_endpoint"] = None
            __props__.__dict__["immutable_id"] = None
            __props__.__dict__["logs_ingestion_endpoint"] = None
            __props__.__dict__["metrics_ingestion_endpoint"] = None
        super(DataCollectionEndpoint, __self__).__init__(
            'azure:monitoring/dataCollectionEndpoint:DataCollectionEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configuration_access_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            immutable_id: Optional[pulumi.Input[_builtins.str]] = None,
            kind: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            logs_ingestion_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
            metrics_ingestion_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            public_network_access_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'DataCollectionEndpoint':
        """
        Get an existing DataCollectionEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] configuration_access_endpoint: The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
        :param pulumi.Input[_builtins.str] description: Specifies a description for the Data Collection Endpoint.
        :param pulumi.Input[_builtins.str] immutable_id: The immutable ID of the Data Collection Endpoint.
        :param pulumi.Input[_builtins.str] kind: The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
        :param pulumi.Input[_builtins.str] location: The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[_builtins.str] logs_ingestion_endpoint: The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
        :param pulumi.Input[_builtins.str] metrics_ingestion_endpoint: The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[_builtins.bool] public_network_access_enabled: Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Data Collection Endpoint.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataCollectionEndpointState.__new__(_DataCollectionEndpointState)

        __props__.__dict__["configuration_access_endpoint"] = configuration_access_endpoint
        __props__.__dict__["description"] = description
        __props__.__dict__["immutable_id"] = immutable_id
        __props__.__dict__["kind"] = kind
        __props__.__dict__["location"] = location
        __props__.__dict__["logs_ingestion_endpoint"] = logs_ingestion_endpoint
        __props__.__dict__["metrics_ingestion_endpoint"] = metrics_ingestion_endpoint
        __props__.__dict__["name"] = name
        __props__.__dict__["public_network_access_enabled"] = public_network_access_enabled
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        return DataCollectionEndpoint(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="configurationAccessEndpoint")
    def configuration_access_endpoint(self) -> pulumi.Output[_builtins.str]:
        """
        The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
        """
        return pulumi.get(self, "configuration_access_endpoint")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies a description for the Data Collection Endpoint.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="immutableId")
    def immutable_id(self) -> pulumi.Output[_builtins.str]:
        """
        The immutable ID of the Data Collection Endpoint.
        """
        return pulumi.get(self, "immutable_id")

    @_builtins.property
    @pulumi.getter
    def kind(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
        """
        return pulumi.get(self, "kind")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter(name="logsIngestionEndpoint")
    def logs_ingestion_endpoint(self) -> pulumi.Output[_builtins.str]:
        """
        The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
        """
        return pulumi.get(self, "logs_ingestion_endpoint")

    @_builtins.property
    @pulumi.getter(name="metricsIngestionEndpoint")
    def metrics_ingestion_endpoint(self) -> pulumi.Output[_builtins.str]:
        """
        The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
        """
        return pulumi.get(self, "metrics_ingestion_endpoint")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="publicNetworkAccessEnabled")
    def public_network_access_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
        """
        return pulumi.get(self, "public_network_access_enabled")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags which should be assigned to the Data Collection Endpoint.
        """
        return pulumi.get(self, "tags")

