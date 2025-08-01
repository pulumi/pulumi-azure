// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Route Filter.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := network.NewRouteFilter(ctx, "example", &network.RouteFilterArgs{
//				Name:              pulumi.String("example"),
//				ResourceGroupName: pulumi.String("example"),
//				Location:          pulumi.String("East US"),
//				Rule: &network.RouteFilterRuleArgs{
//					Name:     pulumi.String("rule"),
//					Access:   pulumi.String("Allow"),
//					RuleType: pulumi.String("Community"),
//					Communities: pulumi.StringArray{
//						pulumi.String("12076:52004"),
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
// * `Microsoft.Network`: 2024-05-01
//
// ## Import
//
// Route Filters can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:network/routeFilter:RouteFilter example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/routeFilters/routeFilter1
// ```
type RouteFilter struct {
	pulumi.CustomResourceState

	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The Name which should be used for this Route Filter.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `rule` block as defined below.
	Rule RouteFilterRuleOutput `pulumi:"rule"`
	// A mapping of tags which should be assigned to the Route Filter.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewRouteFilter registers a new resource with the given unique name, arguments, and options.
func NewRouteFilter(ctx *pulumi.Context,
	name string, args *RouteFilterArgs, opts ...pulumi.ResourceOption) (*RouteFilter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RouteFilter
	err := ctx.RegisterResource("azure:network/routeFilter:RouteFilter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouteFilter gets an existing RouteFilter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouteFilter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteFilterState, opts ...pulumi.ResourceOption) (*RouteFilter, error) {
	var resource RouteFilter
	err := ctx.ReadResource("azure:network/routeFilter:RouteFilter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouteFilter resources.
type routeFilterState struct {
	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location *string `pulumi:"location"`
	// The Name which should be used for this Route Filter.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `rule` block as defined below.
	Rule *RouteFilterRule `pulumi:"rule"`
	// A mapping of tags which should be assigned to the Route Filter.
	Tags map[string]string `pulumi:"tags"`
}

type RouteFilterState struct {
	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location pulumi.StringPtrInput
	// The Name which should be used for this Route Filter.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `rule` block as defined below.
	Rule RouteFilterRulePtrInput
	// A mapping of tags which should be assigned to the Route Filter.
	Tags pulumi.StringMapInput
}

func (RouteFilterState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeFilterState)(nil)).Elem()
}

type routeFilterArgs struct {
	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location *string `pulumi:"location"`
	// The Name which should be used for this Route Filter.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `rule` block as defined below.
	Rule *RouteFilterRule `pulumi:"rule"`
	// A mapping of tags which should be assigned to the Route Filter.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a RouteFilter resource.
type RouteFilterArgs struct {
	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location pulumi.StringPtrInput
	// The Name which should be used for this Route Filter.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName pulumi.StringInput
	// A `rule` block as defined below.
	Rule RouteFilterRulePtrInput
	// A mapping of tags which should be assigned to the Route Filter.
	Tags pulumi.StringMapInput
}

func (RouteFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeFilterArgs)(nil)).Elem()
}

type RouteFilterInput interface {
	pulumi.Input

	ToRouteFilterOutput() RouteFilterOutput
	ToRouteFilterOutputWithContext(ctx context.Context) RouteFilterOutput
}

func (*RouteFilter) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteFilter)(nil)).Elem()
}

func (i *RouteFilter) ToRouteFilterOutput() RouteFilterOutput {
	return i.ToRouteFilterOutputWithContext(context.Background())
}

func (i *RouteFilter) ToRouteFilterOutputWithContext(ctx context.Context) RouteFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteFilterOutput)
}

// RouteFilterArrayInput is an input type that accepts RouteFilterArray and RouteFilterArrayOutput values.
// You can construct a concrete instance of `RouteFilterArrayInput` via:
//
//	RouteFilterArray{ RouteFilterArgs{...} }
type RouteFilterArrayInput interface {
	pulumi.Input

	ToRouteFilterArrayOutput() RouteFilterArrayOutput
	ToRouteFilterArrayOutputWithContext(context.Context) RouteFilterArrayOutput
}

