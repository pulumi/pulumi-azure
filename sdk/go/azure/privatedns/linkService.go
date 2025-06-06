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

// Manages a Private Link Service.
//
// > **Note:** Private Link is now in [GA](https://docs.microsoft.com/en-gb/azure/private-link/).
//
// ## Import
//
// Private Link Services can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:privatedns/linkService:LinkService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/privateLinkServices/service1
// ```
type LinkService struct {
	pulumi.CustomResourceState

	// A globally unique DNS Name for your Private Link Service. You can use this alias to request a connection to your Private Link Service.
	Alias pulumi.StringOutput `pulumi:"alias"`
	// A list of Subscription UUID/GUID's that will be automatically be able to use this Private Link Service.
	AutoApprovalSubscriptionIds pulumi.StringArrayOutput `pulumi:"autoApprovalSubscriptionIds"`
	// Should the Private Link Service support the Proxy Protocol?
	EnableProxyProtocol pulumi.BoolPtrOutput `pulumi:"enableProxyProtocol"`
	// List of FQDNs allowed for the Private Link Service.
	Fqdns pulumi.StringArrayOutput `pulumi:"fqdns"`
	// A list of Frontend IP Configuration IDs from a Standard Load Balancer, where traffic from the Private Link Service should be routed. You can use Load Balancer Rules to direct this traffic to appropriate backend pools where your applications are running. Changing this forces a new resource to be created.
	LoadBalancerFrontendIpConfigurationIds pulumi.StringArrayOutput `pulumi:"loadBalancerFrontendIpConfigurationIds"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the name of this Private Link Service. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// One or more (up to 8) `natIpConfiguration` block as defined below.
	NatIpConfigurations LinkServiceNatIpConfigurationArrayOutput `pulumi:"natIpConfigurations"`
	// The name of the Resource Group where the Private Link Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A list of Subscription UUID/GUID's that will be able to see this Private Link Service.
	//
	// > **Note:** If no Subscription IDs are specified then Azure allows every Subscription to see this Private Link Service.
	VisibilitySubscriptionIds pulumi.StringArrayOutput `pulumi:"visibilitySubscriptionIds"`
}

// NewLinkService registers a new resource with the given unique name, arguments, and options.
func NewLinkService(ctx *pulumi.Context,
	name string, args *LinkServiceArgs, opts ...pulumi.ResourceOption) (*LinkService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LoadBalancerFrontendIpConfigurationIds == nil {
		return nil, errors.New("invalid value for required argument 'LoadBalancerFrontendIpConfigurationIds'")
	}
	if args.NatIpConfigurations == nil {
		return nil, errors.New("invalid value for required argument 'NatIpConfigurations'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LinkService
	err := ctx.RegisterResource("azure:privatedns/linkService:LinkService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkService gets an existing LinkService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkServiceState, opts ...pulumi.ResourceOption) (*LinkService, error) {
	var resource LinkService
	err := ctx.ReadResource("azure:privatedns/linkService:LinkService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkService resources.
type linkServiceState struct {
	// A globally unique DNS Name for your Private Link Service. You can use this alias to request a connection to your Private Link Service.
	Alias *string `pulumi:"alias"`
	// A list of Subscription UUID/GUID's that will be automatically be able to use this Private Link Service.
	AutoApprovalSubscriptionIds []string `pulumi:"autoApprovalSubscriptionIds"`
	// Should the Private Link Service support the Proxy Protocol?
	EnableProxyProtocol *bool `pulumi:"enableProxyProtocol"`
	// List of FQDNs allowed for the Private Link Service.
	Fqdns []string `pulumi:"fqdns"`
	// A list of Frontend IP Configuration IDs from a Standard Load Balancer, where traffic from the Private Link Service should be routed. You can use Load Balancer Rules to direct this traffic to appropriate backend pools where your applications are running. Changing this forces a new resource to be created.
	LoadBalancerFrontendIpConfigurationIds []string `pulumi:"loadBalancerFrontendIpConfigurationIds"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of this Private Link Service. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// One or more (up to 8) `natIpConfiguration` block as defined below.
	NatIpConfigurations []LinkServiceNatIpConfiguration `pulumi:"natIpConfigurations"`
	// The name of the Resource Group where the Private Link Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// A list of Subscription UUID/GUID's that will be able to see this Private Link Service.
	//
	// > **Note:** If no Subscription IDs are specified then Azure allows every Subscription to see this Private Link Service.
	VisibilitySubscriptionIds []string `pulumi:"visibilitySubscriptionIds"`
}

