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
import { Queue, Topic } from ".";
import { EventHub, EventHubConsumerGroup, getEventhubNamespace } from ".";

import * as eventgrid from "../eventgrid";
import * as servicebus from "../servicebus";

import * as appservice from "../appservice";

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

export interface GetEventHubFunctionArgs extends appservice.CallbackFunctionArgs<EventHubContext, any, appservice.FunctionDefaultResponse> {
    /**
     * Optional Consumer Group to subscribe the FunctionApp to. If not present, the default consumer group will be used.
     */
    consumerGroup?: EventHubConsumerGroup;

    /**
     * Set to 'many' in order to enable batching. If omitted or set to 'one', single message passed to function.
     */
    cardinality?: pulumi.Input<"many" | "one">;
}

export interface EventHubFunctionArgs extends GetEventHubFunctionArgs {
    /**
     * Event Hub to subscribe the Function to.
     */
    eventHub: EventHub;
}

export interface EventHubSubscriptionArgs extends GetEventHubFunctionArgs, appservice.CallbackFunctionAppArgs<EventHubContext, any, appservice.FunctionDefaultResponse> {
    /**
     * The name of the resource group in which to create the event subscription. [resourceGroup] takes precedence over [resourceGroupName].
     * If none of the two is supplied, the Event Hub's resource group will be used.
     */
    resourceGroupName?: pulumi.Input<string>;
}

declare module "./eventHub" {
    interface EventHub {
        /**
         * Subscribes to events logged to this Event Hub to the handler provided, along
         * with options to control the behavior of the subscription.
         * A dedicated Function App is created behind the scenes with a single Azure Function in it.
         * Use [getEventFunction] if you want to compose multiple Functions into the same App manually.
         */
        onEvent(
            name: string, args: EventHubCallback | EventHubSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): EventHubSubscription;

        /**
         * Creates a new Function triggered by events in the given Event Hub using the callback provided.
         * [getEventFunction] creates no Azure resources automatically: the returned Function should be used as part of
         * a [MultiCallbackFunctionApp]. Use [onEvent] if you want to create a Function App with a single Function.
         */
        getEventFunction(name: string, args: EventHubCallback | GetEventHubFunctionArgs): EventHubFunction;
    }
}

EventHub.prototype.onEvent = function(this: EventHub, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <EventHubSubscriptionArgs>{ callback: args }
        : args;

    return new EventHubSubscription(name, this, functionArgs, opts);
};

EventHub.prototype.getEventFunction = function(this: EventHub, name, args) {
    const functionArgs = args instanceof Function
        ? { callback: args, eventHub: this }
        : { ...args, eventHub: this };

    return new EventHubFunction(name, functionArgs);
};

export class EventHubSubscription extends appservice.EventSubscription<EventHubContext, string, appservice.FunctionDefaultResponse> {
    readonly eventHub: EventHub;
    readonly consumerGroup?: EventHubConsumerGroup;

    constructor(
        name: string, eventHub: EventHub,
        args: EventHubSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: eventHub, ...opts };

        const resourceGroupName = appservice.getResourceGroupName(args, eventHub.resourceGroupName);

        super("azure:eventhub:EventHubSubscription",
            name,
            new EventHubFunction(name, { ...args, eventHub }),
            { ...args, resourceGroupName },
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

        const namespace = pulumi.all([args.eventHub.namespaceName, args.eventHub.resourceGroupName, args.eventHub.id])
                               .apply(([namespaceName, resourceGroupName]) =>
                                    getEventhubNamespace({ name: namespaceName, resourceGroupName }));

        // Place the mapping from the well known key name to the Event Hubs account connection string in
        // the 'app settings' object.
        const appSettings = pulumi.all([namespace.defaultPrimaryConnectionString, bindingConnectionKey]).apply(
            ([connectionString, key]) => ({ [key]: connectionString }));

        super(name, trigger, args, appSettings);
    }
}

// Legacy exports we keep around for compat.  All of these forward to the respective
// functionality in their new module locations.

// Re-export these classes so we get the value *and* type side of things.
import { QueueEventSubscription, ServiceBusFunction, TopicEventSubscription } from "../servicebus"
export { QueueEventSubscription, ServiceBusFunction, TopicEventSubscription };

/**
 * @deprecated This type has moved to the [servicebus] module.
 */
export type ServiceBusContext = servicebus.ServiceBusContext;

