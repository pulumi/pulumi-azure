// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Virtual Machine Run Command.
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
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example-vnet",
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "internal",
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 * });
 * const exampleNetworkInterface = new azure.network.NetworkInterface("example", {
 *     name: "example-nic",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     ipConfigurations: [{
 *         name: "internal",
 *         subnetId: exampleSubnet.id,
 *         privateIpAddressAllocation: "Dynamic",
 *     }],
 * });
 * const exampleUserAssignedIdentity = new azure.authorization.UserAssignedIdentity("example", {
 *     name: "example-uai",
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 * });
 * const exampleLinuxVirtualMachine = new azure.compute.LinuxVirtualMachine("example", {
 *     name: "example-VM",
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     size: "Standard_B2s",
 *     adminUsername: "adminuser",
 *     adminPassword: "P@$$w0rd1234!",
 *     disablePasswordAuthentication: false,
 *     networkInterfaceIds: [exampleNetworkInterface.id],
 *     osDisk: {
 *         caching: "ReadWrite",
 *         storageAccountType: "Premium_LRS",
 *     },
 *     sourceImageReference: {
 *         publisher: "Canonical",
 *         offer: "0001-com-ubuntu-server-jammy",
 *         sku: "22_04-lts",
 *         version: "latest",
 *     },
 *     identity: {
 *         type: "SystemAssigned, UserAssigned",
 *         identityIds: [exampleUserAssignedIdentity.id],
 *     },
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "exampleaccount",
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const exampleAssignment = new azure.authorization.Assignment("example", {
 *     scope: exampleAccount.id,
 *     roleDefinitionName: "Storage Blob Data Contributor",
 *     principalId: exampleUserAssignedIdentity.principalId,
 * });
 * const exampleContainer = new azure.storage.Container("example", {
 *     name: "example-sc",
 *     storageAccountName: exampleAccount.name,
 *     containerAccessType: "blob",
 * });
 * const example1 = new azure.storage.Blob("example1", {
 *     name: "script1",
 *     storageAccountName: exampleAccount.name,
 *     storageContainerName: exampleContainer.name,
 *     type: "Block",
 *     sourceContent: "echo 'hello world'",
 * });
 * const example2 = new azure.storage.Blob("example2", {
 *     name: "output",
 *     storageAccountName: exampleAccount.name,
 *     storageContainerName: exampleContainer.name,
 *     type: "Append",
 * });
 * const example3 = new azure.storage.Blob("example3", {
 *     name: "error",
 *     storageAccountName: exampleAccount.name,
 *     storageContainerName: exampleContainer.name,
 *     type: "Append",
 * });
 * const example = azure.storage.getAccountSASOutput({
 *     connectionString: exampleAccount.primaryConnectionString,
 *     httpsOnly: true,
 *     signedVersion: "2019-10-10",
 *     start: "2023-04-01T00:00:00Z",
 *     expiry: "2024-04-01T00:00:00Z",
 *     resourceTypes: {
 *         service: false,
 *         container: false,
 *         object: true,
 *     },
 *     services: {
 *         blob: true,
 *         queue: false,
 *         table: false,
 *         file: false,
 *     },
 *     permissions: {
 *         read: true,
 *         write: true,
 *         "delete": false,
 *         list: false,
 *         add: true,
 *         create: true,
 *         update: false,
 *         process: false,
 *         tag: false,
 *         filter: false,
 *     },
 * });
 * // basic example
 * const exampleRunCommand = new azure.compute.RunCommand("example", {
 *     name: "example-vmrc",
 *     location: exampleResourceGroup.location,
 *     virtualMachineId: exampleLinuxVirtualMachine.id,
 *     source: {
 *         script: "echo 'hello world'",
 *     },
 * });
 * // authorize to storage blob using user assigned identity
 * const example2RunCommand = new azure.compute.RunCommand("example2", {
 *     location: exampleResourceGroup.location,
 *     name: "example2-vmrc",
 *     virtualMachineId: exampleLinuxVirtualMachine.id,
 *     outputBlobUri: example2.id,
 *     errorBlobUri: example3.id,
 *     runAsPassword: "P@$$w0rd1234!",
 *     runAsUser: "adminuser",
 *     source: {
 *         scriptUri: example1.id,
 *         scriptUriManagedIdentity: {
 *             clientId: exampleUserAssignedIdentity.clientId,
 *         },
 *     },
 *     errorBlobManagedIdentity: {
 *         clientId: exampleUserAssignedIdentity.clientId,
 *     },
 *     outputBlobManagedIdentity: {
 *         clientId: exampleUserAssignedIdentity.clientId,
 *     },
 *     parameters: [{
 *         name: "examplev1",
 *         value: "val1",
 *     }],
 *     protectedParameters: [{
 *         name: "examplev2",
 *         value: "val2",
 *     }],
 *     tags: {
 *         environment: "terraform-examples",
 *         some_key: "some-value",
 *     },
 * }, {
 *     dependsOn: [exampleAssignment],
 * });
 * // authorize to storage blob using SAS token
 * const example3RunCommand = new azure.compute.RunCommand("example3", {
 *     location: exampleResourceGroup.location,
 *     name: "example3-vmrc",
 *     virtualMachineId: exampleLinuxVirtualMachine.id,
 *     runAsPassword: "P@$$w0rd1234!",
 *     runAsUser: "adminuser",
 *     errorBlobUri: pulumi.all([example3.id, example]).apply(([id, example]) => `${id}${example.sas}`),
 *     outputBlobUri: pulumi.all([example2.id, example]).apply(([id, example]) => `${id}${example.sas}`),
 *     source: {
 *         scriptUri: pulumi.all([example1.id, example]).apply(([id, example]) => `${id}${example.sas}`),
 *     },
 *     parameters: [{
 *         name: "example-vm1",
 *         value: "val1",
 *     }],
 *     tags: {
 *         environment: "terraform-example-s",
 *         some_key: "some-value",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Compute`: 2023-03-01
 *
 * ## Import
 *
 * An existing Virtual Machine Run Command can be imported into Pulumi using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:compute/runCommand:RunCommand example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/virtualMachines/vm1/runCommands/rc1
 * ```
 */
export class RunCommand extends pulumi.CustomResource {
    /**
     * Get an existing RunCommand resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RunCommandState, opts?: pulumi.CustomResourceOptions): RunCommand {
        return new RunCommand(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:compute/runCommand:RunCommand';

    /**
     * Returns true if the given object is an instance of RunCommand.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RunCommand {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RunCommand.__pulumiType;
    }

    /**
     * An `errorBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     */
    public readonly errorBlobManagedIdentity!: pulumi.Output<outputs.compute.RunCommandErrorBlobManagedIdentity | undefined>;
    /**
     * Specifies the Azure storage blob where script error stream will be uploaded.
     */
    public readonly errorBlobUri!: pulumi.Output<string | undefined>;
    public /*out*/ readonly instanceViews!: pulumi.Output<outputs.compute.RunCommandInstanceView[]>;
    /**
     * The Azure Region where the Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of this Virtual Machine Run Command. Changing this forces a new Virtual Machine Run Command to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An `outputBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     */
    public readonly outputBlobManagedIdentity!: pulumi.Output<outputs.compute.RunCommandOutputBlobManagedIdentity | undefined>;
    /**
     * Specifies the Azure storage blob where script output stream will be uploaded. It can be basic blob URI with SAS token.
     */
    public readonly outputBlobUri!: pulumi.Output<string | undefined>;
    /**
     * A list of `parameter` blocks as defined below. The parameters used by the script.
     */
    public readonly parameters!: pulumi.Output<outputs.compute.RunCommandParameter[] | undefined>;
    /**
     * A list of `protectedParameter` blocks as defined below. The protected parameters used by the script.
     */
    public readonly protectedParameters!: pulumi.Output<outputs.compute.RunCommandProtectedParameter[] | undefined>;
    /**
     * Specifies the user account password on the VM when executing the Virtual Machine Run Command.
     */
    public readonly runAsPassword!: pulumi.Output<string | undefined>;
    /**
     * Specifies the user account on the VM when executing the Virtual Machine Run Command.
     */
    public readonly runAsUser!: pulumi.Output<string | undefined>;
    /**
     * A `source` block as defined below. The source of the run command script.
     */
    public readonly source!: pulumi.Output<outputs.compute.RunCommandSource>;
    /**
     * A mapping of tags which should be assigned to the Virtual Machine Run Command.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Specifies the Virtual Machine ID within which this Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     */
    public readonly virtualMachineId!: pulumi.Output<string>;

    /**
     * Create a RunCommand resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RunCommandArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RunCommandArgs | RunCommandState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RunCommandState | undefined;
            resourceInputs["errorBlobManagedIdentity"] = state ? state.errorBlobManagedIdentity : undefined;
            resourceInputs["errorBlobUri"] = state ? state.errorBlobUri : undefined;
            resourceInputs["instanceViews"] = state ? state.instanceViews : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["outputBlobManagedIdentity"] = state ? state.outputBlobManagedIdentity : undefined;
            resourceInputs["outputBlobUri"] = state ? state.outputBlobUri : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["protectedParameters"] = state ? state.protectedParameters : undefined;
            resourceInputs["runAsPassword"] = state ? state.runAsPassword : undefined;
            resourceInputs["runAsUser"] = state ? state.runAsUser : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["virtualMachineId"] = state ? state.virtualMachineId : undefined;
        } else {
            const args = argsOrState as RunCommandArgs | undefined;
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            if ((!args || args.virtualMachineId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualMachineId'");
            }
            resourceInputs["errorBlobManagedIdentity"] = args?.errorBlobManagedIdentity ? pulumi.secret(args.errorBlobManagedIdentity) : undefined;
            resourceInputs["errorBlobUri"] = args ? args.errorBlobUri : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["outputBlobManagedIdentity"] = args?.outputBlobManagedIdentity ? pulumi.secret(args.outputBlobManagedIdentity) : undefined;
            resourceInputs["outputBlobUri"] = args ? args.outputBlobUri : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["protectedParameters"] = args?.protectedParameters ? pulumi.secret(args.protectedParameters) : undefined;
            resourceInputs["runAsPassword"] = args?.runAsPassword ? pulumi.secret(args.runAsPassword) : undefined;
            resourceInputs["runAsUser"] = args ? args.runAsUser : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["virtualMachineId"] = args ? args.virtualMachineId : undefined;
            resourceInputs["instanceViews"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["errorBlobManagedIdentity", "outputBlobManagedIdentity", "protectedParameters", "runAsPassword"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(RunCommand.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RunCommand resources.
 */
export interface RunCommandState {
    /**
     * An `errorBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     */
    errorBlobManagedIdentity?: pulumi.Input<inputs.compute.RunCommandErrorBlobManagedIdentity>;
    /**
     * Specifies the Azure storage blob where script error stream will be uploaded.
     */
    errorBlobUri?: pulumi.Input<string>;
    instanceViews?: pulumi.Input<pulumi.Input<inputs.compute.RunCommandInstanceView>[]>;
    /**
     * The Azure Region where the Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of this Virtual Machine Run Command. Changing this forces a new Virtual Machine Run Command to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * An `outputBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     */
    outputBlobManagedIdentity?: pulumi.Input<inputs.compute.RunCommandOutputBlobManagedIdentity>;
    /**
     * Specifies the Azure storage blob where script output stream will be uploaded. It can be basic blob URI with SAS token.
     */
    outputBlobUri?: pulumi.Input<string>;
    /**
     * A list of `parameter` blocks as defined below. The parameters used by the script.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.compute.RunCommandParameter>[]>;
    /**
     * A list of `protectedParameter` blocks as defined below. The protected parameters used by the script.
     */
    protectedParameters?: pulumi.Input<pulumi.Input<inputs.compute.RunCommandProtectedParameter>[]>;
    /**
     * Specifies the user account password on the VM when executing the Virtual Machine Run Command.
     */
    runAsPassword?: pulumi.Input<string>;
    /**
     * Specifies the user account on the VM when executing the Virtual Machine Run Command.
     */
    runAsUser?: pulumi.Input<string>;
    /**
     * A `source` block as defined below. The source of the run command script.
     */
    source?: pulumi.Input<inputs.compute.RunCommandSource>;
    /**
     * A mapping of tags which should be assigned to the Virtual Machine Run Command.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies the Virtual Machine ID within which this Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     */
    virtualMachineId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RunCommand resource.
 */
export interface RunCommandArgs {
    /**
     * An `errorBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to errorBlobUri storage blob.
     */
    errorBlobManagedIdentity?: pulumi.Input<inputs.compute.RunCommandErrorBlobManagedIdentity>;
    /**
     * Specifies the Azure storage blob where script error stream will be uploaded.
     */
    errorBlobUri?: pulumi.Input<string>;
    /**
     * The Azure Region where the Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of this Virtual Machine Run Command. Changing this forces a new Virtual Machine Run Command to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * An `outputBlobManagedIdentity` block as defined below. User-assigned managed Identity that has access to outputBlobUri storage blob.
     */
    outputBlobManagedIdentity?: pulumi.Input<inputs.compute.RunCommandOutputBlobManagedIdentity>;
    /**
     * Specifies the Azure storage blob where script output stream will be uploaded. It can be basic blob URI with SAS token.
     */
    outputBlobUri?: pulumi.Input<string>;
    /**
     * A list of `parameter` blocks as defined below. The parameters used by the script.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.compute.RunCommandParameter>[]>;
    /**
     * A list of `protectedParameter` blocks as defined below. The protected parameters used by the script.
     */
    protectedParameters?: pulumi.Input<pulumi.Input<inputs.compute.RunCommandProtectedParameter>[]>;
    /**
     * Specifies the user account password on the VM when executing the Virtual Machine Run Command.
     */
    runAsPassword?: pulumi.Input<string>;
    /**
     * Specifies the user account on the VM when executing the Virtual Machine Run Command.
     */
    runAsUser?: pulumi.Input<string>;
    /**
     * A `source` block as defined below. The source of the run command script.
     */
    source: pulumi.Input<inputs.compute.RunCommandSource>;
    /**
     * A mapping of tags which should be assigned to the Virtual Machine Run Command.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies the Virtual Machine ID within which this Virtual Machine Run Command should exist. Changing this forces a new Virtual Machine Run Command to be created.
     */
    virtualMachineId: pulumi.Input<string>;
}
