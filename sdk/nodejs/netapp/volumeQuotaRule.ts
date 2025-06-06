// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Volume Quota Rule.
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
 *     name: "example-virtualnetwork",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     addressSpaces: ["10.0.0.0/16"],
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "example-subnet",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 *     delegations: [{
 *         name: "netapp",
 *         serviceDelegation: {
 *             name: "Microsoft.Netapp/volumes",
 *             actions: [
 *                 "Microsoft.Network/networkinterfaces/*",
 *                 "Microsoft.Network/virtualNetworks/subnets/join/action",
 *             ],
 *         },
 *     }],
 * });
 * const exampleAccount = new azure.netapp.Account("example", {
 *     name: "example-netappaccount",
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const examplePool = new azure.netapp.Pool("example", {
 *     name: "example-netapppool",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     accountName: exampleAccount.name,
 *     serviceLevel: "Premium",
 *     sizeInTb: 4,
 * });
 * const exampleVolume = new azure.netapp.Volume("example", {
 *     name: "example-netappvolume",
 *     location: example.location,
 *     zone: "1",
 *     resourceGroupName: example.name,
 *     accountName: exampleAccount.name,
 *     poolName: examplePool.name,
 *     volumePath: "my-unique-file-path",
 *     serviceLevel: "Premium",
 *     subnetId: exampleSubnet.id,
 *     networkFeatures: "Basic",
 *     protocols: ["NFSv4.1"],
 *     securityStyle: "unix",
 *     storageQuotaInGb: 100,
 *     snapshotDirectoryVisible: false,
 * });
 * const quota1 = new azure.netapp.VolumeQuotaRule("quota1", {
 *     name: "example-quota-rule-1",
 *     location: example.location,
 *     volumeId: exampleVolume.id,
 *     quotaTarget: "3001",
 *     quotaSizeInKib: 1024,
 *     quotaType: "IndividualGroupQuota",
 * });
 * const quota2 = new azure.netapp.VolumeQuotaRule("quota2", {
 *     name: "example-quota-rule-2",
 *     location: example.location,
 *     volumeId: exampleVolume.id,
 *     quotaTarget: "2001",
 *     quotaSizeInKib: 1024,
 *     quotaType: "IndividualUserQuota",
 * });
 * const quota3 = new azure.netapp.VolumeQuotaRule("quota3", {
 *     name: "example-quota-rule-3",
 *     location: example.location,
 *     volumeId: exampleVolume.id,
 *     quotaSizeInKib: 1024,
 *     quotaType: "DefaultUserQuota",
 * });
 * const quota4 = new azure.netapp.VolumeQuotaRule("quota4", {
 *     name: "example-quota-rule-4",
 *     location: example.location,
 *     volumeId: exampleVolume.id,
 *     quotaSizeInKib: 1024,
 *     quotaType: "DefaultGroupQuota",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.NetApp`: 2025-01-01
 *
 * ## Import
 *
 * Volume Quota Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:netapp/volumeQuotaRule:VolumeQuotaRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1/volumes/vol1/volumeQuotaRules/quota1
 * ```
 */
export class VolumeQuotaRule extends pulumi.CustomResource {
    /**
     * Get an existing VolumeQuotaRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VolumeQuotaRuleState, opts?: pulumi.CustomResourceOptions): VolumeQuotaRule {
        return new VolumeQuotaRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:netapp/volumeQuotaRule:VolumeQuotaRule';

    /**
     * Returns true if the given object is an instance of VolumeQuotaRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VolumeQuotaRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VolumeQuotaRule.__pulumiType;
    }

    /**
     * The Azure Region where the Volume Quota Rule should exist. Changing this forces a new Volume Quota Rule to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Volume Quota Rule. Changing this forces a new Volume Quota Rule to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Quota size in kibibytes.
     */
    public readonly quotaSizeInKib!: pulumi.Output<number>;
    /**
     * Quota Target. This can be Unix UID/GID for NFSv3/NFSv4.1 volumes and Windows User SID for CIFS based volumes. Changing this forces a new resource to be created.
     *
     * > **Note:** `quotaTarget ` must be used when `quotaType` is `IndividualGroupQuota` or `IndividualUserQuota`
     *
     * > **Note:** more information about this resource can be found at [Understand default and individual user and group quotas](https://learn.microsoft.com/en-us/azure/azure-netapp-files/default-individual-user-group-quotas-introduction)
     */
    public readonly quotaTarget!: pulumi.Output<string | undefined>;
    /**
     * Quota type. Possible values are `DefaultGroupQuota`, `DefaultUserQuota`, `IndividualGroupQuota` and `IndividualUserQuota`. Please note that `IndividualGroupQuota` and `DefaultGroupQuota` are not applicable to SMB and dual-protocol volumes. Changing this forces a new resource to be created.
     */
    public readonly quotaType!: pulumi.Output<string>;
    /**
     * The NetApp volume ID where the Volume Quota Rule is assigned to. Changing this forces a new resource to be created.
     */
    public readonly volumeId!: pulumi.Output<string>;

    /**
     * Create a VolumeQuotaRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VolumeQuotaRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VolumeQuotaRuleArgs | VolumeQuotaRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VolumeQuotaRuleState | undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["quotaSizeInKib"] = state ? state.quotaSizeInKib : undefined;
            resourceInputs["quotaTarget"] = state ? state.quotaTarget : undefined;
            resourceInputs["quotaType"] = state ? state.quotaType : undefined;
            resourceInputs["volumeId"] = state ? state.volumeId : undefined;
        } else {
            const args = argsOrState as VolumeQuotaRuleArgs | undefined;
            if ((!args || args.quotaSizeInKib === undefined) && !opts.urn) {
                throw new Error("Missing required property 'quotaSizeInKib'");
            }
            if ((!args || args.quotaType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'quotaType'");
            }
            if ((!args || args.volumeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'volumeId'");
            }
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["quotaSizeInKib"] = args ? args.quotaSizeInKib : undefined;
            resourceInputs["quotaTarget"] = args ? args.quotaTarget : undefined;
            resourceInputs["quotaType"] = args ? args.quotaType : undefined;
            resourceInputs["volumeId"] = args ? args.volumeId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VolumeQuotaRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VolumeQuotaRule resources.
 */
export interface VolumeQuotaRuleState {
    /**
     * The Azure Region where the Volume Quota Rule should exist. Changing this forces a new Volume Quota Rule to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Volume Quota Rule. Changing this forces a new Volume Quota Rule to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Quota size in kibibytes.
     */
    quotaSizeInKib?: pulumi.Input<number>;
    /**
     * Quota Target. This can be Unix UID/GID for NFSv3/NFSv4.1 volumes and Windows User SID for CIFS based volumes. Changing this forces a new resource to be created.
     *
     * > **Note:** `quotaTarget ` must be used when `quotaType` is `IndividualGroupQuota` or `IndividualUserQuota`
     *
     * > **Note:** more information about this resource can be found at [Understand default and individual user and group quotas](https://learn.microsoft.com/en-us/azure/azure-netapp-files/default-individual-user-group-quotas-introduction)
     */
    quotaTarget?: pulumi.Input<string>;
    /**
     * Quota type. Possible values are `DefaultGroupQuota`, `DefaultUserQuota`, `IndividualGroupQuota` and `IndividualUserQuota`. Please note that `IndividualGroupQuota` and `DefaultGroupQuota` are not applicable to SMB and dual-protocol volumes. Changing this forces a new resource to be created.
     */
    quotaType?: pulumi.Input<string>;
    /**
     * The NetApp volume ID where the Volume Quota Rule is assigned to. Changing this forces a new resource to be created.
     */
    volumeId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VolumeQuotaRule resource.
 */
export interface VolumeQuotaRuleArgs {
    /**
     * The Azure Region where the Volume Quota Rule should exist. Changing this forces a new Volume Quota Rule to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Volume Quota Rule. Changing this forces a new Volume Quota Rule to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Quota size in kibibytes.
     */
    quotaSizeInKib: pulumi.Input<number>;
    /**
     * Quota Target. This can be Unix UID/GID for NFSv3/NFSv4.1 volumes and Windows User SID for CIFS based volumes. Changing this forces a new resource to be created.
     *
     * > **Note:** `quotaTarget ` must be used when `quotaType` is `IndividualGroupQuota` or `IndividualUserQuota`
     *
     * > **Note:** more information about this resource can be found at [Understand default and individual user and group quotas](https://learn.microsoft.com/en-us/azure/azure-netapp-files/default-individual-user-group-quotas-introduction)
     */
    quotaTarget?: pulumi.Input<string>;
    /**
     * Quota type. Possible values are `DefaultGroupQuota`, `DefaultUserQuota`, `IndividualGroupQuota` and `IndividualUserQuota`. Please note that `IndividualGroupQuota` and `DefaultGroupQuota` are not applicable to SMB and dual-protocol volumes. Changing this forces a new resource to be created.
     */
    quotaType: pulumi.Input<string>;
    /**
     * The NetApp volume ID where the Volume Quota Rule is assigned to. Changing this forces a new resource to be created.
     */
    volumeId: pulumi.Input<string>;
}
