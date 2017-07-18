import * as lumi from "@lumi/lumi";
export declare class Subscription extends lumi.NamedResource implements SubscriptionArgs {
    readonly autoDeleteOnIdle: string;
    readonly deadLetteringOnFilterEvaluationExceptions?: boolean;
    readonly deadLetteringOnMessageExpiration?: boolean;
    readonly defaultMessageTtl: string;
    readonly enableBatchedOperations?: boolean;
    readonly location: string;
    readonly lockDuration: string;
    readonly maxDeliveryCount: number;
    readonly subscriptionName?: string;
    readonly namespaceName: string;
    readonly requiresSession?: boolean;
    readonly resourceGroupName: string;
    readonly topicName: string;
    constructor(name: string, args: SubscriptionArgs);
}
export interface SubscriptionArgs {
    readonly autoDeleteOnIdle?: string;
    readonly deadLetteringOnFilterEvaluationExceptions?: boolean;
    readonly deadLetteringOnMessageExpiration?: boolean;
    readonly defaultMessageTtl?: string;
    readonly enableBatchedOperations?: boolean;
    readonly location: string;
    readonly lockDuration?: string;
    readonly maxDeliveryCount: number;
    readonly subscriptionName?: string;
    readonly namespaceName: string;
    readonly requiresSession?: boolean;
    readonly resourceGroupName: string;
    readonly topicName: string;
}

