import * as lumi from "@lumi/lumi";
export declare class Share extends lumi.NamedResource implements ShareArgs {
    readonly shareName?: string;
    readonly quota?: number;
    readonly resourceGroupName: string;
    readonly storageAccountName: string;
    readonly url: string;
    constructor(name: string, args: ShareArgs);
}
export interface ShareArgs {
    readonly shareName?: string;
    readonly quota?: number;
    readonly resourceGroupName: string;
    readonly storageAccountName: string;
}

