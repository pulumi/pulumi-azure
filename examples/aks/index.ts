// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

import * as azure from "@pulumi/azure";
import * as pulumi from "@pulumi/pulumi";

const config = new pulumi.Config("aks");
const sshPublicKey = config.require("sshPublicKey");
const clientId = config.require("clientId");
const clientSecret = config.require("clientSecret");

const resourceGroup = new azure.core.ResourceGroup("aks", {
    location: "East US",
});

const kubernetesService = new azure.containerservice.KubernetesCluster("kubernetes", {
    resourceGroupName: resourceGroup.name,
    location: resourceGroup.location,
    agentPoolProfile: {
        name: "agentpool",
        count: 2,
        vmSize: "Standard_D2_v2",
    },
    dnsPrefix: `${pulumi.getStack()}-kubernetes`,
    linuxProfile: {
        adminUsername: "azureuser",
        sshKeys: [{
            keyData: sshPublicKey,
        }],
    },
    servicePrincipal: {
        clientId: clientId,
        clientSecret: clientSecret,
    },
}); 

export const kubeConfigRaw = kubernetesService.kubeConfigRaw;