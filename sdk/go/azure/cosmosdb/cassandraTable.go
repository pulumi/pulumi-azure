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

// Manages a Cassandra Table within a Cosmos DB Cassandra Keyspace.
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
//				Name:     pulumi.String("tflex-cosmosdb-account-rg"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := cosmosdb.NewAccount(ctx, "example", &cosmosdb.AccountArgs{
//				Name:              pulumi.String("tfex-cosmosdb-account"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				OfferType:         pulumi.String("Standard"),
//				Capabilities: cosmosdb.AccountCapabilityArray{
//					&cosmosdb.AccountCapabilityArgs{
//						Name: pulumi.String("EnableCassandra"),
//					},
//				},
//				ConsistencyPolicy: &cosmosdb.AccountConsistencyPolicyArgs{
//					ConsistencyLevel: pulumi.String("Strong"),
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
//			exampleCassandraKeyspace, err := cosmosdb.NewCassandraKeyspace(ctx, "example", &cosmosdb.CassandraKeyspaceArgs{
//				Name:              pulumi.String("tfex-cosmos-cassandra-keyspace"),
//				ResourceGroupName: exampleAccount.ResourceGroupName,
//				AccountName:       exampleAccount.Name,
//				Throughput:        pulumi.Int(400),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cosmosdb.NewCassandraTable(ctx, "example", &cosmosdb.CassandraTableArgs{
//				Name:                pulumi.String("testtable"),
//				CassandraKeyspaceId: exampleCassandraKeyspace.ID(),
//				Schema: &cosmosdb.CassandraTableSchemaArgs{
//					Columns: cosmosdb.CassandraTableSchemaColumnArray{
//						&cosmosdb.CassandraTableSchemaColumnArgs{
//							Name: pulumi.String("test1"),
//							Type: pulumi.String("ascii"),
//						},
//						&cosmosdb.CassandraTableSchemaColumnArgs{
//							Name: pulumi.String("test2"),
//							Type: pulumi.String("int"),
//						},
//					},
//					PartitionKeys: cosmosdb.CassandraTableSchemaPartitionKeyArray{
//						&cosmosdb.CassandraTableSchemaPartitionKeyArgs{
//							Name: pulumi.String("test1"),
//						},
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
// ## Import
//
// Cosmos Cassandra Table can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cosmosdb/cassandraTable:CassandraTable ks1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/account1/cassandraKeyspaces/ks1/tables/table1
// ```
type CassandraTable struct {
	pulumi.CustomResourceState

	// Time to live of the Analytical Storage. Possible values are between `-1` and `2147483647` except `0`. `-1` means the Analytical Storage never expires. Changing this forces a new resource to be created.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support
	AnalyticalStorageTtl pulumi.IntPtrOutput                      `pulumi:"analyticalStorageTtl"`
	AutoscaleSettings    CassandraTableAutoscaleSettingsPtrOutput `pulumi:"autoscaleSettings"`
	// The ID of the Cosmos DB Cassandra Keyspace to create the table within. Changing this forces a new resource to be created.
	CassandraKeyspaceId pulumi.StringOutput `pulumi:"cassandraKeyspaceId"`
	// Time to live of the Cosmos DB Cassandra table. Possible values are at least `-1`. `-1` means the Cassandra table never expires.
	DefaultTtl pulumi.IntPtrOutput `pulumi:"defaultTtl"`
	// Specifies the name of the Cosmos DB Cassandra Table. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A `schema` block as defined below.
	Schema     CassandraTableSchemaOutput `pulumi:"schema"`
	Throughput pulumi.IntOutput           `pulumi:"throughput"`
}

