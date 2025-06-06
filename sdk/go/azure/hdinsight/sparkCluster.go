// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hdinsight

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a HDInsight Spark Cluster.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/hdinsight"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("hdinsightstor"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleContainer, err := storage.NewContainer(ctx, "example", &storage.ContainerArgs{
//				Name:                pulumi.String("hdinsight"),
//				StorageAccountName:  exampleAccount.Name,
//				ContainerAccessType: pulumi.String("private"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hdinsight.NewSparkCluster(ctx, "example", &hdinsight.SparkClusterArgs{
//				Name:              pulumi.String("example-hdicluster"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				ClusterVersion:    pulumi.String("3.6"),
//				Tier:              pulumi.String("Standard"),
//				ComponentVersion: &hdinsight.SparkClusterComponentVersionArgs{
//					Spark: pulumi.String("2.3"),
//				},
//				Gateway: &hdinsight.SparkClusterGatewayArgs{
//					Username: pulumi.String("acctestusrgw"),
//					Password: pulumi.String("Password123!"),
//				},
//				StorageAccounts: hdinsight.SparkClusterStorageAccountArray{
//					&hdinsight.SparkClusterStorageAccountArgs{
//						StorageContainerId: exampleContainer.ID(),
//						StorageAccountKey:  exampleAccount.PrimaryAccessKey,
//						IsDefault:          pulumi.Bool(true),
//					},
//				},
//				Roles: &hdinsight.SparkClusterRolesArgs{
//					HeadNode: &hdinsight.SparkClusterRolesHeadNodeArgs{
//						VmSize:   pulumi.String("Standard_A3"),
//						Username: pulumi.String("acctestusrvm"),
//						Password: pulumi.String("AccTestvdSC4daf986!"),
//					},
//					WorkerNode: &hdinsight.SparkClusterRolesWorkerNodeArgs{
//						VmSize:              pulumi.String("Standard_A3"),
//						Username:            pulumi.String("acctestusrvm"),
//						Password:            pulumi.String("AccTestvdSC4daf986!"),
//						TargetInstanceCount: pulumi.Int(3),
//					},
//					ZookeeperNode: &hdinsight.SparkClusterRolesZookeeperNodeArgs{
//						VmSize:   pulumi.String("Medium"),
//						Username: pulumi.String("acctestusrvm"),
//						Password: pulumi.String("AccTestvdSC4daf986!"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.HDInsight`: 2021-06-01
//
// ## Import
//
// HDInsight Spark Clusters can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:hdinsight/sparkCluster:SparkCluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.HDInsight/clusters/cluster1
// ```
type SparkCluster struct {
	pulumi.CustomResourceState

	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion pulumi.StringOutput `pulumi:"clusterVersion"`
	// A `componentVersion` block as defined below.
	ComponentVersion SparkClusterComponentVersionOutput `pulumi:"componentVersion"`
	// A `computeIsolation` block as defined below.
	ComputeIsolation SparkClusterComputeIsolationPtrOutput `pulumi:"computeIsolation"`
	// One or more `diskEncryption` block as defined below.
	DiskEncryptions SparkClusterDiskEncryptionArrayOutput `pulumi:"diskEncryptions"`
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled pulumi.BoolPtrOutput `pulumi:"encryptionInTransitEnabled"`
	// An `extension` block as defined below.
	Extension SparkClusterExtensionPtrOutput `pulumi:"extension"`
	// A `gateway` block as defined below.
	Gateway SparkClusterGatewayOutput `pulumi:"gateway"`
	// The HTTPS Connectivity Endpoint for this HDInsight Spark Cluster.
	HttpsEndpoint pulumi.StringOutput `pulumi:"httpsEndpoint"`
	// Specifies the Azure Region which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// A `metastores` block as defined below.
	Metastores SparkClusterMetastoresPtrOutput `pulumi:"metastores"`
	// A `monitor` block as defined below.
	Monitor SparkClusterMonitorPtrOutput `pulumi:"monitor"`
	// Specifies the name for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A `network` block as defined below.
	Network SparkClusterNetworkPtrOutput `pulumi:"network"`
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration SparkClusterPrivateLinkConfigurationPtrOutput `pulumi:"privateLinkConfiguration"`
	// Specifies the name of the Resource Group in which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `roles` block as defined below.
	Roles SparkClusterRolesOutput `pulumi:"roles"`
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile SparkClusterSecurityProfilePtrOutput `pulumi:"securityProfile"`
	// The SSH Connectivity Endpoint for this HDInsight Spark Cluster.
	SshEndpoint pulumi.StringOutput `pulumi:"sshEndpoint"`
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 SparkClusterStorageAccountGen2PtrOutput `pulumi:"storageAccountGen2"`
	// One or more `storageAccount` block as defined below.
	StorageAccounts SparkClusterStorageAccountArrayOutput `pulumi:"storageAccounts"`
	// A map of Tags which should be assigned to this HDInsight Spark Cluster.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Specifies the Tier which should be used for this HDInsight Spark Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier pulumi.StringOutput `pulumi:"tier"`
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion pulumi.StringPtrOutput `pulumi:"tlsMinVersion"`
	// A list of Availability Zones which should be used for this HDInsight Spark Cluster. Chaning this forces a new resource to be created.
	Zones pulumi.StringArrayOutput `pulumi:"zones"`
}

