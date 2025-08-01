// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cdn

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Front Door (standard/premium) Origin.
//
// !> **Note:** If you are attempting to implement an Origin that uses its own Private Link Service with a Load Balancer the Profile resource in your configuration file **must** have a `dependsOn` meta-argument which references the `privatedns.LinkService`, see `Example Usage With Private Link Service` below.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cdn"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
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
//			exampleFrontdoorProfile, err := cdn.NewFrontdoorProfile(ctx, "example", &cdn.FrontdoorProfileArgs{
//				Name:              pulumi.String("example-profile"),
//				ResourceGroupName: example.Name,
//				SkuName:           pulumi.String("Premium_AzureFrontDoor"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorOriginGroup, err := cdn.NewFrontdoorOriginGroup(ctx, "example", &cdn.FrontdoorOriginGroupArgs{
//				Name:                  pulumi.String("example-origingroup"),
//				CdnFrontdoorProfileId: exampleFrontdoorProfile.ID(),
//				LoadBalancing:         &cdn.FrontdoorOriginGroupLoadBalancingArgs{},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cdn.NewFrontdoorOrigin(ctx, "example", &cdn.FrontdoorOriginArgs{
//				Name:                        pulumi.String("example-origin"),
//				CdnFrontdoorOriginGroupId:   exampleFrontdoorOriginGroup.ID(),
//				Enabled:                     pulumi.Bool(true),
//				CertificateNameCheckEnabled: pulumi.Bool(false),
//				HostName:                    pulumi.String("contoso.com"),
//				HttpPort:                    pulumi.Int(80),
//				HttpsPort:                   pulumi.Int(443),
//				OriginHostHeader:            pulumi.String("www.contoso.com"),
//				Priority:                    pulumi.Int(1),
//				Weight:                      pulumi.Int(1),
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
// ### With Private Link
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cdn"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
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
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                       pulumi.String("examplestoracc"),
//				ResourceGroupName:          example.Name,
//				Location:                   example.Location,
//				AccountTier:                pulumi.String("Premium"),
//				AccountReplicationType:     pulumi.String("LRS"),
//				AllowNestedItemsToBePublic: pulumi.Bool(false),
//				NetworkRules: &storage.AccountNetworkRulesTypeArgs{
//					DefaultAction: pulumi.String("Deny"),
//				},
//				Tags: pulumi.StringMap{
//					"environment": pulumi.String("Example"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorProfile, err := cdn.NewFrontdoorProfile(ctx, "example", &cdn.FrontdoorProfileArgs{
//				Name:              pulumi.String("example-profile"),
//				ResourceGroupName: example.Name,
//				SkuName:           pulumi.String("Premium_AzureFrontDoor"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorOriginGroup, err := cdn.NewFrontdoorOriginGroup(ctx, "example", &cdn.FrontdoorOriginGroupArgs{
//				Name:                  pulumi.String("example-origin-group"),
//				CdnFrontdoorProfileId: exampleFrontdoorProfile.ID(),
//				LoadBalancing:         &cdn.FrontdoorOriginGroupLoadBalancingArgs{},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cdn.NewFrontdoorOrigin(ctx, "example", &cdn.FrontdoorOriginArgs{
//				Name:                        pulumi.String("example-origin"),
//				CdnFrontdoorOriginGroupId:   exampleFrontdoorOriginGroup.ID(),
//				Enabled:                     pulumi.Bool(true),
//				CertificateNameCheckEnabled: pulumi.Bool(true),
//				HostName:                    exampleAccount.PrimaryBlobHost,
//				OriginHostHeader:            exampleAccount.PrimaryBlobHost,
//				Priority:                    pulumi.Int(1),
//				Weight:                      pulumi.Int(500),
//				PrivateLink: &cdn.FrontdoorOriginPrivateLinkArgs{
//					RequestMessage:      pulumi.String("Request access for Private Link Origin CDN Frontdoor"),
//					TargetType:          pulumi.String("blob"),
//					Location:            exampleAccount.Location,
//					PrivateLinkTargetId: exampleAccount.ID(),
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
// ### With Private Link Service
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cdn"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/lb"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/privatedns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			current, err := core.GetClientConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "example", &network.VirtualNetworkArgs{
//				Name:              pulumi.String("vn-example"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.5.0.0/16"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleSubnet, err := network.NewSubnet(ctx, "example", &network.SubnetArgs{
//				Name:               pulumi.String("sn-example"),
//				ResourceGroupName:  example.Name,
//				VirtualNetworkName: exampleVirtualNetwork.Name,
//				AddressPrefixes: pulumi.StringArray{
//					pulumi.String("10.5.1.0/24"),
//				},
//				PrivateLinkServiceNetworkPoliciesEnabled: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			examplePublicIp, err := network.NewPublicIp(ctx, "example", &network.PublicIpArgs{
//				Name:              pulumi.String("ip-example"),
//				Sku:               pulumi.String("Standard"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				AllocationMethod:  pulumi.String("Static"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleLoadBalancer, err := lb.NewLoadBalancer(ctx, "example", &lb.LoadBalancerArgs{
//				Name:              pulumi.String("lb-example"),
//				Sku:               pulumi.String("Standard"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				FrontendIpConfigurations: lb.LoadBalancerFrontendIpConfigurationArray{
//					&lb.LoadBalancerFrontendIpConfigurationArgs{
//						Name:              examplePublicIp.Name,
//						PublicIpAddressId: examplePublicIp.ID(),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleLinkService, err := privatedns.NewLinkService(ctx, "example", &privatedns.LinkServiceArgs{
//				Name:              pulumi.String("pls-example"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				VisibilitySubscriptionIds: pulumi.StringArray{
//					pulumi.String(current.SubscriptionId),
//				},
//				LoadBalancerFrontendIpConfigurationIds: pulumi.StringArray{
//					pulumi.String(exampleLoadBalancer.FrontendIpConfigurations.ApplyT(func(frontendIpConfigurations []lb.LoadBalancerFrontendIpConfiguration) (*string, error) {
//						return &frontendIpConfigurations[0].Id, nil
//					}).(pulumi.StringPtrOutput)),
//				},
//				NatIpConfigurations: privatedns.LinkServiceNatIpConfigurationArray{
//					&privatedns.LinkServiceNatIpConfigurationArgs{
//						Name:                    pulumi.String("primary"),
//						PrivateIpAddress:        pulumi.String("10.5.1.17"),
//						PrivateIpAddressVersion: pulumi.String("IPv4"),
//						SubnetId:                exampleSubnet.ID(),
//						Primary:                 pulumi.Bool(true),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorProfile, err := cdn.NewFrontdoorProfile(ctx, "example", &cdn.FrontdoorProfileArgs{
//				Name:              pulumi.String("profile-example"),
//				ResourceGroupName: example.Name,
//				SkuName:           pulumi.String("Premium_AzureFrontDoor"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleLinkService,
//			}))
//			if err != nil {
//				return err
//			}
//			exampleFrontdoorOriginGroup, err := cdn.NewFrontdoorOriginGroup(ctx, "example", &cdn.FrontdoorOriginGroupArgs{
//				Name:                  pulumi.String("group-example"),
//				CdnFrontdoorProfileId: exampleFrontdoorProfile.ID(),
//				LoadBalancing: &cdn.FrontdoorOriginGroupLoadBalancingArgs{
//					AdditionalLatencyInMilliseconds: pulumi.Int(0),
//					SampleSize:                      pulumi.Int(16),
//					SuccessfulSamplesRequired:       pulumi.Int(3),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cdn.NewFrontdoorOrigin(ctx, "example", &cdn.FrontdoorOriginArgs{
//				Name:                        pulumi.String("origin-example"),
//				CdnFrontdoorOriginGroupId:   exampleFrontdoorOriginGroup.ID(),
//				Enabled:                     pulumi.Bool(true),
//				HostName:                    pulumi.String("example.com"),
//				OriginHostHeader:            pulumi.String("example.com"),
//				Priority:                    pulumi.Int(1),
//				Weight:                      pulumi.Int(1000),
//				CertificateNameCheckEnabled: pulumi.Bool(false),
//				PrivateLink: &cdn.FrontdoorOriginPrivateLinkArgs{
//					RequestMessage:      pulumi.String("Request access for Private Link Origin CDN Frontdoor"),
//					Location:            example.Location,
//					PrivateLinkTargetId: exampleLinkService.ID(),
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
// ## Example HCL Configurations
//
// * Private Link Origin with Storage Account Blob
// * Private Link Origin with Storage Account Static Web Site
// * Private Link Origin with Linux Web Application
// * Private Link Origin with Internal Load Balancer
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Cdn`: 2024-02-01
//
// ## Import
//
// Front Door Origins can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cdn/frontdoorOrigin:FrontdoorOrigin example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/originGroups/originGroup1/origins/origin1
// ```
type FrontdoorOrigin struct {
	pulumi.CustomResourceState

	// The ID of the Front Door Origin Group within which this Front Door Origin should exist. Changing this forces a new Front Door Origin to be created.
	CdnFrontdoorOriginGroupId pulumi.StringOutput `pulumi:"cdnFrontdoorOriginGroupId"`
	// Specifies whether certificate name checks are enabled for this origin.
	CertificateNameCheckEnabled pulumi.BoolOutput `pulumi:"certificateNameCheckEnabled"`
	// Should the origin be enabled? Possible values are `true` or `false`. Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The IPv4 address, IPv6 address or Domain name of the Origin.
	//
	// !> **Note:** This must be unique across all Front Door Origins within a Front Door Endpoint.
	HostName pulumi.StringOutput `pulumi:"hostName"`
	// The value of the HTTP port. Must be between `1` and `65535`. Defaults to `80`.
	HttpPort pulumi.IntPtrOutput `pulumi:"httpPort"`
	// The value of the HTTPS port. Must be between `1` and `65535`. Defaults to `443`.
	HttpsPort pulumi.IntPtrOutput `pulumi:"httpsPort"`
	// The name which should be used for this Front Door Origin. Changing this forces a new Front Door Origin to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The host header value (an IPv4 address, IPv6 address or Domain name) which is sent to the origin with each request. If unspecified the hostname from the request will be used.
	//
	// > **Note:** Azure Front Door Origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin's hostname. This field's value overrides the host header defined in the Front Door Endpoint. For more information on how to properly set the origin host header value please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/origin?pivots=front-door-standard-premium#origin-host-header).
	OriginHostHeader pulumi.StringPtrOutput `pulumi:"originHostHeader"`
	// Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy. Must be between `1` and `5` (inclusive). Defaults to `1`.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// A `privateLink` block as defined below.
	//
	// > **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
	PrivateLink FrontdoorOriginPrivateLinkPtrOutput `pulumi:"privateLink"`
	// The weight of the origin in a given origin group for load balancing. Must be between `1` and `1000`. Defaults to `500`.
	Weight pulumi.IntPtrOutput `pulumi:"weight"`
}

// NewFrontdoorOrigin registers a new resource with the given unique name, arguments, and options.
func NewFrontdoorOrigin(ctx *pulumi.Context,
	name string, args *FrontdoorOriginArgs, opts ...pulumi.ResourceOption) (*FrontdoorOrigin, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CdnFrontdoorOriginGroupId == nil {
		return nil, errors.New("invalid value for required argument 'CdnFrontdoorOriginGroupId'")
	}
	if args.CertificateNameCheckEnabled == nil {
		return nil, errors.New("invalid value for required argument 'CertificateNameCheckEnabled'")
	}
	if args.HostName == nil {
		return nil, errors.New("invalid value for required argument 'HostName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FrontdoorOrigin
	err := ctx.RegisterResource("azure:cdn/frontdoorOrigin:FrontdoorOrigin", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFrontdoorOrigin gets an existing FrontdoorOrigin resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFrontdoorOrigin(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FrontdoorOriginState, opts ...pulumi.ResourceOption) (*FrontdoorOrigin, error) {
	var resource FrontdoorOrigin
	err := ctx.ReadResource("azure:cdn/frontdoorOrigin:FrontdoorOrigin", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FrontdoorOrigin resources.
type frontdoorOriginState struct {
	// The ID of the Front Door Origin Group within which this Front Door Origin should exist. Changing this forces a new Front Door Origin to be created.
	CdnFrontdoorOriginGroupId *string `pulumi:"cdnFrontdoorOriginGroupId"`
	// Specifies whether certificate name checks are enabled for this origin.
	CertificateNameCheckEnabled *bool `pulumi:"certificateNameCheckEnabled"`
	// Should the origin be enabled? Possible values are `true` or `false`. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The IPv4 address, IPv6 address or Domain name of the Origin.
	//
	// !> **Note:** This must be unique across all Front Door Origins within a Front Door Endpoint.
	HostName *string `pulumi:"hostName"`
	// The value of the HTTP port. Must be between `1` and `65535`. Defaults to `80`.
	HttpPort *int `pulumi:"httpPort"`
	// The value of the HTTPS port. Must be between `1` and `65535`. Defaults to `443`.
	HttpsPort *int `pulumi:"httpsPort"`
	// The name which should be used for this Front Door Origin. Changing this forces a new Front Door Origin to be created.
	Name *string `pulumi:"name"`
	// The host header value (an IPv4 address, IPv6 address or Domain name) which is sent to the origin with each request. If unspecified the hostname from the request will be used.
	//
	// > **Note:** Azure Front Door Origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin's hostname. This field's value overrides the host header defined in the Front Door Endpoint. For more information on how to properly set the origin host header value please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/origin?pivots=front-door-standard-premium#origin-host-header).
	OriginHostHeader *string `pulumi:"originHostHeader"`
	// Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy. Must be between `1` and `5` (inclusive). Defaults to `1`.
	Priority *int `pulumi:"priority"`
	// A `privateLink` block as defined below.
	//
	// > **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
	PrivateLink *FrontdoorOriginPrivateLink `pulumi:"privateLink"`
	// The weight of the origin in a given origin group for load balancing. Must be between `1` and `1000`. Defaults to `500`.
	Weight *int `pulumi:"weight"`
}

type FrontdoorOriginState struct {
	// The ID of the Front Door Origin Group within which this Front Door Origin should exist. Changing this forces a new Front Door Origin to be created.
	CdnFrontdoorOriginGroupId pulumi.StringPtrInput
	// Specifies whether certificate name checks are enabled for this origin.
	CertificateNameCheckEnabled pulumi.BoolPtrInput
	// Should the origin be enabled? Possible values are `true` or `false`. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The IPv4 address, IPv6 address or Domain name of the Origin.
	//
	// !> **Note:** This must be unique across all Front Door Origins within a Front Door Endpoint.
	HostName pulumi.StringPtrInput
	// The value of the HTTP port. Must be between `1` and `65535`. Defaults to `80`.
	HttpPort pulumi.IntPtrInput
	// The value of the HTTPS port. Must be between `1` and `65535`. Defaults to `443`.
	HttpsPort pulumi.IntPtrInput
	// The name which should be used for this Front Door Origin. Changing this forces a new Front Door Origin to be created.
	Name pulumi.StringPtrInput
	// The host header value (an IPv4 address, IPv6 address or Domain name) which is sent to the origin with each request. If unspecified the hostname from the request will be used.
	//
	// > **Note:** Azure Front Door Origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin's hostname. This field's value overrides the host header defined in the Front Door Endpoint. For more information on how to properly set the origin host header value please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/origin?pivots=front-door-standard-premium#origin-host-header).
	OriginHostHeader pulumi.StringPtrInput
	// Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy. Must be between `1` and `5` (inclusive). Defaults to `1`.
	Priority pulumi.IntPtrInput
	// A `privateLink` block as defined below.
	//
	// > **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
	PrivateLink FrontdoorOriginPrivateLinkPtrInput
	// The weight of the origin in a given origin group for load balancing. Must be between `1` and `1000`. Defaults to `500`.
	Weight pulumi.IntPtrInput
}

func (FrontdoorOriginState) ElementType() reflect.Type {
	return reflect.TypeOf((*frontdoorOriginState)(nil)).Elem()
}

type frontdoorOriginArgs struct {
	// The ID of the Front Door Origin Group within which this Front Door Origin should exist. Changing this forces a new Front Door Origin to be created.
	CdnFrontdoorOriginGroupId string `pulumi:"cdnFrontdoorOriginGroupId"`
	// Specifies whether certificate name checks are enabled for this origin.
	CertificateNameCheckEnabled bool `pulumi:"certificateNameCheckEnabled"`
	// Should the origin be enabled? Possible values are `true` or `false`. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The IPv4 address, IPv6 address or Domain name of the Origin.
	//
	// !> **Note:** This must be unique across all Front Door Origins within a Front Door Endpoint.
	HostName string `pulumi:"hostName"`
	// The value of the HTTP port. Must be between `1` and `65535`. Defaults to `80`.
	HttpPort *int `pulumi:"httpPort"`
	// The value of the HTTPS port. Must be between `1` and `65535`. Defaults to `443`.
	HttpsPort *int `pulumi:"httpsPort"`
	// The name which should be used for this Front Door Origin. Changing this forces a new Front Door Origin to be created.
	Name *string `pulumi:"name"`
	// The host header value (an IPv4 address, IPv6 address or Domain name) which is sent to the origin with each request. If unspecified the hostname from the request will be used.
	//
	// > **Note:** Azure Front Door Origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin's hostname. This field's value overrides the host header defined in the Front Door Endpoint. For more information on how to properly set the origin host header value please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/origin?pivots=front-door-standard-premium#origin-host-header).
	OriginHostHeader *string `pulumi:"originHostHeader"`
	// Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy. Must be between `1` and `5` (inclusive). Defaults to `1`.
	Priority *int `pulumi:"priority"`
	// A `privateLink` block as defined below.
	//
	// > **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
	PrivateLink *FrontdoorOriginPrivateLink `pulumi:"privateLink"`
	// The weight of the origin in a given origin group for load balancing. Must be between `1` and `1000`. Defaults to `500`.
	Weight *int `pulumi:"weight"`
}

// The set of arguments for constructing a FrontdoorOrigin resource.
type FrontdoorOriginArgs struct {
	// The ID of the Front Door Origin Group within which this Front Door Origin should exist. Changing this forces a new Front Door Origin to be created.
	CdnFrontdoorOriginGroupId pulumi.StringInput
	// Specifies whether certificate name checks are enabled for this origin.
	CertificateNameCheckEnabled pulumi.BoolInput
	// Should the origin be enabled? Possible values are `true` or `false`. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The IPv4 address, IPv6 address or Domain name of the Origin.
	//
	// !> **Note:** This must be unique across all Front Door Origins within a Front Door Endpoint.
	HostName pulumi.StringInput
	// The value of the HTTP port. Must be between `1` and `65535`. Defaults to `80`.
	HttpPort pulumi.IntPtrInput
	// The value of the HTTPS port. Must be between `1` and `65535`. Defaults to `443`.
	HttpsPort pulumi.IntPtrInput
	// The name which should be used for this Front Door Origin. Changing this forces a new Front Door Origin to be created.
	Name pulumi.StringPtrInput
	// The host header value (an IPv4 address, IPv6 address or Domain name) which is sent to the origin with each request. If unspecified the hostname from the request will be used.
	//
	// > **Note:** Azure Front Door Origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin's hostname. This field's value overrides the host header defined in the Front Door Endpoint. For more information on how to properly set the origin host header value please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/origin?pivots=front-door-standard-premium#origin-host-header).
	OriginHostHeader pulumi.StringPtrInput
	// Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy. Must be between `1` and `5` (inclusive). Defaults to `1`.
	Priority pulumi.IntPtrInput
	// A `privateLink` block as defined below.
	//
	// > **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
	PrivateLink FrontdoorOriginPrivateLinkPtrInput
	// The weight of the origin in a given origin group for load balancing. Must be between `1` and `1000`. Defaults to `500`.
	Weight pulumi.IntPtrInput
}

func (FrontdoorOriginArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*frontdoorOriginArgs)(nil)).Elem()
}

type FrontdoorOriginInput interface {
	pulumi.Input

	ToFrontdoorOriginOutput() FrontdoorOriginOutput
	ToFrontdoorOriginOutputWithContext(ctx context.Context) FrontdoorOriginOutput
}

func (*FrontdoorOrigin) ElementType() reflect.Type {
	return reflect.TypeOf((**FrontdoorOrigin)(nil)).Elem()
}

func (i *FrontdoorOrigin) ToFrontdoorOriginOutput() FrontdoorOriginOutput {
	return i.ToFrontdoorOriginOutputWithContext(context.Background())
}

func (i *FrontdoorOrigin) ToFrontdoorOriginOutputWithContext(ctx context.Context) FrontdoorOriginOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorOriginOutput)
}

// FrontdoorOriginArrayInput is an input type that accepts FrontdoorOriginArray and FrontdoorOriginArrayOutput values.
// You can construct a concrete instance of `FrontdoorOriginArrayInput` via:
//
//	FrontdoorOriginArray{ FrontdoorOriginArgs{...} }
type FrontdoorOriginArrayInput interface {
	pulumi.Input

	ToFrontdoorOriginArrayOutput() FrontdoorOriginArrayOutput
	ToFrontdoorOriginArrayOutputWithContext(context.Context) FrontdoorOriginArrayOutput
}

type FrontdoorOriginArray []FrontdoorOriginInput

func (FrontdoorOriginArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FrontdoorOrigin)(nil)).Elem()
}

func (i FrontdoorOriginArray) ToFrontdoorOriginArrayOutput() FrontdoorOriginArrayOutput {
	return i.ToFrontdoorOriginArrayOutputWithContext(context.Background())
}

func (i FrontdoorOriginArray) ToFrontdoorOriginArrayOutputWithContext(ctx context.Context) FrontdoorOriginArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorOriginArrayOutput)
}

