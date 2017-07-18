import * as lumi from "@lumi/lumi";
export declare class Profile extends lumi.NamedResource implements ProfileArgs {
    readonly location: string;
    readonly profileName?: string;
    readonly resourceGroupName: string;
    readonly sku: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: ProfileArgs);
}
export interface ProfileArgs {
    readonly location: string;
    readonly profileName?: string;
    readonly resourceGroupName: string;
    readonly sku: string;
    readonly tags?: {
        [key: string]: any;
    };
}

