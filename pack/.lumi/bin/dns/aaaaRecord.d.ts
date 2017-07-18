import * as lumi from "@lumi/lumi";
export declare class AaaaRecord extends lumi.NamedResource implements AaaaRecordArgs {
    readonly aaaaRecordName?: string;
    readonly records: string[];
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
    constructor(name: string, args: AaaaRecordArgs);
}
export interface AaaaRecordArgs {
    readonly aaaaRecordName?: string;
    readonly records: string[];
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
}

