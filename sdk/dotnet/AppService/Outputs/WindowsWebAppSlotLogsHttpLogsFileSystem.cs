// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class WindowsWebAppSlotLogsHttpLogsFileSystem
    {
        /// <summary>
        /// The retention period in days. A values of `0` means no retention.
        /// </summary>
        public readonly int RetentionInDays;
        /// <summary>
        /// The maximum size in megabytes that log files can use.
        /// </summary>
        public readonly int RetentionInMb;

        [OutputConstructor]
        private WindowsWebAppSlotLogsHttpLogsFileSystem(
            int retentionInDays,

            int retentionInMb)
        {
            RetentionInDays = retentionInDays;
            RetentionInMb = retentionInMb;
        }
    }
}
