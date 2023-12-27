// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"fmt"
	"io/ioutil"
	"net/http"
	"os"
	"testing"
	"time"

	"github.com/stretchr/testify/assert"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func skipIfShort(t *testing.T) {
	if testing.Short() {
		t.Skip("skipping long-running test in short mode")
	}
}

func getEnviron(t *testing.T) string {
	env := os.Getenv("ARM_ENVIRONMENT")
	if env == "" {
		t.Skipf("Skipping test due to missing ARM_ENVIRONMENT environment variable")
	}

	return env
}

func getLocation(t *testing.T) string {
	azureLocation := os.Getenv("ARM_LOCATION")
	if azureLocation == "" {
		azureLocation = "westus"
		fmt.Println("Defaulting ARM_LOCATION to 'westus'.  You can override using the ARM_LOCATION variable")
	}

	return azureLocation
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	environ := getEnviron(t)
	azureLocation := getLocation(t)
	return integration.ProgramTestOptions{
		Config: map[string]string{
			"azure:environment": environ,
			"azure:location":    azureLocation,
		},
	}
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

// A lot of tests currently generate non-empty diffs upon refresh. While the work of root-causing
// each individual test has not been done yet, a few common known causes are listed here:
//
// TODO[pulumi/pulumi-terraform-bridge#1595]
// TODO[pulumi/pulumi-azure#1568]
func skipRefresh(opts *integration.ProgramTestOptions) {
	opts.SkipRefresh = true
}
