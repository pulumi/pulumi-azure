// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Load Balancer Rule.
//
// > **Note:** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration Attached
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/lb"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("LoadBalancerRG"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			examplePublicIp, err := network.NewPublicIp(ctx, "example", &network.PublicIpArgs{
//				Name:              pulumi.String("PublicIPForLB"),
//				Location:          pulumi.String("West US"),
//				ResourceGroupName: example.Name,
//				AllocationMethod:  pulumi.String("Static"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleLoadBalancer, err := lb.NewLoadBalancer(ctx, "example", &lb.LoadBalancerArgs{
//				Name:              pulumi.String("TestLoadBalancer"),
//				Location:          pulumi.String("West US"),
//				ResourceGroupName: example.Name,
//				FrontendIpConfigurations: lb.LoadBalancerFrontendIpConfigurationArray{
//					&lb.LoadBalancerFrontendIpConfigurationArgs{
//						Name:              pulumi.String("PublicIPAddress"),
//						PublicIpAddressId: examplePublicIp.ID(),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = lb.NewRule(ctx, "example", &lb.RuleArgs{
//				LoadbalancerId:              exampleLoadBalancer.ID(),
//				Name:                        pulumi.String("LBRule"),
//				Protocol:                    pulumi.String("Tcp"),
//				FrontendPort:                pulumi.Int(3389),
//				BackendPort:                 pulumi.Int(3389),
//				FrontendIpConfigurationName: pulumi.String("PublicIPAddress"),
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
// * `Microsoft.Network`: 2023-09-01
//
// ## Import
//
// Load Balancer Rules can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:lb/rule:Rule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/loadBalancers/lb1/loadBalancingRules/rule1
// ```
type Rule struct {
	pulumi.CustomResourceState

	// A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
	//
	// > **Note:** In most cases users can only set one Backend Address Pool ID in the `backendAddressPoolIds`. Especially, when the sku of the LB is `Gateway`, users can set up to two IDs in the `backendAddressPoolIds`.
	BackendAddressPoolIds pulumi.StringArrayOutput `pulumi:"backendAddressPoolIds"`
	// The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive. A port of `0` means "Any Port".
	BackendPort pulumi.IntOutput `pulumi:"backendPort"`
	// Is snat enabled for this Load Balancer Rule? Default `false`.
	DisableOutboundSnat pulumi.BoolPtrOutput `pulumi:"disableOutboundSnat"`
	// Are the Floating IPs enabled for this Load Balancer Rule? A "floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
	EnableFloatingIp pulumi.BoolPtrOutput `pulumi:"enableFloatingIp"`
	// Is TCP Reset enabled for this Load Balancer Rule?
	EnableTcpReset            pulumi.BoolPtrOutput `pulumi:"enableTcpReset"`
	FrontendIpConfigurationId pulumi.StringOutput  `pulumi:"frontendIpConfigurationId"`
	// The name of the frontend IP configuration to which the rule is associated.
	FrontendIpConfigurationName pulumi.StringOutput `pulumi:"frontendIpConfigurationName"`
	// The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive. A port of `0` means "Any Port".
	FrontendPort pulumi.IntOutput `pulumi:"frontendPort"`
	// Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `100` minutes. Defaults to `4` minutes.
	IdleTimeoutInMinutes pulumi.IntPtrOutput `pulumi:"idleTimeoutInMinutes"`
	// Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where in the Azure portal the options are called `None`, `Client IP` and `Client IP and Protocol` respectively. Defaults to `Default`.
	LoadDistribution pulumi.StringPtrOutput `pulumi:"loadDistribution"`
	// The ID of the Load Balancer in which to create the Rule. Changing this forces a new resource to be created.
	LoadbalancerId pulumi.StringOutput `pulumi:"loadbalancerId"`
	// Specifies the name of the LB Rule. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A reference to a Probe used by this Load Balancing Rule.
	ProbeId pulumi.StringPtrOutput `pulumi:"probeId"`
	// The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
	Protocol pulumi.StringOutput `pulumi:"protocol"`
}

