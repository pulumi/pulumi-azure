// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Network Manager Management Group Connection which may cross tenants.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.management.Group("example", {});
 * const alt = azure.core.getSubscription({
 *     subscriptionId: "00000000-0000-0000-0000-000000000000",
 * });
 * const exampleGroupSubscriptionAssociation = new azure.management.GroupSubscriptionAssociation("example", {
 *     managementGroupId: example.id,
 *     subscriptionId: alt.then(alt => alt.id),
 * });
 * const current = azure.core.getSubscription({});
 * const currentGetClientConfig = azure.core.getClientConfig({});
 * const networkContributor = new azure.authorization.Assignment("network_contributor", {
 *     scope: example.id,
 *     roleDefinitionName: "Network Contributor",
 *     principalId: currentGetClientConfig.then(currentGetClientConfig => currentGetClientConfig.objectId),
 * });
 * const exampleResourceGroup = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleNetworkManager = new azure.network.NetworkManager("example", {
 *     name: "example-networkmanager",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     scope: {
 *         subscriptionIds: [current.then(current => current.id)],
 *     },
 *     scopeAccesses: ["SecurityAdmin"],
 * });
 * const exampleNetworkManagerManagementGroupConnection = new azure.network.NetworkManagerManagementGroupConnection("example", {
 *     name: "example-nmmgc",
 *     managementGroupId: example.id,
 *     networkManagerId: exampleNetworkManager.id,
 *     description: "example",
 * }, {
 *     dependsOn: [networkContributor],
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Management`: 2024-05-01
 *
 * ## Import
 *
 * Network Manager Management Group Connection can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:network/networkManagerManagementGroupConnection:NetworkManagerManagementGroupConnection example /providers/Microsoft.Management/managementGroups/00000000-0000-0000-0000-000000000000/providers/Microsoft.Network/networkManagerConnections/networkManagerConnection1
 * ```
 */
export class NetworkManagerManagementGroupConnection extends pulumi.CustomResource {
    /**
     * Get an existing NetworkManagerManagementGroupConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkManagerManagementGroupConnectionState, opts?: pulumi.CustomResourceOptions): NetworkManagerManagementGroupConnection {
        return new NetworkManagerManagementGroupConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/networkManagerManagementGroupConnection:NetworkManagerManagementGroupConnection';

    /**
     * Returns true if the given object is an instance of NetworkManagerManagementGroupConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkManagerManagementGroupConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkManagerManagementGroupConnection.__pulumiType;
    }

    /**
     * The Connection state of the Network Manager Management Group Connection.
     */
    public /*out*/ readonly connectionState!: pulumi.Output<string>;
    /**
     * A description of the Network Manager Management Group Connection.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
     */
    public readonly managementGroupId!: pulumi.Output<string>;
    /**
     * Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
     */
    public readonly networkManagerId!: pulumi.Output<string>;

    /**
     * Create a NetworkManagerManagementGroupConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkManagerManagementGroupConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkManagerManagementGroupConnectionArgs | NetworkManagerManagementGroupConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkManagerManagementGroupConnectionState | undefined;
            resourceInputs["connectionState"] = state ? state.connectionState : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["managementGroupId"] = state ? state.managementGroupId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkManagerId"] = state ? state.networkManagerId : undefined;
        } else {
            const args = argsOrState as NetworkManagerManagementGroupConnectionArgs | undefined;
            if ((!args || args.managementGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'managementGroupId'");
            }
            if ((!args || args.networkManagerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkManagerId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["managementGroupId"] = args ? args.managementGroupId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkManagerId"] = args ? args.networkManagerId : undefined;
            resourceInputs["connectionState"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkManagerManagementGroupConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkManagerManagementGroupConnection resources.
 */
export interface NetworkManagerManagementGroupConnectionState {
    /**
     * The Connection state of the Network Manager Management Group Connection.
     */
    connectionState?: pulumi.Input<string>;
    /**
     * A description of the Network Manager Management Group Connection.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
     */
    managementGroupId?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
     */
    networkManagerId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkManagerManagementGroupConnection resource.
 */
export interface NetworkManagerManagementGroupConnectionArgs {
    /**
     * A description of the Network Manager Management Group Connection.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
     */
    managementGroupId: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
     */
    networkManagerId: pulumi.Input<string>;
}
