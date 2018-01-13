// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

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
	azurePkg = "azurerm"
	// modules; in general, we took naming inspiration from the Azure SDK for Go:
	// https://godoc.org/github.com/Azure/azure-sdk-for-go
	azureAppInsights         = "appinsights"         // AppInsights
	azureAppServie           = "appservice"          // App Service
	azureAutomation          = "automation"          // Automatio
	azureCDN                 = "cdn"                 // CDN
	azureCompute             = "compute"             // Virtual Machinesn
	azureContainerService    = "containerservice"    // Azure Container Service
	azureCore                = "core"                // Base Resources
	azureCosmosDB            = "cosmosdb"            // Cosmos DB
	azureDNS                 = "dns"                 // DNS
	azureMessaging           = "eventhub"            // Event Hub
	azureFunctions           = "functions"           // Functions
	azureKeyVault            = "keyvault"            // Key Vault
	azureLB                  = "lb"                  // Load Balancer
	azureMySQL               = "mysql"               // MySql
	azureNetwork             = "network"             // Networking
	azureNetworkWatcher      = "networkwatcher"      // Network Watcher
	azureOperationalInsights = "operationalinsights" // Operational Insights
	azurePostgresql          = "postgresql"          // Postgress SQL
	azureRedis               = "redis"               // RedisCache
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

// Provider returns additional overlaid schema and metadata associated with the azure package.
func Provider() tfbridge.ProviderInfo {
	p := azurerm.Provider().(*schema.Provider)
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "azurerm",
		Resources: map[string]*tfbridge.ResourceInfo{
			// AppInsights
			"azurerm_application_insights": {Tok: azureResource(azureAppInsights, "Insights")},

			// App Service
			"azurerm_app_service":      {Tok: azureResource(azureAppServie, "AppService")},
			"azurerm_app_service_plan": {Tok: azureResource(azureAppServie, "Plan")},

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
			"azurerm_eventgrid_topic":             {Tok: azureResource(azureMessaging, "EventGridTopic")},
			"azurerm_eventhub":                    {Tok: azureResource(azureMessaging, "EventHub")},
			"azurerm_eventhub_authorization_rule": {Tok: azureResource(azureMessaging, "EventHubAuthorizationRule")},
			"azurerm_eventhub_consumer_group":     {Tok: azureResource(azureMessaging, "EventHubConsumerGroup")},
			"azurerm_eventhub_namespace":          {Tok: azureResource(azureMessaging, "EventHubNamespace")},
			"azurerm_servicebus_namespace":        {Tok: azureResource(azureMessaging, "Namespace")},
			"azurerm_servicebus_queue":            {Tok: azureResource(azureMessaging, "Queue")},
			"azurerm_servicebus_subscription":     {Tok: azureResource(azureMessaging, "Subscription")},
			"azurerm_servicebus_topic":            {Tok: azureResource(azureMessaging, "Topic")},

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

			// Operational Insights
			"azurerm_log_analytics_workspace": {Tok: azureResource(azureOperationalInsights, "AnalyticsWorkspace")},

			// CosmosDB
			"azurerm_cosmosdb_account": {Tok: azureResource(azureCosmosDB, "Account")},

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

			// SQL
			"azurerm_sql_elasticpool":   {Tok: azureResource(azureSQL, "ElasticPool")},
			"azurerm_sql_database":      {Tok: azureResource(azureSQL, "Database")},
			"azurerm_sql_firewall_rule": {Tok: azureResource(azureSQL, "FirewallRule")},
			"azurerm_sql_server":        {Tok: azureResource(azureSQL, "SqlServer")},

			// Network
			"azurerm_virtual_network":         {Tok: azureResource(azureNetwork, "VirtualNetwork")},
			"azurerm_virtual_network_peering": {Tok: azureResource(azureNetwork, "VirtualNetworkPeering")},
			"azurerm_local_network_gateway":   {Tok: azureResource(azureNetwork, "LocalNetworkGateway")},
			"azurerm_application_gateway":     {Tok: azureResource(azureNetwork, "ApplicationGateway")},
			"azurerm_network_interface":       {Tok: azureResource(azureNetwork, "NetworkInterface")},
			"azurerm_network_security_group":  {Tok: azureResource(azureNetwork, "NetworkSecurityGroup")},
			"azurerm_network_security_rule":   {Tok: azureResource(azureNetwork, "NetworkSecurityRule")},
			"azurerm_public_ip":               {Tok: azureResource(azureNetwork, "PublicIp")},
			"azurerm_route":                   {Tok: azureResource(azureNetwork, "Route")},
			"azurerm_route_table":             {Tok: azureResource(azureNetwork, "RouteTable")},
			"azurerm_subnet":                  {Tok: azureResource(azureNetwork, "Subnet")},
			"azurerm_express_route_circuit":   {Tok: azureResource(azureNetwork, "ExpressRouteCircuit")},

			// Traffic Manager
			"azurerm_traffic_manager_endpoint": {Tok: azureResource(azureTrafficManager, "Endpoint")},
			"azurerm_traffic_manager_profile":  {Tok: azureResource(azureTrafficManager, "Profile")},

			// Redis
			"azurerm_redis_cache":         {Tok: azureResource(azureRedis, "Cache")},
			"azurerm_redis_firewall_rule": {Tok: azureResource(azureRedis, "FirewallRule")},

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
			"azurerm_client_config":           {Tok: azureDataSource(azureCore, "getClientConfig")},
			"azurerm_image":                   {Tok: azureDataSource(azureCompute, "getImage")},
			"azurerm_key_vault_access_policy": {Tok: azureDataSource(azureKeyVault, "getAccessPolicy")},
			"azurerm_public_ip":               {Tok: azureDataSource(azureNetwork, "getPublicIP")},
			"azurerm_resource_group":          {Tok: azureDataSource(azureCore, "getResourceGroup")},
			"azurerm_snapshot":                {Tok: azureDataSource(azureCompute, "getSnapshot")},
			"azurerm_subnet":                  {Tok: azureDataSource(azureNetwork, "getSubnet")},
			"azurerm_subscription":            {Tok: azureDataSource(azureCore, "getSubscription")},
			"azurerm_platform_image":          {Tok: azureDataSource(azureCompute, "getPlatformImage")},
			"azurerm_managed_disk":            {Tok: azureDataSource(azureCompute, "getManagedDisk")},
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
