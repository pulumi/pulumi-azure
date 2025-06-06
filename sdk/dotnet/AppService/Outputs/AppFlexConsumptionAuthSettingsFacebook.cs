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
    public sealed class AppFlexConsumptionAuthSettingsFacebook
    {
        /// <summary>
        /// The App ID of the Facebook app used for login.
        /// </summary>
        public readonly string AppId;
        /// <summary>
        /// The App Secret of the Facebook app used for Facebook login. Cannot be specified with `app_secret_setting_name`.
        /// </summary>
        public readonly string? AppSecret;
        /// <summary>
        /// The app setting name that contains the `app_secret` value used for Facebook login. Cannot be specified with `app_secret`.
        /// </summary>
        public readonly string? AppSecretSettingName;
        /// <summary>
        /// Specifies a list of OAuth 2.0 scopes to be requested as part of Facebook login authentication.
        /// </summary>
        public readonly ImmutableArray<string> OauthScopes;

        [OutputConstructor]
        private AppFlexConsumptionAuthSettingsFacebook(
            string appId,

            string? appSecret,

            string? appSecretSettingName,

            ImmutableArray<string> oauthScopes)
        {
            AppId = appId;
            AppSecret = appSecret;
            AppSecretSettingName = appSecretSettingName;
            OauthScopes = oauthScopes;
        }
    }
}
