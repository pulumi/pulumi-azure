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
import { getServiceBusNamespace, Queue, Subscription, Topic } from ".";
import { EventHub, EventHubConsumerGroup, getEventhubNamespace } from ".";

import * as eventgrid from "azure-eventgrid/lib/models";
import * as appservice from "../appservice";
import { ResourceGroup } from "../core";
import { Account } from "../storage";
import { EventGridEventSubscription } from "./eventGridEventSubscription";

interface ServiceBusBindingDefinition extends appservice.BindingDefinition {
    /**
     * The name of the property in the context object to bind the actual ServiceBus message to.
     */
    name: string;

    /**
     * The type of a topic binding.  Must be 'serviceBusTrigger'.
     */
    type: "serviceBusTrigger";

    /**
     * The direction of the binding.  We only support queues and topics being inputs to functions.
     */
    direction: "in";

    /**
     * Name of the queue to monitor. Set only if monitoring a queue, not for a topic.
     */
    queueName?: pulumi.Input<string>;

    /**
     * Name of the topic to monitor. Set only if monitoring a topic, not for a queue.
     */
    topicName?: pulumi.Input<string>;

    /**
     * Name of the subscription to monitor. Set only if monitoring a topic, not for a queue.
     */
    subscriptionName?: pulumi.Input<string>;

    /**
     * The name of an app setting that contains the Service Bus connection string to use for this binding.
     */
    connection: pulumi.Input<string>;
}

/**
 * Data that will be passed along in the context object to the ServiceBusCallback.
 */
export interface ServiceBusContext extends appservice.Context<appservice.FunctionDefaultResponse> {
    invocationId: string;
    executionContext: {
        invocationId: string;
        functionName: string;
        functionDirectory: string;
    };
    bindings: { message: string };
    bindingData: {
        deadLetterSource: any;
        messageId: string;
        contentType: string;
        replyTo: any;
        to: any;
        label: any;
        correlationId: any,
        properties: Record<string, any>;
        message: string,
        sys: {
            methodName: string;
            utcNow: string;
        },
        invocationId: string;
    };
}

/**
 * Host settings specific to the Service Bus Queue/Topic/Subscription plugin.
 *
 * For more details see https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-service-bus#host-json
 */
export interface ServiceBusHostExtensions extends appservice.HostSettings {
    /** The default PrefetchCount that will be used by the underlying MessageReceiver. */
    prefetchCount?: number,

    messageHandlerOptions?: {
        /** Whether the trigger should immediately mark as complete (autocomplete) or wait for processing to call complete. */
        autoComplete?: boolean,

        /** The maximum number of concurrent calls to the callback that the message pump should initiate.
         * By default, the Functions runtime processes multiple messages concurrently. To direct the runtime to process only
         * a single queue or topic message at a time, set maxConcurrentCalls to 1.
         */
        maxConcurrentCalls?: number,

        /** The maximum duration within which the message lock will be renewed automatically. */
        maxAutoRenewDuration?: string,
    },
}
export interface ServiceBusHostSettings extends appservice.HostSettings {
    extensions?: {
        serviceBus: ServiceBusHostExtensions,
    }
}

/**
 * Signature of the callback that can receive queue and topic notifications.
 */
export type ServiceBusCallback = appservice.Callback<ServiceBusContext, string, appservice.FunctionDefaultResponse>;

export interface ServiceBusFunctionArgs extends appservice.CallbackFunctionArgs<ServiceBusContext, string, appservice.FunctionDefaultResponse> {
    /**
     * The ServiceBus Queue to subscribe to.
     */
    queue?: Queue;

    /**
     * The ServiceBus Topic to subscribe to.
     */
    topic?: Topic;

    /**
     * The ServiceBus Subscription to subscribe the Function to.
     */
    subscription?: Subscription;
};

