// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing AAD B2C Directory.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.aadb2c.getDirectory({
 *     resourceGroupName: "example-rg",
 *     domainName: "exampleb2ctenant.onmicrosoft.com",
 * });
 * export const tenantId = example.then(example => example.tenantId);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.AzureActiveDirectory`: 2021-04-01-preview
 */
export function getDirectory(args: GetDirectoryArgs, opts?: pulumi.InvokeOptions): Promise<GetDirectoryResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:aadb2c/getDirectory:getDirectory", {
        "domainName": args.domainName,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getDirectory.
 */
export interface GetDirectoryArgs {
    /**
     * Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix.
     */
    domainName: string;
    /**
     * The name of the Resource Group where the AAD B2C Directory exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getDirectory.
 */
export interface GetDirectoryResult {
    /**
     * The type of billing for the AAD B2C tenant. Possible values include: `MAU` or `Auths`.
     */
    readonly billingType: string;
    /**
     * Location in which the B2C tenant is hosted and data resides. See [official docs](https://aka.ms/B2CDataResidenc) for more information.
     */
    readonly dataResidencyLocation: string;
    readonly domainName: string;
    /**
     * The date from which the billing type took effect. May not be populated until after the first billing cycle.
     */
    readonly effectiveStartDate: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly resourceGroupName: string;
    /**
     * Billing SKU for the B2C tenant. See [official docs](https://aka.ms/b2cBilling) for more information.
     */
    readonly skuName: string;
    /**
     * A mapping of tags assigned to the AAD B2C Directory.
     */
    readonly tags: {[key: string]: string};
    /**
     * The Tenant ID for the AAD B2C tenant.
     */
    readonly tenantId: string;
}
/**
 * Use this data source to access information about an existing AAD B2C Directory.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.aadb2c.getDirectory({
 *     resourceGroupName: "example-rg",
 *     domainName: "exampleb2ctenant.onmicrosoft.com",
 * });
 * export const tenantId = example.then(example => example.tenantId);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.AzureActiveDirectory`: 2021-04-01-preview
 */
export function getDirectoryOutput(args: GetDirectoryOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDirectoryResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:aadb2c/getDirectory:getDirectory", {
        "domainName": args.domainName,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getDirectory.
 */
export interface GetDirectoryOutputArgs {
    /**
     * Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix.
     */
    domainName: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the AAD B2C Directory exists.
     */
    resourceGroupName: pulumi.Input<string>;
}