// NewRule registers a new resource with the given unique name, arguments, and options.
func NewRule(ctx *pulumi.Context,
	name string, args *RuleArgs, opts ...pulumi.ResourceOption) (*Rule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BackendPort == nil {
		return nil, errors.New("invalid value for required argument 'BackendPort'")
	}
	if args.FrontendIpConfigurationName == nil {
		return nil, errors.New("invalid value for required argument 'FrontendIpConfigurationName'")
	}
	if args.FrontendPort == nil {
		return nil, errors.New("invalid value for required argument 'FrontendPort'")
	}
	if args.LoadbalancerId == nil {
		return nil, errors.New("invalid value for required argument 'LoadbalancerId'")
	}
	if args.Protocol == nil {
		return nil, errors.New("invalid value for required argument 'Protocol'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Rule
	err := ctx.RegisterResource("azure:lb/rule:Rule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRule gets an existing Rule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuleState, opts ...pulumi.ResourceOption) (*Rule, error) {
	var resource Rule
	err := ctx.ReadResource("azure:lb/rule:Rule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rule resources.
type ruleState struct {
	// A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
	//
	// > **Note:** In most cases users can only set one Backend Address Pool ID in the `backendAddressPoolIds`. Especially, when the sku of the LB is `Gateway`, users can set up to two IDs in the `backendAddressPoolIds`.
	BackendAddressPoolIds []string `pulumi:"backendAddressPoolIds"`
	// The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive. A port of `0` means "Any Port".
	BackendPort *int `pulumi:"backendPort"`
	// Is snat enabled for this Load Balancer Rule? Default `false`.
	DisableOutboundSnat *bool `pulumi:"disableOutboundSnat"`
	// Are the Floating IPs enabled for this Load Balancer Rule? A "floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
	EnableFloatingIp *bool `pulumi:"enableFloatingIp"`
	// Is TCP Reset enabled for this Load Balancer Rule?
	EnableTcpReset            *bool   `pulumi:"enableTcpReset"`
	FrontendIpConfigurationId *string `pulumi:"frontendIpConfigurationId"`
	// The name of the frontend IP configuration to which the rule is associated.
	FrontendIpConfigurationName *string `pulumi:"frontendIpConfigurationName"`
	// The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive. A port of `0` means "Any Port".
	FrontendPort *int `pulumi:"frontendPort"`
	// Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `100` minutes. Defaults to `4` minutes.
	IdleTimeoutInMinutes *int `pulumi:"idleTimeoutInMinutes"`
	// Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where in the Azure portal the options are called `None`, `Client IP` and `Client IP and Protocol` respectively. Defaults to `Default`.
	LoadDistribution *string `pulumi:"loadDistribution"`
	// The ID of the Load Balancer in which to create the Rule. Changing this forces a new resource to be created.
	LoadbalancerId *string `pulumi:"loadbalancerId"`
	// Specifies the name of the LB Rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A reference to a Probe used by this Load Balancing Rule.
	ProbeId *string `pulumi:"probeId"`
	// The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
	Protocol *string `pulumi:"protocol"`
}

type RuleState struct {
	// A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
	//
	// > **Note:** In most cases users can only set one Backend Address Pool ID in the `backendAddressPoolIds`. Especially, when the sku of the LB is `Gateway`, users can set up to two IDs in the `backendAddressPoolIds`.
	BackendAddressPoolIds pulumi.StringArrayInput
	// The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive. A port of `0` means "Any Port".
	BackendPort pulumi.IntPtrInput
	// Is snat enabled for this Load Balancer Rule? Default `false`.
	DisableOutboundSnat pulumi.BoolPtrInput
	// Are the Floating IPs enabled for this Load Balancer Rule? A "floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
	EnableFloatingIp pulumi.BoolPtrInput
	// Is TCP Reset enabled for this Load Balancer Rule?
	EnableTcpReset            pulumi.BoolPtrInput
	FrontendIpConfigurationId pulumi.StringPtrInput
	// The name of the frontend IP configuration to which the rule is associated.
	FrontendIpConfigurationName pulumi.StringPtrInput
	// The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive. A port of `0` means "Any Port".
	FrontendPort pulumi.IntPtrInput
	// Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `100` minutes. Defaults to `4` minutes.
	IdleTimeoutInMinutes pulumi.IntPtrInput
	// Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where in the Azure portal the options are called `None`, `Client IP` and `Client IP and Protocol` respectively. Defaults to `Default`.
	LoadDistribution pulumi.StringPtrInput
	// The ID of the Load Balancer in which to create the Rule. Changing this forces a new resource to be created.
	LoadbalancerId pulumi.StringPtrInput
	// Specifies the name of the LB Rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A reference to a Probe used by this Load Balancing Rule.
	ProbeId pulumi.StringPtrInput
	// The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
	Protocol pulumi.StringPtrInput
}

func (RuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleState)(nil)).Elem()
}

type ruleArgs struct {
	// A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
	//
	// > **Note:** In most cases users can only set one Backend Address Pool ID in the `backendAddressPoolIds`. Especially, when the sku of the LB is `Gateway`, users can set up to two IDs in the `backendAddressPoolIds`.
	BackendAddressPoolIds []string `pulumi:"backendAddressPoolIds"`
	// The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive. A port of `0` means "Any Port".
	BackendPort int `pulumi:"backendPort"`
	// Is snat enabled for this Load Balancer Rule? Default `false`.
	DisableOutboundSnat *bool `pulumi:"disableOutboundSnat"`
	// Are the Floating IPs enabled for this Load Balancer Rule? A "floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
	EnableFloatingIp *bool `pulumi:"enableFloatingIp"`
	// Is TCP Reset enabled for this Load Balancer Rule?
	EnableTcpReset *bool `pulumi:"enableTcpReset"`
	// The name of the frontend IP configuration to which the rule is associated.
	FrontendIpConfigurationName string `pulumi:"frontendIpConfigurationName"`
	// The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive. A port of `0` means "Any Port".
	FrontendPort int `pulumi:"frontendPort"`
	// Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `100` minutes. Defaults to `4` minutes.
	IdleTimeoutInMinutes *int `pulumi:"idleTimeoutInMinutes"`
	// Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where in the Azure portal the options are called `None`, `Client IP` and `Client IP and Protocol` respectively. Defaults to `Default`.
	LoadDistribution *string `pulumi:"loadDistribution"`
	// The ID of the Load Balancer in which to create the Rule. Changing this forces a new resource to be created.
	LoadbalancerId string `pulumi:"loadbalancerId"`
	// Specifies the name of the LB Rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A reference to a Probe used by this Load Balancing Rule.
	ProbeId *string `pulumi:"probeId"`
	// The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
	Protocol string `pulumi:"protocol"`
}

// The set of arguments for constructing a Rule resource.
type RuleArgs struct {
	// A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
	//
	// > **Note:** In most cases users can only set one Backend Address Pool ID in the `backendAddressPoolIds`. Especially, when the sku of the LB is `Gateway`, users can set up to two IDs in the `backendAddressPoolIds`.
	BackendAddressPoolIds pulumi.StringArrayInput
	// The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive. A port of `0` means "Any Port".
	BackendPort pulumi.IntInput
	// Is snat enabled for this Load Balancer Rule? Default `false`.
	DisableOutboundSnat pulumi.BoolPtrInput
	// Are the Floating IPs enabled for this Load Balancer Rule? A "floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
	EnableFloatingIp pulumi.BoolPtrInput
	// Is TCP Reset enabled for this Load Balancer Rule?
	EnableTcpReset pulumi.BoolPtrInput
	// The name of the frontend IP configuration to which the rule is associated.
	FrontendIpConfigurationName pulumi.StringInput
	// The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive. A port of `0` means "Any Port".
	FrontendPort pulumi.IntInput
	// Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `100` minutes. Defaults to `4` minutes.
	IdleTimeoutInMinutes pulumi.IntPtrInput
	// Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where in the Azure portal the options are called `None`, `Client IP` and `Client IP and Protocol` respectively. Defaults to `Default`.
	LoadDistribution pulumi.StringPtrInput
	// The ID of the Load Balancer in which to create the Rule. Changing this forces a new resource to be created.
	LoadbalancerId pulumi.StringInput
	// Specifies the name of the LB Rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A reference to a Probe used by this Load Balancing Rule.
	ProbeId pulumi.StringPtrInput
	// The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
	Protocol pulumi.StringInput
}

func (RuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleArgs)(nil)).Elem()
}

type RuleInput interface {
	pulumi.Input

	ToRuleOutput() RuleOutput
	ToRuleOutputWithContext(ctx context.Context) RuleOutput
}

func (*Rule) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil)).Elem()
}

