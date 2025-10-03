// Copyright 2016-2020, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";
import * as df from 'durable-functions';

const resourceGroup = new azure.core.ResourceGroup("durable-example");

var app = new azure.appservice.MultiCallbackFunctionApp("durable", {
    resourceGroup,
    nodeVersion: "~22",
    functions: [
        new azure.appservice.DurableActivityFunction("SayHello", {
            activityInputName: "name",
            callback: async context => {
                return "Hello, " + context.bindings.name;
            }
        }),
        new azure.appservice.DurableOrchestratorFunction("orch", {
            callbackFactory: () => df.orchestrator(function* (context) {
                const output = [];
                output.push(yield context.df.callActivity("SayHello", "Tokyo"));
                output.push(yield context.df.callActivity("SayHello", "Seattle"));
                output.push(yield context.df.callActivity("SayHello", "London"));

                return output;
            })
        }),
        new azure.appservice.DurableEntityFunction("counter", {
            callbackFactory: () => df.entity(function (context) {
                const currentValue = context.df.getState(() => 0) as number;
                switch (context.df.operationName) {
                    case "add":
                        const amount = context.df.getInput() as number;
                        context.df.setState(currentValue + amount);
                        break;
                    case "reset":
                        context.df.setState(0);
                        break;
                }
            })
        }),
        new azure.appservice.HttpFunction("hello", {
            route: "hello/{id}",
            callback: async (context, request) => {
                const client = df.getClient(context);
                client.startNew("orch", request.params.id);

                return client.waitForCompletionOrCreateCheckStatusResponse(request, request.params.id!, 5000, 100);
            },
            inputs: [new azure.appservice.DurableOrchestrationClientInputBindingSettings("starter")]
        }),
        new azure.appservice.HttpFunction("viewCount", {
            route: "views",
            callback: async (context, request) => {
                const client = df.getClient(context);
                const entityId = new df.EntityId("counter", "myCounter");
                await client.signalEntity(entityId, "add");
                const stateResponse = await client.readEntityState(entityId);
                return {
                    status: 200,
                    body: stateResponse.entityState
                };
            },
            inputs: [new azure.appservice.DurableEntityClientInputBindingSettings("client")]
        })
    ]
});


// You can test the deployed durable functions by making HTTP calls to the HTTP triggered durable client functions:
// - GET {url}/api/hello/world --> should return "Hello, world"
// - GET {url}/api/views --> should return a ever increasing counter
export const url = app.endpoint;
