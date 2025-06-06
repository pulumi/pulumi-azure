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

// Manages a HDInsight Interactive Query Cluster.
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
//			_, err = hdinsight.NewInteractiveQueryCluster(ctx, "example", &hdinsight.InteractiveQueryClusterArgs{
//				Name:              pulumi.String("example-hdicluster"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				ClusterVersion:    pulumi.String("3.6"),
//				Tier:              pulumi.String("Standard"),
//				ComponentVersion: &hdinsight.InteractiveQueryClusterComponentVersionArgs{
//					InteractiveHive: pulumi.String("2.1"),
//				},
//				Gateway: &hdinsight.InteractiveQueryClusterGatewayArgs{
//					Username: pulumi.String("acctestusrgw"),
//					Password: pulumi.String("Password!"),
//				},
//				StorageAccounts: hdinsight.InteractiveQueryClusterStorageAccountArray{
//					&hdinsight.InteractiveQueryClusterStorageAccountArgs{
//						StorageContainerId: exampleContainer.ID(),
//						StorageAccountKey:  exampleAccount.PrimaryAccessKey,
//						IsDefault:          pulumi.Bool(true),
//					},
//				},
//				Roles: &hdinsight.InteractiveQueryClusterRolesArgs{
//					HeadNode: &hdinsight.InteractiveQueryClusterRolesHeadNodeArgs{
//						VmSize:   pulumi.String("Standard_D13_V2"),
//						Username: pulumi.String("acctestusrvm"),
//						Password: pulumi.String("AccTestvdSC4daf986!"),
//					},
//					WorkerNode: &hdinsight.InteractiveQueryClusterRolesWorkerNodeArgs{
//						VmSize:              pulumi.String("Standard_D14_V2"),
//						Username:            pulumi.String("acctestusrvm"),
//						Password:            pulumi.String("AccTestvdSC4daf986!"),
//						TargetInstanceCount: pulumi.Int(3),
//					},
//					ZookeeperNode: &hdinsight.InteractiveQueryClusterRolesZookeeperNodeArgs{
//						VmSize:   pulumi.String("Standard_A4_V2"),
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
// HDInsight Interactive Query Clusters can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:hdinsight/interactiveQueryCluster:InteractiveQueryCluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.HDInsight/clusters/cluster1
// ```
type InteractiveQueryCluster struct {
	pulumi.CustomResourceState

	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion pulumi.StringOutput `pulumi:"clusterVersion"`
	// A `componentVersion` block as defined below.
	ComponentVersion InteractiveQueryClusterComponentVersionOutput `pulumi:"componentVersion"`
	// A `computeIsolation` block as defined below.
	ComputeIsolation InteractiveQueryClusterComputeIsolationPtrOutput `pulumi:"computeIsolation"`
	// A `diskEncryption` block as defined below.
	DiskEncryptions InteractiveQueryClusterDiskEncryptionArrayOutput `pulumi:"diskEncryptions"`
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled pulumi.BoolPtrOutput `pulumi:"encryptionInTransitEnabled"`
	// An `extension` block as defined below.
	Extension InteractiveQueryClusterExtensionPtrOutput `pulumi:"extension"`
	// A `gateway` block as defined below.
	Gateway InteractiveQueryClusterGatewayOutput `pulumi:"gateway"`
	// The HTTPS Connectivity Endpoint for this HDInsight Interactive Query Cluster.
	HttpsEndpoint pulumi.StringOutput `pulumi:"httpsEndpoint"`
	// Specifies the Azure Region which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// A `metastores` block as defined below.
	Metastores InteractiveQueryClusterMetastoresPtrOutput `pulumi:"metastores"`
	// A `monitor` block as defined below.
	Monitor InteractiveQueryClusterMonitorPtrOutput `pulumi:"monitor"`
	// Specifies the name for this HDInsight Interactive Query Cluster. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A `network` block as defined below.
	Network InteractiveQueryClusterNetworkPtrOutput `pulumi:"network"`
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration InteractiveQueryClusterPrivateLinkConfigurationPtrOutput `pulumi:"privateLinkConfiguration"`
	// Specifies the name of the Resource Group in which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `roles` block as defined below.
	Roles InteractiveQueryClusterRolesOutput `pulumi:"roles"`
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile InteractiveQueryClusterSecurityProfilePtrOutput `pulumi:"securityProfile"`
	// The SSH Connectivity Endpoint for this HDInsight Interactive Query Cluster.
	SshEndpoint pulumi.StringOutput `pulumi:"sshEndpoint"`
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 InteractiveQueryClusterStorageAccountGen2PtrOutput `pulumi:"storageAccountGen2"`
	// One or more `storageAccount` block as defined below.
	StorageAccounts InteractiveQueryClusterStorageAccountArrayOutput `pulumi:"storageAccounts"`
	// A map of Tags which should be assigned to this HDInsight Interactive Query Cluster.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Specifies the Tier which should be used for this HDInsight Interactive Query Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier pulumi.StringOutput `pulumi:"tier"`
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion pulumi.StringPtrOutput `pulumi:"tlsMinVersion"`
}

