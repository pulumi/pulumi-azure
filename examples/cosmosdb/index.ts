// Copyright 2016-2019, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";
import * as cosmosdb from "@pulumi/azure/cosmosdb";

const resourceGroup = new azure.core.ResourceGroup("test");

let db = new cosmosdb.Account("test", {
    resourceGroupName: resourceGroup.name,
    offerType: "Standard",
    consistencyPolicy: {
        consistencyLevel: "Session",
        maxIntervalInSeconds: 5,
        maxStalenessPrefix: 100,
    },
    geoLocations: [{ location: resourceGroup.location, failoverPriority: 0 }],
});

db.onChange("test", {
    databaseName: "testdb",
    collectionName: "testc",
    callback: async (context, items) => {
        console.log("ctx: " + JSON.stringify(context, null, 4));
        console.log(`${items.length} received`);
    }
});
