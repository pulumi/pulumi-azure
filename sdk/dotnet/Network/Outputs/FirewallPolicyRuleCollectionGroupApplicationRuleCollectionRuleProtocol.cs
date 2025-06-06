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
    public sealed class FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol
    {
        /// <summary>
        /// Port number of the protocol. Range is 0-64000.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// Protocol type. Possible values are `Http` and `Https`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol(
            int port,

            string type)
        {
            Port = port;
            Type = type;
        }
    }
}
