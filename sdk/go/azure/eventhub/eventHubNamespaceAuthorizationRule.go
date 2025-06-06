// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eventhub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Authorization Rule for an Event Hub Namespace.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/eventhub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("resourcegroup"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleEventHubNamespace, err := eventhub.NewEventHubNamespace(ctx, "example", &eventhub.EventHubNamespaceArgs{
//				Name:              pulumi.String("acceptanceTestEventHubNamespace"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("Basic"),
//				Capacity:          pulumi.Int(2),
//				Tags: pulumi.StringMap{
//					"environment": pulumi.String("Production"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = eventhub.NewEventHubNamespaceAuthorizationRule(ctx, "example", &eventhub.EventHubNamespaceAuthorizationRuleArgs{
//				Name:              pulumi.String("navi"),
//				NamespaceName:     exampleEventHubNamespace.Name,
//				ResourceGroupName: example.Name,
//				Listen:            pulumi.Bool(true),
//				Send:              pulumi.Bool(false),
//				Manage:            pulumi.Bool(false),
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
// * `Microsoft.EventHub`: 2024-01-01
//
// ## Import
//
// EventHub Namespace Authorization Rules can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:eventhub/eventHubNamespaceAuthorizationRule:EventHubNamespaceAuthorizationRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventHub/namespaces/namespace1/authorizationRules/rule1
// ```
type EventHubNamespaceAuthorizationRule struct {
	pulumi.CustomResourceState

	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrOutput `pulumi:"listen"`
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage pulumi.BoolPtrOutput `pulumi:"manage"`
	// Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the name of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceName pulumi.StringOutput `pulumi:"namespaceName"`
	// The Primary Connection String for the Authorization Rule.
	PrimaryConnectionString pulumi.StringOutput `pulumi:"primaryConnectionString"`
	// The alias of the Primary Connection String for the Authorization Rule, which is generated when disaster recovery is enabled.
	PrimaryConnectionStringAlias pulumi.StringOutput `pulumi:"primaryConnectionStringAlias"`
	// The Primary Key for the Authorization Rule.
	PrimaryKey pulumi.StringOutput `pulumi:"primaryKey"`
	// The name of the resource group in which the EventHub Namespace exists. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The Secondary Connection String for the Authorization Rule.
	SecondaryConnectionString pulumi.StringOutput `pulumi:"secondaryConnectionString"`
	// The alias of the Secondary Connection String for the Authorization Rule, which is generated when disaster recovery is enabled.
	SecondaryConnectionStringAlias pulumi.StringOutput `pulumi:"secondaryConnectionStringAlias"`
	// The Secondary Key for the Authorization Rule.
	SecondaryKey pulumi.StringOutput `pulumi:"secondaryKey"`
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrOutput `pulumi:"send"`
}

