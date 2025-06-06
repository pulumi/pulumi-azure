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
    public sealed class LinuxVirtualMachineScaleSetGalleryApplication
    {
        /// <summary>
        /// Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? ConfigurationBlobUri;
        /// <summary>
        /// Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly int? Order;
        /// <summary>
        /// Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? Tag;
        /// <summary>
        /// Specifies the Gallery Application Version resource ID. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string VersionId;

        [OutputConstructor]
        private LinuxVirtualMachineScaleSetGalleryApplication(
            string? configurationBlobUri,

            int? order,

            string? tag,

            string versionId)
        {
            ConfigurationBlobUri = configurationBlobUri;
            Order = order;
            Tag = tag;
            VersionId = versionId;
        }
    }
}
