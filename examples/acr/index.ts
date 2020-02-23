// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";
import * as df from 'durable-functions';



const resourceGroup = new azure.core.ResourceGroup("chedDurable", {
    location: azure.Locations.WestEurope
});


var app = new azure.appservice.MultiCallbackFunctionApp("durable", {
    resourceGroup,
    functions: [
        new azure.appservice.DurableActivityFunction("SayHello", {
            activityInputName: "name",
            callback: (context) => {
                context.done(null, "Hello, " + context.bindings.name);
            }
        }),
        new azure.appservice.DurableOrchestratorFunction("orch", {
            callback: df.orchestrator(function* (context) {
                const output = [];
                output.push(yield context.df.callActivity("SayHello", "Tokyo"));
                output.push(yield context.df.callActivity("SayHello", "Seattle"));
                output.push(yield context.df.callActivity("SayHello", "London"));
                return output;
            })
        }),
        new azure.appservice.HttpFunction
    ]
});