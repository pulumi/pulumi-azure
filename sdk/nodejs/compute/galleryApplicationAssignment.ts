// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Virtual Machine Gallery Application Assignment.
 *
 * > **Note:** Gallery Application Assignments can be defined either directly on `azure.compute.LinuxVirtualMachine` and `azure.compute.WindowsVirtualMachine` resources, or using the `azure.compute.GalleryApplicationAssignment` resource - but the two approaches cannot be used together. If both are used with the same Virtual Machine, spurious changes will occur. It's recommended to use `ignoreChanges` for the `galleryApplication` block on the associated virtual machine resources, to avoid a persistent diff when using this resource.
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.compute.getVirtualMachine({
 *     name: "example-vm",
 *     resourceGroupName: "example-resources-vm",
 * });
 * const exampleResourceGroup = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleSharedImageGallery = new azure.compute.SharedImageGallery("example", {
 *     name: "examplegallery",
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 * });
 * const exampleGalleryApplication = new azure.compute.GalleryApplication("example", {
 *     name: "example-app",
 *     galleryId: exampleSharedImageGallery.id,
 *     location: exampleResourceGroup.location,
 *     supportedOsType: "Linux",
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "examplestorage",
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const exampleContainer = new azure.storage.Container("example", {
 *     name: "example-container",
 *     storageAccountName: exampleAccount.name,
 *     containerAccessType: "blob",
 * });
 * const exampleBlob = new azure.storage.Blob("example", {
 *     name: "scripts",
 *     storageAccountName: exampleAccount.name,
 *     storageContainerName: exampleContainer.name,
 *     type: "Block",
 *     sourceContent: "[scripts file content]",
 * });
 * const exampleGalleryApplicationVersion = new azure.compute.GalleryApplicationVersion("example", {
 *     name: "0.0.1",
 *     galleryApplicationId: exampleGalleryApplication.id,
 *     location: exampleGalleryApplication.location,
 *     manageAction: {
 *         install: "[install command]",
 *         remove: "[remove command]",
 *     },
 *     source: {
 *         mediaLink: exampleBlob.id,
 *     },
 *     targetRegions: [{
 *         name: exampleGalleryApplication.location,
 *         regionalReplicaCount: 1,
 *     }],
 * });
 * const exampleGalleryApplicationAssignment = new azure.compute.GalleryApplicationAssignment("example", {
 *     galleryApplicationVersionId: exampleGalleryApplicationVersion.id,
 *     virtualMachineId: example.then(example => example.id),
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Compute`: 2024-03-01
 *
 * ## Import
 *
 * Virtual Machine Gallery Application Assignments can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment example subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/virtualMachines/machine1|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/galleries/gallery1/applications/galleryApplication1/versions/galleryApplicationVersion1
 * ```
 */
export class GalleryApplicationAssignment extends pulumi.CustomResource {
    /**
     * Get an existing GalleryApplicationAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GalleryApplicationAssignmentState, opts?: pulumi.CustomResourceOptions): GalleryApplicationAssignment {
        return new GalleryApplicationAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:compute/galleryApplicationAssignment:GalleryApplicationAssignment';

    /**
     * Returns true if the given object is an instance of GalleryApplicationAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GalleryApplicationAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GalleryApplicationAssignment.__pulumiType;
    }

    /**
     * Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
     */
    public readonly configurationBlobUri!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Gallery Application Version. Changing this forces a new resource to be created.
     */
    public readonly galleryApplicationVersionId!: pulumi.Output<string>;
    /**
     * Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
     */
    public readonly order!: pulumi.Output<number | undefined>;
    /**
     * Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
     */
    public readonly tag!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Virtual Machine. Changing this forces a new resource to be created.
     */
    public readonly virtualMachineId!: pulumi.Output<string>;

    /**
     * Create a GalleryApplicationAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GalleryApplicationAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GalleryApplicationAssignmentArgs | GalleryApplicationAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GalleryApplicationAssignmentState | undefined;
            resourceInputs["configurationBlobUri"] = state ? state.configurationBlobUri : undefined;
            resourceInputs["galleryApplicationVersionId"] = state ? state.galleryApplicationVersionId : undefined;
            resourceInputs["order"] = state ? state.order : undefined;
            resourceInputs["tag"] = state ? state.tag : undefined;
            resourceInputs["virtualMachineId"] = state ? state.virtualMachineId : undefined;
        } else {
            const args = argsOrState as GalleryApplicationAssignmentArgs | undefined;
            if ((!args || args.galleryApplicationVersionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'galleryApplicationVersionId'");
            }
            if ((!args || args.virtualMachineId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualMachineId'");
            }
            resourceInputs["configurationBlobUri"] = args ? args.configurationBlobUri : undefined;
            resourceInputs["galleryApplicationVersionId"] = args ? args.galleryApplicationVersionId : undefined;
            resourceInputs["order"] = args ? args.order : undefined;
            resourceInputs["tag"] = args ? args.tag : undefined;
            resourceInputs["virtualMachineId"] = args ? args.virtualMachineId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GalleryApplicationAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GalleryApplicationAssignment resources.
 */
export interface GalleryApplicationAssignmentState {
    /**
     * Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
     */
    configurationBlobUri?: pulumi.Input<string>;
    /**
     * The ID of the Gallery Application Version. Changing this forces a new resource to be created.
     */
    galleryApplicationVersionId?: pulumi.Input<string>;
    /**
     * Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
     */
    order?: pulumi.Input<number>;
    /**
     * Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
     */
    tag?: pulumi.Input<string>;
    /**
     * The ID of the Virtual Machine. Changing this forces a new resource to be created.
     */
    virtualMachineId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GalleryApplicationAssignment resource.
 */
export interface GalleryApplicationAssignmentArgs {
    /**
     * Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
     */
    configurationBlobUri?: pulumi.Input<string>;
    /**
     * The ID of the Gallery Application Version. Changing this forces a new resource to be created.
     */
    galleryApplicationVersionId: pulumi.Input<string>;
    /**
     * Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`.
     */
    order?: pulumi.Input<number>;
    /**
     * Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
     */
    tag?: pulumi.Input<string>;
    /**
     * The ID of the Virtual Machine. Changing this forces a new resource to be created.
     */
    virtualMachineId: pulumi.Input<string>;
}
