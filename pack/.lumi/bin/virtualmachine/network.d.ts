import * as lumi from "@lumi/lumi";
export declare class Network extends lumi.NamedResource implements NetworkArgs {
    readonly addressSpace: string[];
    readonly dnsServers?: string[];
    readonly location: string;
    readonly networkName?: string;
    readonly resourceGroupName: string;
    readonly subnet: {
        addressPrefix: string;
        name: string;
        securityGroup?: string;
    }[];
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: NetworkArgs);
}
export interface NetworkArgs {
    readonly addressSpace: string[];
    readonly dnsServers?: string[];
    readonly location: string;
    readonly networkName?: string;
    readonly resourceGroupName: string;
    readonly subnet?: {
        addressPrefix: string;
        name: string;
        securityGroup?: string;
    }[];
    readonly tags?: {
        [key: string]: any;
    };
}

