// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sentinel

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Sentinel MS Security Incident Alert Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/operationalinsights"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/sentinel"
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
//			exampleAnalyticsWorkspace, err := operationalinsights.NewAnalyticsWorkspace(ctx, "example", &operationalinsights.AnalyticsWorkspaceArgs{
//				Name:              pulumi.String("example-workspace"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("PerGB2018"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleLogAnalyticsWorkspaceOnboarding, err := sentinel.NewLogAnalyticsWorkspaceOnboarding(ctx, "example", &sentinel.LogAnalyticsWorkspaceOnboardingArgs{
//				WorkspaceId: exampleAnalyticsWorkspace.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sentinel.NewAlertRuleMsSecurityIncident(ctx, "example", &sentinel.AlertRuleMsSecurityIncidentArgs{
//				Name:                    pulumi.String("example-ms-security-incident-alert-rule"),
//				LogAnalyticsWorkspaceId: exampleLogAnalyticsWorkspaceOnboarding.WorkspaceId,
//				ProductFilter:           pulumi.String("Microsoft Cloud App Security"),
//				DisplayName:             pulumi.String("example rule"),
//				SeverityFilters: pulumi.StringArray{
//					pulumi.String("High"),
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
// * `Microsoft.OperationalInsights`: 2023-12-01-preview
//
// ## Import
//
// Sentinel MS Security Incident Alert Rules can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:sentinel/alertRuleMsSecurityIncident:AlertRuleMsSecurityIncident example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/alertRules/rule1
// ```
type AlertRuleMsSecurityIncident struct {
	pulumi.CustomResourceState

	// The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	AlertRuleTemplateGuid pulumi.StringPtrOutput `pulumi:"alertRuleTemplateGuid"`
	// The description of this Sentinel MS Security Incident Alert Rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The friendly name of this Sentinel MS Security Incident Alert Rule.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Only create incidents when the alert display name doesn't contain text from this list.
	DisplayNameExcludeFilters pulumi.StringArrayOutput `pulumi:"displayNameExcludeFilters"`
	// Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
	DisplayNameFilters pulumi.StringArrayOutput `pulumi:"displayNameFilters"`
	// Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	LogAnalyticsWorkspaceId pulumi.StringOutput `pulumi:"logAnalyticsWorkspaceId"`
	// The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
	ProductFilter pulumi.StringOutput `pulumi:"productFilter"`
	// Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
	//
	// > **Note:** At least one of the severity filters need to be set.
	SeverityFilters pulumi.StringArrayOutput `pulumi:"severityFilters"`
}

