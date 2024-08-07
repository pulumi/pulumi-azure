// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lab.Inputs
{

    public sealed class ScheduleRecurrenceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When the recurrence will expire in RFC-3339 format.
        /// </summary>
        [Input("expirationDate", required: true)]
        public Input<string> ExpirationDate { get; set; } = null!;

        /// <summary>
        /// The frequency of the recurrence. Possible values are `Daily` and `Weekly`.
        /// </summary>
        [Input("frequency", required: true)]
        public Input<string> Frequency { get; set; } = null!;

        /// <summary>
        /// The interval to invoke the schedule on. Possible values are between `1` and `365`.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        [Input("weekDays")]
        private InputList<string>? _weekDays;

        /// <summary>
        /// The interval to invoke the schedule on. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
        /// </summary>
        public InputList<string> WeekDays
        {
            get => _weekDays ?? (_weekDays = new InputList<string>());
            set => _weekDays = value;
        }

        public ScheduleRecurrenceGetArgs()
        {
        }
        public static new ScheduleRecurrenceGetArgs Empty => new ScheduleRecurrenceGetArgs();
    }
}
