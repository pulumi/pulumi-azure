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
    public sealed class ActionGroupEventHubReceiver
    {
        /// <summary>
        /// The name of the specific Event Hub queue.
        /// </summary>
        public readonly string EventHubName;
        /// <summary>
        /// The namespace name of the Event Hub.
        /// </summary>
        public readonly string EventHubNamespace;
        /// <summary>
        /// The name of the EventHub Receiver, must be unique within action group.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ID for the subscription containing this Event Hub. Default to the subscription ID of the Action Group.
        /// </summary>
        public readonly string? SubscriptionId;
        /// <summary>
        /// The Tenant ID for the subscription containing this Event Hub.
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// Indicates whether to use common alert schema.
        /// </summary>
        public readonly bool? UseCommonAlertSchema;

        [OutputConstructor]
        private ActionGroupEventHubReceiver(
            string eventHubName,

            string eventHubNamespace,

            string name,

            string? subscriptionId,

            string? tenantId,

            bool? useCommonAlertSchema)
        {
            EventHubName = eventHubName;
            EventHubNamespace = eventHubNamespace;
            Name = name;
            SubscriptionId = subscriptionId;
            TenantId = tenantId;
            UseCommonAlertSchema = useCommonAlertSchema;
        }
    }
}
