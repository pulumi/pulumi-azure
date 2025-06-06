// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package paloalto

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Palo Alto Next Generation Firewall VHub Local Rulestack.
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
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/paloalto"
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
//			examplePublicIp, err := network.NewPublicIp(ctx, "example", &network.PublicIpArgs{
//				Name:              pulumi.String("acceptanceTestPublicIp1"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				AllocationMethod:  pulumi.String("Static"),
//				Tags: pulumi.StringMap{
//					"environment": pulumi.String("Production"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualWan, err := network.NewVirtualWan(ctx, "example", &network.VirtualWanArgs{
//				Name:              pulumi.String("example-virtualwan"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualHub, err := network.NewVirtualHub(ctx, "example", &network.VirtualHubArgs{
//				Name:              pulumi.String("example-virtualhub"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				VirtualWanId:      exampleVirtualWan.ID(),
//				AddressPrefix:     pulumi.String("10.0.0.0/23"),
//				Tags: pulumi.StringMap{
//					"hubSaaSPreview": pulumi.String("true"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetworkAppliance, err := paloalto.NewVirtualNetworkAppliance(ctx, "example", &paloalto.VirtualNetworkApplianceArgs{
//				Name:         pulumi.String("example-appliance"),
//				VirtualHubId: exampleVirtualHub.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = paloalto.NewNextGenerationFirewallVirtualHubLocalRulestack(ctx, "example", &paloalto.NextGenerationFirewallVirtualHubLocalRulestackArgs{
//				Name:              pulumi.String("example-ngfwvn"),
//				ResourceGroupName: example.Name,
//				RulestackId:       pulumi.Any(exampleAzurermPaloAltoLocalRulestack.Id),
//				NetworkProfile: &paloalto.NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileArgs{
//					PublicIpAddressIds: pulumi.StringArray{
//						examplePublicIp.ID(),
//					},
//					VirtualHubId:              exampleVirtualHub.ID(),
//					NetworkVirtualApplianceId: exampleVirtualNetworkAppliance.ID(),
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
// * `PaloAltoNetworks.Cloudngfw`: 2023-09-01, 2022-08-29
//
// ## Import
//
// Palo Alto Next Generation Firewall VHub Local Rulestacks can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:paloalto/nextGenerationFirewallVirtualHubLocalRulestack:NextGenerationFirewallVirtualHubLocalRulestack example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVhubRulestackFW
// ```
type NextGenerationFirewallVirtualHubLocalRulestack struct {
	pulumi.CustomResourceState

	// One or more `destinationNat` blocks as defined below.
	DestinationNats NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArrayOutput `pulumi:"destinationNats"`
	// A `dnsSettings` block as defined below.
	DnsSettings NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsPtrOutput `pulumi:"dnsSettings"`
	// The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
	MarketplaceOfferId pulumi.StringPtrOutput `pulumi:"marketplaceOfferId"`
	// The name which should be used for this Palo Alto Next Generation Firewall VHub Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A `networkProfile` block as defined below.
	NetworkProfile NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileOutput `pulumi:"networkProfile"`
	// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
	//
	// > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
	PlanId pulumi.StringPtrOutput `pulumi:"planId"`
	// The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The ID of the Local Rulestack to be used for this Next Generation Firewall.
	RulestackId pulumi.StringOutput `pulumi:"rulestackId"`
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Local Rulestack.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewNextGenerationFirewallVirtualHubLocalRulestack registers a new resource with the given unique name, arguments, and options.
func NewNextGenerationFirewallVirtualHubLocalRulestack(ctx *pulumi.Context,
	name string, args *NextGenerationFirewallVirtualHubLocalRulestackArgs, opts ...pulumi.ResourceOption) (*NextGenerationFirewallVirtualHubLocalRulestack, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkProfile == nil {
		return nil, errors.New("invalid value for required argument 'NetworkProfile'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.RulestackId == nil {
		return nil, errors.New("invalid value for required argument 'RulestackId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NextGenerationFirewallVirtualHubLocalRulestack
	err := ctx.RegisterResource("azure:paloalto/nextGenerationFirewallVirtualHubLocalRulestack:NextGenerationFirewallVirtualHubLocalRulestack", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNextGenerationFirewallVirtualHubLocalRulestack gets an existing NextGenerationFirewallVirtualHubLocalRulestack resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNextGenerationFirewallVirtualHubLocalRulestack(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NextGenerationFirewallVirtualHubLocalRulestackState, opts ...pulumi.ResourceOption) (*NextGenerationFirewallVirtualHubLocalRulestack, error) {
	var resource NextGenerationFirewallVirtualHubLocalRulestack
	err := ctx.ReadResource("azure:paloalto/nextGenerationFirewallVirtualHubLocalRulestack:NextGenerationFirewallVirtualHubLocalRulestack", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NextGenerationFirewallVirtualHubLocalRulestack resources.
type nextGenerationFirewallVirtualHubLocalRulestackState struct {
	// One or more `destinationNat` blocks as defined below.
	DestinationNats []NextGenerationFirewallVirtualHubLocalRulestackDestinationNat `pulumi:"destinationNats"`
	// A `dnsSettings` block as defined below.
	DnsSettings *NextGenerationFirewallVirtualHubLocalRulestackDnsSettings `pulumi:"dnsSettings"`
	// The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
	MarketplaceOfferId *string `pulumi:"marketplaceOfferId"`
	// The name which should be used for this Palo Alto Next Generation Firewall VHub Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	Name *string `pulumi:"name"`
	// A `networkProfile` block as defined below.
	NetworkProfile *NextGenerationFirewallVirtualHubLocalRulestackNetworkProfile `pulumi:"networkProfile"`
	// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
	//
	// > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
	PlanId *string `pulumi:"planId"`
	// The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The ID of the Local Rulestack to be used for this Next Generation Firewall.
	RulestackId *string `pulumi:"rulestackId"`
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Local Rulestack.
	Tags map[string]string `pulumi:"tags"`
}

type NextGenerationFirewallVirtualHubLocalRulestackState struct {
	// One or more `destinationNat` blocks as defined below.
	DestinationNats NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArrayInput
	// A `dnsSettings` block as defined below.
	DnsSettings NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsPtrInput
	// The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
	MarketplaceOfferId pulumi.StringPtrInput
	// The name which should be used for this Palo Alto Next Generation Firewall VHub Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	Name pulumi.StringPtrInput
	// A `networkProfile` block as defined below.
	NetworkProfile NextGenerationFirewallVirtualHubLocalRulestackNetworkProfilePtrInput
	// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
	//
	// > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
	PlanId pulumi.StringPtrInput
	// The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The ID of the Local Rulestack to be used for this Next Generation Firewall.
	RulestackId pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Local Rulestack.
	Tags pulumi.StringMapInput
}

func (NextGenerationFirewallVirtualHubLocalRulestackState) ElementType() reflect.Type {
	return reflect.TypeOf((*nextGenerationFirewallVirtualHubLocalRulestackState)(nil)).Elem()
}

type nextGenerationFirewallVirtualHubLocalRulestackArgs struct {
	// One or more `destinationNat` blocks as defined below.
	DestinationNats []NextGenerationFirewallVirtualHubLocalRulestackDestinationNat `pulumi:"destinationNats"`
	// A `dnsSettings` block as defined below.
	DnsSettings *NextGenerationFirewallVirtualHubLocalRulestackDnsSettings `pulumi:"dnsSettings"`
	// The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
	MarketplaceOfferId *string `pulumi:"marketplaceOfferId"`
	// The name which should be used for this Palo Alto Next Generation Firewall VHub Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	Name *string `pulumi:"name"`
	// A `networkProfile` block as defined below.
	NetworkProfile NextGenerationFirewallVirtualHubLocalRulestackNetworkProfile `pulumi:"networkProfile"`
	// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
	//
	// > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
	PlanId *string `pulumi:"planId"`
	// The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The ID of the Local Rulestack to be used for this Next Generation Firewall.
	RulestackId string `pulumi:"rulestackId"`
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Local Rulestack.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a NextGenerationFirewallVirtualHubLocalRulestack resource.
type NextGenerationFirewallVirtualHubLocalRulestackArgs struct {
	// One or more `destinationNat` blocks as defined below.
	DestinationNats NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArrayInput
	// A `dnsSettings` block as defined below.
	DnsSettings NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsPtrInput
	// The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
	MarketplaceOfferId pulumi.StringPtrInput
	// The name which should be used for this Palo Alto Next Generation Firewall VHub Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	Name pulumi.StringPtrInput
	// A `networkProfile` block as defined below.
	NetworkProfile NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileInput
	// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
	//
	// > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
	PlanId pulumi.StringPtrInput
	// The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
	ResourceGroupName pulumi.StringInput
	// The ID of the Local Rulestack to be used for this Next Generation Firewall.
	RulestackId pulumi.StringInput
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Local Rulestack.
	Tags pulumi.StringMapInput
}

func (NextGenerationFirewallVirtualHubLocalRulestackArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nextGenerationFirewallVirtualHubLocalRulestackArgs)(nil)).Elem()
}

type NextGenerationFirewallVirtualHubLocalRulestackInput interface {
	pulumi.Input

	ToNextGenerationFirewallVirtualHubLocalRulestackOutput() NextGenerationFirewallVirtualHubLocalRulestackOutput
	ToNextGenerationFirewallVirtualHubLocalRulestackOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubLocalRulestackOutput
}

func (*NextGenerationFirewallVirtualHubLocalRulestack) ElementType() reflect.Type {
	return reflect.TypeOf((**NextGenerationFirewallVirtualHubLocalRulestack)(nil)).Elem()
}

func (i *NextGenerationFirewallVirtualHubLocalRulestack) ToNextGenerationFirewallVirtualHubLocalRulestackOutput() NextGenerationFirewallVirtualHubLocalRulestackOutput {
	return i.ToNextGenerationFirewallVirtualHubLocalRulestackOutputWithContext(context.Background())
}

func (i *NextGenerationFirewallVirtualHubLocalRulestack) ToNextGenerationFirewallVirtualHubLocalRulestackOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubLocalRulestackOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NextGenerationFirewallVirtualHubLocalRulestackOutput)
}

// NextGenerationFirewallVirtualHubLocalRulestackArrayInput is an input type that accepts NextGenerationFirewallVirtualHubLocalRulestackArray and NextGenerationFirewallVirtualHubLocalRulestackArrayOutput values.
// You can construct a concrete instance of `NextGenerationFirewallVirtualHubLocalRulestackArrayInput` via:
//
//	NextGenerationFirewallVirtualHubLocalRulestackArray{ NextGenerationFirewallVirtualHubLocalRulestackArgs{...} }
type NextGenerationFirewallVirtualHubLocalRulestackArrayInput interface {
	pulumi.Input

	ToNextGenerationFirewallVirtualHubLocalRulestackArrayOutput() NextGenerationFirewallVirtualHubLocalRulestackArrayOutput
	ToNextGenerationFirewallVirtualHubLocalRulestackArrayOutputWithContext(context.Context) NextGenerationFirewallVirtualHubLocalRulestackArrayOutput
}

type NextGenerationFirewallVirtualHubLocalRulestackArray []NextGenerationFirewallVirtualHubLocalRulestackInput

func (NextGenerationFirewallVirtualHubLocalRulestackArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NextGenerationFirewallVirtualHubLocalRulestack)(nil)).Elem()
}

func (i NextGenerationFirewallVirtualHubLocalRulestackArray) ToNextGenerationFirewallVirtualHubLocalRulestackArrayOutput() NextGenerationFirewallVirtualHubLocalRulestackArrayOutput {
	return i.ToNextGenerationFirewallVirtualHubLocalRulestackArrayOutputWithContext(context.Background())
}

func (i NextGenerationFirewallVirtualHubLocalRulestackArray) ToNextGenerationFirewallVirtualHubLocalRulestackArrayOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubLocalRulestackArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NextGenerationFirewallVirtualHubLocalRulestackArrayOutput)
}

// NextGenerationFirewallVirtualHubLocalRulestackMapInput is an input type that accepts NextGenerationFirewallVirtualHubLocalRulestackMap and NextGenerationFirewallVirtualHubLocalRulestackMapOutput values.
// You can construct a concrete instance of `NextGenerationFirewallVirtualHubLocalRulestackMapInput` via:
//
//	NextGenerationFirewallVirtualHubLocalRulestackMap{ "key": NextGenerationFirewallVirtualHubLocalRulestackArgs{...} }
type NextGenerationFirewallVirtualHubLocalRulestackMapInput interface {
	pulumi.Input

	ToNextGenerationFirewallVirtualHubLocalRulestackMapOutput() NextGenerationFirewallVirtualHubLocalRulestackMapOutput
	ToNextGenerationFirewallVirtualHubLocalRulestackMapOutputWithContext(context.Context) NextGenerationFirewallVirtualHubLocalRulestackMapOutput
}

type NextGenerationFirewallVirtualHubLocalRulestackMap map[string]NextGenerationFirewallVirtualHubLocalRulestackInput

func (NextGenerationFirewallVirtualHubLocalRulestackMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NextGenerationFirewallVirtualHubLocalRulestack)(nil)).Elem()
}

