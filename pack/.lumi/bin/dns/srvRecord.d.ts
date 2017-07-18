import * as lumi from "@lumi/lumi";
export declare class SrvRecord extends lumi.NamedResource implements SrvRecordArgs {
    readonly srvRecordName?: string;
    readonly record: {
        port: number;
        priority: number;
        target: string;
        weight: number;
    }[];
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
    constructor(name: string, args: SrvRecordArgs);
}
export interface SrvRecordArgs {
    readonly srvRecordName?: string;
    readonly record: {
        port: number;
        priority: number;
        target: string;
        weight: number;
    }[];
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
}

