import * as lumi from "@lumi/lumi";
export declare class KeyVault extends lumi.NamedResource implements KeyVaultArgs {
    readonly accessPolicy?: {
        keyPermissions: string[];
        objectId: string;
        secretPermissions: string[];
        tenantId: string;
    }[];
    readonly enabledForDeployment?: boolean;
    readonly enabledForDiskEncryption?: boolean;
    readonly enabledForTemplateDeployment?: boolean;
    readonly location: string;
    readonly keyVaultName?: string;
    readonly resourceGroupName: string;
    readonly sku: {
        name: string;
    }[];
    readonly tags: {
        [key: string]: any;
    };
    readonly tenantId: string;
    readonly vaultUri: string;
    constructor(name: string, args: KeyVaultArgs);
}
export interface KeyVaultArgs {
    readonly accessPolicy?: {
        keyPermissions: string[];
        objectId: string;
        secretPermissions: string[];
        tenantId: string;
    }[];
    readonly enabledForDeployment?: boolean;
    readonly enabledForDiskEncryption?: boolean;
    readonly enabledForTemplateDeployment?: boolean;
    readonly location: string;
    readonly keyVaultName?: string;
    readonly resourceGroupName: string;
    readonly sku: {
        name: string;
    }[];
    readonly tags?: {
        [key: string]: any;
    };
    readonly tenantId: string;
}

