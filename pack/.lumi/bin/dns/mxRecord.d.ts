import * as lumi from "@lumi/lumi";
export declare class MxRecord extends lumi.NamedResource implements MxRecordArgs {
    readonly mxRecordName?: string;
    readonly record: {
        exchange: string;
        preference: string;
    }[];
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
    constructor(name: string, args: MxRecordArgs);
}
export interface MxRecordArgs {
    readonly mxRecordName?: string;
    readonly record: {
        exchange: string;
        preference: string;
    }[];
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
}

