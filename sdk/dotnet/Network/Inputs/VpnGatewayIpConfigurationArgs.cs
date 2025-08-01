// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class VpnGatewayIpConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier of the IP configuration for the VPN Gateway.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The private IP address of this IP configuration.
        /// </summary>
        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        /// <summary>
        /// The public IP address of this IP configuration.
        /// </summary>
        [Input("publicIpAddress")]
        public Input<string>? PublicIpAddress { get; set; }

        public VpnGatewayIpConfigurationArgs()
        {
        }
        public static new VpnGatewayIpConfigurationArgs Empty => new VpnGatewayIpConfigurationArgs();
    }
}
