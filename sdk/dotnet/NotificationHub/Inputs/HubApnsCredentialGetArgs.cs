// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NotificationHub.Inputs
{

    public sealed class HubApnsCredentialGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
        /// </summary>
        [Input("applicationMode", required: true)]
        public Input<string> ApplicationMode { get; set; } = null!;

        /// <summary>
        /// The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
        /// </summary>
        [Input("bundleId", required: true)]
        public Input<string> BundleId { get; set; } = null!;

        /// <summary>
        /// The Apple Push Notifications Service (APNS) Key.
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        /// <summary>
        /// The ID of the team the Token.
        /// </summary>
        [Input("teamId", required: true)]
        public Input<string> TeamId { get; set; } = null!;

        [Input("token", required: true)]
        private Input<string>? _token;

        /// <summary>
        /// The Push Token associated with the Apple Developer Account. This is the contents of the `key` downloaded from [the Apple Developer Portal](https://developer.apple.com/account/ios/authkey/) between the `-----BEGIN PRIVATE KEY-----` and `-----END PRIVATE KEY-----` blocks.
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public HubApnsCredentialGetArgs()
        {
        }
        public static new HubApnsCredentialGetArgs Empty => new HubApnsCredentialGetArgs();
    }
}
