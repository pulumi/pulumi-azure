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

// Manages a Redis Cache Access Policy Assignment
//
// ## Import
//
// Redis Cache Policy Assignment can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:redis/cacheAccessPolicyAssignment:CacheAccessPolicyAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redis/cache1/accessPolicyAssignments/assignment1
// ```
type CacheAccessPolicyAssignment struct {
	pulumi.CustomResourceState

	// The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	AccessPolicyName pulumi.StringOutput `pulumi:"accessPolicyName"`
	// The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectId pulumi.StringOutput `pulumi:"objectId"`
	// The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectIdAlias pulumi.StringOutput `pulumi:"objectIdAlias"`
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	RedisCacheId pulumi.StringOutput `pulumi:"redisCacheId"`
}

// NewCacheAccessPolicyAssignment registers a new resource with the given unique name, arguments, and options.
func NewCacheAccessPolicyAssignment(ctx *pulumi.Context,
	name string, args *CacheAccessPolicyAssignmentArgs, opts ...pulumi.ResourceOption) (*CacheAccessPolicyAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessPolicyName == nil {
		return nil, errors.New("invalid value for required argument 'AccessPolicyName'")
	}
	if args.ObjectId == nil {
		return nil, errors.New("invalid value for required argument 'ObjectId'")
	}
	if args.ObjectIdAlias == nil {
		return nil, errors.New("invalid value for required argument 'ObjectIdAlias'")
	}
	if args.RedisCacheId == nil {
		return nil, errors.New("invalid value for required argument 'RedisCacheId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CacheAccessPolicyAssignment
	err := ctx.RegisterResource("azure:redis/cacheAccessPolicyAssignment:CacheAccessPolicyAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCacheAccessPolicyAssignment gets an existing CacheAccessPolicyAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCacheAccessPolicyAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CacheAccessPolicyAssignmentState, opts ...pulumi.ResourceOption) (*CacheAccessPolicyAssignment, error) {
	var resource CacheAccessPolicyAssignment
	err := ctx.ReadResource("azure:redis/cacheAccessPolicyAssignment:CacheAccessPolicyAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CacheAccessPolicyAssignment resources.
type cacheAccessPolicyAssignmentState struct {
	// The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	AccessPolicyName *string `pulumi:"accessPolicyName"`
	// The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	Name *string `pulumi:"name"`
	// The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectId *string `pulumi:"objectId"`
	// The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectIdAlias *string `pulumi:"objectIdAlias"`
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	RedisCacheId *string `pulumi:"redisCacheId"`
}

type CacheAccessPolicyAssignmentState struct {
	// The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	AccessPolicyName pulumi.StringPtrInput
	// The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	Name pulumi.StringPtrInput
	// The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectId pulumi.StringPtrInput
	// The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectIdAlias pulumi.StringPtrInput
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	RedisCacheId pulumi.StringPtrInput
}

func (CacheAccessPolicyAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*cacheAccessPolicyAssignmentState)(nil)).Elem()
}

type cacheAccessPolicyAssignmentArgs struct {
	// The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	AccessPolicyName string `pulumi:"accessPolicyName"`
	// The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	Name *string `pulumi:"name"`
	// The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectId string `pulumi:"objectId"`
	// The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectIdAlias string `pulumi:"objectIdAlias"`
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	RedisCacheId string `pulumi:"redisCacheId"`
}

// The set of arguments for constructing a CacheAccessPolicyAssignment resource.
type CacheAccessPolicyAssignmentArgs struct {
	// The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	AccessPolicyName pulumi.StringInput
	// The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	Name pulumi.StringPtrInput
	// The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectId pulumi.StringInput
	// The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	ObjectIdAlias pulumi.StringInput
	// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
	RedisCacheId pulumi.StringInput
}

func (CacheAccessPolicyAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cacheAccessPolicyAssignmentArgs)(nil)).Elem()
}

type CacheAccessPolicyAssignmentInput interface {
	pulumi.Input

	ToCacheAccessPolicyAssignmentOutput() CacheAccessPolicyAssignmentOutput
	ToCacheAccessPolicyAssignmentOutputWithContext(ctx context.Context) CacheAccessPolicyAssignmentOutput
}

func (*CacheAccessPolicyAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**CacheAccessPolicyAssignment)(nil)).Elem()
}

