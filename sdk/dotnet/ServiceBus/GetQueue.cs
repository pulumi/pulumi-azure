// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ServiceBus
{
    public static class GetQueue
    {
        /// <summary>
        /// Use this data source to access information about an existing Service Bus Queue.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.ServiceBus.GetQueue.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         NamespaceId = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getQueueResult =&gt; getQueueResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.ServiceBus`: 2022-10-01-preview, 2021-06-01-preview
        /// </summary>
        public static Task<GetQueueResult> InvokeAsync(GetQueueArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetQueueResult>("azure:servicebus/getQueue:getQueue", args ?? new GetQueueArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Service Bus Queue.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.ServiceBus.GetQueue.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         NamespaceId = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getQueueResult =&gt; getQueueResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.ServiceBus`: 2022-10-01-preview, 2021-06-01-preview
        /// </summary>
        public static Output<GetQueueResult> Invoke(GetQueueInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetQueueResult>("azure:servicebus/getQueue:getQueue", args ?? new GetQueueInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Service Bus Queue.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.ServiceBus.GetQueue.Invoke(new()
        ///     {
        ///         Name = "existing",
        ///         NamespaceId = "existing",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = example.Apply(getQueueResult =&gt; getQueueResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.ServiceBus`: 2022-10-01-preview, 2021-06-01-preview
        /// </summary>
        public static Output<GetQueueResult> Invoke(GetQueueInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetQueueResult>("azure:servicebus/getQueue:getQueue", args ?? new GetQueueInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetQueueArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this Service Bus Queue.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The ID of the ServiceBus Namespace where the Service Bus Queue exists.
        /// </summary>
        [Input("namespaceId")]
        public string? NamespaceId { get; set; }

        [Input("namespaceName")]
        public string? NamespaceName { get; set; }

        [Input("resourceGroupName")]
        public string? ResourceGroupName { get; set; }

        public GetQueueArgs()
        {
        }
        public static new GetQueueArgs Empty => new GetQueueArgs();
    }

    public sealed class GetQueueInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of this Service Bus Queue.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The ID of the ServiceBus Namespace where the Service Bus Queue exists.
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        [Input("namespaceName")]
        public Input<string>? NamespaceName { get; set; }

        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public GetQueueInvokeArgs()
        {
        }
        public static new GetQueueInvokeArgs Empty => new GetQueueInvokeArgs();
    }


    [OutputType]
    public sealed class GetQueueResult
    {
        /// <summary>
        /// The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
        /// </summary>
        public readonly string AutoDeleteOnIdle;
        /// <summary>
        /// Boolean flag which controls whether server-side batched operations are enabled.
        /// </summary>
        public readonly bool BatchedOperationsEnabled;
        /// <summary>
        /// Boolean flag which controls whether the Queue has dead letter support when a message expires.
        /// </summary>
        public readonly bool DeadLetteringOnMessageExpiration;
        /// <summary>
        /// The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on a message itself.
        /// </summary>
        public readonly string DefaultMessageTtl;
        /// <summary>
        /// The ISO 8601 timespan duration during which duplicates can be detected.
        /// </summary>
        public readonly string DuplicateDetectionHistoryTimeWindow;
        public readonly bool EnableBatchedOperations;
        public readonly bool EnableExpress;
        public readonly bool EnablePartitioning;
        /// <summary>
        /// Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
        /// </summary>
        public readonly bool ExpressEnabled;
        /// <summary>
        /// The name of a Queue or Topic to automatically forward dead lettered messages to.
        /// </summary>
        public readonly string ForwardDeadLetteredMessagesTo;
        /// <summary>
        /// The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
        /// </summary>
        public readonly string ForwardTo;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers.
        /// </summary>
        public readonly string LockDuration;
        /// <summary>
        /// Integer value which controls when a message is automatically dead lettered.
        /// </summary>
        public readonly int MaxDeliveryCount;
        /// <summary>
        /// Integer value which controls the size of memory allocated for the queue. For supported values see the "Queue or topic size" section of [Service Bus Quotas](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas).
        /// </summary>
        public readonly int MaxSizeInMegabytes;
        public readonly string Name;
        public readonly string? NamespaceId;
        public readonly string? NamespaceName;
        /// <summary>
        /// Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers.
        /// </summary>
        public readonly bool PartitioningEnabled;
        /// <summary>
        /// Boolean flag which controls whether the Queue requires duplicate detection.
        /// </summary>
        public readonly bool RequiresDuplicateDetection;
        /// <summary>
        /// Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages.
        /// </summary>
        public readonly bool RequiresSession;
        public readonly string? ResourceGroupName;
        /// <summary>
        /// The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetQueueResult(
            string autoDeleteOnIdle,

            bool batchedOperationsEnabled,

            bool deadLetteringOnMessageExpiration,

            string defaultMessageTtl,

            string duplicateDetectionHistoryTimeWindow,

            bool enableBatchedOperations,

            bool enableExpress,

            bool enablePartitioning,

            bool expressEnabled,

            string forwardDeadLetteredMessagesTo,

            string forwardTo,

            string id,

            string lockDuration,

            int maxDeliveryCount,

            int maxSizeInMegabytes,

            string name,

            string? namespaceId,

            string? namespaceName,

            bool partitioningEnabled,

            bool requiresDuplicateDetection,

            bool requiresSession,

            string? resourceGroupName,

            string status)
        {
            AutoDeleteOnIdle = autoDeleteOnIdle;
            BatchedOperationsEnabled = batchedOperationsEnabled;
            DeadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
            DefaultMessageTtl = defaultMessageTtl;
            DuplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            EnableBatchedOperations = enableBatchedOperations;
            EnableExpress = enableExpress;
            EnablePartitioning = enablePartitioning;
            ExpressEnabled = expressEnabled;
            ForwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
            ForwardTo = forwardTo;
            Id = id;
            LockDuration = lockDuration;
            MaxDeliveryCount = maxDeliveryCount;
            MaxSizeInMegabytes = maxSizeInMegabytes;
            Name = name;
            NamespaceId = namespaceId;
            NamespaceName = namespaceName;
            PartitioningEnabled = partitioningEnabled;
            RequiresDuplicateDetection = requiresDuplicateDetection;
            RequiresSession = requiresSession;
            ResourceGroupName = resourceGroupName;
            Status = status;
        }
    }
}