// NewSparkCluster registers a new resource with the given unique name, arguments, and options.
func NewSparkCluster(ctx *pulumi.Context,
	name string, args *SparkClusterArgs, opts ...pulumi.ResourceOption) (*SparkCluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterVersion == nil {
		return nil, errors.New("invalid value for required argument 'ClusterVersion'")
	}
	if args.ComponentVersion == nil {
		return nil, errors.New("invalid value for required argument 'ComponentVersion'")
	}
	if args.Gateway == nil {
		return nil, errors.New("invalid value for required argument 'Gateway'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	if args.Tier == nil {
		return nil, errors.New("invalid value for required argument 'Tier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SparkCluster
	err := ctx.RegisterResource("azure:hdinsight/sparkCluster:SparkCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSparkCluster gets an existing SparkCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSparkCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SparkClusterState, opts ...pulumi.ResourceOption) (*SparkCluster, error) {
	var resource SparkCluster
	err := ctx.ReadResource("azure:hdinsight/sparkCluster:SparkCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SparkCluster resources.
type sparkClusterState struct {
	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion *string `pulumi:"clusterVersion"`
	// A `componentVersion` block as defined below.
	ComponentVersion *SparkClusterComponentVersion `pulumi:"componentVersion"`
	// A `computeIsolation` block as defined below.
	ComputeIsolation *SparkClusterComputeIsolation `pulumi:"computeIsolation"`
	// One or more `diskEncryption` block as defined below.
	DiskEncryptions []SparkClusterDiskEncryption `pulumi:"diskEncryptions"`
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled *bool `pulumi:"encryptionInTransitEnabled"`
	// An `extension` block as defined below.
	Extension *SparkClusterExtension `pulumi:"extension"`
	// A `gateway` block as defined below.
	Gateway *SparkClusterGateway `pulumi:"gateway"`
	// The HTTPS Connectivity Endpoint for this HDInsight Spark Cluster.
	HttpsEndpoint *string `pulumi:"httpsEndpoint"`
	// Specifies the Azure Region which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A `metastores` block as defined below.
	Metastores *SparkClusterMetastores `pulumi:"metastores"`
	// A `monitor` block as defined below.
	Monitor *SparkClusterMonitor `pulumi:"monitor"`
	// Specifies the name for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A `network` block as defined below.
	Network *SparkClusterNetwork `pulumi:"network"`
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration *SparkClusterPrivateLinkConfiguration `pulumi:"privateLinkConfiguration"`
	// Specifies the name of the Resource Group in which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `roles` block as defined below.
	Roles *SparkClusterRoles `pulumi:"roles"`
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile *SparkClusterSecurityProfile `pulumi:"securityProfile"`
	// The SSH Connectivity Endpoint for this HDInsight Spark Cluster.
	SshEndpoint *string `pulumi:"sshEndpoint"`
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 *SparkClusterStorageAccountGen2 `pulumi:"storageAccountGen2"`
	// One or more `storageAccount` block as defined below.
	StorageAccounts []SparkClusterStorageAccount `pulumi:"storageAccounts"`
	// A map of Tags which should be assigned to this HDInsight Spark Cluster.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the Tier which should be used for this HDInsight Spark Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier *string `pulumi:"tier"`
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion *string `pulumi:"tlsMinVersion"`
	// A list of Availability Zones which should be used for this HDInsight Spark Cluster. Chaning this forces a new resource to be created.
	Zones []string `pulumi:"zones"`
}

type SparkClusterState struct {
	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion pulumi.StringPtrInput
	// A `componentVersion` block as defined below.
	ComponentVersion SparkClusterComponentVersionPtrInput
	// A `computeIsolation` block as defined below.
	ComputeIsolation SparkClusterComputeIsolationPtrInput
	// One or more `diskEncryption` block as defined below.
	DiskEncryptions SparkClusterDiskEncryptionArrayInput
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled pulumi.BoolPtrInput
	// An `extension` block as defined below.
	Extension SparkClusterExtensionPtrInput
	// A `gateway` block as defined below.
	Gateway SparkClusterGatewayPtrInput
	// The HTTPS Connectivity Endpoint for this HDInsight Spark Cluster.
	HttpsEndpoint pulumi.StringPtrInput
	// Specifies the Azure Region which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A `metastores` block as defined below.
	Metastores SparkClusterMetastoresPtrInput
	// A `monitor` block as defined below.
	Monitor SparkClusterMonitorPtrInput
	// Specifies the name for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A `network` block as defined below.
	Network SparkClusterNetworkPtrInput
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration SparkClusterPrivateLinkConfigurationPtrInput
	// Specifies the name of the Resource Group in which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `roles` block as defined below.
	Roles SparkClusterRolesPtrInput
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile SparkClusterSecurityProfilePtrInput
	// The SSH Connectivity Endpoint for this HDInsight Spark Cluster.
	SshEndpoint pulumi.StringPtrInput
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 SparkClusterStorageAccountGen2PtrInput
	// One or more `storageAccount` block as defined below.
	StorageAccounts SparkClusterStorageAccountArrayInput
	// A map of Tags which should be assigned to this HDInsight Spark Cluster.
	Tags pulumi.StringMapInput
	// Specifies the Tier which should be used for this HDInsight Spark Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier pulumi.StringPtrInput
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion pulumi.StringPtrInput
	// A list of Availability Zones which should be used for this HDInsight Spark Cluster. Chaning this forces a new resource to be created.
	Zones pulumi.StringArrayInput
}

func (SparkClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*sparkClusterState)(nil)).Elem()
}

type sparkClusterArgs struct {
	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion string `pulumi:"clusterVersion"`
	// A `componentVersion` block as defined below.
	ComponentVersion SparkClusterComponentVersion `pulumi:"componentVersion"`
	// A `computeIsolation` block as defined below.
	ComputeIsolation *SparkClusterComputeIsolation `pulumi:"computeIsolation"`
	// One or more `diskEncryption` block as defined below.
	DiskEncryptions []SparkClusterDiskEncryption `pulumi:"diskEncryptions"`
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled *bool `pulumi:"encryptionInTransitEnabled"`
	// An `extension` block as defined below.
	Extension *SparkClusterExtension `pulumi:"extension"`
	// A `gateway` block as defined below.
	Gateway SparkClusterGateway `pulumi:"gateway"`
	// Specifies the Azure Region which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A `metastores` block as defined below.
	Metastores *SparkClusterMetastores `pulumi:"metastores"`
	// A `monitor` block as defined below.
	Monitor *SparkClusterMonitor `pulumi:"monitor"`
	// Specifies the name for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A `network` block as defined below.
	Network *SparkClusterNetwork `pulumi:"network"`
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration *SparkClusterPrivateLinkConfiguration `pulumi:"privateLinkConfiguration"`
	// Specifies the name of the Resource Group in which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `roles` block as defined below.
	Roles SparkClusterRoles `pulumi:"roles"`
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile *SparkClusterSecurityProfile `pulumi:"securityProfile"`
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 *SparkClusterStorageAccountGen2 `pulumi:"storageAccountGen2"`
	// One or more `storageAccount` block as defined below.
	StorageAccounts []SparkClusterStorageAccount `pulumi:"storageAccounts"`
	// A map of Tags which should be assigned to this HDInsight Spark Cluster.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the Tier which should be used for this HDInsight Spark Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier string `pulumi:"tier"`
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion *string `pulumi:"tlsMinVersion"`
	// A list of Availability Zones which should be used for this HDInsight Spark Cluster. Chaning this forces a new resource to be created.
	Zones []string `pulumi:"zones"`
}

// The set of arguments for constructing a SparkCluster resource.
type SparkClusterArgs struct {
	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion pulumi.StringInput
	// A `componentVersion` block as defined below.
	ComponentVersion SparkClusterComponentVersionInput
	// A `computeIsolation` block as defined below.
	ComputeIsolation SparkClusterComputeIsolationPtrInput
	// One or more `diskEncryption` block as defined below.
	DiskEncryptions SparkClusterDiskEncryptionArrayInput
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled pulumi.BoolPtrInput
	// An `extension` block as defined below.
	Extension SparkClusterExtensionPtrInput
	// A `gateway` block as defined below.
	Gateway SparkClusterGatewayInput
	// Specifies the Azure Region which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A `metastores` block as defined below.
	Metastores SparkClusterMetastoresPtrInput
	// A `monitor` block as defined below.
	Monitor SparkClusterMonitorPtrInput
	// Specifies the name for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A `network` block as defined below.
	Network SparkClusterNetworkPtrInput
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration SparkClusterPrivateLinkConfigurationPtrInput
	// Specifies the name of the Resource Group in which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A `roles` block as defined below.
	Roles SparkClusterRolesInput
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile SparkClusterSecurityProfilePtrInput
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 SparkClusterStorageAccountGen2PtrInput
	// One or more `storageAccount` block as defined below.
	StorageAccounts SparkClusterStorageAccountArrayInput
	// A map of Tags which should be assigned to this HDInsight Spark Cluster.
	Tags pulumi.StringMapInput
	// Specifies the Tier which should be used for this HDInsight Spark Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier pulumi.StringInput
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion pulumi.StringPtrInput
	// A list of Availability Zones which should be used for this HDInsight Spark Cluster. Chaning this forces a new resource to be created.
	Zones pulumi.StringArrayInput
}

func (SparkClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sparkClusterArgs)(nil)).Elem()
}

type SparkClusterInput interface {
	pulumi.Input

	ToSparkClusterOutput() SparkClusterOutput
	ToSparkClusterOutputWithContext(ctx context.Context) SparkClusterOutput
}

func (*SparkCluster) ElementType() reflect.Type {
	return reflect.TypeOf((**SparkCluster)(nil)).Elem()
}

func (i *SparkCluster) ToSparkClusterOutput() SparkClusterOutput {
	return i.ToSparkClusterOutputWithContext(context.Background())
}

func (i *SparkCluster) ToSparkClusterOutputWithContext(ctx context.Context) SparkClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SparkClusterOutput)
}

