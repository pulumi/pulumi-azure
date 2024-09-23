// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build go || all
// +build go all

package examples

import (
	"fmt"
	"os"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/stretchr/testify/require"
)

func getGoBaseOptions(t *testing.T) integration.ProgramTestOptions {
	goDepRoot := os.Getenv("PULUMI_GO_DEP_ROOT")
	if goDepRoot == "" {
		var err error
		goDepRoot, err = filepath.Abs("../..")
		require.NoError(t, err)
	}
	rootSdkPath, err := filepath.Abs("../sdk")
	require.NoError(t, err)

	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			fmt.Sprintf("github.com/pulumi/pulumi-azure/sdk/v6=%s", rootSdkPath),
		},
		Env: []string{
			fmt.Sprintf("PULUMI_GO_DEP_ROOT=%s", goDepRoot),
		},
	})

	return baseJS
}

func TestAccNetworkGo(t *testing.T) {
	test := getGoBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "network-go"),

			// TODO[pulumi/pulumi-azure#1569] refresh tries to edit subnets
			SkipRefresh: true,
		})

	integration.ProgramTest(t, &test)
}