func (i NextGenerationFirewallVirtualHubLocalRulestackMap) ToNextGenerationFirewallVirtualHubLocalRulestackMapOutput() NextGenerationFirewallVirtualHubLocalRulestackMapOutput {
	return i.ToNextGenerationFirewallVirtualHubLocalRulestackMapOutputWithContext(context.Background())
}

func (i NextGenerationFirewallVirtualHubLocalRulestackMap) ToNextGenerationFirewallVirtualHubLocalRulestackMapOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubLocalRulestackMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NextGenerationFirewallVirtualHubLocalRulestackMapOutput)
}

type NextGenerationFirewallVirtualHubLocalRulestackOutput struct{ *pulumi.OutputState }

func (NextGenerationFirewallVirtualHubLocalRulestackOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NextGenerationFirewallVirtualHubLocalRulestack)(nil)).Elem()
}

func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) ToNextGenerationFirewallVirtualHubLocalRulestackOutput() NextGenerationFirewallVirtualHubLocalRulestackOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) ToNextGenerationFirewallVirtualHubLocalRulestackOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubLocalRulestackOutput {
	return o
}

// One or more `destinationNat` blocks as defined below.
func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) DestinationNats() NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArrayOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubLocalRulestack) NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArrayOutput {
		return v.DestinationNats
	}).(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatArrayOutput)
}

