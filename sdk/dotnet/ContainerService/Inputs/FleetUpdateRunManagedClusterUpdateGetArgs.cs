// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class FleetUpdateRunManagedClusterUpdateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `node_image_selection` block as defined below.
        /// </summary>
        [Input("nodeImageSelection")]
        public Input<Inputs.FleetUpdateRunManagedClusterUpdateNodeImageSelectionGetArgs>? NodeImageSelection { get; set; }

        /// <summary>
        /// A `upgrade` block as defined below.
        /// </summary>
        [Input("upgrade", required: true)]
        public Input<Inputs.FleetUpdateRunManagedClusterUpdateUpgradeGetArgs> Upgrade { get; set; } = null!;

        public FleetUpdateRunManagedClusterUpdateGetArgs()
        {
        }
        public static new FleetUpdateRunManagedClusterUpdateGetArgs Empty => new FleetUpdateRunManagedClusterUpdateGetArgs();
    }
}
