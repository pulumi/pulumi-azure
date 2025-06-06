// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class GetShareAclAccessPolicyInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time at which this Access Policy is valid until.
        /// </summary>
        [Input("expiry", required: true)]
        public Input<string> Expiry { get; set; } = null!;

        /// <summary>
        /// The permissions which should be associated with this Shared Identifier. Possible value is combination of `r` (read), `w` (write), `d` (delete), and `l` (list).
        /// </summary>
        [Input("permissions", required: true)]
        public Input<string> Permissions { get; set; } = null!;

        /// <summary>
        /// The time at which this Access Policy is valid from.
        /// </summary>
        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        public GetShareAclAccessPolicyInputArgs()
        {
        }
        public static new GetShareAclAccessPolicyInputArgs Empty => new GetShareAclAccessPolicyInputArgs();
    }
}
