// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"path"
	"testing"

	"github.com/stretchr/testify/assert"

	"github.com/pulumi/pulumi/pkg/testing/integration"
)

func TestExamples(t *testing.T) {
	environ := os.Getenv("ARM_ENVIRONMENT")
	if environ == "" {
		t.Skipf("Skipping test due to missing ARM_ENVIRONMENT variable")
	}
	cwd, err := os.Getwd()
	if !assert.NoError(t, err, "expected a valid working directory: %v", err) {
		return
	}

	// base options shared amongst all tests.
	base := integration.ProgramTestOptions{
		Config: map[string]string{
			"azure:environment": environ,
		},
		Dependencies: []string{
			"@pulumi/azure",
		},
	}

	shortTests := []integration.ProgramTestOptions{
		base.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "minimal")}),
	}

	longTests := []integration.ProgramTestOptions{
		base.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "webserver")}),
		base.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "aci-multi")}),
		base.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "aci-volume-mount")}),
		base.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "loadbalancer")}),
	}

	tests := shortTests
	if !testing.Short() {
		tests = append(tests, longTests...)
	}

	for _, ex := range tests {
		example := ex.With(integration.ProgramTestOptions{
			// TODO[pulumi/pulumi#1900]: This should be the default value, every test we have causes some sort of
			// change during a `pulumi refresh` for reasons outside our control.
			ExpectRefreshChanges: true,
		})
		t.Run(example.Dir, func(t *testing.T) {
			integration.ProgramTest(t, &example)
		})
	}
}

func createEditDir(dir string) integration.EditDir {
	return integration.EditDir{Dir: dir, ExtraRuntimeValidation: nil}
}
