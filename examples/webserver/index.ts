// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azurerm";

let resourceGroup = new azure.core.ResourceGroup("webserverrg", {
        location:"West US"
});

let vn = new azure.network.VirtualNetwork("webservervn", {
        addressSpace: ["10.0.0.0/16"],
        location: resourceGroup.location,
        resourceGroupName: resourceGroup.name
});

let mysubnet = new azure.network.Subnet("webserversub", {
        resourceGroupName: resourceGroup.name,
        virtualNetworkName: vn.name,
        addressPrefix: "10.0.2.0/24"
});

let networkInterface = new azure.network.NetworkInterface("webserverni", {
        location: resourceGroup.location,
        resourceGroupName: resourceGroup.name,
        ipConfiguration: [{
                name: "webserveripcfg", 
                subnetId: mysubnet.id, 
                privateIpAddressAllocation: "dynamic"
        }]
});

let storageAccount = new azure.storage.Account("webserversa", {
        resourceGroupName: resourceGroup.name,
        location: resourceGroup.location,
        accountTier: "Standard",
        accountReplicationType: "LRS",
        tags: [
            {environment : "test"}]
});

let storageContainer = new azure.storage.Container("webserversc", {
        resourceGroupName: resourceGroup.name,
        storageAccountName: storageAccount.name,
        containerAccessType: "private"
});

let vm = new azure.compute.VirtualMachine("webservervm", {
        resourceGroupName: resourceGroup.name,
        location: resourceGroup.location,
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
        storageOsDisk: [{
                createOption: "FromImage",
                name: "myosdisk1"
        }],
        storageImageReference: [{
                publisher: "canonical",
                offer: "UbuntuServer",
                sku: "16.04-LTS",
                version: "latest"
        }]
});