// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cosmosdb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Sets a Coordinator Configuration value on Azure Cosmos DB for PostgreSQL Cluster.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cosmosdb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := core.NewResourceGroup(ctx, "test", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			example, err := cosmosdb.NewPostgresqlCluster(ctx, "example", &cosmosdb.PostgresqlClusterArgs{
//				Name:                        pulumi.String("examplecluster"),
//				ResourceGroupName:           pulumi.Any(exampleAzurermResourceGroup.Name),
//				Location:                    pulumi.Any(exampleAzurermResourceGroup.Location),
//				AdministratorLoginPassword:  pulumi.String("H@Sh1CoR3!"),
//				CoordinatorStorageQuotaInMb: pulumi.Int(131072),
//				CoordinatorVcoreCount:       pulumi.Int(2),
//				NodeCount:                   pulumi.Int(2),
//				NodeStorageQuotaInMb:        pulumi.Int(131072),
//				NodeVcores:                  pulumi.Int(2),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cosmosdb.NewPostgresqlCoordinatorConfiguration(ctx, "example", &cosmosdb.PostgresqlCoordinatorConfigurationArgs{
//				Name:      pulumi.String("array_nulls"),
//				ClusterId: example.ID(),
//				Value:     pulumi.String("on"),
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
// * `Microsoft.DBforPostgreSQL`: 2022-11-08
//
// ## Import
//
// Coordinator Configurations on Azure Cosmos DB for PostgreSQL Clusters can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cosmosdb/postgresqlCoordinatorConfiguration:PostgresqlCoordinatorConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DBforPostgreSQL/serverGroupsv2/cluster1/coordinatorConfigurations/array_nulls
// ```
type PostgresqlCoordinatorConfiguration struct {
	pulumi.CustomResourceState

	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster where we want to change configuration. Changing this forces a new resource to be created.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The name of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The value of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewPostgresqlCoordinatorConfiguration registers a new resource with the given unique name, arguments, and options.
func NewPostgresqlCoordinatorConfiguration(ctx *pulumi.Context,
	name string, args *PostgresqlCoordinatorConfigurationArgs, opts ...pulumi.ResourceOption) (*PostgresqlCoordinatorConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PostgresqlCoordinatorConfiguration
	err := ctx.RegisterResource("azure:cosmosdb/postgresqlCoordinatorConfiguration:PostgresqlCoordinatorConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPostgresqlCoordinatorConfiguration gets an existing PostgresqlCoordinatorConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPostgresqlCoordinatorConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PostgresqlCoordinatorConfigurationState, opts ...pulumi.ResourceOption) (*PostgresqlCoordinatorConfiguration, error) {
	var resource PostgresqlCoordinatorConfiguration
	err := ctx.ReadResource("azure:cosmosdb/postgresqlCoordinatorConfiguration:PostgresqlCoordinatorConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PostgresqlCoordinatorConfiguration resources.
type postgresqlCoordinatorConfigurationState struct {
	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster where we want to change configuration. Changing this forces a new resource to be created.
	ClusterId *string `pulumi:"clusterId"`
	// The name of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The value of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster.
	Value *string `pulumi:"value"`
}

type PostgresqlCoordinatorConfigurationState struct {
	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster where we want to change configuration. Changing this forces a new resource to be created.
	ClusterId pulumi.StringPtrInput
	// The name of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The value of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster.
	Value pulumi.StringPtrInput
}

func (PostgresqlCoordinatorConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*postgresqlCoordinatorConfigurationState)(nil)).Elem()
}

type postgresqlCoordinatorConfigurationArgs struct {
	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster where we want to change configuration. Changing this forces a new resource to be created.
	ClusterId string `pulumi:"clusterId"`
	// The name of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The value of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a PostgresqlCoordinatorConfiguration resource.
type PostgresqlCoordinatorConfigurationArgs struct {
	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster where we want to change configuration. Changing this forces a new resource to be created.
	ClusterId pulumi.StringInput
	// The name of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The value of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster.
	Value pulumi.StringInput
}

func (PostgresqlCoordinatorConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*postgresqlCoordinatorConfigurationArgs)(nil)).Elem()
}

type PostgresqlCoordinatorConfigurationInput interface {
	pulumi.Input

	ToPostgresqlCoordinatorConfigurationOutput() PostgresqlCoordinatorConfigurationOutput
	ToPostgresqlCoordinatorConfigurationOutputWithContext(ctx context.Context) PostgresqlCoordinatorConfigurationOutput
}

func (*PostgresqlCoordinatorConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**PostgresqlCoordinatorConfiguration)(nil)).Elem()
}

