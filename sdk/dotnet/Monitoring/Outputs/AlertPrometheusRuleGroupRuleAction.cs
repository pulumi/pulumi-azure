// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Outputs
{

    [OutputType]
    public sealed class AlertPrometheusRuleGroupRuleAction
    {
        /// <summary>
        /// Specifies the resource id of the monitor action group.
        /// </summary>
        public readonly string ActionGroupId;
        /// <summary>
        /// Specifies the properties of an action group object.
        /// 
        /// &gt; **Note:** `action_properties` can only be configured for IcM Connector Action Groups for now. Other public features will be supported in the future.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? ActionProperties;

        [OutputConstructor]
        private AlertPrometheusRuleGroupRuleAction(
            string actionGroupId,

            ImmutableDictionary<string, string>? actionProperties)
        {
            ActionGroupId = actionGroupId;
            ActionProperties = actionProperties;
        }
    }
}