// NewInteractiveQueryCluster registers a new resource with the given unique name, arguments, and options.
func NewInteractiveQueryCluster(ctx *pulumi.Context,
	name string, args *InteractiveQueryClusterArgs, opts ...pulumi.ResourceOption) (*InteractiveQueryCluster, error) {
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
	var resource InteractiveQueryCluster
	err := ctx.RegisterResource("azure:hdinsight/interactiveQueryCluster:InteractiveQueryCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInteractiveQueryCluster gets an existing InteractiveQueryCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInteractiveQueryCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InteractiveQueryClusterState, opts ...pulumi.ResourceOption) (*InteractiveQueryCluster, error) {
	var resource InteractiveQueryCluster
	err := ctx.ReadResource("azure:hdinsight/interactiveQueryCluster:InteractiveQueryCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InteractiveQueryCluster resources.
type interactiveQueryClusterState struct {
	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion *string `pulumi:"clusterVersion"`
	// A `componentVersion` block as defined below.
	ComponentVersion *InteractiveQueryClusterComponentVersion `pulumi:"componentVersion"`
	// A `computeIsolation` block as defined below.
	ComputeIsolation *InteractiveQueryClusterComputeIsolation `pulumi:"computeIsolation"`
	// A `diskEncryption` block as defined below.
	DiskEncryptions []InteractiveQueryClusterDiskEncryption `pulumi:"diskEncryptions"`
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled *bool `pulumi:"encryptionInTransitEnabled"`
	// An `extension` block as defined below.
	Extension *InteractiveQueryClusterExtension `pulumi:"extension"`
	// A `gateway` block as defined below.
	Gateway *InteractiveQueryClusterGateway `pulumi:"gateway"`
	// The HTTPS Connectivity Endpoint for this HDInsight Interactive Query Cluster.
	HttpsEndpoint *string `pulumi:"httpsEndpoint"`
	// Specifies the Azure Region which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A `metastores` block as defined below.
	Metastores *InteractiveQueryClusterMetastores `pulumi:"metastores"`
	// A `monitor` block as defined below.
	Monitor *InteractiveQueryClusterMonitor `pulumi:"monitor"`
	// Specifies the name for this HDInsight Interactive Query Cluster. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A `network` block as defined below.
	Network *InteractiveQueryClusterNetwork `pulumi:"network"`
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration *InteractiveQueryClusterPrivateLinkConfiguration `pulumi:"privateLinkConfiguration"`
	// Specifies the name of the Resource Group in which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `roles` block as defined below.
	Roles *InteractiveQueryClusterRoles `pulumi:"roles"`
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile *InteractiveQueryClusterSecurityProfile `pulumi:"securityProfile"`
	// The SSH Connectivity Endpoint for this HDInsight Interactive Query Cluster.
	SshEndpoint *string `pulumi:"sshEndpoint"`
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 *InteractiveQueryClusterStorageAccountGen2 `pulumi:"storageAccountGen2"`
	// One or more `storageAccount` block as defined below.
	StorageAccounts []InteractiveQueryClusterStorageAccount `pulumi:"storageAccounts"`
	// A map of Tags which should be assigned to this HDInsight Interactive Query Cluster.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the Tier which should be used for this HDInsight Interactive Query Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier *string `pulumi:"tier"`
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion *string `pulumi:"tlsMinVersion"`
}

type InteractiveQueryClusterState struct {
	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion pulumi.StringPtrInput
	// A `componentVersion` block as defined below.
	ComponentVersion InteractiveQueryClusterComponentVersionPtrInput
	// A `computeIsolation` block as defined below.
	ComputeIsolation InteractiveQueryClusterComputeIsolationPtrInput
	// A `diskEncryption` block as defined below.
	DiskEncryptions InteractiveQueryClusterDiskEncryptionArrayInput
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled pulumi.BoolPtrInput
	// An `extension` block as defined below.
	Extension InteractiveQueryClusterExtensionPtrInput
	// A `gateway` block as defined below.
	Gateway InteractiveQueryClusterGatewayPtrInput
	// The HTTPS Connectivity Endpoint for this HDInsight Interactive Query Cluster.
	HttpsEndpoint pulumi.StringPtrInput
	// Specifies the Azure Region which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A `metastores` block as defined below.
	Metastores InteractiveQueryClusterMetastoresPtrInput
	// A `monitor` block as defined below.
	Monitor InteractiveQueryClusterMonitorPtrInput
	// Specifies the name for this HDInsight Interactive Query Cluster. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A `network` block as defined below.
	Network InteractiveQueryClusterNetworkPtrInput
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration InteractiveQueryClusterPrivateLinkConfigurationPtrInput
	// Specifies the name of the Resource Group in which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `roles` block as defined below.
	Roles InteractiveQueryClusterRolesPtrInput
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile InteractiveQueryClusterSecurityProfilePtrInput
	// The SSH Connectivity Endpoint for this HDInsight Interactive Query Cluster.
	SshEndpoint pulumi.StringPtrInput
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 InteractiveQueryClusterStorageAccountGen2PtrInput
	// One or more `storageAccount` block as defined below.
	StorageAccounts InteractiveQueryClusterStorageAccountArrayInput
	// A map of Tags which should be assigned to this HDInsight Interactive Query Cluster.
	Tags pulumi.StringMapInput
	// Specifies the Tier which should be used for this HDInsight Interactive Query Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier pulumi.StringPtrInput
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion pulumi.StringPtrInput
}

func (InteractiveQueryClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*interactiveQueryClusterState)(nil)).Elem()
}

type interactiveQueryClusterArgs struct {
	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion string `pulumi:"clusterVersion"`
	// A `componentVersion` block as defined below.
	ComponentVersion InteractiveQueryClusterComponentVersion `pulumi:"componentVersion"`
	// A `computeIsolation` block as defined below.
	ComputeIsolation *InteractiveQueryClusterComputeIsolation `pulumi:"computeIsolation"`
	// A `diskEncryption` block as defined below.
	DiskEncryptions []InteractiveQueryClusterDiskEncryption `pulumi:"diskEncryptions"`
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled *bool `pulumi:"encryptionInTransitEnabled"`
	// An `extension` block as defined below.
	Extension *InteractiveQueryClusterExtension `pulumi:"extension"`
	// A `gateway` block as defined below.
	Gateway InteractiveQueryClusterGateway `pulumi:"gateway"`
	// Specifies the Azure Region which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A `metastores` block as defined below.
	Metastores *InteractiveQueryClusterMetastores `pulumi:"metastores"`
	// A `monitor` block as defined below.
	Monitor *InteractiveQueryClusterMonitor `pulumi:"monitor"`
	// Specifies the name for this HDInsight Interactive Query Cluster. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A `network` block as defined below.
	Network *InteractiveQueryClusterNetwork `pulumi:"network"`
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration *InteractiveQueryClusterPrivateLinkConfiguration `pulumi:"privateLinkConfiguration"`
	// Specifies the name of the Resource Group in which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `roles` block as defined below.
	Roles InteractiveQueryClusterRoles `pulumi:"roles"`
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile *InteractiveQueryClusterSecurityProfile `pulumi:"securityProfile"`
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 *InteractiveQueryClusterStorageAccountGen2 `pulumi:"storageAccountGen2"`
	// One or more `storageAccount` block as defined below.
	StorageAccounts []InteractiveQueryClusterStorageAccount `pulumi:"storageAccounts"`
	// A map of Tags which should be assigned to this HDInsight Interactive Query Cluster.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the Tier which should be used for this HDInsight Interactive Query Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier string `pulumi:"tier"`
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion *string `pulumi:"tlsMinVersion"`
}

// The set of arguments for constructing a InteractiveQueryCluster resource.
type InteractiveQueryClusterArgs struct {
	// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
	ClusterVersion pulumi.StringInput
	// A `componentVersion` block as defined below.
	ComponentVersion InteractiveQueryClusterComponentVersionInput
	// A `computeIsolation` block as defined below.
	ComputeIsolation InteractiveQueryClusterComputeIsolationPtrInput
	// A `diskEncryption` block as defined below.
	DiskEncryptions InteractiveQueryClusterDiskEncryptionArrayInput
	// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
	EncryptionInTransitEnabled pulumi.BoolPtrInput
	// An `extension` block as defined below.
	Extension InteractiveQueryClusterExtensionPtrInput
	// A `gateway` block as defined below.
	Gateway InteractiveQueryClusterGatewayInput
	// Specifies the Azure Region which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A `metastores` block as defined below.
	Metastores InteractiveQueryClusterMetastoresPtrInput
	// A `monitor` block as defined below.
	Monitor InteractiveQueryClusterMonitorPtrInput
	// Specifies the name for this HDInsight Interactive Query Cluster. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A `network` block as defined below.
	Network InteractiveQueryClusterNetworkPtrInput
	// A `privateLinkConfiguration` block as defined below.
	PrivateLinkConfiguration InteractiveQueryClusterPrivateLinkConfigurationPtrInput
	// Specifies the name of the Resource Group in which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A `roles` block as defined below.
	Roles InteractiveQueryClusterRolesInput
	// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
	SecurityProfile InteractiveQueryClusterSecurityProfilePtrInput
	// A `storageAccountGen2` block as defined below.
	StorageAccountGen2 InteractiveQueryClusterStorageAccountGen2PtrInput
	// One or more `storageAccount` block as defined below.
	StorageAccounts InteractiveQueryClusterStorageAccountArrayInput
	// A map of Tags which should be assigned to this HDInsight Interactive Query Cluster.
	Tags pulumi.StringMapInput
	// Specifies the Tier which should be used for this HDInsight Interactive Query Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
	Tier pulumi.StringInput
	// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
	//
	// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
	TlsMinVersion pulumi.StringPtrInput
}

func (InteractiveQueryClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*interactiveQueryClusterArgs)(nil)).Elem()
}

