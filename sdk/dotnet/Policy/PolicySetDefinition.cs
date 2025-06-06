// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Policy
{
    /// <summary>
    /// Manages a policy set definition.
    /// 
    /// &gt; **Note:** Policy set definitions (also known as policy initiatives) do not take effect until they are assigned to a scope using a Policy Set Assignment.
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
    ///     var example = new Azure.Policy.PolicySetDefinition("example", new()
    ///     {
    ///         Name = "testPolicySet",
    ///         PolicyType = "Custom",
    ///         DisplayName = "Test Policy Set",
    ///         Parameters = @"    {
    ///         ""allowedLocations"": {
    ///             ""type"": ""Array"",
    ///             ""metadata"": {
    ///                 ""description"": ""The list of allowed locations for resources."",
    ///                 ""displayName"": ""Allowed locations"",
    ///                 ""strongType"": ""location""
    ///             }
    ///         }
    ///     }
    /// ",
    ///         PolicyDefinitionReferences = new[]
    ///         {
    ///             new Azure.Policy.Inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs
    ///             {
    ///                 PolicyDefinitionId = "/providers/Microsoft.Authorization/policyDefinitions/e765b5de-1225-4ba3-bd56-1ac6695af988",
    ///                 ParameterValues = @"    {
    ///       ""listOfAllowedLocations"": {""value"": ""[parameters('allowedLocations')]""}
    ///     }
    /// ",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Policy Set Definitions can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:policy/policySetDefinition:PolicySetDefinition example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Authorization/policySetDefinitions/testPolicySet
    /// ```
    /// 
    /// or
    /// 
    /// ```sh
    /// $ pulumi import azure:policy/policySetDefinition:PolicySetDefinition example /providers/Microsoft.Management/managementGroups/my-mgmt-group-id/providers/Microsoft.Authorization/policySetDefinitions/testPolicySet
    /// ```
    /// </summary>
    [AzureResourceType("azure:policy/policySetDefinition:PolicySetDefinition")]
    public partial class PolicySetDefinition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the policy set definition.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The display name of the policy set definition.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The id of the Management Group where this policy set definition should be defined. Changing this forces a new resource to be created.
        /// </summary>
        [Output("managementGroupId")]
        public Output<string?> ManagementGroupId { get; private set; } = null!;

        /// <summary>
        /// The metadata for the policy set definition. This is a JSON object representing additional metadata that should be stored with the policy definition.
        /// </summary>
        [Output("metadata")]
        public Output<string> Metadata { get; private set; } = null!;

        /// <summary>
        /// The name of the policy set definition. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Parameters for the policy set definition. This field is a JSON object that allows you to parameterize your policy definition.
        /// </summary>
        [Output("parameters")]
        public Output<string?> Parameters { get; private set; } = null!;

        /// <summary>
        /// One or more `policy_definition_group` blocks as defined below.
        /// </summary>
        [Output("policyDefinitionGroups")]
        public Output<ImmutableArray<Outputs.PolicySetDefinitionPolicyDefinitionGroup>> PolicyDefinitionGroups { get; private set; } = null!;

        /// <summary>
        /// One or more `policy_definition_reference` blocks as defined below.
        /// </summary>
        [Output("policyDefinitionReferences")]
        public Output<ImmutableArray<Outputs.PolicySetDefinitionPolicyDefinitionReference>> PolicyDefinitionReferences { get; private set; } = null!;

        /// <summary>
        /// The policy set type. Possible values are `BuiltIn`, `Custom`, `NotSpecified` and `Static`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("policyType")]
        public Output<string> PolicyType { get; private set; } = null!;


        /// <summary>
        /// Create a PolicySetDefinition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PolicySetDefinition(string name, PolicySetDefinitionArgs args, CustomResourceOptions? options = null)
            : base("azure:policy/policySetDefinition:PolicySetDefinition", name, args ?? new PolicySetDefinitionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PolicySetDefinition(string name, Input<string> id, PolicySetDefinitionState? state = null, CustomResourceOptions? options = null)
            : base("azure:policy/policySetDefinition:PolicySetDefinition", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PolicySetDefinition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PolicySetDefinition Get(string name, Input<string> id, PolicySetDefinitionState? state = null, CustomResourceOptions? options = null)
        {
            return new PolicySetDefinition(name, id, state, options);
        }
    }

    public sealed class PolicySetDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the policy set definition.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The display name of the policy set definition.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The id of the Management Group where this policy set definition should be defined. Changing this forces a new resource to be created.
        /// </summary>
        [Input("managementGroupId")]
        public Input<string>? ManagementGroupId { get; set; }

        /// <summary>
        /// The metadata for the policy set definition. This is a JSON object representing additional metadata that should be stored with the policy definition.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// The name of the policy set definition. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Parameters for the policy set definition. This field is a JSON object that allows you to parameterize your policy definition.
        /// </summary>
        [Input("parameters")]
        public Input<string>? Parameters { get; set; }

        [Input("policyDefinitionGroups")]
        private InputList<Inputs.PolicySetDefinitionPolicyDefinitionGroupArgs>? _policyDefinitionGroups;

        /// <summary>
        /// One or more `policy_definition_group` blocks as defined below.
        /// </summary>
        public InputList<Inputs.PolicySetDefinitionPolicyDefinitionGroupArgs> PolicyDefinitionGroups
        {
            get => _policyDefinitionGroups ?? (_policyDefinitionGroups = new InputList<Inputs.PolicySetDefinitionPolicyDefinitionGroupArgs>());
            set => _policyDefinitionGroups = value;
        }

        [Input("policyDefinitionReferences", required: true)]
        private InputList<Inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs>? _policyDefinitionReferences;

        /// <summary>
        /// One or more `policy_definition_reference` blocks as defined below.
        /// </summary>
        public InputList<Inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs> PolicyDefinitionReferences
        {
            get => _policyDefinitionReferences ?? (_policyDefinitionReferences = new InputList<Inputs.PolicySetDefinitionPolicyDefinitionReferenceArgs>());
            set => _policyDefinitionReferences = value;
        }

        /// <summary>
        /// The policy set type. Possible values are `BuiltIn`, `Custom`, `NotSpecified` and `Static`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("policyType", required: true)]
        public Input<string> PolicyType { get; set; } = null!;

        public PolicySetDefinitionArgs()
        {
        }
        public static new PolicySetDefinitionArgs Empty => new PolicySetDefinitionArgs();
    }

    public sealed class PolicySetDefinitionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the policy set definition.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The display name of the policy set definition.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The id of the Management Group where this policy set definition should be defined. Changing this forces a new resource to be created.
        /// </summary>
        [Input("managementGroupId")]
        public Input<string>? ManagementGroupId { get; set; }

        /// <summary>
        /// The metadata for the policy set definition. This is a JSON object representing additional metadata that should be stored with the policy definition.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        /// <summary>
        /// The name of the policy set definition. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Parameters for the policy set definition. This field is a JSON object that allows you to parameterize your policy definition.
        /// </summary>
        [Input("parameters")]
        public Input<string>? Parameters { get; set; }

        [Input("policyDefinitionGroups")]
        private InputList<Inputs.PolicySetDefinitionPolicyDefinitionGroupGetArgs>? _policyDefinitionGroups;

        /// <summary>
        /// One or more `policy_definition_group` blocks as defined below.
        /// </summary>
        public InputList<Inputs.PolicySetDefinitionPolicyDefinitionGroupGetArgs> PolicyDefinitionGroups
        {
            get => _policyDefinitionGroups ?? (_policyDefinitionGroups = new InputList<Inputs.PolicySetDefinitionPolicyDefinitionGroupGetArgs>());
            set => _policyDefinitionGroups = value;
        }

        [Input("policyDefinitionReferences")]
        private InputList<Inputs.PolicySetDefinitionPolicyDefinitionReferenceGetArgs>? _policyDefinitionReferences;

        /// <summary>
        /// One or more `policy_definition_reference` blocks as defined below.
        /// </summary>
        public InputList<Inputs.PolicySetDefinitionPolicyDefinitionReferenceGetArgs> PolicyDefinitionReferences
        {
            get => _policyDefinitionReferences ?? (_policyDefinitionReferences = new InputList<Inputs.PolicySetDefinitionPolicyDefinitionReferenceGetArgs>());
            set => _policyDefinitionReferences = value;
        }

        /// <summary>
        /// The policy set type. Possible values are `BuiltIn`, `Custom`, `NotSpecified` and `Static`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("policyType")]
        public Input<string>? PolicyType { get; set; }

        public PolicySetDefinitionState()
        {
        }
        public static new PolicySetDefinitionState Empty => new PolicySetDefinitionState();
    }
}
