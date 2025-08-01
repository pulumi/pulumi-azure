// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an Azure Maps Account.
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
 * const exampleAccount = new azure.maps.Account("example", {
 *     name: "example-maps-account",
 *     resourceGroupName: example.name,
 *     skuName: "S1",
 *     localAuthenticationEnabled: true,
 *     tags: {
 *         environment: "Test",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Maps`: 2023-06-01
 *
 * ## Import
 *
 * A Maps Account can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:maps/account:Account example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Maps/accounts/my-maps-account
 * ```
 */
export class Account extends pulumi.CustomResource {
    /**
     * Get an existing Account resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountState, opts?: pulumi.CustomResourceOptions): Account {
        return new Account(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:maps/account:Account';

    /**
     * Returns true if the given object is an instance of Account.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Account {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Account.__pulumiType;
    }

    /**
     * A `cors` block as defined below
     */
    public readonly cors!: pulumi.Output<outputs.maps.AccountCors | undefined>;
    /**
     * One or more `dataStore` blocks as defined below.
     */
    public readonly dataStores!: pulumi.Output<outputs.maps.AccountDataStore[] | undefined>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.maps.AccountIdentity | undefined>;
    /**
     * Is local authentication enabled for this Azure Maps Account? When `false`, all authentication to the Azure Maps data-plane REST API is disabled, except Azure AD authentication. Defaults to `true`.
     */
    public readonly localAuthenticationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The Location in which the Azure Maps Account should be provisioned. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the Azure Maps Account. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The primary key used to authenticate and authorize access to the Maps REST APIs.
     */
    public /*out*/ readonly primaryAccessKey!: pulumi.Output<string>;
    /**
     * The name of the Resource Group in which the Azure Maps Account should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The secondary key used to authenticate and authorize access to the Maps REST APIs.
     */
    public /*out*/ readonly secondaryAccessKey!: pulumi.Output<string>;
    /**
     * The SKU of the Azure Maps Account. Possible values are `S0`, `S1` and `G2`. Changing this forces a new resource to be created.
     *
     * > **Note:** Gen1 SKUs (`S0` and `S1`) are deprecated and can no longer be used for new deployments, which should instead use a Gen2 SKU (`G2`) - more information can be found [in the Azure documentation](https://learn.microsoft.com/azure/azure-maps/how-to-manage-pricing-tier).
     */
    public readonly skuName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the Azure Maps Account.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A unique identifier for the Maps Account.
     */
    public /*out*/ readonly xMsClientId!: pulumi.Output<string>;

    /**
     * Create a Account resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountArgs | AccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccountState | undefined;
            resourceInputs["cors"] = state ? state.cors : undefined;
            resourceInputs["dataStores"] = state ? state.dataStores : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["localAuthenticationEnabled"] = state ? state.localAuthenticationEnabled : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["primaryAccessKey"] = state ? state.primaryAccessKey : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["secondaryAccessKey"] = state ? state.secondaryAccessKey : undefined;
            resourceInputs["skuName"] = state ? state.skuName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["xMsClientId"] = state ? state.xMsClientId : undefined;
        } else {
            const args = argsOrState as AccountArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.skuName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'skuName'");
            }
            resourceInputs["cors"] = args ? args.cors : undefined;
            resourceInputs["dataStores"] = args ? args.dataStores : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["localAuthenticationEnabled"] = args ? args.localAuthenticationEnabled : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["skuName"] = args ? args.skuName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["primaryAccessKey"] = undefined /*out*/;
            resourceInputs["secondaryAccessKey"] = undefined /*out*/;
            resourceInputs["xMsClientId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["primaryAccessKey", "secondaryAccessKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Account.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Account resources.
 */
export interface AccountState {
    /**
     * A `cors` block as defined below
     */
    cors?: pulumi.Input<inputs.maps.AccountCors>;
    /**
     * One or more `dataStore` blocks as defined below.
     */
    dataStores?: pulumi.Input<pulumi.Input<inputs.maps.AccountDataStore>[]>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.maps.AccountIdentity>;
    /**
     * Is local authentication enabled for this Azure Maps Account? When `false`, all authentication to the Azure Maps data-plane REST API is disabled, except Azure AD authentication. Defaults to `true`.
     */
    localAuthenticationEnabled?: pulumi.Input<boolean>;
    /**
     * The Location in which the Azure Maps Account should be provisioned. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Azure Maps Account. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The primary key used to authenticate and authorize access to the Maps REST APIs.
     */
    primaryAccessKey?: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the Azure Maps Account should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The secondary key used to authenticate and authorize access to the Maps REST APIs.
     */
    secondaryAccessKey?: pulumi.Input<string>;
    /**
     * The SKU of the Azure Maps Account. Possible values are `S0`, `S1` and `G2`. Changing this forces a new resource to be created.
     *
     * > **Note:** Gen1 SKUs (`S0` and `S1`) are deprecated and can no longer be used for new deployments, which should instead use a Gen2 SKU (`G2`) - more information can be found [in the Azure documentation](https://learn.microsoft.com/azure/azure-maps/how-to-manage-pricing-tier).
     */
    skuName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the Azure Maps Account.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A unique identifier for the Maps Account.
     */
    xMsClientId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Account resource.
 */
export interface AccountArgs {
    /**
     * A `cors` block as defined below
     */
    cors?: pulumi.Input<inputs.maps.AccountCors>;
    /**
     * One or more `dataStore` blocks as defined below.
     */
    dataStores?: pulumi.Input<pulumi.Input<inputs.maps.AccountDataStore>[]>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.maps.AccountIdentity>;
    /**
     * Is local authentication enabled for this Azure Maps Account? When `false`, all authentication to the Azure Maps data-plane REST API is disabled, except Azure AD authentication. Defaults to `true`.
     */
    localAuthenticationEnabled?: pulumi.Input<boolean>;
    /**
     * The Location in which the Azure Maps Account should be provisioned. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Azure Maps Account. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the Azure Maps Account should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The SKU of the Azure Maps Account. Possible values are `S0`, `S1` and `G2`. Changing this forces a new resource to be created.
     *
     * > **Note:** Gen1 SKUs (`S0` and `S1`) are deprecated and can no longer be used for new deployments, which should instead use a Gen2 SKU (`G2`) - more information can be found [in the Azure documentation](https://learn.microsoft.com/azure/azure-maps/how-to-manage-pricing-tier).
     */
    skuName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the Azure Maps Account.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
