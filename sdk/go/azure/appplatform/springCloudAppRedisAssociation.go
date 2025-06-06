// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appplatform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Associates a Spring Cloud Application with a Redis Cache.
//
// !> **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `appplatform.SpringCloudAppRedisAssociation` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
//
// ## Import
//
// Spring Cloud Application Redis Association can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:appplatform/springCloudAppRedisAssociation:SpringCloudAppRedisAssociation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.AppPlatform/spring/myservice/apps/myapp/bindings/bind1
// ```
type SpringCloudAppRedisAssociation struct {
	pulumi.CustomResourceState

	// Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the Redis Cache access key.
	RedisAccessKey pulumi.StringOutput `pulumi:"redisAccessKey"`
	// Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
	RedisCacheId pulumi.StringOutput `pulumi:"redisCacheId"`
	// Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
	SpringCloudAppId pulumi.StringOutput `pulumi:"springCloudAppId"`
	// Should SSL be used when connecting to Redis? Defaults to `true`.
	SslEnabled pulumi.BoolPtrOutput `pulumi:"sslEnabled"`
}

// NewSpringCloudAppRedisAssociation registers a new resource with the given unique name, arguments, and options.
func NewSpringCloudAppRedisAssociation(ctx *pulumi.Context,
	name string, args *SpringCloudAppRedisAssociationArgs, opts ...pulumi.ResourceOption) (*SpringCloudAppRedisAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RedisAccessKey == nil {
		return nil, errors.New("invalid value for required argument 'RedisAccessKey'")
	}
	if args.RedisCacheId == nil {
		return nil, errors.New("invalid value for required argument 'RedisCacheId'")
	}
	if args.SpringCloudAppId == nil {
		return nil, errors.New("invalid value for required argument 'SpringCloudAppId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SpringCloudAppRedisAssociation
	err := ctx.RegisterResource("azure:appplatform/springCloudAppRedisAssociation:SpringCloudAppRedisAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpringCloudAppRedisAssociation gets an existing SpringCloudAppRedisAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpringCloudAppRedisAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpringCloudAppRedisAssociationState, opts ...pulumi.ResourceOption) (*SpringCloudAppRedisAssociation, error) {
	var resource SpringCloudAppRedisAssociation
	err := ctx.ReadResource("azure:appplatform/springCloudAppRedisAssociation:SpringCloudAppRedisAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpringCloudAppRedisAssociation resources.
type springCloudAppRedisAssociationState struct {
	// Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the Redis Cache access key.
	RedisAccessKey *string `pulumi:"redisAccessKey"`
	// Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
	RedisCacheId *string `pulumi:"redisCacheId"`
	// Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
	SpringCloudAppId *string `pulumi:"springCloudAppId"`
	// Should SSL be used when connecting to Redis? Defaults to `true`.
	SslEnabled *bool `pulumi:"sslEnabled"`
}

type SpringCloudAppRedisAssociationState struct {
	// Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the Redis Cache access key.
	RedisAccessKey pulumi.StringPtrInput
	// Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
	RedisCacheId pulumi.StringPtrInput
	// Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
	SpringCloudAppId pulumi.StringPtrInput
	// Should SSL be used when connecting to Redis? Defaults to `true`.
	SslEnabled pulumi.BoolPtrInput
}

func (SpringCloudAppRedisAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*springCloudAppRedisAssociationState)(nil)).Elem()
}

type springCloudAppRedisAssociationArgs struct {
	// Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the Redis Cache access key.
	RedisAccessKey string `pulumi:"redisAccessKey"`
	// Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
	RedisCacheId string `pulumi:"redisCacheId"`
	// Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
	SpringCloudAppId string `pulumi:"springCloudAppId"`
	// Should SSL be used when connecting to Redis? Defaults to `true`.
	SslEnabled *bool `pulumi:"sslEnabled"`
}

// The set of arguments for constructing a SpringCloudAppRedisAssociation resource.
type SpringCloudAppRedisAssociationArgs struct {
	// Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the Redis Cache access key.
	RedisAccessKey pulumi.StringInput
	// Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
	RedisCacheId pulumi.StringInput
	// Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
	SpringCloudAppId pulumi.StringInput
	// Should SSL be used when connecting to Redis? Defaults to `true`.
	SslEnabled pulumi.BoolPtrInput
}

func (SpringCloudAppRedisAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*springCloudAppRedisAssociationArgs)(nil)).Elem()
}

type SpringCloudAppRedisAssociationInput interface {
	pulumi.Input

	ToSpringCloudAppRedisAssociationOutput() SpringCloudAppRedisAssociationOutput
	ToSpringCloudAppRedisAssociationOutputWithContext(ctx context.Context) SpringCloudAppRedisAssociationOutput
}

func (*SpringCloudAppRedisAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**SpringCloudAppRedisAssociation)(nil)).Elem()
}