// NewCassandraTable registers a new resource with the given unique name, arguments, and options.
func NewCassandraTable(ctx *pulumi.Context,
	name string, args *CassandraTableArgs, opts ...pulumi.ResourceOption) (*CassandraTable, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CassandraKeyspaceId == nil {
		return nil, errors.New("invalid value for required argument 'CassandraKeyspaceId'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CassandraTable
	err := ctx.RegisterResource("azure:cosmosdb/cassandraTable:CassandraTable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCassandraTable gets an existing CassandraTable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCassandraTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CassandraTableState, opts ...pulumi.ResourceOption) (*CassandraTable, error) {
	var resource CassandraTable
	err := ctx.ReadResource("azure:cosmosdb/cassandraTable:CassandraTable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CassandraTable resources.
type cassandraTableState struct {
	// Time to live of the Analytical Storage. Possible values are between `-1` and `2147483647` except `0`. `-1` means the Analytical Storage never expires. Changing this forces a new resource to be created.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support
	AnalyticalStorageTtl *int                             `pulumi:"analyticalStorageTtl"`
	AutoscaleSettings    *CassandraTableAutoscaleSettings `pulumi:"autoscaleSettings"`
	// The ID of the Cosmos DB Cassandra Keyspace to create the table within. Changing this forces a new resource to be created.
	CassandraKeyspaceId *string `pulumi:"cassandraKeyspaceId"`
	// Time to live of the Cosmos DB Cassandra table. Possible values are at least `-1`. `-1` means the Cassandra table never expires.
	DefaultTtl *int `pulumi:"defaultTtl"`
	// Specifies the name of the Cosmos DB Cassandra Table. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A `schema` block as defined below.
	Schema     *CassandraTableSchema `pulumi:"schema"`
	Throughput *int                  `pulumi:"throughput"`
}

type CassandraTableState struct {
	// Time to live of the Analytical Storage. Possible values are between `-1` and `2147483647` except `0`. `-1` means the Analytical Storage never expires. Changing this forces a new resource to be created.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support
	AnalyticalStorageTtl pulumi.IntPtrInput
	AutoscaleSettings    CassandraTableAutoscaleSettingsPtrInput
	// The ID of the Cosmos DB Cassandra Keyspace to create the table within. Changing this forces a new resource to be created.
	CassandraKeyspaceId pulumi.StringPtrInput
	// Time to live of the Cosmos DB Cassandra table. Possible values are at least `-1`. `-1` means the Cassandra table never expires.
	DefaultTtl pulumi.IntPtrInput
	// Specifies the name of the Cosmos DB Cassandra Table. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A `schema` block as defined below.
	Schema     CassandraTableSchemaPtrInput
	Throughput pulumi.IntPtrInput
}

func (CassandraTableState) ElementType() reflect.Type {
	return reflect.TypeOf((*cassandraTableState)(nil)).Elem()
}

type cassandraTableArgs struct {
	// Time to live of the Analytical Storage. Possible values are between `-1` and `2147483647` except `0`. `-1` means the Analytical Storage never expires. Changing this forces a new resource to be created.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support
	AnalyticalStorageTtl *int                             `pulumi:"analyticalStorageTtl"`
	AutoscaleSettings    *CassandraTableAutoscaleSettings `pulumi:"autoscaleSettings"`
	// The ID of the Cosmos DB Cassandra Keyspace to create the table within. Changing this forces a new resource to be created.
	CassandraKeyspaceId string `pulumi:"cassandraKeyspaceId"`
	// Time to live of the Cosmos DB Cassandra table. Possible values are at least `-1`. `-1` means the Cassandra table never expires.
	DefaultTtl *int `pulumi:"defaultTtl"`
	// Specifies the name of the Cosmos DB Cassandra Table. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A `schema` block as defined below.
	Schema     CassandraTableSchema `pulumi:"schema"`
	Throughput *int                 `pulumi:"throughput"`
}

// The set of arguments for constructing a CassandraTable resource.
type CassandraTableArgs struct {
	// Time to live of the Analytical Storage. Possible values are between `-1` and `2147483647` except `0`. `-1` means the Analytical Storage never expires. Changing this forces a new resource to be created.
	//
	// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support
	AnalyticalStorageTtl pulumi.IntPtrInput
	AutoscaleSettings    CassandraTableAutoscaleSettingsPtrInput
	// The ID of the Cosmos DB Cassandra Keyspace to create the table within. Changing this forces a new resource to be created.
	CassandraKeyspaceId pulumi.StringInput
	// Time to live of the Cosmos DB Cassandra table. Possible values are at least `-1`. `-1` means the Cassandra table never expires.
	DefaultTtl pulumi.IntPtrInput
	// Specifies the name of the Cosmos DB Cassandra Table. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A `schema` block as defined below.
	Schema     CassandraTableSchemaInput
	Throughput pulumi.IntPtrInput
}

func (CassandraTableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cassandraTableArgs)(nil)).Elem()
}

type CassandraTableInput interface {
	pulumi.Input

	ToCassandraTableOutput() CassandraTableOutput
	ToCassandraTableOutputWithContext(ctx context.Context) CassandraTableOutput
}

func (*CassandraTable) ElementType() reflect.Type {
	return reflect.TypeOf((**CassandraTable)(nil)).Elem()
}

func (i *CassandraTable) ToCassandraTableOutput() CassandraTableOutput {
	return i.ToCassandraTableOutputWithContext(context.Background())
}

func (i *CassandraTable) ToCassandraTableOutputWithContext(ctx context.Context) CassandraTableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CassandraTableOutput)
}

// CassandraTableArrayInput is an input type that accepts CassandraTableArray and CassandraTableArrayOutput values.
// You can construct a concrete instance of `CassandraTableArrayInput` via:
//
//	CassandraTableArray{ CassandraTableArgs{...} }
type CassandraTableArrayInput interface {
	pulumi.Input

	ToCassandraTableArrayOutput() CassandraTableArrayOutput
	ToCassandraTableArrayOutputWithContext(context.Context) CassandraTableArrayOutput
}

type CassandraTableArray []CassandraTableInput

func (CassandraTableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CassandraTable)(nil)).Elem()
}

func (i CassandraTableArray) ToCassandraTableArrayOutput() CassandraTableArrayOutput {
	return i.ToCassandraTableArrayOutputWithContext(context.Background())
}

func (i CassandraTableArray) ToCassandraTableArrayOutputWithContext(ctx context.Context) CassandraTableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CassandraTableArrayOutput)
}

