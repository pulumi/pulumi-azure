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
	test(t, filepath.Join("test-programs", "network"))
}

func Test_servicebus(t *testing.T) {
	test(t, filepath.Join("test-programs", "servicebus"))
}

func Test_sql(t *testing.T) {
	test(t, filepath.Join("test-programs", "sql"))
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