// NewEventHubNamespaceAuthorizationRule registers a new resource with the given unique name, arguments, and options.
func NewEventHubNamespaceAuthorizationRule(ctx *pulumi.Context,
	name string, args *EventHubNamespaceAuthorizationRuleArgs, opts ...pulumi.ResourceOption) (*EventHubNamespaceAuthorizationRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NamespaceName == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"primaryConnectionString",
		"primaryConnectionStringAlias",
		"primaryKey",
		"secondaryConnectionString",
		"secondaryConnectionStringAlias",
		"secondaryKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventHubNamespaceAuthorizationRule
	err := ctx.RegisterResource("azure:eventhub/eventHubNamespaceAuthorizationRule:EventHubNamespaceAuthorizationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventHubNamespaceAuthorizationRule gets an existing EventHubNamespaceAuthorizationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventHubNamespaceAuthorizationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventHubNamespaceAuthorizationRuleState, opts ...pulumi.ResourceOption) (*EventHubNamespaceAuthorizationRule, error) {
	var resource EventHubNamespaceAuthorizationRule
	err := ctx.ReadResource("azure:eventhub/eventHubNamespaceAuthorizationRule:EventHubNamespaceAuthorizationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventHubNamespaceAuthorizationRule resources.
type eventHubNamespaceAuthorizationRuleState struct {
	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen *bool `pulumi:"listen"`
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage *bool `pulumi:"manage"`
	// Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceName *string `pulumi:"namespaceName"`
	// The Primary Connection String for the Authorization Rule.
	PrimaryConnectionString *string `pulumi:"primaryConnectionString"`
	// The alias of the Primary Connection String for the Authorization Rule, which is generated when disaster recovery is enabled.
	PrimaryConnectionStringAlias *string `pulumi:"primaryConnectionStringAlias"`
	// The Primary Key for the Authorization Rule.
	PrimaryKey *string `pulumi:"primaryKey"`
	// The name of the resource group in which the EventHub Namespace exists. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The Secondary Connection String for the Authorization Rule.
	SecondaryConnectionString *string `pulumi:"secondaryConnectionString"`
	// The alias of the Secondary Connection String for the Authorization Rule, which is generated when disaster recovery is enabled.
	SecondaryConnectionStringAlias *string `pulumi:"secondaryConnectionStringAlias"`
	// The Secondary Key for the Authorization Rule.
	SecondaryKey *string `pulumi:"secondaryKey"`
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send *bool `pulumi:"send"`
}

type EventHubNamespaceAuthorizationRuleState struct {
	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrInput
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage pulumi.BoolPtrInput
	// Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceName pulumi.StringPtrInput
	// The Primary Connection String for the Authorization Rule.
	PrimaryConnectionString pulumi.StringPtrInput
	// The alias of the Primary Connection String for the Authorization Rule, which is generated when disaster recovery is enabled.
	PrimaryConnectionStringAlias pulumi.StringPtrInput
	// The Primary Key for the Authorization Rule.
	PrimaryKey pulumi.StringPtrInput
	// The name of the resource group in which the EventHub Namespace exists. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	ResourceGroupName pulumi.StringPtrInput
	// The Secondary Connection String for the Authorization Rule.
	SecondaryConnectionString pulumi.StringPtrInput
	// The alias of the Secondary Connection String for the Authorization Rule, which is generated when disaster recovery is enabled.
	SecondaryConnectionStringAlias pulumi.StringPtrInput
	// The Secondary Key for the Authorization Rule.
	SecondaryKey pulumi.StringPtrInput
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrInput
}

func (EventHubNamespaceAuthorizationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventHubNamespaceAuthorizationRuleState)(nil)).Elem()
}

type eventHubNamespaceAuthorizationRuleArgs struct {
	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen *bool `pulumi:"listen"`
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage *bool `pulumi:"manage"`
	// Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceName string `pulumi:"namespaceName"`
	// The name of the resource group in which the EventHub Namespace exists. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send *bool `pulumi:"send"`
}

// The set of arguments for constructing a EventHubNamespaceAuthorizationRule resource.
type EventHubNamespaceAuthorizationRuleArgs struct {
	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrInput
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage pulumi.BoolPtrInput
	// Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceName pulumi.StringInput
	// The name of the resource group in which the EventHub Namespace exists. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	ResourceGroupName pulumi.StringInput
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrInput
}

func (EventHubNamespaceAuthorizationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventHubNamespaceAuthorizationRuleArgs)(nil)).Elem()
}

type EventHubNamespaceAuthorizationRuleInput interface {
	pulumi.Input

	ToEventHubNamespaceAuthorizationRuleOutput() EventHubNamespaceAuthorizationRuleOutput
	ToEventHubNamespaceAuthorizationRuleOutputWithContext(ctx context.Context) EventHubNamespaceAuthorizationRuleOutput
}

func (*EventHubNamespaceAuthorizationRule) ElementType() reflect.Type {
	return reflect.TypeOf((**EventHubNamespaceAuthorizationRule)(nil)).Elem()
}

func (i *EventHubNamespaceAuthorizationRule) ToEventHubNamespaceAuthorizationRuleOutput() EventHubNamespaceAuthorizationRuleOutput {
	return i.ToEventHubNamespaceAuthorizationRuleOutputWithContext(context.Background())
}

func (i *EventHubNamespaceAuthorizationRule) ToEventHubNamespaceAuthorizationRuleOutputWithContext(ctx context.Context) EventHubNamespaceAuthorizationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHubNamespaceAuthorizationRuleOutput)
}

// EventHubNamespaceAuthorizationRuleArrayInput is an input type that accepts EventHubNamespaceAuthorizationRuleArray and EventHubNamespaceAuthorizationRuleArrayOutput values.
// You can construct a concrete instance of `EventHubNamespaceAuthorizationRuleArrayInput` via:
//
//	EventHubNamespaceAuthorizationRuleArray{ EventHubNamespaceAuthorizationRuleArgs{...} }
type EventHubNamespaceAuthorizationRuleArrayInput interface {
	pulumi.Input

	ToEventHubNamespaceAuthorizationRuleArrayOutput() EventHubNamespaceAuthorizationRuleArrayOutput
	ToEventHubNamespaceAuthorizationRuleArrayOutputWithContext(context.Context) EventHubNamespaceAuthorizationRuleArrayOutput
}

