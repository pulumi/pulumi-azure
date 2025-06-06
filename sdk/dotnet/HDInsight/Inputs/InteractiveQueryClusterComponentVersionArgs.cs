// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Inputs
{

    public sealed class InteractiveQueryClusterComponentVersionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The version of Interactive Query which should be used for this HDInsight Interactive Query Cluster. Changing this forces a new resource to be created.
        /// </summary>
        [Input("interactiveHive", required: true)]
        public Input<string> InteractiveHive { get; set; } = null!;

        public InteractiveQueryClusterComponentVersionArgs()
        {
        }
        public static new InteractiveQueryClusterComponentVersionArgs Empty => new InteractiveQueryClusterComponentVersionArgs();
    }
}
