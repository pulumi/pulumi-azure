// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WebPubSub.Outputs
{

    [OutputType]
    public sealed class SocketioIdentity
    {
        /// <summary>
        /// Specifies a list of User Assigned Managed Identity IDs for this Web PubSub Service.
        /// 
        /// &gt; **Note:** `identity_ids` is required when `type` is `UserAssigned`.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        public readonly string? PrincipalId;
        public readonly string? TenantId;
        /// <summary>
        /// The type of Managed Identity for this Web PubSub Service. Possible Values are `SystemAssigned` and `UserAssigned`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private SocketioIdentity(
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