type InteractiveQueryClusterInput interface {
	pulumi.Input

	ToInteractiveQueryClusterOutput() InteractiveQueryClusterOutput
	ToInteractiveQueryClusterOutputWithContext(ctx context.Context) InteractiveQueryClusterOutput
}

func (*InteractiveQueryCluster) ElementType() reflect.Type {
	return reflect.TypeOf((**InteractiveQueryCluster)(nil)).Elem()
}

func (i *InteractiveQueryCluster) ToInteractiveQueryClusterOutput() InteractiveQueryClusterOutput {
	return i.ToInteractiveQueryClusterOutputWithContext(context.Background())
}

func (i *InteractiveQueryCluster) ToInteractiveQueryClusterOutputWithContext(ctx context.Context) InteractiveQueryClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InteractiveQueryClusterOutput)
}

// InteractiveQueryClusterArrayInput is an input type that accepts InteractiveQueryClusterArray and InteractiveQueryClusterArrayOutput values.
// You can construct a concrete instance of `InteractiveQueryClusterArrayInput` via:
//
//	InteractiveQueryClusterArray{ InteractiveQueryClusterArgs{...} }
type InteractiveQueryClusterArrayInput interface {
	pulumi.Input

	ToInteractiveQueryClusterArrayOutput() InteractiveQueryClusterArrayOutput
	ToInteractiveQueryClusterArrayOutputWithContext(context.Context) InteractiveQueryClusterArrayOutput
}

