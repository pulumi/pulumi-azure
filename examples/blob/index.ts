// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup", {
    location: "West US 2",
});

// Create a storage account for our images
const storageAccount = new azure.storage.Account("storage", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
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

// The storage account where images should be uploaded
export let storageAccountName = storageAccount.name;
