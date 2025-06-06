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
    public sealed class GetDataCollectionRuleDestinationResult
    {
        /// <summary>
        /// A `azure_monitor_metrics` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataCollectionRuleDestinationAzureMonitorMetricResult> AzureMonitorMetrics;
        /// <summary>
        /// One or more `event_hub` blocks as defined below.
        /// </summary>
        public readonly Outputs.GetDataCollectionRuleDestinationEventHubResult? EventHub;
        /// <summary>
        /// One or more `event_hub_direct` blocks as defined below.
        /// </summary>
        public readonly Outputs.GetDataCollectionRuleDestinationEventHubDirectResult? EventHubDirect;
        /// <summary>
        /// One or more `log_analytics` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataCollectionRuleDestinationLogAnalyticResult> LogAnalytics;
        /// <summary>
        /// One or more `monitor_account` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataCollectionRuleDestinationMonitorAccountResult> MonitorAccounts;
        /// <summary>
        /// One or more `storage_blob_direct` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataCollectionRuleDestinationStorageBlobDirectResult> StorageBlobDirects;
        /// <summary>
        /// One or more `storage_blob` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataCollectionRuleDestinationStorageBlobResult> StorageBlobs;
        /// <summary>
        /// One or more `storage_table_direct` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataCollectionRuleDestinationStorageTableDirectResult> StorageTableDirects;

        [OutputConstructor]
        private GetDataCollectionRuleDestinationResult(
            ImmutableArray<Outputs.GetDataCollectionRuleDestinationAzureMonitorMetricResult> azureMonitorMetrics,

            Outputs.GetDataCollectionRuleDestinationEventHubResult? eventHub,

            Outputs.GetDataCollectionRuleDestinationEventHubDirectResult? eventHubDirect,

            ImmutableArray<Outputs.GetDataCollectionRuleDestinationLogAnalyticResult> logAnalytics,

            ImmutableArray<Outputs.GetDataCollectionRuleDestinationMonitorAccountResult> monitorAccounts,

            ImmutableArray<Outputs.GetDataCollectionRuleDestinationStorageBlobDirectResult> storageBlobDirects,

            ImmutableArray<Outputs.GetDataCollectionRuleDestinationStorageBlobResult> storageBlobs,

            ImmutableArray<Outputs.GetDataCollectionRuleDestinationStorageTableDirectResult> storageTableDirects)
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
