// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Outputs
{

    [OutputType]
    public sealed class GetNetworkServicePccRuleServiceDataFlowTemplateResult
    {
        /// <summary>
        /// The direction of this flow. Possible values are `Uplink`, `Downlink` and `Bidirectional`.
        /// </summary>
        public readonly string Direction;
        /// <summary>
        /// Specifies the name which should be used for this Mobile Network Service.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The port(s) to which UEs will connect for this flow. You can specify zero or more ports or port ranges.
        /// </summary>
        public readonly ImmutableArray<string> Ports;
        /// <summary>
        /// A list of the allowed protocol(s) for this flow.
        /// </summary>
        public readonly ImmutableArray<string> Protocols;
        /// <summary>
        /// The remote IP address(es) to which UEs will connect for this flow.
        /// </summary>
        public readonly ImmutableArray<string> RemoteIpLists;

        [OutputConstructor]
        private GetNetworkServicePccRuleServiceDataFlowTemplateResult(
            string direction,

            string name,

            ImmutableArray<string> ports,

            ImmutableArray<string> protocols,

            ImmutableArray<string> remoteIpLists)
        {
            Direction = direction;
            Name = name;
            Ports = ports;
            Protocols = protocols;
            RemoteIpLists = remoteIpLists;
        }
    }
}
