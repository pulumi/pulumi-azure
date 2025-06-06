// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package loganalytics

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type ClusterIdentity struct {
	// A list of User Assigned Managed Identity IDs to be assigned to this Windows Web App Slot.
	//
	// > **Note:** This is required when `type` is set to `UserAssigned`.
	IdentityIds []string `pulumi:"identityIds"`
	// The Principal ID associated with this Managed Service Identity.
	PrincipalId *string `pulumi:"principalId"`
	// The Tenant ID associated with this Managed Service Identity.
	TenantId *string `pulumi:"tenantId"`
	// Specifies the type of Managed Service Identity that should be configured on this Log Analytics Cluster. Possible values are `SystemAssigned` and  `UserAssigned`. Changing this forces a new resource to be created.
	//
	// > **Note:** The assigned `principalId` and `tenantId` can be retrieved after the identity `type` has been set to `SystemAssigned` and the Log Analytics Cluster has been created. More details are available below.
	Type string `pulumi:"type"`
}

// ClusterIdentityInput is an input type that accepts ClusterIdentityArgs and ClusterIdentityOutput values.
// You can construct a concrete instance of `ClusterIdentityInput` via:
//
//	ClusterIdentityArgs{...}
type ClusterIdentityInput interface {
	pulumi.Input

	ToClusterIdentityOutput() ClusterIdentityOutput
	ToClusterIdentityOutputWithContext(context.Context) ClusterIdentityOutput
}

type ClusterIdentityArgs struct {
	// A list of User Assigned Managed Identity IDs to be assigned to this Windows Web App Slot.
	//
	// > **Note:** This is required when `type` is set to `UserAssigned`.
	IdentityIds pulumi.StringArrayInput `pulumi:"identityIds"`
	// The Principal ID associated with this Managed Service Identity.
	PrincipalId pulumi.StringPtrInput `pulumi:"principalId"`
	// The Tenant ID associated with this Managed Service Identity.
	TenantId pulumi.StringPtrInput `pulumi:"tenantId"`
	// Specifies the type of Managed Service Identity that should be configured on this Log Analytics Cluster. Possible values are `SystemAssigned` and  `UserAssigned`. Changing this forces a new resource to be created.
	//
	// > **Note:** The assigned `principalId` and `tenantId` can be retrieved after the identity `type` has been set to `SystemAssigned` and the Log Analytics Cluster has been created. More details are available below.
	Type pulumi.StringInput `pulumi:"type"`
}

func (ClusterIdentityArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterIdentity)(nil)).Elem()
}

func (i ClusterIdentityArgs) ToClusterIdentityOutput() ClusterIdentityOutput {
	return i.ToClusterIdentityOutputWithContext(context.Background())
}

func (i ClusterIdentityArgs) ToClusterIdentityOutputWithContext(ctx context.Context) ClusterIdentityOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterIdentityOutput)
}

func (i ClusterIdentityArgs) ToClusterIdentityPtrOutput() ClusterIdentityPtrOutput {
	return i.ToClusterIdentityPtrOutputWithContext(context.Background())
}

func (i ClusterIdentityArgs) ToClusterIdentityPtrOutputWithContext(ctx context.Context) ClusterIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterIdentityOutput).ToClusterIdentityPtrOutputWithContext(ctx)
}

// ClusterIdentityPtrInput is an input type that accepts ClusterIdentityArgs, ClusterIdentityPtr and ClusterIdentityPtrOutput values.
// You can construct a concrete instance of `ClusterIdentityPtrInput` via:
//
//	        ClusterIdentityArgs{...}
//
//	or:
//
//	        nil
type ClusterIdentityPtrInput interface {
	pulumi.Input

	ToClusterIdentityPtrOutput() ClusterIdentityPtrOutput
	ToClusterIdentityPtrOutputWithContext(context.Context) ClusterIdentityPtrOutput
}

type clusterIdentityPtrType ClusterIdentityArgs

func ClusterIdentityPtr(v *ClusterIdentityArgs) ClusterIdentityPtrInput {
	return (*clusterIdentityPtrType)(v)
}

func (*clusterIdentityPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterIdentity)(nil)).Elem()
}

func (i *clusterIdentityPtrType) ToClusterIdentityPtrOutput() ClusterIdentityPtrOutput {
	return i.ToClusterIdentityPtrOutputWithContext(context.Background())
}

func (i *clusterIdentityPtrType) ToClusterIdentityPtrOutputWithContext(ctx context.Context) ClusterIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterIdentityPtrOutput)
}

