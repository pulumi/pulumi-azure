// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Inputs
{

    public sealed class JobSecretArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identity to use for accessing the Key Vault secret reference. This can either be the Resource ID of a User Assigned Identity, or `System` for the System Assigned Identity.
        /// 
        /// !&gt; **Note:** `identity` must be used together with `key_vault_secret_id`
        /// </summary>
        [Input("identity")]
        public Input<string>? Identity { get; set; }

        /// <summary>
        /// The ID of a Key Vault secret. This can be a versioned or version-less ID.
        /// 
        /// !&gt; **Note:** When using `key_vault_secret_id`, `ignore_changes` should be used to ignore any changes to `value`.
        /// </summary>
        [Input("keyVaultSecretId")]
        public Input<string>? KeyVaultSecretId { get; set; }

        /// <summary>
        /// The secret name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("value")]
        private Input<string>? _value;

        /// <summary>
        /// The value for this secret.
        /// 
        /// !&gt; **Note:** `value` will be ignored if `key_vault_secret_id` and `identity` are provided.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public JobSecretArgs()
        {
        }
        public static new JobSecretArgs Empty => new JobSecretArgs();
    }
}
