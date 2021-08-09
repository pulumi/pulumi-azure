// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core
{
    /// <summary>
    /// Manages a Policy Assignment to a Resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleVirtualNetwork = Output.Create(Azure.Network.GetVirtualNetwork.InvokeAsync(new Azure.Network.GetVirtualNetworkArgs
    ///         {
    ///             Name = "production",
    ///             ResourceGroupName = "networking",
    ///         }));
    ///         var exampleDefinition = new Azure.Policy.Definition("exampleDefinition", new Azure.Policy.DefinitionArgs
    ///         {
    ///             PolicyType = "Custom",
    ///             Mode = "All",
    ///             PolicyRule = @"	{
    ///     ""if"": {
    ///       ""not"": {
    ///         ""field"": ""location"",
    ///         ""equals"": ""westeurope""
    ///       }
    ///     },
    ///     ""then"": {
    ///       ""effect"": ""Deny""
    ///     }
    ///   }
    /// ",
    ///         });
    ///         var exampleResourcePolicyAssignment = new Azure.Core.ResourcePolicyAssignment("exampleResourcePolicyAssignment", new Azure.Core.ResourcePolicyAssignmentArgs
    ///         {
    ///             ResourceId = exampleVirtualNetwork.Apply(exampleVirtualNetwork =&gt; exampleVirtualNetwork.Id),
    ///             PolicyDefinitionId = exampleDefinition.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Resource Policy Assignments can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:core/resourcePolicyAssignment:ResourcePolicyAssignment example "{resource}/providers/Microsoft.Authorization/policyAssignments/assignment1"
    /// ```
    /// 
    ///  where `{resource}` is a Resource ID in the form `/subscriptions/00000000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualNetworks/network1`.
    /// </summary>
    [AzureResourceType("azure:core/resourcePolicyAssignment:ResourcePolicyAssignment")]
    public partial class ResourcePolicyAssignment : Pulumi.CustomResource
    {
        /// <summary>
        /// A description which should be used for this Policy Assignment.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The Display Name for this Policy Assignment.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Specifies if this Policy should be enforced or not?
        /// </summary>
        [Output("enforce")]
        public Output<bool?> Enforce { get; private set; } = null!;

        /// <summary>
        /// A `identity` block as defined below.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.ResourcePolicyAssignmentIdentity?> Identity { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// A JSON mapping of any Metadata for this Policy.
        /// </summary>
        [Output("metadata")]
        public Output<string> Metadata { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Policy Assignment. Changing this forces a new Resource Policy Assignment to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
        /// </summary>
        [Output("notScopes")]
        public Output<ImmutableArray<string>> NotScopes { get; private set; } = null!;

        /// <summary>
        /// A JSON mapping of any Parameters for this Policy. Changing this forces a new Management Group Policy Assignment to be created.
        /// </summary>
        [Output("parameters")]
        public Output<string?> Parameters { get; private set; } = null!;

        /// <summary>
        /// The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
        /// </summary>
        [Output("policyDefinitionId")]
        public Output<string> PolicyDefinitionId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Resource (or Resource Scope) where this should be applied. Changing this forces a new Resource Policy Assignment to be created.
        /// </summary>
        [Output("resourceId")]
        public Output<string> ResourceId { get; private set; } = null!;


        /// <summary>
        /// Create a ResourcePolicyAssignment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourcePolicyAssignment(string name, ResourcePolicyAssignmentArgs args, CustomResourceOptions? options = null)
            : base("azure:core/resourcePolicyAssignment:ResourcePolicyAssignment", name, args ?? new ResourcePolicyAssignmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourcePolicyAssignment(string name, Input<string> id, ResourcePolicyAssignmentState? state = null, CustomResourceOptions? options = null)
            : base("azure:core/resourcePolicyAssignment:ResourcePolicyAssignment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourcePolicyAssignment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourcePolicyAssignment Get(string name, Input<string> id, ResourcePolicyAssignmentState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourcePolicyAssignment(name, id, state, options);
        }
    }

    public sealed class ResourcePolicyAssignmentArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description which should be used for this Policy Assignment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Display Name for this Policy Assignment.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Specifies if this Policy should be enforced or not?
        /// </summary>
        [Input("enforce")]
        public Input<bool>? Enforce { get; set; }

        /// <summary>
        /// A `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.ResourcePolicyAssignmentIdentityArgs>? Identity { get; set; }

        /// <summary>
        /// The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// A JSON mapping of any Metadata for this Policy.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// The name which should be used for this Policy Assignment. Changing this forces a new Resource Policy Assignment to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notScopes")]
        private InputList<string>? _notScopes;

        /// <summary>
        /// Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
        /// </summary>
        public InputList<string> NotScopes
        {
            get => _notScopes ?? (_notScopes = new InputList<string>());
            set => _notScopes = value;
        }

        /// <summary>
        /// A JSON mapping of any Parameters for this Policy. Changing this forces a new Management Group Policy Assignment to be created.
        /// </summary>
        [Input("parameters")]
        public Input<string>? Parameters { get; set; }

        /// <summary>
        /// The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
        /// </summary>
        [Input("policyDefinitionId", required: true)]
        public Input<string> PolicyDefinitionId { get; set; } = null!;

        /// <summary>
        /// The ID of the Resource (or Resource Scope) where this should be applied. Changing this forces a new Resource Policy Assignment to be created.
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        public ResourcePolicyAssignmentArgs()
        {
        }
    }

    public sealed class ResourcePolicyAssignmentState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description which should be used for this Policy Assignment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Display Name for this Policy Assignment.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Specifies if this Policy should be enforced or not?
        /// </summary>
        [Input("enforce")]
        public Input<bool>? Enforce { get; set; }

        /// <summary>
        /// A `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.ResourcePolicyAssignmentIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// A JSON mapping of any Metadata for this Policy.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// The name which should be used for this Policy Assignment. Changing this forces a new Resource Policy Assignment to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notScopes")]
        private InputList<string>? _notScopes;

        /// <summary>
        /// Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
        /// </summary>
        public InputList<string> NotScopes
        {
            get => _notScopes ?? (_notScopes = new InputList<string>());
            set => _notScopes = value;
        }

        /// <summary>
        /// A JSON mapping of any Parameters for this Policy. Changing this forces a new Management Group Policy Assignment to be created.
        /// </summary>
        [Input("parameters")]
        public Input<string>? Parameters { get; set; }

        /// <summary>
        /// The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
        /// </summary>
        [Input("policyDefinitionId")]
        public Input<string>? PolicyDefinitionId { get; set; }

        /// <summary>
        /// The ID of the Resource (or Resource Scope) where this should be applied. Changing this forces a new Resource Policy Assignment to be created.
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        public ResourcePolicyAssignmentState()
        {
        }
    }
}