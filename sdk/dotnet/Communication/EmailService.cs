// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Communication
{
    /// <summary>
    /// Manages an Email Communication Service.
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
    ///     var exampleEmailService = new Azure.Communication.EmailService("example", new()
    ///     {
    ///         Name = "example-emailcommunicationservice",
    ///         ResourceGroupName = example.Name,
    ///         DataLocation = "United States",
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
    /// * `Microsoft.Communication`: 2023-03-31
    /// 
    /// ## Import
    /// 
    /// Communication Services can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:communication/emailService:EmailService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Communication/emailServices/emailCommunicationService1
    /// ```
    /// </summary>
    [AzureResourceType("azure:communication/emailService:EmailService")]
    public partial class EmailService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
        /// </summary>
        [Output("dataLocation")]
        public Output<string> DataLocation { get; private set; } = null!;

        /// <summary>
        /// The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Email Communication Service.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a EmailService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EmailService(string name, EmailServiceArgs args, CustomResourceOptions? options = null)
            : base("azure:communication/emailService:EmailService", name, args ?? new EmailServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EmailService(string name, Input<string> id, EmailServiceState? state = null, CustomResourceOptions? options = null)
            : base("azure:communication/emailService:EmailService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EmailService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EmailService Get(string name, Input<string> id, EmailServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new EmailService(name, id, state, options);
        }
    }

    public sealed class EmailServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
        /// </summary>
        [Input("dataLocation", required: true)]
        public Input<string> DataLocation { get; set; } = null!;

        /// <summary>
        /// The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Email Communication Service.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public EmailServiceArgs()
        {
        }
        public static new EmailServiceArgs Empty => new EmailServiceArgs();
    }

    public sealed class EmailServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
        /// </summary>
        [Input("dataLocation")]
        public Input<string>? DataLocation { get; set; }

        /// <summary>
        /// The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Email Communication Service.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public EmailServiceState()
        {
        }
        public static new EmailServiceState Empty => new EmailServiceState();
    }
}
