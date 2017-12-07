// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package azure

import (
	"unicode"

	"github.com/hashicorp/terraform/helper/schema"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-azurerm/azurerm"
)

// all of the Azure token components used below.
const (
	// packages:
	azurePkg = "azurerm"
	// modules; in general, we took naming inspiration from the Azure SDK for Go:
	// https://godoc.org/github.com/Azure/azure-sdk-for-go
	azureMod                 = "index"
	azureAppInsightsMod      = "appinsights"      // AppInsights
	azureApplicationGateway  = "application"      // Application gateway
	azureAppServieMod        = "appservice"       // App Service
	azureAutomationMod       = "automation"       // Automation
	azureContainerServiceMod = "containerservice" // Azure Container Service
	azureCDN                 = "cdn"              // CDN
	azureCosmosDB            = "cosmosdb"         // Cosmos DB
	azureDNS                 = "dns"              // DNS
	azureEventGrid           = "eventgrid"        // Event Grid
	azureEventHub            = "eventhub"         // Event Hub
	azureExpressRoute        = "expressroute"     // Express Route
	azureImage               = "image"            // Image
	azureKeyVault            = "keyvault"         // Key Vault
	azureLB                  = "lb"               // Load Balancer
	azureLog                 = "log"              // Log analytics
	azureDisk                = "disk"             // Managed Disks
	azureMySQL               = "mysql"            // MySql
	azureNetwork             = "network"          // Networking
	azurePostgresql          = "postgresql"       // Postgress SQL
	azureRedis               = "redis"            // RedisCache
	azureResources           = "resources"        // Azure Resource Manager
	azureRole                = "role"             // Azure Role
	azureSearch              = "search"           // Search
	azureServiceBus          = "servicebus"       // ServiceBus
	azureSnapshot            = "snapshot"         // Snapshot
	azureSQL                 = "sql"              // SQL
	azureStorage             = "storage"          // Storage
	azureTrafficManager      = "trafficmanager"   // Traffic Manager
	azureVirtualMachine      = "virtualmachine"   // Virtual Machines
)

// awsMember manufactures a type token for the AWS package and the given module and type.
func azureMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(azurePkg + ":" + mod + ":" + mem)
}

// awsType manufactures a type token for the AWS package and the given module and type.
func azureType(mod string, typ string) tokens.Type {
	return tokens.Type(azureMember(mod, typ))
}

// awsDataSource manufactures a standard resource token given a module and resource name.  It automatically uses the AWS
// package and names the file by simply lower casing the data source's first character.
func azureDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return azureMember(mod+"/"+fn, res)
}

