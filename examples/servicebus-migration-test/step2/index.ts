// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const exampleResourceGroup = new azure.core.ResourceGroup("example", {
    name: "my-servicebus",
});
const exampleNamespace = new azure.servicebus.Namespace("example", {
    resourceGroupName: exampleResourceGroup.name,
    sku: "Standard",
    tags: {
        source: "example",
    },
});
const serviceBusQueue = new azure.servicebus.Queue("example", {
    enablePartitioning: true,
    name: "tfex_servicebus_queue",
    namespaceId: exampleNamespace.id,
});

serviceBusQueue.onEvent("Test", async (context, arg) => {
    console.log("ctx: " + JSON.stringify(context, null, 4));
    console.log("arg: " + JSON.stringify(arg, null, 4));
});
