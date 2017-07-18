import * as lumi from "@lumi/lumi";
export declare class FirewallRule extends lumi.NamedResource implements FirewallRuleArgs {
    readonly endIpAddress: string;
    readonly firewallRuleName?: string;
    readonly resourceGroupName: string;
    readonly serverName: string;
    readonly startIpAddress: string;
    constructor(name: string, args: FirewallRuleArgs);
}
export interface FirewallRuleArgs {
    readonly endIpAddress: string;
    readonly firewallRuleName?: string;
    readonly resourceGroupName: string;
    readonly serverName: string;
    readonly startIpAddress: string;
}

