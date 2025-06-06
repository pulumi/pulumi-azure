// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.KeyVault.Inputs
{

    public sealed class CertificateCertificatePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `issuer_parameters` block as defined below.
        /// </summary>
        [Input("issuerParameters", required: true)]
        public Input<Inputs.CertificateCertificatePolicyIssuerParametersGetArgs> IssuerParameters { get; set; } = null!;

        /// <summary>
        /// A `key_properties` block as defined below.
        /// </summary>
        [Input("keyProperties", required: true)]
        public Input<Inputs.CertificateCertificatePolicyKeyPropertiesGetArgs> KeyProperties { get; set; } = null!;

        [Input("lifetimeActions")]
        private InputList<Inputs.CertificateCertificatePolicyLifetimeActionGetArgs>? _lifetimeActions;

        /// <summary>
        /// A `lifetime_action` block as defined below.
        /// </summary>
        public InputList<Inputs.CertificateCertificatePolicyLifetimeActionGetArgs> LifetimeActions
        {
            get => _lifetimeActions ?? (_lifetimeActions = new InputList<Inputs.CertificateCertificatePolicyLifetimeActionGetArgs>());
            set => _lifetimeActions = value;
        }

        /// <summary>
        /// A `secret_properties` block as defined below.
        /// </summary>
        [Input("secretProperties", required: true)]
        public Input<Inputs.CertificateCertificatePolicySecretPropertiesGetArgs> SecretProperties { get; set; } = null!;

        /// <summary>
        /// A `x509_certificate_properties` block as defined below. Required when `certificate` block is not specified.
        /// </summary>
        [Input("x509CertificateProperties")]
        public Input<Inputs.CertificateCertificatePolicyX509CertificatePropertiesGetArgs>? X509CertificateProperties { get; set; }

        public CertificateCertificatePolicyGetArgs()
        {
        }
        public static new CertificateCertificatePolicyGetArgs Empty => new CertificateCertificatePolicyGetArgs();
    }
}