// FrontdoorOriginMapInput is an input type that accepts FrontdoorOriginMap and FrontdoorOriginMapOutput values.
// You can construct a concrete instance of `FrontdoorOriginMapInput` via:
//
//	FrontdoorOriginMap{ "key": FrontdoorOriginArgs{...} }
type FrontdoorOriginMapInput interface {
	pulumi.Input

	ToFrontdoorOriginMapOutput() FrontdoorOriginMapOutput
	ToFrontdoorOriginMapOutputWithContext(context.Context) FrontdoorOriginMapOutput
}

type FrontdoorOriginMap map[string]FrontdoorOriginInput

func (FrontdoorOriginMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FrontdoorOrigin)(nil)).Elem()
}

func (i FrontdoorOriginMap) ToFrontdoorOriginMapOutput() FrontdoorOriginMapOutput {
	return i.ToFrontdoorOriginMapOutputWithContext(context.Background())
}

func (i FrontdoorOriginMap) ToFrontdoorOriginMapOutputWithContext(ctx context.Context) FrontdoorOriginMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorOriginMapOutput)
}

type FrontdoorOriginOutput struct{ *pulumi.OutputState }

func (FrontdoorOriginOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FrontdoorOrigin)(nil)).Elem()
}

func (o FrontdoorOriginOutput) ToFrontdoorOriginOutput() FrontdoorOriginOutput {
	return o
}

