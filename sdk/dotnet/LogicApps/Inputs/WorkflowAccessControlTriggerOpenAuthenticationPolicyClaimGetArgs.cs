// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogicApps.Inputs
{

    public sealed class WorkflowAccessControlTriggerOpenAuthenticationPolicyClaimGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the OAuth policy claim for the Logic App Workflow.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The value of the OAuth policy claim for the Logic App Workflow.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public WorkflowAccessControlTriggerOpenAuthenticationPolicyClaimGetArgs()
        {
        }
        public static new WorkflowAccessControlTriggerOpenAuthenticationPolicyClaimGetArgs Empty => new WorkflowAccessControlTriggerOpenAuthenticationPolicyClaimGetArgs();
    }
}
