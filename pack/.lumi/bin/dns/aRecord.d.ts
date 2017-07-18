import * as lumi from "@lumi/lumi";
export declare class ARecord extends lumi.NamedResource implements ARecordArgs {
    readonly aRecordName?: string;
    readonly records: string[];
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
    constructor(name: string, args: ARecordArgs);
}
export interface ARecordArgs {
    readonly aRecordName?: string;
    readonly records: string[];
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
}

