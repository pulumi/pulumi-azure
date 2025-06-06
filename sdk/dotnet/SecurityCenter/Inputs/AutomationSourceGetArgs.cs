// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SecurityCenter.Inputs
{

    public sealed class AutomationSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of data that will trigger this automation. Must be one of `Alerts`, `Assessments`, `AssessmentsSnapshot`, `RegulatoryComplianceAssessment`, `RegulatoryComplianceAssessmentSnapshot`, `SecureScoreControls`, `SecureScoreControlsSnapshot`, `SecureScores`, `SecureScoresSnapshot`, `SubAssessments` or `SubAssessmentsSnapshot`. Note. assessments are also referred to as recommendations
        /// </summary>
        [Input("eventSource", required: true)]
        public Input<string> EventSource { get; set; } = null!;

        [Input("ruleSets")]
        private InputList<Inputs.AutomationSourceRuleSetGetArgs>? _ruleSets;

        /// <summary>
        /// A set of rules which evaluate upon event and data interception. This is defined in one or more `rule_set` blocks as defined below.
        /// 
        /// &gt; **Note:** When multiple `rule_set` block are provided, a logical 'OR' is applied to the evaluation of them.
        /// </summary>
        public InputList<Inputs.AutomationSourceRuleSetGetArgs> RuleSets
        {
            get => _ruleSets ?? (_ruleSets = new InputList<Inputs.AutomationSourceRuleSetGetArgs>());
            set => _ruleSets = value;
        }

        public AutomationSourceGetArgs()
        {
        }
        public static new AutomationSourceGetArgs Empty => new AutomationSourceGetArgs();
    }
}
