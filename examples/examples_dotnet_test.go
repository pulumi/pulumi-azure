// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
// +build dotnet all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
	"github.com/stretchr/testify/assert"
)

func getCSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"Pulumi.Azure",
		},
	})

	return baseJS
}

func TestAccAppServiceCs(t *testing.T) {
	test := getCSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "appservice-cs"),
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, body, "Hello Pulumi")
			}),
		})

	integration.ProgramTest(t, &test)
}
