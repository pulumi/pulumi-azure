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

// Manages a ServiceBus Subscription.
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
//				Name:     pulumi.String("tfex-servicebus-subscription"),
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
//				Name:                pulumi.String("tfex_servicebus_topic"),
//				NamespaceId:         exampleNamespace.ID(),
//				PartitioningEnabled: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = servicebus.NewSubscription(ctx, "example", &servicebus.SubscriptionArgs{
//				Name:             pulumi.String("tfex_servicebus_subscription"),
//				TopicId:          exampleTopic.ID(),
//				MaxDeliveryCount: pulumi.Int(1),
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
// Service Bus Subscriptions can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:eventhub/subscription:Subscription example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ServiceBus/namespaces/sbns1/topics/sntopic1/subscriptions/sbsub1
// ```
//
// Deprecated: azure.eventhub.Subscription has been deprecated in favor of azure.servicebus.Subscription
type Subscription struct {
	pulumi.CustomResourceState

	// The idle interval after which the topic is automatically deleted as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The minimum duration is `5` minutes or `PT5M`. Defaults to `P10675199DT2H48M5.4775807S`.
	AutoDeleteOnIdle pulumi.StringPtrOutput `pulumi:"autoDeleteOnIdle"`
	// Boolean flag which controls whether the Subscription supports batched operations.
	BatchedOperationsEnabled pulumi.BoolPtrOutput `pulumi:"batchedOperationsEnabled"`
	// A `clientScopedSubscription` block as defined below.
	ClientScopedSubscription SubscriptionClientScopedSubscriptionPtrOutput `pulumi:"clientScopedSubscription"`
	// whether the subscription is scoped to a client id. Defaults to `false`.
	//
	// > **Note:** Client Scoped Subscription can only be used for JMS subscription (Java Message Service).
	ClientScopedSubscriptionEnabled pulumi.BoolPtrOutput `pulumi:"clientScopedSubscriptionEnabled"`
	// Boolean flag which controls whether the Subscription has dead letter support on filter evaluation exceptions. Defaults to `true`.
	DeadLetteringOnFilterEvaluationError pulumi.BoolPtrOutput `pulumi:"deadLetteringOnFilterEvaluationError"`
	// Boolean flag which controls whether the Subscription has dead letter support when a message expires.
	DeadLetteringOnMessageExpiration pulumi.BoolPtrOutput `pulumi:"deadLetteringOnMessageExpiration"`
	// The Default message timespan to live as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the value used when TimeToLive is not set on a message itself. Defaults to `P10675199DT2H48M5.4775807S`.
	DefaultMessageTtl pulumi.StringPtrOutput `pulumi:"defaultMessageTtl"`
	// The name of a Queue or Topic to automatically forward Dead Letter messages to.
	ForwardDeadLetteredMessagesTo pulumi.StringPtrOutput `pulumi:"forwardDeadLetteredMessagesTo"`
	// The name of a Queue or Topic to automatically forward messages to.
	ForwardTo pulumi.StringPtrOutput `pulumi:"forwardTo"`
	// The lock duration for the subscription as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The default value is `1` minute or `P0DT0H1M0S` . The maximum value is `5` minutes or `P0DT0H5M0S` . Defaults to `PT1M`.
	LockDuration pulumi.StringPtrOutput `pulumi:"lockDuration"`
	// The maximum number of deliveries.
	MaxDeliveryCount pulumi.IntOutput `pulumi:"maxDeliveryCount"`
	// Specifies the name of the ServiceBus Subscription resource. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Boolean flag which controls whether this Subscription supports the concept of a session. Changing this forces a new resource to be created.
	RequiresSession pulumi.BoolPtrOutput `pulumi:"requiresSession"`
	// The status of the Subscription. Possible values are `Active`,`ReceiveDisabled`, or `Disabled`. Defaults to `Active`.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// The ID of the ServiceBus Topic to create this Subscription in. Changing this forces a new resource to be created.
	TopicId pulumi.StringOutput `pulumi:"topicId"`
}

