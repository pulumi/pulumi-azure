// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ServiceFabric.Outputs
{

    [OutputType]
    public sealed class ClusterClientCertificateCommonName
    {
        /// <summary>
        /// The common or subject name of the certificate.
        /// </summary>
        public readonly string CommonName;
        /// <summary>
        /// Does the Client Certificate have Admin Access to the cluster? Non-admin clients can only perform read only operations on the cluster.
        /// </summary>
        public readonly bool IsAdmin;
        /// <summary>
        /// The Issuer Thumbprint of the Certificate.
        /// 
        /// &gt; **Note:** Certificate Issuer Thumbprint may become required in the future, `https://docs.microsoft.com/azure/service-fabric/service-fabric-create-cluster-using-cert-cn#download-and-update-a-sample-template`.
        /// </summary>
        public readonly string? IssuerThumbprint;

        [OutputConstructor]
        private ClusterClientCertificateCommonName(
            string commonName,

            bool isAdmin,

            string? issuerThumbprint)
        {
            CommonName = commonName;
            IsAdmin = isAdmin;
            IssuerThumbprint = issuerThumbprint;
        }
    }
}
