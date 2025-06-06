// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package redis

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Redis Cache Access Policy
//
// ## Import
//
// Redis Cache Access Policy can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:redis/cacheAccessPolicy:CacheAccessPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redis/cache1/accessPolicies/policy1
// ```
type CacheAccessPolicy struct {
	pulumi.CustomResourceState

	// The name of the Redis Cache Access Policy. Changing this forces a new Redis Cache Access Policy to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Permissions that are going to be assigned to this Redis Cache Access Policy.
	Permissions pulumi.StringOutput `pulumi:"permissions"`
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy to be created.
	RedisCacheId pulumi.StringOutput `pulumi:"redisCacheId"`
}

// NewCacheAccessPolicy registers a new resource with the given unique name, arguments, and options.
func NewCacheAccessPolicy(ctx *pulumi.Context,
	name string, args *CacheAccessPolicyArgs, opts ...pulumi.ResourceOption) (*CacheAccessPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Permissions == nil {
		return nil, errors.New("invalid value for required argument 'Permissions'")
	}
	if args.RedisCacheId == nil {
		return nil, errors.New("invalid value for required argument 'RedisCacheId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CacheAccessPolicy
	err := ctx.RegisterResource("azure:redis/cacheAccessPolicy:CacheAccessPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCacheAccessPolicy gets an existing CacheAccessPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCacheAccessPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CacheAccessPolicyState, opts ...pulumi.ResourceOption) (*CacheAccessPolicy, error) {
	var resource CacheAccessPolicy
	err := ctx.ReadResource("azure:redis/cacheAccessPolicy:CacheAccessPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CacheAccessPolicy resources.
type cacheAccessPolicyState struct {
	// The name of the Redis Cache Access Policy. Changing this forces a new Redis Cache Access Policy to be created.
	Name *string `pulumi:"name"`
	// Permissions that are going to be assigned to this Redis Cache Access Policy.
	Permissions *string `pulumi:"permissions"`
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy to be created.
	RedisCacheId *string `pulumi:"redisCacheId"`
}

type CacheAccessPolicyState struct {
	// The name of the Redis Cache Access Policy. Changing this forces a new Redis Cache Access Policy to be created.
	Name pulumi.StringPtrInput
	// Permissions that are going to be assigned to this Redis Cache Access Policy.
	Permissions pulumi.StringPtrInput
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy to be created.
	RedisCacheId pulumi.StringPtrInput
}

func (CacheAccessPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*cacheAccessPolicyState)(nil)).Elem()
}

type cacheAccessPolicyArgs struct {
	// The name of the Redis Cache Access Policy. Changing this forces a new Redis Cache Access Policy to be created.
	Name *string `pulumi:"name"`
	// Permissions that are going to be assigned to this Redis Cache Access Policy.
	Permissions string `pulumi:"permissions"`
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy to be created.
	RedisCacheId string `pulumi:"redisCacheId"`
}

// The set of arguments for constructing a CacheAccessPolicy resource.
type CacheAccessPolicyArgs struct {
	// The name of the Redis Cache Access Policy. Changing this forces a new Redis Cache Access Policy to be created.
	Name pulumi.StringPtrInput
	// Permissions that are going to be assigned to this Redis Cache Access Policy.
	Permissions pulumi.StringInput
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy to be created.
	RedisCacheId pulumi.StringInput
}

func (CacheAccessPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cacheAccessPolicyArgs)(nil)).Elem()
}

type CacheAccessPolicyInput interface {
	pulumi.Input

	ToCacheAccessPolicyOutput() CacheAccessPolicyOutput
	ToCacheAccessPolicyOutputWithContext(ctx context.Context) CacheAccessPolicyOutput
}

func (*CacheAccessPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**CacheAccessPolicy)(nil)).Elem()
}

func (i *CacheAccessPolicy) ToCacheAccessPolicyOutput() CacheAccessPolicyOutput {
	return i.ToCacheAccessPolicyOutputWithContext(context.Background())
}

func (i *CacheAccessPolicy) ToCacheAccessPolicyOutputWithContext(ctx context.Context) CacheAccessPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CacheAccessPolicyOutput)
}

// CacheAccessPolicyArrayInput is an input type that accepts CacheAccessPolicyArray and CacheAccessPolicyArrayOutput values.
// You can construct a concrete instance of `CacheAccessPolicyArrayInput` via:
//
//	CacheAccessPolicyArray{ CacheAccessPolicyArgs{...} }
type CacheAccessPolicyArrayInput interface {
	pulumi.Input

	ToCacheAccessPolicyArrayOutput() CacheAccessPolicyArrayOutput
	ToCacheAccessPolicyArrayOutputWithContext(context.Context) CacheAccessPolicyArrayOutput
}

type CacheAccessPolicyArray []CacheAccessPolicyInput

func (CacheAccessPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CacheAccessPolicy)(nil)).Elem()
}

