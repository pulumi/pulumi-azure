// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const exampleResourceGroup = new azure.core.ResourceGroup("exampleservicebusmigration");

const exampleNamespace = new azure.servicebus.Namespace("example", {
    resourceGroupName: exampleResourceGroup.name,
    sku: "Standard",
    tags: {
        source: "example",
    },
});
const serviceBusQueue = new azure.servicebus.Queue("example", {
    partitioningEnabled: true,
    name: "servicebus-queue",
    namespaceId: exampleNamespace.id,
});

serviceBusQueue.onEvent("Test", {
    nodeVersion: "~22",
    callback: async (context, arg) => {
        console.log("ctx: " + JSON.stringify(context, null, 4));
        console.log("arg: " + JSON.stringify(arg, null, 4));
    },
});
