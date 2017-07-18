import * as lumi from "@lumi/lumi";
export declare class Namespace extends lumi.NamedResource implements NamespaceArgs {
    readonly capacity?: number;
    readonly defaultPrimaryConnectionString: string;
    readonly defaultPrimaryKey: string;
    readonly defaultSecondaryConnectionString: string;
    readonly defaultSecondaryKey: string;
    readonly location: string;
    readonly namespaceName?: string;
    readonly resourceGroupName: string;
    readonly sku: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: NamespaceArgs);
}
export interface NamespaceArgs {
    readonly capacity?: number;
    readonly location: string;
    readonly namespaceName?: string;
    readonly resourceGroupName: string;
    readonly sku: string;
    readonly tags?: {
        [key: string]: any;
    };
}

