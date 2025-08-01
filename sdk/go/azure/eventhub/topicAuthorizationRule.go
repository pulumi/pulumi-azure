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

// Manages a ServiceBus Topic authorization Rule within a ServiceBus Topic.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/servicebus"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("tfex-servicebus"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleNamespace, err := servicebus.NewNamespace(ctx, "example", &servicebus.NamespaceArgs{
//				Name:              pulumi.String("tfex-servicebus-namespace"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("Standard"),
//				Tags: pulumi.StringMap{
//					"source": pulumi.String("example"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleTopic, err := servicebus.NewTopic(ctx, "example", &servicebus.TopicArgs{
//				Name:        pulumi.String("tfex_servicebus_topic"),
//				NamespaceId: exampleNamespace.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = servicebus.NewTopicAuthorizationRule(ctx, "example", &servicebus.TopicAuthorizationRuleArgs{
//				Name:    pulumi.String("tfex_servicebus_topic_sasPolicy"),
//				TopicId: exampleTopic.ID(),
//				Listen:  pulumi.Bool(true),
//				Send:    pulumi.Bool(false),
//				Manage:  pulumi.Bool(false),
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
// * `Microsoft.ServiceBus`: 2021-06-01-preview
//
// ## Import
//
// ServiceBus Topic authorization rules can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:eventhub/topicAuthorizationRule:TopicAuthorizationRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ServiceBus/namespaces/namespace1/topics/topic1/authorizationRules/rule1
// ```
//
// Deprecated: azure.eventhub.TopicAuthorizationRule has been deprecated in favor of azure.servicebus.TopicAuthorizationRule
type TopicAuthorizationRule struct {
	pulumi.CustomResourceState

	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrOutput `pulumi:"listen"`
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage pulumi.BoolPtrOutput `pulumi:"manage"`
	// Specifies the name of the ServiceBus Topic Authorization Rule resource. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Primary Connection String for the ServiceBus Topic authorization Rule.
	PrimaryConnectionString pulumi.StringOutput `pulumi:"primaryConnectionString"`
	// The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
	PrimaryConnectionStringAlias pulumi.StringOutput `pulumi:"primaryConnectionStringAlias"`
	// The Primary Key for the ServiceBus Topic authorization Rule.
	PrimaryKey pulumi.StringOutput `pulumi:"primaryKey"`
	// The Secondary Connection String for the ServiceBus Topic authorization Rule.
	SecondaryConnectionString pulumi.StringOutput `pulumi:"secondaryConnectionString"`
	// The alias Secondary Connection String for the ServiceBus Namespace
	SecondaryConnectionStringAlias pulumi.StringOutput `pulumi:"secondaryConnectionStringAlias"`
	// The Secondary Key for the ServiceBus Topic authorization Rule.
	SecondaryKey pulumi.StringOutput `pulumi:"secondaryKey"`
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrOutput `pulumi:"send"`
	// Specifies the ID of the ServiceBus Topic. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	TopicId pulumi.StringOutput `pulumi:"topicId"`
}

