// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto
{
    /// <summary>
    /// Manages a Palo Alto Next Generation Firewall Deployed in a Virtual Network and configured via a Local Rulestack.
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
    ///         Name = "example-resource-group",
    ///         Location = "westeurope",
    ///     });
    /// 
    ///     var examplePublicIp = new Azure.Network.PublicIp("example", new()
    ///     {
    ///         Name = "example-public-ip",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         AllocationMethod = "Static",
    ///         Sku = "Standard",
    ///     });
    /// 
    ///     var exampleNetworkSecurityGroup = new Azure.Network.NetworkSecurityGroup("example", new()
    ///     {
    ///         Name = "example-nsg",
    ///         Location = test.Location,
    ///         ResourceGroupName = test.Name,
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-vnet",
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Tags = 
    ///         {
    ///             { "environment", "Production" },
    ///         },
    ///     });
    /// 
    ///     var trust = new Azure.Network.Subnet("trust", new()
    ///     {
    ///         Name = "example-trust-subnet",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.1.0/24",
    ///         },
    ///         Delegations = new[]
    ///         {
    ///             new Azure.Network.Inputs.SubnetDelegationArgs
    ///             {
    ///                 Name = "trusted",
    ///                 ServiceDelegation = new Azure.Network.Inputs.SubnetDelegationServiceDelegationArgs
    ///                 {
    ///                     Name = "PaloAltoNetworks.Cloudngfw/firewalls",
    ///                     Actions = new[]
    ///                     {
    ///                         "Microsoft.Network/virtualNetworks/subnets/join/action",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var trustSubnetNetworkSecurityGroupAssociation = new Azure.Network.SubnetNetworkSecurityGroupAssociation("trust", new()
    ///     {
    ///         SubnetId = trust.Id,
    ///         NetworkSecurityGroupId = exampleNetworkSecurityGroup.Id,
    ///     });
    /// 
    ///     var untrust = new Azure.Network.Subnet("untrust", new()
    ///     {
    ///         Name = "example-untrust-subnet",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.2.0/24",
    ///         },
    ///         Delegations = new[]
    ///         {
    ///             new Azure.Network.Inputs.SubnetDelegationArgs
    ///             {
    ///                 Name = "untrusted",
    ///                 ServiceDelegation = new Azure.Network.Inputs.SubnetDelegationServiceDelegationArgs
    ///                 {
    ///                     Name = "PaloAltoNetworks.Cloudngfw/firewalls",
    ///                     Actions = new[]
    ///                     {
    ///                         "Microsoft.Network/virtualNetworks/subnets/join/action",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var untrustSubnetNetworkSecurityGroupAssociation = new Azure.Network.SubnetNetworkSecurityGroupAssociation("untrust", new()
    ///     {
    ///         SubnetId = untrust.Id,
    ///         NetworkSecurityGroupId = exampleNetworkSecurityGroup.Id,
    ///     });
    /// 
    ///     var exampleLocalRulestack = new Azure.PaloAlto.LocalRulestack("example", new()
    ///     {
    ///         Name = "example-rulestack",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Locatio,
    ///     });
    /// 
    ///     var exampleLocalRulestackRule = new Azure.PaloAlto.LocalRulestackRule("example", new()
    ///     {
    ///         Name = "example-rulestack-rule",
    ///         RulestackId = exampleLocalRulestack.Id,
    ///         Priority = 1001,
    ///         Action = "Allow",
    ///         Applications = new[]
    ///         {
    ///             "any",
    ///         },
    ///         Destination = new Azure.PaloAlto.Inputs.LocalRulestackRuleDestinationArgs
    ///         {
    ///             Cidrs = new[]
    ///             {
    ///                 "any",
    ///             },
    ///         },
    ///         Source = new Azure.PaloAlto.Inputs.LocalRulestackRuleSourceArgs
    ///         {
    ///             Cidrs = new[]
    ///             {
    ///                 "any",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleNextGenerationFirewallVirtualNetworkLocalRulestack = new Azure.PaloAlto.NextGenerationFirewallVirtualNetworkLocalRulestack("example", new()
    ///     {
    ///         Name = "example-ngfwvn",
    ///         ResourceGroupName = example.Name,
    ///         RulestackId = exampleLocalRulestack.Id,
    ///         NetworkProfile = new Azure.PaloAlto.Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs
    ///         {
    ///             PublicIpAddressIds = new[]
    ///             {
    ///                 examplePublicIp.Id,
    ///             },
    ///             VnetConfiguration = new Azure.PaloAlto.Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfigurationArgs
    ///             {
    ///                 VirtualNetworkId = exampleVirtualNetwork.Id,
    ///                 TrustedSubnetId = trust.Id,
    ///                 UntrustedSubnetId = untrust.Id,
    ///             },
    ///         },
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
    /// * `PaloAltoNetworks.Cloudngfw`: 2023-09-01, 2022-08-29
    /// 
    /// ## Import
    /// 
    /// Palo Alto Next Generation Firewall Virtual Network Local Rulestacks can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVNetRulestackFW
    /// ```
    /// </summary>
    [AzureResourceType("azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack")]
    public partial class NextGenerationFirewallVirtualNetworkLocalRulestack : global::Pulumi.CustomResource
    {
        /// <summary>
        /// One or more `destination_nat` blocks as defined below.
        /// </summary>
        [Output("destinationNats")]
        public Output<ImmutableArray<Outputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat>> DestinationNats { get; private set; } = null!;

        /// <summary>
        /// A `dns_settings` block as defined below.
        /// </summary>
        [Output("dnsSettings")]
        public Output<Outputs.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings?> DnsSettings { get; private set; } = null!;

        /// <summary>
        /// The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("marketplaceOfferId")]
        public Output<string?> MarketplaceOfferId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A `network_profile` block as defined below.
        /// </summary>
        [Output("networkProfile")]
        public Output<Outputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile> NetworkProfile { get; private set; } = null!;

        /// <summary>
        /// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
        /// 
        /// &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
        /// </summary>
        [Output("planId")]
        public Output<string?> PlanId { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Local Rulestack which will be used to configure this Firewall Resource.
        /// </summary>
        [Output("rulestackId")]
        public Output<string> RulestackId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a NextGenerationFirewallVirtualNetworkLocalRulestack resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NextGenerationFirewallVirtualNetworkLocalRulestack(string name, NextGenerationFirewallVirtualNetworkLocalRulestackArgs args, CustomResourceOptions? options = null)
            : base("azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack", name, args ?? new NextGenerationFirewallVirtualNetworkLocalRulestackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NextGenerationFirewallVirtualNetworkLocalRulestack(string name, Input<string> id, NextGenerationFirewallVirtualNetworkLocalRulestackState? state = null, CustomResourceOptions? options = null)
            : base("azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NextGenerationFirewallVirtualNetworkLocalRulestack resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NextGenerationFirewallVirtualNetworkLocalRulestack Get(string name, Input<string> id, NextGenerationFirewallVirtualNetworkLocalRulestackState? state = null, CustomResourceOptions? options = null)
        {
            return new NextGenerationFirewallVirtualNetworkLocalRulestack(name, id, state, options);
        }
    }

    public sealed class NextGenerationFirewallVirtualNetworkLocalRulestackArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinationNats")]
        private InputList<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs>? _destinationNats;

        /// <summary>
        /// One or more `destination_nat` blocks as defined below.
        /// </summary>
        public InputList<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs> DestinationNats
        {
            get => _destinationNats ?? (_destinationNats = new InputList<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArgs>());
            set => _destinationNats = value;
        }

        /// <summary>
        /// A `dns_settings` block as defined below.
        /// </summary>
        [Input("dnsSettings")]
        public Input<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsArgs>? DnsSettings { get; set; }

        /// <summary>
        /// The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("marketplaceOfferId")]
        public Input<string>? MarketplaceOfferId { get; set; }

        /// <summary>
        /// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `network_profile` block as defined below.
        /// </summary>
        [Input("networkProfile", required: true)]
        public Input<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileArgs> NetworkProfile { get; set; } = null!;

        /// <summary>
        /// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
        /// 
        /// &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
        /// </summary>
        [Input("planId")]
        public Input<string>? PlanId { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The ID of the Local Rulestack which will be used to configure this Firewall Resource.
        /// </summary>
        [Input("rulestackId", required: true)]
        public Input<string> RulestackId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public NextGenerationFirewallVirtualNetworkLocalRulestackArgs()
        {
        }
        public static new NextGenerationFirewallVirtualNetworkLocalRulestackArgs Empty => new NextGenerationFirewallVirtualNetworkLocalRulestackArgs();
    }

    public sealed class NextGenerationFirewallVirtualNetworkLocalRulestackState : global::Pulumi.ResourceArgs
    {
        [Input("destinationNats")]
        private InputList<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatGetArgs>? _destinationNats;

        /// <summary>
        /// One or more `destination_nat` blocks as defined below.
        /// </summary>
        public InputList<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatGetArgs> DestinationNats
        {
            get => _destinationNats ?? (_destinationNats = new InputList<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatGetArgs>());
            set => _destinationNats = value;
        }

        /// <summary>
        /// A `dns_settings` block as defined below.
        /// </summary>
        [Input("dnsSettings")]
        public Input<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsGetArgs>? DnsSettings { get; set; }

        /// <summary>
        /// The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("marketplaceOfferId")]
        public Input<string>? MarketplaceOfferId { get; set; }

        /// <summary>
        /// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `network_profile` block as defined below.
        /// </summary>
        [Input("networkProfile")]
        public Input<Inputs.NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileGetArgs>? NetworkProfile { get; set; }

        /// <summary>
        /// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
        /// 
        /// &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
        /// </summary>
        [Input("planId")]
        public Input<string>? PlanId { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The ID of the Local Rulestack which will be used to configure this Firewall Resource.
        /// </summary>
        [Input("rulestackId")]
        public Input<string>? RulestackId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public NextGenerationFirewallVirtualNetworkLocalRulestackState()
        {
        }
        public static new NextGenerationFirewallVirtualNetworkLocalRulestackState Empty => new NextGenerationFirewallVirtualNetworkLocalRulestackState();
    }
}
