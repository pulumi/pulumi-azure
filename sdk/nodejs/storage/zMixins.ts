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

import { Account } from "./account";
import { Blob } from "./blob";
import { Container } from "./container";
import { getAccountSAS } from "./getAccountSAS";
import { Queue } from "./queue";
import { ZipBlob } from "./zipBlob";

import * as appservice from "../appservice";
import * as core from "../core";
import * as storage from "../storage";
import * as util from "../util";

/**
 * Produce a URL with read-only access to a Storage Blob with a Shared Access Signature (SAS).
 * @param blob Blob to construct URL for.
 * @param account Storage account.
 */
export function signedBlobReadUrl(blob: Blob | ZipBlob, account: Account): pulumi.Output<string> {

    // Choose a fixed, far-future expiration date for signed blob URLs. The shared access signature
    // (SAS) we generate for the Azure storage blob must remain valid for as long as the Function
    // App is deployed, since new instances will download the code on startup. By using a fixed
    // date, rather than (e.g.) "today plus ten years", the signing operation is idempotent.
    const signatureExpiration = "2100-01-01";

    return pulumi.all([account.name, account.primaryConnectionString, blob.storageContainerName, blob.name]).apply(
        async ([accountName, connectionString, containerName, blobName]) => {
            const sas = await getAccountSAS({
                connectionString,
                start: "2019-01-01",
                expiry: signatureExpiration,
                services: {
                    blob: true,
                    queue: false,
                    table: false,
                    file: false,
                },
                resourceTypes: {
                    service: false,
                    container: false,
                    object: true,
                },
                permissions: {
                    read: true,
                    write: false,
                    delete: false,
                    list: false,
                    add: false,
                    create: false,
                    update: false,
                    process: false,
                }
            });

            return `https://${accountName}.blob.core.windows.net/${containerName}/${blobName}${sas.sas}`;
        });
}

interface BlobBindingDefinition extends appservice.BindingDefinition {
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
    path: pulumi.Input<string>;

    /**
     * The storage connection string for the storage account containing the blob.
     */
    connection: string;
}

/**
 * Data that will be passed along in the context object to the BlobCallback.
 */
export interface BlobContext extends appservice.Context<void> {
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
export type BlobCallback = appservice.Callback<BlobContext, Buffer, void>;

export type BlobEventSubscriptionArgs = util.Overwrite<appservice.CallbackFunctionAppArgs<BlobContext, Buffer, void>, {
    /**
     * An optional prefix or suffix to filter down notifications.  See
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-storage-blob#trigger---blob-name-patterns
     * for more details.
     */
    filterPrefix?: pulumi.Input<string>;
    filterSuffix?: pulumi.Input<string>;
    /**
     * The resource group in which to create the event subscription.  If not supplied, the
     * Container's resource group will be used.
     */
    resourceGroup?: core.ResourceGroup;

    /**
     * The name of the resource group in which to create the event subscription.  If not supplied, the
     * Container's resource group will be used.
     */
    resourceGroupName?: pulumi.Input<string>;
}>;

declare module "./container" {
    interface Container {
        /**
         * Creates a new subscription to events fired from this Topic to the handler provided, along
         * with options to control the behavior of the subscription.
         */
        onBlobEvent(
            name: string, args: BlobCallback | BlobEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): BlobEventSubscription;
    }
}

Container.prototype.onBlobEvent = function(this: Container, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <BlobEventSubscriptionArgs>{ callback: args }
        : args;

    return new BlobEventSubscription(name, this, functionArgs, opts);
}

export class BlobEventSubscription extends appservice.EventSubscription<BlobContext, Buffer, void> {
    constructor(
        name: string, container: storage.Container,
        args: BlobEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: container, ...opts };

        const { resourceGroupName, location } = appservice.getResourceGroupNameAndLocation(args, container.resourceGroupName);

        const prefix = args.filterPrefix || "";
        const suffix = args.filterSuffix || "";
        const path = pulumi.interpolate`${container.name}/${prefix}{blobName}${suffix}`;