// NewAlertRuleMsSecurityIncident registers a new resource with the given unique name, arguments, and options.
func NewAlertRuleMsSecurityIncident(ctx *pulumi.Context,
	name string, args *AlertRuleMsSecurityIncidentArgs, opts ...pulumi.ResourceOption) (*AlertRuleMsSecurityIncident, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.LogAnalyticsWorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'LogAnalyticsWorkspaceId'")
	}
	if args.ProductFilter == nil {
		return nil, errors.New("invalid value for required argument 'ProductFilter'")
	}
	if args.SeverityFilters == nil {
		return nil, errors.New("invalid value for required argument 'SeverityFilters'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AlertRuleMsSecurityIncident
	err := ctx.RegisterResource("azure:sentinel/alertRuleMsSecurityIncident:AlertRuleMsSecurityIncident", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertRuleMsSecurityIncident gets an existing AlertRuleMsSecurityIncident resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertRuleMsSecurityIncident(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertRuleMsSecurityIncidentState, opts ...pulumi.ResourceOption) (*AlertRuleMsSecurityIncident, error) {
	var resource AlertRuleMsSecurityIncident
	err := ctx.ReadResource("azure:sentinel/alertRuleMsSecurityIncident:AlertRuleMsSecurityIncident", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertRuleMsSecurityIncident resources.
type alertRuleMsSecurityIncidentState struct {
	// The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	AlertRuleTemplateGuid *string `pulumi:"alertRuleTemplateGuid"`
	// The description of this Sentinel MS Security Incident Alert Rule.
	Description *string `pulumi:"description"`
	// The friendly name of this Sentinel MS Security Incident Alert Rule.
	DisplayName *string `pulumi:"displayName"`
	// Only create incidents when the alert display name doesn't contain text from this list.
	DisplayNameExcludeFilters []string `pulumi:"displayNameExcludeFilters"`
	// Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
	DisplayNameFilters []string `pulumi:"displayNameFilters"`
	// Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	LogAnalyticsWorkspaceId *string `pulumi:"logAnalyticsWorkspaceId"`
	// The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	Name *string `pulumi:"name"`
	// The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
	ProductFilter *string `pulumi:"productFilter"`
	// Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
	//
	// > **Note:** At least one of the severity filters need to be set.
	SeverityFilters []string `pulumi:"severityFilters"`
}

type AlertRuleMsSecurityIncidentState struct {
	// The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	AlertRuleTemplateGuid pulumi.StringPtrInput
	// The description of this Sentinel MS Security Incident Alert Rule.
	Description pulumi.StringPtrInput
	// The friendly name of this Sentinel MS Security Incident Alert Rule.
	DisplayName pulumi.StringPtrInput
	// Only create incidents when the alert display name doesn't contain text from this list.
	DisplayNameExcludeFilters pulumi.StringArrayInput
	// Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
	DisplayNameFilters pulumi.StringArrayInput
	// Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	LogAnalyticsWorkspaceId pulumi.StringPtrInput
	// The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	Name pulumi.StringPtrInput
	// The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
	ProductFilter pulumi.StringPtrInput
	// Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
	//
	// > **Note:** At least one of the severity filters need to be set.
	SeverityFilters pulumi.StringArrayInput
}

func (AlertRuleMsSecurityIncidentState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertRuleMsSecurityIncidentState)(nil)).Elem()
}

type alertRuleMsSecurityIncidentArgs struct {
	// The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	AlertRuleTemplateGuid *string `pulumi:"alertRuleTemplateGuid"`
	// The description of this Sentinel MS Security Incident Alert Rule.
	Description *string `pulumi:"description"`
	// The friendly name of this Sentinel MS Security Incident Alert Rule.
	DisplayName string `pulumi:"displayName"`
	// Only create incidents when the alert display name doesn't contain text from this list.
	DisplayNameExcludeFilters []string `pulumi:"displayNameExcludeFilters"`
	// Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
	DisplayNameFilters []string `pulumi:"displayNameFilters"`
	// Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	LogAnalyticsWorkspaceId string `pulumi:"logAnalyticsWorkspaceId"`
	// The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	Name *string `pulumi:"name"`
	// The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
	ProductFilter string `pulumi:"productFilter"`
	// Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
	//
	// > **Note:** At least one of the severity filters need to be set.
	SeverityFilters []string `pulumi:"severityFilters"`
}

// The set of arguments for constructing a AlertRuleMsSecurityIncident resource.
type AlertRuleMsSecurityIncidentArgs struct {
	// The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	AlertRuleTemplateGuid pulumi.StringPtrInput
	// The description of this Sentinel MS Security Incident Alert Rule.
	Description pulumi.StringPtrInput
	// The friendly name of this Sentinel MS Security Incident Alert Rule.
	DisplayName pulumi.StringInput
	// Only create incidents when the alert display name doesn't contain text from this list.
	DisplayNameExcludeFilters pulumi.StringArrayInput
	// Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
	DisplayNameFilters pulumi.StringArrayInput
	// Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	LogAnalyticsWorkspaceId pulumi.StringInput
	// The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
	Name pulumi.StringPtrInput
	// The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
	ProductFilter pulumi.StringInput
	// Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
	//
	// > **Note:** At least one of the severity filters need to be set.
	SeverityFilters pulumi.StringArrayInput
}

func (AlertRuleMsSecurityIncidentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertRuleMsSecurityIncidentArgs)(nil)).Elem()
}

type AlertRuleMsSecurityIncidentInput interface {
	pulumi.Input

	ToAlertRuleMsSecurityIncidentOutput() AlertRuleMsSecurityIncidentOutput
	ToAlertRuleMsSecurityIncidentOutputWithContext(ctx context.Context) AlertRuleMsSecurityIncidentOutput
}

func (*AlertRuleMsSecurityIncident) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertRuleMsSecurityIncident)(nil)).Elem()
}

func (i *AlertRuleMsSecurityIncident) ToAlertRuleMsSecurityIncidentOutput() AlertRuleMsSecurityIncidentOutput {
	return i.ToAlertRuleMsSecurityIncidentOutputWithContext(context.Background())
}

func (i *AlertRuleMsSecurityIncident) ToAlertRuleMsSecurityIncidentOutputWithContext(ctx context.Context) AlertRuleMsSecurityIncidentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertRuleMsSecurityIncidentOutput)
}