// awsResource manufactures a standard resource token given a module and resource name.  It automatically uses the AWS
// package and names the file by simply lower casing the resource's first character.
func azureResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return azureType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the azure package.
func Provider() tfbridge.ProviderInfo {
	p := azurerm.Provider().(*schema.Provider)
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "azurerm",
		Resources: map[string]*tfbridge.ResourceInfo{
			// AppInsights
			"azurerm_application_insights": {Tok: azureResource(azureAppInsightsMod, "Insights")},
			// App Service
			"azurerm_app_service":         {Tok: azureResource(azureAppServieMod, "AppService")},
			"azurerm_app_service_plan":    {Tok: azureResource(azureAppServieMod, "Plan")},
			"azurerm_application_gateway": {Tok: azureResource(azureApplicationGateway, "Application")},
			// Automation Sercices
			"azurerm_automation_account":    {Tok: azureResource(azureAutomationMod, "Account")},
			"azurerm_automation_credential": {Tok: azureResource(azureAutomationMod, "Credential")},
			"azurerm_automation_runbook":    {Tok: azureResource(azureAutomationMod, "RunBook")},
			"azurerm_automation_schedule":   {Tok: azureResource(azureAutomationMod, "Schedule")},
			// Azure Container Service
			"azurerm_container_registry": {Tok: azureResource(azureContainerServiceMod, "Registry")},
			"azurerm_container_service":  {Tok: azureResource(azureContainerServiceMod, "Service")},
			"azurerm_container_group":    {Tok: azureResource(azureContainerServiceMod, "Group")},
			// CDN
			"azurerm_cdn_endpoint": {Tok: azureResource(azureCDN, "Endpoint")},
			"azurerm_cdn_profile":  {Tok: azureResource(azureCDN, "Profile")},
			// CosmosDB
			"azurerm_cosmosdb_account": {Tok: azureResource(azureCosmosDB, "Account")},
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
			// EventGrid
			"azurerm_eventgrid_topic": {Tok: azureResource(azureEventGrid, "Topic")},
			// EventHub
			"azurerm_eventhub":                    {Tok: azureResource(azureEventHub, "EventHub")},
			"azurerm_eventhub_authorization_rule": {Tok: azureResource(azureEventHub, "AuthorizationRule")},
			"azurerm_eventhub_consumer_group":     {Tok: azureResource(azureEventHub, "ConsumerGroup")},
			"azurerm_eventhub_namespace":          {Tok: azureResource(azureEventHub, "Namespace")},
			// ExpressRoute
			"azurerm_express_route_circuit": {Tok: azureResource(azureExpressRoute, "Circuit")},
			// Image service
			"azurerm_image": {Tok: azureResource(azureImage, "Image")},
			// KeyVault
			"azurerm_key_vault":             {Tok: azureResource(azureKeyVault, "KeyVault")},
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
			// Log Analytics
			"azurerm_log_analytics_workspace": {Tok: azureResource(azureLog, "AnalyticsWorkspace")},
			// Managed Disks
			"azurerm_managed_disk": {Tok: azureResource(azureDisk, "ManagedDisk")},
			// Network
			"azurerm_local_network_gateway": {Tok: azureResource(azureNetwork, "LocalNetworkGateway")},
			// MySQL
			"azurerm_mysql_configuration":    {Tok: azureResource(azureMySQL, "Configuration")},
			"azurerm_mysql_database":         {Tok: azureResource(azureMySQL, "Database")},
			"azurerm_mysql_firewall_rule":    {Tok: azureResource(azureMySQL, "FirewallRule")},
			"azurerm_mysql_server":           {Tok: azureResource(azureMySQL, "Server")},
			"azurerm_network_interface":      {Tok: azureResource(azureNetwork, "NetworkInterface")},
			"azurerm_network_security_group": {Tok: azureResource(azureNetwork, "NetworkSecurityGroup")},
			"azurerm_network_security_rule":  {Tok: azureResource(azureNetwork, "NetworkSecurityRule")},
			// Postgress SQL
			"azurerm_postgresql_configuration": {Tok: azureResource(azurePostgresql, "Configuration")},
			"azurerm_postgresql_database":      {Tok: azureResource(azurePostgresql, "Database")},
			"azurerm_postgresql_firewall_rule": {Tok: azureResource(azurePostgresql, "FirewallRule")},
			"azurerm_postgresql_server":        {Tok: azureResource(azurePostgresql, "Server")},
			"azurerm_public_ip":                {Tok: azureResource(azureNetwork, "PublicIp")},
			"azurerm_route":                    {Tok: azureResource(azureNetwork, "Route")},
			"azurerm_route_table":              {Tok: azureResource(azureNetwork, "RouteTable")},
			"azurerm_subnet":                   {Tok: azureResource(azureNetwork, "Subnet")},
			// Redis
			"azurerm_redis_cache":         {Tok: azureResource(azureRedis, "Cache")},
			"azurerm_redis_firewall_rule": {Tok: azureResource(azureRedis, "FirewallRule")},
			// ResourceManager
			"azurerm_resource_group": {Tok: azureResource(azureResources, "ResourceGroup")},
			// Role
			"azurerm_role_assignment": {Tok: azureResource(azureRole, "assignment")},
			"azurerm_role_definition": {Tok: azureResource(azureRole, "Definition")},
			// Template deployment
			"azurerm_template_deployment": {Tok: azureResource(azureResources, "TemplateDeployment")},
			// Search
			"azurerm_search_service": {Tok: azureResource(azureSearch, "Service")},
			// ServiceBus
			"azurerm_servicebus_namespace":    {Tok: azureResource(azureServiceBus, "Namespace")},
			"azurerm_servicebus_queue":        {Tok: azureResource(azureServiceBus, "Queue")},
			"azurerm_servicebus_subscription": {Tok: azureResource(azureServiceBus, "Subscription")},
			"azurerm_servicebus_topic":        {Tok: azureResource(azureServiceBus, "Topic")},
			// Snapshot
			"azurerm_snapshot": {Tok: azureResource(azureSnapshot, "Snapshot")},
			// SQL
			"azurerm_sql_elasticpool":   {Tok: azureResource(azureSQL, "ElasticPool")},
			"azurerm_sql_database":      {Tok: azureResource(azureSQL, "Database")},
			"azurerm_sql_firewall_rule": {Tok: azureResource(azureSQL, "FirewallRule")},
			"azurerm_sql_server":        {Tok: azureResource(azureSQL, "SqlServer")},
			// Storage
			"azurerm_storage_account":   {Tok: azureResource(azureStorage, "Account")},
			"azurerm_storage_blob":      {Tok: azureResource(azureStorage, "Blob")},
			"azurerm_storage_container": {Tok: azureResource(azureStorage, "Container")},
			"azurerm_storage_share":     {Tok: azureResource(azureStorage, "Share")},
			"azurerm_storage_queue":     {Tok: azureResource(azureStorage, "Queue")},
			"azurerm_storage_table":     {Tok: azureResource(azureStorage, "Table")},
			// Traffic Manager
			"azurerm_traffic_manager_endpoint": {Tok: azureResource(azureTrafficManager, "Endpoint")},
			"azurerm_traffic_manager_profile":  {Tok: azureResource(azureTrafficManager, "Profile")},
			// Virtual Machines
			"azurerm_availability_set":          {Tok: azureResource(azureVirtualMachine, "AvailabilitySet")},
			"azurerm_virtual_machine_extension": {Tok: azureResource(azureVirtualMachine, "Extension")},
			"azurerm_virtual_machine":           {Tok: azureResource(azureVirtualMachine, "VirtualMachine")},
			"azurerm_virtual_machine_scale_set": {Tok: azureResource(azureVirtualMachine, "ScaleSet")},
			"azurerm_virtual_network":           {Tok: azureResource(azureVirtualMachine, "Network")},
			"azurerm_virtual_network_peering":   {Tok: azureResource(azureVirtualMachine, "NetworkPeering")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"azurerm_client_config":           {Tok: azureDataSource(azureMod, "getClientConfig")},
			"azurerm_image":                   {Tok: azureDataSource(azureMod, "getImage")},
			"azurerm_key_vault_access_policy": {Tok: azureDataSource(azureKeyVault, "getAccessPolicy")},
			"azurerm_public_ip":               {Tok: azureDataSource(azureNetwork, "getPublicIP")},
			"azurerm_resource_group":          {Tok: azureDataSource(azureMod, "getResourceGroup")},
			"azurerm_snapshot":                {Tok: azureDataSource(azureSnapshot, "getSnapshot")},
			"azurerm_subnet":                  {Tok: azureDataSource(azureNetwork, "getSubnet")},
			"azurerm_subscription":            {Tok: azureDataSource(azureMod, "getSubscription")},
			"azurerm_platform_image":          {Tok: azureDataSource(azureMod, "getPlatformImage")},
			"azurerm_managed_disk":            {Tok: azureDataSource(azureDisk, "getManagedDisk")},
			"azurerm_role_definition":         {Tok: azureDataSource(azureRole, "getRoleDefinition")},
			"azurerm_builtin_role_definition": {Tok: azureDataSource(azureRole, "getBuiltinRoleDefinition")},
		},
		Overlay: &tfbridge.OverlayInfo{
			Files:        []string{},
			Modules:      map[string]*tfbridge.OverlayInfo{},
			Dependencies: map[string]string{},
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
					res.Fields[azureName] = tfbridge.AutoName(azureName, 255)
				}
			}
		}
	}

	return prov
}
