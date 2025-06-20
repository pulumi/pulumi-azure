// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Disaster Recovery Config for a Service Bus Namespace.
 *
 * > **Note:** Disaster Recovery Config is a Premium SKU only capability.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "servicebus-replication",
 *     location: "West Europe",
 * });
 * const primary = new azure.servicebus.Namespace("primary", {
 *     name: "servicebus-primary",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     sku: "Premium",
 *     capacity: 1,
 * });
 * const secondary = new azure.servicebus.Namespace("secondary", {
 *     name: "servicebus-secondary",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     sku: "Premium",
 *     capacity: 1,
 * });
 * const exampleNamespaceAuthorizationRule = new azure.servicebus.NamespaceAuthorizationRule("example", {
 *     name: "examplerule",
 *     namespaceId: exampleAzurermServicebusNamespace.id,
 *     listen: true,
 *     send: true,
 *     manage: false,
 * });
 * const exampleNamespaceDisasterRecoveryConfig = new azure.servicebus.NamespaceDisasterRecoveryConfig("example", {
 *     name: "servicebus-alias-name",
 *     primaryNamespaceId: primary.id,
 *     partnerNamespaceId: secondary.id,
 *     aliasAuthorizationRuleId: exampleNamespaceAuthorizationRule.id,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.ServiceBus`: 2021-06-01-preview
 *
 * ## Import
 *
 * Service Bus DR configs can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:servicebus/namespaceDisasterRecoveryConfig:NamespaceDisasterRecoveryConfig config1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ServiceBus/namespaces/namespace1/disasterRecoveryConfigs/config1
 * ```
 */
export class NamespaceDisasterRecoveryConfig extends pulumi.CustomResource {
    /**
     * Get an existing NamespaceDisasterRecoveryConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NamespaceDisasterRecoveryConfigState, opts?: pulumi.CustomResourceOptions): NamespaceDisasterRecoveryConfig {
        return new NamespaceDisasterRecoveryConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:servicebus/namespaceDisasterRecoveryConfig:NamespaceDisasterRecoveryConfig';

    /**
     * Returns true if the given object is an instance of NamespaceDisasterRecoveryConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NamespaceDisasterRecoveryConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NamespaceDisasterRecoveryConfig.__pulumiType;
    }

    /**
     * The Shared access policies used to access the connection string for the alias.
     */
    public readonly aliasAuthorizationRuleId!: pulumi.Output<string | undefined>;
    /**
     * The primary access key for the authorization rule `RootManageSharedAccessKey`.
     */
    public /*out*/ readonly defaultPrimaryKey!: pulumi.Output<string>;
    /**
     * The secondary access key for the authorization rule `RootManageSharedAccessKey`.
     */
    public /*out*/ readonly defaultSecondaryKey!: pulumi.Output<string>;
    /**
     * Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the Service Bus Namespace to replicate to.
     */
    public readonly partnerNamespaceId!: pulumi.Output<string>;
    /**
     * The alias Primary Connection String for the ServiceBus Namespace.
     */
    public /*out*/ readonly primaryConnectionStringAlias!: pulumi.Output<string>;
    /**
     * The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
     */
    public readonly primaryNamespaceId!: pulumi.Output<string>;
    /**
     * The alias Secondary Connection String for the ServiceBus Namespace
     */
    public /*out*/ readonly secondaryConnectionStringAlias!: pulumi.Output<string>;

    /**
     * Create a NamespaceDisasterRecoveryConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NamespaceDisasterRecoveryConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NamespaceDisasterRecoveryConfigArgs | NamespaceDisasterRecoveryConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NamespaceDisasterRecoveryConfigState | undefined;
            resourceInputs["aliasAuthorizationRuleId"] = state ? state.aliasAuthorizationRuleId : undefined;
            resourceInputs["defaultPrimaryKey"] = state ? state.defaultPrimaryKey : undefined;
            resourceInputs["defaultSecondaryKey"] = state ? state.defaultSecondaryKey : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["partnerNamespaceId"] = state ? state.partnerNamespaceId : undefined;
            resourceInputs["primaryConnectionStringAlias"] = state ? state.primaryConnectionStringAlias : undefined;
            resourceInputs["primaryNamespaceId"] = state ? state.primaryNamespaceId : undefined;
            resourceInputs["secondaryConnectionStringAlias"] = state ? state.secondaryConnectionStringAlias : undefined;
        } else {
            const args = argsOrState as NamespaceDisasterRecoveryConfigArgs | undefined;
            if ((!args || args.partnerNamespaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'partnerNamespaceId'");
            }
            if ((!args || args.primaryNamespaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'primaryNamespaceId'");
            }
            resourceInputs["aliasAuthorizationRuleId"] = args ? args.aliasAuthorizationRuleId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["partnerNamespaceId"] = args ? args.partnerNamespaceId : undefined;
            resourceInputs["primaryNamespaceId"] = args ? args.primaryNamespaceId : undefined;
            resourceInputs["defaultPrimaryKey"] = undefined /*out*/;
            resourceInputs["defaultSecondaryKey"] = undefined /*out*/;
            resourceInputs["primaryConnectionStringAlias"] = undefined /*out*/;
            resourceInputs["secondaryConnectionStringAlias"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["defaultPrimaryKey", "defaultSecondaryKey", "primaryConnectionStringAlias", "secondaryConnectionStringAlias"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(NamespaceDisasterRecoveryConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NamespaceDisasterRecoveryConfig resources.
 */
export interface NamespaceDisasterRecoveryConfigState {
    /**
     * The Shared access policies used to access the connection string for the alias.
     */
    aliasAuthorizationRuleId?: pulumi.Input<string>;
    /**
     * The primary access key for the authorization rule `RootManageSharedAccessKey`.
     */
    defaultPrimaryKey?: pulumi.Input<string>;
    /**
     * The secondary access key for the authorization rule `RootManageSharedAccessKey`.
     */
    defaultSecondaryKey?: pulumi.Input<string>;
    /**
     * Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the Service Bus Namespace to replicate to.
     */
    partnerNamespaceId?: pulumi.Input<string>;
    /**
     * The alias Primary Connection String for the ServiceBus Namespace.
     */
    primaryConnectionStringAlias?: pulumi.Input<string>;
    /**
     * The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
     */
    primaryNamespaceId?: pulumi.Input<string>;
    /**
     * The alias Secondary Connection String for the ServiceBus Namespace
     */
    secondaryConnectionStringAlias?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NamespaceDisasterRecoveryConfig resource.
 */
export interface NamespaceDisasterRecoveryConfigArgs {
    /**
     * The Shared access policies used to access the connection string for the alias.
     */
    aliasAuthorizationRuleId?: pulumi.Input<string>;
    /**
     * Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the Service Bus Namespace to replicate to.
     */
    partnerNamespaceId: pulumi.Input<string>;
    /**
     * The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
     */
    primaryNamespaceId: pulumi.Input<string>;
}
