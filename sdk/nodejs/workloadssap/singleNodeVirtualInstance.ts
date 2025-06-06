// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an SAP Single Node Virtual Instance with new SAP System.
 *
 * > **Note:** Before using this resource, it's required to submit the request of registering the Resource Provider with Azure CLI `az provider register --namespace "Microsoft.Workloads"`. The Resource Provider can take a while to register, you can check the status by running `az provider show --namespace "Microsoft.Workloads" --query "registrationState"`. Once this outputs "Registered" the Resource Provider is available for use.
 *
 * ## Import
 *
 * SAP Single Node Virtual Instances with new SAP Systems can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:workloadssap/singleNodeVirtualInstance:SingleNodeVirtualInstance example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Workloads/sapVirtualInstances/vis1
 * ```
 */
export class SingleNodeVirtualInstance extends pulumi.CustomResource {
    /**
     * Get an existing SingleNodeVirtualInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SingleNodeVirtualInstanceState, opts?: pulumi.CustomResourceOptions): SingleNodeVirtualInstance {
        return new SingleNodeVirtualInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:workloadssap/singleNodeVirtualInstance:SingleNodeVirtualInstance';

    /**
     * Returns true if the given object is an instance of SingleNodeVirtualInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SingleNodeVirtualInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SingleNodeVirtualInstance.__pulumiType;
    }

    /**
     * The Geo-Location where the SAP system is to be created. Changing this forces a new resource to be created.
     */
    public readonly appLocation!: pulumi.Output<string>;
    /**
     * The environment type for the SAP Single Node Virtual Instance. Possible values are `NonProd` and `Prod`. Changing this forces a new resource to be created.
     */
    public readonly environment!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.workloadssap.SingleNodeVirtualInstanceIdentity | undefined>;
    /**
     * The Azure Region where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the managed Resource Group for the SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     */
    public readonly managedResourceGroupName!: pulumi.Output<string | undefined>;
    /**
     * The network access type for managed resources. Possible values are `Private` and `Public`. Defaults to `Public`.
     */
    public readonly managedResourcesNetworkAccessType!: pulumi.Output<string | undefined>;
    /**
     * Specifies the name of this SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The fully qualified domain name for the SAP system. Changing this forces a new resource to be created.
     */
    public readonly sapFqdn!: pulumi.Output<string>;
    /**
     * The SAP Product type for the SAP Single Node Virtual Instance. Possible values are `ECC`, `Other` and `S4HANA`. Changing this forces a new resource to be created.
     */
    public readonly sapProduct!: pulumi.Output<string>;
    /**
     * A `singleServerConfiguration` block as defined below. Changing this forces a new resource to be created.
     */
    public readonly singleServerConfiguration!: pulumi.Output<outputs.workloadssap.SingleNodeVirtualInstanceSingleServerConfiguration>;
    /**
     * A mapping of tags which should be assigned to the SAP Single Node Virtual Instance.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a SingleNodeVirtualInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SingleNodeVirtualInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SingleNodeVirtualInstanceArgs | SingleNodeVirtualInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SingleNodeVirtualInstanceState | undefined;
            resourceInputs["appLocation"] = state ? state.appLocation : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["managedResourceGroupName"] = state ? state.managedResourceGroupName : undefined;
            resourceInputs["managedResourcesNetworkAccessType"] = state ? state.managedResourcesNetworkAccessType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["sapFqdn"] = state ? state.sapFqdn : undefined;
            resourceInputs["sapProduct"] = state ? state.sapProduct : undefined;
            resourceInputs["singleServerConfiguration"] = state ? state.singleServerConfiguration : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as SingleNodeVirtualInstanceArgs | undefined;
            if ((!args || args.appLocation === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appLocation'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.sapFqdn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sapFqdn'");
            }
            if ((!args || args.sapProduct === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sapProduct'");
            }
            if ((!args || args.singleServerConfiguration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'singleServerConfiguration'");
            }
            resourceInputs["appLocation"] = args ? args.appLocation : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["managedResourceGroupName"] = args ? args.managedResourceGroupName : undefined;
            resourceInputs["managedResourcesNetworkAccessType"] = args ? args.managedResourcesNetworkAccessType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sapFqdn"] = args ? args.sapFqdn : undefined;
            resourceInputs["sapProduct"] = args ? args.sapProduct : undefined;
            resourceInputs["singleServerConfiguration"] = args ? args.singleServerConfiguration : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SingleNodeVirtualInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SingleNodeVirtualInstance resources.
 */
export interface SingleNodeVirtualInstanceState {
    /**
     * The Geo-Location where the SAP system is to be created. Changing this forces a new resource to be created.
     */
    appLocation?: pulumi.Input<string>;
    /**
     * The environment type for the SAP Single Node Virtual Instance. Possible values are `NonProd` and `Prod`. Changing this forces a new resource to be created.
     */
    environment?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.workloadssap.SingleNodeVirtualInstanceIdentity>;
    /**
     * The Azure Region where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the managed Resource Group for the SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     */
    managedResourceGroupName?: pulumi.Input<string>;
    /**
     * The network access type for managed resources. Possible values are `Private` and `Public`. Defaults to `Public`.
     */
    managedResourcesNetworkAccessType?: pulumi.Input<string>;
    /**
     * Specifies the name of this SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The fully qualified domain name for the SAP system. Changing this forces a new resource to be created.
     */
    sapFqdn?: pulumi.Input<string>;
    /**
     * The SAP Product type for the SAP Single Node Virtual Instance. Possible values are `ECC`, `Other` and `S4HANA`. Changing this forces a new resource to be created.
     */
    sapProduct?: pulumi.Input<string>;
    /**
     * A `singleServerConfiguration` block as defined below. Changing this forces a new resource to be created.
     */
    singleServerConfiguration?: pulumi.Input<inputs.workloadssap.SingleNodeVirtualInstanceSingleServerConfiguration>;
    /**
     * A mapping of tags which should be assigned to the SAP Single Node Virtual Instance.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a SingleNodeVirtualInstance resource.
 */
export interface SingleNodeVirtualInstanceArgs {
    /**
     * The Geo-Location where the SAP system is to be created. Changing this forces a new resource to be created.
     */
    appLocation: pulumi.Input<string>;
    /**
     * The environment type for the SAP Single Node Virtual Instance. Possible values are `NonProd` and `Prod`. Changing this forces a new resource to be created.
     */
    environment: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.workloadssap.SingleNodeVirtualInstanceIdentity>;
    /**
     * The Azure Region where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the managed Resource Group for the SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     */
    managedResourceGroupName?: pulumi.Input<string>;
    /**
     * The network access type for managed resources. Possible values are `Private` and `Public`. Defaults to `Public`.
     */
    managedResourcesNetworkAccessType?: pulumi.Input<string>;
    /**
     * Specifies the name of this SAP Single Node Virtual Instance. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the SAP Single Node Virtual Instance should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The fully qualified domain name for the SAP system. Changing this forces a new resource to be created.
     */
    sapFqdn: pulumi.Input<string>;
    /**
     * The SAP Product type for the SAP Single Node Virtual Instance. Possible values are `ECC`, `Other` and `S4HANA`. Changing this forces a new resource to be created.
     */
    sapProduct: pulumi.Input<string>;
    /**
     * A `singleServerConfiguration` block as defined below. Changing this forces a new resource to be created.
     */
    singleServerConfiguration: pulumi.Input<inputs.workloadssap.SingleNodeVirtualInstanceSingleServerConfiguration>;
    /**
     * A mapping of tags which should be assigned to the SAP Single Node Virtual Instance.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