func (o FrontdoorOriginOutput) ToFrontdoorOriginOutputWithContext(ctx context.Context) FrontdoorOriginOutput {
	return o
}

// The ID of the Front Door Origin Group within which this Front Door Origin should exist. Changing this forces a new Front Door Origin to be created.
func (o FrontdoorOriginOutput) CdnFrontdoorOriginGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.StringOutput { return v.CdnFrontdoorOriginGroupId }).(pulumi.StringOutput)
}

// Specifies whether certificate name checks are enabled for this origin.
func (o FrontdoorOriginOutput) CertificateNameCheckEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.BoolOutput { return v.CertificateNameCheckEnabled }).(pulumi.BoolOutput)
}

// Should the origin be enabled? Possible values are `true` or `false`. Defaults to `true`.
func (o FrontdoorOriginOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The IPv4 address, IPv6 address or Domain name of the Origin.
//
// !> **Note:** This must be unique across all Front Door Origins within a Front Door Endpoint.
func (o FrontdoorOriginOutput) HostName() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.StringOutput { return v.HostName }).(pulumi.StringOutput)
}

// The value of the HTTP port. Must be between `1` and `65535`. Defaults to `80`.
func (o FrontdoorOriginOutput) HttpPort() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.IntPtrOutput { return v.HttpPort }).(pulumi.IntPtrOutput)
}