export interface QueueEventSubscriptionArgs extends appservice.CallbackFunctionAppArgs<ServiceBusContext, string, appservice.FunctionDefaultResponse> {
    /**
     * The name of the resource group in which to create the event subscription. [resourceGroup] takes precedence over [resourceGroupName].
     * If none of the two is supplied, the Queue's resource group will be used.
     */
    resourceGroupName?: pulumi.Input<string>;

    /**
     * Host settings specific to the Service Bus Topic/Subscription plugin. These values can be provided here, or defaults will
     * be used in their place.
     */
    hostSettings?: ServiceBusHostSettings;
};

declare module "./queue" {
    interface Queue {
        /**
         * Creates a new subscription to events fired from this Queue to the handler provided, along
         * with options to control the behavior of the subscription.
         */
        onEvent(
            name: string, args: ServiceBusCallback | QueueEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): QueueEventSubscription;
    }
}

Queue.prototype.onEvent = function(this: Queue, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <QueueEventSubscriptionArgs>{ callback: args }
        : args;

    return new QueueEventSubscription(name, this, functionArgs, opts);
}

export class QueueEventSubscription extends appservice.EventSubscription<ServiceBusContext, string, appservice.FunctionDefaultResponse> {
    readonly queue: Queue;

    constructor(
        name: string, queue: Queue,
        args: QueueEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {
        const { resourceGroupName, location } = appservice.getResourceGroupNameAndLocation(args, queue.resourceGroupName);

        super("azure:eventhub:QueueEventSubscription",
            name,
            new ServiceBusFunction(name, { ...args, queue }),
            { ...args, resourceGroupName, location },
            { parent: queue, ...opts });

        this.queue = queue;
        this.registerOutputs();
    }
}

export interface TopicEventSubscriptionArgs extends QueueEventSubscriptionArgs {
    /**
     * The Subscription to subscribe the FunctionApp to.  If not present, a new Subscription
     * resource will be created.
     */
    subscription?: Subscription;

    /**
     * The maximum number of deliveries.  Will default to 10 if not specified.
     */
    maxDeliveryCount?: pulumi.Input<number>;
};

declare module "./topic" {
    interface Topic {
        /**
         * Creates a new subscription to events fired from this Topic to the handler provided, along
         * with options to control the behavior of the subscription.
         */
        onEvent(
            name: string, args: ServiceBusCallback | TopicEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): TopicEventSubscription;
    }
}

Topic.prototype.onEvent = function(this: Topic, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <TopicEventSubscriptionArgs>{ callback: args }
        : args;

    return new TopicEventSubscription(name, this, functionArgs, opts);
}

export class TopicEventSubscription extends appservice.EventSubscription<ServiceBusContext, string, appservice.FunctionDefaultResponse> {
    readonly topic: Topic;
    readonly subscription: Subscription;

    constructor(
        name: string, topic: Topic,
        args: TopicEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: topic, ...opts };

        const { resourceGroupName, location } = appservice.getResourceGroupNameAndLocation(args, topic.resourceGroupName);

        const subscription = args.subscription || new Subscription(name, {
            resourceGroupName,
            namespaceName: topic.namespaceName,
            topicName: topic.name,
            maxDeliveryCount: pulumi.output(args.maxDeliveryCount).apply(c => c === undefined ? 10 : c),
        }, opts);

        super("azure:eventhub:TopicEventSubscription",
            name,
            new ServiceBusFunction(name, { ...args, topic, subscription }),
            { ...args, resourceGroupName, location },
            opts);

        this.topic = topic;
        this.subscription = subscription;

        this.registerOutputs();
    }
}

/**
 * Azure Function triggered by a ServiceBus Topic.
 */
