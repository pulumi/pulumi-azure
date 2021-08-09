// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class NamedValueValueFromKeyVaultGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The client ID of the System Assigned Identity, or User Assigned Identity, for the API Management Service, which will be used to access the key vault secret.
        /// </summary>
        [Input("identityClientId", required: true)]
        public Input<string> IdentityClientId { get; set; } = null!;

        /// <summary>
        /// The resource ID of the Key Vault Secret.
        /// </summary>
        [Input("secretId", required: true)]
        public Input<string> SecretId { get; set; } = null!;

        public NamedValueValueFromKeyVaultGetArgs()
        {
        }
    }
}