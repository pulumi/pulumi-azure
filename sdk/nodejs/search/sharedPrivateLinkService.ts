// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the Shared Private Link Service for an Azure Search Service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const test = new azure.core.ResourceGroup("test", {
 *     name: "example-resourceGroup",
 *     location: "east us",
 * });
 * const testService = new azure.search.Service("test", {
 *     name: "example-search",
 *     resourceGroupName: test.name,
 *     location: test.location,
 *     sku: "standard",
 * });
 * const testAccount = new azure.storage.Account("test", {
 *     name: "example",
 *     resourceGroupName: test.name,
 *     location: test.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const testSharedPrivateLinkService = new azure.search.SharedPrivateLinkService("test", {
 *     name: "example-spl",
 *     searchServiceId: testService.id,
 *     subresourceName: "blob",
 *     targetResourceId: testAccount.id,
 *     requestMessage: "please approve",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Search`: 2024-06-01-preview
 *
 * ## Import
 *
 * Azure Search Shared Private Link Resource can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:search/sharedPrivateLinkService:SharedPrivateLinkService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Search/searchServices/service1/sharedPrivateLinkResources/resource1
 * ```
 */
export class SharedPrivateLinkService extends pulumi.CustomResource {
    /**
     * Get an existing SharedPrivateLinkService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SharedPrivateLinkServiceState, opts?: pulumi.CustomResourceOptions): SharedPrivateLinkService {
        return new SharedPrivateLinkService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:search/sharedPrivateLinkService:SharedPrivateLinkService';

    /**
     * Returns true if the given object is an instance of SharedPrivateLinkService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SharedPrivateLinkService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SharedPrivateLinkService.__pulumiType;
    }

    /**
     * Specify the name of the Azure Search Shared Private Link Resource. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specify the request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     */
    public readonly requestMessage!: pulumi.Output<string | undefined>;
    /**
     * Specify the id of the Azure Search Service. Changing this forces a new resource to be created.
     */
    public readonly searchServiceId!: pulumi.Output<string>;
    /**
     * The status of a private endpoint connection. Possible values are Pending, Approved, Rejected or Disconnected.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Specify the sub resource name which the Azure Search Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     */
    public readonly subresourceName!: pulumi.Output<string>;
    /**
     * Specify the ID of the Shared Private Link Enabled Remote Resource which this Azure Search Private Endpoint should be connected to. Changing this forces a new resource to be created.
     *
     * > **Note:** The sub resource name should match with the type of the target resource id that's being specified.
     */
    public readonly targetResourceId!: pulumi.Output<string>;

    /**
     * Create a SharedPrivateLinkService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SharedPrivateLinkServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SharedPrivateLinkServiceArgs | SharedPrivateLinkServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SharedPrivateLinkServiceState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["requestMessage"] = state ? state.requestMessage : undefined;
            resourceInputs["searchServiceId"] = state ? state.searchServiceId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["subresourceName"] = state ? state.subresourceName : undefined;
            resourceInputs["targetResourceId"] = state ? state.targetResourceId : undefined;
        } else {
            const args = argsOrState as SharedPrivateLinkServiceArgs | undefined;
            if ((!args || args.searchServiceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'searchServiceId'");
            }
            if ((!args || args.subresourceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subresourceName'");
            }
            if ((!args || args.targetResourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetResourceId'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["requestMessage"] = args ? args.requestMessage : undefined;
            resourceInputs["searchServiceId"] = args ? args.searchServiceId : undefined;
            resourceInputs["subresourceName"] = args ? args.subresourceName : undefined;
            resourceInputs["targetResourceId"] = args ? args.targetResourceId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SharedPrivateLinkService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SharedPrivateLinkService resources.
 */
export interface SharedPrivateLinkServiceState {
    /**
     * Specify the name of the Azure Search Shared Private Link Resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specify the request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     */
    requestMessage?: pulumi.Input<string>;
    /**
     * Specify the id of the Azure Search Service. Changing this forces a new resource to be created.
     */
    searchServiceId?: pulumi.Input<string>;
    /**
     * The status of a private endpoint connection. Possible values are Pending, Approved, Rejected or Disconnected.
     */
    status?: pulumi.Input<string>;
    /**
     * Specify the sub resource name which the Azure Search Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     */
    subresourceName?: pulumi.Input<string>;
    /**
     * Specify the ID of the Shared Private Link Enabled Remote Resource which this Azure Search Private Endpoint should be connected to. Changing this forces a new resource to be created.
     *
     * > **Note:** The sub resource name should match with the type of the target resource id that's being specified.
     */
    targetResourceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SharedPrivateLinkService resource.
 */
export interface SharedPrivateLinkServiceArgs {
    /**
     * Specify the name of the Azure Search Shared Private Link Resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specify the request message for requesting approval of the Shared Private Link Enabled Remote Resource.
     */
    requestMessage?: pulumi.Input<string>;
    /**
     * Specify the id of the Azure Search Service. Changing this forces a new resource to be created.
     */
    searchServiceId: pulumi.Input<string>;
    /**
     * Specify the sub resource name which the Azure Search Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     */
    subresourceName: pulumi.Input<string>;
    /**
     * Specify the ID of the Shared Private Link Enabled Remote Resource which this Azure Search Private Endpoint should be connected to. Changing this forces a new resource to be created.
     *
     * > **Note:** The sub resource name should match with the type of the target resource id that's being specified.
     */
    targetResourceId: pulumi.Input<string>;
}
