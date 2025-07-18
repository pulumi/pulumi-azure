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

// Manages IP Group CIDR records.
//
// > **Note:** Warning Do not use this resource at the same time as the `cidrs` property of the
// `network.IPGroup` resource for the same IP Group. Doing so will cause a conflict and
// CIDRS will be removed.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("test-rg"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleIPGroup, err := network.NewIPGroup(ctx, "example", &network.IPGroupArgs{
//				Name:              pulumi.String("test-ipgroup"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = network.NewIPGroupCIDR(ctx, "example", &network.IPGroupCIDRArgs{
//				IpGroupId: exampleIPGroup.ID(),
//				Cidr:      pulumi.String("10.10.10.0/24"),
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
// # IP Group CIDRs can be imported using the `resource id` of the IP Group and
//
// the CIDR value (`/` characters have to be replaced by `_`), e.g.
//
// ```sh
// $ pulumi import azure:network/iPGroupCIDR:IPGroupCIDR example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Network/ipGroups/test-ipgroup/cidrs/10.1.0.0_24
// ```
type IPGroupCIDR struct {
	pulumi.CustomResourceState

	Cidr pulumi.StringOutput `pulumi:"cidr"`
	// The ID of the destination IP Group.
	// Changing this forces a new IP Group CIDR to be created.
	IpGroupId pulumi.StringOutput `pulumi:"ipGroupId"`
}

// NewIPGroupCIDR registers a new resource with the given unique name, arguments, and options.
func NewIPGroupCIDR(ctx *pulumi.Context,
	name string, args *IPGroupCIDRArgs, opts ...pulumi.ResourceOption) (*IPGroupCIDR, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cidr == nil {
		return nil, errors.New("invalid value for required argument 'Cidr'")
	}
	if args.IpGroupId == nil {
		return nil, errors.New("invalid value for required argument 'IpGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IPGroupCIDR
	err := ctx.RegisterResource("azure:network/iPGroupCIDR:IPGroupCIDR", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIPGroupCIDR gets an existing IPGroupCIDR resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIPGroupCIDR(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IPGroupCIDRState, opts ...pulumi.ResourceOption) (*IPGroupCIDR, error) {
	var resource IPGroupCIDR
	err := ctx.ReadResource("azure:network/iPGroupCIDR:IPGroupCIDR", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IPGroupCIDR resources.
type ipgroupCIDRState struct {
	Cidr *string `pulumi:"cidr"`
	// The ID of the destination IP Group.
	// Changing this forces a new IP Group CIDR to be created.
	IpGroupId *string `pulumi:"ipGroupId"`
}

type IPGroupCIDRState struct {
	Cidr pulumi.StringPtrInput
	// The ID of the destination IP Group.
	// Changing this forces a new IP Group CIDR to be created.
	IpGroupId pulumi.StringPtrInput
}

func (IPGroupCIDRState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipgroupCIDRState)(nil)).Elem()
}

type ipgroupCIDRArgs struct {
	Cidr string `pulumi:"cidr"`
	// The ID of the destination IP Group.
	// Changing this forces a new IP Group CIDR to be created.
	IpGroupId string `pulumi:"ipGroupId"`
}

// The set of arguments for constructing a IPGroupCIDR resource.
type IPGroupCIDRArgs struct {
	Cidr pulumi.StringInput
	// The ID of the destination IP Group.
	// Changing this forces a new IP Group CIDR to be created.
	IpGroupId pulumi.StringInput
}

func (IPGroupCIDRArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipgroupCIDRArgs)(nil)).Elem()
}

type IPGroupCIDRInput interface {
	pulumi.Input

	ToIPGroupCIDROutput() IPGroupCIDROutput
	ToIPGroupCIDROutputWithContext(ctx context.Context) IPGroupCIDROutput
}

func (*IPGroupCIDR) ElementType() reflect.Type {
	return reflect.TypeOf((**IPGroupCIDR)(nil)).Elem()
}

func (i *IPGroupCIDR) ToIPGroupCIDROutput() IPGroupCIDROutput {
	return i.ToIPGroupCIDROutputWithContext(context.Background())
}

func (i *IPGroupCIDR) ToIPGroupCIDROutputWithContext(ctx context.Context) IPGroupCIDROutput {
	return pulumi.ToOutputWithContext(ctx, i).(IPGroupCIDROutput)
}

// IPGroupCIDRArrayInput is an input type that accepts IPGroupCIDRArray and IPGroupCIDRArrayOutput values.
// You can construct a concrete instance of `IPGroupCIDRArrayInput` via:
//
//	IPGroupCIDRArray{ IPGroupCIDRArgs{...} }
type IPGroupCIDRArrayInput interface {
	pulumi.Input

	ToIPGroupCIDRArrayOutput() IPGroupCIDRArrayOutput
	ToIPGroupCIDRArrayOutputWithContext(context.Context) IPGroupCIDRArrayOutput
}

type IPGroupCIDRArray []IPGroupCIDRInput

func (IPGroupCIDRArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IPGroupCIDR)(nil)).Elem()
}

