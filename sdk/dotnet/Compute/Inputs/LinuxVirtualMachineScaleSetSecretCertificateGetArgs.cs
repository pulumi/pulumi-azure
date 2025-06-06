// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class LinuxVirtualMachineScaleSetSecretCertificateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Secret URL of a Key Vault Certificate.
        /// 
        /// &gt; **Note:** This can be sourced from the `secret_id` field within the `azure.keyvault.Certificate` Resource.
        /// 
        /// &gt; **Note:** The certificate must have been uploaded/created in PFX format, PEM certificates are not currently supported by Azure.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public LinuxVirtualMachineScaleSetSecretCertificateGetArgs()
        {
        }
        public static new LinuxVirtualMachineScaleSetSecretCertificateGetArgs Empty => new LinuxVirtualMachineScaleSetSecretCertificateGetArgs();
    }
}
