// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Kubernetes Fleet Manager.
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
 * const exampleKubernetesFleetManager = new azure.containerservice.KubernetesFleetManager("example", {
 *     location: example.location,
 *     name: "example",
 *     resourceGroupName: example.name,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.ContainerService`: 2024-04-01
 *
 * ## Import
 *
 * An existing Kubernetes Fleet Manager can be imported into Pulumi using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:containerservice/kubernetesFleetManager:KubernetesFleetManager example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/fleets/{fleetName}
 * ```
 *
 * * Where `{subscriptionId}` is the ID of the Azure Subscription where the Kubernetes Fleet Manager exists. For example `12345678-1234-9876-4563-123456789012`.
 *
 * * Where `{resourceGroupName}` is the name of Resource Group where this Kubernetes Fleet Manager exists. For example `example-resource-group`.
 *
 * * Where `{fleetName}` is the name of the Fleet. For example `fleetValue`.
 */
export class KubernetesFleetManager extends pulumi.CustomResource {
    /**
     * Get an existing KubernetesFleetManager resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KubernetesFleetManagerState, opts?: pulumi.CustomResourceOptions): KubernetesFleetManager {
        return new KubernetesFleetManager(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:containerservice/kubernetesFleetManager:KubernetesFleetManager';

    /**
     * Returns true if the given object is an instance of KubernetesFleetManager.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KubernetesFleetManager {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KubernetesFleetManager.__pulumiType;
    }

    /**
     * @deprecated The service team has indicated this field is now deprecated and not to be used, as such we are marking it as such and no longer sending it to the API, please see url: https://learn.microsoft.com/en-us/azure/kubernetes-fleet/architectural-overview
     */
    public readonly hubProfile!: pulumi.Output<outputs.containerservice.KubernetesFleetManagerHubProfile | undefined>;
    /**
     * The Azure Region where the Kubernetes Fleet Manager should exist. Changing this forces a new Kubernetes Fleet Manager to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of this Kubernetes Fleet Manager. Changing this forces a new Kubernetes Fleet Manager to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the name of the Resource Group within which this Kubernetes Fleet Manager should exist. Changing this forces a new Kubernetes Fleet Manager to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Kubernetes Fleet Manager.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a KubernetesFleetManager resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KubernetesFleetManagerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KubernetesFleetManagerArgs | KubernetesFleetManagerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KubernetesFleetManagerState | undefined;
            resourceInputs["hubProfile"] = state ? state.hubProfile : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as KubernetesFleetManagerArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["hubProfile"] = args ? args.hubProfile : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KubernetesFleetManager.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KubernetesFleetManager resources.
 */
export interface KubernetesFleetManagerState {
    /**
     * @deprecated The service team has indicated this field is now deprecated and not to be used, as such we are marking it as such and no longer sending it to the API, please see url: https://learn.microsoft.com/en-us/azure/kubernetes-fleet/architectural-overview
     */
    hubProfile?: pulumi.Input<inputs.containerservice.KubernetesFleetManagerHubProfile>;
    /**
     * The Azure Region where the Kubernetes Fleet Manager should exist. Changing this forces a new Kubernetes Fleet Manager to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of this Kubernetes Fleet Manager. Changing this forces a new Kubernetes Fleet Manager to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group within which this Kubernetes Fleet Manager should exist. Changing this forces a new Kubernetes Fleet Manager to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Kubernetes Fleet Manager.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a KubernetesFleetManager resource.
 */
export interface KubernetesFleetManagerArgs {
    /**
     * @deprecated The service team has indicated this field is now deprecated and not to be used, as such we are marking it as such and no longer sending it to the API, please see url: https://learn.microsoft.com/en-us/azure/kubernetes-fleet/architectural-overview
     */
    hubProfile?: pulumi.Input<inputs.containerservice.KubernetesFleetManagerHubProfile>;
    /**
     * The Azure Region where the Kubernetes Fleet Manager should exist. Changing this forces a new Kubernetes Fleet Manager to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of this Kubernetes Fleet Manager. Changing this forces a new Kubernetes Fleet Manager to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group within which this Kubernetes Fleet Manager should exist. Changing this forces a new Kubernetes Fleet Manager to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Kubernetes Fleet Manager.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
