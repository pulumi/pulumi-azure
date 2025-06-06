// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class ScaleSetOsProfileSecretGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the key vault to use.
        /// </summary>
        [Input("sourceVaultId", required: true)]
        public Input<string> SourceVaultId { get; set; } = null!;

        [Input("vaultCertificates")]
        private InputList<Inputs.ScaleSetOsProfileSecretVaultCertificateGetArgs>? _vaultCertificates;

        /// <summary>
        /// (Required, on Windows machines) One or more `vault_certificates` blocks as defined below.
        /// </summary>
        public InputList<Inputs.ScaleSetOsProfileSecretVaultCertificateGetArgs> VaultCertificates
        {
            get => _vaultCertificates ?? (_vaultCertificates = new InputList<Inputs.ScaleSetOsProfileSecretVaultCertificateGetArgs>());
            set => _vaultCertificates = value;
        }

        public ScaleSetOsProfileSecretGetArgs()
        {
        }
        public static new ScaleSetOsProfileSecretGetArgs Empty => new ScaleSetOsProfileSecretGetArgs();
    }
}