type ClusterIdentityOutput struct{ *pulumi.OutputState }

func (ClusterIdentityOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ClusterIdentity)(nil)).Elem()
}

func (o ClusterIdentityOutput) ToClusterIdentityOutput() ClusterIdentityOutput {
	return o
}

func (o ClusterIdentityOutput) ToClusterIdentityOutputWithContext(ctx context.Context) ClusterIdentityOutput {
	return o
}

func (o ClusterIdentityOutput) ToClusterIdentityPtrOutput() ClusterIdentityPtrOutput {
	return o.ToClusterIdentityPtrOutputWithContext(context.Background())
}

func (o ClusterIdentityOutput) ToClusterIdentityPtrOutputWithContext(ctx context.Context) ClusterIdentityPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ClusterIdentity) *ClusterIdentity {
		return &v
	}).(ClusterIdentityPtrOutput)
}

// A list of User Assigned Managed Identity IDs to be assigned to this Windows Web App Slot.
//
// > **Note:** This is required when `type` is set to `UserAssigned`.
func (o ClusterIdentityOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v ClusterIdentity) []string { return v.IdentityIds }).(pulumi.StringArrayOutput)
}

// The Principal ID associated with this Managed Service Identity.
func (o ClusterIdentityOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ClusterIdentity) *string { return v.PrincipalId }).(pulumi.StringPtrOutput)
}

// The Tenant ID associated with this Managed Service Identity.
func (o ClusterIdentityOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ClusterIdentity) *string { return v.TenantId }).(pulumi.StringPtrOutput)
}

// Specifies the type of Managed Service Identity that should be configured on this Log Analytics Cluster. Possible values are `SystemAssigned` and  `UserAssigned`. Changing this forces a new resource to be created.
//
// > **Note:** The assigned `principalId` and `tenantId` can be retrieved after the identity `type` has been set to `SystemAssigned` and the Log Analytics Cluster has been created. More details are available below.
func (o ClusterIdentityOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v ClusterIdentity) string { return v.Type }).(pulumi.StringOutput)
}

type ClusterIdentityPtrOutput struct{ *pulumi.OutputState }

func (ClusterIdentityPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterIdentity)(nil)).Elem()
}

func (o ClusterIdentityPtrOutput) ToClusterIdentityPtrOutput() ClusterIdentityPtrOutput {
	return o
}

func (o ClusterIdentityPtrOutput) ToClusterIdentityPtrOutputWithContext(ctx context.Context) ClusterIdentityPtrOutput {
	return o
}

func (o ClusterIdentityPtrOutput) Elem() ClusterIdentityOutput {
	return o.ApplyT(func(v *ClusterIdentity) ClusterIdentity {
		if v != nil {
			return *v
		}
		var ret ClusterIdentity
		return ret
	}).(ClusterIdentityOutput)
}

// A list of User Assigned Managed Identity IDs to be assigned to this Windows Web App Slot.
//
// > **Note:** This is required when `type` is set to `UserAssigned`.
func (o ClusterIdentityPtrOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ClusterIdentity) []string {
		if v == nil {
			return nil
		}
		return v.IdentityIds
	}).(pulumi.StringArrayOutput)
}

// The Principal ID associated with this Managed Service Identity.
func (o ClusterIdentityPtrOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterIdentity) *string {
		if v == nil {
			return nil
		}
		return v.PrincipalId
	}).(pulumi.StringPtrOutput)
}

// The Tenant ID associated with this Managed Service Identity.
func (o ClusterIdentityPtrOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterIdentity) *string {
		if v == nil {
			return nil
		}
		return v.TenantId
	}).(pulumi.StringPtrOutput)
}

// Specifies the type of Managed Service Identity that should be configured on this Log Analytics Cluster. Possible values are `SystemAssigned` and  `UserAssigned`. Changing this forces a new resource to be created.
//
// > **Note:** The assigned `principalId` and `tenantId` can be retrieved after the identity `type` has been set to `SystemAssigned` and the Log Analytics Cluster has been created. More details are available below.
func (o ClusterIdentityPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterIdentity) *string {
		if v == nil {
			return nil
		}
		return &v.Type
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterIdentityInput)(nil)).Elem(), ClusterIdentityArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterIdentityPtrInput)(nil)).Elem(), ClusterIdentityArgs{})
	pulumi.RegisterOutputType(ClusterIdentityOutput{})
	pulumi.RegisterOutputType(ClusterIdentityPtrOutput{})
}
