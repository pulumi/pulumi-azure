// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Nested Endpoint within a Traffic Manager Profile.
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
//			_, err = network.NewPublicIp(ctx, "example", &network.PublicIpArgs{
//				Name:              pulumi.String("example-publicip"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				AllocationMethod:  pulumi.String("Static"),
//				DomainNameLabel:   pulumi.String("example-pip"),
//			})
//			if err != nil {
//				return err
//			}
//			parent, err := network.NewTrafficManagerProfile(ctx, "parent", &network.TrafficManagerProfileArgs{
//				Name:                 pulumi.String("parent-profile"),
//				ResourceGroupName:    example.Name,
//				TrafficRoutingMethod: pulumi.String("Weighted"),
//				DnsConfig: &network.TrafficManagerProfileDnsConfigArgs{
//					RelativeName: pulumi.String("parent-profile"),
//					Ttl:          pulumi.Int(100),
//				},
//				MonitorConfig: &network.TrafficManagerProfileMonitorConfigArgs{
//					Protocol:                  pulumi.String("HTTP"),
//					Port:                      pulumi.Int(80),
//					Path:                      pulumi.String("/"),
//					IntervalInSeconds:         pulumi.Int(30),
//					TimeoutInSeconds:          pulumi.Int(9),
//					ToleratedNumberOfFailures: pulumi.Int(3),
//				},
//				Tags: pulumi.StringMap{
//					"environment": pulumi.String("Production"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			nested, err := network.NewTrafficManagerProfile(ctx, "nested", &network.TrafficManagerProfileArgs{
//				Name:                 pulumi.String("nested-profile"),
//				ResourceGroupName:    example.Name,
//				TrafficRoutingMethod: pulumi.String("Priority"),
//				DnsConfig: &network.TrafficManagerProfileDnsConfigArgs{
//					RelativeName: pulumi.String("nested-profile"),
//					Ttl:          pulumi.Int(30),
//				},
//				MonitorConfig: &network.TrafficManagerProfileMonitorConfigArgs{
//					Protocol: pulumi.String("HTTP"),
//					Port:     pulumi.Int(443),
//					Path:     pulumi.String("/"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = network.NewTrafficManagerNestedEndpoint(ctx, "example", &network.TrafficManagerNestedEndpointArgs{
//				Name:                  pulumi.String("example-endpoint"),
//				TargetResourceId:      nested.ID(),
//				Priority:              pulumi.Int(1),
//				ProfileId:             parent.ID(),
//				MinimumChildEndpoints: pulumi.Int(9),
//				Weight:                pulumi.Int(5),
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
// * `Microsoft.Network`: 2022-04-01
//
// ## Import
//
// Nested Endpoints can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:network/trafficManagerNestedEndpoint:TrafficManagerNestedEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-resources/providers/Microsoft.Network/trafficManagerProfiles/example-profile/NestedEndpoints/example-endpoint
// ```
type TrafficManagerNestedEndpoint struct {
	pulumi.CustomResourceState

	// One or more `customHeader` blocks as defined below.
	CustomHeaders TrafficManagerNestedEndpointCustomHeaderArrayOutput `pulumi:"customHeaders"`
	// Is the endpoint enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Specifies the Azure location of the Endpoint, this must be specified for Profiles using the `Performance` routing method.
	EndpointLocation pulumi.StringOutput `pulumi:"endpointLocation"`
	// A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
	GeoMappings pulumi.StringArrayOutput `pulumi:"geoMappings"`
	// This argument specifies the minimum number of endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This value must be larger than `0`.
	//
	// > **Note:** If `minChildEndpoints` is less than either `minimumRequiredChildEndpointsIpv4` or `minimumRequiredChildEndpointsIpv6`, then it won't have any effect.
	MinimumChildEndpoints pulumi.IntOutput `pulumi:"minimumChildEndpoints"`
	// This argument specifies the minimum number of IPv4 (DNS record type A) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv4 pulumi.IntPtrOutput `pulumi:"minimumRequiredChildEndpointsIpv4"`
	// This argument specifies the minimum number of IPv6 (DNS record type AAAA) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv6 pulumi.IntPtrOutput `pulumi:"minimumRequiredChildEndpointsIpv6"`
	// The name of the External Endpoint. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
	ProfileId pulumi.StringOutput `pulumi:"profileId"`
	// One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
	Subnets TrafficManagerNestedEndpointSubnetArrayOutput `pulumi:"subnets"`
	// The resource id of an Azure resource to target.
	TargetResourceId pulumi.StringOutput `pulumi:"targetResourceId"`
	// Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
	Weight pulumi.IntPtrOutput `pulumi:"weight"`
}

