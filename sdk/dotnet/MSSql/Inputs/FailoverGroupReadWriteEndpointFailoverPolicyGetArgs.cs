// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Inputs
{

    public sealed class FailoverGroupReadWriteEndpointFailoverPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The grace period in minutes, before failover with data loss is attempted for the read-write endpoint. Required when `mode` is `Automatic`.
        /// </summary>
        [Input("graceMinutes")]
        public Input<int>? GraceMinutes { get; set; }

        /// <summary>
        /// The failover policy of the read-write endpoint for the failover group. Possible values are `Automatic` or `Manual`.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        public FailoverGroupReadWriteEndpointFailoverPolicyGetArgs()
        {
        }
        public static new FailoverGroupReadWriteEndpointFailoverPolicyGetArgs Empty => new FailoverGroupReadWriteEndpointFailoverPolicyGetArgs();
    }
}
