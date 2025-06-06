// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package siterecovery

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
	case "azure:siterecovery/fabric:Fabric":
		r = &Fabric{}
	case "azure:siterecovery/hyperVReplicationPolicy:HyperVReplicationPolicy":
		r = &HyperVReplicationPolicy{}
	case "azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation":
		r = &HyperVReplicationPolicyAssociation{}
	case "azure:siterecovery/hyperVSite:HyperVSite":
		r = &HyperVSite{}
	case "azure:siterecovery/hypervNetworkMapping:HypervNetworkMapping":
		r = &HypervNetworkMapping{}
	case "azure:siterecovery/networkMapping:NetworkMapping":
		r = &NetworkMapping{}
	case "azure:siterecovery/protectionContainer:ProtectionContainer":
		r = &ProtectionContainer{}
	case "azure:siterecovery/protectionContainerMapping:ProtectionContainerMapping":
		r = &ProtectionContainerMapping{}
	case "azure:siterecovery/replicatedVM:ReplicatedVM":
		r = &ReplicatedVM{}
	case "azure:siterecovery/replicationPolicy:ReplicationPolicy":
		r = &ReplicationPolicy{}
	case "azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan":
		r = &ReplicationRecoveryPlan{}
	case "azure:siterecovery/vMWareReplicationPolicy:VMWareReplicationPolicy":
		r = &VMWareReplicationPolicy{}
	case "azure:siterecovery/vmwareReplicatedVm:VmwareReplicatedVm":
		r = &VmwareReplicatedVm{}
	case "azure:siterecovery/vmwareReplicationPolicyAssociation:VmwareReplicationPolicyAssociation":
		r = &VmwareReplicationPolicyAssociation{}
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
		"siterecovery/fabric",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/hyperVReplicationPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/hyperVReplicationPolicyAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/hyperVSite",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/hypervNetworkMapping",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/networkMapping",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/protectionContainer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/protectionContainerMapping",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/replicatedVM",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/replicationPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/replicationRecoveryPlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/vMWareReplicationPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/vmwareReplicatedVm",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"siterecovery/vmwareReplicationPolicyAssociation",
		&module{version},
	)
}
