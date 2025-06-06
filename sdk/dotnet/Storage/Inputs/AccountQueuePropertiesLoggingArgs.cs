// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class AccountQueuePropertiesLoggingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether all delete requests should be logged.
        /// </summary>
        [Input("delete", required: true)]
        public Input<bool> Delete { get; set; } = null!;

        /// <summary>
        /// Indicates whether all read requests should be logged.
        /// </summary>
        [Input("read", required: true)]
        public Input<bool> Read { get; set; } = null!;

        /// <summary>
        /// Specifies the number of days that logs will be retained.
        /// </summary>
        [Input("retentionPolicyDays")]
        public Input<int>? RetentionPolicyDays { get; set; }

        /// <summary>
        /// The version of storage analytics to configure.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        /// <summary>
        /// Indicates whether all write requests should be logged.
        /// </summary>
        [Input("write", required: true)]
        public Input<bool> Write { get; set; } = null!;

        public AccountQueuePropertiesLoggingArgs()
        {
        }
        public static new AccountQueuePropertiesLoggingArgs Empty => new AccountQueuePropertiesLoggingArgs();
    }
}
