// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Backup.Inputs
{

    public sealed class PolicyVMWorkloadSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The compression setting for the VM Workload Backup Policy. Defaults to `false`.
        /// </summary>
        [Input("compressionEnabled")]
        public Input<bool>? CompressionEnabled { get; set; }

        /// <summary>
        /// The timezone for the VM Workload Backup Policy. [The possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
        /// </summary>
        [Input("timeZone", required: true)]
        public Input<string> TimeZone { get; set; } = null!;

        public PolicyVMWorkloadSettingsArgs()
        {
        }
        public static new PolicyVMWorkloadSettingsArgs Empty => new PolicyVMWorkloadSettingsArgs();
    }
}