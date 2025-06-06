// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Inputs
{

    public sealed class CredentialServicePrincipalServicePrincipalKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Linked Service to use for the Service Principal Key.
        /// </summary>
        [Input("linkedServiceName", required: true)]
        public Input<string> LinkedServiceName { get; set; } = null!;

        /// <summary>
        /// The name of the Secret in the Key Vault.
        /// </summary>
        [Input("secretName", required: true)]
        public Input<string> SecretName { get; set; } = null!;

        /// <summary>
        /// The version of the Secret in the Key Vault.
        /// </summary>
        [Input("secretVersion")]
        public Input<string>? SecretVersion { get; set; }

        public CredentialServicePrincipalServicePrincipalKeyArgs()
        {
        }
        public static new CredentialServicePrincipalServicePrincipalKeyArgs Empty => new CredentialServicePrincipalServicePrincipalKeyArgs();
    }
}