        // The blob binding does not store the storage connection string directly.  Instead, the
        // connection string is put into the app settings (under whatever key we want). Then, the
        // .connection property of the binding contains the *name* of that app setting key.
        const bindingConnectionKey = "BindingConnectionAppSettingsKey";

        const bindings: BlobBindingDefinition[] = [{
            path,
            name: "blob",
            type: "blobTrigger",
            direction: "in",
            dataType: "binary",
            connection: bindingConnectionKey,
        }];

        // Place the mapping from the well known key name to the storage account connection string in
        // the 'app settings' object.
        const account = pulumi.all([resourceGroupName, container.storageAccountName])
                              .apply(([resourceGroupName, storageAccountName]) =>
                                storage.getAccount({ resourceGroupName, name: storageAccountName }));

        const appSettings = pulumi.all([args.appSettings, account.primaryConnectionString]).apply(
            ([appSettings, connectionString]) => ({ ...appSettings, [bindingConnectionKey]: connectionString }));

        super("azure:storage:BlobEventSubscription", name, bindings, {
            ...args,
            appSettings,
            resourceGroupName,
            location,
        }, opts);

        this.registerOutputs();
    }
}

interface QueueBindingDefinition extends appservice.BindingDefinition {
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
    queueName: pulumi.Input<string>;

    /**
     * The storage connection string for the storage account containing the queue.
     */
    connection: pulumi.Input<string>;
}

interface QueueOutputBindingDefinition extends appservice.BindingDefinition {
    name: string;
    type: "queue";
    direction: "out";
    queueName: string;
    connection: string;
}

/**
 * Data that will be passed along in the context object to the QueueContext.
 */
export interface QueueContext extends appservice.Context<void> {
    executionContext: {
        invocationId: string;
        functionName: string;
        functionDirectory: string;
    };

    bindingData: {
        queueTrigger: string,
        dequeueCount: number,
        expirationTime: string,
        id: string,
        insertionTime: string,
        nextVisibleTime: string,
        popReceipt: string,
        sys: {
            methodName: string,
            utcNow: string,
        },
        invocationId: string,
    };
}

/**
 * Host settings specific to the Storage Queue plugin.
 *
 * For more details see https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-storage-queue#host-json
 */
export interface QueueHostExtensions {
    /** The maximum interval between queue polls. Minimum is 00:00:00.100 (100 ms). */
    maxPollingInterval?: string,

    /** The time interval between retries when processing of a message fails. */
    visibilityTimeout?: string,

    /** The number of queue messages that the Functions runtime retrieves simultaneously and processes in parallel. */
    batchSize?: number,

    /** The number of times to try processing a message before moving it to the poison queue. */
    maxDequeueCount?: number,

    /** Whenever the number of messages being processed concurrently gets down to this number, the runtime retrieves another batch. */
    newBatchThreshold?: number,
}
export interface QueueHostSettings extends appservice.HostSettings {
    extensions?: {
        queues: QueueHostExtensions,
    }
}

/**
 * Signature of the callback that can receive queue notifications.
 */
export type QueueCallback = appservice.Callback<QueueContext, Buffer, void | Record<string, any>>;

export interface QueueFunctionArgs extends appservice.CallbackArgs<QueueContext, Buffer, void | Record<string, any>> {
    /**
     * Defines the queue to trigger the function.
     */
    queue: Queue;

    bindings?: appservice.BindingSettings[];
};

export type QueueEventSubscriptionArgs = util.Overwrite<appservice.CallbackFunctionAppArgs<QueueContext, Buffer, void | Record<string, any>>, {
    /**
     * The resource group in which to create the event subscription.  If not supplied, the
     * Queue's resource group will be used.
     */
    resourceGroup?: core.ResourceGroup;

    /**
     * The name of the resource group in which to create the event subscription.  If not supplied, the
     * Queue's resource group will be used.
     */
    resourceGroupName?: pulumi.Input<string>;

    /** 
     * Host settings specific to the Storage Queue plugin. These values can be provided here, or defaults will 
     * be used in their place. 
     */
    hostSettings?: QueueHostSettings;

    bindings?: appservice.BindingSettings[];    
}>;

