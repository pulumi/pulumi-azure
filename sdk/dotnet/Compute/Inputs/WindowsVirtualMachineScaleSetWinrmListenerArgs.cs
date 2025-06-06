// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class WindowsVirtualMachineScaleSetWinrmListenerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** This can be sourced from the `secret_id` field within the `azure.keyvault.Certificate` Resource.
        /// </summary>
        [Input("certificateUrl")]
        public Input<string>? CertificateUrl { get; set; }

        /// <summary>
        /// The Protocol of the WinRM Listener. Possible values are `Http` and `Https`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        public WindowsVirtualMachineScaleSetWinrmListenerArgs()
        {
        }
        public static new WindowsVirtualMachineScaleSetWinrmListenerArgs Empty => new WindowsVirtualMachineScaleSetWinrmListenerArgs();
    }
}
