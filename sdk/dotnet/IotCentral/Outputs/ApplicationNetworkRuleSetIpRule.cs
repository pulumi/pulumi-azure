// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.IotCentral.Outputs
{

    [OutputType]
    public sealed class ApplicationNetworkRuleSetIpRule
    {
        /// <summary>
        /// The IP address range in CIDR notation for the IP Rule.
        /// </summary>
        public readonly string IpMask;
        /// <summary>
        /// The name of the IP Rule
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ApplicationNetworkRuleSetIpRule(
            string ipMask,

            string name)
        {
            IpMask = ipMask;
            Name = name;
        }
    }
}
