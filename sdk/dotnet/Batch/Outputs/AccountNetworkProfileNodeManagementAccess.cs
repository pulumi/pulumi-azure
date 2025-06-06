// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Outputs
{

    [OutputType]
    public sealed class AccountNetworkProfileNodeManagementAccess
    {
        /// <summary>
        /// Specifies the default action for the node management access. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        /// </summary>
        public readonly string? DefaultAction;
        /// <summary>
        /// One or more `ip_rule` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.AccountNetworkProfileNodeManagementAccessIpRule> IpRules;

        [OutputConstructor]
        private AccountNetworkProfileNodeManagementAccess(
            string? defaultAction,

            ImmutableArray<Outputs.AccountNetworkProfileNodeManagementAccessIpRule> ipRules)
        {
            DefaultAction = defaultAction;
            IpRules = ipRules;
        }
    }
}
