// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Allows you to add, update, or remove an Azure Data Lake Store to a subnet of a virtual network.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "northeurope"});
 * const vnet = new azure.network.VirtualNetwork("vnet", {
 *     addressSpaces: ["10.7.29.0/29"],
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const subnet = new azure.network.Subnet("subnet", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: vnet.name,
 *     addressPrefixes: ["10.7.29.0/29"],
 *     serviceEndpoints: ["Microsoft.AzureActiveDirectory"],
 * });
 * const exampleStore = new azure.datalake.Store("exampleStore", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 * });
 * const adlsvnetrule = new azure.datalake.StoreVirtualNetworkRule("adlsvnetrule", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     accountName: exampleStore.name,
 *     subnetId: subnet.id,
 * });
 * ```
 *
 * ## Import
 *
 * Data Lake Store Virtual Network Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:datalake/storeVirtualNetworkRule:StoreVirtualNetworkRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.DataLakeStore/accounts/myaccount/virtualNetworkRules/vnetrulename
 * ```
 */
export class StoreVirtualNetworkRule extends pulumi.CustomResource {
    /**
     * Get an existing StoreVirtualNetworkRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StoreVirtualNetworkRuleState, opts?: pulumi.CustomResourceOptions): StoreVirtualNetworkRule {
        return new StoreVirtualNetworkRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:datalake/storeVirtualNetworkRule:StoreVirtualNetworkRule';

    /**
     * Returns true if the given object is an instance of StoreVirtualNetworkRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StoreVirtualNetworkRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StoreVirtualNetworkRule.__pulumiType;
    }

    /**
     * The name of the Data Lake Store to which this Data Lake Store virtual network rule will be applied to. Changing this forces a new resource to be created.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * The name of the Data Lake Store virtual network rule. Changing this forces a new resource to be created. Cannot be empty and must only contain alphanumeric characters, underscores, periods and hyphens. Cannot start with a period, underscore or hyphen, and cannot end with a period and a hyphen.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the resource group where the Data Lake Store resides. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The ID of the subnet that the Data Lake Store will be connected to.
     */
    public readonly subnetId!: pulumi.Output<string>;

    /**
     * Create a StoreVirtualNetworkRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StoreVirtualNetworkRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StoreVirtualNetworkRuleArgs | StoreVirtualNetworkRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StoreVirtualNetworkRuleState | undefined;
            inputs["accountName"] = state ? state.accountName : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            inputs["subnetId"] = state ? state.subnetId : undefined;
        } else {
            const args = argsOrState as StoreVirtualNetworkRuleArgs | undefined;
            if ((!args || args.accountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.subnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetId'");
            }
            inputs["accountName"] = args ? args.accountName : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            inputs["subnetId"] = args ? args.subnetId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(StoreVirtualNetworkRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StoreVirtualNetworkRule resources.
 */
export interface StoreVirtualNetworkRuleState {
    /**
     * The name of the Data Lake Store to which this Data Lake Store virtual network rule will be applied to. Changing this forces a new resource to be created.
     */
    accountName?: pulumi.Input<string>;
    /**
     * The name of the Data Lake Store virtual network rule. Changing this forces a new resource to be created. Cannot be empty and must only contain alphanumeric characters, underscores, periods and hyphens. Cannot start with a period, underscore or hyphen, and cannot end with a period and a hyphen.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group where the Data Lake Store resides. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The ID of the subnet that the Data Lake Store will be connected to.
     */
    subnetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StoreVirtualNetworkRule resource.
 */
export interface StoreVirtualNetworkRuleArgs {
    /**
     * The name of the Data Lake Store to which this Data Lake Store virtual network rule will be applied to. Changing this forces a new resource to be created.
     */
    accountName: pulumi.Input<string>;
    /**
     * The name of the Data Lake Store virtual network rule. Changing this forces a new resource to be created. Cannot be empty and must only contain alphanumeric characters, underscores, periods and hyphens. Cannot start with a period, underscore or hyphen, and cannot end with a period and a hyphen.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group where the Data Lake Store resides. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The ID of the subnet that the Data Lake Store will be connected to.
     */
    subnetId: pulumi.Input<string>;
}