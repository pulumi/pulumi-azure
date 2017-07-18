import * as lumi from "@lumi/lumi";
export declare class Container extends lumi.NamedResource implements ContainerArgs {
    readonly containerAccessType?: string;
    readonly containerName?: string;
    readonly properties: {
        [key: string]: any;
    };
    readonly resourceGroupName: string;
    readonly storageAccountName: string;
    constructor(name: string, args: ContainerArgs);
}
export interface ContainerArgs {
    readonly containerAccessType?: string;
    readonly containerName?: string;
    readonly resourceGroupName: string;
    readonly storageAccountName: string;
}

