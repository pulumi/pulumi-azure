// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mssql

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
	case "azure:mssql/database:Database":
		r = &Database{}
	case "azure:mssql/databaseExtendedAuditingPolicy:DatabaseExtendedAuditingPolicy":
		r = &DatabaseExtendedAuditingPolicy{}
	case "azure:mssql/databaseVulnerabilityAssessmentRuleBaseline:DatabaseVulnerabilityAssessmentRuleBaseline":
		r = &DatabaseVulnerabilityAssessmentRuleBaseline{}
	case "azure:mssql/elasticPool:ElasticPool":
		r = &ElasticPool{}
	case "azure:mssql/failoverGroup:FailoverGroup":
		r = &FailoverGroup{}
	case "azure:mssql/firewallRule:FirewallRule":
		r = &FirewallRule{}
	case "azure:mssql/job:Job":
		r = &Job{}
	case "azure:mssql/jobAgent:JobAgent":
		r = &JobAgent{}
	case "azure:mssql/jobCredential:JobCredential":
		r = &JobCredential{}
	case "azure:mssql/jobSchedule:JobSchedule":
		r = &JobSchedule{}
	case "azure:mssql/jobStep:JobStep":
		r = &JobStep{}
	case "azure:mssql/jobTargetGroup:JobTargetGroup":
		r = &JobTargetGroup{}
	case "azure:mssql/managedDatabase:ManagedDatabase":
		r = &ManagedDatabase{}
	case "azure:mssql/managedInstance:ManagedInstance":
		r = &ManagedInstance{}
	case "azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator":
		r = &ManagedInstanceActiveDirectoryAdministrator{}
	case "azure:mssql/managedInstanceFailoverGroup:ManagedInstanceFailoverGroup":
		r = &ManagedInstanceFailoverGroup{}
	case "azure:mssql/managedInstanceSecurityAlertPolicy:ManagedInstanceSecurityAlertPolicy":
		r = &ManagedInstanceSecurityAlertPolicy{}
	case "azure:mssql/managedInstanceTransparentDataEncryption:ManagedInstanceTransparentDataEncryption":
		r = &ManagedInstanceTransparentDataEncryption{}
	case "azure:mssql/managedInstanceVulnerabilityAssessment:ManagedInstanceVulnerabilityAssessment":
		r = &ManagedInstanceVulnerabilityAssessment{}
	case "azure:mssql/outboundFirewallRule:OutboundFirewallRule":
		r = &OutboundFirewallRule{}
	case "azure:mssql/server:Server":
		r = &Server{}
	case "azure:mssql/serverDnsAlias:ServerDnsAlias":
		r = &ServerDnsAlias{}
	case "azure:mssql/serverExtendedAuditingPolicy:ServerExtendedAuditingPolicy":
		r = &ServerExtendedAuditingPolicy{}
	case "azure:mssql/serverMicrosoftSupportAuditingPolicy:ServerMicrosoftSupportAuditingPolicy":
		r = &ServerMicrosoftSupportAuditingPolicy{}
	case "azure:mssql/serverSecurityAlertPolicy:ServerSecurityAlertPolicy":
		r = &ServerSecurityAlertPolicy{}
	case "azure:mssql/serverTransparentDataEncryption:ServerTransparentDataEncryption":
		r = &ServerTransparentDataEncryption{}
	case "azure:mssql/serverVulnerabilityAssessment:ServerVulnerabilityAssessment":
		r = &ServerVulnerabilityAssessment{}
	case "azure:mssql/virtualMachine:VirtualMachine":
		r = &VirtualMachine{}
	case "azure:mssql/virtualMachineAvailabilityGroupListener:VirtualMachineAvailabilityGroupListener":
		r = &VirtualMachineAvailabilityGroupListener{}
	case "azure:mssql/virtualMachineGroup:VirtualMachineGroup":
		r = &VirtualMachineGroup{}
	case "azure:mssql/virtualNetworkRule:VirtualNetworkRule":
		r = &VirtualNetworkRule{}
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
		"mssql/database",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/databaseExtendedAuditingPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/databaseVulnerabilityAssessmentRuleBaseline",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/elasticPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/failoverGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/firewallRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/job",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/jobAgent",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/jobCredential",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/jobSchedule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/jobStep",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/jobTargetGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/managedDatabase",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/managedInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/managedInstanceActiveDirectoryAdministrator",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/managedInstanceFailoverGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/managedInstanceSecurityAlertPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/managedInstanceTransparentDataEncryption",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/managedInstanceVulnerabilityAssessment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/outboundFirewallRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/server",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/serverDnsAlias",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/serverExtendedAuditingPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/serverMicrosoftSupportAuditingPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/serverSecurityAlertPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/serverTransparentDataEncryption",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/serverVulnerabilityAssessment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/virtualMachine",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/virtualMachineAvailabilityGroupListener",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/virtualMachineGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"mssql/virtualNetworkRule",
		&module{version},
	)
}
