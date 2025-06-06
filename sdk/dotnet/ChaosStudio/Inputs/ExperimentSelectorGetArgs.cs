// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ChaosStudio.Inputs
{

    public sealed class ExperimentSelectorGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("chaosStudioTargetIds", required: true)]
        private InputList<string>? _chaosStudioTargetIds;

        /// <summary>
        /// A list of Chaos Studio Target IDs that should be part of this Selector.
        /// </summary>
        public InputList<string> ChaosStudioTargetIds
        {
            get => _chaosStudioTargetIds ?? (_chaosStudioTargetIds = new InputList<string>());
            set => _chaosStudioTargetIds = value;
        }

        /// <summary>
        /// The name of this Selector.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ExperimentSelectorGetArgs()
        {
        }
        public static new ExperimentSelectorGetArgs Empty => new ExperimentSelectorGetArgs();
    }
}
