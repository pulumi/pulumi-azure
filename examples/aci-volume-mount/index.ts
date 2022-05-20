// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup");
// We ensure the accessTier is consistent between the storage account and the storage share to avoid any potential
// unexpected changes upon refresh:
const accessTier = "Hot";

const storageAccount = new azure.storage.Account("storageaccount", {
    resourceGroupName: resourceGroup.name,
    accountTier: "standard",
    accountReplicationType: "LRS",
    accessTier,
});

const storageShare = new azure.storage.Share("storageshare", {
    storageAccountName: storageAccount.name,
    quota: 50,
    accessTier,
});

const containerGroup = new azure.containerservice.Group("containergroup", {
    resourceGroupName: resourceGroup.name,
    ipAddressType: "public",
    osType: "linux",
    containers: [
        {
            name: "webserver",
            image: "seanmckenna/aci-hellofiles",
            cpu: 1,
            memory: 1.5,
            ports: [{port: 80, protocol: "TCP"}],
            volumes: [{
                name: "logs",
                mountPath: "/aci/logs",
                readOnly: false,
                shareName: storageShare.name,
                storageAccountName: storageAccount.name,
                storageAccountKey: storageAccount.primaryAccessKey,
            }],
        },
    ],
    tags: {
        "environment": "testing",
    },
});
