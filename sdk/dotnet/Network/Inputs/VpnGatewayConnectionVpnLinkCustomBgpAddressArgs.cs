// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class VpnGatewayConnectionVpnLinkCustomBgpAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The custom bgp ip address which belongs to the IP Configuration.
        /// </summary>
        [Input("ipAddress", required: true)]
        public Input<string> IpAddress { get; set; } = null!;

        /// <summary>
        /// The ID of the IP Configuration which belongs to the VPN Gateway.
        /// </summary>
        [Input("ipConfigurationId", required: true)]
        public Input<string> IpConfigurationId { get; set; } = null!;

        public VpnGatewayConnectionVpnLinkCustomBgpAddressArgs()
        {
        }
        public static new VpnGatewayConnectionVpnLinkCustomBgpAddressArgs Empty => new VpnGatewayConnectionVpnLinkCustomBgpAddressArgs();
    }
}
