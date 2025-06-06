// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Inputs
{

    public sealed class AlertRuleScheduledAlertDetailsOverrideDynamicPropertyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the dynamic property. Possible Values are `AlertLink`, `ConfidenceLevel`, `ConfidenceScore`, `ExtendedLinks`, `ProductComponentName`, `ProductName`, `ProviderName`, `RemediationSteps` and `Techniques`.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The value of the dynamic property. Pssible Values are `Caller`, `dcount_ResourceId` and `EventSubmissionTimestamp`.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public AlertRuleScheduledAlertDetailsOverrideDynamicPropertyArgs()
        {
        }
        public static new AlertRuleScheduledAlertDetailsOverrideDynamicPropertyArgs Empty => new AlertRuleScheduledAlertDetailsOverrideDynamicPropertyArgs();
    }
}
