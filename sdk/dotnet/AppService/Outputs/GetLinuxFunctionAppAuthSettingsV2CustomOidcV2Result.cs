// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class GetLinuxFunctionAppAuthSettingsV2CustomOidcV2Result
    {
        /// <summary>
        /// The endpoint to make the Authorisation Request as supplied by `openid_configuration_endpoint` response.
        /// </summary>
        public readonly string AuthorisationEndpoint;
        /// <summary>
        /// The endpoint that provides the keys necessary to validate the token as supplied by `openid_configuration_endpoint` response.
        /// </summary>
        public readonly string CertificationUri;
        /// <summary>
        /// The Client Credential Method used.
        /// </summary>
        public readonly string ClientCredentialMethod;
        /// <summary>
        /// The OAuth 2.0 client ID that was created for the app used for authentication.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication.
        /// </summary>
        public readonly string ClientSecretSettingName;
        /// <summary>
        /// The endpoint that issued the Token as supplied by `openid_configuration_endpoint` response.
        /// </summary>
        public readonly string IssuerEndpoint;
        /// <summary>
        /// The name which should be used for this Linux Function App.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the claim that contains the users name.
        /// </summary>
        public readonly string NameClaimType;
        /// <summary>
        /// The endpoint used for OpenID Connect Discovery. For example `https://example.com/.well-known/openid-configuration`.
        /// </summary>
        public readonly string OpenidConfigurationEndpoint;
        /// <summary>
        /// The list of the scopes that are requested while authenticating.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// The endpoint used to request a Token as supplied by `openid_configuration_endpoint` response.
        /// </summary>
        public readonly string TokenEndpoint;

        [OutputConstructor]
        private GetLinuxFunctionAppAuthSettingsV2CustomOidcV2Result(
            string authorisationEndpoint,

            string certificationUri,

            string clientCredentialMethod,

            string clientId,

            string clientSecretSettingName,

            string issuerEndpoint,

            string name,

            string nameClaimType,

            string openidConfigurationEndpoint,

            ImmutableArray<string> scopes,

            string tokenEndpoint)
        {
            AuthorisationEndpoint = authorisationEndpoint;
            CertificationUri = certificationUri;
            ClientCredentialMethod = clientCredentialMethod;
            ClientId = clientId;
            ClientSecretSettingName = clientSecretSettingName;
            IssuerEndpoint = issuerEndpoint;
            Name = name;
            NameClaimType = nameClaimType;
            OpenidConfigurationEndpoint = openidConfigurationEndpoint;
            Scopes = scopes;
            TokenEndpoint = tokenEndpoint;
        }
    }
}
