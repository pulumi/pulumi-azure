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
    public sealed class SpringCloudAppIngressSettings
    {
        /// <summary>
        /// Specifies how ingress should communicate with this app backend service. Allowed values are `GRPC` and `Default`. Defaults to `Default`.
        /// </summary>
        public readonly string? BackendProtocol;
        /// <summary>
        /// Specifies the ingress read time out in seconds. Defaults to `300`.
        /// </summary>
        public readonly int? ReadTimeoutInSeconds;
        /// <summary>
        /// Specifies the ingress send time out in seconds. Defaults to `60`.
        /// </summary>
        public readonly int? SendTimeoutInSeconds;
        /// <summary>
        /// Specifies the type of the affinity, set this to `Cookie` to enable session affinity. Allowed values are `Cookie` and `None`. Defaults to `None`.
        /// </summary>
        public readonly string? SessionAffinity;
        /// <summary>
        /// Specifies the time in seconds until the cookie expires.
        /// </summary>
        public readonly int? SessionCookieMaxAge;

        [OutputConstructor]
        private SpringCloudAppIngressSettings(
            string? backendProtocol,

            int? readTimeoutInSeconds,

            int? sendTimeoutInSeconds,

            string? sessionAffinity,

            int? sessionCookieMaxAge)
        {
            BackendProtocol = backendProtocol;
            ReadTimeoutInSeconds = readTimeoutInSeconds;
            SendTimeoutInSeconds = sendTimeoutInSeconds;
            SessionAffinity = sessionAffinity;
            SessionCookieMaxAge = sessionCookieMaxAge;
        }
    }
}