export class ServiceBusFunction extends appservice.Function<ServiceBusContext, string, appservice.FunctionDefaultResponse> {
    constructor(name: string, args: ServiceBusFunctionArgs) {
        if (!args.queue && !args.topic) {
            throw new Error("Either [queue] or [topic] has to be specified");
        }

        if (args.queue && args.topic) {
            throw new Error("Either one of [queue] or [topic] has to be specified, not both");
        }

        if (args.queue && args.subscription) {
            throw new Error("[subscription] can't be specified in combination with [queue]");
        }

        if (args.topic && !args.subscription) {
            throw new Error("[subscription] must be specified in combination with [topic]");
        }

        const namespaceName = (args.queue && args.queue.namespaceName) || args.topic!.namespaceName;
        const resourceGroupName = (args.queue && args.queue.resourceGroupName) || args.topic!.resourceGroupName;

        // The binding does not store the Service Bus connection string directly.  Instead, the
        // connection string is put into the app settings (under whatever key we want). Then, the
        // .connection property of the binding contains the *name* of that app setting key.
        const bindingConnectionKey = pulumi.interpolate`ServiceBus${namespaceName}ConnectionKey`;

        const trigger = {
            name: "message",
            direction: "in",
            type: "serviceBusTrigger",
            queueName: args.queue && args.queue.name,
            topicName: args.topic && args.topic.name,
            subscriptionName: args.subscription && args.subscription.name,
            connection: bindingConnectionKey,
        } as ServiceBusBindingDefinition;

        const namespace = pulumi.all([namespaceName, resourceGroupName])
                               .apply(([namespaceName, resourceGroupName]) =>
                                    getServiceBusNamespace({ name: namespaceName, resourceGroupName }));

        const appSettings = pulumi.all([namespace.defaultPrimaryConnectionString, bindingConnectionKey]).apply(
            ([connectionString, key]) => ({ [key]: connectionString }));

        super(name, trigger, args, appSettings);
    }
}

/** @internal */
/** This is only exported to be used internally by the /iot/zMixins.ts file */
export interface EventHubBindingDefinition extends appservice.BindingDefinition {
    /**
     * The name of the property in the context object to bind the actual event to.
     */
    name: string;

    /**
     * The type of an event hub binding.  Must be 'eventHubTrigger'.
     */
    type: "eventHubTrigger";

    /**
     * The direction of the binding.  We only support events being inputs to functions.
     */
    direction: "in";

    /**
     * The name of the event hub we are subscribing to.
     */
    eventHubName: pulumi.Input<string>;

    /**
     * An optional property that sets the consumer group used to subscribe to events in the hub.
     * If not present, a new Consumer Group resource will be created.
     */
    consumerGroup?: pulumi.Input<string>;

    /**
     * Set to 'many' in order to enable batching. If omitted or set to 'one', single message passed to function.
     */
    cardinality?: pulumi.Input<"many" | "one">;

    /**
     * The name of an app setting that contains the Event Hub connection string to use for this binding.
     */
    connection: pulumi.Input<string>;
}

/**
 * Data that will be passed along in the context object to the EventHubCallback.
 */
export interface EventHubContext extends appservice.Context<appservice.FunctionDefaultResponse> {
    invocationId: string;
    executionContext: {
        invocationId: string;
        functionName: string;
        functionDirectory: string;
    };
    bindings: { eventHub: string };
    bindingData: {
        partitionContext: {
            consumerGroupName: string;
            eventHubPath: string;
            partitionId: string;
            owner: string;
            runtimeInformation: {
                partitionId: string;
                lastSequenceNumber: number;
                lastEnqueuedTimeUtc: string;
                retrievalTime: string;
            };
        },
        partitionKey: string;
        offset: number,
        sequenceNumber: number;
        enqueuedTimeUtc: string;
        properties: Record<string, any>;
        systemProperties: Record<string, any>;
        sys: {
            methodName: string;
            utcNow: string;
        },
        invocationId: string;
    };
}

/**
 * Signature of the callback that can receive event hub notifications.
 */
export type EventHubCallback = appservice.Callback<EventHubContext, string, appservice.FunctionDefaultResponse>;

export interface EventHubFunctionArgs extends appservice.CallbackFunctionArgs<EventHubContext, any, appservice.FunctionDefaultResponse> {
    /**
     * Event Hub to subscribe the Function to.
     */
    eventHub: EventHub;

