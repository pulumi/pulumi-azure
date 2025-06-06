// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Healthcare.Outputs
{

    [OutputType]
    public sealed class FhirServiceAuthentication
    {
        /// <summary>
        /// The intended audience to receive authentication tokens for the service.
        /// </summary>
        public readonly string Audience;
        public readonly string Authority;
        /// <summary>
        /// Whether smart proxy is enabled.
        /// </summary>
        public readonly bool? SmartProxyEnabled;

        [OutputConstructor]
        private FhirServiceAuthentication(
            string audience,

            string authority,

            bool? smartProxyEnabled)
        {
            Audience = audience;
            Authority = authority;
            SmartProxyEnabled = smartProxyEnabled;
        }
    }
}
