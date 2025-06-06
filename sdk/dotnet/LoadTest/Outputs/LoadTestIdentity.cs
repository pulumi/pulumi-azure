// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LoadTest.Outputs
{

    [OutputType]
    public sealed class LoadTestIdentity
    {
        /// <summary>
        /// A list of the User Assigned Identity IDs that should be assigned to this Load Test.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// The Principal ID for the System-Assigned Managed Identity assigned to this Load Test.
        /// *
        /// </summary>
        public readonly string? PrincipalId;
        /// <summary>
        /// The Tenant ID for the System-Assigned Managed Identity assigned to this Load Test.
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// Specifies the type of Managed Identity that should be assigned to this Load Test Encryption. Possible values are `SystemAssigned` or `UserAssigned`. Changing this forces a new Load Test to be created.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private LoadTestIdentity(
            ImmutableArray<string> identityIds,

            string? principalId,

            string? tenantId,

            string type)
        {
            IdentityIds = identityIds;
            PrincipalId = principalId;
            TenantId = tenantId;
            Type = type;
        }
    }
}
