// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Outputs
{

    [OutputType]
    public sealed class SpringCloudGatewayClientAuthorization
    {
        /// <summary>
        /// Specifies the Spring Cloud Certificate IDs of the Spring Cloud Gateway.
        /// </summary>
        public readonly ImmutableArray<string> CertificateIds;
        /// <summary>
        /// Specifies whether the client certificate verification is enabled.
        /// </summary>
        public readonly bool? VerificationEnabled;

        [OutputConstructor]
        private SpringCloudGatewayClientAuthorization(
            ImmutableArray<string> certificateIds,

            bool? verificationEnabled)
        {
            CertificateIds = certificateIds;
            VerificationEnabled = verificationEnabled;
        }
    }
}
