// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Outputs
{

    [OutputType]
    public sealed class SubscriptionCostManagementViewDatasetSorting
    {
        /// <summary>
        /// Direction of sort. Possible values are `Ascending` and `Descending`.
        /// </summary>
        public readonly string Direction;
        /// <summary>
        /// The name of the column to sort.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private SubscriptionCostManagementViewDatasetSorting(
            string direction,

            string name)
        {
            Direction = direction;
            Name = name;
        }
    }
}
