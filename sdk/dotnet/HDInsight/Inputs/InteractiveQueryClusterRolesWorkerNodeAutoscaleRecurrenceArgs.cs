// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Inputs
{

    public sealed class InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceArgs : global::Pulumi.ResourceArgs
    {
        [Input("schedules", required: true)]
        private InputList<Inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs>? _schedules;

        /// <summary>
        /// A list of `schedule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs> Schedules
        {
            get => _schedules ?? (_schedules = new InputList<Inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs>());
            set => _schedules = value;
        }

        /// <summary>
        /// The time zone for the autoscale schedule times.
        /// </summary>
        [Input("timezone", required: true)]
        public Input<string> Timezone { get; set; } = null!;

        public InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceArgs()
        {
        }
        public static new InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceArgs Empty => new InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceArgs();
    }
}
