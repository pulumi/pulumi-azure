import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup");

const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
    addressSpaces: ["10.0.0.0/16"],
    location: exampleResourceGroup.location,
    resourceGroupName: exampleResourceGroup.name,
});
const exampleSubnet = new azure.network.Subnet("exampleSubnet", {
    resourceGroupName: exampleResourceGroup.name,
    virtualNetworkName: exampleVirtualNetwork.name,
    addressPrefixes: ["10.0.2.0/24"],
});
const exampleNetworkInterface = new azure.network.NetworkInterface("exampleNetworkInterface", {
    location: exampleResourceGroup.location,
    resourceGroupName: exampleResourceGroup.name,
    ipConfigurations: [{
        name: "internal",
        subnetId: exampleSubnet.id,
        privateIpAddressAllocation: "Dynamic",
    }],
});
const exampleLinuxVirtualMachine = new azure.compute.LinuxVirtualMachine("exampleLinuxVirtualMachine", {
    resourceGroupName: exampleResourceGroup.name,
    location: exampleResourceGroup.location,
    size: "Standard_B2ts_v2",
    adminUsername: "adminuser",
    networkInterfaceIds: [exampleNetworkInterface.id],
    adminSshKeys: [{
        username: "adminuser",
        publicKey: "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDcn5KndQimiRsJc1FE5Oq9qbtxFqkO1UvbLa1gkhBrOVANwlm1w+6eMa9+fHjFnuRgr+DudC93u7pNytH4qeRYiGtw9/Lbp7sKTIPe7dJfZvbAGW/3nVMQK0lE+gKEMQ6GVeHq0wecoOMac5ZUHrc4jyrtwrcOQSPVEgJB9d7rlY2mHuNS5ODlGxAEKdovM0Kb0/FHDQOiqVz9tI/hRAow2bygaid2nwhgAiT4ar7gWgQXfxrGp7xurfGZz7mQP8wyHMle4qykZKqKMYbsEbDvpOK7351uwGqgviDS6F1qrJ7zEyK/XYLOeXiNWD7shvSbM8N9ExZXPzc+53OEFS2VISYCTELFch9gfib/6VGducFlZAxu5qKCdS0KxVQUrqgUTdbW6PmRiEoyszN822iuAZ/9yCYqU5XM4zKs6BKXUMQmouYeHQEMBw6AsQTS0s/bmCml9FOePim6lwcgZ6jZDIFY9amMzD6PJ/c2jiVfqHgTMe9gm0C0DpZH4rD5kfJF/s36acvFTxR9A/XfKk4EOC4VXWLd3C2C6MO2bHL90WqkNT0IabwDhecCDTrE6ZCrgG6b0fvBHKxwV0j7jWATgQlytXCcGqdZBtTY4MXYlT+TbTTxxD1VeJ8CJa34Hcike5Fgbgh96iSIxSO3ekmH1jYpGcVSGOS5gES8l3BfIQ==\n",
    }],
    osDisk: {
        caching: "ReadWrite",
        storageAccountType: "Standard_LRS",
    },
    sourceImageReference: {
        publisher: "Canonical",
        offer: "ubuntu-24_04-lts",
        sku: "minimal",
        version: "latest",
    },
});
