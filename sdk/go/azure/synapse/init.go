// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package synapse

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
	case "azure:synapse/firewallRule:FirewallRule":
		r = &FirewallRule{}
	case "azure:synapse/integrationRuntimeAzure:IntegrationRuntimeAzure":
		r = &IntegrationRuntimeAzure{}
	case "azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted":
		r = &IntegrationRuntimeSelfHosted{}
	case "azure:synapse/linkedService:LinkedService":
		r = &LinkedService{}
	case "azure:synapse/managedPrivateEndpoint:ManagedPrivateEndpoint":
		r = &ManagedPrivateEndpoint{}
	case "azure:synapse/privateLinkHub:PrivateLinkHub":
		r = &PrivateLinkHub{}
	case "azure:synapse/roleAssignment:RoleAssignment":
		r = &RoleAssignment{}
	case "azure:synapse/sparkPool:SparkPool":
		r = &SparkPool{}
	case "azure:synapse/sqlPool:SqlPool":
		r = &SqlPool{}
	case "azure:synapse/sqlPoolExtendedAuditingPolicy:SqlPoolExtendedAuditingPolicy":
		r = &SqlPoolExtendedAuditingPolicy{}
	case "azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy":
		r = &SqlPoolSecurityAlertPolicy{}
	case "azure:synapse/sqlPoolVulnerabilityAssessment:SqlPoolVulnerabilityAssessment":
		r = &SqlPoolVulnerabilityAssessment{}
	case "azure:synapse/sqlPoolVulnerabilityAssessmentBaseline:SqlPoolVulnerabilityAssessmentBaseline":
		r = &SqlPoolVulnerabilityAssessmentBaseline{}
	case "azure:synapse/sqlPoolWorkloadClassifier:SqlPoolWorkloadClassifier":
		r = &SqlPoolWorkloadClassifier{}
	case "azure:synapse/sqlPoolWorkloadGroup:SqlPoolWorkloadGroup":
		r = &SqlPoolWorkloadGroup{}
	case "azure:synapse/workspace:Workspace":
		r = &Workspace{}
	case "azure:synapse/workspaceAadAdmin:WorkspaceAadAdmin":
		r = &WorkspaceAadAdmin{}
	case "azure:synapse/workspaceExtendedAuditingPolicy:WorkspaceExtendedAuditingPolicy":
		r = &WorkspaceExtendedAuditingPolicy{}
	case "azure:synapse/workspaceKey:WorkspaceKey":
		r = &WorkspaceKey{}
	case "azure:synapse/workspaceSecurityAlertPolicy:WorkspaceSecurityAlertPolicy":
		r = &WorkspaceSecurityAlertPolicy{}
	case "azure:synapse/workspaceSqlAadAdmin:WorkspaceSqlAadAdmin":
		r = &WorkspaceSqlAadAdmin{}
	case "azure:synapse/workspaceVulnerabilityAssessment:WorkspaceVulnerabilityAssessment":
		r = &WorkspaceVulnerabilityAssessment{}
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
		"synapse/firewallRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/integrationRuntimeAzure",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/integrationRuntimeSelfHosted",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/linkedService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/managedPrivateEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/privateLinkHub",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/roleAssignment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/sparkPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/sqlPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/sqlPoolExtendedAuditingPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/sqlPoolSecurityAlertPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/sqlPoolVulnerabilityAssessment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/sqlPoolVulnerabilityAssessmentBaseline",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/sqlPoolWorkloadClassifier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/sqlPoolWorkloadGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/workspace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/workspaceAadAdmin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/workspaceExtendedAuditingPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/workspaceKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/workspaceSecurityAlertPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/workspaceSqlAadAdmin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"synapse/workspaceVulnerabilityAssessment",
		&module{version},
	)
}
