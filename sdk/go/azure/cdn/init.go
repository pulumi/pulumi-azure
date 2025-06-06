// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cdn

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
	case "azure:cdn/endpoint:Endpoint":
		r = &Endpoint{}
	case "azure:cdn/endpointCustomDomain:EndpointCustomDomain":
		r = &EndpointCustomDomain{}
	case "azure:cdn/frontdoorCustomDomain:FrontdoorCustomDomain":
		r = &FrontdoorCustomDomain{}
	case "azure:cdn/frontdoorCustomDomainAssociation:FrontdoorCustomDomainAssociation":
		r = &FrontdoorCustomDomainAssociation{}
	case "azure:cdn/frontdoorEndpoint:FrontdoorEndpoint":
		r = &FrontdoorEndpoint{}
	case "azure:cdn/frontdoorFirewallPolicy:FrontdoorFirewallPolicy":
		r = &FrontdoorFirewallPolicy{}
	case "azure:cdn/frontdoorOrigin:FrontdoorOrigin":
		r = &FrontdoorOrigin{}
	case "azure:cdn/frontdoorOriginGroup:FrontdoorOriginGroup":
		r = &FrontdoorOriginGroup{}
	case "azure:cdn/frontdoorProfile:FrontdoorProfile":
		r = &FrontdoorProfile{}
	case "azure:cdn/frontdoorRoute:FrontdoorRoute":
		r = &FrontdoorRoute{}
	case "azure:cdn/frontdoorRule:FrontdoorRule":
		r = &FrontdoorRule{}
	case "azure:cdn/frontdoorRuleSet:FrontdoorRuleSet":
		r = &FrontdoorRuleSet{}
	case "azure:cdn/frontdoorSecret:FrontdoorSecret":
		r = &FrontdoorSecret{}
	case "azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy":
		r = &FrontdoorSecurityPolicy{}
	case "azure:cdn/profile:Profile":
		r = &Profile{}
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
		"cdn/endpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/endpointCustomDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorCustomDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorCustomDomainAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorFirewallPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorOrigin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorOriginGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorRuleSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorSecret",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/frontdoorSecurityPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"cdn/profile",
		&module{version},
	)
}
