import * as lumi from "@lumi/lumi";
export declare class TxtRecord extends lumi.NamedResource implements TxtRecordArgs {
    readonly txtRecordName?: string;
    readonly record: {
        value: string;
    }[];
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
    constructor(name: string, args: TxtRecordArgs);
}
export interface TxtRecordArgs {
    readonly txtRecordName?: string;
    readonly record: {
        value: string;
    }[];
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
}