type InteractiveQueryClusterArray []InteractiveQueryClusterInput

func (InteractiveQueryClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InteractiveQueryCluster)(nil)).Elem()
}

func (i InteractiveQueryClusterArray) ToInteractiveQueryClusterArrayOutput() InteractiveQueryClusterArrayOutput {
	return i.ToInteractiveQueryClusterArrayOutputWithContext(context.Background())
}

func (i InteractiveQueryClusterArray) ToInteractiveQueryClusterArrayOutputWithContext(ctx context.Context) InteractiveQueryClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InteractiveQueryClusterArrayOutput)
}

// InteractiveQueryClusterMapInput is an input type that accepts InteractiveQueryClusterMap and InteractiveQueryClusterMapOutput values.
// You can construct a concrete instance of `InteractiveQueryClusterMapInput` via:
//
//	InteractiveQueryClusterMap{ "key": InteractiveQueryClusterArgs{...} }
type InteractiveQueryClusterMapInput interface {
	pulumi.Input

	ToInteractiveQueryClusterMapOutput() InteractiveQueryClusterMapOutput
	ToInteractiveQueryClusterMapOutputWithContext(context.Context) InteractiveQueryClusterMapOutput
}

type InteractiveQueryClusterMap map[string]InteractiveQueryClusterInput

