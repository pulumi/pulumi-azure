// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an Azure Custom Provider.
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
 * const exampleCustomProvider = new azure.core.CustomProvider("example", {
 *     name: "example_provider",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     resourceTypes: [{
 *         name: "dEf1",
 *         endpoint: "https://testendpoint.com/",
 *     }],
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.CustomProviders`: 2018-09-01-preview
 *
 * ## Import
 *
 * Custom Provider can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:core/customProvider:CustomProvider example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.CustomProviders/resourceProviders/example
 * ```
 */
export class CustomProvider extends pulumi.CustomResource {
    /**
     * Get an existing CustomProvider resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomProviderState, opts?: pulumi.CustomResourceOptions): CustomProvider {
        return new CustomProvider(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:core/customProvider:CustomProvider';

    /**
     * Returns true if the given object is an instance of CustomProvider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomProvider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomProvider.__pulumiType;
    }

    /**
     * Any number of `action` block as defined below. One of `resourceType` or `action` must be specified.
     */
    public readonly actions!: pulumi.Output<outputs.core.CustomProviderAction[] | undefined>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of the Custom Provider. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the resource group in which to create the Custom Provider. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Any number of `resourceType` block as defined below. One of `resourceType` or `action` must be specified.
     */
    public readonly resourceTypes!: pulumi.Output<outputs.core.CustomProviderResourceType[] | undefined>;
    /**
     * A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Any number of `validation` block as defined below.
     */
    public readonly validations!: pulumi.Output<outputs.core.CustomProviderValidation[] | undefined>;

    /**
     * Create a CustomProvider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomProviderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomProviderArgs | CustomProviderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomProviderState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["resourceTypes"] = state ? state.resourceTypes : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["validations"] = state ? state.validations : undefined;
        } else {
            const args = argsOrState as CustomProviderArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["resourceTypes"] = args ? args.resourceTypes : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["validations"] = args ? args.validations : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomProvider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomProvider resources.
 */
export interface CustomProviderState {
    /**
     * Any number of `action` block as defined below. One of `resourceType` or `action` must be specified.
     */
    actions?: pulumi.Input<pulumi.Input<inputs.core.CustomProviderAction>[]>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Custom Provider. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Custom Provider. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Any number of `resourceType` block as defined below. One of `resourceType` or `action` must be specified.
     */
    resourceTypes?: pulumi.Input<pulumi.Input<inputs.core.CustomProviderResourceType>[]>;
    /**
     * A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Any number of `validation` block as defined below.
     */
    validations?: pulumi.Input<pulumi.Input<inputs.core.CustomProviderValidation>[]>;
}

/**
 * The set of arguments for constructing a CustomProvider resource.
 */
export interface CustomProviderArgs {
    /**
     * Any number of `action` block as defined below. One of `resourceType` or `action` must be specified.
     */
    actions?: pulumi.Input<pulumi.Input<inputs.core.CustomProviderAction>[]>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Custom Provider. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Custom Provider. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Any number of `resourceType` block as defined below. One of `resourceType` or `action` must be specified.
     */
    resourceTypes?: pulumi.Input<pulumi.Input<inputs.core.CustomProviderResourceType>[]>;
    /**
     * A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Any number of `validation` block as defined below.
     */
    validations?: pulumi.Input<pulumi.Input<inputs.core.CustomProviderValidation>[]>;
}
