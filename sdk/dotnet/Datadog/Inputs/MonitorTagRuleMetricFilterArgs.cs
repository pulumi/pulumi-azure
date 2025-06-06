// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Datadog.Inputs
{

    public sealed class MonitorTagRuleMetricFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allowed values Include or Exclude.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Name of the Tag.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Value of the Tag.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public MonitorTagRuleMetricFilterArgs()
        {
        }
        public static new MonitorTagRuleMetricFilterArgs Empty => new MonitorTagRuleMetricFilterArgs();
    }
}
