// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an association of a Resource Guard and Recovery Services Vault.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleResourceGuard = new azure.dataprotection.ResourceGuard("exampleResourceGuard", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 * });
 * const vault = new azure.recoveryservices.Vault("vault", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     sku: "Standard",
 *     softDeleteEnabled: true,
 * });
 * const test = new azure.recoveryservices.VaultResourceGuardAssociation("test", {
 *     vaultId: azurerm_recovery_services_vault.test.id,
 *     resourceGuardId: azurerm_data_protection_resource_guard.test.id,
 * });
 * ```
 *
 * ## Import
 *
 * Resource Guards can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:recoveryservices/vaultResourceGuardAssociation:VaultResourceGuardAssociation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.RecoveryServices/vaults/vault1/backupResourceGuardProxies/proxy1
 * ```
 */
export class VaultResourceGuardAssociation extends pulumi.CustomResource {
    /**
     * Get an existing VaultResourceGuardAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VaultResourceGuardAssociationState, opts?: pulumi.CustomResourceOptions): VaultResourceGuardAssociation {
        return new VaultResourceGuardAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:recoveryservices/vaultResourceGuardAssociation:VaultResourceGuardAssociation';

    /**
     * Returns true if the given object is an instance of VaultResourceGuardAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VaultResourceGuardAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VaultResourceGuardAssociation.__pulumiType;
    }

    /**
     * Specifies the name of the Recovery Services Vault Resource Guard Association. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ID of the Resource Guard which should be associated with. Changing this forces a new resource to be created.
     */
    public readonly resourceGuardId!: pulumi.Output<string>;
    /**
     * ID of the Recovery Services Vault which should be associated with. Changing this forces a new resource to be created.
     */
    public readonly vaultId!: pulumi.Output<string>;

    /**
     * Create a VaultResourceGuardAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VaultResourceGuardAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VaultResourceGuardAssociationArgs | VaultResourceGuardAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VaultResourceGuardAssociationState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGuardId"] = state ? state.resourceGuardId : undefined;
            resourceInputs["vaultId"] = state ? state.vaultId : undefined;
        } else {
            const args = argsOrState as VaultResourceGuardAssociationArgs | undefined;
            if ((!args || args.resourceGuardId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGuardId'");
            }
            if ((!args || args.vaultId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vaultId'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGuardId"] = args ? args.resourceGuardId : undefined;
            resourceInputs["vaultId"] = args ? args.vaultId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VaultResourceGuardAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VaultResourceGuardAssociation resources.
 */
export interface VaultResourceGuardAssociationState {
    /**
     * Specifies the name of the Recovery Services Vault Resource Guard Association. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the Resource Guard which should be associated with. Changing this forces a new resource to be created.
     */
    resourceGuardId?: pulumi.Input<string>;
    /**
     * ID of the Recovery Services Vault which should be associated with. Changing this forces a new resource to be created.
     */
    vaultId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VaultResourceGuardAssociation resource.
 */
export interface VaultResourceGuardAssociationArgs {
    /**
     * Specifies the name of the Recovery Services Vault Resource Guard Association. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the Resource Guard which should be associated with. Changing this forces a new resource to be created.
     */
    resourceGuardId: pulumi.Input<string>;
    /**
     * ID of the Recovery Services Vault which should be associated with. Changing this forces a new resource to be created.
     */
    vaultId: pulumi.Input<string>;
}