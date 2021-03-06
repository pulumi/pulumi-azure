# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EndpointStorageContainerArgs', 'EndpointStorageContainer']

@pulumi.input_type
class EndpointStorageContainerArgs:
    def __init__(__self__, *,
                 connection_string: pulumi.Input[str],
                 container_name: pulumi.Input[str],
                 iothub_name: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str],
                 batch_frequency_in_seconds: Optional[pulumi.Input[int]] = None,
                 encoding: Optional[pulumi.Input[str]] = None,
                 file_name_format: Optional[pulumi.Input[str]] = None,
                 max_chunk_size_in_bytes: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EndpointStorageContainer resource.
        :param pulumi.Input[str] connection_string: The connection string for the endpoint.
        :param pulumi.Input[str] container_name: The name of storage container in the storage account.
               *
        :param pulumi.Input[str] iothub_name: The name of the IoTHub to which this Storage Container Endpoint belongs. Changing this forces a new resource to be created.
        :param pulumi.Input[str] resource_group_name: The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
        :param pulumi.Input[int] batch_frequency_in_seconds: Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
        :param pulumi.Input[str] encoding: Encoding that is used to serialize messages to blobs. Supported values are 'avro' and 'avrodeflate'. Default value is 'avro'.
        :param pulumi.Input[str] file_name_format: File name format for the blob. Default format is ``{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}``. All parameters are mandatory but can be reordered.
        :param pulumi.Input[int] max_chunk_size_in_bytes: Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
        :param pulumi.Input[str] name: The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
        """
        pulumi.set(__self__, "connection_string", connection_string)
        pulumi.set(__self__, "container_name", container_name)
        pulumi.set(__self__, "iothub_name", iothub_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if batch_frequency_in_seconds is not None:
            pulumi.set(__self__, "batch_frequency_in_seconds", batch_frequency_in_seconds)
        if encoding is not None:
            pulumi.set(__self__, "encoding", encoding)
        if file_name_format is not None:
            pulumi.set(__self__, "file_name_format", file_name_format)
        if max_chunk_size_in_bytes is not None:
            pulumi.set(__self__, "max_chunk_size_in_bytes", max_chunk_size_in_bytes)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> pulumi.Input[str]:
        """
        The connection string for the endpoint.
        """
        return pulumi.get(self, "connection_string")

    @connection_string.setter
    def connection_string(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_string", value)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> pulumi.Input[str]:
        """
        The name of storage container in the storage account.
        *
        """
        return pulumi.get(self, "container_name")

    @container_name.setter
    def container_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "container_name", value)

    @property
    @pulumi.getter(name="iothubName")
    def iothub_name(self) -> pulumi.Input[str]:
        """
        The name of the IoTHub to which this Storage Container Endpoint belongs. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iothub_name")

    @iothub_name.setter
    def iothub_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "iothub_name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="batchFrequencyInSeconds")
    def batch_frequency_in_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
        """
        return pulumi.get(self, "batch_frequency_in_seconds")

    @batch_frequency_in_seconds.setter
    def batch_frequency_in_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "batch_frequency_in_seconds", value)

    @property
    @pulumi.getter
    def encoding(self) -> Optional[pulumi.Input[str]]:
        """
        Encoding that is used to serialize messages to blobs. Supported values are 'avro' and 'avrodeflate'. Default value is 'avro'.
        """
        return pulumi.get(self, "encoding")

    @encoding.setter
    def encoding(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encoding", value)

    @property
    @pulumi.getter(name="fileNameFormat")
    def file_name_format(self) -> Optional[pulumi.Input[str]]:
        """
        File name format for the blob. Default format is ``{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}``. All parameters are mandatory but can be reordered.
        """
        return pulumi.get(self, "file_name_format")

    @file_name_format.setter
    def file_name_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_name_format", value)

    @property
    @pulumi.getter(name="maxChunkSizeInBytes")
    def max_chunk_size_in_bytes(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
        """
        return pulumi.get(self, "max_chunk_size_in_bytes")

    @max_chunk_size_in_bytes.setter
    def max_chunk_size_in_bytes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_chunk_size_in_bytes", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _EndpointStorageContainerState:
    def __init__(__self__, *,
                 batch_frequency_in_seconds: Optional[pulumi.Input[int]] = None,
                 connection_string: Optional[pulumi.Input[str]] = None,
                 container_name: Optional[pulumi.Input[str]] = None,
                 encoding: Optional[pulumi.Input[str]] = None,
                 file_name_format: Optional[pulumi.Input[str]] = None,
                 iothub_name: Optional[pulumi.Input[str]] = None,
                 max_chunk_size_in_bytes: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EndpointStorageContainer resources.
        :param pulumi.Input[int] batch_frequency_in_seconds: Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
        :param pulumi.Input[str] connection_string: The connection string for the endpoint.
        :param pulumi.Input[str] container_name: The name of storage container in the storage account.
               *
        :param pulumi.Input[str] encoding: Encoding that is used to serialize messages to blobs. Supported values are 'avro' and 'avrodeflate'. Default value is 'avro'.
        :param pulumi.Input[str] file_name_format: File name format for the blob. Default format is ``{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}``. All parameters are mandatory but can be reordered.
        :param pulumi.Input[str] iothub_name: The name of the IoTHub to which this Storage Container Endpoint belongs. Changing this forces a new resource to be created.
        :param pulumi.Input[int] max_chunk_size_in_bytes: Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
        :param pulumi.Input[str] name: The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
        :param pulumi.Input[str] resource_group_name: The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
        """
        if batch_frequency_in_seconds is not None:
            pulumi.set(__self__, "batch_frequency_in_seconds", batch_frequency_in_seconds)
        if connection_string is not None:
            pulumi.set(__self__, "connection_string", connection_string)
        if container_name is not None:
            pulumi.set(__self__, "container_name", container_name)
        if encoding is not None:
            pulumi.set(__self__, "encoding", encoding)
        if file_name_format is not None:
            pulumi.set(__self__, "file_name_format", file_name_format)
        if iothub_name is not None:
            pulumi.set(__self__, "iothub_name", iothub_name)
        if max_chunk_size_in_bytes is not None:
            pulumi.set(__self__, "max_chunk_size_in_bytes", max_chunk_size_in_bytes)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)

    @property
    @pulumi.getter(name="batchFrequencyInSeconds")
    def batch_frequency_in_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
        """
        return pulumi.get(self, "batch_frequency_in_seconds")

    @batch_frequency_in_seconds.setter
    def batch_frequency_in_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "batch_frequency_in_seconds", value)

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> Optional[pulumi.Input[str]]:
        """
        The connection string for the endpoint.
        """
        return pulumi.get(self, "connection_string")

    @connection_string.setter
    def connection_string(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_string", value)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of storage container in the storage account.
        *
        """
        return pulumi.get(self, "container_name")

    @container_name.setter
    def container_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "container_name", value)

    @property
    @pulumi.getter
    def encoding(self) -> Optional[pulumi.Input[str]]:
        """
        Encoding that is used to serialize messages to blobs. Supported values are 'avro' and 'avrodeflate'. Default value is 'avro'.
        """
        return pulumi.get(self, "encoding")

    @encoding.setter
    def encoding(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encoding", value)

    @property
    @pulumi.getter(name="fileNameFormat")
    def file_name_format(self) -> Optional[pulumi.Input[str]]:
        """
        File name format for the blob. Default format is ``{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}``. All parameters are mandatory but can be reordered.
        """
        return pulumi.get(self, "file_name_format")

    @file_name_format.setter
    def file_name_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_name_format", value)

    @property
    @pulumi.getter(name="iothubName")
    def iothub_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the IoTHub to which this Storage Container Endpoint belongs. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iothub_name")

    @iothub_name.setter
    def iothub_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "iothub_name", value)

    @property
    @pulumi.getter(name="maxChunkSizeInBytes")
    def max_chunk_size_in_bytes(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
        """
        return pulumi.get(self, "max_chunk_size_in_bytes")

    @max_chunk_size_in_bytes.setter
    def max_chunk_size_in_bytes(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_chunk_size_in_bytes", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)


class EndpointStorageContainer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 batch_frequency_in_seconds: Optional[pulumi.Input[int]] = None,
                 connection_string: Optional[pulumi.Input[str]] = None,
                 container_name: Optional[pulumi.Input[str]] = None,
                 encoding: Optional[pulumi.Input[str]] = None,
                 file_name_format: Optional[pulumi.Input[str]] = None,
                 iothub_name: Optional[pulumi.Input[str]] = None,
                 max_chunk_size_in_bytes: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an IotHub Storage Container Endpoint

        > **NOTE:** Endpoints can be defined either directly on the `iot.IoTHub` resource, or using the `azurerm_iothub_endpoint_*` resources - but the two ways of defining the endpoints cannot be used together. If both are used against the same IoTHub, spurious changes will occur. Also, defining a `azurerm_iothub_endpoint_*` resource and another endpoint of a different type directly on the `iot.IoTHub` resource is not supported.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_container = azure.storage.Container("exampleContainer",
            storage_account_name=example_account.name,
            container_access_type="private")
        example_io_t_hub = azure.iot.IoTHub("exampleIoTHub",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            sku=azure.iot.IoTHubSkuArgs(
                name="S1",
                capacity=1,
            ))
        example_endpoint_storage_container = azure.iot.EndpointStorageContainer("exampleEndpointStorageContainer",
            resource_group_name=example_resource_group.name,
            iothub_name=example_io_t_hub.name,
            container_name="acctestcont",
            connection_string=example_account.primary_blob_connection_string,
            file_name_format="{iothub}/{partition}_{YYYY}_{MM}_{DD}_{HH}_{mm}",
            batch_frequency_in_seconds=60,
            max_chunk_size_in_bytes=10485760,
            encoding="JSON")
        ```

        ## Import

        IoTHub Storage Container Endpoint can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:iot/endpointStorageContainer:EndpointStorageContainer storage_container1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/IotHubs/hub1/Endpoints/storage_container_endpoint1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] batch_frequency_in_seconds: Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
        :param pulumi.Input[str] connection_string: The connection string for the endpoint.
        :param pulumi.Input[str] container_name: The name of storage container in the storage account.
               *
        :param pulumi.Input[str] encoding: Encoding that is used to serialize messages to blobs. Supported values are 'avro' and 'avrodeflate'. Default value is 'avro'.
        :param pulumi.Input[str] file_name_format: File name format for the blob. Default format is ``{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}``. All parameters are mandatory but can be reordered.
        :param pulumi.Input[str] iothub_name: The name of the IoTHub to which this Storage Container Endpoint belongs. Changing this forces a new resource to be created.
        :param pulumi.Input[int] max_chunk_size_in_bytes: Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
        :param pulumi.Input[str] name: The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
        :param pulumi.Input[str] resource_group_name: The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EndpointStorageContainerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an IotHub Storage Container Endpoint

        > **NOTE:** Endpoints can be defined either directly on the `iot.IoTHub` resource, or using the `azurerm_iothub_endpoint_*` resources - but the two ways of defining the endpoints cannot be used together. If both are used against the same IoTHub, spurious changes will occur. Also, defining a `azurerm_iothub_endpoint_*` resource and another endpoint of a different type directly on the `iot.IoTHub` resource is not supported.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_container = azure.storage.Container("exampleContainer",
            storage_account_name=example_account.name,
            container_access_type="private")
        example_io_t_hub = azure.iot.IoTHub("exampleIoTHub",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            sku=azure.iot.IoTHubSkuArgs(
                name="S1",
                capacity=1,
            ))
        example_endpoint_storage_container = azure.iot.EndpointStorageContainer("exampleEndpointStorageContainer",
            resource_group_name=example_resource_group.name,
            iothub_name=example_io_t_hub.name,
            container_name="acctestcont",
            connection_string=example_account.primary_blob_connection_string,
            file_name_format="{iothub}/{partition}_{YYYY}_{MM}_{DD}_{HH}_{mm}",
            batch_frequency_in_seconds=60,
            max_chunk_size_in_bytes=10485760,
            encoding="JSON")
        ```

        ## Import

        IoTHub Storage Container Endpoint can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:iot/endpointStorageContainer:EndpointStorageContainer storage_container1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/IotHubs/hub1/Endpoints/storage_container_endpoint1
        ```

        :param str resource_name: The name of the resource.
        :param EndpointStorageContainerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EndpointStorageContainerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 batch_frequency_in_seconds: Optional[pulumi.Input[int]] = None,
                 connection_string: Optional[pulumi.Input[str]] = None,
                 container_name: Optional[pulumi.Input[str]] = None,
                 encoding: Optional[pulumi.Input[str]] = None,
                 file_name_format: Optional[pulumi.Input[str]] = None,
                 iothub_name: Optional[pulumi.Input[str]] = None,
                 max_chunk_size_in_bytes: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
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
            __props__ = EndpointStorageContainerArgs.__new__(EndpointStorageContainerArgs)

            __props__.__dict__["batch_frequency_in_seconds"] = batch_frequency_in_seconds
            if connection_string is None and not opts.urn:
                raise TypeError("Missing required property 'connection_string'")
            __props__.__dict__["connection_string"] = connection_string
            if container_name is None and not opts.urn:
                raise TypeError("Missing required property 'container_name'")
            __props__.__dict__["container_name"] = container_name
            __props__.__dict__["encoding"] = encoding
            __props__.__dict__["file_name_format"] = file_name_format
            if iothub_name is None and not opts.urn:
                raise TypeError("Missing required property 'iothub_name'")
            __props__.__dict__["iothub_name"] = iothub_name
            __props__.__dict__["max_chunk_size_in_bytes"] = max_chunk_size_in_bytes
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
        super(EndpointStorageContainer, __self__).__init__(
            'azure:iot/endpointStorageContainer:EndpointStorageContainer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            batch_frequency_in_seconds: Optional[pulumi.Input[int]] = None,
            connection_string: Optional[pulumi.Input[str]] = None,
            container_name: Optional[pulumi.Input[str]] = None,
            encoding: Optional[pulumi.Input[str]] = None,
            file_name_format: Optional[pulumi.Input[str]] = None,
            iothub_name: Optional[pulumi.Input[str]] = None,
            max_chunk_size_in_bytes: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None) -> 'EndpointStorageContainer':
        """
        Get an existing EndpointStorageContainer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] batch_frequency_in_seconds: Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
        :param pulumi.Input[str] connection_string: The connection string for the endpoint.
        :param pulumi.Input[str] container_name: The name of storage container in the storage account.
               *
        :param pulumi.Input[str] encoding: Encoding that is used to serialize messages to blobs. Supported values are 'avro' and 'avrodeflate'. Default value is 'avro'.
        :param pulumi.Input[str] file_name_format: File name format for the blob. Default format is ``{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}``. All parameters are mandatory but can be reordered.
        :param pulumi.Input[str] iothub_name: The name of the IoTHub to which this Storage Container Endpoint belongs. Changing this forces a new resource to be created.
        :param pulumi.Input[int] max_chunk_size_in_bytes: Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
        :param pulumi.Input[str] name: The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
        :param pulumi.Input[str] resource_group_name: The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EndpointStorageContainerState.__new__(_EndpointStorageContainerState)

        __props__.__dict__["batch_frequency_in_seconds"] = batch_frequency_in_seconds
        __props__.__dict__["connection_string"] = connection_string
        __props__.__dict__["container_name"] = container_name
        __props__.__dict__["encoding"] = encoding
        __props__.__dict__["file_name_format"] = file_name_format
        __props__.__dict__["iothub_name"] = iothub_name
        __props__.__dict__["max_chunk_size_in_bytes"] = max_chunk_size_in_bytes
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        return EndpointStorageContainer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="batchFrequencyInSeconds")
    def batch_frequency_in_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
        """
        return pulumi.get(self, "batch_frequency_in_seconds")

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> pulumi.Output[str]:
        """
        The connection string for the endpoint.
        """
        return pulumi.get(self, "connection_string")

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> pulumi.Output[str]:
        """
        The name of storage container in the storage account.
        *
        """
        return pulumi.get(self, "container_name")

    @property
    @pulumi.getter
    def encoding(self) -> pulumi.Output[Optional[str]]:
        """
        Encoding that is used to serialize messages to blobs. Supported values are 'avro' and 'avrodeflate'. Default value is 'avro'.
        """
        return pulumi.get(self, "encoding")

    @property
    @pulumi.getter(name="fileNameFormat")
    def file_name_format(self) -> pulumi.Output[Optional[str]]:
        """
        File name format for the blob. Default format is ``{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}``. All parameters are mandatory but can be reordered.
        """
        return pulumi.get(self, "file_name_format")

    @property
    @pulumi.getter(name="iothubName")
    def iothub_name(self) -> pulumi.Output[str]:
        """
        The name of the IoTHub to which this Storage Container Endpoint belongs. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "iothub_name")

    @property
    @pulumi.getter(name="maxChunkSizeInBytes")
    def max_chunk_size_in_bytes(self) -> pulumi.Output[Optional[int]]:
        """
        Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
        """
        return pulumi.get(self, "max_chunk_size_in_bytes")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

