// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mssql

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// SQL Instance Failover Groups can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:mssql/managedInstanceFailoverGroup:ManagedInstanceFailoverGroup example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Sql/locations/Location/instanceFailoverGroups/failoverGroup1
// ```
type ManagedInstanceFailoverGroup struct {
	pulumi.CustomResourceState

	// The Azure Region where the Managed Instance Failover Group should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The ID of the Azure SQL Managed Instance which will be replicated using a Managed Instance Failover Group. Changing this forces a new resource to be created.
	ManagedInstanceId pulumi.StringOutput `pulumi:"managedInstanceId"`
	// The name which should be used for this Managed Instance Failover Group. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Azure SQL Managed Instance which will be replicated to. Changing this forces a new resource to be created.
	PartnerManagedInstanceId pulumi.StringOutput `pulumi:"partnerManagedInstanceId"`
	// A `partnerRegion` block as defined below.
	PartnerRegions ManagedInstanceFailoverGroupPartnerRegionArrayOutput `pulumi:"partnerRegions"`
	// A `readWriteEndpointFailoverPolicy` block as defined below.
	ReadWriteEndpointFailoverPolicy ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyOutput `pulumi:"readWriteEndpointFailoverPolicy"`
	// Failover policy for the read-only endpoint. Defaults to `false`.
	ReadonlyEndpointFailoverPolicyEnabled pulumi.BoolPtrOutput `pulumi:"readonlyEndpointFailoverPolicyEnabled"`
	// The partner replication role of the Managed Instance Failover Group.
	Role pulumi.StringOutput `pulumi:"role"`
}

// NewManagedInstanceFailoverGroup registers a new resource with the given unique name, arguments, and options.
func NewManagedInstanceFailoverGroup(ctx *pulumi.Context,
	name string, args *ManagedInstanceFailoverGroupArgs, opts ...pulumi.ResourceOption) (*ManagedInstanceFailoverGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ManagedInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'ManagedInstanceId'")
	}
	if args.PartnerManagedInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'PartnerManagedInstanceId'")
	}
	if args.ReadWriteEndpointFailoverPolicy == nil {
		return nil, errors.New("invalid value for required argument 'ReadWriteEndpointFailoverPolicy'")
	}
	var resource ManagedInstanceFailoverGroup
	err := ctx.RegisterResource("azure:mssql/managedInstanceFailoverGroup:ManagedInstanceFailoverGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedInstanceFailoverGroup gets an existing ManagedInstanceFailoverGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedInstanceFailoverGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedInstanceFailoverGroupState, opts ...pulumi.ResourceOption) (*ManagedInstanceFailoverGroup, error) {
	var resource ManagedInstanceFailoverGroup
	err := ctx.ReadResource("azure:mssql/managedInstanceFailoverGroup:ManagedInstanceFailoverGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedInstanceFailoverGroup resources.
type managedInstanceFailoverGroupState struct {
	// The Azure Region where the Managed Instance Failover Group should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The ID of the Azure SQL Managed Instance which will be replicated using a Managed Instance Failover Group. Changing this forces a new resource to be created.
	ManagedInstanceId *string `pulumi:"managedInstanceId"`
	// The name which should be used for this Managed Instance Failover Group. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Azure SQL Managed Instance which will be replicated to. Changing this forces a new resource to be created.
	PartnerManagedInstanceId *string `pulumi:"partnerManagedInstanceId"`
	// A `partnerRegion` block as defined below.
	PartnerRegions []ManagedInstanceFailoverGroupPartnerRegion `pulumi:"partnerRegions"`
	// A `readWriteEndpointFailoverPolicy` block as defined below.
	ReadWriteEndpointFailoverPolicy *ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicy `pulumi:"readWriteEndpointFailoverPolicy"`
	// Failover policy for the read-only endpoint. Defaults to `false`.
	ReadonlyEndpointFailoverPolicyEnabled *bool `pulumi:"readonlyEndpointFailoverPolicyEnabled"`
	// The partner replication role of the Managed Instance Failover Group.
	Role *string `pulumi:"role"`
}

type ManagedInstanceFailoverGroupState struct {
	// The Azure Region where the Managed Instance Failover Group should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The ID of the Azure SQL Managed Instance which will be replicated using a Managed Instance Failover Group. Changing this forces a new resource to be created.
	ManagedInstanceId pulumi.StringPtrInput
	// The name which should be used for this Managed Instance Failover Group. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Azure SQL Managed Instance which will be replicated to. Changing this forces a new resource to be created.
	PartnerManagedInstanceId pulumi.StringPtrInput
	// A `partnerRegion` block as defined below.
	PartnerRegions ManagedInstanceFailoverGroupPartnerRegionArrayInput
	// A `readWriteEndpointFailoverPolicy` block as defined below.
	ReadWriteEndpointFailoverPolicy ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyPtrInput
	// Failover policy for the read-only endpoint. Defaults to `false`.
	ReadonlyEndpointFailoverPolicyEnabled pulumi.BoolPtrInput
	// The partner replication role of the Managed Instance Failover Group.
	Role pulumi.StringPtrInput
}

func (ManagedInstanceFailoverGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedInstanceFailoverGroupState)(nil)).Elem()
}

