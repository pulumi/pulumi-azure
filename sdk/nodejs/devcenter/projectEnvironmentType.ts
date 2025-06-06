// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Dev Center Project Environment Type.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const current = azure.core.getClientConfig({});
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleDevCenter = new azure.devcenter.DevCenter("example", {
 *     name: "example-dc",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     identity: {
 *         type: "SystemAssigned",
 *     },
 * });
 * const exampleEnvironmentType = new azure.devcenter.EnvironmentType("example", {
 *     name: "example-et",
 *     devCenterId: exampleDevCenter.id,
 * });
 * const exampleProject = new azure.devcenter.Project("example", {
 *     name: "example-dcp",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     devCenterId: exampleDevCenter.id,
 * }, {
 *     dependsOn: [exampleEnvironmentType],
 * });
 * const exampleProjectEnvironmentType = new azure.devcenter.ProjectEnvironmentType("example", {
 *     name: "example-et",
 *     location: example.location,
 *     devCenterProjectId: exampleProject.id,
 *     deploymentTargetId: current.then(current => `/subscriptions/${current.subscriptionId}`),
 *     identity: {
 *         type: "SystemAssigned",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.DevCenter`: 2025-02-01
 *
 * ## Import
 *
 * An existing Dev Center Project Environment Type can be imported into Pulumi using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:devcenter/projectEnvironmentType:ProjectEnvironmentType example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevCenter/projects/project1/environmentTypes/et1
 * ```
 */
export class ProjectEnvironmentType extends pulumi.CustomResource {
    /**
     * Get an existing ProjectEnvironmentType resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectEnvironmentTypeState, opts?: pulumi.CustomResourceOptions): ProjectEnvironmentType {
        return new ProjectEnvironmentType(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:devcenter/projectEnvironmentType:ProjectEnvironmentType';

    /**
     * Returns true if the given object is an instance of ProjectEnvironmentType.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectEnvironmentType {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectEnvironmentType.__pulumiType;
    }

    /**
     * A list of roles to assign to the environment creator.
     */
    public readonly creatorRoleAssignmentRoles!: pulumi.Output<string[] | undefined>;
    /**
     * The ID of the subscription that the Environment Type will be mapped to. The environment's resources will be deployed into this subscription.
     */
    public readonly deploymentTargetId!: pulumi.Output<string>;
    /**
     * The ID of the associated Dev Center Project. Changing this forces a new resource to be created.
     */
    public readonly devCenterProjectId!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.devcenter.ProjectEnvironmentTypeIdentity>;
    /**
     * The Azure Region where the Dev Center Project Environment Type should exist. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of this Dev Center Project Environment Type. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Dev Center Project Environment Type.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A `userRoleAssignment` block as defined below.
     */
    public readonly userRoleAssignments!: pulumi.Output<outputs.devcenter.ProjectEnvironmentTypeUserRoleAssignment[] | undefined>;

    /**
     * Create a ProjectEnvironmentType resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectEnvironmentTypeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectEnvironmentTypeArgs | ProjectEnvironmentTypeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectEnvironmentTypeState | undefined;
            resourceInputs["creatorRoleAssignmentRoles"] = state ? state.creatorRoleAssignmentRoles : undefined;
            resourceInputs["deploymentTargetId"] = state ? state.deploymentTargetId : undefined;
            resourceInputs["devCenterProjectId"] = state ? state.devCenterProjectId : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userRoleAssignments"] = state ? state.userRoleAssignments : undefined;
        } else {
            const args = argsOrState as ProjectEnvironmentTypeArgs | undefined;
            if ((!args || args.deploymentTargetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deploymentTargetId'");
            }
            if ((!args || args.devCenterProjectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'devCenterProjectId'");
            }
            if ((!args || args.identity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identity'");
            }
            resourceInputs["creatorRoleAssignmentRoles"] = args ? args.creatorRoleAssignmentRoles : undefined;
            resourceInputs["deploymentTargetId"] = args ? args.deploymentTargetId : undefined;
            resourceInputs["devCenterProjectId"] = args ? args.devCenterProjectId : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userRoleAssignments"] = args ? args.userRoleAssignments : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProjectEnvironmentType.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectEnvironmentType resources.
 */
export interface ProjectEnvironmentTypeState {
    /**
     * A list of roles to assign to the environment creator.
     */
    creatorRoleAssignmentRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the subscription that the Environment Type will be mapped to. The environment's resources will be deployed into this subscription.
     */
    deploymentTargetId?: pulumi.Input<string>;
    /**
     * The ID of the associated Dev Center Project. Changing this forces a new resource to be created.
     */
    devCenterProjectId?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.devcenter.ProjectEnvironmentTypeIdentity>;
    /**
     * The Azure Region where the Dev Center Project Environment Type should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of this Dev Center Project Environment Type. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Dev Center Project Environment Type.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `userRoleAssignment` block as defined below.
     */
    userRoleAssignments?: pulumi.Input<pulumi.Input<inputs.devcenter.ProjectEnvironmentTypeUserRoleAssignment>[]>;
}

/**
 * The set of arguments for constructing a ProjectEnvironmentType resource.
 */
export interface ProjectEnvironmentTypeArgs {
    /**
     * A list of roles to assign to the environment creator.
     */
    creatorRoleAssignmentRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the subscription that the Environment Type will be mapped to. The environment's resources will be deployed into this subscription.
     */
    deploymentTargetId: pulumi.Input<string>;
    /**
     * The ID of the associated Dev Center Project. Changing this forces a new resource to be created.
     */
    devCenterProjectId: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity: pulumi.Input<inputs.devcenter.ProjectEnvironmentTypeIdentity>;
    /**
     * The Azure Region where the Dev Center Project Environment Type should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of this Dev Center Project Environment Type. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Dev Center Project Environment Type.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `userRoleAssignment` block as defined below.
     */
    userRoleAssignments?: pulumi.Input<pulumi.Input<inputs.devcenter.ProjectEnvironmentTypeUserRoleAssignment>[]>;
}