/**
 * @deprecated This type has moved to the [servicebus] module.
 */
export type ServiceBusHostExtensions = servicebus.ServiceBusHostExtensions;

/**
 * @deprecated This type has moved to the [servicebus] module.
 */
export type ServiceBusHostSettings = servicebus.ServiceBusHostSettings;

/**
 * @deprecated This type has moved to the [servicebus] module.
 */
export type ServiceBusCallback = servicebus.ServiceBusCallback;

/**
 * @deprecated This type has moved to the [servicebus] module.
 */
export type ServiceBusFunctionArgs = servicebus.ServiceBusFunctionArgs;

/**
 * @deprecated This type has moved to the [servicebus] module.
 */
export type QueueEventSubscriptionArgs = servicebus.QueueEventSubscriptionArgs;

declare module "./queue" {
    interface Queue {
        /**
         * @deprecated The [Queue] type has moved to the [servicebus] module.
         */
        onEvent(
            name: string, args: ServiceBusCallback | QueueEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): QueueEventSubscription;

        /**
         * @deprecated The [Queue] type has moved to the [servicebus] module.
         */
        getEventFunction(name: string, args: ServiceBusCallback | appservice.CallbackFunctionArgs<ServiceBusContext, string, appservice.FunctionDefaultResponse>): ServiceBusFunction;
    }
}

Queue.prototype.onEvent = servicebus.Queue.prototype.onEvent;

Queue.prototype.getEventFunction = servicebus.Queue.prototype.getEventFunction;

/**
 * @deprecated This type has moved to the [servicebus] module.
 */
export type GetTopicFunctionArgs = servicebus.GetTopicFunctionArgs;

/**
 * @deprecated This type has moved to the [servicebus] module.
 */
export type TopicEventSubscriptionArgs = servicebus.TopicAuthorizationRuleArgs;

declare module "./topic" {
    interface Topic {
        /**
         * @deprecated The [Topic] type has moved to the [servicebus] module.
         */
        onEvent(
            name: string, args: ServiceBusCallback | TopicEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): TopicEventSubscription;

        /**
         * @deprecated The [Topic] type has moved to the [servicebus] module.
         */
        getEventFunction(name: string, args: GetTopicFunctionArgs): ServiceBusFunction;
    }
}

Topic.prototype.onEvent = servicebus.Topic.prototype.onEvent;

Topic.prototype.getEventFunction = servicebus.Topic.prototype.getEventFunction;

/**
 * @deprecated This type has moved to the [eventgrid] module.
 */
export type EventGridEvent<T> = eventgrid.EventGridEvent<T>;

/**
 * @deprecated This type has moved to the [eventgrid] module.
 */
export type EventGridContext<T> = eventgrid.EventGridContext<T>;

/**
 * @deprecated This type has moved to the [eventgrid] module.
 */
export type EventGridFunctionArgs<T> = eventgrid.EventGridFunctionArgs<T>;

export { EventGridFunction, EventGridCallbackSubscription } from "../eventgrid";

/**
 * @deprecated This type has moved to the [eventgrid] module.
 */
export type EventGridCallbackSubscriptionArgs<T> = eventgrid.EventGridCallbackSubscriptionArgs<T>;

/**
 * @deprecated This type has moved to the [eventgrid] module.
 */
export type EventGridScope = eventgrid.EventGridScope;

/**
 * @deprecated This type has moved to the [eventgrid] module.
 */
export type StorageAccountEventGridCallbackSubscriptionArgs<T> = eventgrid.StorageAccountEventGridCallbackSubscriptionArgs<T>;

/**
 * @deprecated This type has moved to the [eventgrid] module.
 */
export type ResourceGroupEventGridCallbackSubscriptionArgs = eventgrid.ResourceGroupEventGridCallbackSubscriptionArgs;

/**
 * Contains hooks to subscribe to different kinds of Event Grid events.
 */
export namespace events {
    /**
     * @deprecated This function has moved to the [eventgrid] module.
     */
    export const onGridBlobCreated = eventgrid.events.onGridBlobCreated;

    /**
     * @deprecated This function has moved to the [eventgrid] module.
     */
    export const onGridBlobDeleted = eventgrid.events.onGridBlobDeleted;

    /**
     * @deprecated This function has moved to the [eventgrid] module.
     */
    export const onResourceGroupEvent = eventgrid.events.onResourceGroupEvent;
}
