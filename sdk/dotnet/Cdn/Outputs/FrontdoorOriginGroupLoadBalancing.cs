// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Outputs
{

    [OutputType]
    public sealed class FrontdoorOriginGroupLoadBalancing
    {
        /// <summary>
        /// Specifies the additional latency in milliseconds for probes to fall into the lowest latency bucket. Possible values are between `0` and `1000` milliseconds (inclusive). Defaults to `50`.
        /// </summary>
        public readonly int? AdditionalLatencyInMilliseconds;
        /// <summary>
        /// Specifies the number of samples to consider for load balancing decisions. Possible values are between `0` and `255` (inclusive). Defaults to `4`.
        /// </summary>
        public readonly int? SampleSize;
        /// <summary>
        /// Specifies the number of samples within the sample period that must succeed. Possible values are between `0` and `255` (inclusive). Defaults to `3`.
        /// </summary>
        public readonly int? SuccessfulSamplesRequired;

        [OutputConstructor]
        private FrontdoorOriginGroupLoadBalancing(
            int? additionalLatencyInMilliseconds,

            int? sampleSize,

            int? successfulSamplesRequired)
        {
            AdditionalLatencyInMilliseconds = additionalLatencyInMilliseconds;
            SampleSize = sampleSize;
            SuccessfulSamplesRequired = successfulSamplesRequired;
        }
    }
}
