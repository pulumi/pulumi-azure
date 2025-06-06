// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about existing Azure App Configuration Keys.
 *
 * > **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const test = azure.appconfiguration.getConfigurationKeys({
 *     configurationStoreId: appconf.id,
 * });
 * export const value = test.then(test => test.items);
 * ```
 */
export function getConfigurationKeys(args: GetConfigurationKeysArgs, opts?: pulumi.InvokeOptions): Promise<GetConfigurationKeysResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:appconfiguration/getConfigurationKeys:getConfigurationKeys", {
        "configurationStoreId": args.configurationStoreId,
        "key": args.key,
        "label": args.label,
    }, opts);
}

/**
 * A collection of arguments for invoking getConfigurationKeys.
 */
export interface GetConfigurationKeysArgs {
    /**
     * Specifies the id of the App Configuration.
     */
    configurationStoreId: string;
    /**
     * The name of the App Configuration Keys to look up.
     */
    key?: string;
    /**
     * The label of the App Configuration Keys tp look up.
     */
    label?: string;
}

/**
 * A collection of values returned by getConfigurationKeys.
 */
export interface GetConfigurationKeysResult {
    readonly configurationStoreId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of `items` blocks as defined below.
     */
    readonly items: outputs.appconfiguration.GetConfigurationKeysItem[];
    /**
     * The name of the App Configuration Key.
     */
    readonly key?: string;
    /**
     * The label of the App Configuration Key.
     */
    readonly label?: string;
}
/**
 * Use this data source to access information about existing Azure App Configuration Keys.
 *
 * > **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const test = azure.appconfiguration.getConfigurationKeys({
 *     configurationStoreId: appconf.id,
 * });
 * export const value = test.then(test => test.items);
 * ```
 */
export function getConfigurationKeysOutput(args: GetConfigurationKeysOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConfigurationKeysResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:appconfiguration/getConfigurationKeys:getConfigurationKeys", {
        "configurationStoreId": args.configurationStoreId,
        "key": args.key,
        "label": args.label,
    }, opts);
}

/**
 * A collection of arguments for invoking getConfigurationKeys.
 */
export interface GetConfigurationKeysOutputArgs {
    /**
     * Specifies the id of the App Configuration.
     */
    configurationStoreId: pulumi.Input<string>;
    /**
     * The name of the App Configuration Keys to look up.
     */
    key?: pulumi.Input<string>;
    /**
     * The label of the App Configuration Keys tp look up.
     */
    label?: pulumi.Input<string>;
}
