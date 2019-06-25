// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup", {
    location: "West US 2",
});

// Create a storage account for our images
const storageAccount = new azure.storage.Account("storage", {
    resourceGroupName: resourceGroup.name,
    accountReplicationType: "LRS",
    accountTier: "Standard",
});

// And a container to use to upload images into
const storageContainer = new azure.storage.Container("images-container", {
   resourceGroupName: resourceGroup.name,
   storageAccountName: storageAccount.name,
   name: "images",
});

// When a new PNG image is added, fire an event
storageContainer.onBlobEvent("newImage", {
    callback: async (context, arg) => {
        console.log("ctx: " + JSON.stringify(context, null, 4));
        console.log(arg);
    },
    filterSuffix: ".png",
});

// Put a sample HTML file
const sampleFile = new azure.storage.Blob("test.html", {
    name: "test.html",
    resourceGroupName: resourceGroup.name,
    storageAccountName: storageAccount.name,
    storageContainerName: storageContainer.name,
    type: "block",
    source: "./test.html",
    contentType: "text/html",
});

// Create an HTTP endpoint to serve files from the container
const fileServer = new azure.appservice.HttpEventSubscription("file-server", {
    resourceGroup,
    route: "{name}",
    inputOutputs: [
        storageContainer.input("blob", { blobName: "{name}" }),
    ],
    callback: async (context, req, blob) => {
        return {
            status: 200,
            body: blob.toString(),
        };
    }
});

// The URL which serves files via HTTP
export const serveEndpoint = fileServer.url;

// The URL which serves test.html
export const url = fileServer.url.apply(url => url.replace("{name}", "test.html"));

// The storage account where images should be uploaded
export let storageAccountName = storageAccount.name;
