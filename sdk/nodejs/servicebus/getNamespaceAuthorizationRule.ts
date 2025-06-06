// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing ServiceBus Namespace Authorization Rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.servicebus.getNamespaceAuthorizationRule({
 *     name: "examplerule",
 *     namespaceId: "examplenamespace",
 * });
 * export const ruleId = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.ServiceBus`: 2021-06-01-preview
 */
export function getNamespaceAuthorizationRule(args: GetNamespaceAuthorizationRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetNamespaceAuthorizationRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:servicebus/getNamespaceAuthorizationRule:getNamespaceAuthorizationRule", {
        "name": args.name,
        "namespaceId": args.namespaceId,
        "namespaceName": args.namespaceName,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getNamespaceAuthorizationRule.
 */
export interface GetNamespaceAuthorizationRuleArgs {
    /**
     * Specifies the name of the ServiceBus Namespace Authorization Rule.
     */
    name: string;
    /**
     * Specifies the ID of the ServiceBus Namespace where the Service Bus Namespace Authorization Rule exists.
     */
    namespaceId?: string;
    /**
     * @deprecated `namespaceName` will be removed in favour of the property `namespaceId` in v5.0 of the AzureRM Provider.
     */
    namespaceName?: string;
    /**
     * @deprecated `resourceGroupName` will be removed in favour of the property `namespaceId` in v5.0 of the AzureRM Provider.
     */
    resourceGroupName?: string;
}

/**
 * A collection of values returned by getNamespaceAuthorizationRule.
 */
export interface GetNamespaceAuthorizationRuleResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly namespaceId?: string;
    /**
     * @deprecated `namespaceName` will be removed in favour of the property `namespaceId` in v5.0 of the AzureRM Provider.
     */
    readonly namespaceName?: string;
    /**
     * The primary connection string for the authorization rule.
     */
    readonly primaryConnectionString: string;
    /**
     * The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
     */
    readonly primaryConnectionStringAlias: string;
    /**
     * The primary access key for the authorization rule.
     */
    readonly primaryKey: string;
    /**
     * @deprecated `resourceGroupName` will be removed in favour of the property `namespaceId` in v5.0 of the AzureRM Provider.
     */
    readonly resourceGroupName?: string;
    /**
     * The secondary connection string for the authorization rule.
     */
    readonly secondaryConnectionString: string;
    /**
     * The alias Secondary Connection String for the ServiceBus Namespace
     */
    readonly secondaryConnectionStringAlias: string;
    /**
     * The secondary access key for the authorization rule.
     */
    readonly secondaryKey: string;
}
/**
 * Use this data source to access information about an existing ServiceBus Namespace Authorization Rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.servicebus.getNamespaceAuthorizationRule({
 *     name: "examplerule",
 *     namespaceId: "examplenamespace",
 * });
 * export const ruleId = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.ServiceBus`: 2021-06-01-preview
 */
export function getNamespaceAuthorizationRuleOutput(args: GetNamespaceAuthorizationRuleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNamespaceAuthorizationRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:servicebus/getNamespaceAuthorizationRule:getNamespaceAuthorizationRule", {
        "name": args.name,
        "namespaceId": args.namespaceId,
        "namespaceName": args.namespaceName,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getNamespaceAuthorizationRule.
 */
export interface GetNamespaceAuthorizationRuleOutputArgs {
    /**
     * Specifies the name of the ServiceBus Namespace Authorization Rule.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the ID of the ServiceBus Namespace where the Service Bus Namespace Authorization Rule exists.
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * @deprecated `namespaceName` will be removed in favour of the property `namespaceId` in v5.0 of the AzureRM Provider.
     */
    namespaceName?: pulumi.Input<string>;
    /**
     * @deprecated `resourceGroupName` will be removed in favour of the property `namespaceId` in v5.0 of the AzureRM Provider.
     */
    resourceGroupName?: pulumi.Input<string>;
}
