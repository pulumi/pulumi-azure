// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MachineLearning.Outputs
{

    [OutputType]
    public sealed class ComputeInstanceSsh
    {
        /// <summary>
        /// Describes the port for connecting through SSH.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// Specifies the SSH rsa public key file as a string. Use "ssh-keygen -t rsa -b 2048" to generate your SSH key pairs.
        /// </summary>
        public readonly string PublicKey;
        /// <summary>
        /// The admin username of this Machine Learning Compute Instance.
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private ComputeInstanceSsh(
            int? port,

            string publicKey,

            string? username)
        {
            Port = port;
            PublicKey = publicKey;
            Username = username;
        }
    }
}
