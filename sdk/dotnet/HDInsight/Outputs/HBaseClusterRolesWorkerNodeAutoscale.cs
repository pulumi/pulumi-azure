// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Outputs
{

    [OutputType]
    public sealed class HBaseClusterRolesWorkerNodeAutoscale
    {
        /// <summary>
        /// A `recurrence` block as defined below.
        /// 
        /// &gt; **Note:** Either a `capacity` or `recurrence` block must be specified - but not both.
        /// </summary>
        public readonly Outputs.HBaseClusterRolesWorkerNodeAutoscaleRecurrence? Recurrence;

        [OutputConstructor]
        private HBaseClusterRolesWorkerNodeAutoscale(Outputs.HBaseClusterRolesWorkerNodeAutoscaleRecurrence? recurrence)
        {
            Recurrence = recurrence;
        }
    }
}
