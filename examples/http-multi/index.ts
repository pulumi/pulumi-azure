import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("example", { location: "West US 2" });

function makeHttpFunction(name: string, callback: azure.appservice.Callback<azure.appservice.Context<azure.appservice.HttpResponse>, azure.appservice.HttpRequest, azure.appservice.HttpResponse>) {
    const bindings = [{
        authLevel: "anonymous",
        type: "httpTrigger",
        direction: "in",
        name: "req",
    }, {
        type: "http",
        direction: "out",
        name: "$return",
    }];

    return <azure.appservice.Function>{
        name,
        bindings,
        callback: { callback },
    };
}

// Create a Function App containing multiple functions
const app = new azure.appservice.MultiCallbackFunctionApp("http-multi", {
    resourceGroupName: resourceGroup.name,
    functions: [
        makeHttpFunction("F1", async (c, r) => ({ status: 200, body: "Hi from F1" })),
        makeHttpFunction("F2", async (c, r) => ({ status: 200, body: "Hi from F2" }))
    ]
});

export const url1 = app.endpoint.apply(ep => `${ep}F1`);
export const url2 = app.endpoint.apply(ep => `${ep}F2`);
