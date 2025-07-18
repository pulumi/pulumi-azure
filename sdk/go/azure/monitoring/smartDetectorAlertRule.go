// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Monitor Smart Detector Alert Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appinsights"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/monitoring"
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
//			exampleInsights, err := appinsights.NewInsights(ctx, "example", &appinsights.InsightsArgs{
//				Name:              pulumi.String("example-appinsights"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				ApplicationType:   pulumi.String("web"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleActionGroup, err := monitoring.NewActionGroup(ctx, "example", &monitoring.ActionGroupArgs{
//				Name:              pulumi.String("example-action-group"),
//				ResourceGroupName: example.Name,
//				ShortName:         pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = monitoring.NewSmartDetectorAlertRule(ctx, "example", &monitoring.SmartDetectorAlertRuleArgs{
//				Name:              pulumi.String("example-smart-detector-alert-rule"),
//				ResourceGroupName: example.Name,
//				Severity:          pulumi.String("Sev0"),
//				ScopeResourceIds: pulumi.StringArray{
//					exampleInsights.ID(),
//				},
//				Frequency:    pulumi.String("PT1M"),
//				DetectorType: pulumi.String("FailureAnomaliesDetector"),
//				ActionGroup: &monitoring.SmartDetectorAlertRuleActionGroupArgs{
//					Ids: pulumi.StringArray{
//						exampleActionGroup.ID(),
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
// * `Microsoft.AlertsManagement`: 2019-06-01
//
// ## Import
//
// Monitor Smart Detector Alert Rule can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:monitoring/smartDetectorAlertRule:SmartDetectorAlertRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.AlertsManagement/smartDetectorAlertRules/rule1
// ```
type SmartDetectorAlertRule struct {
	pulumi.CustomResourceState

	// An `actionGroup` block as defined below.
	ActionGroup SmartDetectorAlertRuleActionGroupOutput `pulumi:"actionGroup"`
	// Specifies a description for the Smart Detector Alert Rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies the Built-In Smart Detector type that this alert rule will use. Currently the only possible values are `FailureAnomaliesDetector`, `RequestPerformanceDegradationDetector`, `DependencyPerformanceDegradationDetector`, `ExceptionVolumeChangedDetector`, `TraceSeverityDetector`, `MemoryLeakDetector`.
	DetectorType pulumi.StringOutput `pulumi:"detectorType"`
	// Is the Smart Detector Alert Rule enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Specifies the frequency of this Smart Detector Alert Rule in ISO8601 format.
	Frequency pulumi.StringOutput `pulumi:"frequency"`
	// Specifies the name of the Monitor Smart Detector Alert Rule. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the name of the resource group in which the Monitor Smart Detector Alert Rule should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// Specifies the scopes of this Smart Detector Alert Rule.
	ScopeResourceIds pulumi.StringArrayOutput `pulumi:"scopeResourceIds"`
	// Specifies the severity of this Smart Detector Alert Rule. Possible values are `Sev0`, `Sev1`, `Sev2`, `Sev3` or `Sev4`.
	Severity pulumi.StringOutput `pulumi:"severity"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Specifies the duration (in ISO8601 format) to wait before notifying on the alert rule again.
	ThrottlingDuration pulumi.StringPtrOutput `pulumi:"throttlingDuration"`
}

// NewSmartDetectorAlertRule registers a new resource with the given unique name, arguments, and options.
func NewSmartDetectorAlertRule(ctx *pulumi.Context,
	name string, args *SmartDetectorAlertRuleArgs, opts ...pulumi.ResourceOption) (*SmartDetectorAlertRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionGroup == nil {
		return nil, errors.New("invalid value for required argument 'ActionGroup'")
	}
	if args.DetectorType == nil {
		return nil, errors.New("invalid value for required argument 'DetectorType'")
	}
	if args.Frequency == nil {
		return nil, errors.New("invalid value for required argument 'Frequency'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.ScopeResourceIds == nil {
		return nil, errors.New("invalid value for required argument 'ScopeResourceIds'")
	}
	if args.Severity == nil {
		return nil, errors.New("invalid value for required argument 'Severity'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SmartDetectorAlertRule
	err := ctx.RegisterResource("azure:monitoring/smartDetectorAlertRule:SmartDetectorAlertRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSmartDetectorAlertRule gets an existing SmartDetectorAlertRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSmartDetectorAlertRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SmartDetectorAlertRuleState, opts ...pulumi.ResourceOption) (*SmartDetectorAlertRule, error) {
	var resource SmartDetectorAlertRule
	err := ctx.ReadResource("azure:monitoring/smartDetectorAlertRule:SmartDetectorAlertRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SmartDetectorAlertRule resources.
type smartDetectorAlertRuleState struct {
	// An `actionGroup` block as defined below.
	ActionGroup *SmartDetectorAlertRuleActionGroup `pulumi:"actionGroup"`
	// Specifies a description for the Smart Detector Alert Rule.
	Description *string `pulumi:"description"`
	// Specifies the Built-In Smart Detector type that this alert rule will use. Currently the only possible values are `FailureAnomaliesDetector`, `RequestPerformanceDegradationDetector`, `DependencyPerformanceDegradationDetector`, `ExceptionVolumeChangedDetector`, `TraceSeverityDetector`, `MemoryLeakDetector`.
	DetectorType *string `pulumi:"detectorType"`
	// Is the Smart Detector Alert Rule enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// Specifies the frequency of this Smart Detector Alert Rule in ISO8601 format.
	Frequency *string `pulumi:"frequency"`
	// Specifies the name of the Monitor Smart Detector Alert Rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the resource group in which the Monitor Smart Detector Alert Rule should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// Specifies the scopes of this Smart Detector Alert Rule.
	ScopeResourceIds []string `pulumi:"scopeResourceIds"`
	// Specifies the severity of this Smart Detector Alert Rule. Possible values are `Sev0`, `Sev1`, `Sev2`, `Sev3` or `Sev4`.
	Severity *string `pulumi:"severity"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the duration (in ISO8601 format) to wait before notifying on the alert rule again.
	ThrottlingDuration *string `pulumi:"throttlingDuration"`
}

