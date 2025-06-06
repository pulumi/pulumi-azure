// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package relay

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Relay Hybrid Connection Authorization Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/relay"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleNamespace, err := relay.NewNamespace(ctx, "example", &relay.NamespaceArgs{
//				Name:              pulumi.String("example-relay"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				SkuName:           pulumi.String("Standard"),
//				Tags: pulumi.StringMap{
//					"source": pulumi.String("terraform"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleHybridConnection, err := relay.NewHybridConnection(ctx, "example", &relay.HybridConnectionArgs{
//				Name:                        pulumi.String("acctestrnhc-%d"),
//				ResourceGroupName:           example.Name,
//				RelayNamespaceName:          exampleNamespace.Name,
//				RequiresClientAuthorization: pulumi.Bool(false),
//				UserMetadata:                pulumi.String("testmetadata"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = relay.NewHybridConnectionAuthorizationRule(ctx, "example", &relay.HybridConnectionAuthorizationRuleArgs{
//				Name:                 pulumi.String("example"),
//				ResourceGroupName:    example.Name,
//				HybridConnectionName: exampleHybridConnection.Name,
//				NamespaceName:        exampleNamespace.Name,
//				Listen:               pulumi.Bool(true),
//				Send:                 pulumi.Bool(true),
//				Manage:               pulumi.Bool(false),
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
// * `Microsoft.Relay`: 2021-11-01
//
// ## Import
//
// Azure Relay Hybrid Connection Authorization Rules can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:relay/hybridConnectionAuthorizationRule:HybridConnectionAuthorizationRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Relay/namespaces/namespace1/hybridConnections/connection1/authorizationRules/rule1
// ```
type HybridConnectionAuthorizationRule struct {
	pulumi.CustomResourceState

	// Name of the Azure Relay Hybrid Connection for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	HybridConnectionName pulumi.StringOutput `pulumi:"hybridConnectionName"`
	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrOutput `pulumi:"listen"`
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage pulumi.BoolPtrOutput `pulumi:"manage"`
	// The name which should be used for this Azure Relay Hybrid Connection Authorization Rule. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Name of the Azure Relay Namespace for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	NamespaceName pulumi.StringOutput `pulumi:"namespaceName"`
	// The Primary Connection String for the Azure Relay Hybrid Connection Authorization Rule.
	PrimaryConnectionString pulumi.StringOutput `pulumi:"primaryConnectionString"`
	// The Primary Key for the Azure Relay Hybrid Connection Authorization Rule.
	PrimaryKey pulumi.StringOutput `pulumi:"primaryKey"`
	// The name of the Resource Group where the Azure Relay Hybrid Connection Authorization Rule should exist. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The Secondary Connection String for the Azure Relay Hybrid Connection Authorization Rule.
	SecondaryConnectionString pulumi.StringOutput `pulumi:"secondaryConnectionString"`
	// The Secondary Key for the Azure Relay Hybrid Connection Authorization Rule.
	SecondaryKey pulumi.StringOutput `pulumi:"secondaryKey"`
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrOutput `pulumi:"send"`
}