// NewTrafficManagerNestedEndpoint registers a new resource with the given unique name, arguments, and options.
func NewTrafficManagerNestedEndpoint(ctx *pulumi.Context,
	name string, args *TrafficManagerNestedEndpointArgs, opts ...pulumi.ResourceOption) (*TrafficManagerNestedEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MinimumChildEndpoints == nil {
		return nil, errors.New("invalid value for required argument 'MinimumChildEndpoints'")
	}
	if args.ProfileId == nil {
		return nil, errors.New("invalid value for required argument 'ProfileId'")
	}
	if args.TargetResourceId == nil {
		return nil, errors.New("invalid value for required argument 'TargetResourceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TrafficManagerNestedEndpoint
	err := ctx.RegisterResource("azure:network/trafficManagerNestedEndpoint:TrafficManagerNestedEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTrafficManagerNestedEndpoint gets an existing TrafficManagerNestedEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTrafficManagerNestedEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TrafficManagerNestedEndpointState, opts ...pulumi.ResourceOption) (*TrafficManagerNestedEndpoint, error) {
	var resource TrafficManagerNestedEndpoint
	err := ctx.ReadResource("azure:network/trafficManagerNestedEndpoint:TrafficManagerNestedEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TrafficManagerNestedEndpoint resources.
type trafficManagerNestedEndpointState struct {
	// One or more `customHeader` blocks as defined below.
	CustomHeaders []TrafficManagerNestedEndpointCustomHeader `pulumi:"customHeaders"`
	// Is the endpoint enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// Specifies the Azure location of the Endpoint, this must be specified for Profiles using the `Performance` routing method.
	EndpointLocation *string `pulumi:"endpointLocation"`
	// A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
	GeoMappings []string `pulumi:"geoMappings"`
	// This argument specifies the minimum number of endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This value must be larger than `0`.
	//
	// > **Note:** If `minChildEndpoints` is less than either `minimumRequiredChildEndpointsIpv4` or `minimumRequiredChildEndpointsIpv6`, then it won't have any effect.
	MinimumChildEndpoints *int `pulumi:"minimumChildEndpoints"`
	// This argument specifies the minimum number of IPv4 (DNS record type A) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv4 *int `pulumi:"minimumRequiredChildEndpointsIpv4"`
	// This argument specifies the minimum number of IPv6 (DNS record type AAAA) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv6 *int `pulumi:"minimumRequiredChildEndpointsIpv6"`
	// The name of the External Endpoint. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
	Priority *int `pulumi:"priority"`
	// The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
	ProfileId *string `pulumi:"profileId"`
	// One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
	Subnets []TrafficManagerNestedEndpointSubnet `pulumi:"subnets"`
	// The resource id of an Azure resource to target.
	TargetResourceId *string `pulumi:"targetResourceId"`
	// Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
	Weight *int `pulumi:"weight"`
}

type TrafficManagerNestedEndpointState struct {
	// One or more `customHeader` blocks as defined below.
	CustomHeaders TrafficManagerNestedEndpointCustomHeaderArrayInput
	// Is the endpoint enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// Specifies the Azure location of the Endpoint, this must be specified for Profiles using the `Performance` routing method.
	EndpointLocation pulumi.StringPtrInput
	// A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
	GeoMappings pulumi.StringArrayInput
	// This argument specifies the minimum number of endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This value must be larger than `0`.
	//
	// > **Note:** If `minChildEndpoints` is less than either `minimumRequiredChildEndpointsIpv4` or `minimumRequiredChildEndpointsIpv6`, then it won't have any effect.
	MinimumChildEndpoints pulumi.IntPtrInput
	// This argument specifies the minimum number of IPv4 (DNS record type A) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv4 pulumi.IntPtrInput
	// This argument specifies the minimum number of IPv6 (DNS record type AAAA) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv6 pulumi.IntPtrInput
	// The name of the External Endpoint. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
	Priority pulumi.IntPtrInput
	// The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
	ProfileId pulumi.StringPtrInput
	// One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
	Subnets TrafficManagerNestedEndpointSubnetArrayInput
	// The resource id of an Azure resource to target.
	TargetResourceId pulumi.StringPtrInput
	// Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
	Weight pulumi.IntPtrInput
}

func (TrafficManagerNestedEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*trafficManagerNestedEndpointState)(nil)).Elem()
}

type trafficManagerNestedEndpointArgs struct {
	// One or more `customHeader` blocks as defined below.
	CustomHeaders []TrafficManagerNestedEndpointCustomHeader `pulumi:"customHeaders"`
	// Is the endpoint enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// Specifies the Azure location of the Endpoint, this must be specified for Profiles using the `Performance` routing method.
	EndpointLocation *string `pulumi:"endpointLocation"`
	// A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
	GeoMappings []string `pulumi:"geoMappings"`
	// This argument specifies the minimum number of endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This value must be larger than `0`.
	//
	// > **Note:** If `minChildEndpoints` is less than either `minimumRequiredChildEndpointsIpv4` or `minimumRequiredChildEndpointsIpv6`, then it won't have any effect.
	MinimumChildEndpoints int `pulumi:"minimumChildEndpoints"`
	// This argument specifies the minimum number of IPv4 (DNS record type A) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv4 *int `pulumi:"minimumRequiredChildEndpointsIpv4"`
	// This argument specifies the minimum number of IPv6 (DNS record type AAAA) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv6 *int `pulumi:"minimumRequiredChildEndpointsIpv6"`
	// The name of the External Endpoint. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
	Priority *int `pulumi:"priority"`
	// The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
	ProfileId string `pulumi:"profileId"`
	// One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
	Subnets []TrafficManagerNestedEndpointSubnet `pulumi:"subnets"`
	// The resource id of an Azure resource to target.
	TargetResourceId string `pulumi:"targetResourceId"`
	// Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
	Weight *int `pulumi:"weight"`
}

// The set of arguments for constructing a TrafficManagerNestedEndpoint resource.
type TrafficManagerNestedEndpointArgs struct {
	// One or more `customHeader` blocks as defined below.
	CustomHeaders TrafficManagerNestedEndpointCustomHeaderArrayInput
	// Is the endpoint enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// Specifies the Azure location of the Endpoint, this must be specified for Profiles using the `Performance` routing method.
	EndpointLocation pulumi.StringPtrInput
	// A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
	GeoMappings pulumi.StringArrayInput
	// This argument specifies the minimum number of endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This value must be larger than `0`.
	//
	// > **Note:** If `minChildEndpoints` is less than either `minimumRequiredChildEndpointsIpv4` or `minimumRequiredChildEndpointsIpv6`, then it won't have any effect.
	MinimumChildEndpoints pulumi.IntInput
	// This argument specifies the minimum number of IPv4 (DNS record type A) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv4 pulumi.IntPtrInput
	// This argument specifies the minimum number of IPv6 (DNS record type AAAA) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
	MinimumRequiredChildEndpointsIpv6 pulumi.IntPtrInput
	// The name of the External Endpoint. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
	Priority pulumi.IntPtrInput
	// The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
	ProfileId pulumi.StringInput
	// One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
	Subnets TrafficManagerNestedEndpointSubnetArrayInput
	// The resource id of an Azure resource to target.
	TargetResourceId pulumi.StringInput
	// Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
	Weight pulumi.IntPtrInput
}

func (TrafficManagerNestedEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*trafficManagerNestedEndpointArgs)(nil)).Elem()
}

type TrafficManagerNestedEndpointInput interface {
	pulumi.Input

	ToTrafficManagerNestedEndpointOutput() TrafficManagerNestedEndpointOutput
	ToTrafficManagerNestedEndpointOutputWithContext(ctx context.Context) TrafficManagerNestedEndpointOutput
}

func (*TrafficManagerNestedEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**TrafficManagerNestedEndpoint)(nil)).Elem()
}

