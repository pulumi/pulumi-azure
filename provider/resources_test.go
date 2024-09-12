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
	const (
		subscriptionID = "11111111-2222-3333-4444-555555555555"
		resourceGroup  = "exampleresourcegroupeb1b9585"
		serverName     = "superServer"
	)
	serverId := fmt.Sprintf("/subscriptions/%s/resourceGroups/%s/providers/Microsoft.Sql/servers/%s", subscriptionID, resourceGroup, serverName)
	serverFirewallId := fmt.Sprintf("%s/firewallRules/exampleFwRule6fd4913", serverId)

	t.Run("Happy path", func(t *testing.T) {
		properties := map[string]any{
			"id":                serverFirewallId,
			"resourceGroupName": resourceGroup,
			"serverName":        serverName,
		}
		pm := resource.NewPropertyMapFromMap(properties)
		actual, err := fixMssqlServerId(context.Background(), pm)
		require.NoError(t, err)

		actualMap := actual.Mappable()
		assert.Contains(t, actualMap, "serverId")
		assert.Equal(t, serverId, actualMap["serverId"])
	})

	assertNoServerId := func(properties map[string]any) {
		pm := resource.NewPropertyMapFromMap(properties)
		actual, err := fixMssqlServerId(context.Background(), pm)
		require.NoError(t, err)

		actualMap := actual.Mappable()
		assert.NotContains(t, actualMap, "serverId")
	}

	t.Run("Needs serverName", func(t *testing.T) {
		properties := map[string]any{
			"id":                serverFirewallId,
			"resourceGroupName": resourceGroup,
		}
		assertNoServerId(properties)
	})

	t.Run("Needs id", func(t *testing.T) {
		properties := map[string]any{
			"resourceGroupName": resourceGroup,
			"serverName":        serverName,
		}
		assertNoServerId(properties)
	})

	t.Run("Needs resourceGroupName", func(t *testing.T) {
		properties := map[string]any{
			"id":         serverFirewallId,
			"serverName": serverName,
		}
		assertNoServerId(properties)
	})
}
