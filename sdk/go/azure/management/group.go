// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package management

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Management Group.
//
// !> **Note:** Configuring `subscriptionIds` is not supported when using the `management.GroupSubscriptionAssociation` resource, results will be unpredictable.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/management"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			current, err := core.LookupSubscription(ctx, &core.LookupSubscriptionArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			exampleParent, err := management.NewGroup(ctx, "example_parent", &management.GroupArgs{
//				DisplayName: pulumi.String("ParentGroup"),
//				SubscriptionIds: pulumi.StringArray{
//					pulumi.String(current.SubscriptionId),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = management.NewGroup(ctx, "example_child", &management.GroupArgs{
//				DisplayName:             pulumi.String("ChildGroup"),
//				ParentManagementGroupId: exampleParent.ID(),
//				SubscriptionIds: pulumi.StringArray{
//					pulumi.String(current.SubscriptionId),
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
// * `Microsoft.Management`: 2020-05-01
//
// ## Import
//
// Management Groups can be imported using the `management group resource id`, e.g.
//
// ```sh
// $ pulumi import azure:management/group:Group example /providers/Microsoft.Management/managementGroups/group1
// ```
type Group struct {
	pulumi.CustomResourceState

	// A friendly name for this Management Group. If not specified, this will be the same as the `name`.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Parent Management Group.
	ParentManagementGroupId pulumi.StringOutput `pulumi:"parentManagementGroupId"`
	// A list of Subscription GUIDs which should be assigned to the Management Group.
	//
	// > **Note:** To clear all Subscriptions from the Management Group set `subscriptionIds` to an empty list
	SubscriptionIds pulumi.StringArrayOutput `pulumi:"subscriptionIds"`
	// The Management Group ID with the Tenant ID prefix.
	TenantScopedId pulumi.StringOutput `pulumi:"tenantScopedId"`
}

// NewGroup registers a new resource with the given unique name, arguments, and options.
func NewGroup(ctx *pulumi.Context,
	name string, args *GroupArgs, opts ...pulumi.ResourceOption) (*Group, error) {
	if args == nil {
		args = &GroupArgs{}
	}

	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("azure:managementgroups/managementGroup:ManagementGroup"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Group
	err := ctx.RegisterResource("azure:management/group:Group", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroup gets an existing Group resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupState, opts ...pulumi.ResourceOption) (*Group, error) {
	var resource Group
	err := ctx.ReadResource("azure:management/group:Group", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Group resources.
type groupState struct {
	// A friendly name for this Management Group. If not specified, this will be the same as the `name`.
	DisplayName *string `pulumi:"displayName"`
	// The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Parent Management Group.
	ParentManagementGroupId *string `pulumi:"parentManagementGroupId"`
	// A list of Subscription GUIDs which should be assigned to the Management Group.
	//
	// > **Note:** To clear all Subscriptions from the Management Group set `subscriptionIds` to an empty list
	SubscriptionIds []string `pulumi:"subscriptionIds"`
	// The Management Group ID with the Tenant ID prefix.
	TenantScopedId *string `pulumi:"tenantScopedId"`
}

type GroupState struct {
	// A friendly name for this Management Group. If not specified, this will be the same as the `name`.
	DisplayName pulumi.StringPtrInput
	// The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Parent Management Group.
	ParentManagementGroupId pulumi.StringPtrInput
	// A list of Subscription GUIDs which should be assigned to the Management Group.
	//
	// > **Note:** To clear all Subscriptions from the Management Group set `subscriptionIds` to an empty list
	SubscriptionIds pulumi.StringArrayInput
	// The Management Group ID with the Tenant ID prefix.
	TenantScopedId pulumi.StringPtrInput
}

func (GroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupState)(nil)).Elem()
}

type groupArgs struct {
	// A friendly name for this Management Group. If not specified, this will be the same as the `name`.
	DisplayName *string `pulumi:"displayName"`
	// The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Parent Management Group.
	ParentManagementGroupId *string `pulumi:"parentManagementGroupId"`
	// A list of Subscription GUIDs which should be assigned to the Management Group.
	//
	// > **Note:** To clear all Subscriptions from the Management Group set `subscriptionIds` to an empty list
	SubscriptionIds []string `pulumi:"subscriptionIds"`
}

// The set of arguments for constructing a Group resource.
type GroupArgs struct {
	// A friendly name for this Management Group. If not specified, this will be the same as the `name`.
	DisplayName pulumi.StringPtrInput
	// The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Parent Management Group.
	ParentManagementGroupId pulumi.StringPtrInput
	// A list of Subscription GUIDs which should be assigned to the Management Group.
	//
	// > **Note:** To clear all Subscriptions from the Management Group set `subscriptionIds` to an empty list
	SubscriptionIds pulumi.StringArrayInput
}

func (GroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupArgs)(nil)).Elem()
}