// AlertRuleMsSecurityIncidentArrayInput is an input type that accepts AlertRuleMsSecurityIncidentArray and AlertRuleMsSecurityIncidentArrayOutput values.
// You can construct a concrete instance of `AlertRuleMsSecurityIncidentArrayInput` via:
//
//	AlertRuleMsSecurityIncidentArray{ AlertRuleMsSecurityIncidentArgs{...} }
type AlertRuleMsSecurityIncidentArrayInput interface {
	pulumi.Input

	ToAlertRuleMsSecurityIncidentArrayOutput() AlertRuleMsSecurityIncidentArrayOutput
	ToAlertRuleMsSecurityIncidentArrayOutputWithContext(context.Context) AlertRuleMsSecurityIncidentArrayOutput
}

type AlertRuleMsSecurityIncidentArray []AlertRuleMsSecurityIncidentInput

func (AlertRuleMsSecurityIncidentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertRuleMsSecurityIncident)(nil)).Elem()
}

func (i AlertRuleMsSecurityIncidentArray) ToAlertRuleMsSecurityIncidentArrayOutput() AlertRuleMsSecurityIncidentArrayOutput {
	return i.ToAlertRuleMsSecurityIncidentArrayOutputWithContext(context.Background())
}

func (i AlertRuleMsSecurityIncidentArray) ToAlertRuleMsSecurityIncidentArrayOutputWithContext(ctx context.Context) AlertRuleMsSecurityIncidentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertRuleMsSecurityIncidentArrayOutput)
}

// AlertRuleMsSecurityIncidentMapInput is an input type that accepts AlertRuleMsSecurityIncidentMap and AlertRuleMsSecurityIncidentMapOutput values.
// You can construct a concrete instance of `AlertRuleMsSecurityIncidentMapInput` via:
//
//	AlertRuleMsSecurityIncidentMap{ "key": AlertRuleMsSecurityIncidentArgs{...} }
type AlertRuleMsSecurityIncidentMapInput interface {
	pulumi.Input

	ToAlertRuleMsSecurityIncidentMapOutput() AlertRuleMsSecurityIncidentMapOutput
	ToAlertRuleMsSecurityIncidentMapOutputWithContext(context.Context) AlertRuleMsSecurityIncidentMapOutput
}

type AlertRuleMsSecurityIncidentMap map[string]AlertRuleMsSecurityIncidentInput

func (AlertRuleMsSecurityIncidentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertRuleMsSecurityIncident)(nil)).Elem()
}

func (i AlertRuleMsSecurityIncidentMap) ToAlertRuleMsSecurityIncidentMapOutput() AlertRuleMsSecurityIncidentMapOutput {
	return i.ToAlertRuleMsSecurityIncidentMapOutputWithContext(context.Background())
}

func (i AlertRuleMsSecurityIncidentMap) ToAlertRuleMsSecurityIncidentMapOutputWithContext(ctx context.Context) AlertRuleMsSecurityIncidentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertRuleMsSecurityIncidentMapOutput)
}

type AlertRuleMsSecurityIncidentOutput struct{ *pulumi.OutputState }

func (AlertRuleMsSecurityIncidentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertRuleMsSecurityIncident)(nil)).Elem()
}

func (o AlertRuleMsSecurityIncidentOutput) ToAlertRuleMsSecurityIncidentOutput() AlertRuleMsSecurityIncidentOutput {
	return o
}

func (o AlertRuleMsSecurityIncidentOutput) ToAlertRuleMsSecurityIncidentOutputWithContext(ctx context.Context) AlertRuleMsSecurityIncidentOutput {
	return o
}

// The GUID of the alert rule template which is used to create this Sentinel Scheduled Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
func (o AlertRuleMsSecurityIncidentOutput) AlertRuleTemplateGuid() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.StringPtrOutput { return v.AlertRuleTemplateGuid }).(pulumi.StringPtrOutput)
}

// The description of this Sentinel MS Security Incident Alert Rule.
func (o AlertRuleMsSecurityIncidentOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The friendly name of this Sentinel MS Security Incident Alert Rule.
func (o AlertRuleMsSecurityIncidentOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Only create incidents when the alert display name doesn't contain text from this list.
func (o AlertRuleMsSecurityIncidentOutput) DisplayNameExcludeFilters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.StringArrayOutput { return v.DisplayNameExcludeFilters }).(pulumi.StringArrayOutput)
}

