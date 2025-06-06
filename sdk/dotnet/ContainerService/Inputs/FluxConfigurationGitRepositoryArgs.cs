// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class FluxConfigurationGitRepositoryArgs : global::Pulumi.ResourceArgs
    {
        [Input("httpsCaCertBase64")]
        private Input<string>? _httpsCaCertBase64;

        /// <summary>
        /// Specifies the Base64-encoded HTTPS certificate authority contents used to access git private git repositories over HTTPS.
        /// </summary>
        public Input<string>? HttpsCaCertBase64
        {
            get => _httpsCaCertBase64;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _httpsCaCertBase64 = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("httpsKeyBase64")]
        private Input<string>? _httpsKeyBase64;

        /// <summary>
        /// Specifies the Base64-encoded HTTPS personal access token or password that will be used to access the repository.
        /// </summary>
        public Input<string>? HttpsKeyBase64
        {
            get => _httpsKeyBase64;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _httpsKeyBase64 = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the plaintext HTTPS username used to access private git repositories over HTTPS.
        /// </summary>
        [Input("httpsUser")]
        public Input<string>? HttpsUser { get; set; }

        /// <summary>
        /// Specifies the name of a local secret on the Kubernetes cluster to use as the authentication secret rather than the managed or user-provided configuration secrets. It must be between 1 and 63 characters. It can contain only lowercase letters, numbers, and hyphens (-). It must start and end with a lowercase letter or number.
        /// </summary>
        [Input("localAuthReference")]
        public Input<string>? LocalAuthReference { get; set; }

        /// <summary>
        /// Specifies the source reference type for the GitRepository object. Possible values are `branch`, `commit`, `semver` and `tag`.
        /// </summary>
        [Input("referenceType", required: true)]
        public Input<string> ReferenceType { get; set; } = null!;

        /// <summary>
        /// Specifies the source reference value for the GitRepository object.
        /// </summary>
        [Input("referenceValue", required: true)]
        public Input<string> ReferenceValue { get; set; } = null!;

        /// <summary>
        /// Specifies the Base64-encoded known_hosts value containing public SSH keys required to access private git repositories over SSH.
        /// </summary>
        [Input("sshKnownHostsBase64")]
        public Input<string>? SshKnownHostsBase64 { get; set; }

        [Input("sshPrivateKeyBase64")]
        private Input<string>? _sshPrivateKeyBase64;

        /// <summary>
        /// Specifies the Base64-encoded SSH private key in PEM format.
        /// </summary>
        public Input<string>? SshPrivateKeyBase64
        {
            get => _sshPrivateKeyBase64;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshPrivateKeyBase64 = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the interval at which to re-reconcile the cluster git repository source with the remote. Defaults to `600`.
        /// </summary>
        [Input("syncIntervalInSeconds")]
        public Input<int>? SyncIntervalInSeconds { get; set; }

        /// <summary>
        /// Specifies the maximum time to attempt to reconcile the cluster git repository source with the remote. Defaults to `600`.
        /// </summary>
        [Input("timeoutInSeconds")]
        public Input<int>? TimeoutInSeconds { get; set; }

        /// <summary>
        /// Specifies the URL to sync for the flux configuration git repository. It must start with `http://`, `https://`, `git@` or `ssh://`.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public FluxConfigurationGitRepositoryArgs()
        {
        }
        public static new FluxConfigurationGitRepositoryArgs Empty => new FluxConfigurationGitRepositoryArgs();
    }
}
