// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Consumption.Inputs
{

    public sealed class BudgetSubscriptionFilterGetArgs : Pulumi.ResourceArgs
    {
        [Input("dimensions")]
        private InputList<Inputs.BudgetSubscriptionFilterDimensionGetArgs>? _dimensions;

        /// <summary>
        /// One or more `dimension` blocks as defined below to filter the budget on.
        /// </summary>
        public InputList<Inputs.BudgetSubscriptionFilterDimensionGetArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.BudgetSubscriptionFilterDimensionGetArgs>());
            set => _dimensions = value;
        }

        /// <summary>
        /// A `not` block as defined below to filter the budget on.
        /// </summary>
        [Input("not")]
        public Input<Inputs.BudgetSubscriptionFilterNotGetArgs>? Not { get; set; }

        [Input("tags")]
        private InputList<Inputs.BudgetSubscriptionFilterTagGetArgs>? _tags;

        /// <summary>
        /// One or more `tag` blocks as defined below to filter the budget on.
        /// </summary>
        public InputList<Inputs.BudgetSubscriptionFilterTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.BudgetSubscriptionFilterTagGetArgs>());
            set => _tags = value;
        }

        public BudgetSubscriptionFilterGetArgs()
        {
        }
    }
}