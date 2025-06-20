// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicebus

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Disaster Recovery Config for a Service Bus Namespace.
//
// > **Note:** Disaster Recovery Config is a Premium SKU only capability.
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
//				Name:     pulumi.String("servicebus-replication"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			primary, err := servicebus.NewNamespace(ctx, "primary", &servicebus.NamespaceArgs{
//				Name:              pulumi.String("servicebus-primary"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("Premium"),
//				Capacity:          pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			secondary, err := servicebus.NewNamespace(ctx, "secondary", &servicebus.NamespaceArgs{
//				Name:              pulumi.String("servicebus-secondary"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("Premium"),
//				Capacity:          pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			exampleNamespaceAuthorizationRule, err := servicebus.NewNamespaceAuthorizationRule(ctx, "example", &servicebus.NamespaceAuthorizationRuleArgs{
//				Name:        pulumi.String("examplerule"),
//				NamespaceId: pulumi.Any(exampleAzurermServicebusNamespace.Id),
//				Listen:      pulumi.Bool(true),
//				Send:        pulumi.Bool(true),
//				Manage:      pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = servicebus.NewNamespaceDisasterRecoveryConfig(ctx, "example", &servicebus.NamespaceDisasterRecoveryConfigArgs{
//				Name:                     pulumi.String("servicebus-alias-name"),
//				PrimaryNamespaceId:       primary.ID(),
//				PartnerNamespaceId:       secondary.ID(),
//				AliasAuthorizationRuleId: exampleNamespaceAuthorizationRule.ID(),
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
// Service Bus DR configs can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:servicebus/namespaceDisasterRecoveryConfig:NamespaceDisasterRecoveryConfig config1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ServiceBus/namespaces/namespace1/disasterRecoveryConfigs/config1
// ```
type NamespaceDisasterRecoveryConfig struct {
	pulumi.CustomResourceState

	// The Shared access policies used to access the connection string for the alias.
	AliasAuthorizationRuleId pulumi.StringPtrOutput `pulumi:"aliasAuthorizationRuleId"`
	// The primary access key for the authorization rule `RootManageSharedAccessKey`.
	DefaultPrimaryKey pulumi.StringOutput `pulumi:"defaultPrimaryKey"`
	// The secondary access key for the authorization rule `RootManageSharedAccessKey`.
	DefaultSecondaryKey pulumi.StringOutput `pulumi:"defaultSecondaryKey"`
	// Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Service Bus Namespace to replicate to.
	PartnerNamespaceId pulumi.StringOutput `pulumi:"partnerNamespaceId"`
	// The alias Primary Connection String for the ServiceBus Namespace.
	PrimaryConnectionStringAlias pulumi.StringOutput `pulumi:"primaryConnectionStringAlias"`
	// The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
	PrimaryNamespaceId pulumi.StringOutput `pulumi:"primaryNamespaceId"`
	// The alias Secondary Connection String for the ServiceBus Namespace
	SecondaryConnectionStringAlias pulumi.StringOutput `pulumi:"secondaryConnectionStringAlias"`
}

