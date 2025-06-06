// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.EventGrid
{
    /// <summary>
    /// Manages an Event Grid Partner Configuration.
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
    ///     var examplePartnerConfiguration = new Azure.EventGrid.PartnerConfiguration("example", new()
    ///     {
    ///         ResourceGroupName = example.Name,
    ///         DefaultMaximumExpirationTimeInDays = 14,
    ///         PartnerAuthorizations = new[]
    ///         {
    ///             new Azure.EventGrid.Inputs.PartnerConfigurationPartnerAuthorizationArgs
    ///             {
    ///                 PartnerRegistrationId = "804a11ca-ce9b-4158-8e94-3c8dc7a072ec",
    ///                 PartnerName = "Auth0",
    ///                 AuthorizationExpirationTimeInUtc = "2025-02-05T00:00:00Z",
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "environment", "Production" },
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
    /// * `Microsoft.EventGrid`: 2022-06-15
    /// 
    /// ## Import
    /// 
    /// Event Grid Partner Configurations can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:eventgrid/partnerConfiguration:PartnerConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1
    /// ```
    /// </summary>
    [AzureResourceType("azure:eventgrid/partnerConfiguration:PartnerConfiguration")]
    public partial class PartnerConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Time used to validate the authorization expiration time for each authorized partner. Defaults to `7`.
        /// </summary>
        [Output("defaultMaximumExpirationTimeInDays")]
        public Output<int?> DefaultMaximumExpirationTimeInDays { get; private set; } = null!;

        /// <summary>
        /// One or more `partner_authorization` blocks as defined below.
        /// </summary>
        [Output("partnerAuthorizations")]
        public Output<ImmutableArray<Outputs.PartnerConfigurationPartnerAuthorization>> PartnerAuthorizations { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Event Grid Partner Configuration should exist. Changing this forces a new Event Grid Partner Configuration to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Event Grid Partner Configuration.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a PartnerConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PartnerConfiguration(string name, PartnerConfigurationArgs args, CustomResourceOptions? options = null)
            : base("azure:eventgrid/partnerConfiguration:PartnerConfiguration", name, args ?? new PartnerConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PartnerConfiguration(string name, Input<string> id, PartnerConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("azure:eventgrid/partnerConfiguration:PartnerConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PartnerConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PartnerConfiguration Get(string name, Input<string> id, PartnerConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new PartnerConfiguration(name, id, state, options);
        }
    }

    public sealed class PartnerConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time used to validate the authorization expiration time for each authorized partner. Defaults to `7`.
        /// </summary>
        [Input("defaultMaximumExpirationTimeInDays")]
        public Input<int>? DefaultMaximumExpirationTimeInDays { get; set; }

        [Input("partnerAuthorizations")]
        private InputList<Inputs.PartnerConfigurationPartnerAuthorizationArgs>? _partnerAuthorizations;

        /// <summary>
        /// One or more `partner_authorization` blocks as defined below.
        /// </summary>
        public InputList<Inputs.PartnerConfigurationPartnerAuthorizationArgs> PartnerAuthorizations
        {
            get => _partnerAuthorizations ?? (_partnerAuthorizations = new InputList<Inputs.PartnerConfigurationPartnerAuthorizationArgs>());
            set => _partnerAuthorizations = value;
        }

        /// <summary>
        /// The name of the Resource Group where the Event Grid Partner Configuration should exist. Changing this forces a new Event Grid Partner Configuration to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Event Grid Partner Configuration.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public PartnerConfigurationArgs()
        {
        }
        public static new PartnerConfigurationArgs Empty => new PartnerConfigurationArgs();
    }

    public sealed class PartnerConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time used to validate the authorization expiration time for each authorized partner. Defaults to `7`.
        /// </summary>
        [Input("defaultMaximumExpirationTimeInDays")]
        public Input<int>? DefaultMaximumExpirationTimeInDays { get; set; }

        [Input("partnerAuthorizations")]
        private InputList<Inputs.PartnerConfigurationPartnerAuthorizationGetArgs>? _partnerAuthorizations;

        /// <summary>
        /// One or more `partner_authorization` blocks as defined below.
        /// </summary>
        public InputList<Inputs.PartnerConfigurationPartnerAuthorizationGetArgs> PartnerAuthorizations
        {
            get => _partnerAuthorizations ?? (_partnerAuthorizations = new InputList<Inputs.PartnerConfigurationPartnerAuthorizationGetArgs>());
            set => _partnerAuthorizations = value;
        }

        /// <summary>
        /// The name of the Resource Group where the Event Grid Partner Configuration should exist. Changing this forces a new Event Grid Partner Configuration to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Event Grid Partner Configuration.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public PartnerConfigurationState()
        {
        }
        public static new PartnerConfigurationState Empty => new PartnerConfigurationState();
    }
}
