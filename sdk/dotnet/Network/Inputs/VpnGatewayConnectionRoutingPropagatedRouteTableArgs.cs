// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class VpnGatewayConnectionRoutingPropagatedRouteTableArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputList<string>? _labels;

        /// <summary>
        /// A list of labels to assign to this route table.
        /// </summary>
        public InputList<string> Labels
        {
            get => _labels ?? (_labels = new InputList<string>());
            set => _labels = value;
        }

        [Input("routeTableIds", required: true)]
        private InputList<string>? _routeTableIds;

        /// <summary>
        /// A list of Route Table IDs to associated with this VPN Gateway Connection.
        /// </summary>
        public InputList<string> RouteTableIds
        {
            get => _routeTableIds ?? (_routeTableIds = new InputList<string>());
            set => _routeTableIds = value;
        }

        public VpnGatewayConnectionRoutingPropagatedRouteTableArgs()
        {
        }
        public static new VpnGatewayConnectionRoutingPropagatedRouteTableArgs Empty => new VpnGatewayConnectionRoutingPropagatedRouteTableArgs();
    }
}
