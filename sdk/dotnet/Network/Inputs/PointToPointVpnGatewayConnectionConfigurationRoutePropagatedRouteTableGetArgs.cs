// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ids", required: true)]
        private InputList<string>? _ids;

        /// <summary>
        /// The list of Virtual Hub Route Table resource id which the routes will be propagated to.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("labels")]
        private InputList<string>? _labels;

        /// <summary>
        /// The list of labels to logically group Virtual Hub Route Tables which the routes will be propagated to.
        /// </summary>
        public InputList<string> Labels
        {
            get => _labels ?? (_labels = new InputList<string>());
            set => _labels = value;
        }

        public PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableGetArgs()
        {
        }
        public static new PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableGetArgs Empty => new PointToPointVpnGatewayConnectionConfigurationRoutePropagatedRouteTableGetArgs();
    }
}
