// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devcenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Catalog struct {
	pulumi.CustomResourceState

	CatalogAdogit     CatalogCatalogAdogitPtrOutput `pulumi:"catalogAdogit"`
	CatalogGithub     CatalogCatalogGithubPtrOutput `pulumi:"catalogGithub"`
	DevCenterId       pulumi.StringOutput           `pulumi:"devCenterId"`
	Name              pulumi.StringOutput           `pulumi:"name"`
	ResourceGroupName pulumi.StringOutput           `pulumi:"resourceGroupName"`
}

// NewCatalog registers a new resource with the given unique name, arguments, and options.
func NewCatalog(ctx *pulumi.Context,
	name string, args *CatalogArgs, opts ...pulumi.ResourceOption) (*Catalog, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DevCenterId == nil {
		return nil, errors.New("invalid value for required argument 'DevCenterId'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Catalog
	err := ctx.RegisterResource("azure:devcenter/catalog:Catalog", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCatalog gets an existing Catalog resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCatalog(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CatalogState, opts ...pulumi.ResourceOption) (*Catalog, error) {
	var resource Catalog
	err := ctx.ReadResource("azure:devcenter/catalog:Catalog", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Catalog resources.
type catalogState struct {
	CatalogAdogit     *CatalogCatalogAdogit `pulumi:"catalogAdogit"`
	CatalogGithub     *CatalogCatalogGithub `pulumi:"catalogGithub"`
	DevCenterId       *string               `pulumi:"devCenterId"`
	Name              *string               `pulumi:"name"`
	ResourceGroupName *string               `pulumi:"resourceGroupName"`
}

type CatalogState struct {
	CatalogAdogit     CatalogCatalogAdogitPtrInput
	CatalogGithub     CatalogCatalogGithubPtrInput
	DevCenterId       pulumi.StringPtrInput
	Name              pulumi.StringPtrInput
	ResourceGroupName pulumi.StringPtrInput
}

func (CatalogState) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogState)(nil)).Elem()
}

type catalogArgs struct {
	CatalogAdogit     *CatalogCatalogAdogit `pulumi:"catalogAdogit"`
	CatalogGithub     *CatalogCatalogGithub `pulumi:"catalogGithub"`
	DevCenterId       string                `pulumi:"devCenterId"`
	Name              *string               `pulumi:"name"`
	ResourceGroupName string                `pulumi:"resourceGroupName"`
}

// The set of arguments for constructing a Catalog resource.
type CatalogArgs struct {
	CatalogAdogit     CatalogCatalogAdogitPtrInput
	CatalogGithub     CatalogCatalogGithubPtrInput
	DevCenterId       pulumi.StringInput
	Name              pulumi.StringPtrInput
	ResourceGroupName pulumi.StringInput
}

func (CatalogArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*catalogArgs)(nil)).Elem()
}

type CatalogInput interface {
	pulumi.Input

	ToCatalogOutput() CatalogOutput
	ToCatalogOutputWithContext(ctx context.Context) CatalogOutput
}

func (*Catalog) ElementType() reflect.Type {
	return reflect.TypeOf((**Catalog)(nil)).Elem()
}

func (i *Catalog) ToCatalogOutput() CatalogOutput {
	return i.ToCatalogOutputWithContext(context.Background())
}

func (i *Catalog) ToCatalogOutputWithContext(ctx context.Context) CatalogOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogOutput)
}

// CatalogArrayInput is an input type that accepts CatalogArray and CatalogArrayOutput values.
// You can construct a concrete instance of `CatalogArrayInput` via:
//
//	CatalogArray{ CatalogArgs{...} }
type CatalogArrayInput interface {
	pulumi.Input

	ToCatalogArrayOutput() CatalogArrayOutput
	ToCatalogArrayOutputWithContext(context.Context) CatalogArrayOutput
}

type CatalogArray []CatalogInput

func (CatalogArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Catalog)(nil)).Elem()
}

func (i CatalogArray) ToCatalogArrayOutput() CatalogArrayOutput {
	return i.ToCatalogArrayOutputWithContext(context.Background())
}

func (i CatalogArray) ToCatalogArrayOutputWithContext(ctx context.Context) CatalogArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogArrayOutput)
}

// CatalogMapInput is an input type that accepts CatalogMap and CatalogMapOutput values.
// You can construct a concrete instance of `CatalogMapInput` via:
//
//	CatalogMap{ "key": CatalogArgs{...} }
type CatalogMapInput interface {
	pulumi.Input

	ToCatalogMapOutput() CatalogMapOutput
	ToCatalogMapOutputWithContext(context.Context) CatalogMapOutput
}

type CatalogMap map[string]CatalogInput

func (CatalogMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Catalog)(nil)).Elem()
}

func (i CatalogMap) ToCatalogMapOutput() CatalogMapOutput {
	return i.ToCatalogMapOutputWithContext(context.Background())
}

func (i CatalogMap) ToCatalogMapOutputWithContext(ctx context.Context) CatalogMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogMapOutput)
}

type CatalogOutput struct{ *pulumi.OutputState }

func (CatalogOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Catalog)(nil)).Elem()
}

func (o CatalogOutput) ToCatalogOutput() CatalogOutput {
	return o
}

func (o CatalogOutput) ToCatalogOutputWithContext(ctx context.Context) CatalogOutput {
	return o
}

func (o CatalogOutput) CatalogAdogit() CatalogCatalogAdogitPtrOutput {
	return o.ApplyT(func(v *Catalog) CatalogCatalogAdogitPtrOutput { return v.CatalogAdogit }).(CatalogCatalogAdogitPtrOutput)
}

func (o CatalogOutput) CatalogGithub() CatalogCatalogGithubPtrOutput {
	return o.ApplyT(func(v *Catalog) CatalogCatalogGithubPtrOutput { return v.CatalogGithub }).(CatalogCatalogGithubPtrOutput)
}

func (o CatalogOutput) DevCenterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.DevCenterId }).(pulumi.StringOutput)
}

func (o CatalogOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o CatalogOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Catalog) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

type CatalogArrayOutput struct{ *pulumi.OutputState }

func (CatalogArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Catalog)(nil)).Elem()
}

func (o CatalogArrayOutput) ToCatalogArrayOutput() CatalogArrayOutput {
	return o
}

func (o CatalogArrayOutput) ToCatalogArrayOutputWithContext(ctx context.Context) CatalogArrayOutput {
	return o
}

func (o CatalogArrayOutput) Index(i pulumi.IntInput) CatalogOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Catalog {
		return vs[0].([]*Catalog)[vs[1].(int)]
	}).(CatalogOutput)
}

type CatalogMapOutput struct{ *pulumi.OutputState }

func (CatalogMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Catalog)(nil)).Elem()
}

func (o CatalogMapOutput) ToCatalogMapOutput() CatalogMapOutput {
	return o
}

func (o CatalogMapOutput) ToCatalogMapOutputWithContext(ctx context.Context) CatalogMapOutput {
	return o
}

func (o CatalogMapOutput) MapIndex(k pulumi.StringInput) CatalogOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Catalog {
		return vs[0].(map[string]*Catalog)[vs[1].(string)]
	}).(CatalogOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogInput)(nil)).Elem(), &Catalog{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogArrayInput)(nil)).Elem(), CatalogArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogMapInput)(nil)).Elem(), CatalogMap{})
	pulumi.RegisterOutputType(CatalogOutput{})
	pulumi.RegisterOutputType(CatalogArrayOutput{})
	pulumi.RegisterOutputType(CatalogMapOutput{})
}