// SparkClusterArrayInput is an input type that accepts SparkClusterArray and SparkClusterArrayOutput values.
// You can construct a concrete instance of `SparkClusterArrayInput` via:
//
//	SparkClusterArray{ SparkClusterArgs{...} }
type SparkClusterArrayInput interface {
	pulumi.Input

	ToSparkClusterArrayOutput() SparkClusterArrayOutput
	ToSparkClusterArrayOutputWithContext(context.Context) SparkClusterArrayOutput
}

type SparkClusterArray []SparkClusterInput

func (SparkClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SparkCluster)(nil)).Elem()
}

func (i SparkClusterArray) ToSparkClusterArrayOutput() SparkClusterArrayOutput {
	return i.ToSparkClusterArrayOutputWithContext(context.Background())
}

func (i SparkClusterArray) ToSparkClusterArrayOutputWithContext(ctx context.Context) SparkClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SparkClusterArrayOutput)
}

// SparkClusterMapInput is an input type that accepts SparkClusterMap and SparkClusterMapOutput values.
// You can construct a concrete instance of `SparkClusterMapInput` via:
//
//	SparkClusterMap{ "key": SparkClusterArgs{...} }
type SparkClusterMapInput interface {
	pulumi.Input

	ToSparkClusterMapOutput() SparkClusterMapOutput
	ToSparkClusterMapOutputWithContext(context.Context) SparkClusterMapOutput
}