declare module "./queue" {
    interface Queue {
        /**
         * Creates a new subscription to the given queue using the callback provided, along with
         * optional options to control the behavior of the subscription.
         */
        onEvent(
            name: string, args: QueueCallback | QueueEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): QueueEventSubscription;

        output(name: string): appservice.BindingSettings;
    }
}

Queue.prototype.output = function(this: Queue, name) {
    return new QueueOutputBinding(name, this);
}

Queue.prototype.onEvent = function(this: Queue, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <QueueEventSubscriptionArgs>{ callback: args }
        : args;

    return new QueueEventSubscription(name, this, functionArgs, opts);
}

export class QueueEventSubscription extends appservice.EventSubscription<QueueContext, Buffer, void | Record<string, any>> {
    constructor(
        name: string, queue: Queue,
        args: QueueEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: queue, ...opts };

        const { resourceGroupName, location } = appservice.getResourceGroupNameAndLocation(args, queue.resourceGroupName);

        super("azure:storage:QueueEventSubscription", name, new QueueFunction(name, { ...args, queue }), {
            ...args,
            resourceGroupName,
            location,
        }, opts);

        this.registerOutputs();
    }
}

function merge(trigger: appservice.BindingDefinition, appSettings: pulumi.Input<{ [key: string]: string }>, otherBindings?: appservice.BindingSettings[]) {
    if (otherBindings) {
        const bindings = pulumi.all(otherBindings.map(b => b.binding)).apply(bs => [trigger, ...bs]);

        const perFunctionSettings = otherBindings.map(b => b.settings);
        const settings =  pulumi.all([appSettings, ...perFunctionSettings]).apply(items => items.reduce((a, b) => ({ ...a, ...b }), {}));
        return { bindings, settings };
    } else
    {
        return { bindings: [trigger], settings: appSettings };
    }
}

/**
 * Azure Function triggered by a Storage Queue.
 */
export class QueueFunction extends appservice.FunctionBase<QueueContext, Buffer, void | Record<string, any>> {
    constructor(name: string, args: QueueFunctionArgs) {
        const bindingConnectionKey = pulumi.interpolate`${args.queue.storageAccountName}ConnectionStringKey`;

        const account = pulumi.all([args.queue.resourceGroupName, args.queue.storageAccountName])
            .apply(([resourceGroupName, storageAccountName]) =>
                storage.getAccount({ resourceGroupName, name: storageAccountName }));

        const connectionStingsSetting = pulumi.all([account.primaryConnectionString, bindingConnectionKey]).apply(
            ([connectionString, key]) => ({ [key]: connectionString }));

        const trigger: QueueBindingDefinition = {
            name: "queue",
            type: "queueTrigger",
            direction: "in",
            dataType: "binary",
            queueName: args.queue.name,
            connection: bindingConnectionKey,
        };

        const { bindings, settings } = merge(trigger, connectionStingsSetting, args.bindings);

        super(name, bindings, args, settings);
    }
}

export class QueueOutputBinding implements appservice.BindingSettings {
    public readonly binding: pulumi.Input<appservice.BindingDefinition>;
    public readonly settings: pulumi.Input<{ [key: string]: any; }>;

    constructor(name: string, queue: Queue) {
        const bindingConnectionKey = pulumi.interpolate`${queue.storageAccountName}ConnectionStringKey`;
        const account = pulumi.all([queue.resourceGroupName, queue.storageAccountName])
                            .apply(([resourceGroupName, storageAccountName]) =>
                                storage.getAccount({ resourceGroupName, name: storageAccountName }));

        const appSettings = pulumi.all([account.primaryConnectionString, bindingConnectionKey]).apply(
            ([connectionString, key]) => ({ [key]: connectionString }));

        this.binding = pulumi.all([bindingConnectionKey, queue.name]).apply(([key, queueName]) => (<QueueOutputBindingDefinition>{
            name: name,
            type: "queue",
            direction: "out",
            queueName: queueName,
            connection: key,
        }));
        this.settings = appSettings;
    }
}
