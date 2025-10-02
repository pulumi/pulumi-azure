// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup");

// Create a storage account for our queues
const storageAccount = new azure.storage.Account("storage", {
    resourceGroupName: resourceGroup.name,
    accountReplicationType: "LRS",
    accountTier: "Standard",
});

 // A table to store value lookups
const values = new azure.storage.Table("values", {
    storageAccountName: storageAccount.name,
});

// HTTP Function gets the value from the store
const getFunc = new azure.appservice.HttpEventSubscription('get-value', {
    resourceGroup,
    nodeVersion: "~22",
    route: "{key}",
    inputs: [
        values.input("entry", { partitionKey: "test", rowKey: "{key}" }),
    ],
    callback: async (context, request, entry) => {
        return {
            status: 200,
            body: entry.value,
        };
    },
});

// HTTP Function adds the value to the store
const addFunc = new azure.appservice.HttpEventSubscription('add-value', {
    resourceGroup,
    nodeVersion: "~22",
    methods: ["POST"],
    outputs: [
        values.output("entry"),
    ],
    callback: async (context, request) => {
        if (request.body && request.body.key && request.body.value) {
            const entry = {
                PartitionKey: "test",
                RowKey: request.body.key,
                value: request.body.value,
            };
            return {
                response: {
                    status: 200,
                    body: "",
                },
                entry,
            };
        }

        return {
            response: {
                status: 400,
                body: "Bad request: please POST a JSON with a key and a value",
            },
        };
    },
});

// The Get function URL
export const getEndpoint = getFunc.url;

// The Add function URL
export const addEndpoint = addFunc.url;

// The storage account of the queue
export const storageAccountName = storageAccount.name;