// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup", {
    location: "West US",
});

const containerGroup = new azure.containerservice.Group("containergroup", {
    location: resourceGroup.location,
    resourceGroupName: resourceGroup.name,
    ipAddressType: "public",
    osType: "linux",
    containers: [
        {
            name: "hw",
            image: "microsoft/aci-helloworld:latest",
            cpu: 0.5,
            memory: 1.5,
            port: 80
        },
        {
            name: "sidecar",
            image: "microsoft/aci-tutorial-sidecar",
            cpu: 0.5,
            memory: 1.5,
        },
    ],
    tags: {
        "environment": "testing",
    },
});

const network = new azure.network.VirtualNetwork("network", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    addressSpaces: ["10.0.0.0/16"],
    // Workaround two issues:
    // (1) The Azure API recently regressed and now fails when no subnets are defined at Network creation time.
    // (2) The Azure Terraform provider does not return the ID of the created subnets - so this cannot actually be used.
    subnets: [{
        name: "default",
        addressPrefix: "10.0.1.0/24",
    }],
});

const subnet = new azure.network.Subnet("subnet", {
    resourceGroupName: resourceGroup.name,
    virtualNetworkName: network.name,
    addressPrefix: "10.0.2.0/24",
});

const networkInterface = new azure.network.NetworkInterface("networkinterface", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    ipConfigurations: [{
        name: "webserveripcfg",
        subnetId: subnet.id,
        privateIpAddressAllocation: "dynamic",
    }],
});

const vm = new azure.compute.VirtualMachine("webservervm", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    networkInterfaceIds: [networkInterface.id],
    vmSize: "Standard_A0",
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