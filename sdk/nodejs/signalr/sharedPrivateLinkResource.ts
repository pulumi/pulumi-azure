// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the Shared Private Link Resource for a Signalr service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const current = azure.core.getClientConfig({});
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "east us"});
 * const exampleKeyVault = new azure.keyvault.KeyVault("exampleKeyVault", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     tenantId: current.then(current => current.tenantId),
 *     skuName: "standard",
 *     softDeleteRetentionDays: 7,
 *     accessPolicies: [{
 *         tenantId: current.then(current => current.tenantId),
 *         objectId: current.then(current => current.objectId),
 *         certificatePermissions: ["ManageContacts"],
 *         keyPermissions: ["Create"],
 *         secretPermissions: ["Set"],
 *     }],
 * });
 * const test = new azure.signalr.Service("test", {
 *     location: azurerm_resource_group.test.location,
 *     resourceGroupName: azurerm_resource_group.test.name,
 *     sku: {
 *         name: "Standard_S1",
 *         capacity: 1,
 *     },
 * });
 * const exampleSharedPrivateLinkResource = new azure.signalr.SharedPrivateLinkResource("exampleSharedPrivateLinkResource", {
 *     signalrServiceId: azurerm_signalr_service.example.id,
 *     subResourceName: "vault",
 *     targetResourceId: exampleKeyVault.id,
 * });
 * ```
 * ## Attributes Reference:
 *
 * The following attributes are exported:
 *
 * * `id` - The ID of the Signalr Shared Private Link resource.
 *
 * * `status` - The status of a private endpoint connection. Possible values are `Pending`, `Approved`, `Rejected` or `Disconnected`.
 *
 * ## Import
 *
 * Signalr Shared Private Link Resource can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:signalr/sharedPrivateLinkResource:SharedPrivateLinkResource example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.SignalRService/signalR/signalr1/sharedPrivateLinkResources/resource1
 * ```
 */
export class SharedPrivateLinkResource extends pulumi.CustomResource {
    /**
     * Get an existing SharedPrivateLinkResource resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SharedPrivateLinkResourceState, opts?: pulumi.CustomResourceOptions): SharedPrivateLinkResource {
        return new SharedPrivateLinkResource(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:signalr/sharedPrivateLinkResource:SharedPrivateLinkResource';

    /**
     * Returns true if the given object is an instance of SharedPrivateLinkResource.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SharedPrivateLinkResource {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SharedPrivateLinkResource.__pulumiType;
    }

    /**
     * The name of the Signalr Shared Private Link Resource. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     */
    public readonly requestMessage!: pulumi.Output<string | undefined>;
    /**
     * The id of the Signalr Service. Changing this forces a new resource to be created.
     */
    public readonly signalrServiceId!: pulumi.Output<string>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The sub resource name which the Signalr Private Endpoint can connect to. Possible values are `sites`, `vault`. Changing this forces a new resource to be created.
     */
    public readonly subResourceName!: pulumi.Output<string>;
    /**
     * The ID of the Shared Private Link Enabled Remote Resource which this Signalr Private Endpoint should be connected to. Changing this forces a new resource to be created.
     */
    public readonly targetResourceId!: pulumi.Output<string>;

    /**
     * Create a SharedPrivateLinkResource resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SharedPrivateLinkResourceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SharedPrivateLinkResourceArgs | SharedPrivateLinkResourceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SharedPrivateLinkResourceState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["requestMessage"] = state ? state.requestMessage : undefined;
            resourceInputs["signalrServiceId"] = state ? state.signalrServiceId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["subResourceName"] = state ? state.subResourceName : undefined;
            resourceInputs["targetResourceId"] = state ? state.targetResourceId : undefined;
        } else {
            const args = argsOrState as SharedPrivateLinkResourceArgs | undefined;
            if ((!args || args.signalrServiceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'signalrServiceId'");
            }
            if ((!args || args.subResourceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subResourceName'");
            }
            if ((!args || args.targetResourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetResourceId'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["requestMessage"] = args ? args.requestMessage : undefined;
            resourceInputs["signalrServiceId"] = args ? args.signalrServiceId : undefined;
            resourceInputs["subResourceName"] = args ? args.subResourceName : undefined;
            resourceInputs["targetResourceId"] = args ? args.targetResourceId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SharedPrivateLinkResource.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SharedPrivateLinkResource resources.
 */
export interface SharedPrivateLinkResourceState {
    /**
     * The name of the Signalr Shared Private Link Resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     */
    requestMessage?: pulumi.Input<string>;
    /**
     * The id of the Signalr Service. Changing this forces a new resource to be created.
     */
    signalrServiceId?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    /**
     * The sub resource name which the Signalr Private Endpoint can connect to. Possible values are `sites`, `vault`. Changing this forces a new resource to be created.
     */
    subResourceName?: pulumi.Input<string>;
    /**
     * The ID of the Shared Private Link Enabled Remote Resource which this Signalr Private Endpoint should be connected to. Changing this forces a new resource to be created.
     */
    targetResourceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SharedPrivateLinkResource resource.
 */
export interface SharedPrivateLinkResourceArgs {
    /**
     * The name of the Signalr Shared Private Link Resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     */
    requestMessage?: pulumi.Input<string>;
    /**
     * The id of the Signalr Service. Changing this forces a new resource to be created.
     */
    signalrServiceId: pulumi.Input<string>;
    /**
     * The sub resource name which the Signalr Private Endpoint can connect to. Possible values are `sites`, `vault`. Changing this forces a new resource to be created.
     */
    subResourceName: pulumi.Input<string>;
    /**
     * The ID of the Shared Private Link Enabled Remote Resource which this Signalr Private Endpoint should be connected to. Changing this forces a new resource to be created.
     */
    targetResourceId: pulumi.Input<string>;
}