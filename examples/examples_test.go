// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"fmt"
	"io/ioutil"
	"net/http"
	"os"
	"path"
	"path/filepath"
	"testing"
	"time"

	"github.com/stretchr/testify/assert"

	"github.com/pulumi/pulumi/pkg/testing/integration"
)

func TestExamples(t *testing.T) {
	environ := os.Getenv("ARM_ENVIRONMENT")
	if environ == "" {
		t.Skipf("Skipping test due to missing ARM_ENVIRONMENT variable")
	}
	azureLocation := os.Getenv("ARM_LOCATION")
	if azureLocation == "" {
		azureLocation = "westus"
		fmt.Println("Defaulting ARM_LOCATION to 'westus'.  You can override using the ARM_LOCATION variable")
	}
	cwd, err := os.Getwd()
	if !assert.NoError(t, err, "expected a valid working directory: %v", err) {
		return
	}

	// base options shared amongst all tests.
	base := integration.ProgramTestOptions{
		Config: map[string]string{
			"azure:environment": environ,
			"azure:location":    azureLocation,
		},
	}

	jsBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/azure",
		},
	})

	pythonBase := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	shortTests := []integration.ProgramTestOptions{
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "minimal")}),
		pythonBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "minimal-py")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "eventgrid")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "eventhub")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "http-external")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "http-multi")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "iot")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "queue")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "table")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "timer")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "topic")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "webserver")}),
		jsBase.With(integration.ProgramTestOptions{
			Dir: path.Join(cwd, "http"),
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, body, "Hello World!")
			}),
		}),
		jsBase.With(integration.ProgramTestOptions{
			Dir: path.Join(cwd, "blob"),
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, body, "A File from Blob Storage")
			}),
		}),
		pythonBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "eventhub-py")}),
		pythonBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "datasource-py")}),
		jsBase.With(integration.ProgramTestOptions{
			Dir: path.Join(cwd, "msi-renamed-to-authorization"),
			EditDirs: []integration.EditDir{
				{
					Dir:      "step2",
					Additive: true,
					ExpectNoChanges: true,
				},
			},
		}),
	}

	longTests := []integration.ProgramTestOptions{
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "aci-multi")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "aci-volume-mount")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "cosmosdb")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "loadbalancer")}),
		jsBase.With(integration.ProgramTestOptions{Dir: path.Join(cwd, "multi-callback-all")}),
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

func validateAPITest(isValid func(body string)) func(t *testing.T, stack integration.RuntimeValidationStackInfo) {
	return func(t *testing.T, stack integration.RuntimeValidationStackInfo) {
		var resp *http.Response
		var err error
		url := stack.Outputs["url"].(string)
		// Retry a couple times on 5xx
		for i := 0; i < 5; i++ {
			resp, err = http.Get(url)
			if !assert.NoError(t, err) {
				return
			}
			if resp.StatusCode < 500 {
				break
			}
			time.Sleep(10 * time.Second)
		}
		defer resp.Body.Close()
		body, err := ioutil.ReadAll(resp.Body)
		assert.NoError(t, err)
		isValid(string(body))
	}
}
