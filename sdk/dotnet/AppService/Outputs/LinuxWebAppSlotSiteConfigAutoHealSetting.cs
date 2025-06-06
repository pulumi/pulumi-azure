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
    public sealed class LinuxWebAppSlotSiteConfigAutoHealSetting
    {
        /// <summary>
        /// A `action` block as defined above.
        /// </summary>
        public readonly Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingAction? Action;
        /// <summary>
        /// A `trigger` block as defined below.
        /// </summary>
        public readonly Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTrigger? Trigger;

        [OutputConstructor]
        private LinuxWebAppSlotSiteConfigAutoHealSetting(
            Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingAction? action,

            Outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTrigger? trigger)
        {
            Action = action;
            Trigger = trigger;
        }
    }
}
