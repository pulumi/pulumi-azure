// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package core

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Subscription Template Deployment.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := core.NewSubscriptionTemplateDeployment(ctx, "example", &core.SubscriptionTemplateDeploymentArgs{
//				Name:     pulumi.String("example-deployment"),
//				Location: pulumi.String("West Europe"),
//				TemplateContent: pulumi.String(` {
//	   "$schema": "https://schema.management.azure.com/schemas/2015-01-01/deploymentTemplate.json#",
//	   "contentVersion": "1.0.0.0",
//	   "parameters": {},
//	   "variables": {},
//	   "resources": [
//	     {
//	       "type": "Microsoft.Resources/resourceGroups",
//	       "apiVersion": "2018-05-01",
//	       "location": "West Europe",
//	       "name": "some-resource-group",
//	       "properties": {}
//	     }
//	   ]
//	 }
//
// `),
//
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
// ## Import
//
// Subscription Template Deployments can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:core/subscriptionTemplateDeployment:SubscriptionTemplateDeployment example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Resources/deployments/template1
// ```
type SubscriptionTemplateDeployment struct {
	pulumi.CustomResourceState

	// The Debug Level which should be used for this Subscription Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
	DebugLevel pulumi.StringPtrOutput `pulumi:"debugLevel"`
	// The Azure Region where the Subscription Template Deployment should exist. Changing this forces a new Subscription Template Deployment to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name which should be used for this Subscription Template Deployment. Changing this forces a new Subscription Template Deployment to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The JSON Content of the Outputs of the ARM Template Deployment.
	OutputContent pulumi.StringOutput `pulumi:"outputContent"`
	// The contents of the ARM Template parameters file - containing a JSON list of parameters.
	ParametersContent pulumi.StringOutput `pulumi:"parametersContent"`
	// A mapping of tags which should be assigned to the Subscription Template Deployment.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The contents of the ARM Template which should be deployed into this Subscription.
	TemplateContent pulumi.StringOutput `pulumi:"templateContent"`
	// The ID of the Template Spec Version to deploy into the Subscription. Cannot be specified with `templateContent`.
	TemplateSpecVersionId pulumi.StringPtrOutput `pulumi:"templateSpecVersionId"`
}

// NewSubscriptionTemplateDeployment registers a new resource with the given unique name, arguments, and options.
func NewSubscriptionTemplateDeployment(ctx *pulumi.Context,
	name string, args *SubscriptionTemplateDeploymentArgs, opts ...pulumi.ResourceOption) (*SubscriptionTemplateDeployment, error) {
	if args == nil {
		args = &SubscriptionTemplateDeploymentArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SubscriptionTemplateDeployment
	err := ctx.RegisterResource("azure:core/subscriptionTemplateDeployment:SubscriptionTemplateDeployment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubscriptionTemplateDeployment gets an existing SubscriptionTemplateDeployment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubscriptionTemplateDeployment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubscriptionTemplateDeploymentState, opts ...pulumi.ResourceOption) (*SubscriptionTemplateDeployment, error) {
	var resource SubscriptionTemplateDeployment
	err := ctx.ReadResource("azure:core/subscriptionTemplateDeployment:SubscriptionTemplateDeployment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SubscriptionTemplateDeployment resources.
type subscriptionTemplateDeploymentState struct {
	// The Debug Level which should be used for this Subscription Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
	DebugLevel *string `pulumi:"debugLevel"`
	// The Azure Region where the Subscription Template Deployment should exist. Changing this forces a new Subscription Template Deployment to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Subscription Template Deployment. Changing this forces a new Subscription Template Deployment to be created.
	Name *string `pulumi:"name"`
	// The JSON Content of the Outputs of the ARM Template Deployment.
	OutputContent *string `pulumi:"outputContent"`
	// The contents of the ARM Template parameters file - containing a JSON list of parameters.
	ParametersContent *string `pulumi:"parametersContent"`
	// A mapping of tags which should be assigned to the Subscription Template Deployment.
	Tags map[string]string `pulumi:"tags"`
	// The contents of the ARM Template which should be deployed into this Subscription.
	TemplateContent *string `pulumi:"templateContent"`
	// The ID of the Template Spec Version to deploy into the Subscription. Cannot be specified with `templateContent`.
	TemplateSpecVersionId *string `pulumi:"templateSpecVersionId"`
}

type SubscriptionTemplateDeploymentState struct {
	// The Debug Level which should be used for this Subscription Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
	DebugLevel pulumi.StringPtrInput
	// The Azure Region where the Subscription Template Deployment should exist. Changing this forces a new Subscription Template Deployment to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Subscription Template Deployment. Changing this forces a new Subscription Template Deployment to be created.
	Name pulumi.StringPtrInput
	// The JSON Content of the Outputs of the ARM Template Deployment.
	OutputContent pulumi.StringPtrInput
	// The contents of the ARM Template parameters file - containing a JSON list of parameters.
	ParametersContent pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Subscription Template Deployment.
	Tags pulumi.StringMapInput
	// The contents of the ARM Template which should be deployed into this Subscription.
	TemplateContent pulumi.StringPtrInput
	// The ID of the Template Spec Version to deploy into the Subscription. Cannot be specified with `templateContent`.
	TemplateSpecVersionId pulumi.StringPtrInput
}

func (SubscriptionTemplateDeploymentState) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionTemplateDeploymentState)(nil)).Elem()
}

type subscriptionTemplateDeploymentArgs struct {
	// The Debug Level which should be used for this Subscription Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
	DebugLevel *string `pulumi:"debugLevel"`
	// The Azure Region where the Subscription Template Deployment should exist. Changing this forces a new Subscription Template Deployment to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Subscription Template Deployment. Changing this forces a new Subscription Template Deployment to be created.
	Name *string `pulumi:"name"`
	// The contents of the ARM Template parameters file - containing a JSON list of parameters.
	ParametersContent *string `pulumi:"parametersContent"`
	// A mapping of tags which should be assigned to the Subscription Template Deployment.
	Tags map[string]string `pulumi:"tags"`
	// The contents of the ARM Template which should be deployed into this Subscription.
	TemplateContent *string `pulumi:"templateContent"`
	// The ID of the Template Spec Version to deploy into the Subscription. Cannot be specified with `templateContent`.
	TemplateSpecVersionId *string `pulumi:"templateSpecVersionId"`
}

// The set of arguments for constructing a SubscriptionTemplateDeployment resource.
type SubscriptionTemplateDeploymentArgs struct {
	// The Debug Level which should be used for this Subscription Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
	DebugLevel pulumi.StringPtrInput
	// The Azure Region where the Subscription Template Deployment should exist. Changing this forces a new Subscription Template Deployment to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Subscription Template Deployment. Changing this forces a new Subscription Template Deployment to be created.
	Name pulumi.StringPtrInput
	// The contents of the ARM Template parameters file - containing a JSON list of parameters.
	ParametersContent pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Subscription Template Deployment.
	Tags pulumi.StringMapInput
	// The contents of the ARM Template which should be deployed into this Subscription.
	TemplateContent pulumi.StringPtrInput
	// The ID of the Template Spec Version to deploy into the Subscription. Cannot be specified with `templateContent`.
	TemplateSpecVersionId pulumi.StringPtrInput
}

func (SubscriptionTemplateDeploymentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionTemplateDeploymentArgs)(nil)).Elem()
}

type SubscriptionTemplateDeploymentInput interface {
	pulumi.Input

	ToSubscriptionTemplateDeploymentOutput() SubscriptionTemplateDeploymentOutput
	ToSubscriptionTemplateDeploymentOutputWithContext(ctx context.Context) SubscriptionTemplateDeploymentOutput
}

func (*SubscriptionTemplateDeployment) ElementType() reflect.Type {
	return reflect.TypeOf((**SubscriptionTemplateDeployment)(nil)).Elem()
}

func (i *SubscriptionTemplateDeployment) ToSubscriptionTemplateDeploymentOutput() SubscriptionTemplateDeploymentOutput {
	return i.ToSubscriptionTemplateDeploymentOutputWithContext(context.Background())
}

func (i *SubscriptionTemplateDeployment) ToSubscriptionTemplateDeploymentOutputWithContext(ctx context.Context) SubscriptionTemplateDeploymentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionTemplateDeploymentOutput)
}