// NewHybridConnectionAuthorizationRule registers a new resource with the given unique name, arguments, and options.
func NewHybridConnectionAuthorizationRule(ctx *pulumi.Context,
	name string, args *HybridConnectionAuthorizationRuleArgs, opts ...pulumi.ResourceOption) (*HybridConnectionAuthorizationRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HybridConnectionName == nil {
		return nil, errors.New("invalid value for required argument 'HybridConnectionName'")
	}
	if args.NamespaceName == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"primaryConnectionString",
		"primaryKey",
		"secondaryConnectionString",
		"secondaryKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HybridConnectionAuthorizationRule
	err := ctx.RegisterResource("azure:relay/hybridConnectionAuthorizationRule:HybridConnectionAuthorizationRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHybridConnectionAuthorizationRule gets an existing HybridConnectionAuthorizationRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHybridConnectionAuthorizationRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HybridConnectionAuthorizationRuleState, opts ...pulumi.ResourceOption) (*HybridConnectionAuthorizationRule, error) {
	var resource HybridConnectionAuthorizationRule
	err := ctx.ReadResource("azure:relay/hybridConnectionAuthorizationRule:HybridConnectionAuthorizationRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HybridConnectionAuthorizationRule resources.
type hybridConnectionAuthorizationRuleState struct {
	// Name of the Azure Relay Hybrid Connection for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	HybridConnectionName *string `pulumi:"hybridConnectionName"`
	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen *bool `pulumi:"listen"`
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage *bool `pulumi:"manage"`
	// The name which should be used for this Azure Relay Hybrid Connection Authorization Rule. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	Name *string `pulumi:"name"`
	// Name of the Azure Relay Namespace for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	NamespaceName *string `pulumi:"namespaceName"`
	// The Primary Connection String for the Azure Relay Hybrid Connection Authorization Rule.
	PrimaryConnectionString *string `pulumi:"primaryConnectionString"`
	// The Primary Key for the Azure Relay Hybrid Connection Authorization Rule.
	PrimaryKey *string `pulumi:"primaryKey"`
	// The name of the Resource Group where the Azure Relay Hybrid Connection Authorization Rule should exist. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The Secondary Connection String for the Azure Relay Hybrid Connection Authorization Rule.
	SecondaryConnectionString *string `pulumi:"secondaryConnectionString"`
	// The Secondary Key for the Azure Relay Hybrid Connection Authorization Rule.
	SecondaryKey *string `pulumi:"secondaryKey"`
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send *bool `pulumi:"send"`
}

type HybridConnectionAuthorizationRuleState struct {
	// Name of the Azure Relay Hybrid Connection for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	HybridConnectionName pulumi.StringPtrInput
	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrInput
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage pulumi.BoolPtrInput
	// The name which should be used for this Azure Relay Hybrid Connection Authorization Rule. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	Name pulumi.StringPtrInput
	// Name of the Azure Relay Namespace for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	NamespaceName pulumi.StringPtrInput
	// The Primary Connection String for the Azure Relay Hybrid Connection Authorization Rule.
	PrimaryConnectionString pulumi.StringPtrInput
	// The Primary Key for the Azure Relay Hybrid Connection Authorization Rule.
	PrimaryKey pulumi.StringPtrInput
	// The name of the Resource Group where the Azure Relay Hybrid Connection Authorization Rule should exist. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The Secondary Connection String for the Azure Relay Hybrid Connection Authorization Rule.
	SecondaryConnectionString pulumi.StringPtrInput
	// The Secondary Key for the Azure Relay Hybrid Connection Authorization Rule.
	SecondaryKey pulumi.StringPtrInput
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrInput
}

func (HybridConnectionAuthorizationRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*hybridConnectionAuthorizationRuleState)(nil)).Elem()
}

type hybridConnectionAuthorizationRuleArgs struct {
	// Name of the Azure Relay Hybrid Connection for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	HybridConnectionName string `pulumi:"hybridConnectionName"`
	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen *bool `pulumi:"listen"`
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage *bool `pulumi:"manage"`
	// The name which should be used for this Azure Relay Hybrid Connection Authorization Rule. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	Name *string `pulumi:"name"`
	// Name of the Azure Relay Namespace for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	NamespaceName string `pulumi:"namespaceName"`
	// The name of the Resource Group where the Azure Relay Hybrid Connection Authorization Rule should exist. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send *bool `pulumi:"send"`
}

// The set of arguments for constructing a HybridConnectionAuthorizationRule resource.
type HybridConnectionAuthorizationRuleArgs struct {
	// Name of the Azure Relay Hybrid Connection for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	HybridConnectionName pulumi.StringInput
	// Grants listen access to this Authorization Rule. Defaults to `false`.
	Listen pulumi.BoolPtrInput
	// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
	Manage pulumi.BoolPtrInput
	// The name which should be used for this Azure Relay Hybrid Connection Authorization Rule. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	Name pulumi.StringPtrInput
	// Name of the Azure Relay Namespace for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	NamespaceName pulumi.StringInput
	// The name of the Resource Group where the Azure Relay Hybrid Connection Authorization Rule should exist. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
	ResourceGroupName pulumi.StringInput
	// Grants send access to this Authorization Rule. Defaults to `false`.
	Send pulumi.BoolPtrInput
}

func (HybridConnectionAuthorizationRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hybridConnectionAuthorizationRuleArgs)(nil)).Elem()
}

type HybridConnectionAuthorizationRuleInput interface {
	pulumi.Input

	ToHybridConnectionAuthorizationRuleOutput() HybridConnectionAuthorizationRuleOutput
	ToHybridConnectionAuthorizationRuleOutputWithContext(ctx context.Context) HybridConnectionAuthorizationRuleOutput
}

func (*HybridConnectionAuthorizationRule) ElementType() reflect.Type {
	return reflect.TypeOf((**HybridConnectionAuthorizationRule)(nil)).Elem()
}

