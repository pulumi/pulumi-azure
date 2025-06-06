// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Healthcare.Outputs
{

    [OutputType]
    public sealed class MedtechServiceIdentity
    {
        /// <summary>
        /// Specifies a list of User Assigned Managed Identity IDs to be assigned to this Healthcare Med Tech Service.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// The Principal ID associated with this System Assigned Managed Service Identity.
        /// </summary>
        public readonly string? PrincipalId;
        /// <summary>
        /// The Tenant ID associated with this System Assigned Managed Service Identity.
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// Specifies the type of Managed Service Identity that should be configured on this Healthcare Med Tech Service. Possible values are `SystemAssigned`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private MedtechServiceIdentity(
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
