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
    public sealed class GetWindowsWebAppAuthSettingsV2TwitterV2Result
    {
        /// <summary>
        /// The OAuth 1.0a consumer key of the Twitter application used for sign-in.
        /// </summary>
        public readonly string ConsumerKey;
        /// <summary>
        /// The app setting name that contains the OAuth 1.0a consumer secret of the Twitter application used for sign-in.
        /// </summary>
        public readonly string ConsumerSecretSettingName;

        [OutputConstructor]
        private GetWindowsWebAppAuthSettingsV2TwitterV2Result(
            string consumerKey,

            string consumerSecretSettingName)
        {
            ConsumerKey = consumerKey;
            ConsumerSecretSettingName = consumerSecretSettingName;
        }
    }
}
