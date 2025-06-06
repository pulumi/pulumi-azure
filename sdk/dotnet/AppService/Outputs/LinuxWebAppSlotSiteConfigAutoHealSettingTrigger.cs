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
    public sealed class LinuxWebAppSlotSiteConfigAutoHealSettingTrigger
    {
        /// <summary>
        /// A `requests` block as defined above.
        /// </summary>
        public readonly Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerRequests? Requests;
        /// <summary>
        /// A `slow_request` block as defined above.
        /// </summary>
        public readonly Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest? SlowRequest;
        /// <summary>
        /// One or more `slow_request_with_path` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> SlowRequestWithPaths;
        /// <summary>
        /// One or more `status_code` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> StatusCodes;

        [OutputConstructor]
        private LinuxWebAppSlotSiteConfigAutoHealSettingTrigger(
            Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerRequests? requests,

            Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest? slowRequest,

            ImmutableArray<Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> slowRequestWithPaths,

            ImmutableArray<Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> statusCodes)
        {
            Requests = requests;
            SlowRequest = slowRequest;
            SlowRequestWithPaths = slowRequestWithPaths;
            StatusCodes = statusCodes;
        }
    }
}
