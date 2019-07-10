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
import { Table } from "./table";
import { ZipBlob } from "./zipBlob";

import * as appservice from "../appservice";
import * as core from "../core";
import * as storage from "../storage";

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
     * The path to the blob we want to create a trigger for.
     */
    path: pulumi.Input<string>;

    /**
     * The storage connection string for the storage account containing the blob.
     */
    connection: pulumi.Input<string>;

    /**
     * How we want the blob represented when passed into the callback.  We specify 'binary'
     * so that all data is passed in as a buffer.  Otherwise, Azure will attempt to sniff
     * the content and convert it accordingly.  This gives us a consistent way to know what
     * data will be passed into the function.
     */
    dataType: "binary";
}

interface BlobTriggerDefinition extends BlobBindingDefinition {
    /**
     * The type of a blob binding.  Must be 'blobTrigger'.
     */
    type: "blobTrigger";

    /**
     * The direction of the binding.  We only 'support' blobs being inputs to functions.
     */
    direction: "in";
}

export interface BlobInputBindingDefinition extends BlobBindingDefinition {
    /**
     * The type of a blob binding. Must be 'blob'.
     */
    type: "blob";

    /**
     * The direction of the binding. Must be set to 'in' for an input binding.
     */
    direction: "in";
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
        blobName: string,
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

export interface BlobFunctionArgs extends appservice.CallbackArgs<BlobContext, Buffer, void>,
                                          appservice.InputOutputsArgs {
    /**
     * Storage Blob Container to subscribe for events of.
     */
    container: Container;

    /**
     * An optional prefix or suffix to filter down notifications.  See
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-storage-blob#trigger---blob-name-patterns
     * for more details.
     */
    filterPrefix?: pulumi.Input<string>;
    filterSuffix?: pulumi.Input<string>;
};

export interface BlobEventSubscriptionArgs extends appservice.CallbackFunctionAppArgs<BlobContext, Buffer, void>,
                                                   appservice.InputOutputsArgs {
    /**
     * The name of the resource group in which to create the event subscription. [resourceGroup] takes precedence
     * over [resourceGroupName]. If none of the two is supplied, the resource group of the Storage Account will be used.
     */
    resourceGroupName?: pulumi.Input<string>;

    /**
     * An optional prefix or suffix to filter down notifications.  See
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-storage-blob#trigger---blob-name-patterns
     * for more details.
     */
    filterPrefix?: pulumi.Input<string>;
    filterSuffix?: pulumi.Input<string>;
};

declare module "./container" {
    interface Container {
        /**
         * Creates a new subscription to events fired from this Topic to the handler provided, along
         * with options to control the behavior of the subscription.
         */
        onBlobEvent(name: string,
                    args: BlobCallback | BlobEventSubscriptionArgs,
                    opts?: pulumi.ComponentResourceOptions): BlobEventSubscription;

        /**
         * Creates an input binding linked to the given Blob Container to be used for an Azure Function.
         */
        input(name: string, args: BlobInputBindingArgs): appservice.InputBindingSettings;
    }
}

Container.prototype.onBlobEvent = function(this: Container, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <BlobEventSubscriptionArgs>{ callback: args }
        : args;

    return new BlobEventSubscription(name, this, functionArgs, opts);
};

Container.prototype.input = function(this: Container, name, args) {
    return new BlobInputBinding(name, this, args);
};

export class BlobEventSubscription extends appservice.EventSubscription<BlobContext, Buffer, void> {
    constructor(
        name: string, container: storage.Container,
        args: BlobEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {
        const { resourceGroupName, location } =
            appservice.getResourceGroupNameAndLocation(args, container.resourceGroupName);

        super("azure:storage:BlobEventSubscription",
            name,
            new BlobFunction(name, { ...args, container }),
            { ...args, resourceGroupName, location },
            { parent: container, ...opts });

        this.registerOutputs();
    }
}

/**
 * Azure Function triggered by changes in a Storage Blob Container.
 */
export class BlobFunction extends appservice.Function<BlobContext, Buffer, void> {
    constructor(name: string, args: BlobFunctionArgs) {
        const { connectionKey, settings } = resolveAccount(args.container);

        const prefix = args.filterPrefix || "";
        const suffix = args.filterSuffix || "";
        const path = pulumi.interpolate`${args.container.name}/${prefix}{blobName}${suffix}`;

        const binding: BlobTriggerDefinition = {
            path,
            name: "blob",
            type: "blobTrigger",
            direction: "in",
            dataType: "binary",
            connection: connectionKey,
        };

        const { bindings, appSettings } =
            appservice.combineBindingSettings({binding, settings}, args.inputs, args.outputs);

        super(name, bindings, args, appSettings);
    }
}

export interface BlobInputBindingArgs {
    /**
     * Blob name to retrieve. May contain a binding expression to bind to a value from a trigger.
     */
    readonly blobName: pulumi.Input<string>;
}

export class BlobInputBinding implements appservice.InputBindingSettings {
    public readonly binding: pulumi.Input<BlobInputBindingDefinition>;
    public readonly settings: pulumi.Input<{ [key: string]: any; }>;