// A `dnsSettings` block as defined below.
func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) DnsSettings() NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsPtrOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubLocalRulestack) NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsPtrOutput {
		return v.DnsSettings
	}).(NextGenerationFirewallVirtualHubLocalRulestackDnsSettingsPtrOutput)
}

// The marketplace offer ID. Defaults to `panSwfwCloudNgfw`. Changing this forces a new resource to be created.
func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) MarketplaceOfferId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubLocalRulestack) pulumi.StringPtrOutput {
		return v.MarketplaceOfferId
	}).(pulumi.StringPtrOutput)
}

// The name which should be used for this Palo Alto Next Generation Firewall VHub Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubLocalRulestack) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A `networkProfile` block as defined below.
func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) NetworkProfile() NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubLocalRulestack) NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileOutput {
		return v.NetworkProfile
	}).(NextGenerationFirewallVirtualHubLocalRulestackNetworkProfileOutput)
}

// The billing plan ID as published by Liftr.PAN. Defaults to `panw-cloud-ngfw-payg`.
//
// > **Note:** The former `planId` `panw-cloud-ngfw-payg` is defined as stop sell, but has been set as the default to not break any existing resources that were originally provisioned with it. Users need to explicitly set `planId` to `panw-cngfw-payg` when creating new resources.
func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) PlanId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubLocalRulestack) pulumi.StringPtrOutput { return v.PlanId }).(pulumi.StringPtrOutput)
}

