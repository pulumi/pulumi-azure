// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterMonitorMetricsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comma-separated list of Kubernetes annotation keys that will be used in the resource's labels metric.
        /// </summary>
        [Input("annotationsAllowed")]
        public Input<string>? AnnotationsAllowed { get; set; }

        /// <summary>
        /// Specifies a Comma-separated list of additional Kubernetes label keys that will be used in the resource's labels metric.
        /// </summary>
        [Input("labelsAllowed")]
        public Input<string>? LabelsAllowed { get; set; }

        public KubernetesClusterMonitorMetricsGetArgs()
        {
        }
        public static new KubernetesClusterMonitorMetricsGetArgs Empty => new KubernetesClusterMonitorMetricsGetArgs();
    }
}