    constructor(name: string, container: Container, args: BlobInputBindingArgs) {
        const { connectionKey, settings } = resolveAccount(container);

        const path = pulumi.interpolate`${container.name}/${args.blobName}`;

        this.binding = {
            name,
            type: "blob",
            direction: "in",
            dataType: "binary",
            path,
            connection: connectionKey,
        };
        this.settings = settings;
    }
}

// NOTE
// We do not support BlobOutputBinding, because its current implementation in Azure Functions at Node.js is not great.
// Basically, it's not possible to control the exact content and metadata of the output blob:
// - https://github.com/Azure/azure-functions-host/issues/4608
// - https://github.com/Azure/azure-functions-host/issues/364


interface QueueBindingDefinition extends appservice.BindingDefinition {
    /**
     * The name of the property in the context object to bind the actual queue message to. Not really
     * important in our implementation as the queue message will be passed as the second argument to
     * the callback function.
     */
    name: string;

    /**
     * The name of the storage queue to listen to.
     */
    queueName: pulumi.Input<string>;

    /**
     * The storage connection string for the storage account containing the queue.
     */
    connection: pulumi.Input<string>;
}

interface QueueTriggerBindingDefinition extends QueueBindingDefinition {
    /**
     * The type of a queue binding.  Must be 'queueTrigger'.
     */
    type: "queueTrigger";

    /**
     * The direction of the binding.  Trigger is about messages being inputs to functions.
     */
    direction: "in";

    /**
     * How we want the message represented when passed into the callback.  We specify 'binary'
     * so that all data is passed in as a buffer.  Otherwise, Azure will attempt to sniff
     * the content and convert it accordingly. This gives us a consistent way to know what
     * data will be passed into the function.
     */
    dataType: "binary";
}

interface QueueOutputBindingDefinition extends QueueBindingDefinition {
    /**
     * The type of a queue binding.  Must be 'queue'.
     */
    type: "queue";

    /**
     * The direction of the binding. Output bindings must have 'out'.
     */
    direction: "out";
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
 * For more details see
 * https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-storage-queue#host-json
 */
export interface QueueHostExtensions {
    /** The maximum interval between queue polls. Minimum is 00:00:00.100 (100 ms). */
    maxPollingInterval?: string;

    /** The time interval between retries when processing of a message fails. */
    visibilityTimeout?: string;

    /** The number of queue messages that the Functions runtime retrieves simultaneously and processes in parallel. */
    batchSize?: number;

    /** The number of times to try processing a message before moving it to the poison queue. */
    maxDequeueCount?: number;

    /**
     * Whenever the number of messages being processed concurrently gets down to this number, the runtime
     * retrieves another batch.
     */
    newBatchThreshold?: number;
}
export interface QueueHostSettings extends appservice.HostSettings {
    extensions?: {
        queues: QueueHostExtensions,
    }
}

/**
 * Signature of the callback that can receive queue notifications.
 */
export type QueueCallback = appservice.Callback<QueueContext, Buffer, appservice.FunctionDefaultResponse>;

export interface QueueFunctionArgs extends appservice.CallbackArgs<QueueContext, Buffer, appservice.FunctionDefaultResponse>,
                                           appservice.InputOutputsArgs {
    /**
     * Defines the queue to trigger the function.
     */
    queue: Queue;
};

export interface QueueEventSubscriptionArgs extends appservice.CallbackFunctionAppArgs<QueueContext, Buffer, appservice.FunctionDefaultResponse>,
                                                    appservice.InputOutputsArgs {
    /**
     * The resource group in which to create the event subscription.  If not supplied, the
     * Queue's resource group will be used.
     */
    resourceGroup?: core.ResourceGroup;

    /**
     * The name of the resource group in which to create the event subscription. [resourceGroup] takes precedence
     * over [resourceGroupName]. If none of the two is supplied, the resource group of the Storage Account will be used.
     */
    resourceGroupName?: pulumi.Input<string>;

    /**
     * Host settings specific to the Storage Queue plugin. These values can be provided here, or defaults will
     * be used in their place.
     */
    hostSettings?: QueueHostSettings;
};

declare module "./queue" {
    interface Queue {
        /**
         * Creates a new subscription to the given queue using the callback provided, along with
         * optional options to control the behavior of the subscription.
         */
        onEvent(name: string,
                args: QueueCallback | QueueEventSubscriptionArgs,
                opts?: pulumi.ComponentResourceOptions): QueueEventSubscription;

