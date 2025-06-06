// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class LinuxWebAppSlotAuthSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `active_directory` block as defined above.
        /// </summary>
        [Input("activeDirectory")]
        public Input<Inputs.LinuxWebAppSlotAuthSettingsActiveDirectoryGetArgs>? ActiveDirectory { get; set; }

        [Input("additionalLoginParameters")]
        private InputMap<string>? _additionalLoginParameters;

        /// <summary>
        /// Specifies a map of login Parameters to send to the OpenID Connect authorization endpoint when a user logs in.
        /// </summary>
        public InputMap<string> AdditionalLoginParameters
        {
            get => _additionalLoginParameters ?? (_additionalLoginParameters = new InputMap<string>());
            set => _additionalLoginParameters = value;
        }

        [Input("allowedExternalRedirectUrls")]
        private InputList<string>? _allowedExternalRedirectUrls;

        /// <summary>
        /// Specifies a list of External URLs that can be redirected to as part of logging in or logging out of the Linux Web App.
        /// </summary>
        public InputList<string> AllowedExternalRedirectUrls
        {
            get => _allowedExternalRedirectUrls ?? (_allowedExternalRedirectUrls = new InputList<string>());
            set => _allowedExternalRedirectUrls = value;
        }

        /// <summary>
        /// The default authentication provider to use when multiple providers are configured. Possible values include: `BuiltInAuthenticationProviderAzureActiveDirectory`, `BuiltInAuthenticationProviderFacebook`, `BuiltInAuthenticationProviderGoogle`, `BuiltInAuthenticationProviderMicrosoftAccount`, `BuiltInAuthenticationProviderTwitter`, `BuiltInAuthenticationProviderGithub`
        /// 
        /// &gt; **Note:** This setting is only needed if multiple providers are configured, and the `unauthenticated_client_action` is set to "RedirectToLoginPage".
        /// </summary>
        [Input("defaultProvider")]
        public Input<string>? DefaultProvider { get; set; }

        /// <summary>
        /// Should the Authentication / Authorization feature be enabled for the Linux Web App?
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// A `facebook` block as defined below.
        /// </summary>
        [Input("facebook")]
        public Input<Inputs.LinuxWebAppSlotAuthSettingsFacebookGetArgs>? Facebook { get; set; }

        /// <summary>
        /// A `github` block as defined below.
        /// </summary>
        [Input("github")]
        public Input<Inputs.LinuxWebAppSlotAuthSettingsGithubGetArgs>? Github { get; set; }

        /// <summary>
        /// A `google` block as defined below.
        /// </summary>
        [Input("google")]
        public Input<Inputs.LinuxWebAppSlotAuthSettingsGoogleGetArgs>? Google { get; set; }

        /// <summary>
        /// The OpenID Connect Issuer URI that represents the entity that issues access tokens for this Linux Web App.
        /// 
        /// &gt; **Note:** When using Azure Active Directory, this value is the URI of the directory tenant, e.g. &lt;https://sts.windows.net/{tenant-guid}/&gt;.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// A `microsoft` block as defined below.
        /// </summary>
        [Input("microsoft")]
        public Input<Inputs.LinuxWebAppSlotAuthSettingsMicrosoftGetArgs>? Microsoft { get; set; }

        /// <summary>
        /// The RuntimeVersion of the Authentication / Authorization feature in use for the Linux Web App.
        /// </summary>
        [Input("runtimeVersion")]
        public Input<string>? RuntimeVersion { get; set; }

        /// <summary>
        /// The number of hours after session token expiration that a session token can be used to call the token refresh API. Defaults to `72` hours.
        /// </summary>
        [Input("tokenRefreshExtensionHours")]
        public Input<double>? TokenRefreshExtensionHours { get; set; }

        /// <summary>
        /// Should the Linux Web App durably store platform-specific security tokens that are obtained during login flows? Defaults to `false`.
        /// </summary>
        [Input("tokenStoreEnabled")]
        public Input<bool>? TokenStoreEnabled { get; set; }

        /// <summary>
        /// A `twitter` block as defined below.
        /// </summary>
        [Input("twitter")]
        public Input<Inputs.LinuxWebAppSlotAuthSettingsTwitterGetArgs>? Twitter { get; set; }

        /// <summary>
        /// The action to take when an unauthenticated client attempts to access the app. Possible values include: `RedirectToLoginPage`, `AllowAnonymous`.
        /// </summary>
        [Input("unauthenticatedClientAction")]
        public Input<string>? UnauthenticatedClientAction { get; set; }

        public LinuxWebAppSlotAuthSettingsGetArgs()
        {
        }
        public static new LinuxWebAppSlotAuthSettingsGetArgs Empty => new LinuxWebAppSlotAuthSettingsGetArgs();
    }
}
