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
    connection: string;
}

/**
 * Data that will be passed along in the context object to the BlobCallback.
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
export interface TopicHostSettings extends appservice.HostSettings {
    extensions?: {
        serviceBus: {
            /** The maximum interval between queue polls. Minimum is 00:00:00.100 (100 ms). */
            prefetchCount?: number,
            
            messageHandlerOptions?: {
                /** Whether the trigger should immediately mark as complete (autocomplete) or wait for processing to call complete. */
                autoComplete?: boolean,

                /** The maximum number of concurrent calls to the callback that the message pump should initiate. 
                 * By default, the Functions runtime processes multiple messages concurrently. To direct the runtime to process only 
                 * a single queue or topic message at a time, set maxConcurrentCalls to 1. 
                 */
                maxConcurrentCalls?: number,

                /** The default PrefetchCount that will be used by the underlying MessageReceiver. */
                maxAutoRenewDuration?: string,
            },
        }
    }    
}

/**
 * Signature of the callback that can receive blob notifications.
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

        // The topic binding does not store the storage connection string directly.  Instead, the
        // connection string is put into the app settings (under whatever key we want). Then, the
        // .connection property of the binding contains the *name* of that app setting key.
        const bindingConnectionKey = "BindingConnectionAppSettingsKey";

        const bindings: TopicBindingDefinition[] = [{
            name: "topic",
            direction: "in",
            type: "serviceBusTrigger",
            topicName: topic.name,
            subscriptionName: subscription.name,
            connection: bindingConnectionKey,
        }];

        const namespace = pulumi.all([topic.namespaceName, resourceGroupName])
                               .apply(([namespaceName, resourceGroupName]) =>
                                    getServiceBusNamespace({ name: namespaceName, resourceGroupName }));

        // Place the mapping from the well known key name to the storage account connection string in
        // the 'app settings' object.

        const appSettings = pulumi.all([args.appSettings, namespace.defaultPrimaryConnectionString]).apply(
            ([appSettings, connectionString]) => ({ ...appSettings, [bindingConnectionKey]: connectionString }));

        super("azure:eventhub:TopicEventSubscription", name, bindings, {
            ...args,
            resourceGroupName,
            location,
            appSettings
        }, opts);

        this.topic = topic;
        this.subscription = subscription;

        this.registerOutputs();
    }
}
