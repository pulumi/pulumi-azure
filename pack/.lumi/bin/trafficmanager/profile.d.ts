import * as lumi from "@lumi/lumi";
export declare class Profile extends lumi.NamedResource implements ProfileArgs {
    readonly dnsConfig: {
        relativeName: string;
        ttl: number;
    }[];
    readonly fqdn: string;
    readonly monitorConfig: {
        path: string;
        port: number;
        protocol: string;
    }[];
    readonly profileName?: string;
    readonly profileStatus: string;
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly trafficRoutingMethod: string;
    constructor(name: string, args: ProfileArgs);
}
export interface ProfileArgs {
    readonly dnsConfig: {
        relativeName: string;
        ttl: number;
    }[];
    readonly monitorConfig: {
        path: string;
        port: number;
        protocol: string;
    }[];
    readonly profileName?: string;
    readonly profileStatus?: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly trafficRoutingMethod: string;
}

