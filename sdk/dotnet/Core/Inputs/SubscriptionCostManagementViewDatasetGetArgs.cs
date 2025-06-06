// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Inputs
{

    public sealed class SubscriptionCostManagementViewDatasetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("aggregations", required: true)]
        private InputList<Inputs.SubscriptionCostManagementViewDatasetAggregationGetArgs>? _aggregations;

        /// <summary>
        /// One or more `aggregation` blocks as defined above.
        /// </summary>
        public InputList<Inputs.SubscriptionCostManagementViewDatasetAggregationGetArgs> Aggregations
        {
            get => _aggregations ?? (_aggregations = new InputList<Inputs.SubscriptionCostManagementViewDatasetAggregationGetArgs>());
            set => _aggregations = value;
        }

        /// <summary>
        /// The granularity of rows in the report. Possible values are `Daily` and `Monthly`.
        /// </summary>
        [Input("granularity", required: true)]
        public Input<string> Granularity { get; set; } = null!;

        [Input("groupings")]
        private InputList<Inputs.SubscriptionCostManagementViewDatasetGroupingGetArgs>? _groupings;

        /// <summary>
        /// One or more `grouping` blocks as defined below.
        /// </summary>
        public InputList<Inputs.SubscriptionCostManagementViewDatasetGroupingGetArgs> Groupings
        {
            get => _groupings ?? (_groupings = new InputList<Inputs.SubscriptionCostManagementViewDatasetGroupingGetArgs>());
            set => _groupings = value;
        }

        [Input("sortings")]
        private InputList<Inputs.SubscriptionCostManagementViewDatasetSortingGetArgs>? _sortings;

        /// <summary>
        /// One or more `sorting` blocks as defined below, containing the order by expression to be used in the report
        /// </summary>
        public InputList<Inputs.SubscriptionCostManagementViewDatasetSortingGetArgs> Sortings
        {
            get => _sortings ?? (_sortings = new InputList<Inputs.SubscriptionCostManagementViewDatasetSortingGetArgs>());
            set => _sortings = value;
        }

        public SubscriptionCostManagementViewDatasetGetArgs()
        {
        }
        public static new SubscriptionCostManagementViewDatasetGetArgs Empty => new SubscriptionCostManagementViewDatasetGetArgs();
    }
}
