// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Outputs
{

    [OutputType]
    public sealed class HadoopClusterStorageAccount
    {
        /// <summary>
        /// Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** One of the `storage_account` or `storage_account_gen2` blocks must be marked as the default.
        /// </summary>
        public readonly bool IsDefault;
        /// <summary>
        /// The Access Key which should be used to connect to the Storage Account. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string StorageAccountKey;
        /// <summary>
        /// The ID of the Storage Container. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** When the `azure.storage.Container` resource is created with `storage_account_name`, this can be obtained from the `id` of the `azure.storage.Container` resource. When the `azure.storage.Container` resource is created with `storage_account_id`, please use `azure.storage.getContainers` data source to get the `data_plane_id` of the `azure.storage.Container` resource for this field.
        /// </summary>
        public readonly string StorageContainerId;
        /// <summary>
        /// The ID of the Storage Account. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? StorageResourceId;

        [OutputConstructor]
        private HadoopClusterStorageAccount(
            bool isDefault,

            string storageAccountKey,

            string storageContainerId,

            string? storageResourceId)
        {
            IsDefault = isDefault;
            StorageAccountKey = storageAccountKey;
            StorageContainerId = storageContainerId;
            StorageResourceId = storageResourceId;
        }
    }
}
