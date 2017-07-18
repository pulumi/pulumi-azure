import * as lumi from "@lumi/lumi";
export declare class EventHub extends lumi.NamedResource implements EventHubArgs {
    readonly location: string;
    readonly messageRetention: number;
    readonly eventHubName?: string;
    readonly namespaceName: string;
    readonly partitionCount: number;
    readonly partitionIds: string[];
    readonly resourceGroupName: string;
    constructor(name: string, args: EventHubArgs);
}
export interface EventHubArgs {
    readonly location: string;
    readonly messageRetention: number;
    readonly eventHubName?: string;
    readonly namespaceName: string;
    readonly partitionCount: number;
    readonly resourceGroupName: string;
}

