// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kusto

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Kusto Cluster Principal Assignment.
//
// ## Import
//
// Data Explorer Cluster Principal Assignments can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:kusto/clusterPrincipalAssignment:ClusterPrincipalAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/clusters/cluster1/principalAssignments/assignment1
// ```
type ClusterPrincipalAssignment struct {
	pulumi.CustomResourceState

	// The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The object id of the principal. Changing this forces a new resource to be created.
	PrincipalId pulumi.StringOutput `pulumi:"principalId"`
	// The name of the principal.
	PrincipalName pulumi.StringOutput `pulumi:"principalName"`
	// The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
	PrincipalType pulumi.StringOutput `pulumi:"principalType"`
	// The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
	Role pulumi.StringOutput `pulumi:"role"`
	// The tenant id in which the principal resides. Changing this forces a new resource to be created.
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
	// The name of the tenant.
	TenantName pulumi.StringOutput `pulumi:"tenantName"`
}

// NewClusterPrincipalAssignment registers a new resource with the given unique name, arguments, and options.
func NewClusterPrincipalAssignment(ctx *pulumi.Context,
	name string, args *ClusterPrincipalAssignmentArgs, opts ...pulumi.ResourceOption) (*ClusterPrincipalAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.PrincipalId == nil {
		return nil, errors.New("invalid value for required argument 'PrincipalId'")
	}
	if args.PrincipalType == nil {
		return nil, errors.New("invalid value for required argument 'PrincipalType'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.TenantId == nil {
		return nil, errors.New("invalid value for required argument 'TenantId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClusterPrincipalAssignment
	err := ctx.RegisterResource("azure:kusto/clusterPrincipalAssignment:ClusterPrincipalAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterPrincipalAssignment gets an existing ClusterPrincipalAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterPrincipalAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterPrincipalAssignmentState, opts ...pulumi.ResourceOption) (*ClusterPrincipalAssignment, error) {
	var resource ClusterPrincipalAssignment
	err := ctx.ReadResource("azure:kusto/clusterPrincipalAssignment:ClusterPrincipalAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterPrincipalAssignment resources.
type clusterPrincipalAssignmentState struct {
	// The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
	ClusterName *string `pulumi:"clusterName"`
	// The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The object id of the principal. Changing this forces a new resource to be created.
	PrincipalId *string `pulumi:"principalId"`
	// The name of the principal.
	PrincipalName *string `pulumi:"principalName"`
	// The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
	PrincipalType *string `pulumi:"principalType"`
	// The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
	Role *string `pulumi:"role"`
	// The tenant id in which the principal resides. Changing this forces a new resource to be created.
	TenantId *string `pulumi:"tenantId"`
	// The name of the tenant.
	TenantName *string `pulumi:"tenantName"`
}

type ClusterPrincipalAssignmentState struct {
	// The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
	ClusterName pulumi.StringPtrInput
	// The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The object id of the principal. Changing this forces a new resource to be created.
	PrincipalId pulumi.StringPtrInput
	// The name of the principal.
	PrincipalName pulumi.StringPtrInput
	// The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
	PrincipalType pulumi.StringPtrInput
	// The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
	Role pulumi.StringPtrInput
	// The tenant id in which the principal resides. Changing this forces a new resource to be created.
	TenantId pulumi.StringPtrInput
	// The name of the tenant.
	TenantName pulumi.StringPtrInput
}

func (ClusterPrincipalAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterPrincipalAssignmentState)(nil)).Elem()
}

type clusterPrincipalAssignmentArgs struct {
	// The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
	ClusterName string `pulumi:"clusterName"`
	// The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The object id of the principal. Changing this forces a new resource to be created.
	PrincipalId string `pulumi:"principalId"`
	// The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
	PrincipalType string `pulumi:"principalType"`
	// The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
	Role string `pulumi:"role"`
	// The tenant id in which the principal resides. Changing this forces a new resource to be created.
	TenantId string `pulumi:"tenantId"`
}

// The set of arguments for constructing a ClusterPrincipalAssignment resource.
type ClusterPrincipalAssignmentArgs struct {
	// The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
	ClusterName pulumi.StringInput
	// The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The object id of the principal. Changing this forces a new resource to be created.
	PrincipalId pulumi.StringInput
	// The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
	PrincipalType pulumi.StringInput
	// The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
	Role pulumi.StringInput
	// The tenant id in which the principal resides. Changing this forces a new resource to be created.
	TenantId pulumi.StringInput
}

func (ClusterPrincipalAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterPrincipalAssignmentArgs)(nil)).Elem()
}

type ClusterPrincipalAssignmentInput interface {
	pulumi.Input

	ToClusterPrincipalAssignmentOutput() ClusterPrincipalAssignmentOutput
	ToClusterPrincipalAssignmentOutputWithContext(ctx context.Context) ClusterPrincipalAssignmentOutput
}

func (*ClusterPrincipalAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterPrincipalAssignment)(nil)).Elem()
}

