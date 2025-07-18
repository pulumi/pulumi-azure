// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Monitor Private Link Scope.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/monitoring"
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
//			_, err = monitoring.NewPrivateLinkScope(ctx, "example", &monitoring.PrivateLinkScopeArgs{
//				Name:                pulumi.String("example-ampls"),
//				ResourceGroupName:   example.Name,
//				IngestionAccessMode: pulumi.String("PrivateOnly"),
//				QueryAccessMode:     pulumi.String("Open"),
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
// * `Microsoft.Insights`: 2021-07-01-preview
//
// ## Import
//
// Azure Monitor Private Link Scopes can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:monitoring/privateLinkScope:PrivateLinkScope example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Insights/privateLinkScopes/pls1
// ```
type PrivateLinkScope struct {
	pulumi.CustomResourceState

	// The default ingestion access mode for the associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	IngestionAccessMode pulumi.StringPtrOutput `pulumi:"ingestionAccessMode"`
	// The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The default query access mode for hte associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	QueryAccessMode pulumi.StringPtrOutput `pulumi:"queryAccessMode"`
	// The name of the Resource Group where the Azure Monitor Private Link Scope should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Azure Monitor Private Link Scope.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewPrivateLinkScope registers a new resource with the given unique name, arguments, and options.
func NewPrivateLinkScope(ctx *pulumi.Context,
	name string, args *PrivateLinkScopeArgs, opts ...pulumi.ResourceOption) (*PrivateLinkScope, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PrivateLinkScope
	err := ctx.RegisterResource("azure:monitoring/privateLinkScope:PrivateLinkScope", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateLinkScope gets an existing PrivateLinkScope resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateLinkScope(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateLinkScopeState, opts ...pulumi.ResourceOption) (*PrivateLinkScope, error) {
	var resource PrivateLinkScope
	err := ctx.ReadResource("azure:monitoring/privateLinkScope:PrivateLinkScope", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateLinkScope resources.
type privateLinkScopeState struct {
	// The default ingestion access mode for the associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	IngestionAccessMode *string `pulumi:"ingestionAccessMode"`
	// The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The default query access mode for hte associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	QueryAccessMode *string `pulumi:"queryAccessMode"`
	// The name of the Resource Group where the Azure Monitor Private Link Scope should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Azure Monitor Private Link Scope.
	Tags map[string]string `pulumi:"tags"`
}

type PrivateLinkScopeState struct {
	// The default ingestion access mode for the associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	IngestionAccessMode pulumi.StringPtrInput
	// The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The default query access mode for hte associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	QueryAccessMode pulumi.StringPtrInput
	// The name of the Resource Group where the Azure Monitor Private Link Scope should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Azure Monitor Private Link Scope.
	Tags pulumi.StringMapInput
}

func (PrivateLinkScopeState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkScopeState)(nil)).Elem()
}

type privateLinkScopeArgs struct {
	// The default ingestion access mode for the associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	IngestionAccessMode *string `pulumi:"ingestionAccessMode"`
	// The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The default query access mode for hte associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	QueryAccessMode *string `pulumi:"queryAccessMode"`
	// The name of the Resource Group where the Azure Monitor Private Link Scope should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Azure Monitor Private Link Scope.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a PrivateLinkScope resource.
type PrivateLinkScopeArgs struct {
	// The default ingestion access mode for the associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	IngestionAccessMode pulumi.StringPtrInput
	// The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The default query access mode for hte associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
	QueryAccessMode pulumi.StringPtrInput
	// The name of the Resource Group where the Azure Monitor Private Link Scope should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Azure Monitor Private Link Scope.
	Tags pulumi.StringMapInput
}

func (PrivateLinkScopeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkScopeArgs)(nil)).Elem()
}

type PrivateLinkScopeInput interface {
	pulumi.Input

	ToPrivateLinkScopeOutput() PrivateLinkScopeOutput
	ToPrivateLinkScopeOutputWithContext(ctx context.Context) PrivateLinkScopeOutput
}

func (*PrivateLinkScope) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkScope)(nil)).Elem()
}

func (i *PrivateLinkScope) ToPrivateLinkScopeOutput() PrivateLinkScopeOutput {
	return i.ToPrivateLinkScopeOutputWithContext(context.Background())
}

func (i *PrivateLinkScope) ToPrivateLinkScopeOutputWithContext(ctx context.Context) PrivateLinkScopeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkScopeOutput)
}

// PrivateLinkScopeArrayInput is an input type that accepts PrivateLinkScopeArray and PrivateLinkScopeArrayOutput values.
// You can construct a concrete instance of `PrivateLinkScopeArrayInput` via:
//
//	PrivateLinkScopeArray{ PrivateLinkScopeArgs{...} }
type PrivateLinkScopeArrayInput interface {
	pulumi.Input

	ToPrivateLinkScopeArrayOutput() PrivateLinkScopeArrayOutput
	ToPrivateLinkScopeArrayOutputWithContext(context.Context) PrivateLinkScopeArrayOutput
}

