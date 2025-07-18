// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Azure Route Server
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
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example-vn",
 *     addressSpaces: ["10.0.0.0/16"],
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     tags: {
 *         environment: "Production",
 *     },
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "RouteServerSubnet",
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     resourceGroupName: example.name,
 *     addressPrefixes: ["10.0.1.0/24"],
 * });
 * const examplePublicIp = new azure.network.PublicIp("example", {
 *     name: "example-pip",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     allocationMethod: "Static",
 *     sku: "Standard",
 * });
 * const exampleRouteServer = new azure.network.RouteServer("example", {
 *     name: "example-routerserver",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     sku: "Standard",
 *     publicIpAddressId: examplePublicIp.id,
 *     subnetId: exampleSubnet.id,
 *     branchToBranchTrafficEnabled: true,
 *     hubRoutingPreference: "ASPath",
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
 * Route Server can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:network/routeServer:RouteServer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualHubs/routeServer1
 * ```
 */
export class RouteServer extends pulumi.CustomResource {
    /**
     * Get an existing RouteServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteServerState, opts?: pulumi.CustomResourceOptions): RouteServer {
        return new RouteServer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/routeServer:RouteServer';

    /**
     * Returns true if the given object is an instance of RouteServer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RouteServer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RouteServer.__pulumiType;
    }

    /**
     * Whether to enable route exchange between Azure Route Server and the gateway(s).
     */
    public readonly branchToBranchTrafficEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The hub routing preference. Valid values are `ASPath`, `ExpressRoute` or `VpnGateway`. Defaults to `ExpressRoute`.
     */
    public readonly hubRoutingPreference!: pulumi.Output<string | undefined>;
    /**
     * Specifies the supported Azure location where the Route Server should exist. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the Route Server. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the Public IP Address. This option is required since September 1st 2021. Changing this forces a new resource to be created.
     */
    public readonly publicIpAddressId!: pulumi.Output<string>;
    /**
     * Specifies the name of the Resource Group where the Route Server should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    public /*out*/ readonly routingState!: pulumi.Output<string>;
    /**
     * The SKU of the Route Server. The only possible value is `Standard`. Changing this forces a new resource to be created.
     */
    public readonly sku!: pulumi.Output<string>;
    /**
     * The ID of the Subnet that the Route Server will reside. Changing this forces a new resource to be created.
     *
     * > **Note:** Azure Route Server requires a dedicated subnet named RouteServerSubnet. The subnet size has to be at least /27 or short prefix (such as /26 or /25) and cannot be attached to any security group, otherwise, you'll receive an error message when deploying the Route Server.
     */
    public readonly subnetId!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly virtualRouterAsn!: pulumi.Output<number>;
    public /*out*/ readonly virtualRouterIps!: pulumi.Output<string[]>;

    /**
     * Create a RouteServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteServerArgs | RouteServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouteServerState | undefined;
            resourceInputs["branchToBranchTrafficEnabled"] = state ? state.branchToBranchTrafficEnabled : undefined;
            resourceInputs["hubRoutingPreference"] = state ? state.hubRoutingPreference : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["publicIpAddressId"] = state ? state.publicIpAddressId : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["routingState"] = state ? state.routingState : undefined;
            resourceInputs["sku"] = state ? state.sku : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["virtualRouterAsn"] = state ? state.virtualRouterAsn : undefined;
            resourceInputs["virtualRouterIps"] = state ? state.virtualRouterIps : undefined;
        } else {
            const args = argsOrState as RouteServerArgs | undefined;
            if ((!args || args.publicIpAddressId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'publicIpAddressId'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.sku === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sku'");
            }
            if ((!args || args.subnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetId'");
            }
            resourceInputs["branchToBranchTrafficEnabled"] = args ? args.branchToBranchTrafficEnabled : undefined;
            resourceInputs["hubRoutingPreference"] = args ? args.hubRoutingPreference : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["publicIpAddressId"] = args ? args.publicIpAddressId : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sku"] = args ? args.sku : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["routingState"] = undefined /*out*/;
            resourceInputs["virtualRouterAsn"] = undefined /*out*/;
            resourceInputs["virtualRouterIps"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RouteServer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RouteServer resources.
 */
export interface RouteServerState {
    /**
     * Whether to enable route exchange between Azure Route Server and the gateway(s).
     */
    branchToBranchTrafficEnabled?: pulumi.Input<boolean>;
    /**
     * The hub routing preference. Valid values are `ASPath`, `ExpressRoute` or `VpnGateway`. Defaults to `ExpressRoute`.
     */
    hubRoutingPreference?: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the Route Server should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Route Server. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the Public IP Address. This option is required since September 1st 2021. Changing this forces a new resource to be created.
     */
    publicIpAddressId?: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group where the Route Server should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    routingState?: pulumi.Input<string>;
    /**
     * The SKU of the Route Server. The only possible value is `Standard`. Changing this forces a new resource to be created.
     */
    sku?: pulumi.Input<string>;
    /**
     * The ID of the Subnet that the Route Server will reside. Changing this forces a new resource to be created.
     *
     * > **Note:** Azure Route Server requires a dedicated subnet named RouteServerSubnet. The subnet size has to be at least /27 or short prefix (such as /26 or /25) and cannot be attached to any security group, otherwise, you'll receive an error message when deploying the Route Server.
     */
    subnetId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    virtualRouterAsn?: pulumi.Input<number>;
    virtualRouterIps?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a RouteServer resource.
 */
export interface RouteServerArgs {
    /**
     * Whether to enable route exchange between Azure Route Server and the gateway(s).
     */
    branchToBranchTrafficEnabled?: pulumi.Input<boolean>;
    /**
     * The hub routing preference. Valid values are `ASPath`, `ExpressRoute` or `VpnGateway`. Defaults to `ExpressRoute`.
     */
    hubRoutingPreference?: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the Route Server should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Route Server. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the Public IP Address. This option is required since September 1st 2021. Changing this forces a new resource to be created.
     */
    publicIpAddressId: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group where the Route Server should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The SKU of the Route Server. The only possible value is `Standard`. Changing this forces a new resource to be created.
     */
    sku: pulumi.Input<string>;
    /**
     * The ID of the Subnet that the Route Server will reside. Changing this forces a new resource to be created.
     *
     * > **Note:** Azure Route Server requires a dedicated subnet named RouteServerSubnet. The subnet size has to be at least /27 or short prefix (such as /26 or /25) and cannot be attached to any security group, otherwise, you'll receive an error message when deploying the Route Server.
     */
    subnetId: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
