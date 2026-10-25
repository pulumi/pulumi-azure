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

package provider

import (
	"context"
	"strings"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

// wellKnownResourceIDSegments are the static segments of an ARM resource ID, in the casing that
// the upstream provider's resource ID parsers expect.
//
// ARM treats these segments case-insensitively, so IDs are routinely surfaced with them
// lower-cased. In particular, the IDs that azure-native reports for a resource contain
// `/resourcegroups/`, which the strict parsers here would otherwise reject -- meaning an ID
// produced by azure-native could not be passed to a resource in this provider. See
// https://github.com/pulumi/pulumi-azure-native/issues/4633.
var wellKnownResourceIDSegments = []string{
	"subscriptions",
	"resourceGroups",
	"providers",
	"managementGroups",
}

// looksLikeResourceID reports whether s has the shape of an ARM resource ID, so that arbitrary
// strings which merely happen to contain a matching path segment are left alone.
func looksLikeResourceID(s string) bool {
	if !strings.HasPrefix(s, "/") {
		return false
	}
	lower := strings.ToLower(s)
	return strings.HasPrefix(lower, "/subscriptions/") || strings.HasPrefix(lower, "/providers/")
}

// canonicalizeResourceIDCasing returns id with the casing of its well-known static segments
// corrected, or id unchanged if there is nothing to correct.
//
// Only the key segments of the ID (which appear at the odd positions of an ID beginning with a
// `/`) are considered, so that a resource group or resource whose name happens to match one of
// these values is left alone.
func canonicalizeResourceIDCasing(id string) string {
	if !looksLikeResourceID(id) {
		return id
	}

	split := strings.Split(id, "/")
	changed := false
	for i := 1; i < len(split); i += 2 {
		for _, wellKnown := range wellKnownResourceIDSegments {
			if split[i] != wellKnown && strings.EqualFold(split[i], wellKnown) {
				split[i] = wellKnown
				changed = true
				break
			}
		}
	}
	if !changed {
		return id
	}

	return strings.Join(split, "/")
}

// resourceIDPropertyNames are property names which reference other Azure resources but do not
// end in `Id`/`Ids`.
var resourceIDPropertyNames = map[resource.PropertyKey]bool{
	"scope":  true,
	"scopes": true,
}

// azureTags is the property holding a resource's Azure tags.
const azureTags resource.PropertyKey = "tags"

// opaquePropertyNames are properties whose contents are arbitrary user data rather than
// references to other resources, so an ID-shaped value inside one is payload we must not rewrite
// -- a resource ID deliberately stored as a tag, for instance.
var opaquePropertyNames = map[resource.PropertyKey]bool{
	azureTags: true,
}

// referencesResourceIDs reports whether a property of this name holds references to other Azure
// resources, and so may carry an ID whose casing we should correct.
//
// This deliberately gates on the property name as well as on the value: plenty of free-form
// string properties -- `azurerm_key_vault_secret`'s `value`, say -- could hold something shaped
// like a resource ID as opaque payload, and rewriting one of those would silently corrupt it.
// Missing an ID property here is the far safer failure: it just leaves today's behaviour in
// place, where the upstream validation reports the casing as an error.
func referencesResourceIDs(key resource.PropertyKey) bool {
	if resourceIDPropertyNames[key] {
		return true
	}

	name := strings.ToLower(string(key))

	return strings.HasSuffix(name, "id") || strings.HasSuffix(name, "ids")
}

// canonicalizeResourceIDsInValue returns v with the casing of any ARM resource IDs it contains
// corrected, recursing through arrays, objects and secret and output wrappers. Values of any
// other kind -- including unknowns during a preview -- are returned untouched.
//
// key is the name of the property v was found under, which decides whether v is treated as a
// resource reference at all. Array elements inherit the name of the list holding them.
func canonicalizeResourceIDsInValue(key resource.PropertyKey, v resource.PropertyValue) resource.PropertyValue {
	if opaquePropertyNames[key] {
		return v
	}

	switch {
	case v.IsString():
		if !referencesResourceIDs(key) {
			return v
		}
		if corrected := canonicalizeResourceIDCasing(v.StringValue()); corrected != v.StringValue() {
			return resource.NewStringProperty(corrected)
		}
	case v.IsArray():
		// NOTE: a non-null PropertyValue can still hold a nil array, which we preserve as-is.
		if arr := v.ArrayValue(); arr != nil {
			elems := make([]resource.PropertyValue, len(arr))
			for i, elem := range arr {
				elems[i] = canonicalizeResourceIDsInValue(key, elem)
			}
			return resource.NewArrayProperty(elems)
		}
	case v.IsObject():
		if obj := v.ObjectValue(); obj != nil {
			props := make(resource.PropertyMap, len(obj))
			for k, elem := range obj {
				props[k] = canonicalizeResourceIDsInValue(k, elem)
			}
			return resource.NewObjectProperty(props)
		}
	case v.IsSecret():
		return resource.NewSecretProperty(&resource.Secret{
			Element: canonicalizeResourceIDsInValue(key, v.SecretValue().Element),
		})
	case v.IsOutput():
		out := v.OutputValue()
		return resource.NewOutputProperty(resource.Output{
			Element:      canonicalizeResourceIDsInValue(key, out.Element),
			Known:        out.Known,
			Secret:       out.Secret,
			Dependencies: out.Dependencies,
		})
	}

	return v
}

// canonicalizeResourceIDsInInputs is a [tfbridge.PreCheckCallback] which corrects the casing of
// any ARM resource IDs in a resource's inputs.
//
// Check both validates and returns these inputs, so correcting the value here -- rather than
// relaxing the validation -- also keeps what we record in state consistent with the casing Azure
// reports when the resource is subsequently read, which avoids a perpetual diff.
func canonicalizeResourceIDsInInputs(
	_ context.Context, config resource.PropertyMap, _ resource.PropertyMap,
) (resource.PropertyMap, error) {
	corrected := make(resource.PropertyMap, len(config))
	for k, v := range config {
		corrected[k] = canonicalizeResourceIDsInValue(k, v)
	}

	return corrected, nil
}
