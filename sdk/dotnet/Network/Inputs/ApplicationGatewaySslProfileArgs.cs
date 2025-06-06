// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class ApplicationGatewaySslProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Rewrite Rule Set
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the SSL Profile that is unique within this Application Gateway.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// a `ssl_policy` block as defined below.
        /// </summary>
        [Input("sslPolicy")]
        public Input<Inputs.ApplicationGatewaySslProfileSslPolicyArgs>? SslPolicy { get; set; }

        [Input("trustedClientCertificateNames")]
        private InputList<string>? _trustedClientCertificateNames;

        /// <summary>
        /// The name of the Trusted Client Certificate that will be used to authenticate requests from clients.
        /// </summary>
        public InputList<string> TrustedClientCertificateNames
        {
            get => _trustedClientCertificateNames ?? (_trustedClientCertificateNames = new InputList<string>());
            set => _trustedClientCertificateNames = value;
        }

        /// <summary>
        /// Should client certificate issuer DN be verified? Defaults to `false`.
        /// </summary>
        [Input("verifyClientCertIssuerDn")]
        public Input<bool>? VerifyClientCertIssuerDn { get; set; }

        /// <summary>
        /// Specify the method to check client certificate revocation status. Possible value is `OCSP`.
        /// </summary>
        [Input("verifyClientCertificateRevocation")]
        public Input<string>? VerifyClientCertificateRevocation { get; set; }

        public ApplicationGatewaySslProfileArgs()
        {
        }
        public static new ApplicationGatewaySslProfileArgs Empty => new ApplicationGatewaySslProfileArgs();
    }
}
