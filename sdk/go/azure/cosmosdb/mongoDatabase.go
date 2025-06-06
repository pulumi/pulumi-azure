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

// Manages a Mongo Database within a Cosmos DB Account.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cosmosdb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cosmosdb.LookupAccount(ctx, &cosmosdb.LookupAccountArgs{
//				Name:              "tfex-cosmosdb-account",
//				ResourceGroupName: "tfex-cosmosdb-account-rg",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = cosmosdb.NewMongoDatabase(ctx, "example", &cosmosdb.MongoDatabaseArgs{
//				Name:              pulumi.String("tfex-cosmos-mongo-db"),
//				ResourceGroupName: pulumi.String(example.ResourceGroupName),
//				AccountName:       pulumi.String(example.Name),
//				Throughput:        pulumi.Int(400),
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
// ## Import
//
// Cosmos Mongo Database can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cosmosdb/mongoDatabase:MongoDatabase db1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/account1/mongodbDatabases/db1
// ```
type MongoDatabase struct {
	pulumi.CustomResourceState

	// The name of the Cosmos DB Mongo Database to create the table within. Changing this forces a new resource to be created.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
	//
	// > **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
	AutoscaleSettings MongoDatabaseAutoscaleSettingsPtrOutput `pulumi:"autoscaleSettings"`
	// Specifies the name of the Cosmos DB Mongo Database. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the resource group in which the Cosmos DB Mongo Database is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The throughput of the MongoDB collection (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support.
	Throughput pulumi.IntOutput `pulumi:"throughput"`
}

// NewMongoDatabase registers a new resource with the given unique name, arguments, and options.
func NewMongoDatabase(ctx *pulumi.Context,
	name string, args *MongoDatabaseArgs, opts ...pulumi.ResourceOption) (*MongoDatabase, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountName == nil {
		return nil, errors.New("invalid value for required argument 'AccountName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MongoDatabase
	err := ctx.RegisterResource("azure:cosmosdb/mongoDatabase:MongoDatabase", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMongoDatabase gets an existing MongoDatabase resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMongoDatabase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MongoDatabaseState, opts ...pulumi.ResourceOption) (*MongoDatabase, error) {
	var resource MongoDatabase
	err := ctx.ReadResource("azure:cosmosdb/mongoDatabase:MongoDatabase", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MongoDatabase resources.
type mongoDatabaseState struct {
	// The name of the Cosmos DB Mongo Database to create the table within. Changing this forces a new resource to be created.
	AccountName *string `pulumi:"accountName"`
	// An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
	//
	// > **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
	AutoscaleSettings *MongoDatabaseAutoscaleSettings `pulumi:"autoscaleSettings"`
	// Specifies the name of the Cosmos DB Mongo Database. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which the Cosmos DB Mongo Database is created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The throughput of the MongoDB collection (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support.
	Throughput *int `pulumi:"throughput"`
}

type MongoDatabaseState struct {
	// The name of the Cosmos DB Mongo Database to create the table within. Changing this forces a new resource to be created.
	AccountName pulumi.StringPtrInput
	// An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
	//
	// > **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
	AutoscaleSettings MongoDatabaseAutoscaleSettingsPtrInput
	// Specifies the name of the Cosmos DB Mongo Database. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which the Cosmos DB Mongo Database is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The throughput of the MongoDB collection (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support.
	Throughput pulumi.IntPtrInput
}

func (MongoDatabaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*mongoDatabaseState)(nil)).Elem()
}

type mongoDatabaseArgs struct {
	// The name of the Cosmos DB Mongo Database to create the table within. Changing this forces a new resource to be created.
	AccountName string `pulumi:"accountName"`
	// An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
	//
	// > **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
	AutoscaleSettings *MongoDatabaseAutoscaleSettings `pulumi:"autoscaleSettings"`
	// Specifies the name of the Cosmos DB Mongo Database. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which the Cosmos DB Mongo Database is created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The throughput of the MongoDB collection (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support.
	Throughput *int `pulumi:"throughput"`
}

// The set of arguments for constructing a MongoDatabase resource.
type MongoDatabaseArgs struct {
	// The name of the Cosmos DB Mongo Database to create the table within. Changing this forces a new resource to be created.
	AccountName pulumi.StringInput
	// An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
	//
	// > **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
	AutoscaleSettings MongoDatabaseAutoscaleSettingsPtrInput
	// Specifies the name of the Cosmos DB Mongo Database. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which the Cosmos DB Mongo Database is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The throughput of the MongoDB collection (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support.
	Throughput pulumi.IntPtrInput
}

func (MongoDatabaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mongoDatabaseArgs)(nil)).Elem()
}

type MongoDatabaseInput interface {
	pulumi.Input

	ToMongoDatabaseOutput() MongoDatabaseOutput
	ToMongoDatabaseOutputWithContext(ctx context.Context) MongoDatabaseOutput
}

func (*MongoDatabase) ElementType() reflect.Type {
	return reflect.TypeOf((**MongoDatabase)(nil)).Elem()
}

func (i *MongoDatabase) ToMongoDatabaseOutput() MongoDatabaseOutput {
	return i.ToMongoDatabaseOutputWithContext(context.Background())
}

func (i *MongoDatabase) ToMongoDatabaseOutputWithContext(ctx context.Context) MongoDatabaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MongoDatabaseOutput)
}

