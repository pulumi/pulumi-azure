import * as lumi from "@lumi/lumi";
export declare class NsRecord extends lumi.NamedResource implements NsRecordArgs {
    readonly nsRecordName?: string;
    readonly record: {
        nsdname: string;
    }[];
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
    constructor(name: string, args: NsRecordArgs);
}
export interface NsRecordArgs {
    readonly nsRecordName?: string;
    readonly record: {
        nsdname: string;
    }[];
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly ttl: number;
    readonly zoneName: string;
}

