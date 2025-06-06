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
    public sealed class SpringCloudServiceConfigServerGitSetting
    {
        /// <summary>
        /// A `http_basic_auth` block as defined below.
        /// </summary>
        public readonly Outputs.SpringCloudServiceConfigServerGitSettingHttpBasicAuth? HttpBasicAuth;
        /// <summary>
        /// The default label of the Git repository, should be the branch name, tag name, or commit-id of the repository.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// One or more `repository` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.SpringCloudServiceConfigServerGitSettingRepository> Repositories;
        /// <summary>
        /// An array of strings used to search subdirectories of the Git repository.
        /// </summary>
        public readonly ImmutableArray<string> SearchPaths;
        /// <summary>
        /// A `ssh_auth` block as defined below.
        /// </summary>
        public readonly Outputs.SpringCloudServiceConfigServerGitSettingSshAuth? SshAuth;
        /// <summary>
        /// The URI of the default Git repository used as the Config Server back end, should be started with `http://`, `https://`, `git@`, or `ssh://`.
        /// </summary>
        public readonly string Uri;

        [OutputConstructor]
        private SpringCloudServiceConfigServerGitSetting(
            Outputs.SpringCloudServiceConfigServerGitSettingHttpBasicAuth? httpBasicAuth,

            string? label,

            ImmutableArray<Outputs.SpringCloudServiceConfigServerGitSettingRepository> repositories,

            ImmutableArray<string> searchPaths,

            Outputs.SpringCloudServiceConfigServerGitSettingSshAuth? sshAuth,

            string uri)
        {
            HttpBasicAuth = httpBasicAuth;
            Label = label;
            Repositories = repositories;
            SearchPaths = searchPaths;
            SshAuth = sshAuth;
            Uri = uri;
        }
    }
}
