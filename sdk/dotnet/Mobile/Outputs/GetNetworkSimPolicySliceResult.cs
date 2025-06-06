// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Outputs
{

    [OutputType]
    public sealed class GetNetworkSimPolicySliceResult
    {
        /// <summary>
        /// An array of `data_network` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkSimPolicySliceDataNetworkResult> DataNetworks;
        /// <summary>
        /// The ID of default data network to use if the UE does not explicitly specify it.
        /// </summary>
        public readonly string DefaultDataNetworkId;
        /// <summary>
        /// The ID of the slice that these settings apply to.
        /// </summary>
        public readonly string SliceId;

        [OutputConstructor]
        private GetNetworkSimPolicySliceResult(
            ImmutableArray<Outputs.GetNetworkSimPolicySliceDataNetworkResult> dataNetworks,

            string defaultDataNetworkId,

            string sliceId)
        {
            DataNetworks = dataNetworks;
            DefaultDataNetworkId = defaultDataNetworkId;
            SliceId = sliceId;
        }
    }
}
