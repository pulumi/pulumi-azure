// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Logic App Standard instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.logicapps.getStandard({
 *     name: "example-logic-app",
 *     resourceGroupName: "example-rg",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Web`: 2023-12-01
 */
export function getStandard(args: GetStandardArgs, opts?: pulumi.InvokeOptions): Promise<GetStandardResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:logicapps/getStandard:getStandard", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "siteConfig": args.siteConfig,
    }, opts);
}

/**
 * A collection of arguments for invoking getStandard.
 */
export interface GetStandardArgs {
    /**
     * The name of the Logic App.
     */
    name: string;
    /**
     * The name of the Resource Group where the Logic App exists.
     */
    resourceGroupName: string;
    /**
     * A `siteConfig` object as defined below.
     */
    siteConfig?: inputs.logicapps.GetStandardSiteConfig;
}

/**
 * A collection of values returned by getStandard.
 */
export interface GetStandardResult {
    /**
     * The ID of the App Service Plan.
     */
    readonly appServicePlanId: string;
    /**
     * A map of key-value pairs for [App Settings](https://docs.microsoft.com/azure/azure-functions/functions-app-settings) and custom values.
     */
    readonly appSettings: {[key: string]: string};
    /**
     * Controls the allowed range for bundle versions.
     */
    readonly bundleVersion: string;
    /**
     * Should the Logic App send session affinity cookies, which route client requests in the same session to the same instance.
     */
    readonly clientAffinityEnabled: boolean;
    /**
     * The mode of the Logic App's client certificates requirement for incoming requests.
     */
    readonly clientCertificateMode: string;
    /**
     * A `connectionString` block as defined below.
     */
    readonly connectionStrings: outputs.logicapps.GetStandardConnectionString[];
    /**
     * The custom domain verification of the Logic App.
     */
    readonly customDomainVerificationId: string;
    /**
     * The default hostname of the Logic App.
     */
    readonly defaultHostname: string;
    /**
     * Whether the Logic App is enabled.
     */
    readonly enabled: boolean;
    /**
     * Whether the default FTP basic authentication publishing profile is enabled.
     */
    readonly ftpPublishBasicAuthenticationEnabled: boolean;
    /**
     * Whether the Logic App can only be accessed via HTTPS.
     */
    readonly httpsOnly: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * An `identity` block as defined below.
     */
    readonly identities: outputs.logicapps.GetStandardIdentity[];
    /**
     * The kind of the Logic App.
     */
    readonly kind: string;
    /**
     * The Azure location where the Logic App Standard exists.
     */
    readonly location: string;
    /**
     * The name for this IP Restriction.
     */
    readonly name: string;
    /**
     * The outbound IP addresses of the Logic App.
     */
    readonly outboundIpAddresses: string;
    /**
     * The possible outbound IP addresses of the Logic App.
     */
    readonly possibleOutboundIpAddresses: string;
    /**
     * Whether Public Network Access should be enabled or not.
     */
    readonly publicNetworkAccess: string;
    readonly resourceGroupName: string;
    /**
     * Whether the default SCM basic authentication publishing profile is enabled.
     */
    readonly scmPublishBasicAuthenticationEnabled: boolean;
    /**
     * A `siteConfig` object as defined below.
     */
    readonly siteConfig: outputs.logicapps.GetStandardSiteConfig;
    /**
     * A `siteCredential` block as defined below, which contains the site-level credentials used to publish to this Logic App.
     */
    readonly siteCredentials: outputs.logicapps.GetStandardSiteCredential[];
    /**
     * The access key which will be used to access the backend storage account for the Logic App.
     */
    readonly storageAccountAccessKey: string;
    /**
     * The backend storage account name which will be used by this Logic App (e.g. for Stateful workflows data).
     */
    readonly storageAccountName: string;
    /**
     * The name of the share used by the logic app.
     */
    readonly storageAccountShareName: string;
    /**
     * A mapping of tags assigned to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * Whether the logic app should use the bundled extension package.
     */
    readonly useExtensionBundle: boolean;
    /**
     * The runtime version associated with the Logic App.
     */
    readonly version: string;
    /**
     * The Virtual Network Subnet ID used for this IP Restriction.
     */
    readonly virtualNetworkSubnetId: string;
}
/**
 * Use this data source to access information about an existing Logic App Standard instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.logicapps.getStandard({
 *     name: "example-logic-app",
 *     resourceGroupName: "example-rg",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Web`: 2023-12-01
 */
export function getStandardOutput(args: GetStandardOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStandardResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:logicapps/getStandard:getStandard", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "siteConfig": args.siteConfig,
    }, opts);
}

/**
 * A collection of arguments for invoking getStandard.
 */
export interface GetStandardOutputArgs {
    /**
     * The name of the Logic App.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Logic App exists.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `siteConfig` object as defined below.
     */
    siteConfig?: pulumi.Input<inputs.logicapps.GetStandardSiteConfigArgs>;
}
