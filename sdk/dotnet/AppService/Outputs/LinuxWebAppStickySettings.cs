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
    public sealed class LinuxWebAppStickySettings
    {
        /// <summary>
        /// A list of `app_setting` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
        /// </summary>
        public readonly ImmutableArray<string> AppSettingNames;
        /// <summary>
        /// A list of `connection_string` names that the Linux Web App will not swap between Slots when a swap operation is triggered.
        /// </summary>
        public readonly ImmutableArray<string> ConnectionStringNames;

        [OutputConstructor]
        private LinuxWebAppStickySettings(
            ImmutableArray<string> appSettingNames,

            ImmutableArray<string> connectionStringNames)
        {
            AppSettingNames = appSettingNames;
            ConnectionStringNames = connectionStringNames;
        }
    }
}