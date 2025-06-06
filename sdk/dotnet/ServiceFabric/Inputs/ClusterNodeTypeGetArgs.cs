// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ServiceFabric.Inputs
{

    public sealed class ClusterNodeTypeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `application_ports` block as defined below.
        /// </summary>
        [Input("applicationPorts")]
        public Input<Inputs.ClusterNodeTypeApplicationPortsGetArgs>? ApplicationPorts { get; set; }

        [Input("capacities")]
        private InputMap<string>? _capacities;

        /// <summary>
        /// The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
        /// </summary>
        public InputMap<string> Capacities
        {
            get => _capacities ?? (_capacities = new InputMap<string>());
            set => _capacities = value;
        }

        /// <summary>
        /// The Port used for the Client Endpoint for this Node Type.
        /// </summary>
        [Input("clientEndpointPort", required: true)]
        public Input<int> ClientEndpointPort { get; set; } = null!;

        /// <summary>
        /// The Durability Level for this Node Type. Possible values include `Bronze`, `Gold` and `Silver`. Defaults to `Bronze`.
        /// </summary>
        [Input("durabilityLevel")]
        public Input<string>? DurabilityLevel { get; set; }

        /// <summary>
        /// A `ephemeral_ports` block as defined below.
        /// </summary>
        [Input("ephemeralPorts")]
        public Input<Inputs.ClusterNodeTypeEphemeralPortsGetArgs>? EphemeralPorts { get; set; }

        /// <summary>
        /// The Port used for the HTTP Endpoint for this Node Type.
        /// </summary>
        [Input("httpEndpointPort", required: true)]
        public Input<int> HttpEndpointPort { get; set; } = null!;

        /// <summary>
        /// The number of nodes for this Node Type.
        /// </summary>
        [Input("instanceCount", required: true)]
        public Input<int> InstanceCount { get; set; } = null!;

        /// <summary>
        /// Is this the Primary Node Type?
        /// </summary>
        [Input("isPrimary", required: true)]
        public Input<bool> IsPrimary { get; set; } = null!;

        /// <summary>
        /// Should this node type run only stateless services?
        /// </summary>
        [Input("isStateless")]
        public Input<bool>? IsStateless { get; set; }

        /// <summary>
        /// Does this node type span availability zones?
        /// </summary>
        [Input("multipleAvailabilityZones")]
        public Input<bool>? MultipleAvailabilityZones { get; set; }

        /// <summary>
        /// The name of the Node Type.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("placementProperties")]
        private InputMap<string>? _placementProperties;

        /// <summary>
        /// The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
        /// </summary>
        public InputMap<string> PlacementProperties
        {
            get => _placementProperties ?? (_placementProperties = new InputMap<string>());
            set => _placementProperties = value;
        }

        /// <summary>
        /// The Port used for the Reverse Proxy Endpoint for this Node Type. Changing this will upgrade the cluster.
        /// </summary>
        [Input("reverseProxyEndpointPort")]
        public Input<int>? ReverseProxyEndpointPort { get; set; }

        public ClusterNodeTypeGetArgs()
        {
        }
        public static new ClusterNodeTypeGetArgs Empty => new ClusterNodeTypeGetArgs();
    }
}
