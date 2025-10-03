// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";
import * as iot from "@pulumi/azure/iot";

const resourceGroup = new azure.core.ResourceGroup("test");

const iotHub = new iot.IoTHub("test", {
    resourceGroupName: resourceGroup.name,
    sku: {
        capacity: 1,
        name: "S1",
    },
    fallbackRoute: {
        source: "DeviceMessages", 
        enabled: true, 
        endpointNames: ["events"],
        condition: "true",
    },
});

iotHub.onEvent("test", {
    nodeVersion: "~22",
    callback: async (context, message) => {
        console.log("ctx: " + JSON.stringify(context, null, 4));
        console.log("arg: " + message);
    },
});
