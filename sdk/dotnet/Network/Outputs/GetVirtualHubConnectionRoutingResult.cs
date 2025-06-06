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
    public sealed class GetVirtualHubConnectionRoutingResult
    {
        /// <summary>
        /// The ID of the route table associated with this Virtual Hub connection.
        /// </summary>
        public readonly string AssociatedRouteTableId;
        /// <summary>
        /// The ID of the Route Map associated with this Routing Configuration for inbound learned routes.
        /// </summary>
        public readonly string InboundRouteMapId;
        /// <summary>
        /// The ID of the Route Map associated with this Routing Configuration for outbound advertised routes.
        /// </summary>
        public readonly string OutboundRouteMapId;
        /// <summary>
        /// A `propagated_route_table` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVirtualHubConnectionRoutingPropagatedRouteTableResult> PropagatedRouteTables;
        /// <summary>
        /// The static VNet local route override criteria that is used to determine whether NVA in spoke VNet is bypassed for traffic with destination in spoke VNet.
        /// </summary>
        public readonly string StaticVnetLocalRouteOverrideCriteria;
        /// <summary>
        /// Whether the static routes should be propagated to the Virtual Hub or not.
        /// </summary>
        public readonly bool StaticVnetPropagateStaticRoutesEnabled;
        /// <summary>
        /// A `static_vnet_route` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVirtualHubConnectionRoutingStaticVnetRouteResult> StaticVnetRoutes;

        [OutputConstructor]
        private GetVirtualHubConnectionRoutingResult(
            string associatedRouteTableId,

            string inboundRouteMapId,

            string outboundRouteMapId,

            ImmutableArray<Outputs.GetVirtualHubConnectionRoutingPropagatedRouteTableResult> propagatedRouteTables,

            string staticVnetLocalRouteOverrideCriteria,

            bool staticVnetPropagateStaticRoutesEnabled,

            ImmutableArray<Outputs.GetVirtualHubConnectionRoutingStaticVnetRouteResult> staticVnetRoutes)
        {
            AssociatedRouteTableId = associatedRouteTableId;
            InboundRouteMapId = inboundRouteMapId;
            OutboundRouteMapId = outboundRouteMapId;
            PropagatedRouteTables = propagatedRouteTables;
            StaticVnetLocalRouteOverrideCriteria = staticVnetLocalRouteOverrideCriteria;
            StaticVnetPropagateStaticRoutesEnabled = staticVnetPropagateStaticRoutesEnabled;
            StaticVnetRoutes = staticVnetRoutes;
        }
    }
}
