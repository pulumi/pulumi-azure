import * as lumi from "@lumi/lumi";
export declare class PublicIp extends lumi.NamedResource implements PublicIpArgs {
    readonly domainNameLabel?: string;
    readonly fqdn: string;
    readonly idleTimeoutInMinutes?: number;
    readonly ipAddress: string;
    readonly location: string;
    readonly publicIpName?: string;
    readonly publicIpAddressAllocation: string;
    readonly resourceGroupName: string;
    readonly reverseFqdn?: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: PublicIpArgs);
}
export interface PublicIpArgs {
    readonly domainNameLabel?: string;
    readonly idleTimeoutInMinutes?: number;
    readonly location: string;
    readonly publicIpName?: string;
    readonly publicIpAddressAllocation: string;
    readonly resourceGroupName: string;
    readonly reverseFqdn?: string;
    readonly tags?: {
        [key: string]: any;
    };
}