type LinkServiceState struct {
	// A globally unique DNS Name for your Private Link Service. You can use this alias to request a connection to your Private Link Service.
	Alias pulumi.StringPtrInput
	// A list of Subscription UUID/GUID's that will be automatically be able to use this Private Link Service.
	AutoApprovalSubscriptionIds pulumi.StringArrayInput
	// Should the Private Link Service support the Proxy Protocol?
	EnableProxyProtocol pulumi.BoolPtrInput
	// List of FQDNs allowed for the Private Link Service.
	Fqdns pulumi.StringArrayInput
	// A list of Frontend IP Configuration IDs from a Standard Load Balancer, where traffic from the Private Link Service should be routed. You can use Load Balancer Rules to direct this traffic to appropriate backend pools where your applications are running. Changing this forces a new resource to be created.
	LoadBalancerFrontendIpConfigurationIds pulumi.StringArrayInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of this Private Link Service. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// One or more (up to 8) `natIpConfiguration` block as defined below.
	NatIpConfigurations LinkServiceNatIpConfigurationArrayInput
	// The name of the Resource Group where the Private Link Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// A list of Subscription UUID/GUID's that will be able to see this Private Link Service.
	//
	// > **Note:** If no Subscription IDs are specified then Azure allows every Subscription to see this Private Link Service.
	VisibilitySubscriptionIds pulumi.StringArrayInput
}

func (LinkServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkServiceState)(nil)).Elem()
}

