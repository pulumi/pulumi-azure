// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an iot security solution.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/iot"
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
//			exampleIoTHub, err := iot.NewIoTHub(ctx, "example", &iot.IoTHubArgs{
//				Name:              pulumi.String("example-IoTHub"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				Sku: &iot.IoTHubSkuArgs{
//					Name:     pulumi.String("S1"),
//					Capacity: pulumi.Int(1),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iot.NewSecuritySolution(ctx, "example", &iot.SecuritySolutionArgs{
//				Name:              pulumi.String("example-Iot-Security-Solution"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				DisplayName:       pulumi.String("Iot Security Solution"),
//				IothubIds: pulumi.StringArray{
//					exampleIoTHub.ID(),
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
// ## Import
//
// Iot Security Solution can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:iot/securitySolution:SecuritySolution example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Security/iotSecuritySolutions/solution1
// ```
type SecuritySolution struct {
	pulumi.CustomResourceState

	// A `additionalWorkspace` block as defined below.
	AdditionalWorkspaces SecuritySolutionAdditionalWorkspaceArrayOutput `pulumi:"additionalWorkspaces"`
	// A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
	DisabledDataSources pulumi.StringArrayOutput `pulumi:"disabledDataSources"`
	// Specifies the Display Name for this Iot Security Solution.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Is the Iot Security Solution enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
	EventsToExports pulumi.StringArrayOutput `pulumi:"eventsToExports"`
	// Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
	IothubIds pulumi.StringArrayOutput `pulumi:"iothubIds"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the Log Analytics Workspace ID to which the security data will be sent.
	LogAnalyticsWorkspaceId pulumi.StringPtrOutput `pulumi:"logAnalyticsWorkspaceId"`
	// Should IP addressed be unmasked in the log? Defaults to `false`.
	LogUnmaskedIpsEnabled pulumi.BoolPtrOutput `pulumi:"logUnmaskedIpsEnabled"`
	// Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// An Azure Resource Graph query used to set the resources monitored.
	QueryForResources pulumi.StringOutput `pulumi:"queryForResources"`
	// A list of subscription Ids on which the user defined resources query should be executed.
	QuerySubscriptionIds pulumi.StringArrayOutput `pulumi:"querySubscriptionIds"`
	// A `recommendationsEnabled` block of options to enable or disable as defined below.
	RecommendationsEnabled SecuritySolutionRecommendationsEnabledOutput `pulumi:"recommendationsEnabled"`
	// Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewSecuritySolution registers a new resource with the given unique name, arguments, and options.
func NewSecuritySolution(ctx *pulumi.Context,
	name string, args *SecuritySolutionArgs, opts ...pulumi.ResourceOption) (*SecuritySolution, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.IothubIds == nil {
		return nil, errors.New("invalid value for required argument 'IothubIds'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecuritySolution
	err := ctx.RegisterResource("azure:iot/securitySolution:SecuritySolution", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecuritySolution gets an existing SecuritySolution resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecuritySolution(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecuritySolutionState, opts ...pulumi.ResourceOption) (*SecuritySolution, error) {
	var resource SecuritySolution
	err := ctx.ReadResource("azure:iot/securitySolution:SecuritySolution", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecuritySolution resources.
type securitySolutionState struct {
	// A `additionalWorkspace` block as defined below.
	AdditionalWorkspaces []SecuritySolutionAdditionalWorkspace `pulumi:"additionalWorkspaces"`
	// A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
	DisabledDataSources []string `pulumi:"disabledDataSources"`
	// Specifies the Display Name for this Iot Security Solution.
	DisplayName *string `pulumi:"displayName"`
	// Is the Iot Security Solution enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
	EventsToExports []string `pulumi:"eventsToExports"`
	// Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
	IothubIds []string `pulumi:"iothubIds"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the Log Analytics Workspace ID to which the security data will be sent.
	LogAnalyticsWorkspaceId *string `pulumi:"logAnalyticsWorkspaceId"`
	// Should IP addressed be unmasked in the log? Defaults to `false`.
	LogUnmaskedIpsEnabled *bool `pulumi:"logUnmaskedIpsEnabled"`
	// Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// An Azure Resource Graph query used to set the resources monitored.
	QueryForResources *string `pulumi:"queryForResources"`
	// A list of subscription Ids on which the user defined resources query should be executed.
	QuerySubscriptionIds []string `pulumi:"querySubscriptionIds"`
	// A `recommendationsEnabled` block of options to enable or disable as defined below.
	RecommendationsEnabled *SecuritySolutionRecommendationsEnabled `pulumi:"recommendationsEnabled"`
	// Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

type SecuritySolutionState struct {
	// A `additionalWorkspace` block as defined below.
	AdditionalWorkspaces SecuritySolutionAdditionalWorkspaceArrayInput
	// A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
	DisabledDataSources pulumi.StringArrayInput
	// Specifies the Display Name for this Iot Security Solution.
	DisplayName pulumi.StringPtrInput
	// Is the Iot Security Solution enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
	EventsToExports pulumi.StringArrayInput
	// Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
	IothubIds pulumi.StringArrayInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the Log Analytics Workspace ID to which the security data will be sent.
	LogAnalyticsWorkspaceId pulumi.StringPtrInput
	// Should IP addressed be unmasked in the log? Defaults to `false`.
	LogUnmaskedIpsEnabled pulumi.BoolPtrInput
	// Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// An Azure Resource Graph query used to set the resources monitored.
	QueryForResources pulumi.StringPtrInput
	// A list of subscription Ids on which the user defined resources query should be executed.
	QuerySubscriptionIds pulumi.StringArrayInput
	// A `recommendationsEnabled` block of options to enable or disable as defined below.
	RecommendationsEnabled SecuritySolutionRecommendationsEnabledPtrInput
	// Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (SecuritySolutionState) ElementType() reflect.Type {
	return reflect.TypeOf((*securitySolutionState)(nil)).Elem()
}

type securitySolutionArgs struct {
	// A `additionalWorkspace` block as defined below.
	AdditionalWorkspaces []SecuritySolutionAdditionalWorkspace `pulumi:"additionalWorkspaces"`
	// A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
	DisabledDataSources []string `pulumi:"disabledDataSources"`
	// Specifies the Display Name for this Iot Security Solution.
	DisplayName string `pulumi:"displayName"`
	// Is the Iot Security Solution enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
	EventsToExports []string `pulumi:"eventsToExports"`
	// Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
	IothubIds []string `pulumi:"iothubIds"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the Log Analytics Workspace ID to which the security data will be sent.
	LogAnalyticsWorkspaceId *string `pulumi:"logAnalyticsWorkspaceId"`
	// Should IP addressed be unmasked in the log? Defaults to `false`.
	LogUnmaskedIpsEnabled *bool `pulumi:"logUnmaskedIpsEnabled"`
	// Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// An Azure Resource Graph query used to set the resources monitored.
	QueryForResources *string `pulumi:"queryForResources"`
	// A list of subscription Ids on which the user defined resources query should be executed.
	QuerySubscriptionIds []string `pulumi:"querySubscriptionIds"`
	// A `recommendationsEnabled` block of options to enable or disable as defined below.
	RecommendationsEnabled *SecuritySolutionRecommendationsEnabled `pulumi:"recommendationsEnabled"`
	// Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a SecuritySolution resource.
type SecuritySolutionArgs struct {
	// A `additionalWorkspace` block as defined below.
	AdditionalWorkspaces SecuritySolutionAdditionalWorkspaceArrayInput
	// A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
	DisabledDataSources pulumi.StringArrayInput
	// Specifies the Display Name for this Iot Security Solution.
	DisplayName pulumi.StringInput
	// Is the Iot Security Solution enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
	EventsToExports pulumi.StringArrayInput
	// Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
	IothubIds pulumi.StringArrayInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the Log Analytics Workspace ID to which the security data will be sent.
	LogAnalyticsWorkspaceId pulumi.StringPtrInput
	// Should IP addressed be unmasked in the log? Defaults to `false`.
	LogUnmaskedIpsEnabled pulumi.BoolPtrInput
	// Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// An Azure Resource Graph query used to set the resources monitored.
	QueryForResources pulumi.StringPtrInput
	// A list of subscription Ids on which the user defined resources query should be executed.
	QuerySubscriptionIds pulumi.StringArrayInput
	// A `recommendationsEnabled` block of options to enable or disable as defined below.
	RecommendationsEnabled SecuritySolutionRecommendationsEnabledPtrInput
	// Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (SecuritySolutionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*securitySolutionArgs)(nil)).Elem()
}

type SecuritySolutionInput interface {
	pulumi.Input

	ToSecuritySolutionOutput() SecuritySolutionOutput
	ToSecuritySolutionOutputWithContext(ctx context.Context) SecuritySolutionOutput
}

func (*SecuritySolution) ElementType() reflect.Type {
	return reflect.TypeOf((**SecuritySolution)(nil)).Elem()
}

func (i *SecuritySolution) ToSecuritySolutionOutput() SecuritySolutionOutput {
	return i.ToSecuritySolutionOutputWithContext(context.Background())
}

func (i *SecuritySolution) ToSecuritySolutionOutputWithContext(ctx context.Context) SecuritySolutionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecuritySolutionOutput)
}

// SecuritySolutionArrayInput is an input type that accepts SecuritySolutionArray and SecuritySolutionArrayOutput values.
// You can construct a concrete instance of `SecuritySolutionArrayInput` via:
//
//	SecuritySolutionArray{ SecuritySolutionArgs{...} }
type SecuritySolutionArrayInput interface {
	pulumi.Input

	ToSecuritySolutionArrayOutput() SecuritySolutionArrayOutput
	ToSecuritySolutionArrayOutputWithContext(context.Context) SecuritySolutionArrayOutput
}

type SecuritySolutionArray []SecuritySolutionInput

func (SecuritySolutionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecuritySolution)(nil)).Elem()
}

func (i SecuritySolutionArray) ToSecuritySolutionArrayOutput() SecuritySolutionArrayOutput {
	return i.ToSecuritySolutionArrayOutputWithContext(context.Background())
}

func (i SecuritySolutionArray) ToSecuritySolutionArrayOutputWithContext(ctx context.Context) SecuritySolutionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecuritySolutionArrayOutput)
}

// SecuritySolutionMapInput is an input type that accepts SecuritySolutionMap and SecuritySolutionMapOutput values.
// You can construct a concrete instance of `SecuritySolutionMapInput` via:
//
//	SecuritySolutionMap{ "key": SecuritySolutionArgs{...} }
type SecuritySolutionMapInput interface {
	pulumi.Input

	ToSecuritySolutionMapOutput() SecuritySolutionMapOutput
	ToSecuritySolutionMapOutputWithContext(context.Context) SecuritySolutionMapOutput
}

type SecuritySolutionMap map[string]SecuritySolutionInput

func (SecuritySolutionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecuritySolution)(nil)).Elem()
}

func (i SecuritySolutionMap) ToSecuritySolutionMapOutput() SecuritySolutionMapOutput {
	return i.ToSecuritySolutionMapOutputWithContext(context.Background())
}

func (i SecuritySolutionMap) ToSecuritySolutionMapOutputWithContext(ctx context.Context) SecuritySolutionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecuritySolutionMapOutput)
}

type SecuritySolutionOutput struct{ *pulumi.OutputState }

func (SecuritySolutionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecuritySolution)(nil)).Elem()
}

func (o SecuritySolutionOutput) ToSecuritySolutionOutput() SecuritySolutionOutput {
	return o
}

func (o SecuritySolutionOutput) ToSecuritySolutionOutputWithContext(ctx context.Context) SecuritySolutionOutput {
	return o
}

// A `additionalWorkspace` block as defined below.
func (o SecuritySolutionOutput) AdditionalWorkspaces() SecuritySolutionAdditionalWorkspaceArrayOutput {
	return o.ApplyT(func(v *SecuritySolution) SecuritySolutionAdditionalWorkspaceArrayOutput {
		return v.AdditionalWorkspaces
	}).(SecuritySolutionAdditionalWorkspaceArrayOutput)
}

// A list of disabled data sources for the Iot Security Solution. Possible value is `TwinData`.
func (o SecuritySolutionOutput) DisabledDataSources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringArrayOutput { return v.DisabledDataSources }).(pulumi.StringArrayOutput)
}

// Specifies the Display Name for this Iot Security Solution.
func (o SecuritySolutionOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Is the Iot Security Solution enabled? Defaults to `true`.
func (o SecuritySolutionOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// A list of data which is to exported to analytic workspace. Valid values include `RawEvents`.
func (o SecuritySolutionOutput) EventsToExports() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringArrayOutput { return v.EventsToExports }).(pulumi.StringArrayOutput)
}

// Specifies the IoT Hub resource IDs to which this Iot Security Solution is applied.
func (o SecuritySolutionOutput) IothubIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringArrayOutput { return v.IothubIds }).(pulumi.StringArrayOutput)
}

// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o SecuritySolutionOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the Log Analytics Workspace ID to which the security data will be sent.
func (o SecuritySolutionOutput) LogAnalyticsWorkspaceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringPtrOutput { return v.LogAnalyticsWorkspaceId }).(pulumi.StringPtrOutput)
}

// Should IP addressed be unmasked in the log? Defaults to `false`.
func (o SecuritySolutionOutput) LogUnmaskedIpsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.BoolPtrOutput { return v.LogUnmaskedIpsEnabled }).(pulumi.BoolPtrOutput)
}

// Specifies the name of the Iot Security Solution. Changing this forces a new resource to be created.
func (o SecuritySolutionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// An Azure Resource Graph query used to set the resources monitored.
func (o SecuritySolutionOutput) QueryForResources() pulumi.StringOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringOutput { return v.QueryForResources }).(pulumi.StringOutput)
}

// A list of subscription Ids on which the user defined resources query should be executed.
func (o SecuritySolutionOutput) QuerySubscriptionIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringArrayOutput { return v.QuerySubscriptionIds }).(pulumi.StringArrayOutput)
}

// A `recommendationsEnabled` block of options to enable or disable as defined below.
func (o SecuritySolutionOutput) RecommendationsEnabled() SecuritySolutionRecommendationsEnabledOutput {
	return o.ApplyT(func(v *SecuritySolution) SecuritySolutionRecommendationsEnabledOutput {
		return v.RecommendationsEnabled
	}).(SecuritySolutionRecommendationsEnabledOutput)
}

// Specifies the name of the resource group in which to create the Iot Security Solution. Changing this forces a new resource to be created.
func (o SecuritySolutionOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o SecuritySolutionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SecuritySolution) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type SecuritySolutionArrayOutput struct{ *pulumi.OutputState }

func (SecuritySolutionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecuritySolution)(nil)).Elem()
}

func (o SecuritySolutionArrayOutput) ToSecuritySolutionArrayOutput() SecuritySolutionArrayOutput {
	return o
}

func (o SecuritySolutionArrayOutput) ToSecuritySolutionArrayOutputWithContext(ctx context.Context) SecuritySolutionArrayOutput {
	return o
}

func (o SecuritySolutionArrayOutput) Index(i pulumi.IntInput) SecuritySolutionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecuritySolution {
		return vs[0].([]*SecuritySolution)[vs[1].(int)]
	}).(SecuritySolutionOutput)
}

type SecuritySolutionMapOutput struct{ *pulumi.OutputState }

func (SecuritySolutionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecuritySolution)(nil)).Elem()
}

func (o SecuritySolutionMapOutput) ToSecuritySolutionMapOutput() SecuritySolutionMapOutput {
	return o
}

func (o SecuritySolutionMapOutput) ToSecuritySolutionMapOutputWithContext(ctx context.Context) SecuritySolutionMapOutput {
	return o
}

func (o SecuritySolutionMapOutput) MapIndex(k pulumi.StringInput) SecuritySolutionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecuritySolution {
		return vs[0].(map[string]*SecuritySolution)[vs[1].(string)]
	}).(SecuritySolutionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecuritySolutionInput)(nil)).Elem(), &SecuritySolution{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecuritySolutionArrayInput)(nil)).Elem(), SecuritySolutionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecuritySolutionMapInput)(nil)).Elem(), SecuritySolutionMap{})
	pulumi.RegisterOutputType(SecuritySolutionOutput{})
	pulumi.RegisterOutputType(SecuritySolutionArrayOutput{})
	pulumi.RegisterOutputType(SecuritySolutionMapOutput{})
}