func (i *TrafficManagerNestedEndpoint) ToTrafficManagerNestedEndpointOutput() TrafficManagerNestedEndpointOutput {
	return i.ToTrafficManagerNestedEndpointOutputWithContext(context.Background())
}

func (i *TrafficManagerNestedEndpoint) ToTrafficManagerNestedEndpointOutputWithContext(ctx context.Context) TrafficManagerNestedEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficManagerNestedEndpointOutput)
}

// TrafficManagerNestedEndpointArrayInput is an input type that accepts TrafficManagerNestedEndpointArray and TrafficManagerNestedEndpointArrayOutput values.
// You can construct a concrete instance of `TrafficManagerNestedEndpointArrayInput` via:
//
//	TrafficManagerNestedEndpointArray{ TrafficManagerNestedEndpointArgs{...} }
type TrafficManagerNestedEndpointArrayInput interface {
	pulumi.Input

	ToTrafficManagerNestedEndpointArrayOutput() TrafficManagerNestedEndpointArrayOutput
	ToTrafficManagerNestedEndpointArrayOutputWithContext(context.Context) TrafficManagerNestedEndpointArrayOutput
}

type TrafficManagerNestedEndpointArray []TrafficManagerNestedEndpointInput

func (TrafficManagerNestedEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrafficManagerNestedEndpoint)(nil)).Elem()
}