func (i *ClusterPrincipalAssignment) ToClusterPrincipalAssignmentOutput() ClusterPrincipalAssignmentOutput {
	return i.ToClusterPrincipalAssignmentOutputWithContext(context.Background())
}

func (i *ClusterPrincipalAssignment) ToClusterPrincipalAssignmentOutputWithContext(ctx context.Context) ClusterPrincipalAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterPrincipalAssignmentOutput)
}

// ClusterPrincipalAssignmentArrayInput is an input type that accepts ClusterPrincipalAssignmentArray and ClusterPrincipalAssignmentArrayOutput values.
// You can construct a concrete instance of `ClusterPrincipalAssignmentArrayInput` via:
//
//	ClusterPrincipalAssignmentArray{ ClusterPrincipalAssignmentArgs{...} }
type ClusterPrincipalAssignmentArrayInput interface {
	pulumi.Input

	ToClusterPrincipalAssignmentArrayOutput() ClusterPrincipalAssignmentArrayOutput
	ToClusterPrincipalAssignmentArrayOutputWithContext(context.Context) ClusterPrincipalAssignmentArrayOutput
}

type ClusterPrincipalAssignmentArray []ClusterPrincipalAssignmentInput

func (ClusterPrincipalAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterPrincipalAssignment)(nil)).Elem()
}

func (i ClusterPrincipalAssignmentArray) ToClusterPrincipalAssignmentArrayOutput() ClusterPrincipalAssignmentArrayOutput {
	return i.ToClusterPrincipalAssignmentArrayOutputWithContext(context.Background())
}

func (i ClusterPrincipalAssignmentArray) ToClusterPrincipalAssignmentArrayOutputWithContext(ctx context.Context) ClusterPrincipalAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterPrincipalAssignmentArrayOutput)
}

// ClusterPrincipalAssignmentMapInput is an input type that accepts ClusterPrincipalAssignmentMap and ClusterPrincipalAssignmentMapOutput values.
// You can construct a concrete instance of `ClusterPrincipalAssignmentMapInput` via:
//
//	ClusterPrincipalAssignmentMap{ "key": ClusterPrincipalAssignmentArgs{...} }
type ClusterPrincipalAssignmentMapInput interface {
	pulumi.Input

	ToClusterPrincipalAssignmentMapOutput() ClusterPrincipalAssignmentMapOutput
	ToClusterPrincipalAssignmentMapOutputWithContext(context.Context) ClusterPrincipalAssignmentMapOutput
}

type ClusterPrincipalAssignmentMap map[string]ClusterPrincipalAssignmentInput

func (ClusterPrincipalAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterPrincipalAssignment)(nil)).Elem()
}

func (i ClusterPrincipalAssignmentMap) ToClusterPrincipalAssignmentMapOutput() ClusterPrincipalAssignmentMapOutput {
	return i.ToClusterPrincipalAssignmentMapOutputWithContext(context.Background())
}

func (i ClusterPrincipalAssignmentMap) ToClusterPrincipalAssignmentMapOutputWithContext(ctx context.Context) ClusterPrincipalAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterPrincipalAssignmentMapOutput)
}

type ClusterPrincipalAssignmentOutput struct{ *pulumi.OutputState }

func (ClusterPrincipalAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterPrincipalAssignment)(nil)).Elem()
}

