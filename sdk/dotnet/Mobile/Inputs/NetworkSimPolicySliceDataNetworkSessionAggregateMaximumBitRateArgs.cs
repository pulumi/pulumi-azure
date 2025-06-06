// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Inputs
{

    public sealed class NetworkSimPolicySliceDataNetworkSessionAggregateMaximumBitRateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Downlink bit rate. Must be a number followed by `Kbps`, `Mbps`, `Gbps` or `Tbps`.
        /// </summary>
        [Input("downlink", required: true)]
        public Input<string> Downlink { get; set; } = null!;

        /// <summary>
        /// Uplink bit rate. Must be a number followed by `Kbps`, `Mbps`, `Gbps` or `Tbps`.
        /// </summary>
        [Input("uplink", required: true)]
        public Input<string> Uplink { get; set; } = null!;

        public NetworkSimPolicySliceDataNetworkSessionAggregateMaximumBitRateArgs()
        {
        }
        public static new NetworkSimPolicySliceDataNetworkSessionAggregateMaximumBitRateArgs Empty => new NetworkSimPolicySliceDataNetworkSessionAggregateMaximumBitRateArgs();
    }
}