// SubscriptionTemplateDeploymentArrayInput is an input type that accepts SubscriptionTemplateDeploymentArray and SubscriptionTemplateDeploymentArrayOutput values.
// You can construct a concrete instance of `SubscriptionTemplateDeploymentArrayInput` via:
//
//	SubscriptionTemplateDeploymentArray{ SubscriptionTemplateDeploymentArgs{...} }
type SubscriptionTemplateDeploymentArrayInput interface {
	pulumi.Input

	ToSubscriptionTemplateDeploymentArrayOutput() SubscriptionTemplateDeploymentArrayOutput
	ToSubscriptionTemplateDeploymentArrayOutputWithContext(context.Context) SubscriptionTemplateDeploymentArrayOutput
}

type SubscriptionTemplateDeploymentArray []SubscriptionTemplateDeploymentInput

func (SubscriptionTemplateDeploymentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubscriptionTemplateDeployment)(nil)).Elem()
}

func (i SubscriptionTemplateDeploymentArray) ToSubscriptionTemplateDeploymentArrayOutput() SubscriptionTemplateDeploymentArrayOutput {
	return i.ToSubscriptionTemplateDeploymentArrayOutputWithContext(context.Background())
}

func (i SubscriptionTemplateDeploymentArray) ToSubscriptionTemplateDeploymentArrayOutputWithContext(ctx context.Context) SubscriptionTemplateDeploymentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionTemplateDeploymentArrayOutput)
}

