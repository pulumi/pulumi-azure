// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a custom virtual machine image that can be used to create virtual machines.
 *
 * ## Example Usage
 *
 * > **Note:** For a more complete example, see the `examples/image` directory within the GitHub Repository.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.compute.getVirtualMachine({
 *     name: "examplevm",
 *     resourceGroupName: "example-resources",
 * });
 * const exampleImage = new azure.compute.Image("example", {
 *     name: "exampleimage",
 *     location: example.then(example => example.location),
 *     resourceGroupName: example.then(example => example.name),
 *     sourceVirtualMachineId: example.then(example => example.id),
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Compute`: 2022-03-01
 *
 * ## Import
 *
 * Images can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:compute/image:Image example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/images/image1
 * ```
 */
export class Image extends pulumi.CustomResource {
    /**
     * Get an existing Image resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImageState, opts?: pulumi.CustomResourceOptions): Image {
        return new Image(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:compute/image:Image';

    /**
     * Returns true if the given object is an instance of Image.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Image {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Image.__pulumiType;
    }

    /**
     * One or more `dataDisk` blocks as defined below.
     */
    public readonly dataDisks!: pulumi.Output<outputs.compute.ImageDataDisk[] | undefined>;
    /**
     * The HyperVGenerationType of the VirtualMachine created from the image as `V1`, `V2`. Defaults to `V1`. Changing this forces a new resource to be created.
     *
     * > **Note:** `zoneResilient` can only be set to `true` if the image is stored in a region that supports availability zones.
     */
    public readonly hyperVGeneration!: pulumi.Output<string | undefined>;
    /**
     * Specified the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of the image. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * One or more `osDisk` blocks as defined below. Changing this forces a new resource to be created.
     */
    public readonly osDisk!: pulumi.Output<outputs.compute.ImageOsDisk | undefined>;
    /**
     * The name of the resource group in which to create the image. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The Virtual Machine ID from which to create the image.
     */
    public readonly sourceVirtualMachineId!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Is zone resiliency enabled? Defaults to `false`. Changing this forces a new resource to be created.
     */
    public readonly zoneResilient!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Image resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ImageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImageArgs | ImageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ImageState | undefined;
            resourceInputs["dataDisks"] = state ? state.dataDisks : undefined;
            resourceInputs["hyperVGeneration"] = state ? state.hyperVGeneration : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["osDisk"] = state ? state.osDisk : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["sourceVirtualMachineId"] = state ? state.sourceVirtualMachineId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["zoneResilient"] = state ? state.zoneResilient : undefined;
        } else {
            const args = argsOrState as ImageArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["dataDisks"] = args ? args.dataDisks : undefined;
            resourceInputs["hyperVGeneration"] = args ? args.hyperVGeneration : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["osDisk"] = args ? args.osDisk : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sourceVirtualMachineId"] = args ? args.sourceVirtualMachineId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["zoneResilient"] = args ? args.zoneResilient : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Image.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Image resources.
 */
export interface ImageState {
    /**
     * One or more `dataDisk` blocks as defined below.
     */
    dataDisks?: pulumi.Input<pulumi.Input<inputs.compute.ImageDataDisk>[]>;
    /**
     * The HyperVGenerationType of the VirtualMachine created from the image as `V1`, `V2`. Defaults to `V1`. Changing this forces a new resource to be created.
     *
     * > **Note:** `zoneResilient` can only be set to `true` if the image is stored in a region that supports availability zones.
     */
    hyperVGeneration?: pulumi.Input<string>;
    /**
     * Specified the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the image. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `osDisk` blocks as defined below. Changing this forces a new resource to be created.
     */
    osDisk?: pulumi.Input<inputs.compute.ImageOsDisk>;
    /**
     * The name of the resource group in which to create the image. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The Virtual Machine ID from which to create the image.
     */
    sourceVirtualMachineId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Is zone resiliency enabled? Defaults to `false`. Changing this forces a new resource to be created.
     */
    zoneResilient?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Image resource.
 */
export interface ImageArgs {
    /**
     * One or more `dataDisk` blocks as defined below.
     */
    dataDisks?: pulumi.Input<pulumi.Input<inputs.compute.ImageDataDisk>[]>;
    /**
     * The HyperVGenerationType of the VirtualMachine created from the image as `V1`, `V2`. Defaults to `V1`. Changing this forces a new resource to be created.
     *
     * > **Note:** `zoneResilient` can only be set to `true` if the image is stored in a region that supports availability zones.
     */
    hyperVGeneration?: pulumi.Input<string>;
    /**
     * Specified the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the image. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `osDisk` blocks as defined below. Changing this forces a new resource to be created.
     */
    osDisk?: pulumi.Input<inputs.compute.ImageOsDisk>;
    /**
     * The name of the resource group in which to create the image. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The Virtual Machine ID from which to create the image.
     */
    sourceVirtualMachineId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Is zone resiliency enabled? Defaults to `false`. Changing this forces a new resource to be created.
     */
    zoneResilient?: pulumi.Input<boolean>;
}
