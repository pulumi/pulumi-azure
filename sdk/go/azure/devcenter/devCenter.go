// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devcenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// <!-- Note: This documentation is generated. Any manual changes will be overwritten -->
//
// Manages a Dev Center.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/authorization"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/devcenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = authorization.NewUserAssignedIdentity(ctx, "exampleUserAssignedIdentity", &authorization.UserAssignedIdentityArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = devcenter.NewDevCenter(ctx, "exampleDevCenter", &devcenter.DevCenterArgs{
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Blocks Reference
//
// ### `identity` Block
//
// The `identity` block supports the following arguments:
//
// * `type` - (Required) Specifies the type of Managed Identity that should be assigned to this Dev Center. Possible values are `SystemAssigned`, `SystemAssigned, UserAssigned` and `UserAssigned`.
// * `identityIds` - (Optional) A list of the User Assigned Identity IDs that should be assigned to this Dev Center.
//
// In addition to the arguments defined above, the `identity` block exports the following attributes:
//
// * `principalId` - The Principal ID for the System-Assigned Managed Identity assigned to this Dev Center.
// * `tenantId` - The Tenant ID for the System-Assigned Managed Identity assigned to this Dev Center.
//
// ## Import
//
// An existing Dev Center can be imported into Terraform using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:devcenter/devCenter:DevCenter example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevCenter/devCenters/{devCenterName}
//
// ```
//
//   - Where `{subscriptionId}` is the ID of the Azure Subscription where the Dev Center exists. For example `12345678-1234-9876-4563-123456789012`. * Where `{resourceGroupName}` is the name of Resource Group where this Dev Center exists. For example `example-resource-group`. * Where `{devCenterName}` is the name of the Dev Center. For example `devCenterValue`.
type DevCenter struct {
	pulumi.CustomResourceState

	// The URI of the Dev Center.
	DevCenterUri pulumi.StringOutput `pulumi:"devCenterUri"`
	// An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
	Identity DevCenterIdentityPtrOutput `pulumi:"identity"`
	// The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Dev Center.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewDevCenter registers a new resource with the given unique name, arguments, and options.
func NewDevCenter(ctx *pulumi.Context,
	name string, args *DevCenterArgs, opts ...pulumi.ResourceOption) (*DevCenter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DevCenter
	err := ctx.RegisterResource("azure:devcenter/devCenter:DevCenter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDevCenter gets an existing DevCenter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDevCenter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DevCenterState, opts ...pulumi.ResourceOption) (*DevCenter, error) {
	var resource DevCenter
	err := ctx.ReadResource("azure:devcenter/devCenter:DevCenter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DevCenter resources.
type devCenterState struct {
	// The URI of the Dev Center.
	DevCenterUri *string `pulumi:"devCenterUri"`
	// An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
	Identity *DevCenterIdentity `pulumi:"identity"`
	// The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Dev Center.
	Tags map[string]string `pulumi:"tags"`
}

type DevCenterState struct {
	// The URI of the Dev Center.
	DevCenterUri pulumi.StringPtrInput
	// An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
	Identity DevCenterIdentityPtrInput
	// The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Dev Center.
	Tags pulumi.StringMapInput
}

func (DevCenterState) ElementType() reflect.Type {
	return reflect.TypeOf((*devCenterState)(nil)).Elem()
}

type devCenterArgs struct {
	// An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
	Identity *DevCenterIdentity `pulumi:"identity"`
	// The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Dev Center.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a DevCenter resource.
type DevCenterArgs struct {
	// An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
	Identity DevCenterIdentityPtrInput
	// The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Dev Center.
	Tags pulumi.StringMapInput
}

func (DevCenterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*devCenterArgs)(nil)).Elem()
}

type DevCenterInput interface {
	pulumi.Input

	ToDevCenterOutput() DevCenterOutput
	ToDevCenterOutputWithContext(ctx context.Context) DevCenterOutput
}

func (*DevCenter) ElementType() reflect.Type {
	return reflect.TypeOf((**DevCenter)(nil)).Elem()
}

func (i *DevCenter) ToDevCenterOutput() DevCenterOutput {
	return i.ToDevCenterOutputWithContext(context.Background())
}

func (i *DevCenter) ToDevCenterOutputWithContext(ctx context.Context) DevCenterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevCenterOutput)
}

func (i *DevCenter) ToOutput(ctx context.Context) pulumix.Output[*DevCenter] {
	return pulumix.Output[*DevCenter]{
		OutputState: i.ToDevCenterOutputWithContext(ctx).OutputState,
	}
}

// DevCenterArrayInput is an input type that accepts DevCenterArray and DevCenterArrayOutput values.
// You can construct a concrete instance of `DevCenterArrayInput` via:
//
//	DevCenterArray{ DevCenterArgs{...} }
type DevCenterArrayInput interface {
	pulumi.Input

	ToDevCenterArrayOutput() DevCenterArrayOutput
	ToDevCenterArrayOutputWithContext(context.Context) DevCenterArrayOutput
}

type DevCenterArray []DevCenterInput

func (DevCenterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevCenter)(nil)).Elem()
}

