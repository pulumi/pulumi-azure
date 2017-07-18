import * as lumi from "@lumi/lumi";
export declare class BackendAddressPool extends lumi.NamedResource implements BackendAddressPoolArgs {
    readonly backendIpConfigurations: string[];
    readonly loadBalancingRules: string[];
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly backendAddressPoolName?: string;
    readonly resourceGroupName: string;
    constructor(name: string, args: BackendAddressPoolArgs);
}
export interface BackendAddressPoolArgs {
    readonly loadbalancerId: string;
    readonly location?: string;
    readonly backendAddressPoolName?: string;
    readonly resourceGroupName: string;
}

