// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile
{
    public static class GetNetworkSimPolicy
    {
        /// <summary>
        /// Get information about a Mobile Network Sim Policy.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Mobile.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "example-mn",
        ///         ResourceGroupName = "example-rg",
        ///     });
        /// 
        ///     var exampleGetNetworkSimPolicy = Azure.Mobile.GetNetworkSimPolicy.Invoke(new()
        ///     {
        ///         Name = "example-mnsp",
        ///         MobileNetworkId = example.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.MobileNetwork`: 2022-11-01
        /// </summary>
        public static Task<GetNetworkSimPolicyResult> InvokeAsync(GetNetworkSimPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkSimPolicyResult>("azure:mobile/getNetworkSimPolicy:getNetworkSimPolicy", args ?? new GetNetworkSimPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Mobile Network Sim Policy.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Mobile.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "example-mn",
        ///         ResourceGroupName = "example-rg",
        ///     });
        /// 
        ///     var exampleGetNetworkSimPolicy = Azure.Mobile.GetNetworkSimPolicy.Invoke(new()
        ///     {
        ///         Name = "example-mnsp",
        ///         MobileNetworkId = example.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.MobileNetwork`: 2022-11-01
        /// </summary>
        public static Output<GetNetworkSimPolicyResult> Invoke(GetNetworkSimPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkSimPolicyResult>("azure:mobile/getNetworkSimPolicy:getNetworkSimPolicy", args ?? new GetNetworkSimPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Mobile Network Sim Policy.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Mobile.GetNetwork.Invoke(new()
        ///     {
        ///         Name = "example-mn",
        ///         ResourceGroupName = "example-rg",
        ///     });
        /// 
        ///     var exampleGetNetworkSimPolicy = Azure.Mobile.GetNetworkSimPolicy.Invoke(new()
        ///     {
        ///         Name = "example-mnsp",
        ///         MobileNetworkId = example.Apply(getNetworkResult =&gt; getNetworkResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.MobileNetwork`: 2022-11-01
        /// </summary>
        public static Output<GetNetworkSimPolicyResult> Invoke(GetNetworkSimPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkSimPolicyResult>("azure:mobile/getNetworkSimPolicy:getNetworkSimPolicy", args ?? new GetNetworkSimPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkSimPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Mobile Network which the Sim Policy belongs to.
        /// </summary>
        [Input("mobileNetworkId", required: true)]
        public string MobileNetworkId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Mobile Network Sim Policies.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetNetworkSimPolicyArgs()
        {
        }
        public static new GetNetworkSimPolicyArgs Empty => new GetNetworkSimPolicyArgs();
    }

    public sealed class GetNetworkSimPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Mobile Network which the Sim Policy belongs to.
        /// </summary>
        [Input("mobileNetworkId", required: true)]
        public Input<string> MobileNetworkId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Mobile Network Sim Policies.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetNetworkSimPolicyInvokeArgs()
        {
        }
        public static new GetNetworkSimPolicyInvokeArgs Empty => new GetNetworkSimPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkSimPolicyResult
    {
        /// <summary>
        /// The ID of default slice to use if the UE does not explicitly specify it.
        /// </summary>
        public readonly string DefaultSliceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Azure Region where the Mobile Network Sim Policy should exist.
        /// </summary>
        public readonly string Location;
        public readonly string MobileNetworkId;
        public readonly string Name;
        /// <summary>
        /// RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413.
        /// </summary>
        public readonly int RatFrequencySelectionPriorityIndex;
        /// <summary>
        /// Interval for the UE periodic registration update procedure.
        /// </summary>
        public readonly int RegistrationTimerInSeconds;
        /// <summary>
        /// An array of `slice` block as defined below. The allowed slices and the settings to use for them.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkSimPolicySliceResult> Slices;
        /// <summary>
        /// A mapping of tags which should be assigned to the Mobile Network Sim Policies.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// A `user_equipment_aggregate_maximum_bit_rate` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkSimPolicyUserEquipmentAggregateMaximumBitRateResult> UserEquipmentAggregateMaximumBitRates;

        [OutputConstructor]
        private GetNetworkSimPolicyResult(
            string defaultSliceId,

            string id,

            string location,

            string mobileNetworkId,

            string name,

            int ratFrequencySelectionPriorityIndex,

            int registrationTimerInSeconds,

            ImmutableArray<Outputs.GetNetworkSimPolicySliceResult> slices,

            ImmutableDictionary<string, string> tags,

            ImmutableArray<Outputs.GetNetworkSimPolicyUserEquipmentAggregateMaximumBitRateResult> userEquipmentAggregateMaximumBitRates)
        {
            DefaultSliceId = defaultSliceId;
            Id = id;
            Location = location;
            MobileNetworkId = mobileNetworkId;
            Name = name;
            RatFrequencySelectionPriorityIndex = ratFrequencySelectionPriorityIndex;
            RegistrationTimerInSeconds = registrationTimerInSeconds;
            Slices = slices;
            Tags = tags;
            UserEquipmentAggregateMaximumBitRates = userEquipmentAggregateMaximumBitRates;
        }
    }
}
