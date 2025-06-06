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
    public sealed class OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecret
    {
        /// <summary>
        /// One or more `certificate` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificate> Certificates;
        /// <summary>
        /// The ID of the Key Vault from which all Secrets should be sourced.
        /// </summary>
        public readonly string KeyVaultId;

        [OutputConstructor]
        private OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecret(
            ImmutableArray<Outputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificate> certificates,

            string keyVaultId)
        {
            Certificates = certificates;
            KeyVaultId = keyVaultId;
        }
    }
}
