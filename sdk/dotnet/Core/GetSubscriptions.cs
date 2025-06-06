// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core
{
    public static class GetSubscriptions
    {
        /// <summary>
        /// Use this data source to access information about all the Subscriptions currently available.
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
        ///     var available = Azure.Core.GetSubscriptions.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["availableSubscriptions"] = available.Apply(getSubscriptionsResult =&gt; getSubscriptionsResult.Subscriptions),
        ///         ["firstAvailableSubscriptionDisplayName"] = available.Apply(getSubscriptionsResult =&gt; getSubscriptionsResult.Subscriptions[0]?.DisplayName),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSubscriptionsResult> InvokeAsync(GetSubscriptionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubscriptionsResult>("azure:core/getSubscriptions:getSubscriptions", args ?? new GetSubscriptionsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about all the Subscriptions currently available.
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
        ///     var available = Azure.Core.GetSubscriptions.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["availableSubscriptions"] = available.Apply(getSubscriptionsResult =&gt; getSubscriptionsResult.Subscriptions),
        ///         ["firstAvailableSubscriptionDisplayName"] = available.Apply(getSubscriptionsResult =&gt; getSubscriptionsResult.Subscriptions[0]?.DisplayName),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSubscriptionsResult> Invoke(GetSubscriptionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubscriptionsResult>("azure:core/getSubscriptions:getSubscriptions", args ?? new GetSubscriptionsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about all the Subscriptions currently available.
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
        ///     var available = Azure.Core.GetSubscriptions.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["availableSubscriptions"] = available.Apply(getSubscriptionsResult =&gt; getSubscriptionsResult.Subscriptions),
        ///         ["firstAvailableSubscriptionDisplayName"] = available.Apply(getSubscriptionsResult =&gt; getSubscriptionsResult.Subscriptions[0]?.DisplayName),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSubscriptionsResult> Invoke(GetSubscriptionsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubscriptionsResult>("azure:core/getSubscriptions:getSubscriptions", args ?? new GetSubscriptionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubscriptionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A case-insensitive value which must be contained within the `display_name` field, used to filter the results
        /// </summary>
        [Input("displayNameContains")]
        public string? DisplayNameContains { get; set; }

        /// <summary>
        /// A case-insensitive prefix which can be used to filter on the `display_name` field
        /// </summary>
        [Input("displayNamePrefix")]
        public string? DisplayNamePrefix { get; set; }

        public GetSubscriptionsArgs()
        {
        }
        public static new GetSubscriptionsArgs Empty => new GetSubscriptionsArgs();
    }

    public sealed class GetSubscriptionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A case-insensitive value which must be contained within the `display_name` field, used to filter the results
        /// </summary>
        [Input("displayNameContains")]
        public Input<string>? DisplayNameContains { get; set; }

        /// <summary>
        /// A case-insensitive prefix which can be used to filter on the `display_name` field
        /// </summary>
        [Input("displayNamePrefix")]
        public Input<string>? DisplayNamePrefix { get; set; }

        public GetSubscriptionsInvokeArgs()
        {
        }
        public static new GetSubscriptionsInvokeArgs Empty => new GetSubscriptionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubscriptionsResult
    {
        public readonly string? DisplayNameContains;
        public readonly string? DisplayNamePrefix;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// One or more `subscription` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSubscriptionsSubscriptionResult> Subscriptions;

        [OutputConstructor]
        private GetSubscriptionsResult(
            string? displayNameContains,

            string? displayNamePrefix,

            string id,

            ImmutableArray<Outputs.GetSubscriptionsSubscriptionResult> subscriptions)
        {
            DisplayNameContains = displayNameContains;
            DisplayNamePrefix = displayNamePrefix;
            Id = id;
            Subscriptions = subscriptions;
        }
    }
}
