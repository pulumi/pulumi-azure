// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apimanagement

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an API Management Gateway.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/apimanagement"
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
//			exampleService, err := apimanagement.NewService(ctx, "example", &apimanagement.ServiceArgs{
//				Name:              pulumi.String("example-apim"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				PublisherName:     pulumi.String("pub1"),
//				PublisherEmail:    pulumi.String("pub1@email.com"),
//				SkuName:           pulumi.String("Consumption_0"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apimanagement.NewGateway(ctx, "example", &apimanagement.GatewayArgs{
//				Name:            pulumi.String("example-gateway"),
//				ApiManagementId: exampleService.ID(),
//				Description:     pulumi.String("Example API Management gateway"),
//				LocationData: &apimanagement.GatewayLocationDataArgs{
//					Name:     pulumi.String("example name"),
//					City:     pulumi.String("example city"),
//					District: pulumi.String("example district"),
//					Region:   pulumi.String("example region"),
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
// * `Microsoft.ApiManagement`: 2022-08-01
//
// ## Import
//
// API Management Gateways can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:apimanagement/gateway:Gateway example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/gateways/gateway1
// ```
type Gateway struct {
	pulumi.CustomResourceState

	// The ID of the API Management Resource in which the gateway will be created. Changing this forces a new API Management Gateway resource to be created.
	ApiManagementId pulumi.StringOutput `pulumi:"apiManagementId"`
	// The description of the API Management Gateway.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A `locationData` block as documented below.
	LocationData GatewayLocationDataOutput `pulumi:"locationData"`
	// The name which should be used for the API Management Gateway. Changing this forces a new API Management Gateway to be created.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewGateway registers a new resource with the given unique name, arguments, and options.
func NewGateway(ctx *pulumi.Context,
	name string, args *GatewayArgs, opts ...pulumi.ResourceOption) (*Gateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiManagementId == nil {
		return nil, errors.New("invalid value for required argument 'ApiManagementId'")
	}
	if args.LocationData == nil {
		return nil, errors.New("invalid value for required argument 'LocationData'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Gateway
	err := ctx.RegisterResource("azure:apimanagement/gateway:Gateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGateway gets an existing Gateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayState, opts ...pulumi.ResourceOption) (*Gateway, error) {
	var resource Gateway
	err := ctx.ReadResource("azure:apimanagement/gateway:Gateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Gateway resources.
type gatewayState struct {
	// The ID of the API Management Resource in which the gateway will be created. Changing this forces a new API Management Gateway resource to be created.
	ApiManagementId *string `pulumi:"apiManagementId"`
	// The description of the API Management Gateway.
	Description *string `pulumi:"description"`
	// A `locationData` block as documented below.
	LocationData *GatewayLocationData `pulumi:"locationData"`
	// The name which should be used for the API Management Gateway. Changing this forces a new API Management Gateway to be created.
	Name *string `pulumi:"name"`
}

type GatewayState struct {
	// The ID of the API Management Resource in which the gateway will be created. Changing this forces a new API Management Gateway resource to be created.
	ApiManagementId pulumi.StringPtrInput
	// The description of the API Management Gateway.
	Description pulumi.StringPtrInput
	// A `locationData` block as documented below.
	LocationData GatewayLocationDataPtrInput
	// The name which should be used for the API Management Gateway. Changing this forces a new API Management Gateway to be created.
	Name pulumi.StringPtrInput
}

func (GatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayState)(nil)).Elem()
}

type gatewayArgs struct {
	// The ID of the API Management Resource in which the gateway will be created. Changing this forces a new API Management Gateway resource to be created.
	ApiManagementId string `pulumi:"apiManagementId"`
	// The description of the API Management Gateway.
	Description *string `pulumi:"description"`
	// A `locationData` block as documented below.
	LocationData GatewayLocationData `pulumi:"locationData"`
	// The name which should be used for the API Management Gateway. Changing this forces a new API Management Gateway to be created.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Gateway resource.
type GatewayArgs struct {
	// The ID of the API Management Resource in which the gateway will be created. Changing this forces a new API Management Gateway resource to be created.
	ApiManagementId pulumi.StringInput
	// The description of the API Management Gateway.
	Description pulumi.StringPtrInput
	// A `locationData` block as documented below.
	LocationData GatewayLocationDataInput
	// The name which should be used for the API Management Gateway. Changing this forces a new API Management Gateway to be created.
	Name pulumi.StringPtrInput
}

func (GatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayArgs)(nil)).Elem()
}

type GatewayInput interface {
	pulumi.Input

	ToGatewayOutput() GatewayOutput
	ToGatewayOutputWithContext(ctx context.Context) GatewayOutput
}

func (*Gateway) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (i *Gateway) ToGatewayOutput() GatewayOutput {
	return i.ToGatewayOutputWithContext(context.Background())
}

func (i *Gateway) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayOutput)
}

// GatewayArrayInput is an input type that accepts GatewayArray and GatewayArrayOutput values.
// You can construct a concrete instance of `GatewayArrayInput` via:
//
//	GatewayArray{ GatewayArgs{...} }
type GatewayArrayInput interface {
	pulumi.Input

	ToGatewayArrayOutput() GatewayArrayOutput
	ToGatewayArrayOutputWithContext(context.Context) GatewayArrayOutput
}

type GatewayArray []GatewayInput

func (GatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (i GatewayArray) ToGatewayArrayOutput() GatewayArrayOutput {
	return i.ToGatewayArrayOutputWithContext(context.Background())
}

func (i GatewayArray) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayArrayOutput)
}