// The value of the HTTPS port. Must be between `1` and `65535`. Defaults to `443`.
func (o FrontdoorOriginOutput) HttpsPort() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.IntPtrOutput { return v.HttpsPort }).(pulumi.IntPtrOutput)
}

// The name which should be used for this Front Door Origin. Changing this forces a new Front Door Origin to be created.
func (o FrontdoorOriginOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The host header value (an IPv4 address, IPv6 address or Domain name) which is sent to the origin with each request. If unspecified the hostname from the request will be used.
//
// > **Note:** Azure Front Door Origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin's hostname. This field's value overrides the host header defined in the Front Door Endpoint. For more information on how to properly set the origin host header value please see the [product documentation](https://docs.microsoft.com/azure/frontdoor/origin?pivots=front-door-standard-premium#origin-host-header).
func (o FrontdoorOriginOutput) OriginHostHeader() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.StringPtrOutput { return v.OriginHostHeader }).(pulumi.StringPtrOutput)
}

// Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy. Must be between `1` and `5` (inclusive). Defaults to `1`.
func (o FrontdoorOriginOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// A `privateLink` block as defined below.
//
// > **Note:** Private Link requires that the Front Door Profile this Origin is hosted within is using the SKU `Premium_AzureFrontDoor` and that the `certificateNameCheckEnabled` field is set to `true`.
func (o FrontdoorOriginOutput) PrivateLink() FrontdoorOriginPrivateLinkPtrOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) FrontdoorOriginPrivateLinkPtrOutput { return v.PrivateLink }).(FrontdoorOriginPrivateLinkPtrOutput)
}

