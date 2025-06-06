// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ### Creating A New Alias And Subscription For An Enrollment Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.billing.getEnrollmentAccountScope({
 *     billingAccountName: "1234567890",
 *     enrollmentAccountName: "0123456",
 * });
 * const exampleSubscription = new azure.core.Subscription("example", {
 *     subscriptionName: "My Example EA Subscription",
 *     billingScopeId: example.then(example => example.id),
 * });
 * ```
 *
 * ### Creating A New Alias And Subscription For A Microsoft Customer Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.billing.getMcaAccountScope({
 *     billingAccountName: "e879cf0f-2b4d-5431-109a-f72fc9868693:024cabf4-7321-4cf9-be59-df0c77ca51de_2019-05-31",
 *     billingProfileName: "PE2Q-NOIT-BG7-TGB",
 *     invoiceSectionName: "MTT4-OBS7-PJA-TGB",
 * });
 * const exampleSubscription = new azure.core.Subscription("example", {
 *     subscriptionName: "My Example MCA Subscription",
 *     billingScopeId: example.then(example => example.id),
 * });
 * ```
 *
 * ### Creating A New Alias And Subscription For A Microsoft Partner Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.billing.getMpaAccountScope({
 *     billingAccountName: "e879cf0f-2b4d-5431-109a-f72fc9868693:024cabf4-7321-4cf9-be59-df0c77ca51de_2019-05-31",
 *     customerName: "2281f543-7321-4cf9-1e23-edb4Oc31a31c",
 * });
 * const exampleSubscription = new azure.core.Subscription("example", {
 *     subscriptionName: "My Example MPA Subscription",
 *     billingScopeId: example.then(example => example.id),
 * });
 * ```
 *
 * ### Adding An Alias To An Existing Subscription
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.Subscription("example", {
 *     alias: "examplesub",
 *     subscriptionName: "My Example Subscription",
 *     subscriptionId: "12345678-12234-5678-9012-123456789012",
 * });
 * ```
 *
 * ## Import
 *
 * Subscriptions can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:core/subscription:Subscription example "/providers/Microsoft.Subscription/aliases/subscription1"
 * ```
 *
 * In this scenario, the `subscription_id` property can be completed and the provider will assume control of the existing subscription by creating an Alias. See the `adding an Alias to an existing Subscription` above. This provider requires an alias to correctly manage Subscription resources due to Azure Subscription API design.
 */
export class Subscription extends pulumi.CustomResource {
    /**
     * Get an existing Subscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubscriptionState, opts?: pulumi.CustomResourceOptions): Subscription {
        return new Subscription(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:core/subscription:Subscription';

    /**
     * Returns true if the given object is an instance of Subscription.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Subscription {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Subscription.__pulumiType;
    }

    /**
     * The Alias name for the subscription. This provider will generate a new GUID if this is not supplied. Changing this forces a new Subscription to be created.
     */
    public readonly alias!: pulumi.Output<string>;
    /**
     * The Azure Billing Scope ID. Can be a Microsoft Customer Account Billing Scope ID, a Microsoft Partner Account Billing Scope ID or an Enrollment Billing Scope ID.
     */
    public readonly billingScopeId!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Subscription. Changing this forces a new Subscription to be created.
     *
     * > **NOTE:** This value can be specified only for adopting control of an existing Subscription, it cannot be used to provide a custom Subscription ID.
     *
     * > **NOTE:** Either `billingScopeId` or `subscriptionId` has to be specified.
     */
    public readonly subscriptionId!: pulumi.Output<string>;
    /**
     * The Name of the Subscription. This is the Display Name in the portal.
     */
    public readonly subscriptionName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the Subscription.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The ID of the Tenant to which the subscription belongs.
     */
    public /*out*/ readonly tenantId!: pulumi.Output<string>;
    /**
     * The workload type of the Subscription. Possible values are `Production` (default) and `DevTest`. Changing this forces a new Subscription to be created.
     */
    public readonly workload!: pulumi.Output<string | undefined>;

    /**
     * Create a Subscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubscriptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubscriptionArgs | SubscriptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubscriptionState | undefined;
            resourceInputs["alias"] = state ? state.alias : undefined;
            resourceInputs["billingScopeId"] = state ? state.billingScopeId : undefined;
            resourceInputs["subscriptionId"] = state ? state.subscriptionId : undefined;
            resourceInputs["subscriptionName"] = state ? state.subscriptionName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tenantId"] = state ? state.tenantId : undefined;
            resourceInputs["workload"] = state ? state.workload : undefined;
        } else {
            const args = argsOrState as SubscriptionArgs | undefined;
            if ((!args || args.subscriptionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subscriptionName'");
            }
            resourceInputs["alias"] = args ? args.alias : undefined;
            resourceInputs["billingScopeId"] = args ? args.billingScopeId : undefined;
            resourceInputs["subscriptionId"] = args ? args.subscriptionId : undefined;
            resourceInputs["subscriptionName"] = args ? args.subscriptionName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["workload"] = args ? args.workload : undefined;
            resourceInputs["tenantId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Subscription.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Subscription resources.
 */
export interface SubscriptionState {
    /**
     * The Alias name for the subscription. This provider will generate a new GUID if this is not supplied. Changing this forces a new Subscription to be created.
     */
    alias?: pulumi.Input<string>;
    /**
     * The Azure Billing Scope ID. Can be a Microsoft Customer Account Billing Scope ID, a Microsoft Partner Account Billing Scope ID or an Enrollment Billing Scope ID.
     */
    billingScopeId?: pulumi.Input<string>;
    /**
     * The ID of the Subscription. Changing this forces a new Subscription to be created.
     *
     * > **NOTE:** This value can be specified only for adopting control of an existing Subscription, it cannot be used to provide a custom Subscription ID.
     *
     * > **NOTE:** Either `billingScopeId` or `subscriptionId` has to be specified.
     */
    subscriptionId?: pulumi.Input<string>;
    /**
     * The Name of the Subscription. This is the Display Name in the portal.
     */
    subscriptionName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the Subscription.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the Tenant to which the subscription belongs.
     */
    tenantId?: pulumi.Input<string>;
    /**
     * The workload type of the Subscription. Possible values are `Production` (default) and `DevTest`. Changing this forces a new Subscription to be created.
     */
    workload?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Subscription resource.
 */
export interface SubscriptionArgs {
    /**
     * The Alias name for the subscription. This provider will generate a new GUID if this is not supplied. Changing this forces a new Subscription to be created.
     */
    alias?: pulumi.Input<string>;
    /**
     * The Azure Billing Scope ID. Can be a Microsoft Customer Account Billing Scope ID, a Microsoft Partner Account Billing Scope ID or an Enrollment Billing Scope ID.
     */
    billingScopeId?: pulumi.Input<string>;
    /**
     * The ID of the Subscription. Changing this forces a new Subscription to be created.
     *
     * > **NOTE:** This value can be specified only for adopting control of an existing Subscription, it cannot be used to provide a custom Subscription ID.
     *
     * > **NOTE:** Either `billingScopeId` or `subscriptionId` has to be specified.
     */
    subscriptionId?: pulumi.Input<string>;
    /**
     * The Name of the Subscription. This is the Display Name in the portal.
     */
    subscriptionName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the Subscription.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The workload type of the Subscription. Possible values are `Production` (default) and `DevTest`. Changing this forces a new Subscription to be created.
     */
    workload?: pulumi.Input<string>;
}
