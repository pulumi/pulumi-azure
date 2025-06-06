// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.FrontDoor
{
    /// <summary>
    /// !&gt; **Note:** This deploys an Azure Front Door (classic) resource which has been deprecated and will receive security updates only. Please migrate your existing Azure Front Door (classic) deployments to the new Azure Front Door (standard/premium) resources. For your convenience, the service team has exposed a `Front Door Classic` to `Front Door Standard/Premium` [migration tool](https://learn.microsoft.com/azure/frontdoor/tier-migration) to allow you to migrate your existing `Front Door Classic` instances to the new `Front Door Standard/Premium` product tiers.
    /// 
    /// Manages an Azure Front Door (classic) Web Application Firewall Policy instance.
    /// 
    /// !&gt; **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN and Front Door resources, more information will be posted in the GitHub issue as the necessary changes are identified.
    /// 
    /// !&gt; **Note:** On `1 April 2025`, Azure Front Door (classic) will be retired for the public cloud, existing Azure Front Door (classic) resources must be migrated out of Azure Front Door (classic) to Azure Front Door Standard/Premium before `1 October 2025` to avoid potential disruptions in service.
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
    ///         Name = "example-rg",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleFirewallPolicy = new Azure.FrontDoor.FirewallPolicy("example", new()
    ///     {
    ///         Name = "examplefdwafpolicy",
    ///         ResourceGroupName = example.Name,
    ///         Enabled = true,
    ///         Mode = "Prevention",
    ///         RedirectUrl = "https://www.contoso.com",
    ///         CustomBlockResponseStatusCode = 403,
    ///         CustomBlockResponseBody = "PGh0bWw+CjxoZWFkZXI+PHRpdGxlPkhlbGxvPC90aXRsZT48L2hlYWRlcj4KPGJvZHk+CkhlbGxvIHdvcmxkCjwvYm9keT4KPC9odG1sPg==",
    ///         CustomRules = new[]
    ///         {
    ///             new Azure.FrontDoor.Inputs.FirewallPolicyCustomRuleArgs
    ///             {
    ///                 Name = "Rule1",
    ///                 Enabled = true,
    ///                 Priority = 1,
    ///                 RateLimitDurationInMinutes = 1,
    ///                 RateLimitThreshold = 10,
    ///                 Type = "MatchRule",
    ///                 Action = "Block",
    ///                 MatchConditions = new[]
    ///                 {
    ///                     new Azure.FrontDoor.Inputs.FirewallPolicyCustomRuleMatchConditionArgs
    ///                     {
    ///                         MatchVariable = "RemoteAddr",
    ///                         Operator = "IPMatch",
    ///                         NegationCondition = false,
    ///                         MatchValues = new[]
    ///                         {
    ///                             "192.168.1.0/24",
    ///                             "10.0.0.0/24",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             new Azure.FrontDoor.Inputs.FirewallPolicyCustomRuleArgs
    ///             {
    ///                 Name = "Rule2",
    ///                 Enabled = true,
    ///                 Priority = 2,
    ///                 RateLimitDurationInMinutes = 1,
    ///                 RateLimitThreshold = 10,
    ///                 Type = "MatchRule",
    ///                 Action = "Block",
    ///                 MatchConditions = new[]
    ///                 {
    ///                     new Azure.FrontDoor.Inputs.FirewallPolicyCustomRuleMatchConditionArgs
    ///                     {
    ///                         MatchVariable = "RemoteAddr",
    ///                         Operator = "IPMatch",
    ///                         NegationCondition = false,
    ///                         MatchValues = new[]
    ///                         {
    ///                             "192.168.1.0/24",
    ///                         },
    ///                     },
    ///                     new Azure.FrontDoor.Inputs.FirewallPolicyCustomRuleMatchConditionArgs
    ///                     {
    ///                         MatchVariable = "RequestHeader",
    ///                         Selector = "UserAgent",
    ///                         Operator = "Contains",
    ///                         NegationCondition = false,
    ///                         MatchValues = new[]
    ///                         {
    ///                             "windows",
    ///                         },
    ///                         Transforms = new[]
    ///                         {
    ///                             "Lowercase",
    ///                             "Trim",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         ManagedRules = new[]
    ///         {
    ///             new Azure.FrontDoor.Inputs.FirewallPolicyManagedRuleArgs
    ///             {
    ///                 Type = "DefaultRuleSet",
    ///                 Version = "1.0",
    ///                 Exclusions = new[]
    ///                 {
    ///                     new Azure.FrontDoor.Inputs.FirewallPolicyManagedRuleExclusionArgs
    ///                     {
    ///                         MatchVariable = "QueryStringArgNames",
    ///                         Operator = "Equals",
    ///                         Selector = "not_suspicious",
    ///                     },
    ///                 },
    ///                 Overrides = new[]
    ///                 {
    ///                     new Azure.FrontDoor.Inputs.FirewallPolicyManagedRuleOverrideArgs
    ///                     {
    ///                         RuleGroupName = "PHP",
    ///                         Rules = new[]
    ///                         {
    ///                             new Azure.FrontDoor.Inputs.FirewallPolicyManagedRuleOverrideRuleArgs
    ///                             {
    ///                                 RuleId = "933100",
    ///                                 Enabled = false,
    ///                                 Action = "Block",
    ///                             },
    ///                         },
    ///                     },
    ///                     new Azure.FrontDoor.Inputs.FirewallPolicyManagedRuleOverrideArgs
    ///                     {
    ///                         RuleGroupName = "SQLI",
    ///                         Exclusions = new[]
    ///                         {
    ///                             new Azure.FrontDoor.Inputs.FirewallPolicyManagedRuleOverrideExclusionArgs
    ///                             {
    ///                                 MatchVariable = "QueryStringArgNames",
    ///                                 Operator = "Equals",
    ///                                 Selector = "really_not_suspicious",
    ///                             },
    ///                         },
    ///                         Rules = new[]
    ///                         {
    ///                             new Azure.FrontDoor.Inputs.FirewallPolicyManagedRuleOverrideRuleArgs
    ///                             {
    ///                                 RuleId = "942200",
    ///                                 Action = "Block",
    ///                                 Exclusions = new[]
    ///                                 {
    ///                                     new Azure.FrontDoor.Inputs.FirewallPolicyManagedRuleOverrideRuleExclusionArgs
    ///                                     {
    ///                                         MatchVariable = "QueryStringArgNames",
    ///                                         Operator = "Equals",
    ///                                         Selector = "innocent",
    ///                                     },
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             new Azure.FrontDoor.Inputs.FirewallPolicyManagedRuleArgs
    ///             {
    ///                 Type = "Microsoft_BotManagerRuleSet",
    ///                 Version = "1.0",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// FrontDoor Web Application Firewall Policy can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:frontdoor/firewallPolicy:FirewallPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-rg/providers/Microsoft.Network/frontDoorWebApplicationFirewallPolicies/examplefdwafpolicy
    /// ```
    /// </summary>
    [AzureResourceType("azure:frontdoor/firewallPolicy:FirewallPolicy")]
    public partial class FirewallPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If a `custom_rule` block's action type is `block`, this is the response body. The body must be specified in base64 encoding.
        /// </summary>
        [Output("customBlockResponseBody")]
        public Output<string?> CustomBlockResponseBody { get; private set; } = null!;

        /// <summary>
        /// If a `custom_rule` block's action type is `block`, this is the response status code. Possible values are `200`, `403`, `405`, `406`, or `429`.
        /// </summary>
        [Output("customBlockResponseStatusCode")]
        public Output<int?> CustomBlockResponseStatusCode { get; private set; } = null!;

        /// <summary>
        /// One or more `custom_rule` blocks as defined below.
        /// </summary>
        [Output("customRules")]
        public Output<ImmutableArray<Outputs.FirewallPolicyCustomRule>> CustomRules { get; private set; } = null!;

        /// <summary>
        /// Is the policy a enabled state or disabled state. Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The Frontend Endpoints associated with this Front Door Web Application Firewall policy.
        /// </summary>
        [Output("frontendEndpointIds")]
        public Output<ImmutableArray<string>> FrontendEndpointIds { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where this Front Door Firewall Policy exists.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// One or more `managed_rule` blocks as defined below.
        /// </summary>
        [Output("managedRules")]
        public Output<ImmutableArray<Outputs.FirewallPolicyManagedRule>> ManagedRules { get; private set; } = null!;

        /// <summary>
        /// The firewall policy mode. Possible values are `Detection`, `Prevention`. Defaults to `Prevention`.
        /// </summary>
        [Output("mode")]
        public Output<string?> Mode { get; private set; } = null!;

        /// <summary>
        /// The name of the policy. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// If action type is redirect, this field represents redirect URL for the client.
        /// </summary>
        [Output("redirectUrl")]
        public Output<string?> RedirectUrl { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the Web Application Firewall Policy.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallPolicy(string name, FirewallPolicyArgs args, CustomResourceOptions? options = null)
            : base("azure:frontdoor/firewallPolicy:FirewallPolicy", name, args ?? new FirewallPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallPolicy(string name, Input<string> id, FirewallPolicyState? state = null, CustomResourceOptions? options = null)
            : base("azure:frontdoor/firewallPolicy:FirewallPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirewallPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallPolicy Get(string name, Input<string> id, FirewallPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallPolicy(name, id, state, options);
        }
    }

    public sealed class FirewallPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If a `custom_rule` block's action type is `block`, this is the response body. The body must be specified in base64 encoding.
        /// </summary>
        [Input("customBlockResponseBody")]
        public Input<string>? CustomBlockResponseBody { get; set; }

        /// <summary>
        /// If a `custom_rule` block's action type is `block`, this is the response status code. Possible values are `200`, `403`, `405`, `406`, or `429`.
        /// </summary>
        [Input("customBlockResponseStatusCode")]
        public Input<int>? CustomBlockResponseStatusCode { get; set; }

        [Input("customRules")]
        private InputList<Inputs.FirewallPolicyCustomRuleArgs>? _customRules;

        /// <summary>
        /// One or more `custom_rule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyCustomRuleArgs> CustomRules
        {
            get => _customRules ?? (_customRules = new InputList<Inputs.FirewallPolicyCustomRuleArgs>());
            set => _customRules = value;
        }

        /// <summary>
        /// Is the policy a enabled state or disabled state. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("managedRules")]
        private InputList<Inputs.FirewallPolicyManagedRuleArgs>? _managedRules;

        /// <summary>
        /// One or more `managed_rule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyManagedRuleArgs> ManagedRules
        {
            get => _managedRules ?? (_managedRules = new InputList<Inputs.FirewallPolicyManagedRuleArgs>());
            set => _managedRules = value;
        }

        /// <summary>
        /// The firewall policy mode. Possible values are `Detection`, `Prevention`. Defaults to `Prevention`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The name of the policy. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If action type is redirect, this field represents redirect URL for the client.
        /// </summary>
        [Input("redirectUrl")]
        public Input<string>? RedirectUrl { get; set; }

        /// <summary>
        /// The name of the resource group. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the Web Application Firewall Policy.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public FirewallPolicyArgs()
        {
        }
        public static new FirewallPolicyArgs Empty => new FirewallPolicyArgs();
    }

    public sealed class FirewallPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If a `custom_rule` block's action type is `block`, this is the response body. The body must be specified in base64 encoding.
        /// </summary>
        [Input("customBlockResponseBody")]
        public Input<string>? CustomBlockResponseBody { get; set; }

        /// <summary>
        /// If a `custom_rule` block's action type is `block`, this is the response status code. Possible values are `200`, `403`, `405`, `406`, or `429`.
        /// </summary>
        [Input("customBlockResponseStatusCode")]
        public Input<int>? CustomBlockResponseStatusCode { get; set; }

        [Input("customRules")]
        private InputList<Inputs.FirewallPolicyCustomRuleGetArgs>? _customRules;

        /// <summary>
        /// One or more `custom_rule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyCustomRuleGetArgs> CustomRules
        {
            get => _customRules ?? (_customRules = new InputList<Inputs.FirewallPolicyCustomRuleGetArgs>());
            set => _customRules = value;
        }

        /// <summary>
        /// Is the policy a enabled state or disabled state. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("frontendEndpointIds")]
        private InputList<string>? _frontendEndpointIds;

        /// <summary>
        /// The Frontend Endpoints associated with this Front Door Web Application Firewall policy.
        /// </summary>
        public InputList<string> FrontendEndpointIds
        {
            get => _frontendEndpointIds ?? (_frontendEndpointIds = new InputList<string>());
            set => _frontendEndpointIds = value;
        }

        /// <summary>
        /// The Azure Region where this Front Door Firewall Policy exists.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("managedRules")]
        private InputList<Inputs.FirewallPolicyManagedRuleGetArgs>? _managedRules;

        /// <summary>
        /// One or more `managed_rule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyManagedRuleGetArgs> ManagedRules
        {
            get => _managedRules ?? (_managedRules = new InputList<Inputs.FirewallPolicyManagedRuleGetArgs>());
            set => _managedRules = value;
        }

        /// <summary>
        /// The firewall policy mode. Possible values are `Detection`, `Prevention`. Defaults to `Prevention`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The name of the policy. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If action type is redirect, this field represents redirect URL for the client.
        /// </summary>
        [Input("redirectUrl")]
        public Input<string>? RedirectUrl { get; set; }

        /// <summary>
        /// The name of the resource group. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the Web Application Firewall Policy.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public FirewallPolicyState()
        {
        }
        public static new FirewallPolicyState Empty => new FirewallPolicyState();
    }
}