type managedInstanceFailoverGroupArgs struct {
	// The Azure Region where the Managed Instance Failover Group should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The ID of the Azure SQL Managed Instance which will be replicated using a Managed Instance Failover Group. Changing this forces a new resource to be created.
	ManagedInstanceId string `pulumi:"managedInstanceId"`
	// The name which should be used for this Managed Instance Failover Group. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Azure SQL Managed Instance which will be replicated to. Changing this forces a new resource to be created.
	PartnerManagedInstanceId string `pulumi:"partnerManagedInstanceId"`
	// A `readWriteEndpointFailoverPolicy` block as defined below.
	ReadWriteEndpointFailoverPolicy ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicy `pulumi:"readWriteEndpointFailoverPolicy"`
	// Failover policy for the read-only endpoint. Defaults to `false`.
	ReadonlyEndpointFailoverPolicyEnabled *bool `pulumi:"readonlyEndpointFailoverPolicyEnabled"`
}

// The set of arguments for constructing a ManagedInstanceFailoverGroup resource.
type ManagedInstanceFailoverGroupArgs struct {
	// The Azure Region where the Managed Instance Failover Group should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The ID of the Azure SQL Managed Instance which will be replicated using a Managed Instance Failover Group. Changing this forces a new resource to be created.
	ManagedInstanceId pulumi.StringInput
	// The name which should be used for this Managed Instance Failover Group. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Azure SQL Managed Instance which will be replicated to. Changing this forces a new resource to be created.
	PartnerManagedInstanceId pulumi.StringInput
	// A `readWriteEndpointFailoverPolicy` block as defined below.
	ReadWriteEndpointFailoverPolicy ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyInput
	// Failover policy for the read-only endpoint. Defaults to `false`.
	ReadonlyEndpointFailoverPolicyEnabled pulumi.BoolPtrInput
}

func (ManagedInstanceFailoverGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedInstanceFailoverGroupArgs)(nil)).Elem()
}

type ManagedInstanceFailoverGroupInput interface {
	pulumi.Input

	ToManagedInstanceFailoverGroupOutput() ManagedInstanceFailoverGroupOutput
	ToManagedInstanceFailoverGroupOutputWithContext(ctx context.Context) ManagedInstanceFailoverGroupOutput
}

func (*ManagedInstanceFailoverGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedInstanceFailoverGroup)(nil)).Elem()
}

func (i *ManagedInstanceFailoverGroup) ToManagedInstanceFailoverGroupOutput() ManagedInstanceFailoverGroupOutput {
	return i.ToManagedInstanceFailoverGroupOutputWithContext(context.Background())
}

func (i *ManagedInstanceFailoverGroup) ToManagedInstanceFailoverGroupOutputWithContext(ctx context.Context) ManagedInstanceFailoverGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedInstanceFailoverGroupOutput)
}

// ManagedInstanceFailoverGroupArrayInput is an input type that accepts ManagedInstanceFailoverGroupArray and ManagedInstanceFailoverGroupArrayOutput values.
// You can construct a concrete instance of `ManagedInstanceFailoverGroupArrayInput` via:
//
//          ManagedInstanceFailoverGroupArray{ ManagedInstanceFailoverGroupArgs{...} }
type ManagedInstanceFailoverGroupArrayInput interface {
	pulumi.Input

	ToManagedInstanceFailoverGroupArrayOutput() ManagedInstanceFailoverGroupArrayOutput
	ToManagedInstanceFailoverGroupArrayOutputWithContext(context.Context) ManagedInstanceFailoverGroupArrayOutput
}

type ManagedInstanceFailoverGroupArray []ManagedInstanceFailoverGroupInput

func (ManagedInstanceFailoverGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedInstanceFailoverGroup)(nil)).Elem()
}

func (i ManagedInstanceFailoverGroupArray) ToManagedInstanceFailoverGroupArrayOutput() ManagedInstanceFailoverGroupArrayOutput {
	return i.ToManagedInstanceFailoverGroupArrayOutputWithContext(context.Background())
}

