// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"fmt"
	"io/ioutil"
	"net/http"
	"os"
	"os/exec"
	"path/filepath"
	"strings"
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

func getLocation(t *testing.T) string {
	azureLocation := os.Getenv("ARM_LOCATION")
	if azureLocation == "" {
		azureLocation = "westus"
		fmt.Println("Defaulting ARM_LOCATION to 'westus'.  You can override using the ARM_LOCATION variable")
	}

	return azureLocation
}

func getSubscriptionID(t *testing.T) string {
	// Prefer the environment variable, but fall back to the Azure CLI if it's not set.
	// This should always be set in CI, but is useful for local testing.
	subscriptionID := os.Getenv("ARM_SUBSCRIPTION_ID")
	if subscriptionID == "" {
		// Fetch from default Azure CLI profile
		cmd := exec.Command("az", "account", "show", "--query", "id", "-o", "tsv")
		out, err := cmd.Output()
		if err != nil {
			t.Fatal(err)
		}
		if len(out) == 0 {
			t.Fatal("No Azure subscription ID found")
		}
		subscriptionID = strings.Trim(string(out), "\n")
	}

	return subscriptionID
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	azureLocation := getLocation(t)
	binPath, err := filepath.Abs("../bin")
	if err != nil {
		t.Fatal(err)
	}
	fmt.Printf("Using binPath %s\n", binPath)
	subscriptionId := getSubscriptionID(t)
	return integration.ProgramTestOptions{
		Config: map[string]string{
			"azure:location":       azureLocation,
			"azure:subscriptionId": subscriptionId,
		},
		LocalProviders: []integration.LocalDependency{
			{
				Package: "azure",
				Path:    binPath,
			},
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