type SparkClusterMap map[string]SparkClusterInput

func (SparkClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SparkCluster)(nil)).Elem()
}

func (i SparkClusterMap) ToSparkClusterMapOutput() SparkClusterMapOutput {
	return i.ToSparkClusterMapOutputWithContext(context.Background())
}

func (i SparkClusterMap) ToSparkClusterMapOutputWithContext(ctx context.Context) SparkClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SparkClusterMapOutput)
}

type SparkClusterOutput struct{ *pulumi.OutputState }

func (SparkClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SparkCluster)(nil)).Elem()
}

func (o SparkClusterOutput) ToSparkClusterOutput() SparkClusterOutput {
	return o
}

func (o SparkClusterOutput) ToSparkClusterOutputWithContext(ctx context.Context) SparkClusterOutput {
	return o
}

// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
func (o SparkClusterOutput) ClusterVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringOutput { return v.ClusterVersion }).(pulumi.StringOutput)
}

// A `componentVersion` block as defined below.
func (o SparkClusterOutput) ComponentVersion() SparkClusterComponentVersionOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterComponentVersionOutput { return v.ComponentVersion }).(SparkClusterComponentVersionOutput)
}

// A `computeIsolation` block as defined below.
func (o SparkClusterOutput) ComputeIsolation() SparkClusterComputeIsolationPtrOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterComputeIsolationPtrOutput { return v.ComputeIsolation }).(SparkClusterComputeIsolationPtrOutput)
}

