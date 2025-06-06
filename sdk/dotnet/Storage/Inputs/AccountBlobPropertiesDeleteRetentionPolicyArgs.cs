// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class AccountBlobPropertiesDeleteRetentionPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the number of days that the blob should be retained, between `1` and `365` days. Defaults to `7`.
        /// </summary>
        [Input("days")]
        public Input<int>? Days { get; set; }

        /// <summary>
        /// Indicates whether permanent deletion of the soft deleted blob versions and snapshots is allowed. Defaults to `false`.
        /// 
        /// &gt; **Note:** `permanent_delete_enabled` cannot be set to true if a `restore_policy` block is defined.
        /// </summary>
        [Input("permanentDeleteEnabled")]
        public Input<bool>? PermanentDeleteEnabled { get; set; }

        public AccountBlobPropertiesDeleteRetentionPolicyArgs()
        {
        }
        public static new AccountBlobPropertiesDeleteRetentionPolicyArgs Empty => new AccountBlobPropertiesDeleteRetentionPolicyArgs();
    }
}
