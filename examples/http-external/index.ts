import * as pulumi from "@pulumi/pulumi";
import * as azure from "@pulumi/azure";

const resourceGroup = new azure.core.ResourceGroup('example', { location: 'West US 2' });

// Create a Function App implemented in PowerShell with source code from 'funcapp' folder
const app = new azure.appservice.ArchiveFunctionApp("http-ps", {
    resourceGroupName: resourceGroup.name,
    archive: new pulumi.asset.FileArchive("./funcapp"),
    appSettings: {
      "runtime": "powershell",
    }
});

export const url = app.endpoint.apply(ep => `${ep}HelloPS?name=Pulumi`);
