// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package desktopvirtualization

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Virtual Desktop Scaling Plan.
//
// ## Disclaimers
//
// > **Note:** Scaling Plans are currently in preview and are only supported in a limited number of regions. Both the Scaling Plan and any referenced Host Pools must be deployed in a supported region. [Autoscale (preview) for Azure Virtual Desktop host pools](https://docs.microsoft.com/azure/virtual-desktop/autoscale-scaling-plan).
//
// > **Note:** Scaling Plans require specific permissions to be granted to the Windows Virtual Desktop application before a 'host_pool' can be configured. [Required Permissions for Scaling Plans](https://docs.microsoft.com/azure/virtual-desktop/autoscale-scaling-plan#create-a-custom-rbac-role).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/authorization"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/desktopvirtualization"
//	"github.com/pulumi/pulumi-azuread/sdk/v5/go/azuread"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleRandomUuid, err := random.NewRandomUuid(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleRoleDefinition, err := authorization.NewRoleDefinition(ctx, "example", &authorization.RoleDefinitionArgs{
//				Name:        pulumi.String("AVD-AutoScale"),
//				Scope:       exampleResourceGroup.ID(),
//				Description: pulumi.String("AVD AutoScale Role"),
//				Permissions: authorization.RoleDefinitionPermissionArray{
//					&authorization.RoleDefinitionPermissionArgs{
//						Actions: pulumi.StringArray{
//							pulumi.String("Microsoft.Insights/eventtypes/values/read"),
//							pulumi.String("Microsoft.Compute/virtualMachines/deallocate/action"),
//							pulumi.String("Microsoft.Compute/virtualMachines/restart/action"),
//							pulumi.String("Microsoft.Compute/virtualMachines/powerOff/action"),
//							pulumi.String("Microsoft.Compute/virtualMachines/start/action"),
//							pulumi.String("Microsoft.Compute/virtualMachines/read"),
//							pulumi.String("Microsoft.DesktopVirtualization/hostpools/read"),
//							pulumi.String("Microsoft.DesktopVirtualization/hostpools/write"),
//							pulumi.String("Microsoft.DesktopVirtualization/hostpools/sessionhosts/read"),
//							pulumi.String("Microsoft.DesktopVirtualization/hostpools/sessionhosts/write"),
//							pulumi.String("Microsoft.DesktopVirtualization/hostpools/sessionhosts/usersessions/delete"),
//							pulumi.String("Microsoft.DesktopVirtualization/hostpools/sessionhosts/usersessions/read"),
//							pulumi.String("Microsoft.DesktopVirtualization/hostpools/sessionhosts/usersessions/sendMessage/action"),
//							pulumi.String("Microsoft.DesktopVirtualization/hostpools/sessionhosts/usersessions/read"),
//						},
//						NotActions: pulumi.StringArray{},
//					},
//				},
//				AssignableScopes: pulumi.StringArray{
//					exampleResourceGroup.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			example, err := azuread.LookupServicePrincipal(ctx, &azuread.LookupServicePrincipalArgs{
//				DisplayName: pulumi.StringRef("Azure Virtual Desktop"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = authorization.NewAssignment(ctx, "example", &authorization.AssignmentArgs{
//				Name:                         exampleRandomUuid.Result,
//				Scope:                        exampleResourceGroup.ID(),
//				RoleDefinitionId:             exampleRoleDefinition.RoleDefinitionResourceId,
//				PrincipalId:                  pulumi.String(example.Id),
//				SkipServicePrincipalAadCheck: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			exampleHostPool, err := desktopvirtualization.NewHostPool(ctx, "example", &desktopvirtualization.HostPoolArgs{
//				Name:                pulumi.String("example-hostpool"),
//				Location:            exampleResourceGroup.Location,
//				ResourceGroupName:   exampleResourceGroup.Name,
//				Type:                pulumi.String("Pooled"),
//				ValidateEnvironment: pulumi.Bool(true),
//				LoadBalancerType:    pulumi.String("BreadthFirst"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = desktopvirtualization.NewScalingPlan(ctx, "example", &desktopvirtualization.ScalingPlanArgs{
//				Name:              pulumi.String("example-scaling-plan"),
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				FriendlyName:      pulumi.String("Scaling Plan Example"),
//				Description:       pulumi.String("Example Scaling Plan"),
//				TimeZone:          pulumi.String("GMT Standard Time"),
//				Schedules: desktopvirtualization.ScalingPlanScheduleArray{
//					&desktopvirtualization.ScalingPlanScheduleArgs{
//						Name: pulumi.String("Weekdays"),
//						DaysOfWeeks: pulumi.StringArray{
//							pulumi.String("Monday"),
//							pulumi.String("Tuesday"),
//							pulumi.String("Wednesday"),
//							pulumi.String("Thursday"),
//							pulumi.String("Friday"),
//						},
//						RampUpStartTime:                  pulumi.String("05:00"),
//						RampUpLoadBalancingAlgorithm:     pulumi.String("BreadthFirst"),
//						RampUpMinimumHostsPercent:        pulumi.Int(20),
//						RampUpCapacityThresholdPercent:   pulumi.Int(10),
//						PeakStartTime:                    pulumi.String("09:00"),
//						PeakLoadBalancingAlgorithm:       pulumi.String("BreadthFirst"),
//						RampDownStartTime:                pulumi.String("19:00"),
//						RampDownLoadBalancingAlgorithm:   pulumi.String("DepthFirst"),
//						RampDownMinimumHostsPercent:      pulumi.Int(10),
//						RampDownForceLogoffUsers:         pulumi.Bool(false),
//						RampDownWaitTimeMinutes:          pulumi.Int(45),
//						RampDownNotificationMessage:      pulumi.String("Please log off in the next 45 minutes..."),
//						RampDownCapacityThresholdPercent: pulumi.Int(5),
//						RampDownStopHostsWhen:            pulumi.String("ZeroSessions"),
//						OffPeakStartTime:                 pulumi.String("22:00"),
//						OffPeakLoadBalancingAlgorithm:    pulumi.String("DepthFirst"),
//					},
//				},
//				HostPools: desktopvirtualization.ScalingPlanHostPoolArray{
//					&desktopvirtualization.ScalingPlanHostPoolArgs{
//						HostpoolId:         exampleHostPool.ID(),
//						ScalingPlanEnabled: pulumi.Bool(true),
//					},
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
// * `Microsoft.DesktopVirtualization`: 2024-04-03
//
// ## Import
//
// Virtual Desktop Scaling Plans can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:desktopvirtualization/scalingPlan:ScalingPlan example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.DesktopVirtualization/scalingPlans/plan1
// ```
type ScalingPlan struct {
	pulumi.CustomResourceState

	// A description of the Scaling Plan.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the tag associated with the VMs you want to exclude from autoscaling.
	ExclusionTag pulumi.StringPtrOutput `pulumi:"exclusionTag"`
	// Friendly name of the Scaling Plan.
	FriendlyName pulumi.StringPtrOutput `pulumi:"friendlyName"`
	// One or more `hostPool` blocks as defined below.
	HostPools ScalingPlanHostPoolArrayOutput `pulumi:"hostPools"`
	// The Azure Region where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name which should be used for this Virtual Desktop Scaling Plan . Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// One or more `schedule` blocks as defined below.
	Schedules ScalingPlanScheduleArrayOutput `pulumi:"schedules"`
	// A mapping of tags which should be assigned to the Virtual Desktop Scaling Plan .
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Specifies the Time Zone which should be used by the Scaling Plan for time based events, [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
	TimeZone pulumi.StringOutput `pulumi:"timeZone"`
}

// NewScalingPlan registers a new resource with the given unique name, arguments, and options.
func NewScalingPlan(ctx *pulumi.Context,
	name string, args *ScalingPlanArgs, opts ...pulumi.ResourceOption) (*ScalingPlan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Schedules == nil {
		return nil, errors.New("invalid value for required argument 'Schedules'")
	}
	if args.TimeZone == nil {
		return nil, errors.New("invalid value for required argument 'TimeZone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ScalingPlan
	err := ctx.RegisterResource("azure:desktopvirtualization/scalingPlan:ScalingPlan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScalingPlan gets an existing ScalingPlan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScalingPlan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScalingPlanState, opts ...pulumi.ResourceOption) (*ScalingPlan, error) {
	var resource ScalingPlan
	err := ctx.ReadResource("azure:desktopvirtualization/scalingPlan:ScalingPlan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ScalingPlan resources.
type scalingPlanState struct {
	// A description of the Scaling Plan.
	Description *string `pulumi:"description"`
	// The name of the tag associated with the VMs you want to exclude from autoscaling.
	ExclusionTag *string `pulumi:"exclusionTag"`
	// Friendly name of the Scaling Plan.
	FriendlyName *string `pulumi:"friendlyName"`
	// One or more `hostPool` blocks as defined below.
	HostPools []ScalingPlanHostPool `pulumi:"hostPools"`
	// The Azure Region where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Virtual Desktop Scaling Plan . Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// One or more `schedule` blocks as defined below.
	Schedules []ScalingPlanSchedule `pulumi:"schedules"`
	// A mapping of tags which should be assigned to the Virtual Desktop Scaling Plan .
	Tags map[string]string `pulumi:"tags"`
	// Specifies the Time Zone which should be used by the Scaling Plan for time based events, [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
	TimeZone *string `pulumi:"timeZone"`
}

type ScalingPlanState struct {
	// A description of the Scaling Plan.
	Description pulumi.StringPtrInput
	// The name of the tag associated with the VMs you want to exclude from autoscaling.
	ExclusionTag pulumi.StringPtrInput
	// Friendly name of the Scaling Plan.
	FriendlyName pulumi.StringPtrInput
	// One or more `hostPool` blocks as defined below.
	HostPools ScalingPlanHostPoolArrayInput
	// The Azure Region where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Virtual Desktop Scaling Plan . Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	ResourceGroupName pulumi.StringPtrInput
	// One or more `schedule` blocks as defined below.
	Schedules ScalingPlanScheduleArrayInput
	// A mapping of tags which should be assigned to the Virtual Desktop Scaling Plan .
	Tags pulumi.StringMapInput
	// Specifies the Time Zone which should be used by the Scaling Plan for time based events, [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
	TimeZone pulumi.StringPtrInput
}

func (ScalingPlanState) ElementType() reflect.Type {
	return reflect.TypeOf((*scalingPlanState)(nil)).Elem()
}

type scalingPlanArgs struct {
	// A description of the Scaling Plan.
	Description *string `pulumi:"description"`
	// The name of the tag associated with the VMs you want to exclude from autoscaling.
	ExclusionTag *string `pulumi:"exclusionTag"`
	// Friendly name of the Scaling Plan.
	FriendlyName *string `pulumi:"friendlyName"`
	// One or more `hostPool` blocks as defined below.
	HostPools []ScalingPlanHostPool `pulumi:"hostPools"`
	// The Azure Region where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Virtual Desktop Scaling Plan . Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// One or more `schedule` blocks as defined below.
	Schedules []ScalingPlanSchedule `pulumi:"schedules"`
	// A mapping of tags which should be assigned to the Virtual Desktop Scaling Plan .
	Tags map[string]string `pulumi:"tags"`
	// Specifies the Time Zone which should be used by the Scaling Plan for time based events, [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
	TimeZone string `pulumi:"timeZone"`
}

// The set of arguments for constructing a ScalingPlan resource.
type ScalingPlanArgs struct {
	// A description of the Scaling Plan.
	Description pulumi.StringPtrInput
	// The name of the tag associated with the VMs you want to exclude from autoscaling.
	ExclusionTag pulumi.StringPtrInput
	// Friendly name of the Scaling Plan.
	FriendlyName pulumi.StringPtrInput
	// One or more `hostPool` blocks as defined below.
	HostPools ScalingPlanHostPoolArrayInput
	// The Azure Region where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Virtual Desktop Scaling Plan . Changing this forces a new Virtual Desktop Scaling Plan to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
	ResourceGroupName pulumi.StringInput
	// One or more `schedule` blocks as defined below.
	Schedules ScalingPlanScheduleArrayInput
	// A mapping of tags which should be assigned to the Virtual Desktop Scaling Plan .
	Tags pulumi.StringMapInput
	// Specifies the Time Zone which should be used by the Scaling Plan for time based events, [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
	TimeZone pulumi.StringInput
}

func (ScalingPlanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scalingPlanArgs)(nil)).Elem()
}

type ScalingPlanInput interface {
	pulumi.Input

	ToScalingPlanOutput() ScalingPlanOutput
	ToScalingPlanOutputWithContext(ctx context.Context) ScalingPlanOutput
}

func (*ScalingPlan) ElementType() reflect.Type {
	return reflect.TypeOf((**ScalingPlan)(nil)).Elem()
}

func (i *ScalingPlan) ToScalingPlanOutput() ScalingPlanOutput {
	return i.ToScalingPlanOutputWithContext(context.Background())
}

func (i *ScalingPlan) ToScalingPlanOutputWithContext(ctx context.Context) ScalingPlanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScalingPlanOutput)
}

// ScalingPlanArrayInput is an input type that accepts ScalingPlanArray and ScalingPlanArrayOutput values.
// You can construct a concrete instance of `ScalingPlanArrayInput` via:
//
//	ScalingPlanArray{ ScalingPlanArgs{...} }
type ScalingPlanArrayInput interface {
	pulumi.Input

	ToScalingPlanArrayOutput() ScalingPlanArrayOutput
	ToScalingPlanArrayOutputWithContext(context.Context) ScalingPlanArrayOutput
}

type ScalingPlanArray []ScalingPlanInput

func (ScalingPlanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScalingPlan)(nil)).Elem()
}