// NewSubscription registers a new resource with the given unique name, arguments, and options.
func NewSubscription(ctx *pulumi.Context,
	name string, args *SubscriptionArgs, opts ...pulumi.ResourceOption) (*Subscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MaxDeliveryCount == nil {
		return nil, errors.New("invalid value for required argument 'MaxDeliveryCount'")
	}
	if args.TopicId == nil {
		return nil, errors.New("invalid value for required argument 'TopicId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Subscription
	err := ctx.RegisterResource("azure:eventhub/subscription:Subscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubscription gets an existing Subscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubscriptionState, opts ...pulumi.ResourceOption) (*Subscription, error) {
	var resource Subscription
	err := ctx.ReadResource("azure:eventhub/subscription:Subscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Subscription resources.
type subscriptionState struct {
	// The idle interval after which the topic is automatically deleted as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The minimum duration is `5` minutes or `PT5M`. Defaults to `P10675199DT2H48M5.4775807S`.
	AutoDeleteOnIdle *string `pulumi:"autoDeleteOnIdle"`
	// Boolean flag which controls whether the Subscription supports batched operations.
	BatchedOperationsEnabled *bool `pulumi:"batchedOperationsEnabled"`
	// A `clientScopedSubscription` block as defined below.
	ClientScopedSubscription *SubscriptionClientScopedSubscription `pulumi:"clientScopedSubscription"`
	// whether the subscription is scoped to a client id. Defaults to `false`.
	//
	// > **Note:** Client Scoped Subscription can only be used for JMS subscription (Java Message Service).
	ClientScopedSubscriptionEnabled *bool `pulumi:"clientScopedSubscriptionEnabled"`
	// Boolean flag which controls whether the Subscription has dead letter support on filter evaluation exceptions. Defaults to `true`.
	DeadLetteringOnFilterEvaluationError *bool `pulumi:"deadLetteringOnFilterEvaluationError"`
	// Boolean flag which controls whether the Subscription has dead letter support when a message expires.
	DeadLetteringOnMessageExpiration *bool `pulumi:"deadLetteringOnMessageExpiration"`
	// The Default message timespan to live as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the value used when TimeToLive is not set on a message itself. Defaults to `P10675199DT2H48M5.4775807S`.
	DefaultMessageTtl *string `pulumi:"defaultMessageTtl"`
	// The name of a Queue or Topic to automatically forward Dead Letter messages to.
	ForwardDeadLetteredMessagesTo *string `pulumi:"forwardDeadLetteredMessagesTo"`
	// The name of a Queue or Topic to automatically forward messages to.
	ForwardTo *string `pulumi:"forwardTo"`
	// The lock duration for the subscription as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The default value is `1` minute or `P0DT0H1M0S` . The maximum value is `5` minutes or `P0DT0H5M0S` . Defaults to `PT1M`.
	LockDuration *string `pulumi:"lockDuration"`
	// The maximum number of deliveries.
	MaxDeliveryCount *int `pulumi:"maxDeliveryCount"`
	// Specifies the name of the ServiceBus Subscription resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Boolean flag which controls whether this Subscription supports the concept of a session. Changing this forces a new resource to be created.
	RequiresSession *bool `pulumi:"requiresSession"`
	// The status of the Subscription. Possible values are `Active`,`ReceiveDisabled`, or `Disabled`. Defaults to `Active`.
	Status *string `pulumi:"status"`
	// The ID of the ServiceBus Topic to create this Subscription in. Changing this forces a new resource to be created.
	TopicId *string `pulumi:"topicId"`
}

type SubscriptionState struct {
	// The idle interval after which the topic is automatically deleted as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The minimum duration is `5` minutes or `PT5M`. Defaults to `P10675199DT2H48M5.4775807S`.
	AutoDeleteOnIdle pulumi.StringPtrInput
	// Boolean flag which controls whether the Subscription supports batched operations.
	BatchedOperationsEnabled pulumi.BoolPtrInput
	// A `clientScopedSubscription` block as defined below.
	ClientScopedSubscription SubscriptionClientScopedSubscriptionPtrInput
	// whether the subscription is scoped to a client id. Defaults to `false`.
	//
	// > **Note:** Client Scoped Subscription can only be used for JMS subscription (Java Message Service).
	ClientScopedSubscriptionEnabled pulumi.BoolPtrInput
	// Boolean flag which controls whether the Subscription has dead letter support on filter evaluation exceptions. Defaults to `true`.
	DeadLetteringOnFilterEvaluationError pulumi.BoolPtrInput
	// Boolean flag which controls whether the Subscription has dead letter support when a message expires.
	DeadLetteringOnMessageExpiration pulumi.BoolPtrInput
	// The Default message timespan to live as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the value used when TimeToLive is not set on a message itself. Defaults to `P10675199DT2H48M5.4775807S`.
	DefaultMessageTtl pulumi.StringPtrInput
	// The name of a Queue or Topic to automatically forward Dead Letter messages to.
	ForwardDeadLetteredMessagesTo pulumi.StringPtrInput
	// The name of a Queue or Topic to automatically forward messages to.
	ForwardTo pulumi.StringPtrInput
	// The lock duration for the subscription as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The default value is `1` minute or `P0DT0H1M0S` . The maximum value is `5` minutes or `P0DT0H5M0S` . Defaults to `PT1M`.
	LockDuration pulumi.StringPtrInput
	// The maximum number of deliveries.
	MaxDeliveryCount pulumi.IntPtrInput
	// Specifies the name of the ServiceBus Subscription resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Boolean flag which controls whether this Subscription supports the concept of a session. Changing this forces a new resource to be created.
	RequiresSession pulumi.BoolPtrInput
	// The status of the Subscription. Possible values are `Active`,`ReceiveDisabled`, or `Disabled`. Defaults to `Active`.
	Status pulumi.StringPtrInput
	// The ID of the ServiceBus Topic to create this Subscription in. Changing this forces a new resource to be created.
	TopicId pulumi.StringPtrInput
}

func (SubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionState)(nil)).Elem()
}

type subscriptionArgs struct {
	// The idle interval after which the topic is automatically deleted as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The minimum duration is `5` minutes or `PT5M`. Defaults to `P10675199DT2H48M5.4775807S`.
	AutoDeleteOnIdle *string `pulumi:"autoDeleteOnIdle"`
	// Boolean flag which controls whether the Subscription supports batched operations.
	BatchedOperationsEnabled *bool `pulumi:"batchedOperationsEnabled"`
	// A `clientScopedSubscription` block as defined below.
	ClientScopedSubscription *SubscriptionClientScopedSubscription `pulumi:"clientScopedSubscription"`
	// whether the subscription is scoped to a client id. Defaults to `false`.
	//
	// > **Note:** Client Scoped Subscription can only be used for JMS subscription (Java Message Service).
	ClientScopedSubscriptionEnabled *bool `pulumi:"clientScopedSubscriptionEnabled"`
	// Boolean flag which controls whether the Subscription has dead letter support on filter evaluation exceptions. Defaults to `true`.
	DeadLetteringOnFilterEvaluationError *bool `pulumi:"deadLetteringOnFilterEvaluationError"`
	// Boolean flag which controls whether the Subscription has dead letter support when a message expires.
	DeadLetteringOnMessageExpiration *bool `pulumi:"deadLetteringOnMessageExpiration"`
	// The Default message timespan to live as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the value used when TimeToLive is not set on a message itself. Defaults to `P10675199DT2H48M5.4775807S`.
	DefaultMessageTtl *string `pulumi:"defaultMessageTtl"`
	// The name of a Queue or Topic to automatically forward Dead Letter messages to.
	ForwardDeadLetteredMessagesTo *string `pulumi:"forwardDeadLetteredMessagesTo"`
	// The name of a Queue or Topic to automatically forward messages to.
	ForwardTo *string `pulumi:"forwardTo"`
	// The lock duration for the subscription as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The default value is `1` minute or `P0DT0H1M0S` . The maximum value is `5` minutes or `P0DT0H5M0S` . Defaults to `PT1M`.
	LockDuration *string `pulumi:"lockDuration"`
	// The maximum number of deliveries.
	MaxDeliveryCount int `pulumi:"maxDeliveryCount"`
	// Specifies the name of the ServiceBus Subscription resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Boolean flag which controls whether this Subscription supports the concept of a session. Changing this forces a new resource to be created.
	RequiresSession *bool `pulumi:"requiresSession"`
	// The status of the Subscription. Possible values are `Active`,`ReceiveDisabled`, or `Disabled`. Defaults to `Active`.
	Status *string `pulumi:"status"`
	// The ID of the ServiceBus Topic to create this Subscription in. Changing this forces a new resource to be created.
	TopicId string `pulumi:"topicId"`
}

// The set of arguments for constructing a Subscription resource.
type SubscriptionArgs struct {
	// The idle interval after which the topic is automatically deleted as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The minimum duration is `5` minutes or `PT5M`. Defaults to `P10675199DT2H48M5.4775807S`.
	AutoDeleteOnIdle pulumi.StringPtrInput
	// Boolean flag which controls whether the Subscription supports batched operations.
	BatchedOperationsEnabled pulumi.BoolPtrInput
	// A `clientScopedSubscription` block as defined below.
	ClientScopedSubscription SubscriptionClientScopedSubscriptionPtrInput
	// whether the subscription is scoped to a client id. Defaults to `false`.
	//
	// > **Note:** Client Scoped Subscription can only be used for JMS subscription (Java Message Service).
	ClientScopedSubscriptionEnabled pulumi.BoolPtrInput
	// Boolean flag which controls whether the Subscription has dead letter support on filter evaluation exceptions. Defaults to `true`.
	DeadLetteringOnFilterEvaluationError pulumi.BoolPtrInput
	// Boolean flag which controls whether the Subscription has dead letter support when a message expires.
	DeadLetteringOnMessageExpiration pulumi.BoolPtrInput
	// The Default message timespan to live as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the value used when TimeToLive is not set on a message itself. Defaults to `P10675199DT2H48M5.4775807S`.
	DefaultMessageTtl pulumi.StringPtrInput
	// The name of a Queue or Topic to automatically forward Dead Letter messages to.
	ForwardDeadLetteredMessagesTo pulumi.StringPtrInput
	// The name of a Queue or Topic to automatically forward messages to.
	ForwardTo pulumi.StringPtrInput
	// The lock duration for the subscription as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The default value is `1` minute or `P0DT0H1M0S` . The maximum value is `5` minutes or `P0DT0H5M0S` . Defaults to `PT1M`.
	LockDuration pulumi.StringPtrInput
	// The maximum number of deliveries.
	MaxDeliveryCount pulumi.IntInput
	// Specifies the name of the ServiceBus Subscription resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Boolean flag which controls whether this Subscription supports the concept of a session. Changing this forces a new resource to be created.
	RequiresSession pulumi.BoolPtrInput
	// The status of the Subscription. Possible values are `Active`,`ReceiveDisabled`, or `Disabled`. Defaults to `Active`.
	Status pulumi.StringPtrInput
	// The ID of the ServiceBus Topic to create this Subscription in. Changing this forces a new resource to be created.
	TopicId pulumi.StringInput
}

func (SubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionArgs)(nil)).Elem()
}

type SubscriptionInput interface {
	pulumi.Input

	ToSubscriptionOutput() SubscriptionOutput
	ToSubscriptionOutputWithContext(ctx context.Context) SubscriptionOutput
}

func (*Subscription) ElementType() reflect.Type {
	return reflect.TypeOf((**Subscription)(nil)).Elem()
}

func (i *Subscription) ToSubscriptionOutput() SubscriptionOutput {
	return i.ToSubscriptionOutputWithContext(context.Background())
}

func (i *Subscription) ToSubscriptionOutputWithContext(ctx context.Context) SubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionOutput)
}

