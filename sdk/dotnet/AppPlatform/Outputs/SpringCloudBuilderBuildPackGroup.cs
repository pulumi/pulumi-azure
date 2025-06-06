// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Outputs
{

    [OutputType]
    public sealed class SpringCloudBuilderBuildPackGroup
    {
        /// <summary>
        /// Specifies a list of the build pack's ID.
        /// </summary>
        public readonly ImmutableArray<string> BuildPackIds;
        /// <summary>
        /// The name which should be used for this build pack group.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private SpringCloudBuilderBuildPackGroup(
            ImmutableArray<string> buildPackIds,

            string name)
        {
            BuildPackIds = buildPackIds;
            Name = name;
        }
    }
}