type GroupInput interface {
	pulumi.Input

	ToGroupOutput() GroupOutput
	ToGroupOutputWithContext(ctx context.Context) GroupOutput
}

func (*Group) ElementType() reflect.Type {
	return reflect.TypeOf((**Group)(nil)).Elem()
}

func (i *Group) ToGroupOutput() GroupOutput {
	return i.ToGroupOutputWithContext(context.Background())
}

func (i *Group) ToGroupOutputWithContext(ctx context.Context) GroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupOutput)
}

// GroupArrayInput is an input type that accepts GroupArray and GroupArrayOutput values.
// You can construct a concrete instance of `GroupArrayInput` via:
//
//	GroupArray{ GroupArgs{...} }
type GroupArrayInput interface {
	pulumi.Input

	ToGroupArrayOutput() GroupArrayOutput
	ToGroupArrayOutputWithContext(context.Context) GroupArrayOutput
}

type GroupArray []GroupInput

func (GroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Group)(nil)).Elem()
}

func (i GroupArray) ToGroupArrayOutput() GroupArrayOutput {
	return i.ToGroupArrayOutputWithContext(context.Background())
}

func (i GroupArray) ToGroupArrayOutputWithContext(ctx context.Context) GroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupArrayOutput)
}

// GroupMapInput is an input type that accepts GroupMap and GroupMapOutput values.
// You can construct a concrete instance of `GroupMapInput` via:
//
//	GroupMap{ "key": GroupArgs{...} }
type GroupMapInput interface {
	pulumi.Input

	ToGroupMapOutput() GroupMapOutput
	ToGroupMapOutputWithContext(context.Context) GroupMapOutput
}

type GroupMap map[string]GroupInput

func (GroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Group)(nil)).Elem()
}

func (i GroupMap) ToGroupMapOutput() GroupMapOutput {
	return i.ToGroupMapOutputWithContext(context.Background())
}

func (i GroupMap) ToGroupMapOutputWithContext(ctx context.Context) GroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupMapOutput)
}

type GroupOutput struct{ *pulumi.OutputState }

func (GroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Group)(nil)).Elem()
}

func (o GroupOutput) ToGroupOutput() GroupOutput {
	return o
}

func (o GroupOutput) ToGroupOutputWithContext(ctx context.Context) GroupOutput {
	return o
}

// A friendly name for this Management Group. If not specified, this will be the same as the `name`.
func (o GroupOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Group) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
func (o GroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Group) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the Parent Management Group.
func (o GroupOutput) ParentManagementGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Group) pulumi.StringOutput { return v.ParentManagementGroupId }).(pulumi.StringOutput)
}

// A list of Subscription GUIDs which should be assigned to the Management Group.
//
// > **Note:** To clear all Subscriptions from the Management Group set `subscriptionIds` to an empty list
func (o GroupOutput) SubscriptionIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Group) pulumi.StringArrayOutput { return v.SubscriptionIds }).(pulumi.StringArrayOutput)
}

// The Management Group ID with the Tenant ID prefix.
func (o GroupOutput) TenantScopedId() pulumi.StringOutput {
	return o.ApplyT(func(v *Group) pulumi.StringOutput { return v.TenantScopedId }).(pulumi.StringOutput)
}

type GroupArrayOutput struct{ *pulumi.OutputState }

func (GroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Group)(nil)).Elem()
}

func (o GroupArrayOutput) ToGroupArrayOutput() GroupArrayOutput {
	return o
}

func (o GroupArrayOutput) ToGroupArrayOutputWithContext(ctx context.Context) GroupArrayOutput {
	return o
}

func (o GroupArrayOutput) Index(i pulumi.IntInput) GroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Group {
		return vs[0].([]*Group)[vs[1].(int)]
	}).(GroupOutput)
}

type GroupMapOutput struct{ *pulumi.OutputState }

func (GroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Group)(nil)).Elem()
}

func (o GroupMapOutput) ToGroupMapOutput() GroupMapOutput {
	return o
}

func (o GroupMapOutput) ToGroupMapOutputWithContext(ctx context.Context) GroupMapOutput {
	return o
}

func (o GroupMapOutput) MapIndex(k pulumi.StringInput) GroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Group {
		return vs[0].(map[string]*Group)[vs[1].(string)]
	}).(GroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupInput)(nil)).Elem(), &Group{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupArrayInput)(nil)).Elem(), GroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupMapInput)(nil)).Elem(), GroupMap{})
	pulumi.RegisterOutputType(GroupOutput{})
	pulumi.RegisterOutputType(GroupArrayOutput{})
	pulumi.RegisterOutputType(GroupMapOutput{})
}
