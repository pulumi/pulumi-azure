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
    public sealed class GetAccountIdentityResult
    {
        /// <summary>
        /// A list of User Assigned Managed Identity IDs assigned with the Identity of this Storage Account.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// The Principal ID for the Service Principal associated with the Identity of this Storage Account.
        /// </summary>
        public readonly string PrincipalId;
        /// <summary>
        /// The Tenant ID for the Service Principal associated with the Identity of this Storage Account.
        /// </summary>
        public readonly string TenantId;
        /// <summary>
        /// The type of Managed Service Identity that is configured on this Storage Account
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetAccountIdentityResult(
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
