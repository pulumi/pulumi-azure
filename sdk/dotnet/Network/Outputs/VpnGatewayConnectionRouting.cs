// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class VpnGatewayConnectionRouting
    {
        /// <summary>
        /// The ID of the Route Table associated with this VPN Connection.
        /// </summary>
        public readonly string AssociatedRouteTable;
        /// <summary>
        /// The resource ID of the Route Map associated with this Routing Configuration for inbound learned routes.
        /// </summary>
        public readonly string? InboundRouteMapId;
        /// <summary>
        /// The resource ID of the Route Map associated with this Routing Configuration for outbound advertised routes.
        /// </summary>
        public readonly string? OutboundRouteMapId;
        /// <summary>
        /// A `propagated_route_table` block as defined below.
        /// </summary>
        public readonly Outputs.VpnGatewayConnectionRoutingPropagatedRouteTable? PropagatedRouteTable;

        [OutputConstructor]
        private VpnGatewayConnectionRouting(
            string associatedRouteTable,

            string? inboundRouteMapId,

            string? outboundRouteMapId,

            Outputs.VpnGatewayConnectionRoutingPropagatedRouteTable? propagatedRouteTable)
        {
            AssociatedRouteTable = associatedRouteTable;
            InboundRouteMapId = inboundRouteMapId;
            OutboundRouteMapId = outboundRouteMapId;
            PropagatedRouteTable = propagatedRouteTable;
        }
    }
}
