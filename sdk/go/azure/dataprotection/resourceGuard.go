// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataprotection

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Resource Guard.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/dataprotection"
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
//			_, err = dataprotection.NewResourceGuard(ctx, "example", &dataprotection.ResourceGuardArgs{
//				Name:              pulumi.String("example-resourceguard"),
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
// * `Microsoft.DataProtection`: 2024-04-01
//
// ## Import
//
// Resource Guards can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:dataprotection/resourceGuard:ResourceGuard example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/resourceGuards/resourceGuard1
// ```
type ResourceGuard struct {
	pulumi.CustomResourceState

	// The Azure Region where the Resource Guard should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the Resource Guard. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Resource Guard should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Resource Guard.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A list of the critical operations which are not protected by this Resource Guard.
	VaultCriticalOperationExclusionLists pulumi.StringArrayOutput `pulumi:"vaultCriticalOperationExclusionLists"`
}

// NewResourceGuard registers a new resource with the given unique name, arguments, and options.
func NewResourceGuard(ctx *pulumi.Context,
	name string, args *ResourceGuardArgs, opts ...pulumi.ResourceOption) (*ResourceGuard, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResourceGuard
	err := ctx.RegisterResource("azure:dataprotection/resourceGuard:ResourceGuard", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceGuard gets an existing ResourceGuard resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceGuard(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceGuardState, opts ...pulumi.ResourceOption) (*ResourceGuard, error) {
	var resource ResourceGuard
	err := ctx.ReadResource("azure:dataprotection/resourceGuard:ResourceGuard", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceGuard resources.
type resourceGuardState struct {
	// The Azure Region where the Resource Guard should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Resource Guard. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Resource Guard should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Resource Guard.
	Tags map[string]string `pulumi:"tags"`
	// A list of the critical operations which are not protected by this Resource Guard.
	VaultCriticalOperationExclusionLists []string `pulumi:"vaultCriticalOperationExclusionLists"`
}

type ResourceGuardState struct {
	// The Azure Region where the Resource Guard should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Resource Guard. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Resource Guard should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Resource Guard.
	Tags pulumi.StringMapInput
	// A list of the critical operations which are not protected by this Resource Guard.
	VaultCriticalOperationExclusionLists pulumi.StringArrayInput
}

func (ResourceGuardState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceGuardState)(nil)).Elem()
}

type resourceGuardArgs struct {
	// The Azure Region where the Resource Guard should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Resource Guard. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Resource Guard should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Resource Guard.
	Tags map[string]string `pulumi:"tags"`
	// A list of the critical operations which are not protected by this Resource Guard.
	VaultCriticalOperationExclusionLists []string `pulumi:"vaultCriticalOperationExclusionLists"`
}

// The set of arguments for constructing a ResourceGuard resource.
type ResourceGuardArgs struct {
	// The Azure Region where the Resource Guard should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Resource Guard. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Resource Guard should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Resource Guard.
	Tags pulumi.StringMapInput
	// A list of the critical operations which are not protected by this Resource Guard.
	VaultCriticalOperationExclusionLists pulumi.StringArrayInput
}

func (ResourceGuardArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceGuardArgs)(nil)).Elem()
}

type ResourceGuardInput interface {
	pulumi.Input

	ToResourceGuardOutput() ResourceGuardOutput
	ToResourceGuardOutputWithContext(ctx context.Context) ResourceGuardOutput
}

func (*ResourceGuard) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceGuard)(nil)).Elem()
}

func (i *ResourceGuard) ToResourceGuardOutput() ResourceGuardOutput {
	return i.ToResourceGuardOutputWithContext(context.Background())
}

func (i *ResourceGuard) ToResourceGuardOutputWithContext(ctx context.Context) ResourceGuardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceGuardOutput)
}

// ResourceGuardArrayInput is an input type that accepts ResourceGuardArray and ResourceGuardArrayOutput values.
// You can construct a concrete instance of `ResourceGuardArrayInput` via:
//
//	ResourceGuardArray{ ResourceGuardArgs{...} }
type ResourceGuardArrayInput interface {
	pulumi.Input

	ToResourceGuardArrayOutput() ResourceGuardArrayOutput
	ToResourceGuardArrayOutputWithContext(context.Context) ResourceGuardArrayOutput
}