func (i CacheAccessPolicyArray) ToCacheAccessPolicyArrayOutput() CacheAccessPolicyArrayOutput {
	return i.ToCacheAccessPolicyArrayOutputWithContext(context.Background())
}

func (i CacheAccessPolicyArray) ToCacheAccessPolicyArrayOutputWithContext(ctx context.Context) CacheAccessPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CacheAccessPolicyArrayOutput)
}

// CacheAccessPolicyMapInput is an input type that accepts CacheAccessPolicyMap and CacheAccessPolicyMapOutput values.
// You can construct a concrete instance of `CacheAccessPolicyMapInput` via:
//
//	CacheAccessPolicyMap{ "key": CacheAccessPolicyArgs{...} }
type CacheAccessPolicyMapInput interface {
	pulumi.Input

	ToCacheAccessPolicyMapOutput() CacheAccessPolicyMapOutput
	ToCacheAccessPolicyMapOutputWithContext(context.Context) CacheAccessPolicyMapOutput
}

type CacheAccessPolicyMap map[string]CacheAccessPolicyInput

func (CacheAccessPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CacheAccessPolicy)(nil)).Elem()
}

func (i CacheAccessPolicyMap) ToCacheAccessPolicyMapOutput() CacheAccessPolicyMapOutput {
	return i.ToCacheAccessPolicyMapOutputWithContext(context.Background())
}

func (i CacheAccessPolicyMap) ToCacheAccessPolicyMapOutputWithContext(ctx context.Context) CacheAccessPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CacheAccessPolicyMapOutput)
}

type CacheAccessPolicyOutput struct{ *pulumi.OutputState }

func (CacheAccessPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CacheAccessPolicy)(nil)).Elem()
}

func (o CacheAccessPolicyOutput) ToCacheAccessPolicyOutput() CacheAccessPolicyOutput {
	return o
}

func (o CacheAccessPolicyOutput) ToCacheAccessPolicyOutputWithContext(ctx context.Context) CacheAccessPolicyOutput {
	return o
}

// The name of the Redis Cache Access Policy. Changing this forces a new Redis Cache Access Policy to be created.
func (o CacheAccessPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CacheAccessPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Permissions that are going to be assigned to this Redis Cache Access Policy.
func (o CacheAccessPolicyOutput) Permissions() pulumi.StringOutput {
	return o.ApplyT(func(v *CacheAccessPolicy) pulumi.StringOutput { return v.Permissions }).(pulumi.StringOutput)
}

// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy to be created.
func (o CacheAccessPolicyOutput) RedisCacheId() pulumi.StringOutput {
	return o.ApplyT(func(v *CacheAccessPolicy) pulumi.StringOutput { return v.RedisCacheId }).(pulumi.StringOutput)
}

type CacheAccessPolicyArrayOutput struct{ *pulumi.OutputState }

func (CacheAccessPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CacheAccessPolicy)(nil)).Elem()
}

func (o CacheAccessPolicyArrayOutput) ToCacheAccessPolicyArrayOutput() CacheAccessPolicyArrayOutput {
	return o
}

func (o CacheAccessPolicyArrayOutput) ToCacheAccessPolicyArrayOutputWithContext(ctx context.Context) CacheAccessPolicyArrayOutput {
	return o
}

func (o CacheAccessPolicyArrayOutput) Index(i pulumi.IntInput) CacheAccessPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CacheAccessPolicy {
		return vs[0].([]*CacheAccessPolicy)[vs[1].(int)]
	}).(CacheAccessPolicyOutput)
}

type CacheAccessPolicyMapOutput struct{ *pulumi.OutputState }

func (CacheAccessPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CacheAccessPolicy)(nil)).Elem()
}

func (o CacheAccessPolicyMapOutput) ToCacheAccessPolicyMapOutput() CacheAccessPolicyMapOutput {
	return o
}

func (o CacheAccessPolicyMapOutput) ToCacheAccessPolicyMapOutputWithContext(ctx context.Context) CacheAccessPolicyMapOutput {
	return o
}

func (o CacheAccessPolicyMapOutput) MapIndex(k pulumi.StringInput) CacheAccessPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CacheAccessPolicy {
		return vs[0].(map[string]*CacheAccessPolicy)[vs[1].(string)]
	}).(CacheAccessPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CacheAccessPolicyInput)(nil)).Elem(), &CacheAccessPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*CacheAccessPolicyArrayInput)(nil)).Elem(), CacheAccessPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CacheAccessPolicyMapInput)(nil)).Elem(), CacheAccessPolicyMap{})
	pulumi.RegisterOutputType(CacheAccessPolicyOutput{})
	pulumi.RegisterOutputType(CacheAccessPolicyArrayOutput{})
	pulumi.RegisterOutputType(CacheAccessPolicyMapOutput{})
}
