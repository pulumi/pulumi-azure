import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("example", { location: azure.Locations.WestEurope });

// Define 3 HTTP Functions which only differ by number and the hello message
const http = [1, 2, 3].map(i =>
    new azure.appservice.HttpFunction(`F${i}`, {
        callback: async (context, request) => ({ status: 200, body: `Hi from F${i}` }),
    }),
);

// Define another HTTP function that defines a custom http output binding
http.push(new azure.appservice.HttpFunction(`F4`, {
    callback: async (context, request) => {
        context.bindings.myResponse = { status: 200, body: `Hi from F4` };
    },
    outputs: [{
        binding: {
            type: "http",
            direction: "out",
            name: "myResponse",
        },
        settings: {},
    }],
}));

// Define a timer function which will trigger every minute to keep other Function from being disposed on idle
const warmer = new azure.appservice.TimerFunction("Warmer", {
    schedule: { second: 0 },
    callback: async (context, timer) => {
        // Do nothing, it's just a warmer
    },
});

// Create a Function App containing multiple functions
const app = new azure.appservice.MultiCallbackFunctionApp("http-multi", {
    resourceGroupName: resourceGroup.name,
    functions: [...http, warmer],
});

export const urls = http.map(f => app.endpoint.apply(ep => `${ep}${f.name}`));
