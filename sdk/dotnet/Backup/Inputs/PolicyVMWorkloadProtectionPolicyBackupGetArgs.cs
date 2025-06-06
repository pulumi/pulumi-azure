// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Backup.Inputs
{

    public sealed class PolicyVMWorkloadProtectionPolicyBackupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The backup frequency for the VM Workload Backup Policy. Possible values are `Daily` and `Weekly`.
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// The backup frequency in minutes for the VM Workload Backup Policy. Possible values are `15`, `30`, `60`, `120`, `240`, `480`, `720` and `1440`.
        /// </summary>
        [Input("frequencyInMinutes")]
        public Input<int>? FrequencyInMinutes { get; set; }

        /// <summary>
        /// The time of day to perform the backup in 24hour format.
        /// </summary>
        [Input("time")]
        public Input<string>? Time { get; set; }

        [Input("weekdays")]
        private InputList<string>? _weekdays;

        /// <summary>
        /// The days of the week to perform backups on. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`. This is used when `frequency` is `Weekly`.
        /// </summary>
        public InputList<string> Weekdays
        {
            get => _weekdays ?? (_weekdays = new InputList<string>());
            set => _weekdays = value;
        }

        public PolicyVMWorkloadProtectionPolicyBackupGetArgs()
        {
        }
        public static new PolicyVMWorkloadProtectionPolicyBackupGetArgs Empty => new PolicyVMWorkloadProtectionPolicyBackupGetArgs();
    }
}
