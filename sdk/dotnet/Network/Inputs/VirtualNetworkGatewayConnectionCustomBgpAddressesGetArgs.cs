// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class VirtualNetworkGatewayConnectionCustomBgpAddressesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (first one)
        /// </summary>
        [Input("primary", required: true)]
        public Input<string> Primary { get; set; } = null!;

        /// <summary>
        /// single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (second one)
        /// </summary>
        [Input("secondary")]
        public Input<string>? Secondary { get; set; }

        public VirtualNetworkGatewayConnectionCustomBgpAddressesGetArgs()
        {
        }
        public static new VirtualNetworkGatewayConnectionCustomBgpAddressesGetArgs Empty => new VirtualNetworkGatewayConnectionCustomBgpAddressesGetArgs();
    }
}
