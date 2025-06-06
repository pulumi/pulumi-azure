// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Inputs
{

    public sealed class ProviderFeaturesVirtualMachineScaleSetArgs : global::Pulumi.ResourceArgs
    {
        [Input("forceDelete")]
        public Input<bool>? ForceDelete { get; set; }

        [Input("reimageOnManualUpgrade")]
        public Input<bool>? ReimageOnManualUpgrade { get; set; }

        [Input("rollInstancesWhenRequired")]
        public Input<bool>? RollInstancesWhenRequired { get; set; }

        [Input("scaleToZeroBeforeDeletion")]
        public Input<bool>? ScaleToZeroBeforeDeletion { get; set; }

        public ProviderFeaturesVirtualMachineScaleSetArgs()
        {
        }
        public static new ProviderFeaturesVirtualMachineScaleSetArgs Empty => new ProviderFeaturesVirtualMachineScaleSetArgs();
    }
}
