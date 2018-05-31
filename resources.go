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
	"strings"
	"unicode"

	"github.com/hashicorp/terraform/helper/schema"
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/resource"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-azurerm/azurerm"
)

// all of the Azure token components used below.
const (
	// packages:
	azurePkg = "azure"
	// modules; in general, we took naming inspiration from the Azure SDK for Go:
	// https://godoc.org/github.com/Azure/azure-sdk-for-go
	azureAppInsights         = "appinsights"         // AppInsights
	azureAppService          = "appservice"          // App Service
	azureAutomation          = "automation"          // Automatio
	azureCDN                 = "cdn"                 // CDN
	azureCompute             = "compute"             // Virtual Machinesn
	azureContainerService    = "containerservice"    // Azure Container Service
	azureCore                = "core"                // Base Resources
	azureCosmosDB            = "cosmosdb"            // Cosmos DB
	azureDatalake            = "datalake"            // Data Lake
	azureDNS                 = "dns"                 // DNS
	azureMessaging           = "eventhub"            // Event Hub
	azureFunctions           = "functions"           // Functions
	azureKeyVault            = "keyvault"            // Key Vault
	azureLB                  = "lb"                  // Load Balancer
	azureIot                 = "iot"                 // IoT resource
	azureMgmtResource        = "managementresource"  // Management Resource
	azureMonitoring          = "monitoring"          // Metrics/monitoring resources
	azureMySQL               = "mysql"               // MySql
	azureNetwork             = "network"             // Networking
	azureNetworkWatcher      = "networkwatcher"      // Network Watcher
	azureOperationalInsights = "operationalinsights" // Operational Insights
	azurePostgresql          = "postgresql"          // Postgress SQL
	azurePolicy              = "policy"              // Policy
	azureRecoveryServices    = "recoveryservices"    // Recovery Services
	azureRedis               = "redis"               // RedisCache
	azureRelay               = "relay"               // Relay
	azureScheduler           = "scheduler"           // Scheduler
	azureRole                = "role"                // Azure Role
	azureSearch              = "search"              // Search
	azureSQL                 = "sql"                 // SQL
	azureStorage             = "storage"             // Storage
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

// azureDataSource manufactures a standard resource token given a module and resource name.  It automatically uses the Azure
// package and names the file by simply lower casing the data source's first character.
func azureDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return azureMember(mod+"/"+fn, res)
}

// azureResource manufactures a standard resource token given a module and resource name.  It automatically uses the Azure
// package and names the file by simply lower casing the resource's first character.
func azureResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return azureType(mod+"/"+fn, res)
}

// boolRef returns a reference to the bool argument.
func boolRef(b bool) *bool {
	return &b
}

