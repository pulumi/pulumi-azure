// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Datadog.Outputs
{

    [OutputType]
    public sealed class MonitorTagRuleMetricFilter
    {
        /// <summary>
        /// Allowed values Include or Exclude.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// Name of the Tag.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Value of the Tag.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private MonitorTagRuleMetricFilter(
            string action,

            string name,

            string value)
        {
            Action = action;
            Name = name;
            Value = value;
        }
    }
}
