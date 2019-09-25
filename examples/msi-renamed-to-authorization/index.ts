// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("msi-rg");

// In Step 2 of this test, we will make sure that the `azure.msi.UserAssignedIdentity` resource
// has been correctly Aliased to `azure.authorization.UserAssignedIdentity` this will ensure
// that the renamespacing has not broken any user's existing code
const testIdentity = new azure.msi.UserAssignedIdentity("testIdentity", {
    name: "search-api",
    resourceGroupName: resourceGroup.name,
});