// Only create incidents when the alert display name contain text from this list, leave empty to apply no filter.
func (o AlertRuleMsSecurityIncidentOutput) DisplayNameFilters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.StringArrayOutput { return v.DisplayNameFilters }).(pulumi.StringArrayOutput)
}

// Should this Sentinel MS Security Incident Alert Rule be enabled? Defaults to `true`.
func (o AlertRuleMsSecurityIncidentOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The ID of the Log Analytics Workspace this Sentinel MS Security Incident Alert Rule belongs to. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
func (o AlertRuleMsSecurityIncidentOutput) LogAnalyticsWorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.StringOutput { return v.LogAnalyticsWorkspaceId }).(pulumi.StringOutput)
}

// The name which should be used for this Sentinel MS Security Incident Alert Rule. Changing this forces a new Sentinel MS Security Incident Alert Rule to be created.
func (o AlertRuleMsSecurityIncidentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Microsoft Security Service from where the alert will be generated. Possible values are `Azure Active Directory Identity Protection`, `Azure Advanced Threat Protection`, `Azure Security Center`, `Azure Security Center for IoT`, `Microsoft Cloud App Security`, `Microsoft Defender Advanced Threat Protection` and `Office 365 Advanced Threat Protection`.
func (o AlertRuleMsSecurityIncidentOutput) ProductFilter() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.StringOutput { return v.ProductFilter }).(pulumi.StringOutput)
}

// Only create incidents from alerts when alert severity level is contained in this list. Possible values are `High`, `Medium`, `Low` and `Informational`.
//
// > **Note:** At least one of the severity filters need to be set.
func (o AlertRuleMsSecurityIncidentOutput) SeverityFilters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AlertRuleMsSecurityIncident) pulumi.StringArrayOutput { return v.SeverityFilters }).(pulumi.StringArrayOutput)
}

type AlertRuleMsSecurityIncidentArrayOutput struct{ *pulumi.OutputState }

func (AlertRuleMsSecurityIncidentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertRuleMsSecurityIncident)(nil)).Elem()
}

func (o AlertRuleMsSecurityIncidentArrayOutput) ToAlertRuleMsSecurityIncidentArrayOutput() AlertRuleMsSecurityIncidentArrayOutput {
	return o
}

func (o AlertRuleMsSecurityIncidentArrayOutput) ToAlertRuleMsSecurityIncidentArrayOutputWithContext(ctx context.Context) AlertRuleMsSecurityIncidentArrayOutput {
	return o
}

func (o AlertRuleMsSecurityIncidentArrayOutput) Index(i pulumi.IntInput) AlertRuleMsSecurityIncidentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlertRuleMsSecurityIncident {
		return vs[0].([]*AlertRuleMsSecurityIncident)[vs[1].(int)]
	}).(AlertRuleMsSecurityIncidentOutput)
}

type AlertRuleMsSecurityIncidentMapOutput struct{ *pulumi.OutputState }

func (AlertRuleMsSecurityIncidentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertRuleMsSecurityIncident)(nil)).Elem()
}

func (o AlertRuleMsSecurityIncidentMapOutput) ToAlertRuleMsSecurityIncidentMapOutput() AlertRuleMsSecurityIncidentMapOutput {
	return o
}

func (o AlertRuleMsSecurityIncidentMapOutput) ToAlertRuleMsSecurityIncidentMapOutputWithContext(ctx context.Context) AlertRuleMsSecurityIncidentMapOutput {
	return o
}

func (o AlertRuleMsSecurityIncidentMapOutput) MapIndex(k pulumi.StringInput) AlertRuleMsSecurityIncidentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlertRuleMsSecurityIncident {
		return vs[0].(map[string]*AlertRuleMsSecurityIncident)[vs[1].(string)]
	}).(AlertRuleMsSecurityIncidentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertRuleMsSecurityIncidentInput)(nil)).Elem(), &AlertRuleMsSecurityIncident{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertRuleMsSecurityIncidentArrayInput)(nil)).Elem(), AlertRuleMsSecurityIncidentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertRuleMsSecurityIncidentMapInput)(nil)).Elem(), AlertRuleMsSecurityIncidentMap{})
	pulumi.RegisterOutputType(AlertRuleMsSecurityIncidentOutput{})
	pulumi.RegisterOutputType(AlertRuleMsSecurityIncidentArrayOutput{})
	pulumi.RegisterOutputType(AlertRuleMsSecurityIncidentMapOutput{})
}
