// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Load Balancer Outbound Rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.lb.getLBOutboundRule({
 *     name: "existing_lb_outbound_rule",
 *     loadbalancerId: "existing_load_balancer_id",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2023-09-01
 */
export function getLBOutboundRule(args: GetLBOutboundRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetLBOutboundRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:lb/getLBOutboundRule:getLBOutboundRule", {
        "loadbalancerId": args.loadbalancerId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLBOutboundRule.
 */
export interface GetLBOutboundRuleArgs {
    /**
     * The ID of the Load Balancer in which the Outbound Rule exists.
     */
    loadbalancerId: string;
    /**
     * The name of this Load Balancer Outbound Rule.
     */
    name: string;
}

/**
 * A collection of values returned by getLBOutboundRule.
 */
export interface GetLBOutboundRuleResult {
    /**
     * The number of outbound ports used for NAT.
     */
    readonly allocatedOutboundPorts: number;
    /**
     * The ID of the Backend Address Pool. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     */
    readonly backendAddressPoolId: string;
    /**
     * A `frontendIpConfiguration` block as defined below.
     */
    readonly frontendIpConfigurations: outputs.lb.GetLBOutboundRuleFrontendIpConfiguration[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The timeout for the TCP idle connection.
     */
    readonly idleTimeoutInMinutes: number;
    readonly loadbalancerId: string;
    /**
     * The name of the Frontend IP Configuration.
     */
    readonly name: string;
    /**
     * The transport protocol for the external endpoint.
     */
    readonly protocol: string;
    /**
     * Is the bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination enabled? This value is useful when the protocol is set to TCP.
     */
    readonly tcpResetEnabled: boolean;
}
/**
 * Use this data source to access information about an existing Load Balancer Outbound Rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.lb.getLBOutboundRule({
 *     name: "existing_lb_outbound_rule",
 *     loadbalancerId: "existing_load_balancer_id",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2023-09-01
 */
export function getLBOutboundRuleOutput(args: GetLBOutboundRuleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLBOutboundRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:lb/getLBOutboundRule:getLBOutboundRule", {
        "loadbalancerId": args.loadbalancerId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLBOutboundRule.
 */
export interface GetLBOutboundRuleOutputArgs {
    /**
     * The ID of the Load Balancer in which the Outbound Rule exists.
     */
    loadbalancerId: pulumi.Input<string>;
    /**
     * The name of this Load Balancer Outbound Rule.
     */
    name: pulumi.Input<string>;
}
