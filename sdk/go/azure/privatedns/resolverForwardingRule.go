// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatedns

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Private DNS Resolver Forwarding Rule.
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
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/privatedns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("west europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "example", &network.VirtualNetworkArgs{
//				Name:              pulumi.String("example-vnet"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.0.0/16"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleSubnet, err := network.NewSubnet(ctx, "example", &network.SubnetArgs{
//				Name:               pulumi.String("outbounddns"),
//				ResourceGroupName:  example.Name,
//				VirtualNetworkName: exampleVirtualNetwork.Name,
//				AddressPrefixes: pulumi.StringArray{
//					pulumi.String("10.0.0.64/28"),
//				},
//				Delegations: network.SubnetDelegationArray{
//					&network.SubnetDelegationArgs{
//						Name: pulumi.String("Microsoft.Network.dnsResolvers"),
//						ServiceDelegation: &network.SubnetDelegationServiceDelegationArgs{
//							Actions: pulumi.StringArray{
//								pulumi.String("Microsoft.Network/virtualNetworks/subnets/join/action"),
//							},
//							Name: pulumi.String("Microsoft.Network/dnsResolvers"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleResolver, err := privatedns.NewResolver(ctx, "example", &privatedns.ResolverArgs{
//				Name:              pulumi.String("example-resolver"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				VirtualNetworkId:  exampleVirtualNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleResolverOutboundEndpoint, err := privatedns.NewResolverOutboundEndpoint(ctx, "example", &privatedns.ResolverOutboundEndpointArgs{
//				Name:                 pulumi.String("example-endpoint"),
//				PrivateDnsResolverId: exampleResolver.ID(),
//				Location:             exampleResolver.Location,
//				SubnetId:             exampleSubnet.ID(),
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("value"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleResolverDnsForwardingRuleset, err := privatedns.NewResolverDnsForwardingRuleset(ctx, "example", &privatedns.ResolverDnsForwardingRulesetArgs{
//				Name:              pulumi.String("example-drdfr"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				PrivateDnsResolverOutboundEndpointIds: pulumi.StringArray{
//					exampleResolverOutboundEndpoint.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = privatedns.NewResolverForwardingRule(ctx, "example", &privatedns.ResolverForwardingRuleArgs{
//				Name:                   pulumi.String("example-rule"),
//				DnsForwardingRulesetId: exampleResolverDnsForwardingRuleset.ID(),
//				DomainName:             pulumi.String("onprem.local."),
//				Enabled:                pulumi.Bool(true),
//				TargetDnsServers: privatedns.ResolverForwardingRuleTargetDnsServerArray{
//					&privatedns.ResolverForwardingRuleTargetDnsServerArgs{
//						IpAddress: pulumi.String("10.10.0.1"),
//						Port:      pulumi.Int(53),
//					},
//				},
//				Metadata: pulumi.StringMap{
//					"key": pulumi.String("value"),
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
// * `Microsoft.Network`: 2022-07-01
//
// ## Import
//
// Private DNS Resolver Forwarding Rules can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:privatedns/resolverForwardingRule:ResolverForwardingRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/dnsForwardingRulesets/dnsForwardingRuleset1/forwardingRules/forwardingRule1
// ```
type ResolverForwardingRule struct {
	pulumi.CustomResourceState

	// Specifies the ID of the Private DNS Resolver Forwarding Ruleset. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DnsForwardingRulesetId pulumi.StringOutput `pulumi:"dnsForwardingRulesetId"`
	// Specifies the domain name for the Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// Specifies the state of the Private DNS Resolver Forwarding Rule. Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Metadata attached to the Private DNS Resolver Forwarding Rule.
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// Specifies the name which should be used for this Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
	TargetDnsServers ResolverForwardingRuleTargetDnsServerArrayOutput `pulumi:"targetDnsServers"`
}

// NewResolverForwardingRule registers a new resource with the given unique name, arguments, and options.
func NewResolverForwardingRule(ctx *pulumi.Context,
	name string, args *ResolverForwardingRuleArgs, opts ...pulumi.ResourceOption) (*ResolverForwardingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DnsForwardingRulesetId == nil {
		return nil, errors.New("invalid value for required argument 'DnsForwardingRulesetId'")
	}
	if args.DomainName == nil {
		return nil, errors.New("invalid value for required argument 'DomainName'")
	}
	if args.TargetDnsServers == nil {
		return nil, errors.New("invalid value for required argument 'TargetDnsServers'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResolverForwardingRule
	err := ctx.RegisterResource("azure:privatedns/resolverForwardingRule:ResolverForwardingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResolverForwardingRule gets an existing ResolverForwardingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResolverForwardingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResolverForwardingRuleState, opts ...pulumi.ResourceOption) (*ResolverForwardingRule, error) {
	var resource ResolverForwardingRule
	err := ctx.ReadResource("azure:privatedns/resolverForwardingRule:ResolverForwardingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResolverForwardingRule resources.
type resolverForwardingRuleState struct {
	// Specifies the ID of the Private DNS Resolver Forwarding Ruleset. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DnsForwardingRulesetId *string `pulumi:"dnsForwardingRulesetId"`
	// Specifies the domain name for the Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DomainName *string `pulumi:"domainName"`
	// Specifies the state of the Private DNS Resolver Forwarding Rule. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// Metadata attached to the Private DNS Resolver Forwarding Rule.
	Metadata map[string]string `pulumi:"metadata"`
	// Specifies the name which should be used for this Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	Name *string `pulumi:"name"`
	// Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
	TargetDnsServers []ResolverForwardingRuleTargetDnsServer `pulumi:"targetDnsServers"`
}

type ResolverForwardingRuleState struct {
	// Specifies the ID of the Private DNS Resolver Forwarding Ruleset. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DnsForwardingRulesetId pulumi.StringPtrInput
	// Specifies the domain name for the Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DomainName pulumi.StringPtrInput
	// Specifies the state of the Private DNS Resolver Forwarding Rule. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// Metadata attached to the Private DNS Resolver Forwarding Rule.
	Metadata pulumi.StringMapInput
	// Specifies the name which should be used for this Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	Name pulumi.StringPtrInput
	// Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
	TargetDnsServers ResolverForwardingRuleTargetDnsServerArrayInput
}

func (ResolverForwardingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverForwardingRuleState)(nil)).Elem()
}

type resolverForwardingRuleArgs struct {
	// Specifies the ID of the Private DNS Resolver Forwarding Ruleset. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DnsForwardingRulesetId string `pulumi:"dnsForwardingRulesetId"`
	// Specifies the domain name for the Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DomainName string `pulumi:"domainName"`
	// Specifies the state of the Private DNS Resolver Forwarding Rule. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// Metadata attached to the Private DNS Resolver Forwarding Rule.
	Metadata map[string]string `pulumi:"metadata"`
	// Specifies the name which should be used for this Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	Name *string `pulumi:"name"`
	// Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
	TargetDnsServers []ResolverForwardingRuleTargetDnsServer `pulumi:"targetDnsServers"`
}

// The set of arguments for constructing a ResolverForwardingRule resource.
type ResolverForwardingRuleArgs struct {
	// Specifies the ID of the Private DNS Resolver Forwarding Ruleset. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DnsForwardingRulesetId pulumi.StringInput
	// Specifies the domain name for the Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	DomainName pulumi.StringInput
	// Specifies the state of the Private DNS Resolver Forwarding Rule. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// Metadata attached to the Private DNS Resolver Forwarding Rule.
	Metadata pulumi.StringMapInput
	// Specifies the name which should be used for this Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
	Name pulumi.StringPtrInput
	// Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
	TargetDnsServers ResolverForwardingRuleTargetDnsServerArrayInput
}

func (ResolverForwardingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverForwardingRuleArgs)(nil)).Elem()
}

type ResolverForwardingRuleInput interface {
	pulumi.Input

	ToResolverForwardingRuleOutput() ResolverForwardingRuleOutput
	ToResolverForwardingRuleOutputWithContext(ctx context.Context) ResolverForwardingRuleOutput
}

func (*ResolverForwardingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverForwardingRule)(nil)).Elem()
}

func (i *ResolverForwardingRule) ToResolverForwardingRuleOutput() ResolverForwardingRuleOutput {
	return i.ToResolverForwardingRuleOutputWithContext(context.Background())
}

func (i *ResolverForwardingRule) ToResolverForwardingRuleOutputWithContext(ctx context.Context) ResolverForwardingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverForwardingRuleOutput)
}

// ResolverForwardingRuleArrayInput is an input type that accepts ResolverForwardingRuleArray and ResolverForwardingRuleArrayOutput values.
// You can construct a concrete instance of `ResolverForwardingRuleArrayInput` via:
//
//	ResolverForwardingRuleArray{ ResolverForwardingRuleArgs{...} }
type ResolverForwardingRuleArrayInput interface {
	pulumi.Input

	ToResolverForwardingRuleArrayOutput() ResolverForwardingRuleArrayOutput
	ToResolverForwardingRuleArrayOutputWithContext(context.Context) ResolverForwardingRuleArrayOutput
}

type ResolverForwardingRuleArray []ResolverForwardingRuleInput

func (ResolverForwardingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverForwardingRule)(nil)).Elem()
}

