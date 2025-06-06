// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kusto

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Kusto (also known as Azure Data Explorer) Attached Database Configuration
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/kusto"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("my-kusto-rg"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			followerCluster, err := kusto.NewCluster(ctx, "follower_cluster", &kusto.ClusterArgs{
//				Name:              pulumi.String("cluster1"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku: &kusto.ClusterSkuArgs{
//					Name:     pulumi.String("Dev(No SLA)_Standard_D11_v2"),
//					Capacity: pulumi.Int(1),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			followedCluster, err := kusto.NewCluster(ctx, "followed_cluster", &kusto.ClusterArgs{
//				Name:              pulumi.String("cluster2"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku: &kusto.ClusterSkuArgs{
//					Name:     pulumi.String("Dev(No SLA)_Standard_D11_v2"),
//					Capacity: pulumi.Int(1),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = kusto.NewDatabase(ctx, "followed_database", &kusto.DatabaseArgs{
//				Name:              pulumi.String("my-followed-database"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				ClusterName:       followerCluster.Name,
//			})
//			if err != nil {
//				return err
//			}
//			exampleDatabase, err := kusto.NewDatabase(ctx, "example", &kusto.DatabaseArgs{
//				Name:              pulumi.String("example"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				ClusterName:       followerCluster.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = kusto.NewAttachedDatabaseConfiguration(ctx, "example", &kusto.AttachedDatabaseConfigurationArgs{
//				Name:              pulumi.String("configuration1"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				ClusterName:       followerCluster.Name,
//				ClusterResourceId: followedCluster.ID(),
//				DatabaseName:      exampleDatabase.Name,
//				Sharing: &kusto.AttachedDatabaseConfigurationSharingArgs{
//					ExternalTablesToExcludes: pulumi.StringArray{
//						pulumi.String("ExternalTable2"),
//					},
//					ExternalTablesToIncludes: pulumi.StringArray{
//						pulumi.String("ExternalTable1"),
//					},
//					MaterializedViewsToExcludes: pulumi.StringArray{
//						pulumi.String("MaterializedViewTable2"),
//					},
//					MaterializedViewsToIncludes: pulumi.StringArray{
//						pulumi.String("MaterializedViewTable1"),
//					},
//					TablesToExcludes: pulumi.StringArray{
//						pulumi.String("Table2"),
//					},
//					TablesToIncludes: pulumi.StringArray{
//						pulumi.String("Table1"),
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
// * `Microsoft.Kusto`: 2024-04-13
//
// ## Import
//
// Kusto Attached Database Configurations can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:kusto/attachedDatabaseConfiguration:AttachedDatabaseConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/clusters/cluster1/attachedDatabaseConfigurations/configuration1
// ```
type AttachedDatabaseConfiguration struct {
	pulumi.CustomResourceState

	// The list of databases from the `clusterResourceId` which are currently attached to the cluster.
	AttachedDatabaseNames pulumi.StringArrayOutput `pulumi:"attachedDatabaseNames"`
	// The resource id of the cluster where the databases you would like to attach reside. Changing this forces a new resource to be created.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// Deprecated: `clusterResourceId` has been deprecated in favour of the `clusterId` property and will be removed in v5.0 of the AzureRM Provider.
	ClusterResourceId pulumi.StringOutput `pulumi:"clusterResourceId"`
	// The name of the database which you would like to attach, use * if you want to follow all current and future databases. Changing this forces a new resource to be created.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`. Defaults to `None`.
	DefaultPrincipalModificationKind pulumi.StringPtrOutput `pulumi:"defaultPrincipalModificationKind"`
	// Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `sharing` block as defined below.
	Sharing AttachedDatabaseConfigurationSharingPtrOutput `pulumi:"sharing"`
}

