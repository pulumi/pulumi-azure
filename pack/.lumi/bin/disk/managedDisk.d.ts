import * as lumi from "@lumi/lumi";
export declare class ManagedDisk extends lumi.NamedResource implements ManagedDiskArgs {
    readonly createOption: string;
    readonly diskSizeGb: number;
    readonly location: string;
    readonly managedDiskName?: string;
    readonly osType?: string;
    readonly resourceGroupName: string;
    readonly sourceResourceId?: string;
    readonly sourceUri: string;
    readonly storageAccountType: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: ManagedDiskArgs);
}
export interface ManagedDiskArgs {
    readonly createOption: string;
    readonly diskSizeGb: number;
    readonly location: string;
    readonly managedDiskName?: string;
    readonly osType?: string;
    readonly resourceGroupName: string;
    readonly sourceResourceId?: string;
    readonly sourceUri?: string;
    readonly storageAccountType: string;
    readonly tags?: {
        [key: string]: any;
    };
}