func (i DevCenterArray) ToDevCenterArrayOutput() DevCenterArrayOutput {
	return i.ToDevCenterArrayOutputWithContext(context.Background())
}

func (i DevCenterArray) ToDevCenterArrayOutputWithContext(ctx context.Context) DevCenterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevCenterArrayOutput)
}

func (i DevCenterArray) ToOutput(ctx context.Context) pulumix.Output[[]*DevCenter] {
	return pulumix.Output[[]*DevCenter]{
		OutputState: i.ToDevCenterArrayOutputWithContext(ctx).OutputState,
	}
}

// DevCenterMapInput is an input type that accepts DevCenterMap and DevCenterMapOutput values.
// You can construct a concrete instance of `DevCenterMapInput` via:
//
//	DevCenterMap{ "key": DevCenterArgs{...} }
type DevCenterMapInput interface {
	pulumi.Input

	ToDevCenterMapOutput() DevCenterMapOutput
	ToDevCenterMapOutputWithContext(context.Context) DevCenterMapOutput
}

type DevCenterMap map[string]DevCenterInput

func (DevCenterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevCenter)(nil)).Elem()
}

func (i DevCenterMap) ToDevCenterMapOutput() DevCenterMapOutput {
	return i.ToDevCenterMapOutputWithContext(context.Background())
}

func (i DevCenterMap) ToDevCenterMapOutputWithContext(ctx context.Context) DevCenterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevCenterMapOutput)
}

func (i DevCenterMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*DevCenter] {
	return pulumix.Output[map[string]*DevCenter]{
		OutputState: i.ToDevCenterMapOutputWithContext(ctx).OutputState,
	}
}

type DevCenterOutput struct{ *pulumi.OutputState }

func (DevCenterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DevCenter)(nil)).Elem()
}

func (o DevCenterOutput) ToDevCenterOutput() DevCenterOutput {
	return o
}

func (o DevCenterOutput) ToDevCenterOutputWithContext(ctx context.Context) DevCenterOutput {
	return o
}

func (o DevCenterOutput) ToOutput(ctx context.Context) pulumix.Output[*DevCenter] {
	return pulumix.Output[*DevCenter]{
		OutputState: o.OutputState,
	}
}

// The URI of the Dev Center.
func (o DevCenterOutput) DevCenterUri() pulumi.StringOutput {
	return o.ApplyT(func(v *DevCenter) pulumi.StringOutput { return v.DevCenterUri }).(pulumi.StringOutput)
}

// An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
func (o DevCenterOutput) Identity() DevCenterIdentityPtrOutput {
	return o.ApplyT(func(v *DevCenter) DevCenterIdentityPtrOutput { return v.Identity }).(DevCenterIdentityPtrOutput)
}

// The Azure Region where the Dev Center should exist. Changing this forces a new Dev Center to be created.
func (o DevCenterOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *DevCenter) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the name of this Dev Center. Changing this forces a new Dev Center to be created.
func (o DevCenterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DevCenter) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the name of the Resource Group within which this Dev Center should exist. Changing this forces a new Dev Center to be created.
func (o DevCenterOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *DevCenter) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Dev Center.
func (o DevCenterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DevCenter) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type DevCenterArrayOutput struct{ *pulumi.OutputState }

func (DevCenterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevCenter)(nil)).Elem()
}

func (o DevCenterArrayOutput) ToDevCenterArrayOutput() DevCenterArrayOutput {
	return o
}

func (o DevCenterArrayOutput) ToDevCenterArrayOutputWithContext(ctx context.Context) DevCenterArrayOutput {
	return o
}

func (o DevCenterArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*DevCenter] {
	return pulumix.Output[[]*DevCenter]{
		OutputState: o.OutputState,
	}
}

func (o DevCenterArrayOutput) Index(i pulumi.IntInput) DevCenterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DevCenter {
		return vs[0].([]*DevCenter)[vs[1].(int)]
	}).(DevCenterOutput)
}

type DevCenterMapOutput struct{ *pulumi.OutputState }

func (DevCenterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevCenter)(nil)).Elem()
}

func (o DevCenterMapOutput) ToDevCenterMapOutput() DevCenterMapOutput {
	return o
}

func (o DevCenterMapOutput) ToDevCenterMapOutputWithContext(ctx context.Context) DevCenterMapOutput {
	return o
}

func (o DevCenterMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*DevCenter] {
	return pulumix.Output[map[string]*DevCenter]{
		OutputState: o.OutputState,
	}
}

func (o DevCenterMapOutput) MapIndex(k pulumi.StringInput) DevCenterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DevCenter {
		return vs[0].(map[string]*DevCenter)[vs[1].(string)]
	}).(DevCenterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DevCenterInput)(nil)).Elem(), &DevCenter{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevCenterArrayInput)(nil)).Elem(), DevCenterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevCenterMapInput)(nil)).Elem(), DevCenterMap{})
	pulumi.RegisterOutputType(DevCenterOutput{})
	pulumi.RegisterOutputType(DevCenterArrayOutput{})
	pulumi.RegisterOutputType(DevCenterMapOutput{})
}