// NewAttachedDatabaseConfiguration registers a new resource with the given unique name, arguments, and options.
func NewAttachedDatabaseConfiguration(ctx *pulumi.Context,
	name string, args *AttachedDatabaseConfigurationArgs, opts ...pulumi.ResourceOption) (*AttachedDatabaseConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AttachedDatabaseConfiguration
	err := ctx.RegisterResource("azure:kusto/attachedDatabaseConfiguration:AttachedDatabaseConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAttachedDatabaseConfiguration gets an existing AttachedDatabaseConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAttachedDatabaseConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AttachedDatabaseConfigurationState, opts ...pulumi.ResourceOption) (*AttachedDatabaseConfiguration, error) {
	var resource AttachedDatabaseConfiguration
	err := ctx.ReadResource("azure:kusto/attachedDatabaseConfiguration:AttachedDatabaseConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AttachedDatabaseConfiguration resources.
type attachedDatabaseConfigurationState struct {
	// The list of databases from the `clusterResourceId` which are currently attached to the cluster.
	AttachedDatabaseNames []string `pulumi:"attachedDatabaseNames"`
	// The resource id of the cluster where the databases you would like to attach reside. Changing this forces a new resource to be created.
	ClusterId *string `pulumi:"clusterId"`
	// Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ClusterName *string `pulumi:"clusterName"`
	// Deprecated: `clusterResourceId` has been deprecated in favour of the `clusterId` property and will be removed in v5.0 of the AzureRM Provider.
	ClusterResourceId *string `pulumi:"clusterResourceId"`
	// The name of the database which you would like to attach, use * if you want to follow all current and future databases. Changing this forces a new resource to be created.
	DatabaseName *string `pulumi:"databaseName"`
	// The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`. Defaults to `None`.
	DefaultPrincipalModificationKind *string `pulumi:"defaultPrincipalModificationKind"`
	// Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `sharing` block as defined below.
	Sharing *AttachedDatabaseConfigurationSharing `pulumi:"sharing"`
}

type AttachedDatabaseConfigurationState struct {
	// The list of databases from the `clusterResourceId` which are currently attached to the cluster.
	AttachedDatabaseNames pulumi.StringArrayInput
	// The resource id of the cluster where the databases you would like to attach reside. Changing this forces a new resource to be created.
	ClusterId pulumi.StringPtrInput
	// Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ClusterName pulumi.StringPtrInput
	// Deprecated: `clusterResourceId` has been deprecated in favour of the `clusterId` property and will be removed in v5.0 of the AzureRM Provider.
	ClusterResourceId pulumi.StringPtrInput
	// The name of the database which you would like to attach, use * if you want to follow all current and future databases. Changing this forces a new resource to be created.
	DatabaseName pulumi.StringPtrInput
	// The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`. Defaults to `None`.
	DefaultPrincipalModificationKind pulumi.StringPtrInput
	// Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `sharing` block as defined below.
	Sharing AttachedDatabaseConfigurationSharingPtrInput
}

func (AttachedDatabaseConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*attachedDatabaseConfigurationState)(nil)).Elem()
}

type attachedDatabaseConfigurationArgs struct {
	// The resource id of the cluster where the databases you would like to attach reside. Changing this forces a new resource to be created.
	ClusterId *string `pulumi:"clusterId"`
	// Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ClusterName string `pulumi:"clusterName"`
	// Deprecated: `clusterResourceId` has been deprecated in favour of the `clusterId` property and will be removed in v5.0 of the AzureRM Provider.
	ClusterResourceId *string `pulumi:"clusterResourceId"`
	// The name of the database which you would like to attach, use * if you want to follow all current and future databases. Changing this forces a new resource to be created.
	DatabaseName string `pulumi:"databaseName"`
	// The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`. Defaults to `None`.
	DefaultPrincipalModificationKind *string `pulumi:"defaultPrincipalModificationKind"`
	// Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `sharing` block as defined below.
	Sharing *AttachedDatabaseConfigurationSharing `pulumi:"sharing"`
}

// The set of arguments for constructing a AttachedDatabaseConfiguration resource.
type AttachedDatabaseConfigurationArgs struct {
	// The resource id of the cluster where the databases you would like to attach reside. Changing this forces a new resource to be created.
	ClusterId pulumi.StringPtrInput
	// Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ClusterName pulumi.StringInput
	// Deprecated: `clusterResourceId` has been deprecated in favour of the `clusterId` property and will be removed in v5.0 of the AzureRM Provider.
	ClusterResourceId pulumi.StringPtrInput
	// The name of the database which you would like to attach, use * if you want to follow all current and future databases. Changing this forces a new resource to be created.
	DatabaseName pulumi.StringInput
	// The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`. Defaults to `None`.
	DefaultPrincipalModificationKind pulumi.StringPtrInput
	// Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A `sharing` block as defined below.
	Sharing AttachedDatabaseConfigurationSharingPtrInput
}

func (AttachedDatabaseConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*attachedDatabaseConfigurationArgs)(nil)).Elem()
}

