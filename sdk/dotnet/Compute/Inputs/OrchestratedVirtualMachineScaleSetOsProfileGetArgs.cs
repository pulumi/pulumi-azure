// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class OrchestratedVirtualMachineScaleSetOsProfileGetArgs : Pulumi.ResourceArgs
    {
        [Input("customData")]
        public Input<string>? CustomData { get; set; }

        [Input("linuxConfiguration")]
        public Input<Inputs.OrchestratedVirtualMachineScaleSetOsProfileLinuxConfigurationGetArgs>? LinuxConfiguration { get; set; }

        [Input("windowsConfiguration")]
        public Input<Inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationGetArgs>? WindowsConfiguration { get; set; }

        public OrchestratedVirtualMachineScaleSetOsProfileGetArgs()
        {
        }
    }
}