func (i ResolverForwardingRuleArray) ToResolverForwardingRuleArrayOutput() ResolverForwardingRuleArrayOutput {
	return i.ToResolverForwardingRuleArrayOutputWithContext(context.Background())
}

func (i ResolverForwardingRuleArray) ToResolverForwardingRuleArrayOutputWithContext(ctx context.Context) ResolverForwardingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverForwardingRuleArrayOutput)
}

// ResolverForwardingRuleMapInput is an input type that accepts ResolverForwardingRuleMap and ResolverForwardingRuleMapOutput values.
// You can construct a concrete instance of `ResolverForwardingRuleMapInput` via:
//
//	ResolverForwardingRuleMap{ "key": ResolverForwardingRuleArgs{...} }
type ResolverForwardingRuleMapInput interface {
	pulumi.Input

	ToResolverForwardingRuleMapOutput() ResolverForwardingRuleMapOutput
	ToResolverForwardingRuleMapOutputWithContext(context.Context) ResolverForwardingRuleMapOutput
}

type ResolverForwardingRuleMap map[string]ResolverForwardingRuleInput

func (ResolverForwardingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverForwardingRule)(nil)).Elem()
}

func (i ResolverForwardingRuleMap) ToResolverForwardingRuleMapOutput() ResolverForwardingRuleMapOutput {
	return i.ToResolverForwardingRuleMapOutputWithContext(context.Background())
}

