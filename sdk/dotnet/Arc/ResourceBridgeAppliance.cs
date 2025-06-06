// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Arc
{
    /// <summary>
    /// Manages an Arc Resource Bridge Appliance.
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
    ///     var exampleResourceBridgeAppliance = new Azure.Arc.ResourceBridgeAppliance("example", new()
    ///     {
    ///         Name = "example-appliance",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Distro = "AKSEdge",
    ///         InfrastructureProvider = "VMWare",
    ///         Identity = new Azure.Arc.Inputs.ResourceBridgeApplianceIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///         Tags = 
    ///         {
    ///             { "hello", "world" },
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
    /// * `Microsoft.ResourceConnector`: 2022-10-27
    /// 
    /// ## Import
    /// 
    /// Arc Resource Bridge Appliance can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:arc/resourceBridgeAppliance:ResourceBridgeAppliance example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ResourceConnector/appliances/appliancesExample
    /// ```
    /// </summary>
    [AzureResourceType("azure:arc/resourceBridgeAppliance:ResourceBridgeAppliance")]
    public partial class ResourceBridgeAppliance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a supported Fabric/Infrastructure for this Arc Resource Bridge Appliance. The possible value is `AKSEdge`.
        /// </summary>
        [Output("distro")]
        public Output<string> Distro { get; private set; } = null!;

        /// <summary>
        /// An `identity` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.ResourceBridgeApplianceIdentity> Identity { get; private set; } = null!;

        /// <summary>
        /// The infrastructure provider about the connected Arc Resource Bridge Appliance. Possible values are `HCI`,`SCVMM` and `VMWare`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("infrastructureProvider")]
        public Output<string> InfrastructureProvider { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Arc Resource Bridge Appliance should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The Name which should be used for this Arc Resource Bridge Appliance. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The `public_key_base64` is an RSA public key in PKCS1 format encoded in base64. Changing this forces a new resource to be created.
        /// </summary>
        [Output("publicKeyBase64")]
        public Output<string?> PublicKeyBase64 { get; private set; } = null!;

        /// <summary>
        /// Specifies the resource group where the Arc Resource Bridge Appliance exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Arc Resource Bridge Appliance.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceBridgeAppliance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceBridgeAppliance(string name, ResourceBridgeApplianceArgs args, CustomResourceOptions? options = null)
            : base("azure:arc/resourceBridgeAppliance:ResourceBridgeAppliance", name, args ?? new ResourceBridgeApplianceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceBridgeAppliance(string name, Input<string> id, ResourceBridgeApplianceState? state = null, CustomResourceOptions? options = null)
            : base("azure:arc/resourceBridgeAppliance:ResourceBridgeAppliance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourceBridgeAppliance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceBridgeAppliance Get(string name, Input<string> id, ResourceBridgeApplianceState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceBridgeAppliance(name, id, state, options);
        }
    }

    public sealed class ResourceBridgeApplianceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a supported Fabric/Infrastructure for this Arc Resource Bridge Appliance. The possible value is `AKSEdge`.
        /// </summary>
        [Input("distro", required: true)]
        public Input<string> Distro { get; set; } = null!;

        /// <summary>
        /// An `identity` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("identity", required: true)]
        public Input<Inputs.ResourceBridgeApplianceIdentityArgs> Identity { get; set; } = null!;

        /// <summary>
        /// The infrastructure provider about the connected Arc Resource Bridge Appliance. Possible values are `HCI`,`SCVMM` and `VMWare`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("infrastructureProvider", required: true)]
        public Input<string> InfrastructureProvider { get; set; } = null!;

        /// <summary>
        /// The Azure Region where the Arc Resource Bridge Appliance should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The Name which should be used for this Arc Resource Bridge Appliance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The `public_key_base64` is an RSA public key in PKCS1 format encoded in base64. Changing this forces a new resource to be created.
        /// </summary>
        [Input("publicKeyBase64")]
        public Input<string>? PublicKeyBase64 { get; set; }

        /// <summary>
        /// Specifies the resource group where the Arc Resource Bridge Appliance exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Arc Resource Bridge Appliance.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ResourceBridgeApplianceArgs()
        {
        }
        public static new ResourceBridgeApplianceArgs Empty => new ResourceBridgeApplianceArgs();
    }

    public sealed class ResourceBridgeApplianceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a supported Fabric/Infrastructure for this Arc Resource Bridge Appliance. The possible value is `AKSEdge`.
        /// </summary>
        [Input("distro")]
        public Input<string>? Distro { get; set; }

        /// <summary>
        /// An `identity` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.ResourceBridgeApplianceIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// The infrastructure provider about the connected Arc Resource Bridge Appliance. Possible values are `HCI`,`SCVMM` and `VMWare`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("infrastructureProvider")]
        public Input<string>? InfrastructureProvider { get; set; }

        /// <summary>
        /// The Azure Region where the Arc Resource Bridge Appliance should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The Name which should be used for this Arc Resource Bridge Appliance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The `public_key_base64` is an RSA public key in PKCS1 format encoded in base64. Changing this forces a new resource to be created.
        /// </summary>
        [Input("publicKeyBase64")]
        public Input<string>? PublicKeyBase64 { get; set; }

        /// <summary>
        /// Specifies the resource group where the Arc Resource Bridge Appliance exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Arc Resource Bridge Appliance.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ResourceBridgeApplianceState()
        {
        }
        public static new ResourceBridgeApplianceState Empty => new ResourceBridgeApplianceState();
    }
}
