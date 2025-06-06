// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class WindowsWebAppAuthSettingsV2MicrosoftV2Args : global::Pulumi.ResourceArgs
    {
        [Input("allowedAudiences")]
        private InputList<string>? _allowedAudiences;

        /// <summary>
        /// Specifies a list of Allowed Audiences that will be requested as part of Microsoft Sign-In authentication.
        /// </summary>
        public InputList<string> AllowedAudiences
        {
            get => _allowedAudiences ?? (_allowedAudiences = new InputList<string>());
            set => _allowedAudiences = value;
        }

        /// <summary>
        /// The OAuth 2.0 client ID that was created for the app used for authentication.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication.
        /// 
        /// !&gt; **Note:** A setting with this name must exist in `app_settings` to function correctly.
        /// </summary>
        [Input("clientSecretSettingName", required: true)]
        public Input<string> ClientSecretSettingName { get; set; } = null!;

        [Input("loginScopes")]
        private InputList<string>? _loginScopes;

        /// <summary>
        /// The list of Login scopes that should be requested as part of Microsoft Account authentication.
        /// </summary>
        public InputList<string> LoginScopes
        {
            get => _loginScopes ?? (_loginScopes = new InputList<string>());
            set => _loginScopes = value;
        }

        public WindowsWebAppAuthSettingsV2MicrosoftV2Args()
        {
        }
        public static new WindowsWebAppAuthSettingsV2MicrosoftV2Args Empty => new WindowsWebAppAuthSettingsV2MicrosoftV2Args();
    }
}
