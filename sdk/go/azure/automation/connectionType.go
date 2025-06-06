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

// Manages anAutomation Connection Type.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/automation"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("resourceGroup-example"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = core.GetClientConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := automation.NewAccount(ctx, "example", &automation.AccountArgs{
//				Name:              pulumi.String("account-example"),
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				SkuName:           pulumi.String("Basic"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = automation.NewConnectionType(ctx, "example", &automation.ConnectionTypeArgs{
//				Name:                  pulumi.String("example"),
//				ResourceGroupName:     exampleResourceGroup.Name,
//				AutomationAccountName: exampleAccount.Name,
//				Fields: automation.ConnectionTypeFieldArray{
//					&automation.ConnectionTypeFieldArgs{
//						Name: pulumi.String("example"),
//						Type: pulumi.String("string"),
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
// * `Microsoft.Automation`: 2023-11-01
//
// ## Import
//
// Automations can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:automation/connectionType:ConnectionType example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/connectionTypes/type1
// ```
type ConnectionType struct {
	pulumi.CustomResourceState

	// The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringOutput `pulumi:"automationAccountName"`
	// One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
	Fields ConnectionTypeFieldArrayOutput `pulumi:"fields"`
	// Whether the connection type is global. Changing this forces a new Automation to be created.
	IsGlobal pulumi.BoolPtrOutput `pulumi:"isGlobal"`
	// The name which should be used for this Automation Connection Type. Changing this forces a new Automation to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
}

// NewConnectionType registers a new resource with the given unique name, arguments, and options.
func NewConnectionType(ctx *pulumi.Context,
	name string, args *ConnectionTypeArgs, opts ...pulumi.ResourceOption) (*ConnectionType, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutomationAccountName == nil {
		return nil, errors.New("invalid value for required argument 'AutomationAccountName'")
	}
	if args.Fields == nil {
		return nil, errors.New("invalid value for required argument 'Fields'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ConnectionType
	err := ctx.RegisterResource("azure:automation/connectionType:ConnectionType", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectionType gets an existing ConnectionType resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectionType(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionTypeState, opts ...pulumi.ResourceOption) (*ConnectionType, error) {
	var resource ConnectionType
	err := ctx.ReadResource("azure:automation/connectionType:ConnectionType", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectionType resources.
type connectionTypeState struct {
	// The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
	AutomationAccountName *string `pulumi:"automationAccountName"`
	// One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
	Fields []ConnectionTypeField `pulumi:"fields"`
	// Whether the connection type is global. Changing this forces a new Automation to be created.
	IsGlobal *bool `pulumi:"isGlobal"`
	// The name which should be used for this Automation Connection Type. Changing this forces a new Automation to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
}

type ConnectionTypeState struct {
	// The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringPtrInput
	// One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
	Fields ConnectionTypeFieldArrayInput
	// Whether the connection type is global. Changing this forces a new Automation to be created.
	IsGlobal pulumi.BoolPtrInput
	// The name which should be used for this Automation Connection Type. Changing this forces a new Automation to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName pulumi.StringPtrInput
}

func (ConnectionTypeState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionTypeState)(nil)).Elem()
}

type connectionTypeArgs struct {
	// The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
	AutomationAccountName string `pulumi:"automationAccountName"`
	// One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
	Fields []ConnectionTypeField `pulumi:"fields"`
	// Whether the connection type is global. Changing this forces a new Automation to be created.
	IsGlobal *bool `pulumi:"isGlobal"`
	// The name which should be used for this Automation Connection Type. Changing this forces a new Automation to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// The set of arguments for constructing a ConnectionType resource.
type ConnectionTypeArgs struct {
	// The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringInput
	// One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
	Fields ConnectionTypeFieldArrayInput
	// Whether the connection type is global. Changing this forces a new Automation to be created.
	IsGlobal pulumi.BoolPtrInput
	// The name which should be used for this Automation Connection Type. Changing this forces a new Automation to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName pulumi.StringInput
}

func (ConnectionTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionTypeArgs)(nil)).Elem()
}

type ConnectionTypeInput interface {
	pulumi.Input

	ToConnectionTypeOutput() ConnectionTypeOutput
	ToConnectionTypeOutputWithContext(ctx context.Context) ConnectionTypeOutput
}

func (*ConnectionType) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionType)(nil)).Elem()
}

func (i *ConnectionType) ToConnectionTypeOutput() ConnectionTypeOutput {
	return i.ToConnectionTypeOutputWithContext(context.Background())
}

func (i *ConnectionType) ToConnectionTypeOutputWithContext(ctx context.Context) ConnectionTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionTypeOutput)
}

// ConnectionTypeArrayInput is an input type that accepts ConnectionTypeArray and ConnectionTypeArrayOutput values.
// You can construct a concrete instance of `ConnectionTypeArrayInput` via:
//
//	ConnectionTypeArray{ ConnectionTypeArgs{...} }
type ConnectionTypeArrayInput interface {
	pulumi.Input

	ToConnectionTypeArrayOutput() ConnectionTypeArrayOutput
	ToConnectionTypeArrayOutputWithContext(context.Context) ConnectionTypeArrayOutput
}

type ConnectionTypeArray []ConnectionTypeInput

func (ConnectionTypeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionType)(nil)).Elem()
}

