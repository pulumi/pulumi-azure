// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup", {
    location: "West US 2",
});

// Create a storage account for our images
const storageAccount = new azure.storage.Account("storage", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    accountReplicationType: "LRS",
    accountTier: "Standard",
});

// And a queue to send messages into
const queue = new azure.storage.Queue("queue", {
   resourceGroupName: resourceGroup.name,
   storageAccountName: storageAccount.name
});

// When a new message is added, fire an event
queue.onEvent("newMessage",  async (context, arg) => {
    console.log("ctx: " + JSON.stringify(context, null, 4));
    console.log("arg: " + JSON.stringify(arg, null, 4));
});

// The storage account of the queue
export let storageAccountName = storageAccount.name;

// The queue name
export let queueName = queue.name;
