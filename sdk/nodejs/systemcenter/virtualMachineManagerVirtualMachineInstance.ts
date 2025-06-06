// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a System Center Virtual Machine Manager Virtual Machine Instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleArcMachine = new azure.arcmachine.ArcMachine("example", {
 *     name: "example-arcmachine",
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     kind: "SCVMM",
 * });
 * const exampleVirtualMachineManagerServer = new azure.systemcenter.VirtualMachineManagerServer("example", {
 *     name: "example-scvmmms",
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     customLocationId: "/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.ExtendedLocation/customLocations/customLocation1",
 *     fqdn: "example.labtest",
 *     username: "testUser",
 *     password: "H@Sh1CoR3!",
 * });
 * const example = azure.systemcenter.getVirtualMachineManagerInventoryItemsOutput({
 *     inventoryType: "Cloud",
 *     systemCenterVirtualMachineManagerServerId: exampleVirtualMachineManagerServer.id,
 * });
 * const exampleVirtualMachineManagerCloud = new azure.systemcenter.VirtualMachineManagerCloud("example", {
 *     name: "example-scvmmc",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     customLocationId: exampleVirtualMachineManagerServer.customLocationId,
 *     systemCenterVirtualMachineManagerServerInventoryItemId: example.apply(example => example.inventoryItems?.[0]?.id),
 * });
 * const example2 = azure.systemcenter.getVirtualMachineManagerInventoryItemsOutput({
 *     inventoryType: "VirtualMachineTemplate",
 *     systemCenterVirtualMachineManagerServerId: exampleVirtualMachineManagerServer.id,
 * });
 * const exampleVirtualMachineManagerVirtualMachineTemplate = new azure.systemcenter.VirtualMachineManagerVirtualMachineTemplate("example", {
 *     name: "example-scvmmvmt",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     customLocationId: exampleVirtualMachineManagerServer.customLocationId,
 *     systemCenterVirtualMachineManagerServerInventoryItemId: example2.apply(example2 => example2.inventoryItems?.[0]?.id),
 * });
 * const exampleVirtualMachineManagerVirtualMachineInstance = new azure.systemcenter.VirtualMachineManagerVirtualMachineInstance("example", {
 *     scopedResourceId: exampleArcMachine.id,
 *     customLocationId: exampleVirtualMachineManagerServer.customLocationId,
 *     infrastructure: {
 *         systemCenterVirtualMachineManagerCloudId: exampleVirtualMachineManagerCloud.id,
 *         systemCenterVirtualMachineManagerTemplateId: exampleVirtualMachineManagerVirtualMachineTemplate.id,
 *         systemCenterVirtualMachineManagerVirtualMachineServerId: exampleVirtualMachineManagerServer.id,
 *     },
 *     operatingSystem: {
 *         computerName: "testComputer",
 *     },
 *     hardware: {
 *         cpuCount: 1,
 *         memoryInMb: 1024,
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.ScVmm`: 2023-10-07
 *
 * ## Import
 *
 * System Center Virtual Machine Manager Virtual Machine Instances can be imported into Pulumi using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:systemcenter/virtualMachineManagerVirtualMachineInstance:VirtualMachineManagerVirtualMachineInstance example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.HybridCompute/machines/machine1/providers/Microsoft.ScVmm/virtualMachineInstances/default
 * ```
 */
export class VirtualMachineManagerVirtualMachineInstance extends pulumi.CustomResource {
    /**
     * Get an existing VirtualMachineManagerVirtualMachineInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualMachineManagerVirtualMachineInstanceState, opts?: pulumi.CustomResourceOptions): VirtualMachineManagerVirtualMachineInstance {
        return new VirtualMachineManagerVirtualMachineInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:systemcenter/virtualMachineManagerVirtualMachineInstance:VirtualMachineManagerVirtualMachineInstance';

    /**
     * Returns true if the given object is an instance of VirtualMachineManagerVirtualMachineInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualMachineManagerVirtualMachineInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualMachineManagerVirtualMachineInstance.__pulumiType;
    }

    /**
     * The ID of the Custom Location for the System Center Virtual Machine Manager Virtual Machine Instance. Changing this forces a new resource to be created.
     */
    public readonly customLocationId!: pulumi.Output<string>;
    /**
     * A `hardware` block as defined below. Changing this forces a new resource to be created.
     *
     * > **Note:** This resource will be restarted while updating `hardware`.
     */
    public readonly hardware!: pulumi.Output<outputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceHardware | undefined>;
    /**
     * An `infrastructure` block as defined below.
     */
    public readonly infrastructure!: pulumi.Output<outputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceInfrastructure>;
    /**
     * A `networkInterface` block as defined below.
     *
     * > **Note:** This resource will be restarted while updating `networkInterface`.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceNetworkInterface[] | undefined>;
    /**
     * An `operatingSystem` block as defined below. Changing this forces a new resource to be created.
     */
    public readonly operatingSystem!: pulumi.Output<outputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceOperatingSystem | undefined>;
    /**
     * The ID of the Hybrid Compute Machine where this System Center Virtual Machine Manager Virtual Machine Instance is stored. Changing this forces a new resource to be created.
     */
    public readonly scopedResourceId!: pulumi.Output<string>;
    /**
     * A `storageDisk` block as defined below.
     *
     * > **Note:** This resource will be restarted while updating `storageDisk`.
     */
    public readonly storageDisks!: pulumi.Output<outputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceStorageDisk[] | undefined>;
    /**
     * A list of IDs of System Center Virtual Machine Manager Availability Set.
     */
    public readonly systemCenterVirtualMachineManagerAvailabilitySetIds!: pulumi.Output<string[] | undefined>;

    /**
     * Create a VirtualMachineManagerVirtualMachineInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualMachineManagerVirtualMachineInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualMachineManagerVirtualMachineInstanceArgs | VirtualMachineManagerVirtualMachineInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualMachineManagerVirtualMachineInstanceState | undefined;
            resourceInputs["customLocationId"] = state ? state.customLocationId : undefined;
            resourceInputs["hardware"] = state ? state.hardware : undefined;
            resourceInputs["infrastructure"] = state ? state.infrastructure : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["operatingSystem"] = state ? state.operatingSystem : undefined;
            resourceInputs["scopedResourceId"] = state ? state.scopedResourceId : undefined;
            resourceInputs["storageDisks"] = state ? state.storageDisks : undefined;
            resourceInputs["systemCenterVirtualMachineManagerAvailabilitySetIds"] = state ? state.systemCenterVirtualMachineManagerAvailabilitySetIds : undefined;
        } else {
            const args = argsOrState as VirtualMachineManagerVirtualMachineInstanceArgs | undefined;
            if ((!args || args.customLocationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'customLocationId'");
            }
            if ((!args || args.infrastructure === undefined) && !opts.urn) {
                throw new Error("Missing required property 'infrastructure'");
            }
            if ((!args || args.scopedResourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scopedResourceId'");
            }
            resourceInputs["customLocationId"] = args ? args.customLocationId : undefined;
            resourceInputs["hardware"] = args ? args.hardware : undefined;
            resourceInputs["infrastructure"] = args ? args.infrastructure : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["operatingSystem"] = args ? args.operatingSystem : undefined;
            resourceInputs["scopedResourceId"] = args ? args.scopedResourceId : undefined;
            resourceInputs["storageDisks"] = args ? args.storageDisks : undefined;
            resourceInputs["systemCenterVirtualMachineManagerAvailabilitySetIds"] = args ? args.systemCenterVirtualMachineManagerAvailabilitySetIds : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VirtualMachineManagerVirtualMachineInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualMachineManagerVirtualMachineInstance resources.
 */
export interface VirtualMachineManagerVirtualMachineInstanceState {
    /**
     * The ID of the Custom Location for the System Center Virtual Machine Manager Virtual Machine Instance. Changing this forces a new resource to be created.
     */
    customLocationId?: pulumi.Input<string>;
    /**
     * A `hardware` block as defined below. Changing this forces a new resource to be created.
     *
     * > **Note:** This resource will be restarted while updating `hardware`.
     */
    hardware?: pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceHardware>;
    /**
     * An `infrastructure` block as defined below.
     */
    infrastructure?: pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceInfrastructure>;
    /**
     * A `networkInterface` block as defined below.
     *
     * > **Note:** This resource will be restarted while updating `networkInterface`.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceNetworkInterface>[]>;
    /**
     * An `operatingSystem` block as defined below. Changing this forces a new resource to be created.
     */
    operatingSystem?: pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceOperatingSystem>;
    /**
     * The ID of the Hybrid Compute Machine where this System Center Virtual Machine Manager Virtual Machine Instance is stored. Changing this forces a new resource to be created.
     */
    scopedResourceId?: pulumi.Input<string>;
    /**
     * A `storageDisk` block as defined below.
     *
     * > **Note:** This resource will be restarted while updating `storageDisk`.
     */
    storageDisks?: pulumi.Input<pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceStorageDisk>[]>;
    /**
     * A list of IDs of System Center Virtual Machine Manager Availability Set.
     */
    systemCenterVirtualMachineManagerAvailabilitySetIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a VirtualMachineManagerVirtualMachineInstance resource.
 */
export interface VirtualMachineManagerVirtualMachineInstanceArgs {
    /**
     * The ID of the Custom Location for the System Center Virtual Machine Manager Virtual Machine Instance. Changing this forces a new resource to be created.
     */
    customLocationId: pulumi.Input<string>;
    /**
     * A `hardware` block as defined below. Changing this forces a new resource to be created.
     *
     * > **Note:** This resource will be restarted while updating `hardware`.
     */
    hardware?: pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceHardware>;
    /**
     * An `infrastructure` block as defined below.
     */
    infrastructure: pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceInfrastructure>;
    /**
     * A `networkInterface` block as defined below.
     *
     * > **Note:** This resource will be restarted while updating `networkInterface`.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceNetworkInterface>[]>;
    /**
     * An `operatingSystem` block as defined below. Changing this forces a new resource to be created.
     */
    operatingSystem?: pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceOperatingSystem>;
    /**
     * The ID of the Hybrid Compute Machine where this System Center Virtual Machine Manager Virtual Machine Instance is stored. Changing this forces a new resource to be created.
     */
    scopedResourceId: pulumi.Input<string>;
    /**
     * A `storageDisk` block as defined below.
     *
     * > **Note:** This resource will be restarted while updating `storageDisk`.
     */
    storageDisks?: pulumi.Input<pulumi.Input<inputs.systemcenter.VirtualMachineManagerVirtualMachineInstanceStorageDisk>[]>;
    /**
     * A list of IDs of System Center Virtual Machine Manager Availability Set.
     */
    systemCenterVirtualMachineManagerAvailabilitySetIds?: pulumi.Input<pulumi.Input<string>[]>;
}
