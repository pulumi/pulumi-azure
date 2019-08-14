// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("aks");

const testIdentity = new azure.authorization.UserAssignedIdentity("testIdentity", {
    name: "search-api",
    resourceGroupName: resourceGroup.name,
});
