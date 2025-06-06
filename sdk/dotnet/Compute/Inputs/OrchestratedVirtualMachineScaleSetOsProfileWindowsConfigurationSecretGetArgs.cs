// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificates", required: true)]
        private InputList<Inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateGetArgs>? _certificates;

        /// <summary>
        /// One or more `certificate` blocks as defined below.
        /// </summary>
        public InputList<Inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateGetArgs> Certificates
        {
            get => _certificates ?? (_certificates = new InputList<Inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificateGetArgs>());
            set => _certificates = value;
        }

        /// <summary>
        /// The ID of the Key Vault from which all Secrets should be sourced.
        /// </summary>
        [Input("keyVaultId", required: true)]
        public Input<string> KeyVaultId { get; set; } = null!;

        public OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretGetArgs()
        {
        }
        public static new OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretGetArgs Empty => new OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretGetArgs();
    }
}