// SubscriptionTemplateDeploymentMapInput is an input type that accepts SubscriptionTemplateDeploymentMap and SubscriptionTemplateDeploymentMapOutput values.
// You can construct a concrete instance of `SubscriptionTemplateDeploymentMapInput` via:
//
//	SubscriptionTemplateDeploymentMap{ "key": SubscriptionTemplateDeploymentArgs{...} }
type SubscriptionTemplateDeploymentMapInput interface {
	pulumi.Input

	ToSubscriptionTemplateDeploymentMapOutput() SubscriptionTemplateDeploymentMapOutput
	ToSubscriptionTemplateDeploymentMapOutputWithContext(context.Context) SubscriptionTemplateDeploymentMapOutput
}

type SubscriptionTemplateDeploymentMap map[string]SubscriptionTemplateDeploymentInput

func (SubscriptionTemplateDeploymentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubscriptionTemplateDeployment)(nil)).Elem()
}

func (i SubscriptionTemplateDeploymentMap) ToSubscriptionTemplateDeploymentMapOutput() SubscriptionTemplateDeploymentMapOutput {
	return i.ToSubscriptionTemplateDeploymentMapOutputWithContext(context.Background())
}

func (i SubscriptionTemplateDeploymentMap) ToSubscriptionTemplateDeploymentMapOutputWithContext(ctx context.Context) SubscriptionTemplateDeploymentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionTemplateDeploymentMapOutput)
}

type SubscriptionTemplateDeploymentOutput struct{ *pulumi.OutputState }

func (SubscriptionTemplateDeploymentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SubscriptionTemplateDeployment)(nil)).Elem()
}

func (o SubscriptionTemplateDeploymentOutput) ToSubscriptionTemplateDeploymentOutput() SubscriptionTemplateDeploymentOutput {
	return o
}

func (o SubscriptionTemplateDeploymentOutput) ToSubscriptionTemplateDeploymentOutputWithContext(ctx context.Context) SubscriptionTemplateDeploymentOutput {
	return o
}

// The Debug Level which should be used for this Subscription Template Deployment. Possible values are `none`, `requestContent`, `responseContent` and `requestContent, responseContent`.
func (o SubscriptionTemplateDeploymentOutput) DebugLevel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SubscriptionTemplateDeployment) pulumi.StringPtrOutput { return v.DebugLevel }).(pulumi.StringPtrOutput)
}

