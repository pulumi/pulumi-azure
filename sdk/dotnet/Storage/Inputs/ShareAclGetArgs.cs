// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class ShareAclGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessPolicies")]
        private InputList<Inputs.ShareAclAccessPolicyGetArgs>? _accessPolicies;

        /// <summary>
        /// An `access_policy` block as defined below.
        /// </summary>
        public InputList<Inputs.ShareAclAccessPolicyGetArgs> AccessPolicies
        {
            get => _accessPolicies ?? (_accessPolicies = new InputList<Inputs.ShareAclAccessPolicyGetArgs>());
            set => _accessPolicies = value;
        }

        /// <summary>
        /// The ID which should be used for this Shared Identifier.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public ShareAclGetArgs()
        {
        }
        public static new ShareAclGetArgs Empty => new ShareAclGetArgs();
    }
}
