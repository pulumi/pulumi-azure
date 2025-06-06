// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Inputs
{

    public sealed class SpringCloudConfigurationServiceRepositoryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the ID of the Certificate Authority used when retrieving the Git Repository via HTTPS.
        /// </summary>
        [Input("caCertificateId")]
        public Input<string>? CaCertificateId { get; set; }

        /// <summary>
        /// Specifies the SSH public key of git repository.
        /// </summary>
        [Input("hostKey")]
        public Input<string>? HostKey { get; set; }

        /// <summary>
        /// Specifies the SSH key algorithm of git repository.
        /// </summary>
        [Input("hostKeyAlgorithm")]
        public Input<string>? HostKeyAlgorithm { get; set; }

        /// <summary>
        /// Specifies the label of the repository.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this repository.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Specifies the password of git repository basic auth.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("patterns", required: true)]
        private InputList<string>? _patterns;

        /// <summary>
        /// Specifies the collection of patterns of the repository.
        /// </summary>
        public InputList<string> Patterns
        {
            get => _patterns ?? (_patterns = new InputList<string>());
            set => _patterns = value;
        }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// Specifies the SSH private key of git repository.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("searchPaths")]
        private InputList<string>? _searchPaths;

        /// <summary>
        /// Specifies a list of searching path of the repository
        /// </summary>
        public InputList<string> SearchPaths
        {
            get => _searchPaths ?? (_searchPaths = new InputList<string>());
            set => _searchPaths = value;
        }

        /// <summary>
        /// Specifies whether enable the strict host key checking.
        /// </summary>
        [Input("strictHostKeyChecking")]
        public Input<bool>? StrictHostKeyChecking { get; set; }

        /// <summary>
        /// Specifies the URI of the repository.
        /// </summary>
        [Input("uri", required: true)]
        public Input<string> Uri { get; set; } = null!;

        /// <summary>
        /// Specifies the username of git repository basic auth.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public SpringCloudConfigurationServiceRepositoryArgs()
        {
        }
        public static new SpringCloudConfigurationServiceRepositoryArgs Empty => new SpringCloudConfigurationServiceRepositoryArgs();
    }
}