func (i ResolverForwardingRuleMap) ToResolverForwardingRuleMapOutputWithContext(ctx context.Context) ResolverForwardingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverForwardingRuleMapOutput)
}

type ResolverForwardingRuleOutput struct{ *pulumi.OutputState }

func (ResolverForwardingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverForwardingRule)(nil)).Elem()
}

func (o ResolverForwardingRuleOutput) ToResolverForwardingRuleOutput() ResolverForwardingRuleOutput {
	return o
}

func (o ResolverForwardingRuleOutput) ToResolverForwardingRuleOutputWithContext(ctx context.Context) ResolverForwardingRuleOutput {
	return o
}

// Specifies the ID of the Private DNS Resolver Forwarding Ruleset. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
func (o ResolverForwardingRuleOutput) DnsForwardingRulesetId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverForwardingRule) pulumi.StringOutput { return v.DnsForwardingRulesetId }).(pulumi.StringOutput)
}

// Specifies the domain name for the Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
func (o ResolverForwardingRuleOutput) DomainName() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverForwardingRule) pulumi.StringOutput { return v.DomainName }).(pulumi.StringOutput)
}

// Specifies the state of the Private DNS Resolver Forwarding Rule. Defaults to `true`.
func (o ResolverForwardingRuleOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ResolverForwardingRule) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Metadata attached to the Private DNS Resolver Forwarding Rule.
func (o ResolverForwardingRuleOutput) Metadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResolverForwardingRule) pulumi.StringMapOutput { return v.Metadata }).(pulumi.StringMapOutput)
}

// Specifies the name which should be used for this Private DNS Resolver Forwarding Rule. Changing this forces a new Private DNS Resolver Forwarding Rule to be created.
func (o ResolverForwardingRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverForwardingRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Can be specified multiple times to define multiple target DNS servers. Each `targetDnsServers` block as defined below.
func (o ResolverForwardingRuleOutput) TargetDnsServers() ResolverForwardingRuleTargetDnsServerArrayOutput {
	return o.ApplyT(func(v *ResolverForwardingRule) ResolverForwardingRuleTargetDnsServerArrayOutput {
		return v.TargetDnsServers
	}).(ResolverForwardingRuleTargetDnsServerArrayOutput)
}

type ResolverForwardingRuleArrayOutput struct{ *pulumi.OutputState }

func (ResolverForwardingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverForwardingRule)(nil)).Elem()
}

func (o ResolverForwardingRuleArrayOutput) ToResolverForwardingRuleArrayOutput() ResolverForwardingRuleArrayOutput {
	return o
}

func (o ResolverForwardingRuleArrayOutput) ToResolverForwardingRuleArrayOutputWithContext(ctx context.Context) ResolverForwardingRuleArrayOutput {
	return o
}

func (o ResolverForwardingRuleArrayOutput) Index(i pulumi.IntInput) ResolverForwardingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResolverForwardingRule {
		return vs[0].([]*ResolverForwardingRule)[vs[1].(int)]
	}).(ResolverForwardingRuleOutput)
}

type ResolverForwardingRuleMapOutput struct{ *pulumi.OutputState }

func (ResolverForwardingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverForwardingRule)(nil)).Elem()
}

func (o ResolverForwardingRuleMapOutput) ToResolverForwardingRuleMapOutput() ResolverForwardingRuleMapOutput {
	return o
}

func (o ResolverForwardingRuleMapOutput) ToResolverForwardingRuleMapOutputWithContext(ctx context.Context) ResolverForwardingRuleMapOutput {
	return o
}

func (o ResolverForwardingRuleMapOutput) MapIndex(k pulumi.StringInput) ResolverForwardingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResolverForwardingRule {
		return vs[0].(map[string]*ResolverForwardingRule)[vs[1].(string)]
	}).(ResolverForwardingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverForwardingRuleInput)(nil)).Elem(), &ResolverForwardingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverForwardingRuleArrayInput)(nil)).Elem(), ResolverForwardingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverForwardingRuleMapInput)(nil)).Elem(), ResolverForwardingRuleMap{})
	pulumi.RegisterOutputType(ResolverForwardingRuleOutput{})
	pulumi.RegisterOutputType(ResolverForwardingRuleArrayOutput{})
	pulumi.RegisterOutputType(ResolverForwardingRuleMapOutput{})
}
