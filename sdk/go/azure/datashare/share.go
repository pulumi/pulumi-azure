// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datashare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Data Share.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/datashare"
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
//			exampleAccount, err := datashare.NewAccount(ctx, "example", &datashare.AccountArgs{
//				Name:              pulumi.String("example-dsa"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Identity: &datashare.AccountIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//				Tags: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datashare.NewShare(ctx, "example", &datashare.ShareArgs{
//				Name:        pulumi.String("example_dss"),
//				AccountId:   exampleAccount.ID(),
//				Kind:        pulumi.String("CopyBased"),
//				Description: pulumi.String("example desc"),
//				Terms:       pulumi.String("example terms"),
//				SnapshotSchedule: &datashare.ShareSnapshotScheduleArgs{
//					Name:       pulumi.String("example-ss"),
//					Recurrence: pulumi.String("Day"),
//					StartTime:  pulumi.String("2020-04-17T04:47:52.9614956Z"),
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
// * `Microsoft.DataShare`: 2019-11-01
//
// ## Import
//
// Data Shares can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:datashare/share:Share example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataShare/accounts/account1/shares/share1
// ```
type Share struct {
	pulumi.CustomResourceState

	// The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The Data Share's description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A `snapshotSchedule` block as defined below.
	SnapshotSchedule ShareSnapshotSchedulePtrOutput `pulumi:"snapshotSchedule"`
	// The terms of the Data Share.
	Terms pulumi.StringPtrOutput `pulumi:"terms"`
}

// NewShare registers a new resource with the given unique name, arguments, and options.
func NewShare(ctx *pulumi.Context,
	name string, args *ShareArgs, opts ...pulumi.ResourceOption) (*Share, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Share
	err := ctx.RegisterResource("azure:datashare/share:Share", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetShare gets an existing Share resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetShare(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ShareState, opts ...pulumi.ResourceOption) (*Share, error) {
	var resource Share
	err := ctx.ReadResource("azure:datashare/share:Share", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Share resources.
type shareState struct {
	// The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
	AccountId *string `pulumi:"accountId"`
	// The Data Share's description.
	Description *string `pulumi:"description"`
	// The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
	Kind *string `pulumi:"kind"`
	// The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
	Name *string `pulumi:"name"`
	// A `snapshotSchedule` block as defined below.
	SnapshotSchedule *ShareSnapshotSchedule `pulumi:"snapshotSchedule"`
	// The terms of the Data Share.
	Terms *string `pulumi:"terms"`
}

type ShareState struct {
	// The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
	AccountId pulumi.StringPtrInput
	// The Data Share's description.
	Description pulumi.StringPtrInput
	// The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
	Kind pulumi.StringPtrInput
	// The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
	Name pulumi.StringPtrInput
	// A `snapshotSchedule` block as defined below.
	SnapshotSchedule ShareSnapshotSchedulePtrInput
	// The terms of the Data Share.
	Terms pulumi.StringPtrInput
}

func (ShareState) ElementType() reflect.Type {
	return reflect.TypeOf((*shareState)(nil)).Elem()
}

type shareArgs struct {
	// The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
	AccountId string `pulumi:"accountId"`
	// The Data Share's description.
	Description *string `pulumi:"description"`
	// The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
	Kind string `pulumi:"kind"`
	// The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
	Name *string `pulumi:"name"`
	// A `snapshotSchedule` block as defined below.
	SnapshotSchedule *ShareSnapshotSchedule `pulumi:"snapshotSchedule"`
	// The terms of the Data Share.
	Terms *string `pulumi:"terms"`
}

// The set of arguments for constructing a Share resource.
type ShareArgs struct {
	// The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
	AccountId pulumi.StringInput
	// The Data Share's description.
	Description pulumi.StringPtrInput
	// The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
	Kind pulumi.StringInput
	// The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
	Name pulumi.StringPtrInput
	// A `snapshotSchedule` block as defined below.
	SnapshotSchedule ShareSnapshotSchedulePtrInput
	// The terms of the Data Share.
	Terms pulumi.StringPtrInput
}

func (ShareArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*shareArgs)(nil)).Elem()
}

type ShareInput interface {
	pulumi.Input

	ToShareOutput() ShareOutput
	ToShareOutputWithContext(ctx context.Context) ShareOutput
}

func (*Share) ElementType() reflect.Type {
	return reflect.TypeOf((**Share)(nil)).Elem()
}

func (i *Share) ToShareOutput() ShareOutput {
	return i.ToShareOutputWithContext(context.Background())
}

func (i *Share) ToShareOutputWithContext(ctx context.Context) ShareOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareOutput)
}