// GatewayMapInput is an input type that accepts GatewayMap and GatewayMapOutput values.
// You can construct a concrete instance of `GatewayMapInput` via:
//
//	GatewayMap{ "key": GatewayArgs{...} }
type GatewayMapInput interface {
	pulumi.Input

	ToGatewayMapOutput() GatewayMapOutput
	ToGatewayMapOutputWithContext(context.Context) GatewayMapOutput
}

type GatewayMap map[string]GatewayInput

func (GatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (i GatewayMap) ToGatewayMapOutput() GatewayMapOutput {
	return i.ToGatewayMapOutputWithContext(context.Background())
}

func (i GatewayMap) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayMapOutput)
}

type GatewayOutput struct{ *pulumi.OutputState }

func (GatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (o GatewayOutput) ToGatewayOutput() GatewayOutput {
	return o
}

func (o GatewayOutput) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return o
}

// The ID of the API Management Resource in which the gateway will be created. Changing this forces a new API Management Gateway resource to be created.
func (o GatewayOutput) ApiManagementId() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.ApiManagementId }).(pulumi.StringOutput)
}

// The description of the API Management Gateway.
func (o GatewayOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A `locationData` block as documented below.
func (o GatewayOutput) LocationData() GatewayLocationDataOutput {
	return o.ApplyT(func(v *Gateway) GatewayLocationDataOutput { return v.LocationData }).(GatewayLocationDataOutput)
}

// The name which should be used for the API Management Gateway. Changing this forces a new API Management Gateway to be created.
func (o GatewayOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type GatewayArrayOutput struct{ *pulumi.OutputState }

func (GatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (o GatewayArrayOutput) ToGatewayArrayOutput() GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) Index(i pulumi.IntInput) GatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].([]*Gateway)[vs[1].(int)]
	}).(GatewayOutput)
}

type GatewayMapOutput struct{ *pulumi.OutputState }

func (GatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (o GatewayMapOutput) ToGatewayMapOutput() GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) MapIndex(k pulumi.StringInput) GatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].(map[string]*Gateway)[vs[1].(string)]
	}).(GatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayInput)(nil)).Elem(), &Gateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayArrayInput)(nil)).Elem(), GatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayMapInput)(nil)).Elem(), GatewayMap{})
	pulumi.RegisterOutputType(GatewayOutput{})
	pulumi.RegisterOutputType(GatewayArrayOutput{})
	pulumi.RegisterOutputType(GatewayMapOutput{})
}
