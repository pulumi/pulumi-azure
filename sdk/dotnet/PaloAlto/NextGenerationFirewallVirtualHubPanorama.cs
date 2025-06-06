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
    /// Manages a Palo Alto Next Generation Firewall VHub Panorama.
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
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var examplePublicIp = new Azure.Network.PublicIp("example", new()
    ///     {
    ///         Name = "acceptanceTestPublicIp1",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AllocationMethod = "Static",
    ///         Tags = 
    ///         {
    ///             { "environment", "Production" },
    ///         },
    ///     });
    /// 
    ///     var exampleVirtualWan = new Azure.Network.VirtualWan("example", new()
    ///     {
    ///         Name = "example-virtualwan",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///     });
    /// 
    ///     var exampleVirtualHub = new Azure.Network.VirtualHub("example", new()
    ///     {
    ///         Name = "example-virtualhub",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         VirtualWanId = exampleVirtualWan.Id,
    ///         AddressPrefix = "10.0.0.0/23",
    ///         Tags = 
    ///         {
    ///             { "hubSaaSPreview", "true" },
    ///         },
    ///     });
    /// 
    ///     var exampleVirtualNetworkAppliance = new Azure.PaloAlto.VirtualNetworkAppliance("example", new()
    ///     {
    ///         Name = "example-appliance",
    ///         VirtualHubId = exampleVirtualHub.Id,
    ///     });
    /// 
    ///     var exampleNextGenerationFirewallVirtualHubPanorama = new Azure.PaloAlto.NextGenerationFirewallVirtualHubPanorama("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         NetworkProfile = new Azure.PaloAlto.Inputs.NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs
    ///         {
    ///             PublicIpAddressIds = new[]
    ///             {
    ///                 examplePublicIp.Id,
    ///             },
    ///             VirtualHubId = exampleVirtualHub.Id,
    ///             NetworkVirtualApplianceId = exampleVirtualNetworkAppliance.Id,
    ///         },
    ///         PanoramaBase64Config = "VGhpcyBpcyBub3QgYSByZWFsIGNvbmZpZywgcGxlYXNlIHVzZSB5b3VyIFBhbm9yYW1hIHNlcnZlciB0byBnZW5lcmF0ZSBhIHJlYWwgdmFsdWUgZm9yIHRoaXMgcHJvcGVydHkhCg==",
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
    /// * `PaloAltoNetworks.Cloudngfw`: 2023-09-01
    /// 
    /// ## Import
    /// 
    /// Palo Alto Next Generation Firewall VHub Panoramas can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:paloalto/nextGenerationFirewallVirtualHubPanorama:NextGenerationFirewallVirtualHubPanorama example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVhubPanoramaFW
    /// ```
    /// </summary>
    [AzureResourceType("azure:paloalto/nextGenerationFirewallVirtualHubPanorama:NextGenerationFirewallVirtualHubPanorama")]
    public partial class NextGenerationFirewallVirtualHubPanorama : global::Pulumi.CustomResource
    {
        /// <summary>
        /// One or more `destination_nat` blocks as defined below.
        /// </summary>
        [Output("destinationNats")]
        public Output<ImmutableArray<Outputs.NextGenerationFirewallVirtualHubPanoramaDestinationNat>> DestinationNats { get; private set; } = null!;

        /// <summary>
        /// A `dns_settings` block as defined below.
        /// </summary>
        [Output("dnsSettings")]
        public Output<Outputs.NextGenerationFirewallVirtualHubPanoramaDnsSettings?> DnsSettings { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("marketplaceOfferId")]
        public Output<string?> MarketplaceOfferId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Palo Alto Next Generation Firewall VHub Panorama. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A `network_profile` block as defined below.
        /// </summary>
        [Output("networkProfile")]
        public Output<Outputs.NextGenerationFirewallVirtualHubPanoramaNetworkProfile> NetworkProfile { get; private set; } = null!;

        /// <summary>
        /// The Base64 Encoded configuration value for connecting to the Panorama Configuration server.
        /// </summary>
        [Output("panoramaBase64Config")]
        public Output<string> PanoramaBase64Config { get; private set; } = null!;

        [Output("panoramas")]
        public Output<ImmutableArray<Outputs.NextGenerationFirewallVirtualHubPanoramaPanorama>> Panoramas { get; private set; } = null!;

        /// <summary>
        /// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
        /// 
        /// &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
        /// </summary>
        [Output("planId")]
        public Output<string?> PlanId { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Panorama.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a NextGenerationFirewallVirtualHubPanorama resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NextGenerationFirewallVirtualHubPanorama(string name, NextGenerationFirewallVirtualHubPanoramaArgs args, CustomResourceOptions? options = null)
            : base("azure:paloalto/nextGenerationFirewallVirtualHubPanorama:NextGenerationFirewallVirtualHubPanorama", name, args ?? new NextGenerationFirewallVirtualHubPanoramaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NextGenerationFirewallVirtualHubPanorama(string name, Input<string> id, NextGenerationFirewallVirtualHubPanoramaState? state = null, CustomResourceOptions? options = null)
            : base("azure:paloalto/nextGenerationFirewallVirtualHubPanorama:NextGenerationFirewallVirtualHubPanorama", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NextGenerationFirewallVirtualHubPanorama resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NextGenerationFirewallVirtualHubPanorama Get(string name, Input<string> id, NextGenerationFirewallVirtualHubPanoramaState? state = null, CustomResourceOptions? options = null)
        {
            return new NextGenerationFirewallVirtualHubPanorama(name, id, state, options);
        }
    }

    public sealed class NextGenerationFirewallVirtualHubPanoramaArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinationNats")]
        private InputList<Inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs>? _destinationNats;

        /// <summary>
        /// One or more `destination_nat` blocks as defined below.
        /// </summary>
        public InputList<Inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs> DestinationNats
        {
            get => _destinationNats ?? (_destinationNats = new InputList<Inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs>());
            set => _destinationNats = value;
        }

        /// <summary>
        /// A `dns_settings` block as defined below.
        /// </summary>
        [Input("dnsSettings")]
        public Input<Inputs.NextGenerationFirewallVirtualHubPanoramaDnsSettingsArgs>? DnsSettings { get; set; }

        /// <summary>
        /// The Azure Region where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("marketplaceOfferId")]
        public Input<string>? MarketplaceOfferId { get; set; }

        /// <summary>
        /// The name which should be used for this Palo Alto Next Generation Firewall VHub Panorama. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `network_profile` block as defined below.
        /// </summary>
        [Input("networkProfile", required: true)]
        public Input<Inputs.NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs> NetworkProfile { get; set; } = null!;

        /// <summary>
        /// The Base64 Encoded configuration value for connecting to the Panorama Configuration server.
        /// </summary>
        [Input("panoramaBase64Config", required: true)]
        public Input<string> PanoramaBase64Config { get; set; } = null!;

        /// <summary>
        /// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
        /// 
        /// &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
        /// </summary>
        [Input("planId")]
        public Input<string>? PlanId { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Panorama.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public NextGenerationFirewallVirtualHubPanoramaArgs()
        {
        }
        public static new NextGenerationFirewallVirtualHubPanoramaArgs Empty => new NextGenerationFirewallVirtualHubPanoramaArgs();
    }

    public sealed class NextGenerationFirewallVirtualHubPanoramaState : global::Pulumi.ResourceArgs
    {
        [Input("destinationNats")]
        private InputList<Inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatGetArgs>? _destinationNats;

        /// <summary>
        /// One or more `destination_nat` blocks as defined below.
        /// </summary>
        public InputList<Inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatGetArgs> DestinationNats
        {
            get => _destinationNats ?? (_destinationNats = new InputList<Inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatGetArgs>());
            set => _destinationNats = value;
        }

        /// <summary>
        /// A `dns_settings` block as defined below.
        /// </summary>
        [Input("dnsSettings")]
        public Input<Inputs.NextGenerationFirewallVirtualHubPanoramaDnsSettingsGetArgs>? DnsSettings { get; set; }

        /// <summary>
        /// The Azure Region where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The marketplace offer ID. Defaults to `pan_swfw_cloud_ngfw`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("marketplaceOfferId")]
        public Input<string>? MarketplaceOfferId { get; set; }

        /// <summary>
        /// The name which should be used for this Palo Alto Next Generation Firewall VHub Panorama. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `network_profile` block as defined below.
        /// </summary>
        [Input("networkProfile")]
        public Input<Inputs.NextGenerationFirewallVirtualHubPanoramaNetworkProfileGetArgs>? NetworkProfile { get; set; }

        /// <summary>
        /// The Base64 Encoded configuration value for connecting to the Panorama Configuration server.
        /// </summary>
        [Input("panoramaBase64Config")]
        public Input<string>? PanoramaBase64Config { get; set; }

        [Input("panoramas")]
        private InputList<Inputs.NextGenerationFirewallVirtualHubPanoramaPanoramaGetArgs>? _panoramas;
        public InputList<Inputs.NextGenerationFirewallVirtualHubPanoramaPanoramaGetArgs> Panoramas
        {
            get => _panoramas ?? (_panoramas = new InputList<Inputs.NextGenerationFirewallVirtualHubPanoramaPanoramaGetArgs>());
            set => _panoramas = value;
        }

        /// <summary>
        /// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
        /// 
        /// &gt; **Note:** The former `plan_id` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `plan_id` to `panw-cngfw-payg` when creating new resources.
        /// </summary>
        [Input("planId")]
        public Input<string>? PlanId { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Panorama should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Panorama to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Panorama.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public NextGenerationFirewallVirtualHubPanoramaState()
        {
        }
        public static new NextGenerationFirewallVirtualHubPanoramaState Empty => new NextGenerationFirewallVirtualHubPanoramaState();
    }
}
