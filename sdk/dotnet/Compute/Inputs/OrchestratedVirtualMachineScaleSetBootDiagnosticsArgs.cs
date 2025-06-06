// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Primary/Secondary Endpoint for the Azure Storage Account which should be used to store Boot Diagnostics, including Console Output and Screenshots from the Hypervisor. By including a `boot_diagnostics` block without passing the `storage_account_uri` field will cause the API to utilize a Managed Storage Account to store the Boot Diagnostics output.
        /// </summary>
        [Input("storageAccountUri")]
        public Input<string>? StorageAccountUri { get; set; }

        public OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs()
        {
        }
        public static new OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs Empty => new OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs();
    }
}
