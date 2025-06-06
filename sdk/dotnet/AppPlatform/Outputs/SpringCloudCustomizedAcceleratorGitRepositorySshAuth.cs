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
    public sealed class SpringCloudCustomizedAcceleratorGitRepositorySshAuth
    {
        /// <summary>
        /// Specifies the Public SSH Key of git repository basic auth.
        /// </summary>
        public readonly string? HostKey;
        /// <summary>
        /// Specifies the SSH Key algorithm of git repository basic auth.
        /// </summary>
        public readonly string? HostKeyAlgorithm;
        /// <summary>
        /// Specifies the Private SSH Key of git repository basic auth.
        /// </summary>
        public readonly string PrivateKey;

        [OutputConstructor]
        private SpringCloudCustomizedAcceleratorGitRepositorySshAuth(
            string? hostKey,

            string? hostKeyAlgorithm,

            string privateKey)
        {
            HostKey = hostKey;
            HostKeyAlgorithm = hostKeyAlgorithm;
            PrivateKey = privateKey;
        }
    }
}