func (i ScalingPlanArray) ToScalingPlanArrayOutput() ScalingPlanArrayOutput {
	return i.ToScalingPlanArrayOutputWithContext(context.Background())
}

func (i ScalingPlanArray) ToScalingPlanArrayOutputWithContext(ctx context.Context) ScalingPlanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScalingPlanArrayOutput)
}

// ScalingPlanMapInput is an input type that accepts ScalingPlanMap and ScalingPlanMapOutput values.
// You can construct a concrete instance of `ScalingPlanMapInput` via:
//
//	ScalingPlanMap{ "key": ScalingPlanArgs{...} }
type ScalingPlanMapInput interface {
	pulumi.Input

	ToScalingPlanMapOutput() ScalingPlanMapOutput
	ToScalingPlanMapOutputWithContext(context.Context) ScalingPlanMapOutput
}

type ScalingPlanMap map[string]ScalingPlanInput

func (ScalingPlanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScalingPlan)(nil)).Elem()
}

func (i ScalingPlanMap) ToScalingPlanMapOutput() ScalingPlanMapOutput {
	return i.ToScalingPlanMapOutputWithContext(context.Background())
}

func (i ScalingPlanMap) ToScalingPlanMapOutputWithContext(ctx context.Context) ScalingPlanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScalingPlanMapOutput)
}