func (i TrafficManagerNestedEndpointArray) ToTrafficManagerNestedEndpointArrayOutput() TrafficManagerNestedEndpointArrayOutput {
	return i.ToTrafficManagerNestedEndpointArrayOutputWithContext(context.Background())
}

func (i TrafficManagerNestedEndpointArray) ToTrafficManagerNestedEndpointArrayOutputWithContext(ctx context.Context) TrafficManagerNestedEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficManagerNestedEndpointArrayOutput)
}

// TrafficManagerNestedEndpointMapInput is an input type that accepts TrafficManagerNestedEndpointMap and TrafficManagerNestedEndpointMapOutput values.
// You can construct a concrete instance of `TrafficManagerNestedEndpointMapInput` via:
//
//	TrafficManagerNestedEndpointMap{ "key": TrafficManagerNestedEndpointArgs{...} }
type TrafficManagerNestedEndpointMapInput interface {
	pulumi.Input

	ToTrafficManagerNestedEndpointMapOutput() TrafficManagerNestedEndpointMapOutput
	ToTrafficManagerNestedEndpointMapOutputWithContext(context.Context) TrafficManagerNestedEndpointMapOutput
}

type TrafficManagerNestedEndpointMap map[string]TrafficManagerNestedEndpointInput

func (TrafficManagerNestedEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrafficManagerNestedEndpoint)(nil)).Elem()
}

func (i TrafficManagerNestedEndpointMap) ToTrafficManagerNestedEndpointMapOutput() TrafficManagerNestedEndpointMapOutput {
	return i.ToTrafficManagerNestedEndpointMapOutputWithContext(context.Background())
}

func (i TrafficManagerNestedEndpointMap) ToTrafficManagerNestedEndpointMapOutputWithContext(ctx context.Context) TrafficManagerNestedEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TrafficManagerNestedEndpointMapOutput)
}

type TrafficManagerNestedEndpointOutput struct{ *pulumi.OutputState }

func (TrafficManagerNestedEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TrafficManagerNestedEndpoint)(nil)).Elem()
}

func (o TrafficManagerNestedEndpointOutput) ToTrafficManagerNestedEndpointOutput() TrafficManagerNestedEndpointOutput {
	return o
}

func (o TrafficManagerNestedEndpointOutput) ToTrafficManagerNestedEndpointOutputWithContext(ctx context.Context) TrafficManagerNestedEndpointOutput {
	return o
}

// One or more `customHeader` blocks as defined below.
func (o TrafficManagerNestedEndpointOutput) CustomHeaders() TrafficManagerNestedEndpointCustomHeaderArrayOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) TrafficManagerNestedEndpointCustomHeaderArrayOutput {
		return v.CustomHeaders
	}).(TrafficManagerNestedEndpointCustomHeaderArrayOutput)
}

// Is the endpoint enabled? Defaults to `true`.
func (o TrafficManagerNestedEndpointOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Specifies the Azure location of the Endpoint, this must be specified for Profiles using the `Performance` routing method.
func (o TrafficManagerNestedEndpointOutput) EndpointLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.StringOutput { return v.EndpointLocation }).(pulumi.StringOutput)
}

// A list of Geographic Regions used to distribute traffic, such as `WORLD`, `UK` or `DE`. The same location can't be specified in two endpoints. [See the Geographic Hierarchies documentation for more information](https://docs.microsoft.com/rest/api/trafficmanager/geographichierarchies/getdefault).
func (o TrafficManagerNestedEndpointOutput) GeoMappings() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.StringArrayOutput { return v.GeoMappings }).(pulumi.StringArrayOutput)
}

// This argument specifies the minimum number of endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This value must be larger than `0`.
//
// > **Note:** If `minChildEndpoints` is less than either `minimumRequiredChildEndpointsIpv4` or `minimumRequiredChildEndpointsIpv6`, then it won't have any effect.
func (o TrafficManagerNestedEndpointOutput) MinimumChildEndpoints() pulumi.IntOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.IntOutput { return v.MinimumChildEndpoints }).(pulumi.IntOutput)
}

// This argument specifies the minimum number of IPv4 (DNS record type A) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
func (o TrafficManagerNestedEndpointOutput) MinimumRequiredChildEndpointsIpv4() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.IntPtrOutput { return v.MinimumRequiredChildEndpointsIpv4 }).(pulumi.IntPtrOutput)
}

