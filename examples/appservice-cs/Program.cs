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
            var resourceGroup = new ResourceGroup("appservice-rg", new ResourceGroupArgs
            {
                Location = "WestUS",
            });

            var storageAccount = new Account("sa", new AccountArgs
            {
                ResourceGroupName = resourceGroup.Name,
                AccountReplicationType = "LRS",
                AccountTier = "Standard",
            });

            var appServicePlan = new ServicePlan("asp", new ServicePlanArgs
            {
                ResourceGroupName = resourceGroup.Name,
                OsType = "Windows",
                SkuName = "B1",
            });

            var container = new Container("zips", new ContainerArgs
            {
                StorageAccountId = storageAccount.Id,
                ContainerAccessType = "private",
            });

            var blob = new Blob("zip", new BlobArgs
            {
                StorageContainerId = container.Id,
                Type = "Block",
                Source = new FileArchive("wwwroot")
            });

            var codeBlobUrl = SharedAccessSignature.SignedBlobReadUrl(blob, storageAccount);

            var app = new WindowsWebApp("app", new WindowsWebAppArgs
            {
                ResourceGroupName = resourceGroup.Name,
                ServicePlanId = appServicePlan.Id,
                SiteConfig = new WindowsWebAppSiteConfigArgs(),
                AppSettings =
                {
                    { "WEBSITE_RUN_FROM_PACKAGE", codeBlobUrl },
                },
            });

            return new Dictionary<string, object>
            {
                { "url", Output.Format($"https://{app.DefaultHostname}") },
            };

        });
    }
}
