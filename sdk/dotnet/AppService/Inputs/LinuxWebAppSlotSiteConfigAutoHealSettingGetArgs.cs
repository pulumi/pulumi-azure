// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class LinuxWebAppSlotSiteConfigAutoHealSettingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `action` block as defined above.
        /// </summary>
        [Input("action")]
        public Input<Inputs.LinuxWebAppSlotSiteConfigAutoHealSettingActionGetArgs>? Action { get; set; }

        /// <summary>
        /// A `trigger` block as defined below.
        /// </summary>
        [Input("trigger")]
        public Input<Inputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerGetArgs>? Trigger { get; set; }

        public LinuxWebAppSlotSiteConfigAutoHealSettingGetArgs()
        {
        }
        public static new LinuxWebAppSlotSiteConfigAutoHealSettingGetArgs Empty => new LinuxWebAppSlotSiteConfigAutoHealSettingGetArgs();
    }
}
