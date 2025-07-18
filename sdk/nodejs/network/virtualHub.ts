// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Virtual Hub within a Virtual WAN.
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
 * const exampleVirtualWan = new azure.network.VirtualWan("example", {
 *     name: "example-virtualwan",
 *     resourceGroupName: example.name,
 *     location: example.location,
 * });
 * const exampleVirtualHub = new azure.network.VirtualHub("example", {
 *     name: "example-virtualhub",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     virtualWanId: exampleVirtualWan.id,
 *     addressPrefix: "10.0.0.0/23",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2024-05-01
 *
 * ## Import
 *
 * Virtual Hub's can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:network/virtualHub:VirtualHub example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualHubs/hub1
 * ```
 */
export class VirtualHub extends pulumi.CustomResource {
    /**
     * Get an existing VirtualHub resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualHubState, opts?: pulumi.CustomResourceOptions): VirtualHub {
        return new VirtualHub(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/virtualHub:VirtualHub';

    /**
     * Returns true if the given object is an instance of VirtualHub.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualHub {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualHub.__pulumiType;
    }

    /**
     * The Address Prefix which should be used for this Virtual Hub. Changing this forces a new resource to be created. [The address prefix subnet cannot be smaller than a `/24`. Azure recommends using a `/23`](https://docs.microsoft.com/azure/virtual-wan/virtual-wan-faq#what-is-the-recommended-hub-address-space-during-hub-creation).
     */
    public readonly addressPrefix!: pulumi.Output<string | undefined>;
    /**
     * The ID of the default Route Table in the Virtual Hub.
     */
    public /*out*/ readonly defaultRouteTableId!: pulumi.Output<string>;
    /**
     * The hub routing preference. Possible values are `ExpressRoute`, `ASPath` and `VpnGateway`. Defaults to `ExpressRoute`.
     */
    public readonly hubRoutingPreference!: pulumi.Output<string | undefined>;
    /**
     * Specifies the supported Azure location where the Virtual Hub should exist. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the Virtual Hub. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the name of the Resource Group where the Virtual Hub should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * One or more `route` blocks as defined below.
     */
    public readonly routes!: pulumi.Output<outputs.network.VirtualHubRoute[] | undefined>;
    /**
     * The SKU of the Virtual Hub. Possible values are `Basic` and `Standard`. Changing this forces a new resource to be created.
     */
    public readonly sku!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags to assign to the Virtual Hub.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The Autonomous System Number of the Virtual Hub BGP router.
     */
    public /*out*/ readonly virtualRouterAsn!: pulumi.Output<number>;
    /**
     * Minimum instance capacity for the scaling configuration of the Virtual Hub Router. Defaults to `2`.
     */
    public readonly virtualRouterAutoScaleMinCapacity!: pulumi.Output<number | undefined>;
    /**
     * The IP addresses of the Virtual Hub BGP router.
     */
    public /*out*/ readonly virtualRouterIps!: pulumi.Output<string[]>;
    /**
     * The ID of a Virtual WAN within which the Virtual Hub should be created. Changing this forces a new resource to be created.
     */
    public readonly virtualWanId!: pulumi.Output<string | undefined>;

    /**
     * Create a VirtualHub resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualHubArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualHubArgs | VirtualHubState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualHubState | undefined;
            resourceInputs["addressPrefix"] = state ? state.addressPrefix : undefined;
            resourceInputs["defaultRouteTableId"] = state ? state.defaultRouteTableId : undefined;
            resourceInputs["hubRoutingPreference"] = state ? state.hubRoutingPreference : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["routes"] = state ? state.routes : undefined;
            resourceInputs["sku"] = state ? state.sku : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["virtualRouterAsn"] = state ? state.virtualRouterAsn : undefined;
            resourceInputs["virtualRouterAutoScaleMinCapacity"] = state ? state.virtualRouterAutoScaleMinCapacity : undefined;
            resourceInputs["virtualRouterIps"] = state ? state.virtualRouterIps : undefined;
            resourceInputs["virtualWanId"] = state ? state.virtualWanId : undefined;
        } else {
            const args = argsOrState as VirtualHubArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["addressPrefix"] = args ? args.addressPrefix : undefined;
            resourceInputs["hubRoutingPreference"] = args ? args.hubRoutingPreference : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["routes"] = args ? args.routes : undefined;
            resourceInputs["sku"] = args ? args.sku : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["virtualRouterAutoScaleMinCapacity"] = args ? args.virtualRouterAutoScaleMinCapacity : undefined;
            resourceInputs["virtualWanId"] = args ? args.virtualWanId : undefined;
            resourceInputs["defaultRouteTableId"] = undefined /*out*/;
            resourceInputs["virtualRouterAsn"] = undefined /*out*/;
            resourceInputs["virtualRouterIps"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VirtualHub.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualHub resources.
 */
export interface VirtualHubState {
    /**
     * The Address Prefix which should be used for this Virtual Hub. Changing this forces a new resource to be created. [The address prefix subnet cannot be smaller than a `/24`. Azure recommends using a `/23`](https://docs.microsoft.com/azure/virtual-wan/virtual-wan-faq#what-is-the-recommended-hub-address-space-during-hub-creation).
     */
    addressPrefix?: pulumi.Input<string>;
    /**
     * The ID of the default Route Table in the Virtual Hub.
     */
    defaultRouteTableId?: pulumi.Input<string>;
    /**
     * The hub routing preference. Possible values are `ExpressRoute`, `ASPath` and `VpnGateway`. Defaults to `ExpressRoute`.
     */
    hubRoutingPreference?: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the Virtual Hub should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Virtual Hub. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group where the Virtual Hub should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * One or more `route` blocks as defined below.
     */
    routes?: pulumi.Input<pulumi.Input<inputs.network.VirtualHubRoute>[]>;
    /**
     * The SKU of the Virtual Hub. Possible values are `Basic` and `Standard`. Changing this forces a new resource to be created.
     */
    sku?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the Virtual Hub.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Autonomous System Number of the Virtual Hub BGP router.
     */
    virtualRouterAsn?: pulumi.Input<number>;
    /**
     * Minimum instance capacity for the scaling configuration of the Virtual Hub Router. Defaults to `2`.
     */
    virtualRouterAutoScaleMinCapacity?: pulumi.Input<number>;
    /**
     * The IP addresses of the Virtual Hub BGP router.
     */
    virtualRouterIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of a Virtual WAN within which the Virtual Hub should be created. Changing this forces a new resource to be created.
     */
    virtualWanId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualHub resource.
 */
export interface VirtualHubArgs {
    /**
     * The Address Prefix which should be used for this Virtual Hub. Changing this forces a new resource to be created. [The address prefix subnet cannot be smaller than a `/24`. Azure recommends using a `/23`](https://docs.microsoft.com/azure/virtual-wan/virtual-wan-faq#what-is-the-recommended-hub-address-space-during-hub-creation).
     */
    addressPrefix?: pulumi.Input<string>;
    /**
     * The hub routing preference. Possible values are `ExpressRoute`, `ASPath` and `VpnGateway`. Defaults to `ExpressRoute`.
     */
    hubRoutingPreference?: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the Virtual Hub should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Virtual Hub. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group where the Virtual Hub should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * One or more `route` blocks as defined below.
     */
    routes?: pulumi.Input<pulumi.Input<inputs.network.VirtualHubRoute>[]>;
    /**
     * The SKU of the Virtual Hub. Possible values are `Basic` and `Standard`. Changing this forces a new resource to be created.
     */
    sku?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the Virtual Hub.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Minimum instance capacity for the scaling configuration of the Virtual Hub Router. Defaults to `2`.
     */
    virtualRouterAutoScaleMinCapacity?: pulumi.Input<number>;
    /**
     * The ID of a Virtual WAN within which the Virtual Hub should be created. Changing this forces a new resource to be created.
     */
    virtualWanId?: pulumi.Input<string>;
}