func (i *SpringCloudAppRedisAssociation) ToSpringCloudAppRedisAssociationOutput() SpringCloudAppRedisAssociationOutput {
	return i.ToSpringCloudAppRedisAssociationOutputWithContext(context.Background())
}

func (i *SpringCloudAppRedisAssociation) ToSpringCloudAppRedisAssociationOutputWithContext(ctx context.Context) SpringCloudAppRedisAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpringCloudAppRedisAssociationOutput)
}

// SpringCloudAppRedisAssociationArrayInput is an input type that accepts SpringCloudAppRedisAssociationArray and SpringCloudAppRedisAssociationArrayOutput values.
// You can construct a concrete instance of `SpringCloudAppRedisAssociationArrayInput` via:
//
//	SpringCloudAppRedisAssociationArray{ SpringCloudAppRedisAssociationArgs{...} }
type SpringCloudAppRedisAssociationArrayInput interface {
	pulumi.Input

	ToSpringCloudAppRedisAssociationArrayOutput() SpringCloudAppRedisAssociationArrayOutput
	ToSpringCloudAppRedisAssociationArrayOutputWithContext(context.Context) SpringCloudAppRedisAssociationArrayOutput
}

type SpringCloudAppRedisAssociationArray []SpringCloudAppRedisAssociationInput

func (SpringCloudAppRedisAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpringCloudAppRedisAssociation)(nil)).Elem()
}

func (i SpringCloudAppRedisAssociationArray) ToSpringCloudAppRedisAssociationArrayOutput() SpringCloudAppRedisAssociationArrayOutput {
	return i.ToSpringCloudAppRedisAssociationArrayOutputWithContext(context.Background())
}

func (i SpringCloudAppRedisAssociationArray) ToSpringCloudAppRedisAssociationArrayOutputWithContext(ctx context.Context) SpringCloudAppRedisAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpringCloudAppRedisAssociationArrayOutput)
}

// SpringCloudAppRedisAssociationMapInput is an input type that accepts SpringCloudAppRedisAssociationMap and SpringCloudAppRedisAssociationMapOutput values.
// You can construct a concrete instance of `SpringCloudAppRedisAssociationMapInput` via:
//
//	SpringCloudAppRedisAssociationMap{ "key": SpringCloudAppRedisAssociationArgs{...} }
type SpringCloudAppRedisAssociationMapInput interface {
	pulumi.Input

	ToSpringCloudAppRedisAssociationMapOutput() SpringCloudAppRedisAssociationMapOutput
	ToSpringCloudAppRedisAssociationMapOutputWithContext(context.Context) SpringCloudAppRedisAssociationMapOutput
}

type SpringCloudAppRedisAssociationMap map[string]SpringCloudAppRedisAssociationInput

func (SpringCloudAppRedisAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpringCloudAppRedisAssociation)(nil)).Elem()
}

func (i SpringCloudAppRedisAssociationMap) ToSpringCloudAppRedisAssociationMapOutput() SpringCloudAppRedisAssociationMapOutput {
	return i.ToSpringCloudAppRedisAssociationMapOutputWithContext(context.Background())
}

func (i SpringCloudAppRedisAssociationMap) ToSpringCloudAppRedisAssociationMapOutputWithContext(ctx context.Context) SpringCloudAppRedisAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpringCloudAppRedisAssociationMapOutput)
}