type AttachedDatabaseConfigurationInput interface {
	pulumi.Input

	ToAttachedDatabaseConfigurationOutput() AttachedDatabaseConfigurationOutput
	ToAttachedDatabaseConfigurationOutputWithContext(ctx context.Context) AttachedDatabaseConfigurationOutput
}

func (*AttachedDatabaseConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**AttachedDatabaseConfiguration)(nil)).Elem()
}

func (i *AttachedDatabaseConfiguration) ToAttachedDatabaseConfigurationOutput() AttachedDatabaseConfigurationOutput {
	return i.ToAttachedDatabaseConfigurationOutputWithContext(context.Background())
}

func (i *AttachedDatabaseConfiguration) ToAttachedDatabaseConfigurationOutputWithContext(ctx context.Context) AttachedDatabaseConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttachedDatabaseConfigurationOutput)
}

// AttachedDatabaseConfigurationArrayInput is an input type that accepts AttachedDatabaseConfigurationArray and AttachedDatabaseConfigurationArrayOutput values.
// You can construct a concrete instance of `AttachedDatabaseConfigurationArrayInput` via:
//
//	AttachedDatabaseConfigurationArray{ AttachedDatabaseConfigurationArgs{...} }
type AttachedDatabaseConfigurationArrayInput interface {
	pulumi.Input

	ToAttachedDatabaseConfigurationArrayOutput() AttachedDatabaseConfigurationArrayOutput
	ToAttachedDatabaseConfigurationArrayOutputWithContext(context.Context) AttachedDatabaseConfigurationArrayOutput
}

type AttachedDatabaseConfigurationArray []AttachedDatabaseConfigurationInput

func (AttachedDatabaseConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AttachedDatabaseConfiguration)(nil)).Elem()
}

func (i AttachedDatabaseConfigurationArray) ToAttachedDatabaseConfigurationArrayOutput() AttachedDatabaseConfigurationArrayOutput {
	return i.ToAttachedDatabaseConfigurationArrayOutputWithContext(context.Background())
}

func (i AttachedDatabaseConfigurationArray) ToAttachedDatabaseConfigurationArrayOutputWithContext(ctx context.Context) AttachedDatabaseConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttachedDatabaseConfigurationArrayOutput)
}

// AttachedDatabaseConfigurationMapInput is an input type that accepts AttachedDatabaseConfigurationMap and AttachedDatabaseConfigurationMapOutput values.
// You can construct a concrete instance of `AttachedDatabaseConfigurationMapInput` via:
//
//	AttachedDatabaseConfigurationMap{ "key": AttachedDatabaseConfigurationArgs{...} }
type AttachedDatabaseConfigurationMapInput interface {
	pulumi.Input

	ToAttachedDatabaseConfigurationMapOutput() AttachedDatabaseConfigurationMapOutput
	ToAttachedDatabaseConfigurationMapOutputWithContext(context.Context) AttachedDatabaseConfigurationMapOutput
}

type AttachedDatabaseConfigurationMap map[string]AttachedDatabaseConfigurationInput

func (AttachedDatabaseConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AttachedDatabaseConfiguration)(nil)).Elem()
}

func (i AttachedDatabaseConfigurationMap) ToAttachedDatabaseConfigurationMapOutput() AttachedDatabaseConfigurationMapOutput {
	return i.ToAttachedDatabaseConfigurationMapOutputWithContext(context.Background())
}

func (i AttachedDatabaseConfigurationMap) ToAttachedDatabaseConfigurationMapOutputWithContext(ctx context.Context) AttachedDatabaseConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttachedDatabaseConfigurationMapOutput)
}

type AttachedDatabaseConfigurationOutput struct{ *pulumi.OutputState }

func (AttachedDatabaseConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AttachedDatabaseConfiguration)(nil)).Elem()
}

func (o AttachedDatabaseConfigurationOutput) ToAttachedDatabaseConfigurationOutput() AttachedDatabaseConfigurationOutput {
	return o
}

