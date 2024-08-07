// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Hybrid.Outputs
{

    [OutputType]
    public sealed class GetComputeMachineOsProfileWindowsConfigurationResult
    {
        /// <summary>
        /// A `patch_settings` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetComputeMachineOsProfileWindowsConfigurationPatchSettingResult> PatchSettings;

        [OutputConstructor]
        private GetComputeMachineOsProfileWindowsConfigurationResult(ImmutableArray<Outputs.GetComputeMachineOsProfileWindowsConfigurationPatchSettingResult> patchSettings)
        {
            PatchSettings = patchSettings;
        }
    }
}
