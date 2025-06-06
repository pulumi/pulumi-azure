// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.KeyVault.Outputs
{

    [OutputType]
    public sealed class GetKeyVaultNetworkAclResult
    {
        public readonly string Bypass;
        public readonly string DefaultAction;
        public readonly ImmutableArray<string> IpRules;
        public readonly ImmutableArray<string> VirtualNetworkSubnetIds;

        [OutputConstructor]
        private GetKeyVaultNetworkAclResult(
            string bypass,

            string defaultAction,

            ImmutableArray<string> ipRules,

            ImmutableArray<string> virtualNetworkSubnetIds)
        {
            Bypass = bypass;
            DefaultAction = defaultAction;
            IpRules = ipRules;
            VirtualNetworkSubnetIds = virtualNetworkSubnetIds;
        }
    }
}
