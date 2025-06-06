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
    public sealed class NetworkManagerCrossTenantScope
    {
        /// <summary>
        /// List of management groups.
        /// </summary>
        public readonly ImmutableArray<string> ManagementGroups;
        /// <summary>
        /// List of subscriptions.
        /// </summary>
        public readonly ImmutableArray<string> Subscriptions;
        /// <summary>
        /// Tenant ID.
        /// </summary>
        public readonly string? TenantId;

        [OutputConstructor]
        private NetworkManagerCrossTenantScope(
            ImmutableArray<string> managementGroups,

            ImmutableArray<string> subscriptions,

            string? tenantId)
        {
            ManagementGroups = managementGroups;
            Subscriptions = subscriptions;
            TenantId = tenantId;
        }
    }
}
