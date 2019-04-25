// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";
import * as eventhub from "@pulumi/azure/eventhub";

const location = "West US 2";

const resourceGroup = new azure.core.ResourceGroup("test", {
    location: location,
});

const functionApp = new azure.appservice.HttpEventSubscription("test", {
    location,
    resourceGroupName: resourceGroup.name,
    callback: async(context, arg) => {
        console.log("arg: " + JSON.stringify(arg, null, 4));
        console.log("context: " + JSON.stringify(context, null, 4));
        return {
            status: 200,
            body: { hello: "world" },
        };
    },
});

export const url = functionApp.url;