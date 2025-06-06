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
    public sealed class GalleryApplicationVersionSource
    {
        /// <summary>
        /// The Storage Blob URI of the default configuration. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? DefaultConfigurationLink;
        /// <summary>
        /// The Storage Blob URI of the source application package. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string MediaLink;

        [OutputConstructor]
        private GalleryApplicationVersionSource(
            string? defaultConfigurationLink,

            string mediaLink)
        {
            DefaultConfigurationLink = defaultConfigurationLink;
            MediaLink = mediaLink;
        }
    }
}
