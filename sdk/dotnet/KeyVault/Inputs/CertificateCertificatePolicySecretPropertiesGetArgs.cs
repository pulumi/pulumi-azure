// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.KeyVault.Inputs
{

    public sealed class CertificateCertificatePolicySecretPropertiesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Content-Type of the Certificate, such as `application/x-pkcs12` for a PFX or `application/x-pem-file` for a PEM.
        /// </summary>
        [Input("contentType", required: true)]
        public Input<string> ContentType { get; set; } = null!;

        public CertificateCertificatePolicySecretPropertiesGetArgs()
        {
        }
        public static new CertificateCertificatePolicySecretPropertiesGetArgs Empty => new CertificateCertificatePolicySecretPropertiesGetArgs();
    }
}
