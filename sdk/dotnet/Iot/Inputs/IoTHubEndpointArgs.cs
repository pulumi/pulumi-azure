// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Iot.Inputs
{

    public sealed class IoTHubEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type used to authenticate against the endpoint. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
        /// </summary>
        [Input("authenticationType")]
        public Input<string>? AuthenticationType { get; set; }

        /// <summary>
        /// Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds. This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`.
        /// </summary>
        [Input("batchFrequencyInSeconds")]
        public Input<int>? BatchFrequencyInSeconds { get; set; }

        [Input("connectionString")]
        private Input<string>? _connectionString;

        /// <summary>
        /// The connection string for the endpoint. This attribute is mandatory and can only be specified when `authentication_type` is `keyBased`.
        /// </summary>
        public Input<string>? ConnectionString
        {
            get => _connectionString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _connectionString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of storage container in the storage account. This attribute is mandatory for endpoint type `AzureIotHub.StorageContainer`.
        /// </summary>
        [Input("containerName")]
        public Input<string>? ContainerName { get; set; }

        /// <summary>
        /// Encoding that is used to serialize messages to blobs. Supported values are `Avro`, `AvroDeflate` and `JSON`. Default value is `Avro`. This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        /// <summary>
        /// URI of the Service Bus or Event Hubs Namespace endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased` for endpoint type `AzureIotHub.ServiceBusQueue`, `AzureIotHub.ServiceBusTopic` or `AzureIotHub.EventHub`.
        /// </summary>
        [Input("endpointUri")]
        public Input<string>? EndpointUri { get; set; }

        /// <summary>
        /// Name of the Service Bus Queue/Topic or Event Hub. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased` for endpoint type `AzureIotHub.ServiceBusQueue`, `AzureIotHub.ServiceBusTopic` or `AzureIotHub.EventHub`.
        /// </summary>
        [Input("entityPath")]
        public Input<string>? EntityPath { get; set; }

        /// <summary>
        /// File name format for the blob. All parameters are mandatory but can be reordered. This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`. Defaults to `{iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}`.
        /// </summary>
        [Input("fileNameFormat")]
        public Input<string>? FileNameFormat { get; set; }

        /// <summary>
        /// The ID of the User Managed Identity used to authenticate against the endpoint.
        /// 
        /// &gt; **Note:** `identity_id` can only be specified when `authentication_type` is `identityBased`. It must be one of the `identity_ids` of the IoT Hub. If `identity_id` is omitted when `authentication_type` is `identityBased`, then the System-Assigned Managed Identity of the IoT Hub will be used.
        /// 
        /// &gt; **Note:** An IoT Hub can only be updated to use the System-Assigned Managed Identity for `endpoint` since it is not possible to grant access to the endpoint until after creation. The extracted resources `azurerm_iothub_endpoint_*` can be used to configure Endpoints with the IoT Hub's System-Assigned Managed Identity without the need for an update.
        /// </summary>
        [Input("identityId")]
        public Input<string>? IdentityId { get; set; }

        /// <summary>
        /// Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB). This attribute is applicable for endpoint type `AzureIotHub.StorageContainer`.
        /// </summary>
        [Input("maxChunkSizeInBytes")]
        public Input<int>? MaxChunkSizeInBytes { get; set; }

        /// <summary>
        /// The name of the endpoint. The name must be unique across endpoint types. The following names are reserved: `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The resource group in which the endpoint will be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The type of the endpoint. Possible values are `AzureIotHub.StorageContainer`, `AzureIotHub.ServiceBusQueue`, `AzureIotHub.ServiceBusTopic` or `AzureIotHub.EventHub`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public IoTHubEndpointArgs()
        {
        }
        public static new IoTHubEndpointArgs Empty => new IoTHubEndpointArgs();
    }
}
