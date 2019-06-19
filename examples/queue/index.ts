// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup", {
    location: "West US 2",
});

// Create a storage account for our queues
const storageAccount = new azure.storage.Account("storage", {
    resourceGroupName: resourceGroup.name,
    accountReplicationType: "LRS",
    accountTier: "Standard",
});

// And an input queue to send messages into
const queue1 = new azure.storage.Queue("queue1", {
   resourceGroupName: resourceGroup.name,
   storageAccountName: storageAccount.name,
});

// And an input queue to send messages into
const queue2 = new azure.storage.Queue("queue2", {
    resourceGroupName: resourceGroup.name,
    storageAccountName: storageAccount.name,
 });

// HTTP Function will send a message to the first queue on each request
const greeting = new azure.appservice.HttpEventSubscription('greeting', {
    resourceGroup,    
    inputOutputs: [queue1.output("queueOut")],
    callback: async (context, request) => {
        const name = request.query["name"] || "World";
        return {
            response: {
                status: 200,
                body: `Hi ${name}, this is the HTTP response`,
            },
            queueOut: `Hi ${name}, this is sent to the queue`,
        };
    },
});
 
// When a new message is added, fire an event and forward the message to the output queue
queue1.onEvent("NewMessage",  {
    inputOutputs: [queue2.output("queueOut")],
    callback: async (context, msg) => {
        const text = msg.toString();
        return {
            queueOut: `Forwarding ${text}`,
        };
    },
});

// When a message is forwarded, fire another event
queue2.onEvent("ForwardedMessage",  {
    callback: async (context, msg) => {
        const text = msg.toString();
        console.log(text);
    },
});

// The storage account of the queue
export let storageAccountName = storageAccount.name;

// The input queue name
export let queueName = queue1.name;
