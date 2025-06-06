// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Inputs
{

    public sealed class JobTemplateVolumeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Mount options used while mounting the AzureFile. Must be a comma-separated string e.g. `dir_mode=0751,file_mode=0751`.
        /// </summary>
        [Input("mountOptions")]
        public Input<string>? MountOptions { get; set; }

        /// <summary>
        /// The name of the volume.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the storage to use for the volume.
        /// </summary>
        [Input("storageName")]
        public Input<string>? StorageName { get; set; }

        /// <summary>
        /// The type of storage to use for the volume. Possible values are `AzureFile`, `EmptyDir` and `Secret`.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        public JobTemplateVolumeArgs()
        {
        }
        public static new JobTemplateVolumeArgs Empty => new JobTemplateVolumeArgs();
    }
}
