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
    public sealed class GetSpringCloudServiceConfigServerGitSettingResult
    {
        /// <summary>
        /// A `http_basic_auth` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSpringCloudServiceConfigServerGitSettingHttpBasicAuthResult> HttpBasicAuths;
        /// <summary>
        /// The default label of the Git repository, which is a branch name, tag name, or commit-id of the repository
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// One or more `repository` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSpringCloudServiceConfigServerGitSettingRepositoryResult> Repositories;
        /// <summary>
        /// An array of strings used to search subdirectories of the Git repository.
        /// </summary>
        public readonly ImmutableArray<string> SearchPaths;
        /// <summary>
        /// A `ssh_auth` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSpringCloudServiceConfigServerGitSettingSshAuthResult> SshAuths;
        /// <summary>
        /// The URI of the Git repository
        /// </summary>
        public readonly string Uri;

        [OutputConstructor]
        private GetSpringCloudServiceConfigServerGitSettingResult(
            ImmutableArray<Outputs.GetSpringCloudServiceConfigServerGitSettingHttpBasicAuthResult> httpBasicAuths,

            string label,

            ImmutableArray<Outputs.GetSpringCloudServiceConfigServerGitSettingRepositoryResult> repositories,

            ImmutableArray<string> searchPaths,

            ImmutableArray<Outputs.GetSpringCloudServiceConfigServerGitSettingSshAuthResult> sshAuths,

            string uri)
        {
            HttpBasicAuths = httpBasicAuths;
            Label = label;
            Repositories = repositories;
            SearchPaths = searchPaths;
            SshAuths = sshAuths;
            Uri = uri;
        }
    }
}
