// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Virtual Desktop Application Group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "rg-example-virtualdesktop",
 *     location: "West Europe",
 * });
 * const pooledbreadthfirst = new azure.desktopvirtualization.HostPool("pooledbreadthfirst", {
 *     name: "pooledbreadthfirst",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     type: "Pooled",
 *     loadBalancerType: "BreadthFirst",
 * });
 * const personalautomatic = new azure.desktopvirtualization.HostPool("personalautomatic", {
 *     name: "personalautomatic",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     type: "Personal",
 *     personalDesktopAssignmentType: "Automatic",
 *     loadBalancerType: "BreadthFirst",
 * });
 * const remoteapp = new azure.desktopvirtualization.ApplicationGroup("remoteapp", {
 *     name: "acctag",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     type: "RemoteApp",
 *     hostPoolId: pooledbreadthfirst.id,
 *     friendlyName: "TestAppGroup",
 *     description: "Acceptance Test: An application group",
 * });
 * const desktopapp = new azure.desktopvirtualization.ApplicationGroup("desktopapp", {
 *     name: "appgroupdesktop",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     type: "Desktop",
 *     hostPoolId: personalautomatic.id,
 *     friendlyName: "TestAppGroup",
 *     description: "Acceptance Test: An application group",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.DesktopVirtualization`: 2024-04-03
 *
 * ## Import
 *
 * Virtual Desktop Application Groups can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:desktopvirtualization/applicationGroup:ApplicationGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup1/providers/Microsoft.DesktopVirtualization/applicationGroups/myapplicationgroup
 * ```
 */
export class ApplicationGroup extends pulumi.CustomResource {
    /**
     * Get an existing ApplicationGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationGroupState, opts?: pulumi.CustomResourceOptions): ApplicationGroup {
        return new ApplicationGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:desktopvirtualization/applicationGroup:ApplicationGroup';

    /**
     * Returns true if the given object is an instance of ApplicationGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplicationGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplicationGroup.__pulumiType;
    }

    /**
     * Option to set the display name for the default sessionDesktop desktop when `type` is set to `Desktop`. A value here is mandatory for connections to the desktop using the Windows 365 portal. Without it the connection will hang at 'Loading Client'.
     */
    public readonly defaultDesktopDisplayName!: pulumi.Output<string | undefined>;
    /**
     * Option to set a description for the Virtual Desktop Application Group.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Option to set a friendly name for the Virtual Desktop Application Group.
     */
    public readonly friendlyName!: pulumi.Output<string | undefined>;
    /**
     * Resource ID for a Virtual Desktop Host Pool to associate with the Virtual Desktop Application Group. Changing the name forces a new resource to be created.
     */
    public readonly hostPoolId!: pulumi.Output<string>;
    /**
     * The location/region where the Virtual Desktop Application Group is located. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the Virtual Desktop Application Group. Changing the name forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the resource group in which to create the Virtual Desktop Application Group. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Type of Virtual Desktop Application Group. Valid options are `RemoteApp` or `Desktop` application groups. Changing this forces a new resource to be created.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ApplicationGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationGroupArgs | ApplicationGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplicationGroupState | undefined;
            resourceInputs["defaultDesktopDisplayName"] = state ? state.defaultDesktopDisplayName : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["friendlyName"] = state ? state.friendlyName : undefined;
            resourceInputs["hostPoolId"] = state ? state.hostPoolId : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ApplicationGroupArgs | undefined;
            if ((!args || args.hostPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostPoolId'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["defaultDesktopDisplayName"] = args ? args.defaultDesktopDisplayName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["friendlyName"] = args ? args.friendlyName : undefined;
            resourceInputs["hostPoolId"] = args ? args.hostPoolId : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplicationGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplicationGroup resources.
 */
export interface ApplicationGroupState {
    /**
     * Option to set the display name for the default sessionDesktop desktop when `type` is set to `Desktop`. A value here is mandatory for connections to the desktop using the Windows 365 portal. Without it the connection will hang at 'Loading Client'.
     */
    defaultDesktopDisplayName?: pulumi.Input<string>;
    /**
     * Option to set a description for the Virtual Desktop Application Group.
     */
    description?: pulumi.Input<string>;
    /**
     * Option to set a friendly name for the Virtual Desktop Application Group.
     */
    friendlyName?: pulumi.Input<string>;
    /**
     * Resource ID for a Virtual Desktop Host Pool to associate with the Virtual Desktop Application Group. Changing the name forces a new resource to be created.
     */
    hostPoolId?: pulumi.Input<string>;
    /**
     * The location/region where the Virtual Desktop Application Group is located. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Virtual Desktop Application Group. Changing the name forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Virtual Desktop Application Group. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of Virtual Desktop Application Group. Valid options are `RemoteApp` or `Desktop` application groups. Changing this forces a new resource to be created.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplicationGroup resource.
 */
export interface ApplicationGroupArgs {
    /**
     * Option to set the display name for the default sessionDesktop desktop when `type` is set to `Desktop`. A value here is mandatory for connections to the desktop using the Windows 365 portal. Without it the connection will hang at 'Loading Client'.
     */
    defaultDesktopDisplayName?: pulumi.Input<string>;
    /**
     * Option to set a description for the Virtual Desktop Application Group.
     */
    description?: pulumi.Input<string>;
    /**
     * Option to set a friendly name for the Virtual Desktop Application Group.
     */
    friendlyName?: pulumi.Input<string>;
    /**
     * Resource ID for a Virtual Desktop Host Pool to associate with the Virtual Desktop Application Group. Changing the name forces a new resource to be created.
     */
    hostPoolId: pulumi.Input<string>;
    /**
     * The location/region where the Virtual Desktop Application Group is located. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Virtual Desktop Application Group. Changing the name forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Virtual Desktop Application Group. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of Virtual Desktop Application Group. Valid options are `RemoteApp` or `Desktop` application groups. Changing this forces a new resource to be created.
     */
    type: pulumi.Input<string>;
}