type ScalingPlanOutput struct{ *pulumi.OutputState }

func (ScalingPlanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ScalingPlan)(nil)).Elem()
}

func (o ScalingPlanOutput) ToScalingPlanOutput() ScalingPlanOutput {
	return o
}

func (o ScalingPlanOutput) ToScalingPlanOutputWithContext(ctx context.Context) ScalingPlanOutput {
	return o
}

// A description of the Scaling Plan.
func (o ScalingPlanOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScalingPlan) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the tag associated with the VMs you want to exclude from autoscaling.
func (o ScalingPlanOutput) ExclusionTag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScalingPlan) pulumi.StringPtrOutput { return v.ExclusionTag }).(pulumi.StringPtrOutput)
}

// Friendly name of the Scaling Plan.
func (o ScalingPlanOutput) FriendlyName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScalingPlan) pulumi.StringPtrOutput { return v.FriendlyName }).(pulumi.StringPtrOutput)
}

// One or more `hostPool` blocks as defined below.
func (o ScalingPlanOutput) HostPools() ScalingPlanHostPoolArrayOutput {
	return o.ApplyT(func(v *ScalingPlan) ScalingPlanHostPoolArrayOutput { return v.HostPools }).(ScalingPlanHostPoolArrayOutput)
}

// The Azure Region where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
func (o ScalingPlanOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ScalingPlan) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name which should be used for this Virtual Desktop Scaling Plan . Changing this forces a new Virtual Desktop Scaling Plan to be created.
func (o ScalingPlanOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ScalingPlan) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Virtual Desktop Scaling Plan should exist. Changing this forces a new Virtual Desktop Scaling Plan to be created.
func (o ScalingPlanOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ScalingPlan) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// One or more `schedule` blocks as defined below.
func (o ScalingPlanOutput) Schedules() ScalingPlanScheduleArrayOutput {
	return o.ApplyT(func(v *ScalingPlan) ScalingPlanScheduleArrayOutput { return v.Schedules }).(ScalingPlanScheduleArrayOutput)
}