// NewTopicAuthorizationRule registers a new resource with the given unique name, arguments, and options.
func NewTopicAuthorizationRule(ctx *pulumi.Context,
	name string, args *TopicAuthorizationRuleArgs, opts ...pulumi.ResourceOption) (*TopicAuthorizationRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TopicId == nil {
		return nil, errors.New("invalid value for required argument 'TopicId'")
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
	var resource TopicAuthorizationRule
	err := ctx.RegisterResource("azure:eventhub/topicAuthorizationRule:TopicAuthorizationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTopicAuthorizationRule gets an existing TopicAuthorizationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTopicAuthorizationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TopicAuthorizationRuleState, opts ...pulumi.ResourceOption) (*TopicAuthorizationRule, error) {
	var resource TopicAuthorizationRule
	err := ctx.ReadResource("azure:eventhub/topicAuthorizationRule:TopicAuthorizationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TopicAuthorizationRule resources.
type topicAuthorizationRuleState struct {
	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen *bool `pulumi:"listen"`
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage *bool `pulumi:"manage"`
	// Specifies the name of the ServiceBus Topic Authorization Rule resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The Primary Connection String for the ServiceBus Topic authorization Rule.
	PrimaryConnectionString *string `pulumi:"primaryConnectionString"`
	// The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
	PrimaryConnectionStringAlias *string `pulumi:"primaryConnectionStringAlias"`
	// The Primary Key for the ServiceBus Topic authorization Rule.
	PrimaryKey *string `pulumi:"primaryKey"`
	// The Secondary Connection String for the ServiceBus Topic authorization Rule.
	SecondaryConnectionString *string `pulumi:"secondaryConnectionString"`
	// The alias Secondary Connection String for the ServiceBus Namespace
	SecondaryConnectionStringAlias *string `pulumi:"secondaryConnectionStringAlias"`
	// The Secondary Key for the ServiceBus Topic authorization Rule.
	SecondaryKey *string `pulumi:"secondaryKey"`
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send *bool `pulumi:"send"`
	// Specifies the ID of the ServiceBus Topic. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	TopicId *string `pulumi:"topicId"`
}

type TopicAuthorizationRuleState struct {
	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrInput
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage pulumi.BoolPtrInput
	// Specifies the name of the ServiceBus Topic Authorization Rule resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The Primary Connection String for the ServiceBus Topic authorization Rule.
	PrimaryConnectionString pulumi.StringPtrInput
	// The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
	PrimaryConnectionStringAlias pulumi.StringPtrInput
	// The Primary Key for the ServiceBus Topic authorization Rule.
	PrimaryKey pulumi.StringPtrInput
	// The Secondary Connection String for the ServiceBus Topic authorization Rule.
	SecondaryConnectionString pulumi.StringPtrInput
	// The alias Secondary Connection String for the ServiceBus Namespace
	SecondaryConnectionStringAlias pulumi.StringPtrInput
	// The Secondary Key for the ServiceBus Topic authorization Rule.
	SecondaryKey pulumi.StringPtrInput
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrInput
	// Specifies the ID of the ServiceBus Topic. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	TopicId pulumi.StringPtrInput
}

func (TopicAuthorizationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*topicAuthorizationRuleState)(nil)).Elem()
}

type topicAuthorizationRuleArgs struct {
	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen *bool `pulumi:"listen"`
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage *bool `pulumi:"manage"`
	// Specifies the name of the ServiceBus Topic Authorization Rule resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send *bool `pulumi:"send"`
	// Specifies the ID of the ServiceBus Topic. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	TopicId string `pulumi:"topicId"`
}

// The set of arguments for constructing a TopicAuthorizationRule resource.
type TopicAuthorizationRuleArgs struct {
	// Grants listen access to this this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrInput
	// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
	Manage pulumi.BoolPtrInput
	// Specifies the name of the ServiceBus Topic Authorization Rule resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Grants send access to this this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrInput
	// Specifies the ID of the ServiceBus Topic. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one of the 3 permissions below needs to be set.
	TopicId pulumi.StringInput
}

func (TopicAuthorizationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*topicAuthorizationRuleArgs)(nil)).Elem()
}

type TopicAuthorizationRuleInput interface {
	pulumi.Input

	ToTopicAuthorizationRuleOutput() TopicAuthorizationRuleOutput
	ToTopicAuthorizationRuleOutputWithContext(ctx context.Context) TopicAuthorizationRuleOutput
}

func (*TopicAuthorizationRule) ElementType() reflect.Type {
	return reflect.TypeOf((**TopicAuthorizationRule)(nil)).Elem()
}

func (i *TopicAuthorizationRule) ToTopicAuthorizationRuleOutput() TopicAuthorizationRuleOutput {
	return i.ToTopicAuthorizationRuleOutputWithContext(context.Background())
}

