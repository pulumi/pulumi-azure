// Copyright 2016-2019, Pulumi Corporation.  All rights reserved.

using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;

using Pulumi;
using Pulumi.Azure.AppService;
using Pulumi.Azure.AppService.Inputs;
using Pulumi.Azure.Core;
using Pulumi.Azure.Storage;

class Program
{
    static Task<int> Main(string[] args)
    {
        return Deployment.RunAsync(() => {
            var resourceGroup = new ResourceGroup("appservice-rg");

            var storageAccount = new Account("sa", new AccountArgs
            {
                ResourceGroupName = resourceGroup.Name,
                AccountReplicationType = "LRS",
                AccountTier = "Standard",
            });

            var appServicePlan = new Plan("asp", new PlanArgs
            {
                ResourceGroupName = resourceGroup.Name,
                Kind = "App",
                Sku = new PlanSkuArgs
                {
                    Tier = "Basic",
                    Size = "B1",
                },
            });

            var container = new Container("zips", new ContainerArgs
            {
                StorageAccountName = storageAccount.Name,
                ContainerAccessType = "private",
            });

            var blob = new Blob("zip", new BlobArgs
            {
                StorageAccountName = storageAccount.Name,
                StorageContainerName = container.Name,
                Type = "Block",
                Source = new FileArchive("wwwroot")
            });

            var codeBlobUrl = SharedAccessSignature.SignedBlobReadUrl(blob, storageAccount);

            var app = new AppService("app", new AppServiceArgs
            {
                Name = "pulumi" + getRandomString(10),
                ResourceGroupName = resourceGroup.Name,
                AppServicePlanId = appServicePlan.Id,
                AppSettings =
                {
                    { "WEBSITE_RUN_FROM_PACKAGE", codeBlobUrl },
                },
            });

            return new Dictionary<string, object>
            {
                { "url", Output.Format($"https://{app.DefaultSiteHostname}") },
            };

        });
    }
    
    private static string getRandomString(int stringLength)
    {
        StringBuilder sb = new StringBuilder();
        int numGuidsToConcat = (((stringLength - 1) / 32) + 1);
        for(int i = 1; i <= numGuidsToConcat; i++)
        {
            sb.Append(Guid.NewGuid().ToString("N"));
        }

        return sb.ToString(0, stringLength);
    }
}