// The Azure Region where the Subscription Template Deployment should exist. Changing this forces a new Subscription Template Deployment to be created.
func (o SubscriptionTemplateDeploymentOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionTemplateDeployment) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name which should be used for this Subscription Template Deployment. Changing this forces a new Subscription Template Deployment to be created.
func (o SubscriptionTemplateDeploymentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionTemplateDeployment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The JSON Content of the Outputs of the ARM Template Deployment.
func (o SubscriptionTemplateDeploymentOutput) OutputContent() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionTemplateDeployment) pulumi.StringOutput { return v.OutputContent }).(pulumi.StringOutput)
}

// The contents of the ARM Template parameters file - containing a JSON list of parameters.
func (o SubscriptionTemplateDeploymentOutput) ParametersContent() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionTemplateDeployment) pulumi.StringOutput { return v.ParametersContent }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Subscription Template Deployment.
func (o SubscriptionTemplateDeploymentOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SubscriptionTemplateDeployment) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The contents of the ARM Template which should be deployed into this Subscription.
func (o SubscriptionTemplateDeploymentOutput) TemplateContent() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionTemplateDeployment) pulumi.StringOutput { return v.TemplateContent }).(pulumi.StringOutput)
}

// The ID of the Template Spec Version to deploy into the Subscription. Cannot be specified with `templateContent`.
func (o SubscriptionTemplateDeploymentOutput) TemplateSpecVersionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SubscriptionTemplateDeployment) pulumi.StringPtrOutput { return v.TemplateSpecVersionId }).(pulumi.StringPtrOutput)
}

type SubscriptionTemplateDeploymentArrayOutput struct{ *pulumi.OutputState }

func (SubscriptionTemplateDeploymentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubscriptionTemplateDeployment)(nil)).Elem()
}

func (o SubscriptionTemplateDeploymentArrayOutput) ToSubscriptionTemplateDeploymentArrayOutput() SubscriptionTemplateDeploymentArrayOutput {
	return o
}

func (o SubscriptionTemplateDeploymentArrayOutput) ToSubscriptionTemplateDeploymentArrayOutputWithContext(ctx context.Context) SubscriptionTemplateDeploymentArrayOutput {
	return o
}

func (o SubscriptionTemplateDeploymentArrayOutput) Index(i pulumi.IntInput) SubscriptionTemplateDeploymentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SubscriptionTemplateDeployment {
		return vs[0].([]*SubscriptionTemplateDeployment)[vs[1].(int)]
	}).(SubscriptionTemplateDeploymentOutput)
}

type SubscriptionTemplateDeploymentMapOutput struct{ *pulumi.OutputState }

func (SubscriptionTemplateDeploymentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubscriptionTemplateDeployment)(nil)).Elem()
}

func (o SubscriptionTemplateDeploymentMapOutput) ToSubscriptionTemplateDeploymentMapOutput() SubscriptionTemplateDeploymentMapOutput {
	return o
}

func (o SubscriptionTemplateDeploymentMapOutput) ToSubscriptionTemplateDeploymentMapOutputWithContext(ctx context.Context) SubscriptionTemplateDeploymentMapOutput {
	return o
}

func (o SubscriptionTemplateDeploymentMapOutput) MapIndex(k pulumi.StringInput) SubscriptionTemplateDeploymentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SubscriptionTemplateDeployment {
		return vs[0].(map[string]*SubscriptionTemplateDeployment)[vs[1].(string)]
	}).(SubscriptionTemplateDeploymentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionTemplateDeploymentInput)(nil)).Elem(), &SubscriptionTemplateDeployment{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionTemplateDeploymentArrayInput)(nil)).Elem(), SubscriptionTemplateDeploymentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionTemplateDeploymentMapInput)(nil)).Elem(), SubscriptionTemplateDeploymentMap{})
	pulumi.RegisterOutputType(SubscriptionTemplateDeploymentOutput{})
	pulumi.RegisterOutputType(SubscriptionTemplateDeploymentArrayOutput{})
	pulumi.RegisterOutputType(SubscriptionTemplateDeploymentMapOutput{})
}
