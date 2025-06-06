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
    public sealed class GetLinuxWebAppAuthSettingResult
    {
        /// <summary>
        /// A `active_directory` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppAuthSettingActiveDirectoryResult> ActiveDirectories;
        /// <summary>
        /// A `additional_login_parameters` block as defined above.
        /// </summary>
        public readonly ImmutableDictionary<string, string> AdditionalLoginParameters;
        /// <summary>
        /// External URLs that can be redirected to as part of logging in or logging out of the app.
        /// </summary>
        public readonly ImmutableArray<string> AllowedExternalRedirectUrls;
        /// <summary>
        /// The Default Authentication Provider used when more than one Authentication Provider is configured and the `unauthenticated_action` is set to `RedirectToLoginPage`.
        /// </summary>
        public readonly string DefaultProvider;
        /// <summary>
        /// Is the Backup enabled?
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// A `facebook` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppAuthSettingFacebookResult> Facebooks;
        /// <summary>
        /// A `github` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppAuthSettingGithubResult> Githubs;
        /// <summary>
        /// A `google` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppAuthSettingGoogleResult> Googles;
        /// <summary>
        /// The OpenID Connect Issuer URI that represents the entity which issues access tokens for this Linux Web App.
        /// </summary>
        public readonly string Issuer;
        /// <summary>
        /// A `microsoft` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppAuthSettingMicrosoftResult> Microsofts;
        /// <summary>
        /// The Runtime Version of the Authentication and Authorisation feature of this App.
        /// </summary>
        public readonly string RuntimeVersion;
        /// <summary>
        /// The number of hours after session token expiration that a session token can be used to call the token refresh API.
        /// </summary>
        public readonly double TokenRefreshExtensionHours;
        /// <summary>
        /// Is the Token Store configuration Enabled.
        /// </summary>
        public readonly bool TokenStoreEnabled;
        /// <summary>
        /// A `twitter` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxWebAppAuthSettingTwitterResult> Twitters;
        /// <summary>
        /// The action to take when an unauthenticated client attempts to access the app.
        /// </summary>
        public readonly string UnauthenticatedClientAction;

        [OutputConstructor]
        private GetLinuxWebAppAuthSettingResult(
            ImmutableArray<Outputs.GetLinuxWebAppAuthSettingActiveDirectoryResult> activeDirectories,

            ImmutableDictionary<string, string> additionalLoginParameters,

            ImmutableArray<string> allowedExternalRedirectUrls,

            string defaultProvider,

            bool enabled,

            ImmutableArray<Outputs.GetLinuxWebAppAuthSettingFacebookResult> facebooks,

            ImmutableArray<Outputs.GetLinuxWebAppAuthSettingGithubResult> githubs,

            ImmutableArray<Outputs.GetLinuxWebAppAuthSettingGoogleResult> googles,

            string issuer,

            ImmutableArray<Outputs.GetLinuxWebAppAuthSettingMicrosoftResult> microsofts,

            string runtimeVersion,

            double tokenRefreshExtensionHours,

            bool tokenStoreEnabled,

            ImmutableArray<Outputs.GetLinuxWebAppAuthSettingTwitterResult> twitters,

            string unauthenticatedClientAction)
        {
            ActiveDirectories = activeDirectories;
            AdditionalLoginParameters = additionalLoginParameters;
            AllowedExternalRedirectUrls = allowedExternalRedirectUrls;
            DefaultProvider = defaultProvider;
            Enabled = enabled;
            Facebooks = facebooks;
            Githubs = githubs;
            Googles = googles;
            Issuer = issuer;
            Microsofts = microsofts;
            RuntimeVersion = runtimeVersion;
            TokenRefreshExtensionHours = tokenRefreshExtensionHours;
            TokenStoreEnabled = tokenStoreEnabled;
            Twitters = twitters;
            UnauthenticatedClientAction = unauthenticatedClientAction;
        }
    }
}
