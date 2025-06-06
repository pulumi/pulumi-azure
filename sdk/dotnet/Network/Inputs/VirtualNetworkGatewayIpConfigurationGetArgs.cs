// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class VirtualNetworkGatewayIpConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A user-defined name of the IP configuration. Defaults to `vnetGatewayConfig`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Defines how the private IP address of the gateways virtual interface is assigned. The only valid value is `Dynamic` for Virtual Network Gateway (`Static` is not supported by the service yet). Defaults to `Dynamic`.
        /// </summary>
        [Input("privateIpAddressAllocation")]
        public Input<string>? PrivateIpAddressAllocation { get; set; }

        /// <summary>
        /// The ID of the public IP address to associate with the Virtual Network Gateway.
        /// </summary>
        [Input("publicIpAddressId", required: true)]
        public Input<string> PublicIpAddressId { get; set; } = null!;

        /// <summary>
        /// The ID of the gateway subnet of a virtual network in which the virtual network gateway will be created. It is mandatory that the associated subnet is named `GatewaySubnet`. Therefore, each virtual network can contain at most a single Virtual Network Gateway.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        public VirtualNetworkGatewayIpConfigurationGetArgs()
        {
        }
        public static new VirtualNetworkGatewayIpConfigurationGetArgs Empty => new VirtualNetworkGatewayIpConfigurationGetArgs();
    }
}
