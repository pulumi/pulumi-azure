// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Inputs
{

    public sealed class InteractiveQueryClusterRolesWorkerNodeAutoscaleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `recurrence` block as defined below.
        /// </summary>
        [Input("recurrence")]
        public Input<Inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceGetArgs>? Recurrence { get; set; }

        public InteractiveQueryClusterRolesWorkerNodeAutoscaleGetArgs()
        {
        }
        public static new InteractiveQueryClusterRolesWorkerNodeAutoscaleGetArgs Empty => new InteractiveQueryClusterRolesWorkerNodeAutoscaleGetArgs();
    }
}
