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

//nolint:misspell
package provider

import (
	"fmt"
	"os"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/Azure/go-autorest/autorest/azure/cli"
	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/pulumi/pulumi-azure/provider/v4/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
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
	advisor                    = "Advisor"               // Advisor
	azureAnalysisServices      = "AnalysisServices"      // Analysis Services
	azureAPIManagement         = "ApiManagement"         // API Management
	azureAppConfiguration      = "AppConfiguration"      // App Configuration
	azureAppInsights           = "AppInsights"           // AppInsights
	azureAppPlatform           = "AppPlatform"           // AppPlatform
	azureAppService            = "AppService"            // App Service
	azureAttestation           = "Attestation"           // Attestation
	azureAutomation            = "Automation"            // Automation
	azureAuthorization         = "Authorization"         // Authorization
	azureAvs                   = "Avs"                   // Avs
	azureBackup                = "Backup"                // Backup
	azureBatch                 = "Batch"                 // Batch
	azureBilling               = "Billing"               // Billing
	azureBlueprint             = "Blueprint"             // Blueprint
	azureBot                   = "Bot"                   // Bot
	azureCDN                   = "Cdn"                   // CDN
	azureCognitive             = "Cognitive"             // Cognitive
	azureCommunication         = "Communication"         // Communication
	azureCompute               = "Compute"               // Virtual Machines
	azureConsumption           = "Consumption"           // Consumption
	azureContainerService      = "ContainerService"      // Azure Container Service
	azureCore                  = "Core"                  // Base Resources
	azureCosmosDB              = "CosmosDB"              // Cosmos DB
	azureCostManagement        = "CostManagement"        // CostManagement
	azureDashboard             = "Dashboard"             // Dashboard
	azureDatabaseMigration     = "DatabaseMigration"     // Database Migration
	azureDataboxEdge           = "DataboxEdge"           // Databox Edge
	azureDataFactory           = "DataFactory"           // Data Factory
	azureDatalake              = "DataLake"              // Data Lake
	azureDataProtection        = "DataProtection"        // Data Protection
	azureDataShare             = "DataShare"             // DataShare
	azureDataBricks            = "DataBricks"            // DataBricks
	azureDesktopVirtualization = "DesktopVirtualization" // Desktop Virtualization
	azureDevSpace              = "DevSpace"              // DevSpace
	azureDevTest               = "DevTest"               // Dev Test Labs
	azureDigitalTwins          = "DigitalTwins"          // Digital Twins
	azureDNS                   = "Dns"                   // DNS
	azureFrontdoor             = "FrontDoor"             // Frontdoor
	azureHdInsight             = "HDInsight"             // nolint:misspell // HDInsight
	azureHealthcare            = "Healthcare"            // HealthCare
	azureHpc                   = "Hpc"                   // High-performance Compute
	azureHsm                   = "Hsm"                   // Hardware Security Module
	azureIot                   = "Iot"                   // IoT resource
	azureIotCentral            = "IotCentral"            // IoT central
	azureKeyVault              = "KeyVault"              // Key Vault
	azureKusto                 = "Kusto"                 // Kusto
	azureLighthouse            = "Lighthouse"            // Lighthouse
	azureLogAnalytics          = "LogAnalytics"          // Log Analytics
	azureLogicApps             = "LogicApps"             // Logic Apps
	azureLB                    = "Lb"                    // Load Balancer
	azureMariaDB               = "MariaDB"               // MariaDB
	azureEventGrid             = "EventGrid"             // Event Grid
	azureEventHub              = "EventHub"              // Event Hub
	azureMachineLearning       = "MachineLearning"       // Machine Learning Resources
	azureMaintenance           = "Maintenance"           // Maintenance Resources
	azureManagedApplication    = "ManagedApplication"    // ManagedApplication
	azureManagement            = "Management"            // Management Resources
	azureMaps                  = "Maps"                  // Maps
	azureMarketPlace           = "Marketplace"           // Marketplace
	azureMediaServices         = "MediaServices"         // Media Services
	azureMedia                 = "Media"                 // Media
	azureMixedReality          = "MixedReality"          // Mixed Reality
	azureMonitoring            = "Monitoring"            // Metrics/monitoring resources
	azureMSSQL                 = "MSSql"                 // MS Sql
	azureMySQL                 = "MySql"                 // MySql
	azureNetapp                = "NetApp"                // NetApp
	azureNetwork               = "Network"               // Networking
	azureNotificationHub       = "NotificationHub"       // Notification Hub
	azureOperationalInsights   = "OperationalInsights"   // Operational Insights
	azurePostgresql            = "PostgreSql"            // Postgress SQL
	azurePolicy                = "Policy"                // Policy
	azurePowerBi               = "PowerBI"               // PowerBI
	azureProximity             = "Proximity"             // Proximity
	azurePrivateDNS            = "PrivateDns"            // Private DNS
	azurePrivateLink           = "PrivateLink"           // PrivateLink
	azurePurview               = "Purview"               // Purview
	azureRecoveryServices      = "RecoveryServices"      // Recovery Services
	azureRedis                 = "Redis"                 // RedisCache
	azureRelay                 = "Relay"                 // Relay
	azureSecurityCenter        = "SecurityCenter"        // Security Center
	azureSentinel              = "Sentinel"              // Sentinel
	azureServiceBus            = "ServiceBus"            // ServiceBus
	azureServiceFabric         = "ServiceFabric"         // Service Fabric
	azureSearch                = "Search"                // Search
	azureSignalr               = "SignalR"               // SignalR
	azureSiteRecovery          = "SiteRecovery"          // SiteRecovery
	azureSQL                   = "Sql"                   // SQL
	azureStack                 = "Stack"                 // Stack
	azureStorage               = "Storage"               // Storage
	azureStreamAnalytics       = "StreamAnalytics"       // StreamAnalytics
	azureSynapse               = "Synapse"               // Synapse
	azureWaf                   = "Waf"                   // WAF

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
	p := shimv1.NewProvider(azurerm.Provider().(*schema.Provider))

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
			"environment": {
				Default: &tfbridge.DefaultInfo{
					Value:   "public",
					EnvVars: []string{"AZURE_ENVIRONMENT", "ARM_ENVIRONMENT"},
				},
			},
			"skip_provider_registration": {
				Default: &tfbridge.DefaultInfo{
					Value:   false,
					EnvVars: []string{"ARM_SKIP_PROVIDER_REGISTRATION"},
				},
			},
			"storage_use_azuread": {
				Default: &tfbridge.DefaultInfo{
					Value:   false,
					EnvVars: []string{"ARM_STORAGE_USE_AZUREAD"},
				},
			},
			"metadata_url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ARM_METADATA_URL"},
				},
			},
			"metadata_host": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"ARM_METADATA_HOSTNAME"},
				},
			},
		},
		ExtraConfig: map[string]*tfbridge.ConfigInfo{
			azureLocation: {
				Schema: shimv1.NewSchema(&schema.Schema{
					Type:     schema.TypeString,
					Optional: true,
				}),
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
			"azurerm_api_management_api": {
				Tok: azureResource(azureAPIManagement, "Api"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an API Management API name is 256.
					// Source: https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/resource-name-rules#microsoftapimanagement
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    256,
						Randlen:   8,
					}),
				},
			},
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
			"azurerm_api_management_api_diagnostic":              {Tok: azureResource(azureAPIManagement, "ApiDiagnostic")},
			"azurerm_api_management_custom_domain":               {Tok: azureResource(azureAPIManagement, "CustomDomain")},
			"azurerm_api_management_policy":                      {Tok: azureResource(azureAPIManagement, "Policy")},
			"azurerm_api_management_identity_provider_aadb2c":    {Tok: azureResource(azureAPIManagement, "IdentityProviderAadb2c")},
			"azurerm_api_management_email_template":              {Tok: azureResource(azureAPIManagement, "EmailTemplate")},

			// Analysis Services
			"azurerm_analysis_services_server": {Tok: azureResource(azureAnalysisServices, "Server")},

			// AppInsights
			"azurerm_application_insights": {
				Tok: azureResource(azureAppInsights, "Insights"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// The max length according to the portal is 255 - there is no official API docs to provide this info
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    255,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
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
			"azurerm_application_insights_analytics_item":       {Tok: azureResource(azureAppInsights, "AnalyticsItem")},
			"azurerm_application_insights_smart_detection_rule": {Tok: azureResource(azureAppInsights, "SmartDetectionRule")},

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
			"azurerm_app_service_environment":         {Tok: azureResource(azureAppService, "Environment")},
			"azurerm_app_service_hybrid_connection":   {Tok: azureResource(azureAppService, "HybridConnection")},
			"azurerm_app_service_managed_certificate": {Tok: azureResource(azureAppService, "ManagedCertificate")},
			"azurerm_app_service_slot_virtual_network_swift_connection": {
				Tok: azureResource(azureAppService, "SlotVirtualNetworkSwiftConnection"),
			},
			"azurerm_app_service_certificate_binding": {Tok: azureResource(azureAppService, "CertificateBinding")},
			"azurerm_app_service_environment_v3":      {Tok: azureResource(azureAppService, "EnvironmentV3")},
			"azurerm_static_site":                     {Tok: azureResource(azureAppService, "StaticSite")},

			// AppPlatform
			"azurerm_spring_cloud_service":                  {Tok: azureResource(azureAppPlatform, "SpringCloudService")},
			"azurerm_spring_cloud_app":                      {Tok: azureResource(azureAppPlatform, "SpringCloudApp")},
			"azurerm_spring_cloud_certificate":              {Tok: azureResource(azureAppPlatform, "SpringCloudCertificate")},
			"azurerm_spring_cloud_active_deployment":        {Tok: azureResource(azureAppPlatform, "SpringCloudActiveDeployment")},
			"azurerm_spring_cloud_java_deployment":          {Tok: azureResource(azureAppPlatform, "SpringCloudJavaDeployment")},
			"azurerm_spring_cloud_custom_domain":            {Tok: azureResource(azureAppPlatform, "SpringCloudCustomDomain")},
			"azurerm_spring_cloud_app_redis_association":    {Tok: azureResource(azureAppPlatform, "SpringCloudAppRedisAssociation")},
			"azurerm_spring_cloud_app_mysql_association":    {Tok: azureResource(azureAppPlatform, "SpringCloudAppMysqlAssociation")},
			"azurerm_spring_cloud_app_cosmosdb_association": {Tok: azureResource(azureAppPlatform, "SpringCloudAppCosmosDBAssociation")},

			// Automation
			"azurerm_automation_account":                {Tok: azureResource(azureAutomation, "Account")},
			"azurerm_automation_credential":             {Tok: azureResource(azureAutomation, "Credential")},
			"azurerm_automation_dsc_configuration":      {Tok: azureResource(azureAutomation, "DscConfiguration")},
			"azurerm_automation_dsc_nodeconfiguration":  {Tok: azureResource(azureAutomation, "DscNodeConfiguration")},
			"azurerm_automation_module":                 {Tok: azureResource(azureAutomation, "Module")},
			"azurerm_automation_runbook":                {Tok: azureResource(azureAutomation, "RunBook")},
			"azurerm_automation_schedule":               {Tok: azureResource(azureAutomation, "Schedule")},
			"azurerm_automation_variable_bool":          {Tok: azureResource(azureAutomation, "BoolVariable")},
			"azurerm_automation_variable_datetime":      {Tok: azureResource(azureAutomation, "DateTimeVariable")},
			"azurerm_automation_variable_int":           {Tok: azureResource(azureAutomation, "IntVariable")},
			"azurerm_automation_variable_string":        {Tok: azureResource(azureAutomation, "StringVariable")},
			"azurerm_automation_job_schedule":           {Tok: azureResource(azureAutomation, "JobSchedule")},
			"azurerm_automation_certificate":            {Tok: azureResource(azureAutomation, "Certificate")},
			"azurerm_automation_connection":             {Tok: azureResource(azureAutomation, "Connection")},
			"azurerm_automation_connection_certificate": {Tok: azureResource(azureAutomation, "ConnectionCertificate")},
			"azurerm_automation_connection_classic_certificate": {
				Tok: azureResource(azureAutomation, "ConnectionClassicCertificate"),
			},
			"azurerm_automation_connection_service_principal": {
				Tok: azureResource(azureAutomation, "ConnectionServicePrincipal"),
			},

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
					"kubelet_identity": {
						Name:        "kubeletIdentities",
						MaxItemsOne: tfbridge.False(),
					},
				},
			},
			"azurerm_kubernetes_cluster_node_pool": {
				Tok: azureResource(azureContainerService, "KubernetesClusterNodePool"),
			},
			"azurerm_container_registry_scope_map": {Tok: azureResource(azureContainerService, "RegistryScopeMap")},
			"azurerm_container_registry_token":     {Tok: azureResource(azureContainerService, "RegistryToken")},

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
			"azurerm_template_deployment":                {Tok: azureResource(azureCore, "TemplateDeployment")},
			"azurerm_resource_group_template_deployment": {Tok: azureResource(azureCore, "ResourceGroupTemplateDeployment")},
			"azurerm_subscription_template_deployment":   {Tok: azureResource(azureCore, "SubscriptionTemplateDeployment")},
			"azurerm_custom_provider":                    {Tok: azureResource(azureCore, "CustomProvider")},
			"azurerm_resource_provider_registration":     {Tok: azureResource(azureCore, "ResourceProviderRegistration")},
			"azurerm_subscription":                       {Tok: azureResource(azureCore, "Subscription")},
			"azurerm_tenant_template_deployment":         {Tok: azureResource(azureCore, "TenantTemplateDeployment")},

			// CDN
			"azurerm_cdn_endpoint": {Tok: azureResource(azureCDN, "Endpoint")},
			"azurerm_cdn_profile": {
				Tok: azureResource(azureCDN, "Profile"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a profile name is 260.
					// Source: https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/resource-name-rules#microsoftcdn
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    260,
						Randlen:   8,
					}),
				},
			},

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
			"azurerm_virtual_machine_configuration_policy_assignment": {
				Tok: azureResource(azureCompute, "ConfigurationPolicyAssignment"),
			},

			"azurerm_managed_disk":         {Tok: azureResource(azureCompute, "ManagedDisk")},
			"azurerm_snapshot":             {Tok: azureResource(azureCompute, "Snapshot")},
			"azurerm_image":                {Tok: azureResource(azureCompute, "Image")},
			"azurerm_shared_image":         {Tok: azureResource(azureCompute, "SharedImage")},
			"azurerm_shared_image_gallery": {Tok: azureResource(azureCompute, "SharedImageGallery")},
			"azurerm_shared_image_version": {Tok: azureResource(azureCompute, "SharedImageVersion")},
			"azurerm_bastion_host":         {Tok: azureResource(azureCompute, "BastionHost")},
			"azurerm_dedicated_host_group": {Tok: azureResource(azureCompute, "DedicatedHostGroup")},
			"azurerm_disk_encryption_set":  {Tok: azureResource(azureCompute, "DiskEncryptionSet")},
			"azurerm_dedicated_host":       {Tok: azureResource(azureCompute, "DedicatedHost")},
			"azurerm_linux_virtual_machine": {
				Tok: azureResource(azureCompute, "LinuxVirtualMachine"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Source https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/resource-name-rules#microsoftcompute
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
			"azurerm_linux_virtual_machine_scale_set": {
				Tok: azureResource(azureCompute, "LinuxVirtualMachineScaleSet"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Source https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/resource-name-rules#microsoftcompute
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
			"azurerm_virtual_machine_scale_set_extension": {Tok: azureResource(azureCompute, "VirtualMachineScaleSetExtension")},
			"azurerm_windows_virtual_machine":             {Tok: azureResource(azureCompute, "WindowsVirtualMachine")},
			"azurerm_windows_virtual_machine_scale_set":   {Tok: azureResource(azureCompute, "WindowsVirtualMachineScaleSet")},
			"azurerm_orchestrated_virtual_machine_scale_set": {
				Tok: azureResource(azureCompute, "OrchestratedVirtualMachineScaleSet"),
			},
			"azurerm_disk_access":    {Tok: azureResource(azureCompute, "DiskAccess")},
			"azurerm_ssh_public_key": {Tok: azureResource(azureCompute, "SshPublicKey")},

			// DataBricks
			"azurerm_databricks_workspace": {Tok: azureResource(azureDataBricks, "Workspace")},

			//Databox
			"azurerm_databox_edge_device": {Tok: azureResource(azureDataboxEdge, "Device")},
			"azurerm_databox_edge_order":  {Tok: azureResource(azureDataboxEdge, "Order")},

			// DataFactory
			"azurerm_data_factory":                    {Tok: azureResource(azureDataFactory, "Factory")},
			"azurerm_data_factory_dataset_mysql":      {Tok: azureResource(azureDataFactory, "DatasetMysql")},
			"azurerm_data_factory_dataset_postgresql": {Tok: azureResource(azureDataFactory, "DatasetPostgresql")},
			"azurerm_data_factory_dataset_sql_server_table": {
				Tok: azureResource(azureDataFactory, "DatasetSqlServerTable"),
			},
			"azurerm_data_factory_linked_service_data_lake_storage_gen2": {
				Tok: azureResource(azureDataFactory, "LinkedServiceDataLakeStorageGen2"),
			},
			"azurerm_data_factory_linked_service_mysql": {
				Tok: azureResource(azureDataFactory, "LinkedServiceMysql"),
			},
			"azurerm_data_factory_linked_service_postgresql": {
				Tok: azureResource(azureDataFactory, "LinkedServicePostgresql"),
			},
			"azurerm_data_factory_linked_service_sql_server": {
				Tok: azureResource(azureDataFactory, "LinkedServiceSqlServer"),
			},
			"azurerm_data_factory_pipeline": {
				Tok: azureResource(azureDataFactory, "Pipeline"),
			},
			"azurerm_data_factory_integration_runtime_managed": {
				Tok: azureResource(azureDataFactory, "IntegrationRuntimeManaged"),
			},
			"azurerm_data_factory_trigger_schedule": {
				Tok: azureResource(azureDataFactory, "TriggerSchedule"),
			},
			"azurerm_data_factory_linked_service_key_vault": {
				Tok: azureResource(azureDataFactory, "LinkedServiceKeyVault"),
			},
			"azurerm_data_factory_integration_runtime_self_hosted": {
				Tok: azureResource(azureDataFactory, "IntegrationRuntimeSelfHosted"),
			},
			"azurerm_data_factory_dataset_azure_blob": {Tok: azureResource(azureDataFactory, "DatasetAzureBlob")},
			"azurerm_data_factory_dataset_cosmosdb_sqlapi": {
				Tok: azureResource(azureDataFactory, "DatasetCosmosDBApi"),
			},
			"azurerm_data_factory_dataset_delimited_text": {
				Tok: azureResource(azureDataFactory, "DatasetDelimitedText"),
			},
			"azurerm_data_factory_dataset_http": {Tok: azureResource(azureDataFactory, "DatasetHttp")},
			"azurerm_data_factory_dataset_json": {Tok: azureResource(azureDataFactory, "DatasetJson")},
			"azurerm_data_factory_linked_service_azure_blob_storage": {
				Tok: azureResource(azureDataFactory, "LinkedServiceAzureBlobStorage"),
			},
			"azurerm_data_factory_linked_service_azure_file_storage": {
				Tok: azureResource(azureDataFactory, "LinkedServiceAzureFileStorage"),
			},
			"azurerm_data_factory_linked_service_cosmosdb": {
				Tok: azureResource(azureDataFactory, "LinkedServiceCosmosDb"),
			},
			"azurerm_data_factory_linked_service_sftp":      {Tok: azureResource(azureDataFactory, "LinkedServiceSftp")},
			"azurerm_data_factory_linked_service_web":       {Tok: azureResource(azureDataFactory, "LinkedServiceWeb")},
			"azurerm_data_factory_linked_service_synapse":   {Tok: azureResource(azureDataFactory, "LinkedServiceSynapse")},
			"azurerm_data_factory_linked_service_snowflake": {Tok: azureResource(azureDataFactory, "LinkedServiceSnowflake")},
			"azurerm_data_factory_linked_service_azure_table_storage": {
				Tok: azureResource(azureDataFactory, "LinkedServiceAzureTableStorage"),
			},
			"azurerm_data_factory_linked_service_azure_function": {
				Tok: azureResource(azureDataFactory, "LinkedServiceAzureFunction"),
			},
			"azurerm_data_factory_linked_service_azure_sql_database": {
				Tok: azureResource(azureDataFactory, "LinkedServiceAzureSqlDatabase"),
			},
			"azurerm_data_factory_integration_runtime_azure":       {Tok: azureResource(azureDataFactory, "IntegrationRuntimeRule")},
			"azurerm_data_factory_integration_runtime_azure_ssis":  {Tok: azureResource(azureDataFactory, "IntegrationRuntimeSsis")},
			"azurerm_data_factory_dataset_parquet":                 {Tok: azureResource(azureDataFactory, "DatasetParquet")},
			"azurerm_data_factory_linked_service_azure_databricks": {Tok: azureResource(azureDataFactory, "LinkedServiceAzureDatabricks")},
			"azurerm_data_factory_dataset_snowflake":               {Tok: azureResource(azureDataFactory, "DatasetSnowflake")},
			"azurerm_data_factory_linked_service_azure_search":     {Tok: azureResource(azureDataFactory, "LinkedServiceAzureSearch")},
			"azurerm_data_factory_linked_service_kusto":            {Tok: azureResource(azureDataFactory, "LinkedServiceKusto")},

			// Data Lake
			"azurerm_data_lake_analytics_account":          {Tok: azureResource(azureDatalake, "AnalyticsAccount")},
			"azurerm_data_lake_analytics_firewall_rule":    {Tok: azureResource(azureDatalake, "AnalyticsFirewallRule")},
			"azurerm_data_lake_store":                      {Tok: azureResource(azureDatalake, "Store")},
			"azurerm_data_lake_store_file":                 {Tok: azureResource(azureDatalake, "StoreFile")},
			"azurerm_data_lake_store_firewall_rule":        {Tok: azureResource(azureDatalake, "StoreFirewallRule")},
			"azurerm_data_lake_store_virtual_network_rule": {Tok: azureResource(azureDatalake, "StoreVirtualNetworkRule")},

			// Data Protection
			"azurerm_data_protection_backup_vault": {Tok: azureResource(azureDataProtection, "BackupVault")},

			// DataShare
			"azurerm_data_share_account": {Tok: azureResource(azureDataShare, "Account")},
			"azurerm_data_share":         {Tok: azureResource(azureDataShare, "Share")},
			"azurerm_data_share_dataset_blob_storage": {
				Tok: azureResource(azureDataShare, "DatasetBlobStorage"),
			},
			"azurerm_data_share_dataset_data_lake_gen1": {
				Tok: azureResource(azureDataShare, "DatasetDataLakeGen1"),
			},
			"azurerm_data_share_dataset_data_lake_gen2": {
				Tok: azureResource(azureDataShare, "DatasetDataLakeGen2"),
			},
			"azurerm_data_share_dataset_kusto_cluster":  {Tok: azureResource(azureDataShare, "DatasetKustoCluster")},
			"azurerm_data_share_dataset_kusto_database": {Tok: azureResource(azureDataShare, "DatasetKustoDatabase")},

			// DevSpace
			"azurerm_devspace_controller": {Tok: azureResource(azureDevSpace, "Controller")},

			// Dev Test
			"azurerm_dev_test_lab":                     {Tok: azureResource(azureDevTest, "Lab")},
			"azurerm_dev_test_linux_virtual_machine":   {Tok: azureResource(azureDevTest, "LinuxVirtualMachine")},
			"azurerm_dev_test_policy":                  {Tok: azureResource(azureDevTest, "Policy")},
			"azurerm_dev_test_schedule":                {Tok: azureResource(azureDevTest, "Schedule")},
			"azurerm_dev_test_virtual_network":         {Tok: azureResource(azureDevTest, "VirtualNetwork")},
			"azurerm_dev_test_windows_virtual_machine": {Tok: azureResource(azureDevTest, "WindowsVirtualMachine")},
			"azurerm_dev_test_global_vm_shutdown_schedule": {
				Tok: azureResource(azureDevTest, "GlobalVMShutdownSchedule"),
			},

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
			"azurerm_eventhub":           {Tok: azureResource(azureEventHub, "EventHub")},
			"azurerm_eventhub_namespace": {Tok: azureResource(azureEventHub, "EventHubNamespace")},
			"azurerm_eventhub_namespace_authorization_rule": {
				Tok: azureResource(azureEventHub, "EventHubNamespaceAuthorizationRule"),
			},
			"azurerm_eventhub_namespace_disaster_recovery_config": {
				Tok: azureResource(azureEventHub, "EventhubNamespaceDisasterRecoveryConfig"),
			},
			"azurerm_eventhub_cluster": {Tok: azureResource(azureEventHub, "Cluster")},

			// Eventgrid
			"azurerm_eventgrid_system_topic_event_subscription": {Tok: azureResource(azureEventGrid, "SystemTopicEventSubscription")},

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
			"azurerm_iothub_enrichment":                 {Tok: azureResource(azureIot, "Enrichment")},
			"azurerm_iot_security_solution":             {Tok: azureResource(azureIot, "SecuritySolution")},
			"azurerm_iot_time_series_insights_event_source_iothub": {
				Tok: azureResource(azureIot, "TimeSeriesInsightsEventSourceIothub"),
			},
			"azurerm_iot_time_series_insights_standard_environment": {
				Tok: azureResource(azureIot, "TimeSeriesInsightsStandardEnvironment"),
			},
			"azurerm_iot_time_series_insights_access_policy": {
				Tok: azureResource(azureIot, "TimeSeriesInsightsAccessPolicy"),
			},
			"azurerm_iot_time_series_insights_reference_data_set": {
				Tok: azureResource(azureIot, "TimeSeriesInsightsReferenceDataSet"),
			},
			"azurerm_iot_time_series_insights_gen2_environment": {
				Tok: azureResource(azureIot, "TimeSeriesInsightsGen2Environment"),
			},
			"azurerm_iot_security_device_group": {Tok: azureResource(azureIot, "SecurityDeviceGroup")},

			// KeyVault
			"azurerm_key_vault":                    {Tok: azureResource(azureKeyVault, "KeyVault")},
			"azurerm_key_vault_access_policy":      {Tok: azureResource(azureKeyVault, "AccessPolicy")},
			"azurerm_key_vault_key":                {Tok: azureResource(azureKeyVault, "Key")},
			"azurerm_key_vault_secret":             {Tok: azureResource(azureKeyVault, "Secret")},
			"azurerm_key_vault_certificate_issuer": {Tok: azureResource(azureKeyVault, "CertificateIssuer")},
			"azurerm_key_vault_managed_hardware_security_module": {
				Tok: azureResource(azureKeyVault, "ManagedHardwareSecurityModule"),
			},

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
			"azurerm_lb_backend_address_pool_address": {Tok: azureResource(azureLB, "BackendAddressPoolAddress")},

			// Log Analytics
			"azurerm_log_analytics_linked_service": {Tok: azureResource(azureLogAnalytics, "LinkedService")},
			"azurerm_log_analytics_datasource_windows_event": {
				Tok: azureResource(azureLogAnalytics, "DataSourceWindowsEvent"),
			},
			"azurerm_log_analytics_datasource_windows_performance_counter": {
				Tok: azureResource(azureLogAnalytics, "DataSourceWindowsPerformanceCounter"),
			},
			"azurerm_log_analytics_saved_search":           {Tok: azureResource(azureLogAnalytics, "SavedSearch")},
			"azurerm_log_analytics_data_export_rule":       {Tok: azureResource(azureLogAnalytics, "DataExportRule")},
			"azurerm_log_analytics_linked_storage_account": {Tok: azureResource(azureLogAnalytics, "LinkedStorageAccount")},
			"azurerm_log_analytics_storage_insights":       {Tok: azureResource(azureLogAnalytics, "StorageInsights")},
			"azurerm_log_analytics_cluster":                {Tok: azureResource(azureLogAnalytics, "Cluster")},
			"azurerm_log_analytics_cluster_customer_managed_key": {
				Tok: azureResource(azureLogAnalytics, "ClusterCustomerManagedKey"),
			},

			// Logic Apps
			"azurerm_logic_app_action_custom":        {Tok: azureResource(azureLogicApps, "ActionCustom")},
			"azurerm_logic_app_action_http":          {Tok: azureResource(azureLogicApps, "ActionHttp")},
			"azurerm_logic_app_trigger_custom":       {Tok: azureResource(azureLogicApps, "TriggerCustom")},
			"azurerm_logic_app_trigger_http_request": {Tok: azureResource(azureLogicApps, "TriggerHttpRequest")},
			"azurerm_logic_app_trigger_recurrence":   {Tok: azureResource(azureLogicApps, "TriggerRecurrence")},
			"azurerm_logic_app_workflow":             {Tok: azureResource(azureLogicApps, "Workflow")},
			"azurerm_logic_app_integration_account":  {Tok: azureResource(azureLogicApps, "IntegrationAccount")},
			"azurerm_integration_service_environment": {
				Tok: azureResource(azureLogicApps, "InterationServiceEnvironment"),
			},

			// MariaDB
			"azurerm_mariadb_configuration": {
				Tok: azureResource(azureMariaDB, "Configuration"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"name": {Name: "name"},
				},
			},
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
			"azurerm_cosmosdb_account": {
				Tok: azureResource(azureCosmosDB, "Account"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of a Cosmos DB account name is 44.
					// Source: https://docs.microsoft.com/en-us/azure/cosmos-db/how-to-manage-database-account#create-database-account-via-portal
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    44,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_cosmosdb_cassandra_keyspace": {Tok: azureResource(azureCosmosDB, "CassandraKeyspace")},
			"azurerm_cosmosdb_mongo_collection":   {Tok: azureResource(azureCosmosDB, "MongoCollection")},
			"azurerm_cosmosdb_mongo_database":     {Tok: azureResource(azureCosmosDB, "MongoDatabase")},
			"azurerm_cosmosdb_sql_container":      {Tok: azureResource(azureCosmosDB, "SqlContainer")},
			"azurerm_cosmosdb_sql_database":       {Tok: azureResource(azureCosmosDB, "SqlDatabase")},
			"azurerm_cosmosdb_table":              {Tok: azureResource(azureCosmosDB, "Table")},
			"azurerm_cosmosdb_gremlin_database":   {Tok: azureResource(azureCosmosDB, "GremlinDatabase")},
			"azurerm_cosmosdb_gremlin_graph": {
				Tok: azureResource(azureCosmosDB, "GremlinGraph"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"conflict_resolution_policy": {
						Name:        "conflictResolutionPolicies",
						MaxItemsOne: tfbridge.False(),
					},
					"index_policy": {
						Name:        "indexPolicies",
						MaxItemsOne: tfbridge.False(),
					},
				},
			},
			"azurerm_cosmosdb_sql_stored_procedure": {Tok: azureResource(azureCosmosDB, "SqlStoredProcedure")},
			"azurerm_cosmosdb_cassandra_table":      {Tok: azureResource(azureCosmosDB, "CassandraTable")},
			"azurerm_cosmosdb_notebook_workspace":   {Tok: azureResource(azureCosmosDB, "NotebookWorkspace")},
			"azurerm_cosmosdb_sql_trigger":          {Tok: azureResource(azureCosmosDB, "SqlTrigger")},
			"azurerm_cosmosdb_sql_function":         {Tok: azureResource(azureCosmosDB, "SqlFunction")},

			// Cost Management
			"azurerm_cost_management_export_resource_group": {
				Tok: azureResource(azureCostManagement, "ResourceGroupExport"),
			},

			// Maps
			"azurerm_maps_account": {Tok: azureResource(azureMaps, "Account")},

			// Media
			"azurerm_media_asset":              {Tok: azureResource(azureMedia, "Asset")},
			"azurerm_media_asset_filter":       {Tok: azureResource(azureMedia, "AssetFilter")},
			"azurerm_media_transform":          {Tok: azureResource(azureMedia, "Transform")},
			"azurerm_media_job":                {Tok: azureResource(azureMedia, "Job")},
			"azurerm_media_streaming_endpoint": {Tok: azureResource(azureMedia, "StreamingEndpoint")},
			"azurerm_media_streaming_locator":  {Tok: azureResource(azureMedia, "StreamingLocator")},
			"azurerm_media_content_key_policy": {Tok: azureResource(azureMedia, "ContentKeyPolicy")},
			"azurerm_media_streaming_policy":   {Tok: azureResource(azureMedia, "StreamingPolicy")},
			"azurerm_media_live_event":         {Tok: azureResource(azureMedia, "LiveEvent")},
			"azurerm_media_live_event_output":  {Tok: azureResource(azureMedia, "LiveEventOutput")},

			// Monitoring resources
			"azurerm_monitor_action_group": {
				Tok: azureResource(azureMonitoring, "ActionGroup"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Max length of an ActionGroup name is 260.
					// Source: https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/resource-name-rules#microsoftinsights
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    260,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_monitor_activity_log_alert": {Tok: azureResource(azureMonitoring, "ActivityLogAlert")},
			"azurerm_monitor_autoscale_setting": {
				Tok: azureResource(azureMonitoring, "AutoscaleSetting"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// The max length according to the portal is 255 - there is no official API docs to provide this info
					azureName: tfbridge.AutoNameWithCustomOptions(azureName, tfbridge.AutoNameOptions{
						Separator: "",
						Maxlen:    255,
						Randlen:   8,
						Transform: func(name string) string {
							return strings.ToLower(name)
						},
					}),
				},
			},
			"azurerm_monitor_diagnostic_setting":          {Tok: azureResource(azureMonitoring, "DiagnosticSetting")},
			"azurerm_monitor_log_profile":                 {Tok: azureResource(azureMonitoring, "LogProfile")},
			"azurerm_monitor_metric_alert":                {Tok: azureResource(azureMonitoring, "MetricAlert")},
			"azurerm_monitor_scheduled_query_rules_alert": {Tok: azureResource(azureMonitoring, "ScheduledQueryRulesAlert")},
			"azurerm_monitor_scheduled_query_rules_log":   {Tok: azureResource(azureMonitoring, "ScheduledQueryRulesLog")},
			"azurerm_monitor_action_rule_action_group":    {Tok: azureResource(azureMonitoring, "ActionRuleActionGroup")},
			"azurerm_monitor_action_rule_suppression":     {Tok: azureResource(azureMonitoring, "ActionRuleSuppression")},
			"azurerm_monitor_smart_detector_alert_rule":   {Tok: azureResource(azureMonitoring, "SmartDetectorAlertRule")},
			"azurerm_monitor_aad_diagnostic_setting":      {Tok: azureResource(azureMonitoring, "AadDiagnosticSetting")},

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
			"azurerm_mssql_database":                           {Tok: azureResource(azureMSSQL, "Database")},
			"azurerm_mssql_virtual_machine":                    {Tok: azureResource(azureMSSQL, "VirtualMachine")},
			"azurerm_mssql_server":                             {Tok: azureResource(azureMSSQL, "Server")},
			"azurerm_mssql_database_extended_auditing_policy":  {Tok: azureResource(azureMSSQL, "DatabaseExtendedAuditingPolicy")},
			"azurerm_mssql_server_extended_auditing_policy":    {Tok: azureResource(azureMSSQL, "ServerExtendedAuditingPolicy")},
			"azurerm_mssql_firewall_rule":                      {Tok: azureResource(azureMSSQL, "FirewallRule")},
			"azurerm_mssql_virtual_network_rule":               {Tok: azureResource(azureMSSQL, "VirtualNetworkRule")},
			"azurerm_mssql_job_agent":                          {Tok: azureResource(azureMSSQL, "JobAgent")},
			"azurerm_mssql_job_credential":                     {Tok: azureResource(azureMSSQL, "JobCredential")},
			"azurerm_mssql_server_transparent_data_encryption": {Tok: azureResource(azureMSSQL, "ServerTransparentDataEncryption")},

			// MySQL
			"azurerm_mysql_configuration": {
				Tok: azureResource(azureMySQL, "Configuration"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"name": {Name: "name"},
				},
			},
			"azurerm_mysql_database":             {Tok: azureResource(azureMySQL, "Database")},
			"azurerm_mysql_firewall_rule":        {Tok: azureResource(azureMySQL, "FirewallRule")},
			"azurerm_mysql_server":               {Tok: azureResource(azureMySQL, "Server")},
			"azurerm_mysql_virtual_network_rule": {Tok: azureResource(azureMySQL, "VirtualNetworkRule")},
			"azurerm_mysql_server_key":           {Tok: azureResource(azureMySQL, "ServerKey")},
			"azurerm_mysql_active_directory_administrator": {
				Tok: azureResource(azureMySQL, "ActiveDirectoryAdministrator"),
			},

			// Postgress SQL
			"azurerm_postgresql_configuration": {
				Tok: azureResource(azurePostgresql, "Configuration"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"name": {Name: "name"},
				},
			},
			"azurerm_postgresql_database":             {Tok: azureResource(azurePostgresql, "Database")},
			"azurerm_postgresql_firewall_rule":        {Tok: azureResource(azurePostgresql, "FirewallRule")},
			"azurerm_postgresql_server":               {Tok: azureResource(azurePostgresql, "Server")},
			"azurerm_postgresql_virtual_network_rule": {Tok: azureResource(azurePostgresql, "VirtualNetworkRule")},
			"azurerm_postgresql_server_key":           {Tok: azureResource(azurePostgresql, "ServerKey")},
			"azurerm_postgresql_active_directory_administrator": {
				Tok: azureResource(azurePostgresql, "ActiveDirectoryAdministrator"),
			},
			"azurerm_postgresql_flexible_server": {Tok: azureResource(azurePostgresql, "FlexibleServer")},
			"azurerm_postgresql_flexible_server_firewall_rule": {
				Tok: azureResource(azurePostgresql, "FlexibleServerFirewallRule"),
			},

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
			"azurerm_virtual_wan":             {Tok: azureResource(azureNetwork, "VirtualWan")},
			"azurerm_virtual_network_peering": {Tok: azureResource(azureNetwork, "VirtualNetworkPeering")},
			"azurerm_virtual_network_gateway": {
				Tok: azureResource(azureNetwork, "VirtualNetworkGateway"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"bgp_settings": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"peering_address": {
									Name: "peeringAddress",
								},
								"peering_addresses": {
									Name: "peeringAddresses",
								},
							},
						},
					},
				},
			},
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
			"azurerm_application_security_group":            {Tok: azureResource(azureNetwork, "ApplicationSecurityGroup")},
			"azurerm_firewall":                              {Tok: azureResource(azureNetwork, "Firewall")},
			"azurerm_firewall_policy":                       {Tok: azureResource(azureNetwork, "FirewallPolicy")},
			"azurerm_firewall_policy_rule_collection_group": {Tok: azureResource(azureNetwork, "FirewallPolicyRuleCollectionGroup")},
			"azurerm_firewall_application_rule_collection":  {Tok: azureResource(azureNetwork, "FirewallApplicationRuleCollection")},
			"azurerm_firewall_nat_rule_collection":          {Tok: azureResource(azureNetwork, "FirewallNatRuleCollection")},
			"azurerm_firewall_network_rule_collection":      {Tok: azureResource(azureNetwork, "FirewallNetworkRuleCollection")},
			"azurerm_network_connection_monitor":            {Tok: azureResource(azureNetwork, "NetworkConnectionMonitor")},
			"azurerm_network_ddos_protection_plan":          {Tok: azureResource(azureNetwork, "DdosProtectionPlan")},
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
			"azurerm_route":        {Tok: azureResource(azureNetwork, "Route")},
			"azurerm_route_filter": {Tok: azureResource(azureNetwork, "RouteFilter")},
			"azurerm_route_table":  {Tok: azureResource(azureNetwork, "RouteTable")},
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
			"azurerm_express_route_gateway": {Tok: azureResource(azureNetwork, "ExpressRouteGateway")},
			"azurerm_nat_gateway":           {Tok: azureResource(azureNetwork, "NatGateway")},
			"azurerm_nat_gateway_public_ip_association": {
				Tok: azureResource(azureNetwork, "NatGatewayPublicIpAssociation"),
			},
			"azurerm_subnet_nat_gateway_association":         {Tok: azureResource(azureNetwork, "SubnetNatGatewayAssociation")},
			"azurerm_subnet_service_endpoint_storage_policy": {Tok: azureResource(azureNetwork, "SubnetServiceEndpointStoragePolicy")},
			"azurerm_point_to_site_vpn_gateway":              {Tok: azureResource(azureNetwork, "PointToPointVpnGateway")},
			"azurerm_virtual_hub":                            {Tok: azureResource(azureNetwork, "VirtualHub")},
			"azurerm_virtual_hub_connection":                 {Tok: azureResource(azureNetwork, "VirtualHubConnection")},
			"azurerm_virtual_hub_ip":                         {Tok: azureResource(azureNetwork, "VirtualHubIp")},
			"azurerm_virtual_hub_route_table":                {Tok: azureResource(azureNetwork, "VirtualHubRouteTable")},
			"azurerm_virtual_hub_security_partner_provider":  {Tok: azureResource(azureNetwork, "SecurityPartnerProvider")},
			"azurerm_virtual_hub_bgp_connection":             {Tok: azureResource(azureNetwork, "BgpConnection")},
			"azurerm_vpn_gateway":                            {Tok: azureResource(azureNetwork, "VpnGateway")},
			"azurerm_vpn_gateway_connection":                 {Tok: azureResource(azureNetwork, "VpnGatewayConnection")},
			"azurerm_vpn_server_configuration": {
				Tok: azureResource(azureNetwork, "VpnServerConfiguration"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"vpn_authentication_types": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"azurerm_ip_group":           {Tok: azureResource(azureNetwork, "IPGroup")},
			"azurerm_vpn_site":           {Tok: azureResource(azureNetwork, "VpnSite")},
			"azurerm_express_route_port": {Tok: azureResource(azureNetwork, "ExpressRoutePort")},

			// Redis
			"azurerm_redis_cache":               {Tok: azureResource(azureRedis, "Cache")},
			"azurerm_redis_firewall_rule":       {Tok: azureResource(azureRedis, "FirewallRule")},
			"azurerm_redis_linked_server":       {Tok: azureResource(azureRedis, "LinkedServer")},
			"azurerm_redis_enterprise_cluster":  {Tok: azureResource(azureRedis, "EnterpriseCluster")},
			"azurerm_redis_enterprise_database": {Tok: azureResource(azureRedis, "EnterpriseDatabase")},

			// Relay
			"azurerm_relay_namespace":         {Tok: azureResource(azureRelay, "Namespace")},
			"azurerm_relay_hybrid_connection": {Tok: azureResource(azureRelay, "HybridConnection")},

			// Security Center
			"azurerm_security_center_contact":                         {Tok: azureResource(azureSecurityCenter, "Contact")},
			"azurerm_security_center_subscription_pricing":            {Tok: azureResource(azureSecurityCenter, "SubscriptionPricing")},
			"azurerm_security_center_workspace":                       {Tok: azureResource(azureSecurityCenter, "Workspace")},
			"azurerm_advanced_threat_protection":                      {Tok: azureResource(azureSecurityCenter, "AdvancedThreatProtection")},
			"azurerm_security_center_setting":                         {Tok: azureResource(azureSecurityCenter, "Setting")},
			"azurerm_security_center_auto_provisioning":               {Tok: azureResource(azureSecurityCenter, "AutoProvisioning")},
			"azurerm_security_center_automation":                      {Tok: azureResource(azureSecurityCenter, "Automation")},
			"azurerm_security_center_assessment_metadata":             {Tok: azureResource(azureSecurityCenter, "AssessmentMetadata")},
			"azurerm_security_center_server_vulnerability_assessment": {Tok: azureResource(azureSecurityCenter, "ServerVulnerabilityAssessment")},
			"azurerm_security_center_assessment":                      {Tok: azureResource(azureSecurityCenter, "Assessment")},
			"azurerm_security_center_assessment_policy":               {Tok: azureResource(azureSecurityCenter, "AssessmentPolicy")},

			// Service Fabric
			"azurerm_service_fabric_cluster":            {Tok: azureResource(azureServiceFabric, "Cluster")},
			"azurerm_service_fabric_mesh_application":   {Tok: azureResource(azureServiceFabric, "MeshApplication")},
			"azurerm_service_fabric_mesh_secret":        {Tok: azureResource(azureServiceFabric, "MeshSecret")},
			"azurerm_service_fabric_mesh_secret_value":  {Tok: azureResource(azureServiceFabric, "MeshSecretValue")},
			"azurerm_service_fabric_mesh_local_network": {Tok: azureResource(azureServiceFabric, "MeshLocalNetwork")},

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
			"azurerm_storage_data_lake_gen2_filesystem": {Tok: azureResource(azureStorage, "DataLakeGen2Filesystem")},
			"azurerm_storage_management_policy":         {Tok: azureResource(azureStorage, "ManagementPolicy")},
			"azurerm_storage_account_network_rules": {
				Tok: azureResource(azureStorage, "AccountNetworkRules"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"private_link_access": {
						Name: "privateLinkAccessRules",
					},
				},
			},
			"azurerm_storage_account_customer_managed_key": {Tok: azureResource(azureStorage, "CustomerManagedKey")},
			"azurerm_storage_sync":                         {Tok: azureResource(azureStorage, "Sync")},
			"azurerm_storage_sync_group":                   {Tok: azureResource(azureStorage, "SyncGroup")},
			"azurerm_storage_data_lake_gen2_path":          {Tok: azureResource(azureStorage, "DataLakeGen2Path")},
			"azurerm_storage_encryption_scope":             {Tok: azureResource(azureStorage, "EncryptionScope")},
			"azurerm_storage_share_file":                   {Tok: azureResource(azureStorage, "ShareFile")},
			"azurerm_storage_sync_cloud_endpoint":          {Tok: azureResource(azureStorage, "SyncCloudEndpoint")},
			"azurerm_storage_blob_inventory_policy":        {Tok: azureResource(azureStorage, "BlobInventoryPolicy")},
			"azurerm_storage_object_replication": {
				Tok: azureResource(azureStorage, "ObjectReplication"),
			},

			//StreamAnalytics
			"azurerm_stream_analytics_function_javascript_udf": {
				Tok: azureResource(azureStreamAnalytics, "FunctionJavaScriptUDF"),
			},
			"azurerm_stream_analytics_job": {Tok: azureResource(azureStreamAnalytics, "Job")},
			"azurerm_stream_analytics_output_blob": {
				Tok: azureResource(azureStreamAnalytics, "OutputBlob"),
			},
			"azurerm_stream_analytics_output_eventhub": {
				Tok: azureResource(azureStreamAnalytics, "OutputEventHub"),
			},
			"azurerm_stream_analytics_output_mssql": {
				Tok: azureResource(azureStreamAnalytics, "OutputMssql"),
			},
			"azurerm_stream_analytics_output_servicebus_queue": {
				Tok: azureResource(azureStreamAnalytics, "OutputServiceBusQueue"),
			},
			"azurerm_stream_analytics_stream_input_blob": {
				Tok: azureResource(azureStreamAnalytics, "StreamInputBlob"),
			},
			"azurerm_stream_analytics_stream_input_eventhub": {
				Tok: azureResource(azureStreamAnalytics, "StreamInputEventHub"),
			},
			"azurerm_stream_analytics_stream_input_iothub": {
				Tok: azureResource(azureStreamAnalytics, "StreamInputIotHub"),
			},
			"azurerm_stream_analytics_output_servicebus_topic": {
				Tok: azureResource(azureStreamAnalytics, "OutputServicebusTopic"),
			},
			"azurerm_stream_analytics_reference_input_blob": {
				Tok: azureResource(azureStreamAnalytics, "ReferenceInputBlob"),
			},

			// Marketplace
			"azurerm_marketplace_agreement": {Tok: azureResource(azureMarketPlace, "Agreement")},

			// Kusto
			"azurerm_kusto_cluster":                      {Tok: azureResource(azureKusto, "Cluster")},
			"azurerm_kusto_database":                     {Tok: azureResource(azureKusto, "Database")},
			"azurerm_kusto_eventhub_data_connection":     {Tok: azureResource(azureKusto, "EventhubDataConnection")},
			"azurerm_kusto_database_principal":           {Tok: azureResource(azureKusto, "DatabasePrincipal")},
			"azurerm_kusto_cluster_principal_assignment": {Tok: azureResource(azureKusto, "ClusterPrincipalAssignment")},
			"azurerm_kusto_iothub_data_connection":       {Tok: azureResource(azureKusto, "IotHubDataConnection")},
			"azurerm_kusto_attached_database_configuration": {
				Tok: azureResource(azureKusto, "AttachedDatabaseConfiguration"),
			},
			"azurerm_kusto_database_principal_assignment": {
				Tok: azureResource(azureKusto, "DatabasePrincipalAssignment"),
			},
			"azurerm_kusto_cluster_customer_managed_key": {
				Tok: azureResource(azureKusto, "ClusterCustomerManagedKey"),
			},
			"azurerm_kusto_eventgrid_data_connection": {Tok: azureResource(azureKusto, "EventGridDataConnection")},

			// Frontdoor
			"azurerm_frontdoor": {
				Tok: azureResource(azureFrontdoor, "Frontdoor"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"backend_pool_health_probes":           {Name: "backendPoolHealthProbesMap"},
					"backend_pool_load_balancing_settings": {Name: "backendPoolLoadBalancingSettingsMap"},
					"backend_pools":                        {Name: "backendPoolsMap"},
					"frontend_endpoints":                   {Name: "frontendEndpointsMap"},
					"routing_rules":                        {Name: "routingRulesMap"},
				},
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
			"azurerm_frontdoor_custom_https_configuration": {
				Tok: azureResource(azureFrontdoor, "CustomHttpsConfiguration"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"custom_https_configuration": {
						CSharpName: "CustomHttpsConfigurationConfig",
					},
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
			"azurerm_hpc_cache":               {Tok: azureResource(azureHpc, "Cache")},
			"azurerm_hpc_cache_blob_target":   {Tok: azureResource(azureHpc, "CacheBlobTarget")},
			"azurerm_hpc_cache_nfs_target":    {Tok: azureResource(azureHpc, "CacheNfsTarget")},
			"azurerm_hpc_cache_access_policy": {Tok: azureResource(azureHpc, "CacheAccessPolicy")},

			// Mixed Reality
			"azurerm_spatial_anchors_account": {Tok: azureResource(azureMixedReality, "SpatialAnchorsAccount")},

			// PowerBI
			"azurerm_powerbi_embedded": {Tok: azureResource(azurePowerBi, "Embedded")},

			// Machine Learning
			"azurerm_machine_learning_workspace":         {Tok: azureResource(azureMachineLearning, "Workspace")},
			"azurerm_machine_learning_inference_cluster": {Tok: azureResource(azureMachineLearning, "InferenceCluster")},

			// Managed Applications
			"azurerm_managed_application":            {Tok: azureResource(azureManagedApplication, "Application")},
			"azurerm_managed_application_definition": {Tok: azureResource(azureManagedApplication, "Definition")},

			// Maintenance
			"azurerm_maintenance_configuration": {Tok: azureResource(azureMaintenance, "Configuration")},
			"azurerm_maintenance_assignment_dedicated_host": {
				Tok: azureResource(azureMaintenance, "AssignmentDedicatedHost"),
			},
			"azurerm_maintenance_assignment_virtual_machine": {
				Tok: azureResource(azureMaintenance, "AssignmentVirtualMachine"),
			},

			// Servicebus
			"azurerm_servicebus_namespace_network_rule_set": {
				Tok: azureResource(azureServiceBus, "NamespaceNetworkRuleSet"),
			},
			"azurerm_servicebus_namespace_disaster_recovery_config": {
				Tok: azureResource(azureServiceBus, "NamespaceDisasterRecoveryConfig"),
			},

			// Sentinel
			"azurerm_sentinel_alert_rule_ms_security_incident": {
				Tok: azureResource(azureSentinel, "AlertRuleMsSecurityIncident"),
			},
			"azurerm_sentinel_alert_rule_scheduled": {
				Tok: azureResource(azureSentinel, "AlertRuleScheduled"),
			},
			"azurerm_sentinel_alert_rule_fusion": {Tok: azureResource(azureSentinel, "AlertRuleFusion")},
			"azurerm_sentinel_data_connector_aws_cloud_trail": {
				Tok: azureResource(azureSentinel, "DataConnectorAwsCloudTrail"),
			},
			"azurerm_sentinel_data_connector_azure_active_directory": {
				Tok: azureResource(azureSentinel, "DataConnectorAzureActiveDirectory"),
			},
			"azurerm_sentinel_data_connector_office_365": {
				Tok: azureResource(azureSentinel, "DataConnectorOffice365"),
			},
			"azurerm_sentinel_data_connector_threat_intelligence": {
				Tok: azureResource(azureSentinel, "DataConnectorThreatIntelligence"),
			},
			"azurerm_sentinel_data_connector_azure_advanced_threat_protection": {
				Tok: azureResource(azureSentinel, "DataConnectorAzureAdvancedThreadProtection"),
			},
			"azurerm_sentinel_data_connector_azure_security_center": {
				Tok: azureResource(azureSentinel, "DataConnectorAzureSecurityCenter"),
			},
			"azurerm_sentinel_data_connector_microsoft_cloud_app_security": {
				Tok: azureResource(azureSentinel, "DataConnectorMicrosoftCloudAppSecurity"),
			},
			"azurerm_sentinel_data_connector_microsoft_defender_advanced_threat_protection": {
				Tok: azureResource(azureSentinel, "DataConnectorMicrosoftDefenderAdvancedThreatProtection"),
			},
			"azurerm_sentinel_alert_rule_machine_learning_behavior_analytics": {
				Tok: azureResource(azureSentinel, "AlertRuleMachineLearningBehaviorAnalytics"),
			},

			// Eventgrid
			"azurerm_eventgrid_domain_topic": {Tok: azureResource(azureEventGrid, "DomainTopic")},

			// Blueprint
			"azurerm_blueprint_assignment": {Tok: azureResource(azureBlueprint, "Assignment")},

			// Synapse
			"azurerm_synapse_workspace":                {Tok: azureResource(azureSynapse, "Workspace")},
			"azurerm_synapse_firewall_rule":            {Tok: azureResource(azureSynapse, "FirewallRule")},
			"azurerm_synapse_spark_pool":               {Tok: azureResource(azureSynapse, "SparkPool")},
			"azurerm_synapse_sql_pool":                 {Tok: azureResource(azureSynapse, "SqlPool")},
			"azurerm_synapse_role_assignment":          {Tok: azureResource(azureSynapse, "RoleAssignment")},
			"azurerm_synapse_managed_private_endpoint": {Tok: azureResource(azureSynapse, "ManagedPrivateEndpoint")},

			// HSM
			"azurerm_dedicated_hardware_security_module": {Tok: azureResource(azureHsm, "Module")},

			// Attestation
			"azurerm_attestation_provider": {Tok: azureResource(azureAttestation, "Provider")},

			// Lighthouse
			"azurerm_lighthouse_definition": {Tok: azureResource(azureLighthouse, "Definition")},
			"azurerm_lighthouse_assignment": {Tok: azureResource(azureLighthouse, "Assignment")},

			// DesktopVirtualization
			"azurerm_virtual_desktop_application_group": {Tok: azureResource(azureDesktopVirtualization, "ApplicationGroup")},
			"azurerm_virtual_desktop_workspace_application_group_association": {
				Tok: azureResource(azureDesktopVirtualization, "WorkspaceApplicationGroupAssociation"),
			},
			"azurerm_virtual_desktop_host_pool": {Tok: azureResource(azureDesktopVirtualization, "HostPool")},
			"azurerm_virtual_desktop_workspace": {Tok: azureResource(azureDesktopVirtualization, "Workspace")},

			// DigitalTwins
			"azurerm_digital_twins_instance":            {Tok: azureResource(azureDigitalTwins, "Instance")},
			"azurerm_digital_twins_endpoint_eventgrid":  {Tok: azureResource(azureDigitalTwins, "EndpointEventGrid")},
			"azurerm_digital_twins_endpoint_eventhub":   {Tok: azureResource(azureDigitalTwins, "EndpointEventHub")},
			"azurerm_digital_twins_endpoint_servicebus": {Tok: azureResource(azureDigitalTwins, "EndpointServicebus")},

			// Azure Stack
			"azurerm_stack_hci_cluster": {Tok: azureResource(azureStack, "HciCluster")},

			// VMWare
			"azurerm_vmware_private_cloud": {Tok: azureResource(azureAvs, "PrivateCloud")},
			"azurerm_vmware_cluster":       {Tok: azureResource(azureAvs, "Cluster")},
			"azurerm_vmware_express_route_authorization": {
				Tok: azureResource(azureAvs, "ExpressRouteAuthorization"),
			},

			// Purview
			"azurerm_purview_account": {Tok: azureResource(azurePurview, "Account")},

			// Management
			"azurerm_management_group_template_deployment":      {Tok: azureResource(azureManagement, "GroupTemplateDeployment")},
			"azurerm_management_group_subscription_association": {Tok: azureResource(azureManagement, "GroupSubscriptionAssociation")},

			// communication
			"azurerm_communication_service": {Tok: azureResource(azureCommunication, "Service")},

			// consumption
			"azurerm_consumption_budget_resource_group": {Tok: azureResource(azureConsumption, "BudgetResourceGroup")},
			"azurerm_consumption_budget_subscription":   {Tok: azureResource(azureConsumption, "BudgetSubscription")},
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
			"azurerm_batch_pool": {
				Tok: azureDataSource(azureBatch, "getPool"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"network_configuration": {
						MaxItemsOne: tfbridge.True(),
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"endpoint_configuration": {
									MaxItemsOne: tfbridge.True(),
								},
							},
						},
					},
				},
			},
			"azurerm_subscriptions":                     {Tok: azureDataSource(azureCore, "getSubscriptions")},
			"azurerm_cdn_profile":                       {Tok: azureDataSource(azureCDN, "getProfile")},
			"azurerm_client_config":                     {Tok: azureDataSource(azureCore, "getClientConfig")},
			"azurerm_container_registry":                {Tok: azureDataSource(azureContainerService, "getRegistry")},
			"azurerm_cosmosdb_account":                  {Tok: azureDataSource(azureCosmosDB, "getAccount")},
			"azurerm_data_lake_store":                   {Tok: azureDataSource(azureDatalake, "getStore")},
			"azurerm_data_share_account":                {Tok: azureDataSource(azureDataShare, "getAccount")},
			"azurerm_data_share":                        {Tok: azureDataSource(azureDataShare, "getShare")},
			"azurerm_data_share_dataset_blob_storage":   {Tok: azureDataSource(azureDataShare, "getDatasetBlobStorage")},
			"azurerm_data_share_dataset_data_lake_gen1": {Tok: azureDataSource(azureDataShare, "getDatasetDataLakeGen1")},
			"azurerm_data_share_dataset_data_lake_gen2": {Tok: azureDataSource(azureDataShare, "getDatasetDataLakeGen2")},
			"azurerm_data_share_dataset_kusto_cluster":  {Tok: azureDataSource(azureDataShare, "getDatasetKustoCluster")},
			"azurerm_data_share_dataset_kusto_database": {Tok: azureDataSource(azureDataShare, "getDatasetKustoDatabase")},
			"azurerm_dev_test_lab":                      {Tok: azureDataSource(azureDevTest, "getLab")},
			"azurerm_dev_test_virtual_network":          {Tok: azureDataSource(azureDevTest, "getVirtualNetwork")},
			"azurerm_image":                             {Tok: azureDataSource(azureCompute, "getImage")},
			"azurerm_images":                            {Tok: azureDataSource(azureCompute, "getImages")},
			"azurerm_shared_image":                      {Tok: azureDataSource(azureCompute, "getSharedImage")},
			"azurerm_shared_image_gallery":              {Tok: azureDataSource(azureCompute, "getSharedImageGallery")},
			"azurerm_shared_image_version":              {Tok: azureDataSource(azureCompute, "getSharedImageVersion")},
			"azurerm_lb": {
				Tok: azureDataSource(azureLB, "getLB"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer.html.markdown",
				},
			},
			"azurerm_lb_rule": {
				Tok: azureDataSource(azureLB, "getLBRule"),
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
			"azurerm_logic_app_workflow":            {Tok: azureDataSource(azureLogicApps, "getWorkflow")},
			"azurerm_logic_app_integration_account": {Tok: azureDataSource(azureLogicApps, "getIntegrationAccount")},
			"azurerm_maps_account":                  {Tok: azureDataSource(azureMaps, "getAccount")},
			"azurerm_monitor_action_group":          {Tok: azureDataSource(azureMonitoring, "getActionGroup")},
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
			"azurerm_mssql_server":      {Tok: azureDataSource(azureMSSQL, "getServer")},
			"azurerm_dns_zone":          {Tok: azureDataSource(azureDNS, "getZone")},
			"azurerm_key_vault": {
				Tok: azureDataSource(azureKeyVault, "getKeyVault"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_key_vault_access_policy":      {Tok: azureDataSource(azureKeyVault, "getAccessPolicy")},
			"azurerm_key_vault_key":                {Tok: azureDataSource(azureKeyVault, "getKey")},
			"azurerm_key_vault_secret":             {Tok: azureDataSource(azureKeyVault, "getSecret")},
			"azurerm_key_vault_certificate":        {Tok: azureDataSource(azureKeyVault, "getCertificate")},
			"azurerm_key_vault_certificate_issuer": {Tok: azureDataSource(azureKeyVault, "getCertificateIssuer")},
			"azurerm_key_vault_certificate_data":   {Tok: azureDataSource(azureKeyVault, "getCertificateData")},
			"azurerm_key_vault_managed_hardware_security_module": {
				Tok: azureDataSource(azureKeyVault, "getManagedHardwareSecurityModule"),
			},
			"azurerm_kubernetes_cluster": {
				Tok: azureDataSource(azureContainerService, "getKubernetesCluster"),
			},
			"azurerm_kubernetes_service_versions": {
				Tok: azureDataSource(azureContainerService, "getKubernetesServiceVersions"),
			},
			"azurerm_kubernetes_cluster_node_pool": {
				Tok: azureDataSource(azureContainerService, "getClusterNodePool"),
			},
			"azurerm_container_registry_scope_map": {Tok: azureDataSource(azureContainerService, "getRegistryScopeMap")},
			"azurerm_container_registry_token":     {Tok: azureDataSource(azureContainerService, "getRegistryToken")},
			"azurerm_notification_hub":             {Tok: azureDataSource(azureNotificationHub, "getHub")},
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
			"azurerm_redis_enterprise_database":    {Tok: azureDataSource(azureRedis, "getEnterpriseDatabase")},
			"azurerm_resource_group":               {Tok: azureDataSource(azureCore, "getResourceGroup")},
			"azurerm_snapshot":                     {Tok: azureDataSource(azureCompute, "getSnapshot")},
			"azurerm_subnet":                       {Tok: azureDataSource(azureNetwork, "getSubnet")},
			"azurerm_route_table":                  {Tok: azureDataSource(azureNetwork, "getRouteTable")},
			"azurerm_route_filter":                 {Tok: azureDataSource(azureNetwork, "getRouteFilter")},
			"azurerm_network_ddos_protection_plan": {Tok: azureDataSource(azureNetwork, "getNetworkDdosProtectionPlan")},
			"azurerm_network_service_tags":         {Tok: azureDataSource(azureNetwork, "getServiceTags")},
			"azurerm_express_route_circuit": {
				Tok: azureDataSource(azureNetwork, "getExpressRouteCircuit"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_sql_server":                         {Tok: azureDataSource(azureSQL, "getServer")},
			"azurerm_sql_database":                       {Tok: azureDataSource(azureSQL, "getDatabase")},
			"azurerm_virtual_network_gateway_connection": {Tok: azureDataSource(azureNetwork, "getGatewayConnection")},
			"azurerm_firewall":                           {Tok: azureDataSource(azureNetwork, "getFirewall")},
			"azurerm_subscription":                       {Tok: azureDataSource(azureCore, "getSubscription")},
			"azurerm_template_spec_version":              {Tok: azureDataSource(azureCore, "getTemplateSpecVersion")},
			"azurerm_policy_definition":                  {Tok: azureDataSource(azurePolicy, "getPolicyDefintion")},
			"azurerm_policy_set_definition":              {Tok: azureDataSource(azurePolicy, "getPolicySetDefinition")},
			"azurerm_platform_image":                     {Tok: azureDataSource(azureCompute, "getPlatformImage")},
			"azurerm_managed_disk":                       {Tok: azureDataSource(azureCompute, "getManagedDisk")},
			"azurerm_shared_image_versions":              {Tok: azureDataSource(azureCompute, "getSharedImageVersions")},
			"azurerm_backup_policy_vm":                   {Tok: azureDataSource(azureBackup, "getPolicyVM")},
			"azurerm_storage_account":                    {Tok: azureDataSource(azureStorage, "getAccount")},
			"azurerm_storage_account_sas":                {Tok: azureDataSource(azureStorage, "getAccountSAS")},
			"azurerm_storage_account_blob_container_sas": {
				Tok: azureDataSource(azureStorage, "getAccountBlobContainerSAS"),
			},

			"azurerm_storage_management_policy": {Tok: azureDataSource(azureStorage, "getPolicy")},
			"azurerm_storage_encryption_scope":  {Tok: azureDataSource(azureStorage, "getEncryptionScope")},
			"azurerm_virtual_machine":           {Tok: azureDataSource(azureCompute, "getVirtualMachine")},
			"azurerm_hdinsight_cluster":         {Tok: azureDataSource(azureHdInsight, "getCluster")},
			"azurerm_stream_analytics_job":      {Tok: azureDataSource(azureStreamAnalytics, "getJob")},
			"azurerm_proximity_placement_group": {Tok: azureDataSource(azureProximity, "getPlacementGroup")},
			"azurerm_servicebus_namespace_authorization_rule": {
				Tok: azureDataSource(azureServiceBus, "getNamespaceAuthorizationRule"),
			},
			"azurerm_app_service_certificate":       {Tok: azureDataSource(azureAppService, "getCertificate")},
			"azurerm_app_service_certificate_order": {Tok: azureDataSource(azureAppService, "getCertificateOrder")},
			"azurerm_data_factory":                  {Tok: azureDataSource(azureDataFactory, "getFactory")},
			"azurerm_healthcare_service":            {Tok: azureDataSource(azureHealthcare, "getService")},
			"azurerm_postgresql_server":             {Tok: azureDataSource(azurePostgresql, "getServer")},
			"azurerm_postgresql_flexible_server":    {Tok: azureDataSource(azurePostgresql, "getFlexibleServer")},
			"azurerm_resources":                     {Tok: azureDataSource(azureCore, "getResources")},
			"azurerm_netapp_account":                {Tok: azureDataSource(azureNetapp, "getAccount")},
			"azurerm_netapp_pool":                   {Tok: azureDataSource(azureNetapp, "getPool")},
			"azurerm_netapp_volume":                 {Tok: azureDataSource(azureNetapp, "getVolume")},
			"azurerm_netapp_snapshot":               {Tok: azureDataSource(azureNetapp, "getSnapshot")},
			"azurerm_private_link_service":          {Tok: azureDataSource(azurePrivateLink, "getService")},
			"azurerm_private_endpoint_connection":   {Tok: azureDataSource(azurePrivateLink, "getEndpointConnection")},
			"azurerm_private_link_service_endpoint_connections": {
				Tok: azureDataSource(azurePrivateLink, "getServiceEndpointConnections"),
			},
			"azurerm_nat_gateway":                 {Tok: azureDataSource(azureNetwork, "getNatGateway")},
			"azurerm_virtual_hub":                 {Tok: azureDataSource(azureNetwork, "getVirtualHub")},
			"azurerm_virtual_wan":                 {Tok: azureDataSource(azureNetwork, "getVirtualWan")},
			"azurerm_firewall_policy":             {Tok: azureDataSource(azureNetwork, "getFirewallPolicy")},
			"azurerm_ip_group":                    {Tok: azureDataSource(azureNetwork, "getIpGroup")},
			"azurerm_traffic_manager_profile":     {Tok: azureDataSource(azureNetwork, "getTrafficManagerProfile")},
			"azurerm_application_gateway":         {Tok: azureDataSource(azureNetwork, "getApplicationGateway")},
			"azurerm_signalr_service":             {Tok: azureDataSource(azureSignalr, "getService")},
			"azurerm_storage_container":           {Tok: azureDataSource(azureStorage, "getStorageContainer")},
			"azurerm_storage_sync":                {Tok: azureDataSource(azureStorage, "getSync")},
			"azurerm_storage_sync_group":          {Tok: azureDataSource(azureStorage, "getSyncGroup")},
			"azurerm_storage_blob":                {Tok: azureDataSource(azureStorage, "getBlob")},
			"azurerm_storage_table_entity":        {Tok: azureDataSource(azureStorage, "getTableEntity")},
			"azurerm_iothub_shared_access_policy": {Tok: azureDataSource(azureIot, "getSharedAccessPolicy")},
			"azurerm_iothub_dps":                  {Tok: azureDataSource(azureIot, "getDps")},
			"azurerm_eventgrid_topic":             {Tok: azureDataSource(azureEventGrid, "getTopic")},
			"azurerm_eventgrid_domain_topic":      {Tok: azureDataSource(azureEventGrid, "getDomainTopic")},
			"azurerm_disk_encryption_set":         {Tok: azureDataSource(azureCompute, "getDiskEncryptionSet")},
			"azurerm_dedicated_host_group":        {Tok: azureDataSource(azureCompute, "getDedicatedHostGroup")},
			"azurerm_dedicated_host":              {Tok: azureDataSource(azureCompute, "getDedicatedHost")},
			"azurerm_virtual_machine_scale_set":   {Tok: azureDataSource(azureCompute, "getVirtualMachineScaleSet")},
			"azurerm_ssh_public_key":              {Tok: azureDataSource(azureCompute, "getSshPublicKey")},
			"azurerm_disk_access":                 {Tok: azureDataSource(azureCompute, "getDiskAccess")},
			"azurerm_mariadb_server":              {Tok: azureDataSource(azureMariaDB, "getMariaDbServer")},
			"azurerm_eventhub_namespace_authorization_rule": {
				Tok: azureDataSource(azureEventHub, "getNamespaceAuthorizationRule"),
			},
			"azurerm_eventhub":                    {Tok: azureDataSource(azureEventHub, "getEventHub")},
			"azurerm_eventhub_authorization_rule": {Tok: azureDataSource(azureEventHub, "getAuthorizationRule")},
			"azurerm_eventhub_consumer_group":     {Tok: azureDataSource(azureEventHub, "getConsumeGroup")},
			"azurerm_function_app":                {Tok: azureDataSource(azureAppService, "getFunctionApp")},
			"azurerm_function_app_host_keys":      {Tok: azureDataSource(azureAppService, "getFunctionAppHostKeys")},
			"azurerm_app_service_environment": {
				Tok: azureDataSource(azureAppService, "getAppServiceEnvironment"),
			},
			"azurerm_app_service_environment_v3":      {Tok: azureDataSource(azureAppService, "getEnvironmentV3")},
			"azurerm_iothub_dps_shared_access_policy": {Tok: azureDataSource(azureIot, "getDpsSharedAccessPolicy")},
			"azurerm_iothub":                          {Tok: azureDataSource(azureIot, "getIotHub")},
			"azurerm_recovery_services_vault":         {Tok: azureDataSource(azureRecoveryServices, "getVault")},
			"azurerm_database_migration_project":      {Tok: azureDataSource(azureDatabaseMigration, "getProject")},
			"azurerm_database_migration_service":      {Tok: azureDataSource(azureDatabaseMigration, "getService")},
			"azurerm_kusto_cluster":                   {Tok: azureDataSource(azureKusto, "getCluster")},
			"azurerm_servicebus_topic_authorization_rule": {
				Tok: azureDataSource(azureServiceBus, "getTopicAuthorizationRule"),
			},
			"azurerm_servicebus_queue_authorization_rule": {
				Tok: azureDataSource(azureServiceBus, "getQueueAuthorizationRule"),
			},
			"azurerm_servicebus_queue": {Tok: azureDataSource(azureServiceBus, "getQueue")},
			"azurerm_servicebus_topic": {Tok: azureDataSource(azureServiceBus, "getTopic")},
			"azurerm_servicebus_namespace_disaster_recovery_config": {
				Tok: azureDataSource(azureServiceBus, "getNamespaceDisasterRecoveryConfig"),
			},
			"azurerm_app_configuration": {
				Tok: azureDataSource(azureAppConfiguration, "getConfigurationStore"),
			},
			"azurerm_servicebus_subscription":          {Tok: azureDataSource(azureServiceBus, "getSubscription")},
			"azurerm_machine_learning_workspace":       {Tok: azureDataSource(azureMachineLearning, "getWorkspace")},
			"azurerm_managed_application_definition":   {Tok: azureDataSource(azureManagedApplication, "getDefinition")},
			"azurerm_spring_cloud_service":             {Tok: azureDataSource(azureAppPlatform, "getSpringCloudService")},
			"azurerm_spring_cloud_app":                 {Tok: azureDataSource(azureAppPlatform, "getSpringCloudApp")},
			"azurerm_private_dns_zone":                 {Tok: azureDataSource(azurePrivateDNS, "getDnsZone")},
			"azurerm_sentinel_alert_rule":              {Tok: azureDataSource(azureSentinel, "getAlertRule")},
			"azurerm_sentinel_alert_rule_template":     {Tok: azureDataSource(azureSentinel, "getAlertRuleTemplate")},
			"azurerm_maintenance_configuration":        {Tok: azureDataSource(azureMaintenance, "getConfiguration")},
			"azurerm_advisor_recommendations":          {Tok: azureDataSource(advisor, "getRecommendations")},
			"azurerm_blueprint_definition":             {Tok: azureDataSource(azureBlueprint, "getDefinition")},
			"azurerm_blueprint_published_version":      {Tok: azureDataSource(azureBlueprint, "getPublishedVersion")},
			"azurerm_web_application_firewall_policy":  {Tok: azureDataSource(azureWaf, "getFirewallPolicy")},
			"azurerm_synapse_workspace":                {Tok: azureDataSource(azureSynapse, "getWorkspace")},
			"azurerm_attestation_provider":             {Tok: azureDataSource(azureAttestation, "getProvider")},
			"azurerm_databricks_workspace":             {Tok: azureDataSource(azureDataBricks, "getWorkspace")},
			"azurerm_mysql_server":                     {Tok: azureDataSource(azureMySQL, "getServer")},
			"azurerm_cognitive_account":                {Tok: azureDataSource(azureCognitive, "getAccount")},
			"azurerm_digital_twins_instance":           {Tok: azureDataSource(azureDigitalTwins, "getInstance")},
			"azurerm_search_service":                   {Tok: azureDataSource(azureSearch, "getService")},
			"azurerm_vmware_private_cloud":             {Tok: azureDataSource(azureAvs, "getPrivateCloud")},
			"azurerm_billing_enrollment_account_scope": {Tok: azureDataSource(azureBilling, "getEnrollmentAccountScope")},
			"azurerm_billing_mca_account_scope":        {Tok: azureDataSource(azureBilling, "getMcaAccountScope")},
			"azurerm_eventhub_cluster":                 {Tok: azureDataSource(azureEventHub, "getCluster")},
			"azurerm_spatial_anchors_account":          {Tok: azureDataSource(azureMixedReality, "getSpatialAnchorsAccount")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node":       "^10.0.0", // so we can access strongly typed node definitions.
				"@types/node-fetch": "^2.5.8",
			},
			Dependencies: map[string]string{
				"@pulumi/pulumi":                "^3.0.0",
				"azure-eventgrid":               "^1.6.0",
				"@azure/functions":              "=1.2.2",
				"@azure/ms-rest-azure-js":       "^2.0.1",
				"@azure/ms-rest-nodeauth":       "^3.0.0",
				"azure-functions-ts-essentials": "^1.3.2",
				"moment":                        "2.24.0",
			},
			Overlay: &tfbridge.OverlayInfo{
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
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", azurePkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				azurePkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "3.*",
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

	// rename mediaServices to media
	prov.RenameResourceWithAlias("azurerm_media_services_account",
		azureResource(azureMediaServices, "Account"),
		azureResource(azureMedia, "ServiceAccount"), azureMediaServices, azureMedia, nil)

	// fixing an eventgrid resource that was labelled as a datasource
	prov.RenameResourceWithAlias("azurerm_eventgrid_system_topic",
		azureResource(azureEventGrid, "getSystemTopic"),
		azureResource(azureEventGrid, "SystemTopic"), azureEventGrid, azureEventGrid, nil)

	// Deprecated, remove in 3.0.
	prov.P.ResourcesMap().Set("azurerm_storage_zipblob", prov.P.ResourcesMap().Get("azurerm_storage_blob"))
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

	prov.SetAutonaming(24, "")

	// Provide default values for certain resource properties, to improve usability:
	//     For all resources with `location` properties, default to the resource group's location to which the
	//        resource belongs. This ensures that each resource doesn't need to be given a location explicitly.
	rgRegionMap := make(map[string]string)
	for resname, res := range prov.Resources {
		if schema := prov.P.ResourcesMap().Get(resname); schema != nil {
			if tfs, has := schema.Schema().GetOk(azureLocation); has && (tfs.Optional() || tfs.Required()) {
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
											rgRes := p.ResourcesMap().Get("azurerm_resource_group")
											contract.Assert(rgRes != nil)
											importer := rgRes.Importer()
											contract.Assert(importer != nil)
											states, err := importer("azurerm_resource_group",
												fmt.Sprintf("/subscriptions/_/resourceGroups/%s",
													rg.StringValue()), p.Meta())
											if err != nil {
												return nil, err
											}
											switch stateLen := len(states); stateLen {
											case 0:
												rgRegion = tfbridge.TerraformUnknownVariableValue
											case 1:
												state, err := p.Refresh("azurerm_resource_group", states[0])
												switch {
												case err != nil:
													return nil, err
												case state == nil:
													rgRegion = tfbridge.TerraformUnknownVariableValue
												default:
													obj, err := state.Object(rgRes.Schema())
													if err != nil {
														return nil, err
													}
													rgRegion = azure.NormalizeLocation(obj["location"])
												}
											default:
												return nil, fmt.Errorf("expected 0 or 1 states for resource group %s",
													rg.StringValue())
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
