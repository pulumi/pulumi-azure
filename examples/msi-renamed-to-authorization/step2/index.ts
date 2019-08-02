// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("aks", {
    location: "East US",
});

const testIdentity = new azure.authorization.UserAssignedIdentity("testIdentity", {
    location: resourceGroup.location,
    name: "search-api",
    resourceGroupName: resourceGroup.name,
});
