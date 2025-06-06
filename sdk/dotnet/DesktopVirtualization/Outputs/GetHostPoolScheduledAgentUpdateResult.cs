// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DesktopVirtualization.Outputs
{

    [OutputType]
    public sealed class GetHostPoolScheduledAgentUpdateResult
    {
        /// <summary>
        /// Are scheduled updates of the AVD agent components (RDAgent, Geneva Monitoring agent, and side-by-side stack) enabled on session hosts.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// A `schedule` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHostPoolScheduledAgentUpdateScheduleResult> Schedules;
        /// <summary>
        /// The time zone in which the agent update schedule will apply.
        /// </summary>
        public readonly string Timezone;
        /// <summary>
        /// Specifies whether scheduled agent updates should be applied based on the timezone of the affected session host.
        /// </summary>
        public readonly bool UseSessionHostTimezone;

        [OutputConstructor]
        private GetHostPoolScheduledAgentUpdateResult(
            bool enabled,

            ImmutableArray<Outputs.GetHostPoolScheduledAgentUpdateScheduleResult> schedules,

            string timezone,

            bool useSessionHostTimezone)
        {
            Enabled = enabled;
            Schedules = schedules;
            Timezone = timezone;
            UseSessionHostTimezone = useSessionHostTimezone;
        }
    }
}
