// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class GetLinuxWebAppSiteConfigAutoHealSettingTriggerRequestResult
    {
        /// <summary>
        /// The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// The time interval in the form `hh:mm:ss`.
        /// </summary>
        public readonly string Interval;

        [OutputConstructor]
        private GetLinuxWebAppSiteConfigAutoHealSettingTriggerRequestResult(
            int count,

            string interval)
        {
            Count = count;
            Interval = interval;
        }
    }
}