type EventHubNamespaceAuthorizationRuleArray []EventHubNamespaceAuthorizationRuleInput

func (EventHubNamespaceAuthorizationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventHubNamespaceAuthorizationRule)(nil)).Elem()
}

func (i EventHubNamespaceAuthorizationRuleArray) ToEventHubNamespaceAuthorizationRuleArrayOutput() EventHubNamespaceAuthorizationRuleArrayOutput {
	return i.ToEventHubNamespaceAuthorizationRuleArrayOutputWithContext(context.Background())
}

func (i EventHubNamespaceAuthorizationRuleArray) ToEventHubNamespaceAuthorizationRuleArrayOutputWithContext(ctx context.Context) EventHubNamespaceAuthorizationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHubNamespaceAuthorizationRuleArrayOutput)
}

// EventHubNamespaceAuthorizationRuleMapInput is an input type that accepts EventHubNamespaceAuthorizationRuleMap and EventHubNamespaceAuthorizationRuleMapOutput values.
// You can construct a concrete instance of `EventHubNamespaceAuthorizationRuleMapInput` via:
//
//	EventHubNamespaceAuthorizationRuleMap{ "key": EventHubNamespaceAuthorizationRuleArgs{...} }
type EventHubNamespaceAuthorizationRuleMapInput interface {
	pulumi.Input

	ToEventHubNamespaceAuthorizationRuleMapOutput() EventHubNamespaceAuthorizationRuleMapOutput
	ToEventHubNamespaceAuthorizationRuleMapOutputWithContext(context.Context) EventHubNamespaceAuthorizationRuleMapOutput
}

type EventHubNamespaceAuthorizationRuleMap map[string]EventHubNamespaceAuthorizationRuleInput

func (EventHubNamespaceAuthorizationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventHubNamespaceAuthorizationRule)(nil)).Elem()
}

func (i EventHubNamespaceAuthorizationRuleMap) ToEventHubNamespaceAuthorizationRuleMapOutput() EventHubNamespaceAuthorizationRuleMapOutput {
	return i.ToEventHubNamespaceAuthorizationRuleMapOutputWithContext(context.Background())
}

func (i EventHubNamespaceAuthorizationRuleMap) ToEventHubNamespaceAuthorizationRuleMapOutputWithContext(ctx context.Context) EventHubNamespaceAuthorizationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventHubNamespaceAuthorizationRuleMapOutput)
}

type EventHubNamespaceAuthorizationRuleOutput struct{ *pulumi.OutputState }

func (EventHubNamespaceAuthorizationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventHubNamespaceAuthorizationRule)(nil)).Elem()
}

func (o EventHubNamespaceAuthorizationRuleOutput) ToEventHubNamespaceAuthorizationRuleOutput() EventHubNamespaceAuthorizationRuleOutput {
	return o
}

func (o EventHubNamespaceAuthorizationRuleOutput) ToEventHubNamespaceAuthorizationRuleOutputWithContext(ctx context.Context) EventHubNamespaceAuthorizationRuleOutput {
	return o
}

// Grants listen access to this this Authorization Rule. Defaults to `false`.
func (o EventHubNamespaceAuthorizationRuleOutput) Listen() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.BoolPtrOutput { return v.Listen }).(pulumi.BoolPtrOutput)
}

// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
func (o EventHubNamespaceAuthorizationRuleOutput) Manage() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.BoolPtrOutput { return v.Manage }).(pulumi.BoolPtrOutput)
}

// Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
func (o EventHubNamespaceAuthorizationRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the name of the EventHub Namespace. Changing this forces a new resource to be created.
func (o EventHubNamespaceAuthorizationRuleOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.StringOutput { return v.NamespaceName }).(pulumi.StringOutput)
}

// The Primary Connection String for the Authorization Rule.
func (o EventHubNamespaceAuthorizationRuleOutput) PrimaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.StringOutput { return v.PrimaryConnectionString }).(pulumi.StringOutput)
}

// The alias of the Primary Connection String for the Authorization Rule, which is generated when disaster recovery is enabled.
func (o EventHubNamespaceAuthorizationRuleOutput) PrimaryConnectionStringAlias() pulumi.StringOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.StringOutput { return v.PrimaryConnectionStringAlias }).(pulumi.StringOutput)
}

