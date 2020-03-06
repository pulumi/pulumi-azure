// Copyright 2016-2019, Pulumi Corporation.  All rights reserved.

using System.Collections.Generic;
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

            var blob = new ZipBlob("zip", new ZipBlobArgs
            {
                StorageAccountName = storageAccount.Name,
                StorageContainerName = container.Name,
                Type = "Block",
                Content = new FileArchive("wwwroot"),
            });

            var codeBlobUrl = SharedAccessSignature.SignedBlobReadUrl(blob, storageAccount);

            var app = new AppService("app", new AppServiceArgs
            {
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
}
