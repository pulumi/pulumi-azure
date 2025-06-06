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
    public sealed class NetworkSecurityGroupSecurityRule
    {
        /// <summary>
        /// Specifies whether network traffic is allowed or denied. Possible values are `Allow` and `Deny`.
        /// </summary>
        public readonly string Access;
        /// <summary>
        /// A description for this rule. Restricted to 140 characters.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// CIDR or destination IP range or * to match any IP. Tags such as `VirtualNetwork`, `AzureLoadBalancer` and `Internet` can also be used. This is required if `destination_address_prefixes` is not specified.
        /// </summary>
        public readonly string? DestinationAddressPrefix;
        /// <summary>
        /// List of destination address prefixes. Tags may not be used. This is required if `destination_address_prefix` is not specified.
        /// </summary>
        public readonly ImmutableArray<string> DestinationAddressPrefixes;
        /// <summary>
        /// A List of destination Application Security Group IDs
        /// </summary>
        public readonly ImmutableArray<string> DestinationApplicationSecurityGroupIds;
        /// <summary>
        /// Destination Port or Range. Integer or range between `0` and `65535` or `*` to match any. This is required if `destination_port_ranges` is not specified.
        /// </summary>
        public readonly string? DestinationPortRange;
        /// <summary>
        /// List of destination ports or port ranges. This is required if `destination_port_range` is not specified.
        /// </summary>
        public readonly ImmutableArray<string> DestinationPortRanges;
        /// <summary>
        /// The direction specifies if rule will be evaluated on incoming or outgoing traffic. Possible values are `Inbound` and `Outbound`.
        /// </summary>
        public readonly string Direction;
        /// <summary>
        /// The name of the security rule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Specifies the priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
        /// </summary>
        public readonly int Priority;
        /// <summary>
        /// Network protocol this rule applies to. Possible values include `Tcp`, `Udp`, `Icmp`, `Esp`, `Ah` or `*` (which matches all).
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// CIDR or source IP range or * to match any IP. Tags such as `VirtualNetwork`, `AzureLoadBalancer` and `Internet` can also be used. This is required if `source_address_prefixes` is not specified.
        /// </summary>
        public readonly string? SourceAddressPrefix;
        /// <summary>
        /// List of source address prefixes. Tags may not be used. This is required if `source_address_prefix` is not specified.
        /// </summary>
        public readonly ImmutableArray<string> SourceAddressPrefixes;
        /// <summary>
        /// A List of source Application Security Group IDs
        /// </summary>
        public readonly ImmutableArray<string> SourceApplicationSecurityGroupIds;
        /// <summary>
        /// Source Port or Range. Integer or range between `0` and `65535` or `*` to match any. This is required if `source_port_ranges` is not specified.
        /// </summary>
        public readonly string? SourcePortRange;
        /// <summary>
        /// List of source ports or port ranges. This is required if `source_port_range` is not specified.
        /// </summary>
        public readonly ImmutableArray<string> SourcePortRanges;

        [OutputConstructor]
        private NetworkSecurityGroupSecurityRule(
            string access,

            string? description,

            string? destinationAddressPrefix,

            ImmutableArray<string> destinationAddressPrefixes,

            ImmutableArray<string> destinationApplicationSecurityGroupIds,

            string? destinationPortRange,

            ImmutableArray<string> destinationPortRanges,

            string direction,

            string name,

            int priority,

            string protocol,

            string? sourceAddressPrefix,

            ImmutableArray<string> sourceAddressPrefixes,

            ImmutableArray<string> sourceApplicationSecurityGroupIds,

            string? sourcePortRange,

            ImmutableArray<string> sourcePortRanges)
        {
            Access = access;
            Description = description;
            DestinationAddressPrefix = destinationAddressPrefix;
            DestinationAddressPrefixes = destinationAddressPrefixes;
            DestinationApplicationSecurityGroupIds = destinationApplicationSecurityGroupIds;
            DestinationPortRange = destinationPortRange;
            DestinationPortRanges = destinationPortRanges;
            Direction = direction;
            Name = name;
            Priority = priority;
            Protocol = protocol;
            SourceAddressPrefix = sourceAddressPrefix;
            SourceAddressPrefixes = sourceAddressPrefixes;
            SourceApplicationSecurityGroupIds = sourceApplicationSecurityGroupIds;
            SourcePortRange = sourcePortRange;
            SourcePortRanges = sourcePortRanges;
        }
    }
}
