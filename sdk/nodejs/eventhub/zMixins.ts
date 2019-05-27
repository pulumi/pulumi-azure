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
import { getServiceBusNamespace, Subscription, Topic } from ".";
import { EventHub, EventHubConsumerGroup, getEventhubNamespace } from ".";

import * as appservice from "../appservice";
import * as core from "../core";
import * as util from "../util";

interface TopicBindingDefinition extends appservice.BindingDefinition {
    /**
     * The name of the property in the context object to bind the actual topic message to.
     */
    name: string;

    /**
     * The type of a topic binding.  Must be 'serviceBusTrigger'.
     */
    type: "serviceBusTrigger";

    /**
     * The direction of the binding.  We only support topics being inputs to functions.
     */
    direction: "in";

    /**
     * The name of the topic we are subscribing to.
     */
    topicName: pulumi.Input<string>;

    /**
     * The name of the subscription inside the topic we are subscribing to.
     */
    subscriptionName: pulumi.Input<string>;

    /**
     * The name of an app setting that contains the Service Bus connection string to use for this binding.
     */
    connection: pulumi.Input<string>;
}

/**
 * Data that will be passed along in the context object to the TopicCallback.
 */
export interface TopicContext extends appservice.Context<void> {
    invocationId: string;
    executionContext: {
        invocationId: string;
        functionName: string;
        functionDirectory: string;
    };
    bindings: { topic: string };
    bindingData: {
        deadLetterSource: any;
        messageId: string;
        contentType: string;
        replyTo: any;
        to: any;
        label: any;
        correlationId: any,
        properties: Record<string, any>;
        topic: string,
        sys: {
            methodName: string;
            utcNow: string;
        },
        invocationId: string;
    };
}

/**
 * Host settings specific to the Service Bus Topic/Subscription plugin.
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
export interface TopicHostSettings extends appservice.HostSettings {
    extensions?: {
        serviceBus: ServiceBusHostExtensions
    }    
}

/**
 * Signature of the callback that can receive topic notifications.
 */
export type TopicCallback = appservice.Callback<TopicContext, string, void>;

export type TopicEventSubscriptionArgs = util.Overwrite<appservice.CallbackFunctionAppArgs<TopicContext, any, void>, {
    /**
     * The Subscription to subscribe the FunctionApp to.  If not present, a new Subscription
     * resource will be created.
     */
    subscription?: Subscription;

    /**
     * The maximum number of deliveries.  Will default to 10 if not specified.
     */
    maxDeliveryCount?: pulumi.Input<number>;

    /**
     * The resource group in which to create the event subscription.  If not supplied, the Topic's
     * resource group will be used.
     */
    resourceGroup?: core.ResourceGroup;

    /**
     * The name of the resource group in which to create the event subscription.  If not supplied,
     * the Topic's resource group will be used.
     */
    resourceGroupName?: pulumi.Input<string>;

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new
     * resource to be created.  If not supplied, the location of the Topic's ResourceGroup will be
     * used.
     */
    location?: pulumi.Input<string>;

    /** 
     * Host settings specific to the Service Bus Topic/Subscription plugin. These values can be provided here, or defaults will 
     * be used in their place. 
     */
    hostSettings?: TopicHostSettings;
}>;

declare module "./topic" {
    interface Topic {
        /**
         * Creates a new subscription to events fired from this Topic to the handler provided, along
         * with options to control the behavior of the subscription.
         */
        onEvent(
            name: string, args: TopicCallback | TopicEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): TopicEventSubscription;
    }
}

Topic.prototype.onEvent = function(this: Topic, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <TopicEventSubscriptionArgs>{ callback: args }
        : args;

    return new TopicEventSubscription(name, this, functionArgs, opts);
}

export class TopicEventSubscription extends appservice.EventSubscription<TopicContext, string, void> {
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

        const func = new TopicFunction(name, {
            ...args,
            topic,
            subscription,
        })

        super("azure:eventhub:TopicEventSubscription", name, func, {
            ...args,
            resourceGroupName,
            location,
        }, opts);

        this.topic = topic;
        this.subscription = subscription;

        this.registerOutputs();
    }
}

export type TopicFunctionArgs = util.Overwrite<appservice.CallbackArgs<TopicContext, string, void>, {
    /**
     * Defines the Service Bus topic to trigger the function.
     */
    topic: Topic;

    /**
     * The Subscription to subscribe the FunctionApp to.  If not present, a new Subscription
     * resource will be created.
     */
    subscription: Subscription | string;

    /**
     * The maximum number of deliveries.  Will default to 10 if not specified.
     */
    maxDeliveryCount?: pulumi.Input<number>;
}>;

/**
 * Azure Function triggered by a Service Bus Topic Subscription.
 */
export class TopicFunction implements appservice.FunctionArgs {
    /**
     * Function name.
     */
    public readonly name: string;

    /**
     * An array of function binding definitions.
     */
    public readonly bindings: pulumi.Input<TopicBindingDefinition[]>;

    /**
     * Serialized function callback.
     */
    public readonly body: Promise<pulumi.runtime.SerializedFunction>;

    /**
     * Application settings required by the function.
     */
    public readonly appSettings: pulumi.Input<{ [key: string]: string }>;

