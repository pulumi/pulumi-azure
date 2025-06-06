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
    public sealed class GetServiceAuthenticationConfigurationResult
    {
        /// <summary>
        /// The intended audience to receive authentication tokens for the service.
        /// </summary>
        public readonly string Audience;
        /// <summary>
        /// The Azure Active Directory (tenant) that serves as the authentication authority to access the service.
        /// </summary>
        public readonly string Authority;
        /// <summary>
        /// Is the 'SMART on FHIR' option for mobile and web implementations enabled?
        /// </summary>
        public readonly bool SmartProxyEnabled;

        [OutputConstructor]
        private GetServiceAuthenticationConfigurationResult(
            string audience,

            string authority,

            bool smartProxyEnabled)
        {
            Audience = audience;
            Authority = authority;
            SmartProxyEnabled = smartProxyEnabled;
        }
    }
}