// One or more `diskEncryption` block as defined below.
func (o SparkClusterOutput) DiskEncryptions() SparkClusterDiskEncryptionArrayOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterDiskEncryptionArrayOutput { return v.DiskEncryptions }).(SparkClusterDiskEncryptionArrayOutput)
}

// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
func (o SparkClusterOutput) EncryptionInTransitEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.BoolPtrOutput { return v.EncryptionInTransitEnabled }).(pulumi.BoolPtrOutput)
}

// An `extension` block as defined below.
func (o SparkClusterOutput) Extension() SparkClusterExtensionPtrOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterExtensionPtrOutput { return v.Extension }).(SparkClusterExtensionPtrOutput)
}

// A `gateway` block as defined below.
func (o SparkClusterOutput) Gateway() SparkClusterGatewayOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterGatewayOutput { return v.Gateway }).(SparkClusterGatewayOutput)
}

// The HTTPS Connectivity Endpoint for this HDInsight Spark Cluster.
func (o SparkClusterOutput) HttpsEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringOutput { return v.HttpsEndpoint }).(pulumi.StringOutput)
}

// Specifies the Azure Region which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
func (o SparkClusterOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// A `metastores` block as defined below.
func (o SparkClusterOutput) Metastores() SparkClusterMetastoresPtrOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterMetastoresPtrOutput { return v.Metastores }).(SparkClusterMetastoresPtrOutput)
}

// A `monitor` block as defined below.
func (o SparkClusterOutput) Monitor() SparkClusterMonitorPtrOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterMonitorPtrOutput { return v.Monitor }).(SparkClusterMonitorPtrOutput)
}

// Specifies the name for this HDInsight Spark Cluster. Changing this forces a new resource to be created.
func (o SparkClusterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A `network` block as defined below.
func (o SparkClusterOutput) Network() SparkClusterNetworkPtrOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterNetworkPtrOutput { return v.Network }).(SparkClusterNetworkPtrOutput)
}

