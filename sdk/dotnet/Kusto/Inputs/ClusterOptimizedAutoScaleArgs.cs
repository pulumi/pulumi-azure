// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Kusto.Inputs
{

    public sealed class ClusterOptimizedAutoScaleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of allowed instances. Must between `0` and `1000`.
        /// </summary>
        [Input("maximumInstances", required: true)]
        public Input<int> MaximumInstances { get; set; } = null!;

        /// <summary>
        /// The minimum number of allowed instances. Must between `0` and `1000`.
        /// </summary>
        [Input("minimumInstances", required: true)]
        public Input<int> MinimumInstances { get; set; } = null!;

        public ClusterOptimizedAutoScaleArgs()
        {
        }
        public static new ClusterOptimizedAutoScaleArgs Empty => new ClusterOptimizedAutoScaleArgs();
    }
}
