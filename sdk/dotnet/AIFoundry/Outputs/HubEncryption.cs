// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AIFoundry.Outputs
{

    [OutputType]
    public sealed class HubEncryption
    {
        /// <summary>
        /// The Key Vault URI to access the encryption key.
        /// </summary>
        public readonly string KeyId;
        /// <summary>
        /// The Key Vault ID where the customer owned encryption key exists.
        /// </summary>
        public readonly string KeyVaultId;
        /// <summary>
        /// The user assigned identity ID that has access to the encryption key.
        /// 
        /// &gt; **Note:** `user_assigned_identity_id` must be set when`identity.type` is `UserAssigned` in order for the service to find the assigned permissions.
        /// </summary>
        public readonly string? UserAssignedIdentityId;

        [OutputConstructor]
        private HubEncryption(
            string keyId,

            string keyVaultId,

            string? userAssignedIdentityId)
        {
            KeyId = keyId;
            KeyVaultId = keyVaultId;
            UserAssignedIdentityId = userAssignedIdentityId;
        }
    }
}
