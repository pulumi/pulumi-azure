// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class LinuxWebAppSlotAuthSettingsGithubGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the GitHub app used for login.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// The Client Secret of the GitHub app used for GitHub login. Cannot be specified with `client_secret_setting_name`.
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The app setting name that contains the `client_secret` value used for GitHub login. Cannot be specified with `client_secret`.
        /// </summary>
        [Input("clientSecretSettingName")]
        public Input<string>? ClientSecretSettingName { get; set; }

        [Input("oauthScopes")]
        private InputList<string>? _oauthScopes;

        /// <summary>
        /// Specifies a list of OAuth 2.0 scopes that will be requested as part of GitHub login authentication.
        /// </summary>
        public InputList<string> OauthScopes
        {
            get => _oauthScopes ?? (_oauthScopes = new InputList<string>());
            set => _oauthScopes = value;
        }

        public LinuxWebAppSlotAuthSettingsGithubGetArgs()
        {
        }
        public static new LinuxWebAppSlotAuthSettingsGithubGetArgs Empty => new LinuxWebAppSlotAuthSettingsGithubGetArgs();
    }
}
