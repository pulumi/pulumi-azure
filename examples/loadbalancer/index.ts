// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";
import * as pulumi from "@pulumi/pulumi";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup");

const storageaccount = new azure.storage.Account("storageaccount", {
    resourceGroupName: resourceGroup.name,
    accountTier: "standard",
    accountReplicationType: "LRS",
});

const avset = new azure.compute.AvailabilitySet("avset", {
    resourceGroupName: resourceGroup.name,
    platformFaultDomainCount: 2,
    platformUpdateDomainCount: 2,
    managed: true,
});

const lbpip = new azure.network.PublicIp("lbpip", {
    resourceGroupName: resourceGroup.name,
    allocationMethod: "Dynamic",
    domainNameLabel: `${pulumi.getStack()}`,
});

const vnet = new azure.network.VirtualNetwork("vnet", {
    resourceGroupName: resourceGroup.name,
    addressSpaces: ["10.0.0.0/16"],
    subnets: [{
        name: "default",
        addressPrefix: "10.0.1.0/24",
    }],
});

const lb = new azure.lb.LoadBalancer("lb", {
    resourceGroupName: resourceGroup.name,
    frontendIpConfigurations: [{
        name: "LoadBalancerFrontEnd",
        publicIpAddressId: lbpip.id,
    }],
});

const backendPool = new azure.lb.BackendAddressPool("backendPool", {
    resourceGroupName: resourceGroup.name,
    loadbalancerId: lb.id,
});

const tcp = new azure.lb.NatRule("tcp", {
    resourceGroupName: resourceGroup.name,
    loadbalancerId: lb.id,
    protocol: "tcp",
    frontendPort: 5000,
    backendPort: 3389,
    frontendIpConfigurationName: "LoadBalancerFrontEnd",
});

const lbprobe = new azure.lb.Probe("lbprobe", {
    resourceGroupName: resourceGroup.name,
    loadbalancerId: lb.id,
    protocol: "tcp",
    port: 80,
    intervalInSeconds: 5,
    numberOfProbes: 2,
});

const lbrule = new azure.lb.Rule("lbrule", {
    resourceGroupName: resourceGroup.name,
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
    ipConfigurations: [
        {
            name: "ipconfig",
            subnetId: vnet.subnets[0].id,
            privateIpAddressAllocation: "dynamic",
        },
    ],
});

const backendPoolAssociation = new azure.network.NetworkInterfaceBackendAddressPoolAssociation("pool-association", {
    backendAddressPoolId: backendPool.id,
    networkInterfaceId: networkinterface.id,
    ipConfigurationName: networkinterface.ipConfigurations[0].name,
});

const natRuleAssociation = new azure.network.NetworkInterfaceNatRuleAssociation("nat-rule-association", {
    networkInterfaceId: networkinterface.id,
    ipConfigurationName: networkinterface.ipConfigurations[0].name,
    natRuleId: tcp.id,
});

const vm = new azure.compute.VirtualMachine("vm", {
    resourceGroupName: resourceGroup.name,
    availabilitySetId: avset.id,
    vmSize: "Standard_D1_v2",
    networkInterfaceIds: [networkinterface.id],
    storageImageReference: {
        publisher: "MicrosoftWindowsServer",
        offer: "WindowsServer",
        sku: "2012-R2-Datacenter",
        version: "latest",
    },
    osProfileWindowsConfig: {},
    storageOsDisk: {
        name: "osdisk",
        createOption: "FromImage",
    },
    osProfile: {
        computerName: "hostname",
        adminUsername: "testadmin",
        adminPassword: "Password1234!",
    },
});