func (InteractiveQueryClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InteractiveQueryCluster)(nil)).Elem()
}

func (i InteractiveQueryClusterMap) ToInteractiveQueryClusterMapOutput() InteractiveQueryClusterMapOutput {
	return i.ToInteractiveQueryClusterMapOutputWithContext(context.Background())
}

func (i InteractiveQueryClusterMap) ToInteractiveQueryClusterMapOutputWithContext(ctx context.Context) InteractiveQueryClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InteractiveQueryClusterMapOutput)
}

type InteractiveQueryClusterOutput struct{ *pulumi.OutputState }

func (InteractiveQueryClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InteractiveQueryCluster)(nil)).Elem()
}

func (o InteractiveQueryClusterOutput) ToInteractiveQueryClusterOutput() InteractiveQueryClusterOutput {
	return o
}

func (o InteractiveQueryClusterOutput) ToInteractiveQueryClusterOutputWithContext(ctx context.Context) InteractiveQueryClusterOutput {
	return o
}

// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
func (o InteractiveQueryClusterOutput) ClusterVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.StringOutput { return v.ClusterVersion }).(pulumi.StringOutput)
}

// A `componentVersion` block as defined below.
func (o InteractiveQueryClusterOutput) ComponentVersion() InteractiveQueryClusterComponentVersionOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterComponentVersionOutput {
		return v.ComponentVersion
	}).(InteractiveQueryClusterComponentVersionOutput)
}

// A `computeIsolation` block as defined below.
func (o InteractiveQueryClusterOutput) ComputeIsolation() InteractiveQueryClusterComputeIsolationPtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterComputeIsolationPtrOutput {
		return v.ComputeIsolation
	}).(InteractiveQueryClusterComputeIsolationPtrOutput)
}

// A `diskEncryption` block as defined below.
func (o InteractiveQueryClusterOutput) DiskEncryptions() InteractiveQueryClusterDiskEncryptionArrayOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterDiskEncryptionArrayOutput {
		return v.DiskEncryptions
	}).(InteractiveQueryClusterDiskEncryptionArrayOutput)
}

// Whether encryption in transit is enabled for this Cluster. Changing this forces a new resource to be created.
func (o InteractiveQueryClusterOutput) EncryptionInTransitEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.BoolPtrOutput { return v.EncryptionInTransitEnabled }).(pulumi.BoolPtrOutput)
}

// An `extension` block as defined below.
func (o InteractiveQueryClusterOutput) Extension() InteractiveQueryClusterExtensionPtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterExtensionPtrOutput { return v.Extension }).(InteractiveQueryClusterExtensionPtrOutput)
}

// A `gateway` block as defined below.
func (o InteractiveQueryClusterOutput) Gateway() InteractiveQueryClusterGatewayOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterGatewayOutput { return v.Gateway }).(InteractiveQueryClusterGatewayOutput)
}

// The HTTPS Connectivity Endpoint for this HDInsight Interactive Query Cluster.
func (o InteractiveQueryClusterOutput) HttpsEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.StringOutput { return v.HttpsEndpoint }).(pulumi.StringOutput)
}

// Specifies the Azure Region which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
func (o InteractiveQueryClusterOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// A `metastores` block as defined below.
func (o InteractiveQueryClusterOutput) Metastores() InteractiveQueryClusterMetastoresPtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterMetastoresPtrOutput { return v.Metastores }).(InteractiveQueryClusterMetastoresPtrOutput)
}

// A `monitor` block as defined below.
func (o InteractiveQueryClusterOutput) Monitor() InteractiveQueryClusterMonitorPtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterMonitorPtrOutput { return v.Monitor }).(InteractiveQueryClusterMonitorPtrOutput)
}

// Specifies the name for this HDInsight Interactive Query Cluster. Changing this forces a new resource to be created.
func (o InteractiveQueryClusterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A `network` block as defined below.
func (o InteractiveQueryClusterOutput) Network() InteractiveQueryClusterNetworkPtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterNetworkPtrOutput { return v.Network }).(InteractiveQueryClusterNetworkPtrOutput)
}

// A `privateLinkConfiguration` block as defined below.
func (o InteractiveQueryClusterOutput) PrivateLinkConfiguration() InteractiveQueryClusterPrivateLinkConfigurationPtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterPrivateLinkConfigurationPtrOutput {
		return v.PrivateLinkConfiguration
	}).(InteractiveQueryClusterPrivateLinkConfigurationPtrOutput)
}