func (i ManagedInstanceFailoverGroupArray) ToManagedInstanceFailoverGroupArrayOutputWithContext(ctx context.Context) ManagedInstanceFailoverGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedInstanceFailoverGroupArrayOutput)
}

// ManagedInstanceFailoverGroupMapInput is an input type that accepts ManagedInstanceFailoverGroupMap and ManagedInstanceFailoverGroupMapOutput values.
// You can construct a concrete instance of `ManagedInstanceFailoverGroupMapInput` via:
//
//          ManagedInstanceFailoverGroupMap{ "key": ManagedInstanceFailoverGroupArgs{...} }
type ManagedInstanceFailoverGroupMapInput interface {
	pulumi.Input

	ToManagedInstanceFailoverGroupMapOutput() ManagedInstanceFailoverGroupMapOutput
	ToManagedInstanceFailoverGroupMapOutputWithContext(context.Context) ManagedInstanceFailoverGroupMapOutput
}

type ManagedInstanceFailoverGroupMap map[string]ManagedInstanceFailoverGroupInput

func (ManagedInstanceFailoverGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedInstanceFailoverGroup)(nil)).Elem()
}

func (i ManagedInstanceFailoverGroupMap) ToManagedInstanceFailoverGroupMapOutput() ManagedInstanceFailoverGroupMapOutput {
	return i.ToManagedInstanceFailoverGroupMapOutputWithContext(context.Background())
}

func (i ManagedInstanceFailoverGroupMap) ToManagedInstanceFailoverGroupMapOutputWithContext(ctx context.Context) ManagedInstanceFailoverGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedInstanceFailoverGroupMapOutput)
}

type ManagedInstanceFailoverGroupOutput struct{ *pulumi.OutputState }

func (ManagedInstanceFailoverGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedInstanceFailoverGroup)(nil)).Elem()
}

func (o ManagedInstanceFailoverGroupOutput) ToManagedInstanceFailoverGroupOutput() ManagedInstanceFailoverGroupOutput {
	return o
}

func (o ManagedInstanceFailoverGroupOutput) ToManagedInstanceFailoverGroupOutputWithContext(ctx context.Context) ManagedInstanceFailoverGroupOutput {
	return o
}

type ManagedInstanceFailoverGroupArrayOutput struct{ *pulumi.OutputState }

func (ManagedInstanceFailoverGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedInstanceFailoverGroup)(nil)).Elem()
}

func (o ManagedInstanceFailoverGroupArrayOutput) ToManagedInstanceFailoverGroupArrayOutput() ManagedInstanceFailoverGroupArrayOutput {
	return o
}

func (o ManagedInstanceFailoverGroupArrayOutput) ToManagedInstanceFailoverGroupArrayOutputWithContext(ctx context.Context) ManagedInstanceFailoverGroupArrayOutput {
	return o
}

func (o ManagedInstanceFailoverGroupArrayOutput) Index(i pulumi.IntInput) ManagedInstanceFailoverGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ManagedInstanceFailoverGroup {
		return vs[0].([]*ManagedInstanceFailoverGroup)[vs[1].(int)]
	}).(ManagedInstanceFailoverGroupOutput)
}

type ManagedInstanceFailoverGroupMapOutput struct{ *pulumi.OutputState }

func (ManagedInstanceFailoverGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedInstanceFailoverGroup)(nil)).Elem()
}

func (o ManagedInstanceFailoverGroupMapOutput) ToManagedInstanceFailoverGroupMapOutput() ManagedInstanceFailoverGroupMapOutput {
	return o
}

func (o ManagedInstanceFailoverGroupMapOutput) ToManagedInstanceFailoverGroupMapOutputWithContext(ctx context.Context) ManagedInstanceFailoverGroupMapOutput {
	return o
}

func (o ManagedInstanceFailoverGroupMapOutput) MapIndex(k pulumi.StringInput) ManagedInstanceFailoverGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ManagedInstanceFailoverGroup {
		return vs[0].(map[string]*ManagedInstanceFailoverGroup)[vs[1].(string)]
	}).(ManagedInstanceFailoverGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedInstanceFailoverGroupInput)(nil)).Elem(), &ManagedInstanceFailoverGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedInstanceFailoverGroupArrayInput)(nil)).Elem(), ManagedInstanceFailoverGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedInstanceFailoverGroupMapInput)(nil)).Elem(), ManagedInstanceFailoverGroupMap{})
	pulumi.RegisterOutputType(ManagedInstanceFailoverGroupOutput{})
	pulumi.RegisterOutputType(ManagedInstanceFailoverGroupArrayOutput{})
	pulumi.RegisterOutputType(ManagedInstanceFailoverGroupMapOutput{})
}