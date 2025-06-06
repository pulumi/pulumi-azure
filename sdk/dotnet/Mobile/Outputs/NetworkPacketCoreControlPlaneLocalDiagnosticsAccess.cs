// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Outputs
{

    [OutputType]
    public sealed class NetworkPacketCoreControlPlaneLocalDiagnosticsAccess
    {
        /// <summary>
        /// How to authenticate users to access local diagnostics APIs. Possible values are `AAD` and `Password`.
        /// </summary>
        public readonly string AuthenticationType;
        /// <summary>
        /// The versionless certificate URL used to secure local access to packet core diagnostics over local APIs by the Kubernetes ingress.
        /// </summary>
        public readonly string? HttpsServerCertificateUrl;

        [OutputConstructor]
        private NetworkPacketCoreControlPlaneLocalDiagnosticsAccess(
            string authenticationType,

            string? httpsServerCertificateUrl)
        {
            AuthenticationType = authenticationType;
            HttpsServerCertificateUrl = httpsServerCertificateUrl;
        }
    }
}
