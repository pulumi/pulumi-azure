// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package streamanalytics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Stream Analytics Output to CosmosDB.
//
// ## Import
//
// Stream Analytics Outputs for CosmosDB can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:streamanalytics/outputCosmosdb:OutputCosmosdb example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingJobs/job1/outputs/output1
// ```
type OutputCosmosdb struct {
	pulumi.CustomResourceState

	// The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
	AuthenticationMode pulumi.StringPtrOutput `pulumi:"authenticationMode"`
	// The name of the CosmosDB container.
	ContainerName pulumi.StringOutput `pulumi:"containerName"`
	// The account key for the CosmosDB database.
	CosmosdbAccountKey pulumi.StringOutput `pulumi:"cosmosdbAccountKey"`
	// The ID of the CosmosDB database.
	CosmosdbSqlDatabaseId pulumi.StringOutput `pulumi:"cosmosdbSqlDatabaseId"`
	// The name of the field in output events used to specify the primary key which insert or update operations are based on.
	DocumentId pulumi.StringPtrOutput `pulumi:"documentId"`
	// The name of the Stream Analytics Output. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the field in output events used to specify the key for partitioning output across collections. If `containerName` contains `{partition}` token, this property is required to be specified.
	PartitionKey pulumi.StringPtrOutput `pulumi:"partitionKey"`
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId pulumi.StringOutput `pulumi:"streamAnalyticsJobId"`
}

