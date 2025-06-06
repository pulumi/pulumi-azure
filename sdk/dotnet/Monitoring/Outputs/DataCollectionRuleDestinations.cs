// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Outputs
{

    [OutputType]
    public sealed class DataCollectionRuleDestinations
    {
        /// <summary>
        /// A `azure_monitor_metrics` block as defined above.
        /// </summary>
        public readonly Outputs.DataCollectionRuleDestinationsAzureMonitorMetrics? AzureMonitorMetrics;
        /// <summary>
        /// One or more `event_hub` blocks as defined below.
        /// </summary>
        public readonly Outputs.DataCollectionRuleDestinationsEventHub? EventHub;
        /// <summary>
        /// One or more `event_hub` blocks as defined below.
        /// </summary>
        public readonly Outputs.DataCollectionRuleDestinationsEventHubDirect? EventHubDirect;
        /// <summary>
        /// One or more `log_analytics` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.DataCollectionRuleDestinationsLogAnalytic> LogAnalytics;
        /// <summary>
        /// One or more `monitor_account` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.DataCollectionRuleDestinationsMonitorAccount> MonitorAccounts;
        /// <summary>
        /// One or more `storage_blob_direct` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.DataCollectionRuleDestinationsStorageBlobDirect> StorageBlobDirects;
        /// <summary>
        /// One or more `storage_blob` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.DataCollectionRuleDestinationsStorageBlob> StorageBlobs;
        /// <summary>
        /// One or more `storage_table_direct` blocks as defined below.
        /// 
        /// &gt; **Note:** `event_hub_direct`, `storage_blob_direct`, and `storage_table_direct` are only available for rules of kind `AgentDirectToStore`.
        /// 
        /// &gt; **Note:** At least one of `azure_monitor_metrics`, `event_hub`, `event_hub_direct`, `log_analytics`, `monitor_account`, `storage_blob`, `storage_blob_direct`,and `storage_table_direct` blocks must be specified.
        /// </summary>
        public readonly ImmutableArray<Outputs.DataCollectionRuleDestinationsStorageTableDirect> StorageTableDirects;

        [OutputConstructor]
        private DataCollectionRuleDestinations(
            Outputs.DataCollectionRuleDestinationsAzureMonitorMetrics? azureMonitorMetrics,

            Outputs.DataCollectionRuleDestinationsEventHub? eventHub,

            Outputs.DataCollectionRuleDestinationsEventHubDirect? eventHubDirect,

            ImmutableArray<Outputs.DataCollectionRuleDestinationsLogAnalytic> logAnalytics,

            ImmutableArray<Outputs.DataCollectionRuleDestinationsMonitorAccount> monitorAccounts,

            ImmutableArray<Outputs.DataCollectionRuleDestinationsStorageBlobDirect> storageBlobDirects,

            ImmutableArray<Outputs.DataCollectionRuleDestinationsStorageBlob> storageBlobs,

            ImmutableArray<Outputs.DataCollectionRuleDestinationsStorageTableDirect> storageTableDirects)
        {
            AzureMonitorMetrics = azureMonitorMetrics;
            EventHub = eventHub;
            EventHubDirect = eventHubDirect;
            LogAnalytics = logAnalytics;
            MonitorAccounts = monitorAccounts;
            StorageBlobDirects = storageBlobDirects;
            StorageBlobs = storageBlobs;
            StorageTableDirects = storageTableDirects;
        }
    }
}
