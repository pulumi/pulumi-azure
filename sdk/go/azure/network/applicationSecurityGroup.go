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

// Manages an Application Security Group.
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
//				Name:     pulumi.String("tf-test"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = network.NewApplicationSecurityGroup(ctx, "example", &network.ApplicationSecurityGroupArgs{
//				Name:              pulumi.String("tf-appsecuritygroup"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Tags: pulumi.StringMap{
//					"Hello": pulumi.String("World"),
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
// Application Security Groups can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:network/applicationSecurityGroup:ApplicationSecurityGroup securitygroup1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/applicationSecurityGroups/securitygroup1
// ```
type ApplicationSecurityGroup struct {
	pulumi.CustomResourceState

	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the name of the Application Security Group. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the resource group in which to create the Application Security Group. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewApplicationSecurityGroup registers a new resource with the given unique name, arguments, and options.
func NewApplicationSecurityGroup(ctx *pulumi.Context,
	name string, args *ApplicationSecurityGroupArgs, opts ...pulumi.ResourceOption) (*ApplicationSecurityGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplicationSecurityGroup
	err := ctx.RegisterResource("azure:network/applicationSecurityGroup:ApplicationSecurityGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationSecurityGroup gets an existing ApplicationSecurityGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationSecurityGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationSecurityGroupState, opts ...pulumi.ResourceOption) (*ApplicationSecurityGroup, error) {
	var resource ApplicationSecurityGroup
	err := ctx.ReadResource("azure:network/applicationSecurityGroup:ApplicationSecurityGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationSecurityGroup resources.
type applicationSecurityGroupState struct {
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of the Application Security Group. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which to create the Application Security Group. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

type ApplicationSecurityGroupState struct {
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of the Application Security Group. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which to create the Application Security Group. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (ApplicationSecurityGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationSecurityGroupState)(nil)).Elem()
}

type applicationSecurityGroupArgs struct {
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of the Application Security Group. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which to create the Application Security Group. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ApplicationSecurityGroup resource.
type ApplicationSecurityGroupArgs struct {
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of the Application Security Group. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which to create the Application Security Group. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (ApplicationSecurityGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationSecurityGroupArgs)(nil)).Elem()
}

type ApplicationSecurityGroupInput interface {
	pulumi.Input

	ToApplicationSecurityGroupOutput() ApplicationSecurityGroupOutput
	ToApplicationSecurityGroupOutputWithContext(ctx context.Context) ApplicationSecurityGroupOutput
}

func (*ApplicationSecurityGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationSecurityGroup)(nil)).Elem()
}

func (i *ApplicationSecurityGroup) ToApplicationSecurityGroupOutput() ApplicationSecurityGroupOutput {
	return i.ToApplicationSecurityGroupOutputWithContext(context.Background())
}

func (i *ApplicationSecurityGroup) ToApplicationSecurityGroupOutputWithContext(ctx context.Context) ApplicationSecurityGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSecurityGroupOutput)
}

// ApplicationSecurityGroupArrayInput is an input type that accepts ApplicationSecurityGroupArray and ApplicationSecurityGroupArrayOutput values.
// You can construct a concrete instance of `ApplicationSecurityGroupArrayInput` via:
//
//	ApplicationSecurityGroupArray{ ApplicationSecurityGroupArgs{...} }
type ApplicationSecurityGroupArrayInput interface {
	pulumi.Input

	ToApplicationSecurityGroupArrayOutput() ApplicationSecurityGroupArrayOutput
	ToApplicationSecurityGroupArrayOutputWithContext(context.Context) ApplicationSecurityGroupArrayOutput
}

type ApplicationSecurityGroupArray []ApplicationSecurityGroupInput

func (ApplicationSecurityGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationSecurityGroup)(nil)).Elem()
}

func (i ApplicationSecurityGroupArray) ToApplicationSecurityGroupArrayOutput() ApplicationSecurityGroupArrayOutput {
	return i.ToApplicationSecurityGroupArrayOutputWithContext(context.Background())
}

func (i ApplicationSecurityGroupArray) ToApplicationSecurityGroupArrayOutputWithContext(ctx context.Context) ApplicationSecurityGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSecurityGroupArrayOutput)
}

