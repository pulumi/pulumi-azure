// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Policy Assignment to a Management Group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.management.Group("example", {displayName: "Some Management Group"});
 * const exampleDefinition = new azure.policy.Definition("example", {
 *     name: "only-deploy-in-westeurope",
 *     policyType: "Custom",
 *     mode: "All",
 *     displayName: "my-policy-definition",
 *     managementGroupId: example.id,
 *     policyRule: ` {
 *     "if": {
 *       "not": {
 *         "field": "location",
 *         "equals": "westeurope"
 *       }
 *     },
 *     "then": {
 *       "effect": "Deny"
 *     }
 *   }
 * `,
 * });
 * const exampleGroupPolicyAssignment = new azure.management.GroupPolicyAssignment("example", {
 *     name: "example-policy",
 *     policyDefinitionId: exampleDefinition.id,
 *     managementGroupId: example.id,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Authorization`: 2022-06-01
 *
 * ## Import
 *
 * Management Group Policy Assignments can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:management/groupPolicyAssignment:GroupPolicyAssignment example /providers/Microsoft.Management/managementGroups/group1/providers/Microsoft.Authorization/policyAssignments/assignment1
 * ```
 */
export class GroupPolicyAssignment extends pulumi.CustomResource {
    /**
     * Get an existing GroupPolicyAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupPolicyAssignmentState, opts?: pulumi.CustomResourceOptions): GroupPolicyAssignment {
        return new GroupPolicyAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:management/groupPolicyAssignment:GroupPolicyAssignment';

    /**
     * Returns true if the given object is an instance of GroupPolicyAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GroupPolicyAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GroupPolicyAssignment.__pulumiType;
    }

    /**
     * A description which should be used for this Policy Assignment.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The Display Name for this Policy Assignment.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * Specifies if this Policy should be enforced or not? Defaults to `true`.
     */
    public readonly enforce!: pulumi.Output<boolean | undefined>;
    /**
     * An `identity` block as defined below.
     *
     * > **Note:** The `location` field must also be specified when `identity` is specified.
     */
    public readonly identity!: pulumi.Output<outputs.management.GroupPolicyAssignmentIdentity | undefined>;
    /**
     * The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The ID of the Management Group. Changing this forces a new Policy Assignment to be created.
     */
    public readonly managementGroupId!: pulumi.Output<string>;
    /**
     * A JSON mapping of any Metadata for this Policy.
     */
    public readonly metadata!: pulumi.Output<string>;
    /**
     * The name which should be used for this Policy Assignment. Possible values must be between 3 and 24 characters in length. Changing this forces a new Policy Assignment to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * One or more `nonComplianceMessage` blocks as defined below.
     */
    public readonly nonComplianceMessages!: pulumi.Output<outputs.management.GroupPolicyAssignmentNonComplianceMessage[] | undefined>;
    /**
     * Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
     */
    public readonly notScopes!: pulumi.Output<string[] | undefined>;
    /**
     * One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
     */
    public readonly overrides!: pulumi.Output<outputs.management.GroupPolicyAssignmentOverride[] | undefined>;
    /**
     * A JSON mapping of any Parameters for this Policy.
     */
    public readonly parameters!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
     */
    public readonly policyDefinitionId!: pulumi.Output<string>;
    /**
     * One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     */
    public readonly resourceSelectors!: pulumi.Output<outputs.management.GroupPolicyAssignmentResourceSelector[] | undefined>;

    /**
     * Create a GroupPolicyAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupPolicyAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupPolicyAssignmentArgs | GroupPolicyAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GroupPolicyAssignmentState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["enforce"] = state ? state.enforce : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["managementGroupId"] = state ? state.managementGroupId : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nonComplianceMessages"] = state ? state.nonComplianceMessages : undefined;
            resourceInputs["notScopes"] = state ? state.notScopes : undefined;
            resourceInputs["overrides"] = state ? state.overrides : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["policyDefinitionId"] = state ? state.policyDefinitionId : undefined;
            resourceInputs["resourceSelectors"] = state ? state.resourceSelectors : undefined;
        } else {
            const args = argsOrState as GroupPolicyAssignmentArgs | undefined;
            if ((!args || args.managementGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'managementGroupId'");
            }
            if ((!args || args.policyDefinitionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyDefinitionId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["enforce"] = args ? args.enforce : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["managementGroupId"] = args ? args.managementGroupId : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nonComplianceMessages"] = args ? args.nonComplianceMessages : undefined;
            resourceInputs["notScopes"] = args ? args.notScopes : undefined;
            resourceInputs["overrides"] = args ? args.overrides : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["policyDefinitionId"] = args ? args.policyDefinitionId : undefined;
            resourceInputs["resourceSelectors"] = args ? args.resourceSelectors : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GroupPolicyAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GroupPolicyAssignment resources.
 */
export interface GroupPolicyAssignmentState {
    /**
     * A description which should be used for this Policy Assignment.
     */
    description?: pulumi.Input<string>;
    /**
     * The Display Name for this Policy Assignment.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Specifies if this Policy should be enforced or not? Defaults to `true`.
     */
    enforce?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below.
     *
     * > **Note:** The `location` field must also be specified when `identity` is specified.
     */
    identity?: pulumi.Input<inputs.management.GroupPolicyAssignmentIdentity>;
    /**
     * The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the Management Group. Changing this forces a new Policy Assignment to be created.
     */
    managementGroupId?: pulumi.Input<string>;
    /**
     * A JSON mapping of any Metadata for this Policy.
     */
    metadata?: pulumi.Input<string>;
    /**
     * The name which should be used for this Policy Assignment. Possible values must be between 3 and 24 characters in length. Changing this forces a new Policy Assignment to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `nonComplianceMessage` blocks as defined below.
     */
    nonComplianceMessages?: pulumi.Input<pulumi.Input<inputs.management.GroupPolicyAssignmentNonComplianceMessage>[]>;
    /**
     * Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
     */
    notScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
     */
    overrides?: pulumi.Input<pulumi.Input<inputs.management.GroupPolicyAssignmentOverride>[]>;
    /**
     * A JSON mapping of any Parameters for this Policy.
     */
    parameters?: pulumi.Input<string>;
    /**
     * The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
     */
    policyDefinitionId?: pulumi.Input<string>;
    /**
     * One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     */
    resourceSelectors?: pulumi.Input<pulumi.Input<inputs.management.GroupPolicyAssignmentResourceSelector>[]>;
}

/**
 * The set of arguments for constructing a GroupPolicyAssignment resource.
 */
export interface GroupPolicyAssignmentArgs {
    /**
     * A description which should be used for this Policy Assignment.
     */
    description?: pulumi.Input<string>;
    /**
     * The Display Name for this Policy Assignment.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Specifies if this Policy should be enforced or not? Defaults to `true`.
     */
    enforce?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below.
     *
     * > **Note:** The `location` field must also be specified when `identity` is specified.
     */
    identity?: pulumi.Input<inputs.management.GroupPolicyAssignmentIdentity>;
    /**
     * The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the Management Group. Changing this forces a new Policy Assignment to be created.
     */
    managementGroupId: pulumi.Input<string>;
    /**
     * A JSON mapping of any Metadata for this Policy.
     */
    metadata?: pulumi.Input<string>;
    /**
     * The name which should be used for this Policy Assignment. Possible values must be between 3 and 24 characters in length. Changing this forces a new Policy Assignment to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `nonComplianceMessage` blocks as defined below.
     */
    nonComplianceMessages?: pulumi.Input<pulumi.Input<inputs.management.GroupPolicyAssignmentNonComplianceMessage>[]>;
    /**
     * Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
     */
    notScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
     */
    overrides?: pulumi.Input<pulumi.Input<inputs.management.GroupPolicyAssignmentOverride>[]>;
    /**
     * A JSON mapping of any Parameters for this Policy.
     */
    parameters?: pulumi.Input<string>;
    /**
     * The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
     */
    policyDefinitionId: pulumi.Input<string>;
    /**
     * One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     */
    resourceSelectors?: pulumi.Input<pulumi.Input<inputs.management.GroupPolicyAssignmentResourceSelector>[]>;
}