func (i IPGroupCIDRArray) ToIPGroupCIDRArrayOutput() IPGroupCIDRArrayOutput {
	return i.ToIPGroupCIDRArrayOutputWithContext(context.Background())
}

func (i IPGroupCIDRArray) ToIPGroupCIDRArrayOutputWithContext(ctx context.Context) IPGroupCIDRArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IPGroupCIDRArrayOutput)
}

// IPGroupCIDRMapInput is an input type that accepts IPGroupCIDRMap and IPGroupCIDRMapOutput values.
// You can construct a concrete instance of `IPGroupCIDRMapInput` via:
//
//	IPGroupCIDRMap{ "key": IPGroupCIDRArgs{...} }
type IPGroupCIDRMapInput interface {
	pulumi.Input

	ToIPGroupCIDRMapOutput() IPGroupCIDRMapOutput
	ToIPGroupCIDRMapOutputWithContext(context.Context) IPGroupCIDRMapOutput
}

type IPGroupCIDRMap map[string]IPGroupCIDRInput

func (IPGroupCIDRMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IPGroupCIDR)(nil)).Elem()
}

func (i IPGroupCIDRMap) ToIPGroupCIDRMapOutput() IPGroupCIDRMapOutput {
	return i.ToIPGroupCIDRMapOutputWithContext(context.Background())
}

func (i IPGroupCIDRMap) ToIPGroupCIDRMapOutputWithContext(ctx context.Context) IPGroupCIDRMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IPGroupCIDRMapOutput)
}

type IPGroupCIDROutput struct{ *pulumi.OutputState }

func (IPGroupCIDROutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IPGroupCIDR)(nil)).Elem()
}

func (o IPGroupCIDROutput) ToIPGroupCIDROutput() IPGroupCIDROutput {
	return o
}

func (o IPGroupCIDROutput) ToIPGroupCIDROutputWithContext(ctx context.Context) IPGroupCIDROutput {
	return o
}

func (o IPGroupCIDROutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v *IPGroupCIDR) pulumi.StringOutput { return v.Cidr }).(pulumi.StringOutput)
}

// The ID of the destination IP Group.
// Changing this forces a new IP Group CIDR to be created.
func (o IPGroupCIDROutput) IpGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *IPGroupCIDR) pulumi.StringOutput { return v.IpGroupId }).(pulumi.StringOutput)
}

type IPGroupCIDRArrayOutput struct{ *pulumi.OutputState }

func (IPGroupCIDRArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IPGroupCIDR)(nil)).Elem()
}

func (o IPGroupCIDRArrayOutput) ToIPGroupCIDRArrayOutput() IPGroupCIDRArrayOutput {
	return o
}

func (o IPGroupCIDRArrayOutput) ToIPGroupCIDRArrayOutputWithContext(ctx context.Context) IPGroupCIDRArrayOutput {
	return o
}

func (o IPGroupCIDRArrayOutput) Index(i pulumi.IntInput) IPGroupCIDROutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IPGroupCIDR {
		return vs[0].([]*IPGroupCIDR)[vs[1].(int)]
	}).(IPGroupCIDROutput)
}

type IPGroupCIDRMapOutput struct{ *pulumi.OutputState }

func (IPGroupCIDRMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IPGroupCIDR)(nil)).Elem()
}

func (o IPGroupCIDRMapOutput) ToIPGroupCIDRMapOutput() IPGroupCIDRMapOutput {
	return o
}

func (o IPGroupCIDRMapOutput) ToIPGroupCIDRMapOutputWithContext(ctx context.Context) IPGroupCIDRMapOutput {
	return o
}

func (o IPGroupCIDRMapOutput) MapIndex(k pulumi.StringInput) IPGroupCIDROutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IPGroupCIDR {
		return vs[0].(map[string]*IPGroupCIDR)[vs[1].(string)]
	}).(IPGroupCIDROutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IPGroupCIDRInput)(nil)).Elem(), &IPGroupCIDR{})
	pulumi.RegisterInputType(reflect.TypeOf((*IPGroupCIDRArrayInput)(nil)).Elem(), IPGroupCIDRArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IPGroupCIDRMapInput)(nil)).Elem(), IPGroupCIDRMap{})
	pulumi.RegisterOutputType(IPGroupCIDROutput{})
	pulumi.RegisterOutputType(IPGroupCIDRArrayOutput{})
	pulumi.RegisterOutputType(IPGroupCIDRMapOutput{})
}
