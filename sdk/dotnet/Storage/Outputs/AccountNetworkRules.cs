// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Outputs
{

    [OutputType]
    public sealed class AccountNetworkRules
    {
        /// <summary>
        /// Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Valid options are any combination of `Logging`, `Metrics`, `AzureServices`, or `None`.
        /// </summary>
        public readonly ImmutableArray<string> Bypasses;
        /// <summary>
        /// Specifies the default action of allow or deny when no other rules match. Valid options are `Deny` or `Allow`.
        /// </summary>
        public readonly string DefaultAction;
        /// <summary>
        /// List of public IP or IP ranges in CIDR Format. Only IPv4 addresses are allowed. /31 CIDRs, /32 CIDRs, and Private IP address ranges (as defined in [RFC 1918](https://tools.ietf.org/html/rfc1918#section-3)), are not allowed.
        /// </summary>
        public readonly ImmutableArray<string> IpRules;
        /// <summary>
        /// One or more `private_link_access` block as defined below.
        /// 
        /// &gt; **Note:** If specifying `network_rules`, one of either `ip_rules` or `virtual_network_subnet_ids` must be specified and `default_action` must be set to `Deny`.
        /// 
        /// &gt; **Note:** Network Rules can be defined either directly on the `azure.storage.Account` resource, or using the `azure.storage.AccountNetworkRules` resource - but the two cannot be used together. If both are used against the same Storage Account, spurious changes will occur. When managing Network Rules using this resource, to change from a `default_action` of `Deny` to `Allow` requires defining, rather than removing, the block.
        /// 
        /// &gt; **Note:** The prefix of `ip_rules` must be between 0 and 30 and only supports public IP addresses.
        /// 
        /// &gt; **Note:** [More information on Validation is available here](https://docs.microsoft.com/en-gb/azure/storage/blobs/storage-custom-domain-name)
        /// </summary>
        public readonly ImmutableArray<Outputs.AccountNetworkRulesPrivateLinkAccess> PrivateLinkAccesses;
        /// <summary>
        /// A list of resource ids for subnets.
        /// </summary>
        public readonly ImmutableArray<string> VirtualNetworkSubnetIds;

        [OutputConstructor]
        private AccountNetworkRules(
            ImmutableArray<string> bypasses,

            string defaultAction,

            ImmutableArray<string> ipRules,

            ImmutableArray<Outputs.AccountNetworkRulesPrivateLinkAccess> privateLinkAccesses,

            ImmutableArray<string> virtualNetworkSubnetIds)
        {
            Bypasses = bypasses;
            DefaultAction = defaultAction;
            IpRules = ipRules;
            PrivateLinkAccesses = privateLinkAccesses;
            VirtualNetworkSubnetIds = virtualNetworkSubnetIds;
        }
    }
}
