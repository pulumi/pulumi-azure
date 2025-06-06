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

// Manages a SQL Dedicated Gateway within a Cosmos DB Account.
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
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resource-group"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := cosmosdb.NewAccount(ctx, "example", &cosmosdb.AccountArgs{
//				Name:              pulumi.String("example-ca"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				OfferType:         pulumi.String("Standard"),
//				Kind:              pulumi.String("GlobalDocumentDB"),
//				ConsistencyPolicy: &cosmosdb.AccountConsistencyPolicyArgs{
//					ConsistencyLevel: pulumi.String("BoundedStaleness"),
//				},
//				GeoLocations: cosmosdb.AccountGeoLocationArray{
//					&cosmosdb.AccountGeoLocationArgs{
//						Location:         example.Location,
//						FailoverPriority: pulumi.Int(0),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cosmosdb.NewSqlDedicatedGateway(ctx, "example", &cosmosdb.SqlDedicatedGatewayArgs{
//				CosmosdbAccountId: exampleAccount.ID(),
//				InstanceCount:     pulumi.Int(1),
//				InstanceSize:      pulumi.String("Cosmos.D4s"),
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
// * `Microsoft.DocumentDB`: 2022-05-15
//
// ## Import
//
// CosmosDB SQL Dedicated Gateways can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cosmosdb/sqlDedicatedGateway:SqlDedicatedGateway example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.DocumentDB/databaseAccounts/account1/services/SqlDedicatedGateway
// ```
type SqlDedicatedGateway struct {
	pulumi.CustomResourceState

	// The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
	CosmosdbAccountId pulumi.StringOutput `pulumi:"cosmosdbAccountId"`
	// The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
	InstanceCount pulumi.IntOutput `pulumi:"instanceCount"`
	// The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
	InstanceSize pulumi.StringOutput `pulumi:"instanceSize"`
}

// NewSqlDedicatedGateway registers a new resource with the given unique name, arguments, and options.
func NewSqlDedicatedGateway(ctx *pulumi.Context,
	name string, args *SqlDedicatedGatewayArgs, opts ...pulumi.ResourceOption) (*SqlDedicatedGateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CosmosdbAccountId == nil {
		return nil, errors.New("invalid value for required argument 'CosmosdbAccountId'")
	}
	if args.InstanceCount == nil {
		return nil, errors.New("invalid value for required argument 'InstanceCount'")
	}
	if args.InstanceSize == nil {
		return nil, errors.New("invalid value for required argument 'InstanceSize'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SqlDedicatedGateway
	err := ctx.RegisterResource("azure:cosmosdb/sqlDedicatedGateway:SqlDedicatedGateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlDedicatedGateway gets an existing SqlDedicatedGateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlDedicatedGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlDedicatedGatewayState, opts ...pulumi.ResourceOption) (*SqlDedicatedGateway, error) {
	var resource SqlDedicatedGateway
	err := ctx.ReadResource("azure:cosmosdb/sqlDedicatedGateway:SqlDedicatedGateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlDedicatedGateway resources.
type sqlDedicatedGatewayState struct {
	// The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
	CosmosdbAccountId *string `pulumi:"cosmosdbAccountId"`
	// The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
	InstanceCount *int `pulumi:"instanceCount"`
	// The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
	InstanceSize *string `pulumi:"instanceSize"`
}

type SqlDedicatedGatewayState struct {
	// The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
	CosmosdbAccountId pulumi.StringPtrInput
	// The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
	InstanceCount pulumi.IntPtrInput
	// The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
	InstanceSize pulumi.StringPtrInput
}

func (SqlDedicatedGatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlDedicatedGatewayState)(nil)).Elem()
}

type sqlDedicatedGatewayArgs struct {
	// The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
	CosmosdbAccountId string `pulumi:"cosmosdbAccountId"`
	// The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
	InstanceCount int `pulumi:"instanceCount"`
	// The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
	InstanceSize string `pulumi:"instanceSize"`
}

// The set of arguments for constructing a SqlDedicatedGateway resource.
type SqlDedicatedGatewayArgs struct {
	// The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
	CosmosdbAccountId pulumi.StringInput
	// The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
	InstanceCount pulumi.IntInput
	// The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
	InstanceSize pulumi.StringInput
}

func (SqlDedicatedGatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlDedicatedGatewayArgs)(nil)).Elem()
}

type SqlDedicatedGatewayInput interface {
	pulumi.Input

	ToSqlDedicatedGatewayOutput() SqlDedicatedGatewayOutput
	ToSqlDedicatedGatewayOutputWithContext(ctx context.Context) SqlDedicatedGatewayOutput
}

func (*SqlDedicatedGateway) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlDedicatedGateway)(nil)).Elem()
}

func (i *SqlDedicatedGateway) ToSqlDedicatedGatewayOutput() SqlDedicatedGatewayOutput {
	return i.ToSqlDedicatedGatewayOutputWithContext(context.Background())
}

func (i *SqlDedicatedGateway) ToSqlDedicatedGatewayOutputWithContext(ctx context.Context) SqlDedicatedGatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlDedicatedGatewayOutput)
}

// SqlDedicatedGatewayArrayInput is an input type that accepts SqlDedicatedGatewayArray and SqlDedicatedGatewayArrayOutput values.
// You can construct a concrete instance of `SqlDedicatedGatewayArrayInput` via:
//
//	SqlDedicatedGatewayArray{ SqlDedicatedGatewayArgs{...} }
type SqlDedicatedGatewayArrayInput interface {
	pulumi.Input

	ToSqlDedicatedGatewayArrayOutput() SqlDedicatedGatewayArrayOutput
	ToSqlDedicatedGatewayArrayOutputWithContext(context.Context) SqlDedicatedGatewayArrayOutput
}