// The weight of the origin in a given origin group for load balancing. Must be between `1` and `1000`. Defaults to `500`.
func (o FrontdoorOriginOutput) Weight() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FrontdoorOrigin) pulumi.IntPtrOutput { return v.Weight }).(pulumi.IntPtrOutput)
}

type FrontdoorOriginArrayOutput struct{ *pulumi.OutputState }

func (FrontdoorOriginArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FrontdoorOrigin)(nil)).Elem()
}

func (o FrontdoorOriginArrayOutput) ToFrontdoorOriginArrayOutput() FrontdoorOriginArrayOutput {
	return o
}

func (o FrontdoorOriginArrayOutput) ToFrontdoorOriginArrayOutputWithContext(ctx context.Context) FrontdoorOriginArrayOutput {
	return o
}

func (o FrontdoorOriginArrayOutput) Index(i pulumi.IntInput) FrontdoorOriginOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FrontdoorOrigin {
		return vs[0].([]*FrontdoorOrigin)[vs[1].(int)]
	}).(FrontdoorOriginOutput)
}

type FrontdoorOriginMapOutput struct{ *pulumi.OutputState }

func (FrontdoorOriginMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FrontdoorOrigin)(nil)).Elem()
}

func (o FrontdoorOriginMapOutput) ToFrontdoorOriginMapOutput() FrontdoorOriginMapOutput {
	return o
}

func (o FrontdoorOriginMapOutput) ToFrontdoorOriginMapOutputWithContext(ctx context.Context) FrontdoorOriginMapOutput {
	return o
}

func (o FrontdoorOriginMapOutput) MapIndex(k pulumi.StringInput) FrontdoorOriginOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FrontdoorOrigin {
		return vs[0].(map[string]*FrontdoorOrigin)[vs[1].(string)]
	}).(FrontdoorOriginOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorOriginInput)(nil)).Elem(), &FrontdoorOrigin{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorOriginArrayInput)(nil)).Elem(), FrontdoorOriginArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorOriginMapInput)(nil)).Elem(), FrontdoorOriginMap{})
	pulumi.RegisterOutputType(FrontdoorOriginOutput{})
	pulumi.RegisterOutputType(FrontdoorOriginArrayOutput{})
	pulumi.RegisterOutputType(FrontdoorOriginMapOutput{})
}
