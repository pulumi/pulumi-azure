import * as lumi from "@lumi/lumi";
export declare class Zone extends lumi.NamedResource implements ZoneArgs {
    readonly maxNumberOfRecordSets: string;
    readonly zoneName?: string;
    readonly nameServers: string[];
    readonly numberOfRecordSets: string;
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: ZoneArgs);
}
export interface ZoneArgs {
    readonly maxNumberOfRecordSets?: string;
    readonly zoneName?: string;
    readonly numberOfRecordSets?: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
}