// MongoDatabaseArrayInput is an input type that accepts MongoDatabaseArray and MongoDatabaseArrayOutput values.
// You can construct a concrete instance of `MongoDatabaseArrayInput` via:
//
//	MongoDatabaseArray{ MongoDatabaseArgs{...} }
type MongoDatabaseArrayInput interface {
	pulumi.Input

	ToMongoDatabaseArrayOutput() MongoDatabaseArrayOutput
	ToMongoDatabaseArrayOutputWithContext(context.Context) MongoDatabaseArrayOutput
}

type MongoDatabaseArray []MongoDatabaseInput

func (MongoDatabaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MongoDatabase)(nil)).Elem()
}

func (i MongoDatabaseArray) ToMongoDatabaseArrayOutput() MongoDatabaseArrayOutput {
	return i.ToMongoDatabaseArrayOutputWithContext(context.Background())
}

func (i MongoDatabaseArray) ToMongoDatabaseArrayOutputWithContext(ctx context.Context) MongoDatabaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MongoDatabaseArrayOutput)
}

// MongoDatabaseMapInput is an input type that accepts MongoDatabaseMap and MongoDatabaseMapOutput values.
// You can construct a concrete instance of `MongoDatabaseMapInput` via:
//
//	MongoDatabaseMap{ "key": MongoDatabaseArgs{...} }
type MongoDatabaseMapInput interface {
	pulumi.Input

	ToMongoDatabaseMapOutput() MongoDatabaseMapOutput
	ToMongoDatabaseMapOutputWithContext(context.Context) MongoDatabaseMapOutput
}

type MongoDatabaseMap map[string]MongoDatabaseInput

func (MongoDatabaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MongoDatabase)(nil)).Elem()
}

func (i MongoDatabaseMap) ToMongoDatabaseMapOutput() MongoDatabaseMapOutput {
	return i.ToMongoDatabaseMapOutputWithContext(context.Background())
}

func (i MongoDatabaseMap) ToMongoDatabaseMapOutputWithContext(ctx context.Context) MongoDatabaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MongoDatabaseMapOutput)
}

type MongoDatabaseOutput struct{ *pulumi.OutputState }

func (MongoDatabaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MongoDatabase)(nil)).Elem()
}

func (o MongoDatabaseOutput) ToMongoDatabaseOutput() MongoDatabaseOutput {
	return o
}

func (o MongoDatabaseOutput) ToMongoDatabaseOutputWithContext(ctx context.Context) MongoDatabaseOutput {
	return o
}

// The name of the Cosmos DB Mongo Database to create the table within. Changing this forces a new resource to be created.
func (o MongoDatabaseOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *MongoDatabase) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

// An `autoscaleSettings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
//
// > **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
func (o MongoDatabaseOutput) AutoscaleSettings() MongoDatabaseAutoscaleSettingsPtrOutput {
	return o.ApplyT(func(v *MongoDatabase) MongoDatabaseAutoscaleSettingsPtrOutput { return v.AutoscaleSettings }).(MongoDatabaseAutoscaleSettingsPtrOutput)
}

// Specifies the name of the Cosmos DB Mongo Database. Changing this forces a new resource to be created.
func (o MongoDatabaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MongoDatabase) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the resource group in which the Cosmos DB Mongo Database is created. Changing this forces a new resource to be created.
func (o MongoDatabaseOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *MongoDatabase) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The throughput of the MongoDB collection (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
//
// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support.
func (o MongoDatabaseOutput) Throughput() pulumi.IntOutput {
	return o.ApplyT(func(v *MongoDatabase) pulumi.IntOutput { return v.Throughput }).(pulumi.IntOutput)
}

type MongoDatabaseArrayOutput struct{ *pulumi.OutputState }

func (MongoDatabaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MongoDatabase)(nil)).Elem()
}

func (o MongoDatabaseArrayOutput) ToMongoDatabaseArrayOutput() MongoDatabaseArrayOutput {
	return o
}

func (o MongoDatabaseArrayOutput) ToMongoDatabaseArrayOutputWithContext(ctx context.Context) MongoDatabaseArrayOutput {
	return o
}

func (o MongoDatabaseArrayOutput) Index(i pulumi.IntInput) MongoDatabaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MongoDatabase {
		return vs[0].([]*MongoDatabase)[vs[1].(int)]
	}).(MongoDatabaseOutput)
}

type MongoDatabaseMapOutput struct{ *pulumi.OutputState }

func (MongoDatabaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MongoDatabase)(nil)).Elem()
}

func (o MongoDatabaseMapOutput) ToMongoDatabaseMapOutput() MongoDatabaseMapOutput {
	return o
}

func (o MongoDatabaseMapOutput) ToMongoDatabaseMapOutputWithContext(ctx context.Context) MongoDatabaseMapOutput {
	return o
}

func (o MongoDatabaseMapOutput) MapIndex(k pulumi.StringInput) MongoDatabaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MongoDatabase {
		return vs[0].(map[string]*MongoDatabase)[vs[1].(string)]
	}).(MongoDatabaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MongoDatabaseInput)(nil)).Elem(), &MongoDatabase{})
	pulumi.RegisterInputType(reflect.TypeOf((*MongoDatabaseArrayInput)(nil)).Elem(), MongoDatabaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MongoDatabaseMapInput)(nil)).Elem(), MongoDatabaseMap{})
	pulumi.RegisterOutputType(MongoDatabaseOutput{})
	pulumi.RegisterOutputType(MongoDatabaseArrayOutput{})
	pulumi.RegisterOutputType(MongoDatabaseMapOutput{})
}