// Specifies the name of the Resource Group in which this HDInsight Interactive Query Cluster should exist. Changing this forces a new resource to be created.
func (o InteractiveQueryClusterOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `roles` block as defined below.
func (o InteractiveQueryClusterOutput) Roles() InteractiveQueryClusterRolesOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterRolesOutput { return v.Roles }).(InteractiveQueryClusterRolesOutput)
}

// A `securityProfile` block as defined below. Changing this forces a new resource to be created.
func (o InteractiveQueryClusterOutput) SecurityProfile() InteractiveQueryClusterSecurityProfilePtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterSecurityProfilePtrOutput {
		return v.SecurityProfile
	}).(InteractiveQueryClusterSecurityProfilePtrOutput)
}

// The SSH Connectivity Endpoint for this HDInsight Interactive Query Cluster.
func (o InteractiveQueryClusterOutput) SshEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.StringOutput { return v.SshEndpoint }).(pulumi.StringOutput)
}

// A `storageAccountGen2` block as defined below.
func (o InteractiveQueryClusterOutput) StorageAccountGen2() InteractiveQueryClusterStorageAccountGen2PtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterStorageAccountGen2PtrOutput {
		return v.StorageAccountGen2
	}).(InteractiveQueryClusterStorageAccountGen2PtrOutput)
}

// One or more `storageAccount` block as defined below.
func (o InteractiveQueryClusterOutput) StorageAccounts() InteractiveQueryClusterStorageAccountArrayOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) InteractiveQueryClusterStorageAccountArrayOutput {
		return v.StorageAccounts
	}).(InteractiveQueryClusterStorageAccountArrayOutput)
}

// A map of Tags which should be assigned to this HDInsight Interactive Query Cluster.
func (o InteractiveQueryClusterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Specifies the Tier which should be used for this HDInsight Interactive Query Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
func (o InteractiveQueryClusterOutput) Tier() pulumi.StringOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.StringOutput { return v.Tier }).(pulumi.StringOutput)
}

// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
//
// > **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
func (o InteractiveQueryClusterOutput) TlsMinVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InteractiveQueryCluster) pulumi.StringPtrOutput { return v.TlsMinVersion }).(pulumi.StringPtrOutput)
}

type InteractiveQueryClusterArrayOutput struct{ *pulumi.OutputState }

func (InteractiveQueryClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InteractiveQueryCluster)(nil)).Elem()
}

func (o InteractiveQueryClusterArrayOutput) ToInteractiveQueryClusterArrayOutput() InteractiveQueryClusterArrayOutput {
	return o
}

func (o InteractiveQueryClusterArrayOutput) ToInteractiveQueryClusterArrayOutputWithContext(ctx context.Context) InteractiveQueryClusterArrayOutput {
	return o
}

func (o InteractiveQueryClusterArrayOutput) Index(i pulumi.IntInput) InteractiveQueryClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InteractiveQueryCluster {
		return vs[0].([]*InteractiveQueryCluster)[vs[1].(int)]
	}).(InteractiveQueryClusterOutput)
}

type InteractiveQueryClusterMapOutput struct{ *pulumi.OutputState }

func (InteractiveQueryClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InteractiveQueryCluster)(nil)).Elem()
}

func (o InteractiveQueryClusterMapOutput) ToInteractiveQueryClusterMapOutput() InteractiveQueryClusterMapOutput {
	return o
}

func (o InteractiveQueryClusterMapOutput) ToInteractiveQueryClusterMapOutputWithContext(ctx context.Context) InteractiveQueryClusterMapOutput {
	return o
}

func (o InteractiveQueryClusterMapOutput) MapIndex(k pulumi.StringInput) InteractiveQueryClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InteractiveQueryCluster {
		return vs[0].(map[string]*InteractiveQueryCluster)[vs[1].(string)]
	}).(InteractiveQueryClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InteractiveQueryClusterInput)(nil)).Elem(), &InteractiveQueryCluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*InteractiveQueryClusterArrayInput)(nil)).Elem(), InteractiveQueryClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InteractiveQueryClusterMapInput)(nil)).Elem(), InteractiveQueryClusterMap{})
	pulumi.RegisterOutputType(InteractiveQueryClusterOutput{})
	pulumi.RegisterOutputType(InteractiveQueryClusterArrayOutput{})
	pulumi.RegisterOutputType(InteractiveQueryClusterMapOutput{})
}
