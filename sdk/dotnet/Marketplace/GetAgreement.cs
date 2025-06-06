// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Marketplace
{
    public static class GetAgreement
    {
        /// <summary>
        /// Uses this data source to access information about an existing Marketplace Agreement.
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
        ///     var barracuda = Azure.Marketplace.GetAgreement.Invoke(new()
        ///     {
        ///         Publisher = "barracudanetworks",
        ///         Offer = "waf",
        ///         Plan = "hourly",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["azurermMarketplaceAgreementId"] = id,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.MarketplaceOrdering`: 2015-06-01
        /// </summary>
        public static Task<GetAgreementResult> InvokeAsync(GetAgreementArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAgreementResult>("azure:marketplace/getAgreement:getAgreement", args ?? new GetAgreementArgs(), options.WithDefaults());

        /// <summary>
        /// Uses this data source to access information about an existing Marketplace Agreement.
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
        ///     var barracuda = Azure.Marketplace.GetAgreement.Invoke(new()
        ///     {
        ///         Publisher = "barracudanetworks",
        ///         Offer = "waf",
        ///         Plan = "hourly",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["azurermMarketplaceAgreementId"] = id,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.MarketplaceOrdering`: 2015-06-01
        /// </summary>
        public static Output<GetAgreementResult> Invoke(GetAgreementInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAgreementResult>("azure:marketplace/getAgreement:getAgreement", args ?? new GetAgreementInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Uses this data source to access information about an existing Marketplace Agreement.
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
        ///     var barracuda = Azure.Marketplace.GetAgreement.Invoke(new()
        ///     {
        ///         Publisher = "barracudanetworks",
        ///         Offer = "waf",
        ///         Plan = "hourly",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["azurermMarketplaceAgreementId"] = id,
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.MarketplaceOrdering`: 2015-06-01
        /// </summary>
        public static Output<GetAgreementResult> Invoke(GetAgreementInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAgreementResult>("azure:marketplace/getAgreement:getAgreement", args ?? new GetAgreementInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAgreementArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Offer of the Marketplace Image.
        /// </summary>
        [Input("offer", required: true)]
        public string Offer { get; set; } = null!;

        /// <summary>
        /// The Plan of the Marketplace Image.
        /// </summary>
        [Input("plan", required: true)]
        public string Plan { get; set; } = null!;

        /// <summary>
        /// The Publisher of the Marketplace Image.
        /// </summary>
        [Input("publisher", required: true)]
        public string Publisher { get; set; } = null!;

        public GetAgreementArgs()
        {
        }
        public static new GetAgreementArgs Empty => new GetAgreementArgs();
    }

    public sealed class GetAgreementInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Offer of the Marketplace Image.
        /// </summary>
        [Input("offer", required: true)]
        public Input<string> Offer { get; set; } = null!;

        /// <summary>
        /// The Plan of the Marketplace Image.
        /// </summary>
        [Input("plan", required: true)]
        public Input<string> Plan { get; set; } = null!;

        /// <summary>
        /// The Publisher of the Marketplace Image.
        /// </summary>
        [Input("publisher", required: true)]
        public Input<string> Publisher { get; set; } = null!;

        public GetAgreementInvokeArgs()
        {
        }
        public static new GetAgreementInvokeArgs Empty => new GetAgreementInvokeArgs();
    }


    [OutputType]
    public sealed class GetAgreementResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string LicenseTextLink;
        public readonly string Offer;
        public readonly string Plan;
        public readonly string PrivacyPolicyLink;
        public readonly string Publisher;

        [OutputConstructor]
        private GetAgreementResult(
            string id,

            string licenseTextLink,

            string offer,

            string plan,

            string privacyPolicyLink,

            string publisher)
        {
            Id = id;
            LicenseTextLink = licenseTextLink;
            Offer = offer;
            Plan = plan;
            PrivacyPolicyLink = privacyPolicyLink;
            Publisher = publisher;
        }
    }
}