// A mapping of tags which should be assigned to the Virtual Desktop Scaling Plan .
func (o ScalingPlanOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ScalingPlan) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Specifies the Time Zone which should be used by the Scaling Plan for time based events, [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
func (o ScalingPlanOutput) TimeZone() pulumi.StringOutput {
	return o.ApplyT(func(v *ScalingPlan) pulumi.StringOutput { return v.TimeZone }).(pulumi.StringOutput)
}

type ScalingPlanArrayOutput struct{ *pulumi.OutputState }

func (ScalingPlanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScalingPlan)(nil)).Elem()
}

func (o ScalingPlanArrayOutput) ToScalingPlanArrayOutput() ScalingPlanArrayOutput {
	return o
}

func (o ScalingPlanArrayOutput) ToScalingPlanArrayOutputWithContext(ctx context.Context) ScalingPlanArrayOutput {
	return o
}

func (o ScalingPlanArrayOutput) Index(i pulumi.IntInput) ScalingPlanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ScalingPlan {
		return vs[0].([]*ScalingPlan)[vs[1].(int)]
	}).(ScalingPlanOutput)
}

type ScalingPlanMapOutput struct{ *pulumi.OutputState }

func (ScalingPlanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScalingPlan)(nil)).Elem()
}

func (o ScalingPlanMapOutput) ToScalingPlanMapOutput() ScalingPlanMapOutput {
	return o
}

func (o ScalingPlanMapOutput) ToScalingPlanMapOutputWithContext(ctx context.Context) ScalingPlanMapOutput {
	return o
}

func (o ScalingPlanMapOutput) MapIndex(k pulumi.StringInput) ScalingPlanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ScalingPlan {
		return vs[0].(map[string]*ScalingPlan)[vs[1].(string)]
	}).(ScalingPlanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ScalingPlanInput)(nil)).Elem(), &ScalingPlan{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScalingPlanArrayInput)(nil)).Elem(), ScalingPlanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScalingPlanMapInput)(nil)).Elem(), ScalingPlanMap{})
	pulumi.RegisterOutputType(ScalingPlanOutput{})
	pulumi.RegisterOutputType(ScalingPlanArrayOutput{})
	pulumi.RegisterOutputType(ScalingPlanMapOutput{})
}
