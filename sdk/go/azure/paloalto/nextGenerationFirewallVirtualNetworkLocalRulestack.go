// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package paloalto

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Palo Alto Next Generation Firewall Deployed in a Virtual Network and configured via a Local Rulestack.
//
// ## Import
//
// Palo Alto Next Generation Firewall Virtual Network Local Rulestacks can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/PaloAltoNetworks.Cloudngfw/firewalls/myVNetRulestackFW
//
// ```
type NextGenerationFirewallVirtualNetworkLocalRulestack struct {
	pulumi.CustomResourceState

	// One or more `destinationNat` blocks as defined below.
	DestinationNats NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArrayOutput `pulumi:"destinationNats"`
	// A `dnsSettings` block as defined below.
	DnsSettings NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsPtrOutput `pulumi:"dnsSettings"`
	// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A `networkProfile` block as defined below.
	NetworkProfile NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileOutput `pulumi:"networkProfile"`
	// The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The ID of the Local Rulestack which will be used to configure this Firewall Resource.
	RulestackId pulumi.StringOutput `pulumi:"rulestackId"`
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewNextGenerationFirewallVirtualNetworkLocalRulestack registers a new resource with the given unique name, arguments, and options.
func NewNextGenerationFirewallVirtualNetworkLocalRulestack(ctx *pulumi.Context,
	name string, args *NextGenerationFirewallVirtualNetworkLocalRulestackArgs, opts ...pulumi.ResourceOption) (*NextGenerationFirewallVirtualNetworkLocalRulestack, error) {
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
	var resource NextGenerationFirewallVirtualNetworkLocalRulestack
	err := ctx.RegisterResource("azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNextGenerationFirewallVirtualNetworkLocalRulestack gets an existing NextGenerationFirewallVirtualNetworkLocalRulestack resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNextGenerationFirewallVirtualNetworkLocalRulestack(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NextGenerationFirewallVirtualNetworkLocalRulestackState, opts ...pulumi.ResourceOption) (*NextGenerationFirewallVirtualNetworkLocalRulestack, error) {
	var resource NextGenerationFirewallVirtualNetworkLocalRulestack
	err := ctx.ReadResource("azure:paloalto/nextGenerationFirewallVirtualNetworkLocalRulestack:NextGenerationFirewallVirtualNetworkLocalRulestack", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NextGenerationFirewallVirtualNetworkLocalRulestack resources.
type nextGenerationFirewallVirtualNetworkLocalRulestackState struct {
	// One or more `destinationNat` blocks as defined below.
	DestinationNats []NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat `pulumi:"destinationNats"`
	// A `dnsSettings` block as defined below.
	DnsSettings *NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings `pulumi:"dnsSettings"`
	// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	Name *string `pulumi:"name"`
	// A `networkProfile` block as defined below.
	NetworkProfile *NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile `pulumi:"networkProfile"`
	// The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The ID of the Local Rulestack which will be used to configure this Firewall Resource.
	RulestackId *string `pulumi:"rulestackId"`
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
	Tags map[string]string `pulumi:"tags"`
}

type NextGenerationFirewallVirtualNetworkLocalRulestackState struct {
	// One or more `destinationNat` blocks as defined below.
	DestinationNats NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArrayInput
	// A `dnsSettings` block as defined below.
	DnsSettings NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsPtrInput
	// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	Name pulumi.StringPtrInput
	// A `networkProfile` block as defined below.
	NetworkProfile NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfilePtrInput
	// The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The ID of the Local Rulestack which will be used to configure this Firewall Resource.
	RulestackId pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
	Tags pulumi.StringMapInput
}

func (NextGenerationFirewallVirtualNetworkLocalRulestackState) ElementType() reflect.Type {
	return reflect.TypeOf((*nextGenerationFirewallVirtualNetworkLocalRulestackState)(nil)).Elem()
}

type nextGenerationFirewallVirtualNetworkLocalRulestackArgs struct {
	// One or more `destinationNat` blocks as defined below.
	DestinationNats []NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNat `pulumi:"destinationNats"`
	// A `dnsSettings` block as defined below.
	DnsSettings *NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettings `pulumi:"dnsSettings"`
	// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	Name *string `pulumi:"name"`
	// A `networkProfile` block as defined below.
	NetworkProfile NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfile `pulumi:"networkProfile"`
	// The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The ID of the Local Rulestack which will be used to configure this Firewall Resource.
	RulestackId string `pulumi:"rulestackId"`
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a NextGenerationFirewallVirtualNetworkLocalRulestack resource.
type NextGenerationFirewallVirtualNetworkLocalRulestackArgs struct {
	// One or more `destinationNat` blocks as defined below.
	DestinationNats NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArrayInput
	// A `dnsSettings` block as defined below.
	DnsSettings NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsPtrInput
	// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	Name pulumi.StringPtrInput
	// A `networkProfile` block as defined below.
	NetworkProfile NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileInput
	// The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
	ResourceGroupName pulumi.StringInput
	// The ID of the Local Rulestack which will be used to configure this Firewall Resource.
	RulestackId pulumi.StringInput
	// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
	Tags pulumi.StringMapInput
}

func (NextGenerationFirewallVirtualNetworkLocalRulestackArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nextGenerationFirewallVirtualNetworkLocalRulestackArgs)(nil)).Elem()
}

type NextGenerationFirewallVirtualNetworkLocalRulestackInput interface {
	pulumi.Input

	ToNextGenerationFirewallVirtualNetworkLocalRulestackOutput() NextGenerationFirewallVirtualNetworkLocalRulestackOutput
	ToNextGenerationFirewallVirtualNetworkLocalRulestackOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualNetworkLocalRulestackOutput
}

func (*NextGenerationFirewallVirtualNetworkLocalRulestack) ElementType() reflect.Type {
	return reflect.TypeOf((**NextGenerationFirewallVirtualNetworkLocalRulestack)(nil)).Elem()
}

func (i *NextGenerationFirewallVirtualNetworkLocalRulestack) ToNextGenerationFirewallVirtualNetworkLocalRulestackOutput() NextGenerationFirewallVirtualNetworkLocalRulestackOutput {
	return i.ToNextGenerationFirewallVirtualNetworkLocalRulestackOutputWithContext(context.Background())
}

func (i *NextGenerationFirewallVirtualNetworkLocalRulestack) ToNextGenerationFirewallVirtualNetworkLocalRulestackOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualNetworkLocalRulestackOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NextGenerationFirewallVirtualNetworkLocalRulestackOutput)
}

// NextGenerationFirewallVirtualNetworkLocalRulestackArrayInput is an input type that accepts NextGenerationFirewallVirtualNetworkLocalRulestackArray and NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput values.
// You can construct a concrete instance of `NextGenerationFirewallVirtualNetworkLocalRulestackArrayInput` via:
//
//	NextGenerationFirewallVirtualNetworkLocalRulestackArray{ NextGenerationFirewallVirtualNetworkLocalRulestackArgs{...} }
type NextGenerationFirewallVirtualNetworkLocalRulestackArrayInput interface {
	pulumi.Input

	ToNextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput() NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput
	ToNextGenerationFirewallVirtualNetworkLocalRulestackArrayOutputWithContext(context.Context) NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput
}

type NextGenerationFirewallVirtualNetworkLocalRulestackArray []NextGenerationFirewallVirtualNetworkLocalRulestackInput

func (NextGenerationFirewallVirtualNetworkLocalRulestackArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NextGenerationFirewallVirtualNetworkLocalRulestack)(nil)).Elem()
}

