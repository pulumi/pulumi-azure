// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup");

const storageAccount = new azure.storage.Account("storageaccount", {
    resourceGroupName: resourceGroup.name,
    accountTier: "standard",
    accountReplicationType: "LRS",
});

const storageShare = new azure.storage.Share("storageshare", {
    resourceGroupName: resourceGroup.name,
    storageAccountName: storageAccount.name,
    quota: 50,
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
            port: 80,
            protocol: "tcp",
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
