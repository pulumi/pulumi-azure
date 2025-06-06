// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class WindowsVirtualMachineScaleSetPlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the image from the marketplace. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the product of the image from the marketplace. Changing this forces a new resource to be created.
        /// </summary>
        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        /// <summary>
        /// Specifies the publisher of the image. Changing this forces a new resource to be created.
        /// </summary>
        [Input("publisher", required: true)]
        public Input<string> Publisher { get; set; } = null!;

        public WindowsVirtualMachineScaleSetPlanArgs()
        {
        }
        public static new WindowsVirtualMachineScaleSetPlanArgs Empty => new WindowsVirtualMachineScaleSetPlanArgs();
    }
}
