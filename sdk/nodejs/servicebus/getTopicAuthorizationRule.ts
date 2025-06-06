// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about a ServiceBus Topic Authorization Rule within a ServiceBus Topic.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.servicebus.getTopicAuthorizationRule({
 *     name: "example-tfex_name",
 *     resourceGroupName: "example-resources",
 *     namespaceName: "example-namespace",
 *     topicName: "example-servicebus_topic",
 * });
 * export const servicebusAuthorizationRuleId = exampleAzuremServicebusTopicAuthorizationRule.id;
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.ServiceBus`: 2021-06-01-preview
 */
export function getTopicAuthorizationRule(args: GetTopicAuthorizationRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetTopicAuthorizationRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:servicebus/getTopicAuthorizationRule:getTopicAuthorizationRule", {
        "name": args.name,
        "namespaceName": args.namespaceName,
        "queueName": args.queueName,
        "resourceGroupName": args.resourceGroupName,
        "topicId": args.topicId,
        "topicName": args.topicName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTopicAuthorizationRule.
 */
export interface GetTopicAuthorizationRuleArgs {
    /**
     * The name of the ServiceBus Topic Authorization Rule resource.
     */
    name: string;
    /**
     * The name of the ServiceBus Namespace.
     */
    namespaceName?: string;
    queueName?: string;
    /**
     * The name of the resource group in which the ServiceBus Namespace exists.
     */
    resourceGroupName?: string;
    topicId?: string;
    /**
     * The name of the ServiceBus Topic.
     */
    topicName?: string;
}

/**
 * A collection of values returned by getTopicAuthorizationRule.
 */
export interface GetTopicAuthorizationRuleResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly listen: boolean;
    readonly manage: boolean;
    readonly name: string;
    readonly namespaceName?: string;
    /**
     * The Primary Connection String for the ServiceBus Topic authorization Rule.
     */
    readonly primaryConnectionString: string;
    /**
     * The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
     */
    readonly primaryConnectionStringAlias: string;
    /**
     * The Primary Key for the ServiceBus Topic authorization Rule.
     */
    readonly primaryKey: string;
    readonly queueName?: string;
    readonly resourceGroupName?: string;
    /**
     * The Secondary Connection String for the ServiceBus Topic authorization Rule.
     */
    readonly secondaryConnectionString: string;
    /**
     * The alias Secondary Connection String for the ServiceBus Namespace
     */
    readonly secondaryConnectionStringAlias: string;
    /**
     * The Secondary Key for the ServiceBus Topic authorization Rule.
     */
    readonly secondaryKey: string;
    readonly send: boolean;
    readonly topicId?: string;
    readonly topicName?: string;
}
/**
 * Use this data source to access information about a ServiceBus Topic Authorization Rule within a ServiceBus Topic.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.servicebus.getTopicAuthorizationRule({
 *     name: "example-tfex_name",
 *     resourceGroupName: "example-resources",
 *     namespaceName: "example-namespace",
 *     topicName: "example-servicebus_topic",
 * });
 * export const servicebusAuthorizationRuleId = exampleAzuremServicebusTopicAuthorizationRule.id;
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.ServiceBus`: 2021-06-01-preview
 */
export function getTopicAuthorizationRuleOutput(args: GetTopicAuthorizationRuleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTopicAuthorizationRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:servicebus/getTopicAuthorizationRule:getTopicAuthorizationRule", {
        "name": args.name,
        "namespaceName": args.namespaceName,
        "queueName": args.queueName,
        "resourceGroupName": args.resourceGroupName,
        "topicId": args.topicId,
        "topicName": args.topicName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTopicAuthorizationRule.
 */
export interface GetTopicAuthorizationRuleOutputArgs {
    /**
     * The name of the ServiceBus Topic Authorization Rule resource.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the ServiceBus Namespace.
     */
    namespaceName?: pulumi.Input<string>;
    queueName?: pulumi.Input<string>;
    /**
     * The name of the resource group in which the ServiceBus Namespace exists.
     */
    resourceGroupName?: pulumi.Input<string>;
    topicId?: pulumi.Input<string>;
    /**
     * The name of the ServiceBus Topic.
     */
    topicName?: pulumi.Input<string>;
}
