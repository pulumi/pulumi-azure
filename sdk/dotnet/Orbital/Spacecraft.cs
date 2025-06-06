// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Orbital
{
    /// <summary>
    /// Manages a Spacecraft.
    /// 
    /// &gt; **Note:** The `azure.orbital.Spacecraft` resource has been deprecated and will be removed in v5.0 of the AzureRM Provider.
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
    ///         Name = "rg-example",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleSpacecraft = new Azure.Orbital.Spacecraft("example", new()
    ///     {
    ///         Name = "example-spacecraft",
    ///         ResourceGroupName = example.Name,
    ///         Location = "westeurope",
    ///         NoradId = "12345",
    ///         Links = new[]
    ///         {
    ///             new Azure.Orbital.Inputs.SpacecraftLinkArgs
    ///             {
    ///                 BandwidthMhz = 30,
    ///                 CenterFrequencyMhz = 2050,
    ///                 Direction = "Uplink",
    ///                 Polarization = "LHCP",
    ///                 Name = "examplename",
    ///             },
    ///         },
    ///         TwoLineElements = new[]
    ///         {
    ///             "1 23455U 94089A   97320.90946019  .00000140  00000-0  10191-3 0  2621",
    ///             "2 23455  99.0090 272.6745 0008546 223.1686 136.8816 14.11711747148495",
    ///         },
    ///         TitleLine = "AQUA",
    ///         Tags = 
    ///         {
    ///             { "aks-managed-cluster-name", "9a57225d-a405-4d40-aa46-f13d2342abef" },
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
    /// * `Microsoft.Orbital`: 2022-11-01
    /// 
    /// ## Import
    /// 
    /// Spacecraft can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:orbital/spacecraft:Spacecraft example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Orbital/spacecrafts/spacecraft1
    /// ```
    /// </summary>
    [AzureResourceType("azure:orbital/spacecraft:Spacecraft")]
    public partial class Spacecraft : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A `links` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Output("links")]
        public Output<ImmutableArray<Outputs.SpacecraftLink>> Links { get; private set; } = null!;

        /// <summary>
        /// The location where the Spacecraft exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name of the Spacecraft. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// NORAD ID of the Spacecraft.
        /// </summary>
        [Output("noradId")]
        public Output<string> NoradId { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Spacecraft exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Title of the two line elements (TLE).
        /// </summary>
        [Output("titleLine")]
        public Output<string> TitleLine { get; private set; } = null!;

        /// <summary>
        /// A list of the two line elements (TLE), the first string being the first of the TLE, the second string being the second line of the TLE. Changing this forces a new resource to be created.
        /// </summary>
        [Output("twoLineElements")]
        public Output<ImmutableArray<string>> TwoLineElements { get; private set; } = null!;


        /// <summary>
        /// Create a Spacecraft resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Spacecraft(string name, SpacecraftArgs args, CustomResourceOptions? options = null)
            : base("azure:orbital/spacecraft:Spacecraft", name, args ?? new SpacecraftArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Spacecraft(string name, Input<string> id, SpacecraftState? state = null, CustomResourceOptions? options = null)
            : base("azure:orbital/spacecraft:Spacecraft", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Spacecraft resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Spacecraft Get(string name, Input<string> id, SpacecraftState? state = null, CustomResourceOptions? options = null)
        {
            return new Spacecraft(name, id, state, options);
        }
    }

    public sealed class SpacecraftArgs : global::Pulumi.ResourceArgs
    {
        [Input("links", required: true)]
        private InputList<Inputs.SpacecraftLinkArgs>? _links;

        /// <summary>
        /// A `links` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<Inputs.SpacecraftLinkArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.SpacecraftLinkArgs>());
            set => _links = value;
        }

        /// <summary>
        /// The location where the Spacecraft exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the Spacecraft. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// NORAD ID of the Spacecraft.
        /// </summary>
        [Input("noradId", required: true)]
        public Input<string> NoradId { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Spacecraft exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Title of the two line elements (TLE).
        /// </summary>
        [Input("titleLine", required: true)]
        public Input<string> TitleLine { get; set; } = null!;

        [Input("twoLineElements", required: true)]
        private InputList<string>? _twoLineElements;

        /// <summary>
        /// A list of the two line elements (TLE), the first string being the first of the TLE, the second string being the second line of the TLE. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<string> TwoLineElements
        {
            get => _twoLineElements ?? (_twoLineElements = new InputList<string>());
            set => _twoLineElements = value;
        }

        public SpacecraftArgs()
        {
        }
        public static new SpacecraftArgs Empty => new SpacecraftArgs();
    }

    public sealed class SpacecraftState : global::Pulumi.ResourceArgs
    {
        [Input("links")]
        private InputList<Inputs.SpacecraftLinkGetArgs>? _links;

        /// <summary>
        /// A `links` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<Inputs.SpacecraftLinkGetArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.SpacecraftLinkGetArgs>());
            set => _links = value;
        }

        /// <summary>
        /// The location where the Spacecraft exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the Spacecraft. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// NORAD ID of the Spacecraft.
        /// </summary>
        [Input("noradId")]
        public Input<string>? NoradId { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Spacecraft exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Title of the two line elements (TLE).
        /// </summary>
        [Input("titleLine")]
        public Input<string>? TitleLine { get; set; }

        [Input("twoLineElements")]
        private InputList<string>? _twoLineElements;

        /// <summary>
        /// A list of the two line elements (TLE), the first string being the first of the TLE, the second string being the second line of the TLE. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<string> TwoLineElements
        {
            get => _twoLineElements ?? (_twoLineElements = new InputList<string>());
            set => _twoLineElements = value;
        }

        public SpacecraftState()
        {
        }
        public static new SpacecraftState Empty => new SpacecraftState();
    }
}
