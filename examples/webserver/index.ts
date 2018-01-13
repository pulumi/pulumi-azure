// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azurerm";

const name = "webserver";

let resourceGroup = new azure.core.ResourceGroup(name, {
    location: "West US",
});

let network = new azure.network.VirtualNetwork(name, {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    addressSpace: ["10.0.0.0/16"],
});

let subnet = new azure.network.Subnet(name, {
    resourceGroupName: resourceGroup.name,
    virtualNetworkName: network.name,
    addressPrefix: "10.0.2.0/24",
});

let networkInterface = new azure.network.NetworkInterface(name, {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    ipConfiguration: [{
        name: "webserveripcfg",
        subnetId: subnet.id,
        privateIpAddressAllocation: "dynamic",
    }],
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
        name: "myosdisk1",
    }],
    storageImageReference: [{
        publisher: "canonical",
        offer: "UbuntuServer",
        sku: "16.04-LTS",
        version: "latest",
    }],
});