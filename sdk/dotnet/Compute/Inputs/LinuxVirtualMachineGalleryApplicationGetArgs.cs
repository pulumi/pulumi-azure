// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class LinuxVirtualMachineGalleryApplicationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether the version will be automatically updated for the VM when a new Gallery Application version is available in PIR/SIG. Defaults to `false`.
        /// </summary>
        [Input("automaticUpgradeEnabled")]
        public Input<bool>? AutomaticUpgradeEnabled { get; set; }

        /// <summary>
        /// Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided.
        /// </summary>
        [Input("configurationBlobUri")]
        public Input<string>? ConfigurationBlobUri { get; set; }

        /// <summary>
        /// Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        /// <summary>
        /// Specifies a passthrough value for more generic context. This field can be any valid `string` value.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// Specifies whether any failure for any operation in the VmApplication will fail the deployment of the VM. Defaults to `false`.
        /// </summary>
        [Input("treatFailureAsDeploymentFailureEnabled")]
        public Input<bool>? TreatFailureAsDeploymentFailureEnabled { get; set; }

        /// <summary>
        /// Specifies the Gallery Application Version resource ID.
        /// </summary>
        [Input("versionId", required: true)]
        public Input<string> VersionId { get; set; } = null!;

        public LinuxVirtualMachineGalleryApplicationGetArgs()
        {
        }
        public static new LinuxVirtualMachineGalleryApplicationGetArgs Empty => new LinuxVirtualMachineGalleryApplicationGetArgs();
    }
}
