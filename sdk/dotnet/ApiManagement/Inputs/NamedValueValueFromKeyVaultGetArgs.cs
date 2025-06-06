// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class NamedValueValueFromKeyVaultGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The client ID of User Assigned Identity, for the API Management Service, which will be used to access the key vault secret. The System Assigned Identity will be used in absence.
        /// </summary>
        [Input("identityClientId")]
        public Input<string>? IdentityClientId { get; set; }

        /// <summary>
        /// The resource ID of the Key Vault Secret.
        /// </summary>
        [Input("secretId", required: true)]
        public Input<string> SecretId { get; set; } = null!;

        public NamedValueValueFromKeyVaultGetArgs()
        {
        }
        public static new NamedValueValueFromKeyVaultGetArgs Empty => new NamedValueValueFromKeyVaultGetArgs();
    }
}