// SubscriptionArrayInput is an input type that accepts SubscriptionArray and SubscriptionArrayOutput values.
// You can construct a concrete instance of `SubscriptionArrayInput` via:
//
//	SubscriptionArray{ SubscriptionArgs{...} }
type SubscriptionArrayInput interface {
	pulumi.Input

	ToSubscriptionArrayOutput() SubscriptionArrayOutput
	ToSubscriptionArrayOutputWithContext(context.Context) SubscriptionArrayOutput
}

type SubscriptionArray []SubscriptionInput

func (SubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subscription)(nil)).Elem()
}

func (i SubscriptionArray) ToSubscriptionArrayOutput() SubscriptionArrayOutput {
	return i.ToSubscriptionArrayOutputWithContext(context.Background())
}

func (i SubscriptionArray) ToSubscriptionArrayOutputWithContext(ctx context.Context) SubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionArrayOutput)
}

// SubscriptionMapInput is an input type that accepts SubscriptionMap and SubscriptionMapOutput values.
// You can construct a concrete instance of `SubscriptionMapInput` via:
//
//	SubscriptionMap{ "key": SubscriptionArgs{...} }
type SubscriptionMapInput interface {
	pulumi.Input

	ToSubscriptionMapOutput() SubscriptionMapOutput
	ToSubscriptionMapOutputWithContext(context.Context) SubscriptionMapOutput
}

