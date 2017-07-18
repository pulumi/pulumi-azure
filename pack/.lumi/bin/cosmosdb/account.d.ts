import * as lumi from "@lumi/lumi";
export declare class Account extends lumi.NamedResource implements AccountArgs {
    readonly consistencyPolicy: {
        consistencyLevel: string;
        maxIntervalInSeconds?: number;
        maxStalenessPrefix?: number;
    }[];
    readonly failoverPolicy: {
        id: string;
        location: string;
        priority: number;
    }[];
    readonly ipRangeFilter?: string;
    readonly location: string;
    readonly accountName?: string;
    readonly offerType: string;
    readonly primaryMasterKey: string;
    readonly primaryReadonlyMasterKey: string;
    readonly resourceGroupName: string;
    readonly secondaryMasterKey: string;
    readonly secondaryReadonlyMasterKey: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: AccountArgs);
}
export interface AccountArgs {
    readonly consistencyPolicy: {
        consistencyLevel: string;
        maxIntervalInSeconds?: number;
        maxStalenessPrefix?: number;
    }[];
    readonly failoverPolicy: {
        id: string;
        location: string;
        priority: number;
    }[];
    readonly ipRangeFilter?: string;
    readonly location: string;
    readonly accountName?: string;
    readonly offerType: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
}

