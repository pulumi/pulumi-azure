// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class RegistryEncryptionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The client ID of the managed identity associated with the encryption key.
        /// </summary>
        [Input("identityClientId", required: true)]
        public Input<string> IdentityClientId { get; set; } = null!;

        /// <summary>
        /// The ID of the Key Vault Key.
        /// </summary>
        [Input("keyVaultKeyId", required: true)]
        public Input<string> KeyVaultKeyId { get; set; } = null!;

        public RegistryEncryptionGetArgs()
        {
        }
        public static new RegistryEncryptionGetArgs Empty => new RegistryEncryptionGetArgs();
    }
}
