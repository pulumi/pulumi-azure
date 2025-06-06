// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppConfiguration.Inputs
{

    public sealed class ConfigurationFeatureTargetingFilterGroupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the group.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Rollout percentage of the group.
        /// </summary>
        [Input("rolloutPercentage", required: true)]
        public Input<int> RolloutPercentage { get; set; } = null!;

        public ConfigurationFeatureTargetingFilterGroupGetArgs()
        {
        }
        public static new ConfigurationFeatureTargetingFilterGroupGetArgs Empty => new ConfigurationFeatureTargetingFilterGroupGetArgs();
    }
}
