// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class VpnGatewayConnectionRoutingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Route Table associated with this VPN Connection.
        /// </summary>
        [Input("associatedRouteTable", required: true)]
        public Input<string> AssociatedRouteTable { get; set; } = null!;

        /// <summary>
        /// The resource ID of the Route Map associated with this Routing Configuration for inbound learned routes.
        /// </summary>
        [Input("inboundRouteMapId")]
        public Input<string>? InboundRouteMapId { get; set; }

        /// <summary>
        /// The resource ID of the Route Map associated with this Routing Configuration for outbound advertised routes.
        /// </summary>
        [Input("outboundRouteMapId")]
        public Input<string>? OutboundRouteMapId { get; set; }

        /// <summary>
        /// A `propagated_route_table` block as defined below.
        /// </summary>
        [Input("propagatedRouteTable")]
        public Input<Inputs.VpnGatewayConnectionRoutingPropagatedRouteTableArgs>? PropagatedRouteTable { get; set; }

        public VpnGatewayConnectionRoutingArgs()
        {
        }
        public static new VpnGatewayConnectionRoutingArgs Empty => new VpnGatewayConnectionRoutingArgs();
    }
}
