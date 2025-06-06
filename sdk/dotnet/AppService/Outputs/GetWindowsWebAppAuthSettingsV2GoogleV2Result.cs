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
    public sealed class GetWindowsWebAppAuthSettingsV2GoogleV2Result
    {
        /// <summary>
        /// The list of Allowed Audiences that are be requested as part of Microsoft Sign-In authentication.
        /// </summary>
        public readonly ImmutableArray<string> AllowedAudiences;
        /// <summary>
        /// The OAuth 2.0 client ID used by the app for authentication.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The app setting name containing the OAuth 2.0 client secret used by the app for authentication.
        /// </summary>
        public readonly string ClientSecretSettingName;
        /// <summary>
        /// The list of Login scopes that are requested as part of Microsoft Account authentication.
        /// </summary>
        public readonly ImmutableArray<string> LoginScopes;

        [OutputConstructor]
        private GetWindowsWebAppAuthSettingsV2GoogleV2Result(
            ImmutableArray<string> allowedAudiences,

            string clientId,

            string clientSecretSettingName,

            ImmutableArray<string> loginScopes)
        {
            AllowedAudiences = allowedAudiences;
            ClientId = clientId;
            ClientSecretSettingName = clientSecretSettingName;
            LoginScopes = loginScopes;
        }
    }
}
