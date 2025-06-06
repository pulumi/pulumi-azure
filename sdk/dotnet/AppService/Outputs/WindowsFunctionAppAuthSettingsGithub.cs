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
    public sealed class WindowsFunctionAppAuthSettingsGithub
    {
        /// <summary>
        /// The ID of the GitHub app used for login.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The Client Secret of the GitHub app used for GitHub login. Cannot be specified with `client_secret_setting_name`.
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// The app setting name that contains the `client_secret` value used for GitHub login. Cannot be specified with `client_secret`.
        /// </summary>
        public readonly string? ClientSecretSettingName;
        /// <summary>
        /// Specifies a list of OAuth 2.0 scopes that will be requested as part of GitHub login authentication.
        /// </summary>
        public readonly ImmutableArray<string> OauthScopes;

        [OutputConstructor]
        private WindowsFunctionAppAuthSettingsGithub(
            string clientId,

            string? clientSecret,

            string? clientSecretSettingName,

            ImmutableArray<string> oauthScopes)
        {
            ClientId = clientId;
            ClientSecret = clientSecret;
            ClientSecretSettingName = clientSecretSettingName;
            OauthScopes = oauthScopes;
        }
    }
}
