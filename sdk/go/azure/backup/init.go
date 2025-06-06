// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package backup

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "azure:backup/containerStorageAccount:ContainerStorageAccount":
		r = &ContainerStorageAccount{}
	case "azure:backup/policyFileShare:PolicyFileShare":
		r = &PolicyFileShare{}
	case "azure:backup/policyVM:PolicyVM":
		r = &PolicyVM{}
	case "azure:backup/policyVMWorkload:PolicyVMWorkload":
		r = &PolicyVMWorkload{}
	case "azure:backup/protectedFileShare:ProtectedFileShare":
		r = &ProtectedFileShare{}
	case "azure:backup/protectedVM:ProtectedVM":
		r = &ProtectedVM{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"azure",
		"backup/containerStorageAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"backup/policyFileShare",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"backup/policyVM",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"backup/policyVMWorkload",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"backup/protectedFileShare",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"backup/protectedVM",
		&module{version},
	)
}