    constructor(name: string, args: TopicFunctionArgs) {
        this.name = name;
        this.body = appservice.serializeFunctionCallback(args);

        const subscription = typeof args.subscription === "string" 
            ? new Subscription(name, {
                resourceGroupName: args.topic.resourceGroupName,
                namespaceName: args.topic.namespaceName,
                topicName: args.topic.name,
                maxDeliveryCount: pulumi.output(args.maxDeliveryCount).apply(c => c === undefined ? 10 : c),
            }, { parent: args.topic })
            : args.subscription;

        const bindingConnectionKey = pulumi.interpolate`${args.topic.namespaceName}ConnectionStringKey`;
        this.bindings = [{
            name: "topic",
            direction: "in",
            type: "serviceBusTrigger",
            topicName: args.topic.name,
            subscriptionName: subscription.name,
            connection: bindingConnectionKey,
        }];
    
        const namespace = pulumi.all([args.topic.namespaceName, args.topic.resourceGroupName])
                               .apply(([namespaceName, resourceGroupName]) =>
                                    getServiceBusNamespace({ name: namespaceName, resourceGroupName }));

        this.appSettings = pulumi.all([bindingConnectionKey, namespace.defaultPrimaryConnectionString]).apply(
            ([key, connectionString]) => ({ [key]: connectionString }));
    }
}

interface EventHubBindingDefinition extends appservice.BindingDefinition {
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
export interface EventHubContext extends appservice.Context<void> {
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
export type EventHubCallback = appservice.Callback<EventHubContext, string, void>;

export type EventHubSubscriptionArgs = util.Overwrite<appservice.CallbackFunctionAppArgs<EventHubContext, any, void>, {
    /**
     * Optional Consumer Group to subscribe the FunctionApp to. If not present, the default consumer group will be used.
     */
    consumerGroup?: EventHubConsumerGroup;

    /**
     * Set to 'many' in order to enable batching. If omitted or set to 'one', single message passed to function.
     */
    cardinality?: pulumi.Input<"many" | "one">;
}>;

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

export class EventHubSubscription extends appservice.EventSubscription<EventHubContext, string, void> {
    readonly eventHub: EventHub;
    readonly consumerGroup: EventHubConsumerGroup;

    constructor(
        name: string, eventHub: EventHub,
        args: EventHubSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: eventHub, ...opts };

        const { resourceGroupName, location } = appservice.getResourceGroupNameAndLocation(args, eventHub.resourceGroupName);

        const consumerGroup = args.consumerGroup || new EventHubConsumerGroup(name, {
            resourceGroupName,
            namespaceName: eventHub.namespaceName,
            eventhubName: eventHub.name,
        }, opts);

        const func = new EventHubFunction(name, {
            ...args,
            eventHub,
            consumerGroup,
        })

        super("azure:eventhub:EventHubSubscription", name, func, {
            ...args,
            resourceGroupName,
            location,
        }, opts);

        this.eventHub = eventHub;
        this.consumerGroup = consumerGroup;

        this.registerOutputs();
    }
}

export type EventHubFunctionArgs = util.Overwrite<appservice.CallbackArgs<EventHubContext, string, void>, {
    /**
     * Event Hub to trigger the function.
     */
    eventHub: EventHub;
    
    /**
     * Consumer Group to subscribe the FunctionApp to. If not present, the default consumer group will be used.
     */
    consumerGroup: EventHubConsumerGroup | string;

    /**
     * Set to 'many' in order to enable batching. If omitted or set to 'one', single message passed to function.
     */
    cardinality?: pulumi.Input<"many" | "one">;
}>;

/**
 * Azure Function triggered by an Event Hub.
 */
export class EventHubFunction implements appservice.FunctionArgs {
    /**
     * Function name.
     */
    public readonly name: string;

    /**
     * An array of function binding definitions.
     */
    public readonly bindings: pulumi.Input<EventHubBindingDefinition[]>;

    /**
     * Serialized function callback.
     */
    public readonly body: Promise<pulumi.runtime.SerializedFunction>;

    /**
     * Application settings required by the function.
     */
    public readonly appSettings: pulumi.Input<{ [key: string]: string }>;

    constructor(name: string, args: EventHubFunctionArgs) {
        this.name = name;
        this.body = appservice.serializeFunctionCallback(args);

        const consumerGroup = typeof args.consumerGroup === "string"
            ? new EventHubConsumerGroup(name, {
                resourceGroupName: args.eventHub.resourceGroupName,
                namespaceName: args.eventHub.namespaceName,
                eventhubName: args.eventHub.name,
                }, { parent: args.eventHub })
            : args.consumerGroup;

        const bindingConnectionKey = pulumi.interpolate`${args.eventHub.namespaceName}ConnectionStringKey`;
        this.bindings = [{
            name: "eventHub",
            direction: "in",
            type: "eventHubTrigger",
            eventHubName: args.eventHub.name,
            consumerGroup: consumerGroup.name,
            cardinality: args.cardinality,
            connection: bindingConnectionKey,
        }];
    
        const namespace = pulumi.all([args.eventHub.namespaceName, args.eventHub.resourceGroupName])
                               .apply(([namespaceName, resourceGroupName]) =>
                                    getEventhubNamespace({ name: namespaceName, resourceGroupName }));

        this.appSettings = pulumi.all([bindingConnectionKey, namespace.defaultPrimaryConnectionString]).apply(
            ([key, connectionString]) => ({ [key]: connectionString }));
    }
}
