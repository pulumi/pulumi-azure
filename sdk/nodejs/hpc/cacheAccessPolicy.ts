// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Manages a HPC Cache Access Policy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("exampleSubnet", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.1.0/24"],
 * });
 * const exampleCache = new azure.hpc.Cache("exampleCache", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     cacheSizeInGb: 3072,
 *     subnetId: exampleSubnet.id,
 *     skuName: "Standard_2G",
 * });
 * const exampleCacheAccessPolicy = new azure.hpc.CacheAccessPolicy("exampleCacheAccessPolicy", {
 *     hpcCacheId: exampleCache.id,
 *     accessRules: [{
 *         scope: "default",
 *         access: "rw",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * HPC Cache Access Policys can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:hpc/cacheAccessPolicy:CacheAccessPolicy example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.StorageCache/caches/cache1/cacheAccessPolicies/policy1
 * ```
 */
export class CacheAccessPolicy extends pulumi.CustomResource {
    /**
     * Get an existing CacheAccessPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CacheAccessPolicyState, opts?: pulumi.CustomResourceOptions): CacheAccessPolicy {
        return new CacheAccessPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:hpc/cacheAccessPolicy:CacheAccessPolicy';

    /**
     * Returns true if the given object is an instance of CacheAccessPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CacheAccessPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CacheAccessPolicy.__pulumiType;
    }

    /**
     * Up to three `accessRule` blocks as defined below.
     */
    public readonly accessRules!: pulumi.Output<outputs.hpc.CacheAccessPolicyAccessRule[]>;
    /**
     * The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
     */
    public readonly hpcCacheId!: pulumi.Output<string>;
    /**
     * The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a CacheAccessPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CacheAccessPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CacheAccessPolicyArgs | CacheAccessPolicyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CacheAccessPolicyState | undefined;
            inputs["accessRules"] = state ? state.accessRules : undefined;
            inputs["hpcCacheId"] = state ? state.hpcCacheId : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as CacheAccessPolicyArgs | undefined;
            if ((!args || args.accessRules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessRules'");
            }
            if ((!args || args.hpcCacheId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hpcCacheId'");
            }
            inputs["accessRules"] = args ? args.accessRules : undefined;
            inputs["hpcCacheId"] = args ? args.hpcCacheId : undefined;
            inputs["name"] = args ? args.name : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(CacheAccessPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CacheAccessPolicy resources.
 */
export interface CacheAccessPolicyState {
    /**
     * Up to three `accessRule` blocks as defined below.
     */
    readonly accessRules?: pulumi.Input<pulumi.Input<inputs.hpc.CacheAccessPolicyAccessRule>[]>;
    /**
     * The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
     */
    readonly hpcCacheId?: pulumi.Input<string>;
    /**
     * The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
     */
    readonly name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CacheAccessPolicy resource.
 */
export interface CacheAccessPolicyArgs {
    /**
     * Up to three `accessRule` blocks as defined below.
     */
    readonly accessRules: pulumi.Input<pulumi.Input<inputs.hpc.CacheAccessPolicyAccessRule>[]>;
    /**
     * The ID of the HPC Cache that this HPC Cache Access Policy resides in. Changing this forces a new HPC Cache Access Policy to be created.
     */
    readonly hpcCacheId: pulumi.Input<string>;
    /**
     * The name which should be used for this HPC Cache Access Policy. Changing this forces a new HPC Cache Access Policy to be created.
     */
    readonly name?: pulumi.Input<string>;
}