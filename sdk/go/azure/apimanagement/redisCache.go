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

// Manages a API Management Redis Cache.
//
// ## Import
//
// API Management Redis Caches can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:apimanagement/redisCache:RedisCache example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/caches/cache1
// ```
type RedisCache struct {
	pulumi.CustomResourceState

	// The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
	ApiManagementId pulumi.StringOutput `pulumi:"apiManagementId"`
	// The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
	CacheLocation pulumi.StringPtrOutput `pulumi:"cacheLocation"`
	// The connection string to the Cache for Redis.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The description of the API Management Redis Cache.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The resource ID of the Cache for Redis.
	RedisCacheId pulumi.StringPtrOutput `pulumi:"redisCacheId"`
}

// NewRedisCache registers a new resource with the given unique name, arguments, and options.
func NewRedisCache(ctx *pulumi.Context,
	name string, args *RedisCacheArgs, opts ...pulumi.ResourceOption) (*RedisCache, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiManagementId == nil {
		return nil, errors.New("invalid value for required argument 'ApiManagementId'")
	}
	if args.ConnectionString == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionString'")
	}
	if args.ConnectionString != nil {
		args.ConnectionString = pulumi.ToSecret(args.ConnectionString).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"connectionString",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RedisCache
	err := ctx.RegisterResource("azure:apimanagement/redisCache:RedisCache", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRedisCache gets an existing RedisCache resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRedisCache(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RedisCacheState, opts ...pulumi.ResourceOption) (*RedisCache, error) {
	var resource RedisCache
	err := ctx.ReadResource("azure:apimanagement/redisCache:RedisCache", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RedisCache resources.
type redisCacheState struct {
	// The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
	ApiManagementId *string `pulumi:"apiManagementId"`
	// The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
	CacheLocation *string `pulumi:"cacheLocation"`
	// The connection string to the Cache for Redis.
	ConnectionString *string `pulumi:"connectionString"`
	// The description of the API Management Redis Cache.
	Description *string `pulumi:"description"`
	// The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
	Name *string `pulumi:"name"`
	// The resource ID of the Cache for Redis.
	RedisCacheId *string `pulumi:"redisCacheId"`
}

type RedisCacheState struct {
	// The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
	ApiManagementId pulumi.StringPtrInput
	// The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
	CacheLocation pulumi.StringPtrInput
	// The connection string to the Cache for Redis.
	ConnectionString pulumi.StringPtrInput
	// The description of the API Management Redis Cache.
	Description pulumi.StringPtrInput
	// The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
	Name pulumi.StringPtrInput
	// The resource ID of the Cache for Redis.
	RedisCacheId pulumi.StringPtrInput
}

func (RedisCacheState) ElementType() reflect.Type {
	return reflect.TypeOf((*redisCacheState)(nil)).Elem()
}

type redisCacheArgs struct {
	// The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
	ApiManagementId string `pulumi:"apiManagementId"`
	// The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
	CacheLocation *string `pulumi:"cacheLocation"`
	// The connection string to the Cache for Redis.
	ConnectionString string `pulumi:"connectionString"`
	// The description of the API Management Redis Cache.
	Description *string `pulumi:"description"`
	// The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
	Name *string `pulumi:"name"`
	// The resource ID of the Cache for Redis.
	RedisCacheId *string `pulumi:"redisCacheId"`
}

// The set of arguments for constructing a RedisCache resource.
type RedisCacheArgs struct {
	// The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
	ApiManagementId pulumi.StringInput
	// The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
	CacheLocation pulumi.StringPtrInput
	// The connection string to the Cache for Redis.
	ConnectionString pulumi.StringInput
	// The description of the API Management Redis Cache.
	Description pulumi.StringPtrInput
	// The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
	Name pulumi.StringPtrInput
	// The resource ID of the Cache for Redis.
	RedisCacheId pulumi.StringPtrInput
}

func (RedisCacheArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*redisCacheArgs)(nil)).Elem()
}

type RedisCacheInput interface {
	pulumi.Input

	ToRedisCacheOutput() RedisCacheOutput
	ToRedisCacheOutputWithContext(ctx context.Context) RedisCacheOutput
}

func (*RedisCache) ElementType() reflect.Type {
	return reflect.TypeOf((**RedisCache)(nil)).Elem()
}

func (i *RedisCache) ToRedisCacheOutput() RedisCacheOutput {
	return i.ToRedisCacheOutputWithContext(context.Background())
}

func (i *RedisCache) ToRedisCacheOutputWithContext(ctx context.Context) RedisCacheOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RedisCacheOutput)
}

