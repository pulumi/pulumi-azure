// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Logic App Integration Account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleIntegrationAccount = new azure.logicapps.IntegrationAccount("example", {
 *     name: "example-ia",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     skuName: "Standard",
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Logic`: 2019-05-01
 *
 * ## Import
 *
 * Logic App Integration Accounts can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:logicapps/integrationAccount:IntegrationAccount example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logic/integrationAccounts/account1
 * ```
 */
export class IntegrationAccount extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationAccountState, opts?: pulumi.CustomResourceOptions): IntegrationAccount {
        return new IntegrationAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:logicapps/integrationAccount:IntegrationAccount';

    /**
     * Returns true if the given object is an instance of IntegrationAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationAccount.__pulumiType;
    }

    /**
     * The resource ID of the Integration Service Environment. Changing this forces a new Logic App Integration Account to be created.
     */
    public readonly integrationServiceEnvironmentId!: pulumi.Output<string | undefined>;
    /**
     * The Azure Region where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Logic App Integration Account. Changing this forces a new Logic App Integration Account to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The SKU name of the Logic App Integration Account. Possible Values are `Basic`, `Free` and `Standard`.
     */
    public readonly skuName!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Logic App Integration Account.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a IntegrationAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationAccountArgs | IntegrationAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationAccountState | undefined;
            resourceInputs["integrationServiceEnvironmentId"] = state ? state.integrationServiceEnvironmentId : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["skuName"] = state ? state.skuName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as IntegrationAccountArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.skuName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'skuName'");
            }
            resourceInputs["integrationServiceEnvironmentId"] = args ? args.integrationServiceEnvironmentId : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["skuName"] = args ? args.skuName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IntegrationAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationAccount resources.
 */
export interface IntegrationAccountState {
    /**
     * The resource ID of the Integration Service Environment. Changing this forces a new Logic App Integration Account to be created.
     */
    integrationServiceEnvironmentId?: pulumi.Input<string>;
    /**
     * The Azure Region where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Logic App Integration Account. Changing this forces a new Logic App Integration Account to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The SKU name of the Logic App Integration Account. Possible Values are `Basic`, `Free` and `Standard`.
     */
    skuName?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Logic App Integration Account.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a IntegrationAccount resource.
 */
export interface IntegrationAccountArgs {
    /**
     * The resource ID of the Integration Service Environment. Changing this forces a new Logic App Integration Account to be created.
     */
    integrationServiceEnvironmentId?: pulumi.Input<string>;
    /**
     * The Azure Region where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Logic App Integration Account. Changing this forces a new Logic App Integration Account to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Logic App Integration Account should exist. Changing this forces a new Logic App Integration Account to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The SKU name of the Logic App Integration Account. Possible Values are `Basic`, `Free` and `Standard`.
     */
    skuName: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Logic App Integration Account.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
