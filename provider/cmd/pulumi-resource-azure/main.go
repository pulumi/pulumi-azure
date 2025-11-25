// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

//go:generate go run ./generate.go

package main

import (
	_ "embed"
	_ "unsafe" // Import go:linkname

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"

	azure "github.com/pulumi/pulumi-azure/provider/v5"
	"github.com/pulumi/pulumi-azure/provider/v5/pkg/version"
)

// The AzureRM Terraform Provider has a setting named ARM_PROVIDER_STRICT, the bulk
// of which was introduced into terraform-providers/terraform-provider-azurerm in commit
// 447abecad. The setting prevents accidental adoption of existing resources, and is
// something we want to opt into - not delegate to user control via the environment.
//
// When we maintained our own fork of terraform-providers-azurerm, we just enabled the
// setting by modifying the feature flag value directly. Sadly it is unexported, and now
// we do _not_ depend on a fork but on upstream directly, we need a way to set that.
//
// One option would be to use os.Setenv to set the environment variable for the child
// processes - but this would put Azure specific bits into the plugin loader which is
// not desirable. Instead, we use `go:linkname` to make the private package-level variable
// which controls this behaviour accessible to us.
//
// The "go:linkname" directive is not widely used outside the standard library, but allows us to
// effectively alias a particular symbol via an accessible name. Per Ian Lance Taylor's
// post on golang-dev [1], "it means: every time you are about to write out X in the object
// file, write out Y instead."
//
// So, by aliasing a local variable `strictMode` to the particular symbol in question in
// the azure provider (identified via `nm`), we can set the private value here by assigning
// our own `strictMode` variable. Note that since we build with the vendor/ directory, we
// must use the qualified vendor path to the symbol.
//
// Unfortunately, `go:linkname` does not give an error if the symbol being aliased does
// not exist. Since we are aliasing into someone elses package, there is a real risk that
// an upstream refactor will move or break this variable. To that end, as part of the lint
// step in Makefile, we verify that the built binary actually has the symbol listed here
// present. This does not protect against behavioural change, but we can likely write a
// test for the undesirable behaviour to validate against that.
//
// Changes to this area of code are noted for upstream v1.30.0 (we are adopting this at
// v1.29.0) but do not affect the way we need to handle this.
//
// [1]: https://groups.google.com/forum/#!topic/golang-dev/j2r7Vq6CBZk

//nolint:lll
//go:linkname strictMode github.com/pulumi/pulumi-azure/vendor/github.com/terraform-providers/terraform-provider-azurerm/azurerm.requireResourcesToBeImported

//go:embed schema-embed.json
var pulumiSchema []byte

var strictMode bool

func main() {
	strictMode = true
	tfbridge.Main("azure", version.Version, azure.Provider(), pulumiSchema)
}
