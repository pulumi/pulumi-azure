// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation.Inputs
{

    public sealed class SoftwareUpdateConfigurationScheduleMonthlyOccurrenceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Day of the occurrence. Must be one of `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`.
        /// </summary>
        [Input("day", required: true)]
        public Input<string> Day { get; set; } = null!;

        /// <summary>
        /// Occurrence of the week within the month. Must be between `1` and `5`. `-1` for last week within the month.
        /// </summary>
        [Input("occurrence", required: true)]
        public Input<int> Occurrence { get; set; } = null!;

        public SoftwareUpdateConfigurationScheduleMonthlyOccurrenceGetArgs()
        {
        }
        public static new SoftwareUpdateConfigurationScheduleMonthlyOccurrenceGetArgs Empty => new SoftwareUpdateConfigurationScheduleMonthlyOccurrenceGetArgs();
    }
}