// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class ApplicationGatewaySku
    {
        /// <summary>
        /// The Capacity of the SKU to use for this Application Gateway. When using a V1 SKU this value must be between `1` and `32`, and `1` to `125` for a V2 SKU. When using a `Basic` SKU this property must be between `1` and `2`. This property is optional if `autoscale_configuration` is set.
        /// </summary>
        public readonly int? Capacity;
        /// <summary>
        /// The Name of the SKU to use for this Application Gateway. Possible values are `Basic`, `Standard_v2`, and `WAF_v2`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Tier of the SKU to use for this Application Gateway. Possible values are `Basic`, `Standard_v2`, and `WAF_v2`.
        /// </summary>
        public readonly string Tier;

        [OutputConstructor]
        private ApplicationGatewaySku(
            int? capacity,

            string name,

            string tier)
        {
            Capacity = capacity;
            Name = name;
            Tier = tier;
        }
    }
}