func (i NextGenerationFirewallVirtualNetworkLocalRulestackArray) ToNextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput() NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput {
	return i.ToNextGenerationFirewallVirtualNetworkLocalRulestackArrayOutputWithContext(context.Background())
}

func (i NextGenerationFirewallVirtualNetworkLocalRulestackArray) ToNextGenerationFirewallVirtualNetworkLocalRulestackArrayOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput)
}

// NextGenerationFirewallVirtualNetworkLocalRulestackMapInput is an input type that accepts NextGenerationFirewallVirtualNetworkLocalRulestackMap and NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput values.
// You can construct a concrete instance of `NextGenerationFirewallVirtualNetworkLocalRulestackMapInput` via:
//
//	NextGenerationFirewallVirtualNetworkLocalRulestackMap{ "key": NextGenerationFirewallVirtualNetworkLocalRulestackArgs{...} }
type NextGenerationFirewallVirtualNetworkLocalRulestackMapInput interface {
	pulumi.Input

	ToNextGenerationFirewallVirtualNetworkLocalRulestackMapOutput() NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput
	ToNextGenerationFirewallVirtualNetworkLocalRulestackMapOutputWithContext(context.Context) NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput
}

type NextGenerationFirewallVirtualNetworkLocalRulestackMap map[string]NextGenerationFirewallVirtualNetworkLocalRulestackInput

func (NextGenerationFirewallVirtualNetworkLocalRulestackMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NextGenerationFirewallVirtualNetworkLocalRulestack)(nil)).Elem()
}

func (i NextGenerationFirewallVirtualNetworkLocalRulestackMap) ToNextGenerationFirewallVirtualNetworkLocalRulestackMapOutput() NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput {
	return i.ToNextGenerationFirewallVirtualNetworkLocalRulestackMapOutputWithContext(context.Background())
}

func (i NextGenerationFirewallVirtualNetworkLocalRulestackMap) ToNextGenerationFirewallVirtualNetworkLocalRulestackMapOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput)
}

type NextGenerationFirewallVirtualNetworkLocalRulestackOutput struct{ *pulumi.OutputState }

func (NextGenerationFirewallVirtualNetworkLocalRulestackOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NextGenerationFirewallVirtualNetworkLocalRulestack)(nil)).Elem()
}

