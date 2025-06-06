// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package loganalytics

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
	case "azure:loganalytics/cluster:Cluster":
		r = &Cluster{}
	case "azure:loganalytics/clusterCustomerManagedKey:ClusterCustomerManagedKey":
		r = &ClusterCustomerManagedKey{}
	case "azure:loganalytics/dataExportRule:DataExportRule":
		r = &DataExportRule{}
	case "azure:loganalytics/dataSourceWindowsEvent:DataSourceWindowsEvent":
		r = &DataSourceWindowsEvent{}
	case "azure:loganalytics/dataSourceWindowsPerformanceCounter:DataSourceWindowsPerformanceCounter":
		r = &DataSourceWindowsPerformanceCounter{}
	case "azure:loganalytics/linkedService:LinkedService":
		r = &LinkedService{}
	case "azure:loganalytics/linkedStorageAccount:LinkedStorageAccount":
		r = &LinkedStorageAccount{}
	case "azure:loganalytics/queryPack:QueryPack":
		r = &QueryPack{}
	case "azure:loganalytics/savedSearch:SavedSearch":
		r = &SavedSearch{}
	case "azure:loganalytics/storageInsights:StorageInsights":
		r = &StorageInsights{}
	case "azure:loganalytics/workspaceTable:WorkspaceTable":
		r = &WorkspaceTable{}
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
		"loganalytics/cluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/clusterCustomerManagedKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/dataExportRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/dataSourceWindowsEvent",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/dataSourceWindowsPerformanceCounter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/linkedService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/linkedStorageAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/queryPack",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/savedSearch",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/storageInsights",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"loganalytics/workspaceTable",
		&module{version},
	)
}