        /**
         * Creates an output binding linked to the given queue to be used for an Azure Function.
         */
        output(name: string): appservice.OutputBindingSettings;
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

export class QueueEventSubscription extends appservice.EventSubscription<QueueContext, Buffer, appservice.FunctionDefaultResponse> {
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

// Given a Queue or a Table, produce App Settings and a Connection String Key relevant to the Storage Account
function resolveAccount(container: { storageAccountName: pulumi.Output<string>, resourceGroupName: pulumi.Output<string> }) {
    const connectionKey = pulumi.interpolate`Storage${container.storageAccountName}ConnectionStringKey`;
    const account = pulumi.all([container.resourceGroupName, container.storageAccountName])
                        .apply(([resourceGroupName, storageAccountName]) =>
                            storage.getAccount({ resourceGroupName, name: storageAccountName }));

    const settings = pulumi.all([account.primaryConnectionString, connectionKey]).apply(
        ([connectionString, key]) => ({ [key]: connectionString }));

    return { connectionKey, settings };
}

/**
 * Azure Function triggered by a Storage Queue.
 */
export class QueueFunction extends appservice.Function<QueueContext, Buffer, appservice.FunctionDefaultResponse> {
    constructor(name: string, args: QueueFunctionArgs) {
        const { connectionKey, settings } = resolveAccount(args.queue);

        const binding: QueueTriggerBindingDefinition = {
            name: "queue",
            type: "queueTrigger",
            direction: "in",
            dataType: "binary",
            queueName: args.queue.name,
            connection: connectionKey,
        };

        const { bindings, appSettings } =
            appservice.combineBindingSettings({binding, settings}, args.inputs, args.outputs);

        super(name, bindings, args, appSettings);
    }
}

/**
 * Azure Function's output binding that sends messages to a Storage Queue.
 */
export class QueueOutputBinding implements appservice.OutputBindingSettings {
    public readonly binding: pulumi.Input<QueueOutputBindingDefinition>;
    public readonly settings: pulumi.Input<{ [key: string]: any; }>;

    constructor(name: string, queue: Queue) {
        const { connectionKey, settings } = resolveAccount(queue);

        this.binding = {
            name,
            type: "queue",
            direction: "out",
            queueName: queue.name,
            connection: connectionKey,
        };
        this.settings = settings;
    }
}

interface TableBindingDefinition extends appservice.BindingDefinition {
    /**
     * The name of the property in the context object to bind the actual table rows to.
     */
    name: string;

    /**
     * The type of a table binding.  Must be 'table'.
     */
    type: "table";

    /**
     * The name of the table.
     */
    tableName: pulumi.Input<string>;

    /**
     * The storage connection string for the storage account containing the blob.
     */
    connection: pulumi.Input<string>;

    /**
     * The partition key of the table entity.
     */
    partitionKey?: string;

    /**
     * The row key of the table entity.
     */
    rowKey?: string;
}

interface TableInputBindingDefinition extends TableBindingDefinition {
    /**
     * The direction of the binding. Must be 'in' for an input binding.
     */
    direction: "in";

    /**
     * An OData filter expression for table input.
     */
    filter?: pulumi.Input<string>;

    /**
     * The maximum number of entities to read.
     */
    take?: pulumi.Input<number>;
}

interface TableOutputBindingDefinition extends TableBindingDefinition {
    /**
     * The direction of the binding. Must be 'out' for an output binding.
     */
    direction: "out";
}

export interface TableInputBindingArgs {
    /**
     * The partition key of the table entity.
     */
    partitionKey?: string;

    /**
     * The row key of the table entity.
     */
    rowKey?: string;

    /**
     * An OData filter expression for table input.
     */
    filter?: pulumi.Input<string>;

    /**
     * The maximum number of entities to read.
     */
    take?: pulumi.Input<number>;
}

export class TableInputBinding implements appservice.InputBindingSettings {
    public readonly binding: pulumi.Input<TableInputBindingDefinition>;
    public readonly settings: pulumi.Input<{ [key: string]: any; }>;

    constructor(name: string, table: Table, args?: TableInputBindingArgs) {
        const { connectionKey, settings } = resolveAccount(table);

        this.binding = {
            name,
            type: "table",
            direction: "in",
            tableName: table.name,
            connection: connectionKey,
            ...args,
        };
        this.settings = settings;
    }
}

export class TableOutputBinding implements appservice.OutputBindingSettings {
    public readonly binding: pulumi.Input<TableOutputBindingDefinition>;
    public readonly settings: pulumi.Input<{ [key: string]: any; }>;

    constructor(name: string, table: Table) {
        const { connectionKey, settings } = resolveAccount(table);

        this.binding = {
            name,
            type: "table",
            direction: "out",
            tableName: table.name,
            connection: connectionKey,
        };
        this.settings = settings;
    }
}

declare module "./table" {
    interface Table {
        /**
         * Creates an input binding linked to the given table to be used for an Azure Function.
         */
        input(name: string, args?: TableInputBindingArgs): appservice.InputBindingSettings;

        /**
         * Creates an output binding linked to the given table to be used for an Azure Function.
         */
        output(name: string): appservice.OutputBindingSettings;
    }
}

Table.prototype.input = function(this: Table, name, args) {
    return new TableInputBinding(name, this, args);
};

Table.prototype.output = function(this: Table, name) {
    return new TableOutputBinding(name, this);
};