type SmartDetectorAlertRuleState struct {
	// An `actionGroup` block as defined below.
	ActionGroup SmartDetectorAlertRuleActionGroupPtrInput
	// Specifies a description for the Smart Detector Alert Rule.
	Description pulumi.StringPtrInput
	// Specifies the Built-In Smart Detector type that this alert rule will use. Currently the only possible values are `FailureAnomaliesDetector`, `RequestPerformanceDegradationDetector`, `DependencyPerformanceDegradationDetector`, `ExceptionVolumeChangedDetector`, `TraceSeverityDetector`, `MemoryLeakDetector`.
	DetectorType pulumi.StringPtrInput
	// Is the Smart Detector Alert Rule enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// Specifies the frequency of this Smart Detector Alert Rule in ISO8601 format.
	Frequency pulumi.StringPtrInput
	// Specifies the name of the Monitor Smart Detector Alert Rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the resource group in which the Monitor Smart Detector Alert Rule should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// Specifies the scopes of this Smart Detector Alert Rule.
	ScopeResourceIds pulumi.StringArrayInput
	// Specifies the severity of this Smart Detector Alert Rule. Possible values are `Sev0`, `Sev1`, `Sev2`, `Sev3` or `Sev4`.
	Severity pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Specifies the duration (in ISO8601 format) to wait before notifying on the alert rule again.
	ThrottlingDuration pulumi.StringPtrInput
}

func (SmartDetectorAlertRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*smartDetectorAlertRuleState)(nil)).Elem()
}