// NewOutputCosmosdb registers a new resource with the given unique name, arguments, and options.
func NewOutputCosmosdb(ctx *pulumi.Context,
	name string, args *OutputCosmosdbArgs, opts ...pulumi.ResourceOption) (*OutputCosmosdb, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContainerName == nil {
		return nil, errors.New("invalid value for required argument 'ContainerName'")
	}
	if args.CosmosdbAccountKey == nil {
		return nil, errors.New("invalid value for required argument 'CosmosdbAccountKey'")
	}
	if args.CosmosdbSqlDatabaseId == nil {
		return nil, errors.New("invalid value for required argument 'CosmosdbSqlDatabaseId'")
	}
	if args.StreamAnalyticsJobId == nil {
		return nil, errors.New("invalid value for required argument 'StreamAnalyticsJobId'")
	}
	if args.CosmosdbAccountKey != nil {
		args.CosmosdbAccountKey = pulumi.ToSecret(args.CosmosdbAccountKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"cosmosdbAccountKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OutputCosmosdb
	err := ctx.RegisterResource("azure:streamanalytics/outputCosmosdb:OutputCosmosdb", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOutputCosmosdb gets an existing OutputCosmosdb resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOutputCosmosdb(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OutputCosmosdbState, opts ...pulumi.ResourceOption) (*OutputCosmosdb, error) {
	var resource OutputCosmosdb
	err := ctx.ReadResource("azure:streamanalytics/outputCosmosdb:OutputCosmosdb", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OutputCosmosdb resources.
type outputCosmosdbState struct {
	// The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
	AuthenticationMode *string `pulumi:"authenticationMode"`
	// The name of the CosmosDB container.
	ContainerName *string `pulumi:"containerName"`
	// The account key for the CosmosDB database.
	CosmosdbAccountKey *string `pulumi:"cosmosdbAccountKey"`
	// The ID of the CosmosDB database.
	CosmosdbSqlDatabaseId *string `pulumi:"cosmosdbSqlDatabaseId"`
	// The name of the field in output events used to specify the primary key which insert or update operations are based on.
	DocumentId *string `pulumi:"documentId"`
	// The name of the Stream Analytics Output. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the field in output events used to specify the key for partitioning output across collections. If `containerName` contains `{partition}` token, this property is required to be specified.
	PartitionKey *string `pulumi:"partitionKey"`
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId *string `pulumi:"streamAnalyticsJobId"`
}

type OutputCosmosdbState struct {
	// The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
	AuthenticationMode pulumi.StringPtrInput
	// The name of the CosmosDB container.
	ContainerName pulumi.StringPtrInput
	// The account key for the CosmosDB database.
	CosmosdbAccountKey pulumi.StringPtrInput
	// The ID of the CosmosDB database.
	CosmosdbSqlDatabaseId pulumi.StringPtrInput
	// The name of the field in output events used to specify the primary key which insert or update operations are based on.
	DocumentId pulumi.StringPtrInput
	// The name of the Stream Analytics Output. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the field in output events used to specify the key for partitioning output across collections. If `containerName` contains `{partition}` token, this property is required to be specified.
	PartitionKey pulumi.StringPtrInput
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId pulumi.StringPtrInput
}

func (OutputCosmosdbState) ElementType() reflect.Type {
	return reflect.TypeOf((*outputCosmosdbState)(nil)).Elem()
}

type outputCosmosdbArgs struct {
	// The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
	AuthenticationMode *string `pulumi:"authenticationMode"`
	// The name of the CosmosDB container.
	ContainerName string `pulumi:"containerName"`
	// The account key for the CosmosDB database.
	CosmosdbAccountKey string `pulumi:"cosmosdbAccountKey"`
	// The ID of the CosmosDB database.
	CosmosdbSqlDatabaseId string `pulumi:"cosmosdbSqlDatabaseId"`
	// The name of the field in output events used to specify the primary key which insert or update operations are based on.
	DocumentId *string `pulumi:"documentId"`
	// The name of the Stream Analytics Output. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the field in output events used to specify the key for partitioning output across collections. If `containerName` contains `{partition}` token, this property is required to be specified.
	PartitionKey *string `pulumi:"partitionKey"`
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId string `pulumi:"streamAnalyticsJobId"`
}

// The set of arguments for constructing a OutputCosmosdb resource.
type OutputCosmosdbArgs struct {
	// The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
	AuthenticationMode pulumi.StringPtrInput
	// The name of the CosmosDB container.
	ContainerName pulumi.StringInput
	// The account key for the CosmosDB database.
	CosmosdbAccountKey pulumi.StringInput
	// The ID of the CosmosDB database.
	CosmosdbSqlDatabaseId pulumi.StringInput
	// The name of the field in output events used to specify the primary key which insert or update operations are based on.
	DocumentId pulumi.StringPtrInput
	// The name of the Stream Analytics Output. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the field in output events used to specify the key for partitioning output across collections. If `containerName` contains `{partition}` token, this property is required to be specified.
	PartitionKey pulumi.StringPtrInput
	// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobId pulumi.StringInput
}

func (OutputCosmosdbArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*outputCosmosdbArgs)(nil)).Elem()
}

type OutputCosmosdbInput interface {
	pulumi.Input

	ToOutputCosmosdbOutput() OutputCosmosdbOutput
	ToOutputCosmosdbOutputWithContext(ctx context.Context) OutputCosmosdbOutput
}

func (*OutputCosmosdb) ElementType() reflect.Type {
	return reflect.TypeOf((**OutputCosmosdb)(nil)).Elem()
}

func (i *OutputCosmosdb) ToOutputCosmosdbOutput() OutputCosmosdbOutput {
	return i.ToOutputCosmosdbOutputWithContext(context.Background())
}

func (i *OutputCosmosdb) ToOutputCosmosdbOutputWithContext(ctx context.Context) OutputCosmosdbOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OutputCosmosdbOutput)
}

// OutputCosmosdbArrayInput is an input type that accepts OutputCosmosdbArray and OutputCosmosdbArrayOutput values.
// You can construct a concrete instance of `OutputCosmosdbArrayInput` via:
//
//	OutputCosmosdbArray{ OutputCosmosdbArgs{...} }
type OutputCosmosdbArrayInput interface {
	pulumi.Input

	ToOutputCosmosdbArrayOutput() OutputCosmosdbArrayOutput
	ToOutputCosmosdbArrayOutputWithContext(context.Context) OutputCosmosdbArrayOutput
}

type OutputCosmosdbArray []OutputCosmosdbInput

func (OutputCosmosdbArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OutputCosmosdb)(nil)).Elem()
}

func (i OutputCosmosdbArray) ToOutputCosmosdbArrayOutput() OutputCosmosdbArrayOutput {
	return i.ToOutputCosmosdbArrayOutputWithContext(context.Background())
}

func (i OutputCosmosdbArray) ToOutputCosmosdbArrayOutputWithContext(ctx context.Context) OutputCosmosdbArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OutputCosmosdbArrayOutput)
}

// OutputCosmosdbMapInput is an input type that accepts OutputCosmosdbMap and OutputCosmosdbMapOutput values.
// You can construct a concrete instance of `OutputCosmosdbMapInput` via:
//
//	OutputCosmosdbMap{ "key": OutputCosmosdbArgs{...} }
type OutputCosmosdbMapInput interface {
	pulumi.Input

	ToOutputCosmosdbMapOutput() OutputCosmosdbMapOutput
	ToOutputCosmosdbMapOutputWithContext(context.Context) OutputCosmosdbMapOutput
}

type OutputCosmosdbMap map[string]OutputCosmosdbInput

func (OutputCosmosdbMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OutputCosmosdb)(nil)).Elem()
}

func (i OutputCosmosdbMap) ToOutputCosmosdbMapOutput() OutputCosmosdbMapOutput {
	return i.ToOutputCosmosdbMapOutputWithContext(context.Background())
}

