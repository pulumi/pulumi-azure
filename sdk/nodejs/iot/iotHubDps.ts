// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an IotHub Device Provisioning Service.
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
 * const exampleIotHubDps = new azure.iot.IotHubDps("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     allocationPolicy: "Hashed",
 *     sku: {
 *         name: "S1",
 *         capacity: 1,
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Devices`: 2022-02-05
 *
 * ## Import
 *
 * IoT Device Provisioning Service can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:iot/iotHubDps:IotHubDps example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/provisioningServices/example
 * ```
 */
export class IotHubDps extends pulumi.CustomResource {
    /**
     * Get an existing IotHubDps resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IotHubDpsState, opts?: pulumi.CustomResourceOptions): IotHubDps {
        return new IotHubDps(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:iot/iotHubDps:IotHubDps';

    /**
     * Returns true if the given object is an instance of IotHubDps.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IotHubDps {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IotHubDps.__pulumiType;
    }

    /**
     * The allocation policy of the IoT Device Provisioning Service (`Hashed`, `GeoLatency` or `Static`). Defaults to `Hashed`.
     */
    public readonly allocationPolicy!: pulumi.Output<string | undefined>;
    /**
     * Specifies if the IoT Device Provisioning Service has data residency enabled, removing the cross geo-pair disaster recovery. Defaults to `false`. Changing this forces a new resource to be created.
     */
    public readonly dataResidencyEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The device endpoint of the IoT Device Provisioning Service.
     */
    public /*out*/ readonly deviceProvisioningHostName!: pulumi.Output<string>;
    /**
     * The unique identifier of the IoT Device Provisioning Service.
     */
    public /*out*/ readonly idScope!: pulumi.Output<string>;
    /**
     * An `ipFilterRule` block as defined below.
     */
    public readonly ipFilterRules!: pulumi.Output<outputs.iot.IotHubDpsIpFilterRule[] | undefined>;
    /**
     * A `linkedHub` block as defined below.
     */
    public readonly linkedHubs!: pulumi.Output<outputs.iot.IotHubDpsLinkedHub[] | undefined>;
    /**
     * Specifies the supported Azure location where the resource has to be created. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of the Iot Device Provisioning Service resource. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Whether requests from Public Network are allowed. Defaults to `true`.
     */
    public readonly publicNetworkAccessEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the resource group under which the Iot Device Provisioning Service resource has to be created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The service endpoint of the IoT Device Provisioning Service.
     */
    public /*out*/ readonly serviceOperationsHostName!: pulumi.Output<string>;
    /**
     * A `sku` block as defined below.
     */
    public readonly sku!: pulumi.Output<outputs.iot.IotHubDpsSku>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a IotHubDps resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IotHubDpsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IotHubDpsArgs | IotHubDpsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IotHubDpsState | undefined;
            resourceInputs["allocationPolicy"] = state ? state.allocationPolicy : undefined;
            resourceInputs["dataResidencyEnabled"] = state ? state.dataResidencyEnabled : undefined;
            resourceInputs["deviceProvisioningHostName"] = state ? state.deviceProvisioningHostName : undefined;
            resourceInputs["idScope"] = state ? state.idScope : undefined;
            resourceInputs["ipFilterRules"] = state ? state.ipFilterRules : undefined;
            resourceInputs["linkedHubs"] = state ? state.linkedHubs : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = state ? state.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["serviceOperationsHostName"] = state ? state.serviceOperationsHostName : undefined;
            resourceInputs["sku"] = state ? state.sku : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as IotHubDpsArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.sku === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sku'");
            }
            resourceInputs["allocationPolicy"] = args ? args.allocationPolicy : undefined;
            resourceInputs["dataResidencyEnabled"] = args ? args.dataResidencyEnabled : undefined;
            resourceInputs["ipFilterRules"] = args ? args.ipFilterRules : undefined;
            resourceInputs["linkedHubs"] = args ? args.linkedHubs : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = args ? args.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sku"] = args ? args.sku : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["deviceProvisioningHostName"] = undefined /*out*/;
            resourceInputs["idScope"] = undefined /*out*/;
            resourceInputs["serviceOperationsHostName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IotHubDps.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IotHubDps resources.
 */
export interface IotHubDpsState {
    /**
     * The allocation policy of the IoT Device Provisioning Service (`Hashed`, `GeoLatency` or `Static`). Defaults to `Hashed`.
     */
    allocationPolicy?: pulumi.Input<string>;
    /**
     * Specifies if the IoT Device Provisioning Service has data residency enabled, removing the cross geo-pair disaster recovery. Defaults to `false`. Changing this forces a new resource to be created.
     */
    dataResidencyEnabled?: pulumi.Input<boolean>;
    /**
     * The device endpoint of the IoT Device Provisioning Service.
     */
    deviceProvisioningHostName?: pulumi.Input<string>;
    /**
     * The unique identifier of the IoT Device Provisioning Service.
     */
    idScope?: pulumi.Input<string>;
    /**
     * An `ipFilterRule` block as defined below.
     */
    ipFilterRules?: pulumi.Input<pulumi.Input<inputs.iot.IotHubDpsIpFilterRule>[]>;
    /**
     * A `linkedHub` block as defined below.
     */
    linkedHubs?: pulumi.Input<pulumi.Input<inputs.iot.IotHubDpsLinkedHub>[]>;
    /**
     * Specifies the supported Azure location where the resource has to be created. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Iot Device Provisioning Service resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether requests from Public Network are allowed. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the resource group under which the Iot Device Provisioning Service resource has to be created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The service endpoint of the IoT Device Provisioning Service.
     */
    serviceOperationsHostName?: pulumi.Input<string>;
    /**
     * A `sku` block as defined below.
     */
    sku?: pulumi.Input<inputs.iot.IotHubDpsSku>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a IotHubDps resource.
 */
export interface IotHubDpsArgs {
    /**
     * The allocation policy of the IoT Device Provisioning Service (`Hashed`, `GeoLatency` or `Static`). Defaults to `Hashed`.
     */
    allocationPolicy?: pulumi.Input<string>;
    /**
     * Specifies if the IoT Device Provisioning Service has data residency enabled, removing the cross geo-pair disaster recovery. Defaults to `false`. Changing this forces a new resource to be created.
     */
    dataResidencyEnabled?: pulumi.Input<boolean>;
    /**
     * An `ipFilterRule` block as defined below.
     */
    ipFilterRules?: pulumi.Input<pulumi.Input<inputs.iot.IotHubDpsIpFilterRule>[]>;
    /**
     * A `linkedHub` block as defined below.
     */
    linkedHubs?: pulumi.Input<pulumi.Input<inputs.iot.IotHubDpsLinkedHub>[]>;
    /**
     * Specifies the supported Azure location where the resource has to be created. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Iot Device Provisioning Service resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether requests from Public Network are allowed. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the resource group under which the Iot Device Provisioning Service resource has to be created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `sku` block as defined below.
     */
    sku: pulumi.Input<inputs.iot.IotHubDpsSku>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
