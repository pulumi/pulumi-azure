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

func TestSubscriptionIDFromMeta(t *testing.T) {
	t.Parallel()

	type accountSubID struct {
		SubscriptionId string
	}
	type accountSubIDUpper struct {
		SubscriptionID string
	}
	type metaPtr struct {
		Account *accountSubID
	}
	type metaValue struct {
		Account accountSubIDUpper
	}

	t.Run("Nil meta", func(t *testing.T) {
		t.Parallel()
		assert.Equal(t, "", subscriptionIDFromMeta(nil))
	})

	t.Run("Non-struct meta", func(t *testing.T) {
		t.Parallel()
		assert.Equal(t, "", subscriptionIDFromMeta("not-a-struct"))
	})

	t.Run("Missing account", func(t *testing.T) {
		t.Parallel()
		type metaNoAccount struct {
			Foo string
		}
		assert.Equal(t, "", subscriptionIDFromMeta(metaNoAccount{Foo: "bar"}))
	})

	t.Run("Nil account", func(t *testing.T) {
		t.Parallel()
		assert.Equal(t, "", subscriptionIDFromMeta(metaPtr{Account: nil}))
	})

	t.Run("SubscriptionId field", func(t *testing.T) {
		t.Parallel()
		expected := "11111111-2222-3333-4444-555555555555"
		meta := metaPtr{Account: &accountSubID{SubscriptionId: expected}}
		assert.Equal(t, expected, subscriptionIDFromMeta(meta))
		assert.Equal(t, expected, subscriptionIDFromMeta(&meta))
	})

	t.Run("SubscriptionID field", func(t *testing.T) {
		t.Parallel()
		expected := "66666666-7777-8888-9999-000000000000"
		meta := metaValue{Account: accountSubIDUpper{SubscriptionID: expected}}
		assert.Equal(t, expected, subscriptionIDFromMeta(meta))
		assert.Equal(t, expected, subscriptionIDFromMeta(&meta))
	})
}
