package provider

import (
	"context"
	"fmt"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

func TestLowercaseLettersAndNumbers(t *testing.T) {
	cases := map[string]string{
		"abc123":  "abc123",
		"ABC123":  "abc123",
		"abc-123": "abc123",
		"ABC-123": "abc123",
		"abc_123": "abc123",
		"ABC_123": "abc123",
		"abc.123": "abc123",
	}
	for s, expected := range cases {
		assert.Equal(t, lowercaseLettersAndNumbers(s), expected)
	}
}

func TestFixMssqlServerId(t *testing.T) {
	t.Parallel()

	const (
		subscriptionID = "11111111-2222-3333-4444-555555555555"
		resourceGroup  = "exampleresourcegroupeb1b9585"
		serverName     = "superServer"
	)
	serverID := fmt.Sprintf("/subscriptions/%s/resourceGroups/%s/providers/Microsoft.Sql/servers/%s",
		subscriptionID, resourceGroup, serverName)
	serverFirewallID := fmt.Sprintf("%s/firewallRules/exampleFwRule6fd4913", serverID)

	t.Run("Happy path", func(t *testing.T) {
		t.Parallel()
		properties := map[string]any{
			"id":                serverFirewallID,
			"resourceGroupName": resourceGroup,
			"serverName":        serverName,
		}
		pm := resource.NewPropertyMapFromMap(properties)
		actual, err := fixMssqlServerID(context.Background(), pm)
		require.NoError(t, err)

		actualMap := actual.Mappable()
		assert.Contains(t, actualMap, "serverId")
		assert.Equal(t, serverID, actualMap["serverId"])
	})

	assertNoServerID := func(t *testing.T, properties map[string]any) {
		pm := resource.NewPropertyMapFromMap(properties)
		actual, err := fixMssqlServerID(context.Background(), pm)
		require.NoError(t, err)

		actualMap := actual.Mappable()
		assert.NotContains(t, actualMap, "serverId")
	}

	t.Run("Needs serverName", func(t *testing.T) {
		t.Parallel()
		properties := map[string]any{
			"id":                serverFirewallID,
			"resourceGroupName": resourceGroup,
		}
		assertNoServerID(t, properties)
	})

	t.Run("Needs id", func(t *testing.T) {
		t.Parallel()
		properties := map[string]any{
			"resourceGroupName": resourceGroup,
			"serverName":        serverName,
		}
		assertNoServerID(t, properties)
	})

	t.Run("Needs resourceGroupName", func(t *testing.T) {
		t.Parallel()
		properties := map[string]any{
			"id":         serverFirewallID,
			"serverName": serverName,
		}
		assertNoServerID(t, properties)
	})
}

func TestFixMssqlManagedInstanceId(t *testing.T) {
	t.Parallel()

	const (
		subscriptionID = "11111111-2222-3333-4444-555555555555"
		resourceGroup  = "exampleresourcegroupeb1b9585"
		name           = "myInstance"
	)
	instanceID := fmt.Sprintf("/subscriptions/%s/resourceGroups/%s/providers/Microsoft.Sql/managedInstances/%s",
		subscriptionID, resourceGroup, name)
	failoverGroupID := fmt.Sprintf(
		"/subscriptions/%s/resourceGroups/%s/providers/Microsoft.Sql/locations/eastus/instanceFailoverGroups/fail123",
		subscriptionID, resourceGroup)

	t.Run("Happy path", func(t *testing.T) {
		t.Parallel()
		properties := map[string]any{
			"id":                  failoverGroupID,
			"resourceGroupName":   resourceGroup,
			"managedInstanceName": name,
		}
		pm := resource.NewPropertyMapFromMap(properties)
		actual, err := fixMssqlManagedInstanceID(context.Background(), pm)
		require.NoError(t, err)

		actualMap := actual.Mappable()
		assert.Contains(t, actualMap, "managedInstanceId")
		assert.Equal(t, instanceID, actualMap["managedInstanceId"])
	})

	assertNoID := func(t *testing.T, properties map[string]any) {
		pm := resource.NewPropertyMapFromMap(properties)
		actual, err := fixMssqlManagedInstanceID(context.Background(), pm)
		require.NoError(t, err)

		actualMap := actual.Mappable()
		assert.NotContains(t, actualMap, "managedInstanceId")
	}

	t.Run("Needs managedInstanceName", func(t *testing.T) {
		t.Parallel()
		properties := map[string]any{
			"id":                failoverGroupID,
			"resourceGroupName": resourceGroup,
		}
		assertNoID(t, properties)
	})

	t.Run("Needs id", func(t *testing.T) {
		t.Parallel()
		properties := map[string]any{
			"resourceGroupName":   resourceGroup,
			"managedInstanceName": name,
		}
		assertNoID(t, properties)
	})

	t.Run("Needs resourceGroupName", func(t *testing.T) {
		t.Parallel()
		properties := map[string]any{
			"id":                  failoverGroupID,
			"managedInstanceName": name,
		}
		assertNoID(t, properties)
	})
}
