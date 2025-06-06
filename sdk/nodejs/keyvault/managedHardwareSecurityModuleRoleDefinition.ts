// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Key Vault Managed Hardware Security Module Role Definition. This resource works together with Managed hardware security module resource.
 *
 * ## Import
 *
 * Key Vault Managed Hardware Security Module Role Definitions can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:keyvault/managedHardwareSecurityModuleRoleDefinition:ManagedHardwareSecurityModuleRoleDefinition example https://0000.managedhsm.azure.net///RoleDefinition/00000000-0000-0000-0000-000000000000
 * ```
 */
export class ManagedHardwareSecurityModuleRoleDefinition extends pulumi.CustomResource {
    /**
     * Get an existing ManagedHardwareSecurityModuleRoleDefinition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedHardwareSecurityModuleRoleDefinitionState, opts?: pulumi.CustomResourceOptions): ManagedHardwareSecurityModuleRoleDefinition {
        return new ManagedHardwareSecurityModuleRoleDefinition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:keyvault/managedHardwareSecurityModuleRoleDefinition:ManagedHardwareSecurityModuleRoleDefinition';

    /**
     * Returns true if the given object is an instance of ManagedHardwareSecurityModuleRoleDefinition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedHardwareSecurityModuleRoleDefinition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedHardwareSecurityModuleRoleDefinition.__pulumiType;
    }

    /**
     * Specifies a text description about this Key Vault Managed Hardware Security Module Role Definition.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Key Vault Managed Hardware Security Module. Changing this forces a new Key Vault Managed Hardware Security Module Role Definition to be created.
     */
    public readonly managedHsmId!: pulumi.Output<string>;
    /**
     * The name in UUID notation of this Key Vault Managed Hardware Security Module Role Definition. Changing this forces a new Key Vault Managed Hardware Security Module Role Definition to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * One or more `permission` blocks as defined below.
     */
    public readonly permissions!: pulumi.Output<outputs.keyvault.ManagedHardwareSecurityModuleRoleDefinitionPermission[] | undefined>;
    /**
     * The ID of the role definition resource without Key Vault base URL.
     */
    public /*out*/ readonly resourceManagerId!: pulumi.Output<string>;
    /**
     * Specify a display name for this Key Vault Managed Hardware Security Module Role Definition.
     */
    public readonly roleName!: pulumi.Output<string | undefined>;
    /**
     * The type of the role definition. Possible values are `AKVBuiltInRole` and `CustomRole`.
     */
    public /*out*/ readonly roleType!: pulumi.Output<string>;

    /**
     * Create a ManagedHardwareSecurityModuleRoleDefinition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedHardwareSecurityModuleRoleDefinitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedHardwareSecurityModuleRoleDefinitionArgs | ManagedHardwareSecurityModuleRoleDefinitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedHardwareSecurityModuleRoleDefinitionState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["managedHsmId"] = state ? state.managedHsmId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
            resourceInputs["resourceManagerId"] = state ? state.resourceManagerId : undefined;
            resourceInputs["roleName"] = state ? state.roleName : undefined;
            resourceInputs["roleType"] = state ? state.roleType : undefined;
        } else {
            const args = argsOrState as ManagedHardwareSecurityModuleRoleDefinitionArgs | undefined;
            if ((!args || args.managedHsmId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'managedHsmId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["managedHsmId"] = args ? args.managedHsmId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["permissions"] = args ? args.permissions : undefined;
            resourceInputs["roleName"] = args ? args.roleName : undefined;
            resourceInputs["resourceManagerId"] = undefined /*out*/;
            resourceInputs["roleType"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedHardwareSecurityModuleRoleDefinition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedHardwareSecurityModuleRoleDefinition resources.
 */
export interface ManagedHardwareSecurityModuleRoleDefinitionState {
    /**
     * Specifies a text description about this Key Vault Managed Hardware Security Module Role Definition.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Key Vault Managed Hardware Security Module. Changing this forces a new Key Vault Managed Hardware Security Module Role Definition to be created.
     */
    managedHsmId?: pulumi.Input<string>;
    /**
     * The name in UUID notation of this Key Vault Managed Hardware Security Module Role Definition. Changing this forces a new Key Vault Managed Hardware Security Module Role Definition to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `permission` blocks as defined below.
     */
    permissions?: pulumi.Input<pulumi.Input<inputs.keyvault.ManagedHardwareSecurityModuleRoleDefinitionPermission>[]>;
    /**
     * The ID of the role definition resource without Key Vault base URL.
     */
    resourceManagerId?: pulumi.Input<string>;
    /**
     * Specify a display name for this Key Vault Managed Hardware Security Module Role Definition.
     */
    roleName?: pulumi.Input<string>;
    /**
     * The type of the role definition. Possible values are `AKVBuiltInRole` and `CustomRole`.
     */
    roleType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedHardwareSecurityModuleRoleDefinition resource.
 */
export interface ManagedHardwareSecurityModuleRoleDefinitionArgs {
    /**
     * Specifies a text description about this Key Vault Managed Hardware Security Module Role Definition.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Key Vault Managed Hardware Security Module. Changing this forces a new Key Vault Managed Hardware Security Module Role Definition to be created.
     */
    managedHsmId: pulumi.Input<string>;
    /**
     * The name in UUID notation of this Key Vault Managed Hardware Security Module Role Definition. Changing this forces a new Key Vault Managed Hardware Security Module Role Definition to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `permission` blocks as defined below.
     */
    permissions?: pulumi.Input<pulumi.Input<inputs.keyvault.ManagedHardwareSecurityModuleRoleDefinitionPermission>[]>;
    /**
     * Specify a display name for this Key Vault Managed Hardware Security Module Role Definition.
     */
    roleName?: pulumi.Input<string>;
}
