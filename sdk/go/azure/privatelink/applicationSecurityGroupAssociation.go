// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatelink

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an association between Private Endpoint and Application Security Group.
//
// ## Import
//
// Associations between Private Endpoint and Application Security Group can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:privatelink/applicationSecurityGroupAssociation:ApplicationSecurityGroupAssociation association1 "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/privateEndpoints/endpoints1|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/applicationSecurityGroups/securityGroup1",
// ```
type ApplicationSecurityGroupAssociation struct {
	pulumi.CustomResourceState

	// The id of application security group to associate. Changing this forces a new resource to be created.
	ApplicationSecurityGroupId pulumi.StringOutput `pulumi:"applicationSecurityGroupId"`
	// The id of private endpoint to associate. Changing this forces a new resource to be created.
	PrivateEndpointId pulumi.StringOutput `pulumi:"privateEndpointId"`
}

// NewApplicationSecurityGroupAssociation registers a new resource with the given unique name, arguments, and options.
func NewApplicationSecurityGroupAssociation(ctx *pulumi.Context,
	name string, args *ApplicationSecurityGroupAssociationArgs, opts ...pulumi.ResourceOption) (*ApplicationSecurityGroupAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationSecurityGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationSecurityGroupId'")
	}
	if args.PrivateEndpointId == nil {
		return nil, errors.New("invalid value for required argument 'PrivateEndpointId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplicationSecurityGroupAssociation
	err := ctx.RegisterResource("azure:privatelink/applicationSecurityGroupAssociation:ApplicationSecurityGroupAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationSecurityGroupAssociation gets an existing ApplicationSecurityGroupAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationSecurityGroupAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationSecurityGroupAssociationState, opts ...pulumi.ResourceOption) (*ApplicationSecurityGroupAssociation, error) {
	var resource ApplicationSecurityGroupAssociation
	err := ctx.ReadResource("azure:privatelink/applicationSecurityGroupAssociation:ApplicationSecurityGroupAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationSecurityGroupAssociation resources.
type applicationSecurityGroupAssociationState struct {
	// The id of application security group to associate. Changing this forces a new resource to be created.
	ApplicationSecurityGroupId *string `pulumi:"applicationSecurityGroupId"`
	// The id of private endpoint to associate. Changing this forces a new resource to be created.
	PrivateEndpointId *string `pulumi:"privateEndpointId"`
}

type ApplicationSecurityGroupAssociationState struct {
	// The id of application security group to associate. Changing this forces a new resource to be created.
	ApplicationSecurityGroupId pulumi.StringPtrInput
	// The id of private endpoint to associate. Changing this forces a new resource to be created.
	PrivateEndpointId pulumi.StringPtrInput
}

func (ApplicationSecurityGroupAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationSecurityGroupAssociationState)(nil)).Elem()
}

type applicationSecurityGroupAssociationArgs struct {
	// The id of application security group to associate. Changing this forces a new resource to be created.
	ApplicationSecurityGroupId string `pulumi:"applicationSecurityGroupId"`
	// The id of private endpoint to associate. Changing this forces a new resource to be created.
	PrivateEndpointId string `pulumi:"privateEndpointId"`
}

// The set of arguments for constructing a ApplicationSecurityGroupAssociation resource.
type ApplicationSecurityGroupAssociationArgs struct {
	// The id of application security group to associate. Changing this forces a new resource to be created.
	ApplicationSecurityGroupId pulumi.StringInput
	// The id of private endpoint to associate. Changing this forces a new resource to be created.
	PrivateEndpointId pulumi.StringInput
}

func (ApplicationSecurityGroupAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationSecurityGroupAssociationArgs)(nil)).Elem()
}

type ApplicationSecurityGroupAssociationInput interface {
	pulumi.Input

	ToApplicationSecurityGroupAssociationOutput() ApplicationSecurityGroupAssociationOutput
	ToApplicationSecurityGroupAssociationOutputWithContext(ctx context.Context) ApplicationSecurityGroupAssociationOutput
}

func (*ApplicationSecurityGroupAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationSecurityGroupAssociation)(nil)).Elem()
}

func (i *ApplicationSecurityGroupAssociation) ToApplicationSecurityGroupAssociationOutput() ApplicationSecurityGroupAssociationOutput {
	return i.ToApplicationSecurityGroupAssociationOutputWithContext(context.Background())
}

func (i *ApplicationSecurityGroupAssociation) ToApplicationSecurityGroupAssociationOutputWithContext(ctx context.Context) ApplicationSecurityGroupAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSecurityGroupAssociationOutput)
}

// ApplicationSecurityGroupAssociationArrayInput is an input type that accepts ApplicationSecurityGroupAssociationArray and ApplicationSecurityGroupAssociationArrayOutput values.
// You can construct a concrete instance of `ApplicationSecurityGroupAssociationArrayInput` via:
//
//	ApplicationSecurityGroupAssociationArray{ ApplicationSecurityGroupAssociationArgs{...} }
type ApplicationSecurityGroupAssociationArrayInput interface {
	pulumi.Input

	ToApplicationSecurityGroupAssociationArrayOutput() ApplicationSecurityGroupAssociationArrayOutput
	ToApplicationSecurityGroupAssociationArrayOutputWithContext(context.Context) ApplicationSecurityGroupAssociationArrayOutput
}

type ApplicationSecurityGroupAssociationArray []ApplicationSecurityGroupAssociationInput

func (ApplicationSecurityGroupAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationSecurityGroupAssociation)(nil)).Elem()
}