func (i *HybridConnectionAuthorizationRule) ToHybridConnectionAuthorizationRuleOutput() HybridConnectionAuthorizationRuleOutput {
	return i.ToHybridConnectionAuthorizationRuleOutputWithContext(context.Background())
}

func (i *HybridConnectionAuthorizationRule) ToHybridConnectionAuthorizationRuleOutputWithContext(ctx context.Context) HybridConnectionAuthorizationRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HybridConnectionAuthorizationRuleOutput)
}

// HybridConnectionAuthorizationRuleArrayInput is an input type that accepts HybridConnectionAuthorizationRuleArray and HybridConnectionAuthorizationRuleArrayOutput values.
// You can construct a concrete instance of `HybridConnectionAuthorizationRuleArrayInput` via:
//
//	HybridConnectionAuthorizationRuleArray{ HybridConnectionAuthorizationRuleArgs{...} }
type HybridConnectionAuthorizationRuleArrayInput interface {
	pulumi.Input

	ToHybridConnectionAuthorizationRuleArrayOutput() HybridConnectionAuthorizationRuleArrayOutput
	ToHybridConnectionAuthorizationRuleArrayOutputWithContext(context.Context) HybridConnectionAuthorizationRuleArrayOutput
}

type HybridConnectionAuthorizationRuleArray []HybridConnectionAuthorizationRuleInput

func (HybridConnectionAuthorizationRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HybridConnectionAuthorizationRule)(nil)).Elem()
}

func (i HybridConnectionAuthorizationRuleArray) ToHybridConnectionAuthorizationRuleArrayOutput() HybridConnectionAuthorizationRuleArrayOutput {
	return i.ToHybridConnectionAuthorizationRuleArrayOutputWithContext(context.Background())
}

func (i HybridConnectionAuthorizationRuleArray) ToHybridConnectionAuthorizationRuleArrayOutputWithContext(ctx context.Context) HybridConnectionAuthorizationRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HybridConnectionAuthorizationRuleArrayOutput)
}

// HybridConnectionAuthorizationRuleMapInput is an input type that accepts HybridConnectionAuthorizationRuleMap and HybridConnectionAuthorizationRuleMapOutput values.
// You can construct a concrete instance of `HybridConnectionAuthorizationRuleMapInput` via:
//
//	HybridConnectionAuthorizationRuleMap{ "key": HybridConnectionAuthorizationRuleArgs{...} }
type HybridConnectionAuthorizationRuleMapInput interface {
	pulumi.Input

	ToHybridConnectionAuthorizationRuleMapOutput() HybridConnectionAuthorizationRuleMapOutput
	ToHybridConnectionAuthorizationRuleMapOutputWithContext(context.Context) HybridConnectionAuthorizationRuleMapOutput
}

type HybridConnectionAuthorizationRuleMap map[string]HybridConnectionAuthorizationRuleInput

func (HybridConnectionAuthorizationRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HybridConnectionAuthorizationRule)(nil)).Elem()
}

func (i HybridConnectionAuthorizationRuleMap) ToHybridConnectionAuthorizationRuleMapOutput() HybridConnectionAuthorizationRuleMapOutput {
	return i.ToHybridConnectionAuthorizationRuleMapOutputWithContext(context.Background())
}

func (i HybridConnectionAuthorizationRuleMap) ToHybridConnectionAuthorizationRuleMapOutputWithContext(ctx context.Context) HybridConnectionAuthorizationRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HybridConnectionAuthorizationRuleMapOutput)
}

type HybridConnectionAuthorizationRuleOutput struct{ *pulumi.OutputState }

func (HybridConnectionAuthorizationRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HybridConnectionAuthorizationRule)(nil)).Elem()
}

func (o HybridConnectionAuthorizationRuleOutput) ToHybridConnectionAuthorizationRuleOutput() HybridConnectionAuthorizationRuleOutput {
	return o
}

func (o HybridConnectionAuthorizationRuleOutput) ToHybridConnectionAuthorizationRuleOutputWithContext(ctx context.Context) HybridConnectionAuthorizationRuleOutput {
	return o
}

// Name of the Azure Relay Hybrid Connection for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
func (o HybridConnectionAuthorizationRuleOutput) HybridConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.StringOutput { return v.HybridConnectionName }).(pulumi.StringOutput)
}

// Grants listen access to this Authorization Rule. Defaults to `false`.
func (o HybridConnectionAuthorizationRuleOutput) Listen() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.BoolPtrOutput { return v.Listen }).(pulumi.BoolPtrOutput)
}

// Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
func (o HybridConnectionAuthorizationRuleOutput) Manage() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.BoolPtrOutput { return v.Manage }).(pulumi.BoolPtrOutput)
}

// The name which should be used for this Azure Relay Hybrid Connection Authorization Rule. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
func (o HybridConnectionAuthorizationRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Name of the Azure Relay Namespace for which this Azure Relay Hybrid Connection Authorization Rule will be created. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
func (o HybridConnectionAuthorizationRuleOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.StringOutput { return v.NamespaceName }).(pulumi.StringOutput)
}

// The Primary Connection String for the Azure Relay Hybrid Connection Authorization Rule.
func (o HybridConnectionAuthorizationRuleOutput) PrimaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.StringOutput { return v.PrimaryConnectionString }).(pulumi.StringOutput)
}

// The Primary Key for the Azure Relay Hybrid Connection Authorization Rule.
func (o HybridConnectionAuthorizationRuleOutput) PrimaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.StringOutput { return v.PrimaryKey }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Azure Relay Hybrid Connection Authorization Rule should exist. Changing this forces a new Azure Relay Hybrid Connection Authorization Rule to be created.
func (o HybridConnectionAuthorizationRuleOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The Secondary Connection String for the Azure Relay Hybrid Connection Authorization Rule.
func (o HybridConnectionAuthorizationRuleOutput) SecondaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.StringOutput { return v.SecondaryConnectionString }).(pulumi.StringOutput)
}

// The Secondary Key for the Azure Relay Hybrid Connection Authorization Rule.
func (o HybridConnectionAuthorizationRuleOutput) SecondaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.StringOutput { return v.SecondaryKey }).(pulumi.StringOutput)
}

// Grants send access to this Authorization Rule. Defaults to `false`.
func (o HybridConnectionAuthorizationRuleOutput) Send() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *HybridConnectionAuthorizationRule) pulumi.BoolPtrOutput { return v.Send }).(pulumi.BoolPtrOutput)
}

type HybridConnectionAuthorizationRuleArrayOutput struct{ *pulumi.OutputState }

func (HybridConnectionAuthorizationRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HybridConnectionAuthorizationRule)(nil)).Elem()
}

func (o HybridConnectionAuthorizationRuleArrayOutput) ToHybridConnectionAuthorizationRuleArrayOutput() HybridConnectionAuthorizationRuleArrayOutput {
	return o
}

func (o HybridConnectionAuthorizationRuleArrayOutput) ToHybridConnectionAuthorizationRuleArrayOutputWithContext(ctx context.Context) HybridConnectionAuthorizationRuleArrayOutput {
	return o
}

func (o HybridConnectionAuthorizationRuleArrayOutput) Index(i pulumi.IntInput) HybridConnectionAuthorizationRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HybridConnectionAuthorizationRule {
		return vs[0].([]*HybridConnectionAuthorizationRule)[vs[1].(int)]
	}).(HybridConnectionAuthorizationRuleOutput)
}

type HybridConnectionAuthorizationRuleMapOutput struct{ *pulumi.OutputState }

func (HybridConnectionAuthorizationRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HybridConnectionAuthorizationRule)(nil)).Elem()
}

func (o HybridConnectionAuthorizationRuleMapOutput) ToHybridConnectionAuthorizationRuleMapOutput() HybridConnectionAuthorizationRuleMapOutput {
	return o
}

func (o HybridConnectionAuthorizationRuleMapOutput) ToHybridConnectionAuthorizationRuleMapOutputWithContext(ctx context.Context) HybridConnectionAuthorizationRuleMapOutput {
	return o
}

func (o HybridConnectionAuthorizationRuleMapOutput) MapIndex(k pulumi.StringInput) HybridConnectionAuthorizationRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HybridConnectionAuthorizationRule {
		return vs[0].(map[string]*HybridConnectionAuthorizationRule)[vs[1].(string)]
	}).(HybridConnectionAuthorizationRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HybridConnectionAuthorizationRuleInput)(nil)).Elem(), &HybridConnectionAuthorizationRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*HybridConnectionAuthorizationRuleArrayInput)(nil)).Elem(), HybridConnectionAuthorizationRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HybridConnectionAuthorizationRuleMapInput)(nil)).Elem(), HybridConnectionAuthorizationRuleMap{})
	pulumi.RegisterOutputType(HybridConnectionAuthorizationRuleOutput{})
	pulumi.RegisterOutputType(HybridConnectionAuthorizationRuleArrayOutput{})
	pulumi.RegisterOutputType(HybridConnectionAuthorizationRuleMapOutput{})
}
