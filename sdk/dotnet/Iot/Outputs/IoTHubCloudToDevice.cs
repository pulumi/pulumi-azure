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
    public sealed class IoTHubCloudToDevice
    {
        /// <summary>
        /// The default time to live for cloud-to-device messages, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
        /// </summary>
        public readonly string? DefaultTtl;
        /// <summary>
        /// A `feedback` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.IoTHubCloudToDeviceFeedback> Feedbacks;
        /// <summary>
        /// The maximum delivery count for cloud-to-device per-device queues. This value must be between `1` and `100`. Defaults to `10`.
        /// </summary>
        public readonly int? MaxDeliveryCount;

        [OutputConstructor]
        private IoTHubCloudToDevice(
            string? defaultTtl,

            ImmutableArray<Outputs.IoTHubCloudToDeviceFeedback> feedbacks,

            int? maxDeliveryCount)
        {
            DefaultTtl = defaultTtl;
            Feedbacks = feedbacks;
            MaxDeliveryCount = maxDeliveryCount;
        }
    }
}
