import * as lumi from "@lumi/lumi";
export declare class NatPool extends lumi.NamedResource implements NatPoolArgs {
    readonly backendPort: number;
    readonly frontendIpConfigurationId: string;
    readonly frontendIpConfigurationName: string;
    readonly frontendPortEnd: number;
    readonly frontendPortStart: number;
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly natPoolName?: string;
    readonly protocol: string;
    readonly resourceGroupName: string;
    constructor(name: string, args: NatPoolArgs);
}
export interface NatPoolArgs {
    readonly backendPort: number;
    readonly frontendIpConfigurationName: string;
    readonly frontendPortEnd: number;
    readonly frontendPortStart: number;
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly natPoolName?: string;
    readonly protocol: string;
    readonly resourceGroupName: string;
}

