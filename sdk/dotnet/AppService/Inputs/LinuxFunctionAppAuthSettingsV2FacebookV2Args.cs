// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class LinuxFunctionAppAuthSettingsV2FacebookV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The App ID of the Facebook app used for login.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The app setting name that contains the `app_secret` value used for Facebook Login.
        /// </summary>
        [Input("appSecretSettingName", required: true)]
        public Input<string> AppSecretSettingName { get; set; } = null!;

        /// <summary>
        /// The version of the Facebook API to be used while logging in.
        /// </summary>
        [Input("graphApiVersion")]
        public Input<string>? GraphApiVersion { get; set; }

        [Input("loginScopes")]
        private InputList<string>? _loginScopes;

        /// <summary>
        /// A list of Login Scopes provided by this Authentication Provider.
        /// </summary>
        public InputList<string> LoginScopes
        {
            get => _loginScopes ?? (_loginScopes = new InputList<string>());
            set => _loginScopes = value;
        }

        public LinuxFunctionAppAuthSettingsV2FacebookV2Args()
        {
        }
        public static new LinuxFunctionAppAuthSettingsV2FacebookV2Args Empty => new LinuxFunctionAppAuthSettingsV2FacebookV2Args();
    }
}