func (i *TopicAuthorizationRule) ToTopicAuthorizationRuleOutputWithContext(ctx context.Context) TopicAuthorizationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicAuthorizationRuleOutput)
}

// TopicAuthorizationRuleArrayInput is an input type that accepts TopicAuthorizationRuleArray and TopicAuthorizationRuleArrayOutput values.
// You can construct a concrete instance of `TopicAuthorizationRuleArrayInput` via:
//
//	TopicAuthorizationRuleArray{ TopicAuthorizationRuleArgs{...} }
type TopicAuthorizationRuleArrayInput interface {
	pulumi.Input

	ToTopicAuthorizationRuleArrayOutput() TopicAuthorizationRuleArrayOutput
	ToTopicAuthorizationRuleArrayOutputWithContext(context.Context) TopicAuthorizationRuleArrayOutput
}

type TopicAuthorizationRuleArray []TopicAuthorizationRuleInput

func (TopicAuthorizationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TopicAuthorizationRule)(nil)).Elem()
}

func (i TopicAuthorizationRuleArray) ToTopicAuthorizationRuleArrayOutput() TopicAuthorizationRuleArrayOutput {
	return i.ToTopicAuthorizationRuleArrayOutputWithContext(context.Background())
}

func (i TopicAuthorizationRuleArray) ToTopicAuthorizationRuleArrayOutputWithContext(ctx context.Context) TopicAuthorizationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicAuthorizationRuleArrayOutput)
}

// TopicAuthorizationRuleMapInput is an input type that accepts TopicAuthorizationRuleMap and TopicAuthorizationRuleMapOutput values.
// You can construct a concrete instance of `TopicAuthorizationRuleMapInput` via:
//
//	TopicAuthorizationRuleMap{ "key": TopicAuthorizationRuleArgs{...} }
type TopicAuthorizationRuleMapInput interface {
	pulumi.Input

	ToTopicAuthorizationRuleMapOutput() TopicAuthorizationRuleMapOutput
	ToTopicAuthorizationRuleMapOutputWithContext(context.Context) TopicAuthorizationRuleMapOutput
}

type TopicAuthorizationRuleMap map[string]TopicAuthorizationRuleInput

func (TopicAuthorizationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TopicAuthorizationRule)(nil)).Elem()
}

func (i TopicAuthorizationRuleMap) ToTopicAuthorizationRuleMapOutput() TopicAuthorizationRuleMapOutput {
	return i.ToTopicAuthorizationRuleMapOutputWithContext(context.Background())
}

func (i TopicAuthorizationRuleMap) ToTopicAuthorizationRuleMapOutputWithContext(ctx context.Context) TopicAuthorizationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicAuthorizationRuleMapOutput)
}

type TopicAuthorizationRuleOutput struct{ *pulumi.OutputState }

func (TopicAuthorizationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TopicAuthorizationRule)(nil)).Elem()
}

func (o TopicAuthorizationRuleOutput) ToTopicAuthorizationRuleOutput() TopicAuthorizationRuleOutput {
	return o
}

func (o TopicAuthorizationRuleOutput) ToTopicAuthorizationRuleOutputWithContext(ctx context.Context) TopicAuthorizationRuleOutput {
	return o
}

// Grants listen access to this this Authorization Rule. Defaults to `false`.
func (o TopicAuthorizationRuleOutput) Listen() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.BoolPtrOutput { return v.Listen }).(pulumi.BoolPtrOutput)
}

// Grants manage access to this this Authorization Rule. When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
func (o TopicAuthorizationRuleOutput) Manage() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.BoolPtrOutput { return v.Manage }).(pulumi.BoolPtrOutput)
}

// Specifies the name of the ServiceBus Topic Authorization Rule resource. Changing this forces a new resource to be created.
func (o TopicAuthorizationRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Primary Connection String for the ServiceBus Topic authorization Rule.
func (o TopicAuthorizationRuleOutput) PrimaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.StringOutput { return v.PrimaryConnectionString }).(pulumi.StringOutput)
}

