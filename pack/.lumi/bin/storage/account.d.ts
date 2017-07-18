import * as lumi from "@lumi/lumi";
export declare class Account extends lumi.NamedResource implements AccountArgs {
    readonly accessTier: string;
    readonly accountKind?: string;
    readonly accountType: string;
    readonly enableBlobEncryption?: boolean;
    readonly location: string;
    readonly accountName?: string;
    readonly primaryAccessKey: string;
    readonly primaryBlobConnectionString: string;
    readonly primaryBlobEndpoint: string;
    readonly primaryFileEndpoint: string;
    readonly primaryLocation: string;
    readonly primaryQueueEndpoint: string;
    readonly primaryTableEndpoint: string;
    readonly resourceGroupName: string;
    readonly secondaryAccessKey: string;
    readonly secondaryBlobConnectionString: string;
    readonly secondaryBlobEndpoint: string;
    readonly secondaryLocation: string;
    readonly secondaryQueueEndpoint: string;
    readonly secondaryTableEndpoint: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: AccountArgs);
}
export interface AccountArgs {
    readonly accessTier?: string;
    readonly accountKind?: string;
    readonly accountType: string;
    readonly enableBlobEncryption?: boolean;
    readonly location: string;
    readonly accountName?: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
}