func (o ClusterPrincipalAssignmentOutput) ToClusterPrincipalAssignmentOutput() ClusterPrincipalAssignmentOutput {
	return o
}

func (o ClusterPrincipalAssignmentOutput) ToClusterPrincipalAssignmentOutputWithContext(ctx context.Context) ClusterPrincipalAssignmentOutput {
	return o
}

// The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
func (o ClusterPrincipalAssignmentOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPrincipalAssignment) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
func (o ClusterPrincipalAssignmentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPrincipalAssignment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The object id of the principal. Changing this forces a new resource to be created.
func (o ClusterPrincipalAssignmentOutput) PrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPrincipalAssignment) pulumi.StringOutput { return v.PrincipalId }).(pulumi.StringOutput)
}

// The name of the principal.
func (o ClusterPrincipalAssignmentOutput) PrincipalName() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPrincipalAssignment) pulumi.StringOutput { return v.PrincipalName }).(pulumi.StringOutput)
}

// The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
func (o ClusterPrincipalAssignmentOutput) PrincipalType() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPrincipalAssignment) pulumi.StringOutput { return v.PrincipalType }).(pulumi.StringOutput)
}

// The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
func (o ClusterPrincipalAssignmentOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPrincipalAssignment) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
func (o ClusterPrincipalAssignmentOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPrincipalAssignment) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// The tenant id in which the principal resides. Changing this forces a new resource to be created.
func (o ClusterPrincipalAssignmentOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPrincipalAssignment) pulumi.StringOutput { return v.TenantId }).(pulumi.StringOutput)
}

// The name of the tenant.
func (o ClusterPrincipalAssignmentOutput) TenantName() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPrincipalAssignment) pulumi.StringOutput { return v.TenantName }).(pulumi.StringOutput)
}

type ClusterPrincipalAssignmentArrayOutput struct{ *pulumi.OutputState }

func (ClusterPrincipalAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterPrincipalAssignment)(nil)).Elem()
}

func (o ClusterPrincipalAssignmentArrayOutput) ToClusterPrincipalAssignmentArrayOutput() ClusterPrincipalAssignmentArrayOutput {
	return o
}

func (o ClusterPrincipalAssignmentArrayOutput) ToClusterPrincipalAssignmentArrayOutputWithContext(ctx context.Context) ClusterPrincipalAssignmentArrayOutput {
	return o
}

func (o ClusterPrincipalAssignmentArrayOutput) Index(i pulumi.IntInput) ClusterPrincipalAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterPrincipalAssignment {
		return vs[0].([]*ClusterPrincipalAssignment)[vs[1].(int)]
	}).(ClusterPrincipalAssignmentOutput)
}

type ClusterPrincipalAssignmentMapOutput struct{ *pulumi.OutputState }

func (ClusterPrincipalAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterPrincipalAssignment)(nil)).Elem()
}

func (o ClusterPrincipalAssignmentMapOutput) ToClusterPrincipalAssignmentMapOutput() ClusterPrincipalAssignmentMapOutput {
	return o
}

func (o ClusterPrincipalAssignmentMapOutput) ToClusterPrincipalAssignmentMapOutputWithContext(ctx context.Context) ClusterPrincipalAssignmentMapOutput {
	return o
}

func (o ClusterPrincipalAssignmentMapOutput) MapIndex(k pulumi.StringInput) ClusterPrincipalAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterPrincipalAssignment {
		return vs[0].(map[string]*ClusterPrincipalAssignment)[vs[1].(string)]
	}).(ClusterPrincipalAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterPrincipalAssignmentInput)(nil)).Elem(), &ClusterPrincipalAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterPrincipalAssignmentArrayInput)(nil)).Elem(), ClusterPrincipalAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterPrincipalAssignmentMapInput)(nil)).Elem(), ClusterPrincipalAssignmentMap{})
	pulumi.RegisterOutputType(ClusterPrincipalAssignmentOutput{})
	pulumi.RegisterOutputType(ClusterPrincipalAssignmentArrayOutput{})
	pulumi.RegisterOutputType(ClusterPrincipalAssignmentMapOutput{})
}