func (i *PostgresqlCoordinatorConfiguration) ToPostgresqlCoordinatorConfigurationOutput() PostgresqlCoordinatorConfigurationOutput {
	return i.ToPostgresqlCoordinatorConfigurationOutputWithContext(context.Background())
}

func (i *PostgresqlCoordinatorConfiguration) ToPostgresqlCoordinatorConfigurationOutputWithContext(ctx context.Context) PostgresqlCoordinatorConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PostgresqlCoordinatorConfigurationOutput)
}

// PostgresqlCoordinatorConfigurationArrayInput is an input type that accepts PostgresqlCoordinatorConfigurationArray and PostgresqlCoordinatorConfigurationArrayOutput values.
// You can construct a concrete instance of `PostgresqlCoordinatorConfigurationArrayInput` via:
//
//	PostgresqlCoordinatorConfigurationArray{ PostgresqlCoordinatorConfigurationArgs{...} }
type PostgresqlCoordinatorConfigurationArrayInput interface {
	pulumi.Input

	ToPostgresqlCoordinatorConfigurationArrayOutput() PostgresqlCoordinatorConfigurationArrayOutput
	ToPostgresqlCoordinatorConfigurationArrayOutputWithContext(context.Context) PostgresqlCoordinatorConfigurationArrayOutput
}

type PostgresqlCoordinatorConfigurationArray []PostgresqlCoordinatorConfigurationInput

func (PostgresqlCoordinatorConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PostgresqlCoordinatorConfiguration)(nil)).Elem()
}

func (i PostgresqlCoordinatorConfigurationArray) ToPostgresqlCoordinatorConfigurationArrayOutput() PostgresqlCoordinatorConfigurationArrayOutput {
	return i.ToPostgresqlCoordinatorConfigurationArrayOutputWithContext(context.Background())
}

func (i PostgresqlCoordinatorConfigurationArray) ToPostgresqlCoordinatorConfigurationArrayOutputWithContext(ctx context.Context) PostgresqlCoordinatorConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PostgresqlCoordinatorConfigurationArrayOutput)
}

// PostgresqlCoordinatorConfigurationMapInput is an input type that accepts PostgresqlCoordinatorConfigurationMap and PostgresqlCoordinatorConfigurationMapOutput values.
// You can construct a concrete instance of `PostgresqlCoordinatorConfigurationMapInput` via:
//
//	PostgresqlCoordinatorConfigurationMap{ "key": PostgresqlCoordinatorConfigurationArgs{...} }
type PostgresqlCoordinatorConfigurationMapInput interface {
	pulumi.Input

	ToPostgresqlCoordinatorConfigurationMapOutput() PostgresqlCoordinatorConfigurationMapOutput
	ToPostgresqlCoordinatorConfigurationMapOutputWithContext(context.Context) PostgresqlCoordinatorConfigurationMapOutput
}

type PostgresqlCoordinatorConfigurationMap map[string]PostgresqlCoordinatorConfigurationInput

func (PostgresqlCoordinatorConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PostgresqlCoordinatorConfiguration)(nil)).Elem()
}

func (i PostgresqlCoordinatorConfigurationMap) ToPostgresqlCoordinatorConfigurationMapOutput() PostgresqlCoordinatorConfigurationMapOutput {
	return i.ToPostgresqlCoordinatorConfigurationMapOutputWithContext(context.Background())
}

