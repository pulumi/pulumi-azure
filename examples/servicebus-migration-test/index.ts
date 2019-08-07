// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const exampleResourceGroup = new azure.core.ResourceGroup("example");

const exampleNamespace = new azure.eventhub.Namespace("example", {
    name: "servicebus-namespavce",
    resourceGroupName: exampleResourceGroup.name,
    sku: "Standard",
    tags: {
        source: "example",
    },
});
const serviceBusQueue = new azure.eventhub.Queue("example", {
    enablePartitioning: true,
    name: "servicebus-queue",
    namespaceName: exampleNamespace.name,
    resourceGroupName: exampleResourceGroup.name,
});

serviceBusQueue.onEvent("Test", async (context, arg) => {
    console.log("ctx: " + JSON.stringify(context, null, 4));
    console.log("arg: " + JSON.stringify(arg, null, 4));
});
