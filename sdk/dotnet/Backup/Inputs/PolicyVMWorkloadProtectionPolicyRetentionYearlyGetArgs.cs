// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Backup.Inputs
{

    public sealed class PolicyVMWorkloadProtectionPolicyRetentionYearlyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of yearly backups to keep. Possible values are between `1` and `99`
        /// </summary>
        [Input("count", required: true)]
        public Input<int> Count { get; set; } = null!;

        /// <summary>
        /// The retention schedule format type for yearly retention policy. Possible values are `Daily` and `Weekly`.
        /// </summary>
        [Input("formatType", required: true)]
        public Input<string> FormatType { get; set; } = null!;

        [Input("monthdays")]
        private InputList<int>? _monthdays;

        /// <summary>
        /// The monthday backups to retain. Possible values are between `0` and `28`.
        /// </summary>
        public InputList<int> Monthdays
        {
            get => _monthdays ?? (_monthdays = new InputList<int>());
            set => _monthdays = value;
        }

        [Input("months", required: true)]
        private InputList<string>? _months;

        /// <summary>
        /// The months of the year to retain backups of. Possible values are `January`, `February`, `March`, `April`, `May`, `June`, `July`, `August`, `September`, `October`, `November` and `December`.
        /// </summary>
        public InputList<string> Months
        {
            get => _months ?? (_months = new InputList<string>());
            set => _months = value;
        }

        [Input("weekdays")]
        private InputList<string>? _weekdays;

        /// <summary>
        /// The weekday backups to retain. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
        /// </summary>
        public InputList<string> Weekdays
        {
            get => _weekdays ?? (_weekdays = new InputList<string>());
            set => _weekdays = value;
        }

        [Input("weeks")]
        private InputList<string>? _weeks;

        /// <summary>
        /// The weeks of the month to retain backups of. Possible values are `First`, `Second`, `Third`, `Fourth`, `Last`.
        /// </summary>
        public InputList<string> Weeks
        {
            get => _weeks ?? (_weeks = new InputList<string>());
            set => _weeks = value;
        }

        public PolicyVMWorkloadProtectionPolicyRetentionYearlyGetArgs()
        {
        }
        public static new PolicyVMWorkloadProtectionPolicyRetentionYearlyGetArgs Empty => new PolicyVMWorkloadProtectionPolicyRetentionYearlyGetArgs();
    }
}