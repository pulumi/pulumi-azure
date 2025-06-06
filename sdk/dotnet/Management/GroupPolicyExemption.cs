// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Management
{
    /// <summary>
    /// Manages a Management Group Policy Exemption.
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
    ///     var exampleGroup = new Azure.Management.Group("example", new()
    ///     {
    ///         DisplayName = "Example MgmtGroup",
    ///     });
    /// 
    ///     var example = Azure.Policy.GetPolicySetDefinition.Invoke(new()
    ///     {
    ///         DisplayName = "Audit machines with insecure password security settings",
    ///     });
    /// 
    ///     var exampleGroupPolicyAssignment = new Azure.Management.GroupPolicyAssignment("example", new()
    ///     {
    ///         Name = "assignment1",
    ///         ManagementGroupId = exampleGroup.Id,
    ///         PolicyDefinitionId = example.Apply(getPolicySetDefinitionResult =&gt; getPolicySetDefinitionResult.Id),
    ///         Location = "westus",
    ///         Identity = new Azure.Management.Inputs.GroupPolicyAssignmentIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    ///     var exampleGroupPolicyExemption = new Azure.Management.GroupPolicyExemption("example", new()
    ///     {
    ///         Name = "exemption1",
    ///         ManagementGroupId = exampleGroup.Id,
    ///         PolicyAssignmentId = exampleGroupPolicyAssignment.Id,
    ///         ExemptionCategory = "Mitigated",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Policy Exemptions can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:management/groupPolicyExemption:GroupPolicyExemption exemption1 /providers/Microsoft.Management/managementGroups/group1/providers/Microsoft.Authorization/policyExemptions/exemption1
    /// ```
    /// </summary>
    [AzureResourceType("azure:management/groupPolicyExemption:GroupPolicyExemption")]
    public partial class GroupPolicyExemption : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A description to use for this Policy Exemption.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A friendly display name to use for this Policy Exemption.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The category of this policy exemption. Possible values are `Waiver` and `Mitigated`.
        /// </summary>
        [Output("exemptionCategory")]
        public Output<string> ExemptionCategory { get; private set; } = null!;

        /// <summary>
        /// The expiration date and time in UTC ISO 8601 format of this policy exemption.
        /// </summary>
        [Output("expiresOn")]
        public Output<string?> ExpiresOn { get; private set; } = null!;

        /// <summary>
        /// The Management Group ID where the Policy Exemption should be applied. Changing this forces a new resource to be created.
        /// </summary>
        [Output("managementGroupId")]
        public Output<string> ManagementGroupId { get; private set; } = null!;

        /// <summary>
        /// The metadata for this policy exemption. This is a JSON string representing additional metadata that should be stored with the policy exemption.
        /// </summary>
        [Output("metadata")]
        public Output<string> Metadata { get; private set; } = null!;

        /// <summary>
        /// The name of the Policy Exemption. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Policy Assignment to be exempted at the specified Scope.
        /// </summary>
        [Output("policyAssignmentId")]
        public Output<string> PolicyAssignmentId { get; private set; } = null!;

        /// <summary>
        /// The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
        /// </summary>
        [Output("policyDefinitionReferenceIds")]
        public Output<ImmutableArray<string>> PolicyDefinitionReferenceIds { get; private set; } = null!;


        /// <summary>
        /// Create a GroupPolicyExemption resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GroupPolicyExemption(string name, GroupPolicyExemptionArgs args, CustomResourceOptions? options = null)
            : base("azure:management/groupPolicyExemption:GroupPolicyExemption", name, args ?? new GroupPolicyExemptionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GroupPolicyExemption(string name, Input<string> id, GroupPolicyExemptionState? state = null, CustomResourceOptions? options = null)
            : base("azure:management/groupPolicyExemption:GroupPolicyExemption", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GroupPolicyExemption resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GroupPolicyExemption Get(string name, Input<string> id, GroupPolicyExemptionState? state = null, CustomResourceOptions? options = null)
        {
            return new GroupPolicyExemption(name, id, state, options);
        }
    }

    public sealed class GroupPolicyExemptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description to use for this Policy Exemption.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A friendly display name to use for this Policy Exemption.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The category of this policy exemption. Possible values are `Waiver` and `Mitigated`.
        /// </summary>
        [Input("exemptionCategory", required: true)]
        public Input<string> ExemptionCategory { get; set; } = null!;

        /// <summary>
        /// The expiration date and time in UTC ISO 8601 format of this policy exemption.
        /// </summary>
        [Input("expiresOn")]
        public Input<string>? ExpiresOn { get; set; }

        /// <summary>
        /// The Management Group ID where the Policy Exemption should be applied. Changing this forces a new resource to be created.
        /// </summary>
        [Input("managementGroupId", required: true)]
        public Input<string> ManagementGroupId { get; set; } = null!;

        /// <summary>
        /// The metadata for this policy exemption. This is a JSON string representing additional metadata that should be stored with the policy exemption.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// The name of the Policy Exemption. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Policy Assignment to be exempted at the specified Scope.
        /// </summary>
        [Input("policyAssignmentId", required: true)]
        public Input<string> PolicyAssignmentId { get; set; } = null!;

        [Input("policyDefinitionReferenceIds")]
        private InputList<string>? _policyDefinitionReferenceIds;

        /// <summary>
        /// The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
        /// </summary>
        public InputList<string> PolicyDefinitionReferenceIds
        {
            get => _policyDefinitionReferenceIds ?? (_policyDefinitionReferenceIds = new InputList<string>());
            set => _policyDefinitionReferenceIds = value;
        }

        public GroupPolicyExemptionArgs()
        {
        }
        public static new GroupPolicyExemptionArgs Empty => new GroupPolicyExemptionArgs();
    }

    public sealed class GroupPolicyExemptionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description to use for this Policy Exemption.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A friendly display name to use for this Policy Exemption.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The category of this policy exemption. Possible values are `Waiver` and `Mitigated`.
        /// </summary>
        [Input("exemptionCategory")]
        public Input<string>? ExemptionCategory { get; set; }

        /// <summary>
        /// The expiration date and time in UTC ISO 8601 format of this policy exemption.
        /// </summary>
        [Input("expiresOn")]
        public Input<string>? ExpiresOn { get; set; }

        /// <summary>
        /// The Management Group ID where the Policy Exemption should be applied. Changing this forces a new resource to be created.
        /// </summary>
        [Input("managementGroupId")]
        public Input<string>? ManagementGroupId { get; set; }

        /// <summary>
        /// The metadata for this policy exemption. This is a JSON string representing additional metadata that should be stored with the policy exemption.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// The name of the Policy Exemption. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Policy Assignment to be exempted at the specified Scope.
        /// </summary>
        [Input("policyAssignmentId")]
        public Input<string>? PolicyAssignmentId { get; set; }

        [Input("policyDefinitionReferenceIds")]
        private InputList<string>? _policyDefinitionReferenceIds;

        /// <summary>
        /// The policy definition reference ID list when the associated policy assignment is an assignment of a policy set definition.
        /// </summary>
        public InputList<string> PolicyDefinitionReferenceIds
        {
            get => _policyDefinitionReferenceIds ?? (_policyDefinitionReferenceIds = new InputList<string>());
            set => _policyDefinitionReferenceIds = value;
        }

        public GroupPolicyExemptionState()
        {
        }
        public static new GroupPolicyExemptionState Empty => new GroupPolicyExemptionState();
    }
}