// NewNamespaceDisasterRecoveryConfig registers a new resource with the given unique name, arguments, and options.
func NewNamespaceDisasterRecoveryConfig(ctx *pulumi.Context,
	name string, args *NamespaceDisasterRecoveryConfigArgs, opts ...pulumi.ResourceOption) (*NamespaceDisasterRecoveryConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PartnerNamespaceId == nil {
		return nil, errors.New("invalid value for required argument 'PartnerNamespaceId'")
	}
	if args.PrimaryNamespaceId == nil {
		return nil, errors.New("invalid value for required argument 'PrimaryNamespaceId'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"defaultPrimaryKey",
		"defaultSecondaryKey",
		"primaryConnectionStringAlias",
		"secondaryConnectionStringAlias",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NamespaceDisasterRecoveryConfig
	err := ctx.RegisterResource("azure:servicebus/namespaceDisasterRecoveryConfig:NamespaceDisasterRecoveryConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNamespaceDisasterRecoveryConfig gets an existing NamespaceDisasterRecoveryConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNamespaceDisasterRecoveryConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NamespaceDisasterRecoveryConfigState, opts ...pulumi.ResourceOption) (*NamespaceDisasterRecoveryConfig, error) {
	var resource NamespaceDisasterRecoveryConfig
	err := ctx.ReadResource("azure:servicebus/namespaceDisasterRecoveryConfig:NamespaceDisasterRecoveryConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NamespaceDisasterRecoveryConfig resources.
type namespaceDisasterRecoveryConfigState struct {
	// The Shared access policies used to access the connection string for the alias.
	AliasAuthorizationRuleId *string `pulumi:"aliasAuthorizationRuleId"`
	// The primary access key for the authorization rule `RootManageSharedAccessKey`.
	DefaultPrimaryKey *string `pulumi:"defaultPrimaryKey"`
	// The secondary access key for the authorization rule `RootManageSharedAccessKey`.
	DefaultSecondaryKey *string `pulumi:"defaultSecondaryKey"`
	// Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Service Bus Namespace to replicate to.
	PartnerNamespaceId *string `pulumi:"partnerNamespaceId"`
	// The alias Primary Connection String for the ServiceBus Namespace.
	PrimaryConnectionStringAlias *string `pulumi:"primaryConnectionStringAlias"`
	// The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
	PrimaryNamespaceId *string `pulumi:"primaryNamespaceId"`
	// The alias Secondary Connection String for the ServiceBus Namespace
	SecondaryConnectionStringAlias *string `pulumi:"secondaryConnectionStringAlias"`
}

type NamespaceDisasterRecoveryConfigState struct {
	// The Shared access policies used to access the connection string for the alias.
	AliasAuthorizationRuleId pulumi.StringPtrInput
	// The primary access key for the authorization rule `RootManageSharedAccessKey`.
	DefaultPrimaryKey pulumi.StringPtrInput
	// The secondary access key for the authorization rule `RootManageSharedAccessKey`.
	DefaultSecondaryKey pulumi.StringPtrInput
	// Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Service Bus Namespace to replicate to.
	PartnerNamespaceId pulumi.StringPtrInput
	// The alias Primary Connection String for the ServiceBus Namespace.
	PrimaryConnectionStringAlias pulumi.StringPtrInput
	// The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
	PrimaryNamespaceId pulumi.StringPtrInput
	// The alias Secondary Connection String for the ServiceBus Namespace
	SecondaryConnectionStringAlias pulumi.StringPtrInput
}

func (NamespaceDisasterRecoveryConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceDisasterRecoveryConfigState)(nil)).Elem()
}

type namespaceDisasterRecoveryConfigArgs struct {
	// The Shared access policies used to access the connection string for the alias.
	AliasAuthorizationRuleId *string `pulumi:"aliasAuthorizationRuleId"`
	// Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Service Bus Namespace to replicate to.
	PartnerNamespaceId string `pulumi:"partnerNamespaceId"`
	// The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
	PrimaryNamespaceId string `pulumi:"primaryNamespaceId"`
}

// The set of arguments for constructing a NamespaceDisasterRecoveryConfig resource.
type NamespaceDisasterRecoveryConfigArgs struct {
	// The Shared access policies used to access the connection string for the alias.
	AliasAuthorizationRuleId pulumi.StringPtrInput
	// Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Service Bus Namespace to replicate to.
	PartnerNamespaceId pulumi.StringInput
	// The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
	PrimaryNamespaceId pulumi.StringInput
}

func (NamespaceDisasterRecoveryConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceDisasterRecoveryConfigArgs)(nil)).Elem()
}

type NamespaceDisasterRecoveryConfigInput interface {
	pulumi.Input

	ToNamespaceDisasterRecoveryConfigOutput() NamespaceDisasterRecoveryConfigOutput
	ToNamespaceDisasterRecoveryConfigOutputWithContext(ctx context.Context) NamespaceDisasterRecoveryConfigOutput
}

func (*NamespaceDisasterRecoveryConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**NamespaceDisasterRecoveryConfig)(nil)).Elem()
}

func (i *NamespaceDisasterRecoveryConfig) ToNamespaceDisasterRecoveryConfigOutput() NamespaceDisasterRecoveryConfigOutput {
	return i.ToNamespaceDisasterRecoveryConfigOutputWithContext(context.Background())
}

func (i *NamespaceDisasterRecoveryConfig) ToNamespaceDisasterRecoveryConfigOutputWithContext(ctx context.Context) NamespaceDisasterRecoveryConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceDisasterRecoveryConfigOutput)
}

