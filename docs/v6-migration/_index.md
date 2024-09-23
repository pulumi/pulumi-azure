---
title: Azure Classic v6 Migration Guide
meta_desc: How to upgrade from v5 to v6 of the Azure Classic provider
layout: package
---

Version 6 of the Azure Classic provider is the first major release since April 2022\. There are some breaking changes which are detailed in this document. Version 6 of the pulumi-azure provider is based on version 4 of the terraform provider. The original release notes can be found in the [4.0 upgrade guide](https://registry.terraform.io/providers/hashicorp/azurerm/latest/docs/guides/4.0-upgrade-guide).

Upgrade to version `5.89.0` of the provider and resolve any deprecation warnings before moving to version 6\.

## Subscription ID is now mandatory

The subscription id configuration is now always required. This can be set via the environment variable `ARM_SUBSCRIPTION_ID` or the provider configuration property `subscriptionId`. This was already required when using any authentication method except for the CLI.

## Provider Registration Options

The previous version of the provider would automatically register a predefined list of resource providers in Azure, unless disabled with the `skipProviderRegistration` configuration option.

In version 6, the default set of resource providers is reduced to a smaller default set with the option to specify an alternative pre-defined set and specify a custom list of resource providers.

* `resourceProviderRegistrations` is the name of the set of resource providers to automatically register.  
  * `core` \- A minimal set of RPs that are deemed necessary for a subscription, the list of RPs in this set can be found upstream [here](https://github.com/hashicorp/terraform-provider-azurerm/blob/main/internal/resourceproviders/required.go#L33-L44)  
  * `extended` \- An expanded set of RPs as suggested by the community, the list of RPs in this set can be found upstream [here](https://github.com/hashicorp/terraform-provider-azurerm/blob/main/internal/resourceproviders/required.go#L47-L91)  
  * `all` \- A complete set of RPs that might be needed to utilize any functionality in the provider, the list of RPs in this set can be found upstream [here](https://github.com/hashicorp/terraform-provider-azurerm/blob/main/internal/resourceproviders/required.go#L47-L91)  
  * `none` \- No resource providers should be automatically registered  
  * `legacy` \- A set of automatically registered RPs from earlier versions of the provider, this is only provided for forwards compatibility and will be removed in a future major version release  
* `resourceProvidersToRegisters` is a list of resource provider names to register in addition to the set specified with `resourceProviderRegistrations`

## Case Sensitive Enums

In [the previous upstream version enum strings were made case sensitive](https://registry.terraform.io/providers/hashicorp/azurerm/latest/docs/guides/3.0-upgrade-guide#case-sensitivity-changes) for better strictness and to resolve some persistent diff issues. We delayed passing on this change until this next major version to ensure we had a good migration experience which could avoid fixing the case causing replacements.

Once you have upgraded to v6, performing a preview will report any properties with incorrect casing and will indicate the allowed values. The casing will need to be fixed in your program before being able to continue with your deployment.

### List of resource properties affected

| Resource | Properties |
| :---- | :---- |
| `appservice.AppService` | `dotnetFrameworkVersion`<br />`javaContainer`<br />`managedPipelineMode`<br />`remoteDebuggingVersion` |
| `appservice.CertificateOrder` | `productType` |
| `appservice.FunctionApp` | `dotnetFrameworkVersion` |
| `analysisservices.Server` | `querypoolConnectionMode` |
| `automation.RunBook` | `runbookType` |
| `automation.Schedule` | `frequency`<br />`weekDays`<br />`monthlyOccurrence` |
| `cdn.Endpoint` | `geoFilters.action`<br />`optimizationType` |
| `cdn.Profile` | `sku` |
| `compute.Image` | `osDisk.osType`<br />`osDisk.osState`<br />`osDisk.caching`<br />`dataDisk.caching` |
| `compute.Snapshot` | `createOption` |
| `compute.VirtualMachineDataDiskAttachment` | `caching`<br />`createOption` |
| `containers.ContainerGroup` | `ipAddressType`<br />`osType`<br />`restartPolicy` |
| `containers.KubernetesCluster` | `loadBalancerSku` |
| `cosmos.Account` | `offerType`<br />`kind`<br />`consistencyPolicy.consistencyLevel`<br />`capabilities.name` |
| `cosmos.GremlinGraph` | `indexingMode` |
| `dns.CaaRecord` | `record.tag` |
| `eventhub.Namespace` | `sku` |
| `eventhub.EventHub` | `encoding` |
| `network.FirewallPolicy` | `intrusionDetection.trafficBypasses.protocol` |
| `hdinsight.HBaseCluster` | `tier`<br />`roles.*.vmSize` |
| `hdinsight.HadoopCluster` | `tier`<br />`roles.*.vmSize` |
| `hdinsight.InteractiveQueryCluster` | `tier`<br />`roles.*.vmSize` |
| `hdinsight.KafkaCluster` | `tier`<br />`roles.*.vmSize` |
| `hdinsight.SparkCluster` | `tier`<br />`roles.*.vmSize` |
| `iotcentral.Application` | `sku` |
| `iot.IoTHub` | `endpoint.encoding` |
| `keyvault.Certificate` | `certificatePolicy.keyProperties.keyType` |
| `compute.VirtualMachine` | `licenseType`<br />`storageOsDisk.osType`<br />`storageOsDisk.managedDiskType`<br />`storageDataDisk.managedDiskType`<br />`osProfileWindowsConfig.winrm.protocol` |
| `compute.ScaleSet` | `licenseType`<br />`upgradePolicyMode`<br />`priority`<br />`storageProfileOsDisk.managedDiskType`<br />`storageProfileDataDisk.managedDiskType` |
| `lb.LoadBalancer` | `sku` |
| `lb.NatPool` | `protocol` |
| `lb.NatRule` | `protocol` |
| `lb.Probe` | `protocol` |
| `lb.Rule` | `protocol` |
| `loganalytics.DataSourceWindowsEvent` | `eventTypes` |
| `logic.IntegrationAccountBatchConfiguration` | `recurrence.frequency`<br />`recurrence.schedule.monthly.weekday`<br />`recurrence.schedule.weekDays` |
| `logic.Standard` | `connectionString.type`<br />`dotnetFrameworkVersion` |
| `logz.Monitor` | `plan.billingCycle`<br />`plan.planId`<br />`plan.usageType` |
| `media.ServicesAccount` | `storageAuthenticationType`<br />`keyDeliveryAccessControl.defaultAction` |
| `monitor.MonitorAutoscaleSetting` | `profile.recurrence.days` |
| `mssql.Database` | `threatDetectionPolicy.disabledAlerts`<br />`threatDetectionPolicy.emailAccountAdmins`<br />`threatDetectionPolicy.state` |
| `mssql.Elasticpool` | `sku.name`<br />`sku.tier`<br />`sku.family` |
| `mssql.ServerSecurityAlertPolicy` | `state` |
| `mysql.Server` | `version` |
| `network.ApplicationGateway` | `backendHttpSettings.protocol`<br />`backendHttpSettings.cookieBasedAffinity`<br />`frontendIpConfiguration.privateIpAddressAllocation`<br />`httpListener.protocol`<br />`privateLinkConfiguration.ipConfiguration.privateIpAddressAllocation`<br />`sku.name`<br />`sku.tier`<br />`probe.protocol`<br />`wafConfiguration.firewallMode` |
| `network.ExpressRouteCircuit` | `sku.tier`<br />`sku.family` |
| `network.NetworkSecurityGroup` | `securityRule.protocol`<br />`securityRule.access`<br />`securityRule.direction` |
| `network.NetworkSecurityRule` | `protocol`<br />`access`<br />`direction` |
| `network.PublicIpPrefix` | `ipVersion` |
| `network.PublicIp` | `ipVersion`<br />`sku` |
| `network.Route` | `nextHopType` |
| `network.RouteTable` | `nextHopType` |
| `network.VirtualNetworkGatewayConnection` | `type`<br />`ipsecPolicy.dhGroup`<br />`ipsecPolicy.ikeEncryption`<br />`ipsecPolicy.ikeIntegrity` |
| `network.VirtualNetworkGateway` | `type`<br />`vpnType`<br />`vpnClientConfiguration.vpnClientProtocols` |
| `notificationhub.NotificationHubNamespace` | `namespaceType` |
| `policy.PolicyDefinition` | `policyType` |
| `postgresql.Server` | `version` |
| `recoveryservices.Vault` | `sku` |
| `recoveryservices.ReplicatedVM` | `targetDiskType`<br />`targetReplicaDiskType` |
| `redis.Cache` | `skuName` |
| `redis.LinkedServer` | `serverRole` |
| `securitycenter.Automation` | `action.type`<br />`ruleSet.rule.operator`<br />`ruleSet.rule.propertyType` |
| `servicebus.Namespace` | `sku` |
| `servicebus.SubscriptionRule` | `filterType` |
| `servicebus.Topic` | `status` |
| `sql.Database` | `createMode`<br />`import.storageKeyType`<br />`import.authenticationType`<br />`import.operationMode`<br />`edition`<br />`threatDetectionPolicy.disabledAlerts`<br />`threatDetectionPolicy.emailAccountAdmins`<br />`threatDetectionPolicy.state` |
| `sql.ManagedInstance` | `licenseType` |
| `sql.SqlServer` | `threatDetectionPolicy.disabledAlerts`<br />`threatDetectionPolicy.state` |
| `storage.Account` | `accountKind`<br />`accountTier`<br />`accountReplicationType`<br />`accessTier`<br />`networkRules.bypass` |
| `synapse.SqlPoolSecurityAlertPolicy` | `policyState` |
| `synapse.WorkspaceSecurityAlertPolicy` | `policyState` |
| `trafficmanager.Profile` | `monitorConfig.protocol`<br />`profileStatus` |

## Removed Resources

Resources which were previously deprecated have now been removed. Some removed resources have direct replacements which can be directly migrated to by updating your code. Other services have been retired by Azure and therefore have no direct migration to an alternative.

### Replaced Resources

These resources were previously deprecated and have now been removed in favor of a new resource. To migrate to the replacement resource, update your Pulumi program to use the new type, leaving the [logical name](https://www.pulumi.com/docs/iac/concepts/resources/names/#logicalname) the same, and fix any properties which don’t align, then your existing resource will automatically be migrated.

| Removed Resource | Replacement Resource |
| :---- | :---- |
| `core.TemplateDeployment` | `core.ResourceGroupTemplateDeployment` |
| `portal.Dashboard` | `portal.PortalDashboard` |
| `databricks.WorkspaceCustomerManagedKey` | `databricks.WorkspaceRootDbfsCustomerManagedKey` |
| `datafactory.IntegrationRuntimeManaged` | `datafactory.IntegrationRuntimeSsis` |
| `graph.Account` | `graph.ServicesAccount` |
| `monitoring.ActionRuleActionGroup` | `monitoring.AlertProcessingRuleActionGroup` |
| `monitoring.ActionRuleSuppression` | `monitoring.AlertProcessingRuleSuppression` |
| `sql.Database` | `mssql.Database` |
| `sql.ElasticPool` | `mssql.ElasticPool` |
| `sql.FailoverGroup` | `mssql.FailoverGroup` |
| `sql.FirewallRule` | `mssql.FirewallRule` |
| `sql.ManagedDatabase` | `mssql.ManagedDatabase` |
| `sql.ManagedInstanceActiveDirectoryAdministrator` | `mssql.ManagedInstanceActiveDirectoryAdministrator` |
| `sql.ManagedInstanceFailoverGroup` | `mssql.ManagedInstanceFailoverGroup` |
| `sql.ManagedInstance` | `mssql.ManagedInstance` |
| `sql.SqlServer` | `mssql.Server` |
| `sql.VirtualNetworkRule` | `mssql.VirtualNetworkRule` |

### Replaced Data Sources

| Removed Data Source | Replacement Data Source |
| :---- | :---- |
| `hybrid.getComputeMachine` | `arcmachine.get` |

### Retired Resources

These resource do not have a direct replacement and the old resource will need to be deleted or [removed from state](https://www.pulumi.com/docs/iac/cli/commands/pulumi_state_delete/) then recreated using alternative resources.

| Retired Resource | Notes |
| :---- | :---- |
| `appservice.Environment` | This resource covered App Service Environment v1 and v2 which were retired on 2024-08-31. ASE v3 is current, and covered by appservice.EnvironmentV3. |
| `cdn.FrontdoorRouteDisableLinkToDefaultDomain` | This resource is superseded by the linkToDefaultDomain property in the cdn.FrontdoorRoute resource. |
| `cosmosdb.NotebookWorkspace` | CosmosDb Notebook Workspace is deprecated by Azure and only offers short-lived notebooks at this point. |
| `databoxedge.Order` | The creation of DataBox Edge Orders is not supported by the Azure API. |
| `servicebus.NamespaceNetworkRuleSet` | This resource is superseded by the networkRuleSet property in the servicebus.Namespace resource. |
| `sql.ActiveDirectoryAdministrator` | This resource is superseded by the azureadAdministrator property in the mssql.Server resource. |

### Retired Services

| Service | Resources | Notes |
| :---- | :---- | :---- |
| `iot` | `TimeSeriesInsightsAccessPolicy`<br />`TimeSeriesInsightsEventSourceEventhub`<br />`TimeSeriesInsightsEventSourceIothub`<br />`TimeSeriesInsightsGen2Environment`<br />`TimeSeriesInsightsReferenceDataSet`<br />`TimeSeriesInsightsStandardEnvironment` | This Azure Service will be retired on 2025-03-31. |
| `lab` | `Lab`<br />`Schedule`<br />`ServicePlan`<br />`User` | This Azure service is deprecated and on the road to retirement. |
| `monitoring` | `LogzMonitor`<br />`LogzSubAccount`<br />`LogzSubAccountTagRule`<br />`LogzTagRule` | This Azure service is being retired. |
| `mariadb` | `Configuration`<br />`Database`<br />`FirewallRule`<br />`Server`<br />`VirtualNetworkRule`<br />`getMariaDbServer` | This service is replaced by MySQL Flexible Server. |
| `media` | `AccountFilter`<br />`AssetFilter`<br />`Asset`<br />`ContentKeyPolicy`<br />`Job`<br />`LiveEvent`<br />`LiveEventOutput`<br />`ServiceAccount`<br />`StreamingEndpoint`<br />`StreamingLocator`<br />`StreamingPolicy`<br />`Transform` | [Azure Media Services was retired June 30th, 2024](https://learn.microsoft.com/en-us/azure/media-services/latest/azure-media-services-retirement). |
| `mediaservices` | `Account` | [Azure Media Services was retired June 30th, 2024](https://learn.microsoft.com/en-us/azure/media-services/latest/azure-media-services-retirement). |
| `mysql` | `ActiveDirectoryAdministrator`<br />`Configuration`<br />`Database`<br />`FirewallRule`<br />`Server`<br />`ServerKey`<br />`VirtualNetworkRule`<br />`getServer` | Azure Database for MySQL Single Server was retired on 2024-09-16 and users should migrate to Azure Database for MySQL Flexible Server. |
| `videoanalyzer` | `Analyzer`<br />`EdgeModule` | This service was retired in June 2024\. |

## Resource Property Breaking Changes

About 150 resources saw changes to properties that might require a manual update. For the full list please see the [upstream upgrade guide](https://registry.terraform.io/providers/hashicorp/azurerm/latest/docs/guides/4.0-upgrade-guide#behaviour-changes-and-removed-properties-in-resources).

* 16 properties are no longer “Computed”. If you experience a diff as a result of this change you may need to use [ignoreChanges](https://www.pulumi.com/docs/iac/concepts/options/ignorechanges/).  
* 31 properties had their default value updated.
* 4 resources have new properties that are required, so you’ll need to add them if you use these resources.  
* 32 deprecated properties were removed (10 from KubernetesCluster).  
* The other changes are properties that were renamed or replaced by a related property.

## Other

Instances of the `apimanagement.ApiTag` resource will need to be recreated upon upgrading so that the tag revision can be included in the resource ID.  