type ResourceGuardArray []ResourceGuardInput

func (ResourceGuardArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceGuard)(nil)).Elem()
}

func (i ResourceGuardArray) ToResourceGuardArrayOutput() ResourceGuardArrayOutput {
	return i.ToResourceGuardArrayOutputWithContext(context.Background())
}

func (i ResourceGuardArray) ToResourceGuardArrayOutputWithContext(ctx context.Context) ResourceGuardArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceGuardArrayOutput)
}

// ResourceGuardMapInput is an input type that accepts ResourceGuardMap and ResourceGuardMapOutput values.
// You can construct a concrete instance of `ResourceGuardMapInput` via:
//
//	ResourceGuardMap{ "key": ResourceGuardArgs{...} }
type ResourceGuardMapInput interface {
	pulumi.Input

	ToResourceGuardMapOutput() ResourceGuardMapOutput
	ToResourceGuardMapOutputWithContext(context.Context) ResourceGuardMapOutput
}

type ResourceGuardMap map[string]ResourceGuardInput

func (ResourceGuardMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceGuard)(nil)).Elem()
}

func (i ResourceGuardMap) ToResourceGuardMapOutput() ResourceGuardMapOutput {
	return i.ToResourceGuardMapOutputWithContext(context.Background())
}

func (i ResourceGuardMap) ToResourceGuardMapOutputWithContext(ctx context.Context) ResourceGuardMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceGuardMapOutput)
}

type ResourceGuardOutput struct{ *pulumi.OutputState }

func (ResourceGuardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceGuard)(nil)).Elem()
}

func (o ResourceGuardOutput) ToResourceGuardOutput() ResourceGuardOutput {
	return o
}

func (o ResourceGuardOutput) ToResourceGuardOutputWithContext(ctx context.Context) ResourceGuardOutput {
	return o
}

// The Azure Region where the Resource Guard should exist. Changing this forces a new resource to be created.
func (o ResourceGuardOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGuard) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the Resource Guard. Changing this forces a new resource to be created.
func (o ResourceGuardOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGuard) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Resource Guard should exist. Changing this forces a new resource to be created.
func (o ResourceGuardOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGuard) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Resource Guard.
func (o ResourceGuardOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResourceGuard) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A list of the critical operations which are not protected by this Resource Guard.
func (o ResourceGuardOutput) VaultCriticalOperationExclusionLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ResourceGuard) pulumi.StringArrayOutput { return v.VaultCriticalOperationExclusionLists }).(pulumi.StringArrayOutput)
}

type ResourceGuardArrayOutput struct{ *pulumi.OutputState }

func (ResourceGuardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceGuard)(nil)).Elem()
}

func (o ResourceGuardArrayOutput) ToResourceGuardArrayOutput() ResourceGuardArrayOutput {
	return o
}

func (o ResourceGuardArrayOutput) ToResourceGuardArrayOutputWithContext(ctx context.Context) ResourceGuardArrayOutput {
	return o
}

func (o ResourceGuardArrayOutput) Index(i pulumi.IntInput) ResourceGuardOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceGuard {
		return vs[0].([]*ResourceGuard)[vs[1].(int)]
	}).(ResourceGuardOutput)
}

type ResourceGuardMapOutput struct{ *pulumi.OutputState }

func (ResourceGuardMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceGuard)(nil)).Elem()
}

func (o ResourceGuardMapOutput) ToResourceGuardMapOutput() ResourceGuardMapOutput {
	return o
}

func (o ResourceGuardMapOutput) ToResourceGuardMapOutputWithContext(ctx context.Context) ResourceGuardMapOutput {
	return o
}

func (o ResourceGuardMapOutput) MapIndex(k pulumi.StringInput) ResourceGuardOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceGuard {
		return vs[0].(map[string]*ResourceGuard)[vs[1].(string)]
	}).(ResourceGuardOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceGuardInput)(nil)).Elem(), &ResourceGuard{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceGuardArrayInput)(nil)).Elem(), ResourceGuardArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceGuardMapInput)(nil)).Elem(), ResourceGuardMap{})
	pulumi.RegisterOutputType(ResourceGuardOutput{})
	pulumi.RegisterOutputType(ResourceGuardArrayOutput{})
	pulumi.RegisterOutputType(ResourceGuardMapOutput{})
}
