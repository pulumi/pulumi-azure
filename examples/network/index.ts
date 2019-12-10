// Copyright 2016-2019, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

let resourceGroup = new azure.core.ResourceGroup("network");

let network = new azure.network.VirtualNetwork("vnet", {
    resourceGroupName: resourceGroup.name,
    addressSpaces: ["10.0.0.0/16"],
});

const subnet = new azure.network.Subnet("subnet", {
  resourceGroupName: resourceGroup.name,
  virtualNetworkName: network.name,
  addressPrefix: "10.0.1.0/24",
});
