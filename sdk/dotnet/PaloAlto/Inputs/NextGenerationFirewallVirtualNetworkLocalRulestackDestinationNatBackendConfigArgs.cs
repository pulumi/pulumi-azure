// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto.Inputs
{

    public sealed class NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatBackendConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port number to send traffic to.
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        /// <summary>
        /// The IP Address to send the traffic to.
        /// </summary>
        [Input("publicIpAddress", required: true)]
        public Input<string> PublicIpAddress { get; set; } = null!;

        public NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatBackendConfigArgs()
        {
        }
        public static new NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatBackendConfigArgs Empty => new NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatBackendConfigArgs();
    }
}
