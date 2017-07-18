import * as lumi from "@lumi/lumi";
export declare class Probe extends lumi.NamedResource implements ProbeArgs {
    readonly intervalInSeconds?: number;
    readonly loadBalancerRules: string[];
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly probeName?: string;
    readonly numberOfProbes?: number;
    readonly port: number;
    readonly protocol: string;
    readonly requestPath?: string;
    readonly resourceGroupName: string;
    constructor(name: string, args: ProbeArgs);
}
export interface ProbeArgs {
    readonly intervalInSeconds?: number;
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly probeName?: string;
    readonly numberOfProbes?: number;
    readonly port: number;
    readonly protocol?: string;
    readonly requestPath?: string;
    readonly resourceGroupName: string;
}

