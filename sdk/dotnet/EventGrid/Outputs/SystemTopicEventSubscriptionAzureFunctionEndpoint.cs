// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.EventGrid.Outputs
{

    [OutputType]
    public sealed class SystemTopicEventSubscriptionAzureFunctionEndpoint
    {
        /// <summary>
        /// Specifies the ID of the Function where the Event Subscription will receive events. This must be the functions ID in format {function_app.id}/functions/{name}.
        /// </summary>
        public readonly string FunctionId;
        /// <summary>
        /// Maximum number of events per batch.
        /// </summary>
        public readonly int? MaxEventsPerBatch;
        /// <summary>
        /// Preferred batch size in Kilobytes.
        /// </summary>
        public readonly int? PreferredBatchSizeInKilobytes;

        [OutputConstructor]
        private SystemTopicEventSubscriptionAzureFunctionEndpoint(
            string functionId,

            int? maxEventsPerBatch,

            int? preferredBatchSizeInKilobytes)
        {
            FunctionId = functionId;
            MaxEventsPerBatch = maxEventsPerBatch;
            PreferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
        }
    }
}
