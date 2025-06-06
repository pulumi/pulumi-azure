// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Inputs
{

    public sealed class HadoopClusterRolesWorkerNodeAutoscaleCapacityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of worker nodes to autoscale to based on the cluster's activity.
        /// </summary>
        [Input("maxInstanceCount", required: true)]
        public Input<int> MaxInstanceCount { get; set; } = null!;

        /// <summary>
        /// The minimum number of worker nodes to autoscale to based on the cluster's activity.
        /// </summary>
        [Input("minInstanceCount", required: true)]
        public Input<int> MinInstanceCount { get; set; } = null!;

        public HadoopClusterRolesWorkerNodeAutoscaleCapacityArgs()
        {
        }
        public static new HadoopClusterRolesWorkerNodeAutoscaleCapacityArgs Empty => new HadoopClusterRolesWorkerNodeAutoscaleCapacityArgs();
    }
}
