import * as lumi from "@lumi/lumi";
export declare class CNameRecord extends lumi.NamedResource implements CNameRecordArgs {
    readonly cNameRecordName?: string;
    readonly record: string;
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
    constructor(name: string, args: CNameRecordArgs);
}
export interface CNameRecordArgs {
    readonly cNameRecordName?: string;
    readonly record: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
}

