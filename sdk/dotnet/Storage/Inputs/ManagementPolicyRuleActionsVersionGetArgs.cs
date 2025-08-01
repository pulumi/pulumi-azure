// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class ManagementPolicyRuleActionsVersionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The age in days after creation to tier blob version to archive storage. Must be between `0` and `99999`. Defaults to `-1`.
        /// </summary>
        [Input("changeTierToArchiveAfterDaysSinceCreation")]
        public Input<int>? ChangeTierToArchiveAfterDaysSinceCreation { get; set; }

        /// <summary>
        /// The age in days creation create to tier blob version to cool storage. Must be between `0` and `99999`. Defaults to `-1`.
        /// </summary>
        [Input("changeTierToCoolAfterDaysSinceCreation")]
        public Input<int>? ChangeTierToCoolAfterDaysSinceCreation { get; set; }

        /// <summary>
        /// The age in days after creation to delete the blob version. Must be between `0` and `99999`. Defaults to `-1`.
        /// </summary>
        [Input("deleteAfterDaysSinceCreation")]
        public Input<int>? DeleteAfterDaysSinceCreation { get; set; }

        /// <summary>
        /// The age in days after last tier change to the blobs to skip to be archived. Must be between `0` and `99999`. Defaults to `-1`.
        /// </summary>
        [Input("tierToArchiveAfterDaysSinceLastTierChangeGreaterThan")]
        public Input<int>? TierToArchiveAfterDaysSinceLastTierChangeGreaterThan { get; set; }

        /// <summary>
        /// The age in days after creation to cold storage. Supports blob currently at Hot tier. Must be between `0` and `99999`. Defaults to `-1`.
        /// </summary>
        [Input("tierToColdAfterDaysSinceCreationGreaterThan")]
        public Input<int>? TierToColdAfterDaysSinceCreationGreaterThan { get; set; }

        public ManagementPolicyRuleActionsVersionGetArgs()
        {
        }
        public static new ManagementPolicyRuleActionsVersionGetArgs Empty => new ManagementPolicyRuleActionsVersionGetArgs();
    }
}