// NamespaceDisasterRecoveryConfigArrayInput is an input type that accepts NamespaceDisasterRecoveryConfigArray and NamespaceDisasterRecoveryConfigArrayOutput values.
// You can construct a concrete instance of `NamespaceDisasterRecoveryConfigArrayInput` via:
//
//	NamespaceDisasterRecoveryConfigArray{ NamespaceDisasterRecoveryConfigArgs{...} }
type NamespaceDisasterRecoveryConfigArrayInput interface {
	pulumi.Input

	ToNamespaceDisasterRecoveryConfigArrayOutput() NamespaceDisasterRecoveryConfigArrayOutput
	ToNamespaceDisasterRecoveryConfigArrayOutputWithContext(context.Context) NamespaceDisasterRecoveryConfigArrayOutput
}

type NamespaceDisasterRecoveryConfigArray []NamespaceDisasterRecoveryConfigInput

func (NamespaceDisasterRecoveryConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NamespaceDisasterRecoveryConfig)(nil)).Elem()
}

func (i NamespaceDisasterRecoveryConfigArray) ToNamespaceDisasterRecoveryConfigArrayOutput() NamespaceDisasterRecoveryConfigArrayOutput {
	return i.ToNamespaceDisasterRecoveryConfigArrayOutputWithContext(context.Background())
}

func (i NamespaceDisasterRecoveryConfigArray) ToNamespaceDisasterRecoveryConfigArrayOutputWithContext(ctx context.Context) NamespaceDisasterRecoveryConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceDisasterRecoveryConfigArrayOutput)
}

// NamespaceDisasterRecoveryConfigMapInput is an input type that accepts NamespaceDisasterRecoveryConfigMap and NamespaceDisasterRecoveryConfigMapOutput values.
// You can construct a concrete instance of `NamespaceDisasterRecoveryConfigMapInput` via:
//
//	NamespaceDisasterRecoveryConfigMap{ "key": NamespaceDisasterRecoveryConfigArgs{...} }
type NamespaceDisasterRecoveryConfigMapInput interface {
	pulumi.Input

	ToNamespaceDisasterRecoveryConfigMapOutput() NamespaceDisasterRecoveryConfigMapOutput
	ToNamespaceDisasterRecoveryConfigMapOutputWithContext(context.Context) NamespaceDisasterRecoveryConfigMapOutput
}

type NamespaceDisasterRecoveryConfigMap map[string]NamespaceDisasterRecoveryConfigInput

func (NamespaceDisasterRecoveryConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NamespaceDisasterRecoveryConfig)(nil)).Elem()
}

func (i NamespaceDisasterRecoveryConfigMap) ToNamespaceDisasterRecoveryConfigMapOutput() NamespaceDisasterRecoveryConfigMapOutput {
	return i.ToNamespaceDisasterRecoveryConfigMapOutputWithContext(context.Background())
}

func (i NamespaceDisasterRecoveryConfigMap) ToNamespaceDisasterRecoveryConfigMapOutputWithContext(ctx context.Context) NamespaceDisasterRecoveryConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceDisasterRecoveryConfigMapOutput)
}

type NamespaceDisasterRecoveryConfigOutput struct{ *pulumi.OutputState }

func (NamespaceDisasterRecoveryConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NamespaceDisasterRecoveryConfig)(nil)).Elem()
}

func (o NamespaceDisasterRecoveryConfigOutput) ToNamespaceDisasterRecoveryConfigOutput() NamespaceDisasterRecoveryConfigOutput {
	return o
}

func (o NamespaceDisasterRecoveryConfigOutput) ToNamespaceDisasterRecoveryConfigOutputWithContext(ctx context.Context) NamespaceDisasterRecoveryConfigOutput {
	return o
}

// The Shared access policies used to access the connection string for the alias.
func (o NamespaceDisasterRecoveryConfigOutput) AliasAuthorizationRuleId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NamespaceDisasterRecoveryConfig) pulumi.StringPtrOutput { return v.AliasAuthorizationRuleId }).(pulumi.StringPtrOutput)
}

// The primary access key for the authorization rule `RootManageSharedAccessKey`.
func (o NamespaceDisasterRecoveryConfigOutput) DefaultPrimaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceDisasterRecoveryConfig) pulumi.StringOutput { return v.DefaultPrimaryKey }).(pulumi.StringOutput)
}

