// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const exampleResourceGroup = new azure.core.ResourceGroup("example");

// In Step 2 of this test, we will check that the renamespacing of the provider
// has created the correct alias between `azure.eventhub.Namespace` and
// `azure.servicebus.Namespace`
const exampleNamespace = new azure.eventhub.Namespace("example", {
    name: "servicebus-namespavce",
    resourceGroupName: exampleResourceGroup.name,
    sku: "Standard",
    tags: {
        source: "example",
    },
});

// In Step 2 of this test, we will check that the renamespacing of the provider
// has created the correct alias between `azure.eventhub.Queue` and
// `azure.servicebus.Queue`
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