type linkServiceArgs struct {
	// A list of Subscription UUID/GUID's that will be automatically be able to use this Private Link Service.
	AutoApprovalSubscriptionIds []string `pulumi:"autoApprovalSubscriptionIds"`
	// Should the Private Link Service support the Proxy Protocol?
	EnableProxyProtocol *bool `pulumi:"enableProxyProtocol"`
	// List of FQDNs allowed for the Private Link Service.
	Fqdns []string `pulumi:"fqdns"`
	// A list of Frontend IP Configuration IDs from a Standard Load Balancer, where traffic from the Private Link Service should be routed. You can use Load Balancer Rules to direct this traffic to appropriate backend pools where your applications are running. Changing this forces a new resource to be created.
	LoadBalancerFrontendIpConfigurationIds []string `pulumi:"loadBalancerFrontendIpConfigurationIds"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of this Private Link Service. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// One or more (up to 8) `natIpConfiguration` block as defined below.
	NatIpConfigurations []LinkServiceNatIpConfiguration `pulumi:"natIpConfigurations"`
	// The name of the Resource Group where the Private Link Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// A list of Subscription UUID/GUID's that will be able to see this Private Link Service.
	//
	// > **Note:** If no Subscription IDs are specified then Azure allows every Subscription to see this Private Link Service.
	VisibilitySubscriptionIds []string `pulumi:"visibilitySubscriptionIds"`
}

// The set of arguments for constructing a LinkService resource.
type LinkServiceArgs struct {
	// A list of Subscription UUID/GUID's that will be automatically be able to use this Private Link Service.
	AutoApprovalSubscriptionIds pulumi.StringArrayInput
	// Should the Private Link Service support the Proxy Protocol?
	EnableProxyProtocol pulumi.BoolPtrInput
	// List of FQDNs allowed for the Private Link Service.
	Fqdns pulumi.StringArrayInput
	// A list of Frontend IP Configuration IDs from a Standard Load Balancer, where traffic from the Private Link Service should be routed. You can use Load Balancer Rules to direct this traffic to appropriate backend pools where your applications are running. Changing this forces a new resource to be created.
	LoadBalancerFrontendIpConfigurationIds pulumi.StringArrayInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of this Private Link Service. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// One or more (up to 8) `natIpConfiguration` block as defined below.
	NatIpConfigurations LinkServiceNatIpConfigurationArrayInput
	// The name of the Resource Group where the Private Link Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// A list of Subscription UUID/GUID's that will be able to see this Private Link Service.
	//
	// > **Note:** If no Subscription IDs are specified then Azure allows every Subscription to see this Private Link Service.
	VisibilitySubscriptionIds pulumi.StringArrayInput
}

func (LinkServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkServiceArgs)(nil)).Elem()
}

type LinkServiceInput interface {
	pulumi.Input

	ToLinkServiceOutput() LinkServiceOutput
	ToLinkServiceOutputWithContext(ctx context.Context) LinkServiceOutput
}

func (*LinkService) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkService)(nil)).Elem()
}

func (i *LinkService) ToLinkServiceOutput() LinkServiceOutput {
	return i.ToLinkServiceOutputWithContext(context.Background())
}

func (i *LinkService) ToLinkServiceOutputWithContext(ctx context.Context) LinkServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkServiceOutput)
}

// LinkServiceArrayInput is an input type that accepts LinkServiceArray and LinkServiceArrayOutput values.
// You can construct a concrete instance of `LinkServiceArrayInput` via:
//
//	LinkServiceArray{ LinkServiceArgs{...} }
type LinkServiceArrayInput interface {
	pulumi.Input

	ToLinkServiceArrayOutput() LinkServiceArrayOutput
	ToLinkServiceArrayOutputWithContext(context.Context) LinkServiceArrayOutput
}

type LinkServiceArray []LinkServiceInput

func (LinkServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkService)(nil)).Elem()
}

func (i LinkServiceArray) ToLinkServiceArrayOutput() LinkServiceArrayOutput {
	return i.ToLinkServiceArrayOutputWithContext(context.Background())
}

func (i LinkServiceArray) ToLinkServiceArrayOutputWithContext(ctx context.Context) LinkServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkServiceArrayOutput)
}

// LinkServiceMapInput is an input type that accepts LinkServiceMap and LinkServiceMapOutput values.
// You can construct a concrete instance of `LinkServiceMapInput` via:
//
//	LinkServiceMap{ "key": LinkServiceArgs{...} }
type LinkServiceMapInput interface {
	pulumi.Input

	ToLinkServiceMapOutput() LinkServiceMapOutput
	ToLinkServiceMapOutputWithContext(context.Context) LinkServiceMapOutput
}

type LinkServiceMap map[string]LinkServiceInput

func (LinkServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkService)(nil)).Elem()
}

func (i LinkServiceMap) ToLinkServiceMapOutput() LinkServiceMapOutput {
	return i.ToLinkServiceMapOutputWithContext(context.Background())
}

func (i LinkServiceMap) ToLinkServiceMapOutputWithContext(ctx context.Context) LinkServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkServiceMapOutput)
}

type LinkServiceOutput struct{ *pulumi.OutputState }

func (LinkServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkService)(nil)).Elem()
}

func (o LinkServiceOutput) ToLinkServiceOutput() LinkServiceOutput {
	return o
}

func (o LinkServiceOutput) ToLinkServiceOutputWithContext(ctx context.Context) LinkServiceOutput {
	return o
}

// A globally unique DNS Name for your Private Link Service. You can use this alias to request a connection to your Private Link Service.
func (o LinkServiceOutput) Alias() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkService) pulumi.StringOutput { return v.Alias }).(pulumi.StringOutput)
}

// A list of Subscription UUID/GUID's that will be automatically be able to use this Private Link Service.
func (o LinkServiceOutput) AutoApprovalSubscriptionIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkService) pulumi.StringArrayOutput { return v.AutoApprovalSubscriptionIds }).(pulumi.StringArrayOutput)
}

// Should the Private Link Service support the Proxy Protocol?
func (o LinkServiceOutput) EnableProxyProtocol() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LinkService) pulumi.BoolPtrOutput { return v.EnableProxyProtocol }).(pulumi.BoolPtrOutput)
}

// List of FQDNs allowed for the Private Link Service.
func (o LinkServiceOutput) Fqdns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkService) pulumi.StringArrayOutput { return v.Fqdns }).(pulumi.StringArrayOutput)
}

// A list of Frontend IP Configuration IDs from a Standard Load Balancer, where traffic from the Private Link Service should be routed. You can use Load Balancer Rules to direct this traffic to appropriate backend pools where your applications are running. Changing this forces a new resource to be created.
func (o LinkServiceOutput) LoadBalancerFrontendIpConfigurationIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkService) pulumi.StringArrayOutput { return v.LoadBalancerFrontendIpConfigurationIds }).(pulumi.StringArrayOutput)
}

// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o LinkServiceOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkService) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the name of this Private Link Service. Changing this forces a new resource to be created.
func (o LinkServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkService) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// One or more (up to 8) `natIpConfiguration` block as defined below.
func (o LinkServiceOutput) NatIpConfigurations() LinkServiceNatIpConfigurationArrayOutput {
	return o.ApplyT(func(v *LinkService) LinkServiceNatIpConfigurationArrayOutput { return v.NatIpConfigurations }).(LinkServiceNatIpConfigurationArrayOutput)
}

// The name of the Resource Group where the Private Link Service should exist. Changing this forces a new resource to be created.
func (o LinkServiceOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkService) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o LinkServiceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkService) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A list of Subscription UUID/GUID's that will be able to see this Private Link Service.
//
// > **Note:** If no Subscription IDs are specified then Azure allows every Subscription to see this Private Link Service.
func (o LinkServiceOutput) VisibilitySubscriptionIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkService) pulumi.StringArrayOutput { return v.VisibilitySubscriptionIds }).(pulumi.StringArrayOutput)
}

type LinkServiceArrayOutput struct{ *pulumi.OutputState }

func (LinkServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkService)(nil)).Elem()
}

func (o LinkServiceArrayOutput) ToLinkServiceArrayOutput() LinkServiceArrayOutput {
	return o
}

func (o LinkServiceArrayOutput) ToLinkServiceArrayOutputWithContext(ctx context.Context) LinkServiceArrayOutput {
	return o
}

func (o LinkServiceArrayOutput) Index(i pulumi.IntInput) LinkServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LinkService {
		return vs[0].([]*LinkService)[vs[1].(int)]
	}).(LinkServiceOutput)
}

type LinkServiceMapOutput struct{ *pulumi.OutputState }

func (LinkServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkService)(nil)).Elem()
}

func (o LinkServiceMapOutput) ToLinkServiceMapOutput() LinkServiceMapOutput {
	return o
}

func (o LinkServiceMapOutput) ToLinkServiceMapOutputWithContext(ctx context.Context) LinkServiceMapOutput {
	return o
}

func (o LinkServiceMapOutput) MapIndex(k pulumi.StringInput) LinkServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LinkService {
		return vs[0].(map[string]*LinkService)[vs[1].(string)]
	}).(LinkServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkServiceInput)(nil)).Elem(), &LinkService{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkServiceArrayInput)(nil)).Elem(), LinkServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkServiceMapInput)(nil)).Elem(), LinkServiceMap{})
	pulumi.RegisterOutputType(LinkServiceOutput{})
	pulumi.RegisterOutputType(LinkServiceArrayOutput{})
	pulumi.RegisterOutputType(LinkServiceMapOutput{})
}
