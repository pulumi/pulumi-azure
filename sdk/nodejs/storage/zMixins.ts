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
import { Queue } from "./queue";
import { Table } from "./table";

import * as appservice from "../appservice";
import * as core from "../core";
import * as storage from "../storage";

/**
 * Produce a URL with read-only access to a Storage Blob with a Shared Access Signature (SAS).
 * @param blob Blob to construct URL for.
 * @param account Storage account.
 */
export function signedBlobReadUrl(blob: Blob, account: Account): pulumi.Output<string> {

    // Choose a fixed, far-future expiration date for signed blob URLs. The shared access signature
    // (SAS) we generate for the Azure storage blob must remain valid for as long as the Function
    // App is deployed, since new instances will download the code on startup. By using a fixed
    // date, rather than (e.g.) "today plus ten years", the signing operation is idempotent.
    const signatureExpiration = "2100-01-01";

    return pulumi.all([account.name, account.primaryConnectionString, blob.storageContainerName, blob.name]).apply(
        async ([accountName, connectionString, containerName, blobName]) => {
            const sas = await storage.getAccountBlobContainerSAS({
                connectionString,
                containerName,
                start: "2019-01-01",
                expiry: signatureExpiration,
                permissions: {
                    read: true,
                    write: false,
                    delete: false,
                    list: false,
                    add: false,
                    create: false,
                },
            }, { async: true });

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
export interface BlobContext extends appservice.Context<appservice.FunctionDefaultResponse> {
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
export type BlobCallback = appservice.Callback<BlobContext, Buffer, appservice.FunctionDefaultResponse>;

export interface GetBlobFunctionArgs extends appservice.CallbackFunctionArgs<BlobContext, Buffer, appservice.FunctionDefaultResponse> {
    /**
     * An optional prefix or suffix to filter down notifications.  See
     * https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-storage-blob#trigger---blob-name-patterns
     * for more details.
     */
    filterPrefix?: pulumi.Input<string>;
    filterSuffix?: pulumi.Input<string>;
}

export interface BlobFunctionArgs extends GetBlobFunctionArgs {
    /**
     * Storage Blob Container to subscribe for events of.
     */
    container: Container;
}

export interface BlobEventSubscriptionArgs extends GetBlobFunctionArgs,
    appservice.CallbackFunctionAppArgs<BlobContext, Buffer, appservice.FunctionDefaultResponse> {
    /**
     * The name of the resource group in which to create the event subscription. [resourceGroup] takes precedence over [resourceGroupName].
     * If none of the two is supplied, the resource group of the Storage Account will be used.
     */
    resourceGroupName?: pulumi.Input<string>;
}

declare module "./container" {
    interface Container {
        /**
         * Creates a new subscription to events fired from this Container to the handler provided, along
         * with options to control the behavior of the subscription.
         * A dedicated Function App is created behind the scenes with a single Azure Function in it.
         * Use [getEventFunction] if you want to compose multiple Functions into the same App manually.
         */
        onBlobEvent(name: string,
                    args: BlobCallback | BlobEventSubscriptionArgs,
                    opts?: pulumi.ComponentResourceOptions): BlobEventSubscription;

        /**
         * Creates a new Function triggered by events in the given Container using the callback provided.
         * [getEventFunction] creates no Azure resources automatically: the returned Function should be used as part of
         * a [MultiCallbackFunctionApp]. Use [onEvent] if you want to create a Function App with a single Function.
         */
        getEventFunction(name: string, args: BlobCallback | GetBlobFunctionArgs): BlobFunction;

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

Container.prototype.getEventFunction = function(this: Container, name, args) {
    const functionArgs = args instanceof Function
        ? { callback: args, container: this }
        : { ...args, container: this };

    return new BlobFunction(name, functionArgs);
}

export class BlobEventSubscription extends appservice.EventSubscription<BlobContext, Buffer, appservice.FunctionDefaultResponse> {
    constructor(
        name: string, container: storage.Container,
        args: BlobEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        const resourceGroupName = resolveResourceGroupNameOfStorageAccount(container);

        super("azure:storage:BlobEventSubscription",
            name,
            new BlobFunction(name, { ...args, container }),
            { ...args, resourceGroupName },
            { parent: container, ...opts });

        this.registerOutputs();
    }
}

/**
 * Azure Function triggered by changes in a Storage Blob Container.
 */
export class BlobFunction extends appservice.Function<BlobContext, Buffer, appservice.FunctionDefaultResponse> {
    constructor(name: string, args: BlobFunctionArgs) {
        const { connectionKey, settings } = resolveAccount(args.container);

        const prefix = args.filterPrefix || "";
        const suffix = args.filterSuffix || "";
        const path = pulumi.interpolate`${args.container.name}/${prefix}{blobName}${suffix}`;

        const trigger: BlobTriggerDefinition = {
            path,
            name: "blob",
            type: "blobTrigger",
            direction: "in",
            dataType: "binary",
            connection: connectionKey,
        };

        super(name, trigger, args, settings);
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
     * How we want the message represented when passed into the callback. 'binary' passes messages as a Buffer,
     * while 'string' passes either a string, or a parsed object if the string is a valid JSON literal.
     */
    dataType: "binary" | "string";
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
export interface QueueContext extends appservice.Context<appservice.FunctionDefaultResponse> {
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
    };
}

/**
 * Signature of the callback that can receive queue notifications.
 */
export type QueueCallback = appservice.Callback<QueueContext, any, appservice.FunctionDefaultResponse>;

export interface QueueFunctionArgs extends appservice.CallbackFunctionArgs<QueueContext, any, appservice.FunctionDefaultResponse> {
    /**
     * Defines the queue to trigger the function.
     */
    queue: Queue;

    /**
     * Specify 'string' to get messages as a string, or a parsed object if the message is a valid JSON literal.
     * Specify 'binary' for all data to be passed in as a Buffer.
     * Default is 'string'.
     */
    dataType?: "binary" | "string";
}

export interface QueueEventSubscriptionArgs extends appservice.CallbackFunctionAppArgs<QueueContext, any, appservice.FunctionDefaultResponse> {
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

    /**
     * Specify 'string' to get messages as a string, or a parsed object if the message is a valid JSON literal.
     * Specify 'binary' for all data to be passed in as a Buffer.
     * Default is 'string'.
     */
    dataType?: "binary" | "string";
};

declare module "./queue" {
    interface Queue {
        /**
         * Creates a new subscription to the given queue using the callback provided, along with
         * optional options to control the behavior of the subscription.
         * A dedicated Function App is created behind the scenes with a single Azure Function in it.
         * Use [getEventFunction] if you want to compose multiple Functions into the same App manually.
         */
        onEvent(name: string,
                args: QueueCallback | QueueEventSubscriptionArgs,
                opts?: pulumi.ComponentResourceOptions): QueueEventSubscription;

        /**
         * Creates a new Function triggered by messages in the given queue using the callback provided.
         * [getEventFunction] creates no Azure resources automatically: the returned Function should be used as part of
         * a [MultiCallbackFunctionApp]. Use [onEvent] if you want to create a Function App with a single Function.
         */
        getEventFunction(name: string, args: QueueCallback | appservice.CallbackFunctionArgs<QueueContext, any, appservice.FunctionDefaultResponse>): QueueFunction;

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

Queue.prototype.getEventFunction = function(this: Queue, name, args) {
    const functionArgs = args instanceof Function
        ? { callback: args, queue: this }
        : { ...args, queue: this };

    return new QueueFunction(name, functionArgs);
}

export class QueueEventSubscription extends appservice.EventSubscription<QueueContext, any, appservice.FunctionDefaultResponse> {
    constructor(
        name: string, queue: Queue,
        args: QueueEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: queue, ...opts };

        const resourceGroupName = resolveResourceGroupNameOfStorageAccount(queue)

        super("azure:storage:QueueEventSubscription", name, new QueueFunction(name, { ...args, queue }), {
            ...args,
            resourceGroupName,
        }, opts);

        this.registerOutputs();
    }
}

// Given a Queue or a Table, resolve the resource group name of the corresponding storage account
function resolveResourceGroupNameOfStorageAccount(container: { storageAccountName: pulumi.Output<string | undefined>, id: pulumi.Output<string> }) {
    const account = pulumi.all([container.id, container.storageAccountName]).apply(([_, storageAccountName]) => {
        // In upstream v4, storageAccountName is always set.
        // https://github.com/hashicorp/terraform-provider-azurerm/pull/27733/files#diff-e1f645d5290fdcc40b01762eb09185c901d0d62b39198a42b8492d7ea697ea82R398
        if (storageAccountName === undefined) {
            throw new Error("Storage account name not defined, but should always be populated. Please report this issue to github.com/pulumi/pulumi-azure");
        }
        return storage.getAccount({ name: storageAccountName! });
    });
    return account.resourceGroupName!.apply(n => n!);
}

// Given a Queue or a Table, produce Settings and a Connection String Key relevant to the Storage Account
function resolveAccount(container: { storageAccountName: pulumi.Output<string | undefined>, id: pulumi.Output<string> }) {
    const connectionKey = pulumi.interpolate`Storage${container.storageAccountName}ConnectionStringKey`;
    const account = pulumi.all([container.id, container.storageAccountName]).apply(([_, storageAccountName]) => {
        // In upstream v4, storageAccountName is always set.
        // https://github.com/hashicorp/terraform-provider-azurerm/pull/27733/files#diff-e1f645d5290fdcc40b01762eb09185c901d0d62b39198a42b8492d7ea697ea82R398
        if (storageAccountName === undefined) {
            throw new Error("Storage account name not defined, but should always be populated. Please report this issue to github.com/pulumi/pulumi-azure");
        }
        return storage.getAccount({ name: storageAccountName! });
    });
    const settings = pulumi.all([account.primaryConnectionString, connectionKey]).apply(
        ([connectionString, key]) => ({ [key]: connectionString }));

    return { connectionKey, settings };
}

/**
 * Azure Function triggered by a Storage Queue.
 */
export class QueueFunction extends appservice.Function<QueueContext, any, appservice.FunctionDefaultResponse> {
    constructor(name: string, args: QueueFunctionArgs) {
        const { connectionKey, settings } = resolveAccount(args.queue);

        const trigger: QueueTriggerBindingDefinition = {
            name: "queue",
            type: "queueTrigger",
            direction: "in",
            dataType: args.dataType || "string",
            queueName: args.queue.name,
            connection: connectionKey,
        };

        super(name, trigger, args, settings);
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