// CassandraTableMapInput is an input type that accepts CassandraTableMap and CassandraTableMapOutput values.
// You can construct a concrete instance of `CassandraTableMapInput` via:
//
//	CassandraTableMap{ "key": CassandraTableArgs{...} }
type CassandraTableMapInput interface {
	pulumi.Input

	ToCassandraTableMapOutput() CassandraTableMapOutput
	ToCassandraTableMapOutputWithContext(context.Context) CassandraTableMapOutput
}

type CassandraTableMap map[string]CassandraTableInput

func (CassandraTableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CassandraTable)(nil)).Elem()
}

func (i CassandraTableMap) ToCassandraTableMapOutput() CassandraTableMapOutput {
	return i.ToCassandraTableMapOutputWithContext(context.Background())
}

func (i CassandraTableMap) ToCassandraTableMapOutputWithContext(ctx context.Context) CassandraTableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CassandraTableMapOutput)
}

type CassandraTableOutput struct{ *pulumi.OutputState }

func (CassandraTableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CassandraTable)(nil)).Elem()
}

func (o CassandraTableOutput) ToCassandraTableOutput() CassandraTableOutput {
	return o
}

func (o CassandraTableOutput) ToCassandraTableOutputWithContext(ctx context.Context) CassandraTableOutput {
	return o
}

// Time to live of the Analytical Storage. Possible values are between `-1` and `2147483647` except `0`. `-1` means the Analytical Storage never expires. Changing this forces a new resource to be created.
//
// > **Note:** throughput has a maximum value of `1000000` unless a higher limit is requested via Azure Support
func (o CassandraTableOutput) AnalyticalStorageTtl() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CassandraTable) pulumi.IntPtrOutput { return v.AnalyticalStorageTtl }).(pulumi.IntPtrOutput)
}

func (o CassandraTableOutput) AutoscaleSettings() CassandraTableAutoscaleSettingsPtrOutput {
	return o.ApplyT(func(v *CassandraTable) CassandraTableAutoscaleSettingsPtrOutput { return v.AutoscaleSettings }).(CassandraTableAutoscaleSettingsPtrOutput)
}

// The ID of the Cosmos DB Cassandra Keyspace to create the table within. Changing this forces a new resource to be created.
func (o CassandraTableOutput) CassandraKeyspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *CassandraTable) pulumi.StringOutput { return v.CassandraKeyspaceId }).(pulumi.StringOutput)
}

// Time to live of the Cosmos DB Cassandra table. Possible values are at least `-1`. `-1` means the Cassandra table never expires.
func (o CassandraTableOutput) DefaultTtl() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CassandraTable) pulumi.IntPtrOutput { return v.DefaultTtl }).(pulumi.IntPtrOutput)
}

// Specifies the name of the Cosmos DB Cassandra Table. Changing this forces a new resource to be created.
func (o CassandraTableOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CassandraTable) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A `schema` block as defined below.
func (o CassandraTableOutput) Schema() CassandraTableSchemaOutput {
	return o.ApplyT(func(v *CassandraTable) CassandraTableSchemaOutput { return v.Schema }).(CassandraTableSchemaOutput)
}

func (o CassandraTableOutput) Throughput() pulumi.IntOutput {
	return o.ApplyT(func(v *CassandraTable) pulumi.IntOutput { return v.Throughput }).(pulumi.IntOutput)
}

type CassandraTableArrayOutput struct{ *pulumi.OutputState }

func (CassandraTableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CassandraTable)(nil)).Elem()
}

func (o CassandraTableArrayOutput) ToCassandraTableArrayOutput() CassandraTableArrayOutput {
	return o
}

func (o CassandraTableArrayOutput) ToCassandraTableArrayOutputWithContext(ctx context.Context) CassandraTableArrayOutput {
	return o
}

func (o CassandraTableArrayOutput) Index(i pulumi.IntInput) CassandraTableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CassandraTable {
		return vs[0].([]*CassandraTable)[vs[1].(int)]
	}).(CassandraTableOutput)
}

type CassandraTableMapOutput struct{ *pulumi.OutputState }

func (CassandraTableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CassandraTable)(nil)).Elem()
}

func (o CassandraTableMapOutput) ToCassandraTableMapOutput() CassandraTableMapOutput {
	return o
}

func (o CassandraTableMapOutput) ToCassandraTableMapOutputWithContext(ctx context.Context) CassandraTableMapOutput {
	return o
}

func (o CassandraTableMapOutput) MapIndex(k pulumi.StringInput) CassandraTableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CassandraTable {
		return vs[0].(map[string]*CassandraTable)[vs[1].(string)]
	}).(CassandraTableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CassandraTableInput)(nil)).Elem(), &CassandraTable{})
	pulumi.RegisterInputType(reflect.TypeOf((*CassandraTableArrayInput)(nil)).Elem(), CassandraTableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CassandraTableMapInput)(nil)).Elem(), CassandraTableMap{})
	pulumi.RegisterOutputType(CassandraTableOutput{})
	pulumi.RegisterOutputType(CassandraTableArrayOutput{})
	pulumi.RegisterOutputType(CassandraTableMapOutput{})
}
