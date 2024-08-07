// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class RegistryRetentionPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of days to retain an untagged manifest after which it gets purged. Default is `7`.
        /// </summary>
        [Input("days")]
        public Input<int>? Days { get; set; }

        /// <summary>
        /// Boolean value that indicates whether the policy is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public RegistryRetentionPolicyArgs()
        {
        }
        public static new RegistryRetentionPolicyArgs Empty => new RegistryRetentionPolicyArgs();
    }
}
