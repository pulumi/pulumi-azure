// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Disk SAS Token.
 *
 * Use this resource to obtain a Shared Access Signature (SAS Token) for an existing Managed Disk.
 *
 * Shared access signatures allow fine-grained, ephemeral access control to various aspects of Managed Disk similar to blob/storage account container.
 *
 * With the help of this resource, data from the disk can be copied from managed disk to a storage blob or to some other system without the need of azcopy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const testResourceGroup = new azure.core.ResourceGroup("testResourceGroup", {location: "West Europe"});
 * const testManagedDisk = new azure.compute.ManagedDisk("testManagedDisk", {
 *     location: testResourceGroup.location,
 *     resourceGroupName: testResourceGroup.name,
 *     storageAccountType: "Standard_LRS",
 *     createOption: "Empty",
 *     diskSizeGb: 1,
 * });
 * const testManagedDiskSasToken = new azure.compute.ManagedDiskSasToken("testManagedDiskSasToken", {
 *     managedDiskId: testManagedDisk.id,
 *     durationInSeconds: 300,
 *     accessLevel: "Read",
 * });
 * ```
 *
 * ## Import
 *
 * Disk SAS Token can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:compute/managedDiskSasToken:ManagedDiskSasToken example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/microsoft.compute/disks/manageddisk1
 * ```
 */
export class ManagedDiskSasToken extends pulumi.CustomResource {
    /**
     * Get an existing ManagedDiskSasToken resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedDiskSasTokenState, opts?: pulumi.CustomResourceOptions): ManagedDiskSasToken {
        return new ManagedDiskSasToken(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:compute/managedDiskSasToken:ManagedDiskSasToken';

    /**
     * Returns true if the given object is an instance of ManagedDiskSasToken.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedDiskSasToken {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedDiskSasToken.__pulumiType;
    }

    /**
     * The level of access required on the disk. Supported are Read, Write.
     */
    public readonly accessLevel!: pulumi.Output<string>;
    /**
     * The duration for which the export should be allowed. Should be between 30 & 4294967295 seconds.
     */
    public readonly durationInSeconds!: pulumi.Output<number>;
    /**
     * The ID of an existing Managed Disk which should be exported. Changing this forces a new resource to be created.
     */
    public readonly managedDiskId!: pulumi.Output<string>;
    /**
     * The computed Shared Access Signature (SAS) of the Managed Disk.
     */
    public /*out*/ readonly sasUrl!: pulumi.Output<string>;

    /**
     * Create a ManagedDiskSasToken resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedDiskSasTokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedDiskSasTokenArgs | ManagedDiskSasTokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedDiskSasTokenState | undefined;
            resourceInputs["accessLevel"] = state ? state.accessLevel : undefined;
            resourceInputs["durationInSeconds"] = state ? state.durationInSeconds : undefined;
            resourceInputs["managedDiskId"] = state ? state.managedDiskId : undefined;
            resourceInputs["sasUrl"] = state ? state.sasUrl : undefined;
        } else {
            const args = argsOrState as ManagedDiskSasTokenArgs | undefined;
            if ((!args || args.accessLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessLevel'");
            }
            if ((!args || args.durationInSeconds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'durationInSeconds'");
            }
            if ((!args || args.managedDiskId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'managedDiskId'");
            }
            resourceInputs["accessLevel"] = args ? args.accessLevel : undefined;
            resourceInputs["durationInSeconds"] = args ? args.durationInSeconds : undefined;
            resourceInputs["managedDiskId"] = args ? args.managedDiskId : undefined;
            resourceInputs["sasUrl"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedDiskSasToken.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedDiskSasToken resources.
 */
export interface ManagedDiskSasTokenState {
    /**
     * The level of access required on the disk. Supported are Read, Write.
     */
    accessLevel?: pulumi.Input<string>;
    /**
     * The duration for which the export should be allowed. Should be between 30 & 4294967295 seconds.
     */
    durationInSeconds?: pulumi.Input<number>;
    /**
     * The ID of an existing Managed Disk which should be exported. Changing this forces a new resource to be created.
     */
    managedDiskId?: pulumi.Input<string>;
    /**
     * The computed Shared Access Signature (SAS) of the Managed Disk.
     */
    sasUrl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedDiskSasToken resource.
 */
export interface ManagedDiskSasTokenArgs {
    /**
     * The level of access required on the disk. Supported are Read, Write.
     */
    accessLevel: pulumi.Input<string>;
    /**
     * The duration for which the export should be allowed. Should be between 30 & 4294967295 seconds.
     */
    durationInSeconds: pulumi.Input<number>;
    /**
     * The ID of an existing Managed Disk which should be exported. Changing this forces a new resource to be created.
     */
    managedDiskId: pulumi.Input<string>;
}