type SubscriptionMap map[string]SubscriptionInput

func (SubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subscription)(nil)).Elem()
}

func (i SubscriptionMap) ToSubscriptionMapOutput() SubscriptionMapOutput {
	return i.ToSubscriptionMapOutputWithContext(context.Background())
}

func (i SubscriptionMap) ToSubscriptionMapOutputWithContext(ctx context.Context) SubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionMapOutput)
}

type SubscriptionOutput struct{ *pulumi.OutputState }

func (SubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Subscription)(nil)).Elem()
}

func (o SubscriptionOutput) ToSubscriptionOutput() SubscriptionOutput {
	return o
}

func (o SubscriptionOutput) ToSubscriptionOutputWithContext(ctx context.Context) SubscriptionOutput {
	return o
}

// The idle interval after which the topic is automatically deleted as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The minimum duration is `5` minutes or `PT5M`. Defaults to `P10675199DT2H48M5.4775807S`.
func (o SubscriptionOutput) AutoDeleteOnIdle() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringPtrOutput { return v.AutoDeleteOnIdle }).(pulumi.StringPtrOutput)
}

// Boolean flag which controls whether the Subscription supports batched operations.
func (o SubscriptionOutput) BatchedOperationsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.BoolPtrOutput { return v.BatchedOperationsEnabled }).(pulumi.BoolPtrOutput)
}