type SqlDedicatedGatewayArray []SqlDedicatedGatewayInput

func (SqlDedicatedGatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlDedicatedGateway)(nil)).Elem()
}

func (i SqlDedicatedGatewayArray) ToSqlDedicatedGatewayArrayOutput() SqlDedicatedGatewayArrayOutput {
	return i.ToSqlDedicatedGatewayArrayOutputWithContext(context.Background())
}

func (i SqlDedicatedGatewayArray) ToSqlDedicatedGatewayArrayOutputWithContext(ctx context.Context) SqlDedicatedGatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlDedicatedGatewayArrayOutput)
}

// SqlDedicatedGatewayMapInput is an input type that accepts SqlDedicatedGatewayMap and SqlDedicatedGatewayMapOutput values.
// You can construct a concrete instance of `SqlDedicatedGatewayMapInput` via:
//
//	SqlDedicatedGatewayMap{ "key": SqlDedicatedGatewayArgs{...} }
type SqlDedicatedGatewayMapInput interface {
	pulumi.Input

	ToSqlDedicatedGatewayMapOutput() SqlDedicatedGatewayMapOutput
	ToSqlDedicatedGatewayMapOutputWithContext(context.Context) SqlDedicatedGatewayMapOutput
}

type SqlDedicatedGatewayMap map[string]SqlDedicatedGatewayInput

func (SqlDedicatedGatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlDedicatedGateway)(nil)).Elem()
}

func (i SqlDedicatedGatewayMap) ToSqlDedicatedGatewayMapOutput() SqlDedicatedGatewayMapOutput {
	return i.ToSqlDedicatedGatewayMapOutputWithContext(context.Background())
}

func (i SqlDedicatedGatewayMap) ToSqlDedicatedGatewayMapOutputWithContext(ctx context.Context) SqlDedicatedGatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlDedicatedGatewayMapOutput)
}

type SqlDedicatedGatewayOutput struct{ *pulumi.OutputState }

func (SqlDedicatedGatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlDedicatedGateway)(nil)).Elem()
}

func (o SqlDedicatedGatewayOutput) ToSqlDedicatedGatewayOutput() SqlDedicatedGatewayOutput {
	return o
}

func (o SqlDedicatedGatewayOutput) ToSqlDedicatedGatewayOutputWithContext(ctx context.Context) SqlDedicatedGatewayOutput {
	return o
}

// The resource ID of the CosmosDB Account. Changing this forces a new resource to be created.
func (o SqlDedicatedGatewayOutput) CosmosdbAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlDedicatedGateway) pulumi.StringOutput { return v.CosmosdbAccountId }).(pulumi.StringOutput)
}

// The instance count for the CosmosDB SQL Dedicated Gateway. Possible value is between `1` and `5`.
func (o SqlDedicatedGatewayOutput) InstanceCount() pulumi.IntOutput {
	return o.ApplyT(func(v *SqlDedicatedGateway) pulumi.IntOutput { return v.InstanceCount }).(pulumi.IntOutput)
}

// The instance size for the CosmosDB SQL Dedicated Gateway. Changing this forces a new resource to be created. Possible values are `Cosmos.D4s`, `Cosmos.D8s` and `Cosmos.D16s`.
func (o SqlDedicatedGatewayOutput) InstanceSize() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlDedicatedGateway) pulumi.StringOutput { return v.InstanceSize }).(pulumi.StringOutput)
}

type SqlDedicatedGatewayArrayOutput struct{ *pulumi.OutputState }

func (SqlDedicatedGatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlDedicatedGateway)(nil)).Elem()
}

func (o SqlDedicatedGatewayArrayOutput) ToSqlDedicatedGatewayArrayOutput() SqlDedicatedGatewayArrayOutput {
	return o
}

func (o SqlDedicatedGatewayArrayOutput) ToSqlDedicatedGatewayArrayOutputWithContext(ctx context.Context) SqlDedicatedGatewayArrayOutput {
	return o
}

func (o SqlDedicatedGatewayArrayOutput) Index(i pulumi.IntInput) SqlDedicatedGatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlDedicatedGateway {
		return vs[0].([]*SqlDedicatedGateway)[vs[1].(int)]
	}).(SqlDedicatedGatewayOutput)
}

type SqlDedicatedGatewayMapOutput struct{ *pulumi.OutputState }

func (SqlDedicatedGatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlDedicatedGateway)(nil)).Elem()
}

func (o SqlDedicatedGatewayMapOutput) ToSqlDedicatedGatewayMapOutput() SqlDedicatedGatewayMapOutput {
	return o
}

func (o SqlDedicatedGatewayMapOutput) ToSqlDedicatedGatewayMapOutputWithContext(ctx context.Context) SqlDedicatedGatewayMapOutput {
	return o
}

func (o SqlDedicatedGatewayMapOutput) MapIndex(k pulumi.StringInput) SqlDedicatedGatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlDedicatedGateway {
		return vs[0].(map[string]*SqlDedicatedGateway)[vs[1].(string)]
	}).(SqlDedicatedGatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlDedicatedGatewayInput)(nil)).Elem(), &SqlDedicatedGateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlDedicatedGatewayArrayInput)(nil)).Elem(), SqlDedicatedGatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlDedicatedGatewayMapInput)(nil)).Elem(), SqlDedicatedGatewayMap{})
	pulumi.RegisterOutputType(SqlDedicatedGatewayOutput{})
	pulumi.RegisterOutputType(SqlDedicatedGatewayArrayOutput{})
	pulumi.RegisterOutputType(SqlDedicatedGatewayMapOutput{})
}
