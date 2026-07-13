package provider

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

const useAksWorkloadIdentityKey = "useAksWorkloadIdentity"

func TestResolveCredentials_AksWorkloadIdentity(t *testing.T) {
	tokenContent := "my-federated-token"
	tokenFile := filepath.Join(t.TempDir(), "azure-identity-token")
	require.NoError(t, os.WriteFile(tokenFile, []byte("  "+tokenContent+"  \n"), 0o600))

	t.Run("reads AZURE_* env vars and token file", func(t *testing.T) {
		t.Setenv("AZURE_CLIENT_ID", "aks-client-id")
		t.Setenv("AZURE_TENANT_ID", "aks-tenant-id")
		t.Setenv("AZURE_FEDERATED_TOKEN_FILE", tokenFile)

		vars := resource.PropertyMap{
			useAksWorkloadIdentityKey: resource.NewBoolProperty(true),
		}

		creds, err := resolveCredentials(vars)
		require.NoError(t, err)
		assert.Equal(t, "aks-client-id", creds.clientID)
		assert.Equal(t, "aks-tenant-id", creds.tenantID)
		assert.Equal(t, tokenContent, creds.oidcToken)
		assert.True(t, creds.useOIDC)
	})

	t.Run("AZURE_* env vars take precedence over config when AKS WI enabled", func(t *testing.T) {
		t.Setenv("AZURE_CLIENT_ID", "aks-client-id")
		t.Setenv("AZURE_TENANT_ID", "aks-tenant-id")
		t.Setenv("AZURE_FEDERATED_TOKEN_FILE", tokenFile)

		vars := resource.PropertyMap{
			useAksWorkloadIdentityKey: resource.NewBoolProperty(true),
			"clientId":                resource.NewStringProperty("explicit-client"),
			"tenantId":                resource.NewStringProperty("explicit-tenant"),
		}

		creds, err := resolveCredentials(vars)
		require.NoError(t, err)
		assert.Equal(t, "aks-client-id", creds.clientID)
		assert.Equal(t, "aks-tenant-id", creds.tenantID)
	})

	t.Run("oidcTokenFilePath reads token from file", func(t *testing.T) {
		t.Setenv("AZURE_CLIENT_ID", "")
		t.Setenv("AZURE_TENANT_ID", "")
		t.Setenv("AZURE_FEDERATED_TOKEN_FILE", "")

		vars := resource.PropertyMap{
			"useOidc":           resource.NewBoolProperty(true),
			"clientId":          resource.NewStringProperty("test-client"),
			"tenantId":          resource.NewStringProperty("test-tenant"),
			"oidcTokenFilePath": resource.NewStringProperty(tokenFile),
		}

		creds, err := resolveCredentials(vars)
		require.NoError(t, err)
		assert.Equal(t, tokenContent, creds.oidcToken)
		assert.True(t, creds.useOIDC)
	})

	t.Run("direct oidcToken takes precedence over file", func(t *testing.T) {
		t.Setenv("AZURE_FEDERATED_TOKEN_FILE", tokenFile)

		vars := resource.PropertyMap{
			useAksWorkloadIdentityKey: resource.NewBoolProperty(true),
			"oidcToken":               resource.NewStringProperty("inline-token"),
		}

		creds, err := resolveCredentials(vars)
		require.NoError(t, err)
		assert.Equal(t, "inline-token", creds.oidcToken)
	})

	t.Run("returns error for missing token file", func(t *testing.T) {
		t.Setenv("AZURE_FEDERATED_TOKEN_FILE", "/nonexistent/path/token")

		vars := resource.PropertyMap{
			useAksWorkloadIdentityKey: resource.NewBoolProperty(true),
		}

		_, err := resolveCredentials(vars)
		require.Error(t, err)
		assert.Contains(t, err.Error(), "reading OIDC token from file")
	})

	t.Run("no OIDC when disabled", func(t *testing.T) {
		t.Setenv("AZURE_CLIENT_ID", "")
		t.Setenv("AZURE_TENANT_ID", "")
		t.Setenv("AZURE_FEDERATED_TOKEN_FILE", "")

		vars := resource.PropertyMap{}

		creds, err := resolveCredentials(vars)
		require.NoError(t, err)
		assert.False(t, creds.useOIDC)
		assert.Empty(t, creds.oidcToken)
	})
}