// The secondary access key for the authorization rule `RootManageSharedAccessKey`.
func (o NamespaceDisasterRecoveryConfigOutput) DefaultSecondaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceDisasterRecoveryConfig) pulumi.StringOutput { return v.DefaultSecondaryKey }).(pulumi.StringOutput)
}

// Specifies the name of the Disaster Recovery Config. This is the alias DNS name that will be created. Changing this forces a new resource to be created.
func (o NamespaceDisasterRecoveryConfigOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceDisasterRecoveryConfig) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the Service Bus Namespace to replicate to.
func (o NamespaceDisasterRecoveryConfigOutput) PartnerNamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceDisasterRecoveryConfig) pulumi.StringOutput { return v.PartnerNamespaceId }).(pulumi.StringOutput)
}

// The alias Primary Connection String for the ServiceBus Namespace.
func (o NamespaceDisasterRecoveryConfigOutput) PrimaryConnectionStringAlias() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceDisasterRecoveryConfig) pulumi.StringOutput { return v.PrimaryConnectionStringAlias }).(pulumi.StringOutput)
}

// The ID of the primary Service Bus Namespace to replicate. Changing this forces a new resource to be created.
func (o NamespaceDisasterRecoveryConfigOutput) PrimaryNamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceDisasterRecoveryConfig) pulumi.StringOutput { return v.PrimaryNamespaceId }).(pulumi.StringOutput)
}

// The alias Secondary Connection String for the ServiceBus Namespace
func (o NamespaceDisasterRecoveryConfigOutput) SecondaryConnectionStringAlias() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceDisasterRecoveryConfig) pulumi.StringOutput { return v.SecondaryConnectionStringAlias }).(pulumi.StringOutput)
}

type NamespaceDisasterRecoveryConfigArrayOutput struct{ *pulumi.OutputState }

func (NamespaceDisasterRecoveryConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NamespaceDisasterRecoveryConfig)(nil)).Elem()
}

func (o NamespaceDisasterRecoveryConfigArrayOutput) ToNamespaceDisasterRecoveryConfigArrayOutput() NamespaceDisasterRecoveryConfigArrayOutput {
	return o
}

func (o NamespaceDisasterRecoveryConfigArrayOutput) ToNamespaceDisasterRecoveryConfigArrayOutputWithContext(ctx context.Context) NamespaceDisasterRecoveryConfigArrayOutput {
	return o
}

func (o NamespaceDisasterRecoveryConfigArrayOutput) Index(i pulumi.IntInput) NamespaceDisasterRecoveryConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NamespaceDisasterRecoveryConfig {
		return vs[0].([]*NamespaceDisasterRecoveryConfig)[vs[1].(int)]
	}).(NamespaceDisasterRecoveryConfigOutput)
}

type NamespaceDisasterRecoveryConfigMapOutput struct{ *pulumi.OutputState }

func (NamespaceDisasterRecoveryConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NamespaceDisasterRecoveryConfig)(nil)).Elem()
}

func (o NamespaceDisasterRecoveryConfigMapOutput) ToNamespaceDisasterRecoveryConfigMapOutput() NamespaceDisasterRecoveryConfigMapOutput {
	return o
}

func (o NamespaceDisasterRecoveryConfigMapOutput) ToNamespaceDisasterRecoveryConfigMapOutputWithContext(ctx context.Context) NamespaceDisasterRecoveryConfigMapOutput {
	return o
}

func (o NamespaceDisasterRecoveryConfigMapOutput) MapIndex(k pulumi.StringInput) NamespaceDisasterRecoveryConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NamespaceDisasterRecoveryConfig {
		return vs[0].(map[string]*NamespaceDisasterRecoveryConfig)[vs[1].(string)]
	}).(NamespaceDisasterRecoveryConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceDisasterRecoveryConfigInput)(nil)).Elem(), &NamespaceDisasterRecoveryConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceDisasterRecoveryConfigArrayInput)(nil)).Elem(), NamespaceDisasterRecoveryConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceDisasterRecoveryConfigMapInput)(nil)).Elem(), NamespaceDisasterRecoveryConfigMap{})
	pulumi.RegisterOutputType(NamespaceDisasterRecoveryConfigOutput{})
	pulumi.RegisterOutputType(NamespaceDisasterRecoveryConfigArrayOutput{})
	pulumi.RegisterOutputType(NamespaceDisasterRecoveryConfigMapOutput{})
}