// Provider returns additional overlaid schema and metadata associated with the azure package.
func Provider() tfbridge.ProviderInfo {
	p := azurerm.Provider().(*schema.Provider)
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "azurerm",
		Description: "A Pulumi package for creating and managing Microsoft Azure cloud resources.",
		Keywords:    []string{"pulumi", "azure"},
		Homepage:    "https://pulumi.io/azure",
		Repository:  "https://github.com/pulumi/pulumi-azure",
		Resources: map[string]*tfbridge.ResourceInfo{
			// AppInsights
			"azurerm_application_insights": {Tok: azureResource(azureAppInsights, "Insights")},

			// App Service
			"azurerm_app_service":                         {Tok: azureResource(azureAppService, "AppService")},
			"azurerm_app_service_custom_hostname_binding": {Tok: azureResource(azureAppService, "CustomHostnameBinding")},
			"azurerm_app_service_plan":                    {Tok: azureResource(azureAppService, "Plan")},
			"azurerm_app_service_slot":                    {Tok: azureResource(azureAppService, "Slot")},
			"azurerm_app_service_active_slot":             {Tok: azureResource(azureAppService, "ActiveSlot")},
			"azurerm_function_app":                        {Tok: azureResource(azureAppService, "FunctionApp")},

			// Automation
			"azurerm_automation_account":    {Tok: azureResource(azureAutomation, "Account")},
			"azurerm_automation_credential": {Tok: azureResource(azureAutomation, "Credential")},
			"azurerm_automation_runbook":    {Tok: azureResource(azureAutomation, "RunBook")},
			"azurerm_automation_schedule":   {Tok: azureResource(azureAutomation, "Schedule")},

			// Authorization
			"azurerm_role_assignment": {Tok: azureResource(azureRole, "assignment")},
			"azurerm_role_definition": {Tok: azureResource(azureRole, "Definition")},

			// Azure Container Service
			"azurerm_container_registry": {Tok: azureResource(azureContainerService, "Registry")},
			"azurerm_container_service":  {Tok: azureResource(azureContainerService, "Service")},
			"azurerm_container_group":    {Tok: azureResource(azureContainerService, "Group")},
			"azurerm_kubernetes_cluster": {Tok: azureResource(azureContainerService, "KubernetesCluster")},

			// Core
			"azurerm_resource_group":      {Tok: azureResource(azureCore, "ResourceGroup")},
			"azurerm_template_deployment": {Tok: azureResource(azureCore, "TemplateDeployment")},

			// CDN
			"azurerm_cdn_endpoint": {Tok: azureResource(azureCDN, "Endpoint")},
			"azurerm_cdn_profile":  {Tok: azureResource(azureCDN, "Profile")},

			// Compute
			"azurerm_availability_set":          {Tok: azureResource(azureCompute, "AvailabilitySet")},
			"azurerm_virtual_machine_extension": {Tok: azureResource(azureCompute, "Extension")},
			"azurerm_virtual_machine":           {Tok: azureResource(azureCompute, "VirtualMachine")},
			"azurerm_virtual_machine_scale_set": {Tok: azureResource(azureCompute, "ScaleSet")},
			"azurerm_managed_disk":              {Tok: azureResource(azureCompute, "ManagedDisk")},
			"azurerm_snapshot":                  {Tok: azureResource(azureCompute, "Snapshot")},
			"azurerm_image":                     {Tok: azureResource(azureCompute, "Image")},

			// Data Lake
			"azurerm_data_lake_store": {Tok: azureResource(azureDatalake, "Store")},

			// DNS
			"azurerm_dns_a_record":     {Tok: azureResource(azureDNS, "ARecord")},
			"azurerm_dns_aaaa_record":  {Tok: azureResource(azureDNS, "AaaaRecord")},
			"azurerm_dns_cname_record": {Tok: azureResource(azureDNS, "CNameRecord")},
			"azurerm_dns_mx_record":    {Tok: azureResource(azureDNS, "MxRecord")},
			"azurerm_dns_ns_record":    {Tok: azureResource(azureDNS, "NsRecord")},
			"azurerm_dns_ptr_record":   {Tok: azureResource(azureDNS, "PtrRecord")},
			"azurerm_dns_srv_record":   {Tok: azureResource(azureDNS, "SrvRecord")},
			"azurerm_dns_txt_record":   {Tok: azureResource(azureDNS, "TxtRecord")},
			"azurerm_dns_zone":         {Tok: azureResource(azureDNS, "Zone")},

			// Messaging
			"azurerm_eventgrid_topic":                     {Tok: azureResource(azureMessaging, "EventGridTopic")},
			"azurerm_eventhub":                            {Tok: azureResource(azureMessaging, "EventHub")},
			"azurerm_eventhub_authorization_rule":         {Tok: azureResource(azureMessaging, "EventHubAuthorizationRule")},
			"azurerm_eventhub_consumer_group":             {Tok: azureResource(azureMessaging, "EventHubConsumerGroup")},
			"azurerm_eventhub_namespace":                  {Tok: azureResource(azureMessaging, "EventHubNamespace")},
			"azurerm_servicebus_namespace":                {Tok: azureResource(azureMessaging, "Namespace")},
			"azurerm_servicebus_queue":                    {Tok: azureResource(azureMessaging, "Queue")},
			"azurerm_servicebus_subscription":             {Tok: azureResource(azureMessaging, "Subscription")},
			"azurerm_servicebus_subscription_rule":        {Tok: azureResource(azureMessaging, "SubscriptionRule")},
			"azurerm_servicebus_topic":                    {Tok: azureResource(azureMessaging, "Topic")},
			"azurerm_servicebus_topic_authorization_rule": {Tok: azureResource(azureMessaging, "TopicAuthorizationRule")},

			// IoT Resources
			"azurerm_iothub": {Tok: azureResource(azureIot, "IoTHub"),
				Docs: &tfbridge.DocInfo{
					Source: "iothub.html.markdown",
				},
			},

			// KeyVault
			"azurerm_key_vault": {
				Tok: azureResource(azureKeyVault, "KeyVault"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_key_vault_certificate": {Tok: azureResource(azureKeyVault, "Certifiate")},
			"azurerm_key_vault_key":         {Tok: azureResource(azureKeyVault, "Key")},
			"azurerm_key_vault_secret":      {Tok: azureResource(azureKeyVault, "Secret")},

			// LoadBalancer
			"azurerm_lb": {
				Tok: azureResource(azureLB, "LoadBalancer"),
				Docs: &tfbridge.DocInfo{
					Source: "loadbalancer.html.markdown",
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

			// Operational Insights
			"azurerm_log_analytics_workspace": {Tok: azureResource(azureOperationalInsights, "AnalyticsWorkspace")},
			"azurerm_log_analytics_solution": {Tok: azureResource(azureOperationalInsights, "AnalyticsSolution"),
				Docs: &tfbridge.DocInfo{
					Source: "log_analytics_solution.html.markdown",
				}},

			// CosmosDB
			"azurerm_cosmosdb_account": {Tok: azureResource(azureCosmosDB, "Account")},

			// Management Resource
			"azurerm_management_lock": {Tok: azureResource(azureMgmtResource, "ManangementLock")},

			// Monitoring resources
			"azurerm_metric_alertrule": {Tok: azureResource(azureMonitoring, "AlertRule")},

			// MySQL
			"azurerm_mysql_configuration": {Tok: azureResource(azureMySQL, "Configuration")},
			"azurerm_mysql_database":      {Tok: azureResource(azureMySQL, "Database")},
			"azurerm_mysql_firewall_rule": {Tok: azureResource(azureMySQL, "FirewallRule")},
			"azurerm_mysql_server":        {Tok: azureResource(azureMySQL, "Server")},

			// Postgress SQL
			"azurerm_postgresql_configuration": {Tok: azureResource(azurePostgresql, "Configuration")},
			"azurerm_postgresql_database":      {Tok: azureResource(azurePostgresql, "Database")},
			"azurerm_postgresql_firewall_rule": {Tok: azureResource(azurePostgresql, "FirewallRule")},
			"azurerm_postgresql_server":        {Tok: azureResource(azurePostgresql, "Server")},

			// Policy
			"azurerm_policy_assignment": {Tok: azureResource(azurePolicy, "Assignment")},
			"azurerm_policy_definition": {Tok: azureResource(azurePolicy, "Definition")},

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
			"azurerm_virtual_network":                    {Tok: azureResource(azureNetwork, "VirtualNetwork")},
			"azurerm_virtual_network_peering":            {Tok: azureResource(azureNetwork, "VirtualNetworkPeering")},
			"azurerm_virtual_network_gateway":            {Tok: azureResource(azureNetwork, "VirtualNetworkGateway")},
			"azurerm_virtual_network_gateway_connection": {Tok: azureResource(azureNetwork, "VirtualNetworkGatewayConnection")},
			"azurerm_local_network_gateway":              {Tok: azureResource(azureNetwork, "LocalNetworkGateway")},
			"azurerm_application_gateway":                {Tok: azureResource(azureNetwork, "ApplicationGateway")},
			"azurerm_application_security_group":         {Tok: azureResource(azureNetwork, "ApplicationSecurityGroup")},
			"azurerm_network_interface":                  {Tok: azureResource(azureNetwork, "NetworkInterface")},
			"azurerm_network_security_group":             {Tok: azureResource(azureNetwork, "NetworkSecurityGroup")},
			"azurerm_network_security_rule":              {Tok: azureResource(azureNetwork, "NetworkSecurityRule")},
			"azurerm_network_watcher":                    {Tok: azureResource(azureNetwork, "NetworkWatcher")},
			"azurerm_packet_capture":                     {Tok: azureResource(azureNetwork, "PacketCapture")},
			"azurerm_public_ip":                          {Tok: azureResource(azureNetwork, "PublicIp")},
			"azurerm_route":                              {Tok: azureResource(azureNetwork, "Route")},
			"azurerm_route_table":                        {Tok: azureResource(azureNetwork, "RouteTable")},
			"azurerm_subnet":                             {Tok: azureResource(azureNetwork, "Subnet")},
			"azurerm_express_route_circuit":              {Tok: azureResource(azureNetwork, "ExpressRouteCircuit")},
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
			"azurerm_traffic_manager_profile":  {Tok: azureResource(azureTrafficManager, "Profile")},

			// Recovery Services
			"azurerm_recovery_services_vault": {Tok: azureResource(azureRecoveryServices, "Vault")},

			// Redis
			"azurerm_redis_cache":         {Tok: azureResource(azureRedis, "Cache")},
			"azurerm_redis_firewall_rule": {Tok: azureResource(azureRedis, "FirewallRule")},

			// Relay
			"azurerm_relay_namespace": {Tok: azureResource(azureRelay, "Namespace")},

			// Scheduler
			"azurerm_scheduler_job_collection": {Tok: azureResource(azureScheduler, "JobCollection")},

			// Search
			"azurerm_search_service": {Tok: azureResource(azureSearch, "Service")},

			// Storage
			"azurerm_storage_account":   {Tok: azureResource(azureStorage, "Account")},
			"azurerm_storage_blob":      {Tok: azureResource(azureStorage, "Blob")},
			"azurerm_storage_container": {Tok: azureResource(azureStorage, "Container")},
			"azurerm_storage_share":     {Tok: azureResource(azureStorage, "Share")},
			"azurerm_storage_queue":     {Tok: azureResource(azureStorage, "Queue")},
			"azurerm_storage_table":     {Tok: azureResource(azureStorage, "Table")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"azurerm_app_service": {
				Tok: azureDataSource(azureAppService, "getAppService"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				}},
			"azurerm_app_service_plan": {
				Tok: azureDataSource(azureAppService, "getAppServicePlan"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_subscriptions":      {Tok: azureDataSource(azureCore, "getSubscriptions")},
			"azurerm_cdn_profile":        {Tok: azureDataSource(azureCDN, "getProfile")},
			"azurerm_client_config":      {Tok: azureDataSource(azureCore, "getClientConfig")},
			"azurerm_cosmosdb_account":   {Tok: azureDataSource(azureCosmosDB, "getAccount")},
			"azurerm_data_lake_store":    {Tok: azureDataSource(azureDatalake, "getStore")},
			"azurerm_eventhub_namespace": {Tok: azureDataSource(azureMessaging, "getEventhubNamespace")},
			"azurerm_image":              {Tok: azureDataSource(azureCompute, "getImage")},
			"azurerm_dns_zone":           {Tok: azureDataSource(azureDNS, "getZone")},
			"azurerm_key_vault": {
				Tok: azureDataSource(azureKeyVault, "getKeyVault"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Ensure "sku" is a singleton
					"sku": {Name: "sku", MaxItemsOne: boolRef(true)},
				},
			},
			"azurerm_key_vault_access_policy":               {Tok: azureDataSource(azureKeyVault, "getAccessPolicy")},
			"azurerm_key_vault_secret":                      {Tok: azureDataSource(azureKeyVault, "getSecret")},
			"azurerm_kubernetes_cluster":                    {Tok: azureDataSource(azureContainerService, "getKubernetesCluster")},
			"azurerm_virtual_network":                       {Tok: azureDataSource(azureNetwork, "getVirtualNetwork")},
			"azurerm_virtual_network_gateway":               {Tok: azureDataSource(azureNetwork, "getVirtualNetworkGateway")},
			"azurerm_network_security_group":                {Tok: azureDataSource(azureNetwork, "getNetworkSecurityGroup")},
			"azurerm_network_interface":                     {Tok: azureDataSource(azureNetwork, "getNetworkInterface")},
			"azurerm_public_ip":                             {Tok: azureDataSource(azureNetwork, "getPublicIP")},
			"azurerm_public_ips":                            {Tok: azureDataSource(azureNetwork, "getPublicIPs")},
			"azurerm_application_security_group":            {Tok: azureDataSource(azureNetwork, "getApplicationSecurityGroup")},
			"azurerm_recovery_services_vault":               {Tok: azureDataSource(azureRecoveryServices, "getVault")},
			"azurerm_resource_group":                        {Tok: azureDataSource(azureCore, "getResourceGroup")},
			"azurerm_snapshot":                              {Tok: azureDataSource(azureCompute, "getSnapshot")},
			"azurerm_subnet":                                {Tok: azureDataSource(azureNetwork, "getSubnet")},
			"azurerm_route_table":                           {Tok: azureDataSource(azureNetwork, "getRouteTable")},
			"azurerm_subscription":                          {Tok: azureDataSource(azureCore, "getSubscription")},
			"azurerm_platform_image":                        {Tok: azureDataSource(azureCompute, "getPlatformImage")},
			"azurerm_managed_disk":                          {Tok: azureDataSource(azureCompute, "getManagedDisk")},
			"azurerm_role_definition":                       {Tok: azureDataSource(azureRole, "getRoleDefinition")},
			"azurerm_builtin_role_definition":               {Tok: azureDataSource(azureRole, "getBuiltinRoleDefinition")},
			"azurerm_scheduler_job_collection":              {Tok: azureDataSource(azureScheduler, "getJobCollection")},
			"azurerm_storage_account":                       {Tok: azureDataSource(azureStorage, "getAccount")},
			"azurerm_storage_account_sas":                   {Tok: azureDataSource(azureStorage, "getAccountSAS")},
			"azurerm_traffic_manager_geographical_location": {Tok: azureDataSource(azureTrafficManager, "getGeographicalLocation")},
		},
		Overlay: &tfbridge.OverlayInfo{
			Files:   []string{},
			Modules: map[string]*tfbridge.OverlayInfo{},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
			},
			PeerDependencies: map[string]string{
				"@pulumi/pulumi": "^0.12.2",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=0.12.2,<0.13.0",
			},
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const azureName = "name"
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			if _, has := schema.Schema[azureName]; has {
				if _, hasfield := res.Fields[azureName]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					// Use conservative options that apply broadly for Azure.  See
					// https://docs.microsoft.com/en-us/azure/architecture/best-practices/naming-conventions for
					// details.
					res.Fields[azureName] = AutoName(azureName, AutoNameOptions{
						ForceLowercase: true,
						Separator:      "",
						Maxlen:         24,
						Randlen:        8,
					})
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

// AutoName creates custom schema for a Terraform name property which is automatically populated from the resource's URN
// name, and tranformed based on the provided options.
func AutoName(name string, options AutoNameOptions) *tfbridge.SchemaInfo {
	return &tfbridge.SchemaInfo{
		Name: name,
		Default: &tfbridge.DefaultInfo{
			From: FromName(options),
		},
	}
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
			return resource.NewUniqueHex(vs+options.Separator, options.Randlen, options.Maxlen)
		}
		if len(vs) > options.Maxlen {
			return "", errors.Errorf("name '%s' is longer than maximum length %d", vs, options.Maxlen)
		}
		return vs, nil
	}
}
