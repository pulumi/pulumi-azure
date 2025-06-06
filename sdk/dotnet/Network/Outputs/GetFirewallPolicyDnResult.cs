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
    public sealed class GetFirewallPolicyDnResult
    {
        public readonly bool NetworkRuleFqdnEnabled;
        public readonly bool ProxyEnabled;
        public readonly ImmutableArray<string> Servers;

        [OutputConstructor]
        private GetFirewallPolicyDnResult(
            bool networkRuleFqdnEnabled,

            bool proxyEnabled,

            ImmutableArray<string> servers)
        {
            NetworkRuleFqdnEnabled = networkRuleFqdnEnabled;
            ProxyEnabled = proxyEnabled;
            Servers = servers;
        }
    }
}
