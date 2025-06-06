// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Oracle.Outputs
{

    [OutputType]
    public sealed class GetCloudVmClusterIormConfigCachResult
    {
        /// <summary>
        /// A `db_plans` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudVmClusterIormConfigCachDbPlanResult> DbPlans;
        /// <summary>
        /// Additional information about the current `lifecycleState`.
        /// </summary>
        public readonly string LifecycleDetails;
        /// <summary>
        /// The current state of IORM configuration for the Exadata DB system.
        /// </summary>
        public readonly string LifecycleState;
        /// <summary>
        /// The current value for the IORM objective. The default is `AUTO`.
        /// </summary>
        public readonly string Objective;

        [OutputConstructor]
        private GetCloudVmClusterIormConfigCachResult(
            ImmutableArray<Outputs.GetCloudVmClusterIormConfigCachDbPlanResult> dbPlans,

            string lifecycleDetails,

            string lifecycleState,

            string objective)
        {
            DbPlans = dbPlans;
            LifecycleDetails = lifecycleDetails;
            LifecycleState = lifecycleState;
            Objective = objective;
        }
    }
}