func (o NextGenerationFirewallVirtualNetworkLocalRulestackOutput) ToNextGenerationFirewallVirtualNetworkLocalRulestackOutput() NextGenerationFirewallVirtualNetworkLocalRulestackOutput {
	return o
}

func (o NextGenerationFirewallVirtualNetworkLocalRulestackOutput) ToNextGenerationFirewallVirtualNetworkLocalRulestackOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualNetworkLocalRulestackOutput {
	return o
}

// One or more `destinationNat` blocks as defined below.
func (o NextGenerationFirewallVirtualNetworkLocalRulestackOutput) DestinationNats() NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArrayOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualNetworkLocalRulestack) NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArrayOutput {
		return v.DestinationNats
	}).(NextGenerationFirewallVirtualNetworkLocalRulestackDestinationNatArrayOutput)
}

// A `dnsSettings` block as defined below.
func (o NextGenerationFirewallVirtualNetworkLocalRulestackOutput) DnsSettings() NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsPtrOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualNetworkLocalRulestack) NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsPtrOutput {
		return v.DnsSettings
	}).(NextGenerationFirewallVirtualNetworkLocalRulestackDnsSettingsPtrOutput)
}

// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Local Rulestack. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
func (o NextGenerationFirewallVirtualNetworkLocalRulestackOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualNetworkLocalRulestack) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A `networkProfile` block as defined below.
func (o NextGenerationFirewallVirtualNetworkLocalRulestackOutput) NetworkProfile() NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualNetworkLocalRulestack) NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileOutput {
		return v.NetworkProfile
	}).(NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileOutput)
}

// The name of the Resource Group where the Palo Alto Next Generation Firewall Virtual Network Local Rulestack should exist. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Local Rulestack to be created.
func (o NextGenerationFirewallVirtualNetworkLocalRulestackOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualNetworkLocalRulestack) pulumi.StringOutput {
		return v.ResourceGroupName
	}).(pulumi.StringOutput)
}

// The ID of the Local Rulestack which will be used to configure this Firewall Resource.
func (o NextGenerationFirewallVirtualNetworkLocalRulestackOutput) RulestackId() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualNetworkLocalRulestack) pulumi.StringOutput { return v.RulestackId }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Palo Alto Next Generation Firewall Virtual Network Local Rulestack.
func (o NextGenerationFirewallVirtualNetworkLocalRulestackOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualNetworkLocalRulestack) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput struct{ *pulumi.OutputState }

func (NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NextGenerationFirewallVirtualNetworkLocalRulestack)(nil)).Elem()
}

func (o NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput) ToNextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput() NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput {
	return o
}

func (o NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput) ToNextGenerationFirewallVirtualNetworkLocalRulestackArrayOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput {
	return o
}

func (o NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput) Index(i pulumi.IntInput) NextGenerationFirewallVirtualNetworkLocalRulestackOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NextGenerationFirewallVirtualNetworkLocalRulestack {
		return vs[0].([]*NextGenerationFirewallVirtualNetworkLocalRulestack)[vs[1].(int)]
	}).(NextGenerationFirewallVirtualNetworkLocalRulestackOutput)
}

type NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput struct{ *pulumi.OutputState }

func (NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NextGenerationFirewallVirtualNetworkLocalRulestack)(nil)).Elem()
}

func (o NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput) ToNextGenerationFirewallVirtualNetworkLocalRulestackMapOutput() NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput {
	return o
}

func (o NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput) ToNextGenerationFirewallVirtualNetworkLocalRulestackMapOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput {
	return o
}

func (o NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput) MapIndex(k pulumi.StringInput) NextGenerationFirewallVirtualNetworkLocalRulestackOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NextGenerationFirewallVirtualNetworkLocalRulestack {
		return vs[0].(map[string]*NextGenerationFirewallVirtualNetworkLocalRulestack)[vs[1].(string)]
	}).(NextGenerationFirewallVirtualNetworkLocalRulestackOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NextGenerationFirewallVirtualNetworkLocalRulestackInput)(nil)).Elem(), &NextGenerationFirewallVirtualNetworkLocalRulestack{})
	pulumi.RegisterInputType(reflect.TypeOf((*NextGenerationFirewallVirtualNetworkLocalRulestackArrayInput)(nil)).Elem(), NextGenerationFirewallVirtualNetworkLocalRulestackArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NextGenerationFirewallVirtualNetworkLocalRulestackMapInput)(nil)).Elem(), NextGenerationFirewallVirtualNetworkLocalRulestackMap{})
	pulumi.RegisterOutputType(NextGenerationFirewallVirtualNetworkLocalRulestackOutput{})
	pulumi.RegisterOutputType(NextGenerationFirewallVirtualNetworkLocalRulestackArrayOutput{})
	pulumi.RegisterOutputType(NextGenerationFirewallVirtualNetworkLocalRulestackMapOutput{})
}