// RedisCacheArrayInput is an input type that accepts RedisCacheArray and RedisCacheArrayOutput values.
// You can construct a concrete instance of `RedisCacheArrayInput` via:
//
//	RedisCacheArray{ RedisCacheArgs{...} }
type RedisCacheArrayInput interface {
	pulumi.Input

	ToRedisCacheArrayOutput() RedisCacheArrayOutput
	ToRedisCacheArrayOutputWithContext(context.Context) RedisCacheArrayOutput
}

type RedisCacheArray []RedisCacheInput

func (RedisCacheArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RedisCache)(nil)).Elem()
}

func (i RedisCacheArray) ToRedisCacheArrayOutput() RedisCacheArrayOutput {
	return i.ToRedisCacheArrayOutputWithContext(context.Background())
}

func (i RedisCacheArray) ToRedisCacheArrayOutputWithContext(ctx context.Context) RedisCacheArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RedisCacheArrayOutput)
}

// RedisCacheMapInput is an input type that accepts RedisCacheMap and RedisCacheMapOutput values.
// You can construct a concrete instance of `RedisCacheMapInput` via:
//
//	RedisCacheMap{ "key": RedisCacheArgs{...} }
type RedisCacheMapInput interface {
	pulumi.Input

	ToRedisCacheMapOutput() RedisCacheMapOutput
	ToRedisCacheMapOutputWithContext(context.Context) RedisCacheMapOutput
}

type RedisCacheMap map[string]RedisCacheInput

func (RedisCacheMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RedisCache)(nil)).Elem()
}

func (i RedisCacheMap) ToRedisCacheMapOutput() RedisCacheMapOutput {
	return i.ToRedisCacheMapOutputWithContext(context.Background())
}

func (i RedisCacheMap) ToRedisCacheMapOutputWithContext(ctx context.Context) RedisCacheMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RedisCacheMapOutput)
}

type RedisCacheOutput struct{ *pulumi.OutputState }

func (RedisCacheOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RedisCache)(nil)).Elem()
}

func (o RedisCacheOutput) ToRedisCacheOutput() RedisCacheOutput {
	return o
}

func (o RedisCacheOutput) ToRedisCacheOutputWithContext(ctx context.Context) RedisCacheOutput {
	return o
}

// The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
func (o RedisCacheOutput) ApiManagementId() pulumi.StringOutput {
	return o.ApplyT(func(v *RedisCache) pulumi.StringOutput { return v.ApiManagementId }).(pulumi.StringOutput)
}

// The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
func (o RedisCacheOutput) CacheLocation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RedisCache) pulumi.StringPtrOutput { return v.CacheLocation }).(pulumi.StringPtrOutput)
}

// The connection string to the Cache for Redis.
func (o RedisCacheOutput) ConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *RedisCache) pulumi.StringOutput { return v.ConnectionString }).(pulumi.StringOutput)
}

// The description of the API Management Redis Cache.
func (o RedisCacheOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RedisCache) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
func (o RedisCacheOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RedisCache) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The resource ID of the Cache for Redis.
func (o RedisCacheOutput) RedisCacheId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RedisCache) pulumi.StringPtrOutput { return v.RedisCacheId }).(pulumi.StringPtrOutput)
}

type RedisCacheArrayOutput struct{ *pulumi.OutputState }

func (RedisCacheArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RedisCache)(nil)).Elem()
}

func (o RedisCacheArrayOutput) ToRedisCacheArrayOutput() RedisCacheArrayOutput {
	return o
}

func (o RedisCacheArrayOutput) ToRedisCacheArrayOutputWithContext(ctx context.Context) RedisCacheArrayOutput {
	return o
}

func (o RedisCacheArrayOutput) Index(i pulumi.IntInput) RedisCacheOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RedisCache {
		return vs[0].([]*RedisCache)[vs[1].(int)]
	}).(RedisCacheOutput)
}

type RedisCacheMapOutput struct{ *pulumi.OutputState }

func (RedisCacheMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RedisCache)(nil)).Elem()
}

func (o RedisCacheMapOutput) ToRedisCacheMapOutput() RedisCacheMapOutput {
	return o
}

func (o RedisCacheMapOutput) ToRedisCacheMapOutputWithContext(ctx context.Context) RedisCacheMapOutput {
	return o
}

func (o RedisCacheMapOutput) MapIndex(k pulumi.StringInput) RedisCacheOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RedisCache {
		return vs[0].(map[string]*RedisCache)[vs[1].(string)]
	}).(RedisCacheOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RedisCacheInput)(nil)).Elem(), &RedisCache{})
	pulumi.RegisterInputType(reflect.TypeOf((*RedisCacheArrayInput)(nil)).Elem(), RedisCacheArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RedisCacheMapInput)(nil)).Elem(), RedisCacheMap{})
	pulumi.RegisterOutputType(RedisCacheOutput{})
	pulumi.RegisterOutputType(RedisCacheArrayOutput{})
	pulumi.RegisterOutputType(RedisCacheMapOutput{})
}
