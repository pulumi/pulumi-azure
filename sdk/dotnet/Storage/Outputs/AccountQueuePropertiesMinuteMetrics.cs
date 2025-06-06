// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Outputs
{

    [OutputType]
    public sealed class AccountQueuePropertiesMinuteMetrics
    {
        /// <summary>
        /// Indicates whether metrics should generate summary statistics for called API operations.
        /// </summary>
        public readonly bool? IncludeApis;
        /// <summary>
        /// Specifies the number of days that logs will be retained.
        /// </summary>
        public readonly int? RetentionPolicyDays;
        /// <summary>
        /// The version of storage analytics to configure.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private AccountQueuePropertiesMinuteMetrics(
            bool? includeApis,

            int? retentionPolicyDays,

            string version)
        {
            IncludeApis = includeApis;
            RetentionPolicyDays = retentionPolicyDays;
            Version = version;
        }
    }
}