// A `privateLinkConfiguration` block as defined below.
func (o SparkClusterOutput) PrivateLinkConfiguration() SparkClusterPrivateLinkConfigurationPtrOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterPrivateLinkConfigurationPtrOutput { return v.PrivateLinkConfiguration }).(SparkClusterPrivateLinkConfigurationPtrOutput)
}

// Specifies the name of the Resource Group in which this HDInsight Spark Cluster should exist. Changing this forces a new resource to be created.
func (o SparkClusterOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `roles` block as defined below.
func (o SparkClusterOutput) Roles() SparkClusterRolesOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterRolesOutput { return v.Roles }).(SparkClusterRolesOutput)
}

// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
func (o SparkClusterOutput) SecurityProfile() SparkClusterSecurityProfilePtrOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterSecurityProfilePtrOutput { return v.SecurityProfile }).(SparkClusterSecurityProfilePtrOutput)
}

// The SSH Connectivity Endpoint for this HDInsight Spark Cluster.
func (o SparkClusterOutput) SshEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringOutput { return v.SshEndpoint }).(pulumi.StringOutput)
}

// A `storageAccountGen2` block as defined below.
func (o SparkClusterOutput) StorageAccountGen2() SparkClusterStorageAccountGen2PtrOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterStorageAccountGen2PtrOutput { return v.StorageAccountGen2 }).(SparkClusterStorageAccountGen2PtrOutput)
}

// One or more `storageAccount` block as defined below.
func (o SparkClusterOutput) StorageAccounts() SparkClusterStorageAccountArrayOutput {
	return o.ApplyT(func(v *SparkCluster) SparkClusterStorageAccountArrayOutput { return v.StorageAccounts }).(SparkClusterStorageAccountArrayOutput)
}

// A map of Tags which should be assigned to this HDInsight Spark Cluster.
func (o SparkClusterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Specifies the Tier which should be used for this HDInsight Spark Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
func (o SparkClusterOutput) Tier() pulumi.StringOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringOutput { return v.Tier }).(pulumi.StringOutput)
}

// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
//
// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
func (o SparkClusterOutput) TlsMinVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringPtrOutput { return v.TlsMinVersion }).(pulumi.StringPtrOutput)
}

// A list of Availability Zones which should be used for this HDInsight Spark Cluster. Chaning this forces a new resource to be created.
func (o SparkClusterOutput) Zones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SparkCluster) pulumi.StringArrayOutput { return v.Zones }).(pulumi.StringArrayOutput)
}

type SparkClusterArrayOutput struct{ *pulumi.OutputState }

func (SparkClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SparkCluster)(nil)).Elem()
}

func (o SparkClusterArrayOutput) ToSparkClusterArrayOutput() SparkClusterArrayOutput {
	return o
}

func (o SparkClusterArrayOutput) ToSparkClusterArrayOutputWithContext(ctx context.Context) SparkClusterArrayOutput {
	return o
}

func (o SparkClusterArrayOutput) Index(i pulumi.IntInput) SparkClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SparkCluster {
		return vs[0].([]*SparkCluster)[vs[1].(int)]
	}).(SparkClusterOutput)
}

type SparkClusterMapOutput struct{ *pulumi.OutputState }

func (SparkClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SparkCluster)(nil)).Elem()
}

func (o SparkClusterMapOutput) ToSparkClusterMapOutput() SparkClusterMapOutput {
	return o
}

func (o SparkClusterMapOutput) ToSparkClusterMapOutputWithContext(ctx context.Context) SparkClusterMapOutput {
	return o
}

func (o SparkClusterMapOutput) MapIndex(k pulumi.StringInput) SparkClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SparkCluster {
		return vs[0].(map[string]*SparkCluster)[vs[1].(string)]
	}).(SparkClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SparkClusterInput)(nil)).Elem(), &SparkCluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*SparkClusterArrayInput)(nil)).Elem(), SparkClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SparkClusterMapInput)(nil)).Elem(), SparkClusterMap{})
	pulumi.RegisterOutputType(SparkClusterOutput{})
	pulumi.RegisterOutputType(SparkClusterArrayOutput{})
	pulumi.RegisterOutputType(SparkClusterMapOutput{})
}
