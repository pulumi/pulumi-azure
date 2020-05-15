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

package provider

import (
	"fmt"
	"os"
	"strings"
	"unicode"

	"github.com/Azure/go-autorest/autorest/azure/cli"
	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/hashicorp/terraform-plugin-sdk/terraform"
	"github.com/pulumi/pulumi-azure/provider/v3/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v2/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v2/go/common/util/contract"
	"github.com/terraform-providers/terraform-provider-azurerm/azurerm"
	"github.com/terraform-providers/terraform-provider-azurerm/azurerm/helpers/azure"
)

const (
	azureName     = "name"
	azureLocation = "location"
)

// all of the Azure token components used below.
const (
	// packages:
	azurePkg = "azure"
	// modules; in general, we took naming inspiration from the Azure SDK for Go:
	// https://godoc.org/github.com/Azure/azure-sdk-for-go
	azureAnalysisServices    = "AnalysisServices"    // Analysis Services
	azureAPIManagement       = "ApiManagement"       // API Management
	azureAppConfiguration    = "AppConfiguration"    // App Configuration
	azureAppInsights         = "AppInsights"         // AppInsights
	azureAppPlatform         = "AppPlatform"         // AppPlatform
	azureAppService          = "AppService"          // App Service
	azureAutomation          = "Automation"          // Automation
	azureAuthorization       = "Authorization"       // Authorization
	azureBackup              = "Backup"              // Backup
	azureBatch               = "Batch"               // Batch
	azureBot                 = "Bot"                 // Bot
	azureCDN                 = "Cdn"                 // CDN
	azureCognitive           = "Cognitive"           // Cognitive
	azureCompute             = "Compute"             // Virtual Machines
	azureContainerService    = "ContainerService"    // Azure Container Service
	azureCore                = "Core"                // Base Resources
	azureCosmosDB            = "CosmosDB"            // Cosmos DB
	azureCostManagement      = "CostManagement"      // CostManagement
	azureDashboard           = "Dashboard"           // Dashboard
	azureDatabaseMigration   = "DatabaseMigration"   // Database Migration
	azureDataFactory         = "DataFactory"         // Data Factory
	azureDatalake            = "DataLake"            // Data Lake
	azureDataShare           = "DataShare"           // DataShare
	azureDataBricks          = "DataBricks"          // DataBricks
	azureDevSpace            = "DevSpace"            // DevSpace
	azureDevTest             = "DevTest"             // Dev Test Labs
	azureDNS                 = "Dns"                 // DNS
	azureFrontdoor           = "FrontDoor"           // Frontdoor
	azureHdInsight           = "HDInsight"           // nolint:misspell // HDInsight
	azureHealthcare          = "Healthcare"          // HealthCare
	azureHpc                 = "Hpc"                 // High-performance Compute
	azureIot                 = "Iot"                 // IoT resource
	azureIotCentral          = "IotCentral"          // IoT central
	azureKeyVault            = "KeyVault"            // Key Vault
	azureKusto               = "Kusto"               // Kusto
	azureLogAnalytics        = "LogAnalytics"        // Log Analytics
	azureLogicApps           = "LogicApps"           // Logic Apps
	azureLB                  = "Lb"                  // Load Balancer
	azureMariaDB             = "MariaDB"             // MariaDB
	azureEventGrid           = "EventGrid"           // Event Grid
	azureEventHub            = "EventHub"            // Event Hub
	azureMachineLearning     = "MachineLearning"     // Machine Learning Resources
	azureMaintenance         = "Maintenance"         // Maintenance Resources
	azureManagedApplication  = "ManagedApplication"  // ManagedApplication
	azureManagement          = "Management"          // Management Resources
	azureMaps                = "Maps"                // Maps
	azureMarketPlace         = "Marketplace"         // Marketplace
	azureMediaServices       = "MediaServices"       // Media Services
	azureMixedReality        = "MixedReality"        // Mixed Reality
	azureMonitoring          = "Monitoring"          // Metrics/monitoring resources
	azureMSSQL               = "MSSql"               // MS Sql
	azureMySQL               = "MySql"               // MySql
	azureNetapp              = "NetApp"              // NetApp
	azureNetwork             = "Network"             // Networking
	azureNotificationHub     = "NotificationHub"     // Notification Hub
	azureOperationalInsights = "OperationalInsights" // Operational Insights
	azurePostgresql          = "PostgreSql"          // Postgress SQL
	azurePolicy              = "Policy"              // Policy
	azurePowerBi             = "PowerBI"             // PowerBI
	azureProximity           = "Proximity"           // Proximity
	azurePrivateDNS          = "PrivateDns"          // Private DNS
	azurePrivateLink         = "PrivateLink"         // PrivateLink
	azureRecoveryServices    = "RecoveryServices"    // Recovery Services
	azureRedis               = "Redis"               // RedisCache
	azureRelay               = "Relay"               // Relay
	azureSecurityCenter      = "SecurityCenter"      // Security Center
	azureSentinel            = "Sentinel"            // Sentinel
	azureServiceBus          = "ServiceBus"          // ServiceBus
	azureServiceFabric       = "ServiceFabric"       // Service Fabric
	azureSearch              = "Search"              // Search
	azureSignalr             = "SignalR"             // SignalR
	azureSiteRecovery        = "SiteRecovery"        // SiteRecovery
	azureSQL                 = "Sql"                 // SQL
	azureStorage             = "Storage"             // Storage
	azureStreamAnalytics     = "StreamAnalytics"     // StreamAnalytics
	azureWaf                 = "Waf"                 // WAF

	// Legacy Module Names
	azureLegacyRole             = "Role"               // Azure Role (Legacy)
	azureLegacyMSI              = "Msi"                // Managed Service Identity / MSI (Legacy)
	azureLegacyManagementGroups = "ManagementGroups"   // Management Groups (Legacy)
	azureLegacyMgmtResource     = "ManagementResource" // Management Resource (Legacy)
	azureLegacyTrafficManager   = "TrafficManager"     // Traffic Manager (Legacy)
)

var namespaceMap = map[string]string{
	"azure": "Azure",
}

// azureMember manufactures a member for the Azure package and the given module and type. It automatically
// names the file by simply lower casing the member's first character.
func azureMember(moduleTitle, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	fn := string(unicode.ToLower(rune(mem[0]))) + mem[1:]
	token := moduleName + "/" + fn
	return tokens.ModuleMember(azurePkg + ":" + token + ":" + mem)
}

// azureType manufactures a type token for the Azure package and the given module and type.
func azureType(mod string, typ string) tokens.Type {
	return tokens.Type(azureMember(mod, typ))
}

// azureDataSource manufactures a standard member given a module and data source name.
func azureDataSource(mod string, res string) tokens.ModuleMember {
	return azureMember(mod, res)
}

// azureResource manufactures a standard resource token given a module and resource name.
func azureResource(mod string, res string) tokens.Type {
	return azureType(mod, res)
}

// boolRef returns a reference to the bool argument.
func boolRef(b bool) *bool {
	return &b
}

type cloudShellProfile struct {
	useMSI         bool
	msiEndpoint    string
	subscriptionID string
	tenantID       string
}

// Azure Cloud Shell is a special case in terms of config: it provides authentication via
// an MSI endpoint, but it also has Azure CLI installed. Therefore, to make Pulumi CLI work
// out of the box with no actions required from a user, we combine the MSI endpoint authentication
// with retrieving the subscription information from the current profile. If both are found,
// we switch the provider to the endpoint/subscriptoin by default.
func detectCloudShell() cloudShellProfile {
	negative := cloudShellProfile{
		useMSI: false,
	}

	msiEndpoint := os.Getenv("MSI_ENDPOINT")
	if msiEndpoint == "" {
		return negative
	}

	profilePath, err := cli.ProfilePath()
	if err != nil {
		return negative
	}

	profile, err := cli.LoadProfile(profilePath)
	if err != nil {
		return negative
	}

	for _, subscription := range profile.Subscriptions {
		if subscription.IsDefault {
			return cloudShellProfile{
				useMSI:         true,
				msiEndpoint:    msiEndpoint,
				subscriptionID: subscription.ID,
				tenantID:       subscription.TenantID,
			}
		}
	}

	return negative
}