func (i *CacheAccessPolicyAssignment) ToCacheAccessPolicyAssignmentOutput() CacheAccessPolicyAssignmentOutput {
	return i.ToCacheAccessPolicyAssignmentOutputWithContext(context.Background())
}

func (i *CacheAccessPolicyAssignment) ToCacheAccessPolicyAssignmentOutputWithContext(ctx context.Context) CacheAccessPolicyAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CacheAccessPolicyAssignmentOutput)
}

// CacheAccessPolicyAssignmentArrayInput is an input type that accepts CacheAccessPolicyAssignmentArray and CacheAccessPolicyAssignmentArrayOutput values.
// You can construct a concrete instance of `CacheAccessPolicyAssignmentArrayInput` via:
//
//	CacheAccessPolicyAssignmentArray{ CacheAccessPolicyAssignmentArgs{...} }
type CacheAccessPolicyAssignmentArrayInput interface {
	pulumi.Input

	ToCacheAccessPolicyAssignmentArrayOutput() CacheAccessPolicyAssignmentArrayOutput
	ToCacheAccessPolicyAssignmentArrayOutputWithContext(context.Context) CacheAccessPolicyAssignmentArrayOutput
}

type CacheAccessPolicyAssignmentArray []CacheAccessPolicyAssignmentInput

func (CacheAccessPolicyAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CacheAccessPolicyAssignment)(nil)).Elem()
}

func (i CacheAccessPolicyAssignmentArray) ToCacheAccessPolicyAssignmentArrayOutput() CacheAccessPolicyAssignmentArrayOutput {
	return i.ToCacheAccessPolicyAssignmentArrayOutputWithContext(context.Background())
}

func (i CacheAccessPolicyAssignmentArray) ToCacheAccessPolicyAssignmentArrayOutputWithContext(ctx context.Context) CacheAccessPolicyAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CacheAccessPolicyAssignmentArrayOutput)
}

// CacheAccessPolicyAssignmentMapInput is an input type that accepts CacheAccessPolicyAssignmentMap and CacheAccessPolicyAssignmentMapOutput values.
// You can construct a concrete instance of `CacheAccessPolicyAssignmentMapInput` via:
//
//	CacheAccessPolicyAssignmentMap{ "key": CacheAccessPolicyAssignmentArgs{...} }
type CacheAccessPolicyAssignmentMapInput interface {
	pulumi.Input

	ToCacheAccessPolicyAssignmentMapOutput() CacheAccessPolicyAssignmentMapOutput
	ToCacheAccessPolicyAssignmentMapOutputWithContext(context.Context) CacheAccessPolicyAssignmentMapOutput
}

type CacheAccessPolicyAssignmentMap map[string]CacheAccessPolicyAssignmentInput

func (CacheAccessPolicyAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CacheAccessPolicyAssignment)(nil)).Elem()
}

func (i CacheAccessPolicyAssignmentMap) ToCacheAccessPolicyAssignmentMapOutput() CacheAccessPolicyAssignmentMapOutput {
	return i.ToCacheAccessPolicyAssignmentMapOutputWithContext(context.Background())
}

func (i CacheAccessPolicyAssignmentMap) ToCacheAccessPolicyAssignmentMapOutputWithContext(ctx context.Context) CacheAccessPolicyAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CacheAccessPolicyAssignmentMapOutput)
}

type CacheAccessPolicyAssignmentOutput struct{ *pulumi.OutputState }

func (CacheAccessPolicyAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CacheAccessPolicyAssignment)(nil)).Elem()
}