type SpringCloudAppRedisAssociationOutput struct{ *pulumi.OutputState }

func (SpringCloudAppRedisAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpringCloudAppRedisAssociation)(nil)).Elem()
}

func (o SpringCloudAppRedisAssociationOutput) ToSpringCloudAppRedisAssociationOutput() SpringCloudAppRedisAssociationOutput {
	return o
}

func (o SpringCloudAppRedisAssociationOutput) ToSpringCloudAppRedisAssociationOutputWithContext(ctx context.Context) SpringCloudAppRedisAssociationOutput {
	return o
}

// Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
func (o SpringCloudAppRedisAssociationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudAppRedisAssociation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the Redis Cache access key.
func (o SpringCloudAppRedisAssociationOutput) RedisAccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudAppRedisAssociation) pulumi.StringOutput { return v.RedisAccessKey }).(pulumi.StringOutput)
}

// Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
func (o SpringCloudAppRedisAssociationOutput) RedisCacheId() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudAppRedisAssociation) pulumi.StringOutput { return v.RedisCacheId }).(pulumi.StringOutput)
}

// Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
func (o SpringCloudAppRedisAssociationOutput) SpringCloudAppId() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudAppRedisAssociation) pulumi.StringOutput { return v.SpringCloudAppId }).(pulumi.StringOutput)
}

// Should SSL be used when connecting to Redis? Defaults to `true`.
func (o SpringCloudAppRedisAssociationOutput) SslEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SpringCloudAppRedisAssociation) pulumi.BoolPtrOutput { return v.SslEnabled }).(pulumi.BoolPtrOutput)
}

type SpringCloudAppRedisAssociationArrayOutput struct{ *pulumi.OutputState }

func (SpringCloudAppRedisAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpringCloudAppRedisAssociation)(nil)).Elem()
}

func (o SpringCloudAppRedisAssociationArrayOutput) ToSpringCloudAppRedisAssociationArrayOutput() SpringCloudAppRedisAssociationArrayOutput {
	return o
}

func (o SpringCloudAppRedisAssociationArrayOutput) ToSpringCloudAppRedisAssociationArrayOutputWithContext(ctx context.Context) SpringCloudAppRedisAssociationArrayOutput {
	return o
}

func (o SpringCloudAppRedisAssociationArrayOutput) Index(i pulumi.IntInput) SpringCloudAppRedisAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpringCloudAppRedisAssociation {
		return vs[0].([]*SpringCloudAppRedisAssociation)[vs[1].(int)]
	}).(SpringCloudAppRedisAssociationOutput)
}

type SpringCloudAppRedisAssociationMapOutput struct{ *pulumi.OutputState }

func (SpringCloudAppRedisAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpringCloudAppRedisAssociation)(nil)).Elem()
}

func (o SpringCloudAppRedisAssociationMapOutput) ToSpringCloudAppRedisAssociationMapOutput() SpringCloudAppRedisAssociationMapOutput {
	return o
}

func (o SpringCloudAppRedisAssociationMapOutput) ToSpringCloudAppRedisAssociationMapOutputWithContext(ctx context.Context) SpringCloudAppRedisAssociationMapOutput {
	return o
}

func (o SpringCloudAppRedisAssociationMapOutput) MapIndex(k pulumi.StringInput) SpringCloudAppRedisAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpringCloudAppRedisAssociation {
		return vs[0].(map[string]*SpringCloudAppRedisAssociation)[vs[1].(string)]
	}).(SpringCloudAppRedisAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpringCloudAppRedisAssociationInput)(nil)).Elem(), &SpringCloudAppRedisAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpringCloudAppRedisAssociationArrayInput)(nil)).Elem(), SpringCloudAppRedisAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpringCloudAppRedisAssociationMapInput)(nil)).Elem(), SpringCloudAppRedisAssociationMap{})
	pulumi.RegisterOutputType(SpringCloudAppRedisAssociationOutput{})
	pulumi.RegisterOutputType(SpringCloudAppRedisAssociationArrayOutput{})
	pulumi.RegisterOutputType(SpringCloudAppRedisAssociationMapOutput{})
}
