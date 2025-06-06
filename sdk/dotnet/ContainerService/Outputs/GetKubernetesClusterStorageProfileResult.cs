// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class GetKubernetesClusterStorageProfileResult
    {
        /// <summary>
        /// Is the Blob CSI driver enabled?
        /// </summary>
        public readonly bool BlobDriverEnabled;
        /// <summary>
        /// Is the Disk CSI driver enabled?
        /// </summary>
        public readonly bool DiskDriverEnabled;
        /// <summary>
        /// Is the File CSI driver enabled?
        /// </summary>
        public readonly bool FileDriverEnabled;
        /// <summary>
        /// Is the Snapshot Controller enabled?
        /// </summary>
        public readonly bool SnapshotControllerEnabled;

        [OutputConstructor]
        private GetKubernetesClusterStorageProfileResult(
            bool blobDriverEnabled,

            bool diskDriverEnabled,

            bool fileDriverEnabled,

            bool snapshotControllerEnabled)
        {
            BlobDriverEnabled = blobDriverEnabled;
            DiskDriverEnabled = diskDriverEnabled;
            FileDriverEnabled = fileDriverEnabled;
            SnapshotControllerEnabled = snapshotControllerEnabled;
        }
    }
}
