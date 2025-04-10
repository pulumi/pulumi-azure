// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getLocalRulestack(args: GetLocalRulestackArgs, opts?: pulumi.InvokeOptions): Promise<GetLocalRulestackResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:paloalto/getLocalRulestack:getLocalRulestack", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getLocalRulestack.
 */
export interface GetLocalRulestackArgs {
    name: string;
    resourceGroupName: string;
}

/**
 * A collection of values returned by getLocalRulestack.
 */
export interface GetLocalRulestackResult {
    readonly antiSpywareProfile: string;
    readonly antiVirusProfile: string;
    readonly description: string;
    readonly dnsSubscription: string;
    readonly fileBlockingProfile: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly location: string;
    readonly name: string;
    readonly outboundTrustCertificate: string;
    readonly outboundUntrustCertificate: string;
    readonly resourceGroupName: string;
    readonly urlFilteringProfile: string;
    readonly vulnerabilityProfile: string;
}
export function getLocalRulestackOutput(args: GetLocalRulestackOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLocalRulestackResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:paloalto/getLocalRulestack:getLocalRulestack", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getLocalRulestack.
 */
export interface GetLocalRulestackOutputArgs {
    name: pulumi.Input<string>;
    resourceGroupName: pulumi.Input<string>;
}