func (i *Rule) ToRuleOutput() RuleOutput {
	return i.ToRuleOutputWithContext(context.Background())
}

func (i *Rule) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleOutput)
}

// RuleArrayInput is an input type that accepts RuleArray and RuleArrayOutput values.
// You can construct a concrete instance of `RuleArrayInput` via:
//
//	RuleArray{ RuleArgs{...} }
type RuleArrayInput interface {
	pulumi.Input

	ToRuleArrayOutput() RuleArrayOutput
	ToRuleArrayOutputWithContext(context.Context) RuleArrayOutput
}

type RuleArray []RuleInput

func (RuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rule)(nil)).Elem()
}

func (i RuleArray) ToRuleArrayOutput() RuleArrayOutput {
	return i.ToRuleArrayOutputWithContext(context.Background())
}

func (i RuleArray) ToRuleArrayOutputWithContext(ctx context.Context) RuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleArrayOutput)
}

// RuleMapInput is an input type that accepts RuleMap and RuleMapOutput values.
// You can construct a concrete instance of `RuleMapInput` via:
//
//	RuleMap{ "key": RuleArgs{...} }
type RuleMapInput interface {
	pulumi.Input

	ToRuleMapOutput() RuleMapOutput
	ToRuleMapOutputWithContext(context.Context) RuleMapOutput
}

type RuleMap map[string]RuleInput

func (RuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rule)(nil)).Elem()
}

func (i RuleMap) ToRuleMapOutput() RuleMapOutput {
	return i.ToRuleMapOutputWithContext(context.Background())
}