func (i OutputCosmosdbMap) ToOutputCosmosdbMapOutputWithContext(ctx context.Context) OutputCosmosdbMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OutputCosmosdbMapOutput)
}

type OutputCosmosdbOutput struct{ *pulumi.OutputState }

func (OutputCosmosdbOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OutputCosmosdb)(nil)).Elem()
}

func (o OutputCosmosdbOutput) ToOutputCosmosdbOutput() OutputCosmosdbOutput {
	return o
}

func (o OutputCosmosdbOutput) ToOutputCosmosdbOutputWithContext(ctx context.Context) OutputCosmosdbOutput {
	return o
}

// The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
func (o OutputCosmosdbOutput) AuthenticationMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OutputCosmosdb) pulumi.StringPtrOutput { return v.AuthenticationMode }).(pulumi.StringPtrOutput)
}

// The name of the CosmosDB container.
func (o OutputCosmosdbOutput) ContainerName() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputCosmosdb) pulumi.StringOutput { return v.ContainerName }).(pulumi.StringOutput)
}

// The account key for the CosmosDB database.
func (o OutputCosmosdbOutput) CosmosdbAccountKey() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputCosmosdb) pulumi.StringOutput { return v.CosmosdbAccountKey }).(pulumi.StringOutput)
}

// The ID of the CosmosDB database.
func (o OutputCosmosdbOutput) CosmosdbSqlDatabaseId() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputCosmosdb) pulumi.StringOutput { return v.CosmosdbSqlDatabaseId }).(pulumi.StringOutput)
}

// The name of the field in output events used to specify the primary key which insert or update operations are based on.
func (o OutputCosmosdbOutput) DocumentId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OutputCosmosdb) pulumi.StringPtrOutput { return v.DocumentId }).(pulumi.StringPtrOutput)
}

// The name of the Stream Analytics Output. Changing this forces a new resource to be created.
func (o OutputCosmosdbOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputCosmosdb) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the field in output events used to specify the key for partitioning output across collections. If `containerName` contains `{partition}` token, this property is required to be specified.
func (o OutputCosmosdbOutput) PartitionKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OutputCosmosdb) pulumi.StringPtrOutput { return v.PartitionKey }).(pulumi.StringPtrOutput)
}

// The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
func (o OutputCosmosdbOutput) StreamAnalyticsJobId() pulumi.StringOutput {
	return o.ApplyT(func(v *OutputCosmosdb) pulumi.StringOutput { return v.StreamAnalyticsJobId }).(pulumi.StringOutput)
}

type OutputCosmosdbArrayOutput struct{ *pulumi.OutputState }

func (OutputCosmosdbArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OutputCosmosdb)(nil)).Elem()
}

func (o OutputCosmosdbArrayOutput) ToOutputCosmosdbArrayOutput() OutputCosmosdbArrayOutput {
	return o
}

func (o OutputCosmosdbArrayOutput) ToOutputCosmosdbArrayOutputWithContext(ctx context.Context) OutputCosmosdbArrayOutput {
	return o
}

func (o OutputCosmosdbArrayOutput) Index(i pulumi.IntInput) OutputCosmosdbOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OutputCosmosdb {
		return vs[0].([]*OutputCosmosdb)[vs[1].(int)]
	}).(OutputCosmosdbOutput)
}

type OutputCosmosdbMapOutput struct{ *pulumi.OutputState }

func (OutputCosmosdbMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OutputCosmosdb)(nil)).Elem()
}

func (o OutputCosmosdbMapOutput) ToOutputCosmosdbMapOutput() OutputCosmosdbMapOutput {
	return o
}

func (o OutputCosmosdbMapOutput) ToOutputCosmosdbMapOutputWithContext(ctx context.Context) OutputCosmosdbMapOutput {
	return o
}

func (o OutputCosmosdbMapOutput) MapIndex(k pulumi.StringInput) OutputCosmosdbOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OutputCosmosdb {
		return vs[0].(map[string]*OutputCosmosdb)[vs[1].(string)]
	}).(OutputCosmosdbOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OutputCosmosdbInput)(nil)).Elem(), &OutputCosmosdb{})
	pulumi.RegisterInputType(reflect.TypeOf((*OutputCosmosdbArrayInput)(nil)).Elem(), OutputCosmosdbArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OutputCosmosdbMapInput)(nil)).Elem(), OutputCosmosdbMap{})
	pulumi.RegisterOutputType(OutputCosmosdbOutput{})
	pulumi.RegisterOutputType(OutputCosmosdbArrayOutput{})
	pulumi.RegisterOutputType(OutputCosmosdbMapOutput{})
}
