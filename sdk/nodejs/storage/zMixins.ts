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
        ([accountName, connectionString, containerName, blobName]) => 
            getAccountSAS({
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
            }).then(sas => `https://${accountName}.blob.core.windows.net/${containerName}/${blobName}${sas.sas}`)
        );
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

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new
     * resource to be created.  If not supplied, the location of the Container's ResourceGroup will be
     * used.
     */
    location?: pulumi.Input<string>;
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
export interface QueueHostSettings extends appservice.HostSettings {
    extensions?: {
        queues: {
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
    }    
}

/**
 * Signature of the callback that can receive queue notifications.
 */
export type QueueCallback = appservice.Callback<QueueContext, Buffer, void>;

export type QueueEventSubscriptionArgs = util.Overwrite<appservice.CallbackFunctionAppArgs<QueueContext, Buffer, void>, {
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
     * Specifies the supported Azure location where the resource exists. Changing this forces a new
     * resource to be created.  If not supplied, the location of the Queue's ResourceGroup will be
     * used.
     */
    location?: pulumi.Input<string>;

    /** 
     * Host settings specific to the Storage Queue plugin. These values can be provided here, or defaults will 
     * be used in their place. 
     */
    hostSettings?: QueueHostSettings;
}>;

declare module "./queue" {
    interface Queue {
        /**
         * Creates a new subscription to the given queue using the callback provided, along with
         * optional options to control the behavior of the subscription.
         */
        onEvent(
            name: string, args: QueueCallback | QueueEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): QueueEventSubscription;
    }
}

Queue.prototype.onEvent = function(this: Queue, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <QueueEventSubscriptionArgs>{ callback: args }
        : args;

    return new QueueEventSubscription(name, this, functionArgs, opts);
}

export class QueueEventSubscription extends appservice.EventSubscription<QueueContext, Buffer, void> {
    constructor(
        name: string, queue: Queue,
        args: QueueEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: queue, ...opts };

        const { resourceGroupName, location } = appservice.getResourceGroupNameAndLocation(args, queue.resourceGroupName);

        // The queue binding does not store the storage connection string directly.  Instead, the
        // connection string is put into the app settings (under whatever key we want). Then, the
        // .connection property of the binding contains the *name* of that app setting key.
        const bindingConnectionKey = "BindingConnectionAppSettingsKey";

        const bindings: QueueBindingDefinition[] = [{
            name: "queue",
            type: "queueTrigger",
            direction: "in",
            dataType: "binary",
            queueName: queue.name,
            connection: bindingConnectionKey,
        }];

        // Place the mapping from the well known key name to the storage account connection string in
        // the 'app settings' object.
        const appSettingsOutput = args.appSettings || pulumi.output({});

        // Place the mapping from the well known key name to the storage account connection string in
        // the 'app settings' object.
        const account = pulumi.all([resourceGroupName, queue.storageAccountName])
                                .apply(([resourceGroupName, storageAccountName]) =>
                                storage.getAccount({ resourceGroupName, name: storageAccountName }));

        const appSettings = pulumi.all([args.appSettings, account.primaryConnectionString]).apply(
            ([appSettings, connectionString]) => ({ ...appSettings, [bindingConnectionKey]: connectionString }));

        super("azure:storage:QueueEventSubscription", name, bindings, {
            ...args,
            resourceGroupName,
            location,
            appSettings,
        }, opts);

        this.registerOutputs();
    }
}
