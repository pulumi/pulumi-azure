// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package provider

import (
	"path/filepath"
	"testing"
)

func TestKeyVault(t *testing.T) {
	test(t, filepath.Join("test-programs", "keyvault"))
}
