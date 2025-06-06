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
    public sealed class LinuxFunctionAppAuthSettingsV2AppleV2
    {
        /// <summary>
        /// The OpenID Connect Client ID for the Apple web application.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The app setting name that contains the `client_secret` value used for Apple Login.
        /// 
        /// !&gt; **Note:** A setting with this name must exist in `app_settings` to function correctly.
        /// </summary>
        public readonly string ClientSecretSettingName;
        /// <summary>
        /// A list of Login Scopes provided by this Authentication Provider.
        /// 
        /// &gt; **Note:** This is configured on the Authentication Provider side and is Read Only here.
        /// </summary>
        public readonly ImmutableArray<string> LoginScopes;

        [OutputConstructor]
        private LinuxFunctionAppAuthSettingsV2AppleV2(
            string clientId,

            string clientSecretSettingName,

            ImmutableArray<string> loginScopes)
        {
            ClientId = clientId;
            ClientSecretSettingName = clientSecretSettingName;
            LoginScopes = loginScopes;
        }
    }
}
