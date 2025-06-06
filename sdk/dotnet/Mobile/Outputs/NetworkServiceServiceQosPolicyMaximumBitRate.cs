// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Outputs
{

    [OutputType]
    public sealed class NetworkServiceServiceQosPolicyMaximumBitRate
    {
        /// <summary>
        /// Downlink bit rate. Must be a number followed by `bps`, `Kbps`, `Mbps`, `Gbps` or `Tbps`.
        /// </summary>
        public readonly string Downlink;
        /// <summary>
        /// Uplink bit rate. Must be a number followed by `bps`, `Kbps`, `Mbps`, `Gbps` or `Tbps`.
        /// </summary>
        public readonly string Uplink;

        [OutputConstructor]
        private NetworkServiceServiceQosPolicyMaximumBitRate(
            string downlink,

            string uplink)
        {
            Downlink = downlink;
            Uplink = uplink;
        }
    }
}
