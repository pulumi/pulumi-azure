import * as lumi from "@lumi/lumi";
export declare class Insights extends lumi.NamedResource implements InsightsArgs {
    readonly appId: string;
    readonly applicationType: string;
    readonly instrumentationKey: string;
    readonly location: string;
    readonly insightsName?: string;
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: InsightsArgs);
}
export interface InsightsArgs {
    readonly applicationType: string;
    readonly location: string;
    readonly insightsName?: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
}

