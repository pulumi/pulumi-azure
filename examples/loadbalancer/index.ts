// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup", {
    location: "West US",
});

const storageaccount = new azure.storage.Account("storageaccount", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    accountTier: "standard",
    accountReplicationType: "LRS",
});

const avset = new azure.compute.AvailabilitySet("avset", {
    resourceGroupName:resourceGroup.name,
    location: resourceGroup.location,
    platformFaultDomainCount: 2,
    platformUpdateDomainCount: 2,
    managed: true,
});

const lbpip = new azure.network.PublicIp("lbpip", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    publicIpAddressAllocation: "dynamic",
    domainNameLabel: "pulumiazure",
});

const vnet = new azure.network.VirtualNetwork("vnet", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    addressSpaces: ["10.0.0.0/16"],
    subnets: [{
        name: "default",
        addressPrefix: "10.0.1.0/24",
    }],
});

const subnet = new azure.network.Subnet("subnet", {
    resourceGroupName: resourceGroup.name,
    virtualNetworkName: vnet.name,
    addressPrefix: "10.0.2.0/24",
});

const lb = new azure.lb.LoadBalancer("lb", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    frontendIpConfigurations: [{
        name: "LoadBalancerFrontEnd",
        publicIpAddressId: lbpip.id, 
    }],
});

const backendPool = new azure.lb.BackendAddressPool("backendPool", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    loadbalancerId: lb.id,
});

const tcp = new azure.lb.NatRule("tcp", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    loadbalancerId: lb.id,
    protocol: "tcp",
    frontendPort: 5000,
    backendPort: 3389,
    frontendIpConfigurationName: "LoadBalancerFrontEnd",
});

const lbprobe = new azure.lb.Probe("lbprobe", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    loadbalancerId: lb.id,
    protocol: "tcp",
    port: 80,
    intervalInSeconds: 5,
    numberOfProbes: 2,
});

const lbrule = new azure.lb.Rule("lbrule", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    loadbalancerId: lb.id,
    protocol: "tcp",
    frontendPort: 80,
    backendPort: 80,
    frontendIpConfigurationName: "LoadBalancerFrontEnd",
    enableFloatingIp: true,
    backendAddressPoolId: backendPool.id,
    idleTimeoutInMinutes: 5,
    probeId: lbprobe.id,
});

const networkinterface = new azure.network.NetworkInterface("networkinterface", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    ipConfigurations: [
        {
            name: "ipconfig",
            subnetId: subnet.id,
            privateIpAddressAllocation: "dynamic",
            loadBalancerBackendAddressPoolsIds: [backendPool.id],
            loadBalancerInboundNatRulesIds: [tcp.id],
        },
    ],
});

const vm = new azure.compute.VirtualMachine("vm", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    availabilitySetId: avset.id,
    vmSize: "Standard_D1",
    networkInterfaceIds: [networkinterface.id],
    storageImageReference: {
        publisher: "MicrosoftWindowsServer",
        offer: "WindowsServer",
        sku: "2012-R2-Datacenter",
        version: "latest"
    },
    osProfileWindowsConfig: {}, 
    storageOsDisk: {
        name: "osdisk",
        createOption: "FromImage"
    },
    osProfile: {
        computerName: "hostname",
        adminUsername: "testadmin",
        adminPassword: "Password1234!",
    },
});
