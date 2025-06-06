// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a resources Advanced Threat Protection setting.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "atp-example",
 *     location: "West Europe",
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "examplestorage",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 *     tags: {
 *         environment: "example",
 *     },
 * });
 * const exampleAdvancedThreatProtection = new azure.securitycenter.AdvancedThreatProtection("example", {
 *     targetResourceId: exampleAccount.id,
 *     enabled: true,
 * });
 * ```
 *
 * ## Import
 *
 * Advanced Threat Protection can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:securitycenter/advancedThreatProtection:AdvancedThreatProtection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/exampleResourceGroup/providers/Microsoft.Storage/storageAccounts/exampleaccount/providers/Microsoft.Security/advancedThreatProtectionSettings/default
 * ```
 */
export class AdvancedThreatProtection extends pulumi.CustomResource {
    /**
     * Get an existing AdvancedThreatProtection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AdvancedThreatProtectionState, opts?: pulumi.CustomResourceOptions): AdvancedThreatProtection {
        return new AdvancedThreatProtection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:securitycenter/advancedThreatProtection:AdvancedThreatProtection';

    /**
     * Returns true if the given object is an instance of AdvancedThreatProtection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AdvancedThreatProtection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AdvancedThreatProtection.__pulumiType;
    }

    /**
     * Should Advanced Threat Protection be enabled on this resource?
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The ID of the Azure Resource which to enable Advanced Threat Protection on. Changing this forces a new resource to be created.
     */
    public readonly targetResourceId!: pulumi.Output<string>;

    /**
     * Create a AdvancedThreatProtection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AdvancedThreatProtectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AdvancedThreatProtectionArgs | AdvancedThreatProtectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AdvancedThreatProtectionState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["targetResourceId"] = state ? state.targetResourceId : undefined;
        } else {
            const args = argsOrState as AdvancedThreatProtectionArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.targetResourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetResourceId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["targetResourceId"] = args ? args.targetResourceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AdvancedThreatProtection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AdvancedThreatProtection resources.
 */
export interface AdvancedThreatProtectionState {
    /**
     * Should Advanced Threat Protection be enabled on this resource?
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The ID of the Azure Resource which to enable Advanced Threat Protection on. Changing this forces a new resource to be created.
     */
    targetResourceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AdvancedThreatProtection resource.
 */
export interface AdvancedThreatProtectionArgs {
    /**
     * Should Advanced Threat Protection be enabled on this resource?
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The ID of the Azure Resource which to enable Advanced Threat Protection on. Changing this forces a new resource to be created.
     */
    targetResourceId: pulumi.Input<string>;
}
