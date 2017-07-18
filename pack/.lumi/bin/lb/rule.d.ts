import * as lumi from "@lumi/lumi";
export declare class Rule extends lumi.NamedResource implements RuleArgs {
    readonly backendAddressPoolId: string;
    readonly backendPort: number;
    readonly enableFloatingIp?: boolean;
    readonly frontendIpConfigurationId: string;
    readonly frontendIpConfigurationName: string;
    readonly frontendPort: number;
    readonly idleTimeoutInMinutes: number;
    readonly loadDistribution: string;
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly ruleName?: string;
    readonly probeId: string;
    readonly protocol: string;
    readonly resourceGroupName: string;
    constructor(name: string, args: RuleArgs);
}
export interface RuleArgs {
    readonly backendAddressPoolId?: string;
    readonly backendPort: number;
    readonly enableFloatingIp?: boolean;
    readonly frontendIpConfigurationName: string;
    readonly frontendPort: number;
    readonly idleTimeoutInMinutes?: number;
    readonly loadDistribution?: string;
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly ruleName?: string;
    readonly probeId?: string;
    readonly protocol: string;
    readonly resourceGroupName: string;
}

