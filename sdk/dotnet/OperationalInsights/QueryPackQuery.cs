// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.OperationalInsights
{
    /// <summary>
    /// Manages a Log Analytics Query Pack Query.
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
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleQueryPack = new Azure.LogAnalytics.QueryPack("example", new()
    ///     {
    ///         Name = "example-laqp",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///     });
    /// 
    ///     var exampleQueryPackQuery = new Azure.OperationalInsights.QueryPackQuery("example", new()
    ///     {
    ///         Name = "19952bc3-0bf9-49eb-b713-6b80e7a41847",
    ///         QueryPackId = exampleQueryPack.Id,
    ///         Body = @"let newExceptionsTimeRange = 1d;
    /// let timeRangeToCheckBefore = 7d;
    /// exceptions
    /// | where timestamp &lt; ago(timeRangeToCheckBefore)
    /// | summarize count() by problemId
    /// | join kind= rightanti (
    /// exceptions
    /// | where timestamp &gt;= ago(newExceptionsTimeRange)
    /// | extend stack = tostring(details[0].rawStack)
    /// | summarize count(), dcount(user_AuthenticatedId), min(timestamp), max(timestamp), any(stack) by problemId  
    /// ) on problemId 
    /// | order by  count_ desc
    /// ",
    ///         DisplayName = "Exceptions - New in the last 24 hours",
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
    /// * `Microsoft.OperationalInsights`: 2019-09-01
    /// 
    /// ## Import
    /// 
    /// Log Analytics Query Pack Queries can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:operationalinsights/queryPackQuery:QueryPackQuery example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.OperationalInsights/queryPacks/queryPack1/queries/15b49e87-8555-4d92-8a7b-2014b469a9df
    /// ```
    /// </summary>
    [AzureResourceType("azure:operationalinsights/queryPackQuery:QueryPackQuery")]
    public partial class QueryPackQuery : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The additional properties that can be set for the Log Analytics Query Pack Query.
        /// </summary>
        [Output("additionalSettingsJson")]
        public Output<string?> AdditionalSettingsJson { get; private set; } = null!;

        /// <summary>
        /// The body of the Log Analytics Query Pack Query.
        /// </summary>
        [Output("body")]
        public Output<string> Body { get; private set; } = null!;

        /// <summary>
        /// A list of the related categories for the function. Possible values are `applications`, `audit`, `container`, `databases`, `desktopanalytics`, `management`, `monitor`, `network`, `resources`, `security`, `virtualmachines`, `windowsvirtualdesktop` and `workloads`.
        /// </summary>
        [Output("categories")]
        public Output<ImmutableArray<string>> Categories { get; private set; } = null!;

        /// <summary>
        /// The description of the Log Analytics Query Pack Query.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The unique display name for the query within the Log Analytics Query Pack.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// An unique UUID/GUID which identifies this Log Analytics Query Pack Query - one will be generated if not specified. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Log Analytics Query Pack. Changing this forces a new resource to be created.
        /// </summary>
        [Output("queryPackId")]
        public Output<string> QueryPackId { get; private set; } = null!;

        /// <summary>
        /// A list of the related resource types for the function. Possible values are `default`, `microsoft.aad/domainservices`, `microsoft.aadiam/tenants`, `microsoft.agfoodplatform/farmbeats`, `microsoft.analysisservices/servers`, `microsoft.apimanagement/service`, `microsoft.appconfiguration/configurationstores`, `microsoft.appplatform/spring`, `microsoft.attestation/attestationproviders`, `microsoft.authorization/tenants`, `microsoft.automation/automationaccounts`, `microsoft.autonomousdevelopmentplatform/accounts`, `microsoft.azurestackhci/virtualmachines`, `microsoft.batch/batchaccounts`, `microsoft.blockchain/blockchainmembers`, `microsoft.botservice/botservices`, `microsoft.cache/redis`, `microsoft.cdn/profiles`, `microsoft.cognitiveservices/accounts`, `microsoft.communication/communicationservices`, `microsoft.compute/virtualmachines`, `microsoft.compute/virtualmachinescalesets`, `microsoft.connectedcache/cachenodes`, `microsoft.connectedvehicle/platformaccounts`, `microsoft.conenctedvmwarevsphere/virtualmachines`, `microsoft.containerregistry/registries`, `microsoft.containerservice/managedclusters`, `microsoft.d365customerinsights/instances`, `microsoft.dashboard/grafana`, `microsoft.databricks/workspaces`, `microsoft.datacollaboration/workspaces`, `microsoft.datafactory/factories`, `microsoft.datalakeanalytics/accounts`, `microsoft.datalakestore/accounts`, `microsoft.datashare/accounts`, `microsoft.dbformariadb/servers`, `microsoft.dbformysql/servers`, `microsoft.dbforpostgresql/flexibleservers`, `microsoft.dbforpostgresql/servers`, `microsoft.dbforpostgresql/serversv2`, `microsoft.digitaltwins/digitaltwinsinstances`, `microsoft.documentdb/cassandraclusters`, `microsoft.documentdb/databaseaccounts`, `microsoft.desktopvirtualization/applicationgroups`, `microsoft.desktopvirtualization/hostpools`, `microsoft.desktopvirtualization/workspaces`, `microsoft.devices/iothubs`, `microsoft.devices/provisioningservices`, `microsoft.dynamics/fraudprotection/purchase`, `microsoft.eventgrid/domains`, `microsoft.eventgrid/topics`, `microsoft.eventgrid/partnernamespaces`, `microsoft.eventgrid/partnertopics`, `microsoft.eventgrid/systemtopics`, `microsoft.eventhub/namespaces`, `microsoft.experimentation/experimentworkspaces`, `microsoft.hdinsight/clusters`, `microsoft.healthcareapis/services`, `microsoft.informationprotection/datasecuritymanagement`, `microsoft.intune/operations`, `microsoft.insights/autoscalesettings`, `microsoft.insights/components`, `microsoft.insights/workloadmonitoring`, `microsoft.keyvault/vaults`, `microsoft.kubernetes/connectedclusters`, `microsoft.kusto/clusters`, `microsoft.loadtestservice/loadtests`, `microsoft.logic/workflows`, `microsoft.machinelearningservices/workspaces`, `microsoft.media/mediaservices`, `microsoft.netapp/netappaccounts/capacitypools`, `microsoft.network/applicationgateways`, `microsoft.network/azurefirewalls`, `microsoft.network/bastionhosts`, `microsoft.network/expressroutecircuits`, `microsoft.network/frontdoors`, `microsoft.network/loadbalancers`, `microsoft.network/networkinterfaces`, `microsoft.network/networksecuritygroups`, `microsoft.network/networksecurityperimeters`, `microsoft.network/networkwatchers/connectionmonitors`, `microsoft.network/networkwatchers/trafficanalytics`, `microsoft.network/publicipaddresses`, `microsoft.network/trafficmanagerprofiles`, `microsoft.network/virtualnetworks`, `microsoft.network/virtualnetworkgateways`, `microsoft.network/vpngateways`, `microsoft.networkfunction/azuretrafficcollectors`, `microsoft.openenergyplatform/energyservices`, `microsoft.openlogisticsplatform/workspaces`, `microsoft.operationalinsights/workspaces`, `microsoft.powerbi/tenants`, `microsoft.powerbi/tenants/workspaces`, `microsoft.powerbidedicated/capacities`, `microsoft.purview/accounts`, `microsoft.recoveryservices/vaults`, `microsoft.resources/azureactivity`, `microsoft.scvmm/virtualmachines`, `microsoft.search/searchservices`, `microsoft.security/antimalwaresettings`, `microsoft.securityinsights/amazon`, `microsoft.securityinsights/anomalies`, `microsoft.securityinsights/cef`, `microsoft.securityinsights/datacollection`, `microsoft.securityinsights/dnsnormalized`, `microsoft.securityinsights/mda`, `microsoft.securityinsights/mde`, `microsoft.securityinsights/mdi`, `microsoft.securityinsights/mdo`, `microsoft.securityinsights/networksessionnormalized`, `microsoft.securityinsights/office365`, `microsoft.securityinsights/purview`, `microsoft.securityinsights/securityinsights`, `microsoft.securityinsights/securityinsights/mcas`, `microsoft.securityinsights/tvm`, `microsoft.securityinsights/watchlists`, `microsoft.servicebus/namespaces`, `microsoft.servicefabric/clusters`, `microsoft.signalrservice/signalr`, `microsoft.signalrservice/webpubsub`, `microsoft.sql/managedinstances`, `microsoft.sql/servers`, `microsoft.sql/servers/databases`, `microsoft.storage/storageaccounts`, `microsoft.storagecache/caches`, `microsoft.streamanalytics/streamingjobs`, `microsoft.synapse/workspaces`, `microsoft.timeseriesinsights/environments`, `microsoft.videoindexer/accounts`, `microsoft.web/sites`, `microsoft.workloadmonitor/monitors`, `resourcegroup` and `subscription`.
        /// </summary>
        [Output("resourceTypes")]
        public Output<ImmutableArray<string>> ResourceTypes { get; private set; } = null!;

        /// <summary>
        /// A list of the related Log Analytics solutions for the function. Possible values are `AADDomainServices`, `ADAssessment`, `ADAssessmentPlus`, `ADReplication`, `ADSecurityAssessment`, `AlertManagement`, `AntiMalware`, `ApplicationInsights`, `AzureAssessment`, `AzureSecurityOfThings`, `AzureSentinelDSRE`, `AzureSentinelPrivatePreview`, `BehaviorAnalyticsInsights`, `ChangeTracking`, `CompatibilityAssessment`, `ContainerInsights`, `Containers`, `CustomizedWindowsEventsFiltering`, `DeviceHealthProd`, `DnsAnalytics`, `ExchangeAssessment`, `ExchangeOnlineAssessment`, `IISAssessmentPlus`, `InfrastructureInsights`, `InternalWindowsEvent`, `LogManagement`, `Microsoft365Analytics`, `NetworkMonitoring`, `SCCMAssessmentPlus`, `SCOMAssessment`, `SCOMAssessmentPlus`, `Security`, `SecurityCenter`, `SecurityCenterFree`, `SecurityInsights`, `ServiceMap`, `SfBAssessment`, `SfBOnlineAssessment`, `SharePointOnlineAssessment`, `SPAssessment`, `SQLAdvancedThreatProtection`, `SQLAssessment`, `SQLAssessmentPlus`, `SQLDataClassification`, `SQLThreatDetection`, `SQLVulnerabilityAssessment`, `SurfaceHub`, `Updates`, `VMInsights`, `WEFInternalUat`, `WEF_10x`, `WEF_10xDSRE`, `WaaSUpdateInsights`, `WinLog`, `WindowsClientAssessmentPlus`, `WindowsEventForwarding`, `WindowsFirewall`, `WindowsServerAssessment`, `WireData` and `WireData2`.
        /// </summary>
        [Output("solutions")]
        public Output<ImmutableArray<string>> Solutions { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Log Analytics Query Pack Query.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a QueryPackQuery resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public QueryPackQuery(string name, QueryPackQueryArgs args, CustomResourceOptions? options = null)
            : base("azure:operationalinsights/queryPackQuery:QueryPackQuery", name, args ?? new QueryPackQueryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private QueryPackQuery(string name, Input<string> id, QueryPackQueryState? state = null, CustomResourceOptions? options = null)
            : base("azure:operationalinsights/queryPackQuery:QueryPackQuery", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing QueryPackQuery resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static QueryPackQuery Get(string name, Input<string> id, QueryPackQueryState? state = null, CustomResourceOptions? options = null)
        {
            return new QueryPackQuery(name, id, state, options);
        }
    }

    public sealed class QueryPackQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The additional properties that can be set for the Log Analytics Query Pack Query.
        /// </summary>
        [Input("additionalSettingsJson")]
        public Input<string>? AdditionalSettingsJson { get; set; }

        /// <summary>
        /// The body of the Log Analytics Query Pack Query.
        /// </summary>
        [Input("body", required: true)]
        public Input<string> Body { get; set; } = null!;

        [Input("categories")]
        private InputList<string>? _categories;

        /// <summary>
        /// A list of the related categories for the function. Possible values are `applications`, `audit`, `container`, `databases`, `desktopanalytics`, `management`, `monitor`, `network`, `resources`, `security`, `virtualmachines`, `windowsvirtualdesktop` and `workloads`.
        /// </summary>
        public InputList<string> Categories
        {
            get => _categories ?? (_categories = new InputList<string>());
            set => _categories = value;
        }

        /// <summary>
        /// The description of the Log Analytics Query Pack Query.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The unique display name for the query within the Log Analytics Query Pack.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// An unique UUID/GUID which identifies this Log Analytics Query Pack Query - one will be generated if not specified. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Log Analytics Query Pack. Changing this forces a new resource to be created.
        /// </summary>
        [Input("queryPackId", required: true)]
        public Input<string> QueryPackId { get; set; } = null!;

        [Input("resourceTypes")]
        private InputList<string>? _resourceTypes;

        /// <summary>
        /// A list of the related resource types for the function. Possible values are `default`, `microsoft.aad/domainservices`, `microsoft.aadiam/tenants`, `microsoft.agfoodplatform/farmbeats`, `microsoft.analysisservices/servers`, `microsoft.apimanagement/service`, `microsoft.appconfiguration/configurationstores`, `microsoft.appplatform/spring`, `microsoft.attestation/attestationproviders`, `microsoft.authorization/tenants`, `microsoft.automation/automationaccounts`, `microsoft.autonomousdevelopmentplatform/accounts`, `microsoft.azurestackhci/virtualmachines`, `microsoft.batch/batchaccounts`, `microsoft.blockchain/blockchainmembers`, `microsoft.botservice/botservices`, `microsoft.cache/redis`, `microsoft.cdn/profiles`, `microsoft.cognitiveservices/accounts`, `microsoft.communication/communicationservices`, `microsoft.compute/virtualmachines`, `microsoft.compute/virtualmachinescalesets`, `microsoft.connectedcache/cachenodes`, `microsoft.connectedvehicle/platformaccounts`, `microsoft.conenctedvmwarevsphere/virtualmachines`, `microsoft.containerregistry/registries`, `microsoft.containerservice/managedclusters`, `microsoft.d365customerinsights/instances`, `microsoft.dashboard/grafana`, `microsoft.databricks/workspaces`, `microsoft.datacollaboration/workspaces`, `microsoft.datafactory/factories`, `microsoft.datalakeanalytics/accounts`, `microsoft.datalakestore/accounts`, `microsoft.datashare/accounts`, `microsoft.dbformariadb/servers`, `microsoft.dbformysql/servers`, `microsoft.dbforpostgresql/flexibleservers`, `microsoft.dbforpostgresql/servers`, `microsoft.dbforpostgresql/serversv2`, `microsoft.digitaltwins/digitaltwinsinstances`, `microsoft.documentdb/cassandraclusters`, `microsoft.documentdb/databaseaccounts`, `microsoft.desktopvirtualization/applicationgroups`, `microsoft.desktopvirtualization/hostpools`, `microsoft.desktopvirtualization/workspaces`, `microsoft.devices/iothubs`, `microsoft.devices/provisioningservices`, `microsoft.dynamics/fraudprotection/purchase`, `microsoft.eventgrid/domains`, `microsoft.eventgrid/topics`, `microsoft.eventgrid/partnernamespaces`, `microsoft.eventgrid/partnertopics`, `microsoft.eventgrid/systemtopics`, `microsoft.eventhub/namespaces`, `microsoft.experimentation/experimentworkspaces`, `microsoft.hdinsight/clusters`, `microsoft.healthcareapis/services`, `microsoft.informationprotection/datasecuritymanagement`, `microsoft.intune/operations`, `microsoft.insights/autoscalesettings`, `microsoft.insights/components`, `microsoft.insights/workloadmonitoring`, `microsoft.keyvault/vaults`, `microsoft.kubernetes/connectedclusters`, `microsoft.kusto/clusters`, `microsoft.loadtestservice/loadtests`, `microsoft.logic/workflows`, `microsoft.machinelearningservices/workspaces`, `microsoft.media/mediaservices`, `microsoft.netapp/netappaccounts/capacitypools`, `microsoft.network/applicationgateways`, `microsoft.network/azurefirewalls`, `microsoft.network/bastionhosts`, `microsoft.network/expressroutecircuits`, `microsoft.network/frontdoors`, `microsoft.network/loadbalancers`, `microsoft.network/networkinterfaces`, `microsoft.network/networksecuritygroups`, `microsoft.network/networksecurityperimeters`, `microsoft.network/networkwatchers/connectionmonitors`, `microsoft.network/networkwatchers/trafficanalytics`, `microsoft.network/publicipaddresses`, `microsoft.network/trafficmanagerprofiles`, `microsoft.network/virtualnetworks`, `microsoft.network/virtualnetworkgateways`, `microsoft.network/vpngateways`, `microsoft.networkfunction/azuretrafficcollectors`, `microsoft.openenergyplatform/energyservices`, `microsoft.openlogisticsplatform/workspaces`, `microsoft.operationalinsights/workspaces`, `microsoft.powerbi/tenants`, `microsoft.powerbi/tenants/workspaces`, `microsoft.powerbidedicated/capacities`, `microsoft.purview/accounts`, `microsoft.recoveryservices/vaults`, `microsoft.resources/azureactivity`, `microsoft.scvmm/virtualmachines`, `microsoft.search/searchservices`, `microsoft.security/antimalwaresettings`, `microsoft.securityinsights/amazon`, `microsoft.securityinsights/anomalies`, `microsoft.securityinsights/cef`, `microsoft.securityinsights/datacollection`, `microsoft.securityinsights/dnsnormalized`, `microsoft.securityinsights/mda`, `microsoft.securityinsights/mde`, `microsoft.securityinsights/mdi`, `microsoft.securityinsights/mdo`, `microsoft.securityinsights/networksessionnormalized`, `microsoft.securityinsights/office365`, `microsoft.securityinsights/purview`, `microsoft.securityinsights/securityinsights`, `microsoft.securityinsights/securityinsights/mcas`, `microsoft.securityinsights/tvm`, `microsoft.securityinsights/watchlists`, `microsoft.servicebus/namespaces`, `microsoft.servicefabric/clusters`, `microsoft.signalrservice/signalr`, `microsoft.signalrservice/webpubsub`, `microsoft.sql/managedinstances`, `microsoft.sql/servers`, `microsoft.sql/servers/databases`, `microsoft.storage/storageaccounts`, `microsoft.storagecache/caches`, `microsoft.streamanalytics/streamingjobs`, `microsoft.synapse/workspaces`, `microsoft.timeseriesinsights/environments`, `microsoft.videoindexer/accounts`, `microsoft.web/sites`, `microsoft.workloadmonitor/monitors`, `resourcegroup` and `subscription`.
        /// </summary>
        public InputList<string> ResourceTypes
        {
            get => _resourceTypes ?? (_resourceTypes = new InputList<string>());
            set => _resourceTypes = value;
        }

        [Input("solutions")]
        private InputList<string>? _solutions;

        /// <summary>
        /// A list of the related Log Analytics solutions for the function. Possible values are `AADDomainServices`, `ADAssessment`, `ADAssessmentPlus`, `ADReplication`, `ADSecurityAssessment`, `AlertManagement`, `AntiMalware`, `ApplicationInsights`, `AzureAssessment`, `AzureSecurityOfThings`, `AzureSentinelDSRE`, `AzureSentinelPrivatePreview`, `BehaviorAnalyticsInsights`, `ChangeTracking`, `CompatibilityAssessment`, `ContainerInsights`, `Containers`, `CustomizedWindowsEventsFiltering`, `DeviceHealthProd`, `DnsAnalytics`, `ExchangeAssessment`, `ExchangeOnlineAssessment`, `IISAssessmentPlus`, `InfrastructureInsights`, `InternalWindowsEvent`, `LogManagement`, `Microsoft365Analytics`, `NetworkMonitoring`, `SCCMAssessmentPlus`, `SCOMAssessment`, `SCOMAssessmentPlus`, `Security`, `SecurityCenter`, `SecurityCenterFree`, `SecurityInsights`, `ServiceMap`, `SfBAssessment`, `SfBOnlineAssessment`, `SharePointOnlineAssessment`, `SPAssessment`, `SQLAdvancedThreatProtection`, `SQLAssessment`, `SQLAssessmentPlus`, `SQLDataClassification`, `SQLThreatDetection`, `SQLVulnerabilityAssessment`, `SurfaceHub`, `Updates`, `VMInsights`, `WEFInternalUat`, `WEF_10x`, `WEF_10xDSRE`, `WaaSUpdateInsights`, `WinLog`, `WindowsClientAssessmentPlus`, `WindowsEventForwarding`, `WindowsFirewall`, `WindowsServerAssessment`, `WireData` and `WireData2`.
        /// </summary>
        public InputList<string> Solutions
        {
            get => _solutions ?? (_solutions = new InputList<string>());
            set => _solutions = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Log Analytics Query Pack Query.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public QueryPackQueryArgs()
        {
        }
        public static new QueryPackQueryArgs Empty => new QueryPackQueryArgs();
    }

    public sealed class QueryPackQueryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The additional properties that can be set for the Log Analytics Query Pack Query.
        /// </summary>
        [Input("additionalSettingsJson")]
        public Input<string>? AdditionalSettingsJson { get; set; }

        /// <summary>
        /// The body of the Log Analytics Query Pack Query.
        /// </summary>
        [Input("body")]
        public Input<string>? Body { get; set; }

        [Input("categories")]
        private InputList<string>? _categories;

        /// <summary>
        /// A list of the related categories for the function. Possible values are `applications`, `audit`, `container`, `databases`, `desktopanalytics`, `management`, `monitor`, `network`, `resources`, `security`, `virtualmachines`, `windowsvirtualdesktop` and `workloads`.
        /// </summary>
        public InputList<string> Categories
        {
            get => _categories ?? (_categories = new InputList<string>());
            set => _categories = value;
        }

        /// <summary>
        /// The description of the Log Analytics Query Pack Query.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The unique display name for the query within the Log Analytics Query Pack.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// An unique UUID/GUID which identifies this Log Analytics Query Pack Query - one will be generated if not specified. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Log Analytics Query Pack. Changing this forces a new resource to be created.
        /// </summary>
        [Input("queryPackId")]
        public Input<string>? QueryPackId { get; set; }

        [Input("resourceTypes")]
        private InputList<string>? _resourceTypes;

        /// <summary>
        /// A list of the related resource types for the function. Possible values are `default`, `microsoft.aad/domainservices`, `microsoft.aadiam/tenants`, `microsoft.agfoodplatform/farmbeats`, `microsoft.analysisservices/servers`, `microsoft.apimanagement/service`, `microsoft.appconfiguration/configurationstores`, `microsoft.appplatform/spring`, `microsoft.attestation/attestationproviders`, `microsoft.authorization/tenants`, `microsoft.automation/automationaccounts`, `microsoft.autonomousdevelopmentplatform/accounts`, `microsoft.azurestackhci/virtualmachines`, `microsoft.batch/batchaccounts`, `microsoft.blockchain/blockchainmembers`, `microsoft.botservice/botservices`, `microsoft.cache/redis`, `microsoft.cdn/profiles`, `microsoft.cognitiveservices/accounts`, `microsoft.communication/communicationservices`, `microsoft.compute/virtualmachines`, `microsoft.compute/virtualmachinescalesets`, `microsoft.connectedcache/cachenodes`, `microsoft.connectedvehicle/platformaccounts`, `microsoft.conenctedvmwarevsphere/virtualmachines`, `microsoft.containerregistry/registries`, `microsoft.containerservice/managedclusters`, `microsoft.d365customerinsights/instances`, `microsoft.dashboard/grafana`, `microsoft.databricks/workspaces`, `microsoft.datacollaboration/workspaces`, `microsoft.datafactory/factories`, `microsoft.datalakeanalytics/accounts`, `microsoft.datalakestore/accounts`, `microsoft.datashare/accounts`, `microsoft.dbformariadb/servers`, `microsoft.dbformysql/servers`, `microsoft.dbforpostgresql/flexibleservers`, `microsoft.dbforpostgresql/servers`, `microsoft.dbforpostgresql/serversv2`, `microsoft.digitaltwins/digitaltwinsinstances`, `microsoft.documentdb/cassandraclusters`, `microsoft.documentdb/databaseaccounts`, `microsoft.desktopvirtualization/applicationgroups`, `microsoft.desktopvirtualization/hostpools`, `microsoft.desktopvirtualization/workspaces`, `microsoft.devices/iothubs`, `microsoft.devices/provisioningservices`, `microsoft.dynamics/fraudprotection/purchase`, `microsoft.eventgrid/domains`, `microsoft.eventgrid/topics`, `microsoft.eventgrid/partnernamespaces`, `microsoft.eventgrid/partnertopics`, `microsoft.eventgrid/systemtopics`, `microsoft.eventhub/namespaces`, `microsoft.experimentation/experimentworkspaces`, `microsoft.hdinsight/clusters`, `microsoft.healthcareapis/services`, `microsoft.informationprotection/datasecuritymanagement`, `microsoft.intune/operations`, `microsoft.insights/autoscalesettings`, `microsoft.insights/components`, `microsoft.insights/workloadmonitoring`, `microsoft.keyvault/vaults`, `microsoft.kubernetes/connectedclusters`, `microsoft.kusto/clusters`, `microsoft.loadtestservice/loadtests`, `microsoft.logic/workflows`, `microsoft.machinelearningservices/workspaces`, `microsoft.media/mediaservices`, `microsoft.netapp/netappaccounts/capacitypools`, `microsoft.network/applicationgateways`, `microsoft.network/azurefirewalls`, `microsoft.network/bastionhosts`, `microsoft.network/expressroutecircuits`, `microsoft.network/frontdoors`, `microsoft.network/loadbalancers`, `microsoft.network/networkinterfaces`, `microsoft.network/networksecuritygroups`, `microsoft.network/networksecurityperimeters`, `microsoft.network/networkwatchers/connectionmonitors`, `microsoft.network/networkwatchers/trafficanalytics`, `microsoft.network/publicipaddresses`, `microsoft.network/trafficmanagerprofiles`, `microsoft.network/virtualnetworks`, `microsoft.network/virtualnetworkgateways`, `microsoft.network/vpngateways`, `microsoft.networkfunction/azuretrafficcollectors`, `microsoft.openenergyplatform/energyservices`, `microsoft.openlogisticsplatform/workspaces`, `microsoft.operationalinsights/workspaces`, `microsoft.powerbi/tenants`, `microsoft.powerbi/tenants/workspaces`, `microsoft.powerbidedicated/capacities`, `microsoft.purview/accounts`, `microsoft.recoveryservices/vaults`, `microsoft.resources/azureactivity`, `microsoft.scvmm/virtualmachines`, `microsoft.search/searchservices`, `microsoft.security/antimalwaresettings`, `microsoft.securityinsights/amazon`, `microsoft.securityinsights/anomalies`, `microsoft.securityinsights/cef`, `microsoft.securityinsights/datacollection`, `microsoft.securityinsights/dnsnormalized`, `microsoft.securityinsights/mda`, `microsoft.securityinsights/mde`, `microsoft.securityinsights/mdi`, `microsoft.securityinsights/mdo`, `microsoft.securityinsights/networksessionnormalized`, `microsoft.securityinsights/office365`, `microsoft.securityinsights/purview`, `microsoft.securityinsights/securityinsights`, `microsoft.securityinsights/securityinsights/mcas`, `microsoft.securityinsights/tvm`, `microsoft.securityinsights/watchlists`, `microsoft.servicebus/namespaces`, `microsoft.servicefabric/clusters`, `microsoft.signalrservice/signalr`, `microsoft.signalrservice/webpubsub`, `microsoft.sql/managedinstances`, `microsoft.sql/servers`, `microsoft.sql/servers/databases`, `microsoft.storage/storageaccounts`, `microsoft.storagecache/caches`, `microsoft.streamanalytics/streamingjobs`, `microsoft.synapse/workspaces`, `microsoft.timeseriesinsights/environments`, `microsoft.videoindexer/accounts`, `microsoft.web/sites`, `microsoft.workloadmonitor/monitors`, `resourcegroup` and `subscription`.
        /// </summary>
        public InputList<string> ResourceTypes
        {
            get => _resourceTypes ?? (_resourceTypes = new InputList<string>());
            set => _resourceTypes = value;
        }

        [Input("solutions")]
        private InputList<string>? _solutions;

        /// <summary>
        /// A list of the related Log Analytics solutions for the function. Possible values are `AADDomainServices`, `ADAssessment`, `ADAssessmentPlus`, `ADReplication`, `ADSecurityAssessment`, `AlertManagement`, `AntiMalware`, `ApplicationInsights`, `AzureAssessment`, `AzureSecurityOfThings`, `AzureSentinelDSRE`, `AzureSentinelPrivatePreview`, `BehaviorAnalyticsInsights`, `ChangeTracking`, `CompatibilityAssessment`, `ContainerInsights`, `Containers`, `CustomizedWindowsEventsFiltering`, `DeviceHealthProd`, `DnsAnalytics`, `ExchangeAssessment`, `ExchangeOnlineAssessment`, `IISAssessmentPlus`, `InfrastructureInsights`, `InternalWindowsEvent`, `LogManagement`, `Microsoft365Analytics`, `NetworkMonitoring`, `SCCMAssessmentPlus`, `SCOMAssessment`, `SCOMAssessmentPlus`, `Security`, `SecurityCenter`, `SecurityCenterFree`, `SecurityInsights`, `ServiceMap`, `SfBAssessment`, `SfBOnlineAssessment`, `SharePointOnlineAssessment`, `SPAssessment`, `SQLAdvancedThreatProtection`, `SQLAssessment`, `SQLAssessmentPlus`, `SQLDataClassification`, `SQLThreatDetection`, `SQLVulnerabilityAssessment`, `SurfaceHub`, `Updates`, `VMInsights`, `WEFInternalUat`, `WEF_10x`, `WEF_10xDSRE`, `WaaSUpdateInsights`, `WinLog`, `WindowsClientAssessmentPlus`, `WindowsEventForwarding`, `WindowsFirewall`, `WindowsServerAssessment`, `WireData` and `WireData2`.
        /// </summary>
        public InputList<string> Solutions
        {
            get => _solutions ?? (_solutions = new InputList<string>());
            set => _solutions = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Log Analytics Query Pack Query.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public QueryPackQueryState()
        {
        }
        public static new QueryPackQueryState Empty => new QueryPackQueryState();
    }
}
