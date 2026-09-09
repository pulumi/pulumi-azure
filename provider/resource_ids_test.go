package provider

import (
	"context"
	"fmt"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/plugin"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

const (
	identityIDPrefix    = "/subscriptions/12345678-1234-9876-4563-123456789012"
	identityIDSuffix    = "/providers/Microsoft.ManagedIdentity/userAssignedIdentities/native-identity"
	lowercaseIdentityID = identityIDPrefix + "/resourcegroups/foo" + identityIDSuffix
	canonicalIdentityID = identityIDPrefix + "/resourceGroups/foo" + identityIDSuffix
)

func TestCanonicalizeResourceIDCasing(t *testing.T) {
	// a resource group and a resource which are both named "resourcegroups"
	const awkwardNames = "/subscriptions/1234/%s/resourcegroups" +
		"/providers/Microsoft.Network/virtualNetworks/resourcegroups"

	cases := []struct {
		name     string
		input    string
		expected string
	}{
		{
			name:     "lowercase resourcegroups is corrected",
			input:    lowercaseIdentityID,
			expected: canonicalIdentityID,
		},
		{
			name:     "an already canonical ID is untouched",
			input:    canonicalIdentityID,
			expected: canonicalIdentityID,
		},
		{
			name:     "uppercased segments are corrected",
			input:    "/SUBSCRIPTIONS/1234/RESOURCEGROUPS/foo/PROVIDERS/Microsoft.Network/virtualNetworks/vnet",
			expected: "/subscriptions/1234/resourceGroups/foo/providers/Microsoft.Network/virtualNetworks/vnet",
		},
		{
			name:     "a management group scope is corrected",
			input:    "/providers/Microsoft.Management/managementgroups/some-group",
			expected: "/providers/Microsoft.Management/managementGroups/some-group",
		},
		{
			name:     "names matching a well-known segment are left alone",
			input:    fmt.Sprintf(awkwardNames, "resourcegroups"),
			expected: fmt.Sprintf(awkwardNames, "resourceGroups"),
		},
		{
			name:     "a nested child ID is corrected",
			input:    "/subscriptions/1234/resourcegroups/foo/providers/Microsoft.Network/virtualNetworks/v/subnets/s",
			expected: "/subscriptions/1234/resourceGroups/foo/providers/Microsoft.Network/virtualNetworks/v/subnets/s",
		},
		{
			name:     "a string which is not a resource ID is left alone",
			input:    "/some/path/resourcegroups/here",
			expected: "/some/path/resourcegroups/here",
		},
		{
			name:     "a data plane URI is left alone",
			input:    "https://example.vault.azure.net/keys/key1/version1",
			expected: "https://example.vault.azure.net/keys/key1/version1",
		},
		{name: "a plain string is left alone", input: "PerGB2018", expected: "PerGB2018"},
		{name: "the empty string", input: "", expected: ""},
		{name: "a lone slash", input: "/", expected: "/"},
	}

	for _, tc := range cases {
		t.Run(tc.name, func(t *testing.T) {
			assert.Equal(t, tc.expected, canonicalizeResourceIDCasing(tc.input))
		})
	}
}

// analyticsWorkspaceInputs mirrors the program in
// https://github.com/pulumi/pulumi-azure-native/issues/4633, where the identity ID comes from an
// azure-native UserAssignedIdentity.
func analyticsWorkspaceInputs(identityID string) resource.PropertyMap {
	return resource.PropertyMap{
		azureName:           resource.NewStringProperty("foo-workspace"),
		"resourceGroupName": resource.NewStringProperty("bar"),
		azureLocation:       resource.NewStringProperty("westeurope"),
		fieldSku:            resource.NewStringProperty("PerGB2018"),
		"retentionInDays":   resource.NewNumberProperty(30),
		"identity": resource.NewObjectProperty(resource.PropertyMap{
			"type": resource.NewStringProperty("UserAssigned"),
			"identityIds": resource.NewArrayProperty([]resource.PropertyValue{
				resource.NewStringProperty(identityID),
			}),
		}),
	}
}

func TestCanonicalizeResourceIDsInInputs(t *testing.T) {
	inputs := analyticsWorkspaceInputs(lowercaseIdentityID)

	actual, err := canonicalizeResourceIDsInInputs(context.Background(), inputs, nil)
	require.NoError(t, err)
	assert.Equal(t, analyticsWorkspaceInputs(canonicalIdentityID), actual)

	// the caller's map must not be mutated in place
	assert.Equal(t, lowercaseIdentityID,
		inputs["identity"].ObjectValue()["identityIds"].ArrayValue()[0].StringValue())
}

func TestCanonicalizeResourceIDsInValueWrappers(t *testing.T) {
	t.Run("secrets are preserved", func(t *testing.T) {
		actual := canonicalizeResourceIDsInValue("subnetId",
			resource.MakeSecret(resource.NewStringProperty(lowercaseIdentityID)))

		require.True(t, actual.IsSecret())
		assert.Equal(t, canonicalIdentityID, actual.SecretValue().Element.StringValue())
	})

	t.Run("output metadata is preserved", func(t *testing.T) {
		deps := []resource.URN{"urn:pulumi:dev::p::azure-native:index:UserAssignedIdentity::identity"}
		actual := canonicalizeResourceIDsInValue("subnetId", resource.NewOutputProperty(resource.Output{
			Element:      resource.NewStringProperty(lowercaseIdentityID),
			Known:        true,
			Secret:       true,
			Dependencies: deps,
		}))

		require.True(t, actual.IsOutput())
		out := actual.OutputValue()
		assert.Equal(t, canonicalIdentityID, out.Element.StringValue())
		assert.True(t, out.Known)
		assert.True(t, out.Secret)
		assert.Equal(t, deps, out.Dependencies)
	})

	t.Run("unknowns are left alone", func(t *testing.T) {
		unknown := resource.MakeComputed(resource.NewStringProperty(""))
		assert.Equal(t, unknown, canonicalizeResourceIDsInValue("subnetId", unknown))
	})

	t.Run("nulls are left alone", func(t *testing.T) {
		assert.Equal(t, resource.NewNullProperty(),
			canonicalizeResourceIDsInValue("subnetId", resource.NewNullProperty()))
	})

	t.Run("nil arrays and objects are preserved", func(t *testing.T) {
		require.Nil(t, canonicalizeResourceIDsInValue("subnetIds", resource.NewArrayProperty(nil)).ArrayValue())
		require.Nil(t, canonicalizeResourceIDsInValue("identity", resource.NewObjectProperty(nil)).ObjectValue())
	})
}

// End-to-end check that the scenario from the issue -- an identity ID produced by azure-native,
// with a lower-cased `resourcegroups` segment -- is accepted by Check rather than rejected by the
// upstream resource ID validation, and that the ID recorded in the checked inputs is corrected.
func TestCheckAcceptsLowercaseResourceGroupSegment(t *testing.T) {
	srv, err := providerServer(nil)
	require.NoError(t, err)

	marshalOpts := plugin.MarshalOptions{KeepUnknowns: true, KeepSecrets: true}
	news, err := plugin.MarshalProperties(analyticsWorkspaceInputs(lowercaseIdentityID), marshalOpts)
	require.NoError(t, err)

	resp, err := srv.Check(context.Background(), &pulumirpc.CheckRequest{
		Urn:  "urn:pulumi:dev::p::azure:operationalinsights/analyticsWorkspace:AnalyticsWorkspace::workspace",
		News: news,
	})
	require.NoError(t, err)

	for _, f := range resp.GetFailures() {
		t.Errorf("unexpected check failure on %q: %s", f.GetProperty(), f.GetReason())
	}

	checked, err := plugin.UnmarshalProperties(resp.GetInputs(), marshalOpts)
	require.NoError(t, err)

	identityIDs := checked["identity"].ObjectValue()["identityIds"].ArrayValue()
	require.Len(t, identityIDs, 1)
	assert.Equal(t, canonicalIdentityID, identityIDs[0].StringValue())
}

// A resource ID is only rewritten when the property holding it reads as a reference to another
// resource. Free-form properties can legitimately carry an ID-shaped string as opaque payload.
func TestCanonicalizeResourceIDsSkipsOpaqueProperties(t *testing.T) {
	cases := []struct {
		name     string
		inputs   resource.PropertyMap
		rewrites bool
	}{
		{
			name:     "a resource reference is rewritten",
			inputs:   resource.PropertyMap{"subnetId": resource.NewStringProperty(lowercaseIdentityID)},
			rewrites: true,
		},
		{
			name:     "a list of resource references is rewritten",
			inputs:   resource.PropertyMap{"identityIds": listOf(lowercaseIdentityID)},
			rewrites: true,
		},
		{
			name:     "a scope is rewritten",
			inputs:   resource.PropertyMap{"scope": resource.NewStringProperty(lowercaseIdentityID)},
			rewrites: true,
		},
		{
			name:     "scopes are rewritten",
			inputs:   resource.PropertyMap{"scopes": listOf(lowercaseIdentityID)},
			rewrites: true,
		},
		{
			// e.g. azurerm_key_vault_secret, azurerm_automation_variable_string
			name:     "a free-form value is left alone",
			inputs:   resource.PropertyMap{"value": resource.NewStringProperty(lowercaseIdentityID)},
			rewrites: false,
		},
		{
			name: "a secret free-form value is left alone",
			inputs: resource.PropertyMap{
				"value": resource.MakeSecret(resource.NewStringProperty(lowercaseIdentityID)),
			},
			rewrites: false,
		},
		{
			name: "tags are left alone",
			inputs: resource.PropertyMap{
				azureTags: resource.NewObjectProperty(resource.PropertyMap{
					"managedBy": resource.NewStringProperty(lowercaseIdentityID),
				}),
			},
			rewrites: false,
		},
		{
			// the tag key reads as a reference, but its contents are still user data
			name: "a tag named like a reference is left alone",
			inputs: resource.PropertyMap{
				azureTags: resource.NewObjectProperty(resource.PropertyMap{
					"resourceId": resource.NewStringProperty(lowercaseIdentityID),
				}),
			},
			rewrites: false,
		},
	}

	for _, tc := range cases {
		t.Run(tc.name, func(t *testing.T) {
			actual, err := canonicalizeResourceIDsInInputs(context.Background(), tc.inputs, nil)
			require.NoError(t, err)

			rewritten := !actual.DeepEquals(tc.inputs)
			assert.Equal(t, tc.rewrites, rewritten,
				"expected rewritten=%v, got inputs %v", tc.rewrites, actual)
		})
	}
}

func listOf(s string) resource.PropertyValue {
	return resource.NewArrayProperty([]resource.PropertyValue{resource.NewStringProperty(s)})
}
