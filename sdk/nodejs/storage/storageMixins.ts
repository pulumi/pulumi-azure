// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import * as pulumi from "@pulumi/pulumi";
import * as appservice from "../appservice";
import { Account } from "./account";

interface BlobBinding extends appservice.Binding {
    /**
     * The name of the property in the context object to bind the actual blob value to. Not really
     * important in our implementation as the blob value will be passed as the second argument to
     * the callback function.
     */
    name: string;

    /**
     * The type of a blob binding.  Must be 'blobTrigger'.
     */
    type: "blobTrigger";

    /**
     * The direction of the binding.  We only 'support' blobs being inputs to functions.
     */
    direction: "in";

    /**
     * How we want the blob represented when passed into the callback.  We specify 'binary'
     * so that all data is passed in as a buffer.  Otherwise, Azure will attempt to sniff
     * the content and convert it accordingly.  This gives us a consistent way to know what
     * data will be passed into the function.
     */
    dataType: "binary";

    /**
     * The path to the blob we want to create a trigger for.
     */
    path: string;

    /**
     * The storage connection string for the storage account containing the blob.
     */
    connection: string;
}

/**
 * Data that will be passed along in the context object to the BlobCallback.
 */
export interface BlobContext extends appservice.Context {
    executionContext: {
        invocationId: string;
        functionName: string;
        functionDirectory: string;
    };

    bindingData: {
        blobTrigger: string;
        uri: string;
        properties: {
            cacheControl: any,
            contentDisposition: any,
            contentEncoding: any,
            contentLanguage: any,
            length: number,
            contentMD5: any,
            contentType: string,
            eTag: string,
            lastModified: string,
            blobType: string,
            leaseStatus: string,
            leaseState: string,
            leaseDuration: string,
            pageBlobSequenceNumber: any,
            appendBlobCommittedBlockCount: any,
            isServerEncrypted: boolean,
        },
        metadata: Record<string, string>,
        sys: {
            methodName: string,
            utcNow: string,
        },
        invocationId: string,
    };
}

/**
 * Signature of the callback that can receive blob notifications.
 */
export type BlobCallback = appservice.Callback<BlobContext, Buffer>;

export interface BlobEventCallbackFunctionArgs extends appservice.CallbackFunctionArgs<BlobContext, Buffer> {
    /**
     * A full path specifying which blob to register events for.  For more information on this see:
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-storage-blob
     *
     * If provided, [containerName], [filterPrefix] and [filterSuffix] should not be provided.
     */
    path?: pulumi.Input<string>;

    /**
     * The name of the container to listen to events for.  Must be provided if [path]
     * is not provided.
     */
    containerName?: pulumi.Input<string>;

    /**
     * An optional prefix or suffix to filter down notifications.  See
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-storage-blob#trigger---blob-name-patterns
     * for more details.
     *
     * Only valid with [containerName]
     */
    filterPrefix?: pulumi.Input<string>;
    filterSuffix?: pulumi.Input<string>;

    /**
     * Not provided.  An appropriate set of bindings will be produced for a blob trigger.
     */
    bindings?: never;
}

// Mixin event handling functionality onto Bucket.
declare module "./account" {
    interface Account {
        onBlobEvent(name: string, args: BlobEventCallbackFunctionArgs,
                    opts?: pulumi.ResourceOptions): appservice.CallbackFunction<BlobContext, Buffer>;
    }
}

/**
 * Creates a new subscription to the given blob using the callback provided, along with optional
 * options to control the behavior of the subscription.  Returns the FunctionApp created for
 * responding to the blob events.
 */
Account.prototype.onBlobEvent = function(
    this: Account, name: string, args: BlobEventCallbackFunctionArgs, opts?: pulumi.ResourceOptions) {

    args.resourceGroupName = args.resourceGroupName || this.resourceGroupName;
    args.location = args.location || this.location;

    let path: pulumi.Input<string>;
    if (args.path) {
        path = args.path;
    }
    else if (args.containerName) {
        const prefix = args.filterPrefix || "";
        const suffix = args.filterSuffix || "";

        path = pulumi.all([args.containerName, prefix, suffix]).apply(
            ([cn, pr, su]) => cn + `/${pr}{blobName}${su}`);
    }
    else {
        throw new pulumi.RunError("Either [path] or [containerName] must be present in [args]");
    }

    // The blob binding does not store the storage connection string directly.  Instead, the
    // connection string is put into the app settings (under whatever key we want). Then, the
    // .connection property of the binding contains the *name* of that app setting key.
    const bindingConnectionKey = "BindingConnectionAppSettingsKey";

    const bindings = pulumi.output(path).apply(p => {
        const blobBinding: BlobBinding = {
            name: "blob",
            type: "blobTrigger",
            direction: "in",
            dataType: "binary",
            path: p,
            connection: bindingConnectionKey,
        };

        return [blobBinding];
    });

    // Place the mapping from the well known key name to the storage account connection string in
    // the 'app settings' object.
    const appSettingsOutput = args.appSettings || pulumi.output({});

    args.appSettings = pulumi.all([appSettingsOutput, this.primaryConnectionString]).apply(
        ([appSettings, connectionString]) => {
            appSettings[bindingConnectionKey] = connectionString;
            return appSettings;
        });

    const functionArgs: appservice.CallbackFunctionArgs<BlobContext, Buffer> = args;
    functionArgs.bindings = bindings;

    return new appservice.CallbackFunction(name, functionArgs, opts);
}