    /**
     * Optional Consumer Group to subscribe the FunctionApp to. If not present, the default consumer group will be used.
     */
    consumerGroup?: EventHubConsumerGroup;

    /**
     * Set to 'many' in order to enable batching. If omitted or set to 'one', single message passed to function.
     */
    cardinality?: pulumi.Input<"many" | "one">;
};

export interface EventHubSubscriptionArgs extends appservice.CallbackFunctionAppArgs<EventHubContext, any, appservice.FunctionDefaultResponse> {
    /**
     * The name of the resource group in which to create the event subscription. [resourceGroup] takes precedence over [resourceGroupName].
     * If none of the two is supplied, the Event Hub's resource group will be used.
     */
    resourceGroupName?: pulumi.Input<string>;

    /**
     * Optional Consumer Group to subscribe the FunctionApp to. If not present, the default consumer group will be used.
     */
    consumerGroup?: EventHubConsumerGroup;

    /**
     * Set to 'many' in order to enable batching. If omitted or set to 'one', single message passed to function.
     */
    cardinality?: pulumi.Input<"many" | "one">;
};

declare module "./eventHub" {
    interface EventHub {
        /**
         * Subscribes to events logged to this Event Hub to the handler provided, along
         * with options to control the behavior of the subscription.
         */
        onEvent(
            name: string, args: EventHubCallback | EventHubSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): EventHubSubscription;
    }
}

EventHub.prototype.onEvent = function(this: EventHub, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <EventHubSubscriptionArgs>{ callback: args }
        : args;

    return new EventHubSubscription(name, this, functionArgs, opts);
}

export class EventHubSubscription extends appservice.EventSubscription<EventHubContext, string, appservice.FunctionDefaultResponse> {
    readonly eventHub: EventHub;
    readonly consumerGroup?: EventHubConsumerGroup;

    constructor(
        name: string, eventHub: EventHub,
        args: EventHubSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: eventHub, ...opts };

        const { resourceGroupName, location } = appservice.getResourceGroupNameAndLocation(args, eventHub.resourceGroupName);

        super("azure:eventhub:EventHubSubscription",
            name,
            new EventHubFunction(name, { ...args, eventHub }),
            { ...args, resourceGroupName, location },
            opts);

        this.eventHub = eventHub;
        this.consumerGroup = args.consumerGroup;

        this.registerOutputs();
    }
}

export const DefaultConsumerGroup = "$Default";

/**
 * Azure Function triggered by an Event Hub.
 */
export class EventHubFunction extends appservice.Function<EventHubContext, string, appservice.FunctionDefaultResponse> {
    constructor(name: string, args: EventHubFunctionArgs) {
        // The event hub binding does not store the Event Hubs connection string directly.  Instead, the
        // connection string is put into the app settings (under whatever key we want). Then, the
        // .connection property of the binding contains the *name* of that app setting key.
        const bindingConnectionKey = pulumi.interpolate`EventHub${args.eventHub.namespaceName}ConnectionKey`;

        const trigger = {
            name: "eventHub",
            direction: "in",
            type: "eventHubTrigger",
            eventHubName: args.eventHub.name,
            consumerGroup: args.consumerGroup !== undefined ? args.consumerGroup.name : DefaultConsumerGroup,
            cardinality: args.cardinality,
            connection: bindingConnectionKey,
        } as EventHubBindingDefinition;

        const namespace = pulumi.all([args.eventHub.namespaceName, args.eventHub.resourceGroupName])
                               .apply(([namespaceName, resourceGroupName]) =>
                                    getEventhubNamespace({ name: namespaceName, resourceGroupName }));

        // Place the mapping from the well known key name to the Event Hubs account connection string in
        // the 'app settings' object.
        const appSettings = pulumi.all([namespace.defaultPrimaryConnectionString, bindingConnectionKey]).apply(
            ([connectionString, key]) => ({ [key]: connectionString }));

        super(name, trigger, args, appSettings);
    }
}

