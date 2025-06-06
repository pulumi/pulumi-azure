// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MachineLearning
{
    /// <summary>
    /// Manages an Azure Machine Learning Workspace Network Outbound Rule Service Tag.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Azure.Core.GetClientConfig.Invoke();
    /// 
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleInsights = new Azure.AppInsights.Insights("example", new()
    ///     {
    ///         Name = "workspace-example-ai",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         ApplicationType = "web",
    ///     });
    /// 
    ///     var exampleKeyVault = new Azure.KeyVault.KeyVault("example", new()
    ///     {
    ///         Name = "workspaceexamplekeyvault",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         TenantId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.TenantId),
    ///         SkuName = "premium",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "workspacestorageaccount",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "GRS",
    ///     });
    /// 
    ///     var exampleWorkspace = new Azure.MachineLearning.Workspace("example", new()
    ///     {
    ///         Name = "example-workspace",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         ApplicationInsightsId = exampleInsights.Id,
    ///         KeyVaultId = exampleKeyVault.Id,
    ///         StorageAccountId = exampleAccount.Id,
    ///         ManagedNetwork = new Azure.MachineLearning.Inputs.WorkspaceManagedNetworkArgs
    ///         {
    ///             IsolationMode = "AllowOnlyApprovedOutbound",
    ///         },
    ///         Identity = new Azure.MachineLearning.Inputs.WorkspaceIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    ///     var exampleWorkspaceNetworkOutboundRuleServiceTag = new Azure.MachineLearning.WorkspaceNetworkOutboundRuleServiceTag("example", new()
    ///     {
    ///         Name = "example-outboundrule",
    ///         WorkspaceId = exampleWorkspace.Id,
    ///         ServiceTag = "AppService",
    ///         Protocol = "TCP",
    ///         PortRanges = "443",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.MachineLearningServices`: 2024-04-01
    /// 
    /// ## Import
    /// 
    /// Machine Learning Workspace Network Outbound Rule Service Tag can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:machinelearning/workspaceNetworkOutboundRuleServiceTag:WorkspaceNetworkOutboundRuleServiceTag example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.MachineLearningServices/workspaces/workspace1/outboundRules/rule1
    /// ```
    /// </summary>
    [AzureResourceType("azure:machinelearning/workspaceNetworkOutboundRuleServiceTag:WorkspaceNetworkOutboundRuleServiceTag")]
    public partial class WorkspaceNetworkOutboundRuleServiceTag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the name of the Machine Learning Workspace Network Outbound Rule Service Tag. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies which ports traffic will be allowed by this rule. You can specify a single port (e.g. ` 80`) ,  a port range  (e.g. `1024-655535`) or a comma-separated list of single ports and/or port ranges(e.g. `80,1024-655535`). `*` can be used to allow traffic on any port.
        /// </summary>
        [Output("portRanges")]
        public Output<string> PortRanges { get; private set; } = null!;

        /// <summary>
        /// Specifies the network protocol. Possible values are `*`, `TCP`, `UDP` and `ICMP`
        /// </summary>
        [Output("protocol")]
        public Output<string> Protocol { get; private set; } = null!;

        /// <summary>
        /// Specifies the fully qualified domain name to allow for outbound traffic. Possible values are `AppConfiguration`,`AppService`,`AzureActiveDirectory`,`AzureAdvancedThreatProtection`,`AzureArcInfrastructure`,`AzureAttestation`,`AzureBackup`,`AzureBotService`,`AzureContainerRegistry`,`AzureCosmosDB`,`AzureDataLake`,`AzureDevSpaces`,`AzureInformationProtection`,`AzureIoTHub`,`AzureKeyVault`,`AzureManagedGrafana`,`AzureMonitor`,`AzureOpenDatasets`,`AzurePlatformDNS`,`AzurePlatformIMDS`,`AzurePlatformLKM`,`AzureResourceManager`,`AzureSignalR`,`AzureSiteRecovery`,`AzureSpringCloud`,`AzureStack`,`AzureUpdateDelivery`,`DataFactoryManagement`,`EventHub`,`GuestAndHybridManagement`,`M365ManagementActivityApi`,`M365ManagementActivityApi`,`MicrosoftAzureFluidRelay`,`MicrosoftCloudAppSecurity`,`MicrosoftContainerRegistry`,`PowerPlatformInfra`,`ServiceBus`,`Sql`,`Storage`,`WindowsAdminCenter`,`AppServiceManagement`,`AutonomousDevelopmentPlatform`,`AzureActiveDirectoryDomainServices`,`AzureCloud`,`AzureConnectors`,`AzureContainerAppsService`,`AzureDatabricks`,`AzureDeviceUpdate`,`AzureEventGrid`,`AzureFrontDoor.Frontend`,`AzureFrontDoor.Backend`,`AzureFrontDoor.FirstParty`,`AzureHealthcareAPIs`,`AzureLoadBalancer`,`AzureMachineLearning`,`AzureSphere`,`AzureWebPubSub`,`BatchNodeManagement`,`ChaosStudio`,`CognitiveServicesFrontend`,`CognitiveServicesManagement`,`DataFactory`,`Dynamics365ForMarketingEmail`,`Dynamics365BusinessCentral`,`EOPExternalPublishedIPs`,`Internet`,`LogicApps`,`Marketplace`,`MicrosoftDefenderForEndpoint`,`PowerBI`,`PowerQueryOnline`,`ServiceFabric`,`SqlManagement`,`StorageSyncService`,`WindowsVirtualDesktop` and `VirtualNetwork`.
        /// </summary>
        [Output("serviceTag")]
        public Output<string> ServiceTag { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Machine Learning Workspace. Changing this forces a new resource to be created.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a WorkspaceNetworkOutboundRuleServiceTag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkspaceNetworkOutboundRuleServiceTag(string name, WorkspaceNetworkOutboundRuleServiceTagArgs args, CustomResourceOptions? options = null)
            : base("azure:machinelearning/workspaceNetworkOutboundRuleServiceTag:WorkspaceNetworkOutboundRuleServiceTag", name, args ?? new WorkspaceNetworkOutboundRuleServiceTagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkspaceNetworkOutboundRuleServiceTag(string name, Input<string> id, WorkspaceNetworkOutboundRuleServiceTagState? state = null, CustomResourceOptions? options = null)
            : base("azure:machinelearning/workspaceNetworkOutboundRuleServiceTag:WorkspaceNetworkOutboundRuleServiceTag", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WorkspaceNetworkOutboundRuleServiceTag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkspaceNetworkOutboundRuleServiceTag Get(string name, Input<string> id, WorkspaceNetworkOutboundRuleServiceTagState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkspaceNetworkOutboundRuleServiceTag(name, id, state, options);
        }
    }

    public sealed class WorkspaceNetworkOutboundRuleServiceTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Machine Learning Workspace Network Outbound Rule Service Tag. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies which ports traffic will be allowed by this rule. You can specify a single port (e.g. ` 80`) ,  a port range  (e.g. `1024-655535`) or a comma-separated list of single ports and/or port ranges(e.g. `80,1024-655535`). `*` can be used to allow traffic on any port.
        /// </summary>
        [Input("portRanges", required: true)]
        public Input<string> PortRanges { get; set; } = null!;

        /// <summary>
        /// Specifies the network protocol. Possible values are `*`, `TCP`, `UDP` and `ICMP`
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        /// <summary>
        /// Specifies the fully qualified domain name to allow for outbound traffic. Possible values are `AppConfiguration`,`AppService`,`AzureActiveDirectory`,`AzureAdvancedThreatProtection`,`AzureArcInfrastructure`,`AzureAttestation`,`AzureBackup`,`AzureBotService`,`AzureContainerRegistry`,`AzureCosmosDB`,`AzureDataLake`,`AzureDevSpaces`,`AzureInformationProtection`,`AzureIoTHub`,`AzureKeyVault`,`AzureManagedGrafana`,`AzureMonitor`,`AzureOpenDatasets`,`AzurePlatformDNS`,`AzurePlatformIMDS`,`AzurePlatformLKM`,`AzureResourceManager`,`AzureSignalR`,`AzureSiteRecovery`,`AzureSpringCloud`,`AzureStack`,`AzureUpdateDelivery`,`DataFactoryManagement`,`EventHub`,`GuestAndHybridManagement`,`M365ManagementActivityApi`,`M365ManagementActivityApi`,`MicrosoftAzureFluidRelay`,`MicrosoftCloudAppSecurity`,`MicrosoftContainerRegistry`,`PowerPlatformInfra`,`ServiceBus`,`Sql`,`Storage`,`WindowsAdminCenter`,`AppServiceManagement`,`AutonomousDevelopmentPlatform`,`AzureActiveDirectoryDomainServices`,`AzureCloud`,`AzureConnectors`,`AzureContainerAppsService`,`AzureDatabricks`,`AzureDeviceUpdate`,`AzureEventGrid`,`AzureFrontDoor.Frontend`,`AzureFrontDoor.Backend`,`AzureFrontDoor.FirstParty`,`AzureHealthcareAPIs`,`AzureLoadBalancer`,`AzureMachineLearning`,`AzureSphere`,`AzureWebPubSub`,`BatchNodeManagement`,`ChaosStudio`,`CognitiveServicesFrontend`,`CognitiveServicesManagement`,`DataFactory`,`Dynamics365ForMarketingEmail`,`Dynamics365BusinessCentral`,`EOPExternalPublishedIPs`,`Internet`,`LogicApps`,`Marketplace`,`MicrosoftDefenderForEndpoint`,`PowerBI`,`PowerQueryOnline`,`ServiceFabric`,`SqlManagement`,`StorageSyncService`,`WindowsVirtualDesktop` and `VirtualNetwork`.
        /// </summary>
        [Input("serviceTag", required: true)]
        public Input<string> ServiceTag { get; set; } = null!;

        /// <summary>
        /// Specifies the ID of the Machine Learning Workspace. Changing this forces a new resource to be created.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public WorkspaceNetworkOutboundRuleServiceTagArgs()
        {
        }
        public static new WorkspaceNetworkOutboundRuleServiceTagArgs Empty => new WorkspaceNetworkOutboundRuleServiceTagArgs();
    }

    public sealed class WorkspaceNetworkOutboundRuleServiceTagState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Machine Learning Workspace Network Outbound Rule Service Tag. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies which ports traffic will be allowed by this rule. You can specify a single port (e.g. ` 80`) ,  a port range  (e.g. `1024-655535`) or a comma-separated list of single ports and/or port ranges(e.g. `80,1024-655535`). `*` can be used to allow traffic on any port.
        /// </summary>
        [Input("portRanges")]
        public Input<string>? PortRanges { get; set; }

        /// <summary>
        /// Specifies the network protocol. Possible values are `*`, `TCP`, `UDP` and `ICMP`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Specifies the fully qualified domain name to allow for outbound traffic. Possible values are `AppConfiguration`,`AppService`,`AzureActiveDirectory`,`AzureAdvancedThreatProtection`,`AzureArcInfrastructure`,`AzureAttestation`,`AzureBackup`,`AzureBotService`,`AzureContainerRegistry`,`AzureCosmosDB`,`AzureDataLake`,`AzureDevSpaces`,`AzureInformationProtection`,`AzureIoTHub`,`AzureKeyVault`,`AzureManagedGrafana`,`AzureMonitor`,`AzureOpenDatasets`,`AzurePlatformDNS`,`AzurePlatformIMDS`,`AzurePlatformLKM`,`AzureResourceManager`,`AzureSignalR`,`AzureSiteRecovery`,`AzureSpringCloud`,`AzureStack`,`AzureUpdateDelivery`,`DataFactoryManagement`,`EventHub`,`GuestAndHybridManagement`,`M365ManagementActivityApi`,`M365ManagementActivityApi`,`MicrosoftAzureFluidRelay`,`MicrosoftCloudAppSecurity`,`MicrosoftContainerRegistry`,`PowerPlatformInfra`,`ServiceBus`,`Sql`,`Storage`,`WindowsAdminCenter`,`AppServiceManagement`,`AutonomousDevelopmentPlatform`,`AzureActiveDirectoryDomainServices`,`AzureCloud`,`AzureConnectors`,`AzureContainerAppsService`,`AzureDatabricks`,`AzureDeviceUpdate`,`AzureEventGrid`,`AzureFrontDoor.Frontend`,`AzureFrontDoor.Backend`,`AzureFrontDoor.FirstParty`,`AzureHealthcareAPIs`,`AzureLoadBalancer`,`AzureMachineLearning`,`AzureSphere`,`AzureWebPubSub`,`BatchNodeManagement`,`ChaosStudio`,`CognitiveServicesFrontend`,`CognitiveServicesManagement`,`DataFactory`,`Dynamics365ForMarketingEmail`,`Dynamics365BusinessCentral`,`EOPExternalPublishedIPs`,`Internet`,`LogicApps`,`Marketplace`,`MicrosoftDefenderForEndpoint`,`PowerBI`,`PowerQueryOnline`,`ServiceFabric`,`SqlManagement`,`StorageSyncService`,`WindowsVirtualDesktop` and `VirtualNetwork`.
        /// </summary>
        [Input("serviceTag")]
        public Input<string>? ServiceTag { get; set; }

        /// <summary>
        /// Specifies the ID of the Machine Learning Workspace. Changing this forces a new resource to be created.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public WorkspaceNetworkOutboundRuleServiceTagState()
        {
        }
        public static new WorkspaceNetworkOutboundRuleServiceTagState Empty => new WorkspaceNetworkOutboundRuleServiceTagState();
    }
}
