// // Copyright 2016-2018, Pulumi Corporation.
// //
// // Licensed under the Apache License, Version 2.0 (the "License");
// // you may not use this file except in compliance with the License.
// // You may obtain a copy of the License at
// //
// //     http://www.apache.org/licenses/LICENSE-2.0
// //
// // Unless required by applicable law or agreed to in writing, software
// // distributed under the License is distributed on an "AS IS" BASIS,
// // WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// // See the License for the specific language governing permissions and
// // limitations under the License.

// import * as eventhub from "@pulumi/azure/eventhub";
// import * as pulumi from "@pulumi/pulumi";
// import * as subscriptionMod from "../subscription";

// interface TopicBinding extends subscriptionMod.Binding {
//     /**
//      * The name of the property in the context object to bind the actual topic message to.
//      */
//     name: string;

//     /**
//      * The type of a topic binding.  Must be 'serviceBusTrigger'.
//      */
//     type: "serviceBusTrigger";

//     /**
//      * The direction of the binding.  We only support topics being inputs to functions.
//      */
//     direction: "in";

//     /**
//      * The name of the topic we are subscribing to.
//      */
//     topicName: string;

//     /**
//      * The name of the subscription inside the topic we are subscribing to.
//      */
//     subscriptionName: string;

//     /**
//      * The name of an app setting that contains the Service Bus connection string to use for this binding.
//      */
//     connection: string;
// }

// /**
//  * Data that will be passed along in the context object to the BlobCallback.
//  */
// export interface TopicContext extends subscriptionMod.Context {
//     invocationId: string;
//     executionContext: {
//         invocationId: string;
//         functionName: string;
//         functionDirectory: string;
//     };
//     bindings: { topic: string };
//     bindingData: {
//         deadLetterSource: any;
//         messageId: string;
//         contentType: string;
//         replyTo: any;
//         to: any;
//         label: any;
//         correlationId: any,
//         properties: Record<string, any>;
//         topic: string,
//         sys: {
//             methodName: string;
//             utcNow: string;
//         },
//         invocationId: string;
//     };
// }

// /**
//  * Signature of the callback that can receive blob notifications.
//  */
// export type TopicCallback = subscriptionMod.Callback<TopicContext, any>;

// export interface TopicEventSubscriptionArgs extends subscriptionMod.EventSubscriptionArgs<TopicContext, any> {
//     /**
//      * The eventhub.Subscription to subscribe the FunctionApp to.  If not present, a new
//      * Subscription resource will be created.
//      */
//     subscription?: eventhub.Subscription;

//     /**
//      * The maximum number of deliveries.  Will default to 10 if not specified.
//      */
//     maxDeliveryCount?: pulumi.Input<number>;
// }

// /**
//  * Creates a new subscription to the given blob using the callback provided, along with optional
//  * options to control the behavior of the subscription.
//  */
// export function onTopicEvent(
//     name: string, namespace: eventhub.Namespace, topic: eventhub.Topic,
//     args: TopicEventSubscriptionArgs, opts?: pulumi.ResourceOptions): TopicEventSubscription {

//     args = args || {};

//     let subscription = args.subscription;
//     if (!subscription) {
//         subscription = new eventhub.Subscription(name, {
//             resourceGroupName: args.resourceGroupName,
//             namespaceName: topic.namespaceName,
//             topicName: topic.name,
//             maxDeliveryCount: pulumi.output(args.maxDeliveryCount).apply(c => c === undefined ? 10 : c),
//         }, { parent: topic });
//     }

//     // The topic binding does not store the storage connection string directly.  Instead, the
//     // connection string is put into the app settings (under whatever key we want). Then, the
//     // .connection property of the binding contains the *name* of that app setting key.
//     const bindingConnectionKey = "BindingConnectionAppSettingsKey";

//     const bindings = pulumi.all([topic.name, subscription.name]).apply(([topicName, subscriptionName]) => {
//         const topicBinding: TopicBinding = {
//             name: "topic",
//             direction: "in",
//             type: "serviceBusTrigger",
//             topicName: topicName,
//             subscriptionName: subscriptionName,
//             connection: bindingConnectionKey,
//         };

//         return [topicBinding];
//     });

//     // Place the mapping from the well known key name to the storage account connection string in
//     // the 'app settings' object.
//     const appSettingsOutput = args.appSettings || pulumi.output({});

//     args.appSettings = pulumi.all([appSettingsOutput, namespace.defaultPrimaryConnectionString]).apply(
//         ([appSettings, connectionString]) => {
//             appSettings[bindingConnectionKey] = connectionString;
//             return appSettings;
//         });

//     return new TopicEventSubscription(
//         name, namespace, topic, subscription, bindings, args, opts);
// }

// export class TopicEventSubscription extends subscriptionMod.EventSubscription<TopicContext, any> {
//     readonly namespace: eventhub.Namespace;
//     readonly topic: eventhub.Topic;
//     readonly subscription: eventhub.Subscription;

//     constructor(
//         name: string, namespace: eventhub.Namespace, topic: eventhub.Topic,
//         subscription: eventhub.Subscription, bindings: pulumi.Output<TopicBinding[]>,
//         args: subscriptionMod.EventSubscriptionArgs<TopicContext, any>, options?: pulumi.ResourceOptions) {

//         super("azure-serverless:topic:TopicEventSubscription", name, bindings, args, options);

//         this.namespace = namespace;
//         this.topic = topic;
//         this.subscription = subscription;
//     }
// }

export const x = 1;