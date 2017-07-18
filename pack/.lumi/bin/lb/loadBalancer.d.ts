import * as lumi from "@lumi/lumi";
export declare class LoadBalancer extends lumi.NamedResource implements LoadBalancerArgs {
    readonly frontendIpConfiguration?: {
        inboundNatRules: string[];
        loadBalancerRules: string[];
        name: string;
        privateIpAddress: string;
        privateIpAddressAllocation: string;
        publicIpAddressId: string;
        subnetId: string;
    }[];
    readonly location: string;
    readonly loadBalancerName?: string;
    readonly privateIpAddress: string;
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: LoadBalancerArgs);
}
export interface LoadBalancerArgs {
    readonly frontendIpConfiguration?: {
        inboundNatRules: string[];
        loadBalancerRules: string[];
        name: string;
        privateIpAddress: string;
        privateIpAddressAllocation: string;
        publicIpAddressId: string;
        subnetId: string;
    }[];
    readonly location: string;
    readonly loadBalancerName?: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
}

