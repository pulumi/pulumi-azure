// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package azure

import (
	"fmt"
	"strings"
	"unicode"

	"github.com/hashicorp/terraform/config"
	"github.com/hashicorp/terraform/helper/schema"
	"github.com/hashicorp/terraform/terraform"
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/resource"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/pulumi/pulumi/pkg/util/contract"
	"github.com/terraform-providers/terraform-provider-azurerm/azurerm"
	"github.com/terraform-providers/terraform-provider-azurerm/azurerm/helpers/azure"
)

// all of the Azure token components used below.
const (
	// packages:
	azurePkg = "azure"
	// modules; in general, we took naming inspiration from the Azure SDK for Go:
	// https://godoc.org/github.com/Azure/azure-sdk-for-go
	azureAD                  = "ad"                  // Active Directory (AAD)
	azureAPIManagement       = "apimanagement"       // API Management
	azureAppInsights         = "appinsights"         // AppInsights
	azureAppService          = "appservice"          // App Service
	azureAutomation          = "automation"          // Automatio
	azureAutoscale           = "autoscale"           // Autoscale
	azureBatch               = "batch"               // Batch
	azureCDN                 = "cdn"                 // CDN
	azureCognitive           = "cognitive"           // Cognitive
	azureCompute             = "compute"             // Virtual Machines
	azureContainerService    = "containerservice"    // Azure Container Service
	azureCore                = "core"                // Base Resources
	azureCosmosDB            = "cosmosdb"            // Cosmos DB
	azureDataFactory         = "datafactory"         // Data Factory
	azureDatalake            = "datalake"            // Data Lake
	azureDataBricks          = "databricks"          // DataBricks
	azureDdosProtection      = "ddosprotection"      // DDOS Protection
	azureDevSpace            = "devspace"            // DevSpace
	azureDevTest             = "devtest"             // Dev Test Labs
	azureDNS                 = "dns"                 // DNS
	azureHdInsight           = "hdinsight"           // nolint:misspell // HDInsight
	azureIot                 = "iot"                 // IoT resource
	azureKeyVault            = "keyvault"            // Key Vault
	azureLogAnalytics        = "loganalytics"        // Log Analytics
	azureLogicApps           = "logicapps"           // Logic Apps
	azureLB                  = "lb"                  // Load Balancer
	azureMariaDB             = "mariadb"             // MariaDB
	azureMessaging           = "eventhub"            // Event Hub
	azureMgmtResource        = "managementresource"  // Management Resource
	azureManagementGroups    = "managementgroups"    // Management Groups
	azureMediaServices       = "mediaservices"       // Media Services
	azureMonitoring          = "monitoring"          // Metrics/monitoring resources
	azureMSI                 = "msi"                 // Managed Service Identity (MSI)
	azureMSSQL               = "mssql"               // MS Sql
	azureMySQL               = "mysql"               // MySql
	azureNetwork             = "network"             // Networking
	azureNotificationHub     = "notificationhub"     // Notification Hub
	azureOperationalInsights = "operationalinsights" // Operational Insights
	azurePostgresql          = "postgresql"          // Postgress SQL
	azurePolicy              = "policy"              // Policy
	azurePrivateDNS          = "privatedns"          // Private DNS
	azureRecoveryServices    = "recoveryservices"    // Recovery Services
	azureRedis               = "redis"               // RedisCache
	azureRelay               = "relay"               // Relay
	azureRole                = "role"                // Azure Role
	azureScheduler           = "scheduler"           // Scheduler
	azureSecurityCenter      = "securitycenter"      // Security Center
	azureServiceFabric       = "servicefabric"       // Service Fabric
	azureSearch              = "search"              // Search
	azureSignalr             = "signalr"             // SignalR
	azureSQL                 = "sql"                 // SQL
	azureStorage             = "storage"             // Storage
	azureStreamAnalytics     = "streamanalytics"     // StreamAnalytics
	azureTrafficManager      = "trafficmanager"      // Traffic Manager
)

// azureMember manufactures a type token for the Azure package and the given module and type.
func azureMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(azurePkg + ":" + mod + ":" + mem)
}

// azureType manufactures a type token for the Azure package and the given module and type.
func azureType(mod string, typ string) tokens.Type {
	return tokens.Type(azureMember(mod, typ))
}

// azureDataSource manufactures a standard resource token given a module and resource name.  It automatically uses the
// Azure package and names the file by simply lower casing the data source's first character.
func azureDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return azureMember(mod+"/"+fn, res)
}

// azureResource manufactures a standard resource token given a module and resource name.  It automatically uses the
// Azure package and names the file by simply lower casing the resource's first character.
func azureResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return azureType(mod+"/"+fn, res)
}

// boolRef returns a reference to the bool argument.
func boolRef(b bool) *bool {
	return &b
}

