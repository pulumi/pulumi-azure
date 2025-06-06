// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class ScaleSetOsProfileWindowsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalUnattendConfigs")]
        private InputList<Inputs.ScaleSetOsProfileWindowsConfigAdditionalUnattendConfigGetArgs>? _additionalUnattendConfigs;

        /// <summary>
        /// An `additional_unattend_config` block as documented below.
        /// </summary>
        public InputList<Inputs.ScaleSetOsProfileWindowsConfigAdditionalUnattendConfigGetArgs> AdditionalUnattendConfigs
        {
            get => _additionalUnattendConfigs ?? (_additionalUnattendConfigs = new InputList<Inputs.ScaleSetOsProfileWindowsConfigAdditionalUnattendConfigGetArgs>());
            set => _additionalUnattendConfigs = value;
        }

        /// <summary>
        /// Indicates whether virtual machines in the scale set are enabled for automatic updates.
        /// </summary>
        [Input("enableAutomaticUpgrades")]
        public Input<bool>? EnableAutomaticUpgrades { get; set; }

        /// <summary>
        /// Indicates whether virtual machine agent should be provisioned on the virtual machines in the scale set.
        /// </summary>
        [Input("provisionVmAgent")]
        public Input<bool>? ProvisionVmAgent { get; set; }

        [Input("winrms")]
        private InputList<Inputs.ScaleSetOsProfileWindowsConfigWinrmGetArgs>? _winrms;

        /// <summary>
        /// A collection of `winrm` blocks as documented below.
        /// </summary>
        public InputList<Inputs.ScaleSetOsProfileWindowsConfigWinrmGetArgs> Winrms
        {
            get => _winrms ?? (_winrms = new InputList<Inputs.ScaleSetOsProfileWindowsConfigWinrmGetArgs>());
            set => _winrms = value;
        }

        public ScaleSetOsProfileWindowsConfigGetArgs()
        {
        }
        public static new ScaleSetOsProfileWindowsConfigGetArgs Empty => new ScaleSetOsProfileWindowsConfigGetArgs();
    }
}
