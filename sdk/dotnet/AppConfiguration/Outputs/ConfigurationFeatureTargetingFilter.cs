// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppConfiguration.Outputs
{

    [OutputType]
    public sealed class ConfigurationFeatureTargetingFilter
    {
        /// <summary>
        /// A number representing the percentage of the entire user base.
        /// </summary>
        public readonly int DefaultRolloutPercentage;
        /// <summary>
        /// One or more `groups` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ConfigurationFeatureTargetingFilterGroup> Groups;
        /// <summary>
        /// A list of users to target for this feature.
        /// </summary>
        public readonly ImmutableArray<string> Users;

        [OutputConstructor]
        private ConfigurationFeatureTargetingFilter(
            int defaultRolloutPercentage,

            ImmutableArray<Outputs.ConfigurationFeatureTargetingFilterGroup> groups,

            ImmutableArray<string> users)
        {
            DefaultRolloutPercentage = defaultRolloutPercentage;
            Groups = groups;
            Users = users;
        }
    }
}