// ShareArrayInput is an input type that accepts ShareArray and ShareArrayOutput values.
// You can construct a concrete instance of `ShareArrayInput` via:
//
//	ShareArray{ ShareArgs{...} }
type ShareArrayInput interface {
	pulumi.Input

	ToShareArrayOutput() ShareArrayOutput
	ToShareArrayOutputWithContext(context.Context) ShareArrayOutput
}

type ShareArray []ShareInput

func (ShareArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Share)(nil)).Elem()
}

func (i ShareArray) ToShareArrayOutput() ShareArrayOutput {
	return i.ToShareArrayOutputWithContext(context.Background())
}

func (i ShareArray) ToShareArrayOutputWithContext(ctx context.Context) ShareArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareArrayOutput)
}

// ShareMapInput is an input type that accepts ShareMap and ShareMapOutput values.
// You can construct a concrete instance of `ShareMapInput` via:
//
//	ShareMap{ "key": ShareArgs{...} }
type ShareMapInput interface {
	pulumi.Input

	ToShareMapOutput() ShareMapOutput
	ToShareMapOutputWithContext(context.Context) ShareMapOutput
}

type ShareMap map[string]ShareInput

func (ShareMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Share)(nil)).Elem()
}

func (i ShareMap) ToShareMapOutput() ShareMapOutput {
	return i.ToShareMapOutputWithContext(context.Background())
}

func (i ShareMap) ToShareMapOutputWithContext(ctx context.Context) ShareMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareMapOutput)
}

type ShareOutput struct{ *pulumi.OutputState }

func (ShareOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Share)(nil)).Elem()
}

func (o ShareOutput) ToShareOutput() ShareOutput {
	return o
}

func (o ShareOutput) ToShareOutputWithContext(ctx context.Context) ShareOutput {
	return o
}

// The ID of the Data Share account in which the Data Share is created. Changing this forces a new Data Share to be created.
func (o ShareOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The Data Share's description.
func (o ShareOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Share) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The kind of the Data Share. Possible values are `CopyBased` and `InPlace`. Changing this forces a new Data Share to be created.
func (o ShareOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// The name which should be used for this Data Share. Changing this forces a new Data Share to be created.
func (o ShareOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A `snapshotSchedule` block as defined below.
func (o ShareOutput) SnapshotSchedule() ShareSnapshotSchedulePtrOutput {
	return o.ApplyT(func(v *Share) ShareSnapshotSchedulePtrOutput { return v.SnapshotSchedule }).(ShareSnapshotSchedulePtrOutput)
}

// The terms of the Data Share.
func (o ShareOutput) Terms() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Share) pulumi.StringPtrOutput { return v.Terms }).(pulumi.StringPtrOutput)
}

type ShareArrayOutput struct{ *pulumi.OutputState }

func (ShareArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Share)(nil)).Elem()
}

func (o ShareArrayOutput) ToShareArrayOutput() ShareArrayOutput {
	return o
}

func (o ShareArrayOutput) ToShareArrayOutputWithContext(ctx context.Context) ShareArrayOutput {
	return o
}

func (o ShareArrayOutput) Index(i pulumi.IntInput) ShareOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Share {
		return vs[0].([]*Share)[vs[1].(int)]
	}).(ShareOutput)
}

type ShareMapOutput struct{ *pulumi.OutputState }

func (ShareMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Share)(nil)).Elem()
}

func (o ShareMapOutput) ToShareMapOutput() ShareMapOutput {
	return o
}

func (o ShareMapOutput) ToShareMapOutputWithContext(ctx context.Context) ShareMapOutput {
	return o
}

func (o ShareMapOutput) MapIndex(k pulumi.StringInput) ShareOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Share {
		return vs[0].(map[string]*Share)[vs[1].(string)]
	}).(ShareOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ShareInput)(nil)).Elem(), &Share{})
	pulumi.RegisterInputType(reflect.TypeOf((*ShareArrayInput)(nil)).Elem(), ShareArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ShareMapInput)(nil)).Elem(), ShareMap{})
	pulumi.RegisterOutputType(ShareOutput{})
	pulumi.RegisterOutputType(ShareArrayOutput{})
	pulumi.RegisterOutputType(ShareMapOutput{})
}
