// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lighthouse
{
    /// <summary>
    /// Manages a [Lighthouse](https://docs.microsoft.com/azure/lighthouse) Assignment to a subscription, or to a resource group.
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
    ///     var primary = Azure.Core.GetSubscription.Invoke();
    /// 
    ///     var example = new Azure.Lighthouse.Assignment("example", new()
    ///     {
    ///         Scope = primary.Apply(getSubscriptionResult =&gt; getSubscriptionResult.Id),
    ///         LighthouseDefinitionId = "/subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.ManagedServices/registrationDefinitions/00000000-0000-0000-0000-000000000000",
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
    /// * `Microsoft.ManagedServices`: 2022-10-01
    /// 
    /// ## Import
    /// 
    /// Lighthouse Assignments can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:lighthouse/assignment:Assignment example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.ManagedServices/registrationAssignments/00000000-0000-0000-0000-000000000000
    /// ```
    /// </summary>
    [AzureResourceType("azure:lighthouse/assignment:Assignment")]
    public partial class Assignment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A Fully qualified path of the lighthouse definition, such as `/subscriptions/0afefe50-734e-4610-8c82-a144aff49dea/providers/Microsoft.ManagedServices/registrationDefinitions/26c128c2-fefa-4340-9bb1-8e081c90ada2`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("lighthouseDefinitionId")]
        public Output<string> LighthouseDefinitionId { get; private set; } = null!;

        /// <summary>
        /// A unique UUID/GUID which identifies this lighthouse assignment- one will be generated if not specified. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The scope at which the Lighthouse Assignment applies too, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333` or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("scope")]
        public Output<string> Scope { get; private set; } = null!;


        /// <summary>
        /// Create a Assignment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Assignment(string name, AssignmentArgs args, CustomResourceOptions? options = null)
            : base("azure:lighthouse/assignment:Assignment", name, args ?? new AssignmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Assignment(string name, Input<string> id, AssignmentState? state = null, CustomResourceOptions? options = null)
            : base("azure:lighthouse/assignment:Assignment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Assignment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Assignment Get(string name, Input<string> id, AssignmentState? state = null, CustomResourceOptions? options = null)
        {
            return new Assignment(name, id, state, options);
        }
    }

    public sealed class AssignmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A Fully qualified path of the lighthouse definition, such as `/subscriptions/0afefe50-734e-4610-8c82-a144aff49dea/providers/Microsoft.ManagedServices/registrationDefinitions/26c128c2-fefa-4340-9bb1-8e081c90ada2`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("lighthouseDefinitionId", required: true)]
        public Input<string> LighthouseDefinitionId { get; set; } = null!;

        /// <summary>
        /// A unique UUID/GUID which identifies this lighthouse assignment- one will be generated if not specified. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The scope at which the Lighthouse Assignment applies too, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333` or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        public AssignmentArgs()
        {
        }
        public static new AssignmentArgs Empty => new AssignmentArgs();
    }

    public sealed class AssignmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A Fully qualified path of the lighthouse definition, such as `/subscriptions/0afefe50-734e-4610-8c82-a144aff49dea/providers/Microsoft.ManagedServices/registrationDefinitions/26c128c2-fefa-4340-9bb1-8e081c90ada2`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("lighthouseDefinitionId")]
        public Input<string>? LighthouseDefinitionId { get; set; }

        /// <summary>
        /// A unique UUID/GUID which identifies this lighthouse assignment- one will be generated if not specified. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The scope at which the Lighthouse Assignment applies too, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333` or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public AssignmentState()
        {
        }
        public static new AssignmentState Empty => new AssignmentState();
    }
}
