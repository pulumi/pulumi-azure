// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";
import * as eventhub from "@pulumi/azure/eventhub";

const resourceGroup = new azure.core.ResourceGroup("test");

const namespace = new eventhub.Namespace("test", {
    resourceGroupName: resourceGroup.name,
    sku: "Standard",
});

const topic = new eventhub.Topic("test", {
    namespaceId: namespace.id,
});

export const subscription = topic.onEvent("test", async (context, arg) => {
    console.log("ctx: " + JSON.stringify(context, null, 4));
    console.log("arg: " + JSON.stringify(arg, null, 4));
});
