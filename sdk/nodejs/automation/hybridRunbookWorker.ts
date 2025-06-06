// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Automation Hybrid Runbook Worker.
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
 * const exampleAccount = new azure.automation.Account("example", {
 *     name: "example-account",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     skuName: "Basic",
 * });
 * const exampleHybridRunbookWorkerGroup = new azure.automation.HybridRunbookWorkerGroup("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     automationAccountName: exampleAccount.name,
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example-vnet",
 *     resourceGroupName: example.name,
 *     addressSpaces: ["192.168.1.0/24"],
 *     location: example.location,
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "example-subnet",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["192.168.1.0/24"],
 * });
 * const exampleNetworkInterface = new azure.network.NetworkInterface("example", {
 *     name: "example-nic",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     ipConfigurations: [{
 *         name: "vm-example",
 *         subnetId: exampleSubnet.id,
 *         privateIpAddressAllocation: "Dynamic",
 *     }],
 * });
 * const exampleLinuxVirtualMachine = new azure.compute.LinuxVirtualMachine("example", {
 *     name: "example-vm",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     size: "Standard_B1s",
 *     adminUsername: "testadmin",
 *     adminPassword: "Password1234!",
 *     disablePasswordAuthentication: false,
 *     sourceImageReference: {
 *         publisher: "Canonical",
 *         offer: "0001-com-ubuntu-server-jammy",
 *         sku: "22_04-lts",
 *         version: "latest",
 *     },
 *     osDisk: {
 *         caching: "ReadWrite",
 *         storageAccountType: "Standard_LRS",
 *     },
 *     networkInterfaceIds: [exampleNetworkInterface.id],
 * });
 * const exampleHybridRunbookWorker = new azure.automation.HybridRunbookWorker("example", {
 *     resourceGroupName: example.name,
 *     automationAccountName: exampleAccount.name,
 *     workerGroupName: exampleHybridRunbookWorkerGroup.name,
 *     vmResourceId: exampleLinuxVirtualMachine.id,
 *     workerId: "00000000-0000-0000-0000-000000000000",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Automation`: 2023-11-01
 *
 * ## Import
 *
 * Automations can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:automation/hybridRunbookWorker:HybridRunbookWorker example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/hybridRunbookWorkerGroups/group1/hybridRunbookWorkers/00000000-0000-0000-0000-000000000000
 * ```
 */
export class HybridRunbookWorker extends pulumi.CustomResource {
    /**
     * Get an existing HybridRunbookWorker resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HybridRunbookWorkerState, opts?: pulumi.CustomResourceOptions): HybridRunbookWorker {
        return new HybridRunbookWorker(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:automation/hybridRunbookWorker:HybridRunbookWorker';

    /**
     * Returns true if the given object is an instance of HybridRunbookWorker.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HybridRunbookWorker {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HybridRunbookWorker.__pulumiType;
    }

    /**
     * The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
     */
    public readonly automationAccountName!: pulumi.Output<string>;
    /**
     * The IP address of assigned machine.
     */
    public /*out*/ readonly ip!: pulumi.Output<string>;
    /**
     * Last Heartbeat from the Worker.
     */
    public /*out*/ readonly lastSeenDateTime!: pulumi.Output<string>;
    /**
     * The registration time of the worker machine.
     */
    public /*out*/ readonly registrationDateTime!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
     */
    public readonly vmResourceId!: pulumi.Output<string>;
    /**
     * The name of the HybridWorker Group. Changing this forces a new Automation to be created.
     */
    public readonly workerGroupName!: pulumi.Output<string>;
    /**
     * Specify the ID of this HybridWorker in UUID notation. Changing this forces a new Automation to be created.
     */
    public readonly workerId!: pulumi.Output<string>;
    /**
     * The name of HybridWorker.
     */
    public /*out*/ readonly workerName!: pulumi.Output<string>;
    /**
     * The type of the HybridWorker, the possible values are `HybridV1` and `HybridV2`.
     */
    public /*out*/ readonly workerType!: pulumi.Output<string>;

    /**
     * Create a HybridRunbookWorker resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HybridRunbookWorkerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HybridRunbookWorkerArgs | HybridRunbookWorkerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HybridRunbookWorkerState | undefined;
            resourceInputs["automationAccountName"] = state ? state.automationAccountName : undefined;
            resourceInputs["ip"] = state ? state.ip : undefined;
            resourceInputs["lastSeenDateTime"] = state ? state.lastSeenDateTime : undefined;
            resourceInputs["registrationDateTime"] = state ? state.registrationDateTime : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["vmResourceId"] = state ? state.vmResourceId : undefined;
            resourceInputs["workerGroupName"] = state ? state.workerGroupName : undefined;
            resourceInputs["workerId"] = state ? state.workerId : undefined;
            resourceInputs["workerName"] = state ? state.workerName : undefined;
            resourceInputs["workerType"] = state ? state.workerType : undefined;
        } else {
            const args = argsOrState as HybridRunbookWorkerArgs | undefined;
            if ((!args || args.automationAccountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'automationAccountName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.vmResourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vmResourceId'");
            }
            if ((!args || args.workerGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workerGroupName'");
            }
            if ((!args || args.workerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workerId'");
            }
            resourceInputs["automationAccountName"] = args ? args.automationAccountName : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["vmResourceId"] = args ? args.vmResourceId : undefined;
            resourceInputs["workerGroupName"] = args ? args.workerGroupName : undefined;
            resourceInputs["workerId"] = args ? args.workerId : undefined;
            resourceInputs["ip"] = undefined /*out*/;
            resourceInputs["lastSeenDateTime"] = undefined /*out*/;
            resourceInputs["registrationDateTime"] = undefined /*out*/;
            resourceInputs["workerName"] = undefined /*out*/;
            resourceInputs["workerType"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HybridRunbookWorker.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HybridRunbookWorker resources.
 */
export interface HybridRunbookWorkerState {
    /**
     * The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
     */
    automationAccountName?: pulumi.Input<string>;
    /**
     * The IP address of assigned machine.
     */
    ip?: pulumi.Input<string>;
    /**
     * Last Heartbeat from the Worker.
     */
    lastSeenDateTime?: pulumi.Input<string>;
    /**
     * The registration time of the worker machine.
     */
    registrationDateTime?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
     */
    vmResourceId?: pulumi.Input<string>;
    /**
     * The name of the HybridWorker Group. Changing this forces a new Automation to be created.
     */
    workerGroupName?: pulumi.Input<string>;
    /**
     * Specify the ID of this HybridWorker in UUID notation. Changing this forces a new Automation to be created.
     */
    workerId?: pulumi.Input<string>;
    /**
     * The name of HybridWorker.
     */
    workerName?: pulumi.Input<string>;
    /**
     * The type of the HybridWorker, the possible values are `HybridV1` and `HybridV2`.
     */
    workerType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HybridRunbookWorker resource.
 */
export interface HybridRunbookWorkerArgs {
    /**
     * The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
     */
    automationAccountName: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
     */
    vmResourceId: pulumi.Input<string>;
    /**
     * The name of the HybridWorker Group. Changing this forces a new Automation to be created.
     */
    workerGroupName: pulumi.Input<string>;
    /**
     * Specify the ID of this HybridWorker in UUID notation. Changing this forces a new Automation to be created.
     */
    workerId: pulumi.Input<string>;
}
