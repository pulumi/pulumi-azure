// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Iot.Outputs
{

    [OutputType]
    public sealed class IoTHubFileUpload
    {
        /// <summary>
        /// The type used to authenticate against the storage account. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
        /// </summary>
        public readonly string? AuthenticationType;
        /// <summary>
        /// The connection string for the Azure Storage account to which files are uploaded.
        /// </summary>
        public readonly string ConnectionString;
        /// <summary>
        /// The name of the root container where the files should be uploaded to. The container need not exist but should be creatable using the connection_string specified.
        /// </summary>
        public readonly string ContainerName;
        /// <summary>
        /// The period of time for which a file upload notification message is available to consume before it expires, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
        /// </summary>
        public readonly string? DefaultTtl;
        /// <summary>
        /// The ID of the User Managed Identity used to authenticate against the storage account.
        /// 
        /// &gt; **Note:** `identity_id` can only be specified when `authentication_type` is `identityBased`. It must be one of the `identity_ids` of the IoT Hub. If `identity_id` is omitted when `authentication_type` is `identityBased`, then the System-Assigned Managed Identity of the IoT Hub will be used.
        /// 
        /// &gt; **Note:** An IoT Hub can only be updated to use the System-Assigned Managed Identity for `file_upload` since it is not possible to grant access to the endpoint until after creation.
        /// </summary>
        public readonly string? IdentityId;
        /// <summary>
        /// The lock duration for the file upload notifications queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT1M`.
        /// </summary>
        public readonly string? LockDuration;
        /// <summary>
        /// The number of times the IoT Hub attempts to deliver a file upload notification message. Defaults to `10`.
        /// </summary>
        public readonly int? MaxDeliveryCount;
        /// <summary>
        /// Used to specify whether file notifications are sent to IoT Hub on upload. Defaults to `false`.
        /// </summary>
        public readonly bool? Notifications;
        /// <summary>
        /// The period of time for which the SAS URI generated by IoT Hub for file upload is valid, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 24 hours. Defaults to `PT1H`.
        /// </summary>
        public readonly string? SasTtl;

        [OutputConstructor]
        private IoTHubFileUpload(
            string? authenticationType,

            string connectionString,

            string containerName,

            string? defaultTtl,

            string? identityId,

            string? lockDuration,

            int? maxDeliveryCount,

            bool? notifications,

            string? sasTtl)
        {
            AuthenticationType = authenticationType;
            ConnectionString = connectionString;
            ContainerName = containerName;
            DefaultTtl = defaultTtl;
            IdentityId = identityId;
            LockDuration = lockDuration;
            MaxDeliveryCount = maxDeliveryCount;
            Notifications = notifications;
            SasTtl = sasTtl;
        }
    }
}
