// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package automation

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an object variable in Azure Automation
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/automation"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("tfex-example-rg"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := automation.NewAccount(ctx, "example", &automation.AccountArgs{
//				Name:              pulumi.String("tfex-example-account"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				SkuName:           pulumi.String("Basic"),
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"greeting": "Hello, Terraform Basic Test.",
//				"language": "en",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = automation.NewVariableObject(ctx, "example", &automation.VariableObjectArgs{
//				Name:                  pulumi.String("tfex-example-var"),
//				ResourceGroupName:     example.Name,
//				AutomationAccountName: exampleAccount.Name,
//				Value:                 pulumi.String(json0),
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
// Automation Object Variable can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:automation/variableObject:VariableObject example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/tfex-example-rg/providers/Microsoft.Automation/automationAccounts/tfex-example-account/variables/tfex-example-var
// ```
type VariableObject struct {
	pulumi.CustomResourceState

	// The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringOutput `pulumi:"automationAccountName"`
	// The description of the Automation Variable.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies if the Automation Variable is encrypted. Defaults to `false`.
	Encrypted pulumi.BoolPtrOutput `pulumi:"encrypted"`
	// The name of the Automation Variable. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The value of the Automation Variable as a `jsonencode()` string.
	Value pulumi.StringPtrOutput `pulumi:"value"`
}

// NewVariableObject registers a new resource with the given unique name, arguments, and options.
func NewVariableObject(ctx *pulumi.Context,
	name string, args *VariableObjectArgs, opts ...pulumi.ResourceOption) (*VariableObject, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutomationAccountName == nil {
		return nil, errors.New("invalid value for required argument 'AutomationAccountName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VariableObject
	err := ctx.RegisterResource("azure:automation/variableObject:VariableObject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVariableObject gets an existing VariableObject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVariableObject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VariableObjectState, opts ...pulumi.ResourceOption) (*VariableObject, error) {
	var resource VariableObject
	err := ctx.ReadResource("azure:automation/variableObject:VariableObject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VariableObject resources.
type variableObjectState struct {
	// The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
	AutomationAccountName *string `pulumi:"automationAccountName"`
	// The description of the Automation Variable.
	Description *string `pulumi:"description"`
	// Specifies if the Automation Variable is encrypted. Defaults to `false`.
	Encrypted *bool `pulumi:"encrypted"`
	// The name of the Automation Variable. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The value of the Automation Variable as a `jsonencode()` string.
	Value *string `pulumi:"value"`
}

type VariableObjectState struct {
	// The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringPtrInput
	// The description of the Automation Variable.
	Description pulumi.StringPtrInput
	// Specifies if the Automation Variable is encrypted. Defaults to `false`.
	Encrypted pulumi.BoolPtrInput
	// The name of the Automation Variable. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The value of the Automation Variable as a `jsonencode()` string.
	Value pulumi.StringPtrInput
}

func (VariableObjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*variableObjectState)(nil)).Elem()
}

type variableObjectArgs struct {
	// The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
	AutomationAccountName string `pulumi:"automationAccountName"`
	// The description of the Automation Variable.
	Description *string `pulumi:"description"`
	// Specifies if the Automation Variable is encrypted. Defaults to `false`.
	Encrypted *bool `pulumi:"encrypted"`
	// The name of the Automation Variable. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The value of the Automation Variable as a `jsonencode()` string.
	Value *string `pulumi:"value"`
}

// The set of arguments for constructing a VariableObject resource.
type VariableObjectArgs struct {
	// The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringInput
	// The description of the Automation Variable.
	Description pulumi.StringPtrInput
	// Specifies if the Automation Variable is encrypted. Defaults to `false`.
	Encrypted pulumi.BoolPtrInput
	// The name of the Automation Variable. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The value of the Automation Variable as a `jsonencode()` string.
	Value pulumi.StringPtrInput
}

func (VariableObjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*variableObjectArgs)(nil)).Elem()
}

type VariableObjectInput interface {
	pulumi.Input

	ToVariableObjectOutput() VariableObjectOutput
	ToVariableObjectOutputWithContext(ctx context.Context) VariableObjectOutput
}

func (*VariableObject) ElementType() reflect.Type {
	return reflect.TypeOf((**VariableObject)(nil)).Elem()
}

func (i *VariableObject) ToVariableObjectOutput() VariableObjectOutput {
	return i.ToVariableObjectOutputWithContext(context.Background())
}

func (i *VariableObject) ToVariableObjectOutputWithContext(ctx context.Context) VariableObjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VariableObjectOutput)
}