func (i PostgresqlCoordinatorConfigurationMap) ToPostgresqlCoordinatorConfigurationMapOutputWithContext(ctx context.Context) PostgresqlCoordinatorConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PostgresqlCoordinatorConfigurationMapOutput)
}

type PostgresqlCoordinatorConfigurationOutput struct{ *pulumi.OutputState }

func (PostgresqlCoordinatorConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PostgresqlCoordinatorConfiguration)(nil)).Elem()
}

func (o PostgresqlCoordinatorConfigurationOutput) ToPostgresqlCoordinatorConfigurationOutput() PostgresqlCoordinatorConfigurationOutput {
	return o
}

func (o PostgresqlCoordinatorConfigurationOutput) ToPostgresqlCoordinatorConfigurationOutputWithContext(ctx context.Context) PostgresqlCoordinatorConfigurationOutput {
	return o
}

// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster where we want to change configuration. Changing this forces a new resource to be created.
func (o PostgresqlCoordinatorConfigurationOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresqlCoordinatorConfiguration) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The name of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
func (o PostgresqlCoordinatorConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresqlCoordinatorConfiguration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The value of the Coordinator Configuration on Azure Cosmos DB for PostgreSQL Cluster.
func (o PostgresqlCoordinatorConfigurationOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresqlCoordinatorConfiguration) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type PostgresqlCoordinatorConfigurationArrayOutput struct{ *pulumi.OutputState }

func (PostgresqlCoordinatorConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PostgresqlCoordinatorConfiguration)(nil)).Elem()
}

func (o PostgresqlCoordinatorConfigurationArrayOutput) ToPostgresqlCoordinatorConfigurationArrayOutput() PostgresqlCoordinatorConfigurationArrayOutput {
	return o
}

func (o PostgresqlCoordinatorConfigurationArrayOutput) ToPostgresqlCoordinatorConfigurationArrayOutputWithContext(ctx context.Context) PostgresqlCoordinatorConfigurationArrayOutput {
	return o
}

func (o PostgresqlCoordinatorConfigurationArrayOutput) Index(i pulumi.IntInput) PostgresqlCoordinatorConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PostgresqlCoordinatorConfiguration {
		return vs[0].([]*PostgresqlCoordinatorConfiguration)[vs[1].(int)]
	}).(PostgresqlCoordinatorConfigurationOutput)
}

type PostgresqlCoordinatorConfigurationMapOutput struct{ *pulumi.OutputState }

func (PostgresqlCoordinatorConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PostgresqlCoordinatorConfiguration)(nil)).Elem()
}

func (o PostgresqlCoordinatorConfigurationMapOutput) ToPostgresqlCoordinatorConfigurationMapOutput() PostgresqlCoordinatorConfigurationMapOutput {
	return o
}

func (o PostgresqlCoordinatorConfigurationMapOutput) ToPostgresqlCoordinatorConfigurationMapOutputWithContext(ctx context.Context) PostgresqlCoordinatorConfigurationMapOutput {
	return o
}

func (o PostgresqlCoordinatorConfigurationMapOutput) MapIndex(k pulumi.StringInput) PostgresqlCoordinatorConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PostgresqlCoordinatorConfiguration {
		return vs[0].(map[string]*PostgresqlCoordinatorConfiguration)[vs[1].(string)]
	}).(PostgresqlCoordinatorConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PostgresqlCoordinatorConfigurationInput)(nil)).Elem(), &PostgresqlCoordinatorConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*PostgresqlCoordinatorConfigurationArrayInput)(nil)).Elem(), PostgresqlCoordinatorConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PostgresqlCoordinatorConfigurationMapInput)(nil)).Elem(), PostgresqlCoordinatorConfigurationMap{})
	pulumi.RegisterOutputType(PostgresqlCoordinatorConfigurationOutput{})
	pulumi.RegisterOutputType(PostgresqlCoordinatorConfigurationArrayOutput{})
	pulumi.RegisterOutputType(PostgresqlCoordinatorConfigurationMapOutput{})
}
