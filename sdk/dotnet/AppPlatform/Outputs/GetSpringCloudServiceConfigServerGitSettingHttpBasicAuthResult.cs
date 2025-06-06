// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Outputs
{

    [OutputType]
    public sealed class GetSpringCloudServiceConfigServerGitSettingHttpBasicAuthResult
    {
        /// <summary>
        /// The password used to access the HTTP Basic Authentication Git repository server.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The username used to access the HTTP Basic Authentication Git repository server.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetSpringCloudServiceConfigServerGitSettingHttpBasicAuthResult(
            string password,

            string username)
        {
            Password = password;
            Username = username;
        }
    }
}
