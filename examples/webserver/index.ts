// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const name = "webserver";

let resourceGroup = new azure.core.ResourceGroup(name);

let network = new azure.network.VirtualNetwork(name, {
    resourceGroupName: resourceGroup.name,
    addressSpaces: ["10.0.0.0/16"],
    subnets: [{
        name: "default",
        addressPrefix: "10.0.1.0/24",
    }],
});

let networkInterface = new azure.network.NetworkInterface(name, {
    resourceGroupName: resourceGroup.name,
    ipConfigurations: [{
        name: "webserveripcfg",
        subnetId: network.subnets[0].id,
        privateIpAddressAllocation: "Dynamic",
    }],
});

let vm = new azure.compute.VirtualMachine("webservervm", {
    resourceGroupName: resourceGroup.name,
    networkInterfaceIds: [networkInterface.id],
    vmSize: "Standard_B1ls",
    deleteDataDisksOnTermination: true,
    deleteOsDiskOnTermination: true,
    osProfile: {
        computerName: "hostname",
        adminUsername: "testadmin",
        adminPassword: "Password1234!",
    },
    osProfileLinuxConfig: {
        disablePasswordAuthentication: false,
    },
    storageOsDisk: {
        createOption: "FromImage",
        name: "myosdisk1",
    },
    storageImageReference: {
        publisher: "canonical",
        offer: "UbuntuServer",
        sku: "16.04-LTS",
        version: "latest",
    },
});
