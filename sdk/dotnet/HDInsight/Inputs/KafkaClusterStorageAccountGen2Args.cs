// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Inputs
{

    public sealed class KafkaClusterStorageAccountGen2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Gen2 Filesystem. Changing this forces a new resource to be created.
        /// </summary>
        [Input("filesystemId", required: true)]
        public Input<string> FilesystemId { get; set; } = null!;

        /// <summary>
        /// Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** One of the `storage_account` or `storage_account_gen2` blocks must be marked as the default.
        /// </summary>
        [Input("isDefault", required: true)]
        public Input<bool> IsDefault { get; set; } = null!;

        /// <summary>
        /// The ID of Managed Identity to use for accessing the Gen2 filesystem. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** This can be obtained from the `id` of the `azure.storage.Container` resource.
        /// </summary>
        [Input("managedIdentityResourceId", required: true)]
        public Input<string> ManagedIdentityResourceId { get; set; } = null!;

        /// <summary>
        /// The ID of the Storage Account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageResourceId", required: true)]
        public Input<string> StorageResourceId { get; set; } = null!;

        public KafkaClusterStorageAccountGen2Args()
        {
        }
        public static new KafkaClusterStorageAccountGen2Args Empty => new KafkaClusterStorageAccountGen2Args();
    }
}
