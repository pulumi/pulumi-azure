// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn
{
    /// <summary>
    /// Manages a Front Door (standard/premium) Rule Set.
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
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-cdn-frontdoor",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleFrontdoorProfile = new Azure.Cdn.FrontdoorProfile("example", new()
    ///     {
    ///         Name = "example-profile",
    ///         ResourceGroupName = example.Name,
    ///         SkuName = "Standard_AzureFrontDoor",
    ///     });
    /// 
    ///     var exampleFrontdoorRuleSet = new Azure.Cdn.FrontdoorRuleSet("example", new()
    ///     {
    ///         Name = "ExampleRuleSet",
    ///         CdnFrontdoorProfileId = exampleFrontdoorProfile.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.Cdn`: 2024-02-01
    /// 
    /// ## Import
    /// 
    /// Front Door Rule Sets can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:cdn/frontdoorRuleSet:FrontdoorRuleSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/ruleSets/ruleSet1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cdn/frontdoorRuleSet:FrontdoorRuleSet")]
    public partial class FrontdoorRuleSet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Front Door Profile. Changing this forces a new Front Door Rule Set to be created.
        /// </summary>
        [Output("cdnFrontdoorProfileId")]
        public Output<string> CdnFrontdoorProfileId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Front Door Rule Set. Changing this forces a new Front Door Rule Set to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a FrontdoorRuleSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FrontdoorRuleSet(string name, FrontdoorRuleSetArgs args, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorRuleSet:FrontdoorRuleSet", name, args ?? new FrontdoorRuleSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FrontdoorRuleSet(string name, Input<string> id, FrontdoorRuleSetState? state = null, CustomResourceOptions? options = null)
            : base("azure:cdn/frontdoorRuleSet:FrontdoorRuleSet", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FrontdoorRuleSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FrontdoorRuleSet Get(string name, Input<string> id, FrontdoorRuleSetState? state = null, CustomResourceOptions? options = null)
        {
            return new FrontdoorRuleSet(name, id, state, options);
        }
    }

    public sealed class FrontdoorRuleSetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Profile. Changing this forces a new Front Door Rule Set to be created.
        /// </summary>
        [Input("cdnFrontdoorProfileId", required: true)]
        public Input<string> CdnFrontdoorProfileId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Front Door Rule Set. Changing this forces a new Front Door Rule Set to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public FrontdoorRuleSetArgs()
        {
        }
        public static new FrontdoorRuleSetArgs Empty => new FrontdoorRuleSetArgs();
    }

    public sealed class FrontdoorRuleSetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Front Door Profile. Changing this forces a new Front Door Rule Set to be created.
        /// </summary>
        [Input("cdnFrontdoorProfileId")]
        public Input<string>? CdnFrontdoorProfileId { get; set; }

        /// <summary>
        /// The name which should be used for this Front Door Rule Set. Changing this forces a new Front Door Rule Set to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public FrontdoorRuleSetState()
        {
        }
        public static new FrontdoorRuleSetState Empty => new FrontdoorRuleSetState();
    }
}
