import * as lumi from "@lumi/lumi";
export declare class Registry extends lumi.NamedResource implements RegistryArgs {
    readonly adminEnabled?: boolean;
    readonly adminPassword: string;
    readonly adminUsername: string;
    readonly location: string;
    readonly loginServer: string;
    readonly registryName?: string;
    readonly resourceGroupName: string;
    readonly sku?: string;
    readonly storageAccount: {
        accessKey: string;
        name: string;
    }[];
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: RegistryArgs);
}
export interface RegistryArgs {
    readonly adminEnabled?: boolean;
    readonly location: string;
    readonly registryName?: string;
    readonly resourceGroupName: string;
    readonly sku?: string;
    readonly storageAccount: {
        accessKey: string;
        name: string;
    }[];
    readonly tags?: {
        [key: string]: any;
    };
}