func (o AttachedDatabaseConfigurationOutput) ToAttachedDatabaseConfigurationOutputWithContext(ctx context.Context) AttachedDatabaseConfigurationOutput {
	return o
}

// The list of databases from the `clusterResourceId` which are currently attached to the cluster.
func (o AttachedDatabaseConfigurationOutput) AttachedDatabaseNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) pulumi.StringArrayOutput { return v.AttachedDatabaseNames }).(pulumi.StringArrayOutput)
}

// The resource id of the cluster where the databases you would like to attach reside. Changing this forces a new resource to be created.
func (o AttachedDatabaseConfigurationOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
func (o AttachedDatabaseConfigurationOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// Deprecated: `clusterResourceId` has been deprecated in favour of the `clusterId` property and will be removed in v5.0 of the AzureRM Provider.
func (o AttachedDatabaseConfigurationOutput) ClusterResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) pulumi.StringOutput { return v.ClusterResourceId }).(pulumi.StringOutput)
}

// The name of the database which you would like to attach, use * if you want to follow all current and future databases. Changing this forces a new resource to be created.
func (o AttachedDatabaseConfigurationOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`. Defaults to `None`.
func (o AttachedDatabaseConfigurationOutput) DefaultPrincipalModificationKind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) pulumi.StringPtrOutput {
		return v.DefaultPrincipalModificationKind
	}).(pulumi.StringPtrOutput)
}

// Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
func (o AttachedDatabaseConfigurationOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
func (o AttachedDatabaseConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
func (o AttachedDatabaseConfigurationOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `sharing` block as defined below.
func (o AttachedDatabaseConfigurationOutput) Sharing() AttachedDatabaseConfigurationSharingPtrOutput {
	return o.ApplyT(func(v *AttachedDatabaseConfiguration) AttachedDatabaseConfigurationSharingPtrOutput { return v.Sharing }).(AttachedDatabaseConfigurationSharingPtrOutput)
}

type AttachedDatabaseConfigurationArrayOutput struct{ *pulumi.OutputState }

func (AttachedDatabaseConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AttachedDatabaseConfiguration)(nil)).Elem()
}

func (o AttachedDatabaseConfigurationArrayOutput) ToAttachedDatabaseConfigurationArrayOutput() AttachedDatabaseConfigurationArrayOutput {
	return o
}

func (o AttachedDatabaseConfigurationArrayOutput) ToAttachedDatabaseConfigurationArrayOutputWithContext(ctx context.Context) AttachedDatabaseConfigurationArrayOutput {
	return o
}

func (o AttachedDatabaseConfigurationArrayOutput) Index(i pulumi.IntInput) AttachedDatabaseConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AttachedDatabaseConfiguration {
		return vs[0].([]*AttachedDatabaseConfiguration)[vs[1].(int)]
	}).(AttachedDatabaseConfigurationOutput)
}

type AttachedDatabaseConfigurationMapOutput struct{ *pulumi.OutputState }

func (AttachedDatabaseConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AttachedDatabaseConfiguration)(nil)).Elem()
}

func (o AttachedDatabaseConfigurationMapOutput) ToAttachedDatabaseConfigurationMapOutput() AttachedDatabaseConfigurationMapOutput {
	return o
}

func (o AttachedDatabaseConfigurationMapOutput) ToAttachedDatabaseConfigurationMapOutputWithContext(ctx context.Context) AttachedDatabaseConfigurationMapOutput {
	return o
}

func (o AttachedDatabaseConfigurationMapOutput) MapIndex(k pulumi.StringInput) AttachedDatabaseConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AttachedDatabaseConfiguration {
		return vs[0].(map[string]*AttachedDatabaseConfiguration)[vs[1].(string)]
	}).(AttachedDatabaseConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AttachedDatabaseConfigurationInput)(nil)).Elem(), &AttachedDatabaseConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*AttachedDatabaseConfigurationArrayInput)(nil)).Elem(), AttachedDatabaseConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AttachedDatabaseConfigurationMapInput)(nil)).Elem(), AttachedDatabaseConfigurationMap{})
	pulumi.RegisterOutputType(AttachedDatabaseConfigurationOutput{})
	pulumi.RegisterOutputType(AttachedDatabaseConfigurationArrayOutput{})
	pulumi.RegisterOutputType(AttachedDatabaseConfigurationMapOutput{})
}
