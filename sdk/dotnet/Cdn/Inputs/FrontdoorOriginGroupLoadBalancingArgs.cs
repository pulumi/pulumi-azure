// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Inputs
{

    public sealed class FrontdoorOriginGroupLoadBalancingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the additional latency in milliseconds for probes to fall into the lowest latency bucket. Possible values are between `0` and `1000` milliseconds (inclusive). Defaults to `50`.
        /// </summary>
        [Input("additionalLatencyInMilliseconds")]
        public Input<int>? AdditionalLatencyInMilliseconds { get; set; }

        /// <summary>
        /// Specifies the number of samples to consider for load balancing decisions. Possible values are between `0` and `255` (inclusive). Defaults to `4`.
        /// </summary>
        [Input("sampleSize")]
        public Input<int>? SampleSize { get; set; }

        /// <summary>
        /// Specifies the number of samples within the sample period that must succeed. Possible values are between `0` and `255` (inclusive). Defaults to `3`.
        /// </summary>
        [Input("successfulSamplesRequired")]
        public Input<int>? SuccessfulSamplesRequired { get; set; }

        public FrontdoorOriginGroupLoadBalancingArgs()
        {
        }
        public static new FrontdoorOriginGroupLoadBalancingArgs Empty => new FrontdoorOriginGroupLoadBalancingArgs();
    }
}
