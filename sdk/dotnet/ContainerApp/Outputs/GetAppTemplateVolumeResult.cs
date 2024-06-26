// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class GetAppTemplateVolumeResult
    {
        /// <summary>
        /// The name of the Container App.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the `AzureFile` storage.
        /// </summary>
        public readonly string StorageName;
        /// <summary>
        /// The type of storage volume. Possible values include `AzureFile` and `EmptyDir`. Defaults to `EmptyDir`.
        /// </summary>
        public readonly string StorageType;

        [OutputConstructor]
        private GetAppTemplateVolumeResult(
            string name,

            string storageName,

            string storageType)
        {
            Name = name;
            StorageName = storageName;
            StorageType = storageType;
        }
    }
}