// A `clientScopedSubscription` block as defined below.
func (o SubscriptionOutput) ClientScopedSubscription() SubscriptionClientScopedSubscriptionPtrOutput {
	return o.ApplyT(func(v *Subscription) SubscriptionClientScopedSubscriptionPtrOutput { return v.ClientScopedSubscription }).(SubscriptionClientScopedSubscriptionPtrOutput)
}

// whether the subscription is scoped to a client id. Defaults to `false`.
//
// > **Note:** Client Scoped Subscription can only be used for JMS subscription (Java Message Service).
func (o SubscriptionOutput) ClientScopedSubscriptionEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.BoolPtrOutput { return v.ClientScopedSubscriptionEnabled }).(pulumi.BoolPtrOutput)
}

// Boolean flag which controls whether the Subscription has dead letter support on filter evaluation exceptions. Defaults to `true`.
func (o SubscriptionOutput) DeadLetteringOnFilterEvaluationError() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.BoolPtrOutput { return v.DeadLetteringOnFilterEvaluationError }).(pulumi.BoolPtrOutput)
}

// Boolean flag which controls whether the Subscription has dead letter support when a message expires.
func (o SubscriptionOutput) DeadLetteringOnMessageExpiration() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.BoolPtrOutput { return v.DeadLetteringOnMessageExpiration }).(pulumi.BoolPtrOutput)
}

