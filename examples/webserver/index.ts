// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azurerm";

let resourceGroup = new azure.resources.ResourceGroup(
    "acctestrg", {
        location:"West US",
        name: "acctestrg",
    }
);

let vn = new azure.virtualmachine.Network(
    "acctvn", {
        name: "acctvn",
        addressSpace: ["10.0.0.0/16"],
        location: "West US",
        resourceGroupName: resourceGroup.name
    }
);

let mysubnet = new azure.network.Subnet(
    "acctsub", {
        name:"acctsub",
        resourceGroupName: resourceGroup.name,
        virtualNetworkName: vn.name,
        addressPrefix: "10.0.2.0/24"
    }
)

let networkInterface = new azure.network.NetworkInterface(
    "acctni", {
        name: "acctni",
        location: "West US",
        resourceGroupName: resourceGroup.name,
        ipConfiguration: [
            {
                name: "testcfg1", 
                subnetId: mysubnet.id, 
                privateIpAddressAllocation: "dynamic"
            }
        ]
    }
)

let storageAccount = new azure.storage.Account(
    "accsa1", {
        resourceGroupName: resourceGroup.name,
        location: "West US",
        accountTier: "Standard",
        accountReplicationType: "LRS",
        tags: [
            {environment : "test"}]
    }
)

let storageContainer = new azure.storage.Container(
    "acctsc", {
        name: "acctsc",
        resourceGroupName: resourceGroup.name,
        storageAccountName: storageAccount.name,
        containerAccessType: "private"
    }
)

let vm = new azure.virtualmachine.VirtualMachine(
    "acctvm", {
        name: "acctvm",
        resourceGroupName: resourceGroup.name,
        location: "West US",
        networkInterfaceIds: [networkInterface.id],
        vmSize: "Standard_A0",
        deleteDataDisksOnTermination: true,
        deleteOsDiskOnTermination: true,
        osProfile: [{
            computerName: "hostname",
            adminUsername: "testadmin",
            adminPassword: "Password1234!",
        }],
        osProfileLinuxConfig: [{
            disablePasswordAuthentication: false,
        }],
        storageOsDisk: [
            {
                createOption: "FromImage",
                name: "myosdisk1"
            }
        ],
        storageImageReference: [
            {
                publisher: "canonical",
                offer: "UbuntuServer",
                sku: "16.04-LTS",
                version: "latest"
            }
        ]
    }
)