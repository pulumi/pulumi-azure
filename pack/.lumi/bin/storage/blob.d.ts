import * as lumi from "@lumi/lumi";
export declare class Blob extends lumi.NamedResource implements BlobArgs {
    readonly attempts?: number;
    readonly blobName?: string;
    readonly parallelism?: number;
    readonly resourceGroupName: string;
    readonly size?: number;
    readonly source?: string;
    readonly sourceUri?: string;
    readonly storageAccountName: string;
    readonly storageContainerName: string;
    readonly type?: string;
    readonly url: string;
    constructor(name: string, args: BlobArgs);
}
export interface BlobArgs {
    readonly attempts?: number;
    readonly blobName?: string;
    readonly parallelism?: number;
    readonly resourceGroupName: string;
    readonly size?: number;
    readonly source?: string;
    readonly sourceUri?: string;
    readonly storageAccountName: string;
    readonly storageContainerName: string;
    readonly type?: string;
}

