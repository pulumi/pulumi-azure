// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing IotHub Device Provisioning Service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.iot.getDps({
 *     name: "iot_hub_dps_test",
 *     resourceGroupName: "iothub_dps_rg",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Devices`: 2022-02-05
 */
export function getDps(args: GetDpsArgs, opts?: pulumi.InvokeOptions): Promise<GetDpsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:iot/getDps:getDps", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getDps.
 */
export interface GetDpsArgs {
    /**
     * Specifies the name of the Iot Device Provisioning Service resource.
     */
    name: string;
    /**
     * The name of the resource group under which the Iot Device Provisioning Service is located in.
     */
    resourceGroupName: string;
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getDps.
 */
export interface GetDpsResult {
    /**
     * The allocation policy of the IoT Device Provisioning Service.
     */
    readonly allocationPolicy: string;
    /**
     * The device endpoint of the IoT Device Provisioning Service.
     */
    readonly deviceProvisioningHostName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The unique identifier of the IoT Device Provisioning Service.
     */
    readonly idScope: string;
    /**
     * Specifies the supported Azure location where the IoT Device Provisioning Service exists.
     */
    readonly location: string;
    readonly name: string;
    readonly resourceGroupName: string;
    /**
     * The service endpoint of the IoT Device Provisioning Service.
     */
    readonly serviceOperationsHostName: string;
    readonly tags?: {[key: string]: string};
}
/**
 * Use this data source to access information about an existing IotHub Device Provisioning Service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.iot.getDps({
 *     name: "iot_hub_dps_test",
 *     resourceGroupName: "iothub_dps_rg",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Devices`: 2022-02-05
 */
export function getDpsOutput(args: GetDpsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDpsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:iot/getDps:getDps", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getDps.
 */
export interface GetDpsOutputArgs {
    /**
     * Specifies the name of the Iot Device Provisioning Service resource.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the resource group under which the Iot Device Provisioning Service is located in.
     */
    resourceGroupName: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
