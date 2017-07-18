import * as lumi from "@lumi/lumi";
export declare class ConsumerGroup extends lumi.NamedResource implements ConsumerGroupArgs {
    readonly eventhubName: string;
    readonly location: string;
    readonly consumerGroupName?: string;
    readonly namespaceName: string;
    readonly resourceGroupName: string;
    readonly userMetadata?: string;
    constructor(name: string, args: ConsumerGroupArgs);
}
export interface ConsumerGroupArgs {
    readonly eventhubName: string;
    readonly location: string;
    readonly consumerGroupName?: string;
    readonly namespaceName: string;
    readonly resourceGroupName: string;
    readonly userMetadata?: string;
}

