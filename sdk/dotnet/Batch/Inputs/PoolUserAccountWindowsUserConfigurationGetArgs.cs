// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Inputs
{

    public sealed class PoolUserAccountWindowsUserConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode. Values supported are "Batch" and "Interactive".
        /// </summary>
        [Input("loginMode", required: true)]
        public Input<string> LoginMode { get; set; } = null!;

        public PoolUserAccountWindowsUserConfigurationGetArgs()
        {
        }
        public static new PoolUserAccountWindowsUserConfigurationGetArgs Empty => new PoolUserAccountWindowsUserConfigurationGetArgs();
    }
}