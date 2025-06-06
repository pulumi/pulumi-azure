// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Network Manager Connectivity Configuration.
 *
 * > **Note:** The `azure.network.NetworkManagerConnectivityConfiguration` deployment may modify or delete existing Network Peering resource.
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
 * const current = azure.core.getSubscription({});
 * const exampleNetworkManager = new azure.network.NetworkManager("example", {
 *     name: "example-network-manager",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     scope: {
 *         subscriptionIds: [current.then(current => current.id)],
 *     },
 *     scopeAccesses: [
 *         "Connectivity",
 *         "SecurityAdmin",
 *     ],
 *     description: "example network manager",
 * });
 * const exampleNetworkManagerNetworkGroup = new azure.network.NetworkManagerNetworkGroup("example", {
 *     name: "example-group",
 *     networkManagerId: exampleNetworkManager.id,
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example-net",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     addressSpaces: ["10.0.0.0/16"],
 *     flowTimeoutInMinutes: 10,
 * });
 * const example2 = new azure.network.NetworkManagerNetworkGroup("example2", {
 *     name: "example-group2",
 *     networkManagerId: exampleNetworkManager.id,
 * });
 * const exampleNetworkManagerConnectivityConfiguration = new azure.network.NetworkManagerConnectivityConfiguration("example", {
 *     name: "example-connectivity-conf",
 *     networkManagerId: exampleNetworkManager.id,
 *     connectivityTopology: "HubAndSpoke",
 *     appliesToGroups: [
 *         {
 *             groupConnectivity: "DirectlyConnected",
 *             networkGroupId: exampleNetworkManagerNetworkGroup.id,
 *         },
 *         {
 *             groupConnectivity: "DirectlyConnected",
 *             networkGroupId: example2.id,
 *         },
 *     ],
 *     hub: {
 *         resourceId: exampleVirtualNetwork.id,
 *         resourceType: "Microsoft.Network/virtualNetworks",
 *     },
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
 * Network Manager Connectivity Configuration can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:network/networkManagerConnectivityConfiguration:NetworkManagerConnectivityConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/networkManagers/networkManager1/connectivityConfigurations/configuration1
 * ```
 */
export class NetworkManagerConnectivityConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing NetworkManagerConnectivityConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkManagerConnectivityConfigurationState, opts?: pulumi.CustomResourceOptions): NetworkManagerConnectivityConfiguration {
        return new NetworkManagerConnectivityConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/networkManagerConnectivityConfiguration:NetworkManagerConnectivityConfiguration';

    /**
     * Returns true if the given object is an instance of NetworkManagerConnectivityConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkManagerConnectivityConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkManagerConnectivityConfiguration.__pulumiType;
    }

    /**
     * One or more `appliesToGroup` blocks as defined below.
     */
    public readonly appliesToGroups!: pulumi.Output<outputs.network.NetworkManagerConnectivityConfigurationAppliesToGroup[]>;
    /**
     * Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
     */
    public readonly connectivityTopology!: pulumi.Output<string>;
    /**
     * Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
     */
    public readonly deleteExistingPeeringEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * A description of the Connectivity Configuration.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether to global mesh is supported. Possible values are `true` and `false`.
     */
    public readonly globalMeshEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * A `hub` block as defined below.
     */
    public readonly hub!: pulumi.Output<outputs.network.NetworkManagerConnectivityConfigurationHub | undefined>;
    /**
     * Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
     */
    public readonly networkManagerId!: pulumi.Output<string>;

    /**
     * Create a NetworkManagerConnectivityConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkManagerConnectivityConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkManagerConnectivityConfigurationArgs | NetworkManagerConnectivityConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkManagerConnectivityConfigurationState | undefined;
            resourceInputs["appliesToGroups"] = state ? state.appliesToGroups : undefined;
            resourceInputs["connectivityTopology"] = state ? state.connectivityTopology : undefined;
            resourceInputs["deleteExistingPeeringEnabled"] = state ? state.deleteExistingPeeringEnabled : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["globalMeshEnabled"] = state ? state.globalMeshEnabled : undefined;
            resourceInputs["hub"] = state ? state.hub : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkManagerId"] = state ? state.networkManagerId : undefined;
        } else {
            const args = argsOrState as NetworkManagerConnectivityConfigurationArgs | undefined;
            if ((!args || args.appliesToGroups === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appliesToGroups'");
            }
            if ((!args || args.connectivityTopology === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectivityTopology'");
            }
            if ((!args || args.networkManagerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkManagerId'");
            }
            resourceInputs["appliesToGroups"] = args ? args.appliesToGroups : undefined;
            resourceInputs["connectivityTopology"] = args ? args.connectivityTopology : undefined;
            resourceInputs["deleteExistingPeeringEnabled"] = args ? args.deleteExistingPeeringEnabled : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["globalMeshEnabled"] = args ? args.globalMeshEnabled : undefined;
            resourceInputs["hub"] = args ? args.hub : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkManagerId"] = args ? args.networkManagerId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkManagerConnectivityConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkManagerConnectivityConfiguration resources.
 */
export interface NetworkManagerConnectivityConfigurationState {
    /**
     * One or more `appliesToGroup` blocks as defined below.
     */
    appliesToGroups?: pulumi.Input<pulumi.Input<inputs.network.NetworkManagerConnectivityConfigurationAppliesToGroup>[]>;
    /**
     * Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
     */
    connectivityTopology?: pulumi.Input<string>;
    /**
     * Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
     */
    deleteExistingPeeringEnabled?: pulumi.Input<boolean>;
    /**
     * A description of the Connectivity Configuration.
     */
    description?: pulumi.Input<string>;
    /**
     * Indicates whether to global mesh is supported. Possible values are `true` and `false`.
     */
    globalMeshEnabled?: pulumi.Input<boolean>;
    /**
     * A `hub` block as defined below.
     */
    hub?: pulumi.Input<inputs.network.NetworkManagerConnectivityConfigurationHub>;
    /**
     * Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
     */
    networkManagerId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkManagerConnectivityConfiguration resource.
 */
export interface NetworkManagerConnectivityConfigurationArgs {
    /**
     * One or more `appliesToGroup` blocks as defined below.
     */
    appliesToGroups: pulumi.Input<pulumi.Input<inputs.network.NetworkManagerConnectivityConfigurationAppliesToGroup>[]>;
    /**
     * Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
     */
    connectivityTopology: pulumi.Input<string>;
    /**
     * Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
     */
    deleteExistingPeeringEnabled?: pulumi.Input<boolean>;
    /**
     * A description of the Connectivity Configuration.
     */
    description?: pulumi.Input<string>;
    /**
     * Indicates whether to global mesh is supported. Possible values are `true` and `false`.
     */
    globalMeshEnabled?: pulumi.Input<boolean>;
    /**
     * A `hub` block as defined below.
     */
    hub?: pulumi.Input<inputs.network.NetworkManagerConnectivityConfigurationHub>;
    /**
     * Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
     */
    networkManagerId: pulumi.Input<string>;
}