func (i ApplicationSecurityGroupAssociationArray) ToApplicationSecurityGroupAssociationArrayOutput() ApplicationSecurityGroupAssociationArrayOutput {
	return i.ToApplicationSecurityGroupAssociationArrayOutputWithContext(context.Background())
}

func (i ApplicationSecurityGroupAssociationArray) ToApplicationSecurityGroupAssociationArrayOutputWithContext(ctx context.Context) ApplicationSecurityGroupAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSecurityGroupAssociationArrayOutput)
}

// ApplicationSecurityGroupAssociationMapInput is an input type that accepts ApplicationSecurityGroupAssociationMap and ApplicationSecurityGroupAssociationMapOutput values.
// You can construct a concrete instance of `ApplicationSecurityGroupAssociationMapInput` via:
//
//	ApplicationSecurityGroupAssociationMap{ "key": ApplicationSecurityGroupAssociationArgs{...} }
type ApplicationSecurityGroupAssociationMapInput interface {
	pulumi.Input

	ToApplicationSecurityGroupAssociationMapOutput() ApplicationSecurityGroupAssociationMapOutput
	ToApplicationSecurityGroupAssociationMapOutputWithContext(context.Context) ApplicationSecurityGroupAssociationMapOutput
}

type ApplicationSecurityGroupAssociationMap map[string]ApplicationSecurityGroupAssociationInput

func (ApplicationSecurityGroupAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationSecurityGroupAssociation)(nil)).Elem()
}

func (i ApplicationSecurityGroupAssociationMap) ToApplicationSecurityGroupAssociationMapOutput() ApplicationSecurityGroupAssociationMapOutput {
	return i.ToApplicationSecurityGroupAssociationMapOutputWithContext(context.Background())
}

func (i ApplicationSecurityGroupAssociationMap) ToApplicationSecurityGroupAssociationMapOutputWithContext(ctx context.Context) ApplicationSecurityGroupAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSecurityGroupAssociationMapOutput)
}

type ApplicationSecurityGroupAssociationOutput struct{ *pulumi.OutputState }

func (ApplicationSecurityGroupAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationSecurityGroupAssociation)(nil)).Elem()
}

func (o ApplicationSecurityGroupAssociationOutput) ToApplicationSecurityGroupAssociationOutput() ApplicationSecurityGroupAssociationOutput {
	return o
}

func (o ApplicationSecurityGroupAssociationOutput) ToApplicationSecurityGroupAssociationOutputWithContext(ctx context.Context) ApplicationSecurityGroupAssociationOutput {
	return o
}

// The id of application security group to associate. Changing this forces a new resource to be created.
func (o ApplicationSecurityGroupAssociationOutput) ApplicationSecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationSecurityGroupAssociation) pulumi.StringOutput { return v.ApplicationSecurityGroupId }).(pulumi.StringOutput)
}

// The id of private endpoint to associate. Changing this forces a new resource to be created.
func (o ApplicationSecurityGroupAssociationOutput) PrivateEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationSecurityGroupAssociation) pulumi.StringOutput { return v.PrivateEndpointId }).(pulumi.StringOutput)
}

type ApplicationSecurityGroupAssociationArrayOutput struct{ *pulumi.OutputState }

func (ApplicationSecurityGroupAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationSecurityGroupAssociation)(nil)).Elem()
}

func (o ApplicationSecurityGroupAssociationArrayOutput) ToApplicationSecurityGroupAssociationArrayOutput() ApplicationSecurityGroupAssociationArrayOutput {
	return o
}

func (o ApplicationSecurityGroupAssociationArrayOutput) ToApplicationSecurityGroupAssociationArrayOutputWithContext(ctx context.Context) ApplicationSecurityGroupAssociationArrayOutput {
	return o
}

func (o ApplicationSecurityGroupAssociationArrayOutput) Index(i pulumi.IntInput) ApplicationSecurityGroupAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplicationSecurityGroupAssociation {
		return vs[0].([]*ApplicationSecurityGroupAssociation)[vs[1].(int)]
	}).(ApplicationSecurityGroupAssociationOutput)
}

type ApplicationSecurityGroupAssociationMapOutput struct{ *pulumi.OutputState }

func (ApplicationSecurityGroupAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationSecurityGroupAssociation)(nil)).Elem()
}

func (o ApplicationSecurityGroupAssociationMapOutput) ToApplicationSecurityGroupAssociationMapOutput() ApplicationSecurityGroupAssociationMapOutput {
	return o
}

func (o ApplicationSecurityGroupAssociationMapOutput) ToApplicationSecurityGroupAssociationMapOutputWithContext(ctx context.Context) ApplicationSecurityGroupAssociationMapOutput {
	return o
}

func (o ApplicationSecurityGroupAssociationMapOutput) MapIndex(k pulumi.StringInput) ApplicationSecurityGroupAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplicationSecurityGroupAssociation {
		return vs[0].(map[string]*ApplicationSecurityGroupAssociation)[vs[1].(string)]
	}).(ApplicationSecurityGroupAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSecurityGroupAssociationInput)(nil)).Elem(), &ApplicationSecurityGroupAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSecurityGroupAssociationArrayInput)(nil)).Elem(), ApplicationSecurityGroupAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSecurityGroupAssociationMapInput)(nil)).Elem(), ApplicationSecurityGroupAssociationMap{})
	pulumi.RegisterOutputType(ApplicationSecurityGroupAssociationOutput{})
	pulumi.RegisterOutputType(ApplicationSecurityGroupAssociationArrayOutput{})
	pulumi.RegisterOutputType(ApplicationSecurityGroupAssociationMapOutput{})
}
