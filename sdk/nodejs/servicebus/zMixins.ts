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
import { getNamespace, Queue, Subscription, Topic, Namespace } from ".";

import * as appservice from "../appservice";

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
}

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
}

declare module "./queue" {
    interface Queue {
        /**
         * Creates a new subscription to events fired from this Queue to the handler provided, along
         * with options to control the behavior of the subscription.
         * A dedicated Function App is created behind the scenes with a single Azure Function in it.
         * Use [getEventFunction] if you want to compose multiple Functions into the same App manually.
         */
        onEvent(
            name: string, args: ServiceBusCallback | QueueEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): QueueEventSubscription;

        /**
         * Creates a new Function triggered by messages in the given Queue using the callback provided.
         * [getEventFunction] creates no Azure resources automatically: the returned Function should be used as part of
         * a [MultiCallbackFunctionApp]. Use [onEvent] if you want to create a Function App with a single Function.
         */
        getEventFunction(name: string, args: ServiceBusCallback | appservice.CallbackFunctionArgs<ServiceBusContext, string, appservice.FunctionDefaultResponse>): ServiceBusFunction;
    }
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

    return new ServiceBusFunction(name, functionArgs);
};

export class QueueEventSubscription extends appservice.EventSubscription<ServiceBusContext, string, appservice.FunctionDefaultResponse> {
    readonly queue: Queue;

    constructor(
        name: string, queue: Queue,
        args: QueueEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        super("azure:servicehub:QueueEventSubscription",
            name,
            new ServiceBusFunction(name, { ...args, queue }),
            args,
            pulumi.mergeOptions(
                { parent: queue, ...opts },
                { aliases: [{ type: "azure:eventhub:QueueEventSubscription" }]}));

        this.queue = queue;
        this.registerOutputs();
    }
}

export interface GetTopicFunctionArgs extends appservice.CallbackFunctionArgs<ServiceBusContext, string, appservice.FunctionDefaultResponse> {
    /**
     * The ServiceBus Subscription to subscribe the Function to.
     */
    subscription?: Subscription;
}

export interface TopicEventSubscriptionArgs extends GetTopicFunctionArgs, QueueEventSubscriptionArgs {
    /**
     * The maximum number of deliveries.  Will default to 10 if not specified.
     */
    maxDeliveryCount?: pulumi.Input<number>;
}

declare module "./topic" {
    interface Topic {
        /**
         * Creates a new subscription to events fired from this Topic to the handler provided, along
         * with options to control the behavior of the subscription.
         * A dedicated Function App is created behind the scenes with a single Azure Function in it.
         * Use [getEventFunction] if you want to compose multiple Functions into the same App manually.
         */
        onEvent(
            name: string, args: ServiceBusCallback | TopicEventSubscriptionArgs, opts?: pulumi.ComponentResourceOptions): TopicEventSubscription;

        /**
         * Creates a new Function triggered by messages in the given Topic using the callback provided.
         * [getEventFunction] creates no Azure resources automatically: the returned Function should be used as part of
         * a [MultiCallbackFunctionApp]. Use [onEvent] if you want to create a Function App with a single Function.
         */
        getEventFunction(name: string, args: GetTopicFunctionArgs): ServiceBusFunction;
    }
}

Topic.prototype.onEvent = function(this: Topic, name, args, opts) {
    const functionArgs = args instanceof Function
        ? <TopicEventSubscriptionArgs>{ callback: args }
        : args;

    return new TopicEventSubscription(name, this, functionArgs, opts);
}

Topic.prototype.getEventFunction = function(this: Topic, name, args) {
    return new ServiceBusFunction(name, { ...args, topic: this });
};

export class TopicEventSubscription extends appservice.EventSubscription<ServiceBusContext, string, appservice.FunctionDefaultResponse> {
    readonly topic: Topic;
    readonly subscription: Subscription;

    constructor(
        name: string, topic: Topic,
        args: TopicEventSubscriptionArgs, opts: pulumi.ComponentResourceOptions = {}) {

        opts = { parent: topic, ...opts };

        const subscription = args.subscription || new Subscription(name, {
            topicId: topic.id,
            maxDeliveryCount: pulumi.output(args.maxDeliveryCount).apply(c => c === undefined ? 10 : c),
        }, opts);

        super("azure:servicehub:TopicEventSubscription",
            name,
            new ServiceBusFunction(name, { ...args, topic, subscription }),
            args,
            pulumi.mergeOptions(opts, {
                aliases: [{ type: "azure:eventhub:TopicEventSubscription" }] }));

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

        const namespaceId = (args.queue && args.queue.namespaceId) || args.topic!.namespaceId;

        // Don't attempt to fetch the namespace until we're sure it has been created.
        const namespace = namespaceId.apply(id => Namespace.get(id, id))

        // The binding does not store the Service Bus connection string directly.  Instead, the
        // connection string is put into the app settings (under whatever key we want). Then, the
        // .connection property of the binding contains the *name* of that app setting key.
        const bindingConnectionKey = pulumi.interpolate`ServiceBus${namespace.name}ConnectionKey`;

        const trigger = {
            name: "message",
            direction: "in",
            type: "serviceBusTrigger",
            queueName: args.queue && args.queue.name,
            topicName: args.topic && args.topic.name,
            subscriptionName: args.subscription && args.subscription.name,
            connection: bindingConnectionKey,
        } as ServiceBusBindingDefinition;

        const appSettings = pulumi.all([namespace.defaultPrimaryConnectionString, bindingConnectionKey]).apply(
            ([connectionString, key]) => ({ [key]: connectionString }));

        super(name, trigger, args, appSettings);
    }
}
