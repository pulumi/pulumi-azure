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
	test(t, filepath.Join("test-programs", "appinsights"))
}

func Test_appservice(t *testing.T) {
	test(t, filepath.Join("test-programs", "appservice"))
}

func Test_dns(t *testing.T) {
	test(t, filepath.Join("test-programs", "dns"))
}

func Test_keyvault(t *testing.T) {
	test(t, filepath.Join("test-programs", "keyvault"))
}

func Test_management(t *testing.T) {
	test(t, filepath.Join("test-programs", "management"))
}

func Test_monitoring(t *testing.T) {
	test(t, filepath.Join("test-programs", "monitoring"))
}

func Test_network(t *testing.T) {
	test(t, filepath.Join("test-programs", "network"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "network", "v6")))
}

func Test_servicebus(t *testing.T) {
	test(t, filepath.Join("test-programs", "servicebus"))
}

func Test_sql(t *testing.T) {
	test(t, filepath.Join("test-programs", "sql"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "sql", "v6")))
}

func Test_sql_managed(t *testing.T) {
	t.Skip("Waiting for more quota, Azure support request 2409140020000074")
	test(t, filepath.Join("test-programs", "sql_managed"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "sql_managed", "v6")),
	)
}

func Test_storage(t *testing.T) {
	test(t, filepath.Join("test-programs", "storage"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "storage", "v6")))
}

func Test_automation_runbook(t *testing.T) {
	test(t, filepath.Join("test-programs", "automation_runbook"))
}

func Test_cdn_profile(t *testing.T) {
	test(t, filepath.Join("test-programs", "cdn_profile"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "cdn_profile", "v6")))
}

func Test_compute_datadiskattachment(t *testing.T) {
	test(t, filepath.Join("test-programs", "compute_datadiskattachment"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "compute_datadiskattachment", "v6")))
}

func Test_loadbalancer(t *testing.T) {
	test(t, filepath.Join("test-programs", "loadbalancer"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "loadbalancer", "v6")))
}

func Test_iot_iothub(t *testing.T) {
	test(t, filepath.Join("test-programs", "iot_iothub"))
}

func Test_cosmosdb(t *testing.T) {
	t.Skip("Can't record as all tested regions are returning 'ServiceUnavailable' error")
	test(t, filepath.Join("test-programs", "cosmosdb"))
}

func Test_containerservice_k8scluster(t *testing.T) {
	test(t, filepath.Join("test-programs", "containerservice_k8scluster"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "containerservice_k8scluster", "v6")))
}

//nolint:misspell
func Test_hdinsight(t *testing.T) {
	test(t, filepath.Join("test-programs", "hdinsight"),
		optproviderupgrade.NewSourcePath(filepath.Join("test-programs", "hdinsight", "v6")))
}
