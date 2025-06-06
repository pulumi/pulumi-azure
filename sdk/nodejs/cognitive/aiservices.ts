// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an AI Services Account.
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
 * const exampleAIServices = new azure.cognitive.AIServices("example", {
 *     name: "example-account",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     skuName: "S0",
 *     tags: {
 *         Acceptance: "Test",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.CognitiveServices`: 2024-10-01
 *
 * ## Import
 *
 * AI Services Account can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:cognitive/aIServices:AIServices account1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.CognitiveServices/accounts/account1
 * ```
 */
export class AIServices extends pulumi.CustomResource {
    /**
     * Get an existing AIServices resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AIServicesState, opts?: pulumi.CustomResourceOptions): AIServices {
        return new AIServices(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:cognitive/aIServices:AIServices';

    /**
     * Returns true if the given object is an instance of AIServices.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AIServices {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AIServices.__pulumiType;
    }

    /**
     * The subdomain name used for token-based authentication. This property is required when `networkAcls` is specified. Changing this forces a new resource to be created.
     *
     * > **Note:** If you do not specify a `customSubdomainName` then you will not be able to attach a Private Endpoint to the resource.
     */
    public readonly customSubdomainName!: pulumi.Output<string | undefined>;
    /**
     * A `customerManagedKey` block as documented below.
     */
    public readonly customerManagedKey!: pulumi.Output<outputs.cognitive.AIServicesCustomerManagedKey | undefined>;
    /**
     * The endpoint used to connect to the AI Services Account.
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * List of FQDNs allowed for the AI Services Account.
     */
    public readonly fqdns!: pulumi.Output<string[] | undefined>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.cognitive.AIServicesIdentity | undefined>;
    /**
     * Whether local authentication is enabled for the AI Services Account. Defaults to `true`.
     */
    public readonly localAuthenticationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of the AI Services Account. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     */
    public readonly networkAcls!: pulumi.Output<outputs.cognitive.AIServicesNetworkAcls | undefined>;
    /**
     * Whether outbound network access is restricted for the AI Services Account. Defaults to `false`.
     */
    public readonly outboundNetworkAccessRestricted!: pulumi.Output<boolean | undefined>;
    /**
     * A primary access key which can be used to connect to the AI Services Account.
     */
    public /*out*/ readonly primaryAccessKey!: pulumi.Output<string>;
    /**
     * Whether public network access is allowed for the AI Services Account. Possible values are `Enabled` and `Disabled`. Defaults to `Enabled`.
     */
    public readonly publicNetworkAccess!: pulumi.Output<string | undefined>;
    /**
     * The name of the resource group in which the AI Services Account is created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The secondary access key which can be used to connect to the AI Services Account.
     */
    public /*out*/ readonly secondaryAccessKey!: pulumi.Output<string>;
    /**
     * Specifies the SKU Name for this AI Services Account. Possible values are `F0`, `F1`, `S0`, `S`, `S1`, `S2`, `S3`, `S4`, `S5`, `S6`, `P0`, `P1`, `P2`, `E0` and `DC0`.
     *
     * > **Note:** SKU `DC0` is the commitment tier for AI Services Account containers running in disconnected environments. You must obtain approval from Microsoft by submitting the [request form](https://aka.ms/csdisconnectedcontainers) first, before you can use this SKU. More information on [Purchase a commitment plan to use containers in disconnected environments](https://learn.microsoft.com/en-us/azure/cognitive-services/containers/disconnected-containers?tabs=stt#purchase-a-commitment-plan-to-use-containers-in-disconnected-environments).
     */
    public readonly skuName!: pulumi.Output<string>;
    /**
     * A `storage` block as defined below.
     */
    public readonly storages!: pulumi.Output<outputs.cognitive.AIServicesStorage[] | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a AIServices resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AIServicesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AIServicesArgs | AIServicesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AIServicesState | undefined;
            resourceInputs["customSubdomainName"] = state ? state.customSubdomainName : undefined;
            resourceInputs["customerManagedKey"] = state ? state.customerManagedKey : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["fqdns"] = state ? state.fqdns : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["localAuthenticationEnabled"] = state ? state.localAuthenticationEnabled : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkAcls"] = state ? state.networkAcls : undefined;
            resourceInputs["outboundNetworkAccessRestricted"] = state ? state.outboundNetworkAccessRestricted : undefined;
            resourceInputs["primaryAccessKey"] = state ? state.primaryAccessKey : undefined;
            resourceInputs["publicNetworkAccess"] = state ? state.publicNetworkAccess : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["secondaryAccessKey"] = state ? state.secondaryAccessKey : undefined;
            resourceInputs["skuName"] = state ? state.skuName : undefined;
            resourceInputs["storages"] = state ? state.storages : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as AIServicesArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.skuName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'skuName'");
            }
            resourceInputs["customSubdomainName"] = args ? args.customSubdomainName : undefined;
            resourceInputs["customerManagedKey"] = args ? args.customerManagedKey : undefined;
            resourceInputs["fqdns"] = args ? args.fqdns : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["localAuthenticationEnabled"] = args ? args.localAuthenticationEnabled : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkAcls"] = args ? args.networkAcls : undefined;
            resourceInputs["outboundNetworkAccessRestricted"] = args ? args.outboundNetworkAccessRestricted : undefined;
            resourceInputs["publicNetworkAccess"] = args ? args.publicNetworkAccess : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["skuName"] = args ? args.skuName : undefined;
            resourceInputs["storages"] = args ? args.storages : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["primaryAccessKey"] = undefined /*out*/;
            resourceInputs["secondaryAccessKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["primaryAccessKey", "secondaryAccessKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AIServices.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AIServices resources.
 */
export interface AIServicesState {
    /**
     * The subdomain name used for token-based authentication. This property is required when `networkAcls` is specified. Changing this forces a new resource to be created.
     *
     * > **Note:** If you do not specify a `customSubdomainName` then you will not be able to attach a Private Endpoint to the resource.
     */
    customSubdomainName?: pulumi.Input<string>;
    /**
     * A `customerManagedKey` block as documented below.
     */
    customerManagedKey?: pulumi.Input<inputs.cognitive.AIServicesCustomerManagedKey>;
    /**
     * The endpoint used to connect to the AI Services Account.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * List of FQDNs allowed for the AI Services Account.
     */
    fqdns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.cognitive.AIServicesIdentity>;
    /**
     * Whether local authentication is enabled for the AI Services Account. Defaults to `true`.
     */
    localAuthenticationEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the AI Services Account. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     */
    networkAcls?: pulumi.Input<inputs.cognitive.AIServicesNetworkAcls>;
    /**
     * Whether outbound network access is restricted for the AI Services Account. Defaults to `false`.
     */
    outboundNetworkAccessRestricted?: pulumi.Input<boolean>;
    /**
     * A primary access key which can be used to connect to the AI Services Account.
     */
    primaryAccessKey?: pulumi.Input<string>;
    /**
     * Whether public network access is allowed for the AI Services Account. Possible values are `Enabled` and `Disabled`. Defaults to `Enabled`.
     */
    publicNetworkAccess?: pulumi.Input<string>;
    /**
     * The name of the resource group in which the AI Services Account is created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The secondary access key which can be used to connect to the AI Services Account.
     */
    secondaryAccessKey?: pulumi.Input<string>;
    /**
     * Specifies the SKU Name for this AI Services Account. Possible values are `F0`, `F1`, `S0`, `S`, `S1`, `S2`, `S3`, `S4`, `S5`, `S6`, `P0`, `P1`, `P2`, `E0` and `DC0`.
     *
     * > **Note:** SKU `DC0` is the commitment tier for AI Services Account containers running in disconnected environments. You must obtain approval from Microsoft by submitting the [request form](https://aka.ms/csdisconnectedcontainers) first, before you can use this SKU. More information on [Purchase a commitment plan to use containers in disconnected environments](https://learn.microsoft.com/en-us/azure/cognitive-services/containers/disconnected-containers?tabs=stt#purchase-a-commitment-plan-to-use-containers-in-disconnected-environments).
     */
    skuName?: pulumi.Input<string>;
    /**
     * A `storage` block as defined below.
     */
    storages?: pulumi.Input<pulumi.Input<inputs.cognitive.AIServicesStorage>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a AIServices resource.
 */
export interface AIServicesArgs {
    /**
     * The subdomain name used for token-based authentication. This property is required when `networkAcls` is specified. Changing this forces a new resource to be created.
     *
     * > **Note:** If you do not specify a `customSubdomainName` then you will not be able to attach a Private Endpoint to the resource.
     */
    customSubdomainName?: pulumi.Input<string>;
    /**
     * A `customerManagedKey` block as documented below.
     */
    customerManagedKey?: pulumi.Input<inputs.cognitive.AIServicesCustomerManagedKey>;
    /**
     * List of FQDNs allowed for the AI Services Account.
     */
    fqdns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.cognitive.AIServicesIdentity>;
    /**
     * Whether local authentication is enabled for the AI Services Account. Defaults to `true`.
     */
    localAuthenticationEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the AI Services Account. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `networkAcls` block as defined below. When this property is specified, `customSubdomainName` is also required to be set.
     */
    networkAcls?: pulumi.Input<inputs.cognitive.AIServicesNetworkAcls>;
    /**
     * Whether outbound network access is restricted for the AI Services Account. Defaults to `false`.
     */
    outboundNetworkAccessRestricted?: pulumi.Input<boolean>;
    /**
     * Whether public network access is allowed for the AI Services Account. Possible values are `Enabled` and `Disabled`. Defaults to `Enabled`.
     */
    publicNetworkAccess?: pulumi.Input<string>;
    /**
     * The name of the resource group in which the AI Services Account is created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the SKU Name for this AI Services Account. Possible values are `F0`, `F1`, `S0`, `S`, `S1`, `S2`, `S3`, `S4`, `S5`, `S6`, `P0`, `P1`, `P2`, `E0` and `DC0`.
     *
     * > **Note:** SKU `DC0` is the commitment tier for AI Services Account containers running in disconnected environments. You must obtain approval from Microsoft by submitting the [request form](https://aka.ms/csdisconnectedcontainers) first, before you can use this SKU. More information on [Purchase a commitment plan to use containers in disconnected environments](https://learn.microsoft.com/en-us/azure/cognitive-services/containers/disconnected-containers?tabs=stt#purchase-a-commitment-plan-to-use-containers-in-disconnected-environments).
     */
    skuName: pulumi.Input<string>;
    /**
     * A `storage` block as defined below.
     */
    storages?: pulumi.Input<pulumi.Input<inputs.cognitive.AIServicesStorage>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
