// Copyright 2026, Pulumi Corporation.

package provider

import (
	"context"
	"encoding/json"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

func TestClearMetaSchemaVersion(t *testing.T) {
	t.Parallel()

	cases := []struct {
		name    string
		meta    map[string]any
		wantHas bool
		wantKey string
	}{
		{
			name:    "v5 state strips schema_version, preserves other keys",
			meta:    map[string]any{"schema_version": "1", "timeouts": map[string]any{"create": 600000000000.0}},
			wantHas: false,
			wantKey: "timeouts",
		},
		{
			name:    "no schema_version is a no-op",
			meta:    map[string]any{"timeouts": map[string]any{"create": 600000000000.0}},
			wantHas: false,
			wantKey: "timeouts",
		},
		{
			name:    "schema_version 0 is also stripped (any-version strip)",
			meta:    map[string]any{"schema_version": "0"},
			wantHas: false,
		},
	}

	for _, tc := range cases {
		t.Run(tc.name, func(t *testing.T) {
			t.Parallel()
			raw, err := json.Marshal(tc.meta)
			require.NoError(t, err)
			pm := resource.PropertyMap{
				"__meta": resource.NewStringProperty(string(raw)),
			}

			got, err := clearMetaSchemaVersion(context.Background(), pm)
			require.NoError(t, err)

			var parsed map[string]any
			require.NoError(t, json.Unmarshal([]byte(got["__meta"].StringValue()), &parsed))
			_, hasVer := parsed["schema_version"]
			require.Equal(t, tc.wantHas, hasVer, "schema_version presence")
			if tc.wantKey != "" {
				require.Contains(t, parsed, tc.wantKey, "other meta keys preserved")
			}
		})
	}
}

func TestClearMetaSchemaVersion_NoMeta(t *testing.T) {
	t.Parallel()

	pm := resource.PropertyMap{
		"otherField": resource.NewStringProperty("unchanged"),
	}
	got, err := clearMetaSchemaVersion(context.Background(), pm)
	require.NoError(t, err)
	require.Equal(t, pm, got)
}

func TestClearMetaSchemaVersion_NonStringMeta(t *testing.T) {
	t.Parallel()

	pm := resource.PropertyMap{
		"__meta": resource.NewNumberProperty(42),
	}
	got, err := clearMetaSchemaVersion(context.Background(), pm)
	require.NoError(t, err)
	require.Equal(t, pm, got)
}

func TestClearMetaSchemaVersion_InvalidJSON(t *testing.T) {
	t.Parallel()

	pm := resource.PropertyMap{
		"__meta": resource.NewStringProperty("not valid json"),
	}
	got, err := clearMetaSchemaVersion(context.Background(), pm)
	require.NoError(t, err)
	require.Equal(t, pm, got)
}
