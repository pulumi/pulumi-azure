// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class AutoscaleSettingProfileRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `metric_trigger` block as defined below.
        /// </summary>
        [Input("metricTrigger", required: true)]
        public Input<Inputs.AutoscaleSettingProfileRuleMetricTriggerArgs> MetricTrigger { get; set; } = null!;

        /// <summary>
        /// A `scale_action` block as defined below.
        /// </summary>
        [Input("scaleAction", required: true)]
        public Input<Inputs.AutoscaleSettingProfileRuleScaleActionArgs> ScaleAction { get; set; } = null!;

        public AutoscaleSettingProfileRuleArgs()
        {
        }
        public static new AutoscaleSettingProfileRuleArgs Empty => new AutoscaleSettingProfileRuleArgs();
    }
}
