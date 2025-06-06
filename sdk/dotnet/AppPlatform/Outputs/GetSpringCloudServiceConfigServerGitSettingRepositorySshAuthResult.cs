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
    public sealed class GetSpringCloudServiceConfigServerGitSettingRepositorySshAuthResult
    {
        /// <summary>
        /// The host key of the Git repository server.
        /// </summary>
        public readonly string HostKey;
        /// <summary>
        /// The host key algorithm.
        /// </summary>
        public readonly string HostKeyAlgorithm;
        /// <summary>
        /// The SSH private key to access the Git repository, needed when the URI starts with `git@` or `ssh://`.
        /// </summary>
        public readonly string PrivateKey;
        /// <summary>
        /// Indicates whether the Config Server instance will fail to start if the host_key does not match.
        /// </summary>
        public readonly bool StrictHostKeyCheckingEnabled;

        [OutputConstructor]
        private GetSpringCloudServiceConfigServerGitSettingRepositorySshAuthResult(
            string hostKey,

            string hostKeyAlgorithm,

            string privateKey,

            bool strictHostKeyCheckingEnabled)
        {
            HostKey = hostKey;
            HostKeyAlgorithm = hostKeyAlgorithm;
            PrivateKey = privateKey;
            StrictHostKeyCheckingEnabled = strictHostKeyCheckingEnabled;
        }
    }
}
