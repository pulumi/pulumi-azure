// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup");

// Create a storage account for our queues
const storageAccount = new azure.storage.Account("storage", {
    resourceGroupName: resourceGroup.name,
    accountReplicationType: "LRS",
    accountTier: "Standard",
});

// And an input queue to send messages into
const queue1 = new azure.storage.Queue("queue1", {
   storageAccountName: storageAccount.name,
});

// And an input queue to send messages into
const queue2 = new azure.storage.Queue("queue2", {
    storageAccountName: storageAccount.name,
 });

// HTTP Function will send a message to the first queue on each request
const greeting = new azure.appservice.HttpEventSubscription("greeting", {
    resourceGroup,
    nodeVersion: "~22",
    route: "{name}",
    outputs: [
        queue1.output("queueOut"),
    ],
    callback: async (context, request) => {
        const name = context.bindingData.name;
        return {
            response: {
                status: 200,
                body: `Hi ${name}, this is the HTTP response`,
            },
            queueOut: { name },
        };
    },
});

// When a new message is added, fire an event and forward the message to the output queue
queue1.onEvent("NewMessage",  {
    nodeVersion: "~22",
    outputs: [queue2.output("queueOut")],
    callback: async (context, person) => {
        return {
            queueOut: `${person.name} was welcomed`,
        };
    },
});

// When a message is forwarded, fire another event
queue2.onEvent("ForwardedMessage",  {
    nodeVersion: "~22",
    callback: async (context, msg) => {
        console.log(msg);
    },
});

// The greeting function URL
export const endpoint = greeting.url;

// The storage account of the queue
export const storageAccountName = storageAccount.name;

// The input queue name
export const queueName = queue1.name;
