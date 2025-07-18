// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Virtual Hub Route Table.
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
 *     name: "example-vnet",
 *     addressSpaces: ["10.5.0.0/16"],
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const exampleNetworkSecurityGroup = new azure.network.NetworkSecurityGroup("example", {
 *     name: "example-nsg",
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "examplesubnet",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.5.1.0/24"],
 * });
 * const exampleSubnetNetworkSecurityGroupAssociation = new azure.network.SubnetNetworkSecurityGroupAssociation("example", {
 *     subnetId: exampleSubnet.id,
 *     networkSecurityGroupId: exampleNetworkSecurityGroup.id,
 * });
 * const exampleVirtualWan = new azure.network.VirtualWan("example", {
 *     name: "example-vwan",
 *     resourceGroupName: example.name,
 *     location: example.location,
 * });
 * const exampleVirtualHub = new azure.network.VirtualHub("example", {
 *     name: "example-vhub",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     virtualWanId: exampleVirtualWan.id,
 *     addressPrefix: "10.0.2.0/24",
 * });
 * const exampleVirtualHubConnection = new azure.network.VirtualHubConnection("example", {
 *     name: "example-vhubconn",
 *     virtualHubId: exampleVirtualHub.id,
 *     remoteVirtualNetworkId: exampleVirtualNetwork.id,
 * });
 * const exampleVirtualHubRouteTable = new azure.network.VirtualHubRouteTable("example", {
 *     name: "example-vhubroutetable",
 *     virtualHubId: exampleVirtualHub.id,
 *     labels: ["label1"],
 *     routes: [{
 *         name: "example-route",
 *         destinationsType: "CIDR",
 *         destinations: ["10.0.0.0/16"],
 *         nextHopType: "ResourceId",
 *         nextHop: exampleVirtualHubConnection.id,
 *     }],
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
 * Virtual Hub Route Tables can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:network/virtualHubRouteTable:VirtualHubRouteTable example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualHubs/virtualHub1/hubRouteTables/routeTable1
 * ```
 */
export class VirtualHubRouteTable extends pulumi.CustomResource {
    /**
     * Get an existing VirtualHubRouteTable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualHubRouteTableState, opts?: pulumi.CustomResourceOptions): VirtualHubRouteTable {
        return new VirtualHubRouteTable(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/virtualHubRouteTable:VirtualHubRouteTable';

    /**
     * Returns true if the given object is an instance of VirtualHubRouteTable.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualHubRouteTable {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualHubRouteTable.__pulumiType;
    }

    /**
     * List of labels associated with this route table.
     */
    public readonly labels!: pulumi.Output<string[] | undefined>;
    /**
     * The name which should be used for Virtual Hub Route Table. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * One or more `route` blocks as defined below.
     */
    public readonly routes!: pulumi.Output<outputs.network.VirtualHubRouteTableRoute[]>;
    /**
     * The ID of the Virtual Hub within which this route table should be created. Changing this forces a new resource to be created.
     */
    public readonly virtualHubId!: pulumi.Output<string>;

    /**
     * Create a VirtualHubRouteTable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualHubRouteTableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualHubRouteTableArgs | VirtualHubRouteTableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualHubRouteTableState | undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["routes"] = state ? state.routes : undefined;
            resourceInputs["virtualHubId"] = state ? state.virtualHubId : undefined;
        } else {
            const args = argsOrState as VirtualHubRouteTableArgs | undefined;
            if ((!args || args.virtualHubId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualHubId'");
            }
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["routes"] = args ? args.routes : undefined;
            resourceInputs["virtualHubId"] = args ? args.virtualHubId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VirtualHubRouteTable.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualHubRouteTable resources.
 */
export interface VirtualHubRouteTableState {
    /**
     * List of labels associated with this route table.
     */
    labels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name which should be used for Virtual Hub Route Table. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `route` blocks as defined below.
     */
    routes?: pulumi.Input<pulumi.Input<inputs.network.VirtualHubRouteTableRoute>[]>;
    /**
     * The ID of the Virtual Hub within which this route table should be created. Changing this forces a new resource to be created.
     */
    virtualHubId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualHubRouteTable resource.
 */
export interface VirtualHubRouteTableArgs {
    /**
     * List of labels associated with this route table.
     */
    labels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name which should be used for Virtual Hub Route Table. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `route` blocks as defined below.
     */
    routes?: pulumi.Input<pulumi.Input<inputs.network.VirtualHubRouteTableRoute>[]>;
    /**
     * The ID of the Virtual Hub within which this route table should be created. Changing this forces a new resource to be created.
     */
    virtualHubId: pulumi.Input<string>;
}
