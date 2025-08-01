// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PostgreSql.Inputs
{

    public sealed class FlexibleServerCustomerManagedKeyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The versioned ID of the geo backup Key Vault Key.
        /// 
        /// &gt; **Note:** The key vault in which this key exists must be in the same region as the geo-redundant backup.
        /// </summary>
        [Input("geoBackupKeyVaultKeyId")]
        public Input<string>? GeoBackupKeyVaultKeyId { get; set; }

        /// <summary>
        /// The geo backup user managed identity id for a Customer Managed Key. Must be added to `identity.identity_ids`.
        /// 
        /// &gt; **Note:** This managed identity cannot be the same as `primary_user_assigned_identity_id`, additionally this identity must be created in the same region as the geo-redundant backup.
        /// 
        /// &gt; **Note:** `primary_user_assigned_identity_id` or `geo_backup_user_assigned_identity_id` is required when `type` is set to `UserAssigned`.
        /// </summary>
        [Input("geoBackupUserAssignedIdentityId")]
        public Input<string>? GeoBackupUserAssignedIdentityId { get; set; }

        /// <summary>
        /// The versioned/versionless ID of the Key Vault Key.
        /// </summary>
        [Input("keyVaultKeyId", required: true)]
        public Input<string> KeyVaultKeyId { get; set; } = null!;

        /// <summary>
        /// Specifies the primary user managed identity id for a Customer Managed Key. Must be added to `identity.identity_ids`.
        /// </summary>
        [Input("primaryUserAssignedIdentityId")]
        public Input<string>? PrimaryUserAssignedIdentityId { get; set; }

        public FlexibleServerCustomerManagedKeyGetArgs()
        {
        }
        public static new FlexibleServerCustomerManagedKeyGetArgs Empty => new FlexibleServerCustomerManagedKeyGetArgs();
    }
}
