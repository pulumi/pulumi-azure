import * as lumi from "@lumi/lumi";
export declare class Queue extends lumi.NamedResource implements QueueArgs {
    readonly queueName?: string;
    readonly resourceGroupName: string;
    readonly storageAccountName: string;
    constructor(name: string, args: QueueArgs);
}
export interface QueueArgs {
    readonly queueName?: string;
    readonly resourceGroupName: string;
    readonly storageAccountName: string;
}

