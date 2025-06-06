// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class ImageOsDisk
    {
        /// <summary>
        /// Specifies the URI in Azure storage of the blob that you want to use to create the image. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? BlobUri;
        /// <summary>
        /// Specifies the caching mode as `ReadWrite`, `ReadOnly`, or `None`. The default is `None`.
        /// </summary>
        public readonly string? Caching;
        /// <summary>
        /// The ID of the Disk Encryption Set which should be used to encrypt this disk. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? DiskEncryptionSetId;
        /// <summary>
        /// Specifies the ID of the managed disk resource that you want to use to create the image.
        /// </summary>
        public readonly string? ManagedDiskId;
        /// <summary>
        /// Specifies the state of the operating system contained in the blob. Currently, the only value is Generalized. Possible values are `Generalized` and `Specialized`.
        /// </summary>
        public readonly string? OsState;
        /// <summary>
        /// Specifies the type of operating system contained in the virtual machine image. Possible values are: `Windows` or `Linux`.
        /// </summary>
        public readonly string? OsType;
        /// <summary>
        /// Specifies the size of the image to be created. Changing this forces a new resource to be created.
        /// </summary>
        public readonly int? SizeGb;
        /// <summary>
        /// The type of Storage Disk to use. Possible values are `Premium_LRS`, `PremiumV2_LRS`, `Premium_ZRS`, `Standard_LRS`, `StandardSSD_LRS`, `StandardSSD_ZRS` and `UltraSSD_LRS`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string StorageType;

        [OutputConstructor]
        private ImageOsDisk(
            string? blobUri,

            string? caching,

            string? diskEncryptionSetId,

            string? managedDiskId,

            string? osState,

            string? osType,

            int? sizeGb,

            string storageType)
        {
            BlobUri = blobUri;
            Caching = caching;
            DiskEncryptionSetId = diskEncryptionSetId;
            ManagedDiskId = managedDiskId;
            OsState = osState;
            OsType = osType;
            SizeGb = sizeGb;
            StorageType = storageType;
        }
    }
}