type PrivateLinkScopeArray []PrivateLinkScopeInput

func (PrivateLinkScopeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkScope)(nil)).Elem()
}

func (i PrivateLinkScopeArray) ToPrivateLinkScopeArrayOutput() PrivateLinkScopeArrayOutput {
	return i.ToPrivateLinkScopeArrayOutputWithContext(context.Background())
}

func (i PrivateLinkScopeArray) ToPrivateLinkScopeArrayOutputWithContext(ctx context.Context) PrivateLinkScopeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkScopeArrayOutput)
}

// PrivateLinkScopeMapInput is an input type that accepts PrivateLinkScopeMap and PrivateLinkScopeMapOutput values.
// You can construct a concrete instance of `PrivateLinkScopeMapInput` via:
//
//	PrivateLinkScopeMap{ "key": PrivateLinkScopeArgs{...} }
type PrivateLinkScopeMapInput interface {
	pulumi.Input

	ToPrivateLinkScopeMapOutput() PrivateLinkScopeMapOutput
	ToPrivateLinkScopeMapOutputWithContext(context.Context) PrivateLinkScopeMapOutput
}

type PrivateLinkScopeMap map[string]PrivateLinkScopeInput

func (PrivateLinkScopeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkScope)(nil)).Elem()
}

func (i PrivateLinkScopeMap) ToPrivateLinkScopeMapOutput() PrivateLinkScopeMapOutput {
	return i.ToPrivateLinkScopeMapOutputWithContext(context.Background())
}

func (i PrivateLinkScopeMap) ToPrivateLinkScopeMapOutputWithContext(ctx context.Context) PrivateLinkScopeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkScopeMapOutput)
}

type PrivateLinkScopeOutput struct{ *pulumi.OutputState }

func (PrivateLinkScopeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkScope)(nil)).Elem()
}

func (o PrivateLinkScopeOutput) ToPrivateLinkScopeOutput() PrivateLinkScopeOutput {
	return o
}

func (o PrivateLinkScopeOutput) ToPrivateLinkScopeOutputWithContext(ctx context.Context) PrivateLinkScopeOutput {
	return o
}

// The default ingestion access mode for the associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
func (o PrivateLinkScopeOutput) IngestionAccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.StringPtrOutput { return v.IngestionAccessMode }).(pulumi.StringPtrOutput)
}

// The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
func (o PrivateLinkScopeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The default query access mode for hte associated private endpoints in scope. Possible values are `Open` and `PrivateOnly`. Defaults to `Open`.
func (o PrivateLinkScopeOutput) QueryAccessMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.StringPtrOutput { return v.QueryAccessMode }).(pulumi.StringPtrOutput)
}

// The name of the Resource Group where the Azure Monitor Private Link Scope should exist. Changing this forces a new resource to be created.
func (o PrivateLinkScopeOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Azure Monitor Private Link Scope.
func (o PrivateLinkScopeOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type PrivateLinkScopeArrayOutput struct{ *pulumi.OutputState }

func (PrivateLinkScopeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkScope)(nil)).Elem()
}

func (o PrivateLinkScopeArrayOutput) ToPrivateLinkScopeArrayOutput() PrivateLinkScopeArrayOutput {
	return o
}

func (o PrivateLinkScopeArrayOutput) ToPrivateLinkScopeArrayOutputWithContext(ctx context.Context) PrivateLinkScopeArrayOutput {
	return o
}

func (o PrivateLinkScopeArrayOutput) Index(i pulumi.IntInput) PrivateLinkScopeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivateLinkScope {
		return vs[0].([]*PrivateLinkScope)[vs[1].(int)]
	}).(PrivateLinkScopeOutput)
}

type PrivateLinkScopeMapOutput struct{ *pulumi.OutputState }

func (PrivateLinkScopeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkScope)(nil)).Elem()
}

func (o PrivateLinkScopeMapOutput) ToPrivateLinkScopeMapOutput() PrivateLinkScopeMapOutput {
	return o
}

func (o PrivateLinkScopeMapOutput) ToPrivateLinkScopeMapOutputWithContext(ctx context.Context) PrivateLinkScopeMapOutput {
	return o
}

func (o PrivateLinkScopeMapOutput) MapIndex(k pulumi.StringInput) PrivateLinkScopeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivateLinkScope {
		return vs[0].(map[string]*PrivateLinkScope)[vs[1].(string)]
	}).(PrivateLinkScopeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkScopeInput)(nil)).Elem(), &PrivateLinkScope{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkScopeArrayInput)(nil)).Elem(), PrivateLinkScopeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkScopeMapInput)(nil)).Elem(), PrivateLinkScopeMap{})
	pulumi.RegisterOutputType(PrivateLinkScopeOutput{})
	pulumi.RegisterOutputType(PrivateLinkScopeArrayOutput{})
	pulumi.RegisterOutputType(PrivateLinkScopeMapOutput{})
}
