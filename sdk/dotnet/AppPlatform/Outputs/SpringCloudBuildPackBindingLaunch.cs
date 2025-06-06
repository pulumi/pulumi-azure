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
    public sealed class SpringCloudBuildPackBindingLaunch
    {
        /// <summary>
        /// Specifies a map of non-sensitive properties for launchProperties.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Properties;
        /// <summary>
        /// Specifies a map of sensitive properties for launchProperties.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Secrets;

        [OutputConstructor]
        private SpringCloudBuildPackBindingLaunch(
            ImmutableDictionary<string, string>? properties,

            ImmutableDictionary<string, string>? secrets)
        {
            Properties = properties;
            Secrets = secrets;
        }
    }
}
