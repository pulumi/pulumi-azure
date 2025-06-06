// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterMaintenanceWindowNotAllowedArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The end of a time span, formatted as an RFC3339 string.
        /// </summary>
        [Input("end", required: true)]
        public Input<string> End { get; set; } = null!;

        /// <summary>
        /// The start of a time span, formatted as an RFC3339 string.
        /// </summary>
        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        public KubernetesClusterMaintenanceWindowNotAllowedArgs()
        {
        }
        public static new KubernetesClusterMaintenanceWindowNotAllowedArgs Empty => new KubernetesClusterMaintenanceWindowNotAllowedArgs();
    }
}
