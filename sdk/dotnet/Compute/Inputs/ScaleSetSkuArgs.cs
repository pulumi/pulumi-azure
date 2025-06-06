// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class ScaleSetSkuArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the number of virtual machines in the scale set.
        /// </summary>
        [Input("capacity", required: true)]
        public Input<int> Capacity { get; set; } = null!;

        /// <summary>
        /// Specifies the size of virtual machines in a scale set.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the tier of virtual machines in a scale set. Possible values, `standard` or `basic`.
        /// </summary>
        [Input("tier")]
        public Input<string>? Tier { get; set; }

        public ScaleSetSkuArgs()
        {
        }
        public static new ScaleSetSkuArgs Empty => new ScaleSetSkuArgs();
    }
}
