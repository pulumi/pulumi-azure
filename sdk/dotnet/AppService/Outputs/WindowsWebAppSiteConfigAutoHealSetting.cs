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
    public sealed class WindowsWebAppSiteConfigAutoHealSetting
    {
        /// <summary>
        /// An `action` block as defined above.
        /// </summary>
        public readonly Outputs.WindowsWebAppSiteConfigAutoHealSettingAction Action;
        /// <summary>
        /// A `trigger` block as defined below.
        /// </summary>
        public readonly Outputs.WindowsWebAppSiteConfigAutoHealSettingTrigger Trigger;

        [OutputConstructor]
        private WindowsWebAppSiteConfigAutoHealSetting(
            Outputs.WindowsWebAppSiteConfigAutoHealSettingAction action,

            Outputs.WindowsWebAppSiteConfigAutoHealSettingTrigger trigger)
        {
            Action = action;
            Trigger = trigger;
        }
    }
}
