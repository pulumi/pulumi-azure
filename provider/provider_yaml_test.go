// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package provider

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/providertest/optproviderupgrade"
)

func Test_appinsights(t *testing.T) {
	test(t, filepath.Join("test-programs", "appinsights"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "appinsights", "v7")))
}

func Test_appservice(t *testing.T) {
	test(t, filepath.Join("test-programs", "appservice"))
}

func Test_dns(t *testing.T) {
	test(t, filepath.Join("test-programs", "dns"))
}

func Test_keyvault(t *testing.T) {
	test(t, filepath.Join("test-programs", "keyvault"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "keyvault", "v7")))
}

func Test_management(t *testing.T) {
	test(t, filepath.Join("test-programs", "management"))
}

func Test_monitoring(t *testing.T) {
	test(t, filepath.Join("test-programs", "monitoring"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "monitoring", "v7")))
}

func Test_network(t *testing.T) {
	test(t, filepath.Join("test-programs", "network"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "network", "v7")))
}

func Test_servicebus(t *testing.T) {
	test(t, filepath.Join("test-programs", "servicebus"))
}

func Test_sql(t *testing.T) {
	test(t, filepath.Join("test-programs", "sql"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "sql", "v7")))
}

func Test_sql_managed(t *testing.T) {
	t.Skip("Waiting for more quota, Azure support request 2409140020000074")
	test(t, filepath.Join("test-programs", "sql_managed"))
}

func Test_storage(t *testing.T) {
	test(t, filepath.Join("test-programs", "storage"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "storage", "v7")))
}

func Test_automation_runbook(t *testing.T) {
	test(t, filepath.Join("test-programs", "automation_runbook"))
}

func Test_compute_datadiskattachment(t *testing.T) {
	test(t, filepath.Join("test-programs", "compute_datadiskattachment"))
}

func Test_loadbalancer(t *testing.T) {
	test(t, filepath.Join("test-programs", "loadbalancer"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "loadbalancer", "v7")))
}

func Test_iot_iothub(t *testing.T) {
	test(t, filepath.Join("test-programs", "iot_iothub"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "iot_iothub", "v7")))
}

func Test_cosmosdb(t *testing.T) {
	t.Skip("Can't record as all tested regions are returning 'ServiceUnavailable' error")
	test(t, filepath.Join("test-programs", "cosmosdb"))
}

func Test_containerservice_k8scluster(t *testing.T) {
	test(t, filepath.Join("test-programs", "containerservice_k8scluster"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "containerservice_k8scluster", "v7")))
}

func Test_apimanagement(t *testing.T) {
	test(t, filepath.Join("test-programs", "apimanagement"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "apimanagement", "v7")))
}

func Test_communication(t *testing.T) {
	test(t, filepath.Join("test-programs", "communication"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "communication", "v7")))
}

func Test_containerapp(t *testing.T) {
	test(t, filepath.Join("test-programs", "containerapp"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "containerapp", "v7")))
}

func Test_containerregistry(t *testing.T) {
	test(t, filepath.Join("test-programs", "containerregistry"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "containerregistry", "v7")))
}

func Test_datafactory(t *testing.T) {
	test(t, filepath.Join("test-programs", "datafactory"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "datafactory", "v7")))
}

func Test_eventgrid(t *testing.T) {
	test(t, filepath.Join("test-programs", "eventgrid"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "eventgrid", "v7")))
}

func Test_frontdoor(t *testing.T) {
	test(t, filepath.Join("test-programs", "frontdoor"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "frontdoor", "v7")))
}

func Test_kusto(t *testing.T) {
	test(t, filepath.Join("test-programs", "kusto"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "kusto", "v7")))
}

func Test_loganalytics(t *testing.T) {
	test(t, filepath.Join("test-programs", "loganalytics"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "loganalytics", "v7")))
}

func Test_privatedns(t *testing.T) {
	test(t, filepath.Join("test-programs", "privatedns"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "privatedns", "v7")))
}

func Test_provider_config(t *testing.T) {
	test(t, filepath.Join("test-programs", "provider_config"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "provider_config", "v7")))
}

func Test_recoveryservices(t *testing.T) {
	test(t, filepath.Join("test-programs", "recoveryservices"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "recoveryservices", "v7")))
}

func Test_securitycenter(t *testing.T) {
	test(t, filepath.Join("test-programs", "securitycenter"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "securitycenter", "v7")))
}

func Test_storage_cmk(t *testing.T) {
	test(t, filepath.Join("test-programs", "storage_cmk"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "storage_cmk", "v7")))
}

func Test_streamanalytics(t *testing.T) {
	test(t, filepath.Join("test-programs", "streamanalytics"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "streamanalytics", "v7")))
}

func Test_vmss(t *testing.T) {
	test(t, filepath.Join("test-programs", "vmss"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "vmss", "v7")))
}

func Test_waf(t *testing.T) {
	test(t, filepath.Join("test-programs", "waf"))
}