// Provider returns additional overlaid schema and metadata associated with the azure package.
//
// nolint: lll
func Provider() tfbridge.ProviderInfo {
	const (
		azureName     = "name"
		azureLocation = "location"
	)

	p := azurerm.Provider().(*schema.Provider)

	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "azurerm",
		Description: "A Pulumi package for creating and managing Microsoft Azure cloud resources.",
		Keywords:    []string{"pulumi", "azure"},
		Homepage:    "https://pulumi.io",
		License:     "Apache-2.0",
		Repository:  "https://github.com/pulumi/pulumi-azure",
		Config: map[string]*tfbridge.SchemaInfo{
			"subscription_id": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"ARM_SUBSCRIPTION_ID"},
				},
			},
			"client_id": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"ARM_CLIENT_ID"},
				},
			},
			"tenant_id": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"ARM_TENANT_ID"},
				},
			},
			"environment": {
				Default: &tfbridge.DefaultInfo{
					Value:   "public",
					EnvVars: []string{"ARM_ENVIRONMENT"},
				},
			},
			"client_certificate_password": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"ARM_CLIENT_CERTIFICATE_PASSWORD"},
				},
			},
			"client_certificate_path": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"ARM_CLIENT_CERTIFICATE_PATH"},
				},
			},
			"client_secret": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"ARM_CLIENT_SECRET"},
				},
			},
			"partner_id": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"ARM_PARTNER_ID"},
				},
			},
			"skip_credentials_validation": {
				Default: &tfbridge.DefaultInfo{
					Value:   false,
					EnvVars: []string{"ARM_SKIP_CREDENTIALS_VALIDATION"},
				},
			},
			"skip_provider_registration": {
				Default: &tfbridge.DefaultInfo{
					Value:   false,
					EnvVars: []string{"ARM_SKIP_PROVIDER_REGISTRATION"},
				},
			},
			"use_msi": {
				Default: &tfbridge.DefaultInfo{
					Value:   false,
					EnvVars: []string{"ARM_USE_MSI"},
				},
			},
			"msi_endpoint": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"ARM_MSI_ENDPOINT"},
				},
			},
		},
		ExtraConfig: map[string]*tfbridge.ConfigInfo{
			azureLocation: {
				Schema: &schema.Schema{
					Type:     schema.TypeString,
					Optional: true,
				},
				Info: &tfbridge.SchemaInfo{
					Default: &tfbridge.DefaultInfo{
						EnvVars: []string{"ARM_LOCATION"},
					},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			// Active Directory (AAD)
			"azurerm_azuread_application":                {Tok: azureResource(azureAD, "Application")},
			"azurerm_azuread_service_principal":          {Tok: azureResource(azureAD, "ServicePrincipal")},
			"azurerm_azuread_service_principal_password": {Tok: azureResource(azureAD, "ServicePrincipalPassword")},

			// API Mannagement
			"azurerm_api_management": {
				Tok: azureResource(azureAPIManagement, "Service"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an API Management name is 50.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#general
					azureName: AutoNameWithMaxLength(azureName, 50),
				},
			},
			"azurerm_api_management_api":                     {Tok: azureResource(azureAPIManagement, "Api")},
			"azurerm_api_management_api_operation":           {Tok: azureResource(azureAPIManagement, "ApiOperation")},
			"azurerm_api_management_api_operation_policy":    {Tok: azureResource(azureAPIManagement, "ApiOperationPolicy")},
			"azurerm_api_management_api_policy":              {Tok: azureResource(azureAPIManagement, "ApiPolicy")},
			"azurerm_api_management_api_schema":              {Tok: azureResource(azureAPIManagement, "ApiSchema")},
			"azurerm_api_management_api_version_set":         {Tok: azureResource(azureAPIManagement, "ApiVersionSet")},
			"azurerm_api_management_authorization_server":    {Tok: azureResource(azureAPIManagement, "AuthorizationServer")},
			"azurerm_api_management_certificate":             {Tok: azureResource(azureAPIManagement, "Certificate")},
			"azurerm_api_management_group":                   {Tok: azureResource(azureAPIManagement, "Group")},
			"azurerm_api_management_group_user":              {Tok: azureResource(azureAPIManagement, "GroupUser")},
			"azurerm_api_management_logger":                  {Tok: azureResource(azureAPIManagement, "Logger")},
			"azurerm_api_management_openid_connect_provider": {Tok: azureResource(azureAPIManagement, "OpenIdConnectProvider")},
			"azurerm_api_management_product":                 {Tok: azureResource(azureAPIManagement, "Product")},
			"azurerm_api_management_product_api":             {Tok: azureResource(azureAPIManagement, "ProductApi")},
			"azurerm_api_management_product_group":           {Tok: azureResource(azureAPIManagement, "ProductGroup")},
			"azurerm_api_management_product_policy":          {Tok: azureResource(azureAPIManagement, "ProductPolicy")},
			"azurerm_api_management_property":                {Tok: azureResource(azureAPIManagement, "Property")},
			"azurerm_api_management_subscription":            {Tok: azureResource(azureAPIManagement, "Subscription")},
			"azurerm_api_management_user":                    {Tok: azureResource(azureAPIManagement, "User")},

			// AppInsights
			"azurerm_application_insights":         {Tok: azureResource(azureAppInsights, "Insights")},
			"azurerm_application_insights_api_key": {Tok: azureResource(azureAppInsights, "ApiKey")},
			"azurerm_application_insights_web_test": {
				Tok: azureResource(azureAppInsights, "WebTest"),
				Docs: &tfbridge.DocInfo{
					Source: "application_insights_webtests.html.markdown",
				},
			},

			// App Service
			"azurerm_app_service": {
				Tok: azureResource(azureAppService, "AppService"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an app service name is 60.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#general
					azureName: AutoNameWithMaxLength(azureName, 60),
					"site_config": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"use_32_bit_worker_process": {
									Name: "use32BitWorkerProcess",
								},
							},
						},
					},
				},
			},
			"azurerm_app_service_custom_hostname_binding": {Tok: azureResource(azureAppService, "CustomHostnameBinding")},
			"azurerm_app_service_plan": {
				Tok: azureResource(azureAppService, "Plan"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an app service plan name is 40.
					// This was discovered directly through the portal.
					azureName: AutoNameWithMaxLength(azureName, 40),
				}},
			"azurerm_app_service_slot":        {Tok: azureResource(azureAppService, "Slot")},
			"azurerm_app_service_active_slot": {Tok: azureResource(azureAppService, "ActiveSlot")},
			"azurerm_function_app": {
				Tok: azureResource(azureAppService, "FunctionApp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a functionapp name is 60.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#compute
					azureName: AutoNameWithMaxLength(azureName, 60),
					"site_config": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"use_32_bit_worker_process": {
									Name: "use32BitWorkerProcess",
								},
							},
						},
					},
				}},

			// Automation
			"azurerm_automation_account":               {Tok: azureResource(azureAutomation, "Account")},
			"azurerm_automation_credential":            {Tok: azureResource(azureAutomation, "Credential")},
			"azurerm_automation_dsc_configuration":     {Tok: azureResource(azureAutomation, "DscConfiguration")},
			"azurerm_automation_dsc_nodeconfiguration": {Tok: azureResource(azureAutomation, "DscNodeConfiguration")},
			"azurerm_automation_module":                {Tok: azureResource(azureAutomation, "Module")},
			"azurerm_automation_runbook":               {Tok: azureResource(azureAutomation, "RunBook")},
			"azurerm_automation_schedule":              {Tok: azureResource(azureAutomation, "Schedule")},
			"azurerm_automation_variable_bool":         {Tok: azureResource(azureAutomation, "BoolVariable")},
			"azurerm_automation_variable_datetime":     {Tok: azureResource(azureAutomation, "DateTimeVariable")},
			"azurerm_automation_variable_int":          {Tok: azureResource(azureAutomation, "IntVariable")},
			"azurerm_automation_variable_string":       {Tok: azureResource(azureAutomation, "StringVariable")},

			// Autoscale
			"azurerm_autoscale_setting": {Tok: azureResource(azureAutoscale, "Setting")},

			// Authorization
			"azurerm_role_assignment": {
				Tok: azureResource(azureRole, "Assignment"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Suppress auto-naming of this field. It is autonamed to a GUID in the underlying provider.
					azureName: {Name: azureName},
				},
			},
			"azurerm_role_definition": {Tok: azureResource(azureRole, "Definition")},

			// Azure Container Service
			"azurerm_container_registry": {
				Tok: azureResource(azureContainerService, "Registry"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#containers
					// Max length of a container name is 50
					azureName: AutoNameWithMaxLength(azureName, 50),
				},
			},
			"azurerm_container_service": {Tok: azureResource(azureContainerService, "Service")},
			"azurerm_container_group": {
				Tok: azureResource(azureContainerService, "Group"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#containers
					// Max length of a container group/instance is 63
					azureName: AutoNameWithMaxLength(azureName, 63),
				}},
			"azurerm_kubernetes_cluster": {
				Tok: azureResource(azureContainerService, "KubernetesCluster"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"addon_profile": {
						SuppressEmptyMapElements: boolRef(true),
					},
				},
			},

			// Batch
			"azurerm_batch_account":     {Tok: azureResource(azureBatch, "Account")},
			"azurerm_batch_certificate": {Tok: azureResource(azureBatch, "Certificate")},
			"azurerm_batch_pool":        {Tok: azureResource(azureBatch, "Pool")},

			// Core
			"azurerm_resource_group": {
				Tok: azureResource(azureCore, "ResourceGroup"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#general
					// Max length of a resource group name is 90
					azureName: AutoNameWithMaxLength(azureName, 90),
					azureLocation: {
						Default: &tfbridge.DefaultInfo{
							// To make it easy to repurpose an entire stack for different regions, we will let the
							// resource group's location be parameterizable using configuration. Note that all other
							// resources, by default, will take the location from the resource group to which they belong.
							Config: azureLocation,
						},
					},
				},
			},
			"azurerm_template_deployment": {Tok: azureResource(azureCore, "TemplateDeployment")},

			// CDN
			"azurerm_cdn_endpoint": {Tok: azureResource(azureCDN, "Endpoint")},
			"azurerm_cdn_profile":  {Tok: azureResource(azureCDN, "Profile")},

			// Cognitive
			"azurerm_cognitive_account": {Tok: azureResource(azureCognitive, "Account")},

			// Compute
			"azurerm_availability_set": {
				Tok: azureResource(azureCompute, "AvailabilitySet"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an availability set name is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#general
					azureName: AutoNameWithMaxLength(azureName, 80),
				},
			},
			"azurerm_virtual_machine_extension": {Tok: azureResource(azureCompute, "Extension")},
			"azurerm_virtual_machine": {
				Tok: azureResource(azureCompute, "VirtualMachine"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a virtual machine name is 64. Note that the Windows host name is max 15 characters but it can be set separately.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#compute
					azureName: AutoNameWithMaxLength(azureName, 64),
				},
			},
			"azurerm_virtual_machine_data_disk_attachment": {Tok: azureResource(azureCompute, "DataDiskAttachment")},
			"azurerm_virtual_machine_scale_set":            {Tok: azureResource(azureCompute, "ScaleSet")},

			"azurerm_managed_disk":         {Tok: azureResource(azureCompute, "ManagedDisk")},
			"azurerm_snapshot":             {Tok: azureResource(azureCompute, "Snapshot")},
			"azurerm_image":                {Tok: azureResource(azureCompute, "Image")},
			"azurerm_shared_image":         {Tok: azureResource(azureCompute, "SharedImage")},
			"azurerm_shared_image_gallery": {Tok: azureResource(azureCompute, "SharedImageGallery")},
			"azurerm_shared_image_version": {Tok: azureResource(azureCompute, "SharedImageVersion")},

			// DataBricks
			"azurerm_databricks_workspace": {Tok: azureResource(azureDataBricks, "Workspace")},

			// DataFactory
			"azurerm_data_factory":                          {Tok: azureResource(azureDataFactory, "Factory")},
			"azurerm_data_factory_dataset_mysql":            {Tok: azureResource(azureDataFactory, "DatasetMysql")},
			"azurerm_data_factory_dataset_postgresql":       {Tok: azureResource(azureDataFactory, "DatasetPostgresql")},
			"azurerm_data_factory_dataset_sql_server_table": {Tok: azureResource(azureDataFactory, "DatasetSqlServerTable")},
			"azurerm_data_factory_linked_service_data_lake_storage_gen2": {
				Tok: azureResource(azureDataFactory, "LinkedServiceDataLakeStorageGen2"),
			},
			"azurerm_data_factory_linked_service_mysql":      {Tok: azureResource(azureDataFactory, "LinkedServiceMysql")},
			"azurerm_data_factory_linked_service_postgresql": {Tok: azureResource(azureDataFactory, "LinkedServicePostgresql")},
			"azurerm_data_factory_linked_service_sql_server": {Tok: azureResource(azureDataFactory, "LinkedServiceSqlServer")},
			"azurerm_data_factory_pipeline":                  {Tok: azureResource(azureDataFactory, "Pipeline")},

			// Data Lake
			"azurerm_data_lake_analytics_account":       {Tok: azureResource(azureDatalake, "AnalyticsAccount")},
			"azurerm_data_lake_analytics_firewall_rule": {Tok: azureResource(azureDatalake, "AnalyticsFirewallRule")},
			"azurerm_data_lake_store":                   {Tok: azureResource(azureDatalake, "Store")},
			"azurerm_data_lake_store_file":              {Tok: azureResource(azureDatalake, "StoreFile")},
			"azurerm_data_lake_store_firewall_rule":     {Tok: azureResource(azureDatalake, "StoreFirewallRule")},

			// DDOS Protection
			"azurerm_ddos_protection_plan": {Tok: azureResource(azureDdosProtection, "Plan")},

			// DevSpace
			"azurerm_devspace_controller": {Tok: azureResource(azureDevSpace, "Controller")},

			// Dev Test
			"azurerm_dev_test_lab":                     {Tok: azureResource(azureDevTest, "Lab")},
			"azurerm_dev_test_linux_virtual_machine":   {Tok: azureResource(azureDevTest, "LinuxVirtualMachine")},
			"azurerm_dev_test_policy":                  {Tok: azureResource(azureDevTest, "Policy")},
			"azurerm_dev_test_virtual_network":         {Tok: azureResource(azureDevTest, "VirtualNetwork")},
			"azurerm_dev_test_windows_virtual_machine": {Tok: azureResource(azureDevTest, "WindowsVirtualMachine")},

			// DNS
			"azurerm_dns_a_record":     {Tok: azureResource(azureDNS, "ARecord")},
			"azurerm_dns_aaaa_record":  {Tok: azureResource(azureDNS, "AaaaRecord")},
			"azurerm_dns_caa_record":   {Tok: azureResource(azureDNS, "CaaRecord")},
			"azurerm_dns_cname_record": {Tok: azureResource(azureDNS, "CNameRecord")},
			"azurerm_dns_mx_record":    {Tok: azureResource(azureDNS, "MxRecord")},
			"azurerm_dns_ns_record": {
				Tok: azureResource(azureDNS, "NsRecord"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// This property is deprecated and renamed to `records`.  Don't pluralize this depreacted
					// version so that it doesn't conflict with the replacement.
					"record": {Name: "record"},
				},
			},
			"azurerm_dns_ptr_record": {Tok: azureResource(azureDNS, "PtrRecord")},
			"azurerm_dns_srv_record": {Tok: azureResource(azureDNS, "SrvRecord")},
			"azurerm_dns_txt_record": {Tok: azureResource(azureDNS, "TxtRecord")},
			"azurerm_dns_zone":       {Tok: azureResource(azureDNS, "Zone")},

			// HDInsights
			"azurerm_hdinsight_hadoop_cluster":            {Tok: azureResource(azureHdInsight, "HadoopCluster")},
			"azurerm_hdinsight_hbase_cluster":             {Tok: azureResource(azureHdInsight, "HBaseCluster")},
			"azurerm_hdinsight_interactive_query_cluster": {Tok: azureResource(azureHdInsight, "InteractiveQueryCluster")},
			"azurerm_hdinsight_kafka_cluster":             {Tok: azureResource(azureHdInsight, "KafkaCluster")},
			"azurerm_hdinsight_ml_services_cluster":       {Tok: azureResource(azureHdInsight, "MLServicesCluster")},
			"azurerm_hdinsight_rserver_cluster":           {Tok: azureResource(azureHdInsight, "RServerCluster")},
			"azurerm_hdinsight_spark_cluster":             {Tok: azureResource(azureHdInsight, "SparkCluster")},
			"azurerm_hdinsight_storm_cluster":             {Tok: azureResource(azureHdInsight, "StormCluster")},

			// Messaging
			"azurerm_eventgrid_domain":                      {Tok: azureResource(azureMessaging, "EventGridDomain")},
			"azurerm_eventgrid_event_subscription":          {Tok: azureResource(azureMessaging, "EventGridEventSubscription")},
			"azurerm_eventgrid_topic":                       {Tok: azureResource(azureMessaging, "EventGridTopic")},
			"azurerm_eventhub":                              {Tok: azureResource(azureMessaging, "EventHub")},
			"azurerm_eventhub_authorization_rule":           {Tok: azureResource(azureMessaging, "EventHubAuthorizationRule")},
			"azurerm_eventhub_consumer_group":               {Tok: azureResource(azureMessaging, "EventHubConsumerGroup")},
			"azurerm_eventhub_namespace":                    {Tok: azureResource(azureMessaging, "EventHubNamespace")},
			"azurerm_eventhub_namespace_authorization_rule": {Tok: azureResource(azureMessaging, "EventHubNamespaceAuthorizationRule")},
			"azurerm_servicebus_namespace": {
				Tok: azureResource(azureMessaging, "Namespace"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/rest/api/servicebus/create-namespace
					// Max length of a servicehub namespace is 50.
					azureName: AutoNameWithMaxLength(azureName, 50),
				}},
			"azurerm_servicebus_namespace_authorization_rule": {Tok: azureResource(azureMessaging, "NamespaceAuthorizationRule")},
			"azurerm_servicebus_queue": {
				Tok: azureResource(azureMessaging, "Queue"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://groups.google.com/forum/#!topic/particularsoftware/XuHp_8wZ09o
					// Max length of a servicehub queue is 260.
					azureName: AutoNameWithMaxLength(azureName, 260),
				}},
			"azurerm_servicebus_queue_authorization_rule": {Tok: azureResource(azureMessaging, "QueueAuthorizationRule")},
			"azurerm_servicebus_subscription":             {Tok: azureResource(azureMessaging, "Subscription")},
			"azurerm_servicebus_subscription_rule":        {Tok: azureResource(azureMessaging, "SubscriptionRule")},
			"azurerm_servicebus_topic": {
				Tok: azureResource(azureMessaging, "Topic"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://groups.google.com/forum/#!topic/particularsoftware/XuHp_8wZ09o
					// Max length of a servicehub topic is 260.
					azureName: AutoNameWithMaxLength(azureName, 260),
				}},
			"azurerm_servicebus_topic_authorization_rule": {Tok: azureResource(azureMessaging, "TopicAuthorizationRule")},

			// IoT Resources
			"azurerm_iot_dps":             {Tok: azureResource(azureIot, "Dps")},
			"azurerm_iot_dps_certificate": {Tok: azureResource(azureIot, "Certificate")},
			"azurerm_iothub": {Tok: azureResource(azureIot, "IoTHub"),
				Docs: &tfbridge.DocInfo{
					Source: "iothub.html.markdown",
				},
			},
			"azurerm_iothub_consumer_group":       {Tok: azureResource(azureIot, "ConsumerGroup")},
			"azurerm_iothub_shared_access_policy": {Tok: azureResource(azureIot, "SharedAccessPolicy")},

			// KeyVault
			"azurerm_key_vault": {
				Tok: azureResource(azureKeyVault, "KeyVault"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_key_vault_access_policy": {Tok: azureResource(azureKeyVault, "AccessPolicy")},
			"azurerm_key_vault_certificate":   {Tok: azureResource(azureKeyVault, "Certifiate")},
			"azurerm_key_vault_key":           {Tok: azureResource(azureKeyVault, "Key")},
			"azurerm_key_vault_secret":        {Tok: azureResource(azureKeyVault, "Secret")},

			// LoadBalancer
			"azurerm_lb": {
				Tok: azureResource(azureLB, "LoadBalancer"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer.html.markdown",
				},
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Load Balancer is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: AutoNameWithMaxLength(azureName, 80),
				},
			},
			"azurerm_lb_backend_address_pool": {Tok: azureResource(azureLB, "BackendAddressPool"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer_backend_address_pool.html.markdown",
				},
			},
			"azurerm_lb_nat_rule": {Tok: azureResource(azureLB, "NatRule"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer_nat_rule.html.markdown",
				},
			},
			"azurerm_lb_nat_pool": {Tok: azureResource(azureLB, "NatPool"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer_nat_pool.html.markdown",
				}},
			"azurerm_lb_outbound_rule": {Tok: azureResource(azureLB, "OutboundRule"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer_outbound_rule.html.markdown",
				},
			},
			"azurerm_lb_probe": {Tok: azureResource(azureLB, "Probe"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer_probe.html.markdown",
				},
			},
			"azurerm_lb_rule": {Tok: azureResource(azureLB, "Rule"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer_rule.html.markdown",
				},
			},

			// Log Analytics
			"azurerm_log_analytics_linked_service": {Tok: azureResource(azureLogAnalytics, "LinkedService")},

			// Logic Apps
			"azurerm_logic_app_action_custom":        {Tok: azureResource(azureLogicApps, "ActionCustom")},
			"azurerm_logic_app_action_http":          {Tok: azureResource(azureLogicApps, "ActionHttp")},
			"azurerm_logic_app_trigger_custom":       {Tok: azureResource(azureLogicApps, "TriggerCustom")},
			"azurerm_logic_app_trigger_http_request": {Tok: azureResource(azureLogicApps, "TriggerHttpRequest")},
			"azurerm_logic_app_trigger_recurrence":   {Tok: azureResource(azureLogicApps, "TriggerRecurrence")},
			"azurerm_logic_app_workflow":             {Tok: azureResource(azureLogicApps, "Workflow")},

			// MariaDB
			"azurerm_mariadb_database":      {Tok: azureResource(azureMariaDB, "Database")},
			"azurerm_mariadb_firewall_rule": {Tok: azureResource(azureMariaDB, "FirewallRule")},
			"azurerm_mariadb_server":        {Tok: azureResource(azureMariaDB, "Server")},

			// Notification Hub
			"azurerm_notification_hub":                    {Tok: azureResource(azureNotificationHub, "Hub")},
			"azurerm_notification_hub_authorization_rule": {Tok: azureResource(azureNotificationHub, "AuthorizationRule")},
			"azurerm_notification_hub_namespace":          {Tok: azureResource(azureNotificationHub, "Namespace")},

			// Operational Insights
			"azurerm_log_analytics_workspace": {Tok: azureResource(azureOperationalInsights, "AnalyticsWorkspace")},
			"azurerm_log_analytics_solution": {Tok: azureResource(azureOperationalInsights, "AnalyticsSolution"),
				Docs: &tfbridge.DocInfo{
					Source: "log_analytics_solution.html.markdown",
				}},
			"azurerm_log_analytics_workspace_linked_service": {
				Tok: azureResource(azureOperationalInsights, "AnalyticsWorkspaceLinkedService"),
			},

			// CosmosDB
			"azurerm_cosmosdb_account":            {Tok: azureResource(azureCosmosDB, "Account")},
			"azurerm_cosmosdb_cassandra_keyspace": {Tok: azureResource(azureCosmosDB, "CassandraKeyspace")},
			"azurerm_cosmosdb_mongo_collection":   {Tok: azureResource(azureCosmosDB, "MongoCollection")},
			"azurerm_cosmosdb_mongo_database":     {Tok: azureResource(azureCosmosDB, "MongoDatabase")},
			"azurerm_cosmosdb_sql_database":       {Tok: azureResource(azureCosmosDB, "SqlDatabase")},
			"azurerm_cosmosdb_table":              {Tok: azureResource(azureCosmosDB, "Table")},

			// Managed Service Identity (MSI)
			"azurerm_user_assigned_identity": {Tok: azureResource(azureMSI, "UserAssignedIdentity")},

			// Management Groups
			"azurerm_management_group": {Tok: azureResource(azureManagementGroups, "ManagementGroup")},

			// Management Resource
			"azurerm_management_lock": {Tok: azureResource(azureMgmtResource, "ManangementLock")},

			// Media Services
			"azurerm_media_services_account": {Tok: azureResource(azureMediaServices, "Account")},

			// Monitoring resources
			"azurerm_metric_alertrule":           {Tok: azureResource(azureMonitoring, "AlertRule")},
			"azurerm_monitor_action_group":       {Tok: azureResource(azureMonitoring, "ActionGroup")},
			"azurerm_monitor_activity_log_alert": {Tok: azureResource(azureMonitoring, "ActivityLogAlert")},
			"azurerm_monitor_autoscale_setting":  {Tok: azureResource(azureMonitoring, "AutoscaleSetting")},
			"azurerm_monitor_diagnostic_setting": {Tok: azureResource(azureMonitoring, "DiagnosticSetting")},
			"azurerm_monitor_log_profile":        {Tok: azureResource(azureMonitoring, "LogProfile")},
			"azurerm_monitor_metric_alert":       {Tok: azureResource(azureMonitoring, "MetricAlert")},
			"azurerm_monitor_metric_alertrule":   {Tok: azureResource(azureMonitoring, "MetricAlertRule")},

			// MS SQL
			"azurerm_mssql_elasticpool": {Tok: azureResource(azureMSSQL, "ElasticPool")},

			// MySQL
			"azurerm_mysql_configuration":        {Tok: azureResource(azureMySQL, "Configuration")},
			"azurerm_mysql_database":             {Tok: azureResource(azureMySQL, "Database")},
			"azurerm_mysql_firewall_rule":        {Tok: azureResource(azureMySQL, "FirewallRule")},
			"azurerm_mysql_server":               {Tok: azureResource(azureMySQL, "Server")},
			"azurerm_mysql_virtual_network_rule": {Tok: azureResource(azureMySQL, "VirtualNetworkRule")},

			// Postgress SQL
			"azurerm_postgresql_configuration":        {Tok: azureResource(azurePostgresql, "Configuration")},
			"azurerm_postgresql_database":             {Tok: azureResource(azurePostgresql, "Database")},
			"azurerm_postgresql_firewall_rule":        {Tok: azureResource(azurePostgresql, "FirewallRule")},
			"azurerm_postgresql_server":               {Tok: azureResource(azurePostgresql, "Server")},
			"azurerm_postgresql_virtual_network_rule": {Tok: azureResource(azurePostgresql, "VirtualNetworkRule")},

			// Policy
			"azurerm_policy_assignment":     {Tok: azureResource(azurePolicy, "Assignment")},
			"azurerm_policy_definition":     {Tok: azureResource(azurePolicy, "Definition")},
			"azurerm_policy_set_definition": {Tok: azureResource(azurePolicy, "PolicySetDefinition")},

			// Private Dns
			"azurerm_private_dns_zone": {Tok: azureResource(azurePrivateDNS, "Zone")},

			// SQL
			"azurerm_sql_elasticpool":   {Tok: azureResource(azureSQL, "ElasticPool")},
			"azurerm_sql_database":      {Tok: azureResource(azureSQL, "Database")},
			"azurerm_sql_firewall_rule": {Tok: azureResource(azureSQL, "FirewallRule")},
			"azurerm_sql_server":        {Tok: azureResource(azureSQL, "SqlServer")},
			"azurerm_sql_virtual_network_rule": {Tok: azureResource(azureSQL, "VirtualNetworkRule"),
				Docs: &tfbridge.DocInfo{
					Source: "sql_virtual_network_rule.html.markdown",
				},
			},
			"azurerm_sql_active_directory_administrator": {Tok: azureResource(azureSQL, "ActiveDirectoryAdministrator")},

			// Network
			"azurerm_virtual_network": {
				Tok: azureResource(azureNetwork, "VirtualNetwork"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Virtual Network is 64.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: AutoNameWithMaxLength(azureName, 64),
				},
			},
			"azurerm_virtual_network_peering":            {Tok: azureResource(azureNetwork, "VirtualNetworkPeering")},
			"azurerm_virtual_network_gateway":            {Tok: azureResource(azureNetwork, "VirtualNetworkGateway")},
			"azurerm_virtual_network_gateway_connection": {Tok: azureResource(azureNetwork, "VirtualNetworkGatewayConnection")},
			"azurerm_local_network_gateway":              {Tok: azureResource(azureNetwork, "LocalNetworkGateway")},
			"azurerm_application_gateway": {
				Tok: azureResource(azureNetwork, "ApplicationGateway"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an Application Gateway is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: AutoNameWithMaxLength(azureName, 80),
				},
			},
			"azurerm_application_security_group":           {Tok: azureResource(azureNetwork, "ApplicationSecurityGroup")},
			"azurerm_connection_monitor":                   {Tok: azureResource(azureNetwork, "ConnectionMonitor")},
			"azurerm_firewall":                             {Tok: azureResource(azureNetwork, "Firewall")},
			"azurerm_firewall_application_rule_collection": {Tok: azureResource(azureNetwork, "FirewallApplicationRuleCollection")},
			"azurerm_firewall_nat_rule_collection":         {Tok: azureResource(azureNetwork, "FirewallNatRuleCollection")},
			"azurerm_firewall_network_rule_collection":     {Tok: azureResource(azureNetwork, "FirewallNetworkRuleCollection")},
			"azurerm_network_connection_monitor":           {Tok: azureResource(azureNetwork, "NetworkConnectionMonitor")},
			"azurerm_network_ddos_protection_plan":         {Tok: azureResource(azureNetwork, "DdosProtectionPlan")},
			"azurerm_network_interface": {
				Tok: azureResource(azureNetwork, "NetworkInterface"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Network Interface is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: AutoNameWithMaxLength(azureName, 80),
				},
			},
			"azurerm_network_interface_application_gateway_backend_address_pool_association": {Tok: azureResource(azureNetwork, "NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation")},
			"azurerm_network_interface_application_security_group_association":               {Tok: azureResource(azureNetwork, "NetworkInterfaceApplicationSecurityGroupAssociation")},
			"azurerm_network_interface_backend_address_pool_association":                     {Tok: azureResource(azureNetwork, "NetworkInterfaceBackendAddressPoolAssociation")},
			"azurerm_network_interface_nat_rule_association":                                 {Tok: azureResource(azureNetwork, "NetworkInterfaceNatRuleAssociation")},
			"azurerm_network_packet_capture":                                                 {Tok: azureResource(azureNetwork, "NetworkPacketCapture")},
			"azurerm_network_profile":                                                        {Tok: azureResource(azureNetwork, "Profile")},
			"azurerm_network_security_group": {
				Tok: azureResource(azureNetwork, "NetworkSecurityGroup"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Network Security Group is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: AutoNameWithMaxLength(azureName, 80),
				},
			},
			"azurerm_network_security_rule": {
				Tok: azureResource(azureNetwork, "NetworkSecurityRule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Network Security Rule is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: AutoNameWithMaxLength(azureName, 80),
				},
			},
			"azurerm_network_watcher": {Tok: azureResource(azureNetwork, "NetworkWatcher")},
			"azurerm_packet_capture":  {Tok: azureResource(azureNetwork, "PacketCapture")},
			"azurerm_public_ip": {
				Tok: azureResource(azureNetwork, "PublicIp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Public IP Address is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: AutoNameWithMaxLength(azureName, 80),
				},
			},
			"azurerm_public_ip_prefix": {
				Tok: azureResource(azureNetwork, "PublicIpPrefix"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_route":       {Tok: azureResource(azureNetwork, "Route")},
			"azurerm_route_table": {Tok: azureResource(azureNetwork, "RouteTable")},
			"azurerm_subnet": {
				Tok: azureResource(azureNetwork, "Subnet"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Subnet is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: AutoNameWithMaxLength(azureName, 80),
				},
			},
			"azurerm_subnet_network_security_group_association": {Tok: azureResource(azureNetwork, "SubnetNetworkSecurityGroupAssociation")},
			"azurerm_subnet_route_table_association":            {Tok: azureResource(azureNetwork, "SubnetRouteTableAssociation")},
			"azurerm_express_route_circuit":                     {Tok: azureResource(azureNetwork, "ExpressRouteCircuit")},
			"azurerm_express_route_circuit_authorization": {Tok: azureResource(azureNetwork, "ExpressRouteCircuitAuthorization"),
				Docs: &tfbridge.DocInfo{
					Source: "express_route_circuit_authorization.html.markdown",
				},
			},
			"azurerm_express_route_circuit_peering": {Tok: azureResource(azureNetwork, "ExpressRouteCircuitPeering"),
				Docs: &tfbridge.DocInfo{
					Source: "express_route_circuit_authorization.html.markdown",
				},
			},

			// Traffic Manager
			"azurerm_traffic_manager_endpoint": {Tok: azureResource(azureTrafficManager, "Endpoint")},
			"azurerm_traffic_manager_profile": {
				Tok: azureResource(azureTrafficManager, "Profile"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Traffic Manager Profile is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: AutoNameWithMaxLength(azureName, 80),
				},
			},

			// Recovery Services
			"azurerm_recovery_services_protected_vm":         {Tok: azureResource(azureRecoveryServices, "ProtectedVM")},
			"azurerm_recovery_services_protection_policy_vm": {Tok: azureResource(azureRecoveryServices, "ProtectionPolicyVM")},
			"azurerm_recovery_services_vault":                {Tok: azureResource(azureRecoveryServices, "Vault")},

			// Redis
			"azurerm_redis_cache":         {Tok: azureResource(azureRedis, "Cache")},
			"azurerm_redis_firewall_rule": {Tok: azureResource(azureRedis, "FirewallRule")},

			// Relay
			"azurerm_relay_namespace": {Tok: azureResource(azureRelay, "Namespace")},

			// Scheduler
			"azurerm_scheduler_job":            {Tok: azureResource(azureScheduler, "Job")},
			"azurerm_scheduler_job_collection": {Tok: azureResource(azureScheduler, "JobCollection")},

			// Security Center
			"azurerm_security_center_contact":              {Tok: azureResource(azureSecurityCenter, "Contact")},
			"azurerm_security_center_subscription_pricing": {Tok: azureResource(azureSecurityCenter, "SubscriptionPricing")},
			"azurerm_security_center_workspace":            {Tok: azureResource(azureSecurityCenter, "Workspace")},

			// Service Fabric
			"azurerm_service_fabric_cluster": {Tok: azureResource(azureServiceFabric, "Cluster")},

			// Search
			"azurerm_search_service": {Tok: azureResource(azureSearch, "Service")},

			// SignalR
			"azurerm_signalr_service": {Tok: azureResource(azureSignalr, "Service")},

			// Storage
			"azurerm_storage_account": {Tok: azureResource(azureStorage, "Account")},
			"azurerm_storage_blob": {
				Tok: azureResource(azureStorage, "Blob"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#storage
					// Max length of a container name is 1024.
					azureName: AutoNameWithMaxLength(azureName, 1024),
				}},
			"azurerm_storage_container": {
				Tok: azureResource(azureStorage, "Container"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#storage
					// Max length of a container name is 63.
					azureName: AutoNameWithMaxLength(azureName, 63),
				}},
			"azurerm_storage_share": {Tok: azureResource(azureStorage, "Share")},
			"azurerm_storage_queue": {
				Tok: azureResource(azureStorage, "Queue"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#storage
					// Max length of a queue name is 63.
					azureName: AutoNameWithMaxLength(azureName, 63),
				}},
			"azurerm_storage_table": {
				Tok: azureResource(azureStorage, "Table"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/rest/api/storageservices/Understanding-the-Table-Service-Data-Model#table-names
					// Max length of a table name is 63.
					azureName: AutoNameWithMaxLength(azureName, 63),
				}},

			//StreamAnalytics
			"azurerm_stream_analytics_function_javascript_udf": {Tok: azureResource(azureStreamAnalytics, "FunctionJavaScriptUDF")},
			"azurerm_stream_analytics_job":                     {Tok: azureResource(azureStreamAnalytics, "Job")},
			"azurerm_stream_analytics_output_blob":             {Tok: azureResource(azureStreamAnalytics, "OutputBlob")},
			"azurerm_stream_analytics_output_eventhub":         {Tok: azureResource(azureStreamAnalytics, "OutputEventHub")},
			"azurerm_stream_analytics_output_mssql":            {Tok: azureResource(azureStreamAnalytics, "OutputMssql")},
			"azurerm_stream_analytics_output_servicebus_queue": {Tok: azureResource(azureStreamAnalytics, "OutputServiceBusQueue")},
			"azurerm_stream_analytics_stream_input_blob":       {Tok: azureResource(azureStreamAnalytics, "StreamInputBlob")},
			"azurerm_stream_analytics_stream_input_eventhub":   {Tok: azureResource(azureStreamAnalytics, "StreamInputEventHub")},
			"azurerm_stream_analytics_stream_input_iothub":     {Tok: azureResource(azureStreamAnalytics, "StreamInputIotHub")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{

			"azurerm_application_insights":      {Tok: azureDataSource(azureAppInsights, "getInsights")},
			"azurerm_azuread_application":       {Tok: azureDataSource(azureAD, "getApplication")},
			"azurerm_azuread_service_principal": {Tok: azureDataSource(azureAD, "getServicePrincipal")},
			"azurerm_api_management": {
				Tok: azureDataSource(azureAPIManagement, "getService"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_api_management_api":     {Tok: azureDataSource(azureAPIManagement, "getApi")},
			"azurerm_api_management_group":   {Tok: azureDataSource(azureAPIManagement, "getGroup")},
			"azurerm_api_management_product": {Tok: azureDataSource(azureAPIManagement, "getProduct")},
			"azurerm_api_management_user":    {Tok: azureDataSource(azureAPIManagement, "getUser")},
			"azurerm_app_service": {
				Tok: azureDataSource(azureAppService, "getAppService"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_app_service_plan": {
				Tok: azureDataSource(azureAppService, "getAppServicePlan"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_automation_variable_bool":     {Tok: azureDataSource(azureAutomation, "getBoolVariable")},
			"azurerm_automation_variable_datetime": {Tok: azureDataSource(azureAutomation, "getDateTimeVariable")},
			"azurerm_automation_variable_int":      {Tok: azureDataSource(azureAutomation, "getIntVariable")},
			"azurerm_automation_variable_string":   {Tok: azureDataSource(azureAutomation, "getStringVariable")},
			"azurerm_availability_set":             {Tok: azureDataSource(azureCompute, "getAvailabilitySet")},
			"azurerm_batch_account":                {Tok: azureDataSource(azureBatch, "getAccount")},
			"azurerm_batch_certificate":            {Tok: azureDataSource(azureBatch, "getCertificate")},
			"azurerm_batch_pool":                   {Tok: azureDataSource(azureBatch, "getPool")},
			"azurerm_subscriptions":                {Tok: azureDataSource(azureCore, "getSubscriptions")},
			"azurerm_cdn_profile":                  {Tok: azureDataSource(azureCDN, "getProfile")},
			"azurerm_client_config":                {Tok: azureDataSource(azureCore, "getClientConfig")},
			"azurerm_container_registry":           {Tok: azureDataSource(azureContainerService, "getRegistry")},
			"azurerm_cosmosdb_account":             {Tok: azureDataSource(azureCosmosDB, "getAccount")},
			"azurerm_data_lake_store":              {Tok: azureDataSource(azureDatalake, "getStore")},
			"azurerm_dev_test_lab":                 {Tok: azureDataSource(azureDevTest, "getLab")},
			"azurerm_eventhub_namespace":           {Tok: azureDataSource(azureMessaging, "getEventhubNamespace")},
			"azurerm_image":                        {Tok: azureDataSource(azureCompute, "getImage")},
			"azurerm_servicebus_namespace":         {Tok: azureDataSource(azureMessaging, "getServiceBusNamespace")},
			"azurerm_shared_image":                 {Tok: azureDataSource(azureCompute, "getSharedImage")},
			"azurerm_shared_image_gallery":         {Tok: azureDataSource(azureCompute, "getSharedImageGallery")},
			"azurerm_shared_image_version":         {Tok: azureDataSource(azureCompute, "getSharedImageVersion")},
			"azurerm_lb": {
				Tok: azureDataSource(azureLB, "getLB"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer.html.markdown",
				},
			},
			"azurerm_lb_backend_address_pool": {
				Tok: azureDataSource(azureLB, "getBackendAddressPool"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer_backend_address_pool.html.markdown",
				},
			},
			"azurerm_log_analytics_workspace":       {Tok: azureDataSource(azureOperationalInsights, "getAnalyticsWorkspace")},
			"azurerm_logic_app_workflow":            {Tok: azureDataSource(azureLogicApps, "getWorkflow")},
			"azurerm_management_group":              {Tok: azureDataSource(azureManagementGroups, "getManagementGroup")},
			"azurerm_monitor_action_group":          {Tok: azureDataSource(azureMonitoring, "getActionGroup")},
			"azurerm_monitor_diagnostic_categories": {Tok: azureDataSource(azureMonitoring, "getDiagnosticCategories")},
			"azurerm_monitor_log_profile":           {Tok: azureDataSource(azureMonitoring, "getLogProfile")},
			"azurerm_dns_zone":                      {Tok: azureDataSource(azureDNS, "getZone")},
			"azurerm_key_vault": {
				Tok: azureDataSource(azureKeyVault, "getKeyVault"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},

			"azurerm_key_vault_access_policy":     {Tok: azureDataSource(azureKeyVault, "getAccessPolicy")},
			"azurerm_key_vault_key":               {Tok: azureDataSource(azureKeyVault, "getKey")},
			"azurerm_key_vault_secret":            {Tok: azureDataSource(azureKeyVault, "getSecret")},
			"azurerm_kubernetes_cluster":          {Tok: azureDataSource(azureContainerService, "getKubernetesCluster")},
			"azurerm_kubernetes_service_versions": {Tok: azureDataSource(azureContainerService, "getKubernetesServiceVersions")},
			"azurerm_notification_hub":            {Tok: azureDataSource(azureNotificationHub, "getHub")},
			"azurerm_notification_hub_namespace": {
				Tok: azureDataSource(azureNotificationHub, "getNamespace"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_virtual_network": {
				Tok: azureDataSource(azureNetwork, "getVirtualNetwork"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Explicitly map addressSpace => addressSpaces to avoid confusion
					// with addressSpaces => addressSpacesCollection below.
					"address_space": {Name: "addressSpaces"},
					// Conflicts with the pluralized `addressSpaces` property. Since address
					// spaces is deprectaed upstream and we will pluralize address_space, consumers
					// should not be broken but this will avoid duplicate field definitions.
					"address_spaces": {Name: "addressSpacesCollection"},
				},
			},
			"azurerm_virtual_network_gateway":    {Tok: azureDataSource(azureNetwork, "getVirtualNetworkGateway")},
			"azurerm_network_security_group":     {Tok: azureDataSource(azureNetwork, "getNetworkSecurityGroup")},
			"azurerm_network_interface":          {Tok: azureDataSource(azureNetwork, "getNetworkInterface")},
			"azurerm_network_watcher":            {Tok: azureDataSource(azureNetwork, "getNetworkWatcher")},
			"azurerm_public_ip":                  {Tok: azureDataSource(azureNetwork, "getPublicIP")},
			"azurerm_public_ips":                 {Tok: azureDataSource(azureNetwork, "getPublicIPs")},
			"azurerm_application_security_group": {Tok: azureDataSource(azureNetwork, "getApplicationSecurityGroup")},
			"azurerm_recovery_services_vault":    {Tok: azureDataSource(azureRecoveryServices, "getVault")},
			"azurerm_redis_cache":                {Tok: azureDataSource(azureRedis, "getCache")},

			"azurerm_resource_group": {Tok: azureDataSource(azureCore, "getResourceGroup")},
			"azurerm_snapshot":       {Tok: azureDataSource(azureCompute, "getSnapshot")},
			"azurerm_subnet":         {Tok: azureDataSource(azureNetwork, "getSubnet")},
			"azurerm_route_table":    {Tok: azureDataSource(azureNetwork, "getRouteTable")},
			"azurerm_express_route_circuit": {
				Tok: azureDataSource(azureNetwork, "getExpressRouteCircuit"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_sql_server":                             {Tok: azureDataSource(azureSQL, "getServer")},
			"azurerm_virtual_network_gateway_connection":     {Tok: azureDataSource(azureNetwork, "getGatewayConnection")},
			"azurerm_firewall":                               {Tok: azureDataSource(azureNetwork, "getFirewall")},
			"azurerm_subscription":                           {Tok: azureDataSource(azureCore, "getSubscription")},
			"azurerm_policy_definition":                      {Tok: azureDataSource(azurePolicy, "getPolicyDefintion")},
			"azurerm_platform_image":                         {Tok: azureDataSource(azureCompute, "getPlatformImage")},
			"azurerm_managed_disk":                           {Tok: azureDataSource(azureCompute, "getManagedDisk")},
			"azurerm_role_definition":                        {Tok: azureDataSource(azureRole, "getRoleDefinition")},
			"azurerm_builtin_role_definition":                {Tok: azureDataSource(azureRole, "getBuiltinRoleDefinition")},
			"azurerm_recovery_services_protection_policy_vm": {Tok: azureDataSource(azureRecoveryServices, "getVMProtectionPolicy")},
			"azurerm_scheduler_job_collection":               {Tok: azureDataSource(azureScheduler, "getJobCollection")},
			"azurerm_storage_account":                        {Tok: azureDataSource(azureStorage, "getAccount")},
			"azurerm_storage_account_sas":                    {Tok: azureDataSource(azureStorage, "getAccountSAS")},
			"azurerm_traffic_manager_geographical_location":  {Tok: azureDataSource(azureTrafficManager, "getGeographicalLocation")},
			"azurerm_virtual_machine":                        {Tok: azureDataSource(azureCompute, "getVirtualMachine")},
			"azurerm_hdinsight_cluster":                      {Tok: azureDataSource(azureHdInsight, "getCluster")},
			"azurerm_stream_analytics_job":                   {Tok: azureDataSource(azureStreamAnalytics, "getJob")},
			"azurerm_user_assigned_identity":                 {Tok: azureDataSource(azureCore, "getUserAssignedIdentity")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
			},
			Dependencies: map[string]string{
				"@pulumi/pulumi":                "^0.17.25",
				"azure-eventgrid":               "^1.6.0",
				"@azure/functions":              "^1.0.3",
				"@azure/ms-rest-azure-js":       "^1.3.8",
				"@azure/ms-rest-nodeauth":       "^2.0.2",
				"azure-functions-ts-essentials": "^1.3.2",
			},
			Overlay: &tfbridge.OverlayInfo{
				Files: []string{},
				DestFiles: []string{
					"location.ts",
					"util.ts",
				},
				Modules: map[string]*tfbridge.OverlayInfo{
					"appservice": {
						DestFiles: []string{
							"zMixins.ts",
							"zMixins_http.ts",
							"zMixins_timer.ts",
						},
					},
					"core": {
						DestFiles: []string{
							"zMixins.ts",
						},
					},
					"cosmosdb": {
						DestFiles: []string{
							"zMixins.ts",
						},
					},
					"eventhub": {
						DestFiles: []string{
							"zMixins.ts",
						},
					},
					"iot": {
						DestFiles: []string{
							"zMixins.ts",
						},
					},
					"storage": {
						DestFiles: []string{
							"zMixins.ts",
						},
					},
				},
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=0.17.12,<0.18.0",
			},
		},
	}

	// TODO[pulumi/pulumi#280]: Until we can pass an Archive as an Asset, create a resource type
	// specifically for uploading ZIP blobs to Azure storage.
	prov.P.ResourcesMap["azurerm_storage_zipblob"] = prov.P.ResourcesMap["azurerm_storage_blob"]
	prov.Resources["azurerm_storage_zipblob"] = &tfbridge.ResourceInfo{
		Tok: azureResource(azureStorage, "ZipBlob"),
		Fields: map[string]*tfbridge.SchemaInfo{
			"source": {
				Name: "content",
				Asset: &tfbridge.AssetTranslation{
					Kind:   tfbridge.FileArchive,
					Format: resource.ZIPArchive,
				},
			},
			// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#storage
			// Max length of a container name is 1024.
			azureName: AutoNameWithMaxLength(azureName, 1024),
		},
	}

	// Provide default values for certain resource properties, to improve usability:
	//     1) For all resources with `name` properties, we will add an auto-name property.  Make sure to skip those
	//        that already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	//     2) For all resources with `location` properties, default to the resource group's location to which the
	//        resource belongs. This ensures that each resource doesn't need to be given a location explicitly.
	rgRegionMap := make(map[string]string)
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			// Only apply automatic values for input properties (Optional || Required) named `name`
			if tfs, has := schema.Schema[azureName]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[azureName]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					// Use conservative options that apply broadly for Azure.  See
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions for
					// details.
					res.Fields[azureName] = AutoNameWithMaxLength(azureName, 24)
				}
			}
			if tfs, has := schema.Schema[azureLocation]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[azureLocation]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[azureLocation] = &tfbridge.SchemaInfo{
						Name: azureLocation,
						Default: &tfbridge.DefaultInfo{
							From: func(res *tfbridge.PulumiResource) (interface{}, error) {
								// In here we will fetch the resource group property from this resource and
								// use it to query the Azure API and return the resource group's location. We
								// maintain a little cache to avoid querying the API too many times. Note that
								// it's possible (likely) during previews that the location will be unknown, so
								// we special logic to propagate likewise unknown location values.
								if rg, has := res.Properties["resourceGroupName"]; has {
									if rg.IsComputed() || rg.IsOutput() {
										return config.UnknownVariableValue, nil
									}
									if rg.IsString() {
										rgName := rg.StringValue()
										rgRegion, has := rgRegionMap[rgName]
										if !has {
											rgRes := p.ResourcesMap["azurerm_resource_group"]
											contract.Assert(rgRes != nil)
											rgData := rgRes.Data(&terraform.InstanceState{
												// Mock up a URI with the relevant pieces, so that we can read back
												// the resource group's location information.
												ID: fmt.Sprintf("/subscriptions/_/resourceGroups/%s", rg.StringValue()),
											})
											if err := rgRes.Read(rgData, p.Meta()); err != nil {
												return nil, err
											}
											if rgData.Id() == "" {
												rgRegion = config.UnknownVariableValue
											} else {
												rgRegion = azure.NormalizeLocation(rgData.Get("location"))
											}
											rgRegionMap[rgName] = rgRegion // memoize the value.
										}
										return rgRegion, nil
									}
								}

								return nil, nil
							},
						},
					}
				}
			}
		}
	}

	return prov
}

// IDEA: Consider moving this refactoring of AutoName to allow more flexible configuration back into pulumi-terraform.

// AutoNameOptions provides parameters to AutoName to control how names will be generated
type AutoNameOptions struct {
	// A separator between name and random portions of the
	Separator string
	// Maximum length of the generated name
	Maxlen int
	// Number of characters of random hex digits to add to the name
	Randlen int
	// A transform to apply to the name prior to adding random characters
	Transform func(string) string
	// Force the name to be lowercase prior to adding random characters
	ForceLowercase bool
}

// AutoName creates custom schema for a Terraform name property which is automatically populated
// from the resource's URN name, and transformed based on the provided options.
func AutoName(name string, options AutoNameOptions) *tfbridge.SchemaInfo {
	return &tfbridge.SchemaInfo{
		Name: name,
		Default: &tfbridge.DefaultInfo{
			From: FromName(options),
		},
	}
}

func AutoNameWithMaxLength(name string, maxlength int) *tfbridge.SchemaInfo {
	return AutoName(name, AutoNameOptions{
		ForceLowercase: true,
		Separator:      "",
		Maxlen:         maxlength,
		Randlen:        8,
	})
}

// FromName automatically propagates a resource's URN onto the resulting default info.
func FromName(options AutoNameOptions) func(res *tfbridge.PulumiResource) (interface{}, error) {
	return func(res *tfbridge.PulumiResource) (interface{}, error) {
		// Take the URN name part, transform it if required, and then append some unique characters if requested.
		vs := string(res.URN.Name())
		if options.Transform != nil {
			vs = options.Transform(vs)
		} else if options.ForceLowercase {
			vs = strings.ToLower(vs)
		}
		if options.Randlen > 0 {
			uniqueHex, err := resource.NewUniqueHex(vs+options.Separator, options.Randlen, options.Maxlen)
			if err != nil {
				return uniqueHex, errors.Wrapf(err, "Could not make instance of '%v'.", res.URN.Type())
			}

			return uniqueHex, nil
		}
		if len(vs) > options.Maxlen {
			return "", errors.Errorf("name '%s' is longer than maximum length %d", vs, options.Maxlen)
		}
		return vs, nil
	}
}
