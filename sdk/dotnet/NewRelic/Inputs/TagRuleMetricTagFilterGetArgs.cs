// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NewRelic.Inputs
{

    public sealed class TagRuleMetricTagFilterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Valid actions for a filtering tag. Possible values are `Exclude` and `Include`. Exclusion takes priority over inclusion.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Specifies the name (also known as the key) of the tag.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the value of the tag.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public TagRuleMetricTagFilterGetArgs()
        {
        }
        public static new TagRuleMetricTagFilterGetArgs Empty => new TagRuleMetricTagFilterGetArgs();
    }
}
