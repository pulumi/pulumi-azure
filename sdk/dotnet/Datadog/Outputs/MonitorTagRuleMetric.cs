// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Datadog.Outputs
{

    [OutputType]
    public sealed class MonitorTagRuleMetric
    {
        /// <summary>
        /// A `filter` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.MonitorTagRuleMetricFilter> Filters;

        [OutputConstructor]
        private MonitorTagRuleMetric(ImmutableArray<Outputs.MonitorTagRuleMetricFilter> filters)
        {
            Filters = filters;
        }
    }
}