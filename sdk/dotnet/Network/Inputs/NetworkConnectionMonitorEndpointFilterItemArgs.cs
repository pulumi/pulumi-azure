// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class NetworkConnectionMonitorEndpointFilterItemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address of the filter item.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The type of items included in the filter. Possible values are `AgentAddress`. Defaults to `AgentAddress`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NetworkConnectionMonitorEndpointFilterItemArgs()
        {
        }
        public static new NetworkConnectionMonitorEndpointFilterItemArgs Empty => new NetworkConnectionMonitorEndpointFilterItemArgs();
    }
}