interface EventGridBindingDefinition extends appservice.BindingDefinition {
    /**
     * The name of the property in the context object to bind the actual Event Grid message to.
     */
    name: string;

    /**
     * The type of a binding. Must be 'eventGridTrigger'.
     */
    type: "eventGridTrigger";

    /**
     * The direction of the binding.  We only support queues and topics being inputs to functions.
     */
    direction: "in";
}

/**
 * Event that will be passed along to the EventGridCallback.
 */
export interface EventGridEvent<T> extends eventgrid.EventGridEvent {
    data: T;
}

/**
 * Data that will be passed along in the context object to the EventGridCallback.
 */
export interface EventGridContext<T> extends appservice.Context<appservice.FunctionDefaultResponse> {
    invocationId: string;
    executionContext: {
        invocationId: string;
        functionName: string;
        functionDirectory: string;
    };
    bindings: { message: EventGridEvent<T> };
    bindingData: {
        data: T,
        sys: {
            methodName: string;
            utcNow: string;
        },
        invocationId: string;
    };
}

export interface EventGridFunctionArgs<T> extends appservice.CallbackFunctionArgs<EventGridContext<T>, EventGridEvent<T>, appservice.FunctionDefaultResponse> {
}

/**
 * Azure Function triggered by a Event Grid Topic.
 */
export class EventGridFunction<T> extends appservice.Function<EventGridContext<T>, EventGridEvent<T>, appservice.FunctionDefaultResponse> {
    constructor(name: string, args: EventGridFunctionArgs<T>) {
        const trigger = {
            name: "message",
            direction: "in",
            type: "eventGridTrigger",
        } as appservice.InputBindingDefinition;

        super(name, trigger, args);
    }
}

export interface EventGridCallbackSubscriptionArgs<T> extends appservice.CallbackFunctionAppArgs<EventGridContext<T>, EventGridEvent<T>, appservice.FunctionDefaultResponse> {
    /**
     * The name of the resource group in which to create the event subscription. [resourceGroup] takes precedence
     * over [resourceGroupName]. If none of the two is supplied, the Queue's resource group will be used.
     */
    resourceGroupName?: pulumi.Input<string>;

    /**
     * A list of applicable event types that need to be part of the event subscription.
     */
    readonly includedEventTypes?: pulumi.Input<pulumi.Input<string>[]>;

    /**
     * A retry policy block as defined below.
     */
    readonly retryPolicy?: pulumi.Input<{ eventTimeToLive: pulumi.Input<number>, maxDeliveryAttempts: pulumi.Input<number> }>;

    /**
     * A subject filter block as defined below.
     */
    readonly subjectFilter?: pulumi.Input<{ caseSensitive?: pulumi.Input<boolean>, subjectBeginsWith?: pulumi.Input<string>, subjectEndsWith?: pulumi.Input<string> }>;
}

/**
 * Resource properties to scope an Event Grid subscription to. The shape fits most Azure resources,
 * so they can be passed directly.
 */
export interface EventGridScope {
    /**
     * Resource group name to create subscription at, if another resource group is not explicitly
     * passed in subscription arguments.
     */
    resourceGroupName: pulumi.Input<string>;

    /**
     * Azure Resource ID.
     */
    id: pulumi.Input<string>;
}

/**
 * A callback-based subscription to events coming from Event Grid. Creates an Azure Function and
 * an Event Grid Event Subscription with the webhook URL pointing to the Azure Function.
 */
export class EventGridCallbackSubscription<T> extends appservice.EventSubscription<EventGridContext<T>, EventGridEvent<T>, appservice.FunctionDefaultResponse> {
    public readonly subscription: EventGridEventSubscription;