type RouteFilterArray []RouteFilterInput

func (RouteFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouteFilter)(nil)).Elem()
}

func (i RouteFilterArray) ToRouteFilterArrayOutput() RouteFilterArrayOutput {
	return i.ToRouteFilterArrayOutputWithContext(context.Background())
}

func (i RouteFilterArray) ToRouteFilterArrayOutputWithContext(ctx context.Context) RouteFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteFilterArrayOutput)
}

// RouteFilterMapInput is an input type that accepts RouteFilterMap and RouteFilterMapOutput values.
// You can construct a concrete instance of `RouteFilterMapInput` via:
//
//	RouteFilterMap{ "key": RouteFilterArgs{...} }
type RouteFilterMapInput interface {
	pulumi.Input

	ToRouteFilterMapOutput() RouteFilterMapOutput
	ToRouteFilterMapOutputWithContext(context.Context) RouteFilterMapOutput
}

type RouteFilterMap map[string]RouteFilterInput

func (RouteFilterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouteFilter)(nil)).Elem()
}

func (i RouteFilterMap) ToRouteFilterMapOutput() RouteFilterMapOutput {
	return i.ToRouteFilterMapOutputWithContext(context.Background())
}

func (i RouteFilterMap) ToRouteFilterMapOutputWithContext(ctx context.Context) RouteFilterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteFilterMapOutput)
}

type RouteFilterOutput struct{ *pulumi.OutputState }

func (RouteFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteFilter)(nil)).Elem()
}

func (o RouteFilterOutput) ToRouteFilterOutput() RouteFilterOutput {
	return o
}

func (o RouteFilterOutput) ToRouteFilterOutputWithContext(ctx context.Context) RouteFilterOutput {
	return o
}

// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
func (o RouteFilterOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteFilter) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The Name which should be used for this Route Filter.
func (o RouteFilterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteFilter) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
func (o RouteFilterOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *RouteFilter) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `rule` block as defined below.
func (o RouteFilterOutput) Rule() RouteFilterRuleOutput {
	return o.ApplyT(func(v *RouteFilter) RouteFilterRuleOutput { return v.Rule }).(RouteFilterRuleOutput)
}

// A mapping of tags which should be assigned to the Route Filter.
func (o RouteFilterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RouteFilter) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type RouteFilterArrayOutput struct{ *pulumi.OutputState }

func (RouteFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouteFilter)(nil)).Elem()
}

func (o RouteFilterArrayOutput) ToRouteFilterArrayOutput() RouteFilterArrayOutput {
	return o
}

func (o RouteFilterArrayOutput) ToRouteFilterArrayOutputWithContext(ctx context.Context) RouteFilterArrayOutput {
	return o
}

func (o RouteFilterArrayOutput) Index(i pulumi.IntInput) RouteFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RouteFilter {
		return vs[0].([]*RouteFilter)[vs[1].(int)]
	}).(RouteFilterOutput)
}

type RouteFilterMapOutput struct{ *pulumi.OutputState }

func (RouteFilterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouteFilter)(nil)).Elem()
}

func (o RouteFilterMapOutput) ToRouteFilterMapOutput() RouteFilterMapOutput {
	return o
}

func (o RouteFilterMapOutput) ToRouteFilterMapOutputWithContext(ctx context.Context) RouteFilterMapOutput {
	return o
}

func (o RouteFilterMapOutput) MapIndex(k pulumi.StringInput) RouteFilterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RouteFilter {
		return vs[0].(map[string]*RouteFilter)[vs[1].(string)]
	}).(RouteFilterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouteFilterInput)(nil)).Elem(), &RouteFilter{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteFilterArrayInput)(nil)).Elem(), RouteFilterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteFilterMapInput)(nil)).Elem(), RouteFilterMap{})
	pulumi.RegisterOutputType(RouteFilterOutput{})
	pulumi.RegisterOutputType(RouteFilterArrayOutput{})
	pulumi.RegisterOutputType(RouteFilterMapOutput{})
}