// The Primary Key for the Authorization Rule.
func (o EventHubNamespaceAuthorizationRuleOutput) PrimaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.StringOutput { return v.PrimaryKey }).(pulumi.StringOutput)
}

// The name of the resource group in which the EventHub Namespace exists. Changing this forces a new resource to be created.
//
// > **Note:** At least one of the 3 permissions below needs to be set.
func (o EventHubNamespaceAuthorizationRuleOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The Secondary Connection String for the Authorization Rule.
func (o EventHubNamespaceAuthorizationRuleOutput) SecondaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.StringOutput { return v.SecondaryConnectionString }).(pulumi.StringOutput)
}

// The alias of the Secondary Connection String for the Authorization Rule, which is generated when disaster recovery is enabled.
func (o EventHubNamespaceAuthorizationRuleOutput) SecondaryConnectionStringAlias() pulumi.StringOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.StringOutput {
		return v.SecondaryConnectionStringAlias
	}).(pulumi.StringOutput)
}

// The Secondary Key for the Authorization Rule.
func (o EventHubNamespaceAuthorizationRuleOutput) SecondaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.StringOutput { return v.SecondaryKey }).(pulumi.StringOutput)
}

// Grants send access to this this Authorization Rule. Defaults to `false`.
func (o EventHubNamespaceAuthorizationRuleOutput) Send() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EventHubNamespaceAuthorizationRule) pulumi.BoolPtrOutput { return v.Send }).(pulumi.BoolPtrOutput)
}

type EventHubNamespaceAuthorizationRuleArrayOutput struct{ *pulumi.OutputState }

func (EventHubNamespaceAuthorizationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventHubNamespaceAuthorizationRule)(nil)).Elem()
}

func (o EventHubNamespaceAuthorizationRuleArrayOutput) ToEventHubNamespaceAuthorizationRuleArrayOutput() EventHubNamespaceAuthorizationRuleArrayOutput {
	return o
}

func (o EventHubNamespaceAuthorizationRuleArrayOutput) ToEventHubNamespaceAuthorizationRuleArrayOutputWithContext(ctx context.Context) EventHubNamespaceAuthorizationRuleArrayOutput {
	return o
}

func (o EventHubNamespaceAuthorizationRuleArrayOutput) Index(i pulumi.IntInput) EventHubNamespaceAuthorizationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventHubNamespaceAuthorizationRule {
		return vs[0].([]*EventHubNamespaceAuthorizationRule)[vs[1].(int)]
	}).(EventHubNamespaceAuthorizationRuleOutput)
}

type EventHubNamespaceAuthorizationRuleMapOutput struct{ *pulumi.OutputState }

func (EventHubNamespaceAuthorizationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventHubNamespaceAuthorizationRule)(nil)).Elem()
}

func (o EventHubNamespaceAuthorizationRuleMapOutput) ToEventHubNamespaceAuthorizationRuleMapOutput() EventHubNamespaceAuthorizationRuleMapOutput {
	return o
}

func (o EventHubNamespaceAuthorizationRuleMapOutput) ToEventHubNamespaceAuthorizationRuleMapOutputWithContext(ctx context.Context) EventHubNamespaceAuthorizationRuleMapOutput {
	return o
}

func (o EventHubNamespaceAuthorizationRuleMapOutput) MapIndex(k pulumi.StringInput) EventHubNamespaceAuthorizationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventHubNamespaceAuthorizationRule {
		return vs[0].(map[string]*EventHubNamespaceAuthorizationRule)[vs[1].(string)]
	}).(EventHubNamespaceAuthorizationRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventHubNamespaceAuthorizationRuleInput)(nil)).Elem(), &EventHubNamespaceAuthorizationRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventHubNamespaceAuthorizationRuleArrayInput)(nil)).Elem(), EventHubNamespaceAuthorizationRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventHubNamespaceAuthorizationRuleMapInput)(nil)).Elem(), EventHubNamespaceAuthorizationRuleMap{})
	pulumi.RegisterOutputType(EventHubNamespaceAuthorizationRuleOutput{})
	pulumi.RegisterOutputType(EventHubNamespaceAuthorizationRuleArrayOutput{})
	pulumi.RegisterOutputType(EventHubNamespaceAuthorizationRuleMapOutput{})
}