    constructor(name: string,
                scope: EventGridScope,
                args: EventGridCallbackSubscriptionArgs<T>,
                opts: pulumi.ComponentResourceOptions = {}) {

        const { resourceGroupName, location } =
            appservice.getResourceGroupNameAndLocation(args, pulumi.output(scope.resourceGroupName));

        super("azure:eventhub:EventGridCallbackSubscription",
              name,
              new EventGridFunction(name, args),
              { ...args, resourceGroupName, location },
              opts);

        const keys = pulumi.output(this.functionApp.getHostKeys());
        const key = keys.systemKeys["eventgrid_extension"];
        const url = pulumi.interpolate`https://${this.functionApp.defaultHostname}/runtime/webhooks/eventgrid?functionName=${name}&code=${key}`;

        this.subscription = new EventGridEventSubscription(name, {
            webhookEndpoint: { url },
            scope: scope.id,
            ...args,
        }, { ...opts, parent: this });

        this.registerOutputs();
    }
}

export interface StorageAccountEventGridCallbackSubscriptionArgs<T> extends EventGridCallbackSubscriptionArgs<T> {
    /**
     * Storage Account to subscribe to. Event Grid events for this account trigger the callback execution.
     */
    readonly storageAccount: Account;
}

/**
 * Possible types of Event Grid events for a Resource Group.
 */
type ResourceGroupEvent =
    eventgrid.ResourceActionCancelData |
    eventgrid.ResourceActionFailureData |
    eventgrid.ResourceActionSuccessData |
    eventgrid.ResourceDeleteCancelData |
    eventgrid.ResourceDeleteFailureData |
    eventgrid.ResourceDeleteSuccessData |
    eventgrid.ResourceWriteCancelData |
    eventgrid.ResourceWriteFailureData |
    eventgrid.ResourceWriteSuccessData;

export interface ResourceGroupEventGridCallbackSubscriptionArgs extends EventGridCallbackSubscriptionArgs<ResourceGroupEvent> {
    /**
     * Resource Group to subscribe to. Event Grid events for this resource group trigger the callback execution.
     */
    readonly resourceGroup: ResourceGroup;
}

/**
 * Contains hooks to subscribe to different kinds of Event Grid events.
 */
export namespace events {
    /**
     * Creates a new subscription to events fired from Event Grid. The callback is executed whenever
     * a new Blob is created in a container of the Storage Account.
     */
    export function onGridBlobCreated(name: string,
                                      args: StorageAccountEventGridCallbackSubscriptionArgs<eventgrid.StorageBlobCreatedEventData>,
                                      opts?: pulumi.ComponentResourceOptions): EventGridCallbackSubscription<eventgrid.StorageBlobCreatedEventData> {
        return new EventGridCallbackSubscription(
            name, args.storageAccount, { ...args, includedEventTypes: ["Microsoft.Storage.BlobCreated"] },
            { parent: args.storageAccount, ...opts });

    }

    /**
     * Creates a new subscription to events fired from Event Grid. The callback is executed whenever
     * a Blob is deleted from a container of the Storage Account.
     */
    export function onGridBlobDeleted(name: string,
                                      args: StorageAccountEventGridCallbackSubscriptionArgs<eventgrid.StorageBlobDeletedEventData>,
                                      opts?: pulumi.ComponentResourceOptions): EventGridCallbackSubscription<eventgrid.StorageBlobDeletedEventData> {
        return new EventGridCallbackSubscription(
            name, args.storageAccount, { ...args, includedEventTypes: ["Microsoft.Storage.BlobDeleted"] },
            { parent: args.storageAccount, ...opts });
    }

    /**
     * Creates a new subscription to events fired from Event Grid. The callback is executed whenever
     * an event associated with the Resource Group fires.
     */
    export function onResourceGroupEvent(name: string,
                                         args: ResourceGroupEventGridCallbackSubscriptionArgs,
                                         opts?: pulumi.ComponentResourceOptions): EventGridCallbackSubscription<ResourceGroupEvent> {
        return new EventGridCallbackSubscription(
            name, { id: args.resourceGroup.id, resourceGroupName: args.resourceGroup.name },
            args, { parent: args.resourceGroup, ...opts });
    };
}
