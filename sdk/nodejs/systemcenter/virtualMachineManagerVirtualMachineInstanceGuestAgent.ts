// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a System Center Virtual Machine Manager Virtual Machine Instance Guest Agent.
 *
 * > **Note:** By request of the service team the provider is no longer automatically registering the `Microsoft.ScVmm` Resource Provider for this resource. To register it you can run `az provider register --namespace Microsoft.ScVmm`.
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
 *     identity: {
 *         type: "SystemAssigned",
 *     },
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
 *         checkpointType: "Standard",
 *         systemCenterVirtualMachineManagerCloudId: exampleVirtualMachineManagerCloud.id,
 *         systemCenterVirtualMachineManagerTemplateId: exampleVirtualMachineManagerVirtualMachineTemplate.id,
 *         systemCenterVirtualMachineManagerVirtualMachineServerId: exampleVirtualMachineManagerServer.id,
 *     },
 *     operatingSystem: {
 *         adminPassword: "AdminPassword123!",
 *     },
 * });
 * const exampleVirtualMachineManagerVirtualMachineInstanceGuestAgent = new azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceGuestAgent("example", {
 *     scopedResourceId: exampleArcMachine.id,
 *     username: "Administrator",
 *     password: "AdminPassword123!",
 * }, {
 *     dependsOn: [exampleVirtualMachineManagerVirtualMachineInstance],
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
 * System Center Virtual Machine Manager Virtual Machine Instance Guest Agents can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:systemcenter/virtualMachineManagerVirtualMachineInstanceGuestAgent:VirtualMachineManagerVirtualMachineInstanceGuestAgent example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.HybridCompute/machines/machine1/providers/Microsoft.ScVmm/virtualMachineInstances/default/guestAgents/default
 * ```
 */
export class VirtualMachineManagerVirtualMachineInstanceGuestAgent extends pulumi.CustomResource {
    /**
     * Get an existing VirtualMachineManagerVirtualMachineInstanceGuestAgent resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualMachineManagerVirtualMachineInstanceGuestAgentState, opts?: pulumi.CustomResourceOptions): VirtualMachineManagerVirtualMachineInstanceGuestAgent {
        return new VirtualMachineManagerVirtualMachineInstanceGuestAgent(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:systemcenter/virtualMachineManagerVirtualMachineInstanceGuestAgent:VirtualMachineManagerVirtualMachineInstanceGuestAgent';

    /**
     * Returns true if the given object is an instance of VirtualMachineManagerVirtualMachineInstanceGuestAgent.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualMachineManagerVirtualMachineInstanceGuestAgent {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualMachineManagerVirtualMachineInstanceGuestAgent.__pulumiType;
    }

    /**
     * The password that is used to connect to the System Center Virtual Machine Manager Virtual Machine Instance Guest Agent. Changing this forces a new resource to be created.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * The provisioning action that is used to define the different types of operations for the System Center Virtual Machine Manager Virtual Machine Instance Guest Agent. Possible values are `install`, `repair` and `uninstall`. Defaults to `install`. Changing this forces a new resource to be created.
     */
    public readonly provisioningAction!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Hybrid Compute Machine where this System Center Virtual Machine Manager Virtual Machine Instance Guest Agent is stored. Changing this forces a new resource to be created.
     */
    public readonly scopedResourceId!: pulumi.Output<string>;
    /**
     * The username that is used to connect to the System Center Virtual Machine Manager Virtual Machine Instance Guest Agent. Changing this forces a new resource to be created.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a VirtualMachineManagerVirtualMachineInstanceGuestAgent resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualMachineManagerVirtualMachineInstanceGuestAgentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualMachineManagerVirtualMachineInstanceGuestAgentArgs | VirtualMachineManagerVirtualMachineInstanceGuestAgentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualMachineManagerVirtualMachineInstanceGuestAgentState | undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["provisioningAction"] = state ? state.provisioningAction : undefined;
            resourceInputs["scopedResourceId"] = state ? state.scopedResourceId : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as VirtualMachineManagerVirtualMachineInstanceGuestAgentArgs | undefined;
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            if ((!args || args.scopedResourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scopedResourceId'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["provisioningAction"] = args ? args.provisioningAction : undefined;
            resourceInputs["scopedResourceId"] = args ? args.scopedResourceId : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(VirtualMachineManagerVirtualMachineInstanceGuestAgent.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualMachineManagerVirtualMachineInstanceGuestAgent resources.
 */
export interface VirtualMachineManagerVirtualMachineInstanceGuestAgentState {
    /**
     * The password that is used to connect to the System Center Virtual Machine Manager Virtual Machine Instance Guest Agent. Changing this forces a new resource to be created.
     */
    password?: pulumi.Input<string>;
    /**
     * The provisioning action that is used to define the different types of operations for the System Center Virtual Machine Manager Virtual Machine Instance Guest Agent. Possible values are `install`, `repair` and `uninstall`. Defaults to `install`. Changing this forces a new resource to be created.
     */
    provisioningAction?: pulumi.Input<string>;
    /**
     * The ID of the Hybrid Compute Machine where this System Center Virtual Machine Manager Virtual Machine Instance Guest Agent is stored. Changing this forces a new resource to be created.
     */
    scopedResourceId?: pulumi.Input<string>;
    /**
     * The username that is used to connect to the System Center Virtual Machine Manager Virtual Machine Instance Guest Agent. Changing this forces a new resource to be created.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualMachineManagerVirtualMachineInstanceGuestAgent resource.
 */
export interface VirtualMachineManagerVirtualMachineInstanceGuestAgentArgs {
    /**
     * The password that is used to connect to the System Center Virtual Machine Manager Virtual Machine Instance Guest Agent. Changing this forces a new resource to be created.
     */
    password: pulumi.Input<string>;
    /**
     * The provisioning action that is used to define the different types of operations for the System Center Virtual Machine Manager Virtual Machine Instance Guest Agent. Possible values are `install`, `repair` and `uninstall`. Defaults to `install`. Changing this forces a new resource to be created.
     */
    provisioningAction?: pulumi.Input<string>;
    /**
     * The ID of the Hybrid Compute Machine where this System Center Virtual Machine Manager Virtual Machine Instance Guest Agent is stored. Changing this forces a new resource to be created.
     */
    scopedResourceId: pulumi.Input<string>;
    /**
     * The username that is used to connect to the System Center Virtual Machine Manager Virtual Machine Instance Guest Agent. Changing this forces a new resource to be created.
     */
    username: pulumi.Input<string>;
}
