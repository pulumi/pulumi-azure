// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class BackendTlsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for the backend host.
        /// </summary>
        [Input("validateCertificateChain")]
        public Input<bool>? ValidateCertificateChain { get; set; }

        /// <summary>
        /// Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for the backend host.
        /// </summary>
        [Input("validateCertificateName")]
        public Input<bool>? ValidateCertificateName { get; set; }

        public BackendTlsArgs()
        {
        }
        public static new BackendTlsArgs Empty => new BackendTlsArgs();
    }
}