func (o CacheAccessPolicyAssignmentOutput) ToCacheAccessPolicyAssignmentOutput() CacheAccessPolicyAssignmentOutput {
	return o
}

func (o CacheAccessPolicyAssignmentOutput) ToCacheAccessPolicyAssignmentOutputWithContext(ctx context.Context) CacheAccessPolicyAssignmentOutput {
	return o
}

// The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
func (o CacheAccessPolicyAssignmentOutput) AccessPolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *CacheAccessPolicyAssignment) pulumi.StringOutput { return v.AccessPolicyName }).(pulumi.StringOutput)
}

// The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
func (o CacheAccessPolicyAssignmentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CacheAccessPolicyAssignment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
func (o CacheAccessPolicyAssignmentOutput) ObjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *CacheAccessPolicyAssignment) pulumi.StringOutput { return v.ObjectId }).(pulumi.StringOutput)
}

// The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
func (o CacheAccessPolicyAssignmentOutput) ObjectIdAlias() pulumi.StringOutput {
	return o.ApplyT(func(v *CacheAccessPolicyAssignment) pulumi.StringOutput { return v.ObjectIdAlias }).(pulumi.StringOutput)
}

// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
func (o CacheAccessPolicyAssignmentOutput) RedisCacheId() pulumi.StringOutput {
	return o.ApplyT(func(v *CacheAccessPolicyAssignment) pulumi.StringOutput { return v.RedisCacheId }).(pulumi.StringOutput)
}

type CacheAccessPolicyAssignmentArrayOutput struct{ *pulumi.OutputState }

func (CacheAccessPolicyAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CacheAccessPolicyAssignment)(nil)).Elem()
}

func (o CacheAccessPolicyAssignmentArrayOutput) ToCacheAccessPolicyAssignmentArrayOutput() CacheAccessPolicyAssignmentArrayOutput {
	return o
}

func (o CacheAccessPolicyAssignmentArrayOutput) ToCacheAccessPolicyAssignmentArrayOutputWithContext(ctx context.Context) CacheAccessPolicyAssignmentArrayOutput {
	return o
}

func (o CacheAccessPolicyAssignmentArrayOutput) Index(i pulumi.IntInput) CacheAccessPolicyAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CacheAccessPolicyAssignment {
		return vs[0].([]*CacheAccessPolicyAssignment)[vs[1].(int)]
	}).(CacheAccessPolicyAssignmentOutput)
}

type CacheAccessPolicyAssignmentMapOutput struct{ *pulumi.OutputState }

func (CacheAccessPolicyAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CacheAccessPolicyAssignment)(nil)).Elem()
}

func (o CacheAccessPolicyAssignmentMapOutput) ToCacheAccessPolicyAssignmentMapOutput() CacheAccessPolicyAssignmentMapOutput {
	return o
}

func (o CacheAccessPolicyAssignmentMapOutput) ToCacheAccessPolicyAssignmentMapOutputWithContext(ctx context.Context) CacheAccessPolicyAssignmentMapOutput {
	return o
}

func (o CacheAccessPolicyAssignmentMapOutput) MapIndex(k pulumi.StringInput) CacheAccessPolicyAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CacheAccessPolicyAssignment {
		return vs[0].(map[string]*CacheAccessPolicyAssignment)[vs[1].(string)]
	}).(CacheAccessPolicyAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CacheAccessPolicyAssignmentInput)(nil)).Elem(), &CacheAccessPolicyAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*CacheAccessPolicyAssignmentArrayInput)(nil)).Elem(), CacheAccessPolicyAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CacheAccessPolicyAssignmentMapInput)(nil)).Elem(), CacheAccessPolicyAssignmentMap{})
	pulumi.RegisterOutputType(CacheAccessPolicyAssignmentOutput{})
	pulumi.RegisterOutputType(CacheAccessPolicyAssignmentArrayOutput{})
	pulumi.RegisterOutputType(CacheAccessPolicyAssignmentMapOutput{})
}
