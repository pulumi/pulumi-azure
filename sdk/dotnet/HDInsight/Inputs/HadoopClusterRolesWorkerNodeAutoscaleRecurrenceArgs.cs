// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Inputs
{

    public sealed class HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs : global::Pulumi.ResourceArgs
    {
        [Input("schedules", required: true)]
        private InputList<Inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs>? _schedules;

        /// <summary>
        /// A list of `schedule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs> Schedules
        {
            get => _schedules ?? (_schedules = new InputList<Inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs>());
            set => _schedules = value;
        }

        /// <summary>
        /// The time zone for the autoscale schedule times.
        /// </summary>
        [Input("timezone", required: true)]
        public Input<string> Timezone { get; set; } = null!;

        public HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs()
        {
        }
        public static new HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs Empty => new HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs();
    }
}
