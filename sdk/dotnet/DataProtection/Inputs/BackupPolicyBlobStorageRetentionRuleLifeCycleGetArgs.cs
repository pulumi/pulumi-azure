// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataProtection.Inputs
{

    public sealed class BackupPolicyBlobStorageRetentionRuleLifeCycleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of data store. The only possible value is `VaultStore`. Changing this forces a new Backup Policy Blob Storage to be created.
        /// </summary>
        [Input("dataStoreType", required: true)]
        public Input<string> DataStoreType { get; set; } = null!;

        /// <summary>
        /// The retention duration up to which the backups are to be retained in the data stores. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
        /// </summary>
        [Input("duration", required: true)]
        public Input<string> Duration { get; set; } = null!;

        public BackupPolicyBlobStorageRetentionRuleLifeCycleGetArgs()
        {
        }
        public static new BackupPolicyBlobStorageRetentionRuleLifeCycleGetArgs Empty => new BackupPolicyBlobStorageRetentionRuleLifeCycleGetArgs();
    }
}