// VariableObjectArrayInput is an input type that accepts VariableObjectArray and VariableObjectArrayOutput values.
// You can construct a concrete instance of `VariableObjectArrayInput` via:
//
//	VariableObjectArray{ VariableObjectArgs{...} }
type VariableObjectArrayInput interface {
	pulumi.Input

	ToVariableObjectArrayOutput() VariableObjectArrayOutput
	ToVariableObjectArrayOutputWithContext(context.Context) VariableObjectArrayOutput
}

type VariableObjectArray []VariableObjectInput

func (VariableObjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VariableObject)(nil)).Elem()
}

func (i VariableObjectArray) ToVariableObjectArrayOutput() VariableObjectArrayOutput {
	return i.ToVariableObjectArrayOutputWithContext(context.Background())
}

func (i VariableObjectArray) ToVariableObjectArrayOutputWithContext(ctx context.Context) VariableObjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VariableObjectArrayOutput)
}

// VariableObjectMapInput is an input type that accepts VariableObjectMap and VariableObjectMapOutput values.
// You can construct a concrete instance of `VariableObjectMapInput` via:
//
//	VariableObjectMap{ "key": VariableObjectArgs{...} }
type VariableObjectMapInput interface {
	pulumi.Input

	ToVariableObjectMapOutput() VariableObjectMapOutput
	ToVariableObjectMapOutputWithContext(context.Context) VariableObjectMapOutput
}

type VariableObjectMap map[string]VariableObjectInput

func (VariableObjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VariableObject)(nil)).Elem()
}

func (i VariableObjectMap) ToVariableObjectMapOutput() VariableObjectMapOutput {
	return i.ToVariableObjectMapOutputWithContext(context.Background())
}

func (i VariableObjectMap) ToVariableObjectMapOutputWithContext(ctx context.Context) VariableObjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VariableObjectMapOutput)
}

type VariableObjectOutput struct{ *pulumi.OutputState }

func (VariableObjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VariableObject)(nil)).Elem()
}

func (o VariableObjectOutput) ToVariableObjectOutput() VariableObjectOutput {
	return o
}

func (o VariableObjectOutput) ToVariableObjectOutputWithContext(ctx context.Context) VariableObjectOutput {
	return o
}

// The name of the automation account in which the Variable is created. Changing this forces a new resource to be created.
func (o VariableObjectOutput) AutomationAccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *VariableObject) pulumi.StringOutput { return v.AutomationAccountName }).(pulumi.StringOutput)
}

// The description of the Automation Variable.
func (o VariableObjectOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VariableObject) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies if the Automation Variable is encrypted. Defaults to `false`.
func (o VariableObjectOutput) Encrypted() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VariableObject) pulumi.BoolPtrOutput { return v.Encrypted }).(pulumi.BoolPtrOutput)
}

// The name of the Automation Variable. Changing this forces a new resource to be created.
func (o VariableObjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VariableObject) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the resource group in which to create the Automation Variable. Changing this forces a new resource to be created.
func (o VariableObjectOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *VariableObject) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The value of the Automation Variable as a `jsonencode()` string.
func (o VariableObjectOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VariableObject) pulumi.StringPtrOutput { return v.Value }).(pulumi.StringPtrOutput)
}

type VariableObjectArrayOutput struct{ *pulumi.OutputState }

func (VariableObjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VariableObject)(nil)).Elem()
}

func (o VariableObjectArrayOutput) ToVariableObjectArrayOutput() VariableObjectArrayOutput {
	return o
}

func (o VariableObjectArrayOutput) ToVariableObjectArrayOutputWithContext(ctx context.Context) VariableObjectArrayOutput {
	return o
}

func (o VariableObjectArrayOutput) Index(i pulumi.IntInput) VariableObjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VariableObject {
		return vs[0].([]*VariableObject)[vs[1].(int)]
	}).(VariableObjectOutput)
}

type VariableObjectMapOutput struct{ *pulumi.OutputState }

func (VariableObjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VariableObject)(nil)).Elem()
}

func (o VariableObjectMapOutput) ToVariableObjectMapOutput() VariableObjectMapOutput {
	return o
}

func (o VariableObjectMapOutput) ToVariableObjectMapOutputWithContext(ctx context.Context) VariableObjectMapOutput {
	return o
}

func (o VariableObjectMapOutput) MapIndex(k pulumi.StringInput) VariableObjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VariableObject {
		return vs[0].(map[string]*VariableObject)[vs[1].(string)]
	}).(VariableObjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VariableObjectInput)(nil)).Elem(), &VariableObject{})
	pulumi.RegisterInputType(reflect.TypeOf((*VariableObjectArrayInput)(nil)).Elem(), VariableObjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VariableObjectMapInput)(nil)).Elem(), VariableObjectMap{})
	pulumi.RegisterOutputType(VariableObjectOutput{})
	pulumi.RegisterOutputType(VariableObjectArrayOutput{})
	pulumi.RegisterOutputType(VariableObjectMapOutput{})
}