interface QueueBinding extends appservice.Binding {
    /**
     * The name of the property in the context object to bind the actual queue message to. Not really
     * important in our implementation as the queue message will be passed as the second argument to
     * the callback function.
     */
    name: string;

    /**
     * The type of a queue binding.  Must be 'queueTrigger'.
     */
    type: "queueTrigger";

    /**
     * The direction of the binding.  We only 'support' messages being inputs to functions.
     */
    direction: "in";

    /**
     * How we want the message represented when passed into the callback.  We specify 'binary'
     * so that all data is passed in as a buffer.  Otherwise, Azure will attempt to sniff
     * the content and convert it accordingly. This gives us a consistent way to know what
     * data will be passed into the function.
     */
    dataType: "binary";

    /**
     * The name of the storage queue to listen to.
     */
    queueName: string;

    /**
     * The storage connection string for the storage account containing the queue.
     */
    connection: string;
}

/**
 * Data that will be passed along in the context object to the QueueContext.
 */
export interface QueueContext extends subscription.Context {
    executionContext: {
        invocationId: string;
        functionName: string;
        functionDirectory: string;
    };

    "bindingData": {
        "queueTrigger": string,
        "dequeueCount": number,
        "expirationTime": string,
        "id": string,
        "insertionTime": string,
        "nextVisibleTime": string,
        "popReceipt": string,
        "sys": {
            "methodName": string,
            "utcNow": string,
        },
        "invocationId": string,
    };
}

/**
 * Signature of the callback that can receive queue notifications.
 */
export type QueueCallback = subscription.Callback<QueueContext, Buffer>;

export interface QueueEventSubscriptionArgs extends subscription.EventSubscriptionArgs<QueueContext, Buffer> {
    /**
     * The name of the storage queue to listen to.
     */
    queueName: pulumi.Input<string>;
}

/**
 * Creates a new subscription to the given queue using the callback provided, along with optional
 * options to control the behavior of the subscription.
 */
export async function onQueueMessage(
    name: string, account: azure.storage.Account,
    args: QueueEventSubscriptionArgs, opts?: pulumi.ResourceOptions): Promise<QueueEventSubscription> {

    args = args || {};

    // The queue binding does not store the storage connection string directly.  Instead, the
    // connection string is put into the app settings (under whatever key we want). Then, the
    // .connection property of the binding contains the *name* of that app setting key.
    const bindingConnectionKey = "BindingConnectionAppSettingsKey";

    const bindings = pulumi.output(args.queueName).apply(q => {
        const queueBinding: QueueBinding = {
            name: "queue",
            type: "queueTrigger",
            direction: "in",
            dataType: "binary",
            queueName: q,
            connection: bindingConnectionKey,
        };

        return [queueBinding];
    });

    // Place the mapping from the well known key name to the storage account connection string in
    // the 'app settings' object.
    const appSettingsOutput = args.appSettings || pulumi.output({});

    args.appSettings = pulumi.all([appSettingsOutput, account.primaryConnectionString]).apply(
        ([appSettings, connectionString]) => {
            appSettings[bindingConnectionKey] = connectionString;
            return appSettings;
        });

    return new QueueEventSubscription(name, account, bindings, args, opts);
}

export class QueueEventSubscription extends subscription.EventSubscription<QueueContext, Buffer> {
    readonly account: azure.storage.Account;

    constructor(
        name: string, account: azure.storage.Account, bindings: pulumi.Output<QueueBinding[]>,
        args: subscription.EventSubscriptionArgs<QueueContext, Buffer>, options?: pulumi.ResourceOptions) {

        super("azure-serverless:account:QueueEventSubscription", name, bindings, args, options);

        this.account = account;
    }
}