// The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
func (o TopicAuthorizationRuleOutput) PrimaryConnectionStringAlias() pulumi.StringOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.StringOutput { return v.PrimaryConnectionStringAlias }).(pulumi.StringOutput)
}

// The Primary Key for the ServiceBus Topic authorization Rule.
func (o TopicAuthorizationRuleOutput) PrimaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.StringOutput { return v.PrimaryKey }).(pulumi.StringOutput)
}

// The Secondary Connection String for the ServiceBus Topic authorization Rule.
func (o TopicAuthorizationRuleOutput) SecondaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.StringOutput { return v.SecondaryConnectionString }).(pulumi.StringOutput)
}

// The alias Secondary Connection String for the ServiceBus Namespace
func (o TopicAuthorizationRuleOutput) SecondaryConnectionStringAlias() pulumi.StringOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.StringOutput { return v.SecondaryConnectionStringAlias }).(pulumi.StringOutput)
}

// The Secondary Key for the ServiceBus Topic authorization Rule.
func (o TopicAuthorizationRuleOutput) SecondaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.StringOutput { return v.SecondaryKey }).(pulumi.StringOutput)
}

// Grants send access to this this Authorization Rule. Defaults to `false`.
func (o TopicAuthorizationRuleOutput) Send() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.BoolPtrOutput { return v.Send }).(pulumi.BoolPtrOutput)
}

// Specifies the ID of the ServiceBus Topic. Changing this forces a new resource to be created.
//
// > **Note:** At least one of the 3 permissions below needs to be set.
func (o TopicAuthorizationRuleOutput) TopicId() pulumi.StringOutput {
	return o.ApplyT(func(v *TopicAuthorizationRule) pulumi.StringOutput { return v.TopicId }).(pulumi.StringOutput)
}

type TopicAuthorizationRuleArrayOutput struct{ *pulumi.OutputState }

func (TopicAuthorizationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TopicAuthorizationRule)(nil)).Elem()
}

func (o TopicAuthorizationRuleArrayOutput) ToTopicAuthorizationRuleArrayOutput() TopicAuthorizationRuleArrayOutput {
	return o
}

func (o TopicAuthorizationRuleArrayOutput) ToTopicAuthorizationRuleArrayOutputWithContext(ctx context.Context) TopicAuthorizationRuleArrayOutput {
	return o
}

func (o TopicAuthorizationRuleArrayOutput) Index(i pulumi.IntInput) TopicAuthorizationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TopicAuthorizationRule {
		return vs[0].([]*TopicAuthorizationRule)[vs[1].(int)]
	}).(TopicAuthorizationRuleOutput)
}

type TopicAuthorizationRuleMapOutput struct{ *pulumi.OutputState }

func (TopicAuthorizationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TopicAuthorizationRule)(nil)).Elem()
}

func (o TopicAuthorizationRuleMapOutput) ToTopicAuthorizationRuleMapOutput() TopicAuthorizationRuleMapOutput {
	return o
}

func (o TopicAuthorizationRuleMapOutput) ToTopicAuthorizationRuleMapOutputWithContext(ctx context.Context) TopicAuthorizationRuleMapOutput {
	return o
}

func (o TopicAuthorizationRuleMapOutput) MapIndex(k pulumi.StringInput) TopicAuthorizationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TopicAuthorizationRule {
		return vs[0].(map[string]*TopicAuthorizationRule)[vs[1].(string)]
	}).(TopicAuthorizationRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TopicAuthorizationRuleInput)(nil)).Elem(), &TopicAuthorizationRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*TopicAuthorizationRuleArrayInput)(nil)).Elem(), TopicAuthorizationRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TopicAuthorizationRuleMapInput)(nil)).Elem(), TopicAuthorizationRuleMap{})
	pulumi.RegisterOutputType(TopicAuthorizationRuleOutput{})
	pulumi.RegisterOutputType(TopicAuthorizationRuleArrayOutput{})
	pulumi.RegisterOutputType(TopicAuthorizationRuleMapOutput{})
}