// The name of the Resource Group where the Palo Alto Next Generation Firewall VHub Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall VHub Local Rulestack to be created.
func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubLocalRulestack) pulumi.StringOutput {
		return v.ResourceGroupName
	}).(pulumi.StringOutput)
}

// The ID of the Local Rulestack to be used for this Next Generation Firewall.
func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) RulestackId() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubLocalRulestack) pulumi.StringOutput { return v.RulestackId }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall VHub Local Rulestack.
func (o NextGenerationFirewallVirtualHubLocalRulestackOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubLocalRulestack) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type NextGenerationFirewallVirtualHubLocalRulestackArrayOutput struct{ *pulumi.OutputState }

func (NextGenerationFirewallVirtualHubLocalRulestackArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NextGenerationFirewallVirtualHubLocalRulestack)(nil)).Elem()
}

func (o NextGenerationFirewallVirtualHubLocalRulestackArrayOutput) ToNextGenerationFirewallVirtualHubLocalRulestackArrayOutput() NextGenerationFirewallVirtualHubLocalRulestackArrayOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubLocalRulestackArrayOutput) ToNextGenerationFirewallVirtualHubLocalRulestackArrayOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubLocalRulestackArrayOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubLocalRulestackArrayOutput) Index(i pulumi.IntInput) NextGenerationFirewallVirtualHubLocalRulestackOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NextGenerationFirewallVirtualHubLocalRulestack {
		return vs[0].([]*NextGenerationFirewallVirtualHubLocalRulestack)[vs[1].(int)]
	}).(NextGenerationFirewallVirtualHubLocalRulestackOutput)
}

