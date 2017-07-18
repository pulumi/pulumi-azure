import * as lumi from "@lumi/lumi";
export declare class Service extends lumi.NamedResource implements ServiceArgs {
    readonly location: string;
    readonly serviceName?: string;
    readonly partitionCount: number;
    readonly replicaCount: number;
    readonly resourceGroupName: string;
    readonly sku: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: ServiceArgs);
}
export interface ServiceArgs {
    readonly location: string;
    readonly serviceName?: string;
    readonly partitionCount?: number;
    readonly replicaCount?: number;
    readonly resourceGroupName: string;
    readonly sku: string;
    readonly tags?: {
        [key: string]: any;
    };
}