type smartDetectorAlertRuleArgs struct {
	// An `actionGroup` block as defined below.
	ActionGroup SmartDetectorAlertRuleActionGroup `pulumi:"actionGroup"`
	// Specifies a description for the Smart Detector Alert Rule.
	Description *string `pulumi:"description"`
	// Specifies the Built-In Smart Detector type that this alert rule will use. Currently the only possible values are `FailureAnomaliesDetector`, `RequestPerformanceDegradationDetector`, `DependencyPerformanceDegradationDetector`, `ExceptionVolumeChangedDetector`, `TraceSeverityDetector`, `MemoryLeakDetector`.
	DetectorType string `pulumi:"detectorType"`
	// Is the Smart Detector Alert Rule enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// Specifies the frequency of this Smart Detector Alert Rule in ISO8601 format.
	Frequency string `pulumi:"frequency"`
	// Specifies the name of the Monitor Smart Detector Alert Rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the resource group in which the Monitor Smart Detector Alert Rule should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Specifies the scopes of this Smart Detector Alert Rule.
	ScopeResourceIds []string `pulumi:"scopeResourceIds"`
	// Specifies the severity of this Smart Detector Alert Rule. Possible values are `Sev0`, `Sev1`, `Sev2`, `Sev3` or `Sev4`.
	Severity string `pulumi:"severity"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the duration (in ISO8601 format) to wait before notifying on the alert rule again.
	ThrottlingDuration *string `pulumi:"throttlingDuration"`
}

// The set of arguments for constructing a SmartDetectorAlertRule resource.
type SmartDetectorAlertRuleArgs struct {
	// An `actionGroup` block as defined below.
	ActionGroup SmartDetectorAlertRuleActionGroupInput
	// Specifies a description for the Smart Detector Alert Rule.
	Description pulumi.StringPtrInput
	// Specifies the Built-In Smart Detector type that this alert rule will use. Currently the only possible values are `FailureAnomaliesDetector`, `RequestPerformanceDegradationDetector`, `DependencyPerformanceDegradationDetector`, `ExceptionVolumeChangedDetector`, `TraceSeverityDetector`, `MemoryLeakDetector`.
	DetectorType pulumi.StringInput
	// Is the Smart Detector Alert Rule enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// Specifies the frequency of this Smart Detector Alert Rule in ISO8601 format.
	Frequency pulumi.StringInput
	// Specifies the name of the Monitor Smart Detector Alert Rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the resource group in which the Monitor Smart Detector Alert Rule should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// Specifies the scopes of this Smart Detector Alert Rule.
	ScopeResourceIds pulumi.StringArrayInput
	// Specifies the severity of this Smart Detector Alert Rule. Possible values are `Sev0`, `Sev1`, `Sev2`, `Sev3` or `Sev4`.
	Severity pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Specifies the duration (in ISO8601 format) to wait before notifying on the alert rule again.
	ThrottlingDuration pulumi.StringPtrInput
}

func (SmartDetectorAlertRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*smartDetectorAlertRuleArgs)(nil)).Elem()
}

type SmartDetectorAlertRuleInput interface {
	pulumi.Input

	ToSmartDetectorAlertRuleOutput() SmartDetectorAlertRuleOutput
	ToSmartDetectorAlertRuleOutputWithContext(ctx context.Context) SmartDetectorAlertRuleOutput
}

func (*SmartDetectorAlertRule) ElementType() reflect.Type {
	return reflect.TypeOf((**SmartDetectorAlertRule)(nil)).Elem()
}

func (i *SmartDetectorAlertRule) ToSmartDetectorAlertRuleOutput() SmartDetectorAlertRuleOutput {
	return i.ToSmartDetectorAlertRuleOutputWithContext(context.Background())
}

func (i *SmartDetectorAlertRule) ToSmartDetectorAlertRuleOutputWithContext(ctx context.Context) SmartDetectorAlertRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmartDetectorAlertRuleOutput)
}

// SmartDetectorAlertRuleArrayInput is an input type that accepts SmartDetectorAlertRuleArray and SmartDetectorAlertRuleArrayOutput values.
// You can construct a concrete instance of `SmartDetectorAlertRuleArrayInput` via:
//
//	SmartDetectorAlertRuleArray{ SmartDetectorAlertRuleArgs{...} }
type SmartDetectorAlertRuleArrayInput interface {
	pulumi.Input

	ToSmartDetectorAlertRuleArrayOutput() SmartDetectorAlertRuleArrayOutput
	ToSmartDetectorAlertRuleArrayOutputWithContext(context.Context) SmartDetectorAlertRuleArrayOutput
}

type SmartDetectorAlertRuleArray []SmartDetectorAlertRuleInput

func (SmartDetectorAlertRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmartDetectorAlertRule)(nil)).Elem()
}

func (i SmartDetectorAlertRuleArray) ToSmartDetectorAlertRuleArrayOutput() SmartDetectorAlertRuleArrayOutput {
	return i.ToSmartDetectorAlertRuleArrayOutputWithContext(context.Background())
}

func (i SmartDetectorAlertRuleArray) ToSmartDetectorAlertRuleArrayOutputWithContext(ctx context.Context) SmartDetectorAlertRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmartDetectorAlertRuleArrayOutput)
}

// SmartDetectorAlertRuleMapInput is an input type that accepts SmartDetectorAlertRuleMap and SmartDetectorAlertRuleMapOutput values.
// You can construct a concrete instance of `SmartDetectorAlertRuleMapInput` via:
//
//	SmartDetectorAlertRuleMap{ "key": SmartDetectorAlertRuleArgs{...} }
type SmartDetectorAlertRuleMapInput interface {
	pulumi.Input

	ToSmartDetectorAlertRuleMapOutput() SmartDetectorAlertRuleMapOutput
	ToSmartDetectorAlertRuleMapOutputWithContext(context.Context) SmartDetectorAlertRuleMapOutput
}

type SmartDetectorAlertRuleMap map[string]SmartDetectorAlertRuleInput

func (SmartDetectorAlertRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmartDetectorAlertRule)(nil)).Elem()
}

func (i SmartDetectorAlertRuleMap) ToSmartDetectorAlertRuleMapOutput() SmartDetectorAlertRuleMapOutput {
	return i.ToSmartDetectorAlertRuleMapOutputWithContext(context.Background())
}

func (i SmartDetectorAlertRuleMap) ToSmartDetectorAlertRuleMapOutputWithContext(ctx context.Context) SmartDetectorAlertRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmartDetectorAlertRuleMapOutput)
}

type SmartDetectorAlertRuleOutput struct{ *pulumi.OutputState }

func (SmartDetectorAlertRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SmartDetectorAlertRule)(nil)).Elem()
}

func (o SmartDetectorAlertRuleOutput) ToSmartDetectorAlertRuleOutput() SmartDetectorAlertRuleOutput {
	return o
}

func (o SmartDetectorAlertRuleOutput) ToSmartDetectorAlertRuleOutputWithContext(ctx context.Context) SmartDetectorAlertRuleOutput {
	return o
}

// An `actionGroup` block as defined below.
func (o SmartDetectorAlertRuleOutput) ActionGroup() SmartDetectorAlertRuleActionGroupOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) SmartDetectorAlertRuleActionGroupOutput { return v.ActionGroup }).(SmartDetectorAlertRuleActionGroupOutput)
}

// Specifies a description for the Smart Detector Alert Rule.
func (o SmartDetectorAlertRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies the Built-In Smart Detector type that this alert rule will use. Currently the only possible values are `FailureAnomaliesDetector`, `RequestPerformanceDegradationDetector`, `DependencyPerformanceDegradationDetector`, `ExceptionVolumeChangedDetector`, `TraceSeverityDetector`, `MemoryLeakDetector`.
func (o SmartDetectorAlertRuleOutput) DetectorType() pulumi.StringOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.StringOutput { return v.DetectorType }).(pulumi.StringOutput)
}

// Is the Smart Detector Alert Rule enabled? Defaults to `true`.
func (o SmartDetectorAlertRuleOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Specifies the frequency of this Smart Detector Alert Rule in ISO8601 format.
func (o SmartDetectorAlertRuleOutput) Frequency() pulumi.StringOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.StringOutput { return v.Frequency }).(pulumi.StringOutput)
}

// Specifies the name of the Monitor Smart Detector Alert Rule. Changing this forces a new resource to be created.
func (o SmartDetectorAlertRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the name of the resource group in which the Monitor Smart Detector Alert Rule should exist. Changing this forces a new resource to be created.
func (o SmartDetectorAlertRuleOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// Specifies the scopes of this Smart Detector Alert Rule.
func (o SmartDetectorAlertRuleOutput) ScopeResourceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.StringArrayOutput { return v.ScopeResourceIds }).(pulumi.StringArrayOutput)
}

// Specifies the severity of this Smart Detector Alert Rule. Possible values are `Sev0`, `Sev1`, `Sev2`, `Sev3` or `Sev4`.
func (o SmartDetectorAlertRuleOutput) Severity() pulumi.StringOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.StringOutput { return v.Severity }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o SmartDetectorAlertRuleOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Specifies the duration (in ISO8601 format) to wait before notifying on the alert rule again.
func (o SmartDetectorAlertRuleOutput) ThrottlingDuration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SmartDetectorAlertRule) pulumi.StringPtrOutput { return v.ThrottlingDuration }).(pulumi.StringPtrOutput)
}

type SmartDetectorAlertRuleArrayOutput struct{ *pulumi.OutputState }

func (SmartDetectorAlertRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmartDetectorAlertRule)(nil)).Elem()
}

func (o SmartDetectorAlertRuleArrayOutput) ToSmartDetectorAlertRuleArrayOutput() SmartDetectorAlertRuleArrayOutput {
	return o
}

func (o SmartDetectorAlertRuleArrayOutput) ToSmartDetectorAlertRuleArrayOutputWithContext(ctx context.Context) SmartDetectorAlertRuleArrayOutput {
	return o
}

func (o SmartDetectorAlertRuleArrayOutput) Index(i pulumi.IntInput) SmartDetectorAlertRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SmartDetectorAlertRule {
		return vs[0].([]*SmartDetectorAlertRule)[vs[1].(int)]
	}).(SmartDetectorAlertRuleOutput)
}

type SmartDetectorAlertRuleMapOutput struct{ *pulumi.OutputState }

func (SmartDetectorAlertRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmartDetectorAlertRule)(nil)).Elem()
}

func (o SmartDetectorAlertRuleMapOutput) ToSmartDetectorAlertRuleMapOutput() SmartDetectorAlertRuleMapOutput {
	return o
}

func (o SmartDetectorAlertRuleMapOutput) ToSmartDetectorAlertRuleMapOutputWithContext(ctx context.Context) SmartDetectorAlertRuleMapOutput {
	return o
}

func (o SmartDetectorAlertRuleMapOutput) MapIndex(k pulumi.StringInput) SmartDetectorAlertRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SmartDetectorAlertRule {
		return vs[0].(map[string]*SmartDetectorAlertRule)[vs[1].(string)]
	}).(SmartDetectorAlertRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SmartDetectorAlertRuleInput)(nil)).Elem(), &SmartDetectorAlertRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmartDetectorAlertRuleArrayInput)(nil)).Elem(), SmartDetectorAlertRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmartDetectorAlertRuleMapInput)(nil)).Elem(), SmartDetectorAlertRuleMap{})
	pulumi.RegisterOutputType(SmartDetectorAlertRuleOutput{})
	pulumi.RegisterOutputType(SmartDetectorAlertRuleArrayOutput{})
	pulumi.RegisterOutputType(SmartDetectorAlertRuleMapOutput{})
}
