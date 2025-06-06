// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Azure recovery vault protection container mapping. A protection container mapping decides how to translate the protection container when a VM is migrated from one region to another.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const primary = new azure.core.ResourceGroup("primary", {
 *     name: "tfex-network-mapping-primary",
 *     location: "West US",
 * });
 * const secondary = new azure.core.ResourceGroup("secondary", {
 *     name: "tfex-network-mapping-secondary",
 *     location: "East US",
 * });
 * const vault = new azure.recoveryservices.Vault("vault", {
 *     name: "example-recovery-vault",
 *     location: secondary.location,
 *     resourceGroupName: secondary.name,
 *     sku: "Standard",
 * });
 * const primaryFabric = new azure.siterecovery.Fabric("primary", {
 *     name: "primary-fabric",
 *     resourceGroupName: secondary.name,
 *     recoveryVaultName: vault.name,
 *     location: primary.location,
 * });
 * const secondaryFabric = new azure.siterecovery.Fabric("secondary", {
 *     name: "secondary-fabric",
 *     resourceGroupName: secondary.name,
 *     recoveryVaultName: vault.name,
 *     location: secondary.location,
 * });
 * const primaryProtectionContainer = new azure.siterecovery.ProtectionContainer("primary", {
 *     name: "primary-protection-container",
 *     resourceGroupName: secondary.name,
 *     recoveryVaultName: vault.name,
 *     recoveryFabricName: primaryFabric.name,
 * });
 * const secondaryProtectionContainer = new azure.siterecovery.ProtectionContainer("secondary", {
 *     name: "secondary-protection-container",
 *     resourceGroupName: secondary.name,
 *     recoveryVaultName: vault.name,
 *     recoveryFabricName: secondaryFabric.name,
 * });
 * const policy = new azure.siterecovery.ReplicationPolicy("policy", {
 *     name: "policy",
 *     resourceGroupName: secondary.name,
 *     recoveryVaultName: vault.name,
 *     recoveryPointRetentionInMinutes: 24 * 60,
 *     applicationConsistentSnapshotFrequencyInMinutes: 4 * 60,
 * });
 * const container_mapping = new azure.siterecovery.ProtectionContainerMapping("container-mapping", {
 *     name: "container-mapping",
 *     resourceGroupName: secondary.name,
 *     recoveryVaultName: vault.name,
 *     recoveryFabricName: primaryFabric.name,
 *     recoverySourceProtectionContainerName: primaryProtectionContainer.name,
 *     recoveryTargetProtectionContainerId: secondaryProtectionContainer.id,
 *     recoveryReplicationPolicyId: policy.id,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.RecoveryServices`: 2024-04-01
 *
 * ## Import
 *
 * Site Recovery Protection Container Mappings can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:siterecovery/protectionContainerMapping:ProtectionContainerMapping mymapping /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/fabric1/replicationProtectionContainers/container1/replicationProtectionContainerMappings/mapping1
 * ```
 */
export class ProtectionContainerMapping extends pulumi.CustomResource {
    /**
     * Get an existing ProtectionContainerMapping resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProtectionContainerMappingState, opts?: pulumi.CustomResourceOptions): ProtectionContainerMapping {
        return new ProtectionContainerMapping(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:siterecovery/protectionContainerMapping:ProtectionContainerMapping';

    /**
     * Returns true if the given object is an instance of ProtectionContainerMapping.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProtectionContainerMapping {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProtectionContainerMapping.__pulumiType;
    }

    /**
     * a `automaticUpdate` block defined as below.
     */
    public readonly automaticUpdate!: pulumi.Output<outputs.siterecovery.ProtectionContainerMappingAutomaticUpdate>;
    /**
     * The name of the protection container mapping. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Name of fabric that should contains the protection container to map. Changing this forces a new resource to be created.
     */
    public readonly recoveryFabricName!: pulumi.Output<string>;
    /**
     * Id of the policy to use for this mapping. Changing this forces a new resource to be created.
     */
    public readonly recoveryReplicationPolicyId!: pulumi.Output<string>;
    /**
     * Name of the source protection container to map. Changing this forces a new resource to be created.
     */
    public readonly recoverySourceProtectionContainerName!: pulumi.Output<string>;
    /**
     * Id of target protection container to map to. Changing this forces a new resource to be created.
     */
    public readonly recoveryTargetProtectionContainerId!: pulumi.Output<string>;
    /**
     * The name of the vault that should be updated. Changing this forces a new resource to be created.
     */
    public readonly recoveryVaultName!: pulumi.Output<string>;
    /**
     * Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;

    /**
     * Create a ProtectionContainerMapping resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProtectionContainerMappingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProtectionContainerMappingArgs | ProtectionContainerMappingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProtectionContainerMappingState | undefined;
            resourceInputs["automaticUpdate"] = state ? state.automaticUpdate : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["recoveryFabricName"] = state ? state.recoveryFabricName : undefined;
            resourceInputs["recoveryReplicationPolicyId"] = state ? state.recoveryReplicationPolicyId : undefined;
            resourceInputs["recoverySourceProtectionContainerName"] = state ? state.recoverySourceProtectionContainerName : undefined;
            resourceInputs["recoveryTargetProtectionContainerId"] = state ? state.recoveryTargetProtectionContainerId : undefined;
            resourceInputs["recoveryVaultName"] = state ? state.recoveryVaultName : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
        } else {
            const args = argsOrState as ProtectionContainerMappingArgs | undefined;
            if ((!args || args.recoveryFabricName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'recoveryFabricName'");
            }
            if ((!args || args.recoveryReplicationPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'recoveryReplicationPolicyId'");
            }
            if ((!args || args.recoverySourceProtectionContainerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'recoverySourceProtectionContainerName'");
            }
            if ((!args || args.recoveryTargetProtectionContainerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'recoveryTargetProtectionContainerId'");
            }
            if ((!args || args.recoveryVaultName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'recoveryVaultName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["automaticUpdate"] = args ? args.automaticUpdate : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["recoveryFabricName"] = args ? args.recoveryFabricName : undefined;
            resourceInputs["recoveryReplicationPolicyId"] = args ? args.recoveryReplicationPolicyId : undefined;
            resourceInputs["recoverySourceProtectionContainerName"] = args ? args.recoverySourceProtectionContainerName : undefined;
            resourceInputs["recoveryTargetProtectionContainerId"] = args ? args.recoveryTargetProtectionContainerId : undefined;
            resourceInputs["recoveryVaultName"] = args ? args.recoveryVaultName : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProtectionContainerMapping.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProtectionContainerMapping resources.
 */
export interface ProtectionContainerMappingState {
    /**
     * a `automaticUpdate` block defined as below.
     */
    automaticUpdate?: pulumi.Input<inputs.siterecovery.ProtectionContainerMappingAutomaticUpdate>;
    /**
     * The name of the protection container mapping. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of fabric that should contains the protection container to map. Changing this forces a new resource to be created.
     */
    recoveryFabricName?: pulumi.Input<string>;
    /**
     * Id of the policy to use for this mapping. Changing this forces a new resource to be created.
     */
    recoveryReplicationPolicyId?: pulumi.Input<string>;
    /**
     * Name of the source protection container to map. Changing this forces a new resource to be created.
     */
    recoverySourceProtectionContainerName?: pulumi.Input<string>;
    /**
     * Id of target protection container to map to. Changing this forces a new resource to be created.
     */
    recoveryTargetProtectionContainerId?: pulumi.Input<string>;
    /**
     * The name of the vault that should be updated. Changing this forces a new resource to be created.
     */
    recoveryVaultName?: pulumi.Input<string>;
    /**
     * Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProtectionContainerMapping resource.
 */
export interface ProtectionContainerMappingArgs {
    /**
     * a `automaticUpdate` block defined as below.
     */
    automaticUpdate?: pulumi.Input<inputs.siterecovery.ProtectionContainerMappingAutomaticUpdate>;
    /**
     * The name of the protection container mapping. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of fabric that should contains the protection container to map. Changing this forces a new resource to be created.
     */
    recoveryFabricName: pulumi.Input<string>;
    /**
     * Id of the policy to use for this mapping. Changing this forces a new resource to be created.
     */
    recoveryReplicationPolicyId: pulumi.Input<string>;
    /**
     * Name of the source protection container to map. Changing this forces a new resource to be created.
     */
    recoverySourceProtectionContainerName: pulumi.Input<string>;
    /**
     * Id of target protection container to map to. Changing this forces a new resource to be created.
     */
    recoveryTargetProtectionContainerId: pulumi.Input<string>;
    /**
     * The name of the vault that should be updated. Changing this forces a new resource to be created.
     */
    recoveryVaultName: pulumi.Input<string>;
    /**
     * Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
}
