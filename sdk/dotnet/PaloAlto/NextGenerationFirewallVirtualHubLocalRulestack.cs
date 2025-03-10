// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto
{
    [AzureResourceType("azure:paloalto/nextGenerationFirewallVirtualHubLocalRulestack:NextGenerationFirewallVirtualHubLocalRulestack")]
    public partial class NextGenerationFirewallVirtualHubLocalRulestack : global::Pulumi.CustomResource
    {
        [Output("destinationNats")]
        public Output<ImmutableArray<Outputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNat>> DestinationNats { get; private set; } = null!;

        [Output("dnsSettings")]
        public Output<Outputs.NextGenerationFirewallVirtualHubLocalRulestackDnsSettings?> DnsSettings { get; private set; } = null!;

        [Output("marketplaceOfferId")]
        public Output<string?> MarketplaceOfferId { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("networkProfile")]
        public Output<Outputs.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfile> NetworkProfile { get; private set; } = null!;

        [Output("planId")]
        public Output<string?> PlanId { get; private set; } = null!;

        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        [Output("rulestackId")]
        public Output<string> RulestackId { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a NextGenerationFirewallVirtualHubLocalRulestack resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NextGenerationFirewallVirtualHubLocalRulestack(string name, NextGenerationFirewallVirtualHubLocalRulestackArgs args, CustomResourceOptions? options = null)
            : base("azure:paloalto/nextGenerationFirewallVirtualHubLocalRulestack:NextGenerationFirewallVirtualHubLocalRulestack", name, args ?? new NextGenerationFirewallVirtualHubLocalRulestackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NextGenerationFirewallVirtualHubLocalRulestack(string name, Input<string> id, NextGenerationFirewallVirtualHubLocalRulestackState? state = null, CustomResourceOptions? options = null)
            : base("azure:paloalto/nextGenerationFirewallVirtualHubLocalRulestack:NextGenerationFirewallVirtualHubLocalRulestack", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NextGenerationFirewallVirtualHubLocalRulestack resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NextGenerationFirewallVirtualHubLocalRulestack Get(string name, Input<string> id, NextGenerationFirewallVirtualHubLocalRulestackState? state = null, CustomResourceOptions? options = null)
        {
            return new NextGenerationFirewallVirtualHubLocalRulestack(name, id, state, options);
        }
    }

    public sealed class NextGenerationFirewallVirtualHubLocalRulestackArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinationNats")]
        private InputList<Inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs>? _destinationNats;
        public InputList<Inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs> DestinationNats
        {
            get => _destinationNats ?? (_destinationNats = new InputList<Inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArgs>());
            set => _destinationNats = value;
        }

        [Input("dnsSettings")]
        public Input<Inputs.NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsArgs>? DnsSettings { get; set; }

        [Input("marketplaceOfferId")]
        public Input<string>? MarketplaceOfferId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkProfile", required: true)]
        public Input<Inputs.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileArgs> NetworkProfile { get; set; } = null!;

        [Input("planId")]
        public Input<string>? PlanId { get; set; }

        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("rulestackId", required: true)]
        public Input<string> RulestackId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public NextGenerationFirewallVirtualHubLocalRulestackArgs()
        {
        }
        public static new NextGenerationFirewallVirtualHubLocalRulestackArgs Empty => new NextGenerationFirewallVirtualHubLocalRulestackArgs();
    }

    public sealed class NextGenerationFirewallVirtualHubLocalRulestackState : global::Pulumi.ResourceArgs
    {
        [Input("destinationNats")]
        private InputList<Inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatGetArgs>? _destinationNats;
        public InputList<Inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatGetArgs> DestinationNats
        {
            get => _destinationNats ?? (_destinationNats = new InputList<Inputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatGetArgs>());
            set => _destinationNats = value;
        }

        [Input("dnsSettings")]
        public Input<Inputs.NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsGetArgs>? DnsSettings { get; set; }

        [Input("marketplaceOfferId")]
        public Input<string>? MarketplaceOfferId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networkProfile")]
        public Input<Inputs.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileGetArgs>? NetworkProfile { get; set; }

        [Input("planId")]
        public Input<string>? PlanId { get; set; }

        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("rulestackId")]
        public Input<string>? RulestackId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public NextGenerationFirewallVirtualHubLocalRulestackState()
        {
        }
        public static new NextGenerationFirewallVirtualHubLocalRulestackState Empty => new NextGenerationFirewallVirtualHubLocalRulestackState();
    }
}
