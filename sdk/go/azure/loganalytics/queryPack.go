// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package loganalytics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Log Analytics Query Pack.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/loganalytics"
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
//			_, err = loganalytics.NewQueryPack(ctx, "example", &loganalytics.QueryPackArgs{
//				Name:              pulumi.String("example-laqp"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
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
// * `Microsoft.OperationalInsights`: 2019-09-01
//
// ## Import
//
// Log Analytics Query Packs can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:loganalytics/queryPack:QueryPack example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.OperationalInsights/queryPacks/queryPack1
// ```
type QueryPack struct {
	pulumi.CustomResourceState

	// The Azure Region where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name which should be used for this Log Analytics Query Pack. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Log Analytics Query Pack.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewQueryPack registers a new resource with the given unique name, arguments, and options.
func NewQueryPack(ctx *pulumi.Context,
	name string, args *QueryPackArgs, opts ...pulumi.ResourceOption) (*QueryPack, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource QueryPack
	err := ctx.RegisterResource("azure:loganalytics/queryPack:QueryPack", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetQueryPack gets an existing QueryPack resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetQueryPack(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *QueryPackState, opts ...pulumi.ResourceOption) (*QueryPack, error) {
	var resource QueryPack
	err := ctx.ReadResource("azure:loganalytics/queryPack:QueryPack", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering QueryPack resources.
type queryPackState struct {
	// The Azure Region where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Log Analytics Query Pack. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Log Analytics Query Pack.
	Tags map[string]string `pulumi:"tags"`
}

type QueryPackState struct {
	// The Azure Region where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Log Analytics Query Pack. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Log Analytics Query Pack.
	Tags pulumi.StringMapInput
}

func (QueryPackState) ElementType() reflect.Type {
	return reflect.TypeOf((*queryPackState)(nil)).Elem()
}

type queryPackArgs struct {
	// The Azure Region where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Log Analytics Query Pack. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Log Analytics Query Pack.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a QueryPack resource.
type QueryPackArgs struct {
	// The Azure Region where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Log Analytics Query Pack. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Log Analytics Query Pack.
	Tags pulumi.StringMapInput
}

func (QueryPackArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*queryPackArgs)(nil)).Elem()
}

type QueryPackInput interface {
	pulumi.Input

	ToQueryPackOutput() QueryPackOutput
	ToQueryPackOutputWithContext(ctx context.Context) QueryPackOutput
}

func (*QueryPack) ElementType() reflect.Type {
	return reflect.TypeOf((**QueryPack)(nil)).Elem()
}

func (i *QueryPack) ToQueryPackOutput() QueryPackOutput {
	return i.ToQueryPackOutputWithContext(context.Background())
}

func (i *QueryPack) ToQueryPackOutputWithContext(ctx context.Context) QueryPackOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueryPackOutput)
}

// QueryPackArrayInput is an input type that accepts QueryPackArray and QueryPackArrayOutput values.
// You can construct a concrete instance of `QueryPackArrayInput` via:
//
//	QueryPackArray{ QueryPackArgs{...} }
type QueryPackArrayInput interface {
	pulumi.Input

	ToQueryPackArrayOutput() QueryPackArrayOutput
	ToQueryPackArrayOutputWithContext(context.Context) QueryPackArrayOutput
}

type QueryPackArray []QueryPackInput

func (QueryPackArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*QueryPack)(nil)).Elem()
}

func (i QueryPackArray) ToQueryPackArrayOutput() QueryPackArrayOutput {
	return i.ToQueryPackArrayOutputWithContext(context.Background())
}

func (i QueryPackArray) ToQueryPackArrayOutputWithContext(ctx context.Context) QueryPackArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueryPackArrayOutput)
}

// QueryPackMapInput is an input type that accepts QueryPackMap and QueryPackMapOutput values.
// You can construct a concrete instance of `QueryPackMapInput` via:
//
//	QueryPackMap{ "key": QueryPackArgs{...} }
type QueryPackMapInput interface {
	pulumi.Input

	ToQueryPackMapOutput() QueryPackMapOutput
	ToQueryPackMapOutputWithContext(context.Context) QueryPackMapOutput
}

type QueryPackMap map[string]QueryPackInput

func (QueryPackMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*QueryPack)(nil)).Elem()
}

func (i QueryPackMap) ToQueryPackMapOutput() QueryPackMapOutput {
	return i.ToQueryPackMapOutputWithContext(context.Background())
}

func (i QueryPackMap) ToQueryPackMapOutputWithContext(ctx context.Context) QueryPackMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueryPackMapOutput)
}

type QueryPackOutput struct{ *pulumi.OutputState }

func (QueryPackOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**QueryPack)(nil)).Elem()
}

func (o QueryPackOutput) ToQueryPackOutput() QueryPackOutput {
	return o
}

func (o QueryPackOutput) ToQueryPackOutputWithContext(ctx context.Context) QueryPackOutput {
	return o
}

// The Azure Region where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
func (o QueryPackOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *QueryPack) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name which should be used for this Log Analytics Query Pack. Changing this forces a new resource to be created.
func (o QueryPackOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *QueryPack) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Log Analytics Query Pack should exist. Changing this forces a new resource to be created.
func (o QueryPackOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *QueryPack) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Log Analytics Query Pack.
func (o QueryPackOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *QueryPack) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type QueryPackArrayOutput struct{ *pulumi.OutputState }

func (QueryPackArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*QueryPack)(nil)).Elem()
}

func (o QueryPackArrayOutput) ToQueryPackArrayOutput() QueryPackArrayOutput {
	return o
}

func (o QueryPackArrayOutput) ToQueryPackArrayOutputWithContext(ctx context.Context) QueryPackArrayOutput {
	return o
}

func (o QueryPackArrayOutput) Index(i pulumi.IntInput) QueryPackOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *QueryPack {
		return vs[0].([]*QueryPack)[vs[1].(int)]
	}).(QueryPackOutput)
}

type QueryPackMapOutput struct{ *pulumi.OutputState }

func (QueryPackMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*QueryPack)(nil)).Elem()
}

func (o QueryPackMapOutput) ToQueryPackMapOutput() QueryPackMapOutput {
	return o
}

func (o QueryPackMapOutput) ToQueryPackMapOutputWithContext(ctx context.Context) QueryPackMapOutput {
	return o
}

func (o QueryPackMapOutput) MapIndex(k pulumi.StringInput) QueryPackOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *QueryPack {
		return vs[0].(map[string]*QueryPack)[vs[1].(string)]
	}).(QueryPackOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*QueryPackInput)(nil)).Elem(), &QueryPack{})
	pulumi.RegisterInputType(reflect.TypeOf((*QueryPackArrayInput)(nil)).Elem(), QueryPackArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*QueryPackMapInput)(nil)).Elem(), QueryPackMap{})
	pulumi.RegisterOutputType(QueryPackOutput{})
	pulumi.RegisterOutputType(QueryPackArrayOutput{})
	pulumi.RegisterOutputType(QueryPackMapOutput{})
}
