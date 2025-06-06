// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Stack.Inputs
{

    public sealed class HciLogicalNetworkSubnetIpPoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 address of the end of the IP address pool. Changing this forces a new resource to be created.
        /// </summary>
        [Input("end", required: true)]
        public Input<string> End { get; set; } = null!;

        /// <summary>
        /// The IPv4 address of the start of the IP address pool. Changing this forces a new resource to be created.
        /// </summary>
        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        public HciLogicalNetworkSubnetIpPoolArgs()
        {
        }
        public static new HciLogicalNetworkSubnetIpPoolArgs Empty => new HciLogicalNetworkSubnetIpPoolArgs();
    }
}