// Provider returns additional overlaid schema and metadata associated with the azure package.
//
// nolint: lll
func Provider() tfbridge.ProviderInfo {
	p := azurerm.Provider().(*schema.Provider)

	// Adjust the defaults if running in Azure Cloud Shell.
	// Environment variables still take preference, e.g. USE_MSI=false disables the MSI endpoint.
	cloudShell := detectCloudShell()

	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "azurerm",
		Description: "A Pulumi package for creating and managing Microsoft Azure cloud resources.",
		Keywords:    []string{"pulumi", "azure"},
		Homepage:    "https://pulumi.io",
		License:     "Apache-2.0",
		Repository:  "https://github.com/pulumi/pulumi-azure",
		Version:     version.Version,
		Config: map[string]*tfbridge.SchemaInfo{
			"subscription_id": {
				Default: &tfbridge.DefaultInfo{
					Value:   cloudShell.subscriptionID,
					EnvVars: []string{"ARM_SUBSCRIPTION_ID"},
				},
			},
			"client_id": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"AZURE_CLIENT_ID", "ARM_CLIENT_ID"},
				},
			},
			"tenant_id": {
				Default: &tfbridge.DefaultInfo{
					Value:   cloudShell.tenantID,
					EnvVars: []string{"AZURE_TENANT_ID", "ARM_TENANT_ID"},
				},
			},
			"environment": {
				Default: &tfbridge.DefaultInfo{
					Value:   "public",
					EnvVars: []string{"AZURE_ENVIRONMENT", "ARM_ENVIRONMENT"},
				},
			},
			"client_certificate_password": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"AZURE_CLIENT_CERTIFICATE_PASSWORD", "ARM_CLIENT_CERTIFICATE_PASSWORD"},
				},
			},
			"client_certificate_path": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"AZURE_CLIENT_CERTIFICATE_PATH", "ARM_CLIENT_CERTIFICATE_PATH"},
				},
			},
			"client_secret": {
				Default: &tfbridge.DefaultInfo{
					Value:   "",
					EnvVars: []string{"AZURE_CLIENT_SECRET", "ARM_CLIENT_SECRET"},
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
					Value:   cloudShell.useMSI,
					EnvVars: []string{"ARM_USE_MSI"},
				},
			},
			"msi_endpoint": {
				Default: &tfbridge.DefaultInfo{
					Value:   cloudShell.msiEndpoint,
					EnvVars: []string{"ARM_MSI_ENDPOINT"},
				},
			},
			"disable_terraform_partner_id": {
				Default: &tfbridge.DefaultInfo{
					Value:   true,
					EnvVars: []string{"ARM_DISABLE_TERRAFORM_PARTNER_ID"},
				},
			},
			"storage_use_azuread": {
				Default: &tfbridge.DefaultInfo{
					Value:   false,
					EnvVars: []string{"ARM_STORAGE_USE_AZUREAD"},
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
			// API Mannagement
			"azurerm_api_management": {
				Tok: azureResource(azureAPIManagement, "Service"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an API Management name is 50.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#general
					//azureName: (azureName, 50),
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    50,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_api_management_api":                         {Tok: azureResource(azureAPIManagement, "Api")},
			"azurerm_api_management_api_operation":               {Tok: azureResource(azureAPIManagement, "ApiOperation")},
			"azurerm_api_management_api_operation_policy":        {Tok: azureResource(azureAPIManagement, "ApiOperationPolicy")},
			"azurerm_api_management_api_policy":                  {Tok: azureResource(azureAPIManagement, "ApiPolicy")},
			"azurerm_api_management_api_schema":                  {Tok: azureResource(azureAPIManagement, "ApiSchema")},
			"azurerm_api_management_api_version_set":             {Tok: azureResource(azureAPIManagement, "ApiVersionSet")},
			"azurerm_api_management_authorization_server":        {Tok: azureResource(azureAPIManagement, "AuthorizationServer")},
			"azurerm_api_management_backend":                     {Tok: azureResource(azureAPIManagement, "Backend")},
			"azurerm_api_management_certificate":                 {Tok: azureResource(azureAPIManagement, "Certificate")},
			"azurerm_api_management_group":                       {Tok: azureResource(azureAPIManagement, "Group")},
			"azurerm_api_management_group_user":                  {Tok: azureResource(azureAPIManagement, "GroupUser")},
			"azurerm_api_management_logger":                      {Tok: azureResource(azureAPIManagement, "Logger")},
			"azurerm_api_management_openid_connect_provider":     {Tok: azureResource(azureAPIManagement, "OpenIdConnectProvider")},
			"azurerm_api_management_product":                     {Tok: azureResource(azureAPIManagement, "Product")},
			"azurerm_api_management_product_api":                 {Tok: azureResource(azureAPIManagement, "ProductApi")},
			"azurerm_api_management_product_group":               {Tok: azureResource(azureAPIManagement, "ProductGroup")},
			"azurerm_api_management_product_policy":              {Tok: azureResource(azureAPIManagement, "ProductPolicy")},
			"azurerm_api_management_property":                    {Tok: azureResource(azureAPIManagement, "Property")},
			"azurerm_api_management_subscription":                {Tok: azureResource(azureAPIManagement, "Subscription")},
			"azurerm_api_management_user":                        {Tok: azureResource(azureAPIManagement, "User")},
			"azurerm_api_management_diagnostic":                  {Tok: azureResource(azureAPIManagement, "Diagnostic")},
			"azurerm_api_management_identity_provider_aad":       {Tok: azureResource(azureAPIManagement, "IdentityProviderAad")},
			"azurerm_api_management_identity_provider_google":    {Tok: azureResource(azureAPIManagement, "IdentityProviderGoogle")},
			"azurerm_api_management_identity_provider_facebook":  {Tok: azureResource(azureAPIManagement, "IdentityProviderFacebook")},
			"azurerm_api_management_identity_provider_twitter":   {Tok: azureResource(azureAPIManagement, "IdentityProviderTwitter")},
			"azurerm_api_management_identity_provider_microsoft": {Tok: azureResource(azureAPIManagement, "IdentityProviderMicrosoft")},
			"azurerm_api_management_named_value":                 {Tok: azureResource(azureAPIManagement, "NamedValue")},

			// Analysis Services
			"azurerm_analysis_services_server": {Tok: azureResource(azureAnalysisServices, "Server")},

			// AppInsights
			"azurerm_application_insights": {Tok: azureResource(azureAppInsights, "Insights")},
			"azurerm_application_insights_api_key": {
				Tok: azureResource(azureAppInsights, "ApiKey"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"api_key": {
						CSharpName: "Key",
					},
				},
			},
			"azurerm_application_insights_web_test": {
				Tok: azureResource(azureAppInsights, "WebTest"),
				Docs: &tfbridge.DocInfo{
					Source: "application_insights_webtests.html.markdown",
				},
			},
			"azurerm_application_insights_analytics_item": {Tok: azureResource(azureAppInsights, "AnalyticsItem")},

			// App Service
			"azurerm_app_service": {
				Tok: azureResource(azureAppService, "AppService"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an app service name is 60.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#general
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    60,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
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
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    40,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
					"kind": {
						Type:     "string",
						AltTypes: []tokens.Type{azureType(azureAppService, "Kind")},
					},
				}},
			"azurerm_app_service_slot":        {Tok: azureResource(azureAppService, "Slot")},
			"azurerm_app_service_active_slot": {Tok: azureResource(azureAppService, "ActiveSlot")},
			"azurerm_function_app": {
				Tok: azureResource(azureAppService, "FunctionApp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a functionapp name is 60.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#compute
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    60,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
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
			"azurerm_function_app_slot":                {Tok: azureResource(azureAppService, "FunctionAppSlot")},
			"azurerm_app_service_certificate":          {Tok: azureResource(azureAppService, "Certificate")},
			"azurerm_app_service_source_control_token": {Tok: azureResource(azureAppService, "SourceCodeToken")},
			"azurerm_app_service_certificate_order":    {Tok: azureResource(azureAppService, "CertificateOrder")},
			"azurerm_app_service_virtual_network_swift_connection": {
				Tok: azureResource(azureAppService, "VirtualNetworkSwiftConnection"),
			},
			"azurerm_app_service_environment": {Tok: azureResource(azureAppService, "Environment")},

			// AppPlatform
			"azurerm_spring_cloud_service": {Tok: azureResource(azureAppPlatform, "SpringCloudService")},
			"azurerm_spring_cloud_app":     {Tok: azureResource(azureAppPlatform, "SpringCloudApp")},

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
			"azurerm_automation_job_schedule":          {Tok: azureResource(azureAutomation, "JobSchedule")},
			"azurerm_automation_certificate":           {Tok: azureResource(azureAutomation, "Certificate")},

			// Azure Container Service
			"azurerm_container_registry": {
				Tok: azureResource(azureContainerService, "Registry"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#containers
					// Max length of a container name is 50
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    50,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_container_group": {
				Tok: azureResource(azureContainerService, "Group"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#containers
					// Max length of a container group/instance is 63
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    63,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				}},
			"azurerm_kubernetes_cluster": {
				Tok: azureResource(azureContainerService, "KubernetesCluster"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"addon_profile": {
						SuppressEmptyMapElements: boolRef(true),
					},
				},
			},
			"azurerm_kubernetes_cluster_node_pool": {
				Tok: azureResource(azureContainerService, "KubernetesClusterNodePool"),
			},

			// Batch
			"azurerm_batch_account":     {Tok: azureResource(azureBatch, "Account")},
			"azurerm_batch_application": {Tok: azureResource(azureBatch, "Application")},
			"azurerm_batch_certificate": {
				Tok: azureResource(azureBatch, "Certificate"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"certificate": {
						CSharpName: "BatchCertificate",
					},
				},
			},
			"azurerm_batch_pool": {Tok: azureResource(azureBatch, "Pool")},

			// Core
			"azurerm_resource_group": {
				Tok: azureResource(azureCore, "ResourceGroup"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#general
					// Max length of a resource group name is 90
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    90,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
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
			"azurerm_custom_provider":     {Tok: azureResource(azureCore, "CustomProvider")},

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
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    80,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_virtual_machine_extension": {Tok: azureResource(azureCompute, "Extension")},
			"azurerm_virtual_machine": {
				Tok: azureResource(azureCompute, "VirtualMachine"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a virtual machine name is 64. Note that the Windows host name is max 15 characters but it can be set separately.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#compute
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    64,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_virtual_machine_data_disk_attachment": {Tok: azureResource(azureCompute, "DataDiskAttachment")},
			"azurerm_virtual_machine_scale_set":            {Tok: azureResource(azureCompute, "ScaleSet")},

			"azurerm_managed_disk":                        {Tok: azureResource(azureCompute, "ManagedDisk")},
			"azurerm_snapshot":                            {Tok: azureResource(azureCompute, "Snapshot")},
			"azurerm_image":                               {Tok: azureResource(azureCompute, "Image")},
			"azurerm_shared_image":                        {Tok: azureResource(azureCompute, "SharedImage")},
			"azurerm_shared_image_gallery":                {Tok: azureResource(azureCompute, "SharedImageGallery")},
			"azurerm_shared_image_version":                {Tok: azureResource(azureCompute, "SharedImageVersion")},
			"azurerm_bastion_host":                        {Tok: azureResource(azureCompute, "BastionHost")},
			"azurerm_dedicated_host_group":                {Tok: azureResource(azureCompute, "DedicatedHostGroup")},
			"azurerm_disk_encryption_set":                 {Tok: azureResource(azureCompute, "DiskEncryptionSet")},
			"azurerm_dedicated_host":                      {Tok: azureResource(azureCompute, "DedicatedHost")},
			"azurerm_linux_virtual_machine":               {Tok: azureResource(azureCompute, "LinuxVirtualMachine")},
			"azurerm_linux_virtual_machine_scale_set":     {Tok: azureResource(azureCompute, "LinuxVirtualMachineScaleSet")},
			"azurerm_virtual_machine_scale_set_extension": {Tok: azureResource(azureCompute, "VirtualMachineScaleSetExtension")},
			"azurerm_windows_virtual_machine":             {Tok: azureResource(azureCompute, "WindowsVirtualMachine")},
			"azurerm_windows_virtual_machine_scale_set":   {Tok: azureResource(azureCompute, "WindowsVirtualMachineScaleSet")},

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
			"azurerm_data_factory_linked_service_mysql":        {Tok: azureResource(azureDataFactory, "LinkedServiceMysql")},
			"azurerm_data_factory_linked_service_postgresql":   {Tok: azureResource(azureDataFactory, "LinkedServicePostgresql")},
			"azurerm_data_factory_linked_service_sql_server":   {Tok: azureResource(azureDataFactory, "LinkedServiceSqlServer")},
			"azurerm_data_factory_pipeline":                    {Tok: azureResource(azureDataFactory, "Pipeline")},
			"azurerm_data_factory_integration_runtime_managed": {Tok: azureResource(azureDataFactory, "IntegrationRuntimeManaged")},
			"azurerm_data_factory_trigger_schedule":            {Tok: azureResource(azureDataFactory, "TriggerSchedule")},

			// Data Lake
			"azurerm_data_lake_analytics_account":       {Tok: azureResource(azureDatalake, "AnalyticsAccount")},
			"azurerm_data_lake_analytics_firewall_rule": {Tok: azureResource(azureDatalake, "AnalyticsFirewallRule")},
			"azurerm_data_lake_store":                   {Tok: azureResource(azureDatalake, "Store")},
			"azurerm_data_lake_store_file":              {Tok: azureResource(azureDatalake, "StoreFile")},
			"azurerm_data_lake_store_firewall_rule":     {Tok: azureResource(azureDatalake, "StoreFirewallRule")},

			// DataShare
			"azurerm_data_share_account": {Tok: azureResource(azureDataShare, "Account")},

			// DevSpace
			"azurerm_devspace_controller": {Tok: azureResource(azureDevSpace, "Controller")},

			// Dev Test
			"azurerm_dev_test_lab":                     {Tok: azureResource(azureDevTest, "Lab")},
			"azurerm_dev_test_linux_virtual_machine":   {Tok: azureResource(azureDevTest, "LinuxVirtualMachine")},
			"azurerm_dev_test_policy":                  {Tok: azureResource(azureDevTest, "Policy")},
			"azurerm_dev_test_schedule":                {Tok: azureResource(azureDevTest, "Schedule")},
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
					// We need this explicit mapping to avoid automatic singularization when converting Pulumi
					// to Terraform name, so that the deprecated singular property isn't picked up.
					"records": {Name: "records"},
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

			// EventHub
			"azurerm_eventhub":                              {Tok: azureResource(azureEventHub, "EventHub")},
			"azurerm_eventhub_namespace":                    {Tok: azureResource(azureEventHub, "EventHubNamespace")},
			"azurerm_eventhub_namespace_authorization_rule": {Tok: azureResource(azureEventHub, "EventHubNamespaceAuthorizationRule")},
			"azurerm_eventhub_namespace_disaster_recovery_config": {
				Tok: azureResource(azureEventHub, "EventhubNamespaceDisasterRecoveryConfig"),
			},

			// IoT Resources
			"azurerm_iothub": {Tok: azureResource(azureIot, "IoTHub"),
				Docs: &tfbridge.DocInfo{
					Source: "iothub.html.markdown",
				},
			},
			"azurerm_iothub_consumer_group":             {Tok: azureResource(azureIot, "ConsumerGroup")},
			"azurerm_iothub_shared_access_policy":       {Tok: azureResource(azureIot, "SharedAccessPolicy")},
			"azurerm_iothub_endpoint_eventhub":          {Tok: azureResource(azureIot, "EndpointEventhub")},
			"azurerm_iothub_endpoint_servicebus_queue":  {Tok: azureResource(azureIot, "EndpointServicebusQueue")},
			"azurerm_iothub_endpoint_servicebus_topic":  {Tok: azureResource(azureIot, "EndpointServicebusTopic")},
			"azurerm_iothub_endpoint_storage_container": {Tok: azureResource(azureIot, "EndpointStorageContainer")},
			"azurerm_iothub_route":                      {Tok: azureResource(azureIot, "Route")},
			"azurerm_iothub_dps":                        {Tok: azureResource(azureIot, "IotHubDps")},
			"azurerm_iothub_dps_certificate":            {Tok: azureResource(azureIot, "IotHubCertificate")},
			"azurerm_iothub_fallback_route":             {Tok: azureResource(azureIot, "FallbackRoute")},
			"azurerm_iothub_dps_shared_access_policy":   {Tok: azureResource(azureIot, "DpsSharedAccessPolicy")},

			// KeyVault
			"azurerm_key_vault":               {Tok: azureResource(azureKeyVault, "KeyVault")},
			"azurerm_key_vault_access_policy": {Tok: azureResource(azureKeyVault, "AccessPolicy")},
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
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    80,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
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
			"azurerm_log_analytics_datasource_windows_event": {
				Tok: azureResource(azureLogAnalytics, "DataSourceWindowsEvent"),
			},
			"azurerm_log_analytics_datasource_windows_performance_counter": {
				Tok: azureResource(azureLogAnalytics, "DataSourceWindowsPerformanceCounter"),
			},

			// Logic Apps
			"azurerm_logic_app_action_custom":        {Tok: azureResource(azureLogicApps, "ActionCustom")},
			"azurerm_logic_app_action_http":          {Tok: azureResource(azureLogicApps, "ActionHttp")},
			"azurerm_logic_app_trigger_custom":       {Tok: azureResource(azureLogicApps, "TriggerCustom")},
			"azurerm_logic_app_trigger_http_request": {Tok: azureResource(azureLogicApps, "TriggerHttpRequest")},
			"azurerm_logic_app_trigger_recurrence":   {Tok: azureResource(azureLogicApps, "TriggerRecurrence")},
			"azurerm_logic_app_workflow":             {Tok: azureResource(azureLogicApps, "Workflow")},

			// MariaDB
			"azurerm_mariadb_configuration":        {Tok: azureResource(azureMariaDB, "Configuration")},
			"azurerm_mariadb_database":             {Tok: azureResource(azureMariaDB, "Database")},
			"azurerm_mariadb_firewall_rule":        {Tok: azureResource(azureMariaDB, "FirewallRule")},
			"azurerm_mariadb_server":               {Tok: azureResource(azureMariaDB, "Server")},
			"azurerm_mariadb_virtual_network_rule": {Tok: azureResource(azureMariaDB, "VirtualNetworkRule")},

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

			// CosmosDB
			"azurerm_cosmosdb_account":            {Tok: azureResource(azureCosmosDB, "Account")},
			"azurerm_cosmosdb_cassandra_keyspace": {Tok: azureResource(azureCosmosDB, "CassandraKeyspace")},
			"azurerm_cosmosdb_mongo_collection":   {Tok: azureResource(azureCosmosDB, "MongoCollection")},
			"azurerm_cosmosdb_mongo_database":     {Tok: azureResource(azureCosmosDB, "MongoDatabase")},
			"azurerm_cosmosdb_sql_container":      {Tok: azureResource(azureCosmosDB, "SqlContainer")},
			"azurerm_cosmosdb_sql_database":       {Tok: azureResource(azureCosmosDB, "SqlDatabase")},
			"azurerm_cosmosdb_table":              {Tok: azureResource(azureCosmosDB, "Table")},
			"azurerm_cosmosdb_gremlin_database":   {Tok: azureResource(azureCosmosDB, "GremlinDatabase")},
			"azurerm_cosmosdb_gremlin_graph":      {Tok: azureResource(azureCosmosDB, "GremlinGraph")},

			// Cost Management
			"azurerm_cost_management_export_resource_group": {
				Tok: azureResource(azureCostManagement, "ResourceGroupExport"),
			},

			// Maps
			"azurerm_maps_account": {Tok: azureResource(azureMaps, "Account")},

			// Media Services
			"azurerm_media_services_account": {Tok: azureResource(azureMediaServices, "Account")},

			// Monitoring resources
			"azurerm_monitor_action_group":                {Tok: azureResource(azureMonitoring, "ActionGroup")},
			"azurerm_monitor_activity_log_alert":          {Tok: azureResource(azureMonitoring, "ActivityLogAlert")},
			"azurerm_monitor_autoscale_setting":           {Tok: azureResource(azureMonitoring, "AutoscaleSetting")},
			"azurerm_monitor_diagnostic_setting":          {Tok: azureResource(azureMonitoring, "DiagnosticSetting")},
			"azurerm_monitor_log_profile":                 {Tok: azureResource(azureMonitoring, "LogProfile")},
			"azurerm_monitor_metric_alert":                {Tok: azureResource(azureMonitoring, "MetricAlert")},
			"azurerm_monitor_scheduled_query_rules_alert": {Tok: azureResource(azureMonitoring, "ScheduledQueryRulesAlert")},
			"azurerm_monitor_scheduled_query_rules_log":   {Tok: azureResource(azureMonitoring, "ScheduledQueryRulesLog")},

			// MS SQL
			"azurerm_mssql_elasticpool": {Tok: azureResource(azureMSSQL, "ElasticPool")},
			"azurerm_mssql_database_vulnerability_assessment_rule_baseline": {
				Tok: azureResource(azureMSSQL, "DatabaseVulnerabilityAssessmentRuleBaseline"),
			},
			"azurerm_mssql_server_vulnerability_assessment": {
				Tok: azureResource(azureMSSQL, "ServerVulnerabilityAssessment"),
			},
			"azurerm_mssql_server_security_alert_policy": {
				Tok: azureResource(azureMSSQL, "ServerSecurityAlertPolicy"),
			},
			"azurerm_mssql_database":        {Tok: azureResource(azureMSSQL, "Database")},
			"azurerm_mssql_virtual_machine": {Tok: azureResource(azureMSSQL, "VirtualMachine")},
			"azurerm_mssql_server":          {Tok: azureResource(azureMSSQL, "Server")},

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
			"azurerm_policy_remediation":    {Tok: azureResource(azurePolicy, "Remediation")},

			// Private Dns
			"azurerm_private_dns_a_record":     {Tok: azureResource(azurePrivateDNS, "ARecord")},
			"azurerm_private_dns_cname_record": {Tok: azureResource(azurePrivateDNS, "CnameRecord")},
			"azurerm_private_dns_zone":         {Tok: azureResource(azurePrivateDNS, "Zone")},
			"azurerm_private_dns_zone_virtual_network_link": {
				Tok: azureResource(azurePrivateDNS, "ZoneVirtualNetworkLink"),
			},
			"azurerm_private_dns_aaaa_record": {
				Tok: azureResource(azurePrivateDNS, "AAAARecord"),
			},
			"azurerm_private_dns_ptr_record": {
				Tok: azureResource(azurePrivateDNS, "PTRRecord"),
			},
			"azurerm_private_dns_srv_record": {
				Tok: azureResource(azurePrivateDNS, "SRVRecord"),
			},
			"azurerm_private_link_service": {
				Tok: azureResource(azurePrivateDNS, "LinkService"),
			},
			"azurerm_private_dns_mx_record": {
				Tok: azureResource(azurePrivateDNS, "MxRecord"),
			},
			"azurerm_private_dns_txt_record": {
				Tok: azureResource(azurePrivateDNS, "TxtRecord"),
			},

			// SQL
			"azurerm_sql_elasticpool":    {Tok: azureResource(azureSQL, "ElasticPool")},
			"azurerm_sql_database":       {Tok: azureResource(azureSQL, "Database")},
			"azurerm_sql_failover_group": {Tok: azureResource(azureSQL, "FailoverGroup")},
			"azurerm_sql_firewall_rule":  {Tok: azureResource(azureSQL, "FirewallRule")},
			"azurerm_sql_server":         {Tok: azureResource(azureSQL, "SqlServer")},
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
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    64,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_virtual_wan":                        {Tok: azureResource(azureNetwork, "VirtualWan")},
			"azurerm_virtual_network_peering":            {Tok: azureResource(azureNetwork, "VirtualNetworkPeering")},
			"azurerm_virtual_network_gateway":            {Tok: azureResource(azureNetwork, "VirtualNetworkGateway")},
			"azurerm_virtual_network_gateway_connection": {Tok: azureResource(azureNetwork, "VirtualNetworkGatewayConnection")},
			"azurerm_local_network_gateway":              {Tok: azureResource(azureNetwork, "LocalNetworkGateway")},
			"azurerm_application_gateway": {
				Tok: azureResource(azureNetwork, "ApplicationGateway"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an Application Gateway is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    80,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_application_security_group":           {Tok: azureResource(azureNetwork, "ApplicationSecurityGroup")},
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
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    80,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_network_interface_application_gateway_backend_address_pool_association": {Tok: azureResource(azureNetwork, "NetworkInterfaceApplicationGatewayBackendAddressPoolAssociation")},
			"azurerm_network_interface_application_security_group_association":               {Tok: azureResource(azureNetwork, "NetworkInterfaceApplicationSecurityGroupAssociation")},
			"azurerm_network_interface_backend_address_pool_association":                     {Tok: azureResource(azureNetwork, "NetworkInterfaceBackendAddressPoolAssociation")},
			"azurerm_network_interface_nat_rule_association":                                 {Tok: azureResource(azureNetwork, "NetworkInterfaceNatRuleAssociation")},
			"azurerm_network_interface_security_group_association":                           {Tok: azureResource(azureNetwork, "NetworkInterfaceSecurityGroupAssociation")},
			"azurerm_network_packet_capture":                                                 {Tok: azureResource(azureNetwork, "NetworkPacketCapture")},
			"azurerm_network_profile":                                                        {Tok: azureResource(azureNetwork, "Profile")},
			"azurerm_network_security_group": {
				Tok: azureResource(azureNetwork, "NetworkSecurityGroup"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Network Security Group is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    80,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_network_security_rule": {
				Tok: azureResource(azureNetwork, "NetworkSecurityRule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Network Security Rule is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    80,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_network_watcher":          {Tok: azureResource(azureNetwork, "NetworkWatcher")},
			"azurerm_network_watcher_flow_log": {Tok: azureResource(azureNetwork, "NetworkWatcherFlowLog")},
			"azurerm_packet_capture":           {Tok: azureResource(azureNetwork, "PacketCapture")},
			"azurerm_public_ip": {
				Tok: azureResource(azureNetwork, "PublicIp"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Public IP Address is 80.
					// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    80,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
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
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    80,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
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
			"azurerm_express_route_gateway":          {Tok: azureResource(azureNetwork, "ExpressRouteGateway")},
			"azurerm_nat_gateway":                    {Tok: azureResource(azureNetwork, "NatGateway")},
			"azurerm_subnet_nat_gateway_association": {Tok: azureResource(azureNetwork, "SubnetNatGatewayAssociation")},
			"azurerm_point_to_site_vpn_gateway":      {Tok: azureResource(azureNetwork, "PointToPointVpnGateway")},
			"azurerm_virtual_hub":                    {Tok: azureResource(azureNetwork, "VirtualHub")},
			"azurerm_virtual_hub_connection":         {Tok: azureResource(azureNetwork, "VirtualHubConnection")},
			"azurerm_vpn_gateway":                    {Tok: azureResource(azureNetwork, "VpnGateway")},
			"azurerm_vpn_server_configuration":       {Tok: azureResource(azureNetwork, "VpnServerConfiguration")},

			// Redis
			"azurerm_redis_cache":         {Tok: azureResource(azureRedis, "Cache")},
			"azurerm_redis_firewall_rule": {Tok: azureResource(azureRedis, "FirewallRule")},

			// Relay
			"azurerm_relay_namespace":         {Tok: azureResource(azureRelay, "Namespace")},
			"azurerm_relay_hybrid_connection": {Tok: azureResource(azureRelay, "HybridConnection")},

			// Security Center
			"azurerm_security_center_contact":              {Tok: azureResource(azureSecurityCenter, "Contact")},
			"azurerm_security_center_subscription_pricing": {Tok: azureResource(azureSecurityCenter, "SubscriptionPricing")},
			"azurerm_security_center_workspace":            {Tok: azureResource(azureSecurityCenter, "Workspace")},
			"azurerm_advanced_threat_protection":           {Tok: azureResource(azureSecurityCenter, "AdvancedThreatProtection")},

			// Service Fabric
			"azurerm_service_fabric_cluster": {Tok: azureResource(azureServiceFabric, "Cluster")},

			// Search
			"azurerm_search_service": {Tok: azureResource(azureSearch, "Service")},

			// SignalR
			"azurerm_signalr_service": {Tok: azureResource(azureSignalr, "Service")},

			// Storage
			"azurerm_storage_account": {
				Tok: azureResource(azureStorage, "Account"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"static_website": {
						Name: "staticWebsite",
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								// By default, this gets reverse-mapped to `error404_document` by the
								// bridge's naming logic, so we force it to the correct mapping here.
								"error_404_document": {
									Name: "error404Document",
								},
							},
						},
					},
				},
			},
			"azurerm_storage_blob": {
				Tok: azureResource(azureStorage, "Blob"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#storage
					// Max length of a container name is 1024.
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    1024,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
					"source": {
						Asset: &tfbridge.AssetTranslation{
							Kind: tfbridge.FileAsset,
						},
					},
				}},
			"azurerm_storage_container": {
				Tok: azureResource(azureStorage, "Container"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#storage
					// Max length of a container name is 63.
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    63,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				}},
			"azurerm_storage_share":           {Tok: azureResource(azureStorage, "Share")},
			"azurerm_storage_share_directory": {Tok: azureResource(azureStorage, "ShareDirectory")},
			"azurerm_storage_queue": {
				Tok: azureResource(azureStorage, "Queue"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#storage
					// Max length of a queue name is 63.
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    63,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				}},
			"azurerm_storage_table": {
				Tok: azureResource(azureStorage, "Table"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://docs.microsoft.com/en-us/rest/api/storageservices/Understanding-the-Table-Service-Data-Model#table-names
					// Max length of a table name is 63.
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    63,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				}},
			"azurerm_storage_table_entity": {
				Tok: azureResource(azureStorage, "TableEntity"),
			},
			"azurerm_storage_data_lake_gen2_filesystem":    {Tok: azureResource(azureStorage, "DataLakeGen2Filesystem")},
			"azurerm_storage_management_policy":            {Tok: azureResource(azureStorage, "ManagementPolicy")},
			"azurerm_storage_account_network_rules":        {Tok: azureResource(azureStorage, "AccountNetworkRules")},
			"azurerm_storage_account_customer_managed_key": {Tok: azureResource(azureStorage, "CustomerManagedKey")},

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
			"azurerm_stream_analytics_output_servicebus_topic": {Tok: azureResource(azureStreamAnalytics, "OutputServicebusTopic")},
			"azurerm_stream_analytics_reference_input_blob":    {Tok: azureResource(azureStreamAnalytics, "ReferenceInputBlob")},

			// Marketplace
			"azurerm_marketplace_agreement": {Tok: azureResource(azureMarketPlace, "Agreement")},

			// Kusto
			"azurerm_kusto_cluster":                  {Tok: azureResource(azureKusto, "Cluster")},
			"azurerm_kusto_database":                 {Tok: azureResource(azureKusto, "Database")},
			"azurerm_kusto_eventhub_data_connection": {Tok: azureResource(azureKusto, "EventhubDataConnection")},
			"azurerm_kusto_database_principal":       {Tok: azureResource(azureKusto, "DatabasePrincipal")},

			// Frontdoor
			"azurerm_frontdoor": {
				Tok: azureResource(azureFrontdoor, "Frontdoor"),
				Docs: &tfbridge.DocInfo{
					Source: "front_door.html.markdown",
				},
			},
			"azurerm_frontdoor_firewall_policy": {
				Tok: azureResource(azureFrontdoor, "FirewallPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "front_door_firewall_policy.html.markdown",
				},
			},

			// Bot
			"azurerm_bot_channels_registration": {Tok: azureResource(azureBot, "ChannelsRegistration")},
			"azurerm_bot_connection":            {Tok: azureResource(azureBot, "Connection")},
			"azurerm_bot_channel_email":         {Tok: azureResource(azureBot, "ChannelEmail")},
			"azurerm_bot_channel_slack":         {Tok: azureResource(azureBot, "ChannelSlack")},
			"azurerm_bot_web_app":               {Tok: azureResource(azureBot, "WebApp")},
			"azurerm_bot_channel_ms_teams":      {Tok: azureResource(azureBot, "ChannelTeams")},
			"azurerm_bot_channel_directline":    {Tok: azureResource(azureBot, "ChannelDirectLine")},

			// Proximity
			"azurerm_proximity_placement_group": {Tok: azureResource(azureProximity, "PlacementGroup")},

			// WAF
			"azurerm_web_application_firewall_policy": {Tok: azureResource(azureWaf, "Policy")},

			// Dashboard
			"azurerm_dashboard": {Tok: azureResource(azureDashboard, "Dashboard")},

			// Healthcare
			"azurerm_healthcare_service": {Tok: azureResource(azureHealthcare, "Service")},

			// NetApp
			"azurerm_netapp_account":  {Tok: azureResource(azureNetapp, "Account")},
			"azurerm_netapp_pool":     {Tok: azureResource(azureNetapp, "Pool")},
			"azurerm_netapp_volume":   {Tok: azureResource(azureNetapp, "Volume")},
			"azurerm_netapp_snapshot": {Tok: azureResource(azureNetapp, "Snapshot")},

			//AppConfiguration
			"azurerm_app_configuration": {Tok: azureResource(azureAppConfiguration, "ConfigurationStore")},

			// Backup
			"azurerm_backup_container_storage_account": {Tok: azureResource(azureBackup, "ContainerStorageAccount")},
			"azurerm_backup_policy_file_share":         {Tok: azureResource(azureBackup, "PolicyFileShare")},
			"azurerm_backup_protected_file_share":      {Tok: azureResource(azureBackup, "ProtectedFileShare")},
			"azurerm_backup_policy_vm":                 {Tok: azureResource(azureBackup, "PolicyVM")},
			"azurerm_backup_protected_vm":              {Tok: azureResource(azureBackup, "ProtectedVM")},

			// Private Link
			"azurerm_private_endpoint": {Tok: azureResource(azurePrivateLink, "Endpoint")},

			// SiteRecovery
			"azurerm_site_recovery_fabric":               {Tok: azureResource(azureSiteRecovery, "Fabric")},
			"azurerm_site_recovery_network_mapping":      {Tok: azureResource(azureSiteRecovery, "NetworkMapping")},
			"azurerm_site_recovery_protection_container": {Tok: azureResource(azureSiteRecovery, "ProtectionContainer")},
			"azurerm_site_recovery_replicated_vm":        {Tok: azureResource(azureSiteRecovery, "ReplicatedVM")},
			"azurerm_site_recovery_replication_policy":   {Tok: azureResource(azureSiteRecovery, "ReplicationPolicy")},
			"azurerm_site_recovery_protection_container_mapping": {
				Tok: azureResource(azureSiteRecovery, "ProtectionContainerMapping"),
			},
			"azurerm_recovery_services_vault": {Tok: azureResource(azureRecoveryServices, "Vault")},

			// Database Migration
			"azurerm_database_migration_project": {Tok: azureResource(azureDatabaseMigration, "Project")},
			"azurerm_database_migration_service": {Tok: azureResource(azureDatabaseMigration, "Service")},

			// IoT Central
			"azurerm_iotcentral_application": {Tok: azureResource(azureIotCentral, "Application")},

			// HPC
			"azurerm_hpc_cache":             {Tok: azureResource(azureHpc, "Cache")},
			"azurerm_hpc_cache_blob_target": {Tok: azureResource(azureHpc, "CacheBlobTarget")},
			"azurerm_hpc_cache_nfs_target":  {Tok: azureResource(azureHpc, "CacheNfsTarget")},

			// Mixed Reality
			"azurerm_spatial_anchors_account": {Tok: azureResource(azureMixedReality, "SpatialAnchorsAccount")},

			// PowerBI
			"azurerm_powerbi_embedded": {Tok: azureResource(azurePowerBi, "Embedded")},

			// Machine Learning
			"azurerm_machine_learning_workspace": {Tok: azureResource(azureMachineLearning, "Workspace")},

			// Managed Applications
			"azurerm_managed_application":            {Tok: azureResource(azureManagedApplication, "Application")},
			"azurerm_managed_application_definition": {Tok: azureResource(azureManagedApplication, "Definition")},

			// Maintenance
			"azurerm_maintenance_configuration": {Tok: azureResource(azureMaintenance, "Configuration")},

			// Servicebus
			"azurerm_servicebus_namespace_network_rule_set": {
				Tok: azureResource(azureServiceBus, "NamespaceNetworkRuleSet"),
			},

			// Sentinel
			"azurerm_sentinel_alert_rule_ms_security_incident": {
				Tok: azureResource(azureSentinel, "AlertRuleMsSecurityIncident"),
			},
			"azurerm_sentinel_alert_rule_scheduled": {
				Tok: azureResource(azureSentinel, "AlertRuleScheduled"),
			},

			// Eventgrid
			"azurerm_eventgrid_domain_topic": {Tok: azureResource(azureEventGrid, "DomainTopic")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"azurerm_application_insights": {Tok: azureDataSource(azureAppInsights, "getInsights")},
			"azurerm_api_management": {
				Tok: azureDataSource(azureAPIManagement, "getService"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_api_management_api":             {Tok: azureDataSource(azureAPIManagement, "getApi")},
			"azurerm_api_management_group":           {Tok: azureDataSource(azureAPIManagement, "getGroup")},
			"azurerm_api_management_product":         {Tok: azureDataSource(azureAPIManagement, "getProduct")},
			"azurerm_api_management_user":            {Tok: azureDataSource(azureAPIManagement, "getUser")},
			"azurerm_api_management_api_version_set": {Tok: azureDataSource(azureAPIManagement, "getApiVersionSet")},
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
			"azurerm_automation_account":           {Tok: azureDataSource(azureAutomation, "getAccount")},
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
			"azurerm_data_share_account":           {Tok: azureDataSource(azureDataShare, "getAccount")},
			"azurerm_dev_test_lab":                 {Tok: azureDataSource(azureDevTest, "getLab")},
			"azurerm_dev_test_virtual_network":     {Tok: azureDataSource(azureDevTest, "getVirtualNetwork")},
			"azurerm_image":                        {Tok: azureDataSource(azureCompute, "getImage")},
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
			"azurerm_log_analytics_workspace": {
				Tok: azureDataSource(azureOperationalInsights, "getAnalyticsWorkspace"),
			},
			"azurerm_logic_app_workflow":   {Tok: azureDataSource(azureLogicApps, "getWorkflow")},
			"azurerm_maps_account":         {Tok: azureDataSource(azureMaps, "getAccount")},
			"azurerm_monitor_action_group": {Tok: azureDataSource(azureMonitoring, "getActionGroup")},
			"azurerm_monitor_diagnostic_categories": {
				Tok: azureDataSource(azureMonitoring, "getDiagnosticCategories"),
			},
			"azurerm_monitor_log_profile": {Tok: azureDataSource(azureMonitoring, "getLogProfile")},
			"azurerm_monitor_scheduled_query_rules_alert": {
				Tok: azureDataSource(azureMonitoring, "getScheduledQueryRulesAlert"),
			},
			"azurerm_monitor_scheduled_query_rules_log": {
				Tok: azureDataSource(azureMonitoring, "getScheduledQueryRulesLog"),
			},
			"azurerm_mssql_elasticpool": {Tok: azureDataSource(azureMSSQL, "getElasticPool")},
			"azurerm_mssql_database":    {Tok: azureDataSource(azureMSSQL, "getDatabase")},
			"azurerm_dns_zone":          {Tok: azureDataSource(azureDNS, "getZone")},
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
			"azurerm_virtual_network_gateway":      {Tok: azureDataSource(azureNetwork, "getVirtualNetworkGateway")},
			"azurerm_network_security_group":       {Tok: azureDataSource(azureNetwork, "getNetworkSecurityGroup")},
			"azurerm_network_interface":            {Tok: azureDataSource(azureNetwork, "getNetworkInterface")},
			"azurerm_network_watcher":              {Tok: azureDataSource(azureNetwork, "getNetworkWatcher")},
			"azurerm_public_ip":                    {Tok: azureDataSource(azureNetwork, "getPublicIP")},
			"azurerm_public_ips":                   {Tok: azureDataSource(azureNetwork, "getPublicIPs")},
			"azurerm_public_ip_prefix":             {Tok: azureDataSource(azureNetwork, "getPublicIpPrefix")},
			"azurerm_application_security_group":   {Tok: azureDataSource(azureNetwork, "getApplicationSecurityGroup")},
			"azurerm_redis_cache":                  {Tok: azureDataSource(azureRedis, "getCache")},
			"azurerm_resource_group":               {Tok: azureDataSource(azureCore, "getResourceGroup")},
			"azurerm_snapshot":                     {Tok: azureDataSource(azureCompute, "getSnapshot")},
			"azurerm_subnet":                       {Tok: azureDataSource(azureNetwork, "getSubnet")},
			"azurerm_route_table":                  {Tok: azureDataSource(azureNetwork, "getRouteTable")},
			"azurerm_network_ddos_protection_plan": {Tok: azureDataSource(azureNetwork, "getNetworkDdosProtectionPlan")},
			"azurerm_network_service_tags":         {Tok: azureDataSource(azureNetwork, "getServiceTags")},
			"azurerm_express_route_circuit": {
				Tok: azureDataSource(azureNetwork, "getExpressRouteCircuit"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_sql_server":                              {Tok: azureDataSource(azureSQL, "getServer")},
			"azurerm_sql_database":                            {Tok: azureDataSource(azureSQL, "getDatabase")},
			"azurerm_virtual_network_gateway_connection":      {Tok: azureDataSource(azureNetwork, "getGatewayConnection")},
			"azurerm_firewall":                                {Tok: azureDataSource(azureNetwork, "getFirewall")},
			"azurerm_subscription":                            {Tok: azureDataSource(azureCore, "getSubscription")},
			"azurerm_policy_definition":                       {Tok: azureDataSource(azurePolicy, "getPolicyDefintion")},
			"azurerm_policy_set_definition":                   {Tok: azureDataSource(azurePolicy, "getPolicySetDefinition")},
			"azurerm_platform_image":                          {Tok: azureDataSource(azureCompute, "getPlatformImage")},
			"azurerm_managed_disk":                            {Tok: azureDataSource(azureCompute, "getManagedDisk")},
			"azurerm_shared_image_versions":                   {Tok: azureDataSource(azureCompute, "getSharedImageVersions")},
			"azurerm_backup_policy_vm":                        {Tok: azureDataSource(azureBackup, "getPolicyVM")},
			"azurerm_storage_account":                         {Tok: azureDataSource(azureStorage, "getAccount")},
			"azurerm_storage_account_sas":                     {Tok: azureDataSource(azureStorage, "getAccountSAS")},
			"azurerm_storage_account_blob_container_sas":      {Tok: azureDataSource(azureStorage, "getAccountBlobContainerSAS")},
			"azurerm_storage_management_policy":               {Tok: azureDataSource(azureStorage, "getPolicy")},
			"azurerm_virtual_machine":                         {Tok: azureDataSource(azureCompute, "getVirtualMachine")},
			"azurerm_hdinsight_cluster":                       {Tok: azureDataSource(azureHdInsight, "getCluster")},
			"azurerm_stream_analytics_job":                    {Tok: azureDataSource(azureStreamAnalytics, "getJob")},
			"azurerm_proximity_placement_group":               {Tok: azureDataSource(azureProximity, "getPlacementGroup")},
			"azurerm_servicebus_namespace_authorization_rule": {Tok: azureDataSource(azureServiceBus, "getNamespaceAuthorizationRule")},
			"azurerm_app_service_certificate":                 {Tok: azureDataSource(azureAppService, "getCertificate")},
			"azurerm_app_service_certificate_order":           {Tok: azureDataSource(azureAppService, "getCertificateOrder")},
			"azurerm_data_factory":                            {Tok: azureDataSource(azureDataFactory, "getFactory")},
			"azurerm_healthcare_service":                      {Tok: azureDataSource(azureHealthcare, "getService")},
			"azurerm_postgresql_server":                       {Tok: azureDataSource(azurePostgresql, "getServer")},
			"azurerm_resources":                               {Tok: azureDataSource(azureCore, "getResources")},
			"azurerm_netapp_account":                          {Tok: azureDataSource(azureNetapp, "getAccount")},
			"azurerm_netapp_pool":                             {Tok: azureDataSource(azureNetapp, "getPool")},
			"azurerm_netapp_volume":                           {Tok: azureDataSource(azureNetapp, "getVolume")},
			"azurerm_netapp_snapshot":                         {Tok: azureDataSource(azureNetapp, "getSnapshot")},
			"azurerm_private_link_service":                    {Tok: azureDataSource(azurePrivateLink, "getService")},
			"azurerm_private_endpoint_connection":             {Tok: azureDataSource(azurePrivateLink, "getEndpointConnection")},
			"azurerm_private_link_service_endpoint_connections": {
				Tok: azureDataSource(azurePrivateLink, "getServiceEndpointConnections"),
			},
			"azurerm_nat_gateway":                 {Tok: azureDataSource(azureNetwork, "getNatGateway")},
			"azurerm_virtual_hub":                 {Tok: azureDataSource(azureNetwork, "getVirtualHub")},
			"azurerm_signalr_service":             {Tok: azureDataSource(azureSignalr, "getService")},
			"azurerm_storage_container":           {Tok: azureDataSource(azureStorage, "getStorageContainer")},
			"azurerm_iothub_shared_access_policy": {Tok: azureDataSource(azureIot, "getSharedAccessPolicy")},
			"azurerm_iothub_dps":                  {Tok: azureDataSource(azureIot, "getDps")},
			"azurerm_eventgrid_topic":             {Tok: azureDataSource(azureEventGrid, "getTopic")},
			"azurerm_disk_encryption_set":         {Tok: azureDataSource(azureCompute, "getDiskEncryptionSet")},
			"azurerm_dedicated_host_group":        {Tok: azureDataSource(azureCompute, "getDedicatedHostGroup")},
			"azurerm_dedicated_host":              {Tok: azureDataSource(azureCompute, "getDedicatedHost")},
			"azurerm_mariadb_server":              {Tok: azureDataSource(azureMariaDB, "getMariaDbServer")},
			"azurerm_eventhub_namespace_authorization_rule": {
				Tok: azureDataSource(azureEventHub, "getNamespaceAuthorizationRule"),
			},
			"azurerm_eventhub":                        {Tok: azureDataSource(azureEventHub, "getEventhub")},
			"azurerm_eventhub_authorization_rule":     {Tok: azureDataSource(azureEventHub, "getAuthorizationRule")},
			"azurerm_eventhub_consumer_group":         {Tok: azureDataSource(azureEventHub, "getConsumeGroup")},
			"azurerm_function_app":                    {Tok: azureDataSource(azureAppService, "getFunctionApp")},
			"azurerm_app_service_environment":         {Tok: azureDataSource(azureAppService, "getAppServiceEnvironment")},
			"azurerm_iothub_dps_shared_access_policy": {Tok: azureDataSource(azureIot, "getDpsSharedAccessPolicy")},
			"azurerm_recovery_services_vault":         {Tok: azureDataSource(azureRecoveryServices, "getVault")},
			"azurerm_database_migration_project":      {Tok: azureDataSource(azureDatabaseMigration, "getProject")},
			"azurerm_database_migration_service":      {Tok: azureDataSource(azureDatabaseMigration, "getService")},
			"azurerm_kusto_cluster":                   {Tok: azureDataSource(azureKusto, "getCluster")},
			"azurerm_servicebus_topic_authorization_rule": {
				Tok: azureDataSource(azureServiceBus, "getTopicAuthorizationRule"),
			},
			"azurerm_app_configuration": {
				Tok: azureDataSource(azureAppConfiguration, "getConfigurationStore"),
			},
			"azurerm_machine_learning_workspace":     {Tok: azureDataSource(azureMachineLearning, "getWorkspace")},
			"azurerm_managed_application_definition": {Tok: azureDataSource(azureManagedApplication, "getDefinition")},
			"azurerm_spring_cloud_service":           {Tok: azureDataSource(azureAppPlatform, "getSpringCloudService")},
			"azurerm_private_dns_zone":               {Tok: azureDataSource(azurePrivateDNS, "getDnsZone")},
			"azurerm_sentinel_alert_rule":            {Tok: azureDataSource(azureSentinel, "getAlertRule")},
			"azurerm_maintenance_configuration":      {Tok: azureDataSource(azureMaintenance, "getConfiguration")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^8.0.0", // so we can access strongly typed node definitions.
			},
			Dependencies: map[string]string{
				"@pulumi/pulumi":                "^2.0.0",
				"azure-eventgrid":               "^1.6.0",
				"@azure/functions":              "^1.0.3",
				"@azure/ms-rest-azure-js":       "^2.0.1",
				"@azure/ms-rest-nodeauth":       "^3.0.0",
				"azure-functions-ts-essentials": "^1.3.2",
				"moment":                        "2.24.0",
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
							"kind.ts",
							"zMixins.ts",
							"zMixins_durable.ts",
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
					"eventgrid": {
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
					"servicebus": {
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
				"pulumi": ">=2.0.0,<3.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
			Overlay: &tfbridge.OverlayInfo{
				Modules: map[string]*tfbridge.OverlayInfo{
					"Storage": {
						DestFiles: []string{
							"SharedAccessSignature.cs",
						},
					},
				},
			},
			Namespaces: namespaceMap,
		},
	}

	// New Authorization Mod - this combines the old MSI and Role Modules
	prov.RenameResourceWithAlias("azurerm_role_assignment", azureResource(azureLegacyRole, "Assignment"),
		azureResource(azureAuthorization, "Assignment"), azureLegacyRole, azureAuthorization, &tfbridge.ResourceInfo{
			Fields: map[string]*tfbridge.SchemaInfo{
				// Suppress auto-naming of this field. It is autonamed to a GUID in the underlying provider.
				azureName: {Name: azureName},
			},
		})
	prov.RenameResourceWithAlias("azurerm_role_definition", azureResource(azureLegacyRole, "Definition"),
		azureResource(azureAuthorization, "RoleDefinition"), azureLegacyRole, azureAuthorization, nil)
	prov.RenameResourceWithAlias("azurerm_user_assigned_identity", azureResource(azureLegacyMSI, "UserAssignedIdentity"),
		azureResource(azureAuthorization, "UserAssignedIdentity"), azureLegacyMSI, azureAuthorization, &tfbridge.ResourceInfo{
			Docs: &tfbridge.DocInfo{
				Source: "user_assigned_identity.markdown",
			},
		})
	prov.RenameDataSource("azurerm_role_definition", azureDataSource(azureLegacyRole, "getRoleDefinition"),
		azureDataSource(azureAuthorization, "getRoleDefinition"), azureLegacyRole, azureAuthorization, &tfbridge.DataSourceInfo{
			Docs: &tfbridge.DocInfo{
				Source: "role_definition.markdown",
			},
		})
	prov.RenameDataSource("azurerm_user_assigned_identity", azureDataSource(azureCore, "getUserAssignedIdentity"),
		azureDataSource(azureAuthorization, "getUserAssignedIdentity"), azureCore, azureAuthorization, nil)

	// Migrate azureLegacyManagementGroups -> azureManagement
	prov.RenameResourceWithAlias("azurerm_management_group", azureResource(azureLegacyManagementGroups, "ManagementGroup"),
		azureResource(azureManagement, "Group"), azureLegacyManagementGroups, azureManagement, nil)
	prov.RenameDataSource("azurerm_management_group", azureDataSource(azureLegacyManagementGroups, "getManagementGroup"),
		azureDataSource(azureManagement, "getGroup"), azureLegacyManagementGroups, azureManagement, nil)

	// Migrate azureLegacyMgmtResource -> azureManagement
	prov.RenameResourceWithAlias("azurerm_management_lock", azureResource(azureLegacyMgmtResource, "ManangementLock"),
		azureResource(azureManagement, "Lock"), azureLegacyMgmtResource, azureManagement, nil)

	// Migrate `azurerm_event_grid_*` to new EventGrid Mod
	prov.RenameResourceWithAlias("azurerm_eventgrid_domain", azureResource(azureEventHub, "Domain"),
		azureResource(azureEventGrid, "Domain"), azureEventHub, azureEventGrid, nil)
	prov.RenameResourceWithAlias("azurerm_eventgrid_event_subscription", azureResource(azureEventHub, "EventSubscription"),
		azureResource(azureEventGrid, "EventSubscription"), azureEventHub, azureEventGrid, nil)
	prov.RenameResourceWithAlias("azurerm_eventgrid_topic", azureResource(azureEventHub, "EventGridTopic"),
		azureResource(azureEventGrid, "Topic"), azureEventHub, azureEventGrid, nil)

	// Migrate `azurerm_servicebus_*` to new ServiceBus Mod
	prov.RenameResourceWithAlias("azurerm_servicebus_namespace", azureResource(azureEventHub, "Namespace"),
		azureResource(azureServiceBus, "Namespace"), azureEventHub, azureServiceBus, &tfbridge.ResourceInfo{
			Fields: map[string]*tfbridge.SchemaInfo{
				// https://docs.microsoft.com/en-us/rest/api/servicebus/create-namespace
				// Max length of a servicehub namespace is 50.
				azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
					Separator: "",
					Maxlen:    50,
					Randlen:   8,
					Transform: func(name string) string {
						return strings.ToLower(name)
					},
				}),
			},
		})
	prov.RenameResourceWithAlias("azurerm_servicebus_namespace_authorization_rule",
		azureResource(azureEventHub, "NamespaceAuthorizationRule"),
		azureResource(azureServiceBus, "NamespaceAuthorizationRule"),
		azureEventHub, azureServiceBus, nil)
	prov.RenameResourceWithAlias("azurerm_servicebus_queue", azureResource(azureEventHub, "Queue"),
		azureResource(azureServiceBus, "Queue"), azureEventHub, azureServiceBus, &tfbridge.ResourceInfo{
			Fields: map[string]*tfbridge.SchemaInfo{
				// https://groups.google.com/forum/#!topic/particularsoftware/XuHp_8wZ09o
				// Max length of a servicehub queue is 260.
				azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
					Separator: "",
					Maxlen:    260,
					Randlen:   8,
					Transform: func(name string) string {
						return strings.ToLower(name)
					},
				}),
			},
		})
	prov.RenameResourceWithAlias("azurerm_servicebus_queue_authorization_rule",
		azureResource(azureEventHub, "QueueAuthorizationRule"), azureResource(azureServiceBus, "QueueAuthorizationRule"),
		azureEventHub, azureServiceBus, nil)
	prov.RenameResourceWithAlias("azurerm_servicebus_subscription",
		azureResource(azureEventHub, "Subscription"), azureResource(azureServiceBus, "Subscription"),
		azureEventHub, azureServiceBus, nil)
	prov.RenameResourceWithAlias("azurerm_servicebus_subscription_rule",
		azureResource(azureEventHub, "SubscriptionRule"), azureResource(azureServiceBus, "SubscriptionRule"),
		azureEventHub, azureServiceBus, nil)
	prov.RenameResourceWithAlias("azurerm_servicebus_topic",
		azureResource(azureEventHub, "Topic"), azureResource(azureServiceBus, "Topic"),
		azureEventHub, azureServiceBus, &tfbridge.ResourceInfo{
			Fields: map[string]*tfbridge.SchemaInfo{
				// https://groups.google.com/forum/#!topic/particularsoftware/XuHp_8wZ09o
				// Max length of a servicehub topic is 260.
				azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
					Separator: "",
					Maxlen:    260,
					Randlen:   8,
					Transform: func(name string) string {
						return strings.ToLower(name)
					},
				}),
			},
		})
	prov.RenameResourceWithAlias("azurerm_servicebus_topic_authorization_rule",
		azureResource(azureEventHub, "TopicAuthorizationRule"), azureResource(azureServiceBus, "TopicAuthorizationRule"),
		azureEventHub, azureServiceBus, nil)
	prov.RenameDataSource("azurerm_servicebus_namespace",
		azureDataSource(azureEventHub, "getServiceBusNamespace"), azureDataSource(azureServiceBus, "getNamespace"),
		azureEventHub, azureServiceBus, nil)

	// Rename Eventhub Resources
	prov.RenameResourceWithAlias("azurerm_eventhub_authorization_rule",
		azureResource(azureEventHub, "EventHubAuthorizationRule"), azureResource(azureEventHub, "AuthorizationRule"),
		azureEventHub, azureEventHub, nil)
	prov.RenameResourceWithAlias("azurerm_eventhub_consumer_group",
		azureResource(azureEventHub, "EventHubConsumerGroup"), azureResource(azureEventHub, "ConsumerGroup"),
		azureEventHub, azureEventHub, nil)
	prov.RenameDataSource("azurerm_eventhub_namespace",
		azureDataSource(azureEventHub, "getEventhubNamespace"), azureDataSource(azureEventHub, "getNamespace"),
		azureEventHub, azureEventHub, nil)

	// Migrate `azurerm_traffic_manager_*` to network module
	prov.RenameResourceWithAlias("azurerm_traffic_manager_endpoint",
		azureResource(azureLegacyTrafficManager, "Endpoint"), azureResource(azureNetwork, "TrafficManagerEndpoint"),
		azureLegacyTrafficManager, azureNetwork, nil)
	prov.RenameResourceWithAlias("azurerm_traffic_manager_profile",
		azureResource(azureLegacyTrafficManager, "Profile"), azureResource(azureNetwork, "TrafficManagerProfile"),
		azureLegacyTrafficManager, azureNetwork, &tfbridge.ResourceInfo{
			Fields: map[string]*tfbridge.SchemaInfo{
				// Max length of a Traffic Manager Profile is 80.
				// Source: https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions#networking
				azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
					Separator: "",
					Maxlen:    80,
					Randlen:   8,
					Transform: func(name string) string {
						return strings.ToLower(name)
					},
				}),
			}})
	prov.RenameDataSource("azurerm_traffic_manager_geographical_location",
		azureDataSource(azureLegacyTrafficManager, "getGeographicalLocation"),
		azureDataSource(azureNetwork, "getTrafficManager"), azureLegacyTrafficManager, azureNetwork, nil)

	// Fix the spelling on the KeyVault Certificate
	prov.RenameResourceWithAlias("azurerm_key_vault_certificate",
		azureResource(azureKeyVault, "Certifiate"), azureResource(azureKeyVault, "Certificate"),
		azureKeyVault, azureKeyVault, &tfbridge.ResourceInfo{
			Fields: map[string]*tfbridge.SchemaInfo{
				"certificate": {
					CSharpName: "KeyVaultCertificate",
				},
			}})

	// Fix the spelling of ContainerService Webook to Webhook
	prov.RenameResourceWithAlias("azurerm_container_registry_webhook",
		azureResource(azureContainerService, "RegistryWebook"),
		azureResource(azureContainerService, "RegistryWebhook"), azureContainerService, azureContainerService, nil)

	// Deprecated, remove in 3.0.
	prov.P.ResourcesMap["azurerm_storage_zipblob"] = prov.P.ResourcesMap["azurerm_storage_blob"]
	prov.Resources["azurerm_storage_zipblob"] = &tfbridge.ResourceInfo{
		Tok:                azureResource(azureStorage, "ZipBlob"),
		DeprecationMessage: "ZipBlob resource is deprecated in the 2.0 version of the provider. Use Blob resource instead.",
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
			azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
				Separator: "",
				Maxlen:    1024,
				Randlen:   8,
				Transform: func(name string) string {
					return strings.ToLower(name)
				},
			}),
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
					res.Fields[azureName] = tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    24,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					})
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
										return tfbridge.TerraformUnknownVariableValue, nil
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
												rgRegion = tfbridge.TerraformUnknownVariableValue
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
