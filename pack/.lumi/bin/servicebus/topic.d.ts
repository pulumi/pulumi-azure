import * as lumi from "@lumi/lumi";
export declare class Topic extends lumi.NamedResource implements TopicArgs {
    readonly autoDeleteOnIdle: string;
    readonly defaultMessageTtl: string;
    readonly duplicateDetectionHistoryTimeWindow: string;
    readonly enableBatchedOperations?: boolean;
    readonly enableExpress?: boolean;
    readonly enableFilteringMessagesBeforePublishing?: boolean;
    readonly enablePartitioning?: boolean;
    readonly location: string;
    readonly maxSizeInMegabytes: number;
    readonly topicName?: string;
    readonly namespaceName: string;
    readonly requiresDuplicateDetection?: boolean;
    readonly resourceGroupName: string;
    readonly supportOrdering?: boolean;
    constructor(name: string, args: TopicArgs);
}
export interface TopicArgs {
    readonly autoDeleteOnIdle?: string;
    readonly defaultMessageTtl?: string;
    readonly duplicateDetectionHistoryTimeWindow?: string;
    readonly enableBatchedOperations?: boolean;
    readonly enableExpress?: boolean;
    readonly enableFilteringMessagesBeforePublishing?: boolean;
    readonly enablePartitioning?: boolean;
    readonly location: string;
    readonly maxSizeInMegabytes?: number;
    readonly topicName?: string;
    readonly namespaceName: string;
    readonly requiresDuplicateDetection?: boolean;
    readonly resourceGroupName: string;
    readonly supportOrdering?: boolean;
}