func (i ConnectionTypeArray) ToConnectionTypeArrayOutput() ConnectionTypeArrayOutput {
	return i.ToConnectionTypeArrayOutputWithContext(context.Background())
}

func (i ConnectionTypeArray) ToConnectionTypeArrayOutputWithContext(ctx context.Context) ConnectionTypeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionTypeArrayOutput)
}

// ConnectionTypeMapInput is an input type that accepts ConnectionTypeMap and ConnectionTypeMapOutput values.
// You can construct a concrete instance of `ConnectionTypeMapInput` via:
//
//	ConnectionTypeMap{ "key": ConnectionTypeArgs{...} }
type ConnectionTypeMapInput interface {
	pulumi.Input

	ToConnectionTypeMapOutput() ConnectionTypeMapOutput
	ToConnectionTypeMapOutputWithContext(context.Context) ConnectionTypeMapOutput
}

type ConnectionTypeMap map[string]ConnectionTypeInput

func (ConnectionTypeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionType)(nil)).Elem()
}

func (i ConnectionTypeMap) ToConnectionTypeMapOutput() ConnectionTypeMapOutput {
	return i.ToConnectionTypeMapOutputWithContext(context.Background())
}

func (i ConnectionTypeMap) ToConnectionTypeMapOutputWithContext(ctx context.Context) ConnectionTypeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionTypeMapOutput)
}

type ConnectionTypeOutput struct{ *pulumi.OutputState }

func (ConnectionTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionType)(nil)).Elem()
}

func (o ConnectionTypeOutput) ToConnectionTypeOutput() ConnectionTypeOutput {
	return o
}

func (o ConnectionTypeOutput) ToConnectionTypeOutputWithContext(ctx context.Context) ConnectionTypeOutput {
	return o
}

// The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
func (o ConnectionTypeOutput) AutomationAccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionType) pulumi.StringOutput { return v.AutomationAccountName }).(pulumi.StringOutput)
}

// One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
func (o ConnectionTypeOutput) Fields() ConnectionTypeFieldArrayOutput {
	return o.ApplyT(func(v *ConnectionType) ConnectionTypeFieldArrayOutput { return v.Fields }).(ConnectionTypeFieldArrayOutput)
}

// Whether the connection type is global. Changing this forces a new Automation to be created.
func (o ConnectionTypeOutput) IsGlobal() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ConnectionType) pulumi.BoolPtrOutput { return v.IsGlobal }).(pulumi.BoolPtrOutput)
}

// The name which should be used for this Automation Connection Type. Changing this forces a new Automation to be created.
func (o ConnectionTypeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionType) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
func (o ConnectionTypeOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionType) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

type ConnectionTypeArrayOutput struct{ *pulumi.OutputState }

func (ConnectionTypeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionType)(nil)).Elem()
}

func (o ConnectionTypeArrayOutput) ToConnectionTypeArrayOutput() ConnectionTypeArrayOutput {
	return o
}

func (o ConnectionTypeArrayOutput) ToConnectionTypeArrayOutputWithContext(ctx context.Context) ConnectionTypeArrayOutput {
	return o
}

func (o ConnectionTypeArrayOutput) Index(i pulumi.IntInput) ConnectionTypeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectionType {
		return vs[0].([]*ConnectionType)[vs[1].(int)]
	}).(ConnectionTypeOutput)
}

type ConnectionTypeMapOutput struct{ *pulumi.OutputState }

func (ConnectionTypeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionType)(nil)).Elem()
}

func (o ConnectionTypeMapOutput) ToConnectionTypeMapOutput() ConnectionTypeMapOutput {
	return o
}

func (o ConnectionTypeMapOutput) ToConnectionTypeMapOutputWithContext(ctx context.Context) ConnectionTypeMapOutput {
	return o
}

func (o ConnectionTypeMapOutput) MapIndex(k pulumi.StringInput) ConnectionTypeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectionType {
		return vs[0].(map[string]*ConnectionType)[vs[1].(string)]
	}).(ConnectionTypeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionTypeInput)(nil)).Elem(), &ConnectionType{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionTypeArrayInput)(nil)).Elem(), ConnectionTypeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionTypeMapInput)(nil)).Elem(), ConnectionTypeMap{})
	pulumi.RegisterOutputType(ConnectionTypeOutput{})
	pulumi.RegisterOutputType(ConnectionTypeArrayOutput{})
	pulumi.RegisterOutputType(ConnectionTypeMapOutput{})
}
