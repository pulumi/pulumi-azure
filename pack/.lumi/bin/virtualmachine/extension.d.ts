import * as lumi from "@lumi/lumi";
export declare class Extension extends lumi.NamedResource implements ExtensionArgs {
    readonly autoUpgradeMinorVersion?: boolean;
    readonly location: string;
    readonly extensionName?: string;
    readonly protectedSettings?: string;
    readonly publisher: string;
    readonly resourceGroupName: string;
    readonly settings?: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly type: string;
    readonly typeHandlerVersion: string;
    readonly virtualMachineName: string;
    constructor(name: string, args: ExtensionArgs);
}
export interface ExtensionArgs {
    readonly autoUpgradeMinorVersion?: boolean;
    readonly location: string;
    readonly extensionName?: string;
    readonly protectedSettings?: string;
    readonly publisher: string;
    readonly resourceGroupName: string;
    readonly settings?: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly type: string;
    readonly typeHandlerVersion: string;
    readonly virtualMachineName: string;
}