// The Default message timespan to live as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the value used when TimeToLive is not set on a message itself. Defaults to `P10675199DT2H48M5.4775807S`.
func (o SubscriptionOutput) DefaultMessageTtl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringPtrOutput { return v.DefaultMessageTtl }).(pulumi.StringPtrOutput)
}

// The name of a Queue or Topic to automatically forward Dead Letter messages to.
func (o SubscriptionOutput) ForwardDeadLetteredMessagesTo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringPtrOutput { return v.ForwardDeadLetteredMessagesTo }).(pulumi.StringPtrOutput)
}

// The name of a Queue or Topic to automatically forward messages to.
func (o SubscriptionOutput) ForwardTo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringPtrOutput { return v.ForwardTo }).(pulumi.StringPtrOutput)
}

// The lock duration for the subscription as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The default value is `1` minute or `P0DT0H1M0S` . The maximum value is `5` minutes or `P0DT0H5M0S` . Defaults to `PT1M`.
func (o SubscriptionOutput) LockDuration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringPtrOutput { return v.LockDuration }).(pulumi.StringPtrOutput)
}

// The maximum number of deliveries.
func (o SubscriptionOutput) MaxDeliveryCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Subscription) pulumi.IntOutput { return v.MaxDeliveryCount }).(pulumi.IntOutput)
}

// Specifies the name of the ServiceBus Subscription resource. Changing this forces a new resource to be created.
func (o SubscriptionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Boolean flag which controls whether this Subscription supports the concept of a session. Changing this forces a new resource to be created.
func (o SubscriptionOutput) RequiresSession() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.BoolPtrOutput { return v.RequiresSession }).(pulumi.BoolPtrOutput)
}

// The status of the Subscription. Possible values are `Active`,`ReceiveDisabled`, or `Disabled`. Defaults to `Active`.
func (o SubscriptionOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// The ID of the ServiceBus Topic to create this Subscription in. Changing this forces a new resource to be created.
func (o SubscriptionOutput) TopicId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.TopicId }).(pulumi.StringOutput)
}

type SubscriptionArrayOutput struct{ *pulumi.OutputState }

func (SubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subscription)(nil)).Elem()
}

func (o SubscriptionArrayOutput) ToSubscriptionArrayOutput() SubscriptionArrayOutput {
	return o
}

func (o SubscriptionArrayOutput) ToSubscriptionArrayOutputWithContext(ctx context.Context) SubscriptionArrayOutput {
	return o
}

func (o SubscriptionArrayOutput) Index(i pulumi.IntInput) SubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Subscription {
		return vs[0].([]*Subscription)[vs[1].(int)]
	}).(SubscriptionOutput)
}

type SubscriptionMapOutput struct{ *pulumi.OutputState }

func (SubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subscription)(nil)).Elem()
}

func (o SubscriptionMapOutput) ToSubscriptionMapOutput() SubscriptionMapOutput {
	return o
}

func (o SubscriptionMapOutput) ToSubscriptionMapOutputWithContext(ctx context.Context) SubscriptionMapOutput {
	return o
}

func (o SubscriptionMapOutput) MapIndex(k pulumi.StringInput) SubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Subscription {
		return vs[0].(map[string]*Subscription)[vs[1].(string)]
	}).(SubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionInput)(nil)).Elem(), &Subscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionArrayInput)(nil)).Elem(), SubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionMapInput)(nil)).Elem(), SubscriptionMap{})
	pulumi.RegisterOutputType(SubscriptionOutput{})
	pulumi.RegisterOutputType(SubscriptionArrayOutput{})
	pulumi.RegisterOutputType(SubscriptionMapOutput{})
}
