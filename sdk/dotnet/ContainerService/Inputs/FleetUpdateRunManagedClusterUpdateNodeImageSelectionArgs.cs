// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class FleetUpdateRunManagedClusterUpdateNodeImageSelectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the node image upgrade type. Possible values are `Latest` and `Consistent`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FleetUpdateRunManagedClusterUpdateNodeImageSelectionArgs()
        {
        }
        public static new FleetUpdateRunManagedClusterUpdateNodeImageSelectionArgs Empty => new FleetUpdateRunManagedClusterUpdateNodeImageSelectionArgs();
    }
}
