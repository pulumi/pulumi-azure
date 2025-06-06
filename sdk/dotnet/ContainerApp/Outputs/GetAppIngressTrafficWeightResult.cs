// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class GetAppIngressTrafficWeightResult
    {
        /// <summary>
        /// The label to apply to the revision as a name prefix for routing traffic.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// This traffic Weight relates to the latest stable Container Revision.
        /// </summary>
        public readonly bool LatestRevision;
        /// <summary>
        /// The percentage of traffic which should be sent this revision.
        /// </summary>
        public readonly int Percentage;
        /// <summary>
        /// The suffix string to which this `traffic_weight` applies.
        /// </summary>
        public readonly string RevisionSuffix;

        [OutputConstructor]
        private GetAppIngressTrafficWeightResult(
            string label,

            bool latestRevision,

            int percentage,

            string revisionSuffix)
        {
            Label = label;
            LatestRevision = latestRevision;
            Percentage = percentage;
            RevisionSuffix = revisionSuffix;
        }
    }
}
