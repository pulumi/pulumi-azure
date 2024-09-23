// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";
import * as docker from "@pulumi/docker";

const resourceGroup = new azure.core.ResourceGroup("resourcegroup");
// We ensure the accessTier is consistent between the storage account and the storage share to avoid any potential
// unexpected changes upon refresh:
const accessTier = "Hot";

const storageAccount = new azure.storage.Account("storageaccount", {
  resourceGroupName: resourceGroup.name,
  accountTier: "Standard",
  accountReplicationType: "LRS",
  accessTier,
});

const storageShare = new azure.storage.Share("storageshare", {
  storageAccountName: storageAccount.name,
  quota: 50,
  accessTier,
});

const registry = new azure.containerservice.Registry("registry", {
  resourceGroupName: resourceGroup.name,
  sku: "Basic",
  adminEnabled: true,
});

var customImage = "node-app";

const image = new docker.Image("image", {
  imageName: pulumi.interpolate`${registry.loginServer}/${customImage}:v1`,
  build: { context: `./${customImage}` },
  registry: {
    server: registry.loginServer,
    username: registry.adminUsername,
    password: registry.adminPassword,
  },
});

const containerGroup = new azure.containerservice.Group("containergroup", {
  resourceGroupName: resourceGroup.name,
  ipAddressType: "Public",
  osType: "Linux",
  imageRegistryCredentials: [
    {
      server: registry.loginServer,
      username: registry.adminUsername,
      password: registry.adminPassword,
    },
  ],
  containers: [
    {
      name: "webserver",
      image: image.imageName,
      cpu: 1,
      memory: 1.5,
      ports: [{ port: 80, protocol: "TCP" }],
      volumes: [
        {
          name: "logs",
          mountPath: "/aci/logs",
          readOnly: false,
          shareName: storageShare.name,
          storageAccountName: storageAccount.name,
          storageAccountKey: storageAccount.primaryAccessKey,
        },
      ],
    },
  ],
  tags: {
    environment: "testing",
  },
});
