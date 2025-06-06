// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Outputs
{

    [OutputType]
    public sealed class GetFrontdoorProfileIdentityResult
    {
        /// <summary>
        /// The list of User Assigned Managed Identity IDs assigned to this Front Door Profile.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        public readonly string PrincipalId;
        public readonly string TenantId;
        /// <summary>
        /// The type of Managed Service Identity that is configured on this Front Door Profile.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetFrontdoorProfileIdentityResult(
            ImmutableArray<string> identityIds,

            string principalId,

            string tenantId,

            string type)
        {
            IdentityIds = identityIds;
            PrincipalId = principalId;
            TenantId = tenantId;
            Type = type;
        }
    }
}
