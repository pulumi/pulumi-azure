// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appconfiguration

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
	case "azure:appconfiguration/configurationFeature:ConfigurationFeature":
		r = &ConfigurationFeature{}
	case "azure:appconfiguration/configurationKey:ConfigurationKey":
		r = &ConfigurationKey{}
	case "azure:appconfiguration/configurationStore:ConfigurationStore":
		r = &ConfigurationStore{}
	case "azure:appconfiguration/licationLoadBalancer:LicationLoadBalancer":
		r = &LicationLoadBalancer{}
	case "azure:appconfiguration/licationLoadBalancerFrontend:LicationLoadBalancerFrontend":
		r = &LicationLoadBalancerFrontend{}
	case "azure:appconfiguration/licationLoadBalancerSubnetAssociation:LicationLoadBalancerSubnetAssociation":
		r = &LicationLoadBalancerSubnetAssociation{}
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
		"appconfiguration/configurationFeature",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"appconfiguration/configurationKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"appconfiguration/configurationStore",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"appconfiguration/licationLoadBalancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"appconfiguration/licationLoadBalancerFrontend",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"appconfiguration/licationLoadBalancerSubnetAssociation",
		&module{version},
	)
}