// This argument specifies the minimum number of IPv6 (DNS record type AAAA) endpoints that must be ‘online’ in the child profile in order for the parent profile to direct traffic to any of the endpoints in that child profile. This argument only applies to Endpoints of type `nestedEndpoints` and
func (o TrafficManagerNestedEndpointOutput) MinimumRequiredChildEndpointsIpv6() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.IntPtrOutput { return v.MinimumRequiredChildEndpointsIpv6 }).(pulumi.IntPtrOutput)
}

// The name of the External Endpoint. Changing this forces a new resource to be created.
func (o TrafficManagerNestedEndpointOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the priority of this Endpoint, this must be specified for Profiles using the `Priority` traffic routing method. Supports values between 1 and 1000, with no Endpoints sharing the same value. If omitted the value will be computed in order of creation.
func (o TrafficManagerNestedEndpointOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// The ID of the Traffic Manager Profile that this External Endpoint should be created within. Changing this forces a new resource to be created.
func (o TrafficManagerNestedEndpointOutput) ProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.StringOutput { return v.ProfileId }).(pulumi.StringOutput)
}

// One or more `subnet` blocks as defined below. Changing this forces a new resource to be created.
func (o TrafficManagerNestedEndpointOutput) Subnets() TrafficManagerNestedEndpointSubnetArrayOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) TrafficManagerNestedEndpointSubnetArrayOutput { return v.Subnets }).(TrafficManagerNestedEndpointSubnetArrayOutput)
}

// The resource id of an Azure resource to target.
func (o TrafficManagerNestedEndpointOutput) TargetResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.StringOutput { return v.TargetResourceId }).(pulumi.StringOutput)
}

// Specifies how much traffic should be distributed to this endpoint, this must be specified for Profiles using the Weighted traffic routing method. Valid values are between `1` and `1000`. Defaults to `1`.
func (o TrafficManagerNestedEndpointOutput) Weight() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TrafficManagerNestedEndpoint) pulumi.IntPtrOutput { return v.Weight }).(pulumi.IntPtrOutput)
}

type TrafficManagerNestedEndpointArrayOutput struct{ *pulumi.OutputState }

func (TrafficManagerNestedEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TrafficManagerNestedEndpoint)(nil)).Elem()
}

func (o TrafficManagerNestedEndpointArrayOutput) ToTrafficManagerNestedEndpointArrayOutput() TrafficManagerNestedEndpointArrayOutput {
	return o
}

func (o TrafficManagerNestedEndpointArrayOutput) ToTrafficManagerNestedEndpointArrayOutputWithContext(ctx context.Context) TrafficManagerNestedEndpointArrayOutput {
	return o
}

func (o TrafficManagerNestedEndpointArrayOutput) Index(i pulumi.IntInput) TrafficManagerNestedEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TrafficManagerNestedEndpoint {
		return vs[0].([]*TrafficManagerNestedEndpoint)[vs[1].(int)]
	}).(TrafficManagerNestedEndpointOutput)
}

type TrafficManagerNestedEndpointMapOutput struct{ *pulumi.OutputState }

func (TrafficManagerNestedEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TrafficManagerNestedEndpoint)(nil)).Elem()
}

func (o TrafficManagerNestedEndpointMapOutput) ToTrafficManagerNestedEndpointMapOutput() TrafficManagerNestedEndpointMapOutput {
	return o
}

func (o TrafficManagerNestedEndpointMapOutput) ToTrafficManagerNestedEndpointMapOutputWithContext(ctx context.Context) TrafficManagerNestedEndpointMapOutput {
	return o
}

func (o TrafficManagerNestedEndpointMapOutput) MapIndex(k pulumi.StringInput) TrafficManagerNestedEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TrafficManagerNestedEndpoint {
		return vs[0].(map[string]*TrafficManagerNestedEndpoint)[vs[1].(string)]
	}).(TrafficManagerNestedEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficManagerNestedEndpointInput)(nil)).Elem(), &TrafficManagerNestedEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficManagerNestedEndpointArrayInput)(nil)).Elem(), TrafficManagerNestedEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TrafficManagerNestedEndpointMapInput)(nil)).Elem(), TrafficManagerNestedEndpointMap{})
	pulumi.RegisterOutputType(TrafficManagerNestedEndpointOutput{})
	pulumi.RegisterOutputType(TrafficManagerNestedEndpointArrayOutput{})
	pulumi.RegisterOutputType(TrafficManagerNestedEndpointMapOutput{})
}