type NextGenerationFirewallVirtualHubLocalRulestackMapOutput struct{ *pulumi.OutputState }

func (NextGenerationFirewallVirtualHubLocalRulestackMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NextGenerationFirewallVirtualHubLocalRulestack)(nil)).Elem()
}

func (o NextGenerationFirewallVirtualHubLocalRulestackMapOutput) ToNextGenerationFirewallVirtualHubLocalRulestackMapOutput() NextGenerationFirewallVirtualHubLocalRulestackMapOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubLocalRulestackMapOutput) ToNextGenerationFirewallVirtualHubLocalRulestackMapOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubLocalRulestackMapOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubLocalRulestackMapOutput) MapIndex(k pulumi.StringInput) NextGenerationFirewallVirtualHubLocalRulestackOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NextGenerationFirewallVirtualHubLocalRulestack {
		return vs[0].(map[string]*NextGenerationFirewallVirtualHubLocalRulestack)[vs[1].(string)]
	}).(NextGenerationFirewallVirtualHubLocalRulestackOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NextGenerationFirewallVirtualHubLocalRulestackInput)(nil)).Elem(), &NextGenerationFirewallVirtualHubLocalRulestack{})
	pulumi.RegisterInputType(reflect.TypeOf((*NextGenerationFirewallVirtualHubLocalRulestackArrayInput)(nil)).Elem(), NextGenerationFirewallVirtualHubLocalRulestackArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NextGenerationFirewallVirtualHubLocalRulestackMapInput)(nil)).Elem(), NextGenerationFirewallVirtualHubLocalRulestackMap{})
	pulumi.RegisterOutputType(NextGenerationFirewallVirtualHubLocalRulestackOutput{})
	pulumi.RegisterOutputType(NextGenerationFirewallVirtualHubLocalRulestackArrayOutput{})
	pulumi.RegisterOutputType(NextGenerationFirewallVirtualHubLocalRulestackMapOutput{})
}
