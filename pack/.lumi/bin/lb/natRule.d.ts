import * as lumi from "@lumi/lumi";
export declare class NatRule extends lumi.NamedResource implements NatRuleArgs {
    readonly backendIpConfigurationId: string;
    readonly backendPort: number;
    readonly frontendIpConfigurationId: string;
    readonly frontendIpConfigurationName: string;
    readonly frontendPort: number;
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly natRuleName?: string;
    readonly protocol: string;
    readonly resourceGroupName: string;
    constructor(name: string, args: NatRuleArgs);
}
export interface NatRuleArgs {
    readonly backendPort: number;
    readonly frontendIpConfigurationName: string;
    readonly frontendPort: number;
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly natRuleName?: string;
    readonly protocol: string;
    readonly resourceGroupName: string;
}

