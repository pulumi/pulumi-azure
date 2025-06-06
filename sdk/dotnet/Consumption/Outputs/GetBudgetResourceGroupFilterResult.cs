// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Consumption.Outputs
{

    [OutputType]
    public sealed class GetBudgetResourceGroupFilterResult
    {
        /// <summary>
        /// A `dimension` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBudgetResourceGroupFilterDimensionResult> Dimensions;
        /// <summary>
        /// A `not` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBudgetResourceGroupFilterNotResult> Nots;
        /// <summary>
        /// A `tag` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBudgetResourceGroupFilterTagResult> Tags;

        [OutputConstructor]
        private GetBudgetResourceGroupFilterResult(
            ImmutableArray<Outputs.GetBudgetResourceGroupFilterDimensionResult> dimensions,

            ImmutableArray<Outputs.GetBudgetResourceGroupFilterNotResult> nots,

            ImmutableArray<Outputs.GetBudgetResourceGroupFilterTagResult> tags)
        {
            Dimensions = dimensions;
            Nots = nots;
            Tags = tags;
        }
    }
}