// ApplicationSecurityGroupMapInput is an input type that accepts ApplicationSecurityGroupMap and ApplicationSecurityGroupMapOutput values.
// You can construct a concrete instance of `ApplicationSecurityGroupMapInput` via:
//
//	ApplicationSecurityGroupMap{ "key": ApplicationSecurityGroupArgs{...} }
type ApplicationSecurityGroupMapInput interface {
	pulumi.Input

	ToApplicationSecurityGroupMapOutput() ApplicationSecurityGroupMapOutput
	ToApplicationSecurityGroupMapOutputWithContext(context.Context) ApplicationSecurityGroupMapOutput
}

type ApplicationSecurityGroupMap map[string]ApplicationSecurityGroupInput

func (ApplicationSecurityGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationSecurityGroup)(nil)).Elem()
}

func (i ApplicationSecurityGroupMap) ToApplicationSecurityGroupMapOutput() ApplicationSecurityGroupMapOutput {
	return i.ToApplicationSecurityGroupMapOutputWithContext(context.Background())
}

func (i ApplicationSecurityGroupMap) ToApplicationSecurityGroupMapOutputWithContext(ctx context.Context) ApplicationSecurityGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSecurityGroupMapOutput)
}

type ApplicationSecurityGroupOutput struct{ *pulumi.OutputState }

func (ApplicationSecurityGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationSecurityGroup)(nil)).Elem()
}

func (o ApplicationSecurityGroupOutput) ToApplicationSecurityGroupOutput() ApplicationSecurityGroupOutput {
	return o
}

func (o ApplicationSecurityGroupOutput) ToApplicationSecurityGroupOutputWithContext(ctx context.Context) ApplicationSecurityGroupOutput {
	return o
}

// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o ApplicationSecurityGroupOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationSecurityGroup) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the name of the Application Security Group. Changing this forces a new resource to be created.
func (o ApplicationSecurityGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationSecurityGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the resource group in which to create the Application Security Group. Changing this forces a new resource to be created.
func (o ApplicationSecurityGroupOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationSecurityGroup) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o ApplicationSecurityGroupOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ApplicationSecurityGroup) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type ApplicationSecurityGroupArrayOutput struct{ *pulumi.OutputState }

func (ApplicationSecurityGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationSecurityGroup)(nil)).Elem()
}

func (o ApplicationSecurityGroupArrayOutput) ToApplicationSecurityGroupArrayOutput() ApplicationSecurityGroupArrayOutput {
	return o
}

func (o ApplicationSecurityGroupArrayOutput) ToApplicationSecurityGroupArrayOutputWithContext(ctx context.Context) ApplicationSecurityGroupArrayOutput {
	return o
}

func (o ApplicationSecurityGroupArrayOutput) Index(i pulumi.IntInput) ApplicationSecurityGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplicationSecurityGroup {
		return vs[0].([]*ApplicationSecurityGroup)[vs[1].(int)]
	}).(ApplicationSecurityGroupOutput)
}

type ApplicationSecurityGroupMapOutput struct{ *pulumi.OutputState }

func (ApplicationSecurityGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationSecurityGroup)(nil)).Elem()
}

func (o ApplicationSecurityGroupMapOutput) ToApplicationSecurityGroupMapOutput() ApplicationSecurityGroupMapOutput {
	return o
}

func (o ApplicationSecurityGroupMapOutput) ToApplicationSecurityGroupMapOutputWithContext(ctx context.Context) ApplicationSecurityGroupMapOutput {
	return o
}

func (o ApplicationSecurityGroupMapOutput) MapIndex(k pulumi.StringInput) ApplicationSecurityGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplicationSecurityGroup {
		return vs[0].(map[string]*ApplicationSecurityGroup)[vs[1].(string)]
	}).(ApplicationSecurityGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSecurityGroupInput)(nil)).Elem(), &ApplicationSecurityGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSecurityGroupArrayInput)(nil)).Elem(), ApplicationSecurityGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSecurityGroupMapInput)(nil)).Elem(), ApplicationSecurityGroupMap{})
	pulumi.RegisterOutputType(ApplicationSecurityGroupOutput{})
	pulumi.RegisterOutputType(ApplicationSecurityGroupArrayOutput{})
	pulumi.RegisterOutputType(ApplicationSecurityGroupMapOutput{})
}
