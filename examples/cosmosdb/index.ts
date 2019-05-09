// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";
import * as cosmosdb from "@pulumi/azure/cosmosdb";

const location = "West US 2";

const resourceGroup = new azure.core.ResourceGroup("test", {
    location: location,
});

let cosmosdb = new azure.cosmosdb.Account("test", {
    resourceGroupName: resourceGroup.name,
    geoLocations: [{ location: resourceGroup.location, failoverPriority: 0 }],
    offerType: "Standard",
    consistencyPolicy: {
        consistencyLevel: "Session",
        maxIntervalInSeconds: 5,
        maxStalenessPrefix: 100,
    },
});

cosmosdb.onChange("test", {
    databaseName: "testdb",
    collectionName: "testc",
    callback: async (context, items) => {
        console.log("ctx: " + JSON.stringify(context, null, 4));
        console.log(`${items.length} received`);
    }
});