func (i RuleMap) ToRuleMapOutputWithContext(ctx context.Context) RuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleMapOutput)
}

type RuleOutput struct{ *pulumi.OutputState }

func (RuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil)).Elem()
}

func (o RuleOutput) ToRuleOutput() RuleOutput {
	return o
}

func (o RuleOutput) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return o
}

// A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
//
// > **Note:** In most cases users can only set one Backend Address Pool ID in the `backendAddressPoolIds`. Especially, when the sku of the LB is `Gateway`, users can set up to two IDs in the `backendAddressPoolIds`.
func (o RuleOutput) BackendAddressPoolIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringArrayOutput { return v.BackendAddressPoolIds }).(pulumi.StringArrayOutput)
}

// The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive. A port of `0` means "Any Port".
func (o RuleOutput) BackendPort() pulumi.IntOutput {
	return o.ApplyT(func(v *Rule) pulumi.IntOutput { return v.BackendPort }).(pulumi.IntOutput)
}

// Is snat enabled for this Load Balancer Rule? Default `false`.
func (o RuleOutput) DisableOutboundSnat() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Rule) pulumi.BoolPtrOutput { return v.DisableOutboundSnat }).(pulumi.BoolPtrOutput)
}

// Are the Floating IPs enabled for this Load Balancer Rule? A "floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
func (o RuleOutput) EnableFloatingIp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Rule) pulumi.BoolPtrOutput { return v.EnableFloatingIp }).(pulumi.BoolPtrOutput)
}

// Is TCP Reset enabled for this Load Balancer Rule?
func (o RuleOutput) EnableTcpReset() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Rule) pulumi.BoolPtrOutput { return v.EnableTcpReset }).(pulumi.BoolPtrOutput)
}

func (o RuleOutput) FrontendIpConfigurationId() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.FrontendIpConfigurationId }).(pulumi.StringOutput)
}

// The name of the frontend IP configuration to which the rule is associated.
func (o RuleOutput) FrontendIpConfigurationName() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.FrontendIpConfigurationName }).(pulumi.StringOutput)
}

// The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive. A port of `0` means "Any Port".
func (o RuleOutput) FrontendPort() pulumi.IntOutput {
	return o.ApplyT(func(v *Rule) pulumi.IntOutput { return v.FrontendPort }).(pulumi.IntOutput)
}

// Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `100` minutes. Defaults to `4` minutes.
func (o RuleOutput) IdleTimeoutInMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Rule) pulumi.IntPtrOutput { return v.IdleTimeoutInMinutes }).(pulumi.IntPtrOutput)
}

// Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where in the Azure portal the options are called `None`, `Client IP` and `Client IP and Protocol` respectively. Defaults to `Default`.
func (o RuleOutput) LoadDistribution() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringPtrOutput { return v.LoadDistribution }).(pulumi.StringPtrOutput)
}

// The ID of the Load Balancer in which to create the Rule. Changing this forces a new resource to be created.
func (o RuleOutput) LoadbalancerId() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.LoadbalancerId }).(pulumi.StringOutput)
}

// Specifies the name of the LB Rule. Changing this forces a new resource to be created.
func (o RuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A reference to a Probe used by this Load Balancing Rule.
func (o RuleOutput) ProbeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringPtrOutput { return v.ProbeId }).(pulumi.StringPtrOutput)
}

// The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
func (o RuleOutput) Protocol() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.Protocol }).(pulumi.StringOutput)
}

type RuleArrayOutput struct{ *pulumi.OutputState }

func (RuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rule)(nil)).Elem()
}

func (o RuleArrayOutput) ToRuleArrayOutput() RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) ToRuleArrayOutputWithContext(ctx context.Context) RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) Index(i pulumi.IntInput) RuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Rule {
		return vs[0].([]*Rule)[vs[1].(int)]
	}).(RuleOutput)
}

type RuleMapOutput struct{ *pulumi.OutputState }

func (RuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rule)(nil)).Elem()
}

func (o RuleMapOutput) ToRuleMapOutput() RuleMapOutput {
	return o
}

func (o RuleMapOutput) ToRuleMapOutputWithContext(ctx context.Context) RuleMapOutput {
	return o
}

func (o RuleMapOutput) MapIndex(k pulumi.StringInput) RuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Rule {
		return vs[0].(map[string]*Rule)[vs[1].(string)]
	}).(RuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuleInput)(nil)).Elem(), &Rule{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleArrayInput)(nil)).Elem(), RuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleMapInput)(nil)).Elem(), RuleMap{})
	pulumi.RegisterOutputType(RuleOutput{})
	pulumi.RegisterOutputType(RuleArrayOutput{})
	pulumi.RegisterOutputType(RuleMapOutput{})
}
