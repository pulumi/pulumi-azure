// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Inputs
{

    public sealed class HBaseClusterMetastoresArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `ambari` block as defined below.
        /// </summary>
        [Input("ambari")]
        public Input<Inputs.HBaseClusterMetastoresAmbariArgs>? Ambari { get; set; }

        /// <summary>
        /// A `hive` block as defined below.
        /// </summary>
        [Input("hive")]
        public Input<Inputs.HBaseClusterMetastoresHiveArgs>? Hive { get; set; }

        /// <summary>
        /// An `oozie` block as defined below.
        /// </summary>
        [Input("oozie")]
        public Input<Inputs.HBaseClusterMetastoresOozieArgs>? Oozie { get; set; }

        public HBaseClusterMetastoresArgs()
        {
        }
        public static new HBaseClusterMetastoresArgs Empty => new HBaseClusterMetastoresArgs();
    }
}
