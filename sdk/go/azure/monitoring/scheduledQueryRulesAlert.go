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

// Manages an AlertingAction Scheduled Query Rules resource within Azure Monitor.
//
// > **Note:** This resource is using an older AzureRM API version which is known to cause problems e.g. with custom webhook properties not included in triggered alerts. This resource is superseded by the monitoring.ScheduledQueryRulesAlertV2 resource using newer API versions.
//
// ## Import
//
// Scheduled Query Rule Alerts can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:monitoring/scheduledQueryRulesAlert:ScheduledQueryRulesAlert example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Insights/scheduledQueryRules/myrulename
// ```
type ScheduledQueryRulesAlert struct {
	pulumi.CustomResourceState

	// An `action` block as defined below.
	Action ScheduledQueryRulesAlertActionOutput `pulumi:"action"`
	// List of Resource IDs referred into query.
	AuthorizedResourceIds pulumi.StringArrayOutput `pulumi:"authorizedResourceIds"`
	// Should the alerts in this Metric Alert be auto resolved? Defaults to `false`.
	// > **Note:** `autoMitigationEnabled` and `throttling` are mutually exclusive and cannot both be set.
	AutoMitigationEnabled pulumi.BoolPtrOutput `pulumi:"autoMitigationEnabled"`
	// The resource URI over which log search query is to be run. Changing this forces a new resource to be created.
	DataSourceId pulumi.StringOutput `pulumi:"dataSourceId"`
	// The description of the scheduled query rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether this scheduled query rule is enabled. Default is `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Frequency (in minutes) at which rule condition should be evaluated. Values must be between 5 and 1440 (inclusive).
	Frequency pulumi.IntOutput `pulumi:"frequency"`
	// Specifies the Azure Region where the resource should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the scheduled query rule. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Log search query.
	Query pulumi.StringOutput `pulumi:"query"`
	// The type of query results. Possible values are `ResultCount` and `Number`. Default is `ResultCount`. If set to `ResultCount`, `query` must include an `AggregatedValue` column of a numeric type, for example, `Heartbeat | summarize AggregatedValue = count() by bin(TimeGenerated, 5m)`.
	QueryType pulumi.StringPtrOutput `pulumi:"queryType"`
	// The name of the resource group in which to create the scheduled query rule instance. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// Severity of the alert. Possible values include: 0, 1, 2, 3, or 4.
	Severity pulumi.IntPtrOutput `pulumi:"severity"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Time (in minutes) for which Alerts should be throttled or suppressed. Values must be between 0 and 10000 (inclusive).
	Throttling pulumi.IntPtrOutput `pulumi:"throttling"`
	// Time window for which data needs to be fetched for query (must be greater than or equal to `frequency`). Values must be between 5 and 2880 (inclusive).
	TimeWindow pulumi.IntOutput `pulumi:"timeWindow"`
	// A `trigger` block as defined below.
	Trigger ScheduledQueryRulesAlertTriggerOutput `pulumi:"trigger"`
}

// NewScheduledQueryRulesAlert registers a new resource with the given unique name, arguments, and options.
func NewScheduledQueryRulesAlert(ctx *pulumi.Context,
	name string, args *ScheduledQueryRulesAlertArgs, opts ...pulumi.ResourceOption) (*ScheduledQueryRulesAlert, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.DataSourceId == nil {
		return nil, errors.New("invalid value for required argument 'DataSourceId'")
	}
	if args.Frequency == nil {
		return nil, errors.New("invalid value for required argument 'Frequency'")
	}
	if args.Query == nil {
		return nil, errors.New("invalid value for required argument 'Query'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.TimeWindow == nil {
		return nil, errors.New("invalid value for required argument 'TimeWindow'")
	}
	if args.Trigger == nil {
		return nil, errors.New("invalid value for required argument 'Trigger'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ScheduledQueryRulesAlert
	err := ctx.RegisterResource("azure:monitoring/scheduledQueryRulesAlert:ScheduledQueryRulesAlert", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScheduledQueryRulesAlert gets an existing ScheduledQueryRulesAlert resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScheduledQueryRulesAlert(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScheduledQueryRulesAlertState, opts ...pulumi.ResourceOption) (*ScheduledQueryRulesAlert, error) {
	var resource ScheduledQueryRulesAlert
	err := ctx.ReadResource("azure:monitoring/scheduledQueryRulesAlert:ScheduledQueryRulesAlert", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ScheduledQueryRulesAlert resources.
type scheduledQueryRulesAlertState struct {
	// An `action` block as defined below.
	Action *ScheduledQueryRulesAlertAction `pulumi:"action"`
	// List of Resource IDs referred into query.
	AuthorizedResourceIds []string `pulumi:"authorizedResourceIds"`
	// Should the alerts in this Metric Alert be auto resolved? Defaults to `false`.
	// > **Note:** `autoMitigationEnabled` and `throttling` are mutually exclusive and cannot both be set.
	AutoMitigationEnabled *bool `pulumi:"autoMitigationEnabled"`
	// The resource URI over which log search query is to be run. Changing this forces a new resource to be created.
	DataSourceId *string `pulumi:"dataSourceId"`
	// The description of the scheduled query rule.
	Description *string `pulumi:"description"`
	// Whether this scheduled query rule is enabled. Default is `true`.
	Enabled *bool `pulumi:"enabled"`
	// Frequency (in minutes) at which rule condition should be evaluated. Values must be between 5 and 1440 (inclusive).
	Frequency *int `pulumi:"frequency"`
	// Specifies the Azure Region where the resource should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the scheduled query rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Log search query.
	Query *string `pulumi:"query"`
	// The type of query results. Possible values are `ResultCount` and `Number`. Default is `ResultCount`. If set to `ResultCount`, `query` must include an `AggregatedValue` column of a numeric type, for example, `Heartbeat | summarize AggregatedValue = count() by bin(TimeGenerated, 5m)`.
	QueryType *string `pulumi:"queryType"`
	// The name of the resource group in which to create the scheduled query rule instance. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// Severity of the alert. Possible values include: 0, 1, 2, 3, or 4.
	Severity *int `pulumi:"severity"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Time (in minutes) for which Alerts should be throttled or suppressed. Values must be between 0 and 10000 (inclusive).
	Throttling *int `pulumi:"throttling"`
	// Time window for which data needs to be fetched for query (must be greater than or equal to `frequency`). Values must be between 5 and 2880 (inclusive).
	TimeWindow *int `pulumi:"timeWindow"`
	// A `trigger` block as defined below.
	Trigger *ScheduledQueryRulesAlertTrigger `pulumi:"trigger"`
}

type ScheduledQueryRulesAlertState struct {
	// An `action` block as defined below.
	Action ScheduledQueryRulesAlertActionPtrInput
	// List of Resource IDs referred into query.
	AuthorizedResourceIds pulumi.StringArrayInput
	// Should the alerts in this Metric Alert be auto resolved? Defaults to `false`.
	// > **Note:** `autoMitigationEnabled` and `throttling` are mutually exclusive and cannot both be set.
	AutoMitigationEnabled pulumi.BoolPtrInput
	// The resource URI over which log search query is to be run. Changing this forces a new resource to be created.
	DataSourceId pulumi.StringPtrInput
	// The description of the scheduled query rule.
	Description pulumi.StringPtrInput
	// Whether this scheduled query rule is enabled. Default is `true`.
	Enabled pulumi.BoolPtrInput
	// Frequency (in minutes) at which rule condition should be evaluated. Values must be between 5 and 1440 (inclusive).
	Frequency pulumi.IntPtrInput
	// Specifies the Azure Region where the resource should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the scheduled query rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Log search query.
	Query pulumi.StringPtrInput
	// The type of query results. Possible values are `ResultCount` and `Number`. Default is `ResultCount`. If set to `ResultCount`, `query` must include an `AggregatedValue` column of a numeric type, for example, `Heartbeat | summarize AggregatedValue = count() by bin(TimeGenerated, 5m)`.
	QueryType pulumi.StringPtrInput
	// The name of the resource group in which to create the scheduled query rule instance. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// Severity of the alert. Possible values include: 0, 1, 2, 3, or 4.
	Severity pulumi.IntPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Time (in minutes) for which Alerts should be throttled or suppressed. Values must be between 0 and 10000 (inclusive).
	Throttling pulumi.IntPtrInput
	// Time window for which data needs to be fetched for query (must be greater than or equal to `frequency`). Values must be between 5 and 2880 (inclusive).
	TimeWindow pulumi.IntPtrInput
	// A `trigger` block as defined below.
	Trigger ScheduledQueryRulesAlertTriggerPtrInput
}

func (ScheduledQueryRulesAlertState) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduledQueryRulesAlertState)(nil)).Elem()
}

type scheduledQueryRulesAlertArgs struct {
	// An `action` block as defined below.
	Action ScheduledQueryRulesAlertAction `pulumi:"action"`
	// List of Resource IDs referred into query.
	AuthorizedResourceIds []string `pulumi:"authorizedResourceIds"`
	// Should the alerts in this Metric Alert be auto resolved? Defaults to `false`.
	// > **Note:** `autoMitigationEnabled` and `throttling` are mutually exclusive and cannot both be set.
	AutoMitigationEnabled *bool `pulumi:"autoMitigationEnabled"`
	// The resource URI over which log search query is to be run. Changing this forces a new resource to be created.
	DataSourceId string `pulumi:"dataSourceId"`
	// The description of the scheduled query rule.
	Description *string `pulumi:"description"`
	// Whether this scheduled query rule is enabled. Default is `true`.
	Enabled *bool `pulumi:"enabled"`
	// Frequency (in minutes) at which rule condition should be evaluated. Values must be between 5 and 1440 (inclusive).
	Frequency int `pulumi:"frequency"`
	// Specifies the Azure Region where the resource should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the scheduled query rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Log search query.
	Query string `pulumi:"query"`
	// The type of query results. Possible values are `ResultCount` and `Number`. Default is `ResultCount`. If set to `ResultCount`, `query` must include an `AggregatedValue` column of a numeric type, for example, `Heartbeat | summarize AggregatedValue = count() by bin(TimeGenerated, 5m)`.
	QueryType *string `pulumi:"queryType"`
	// The name of the resource group in which to create the scheduled query rule instance. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Severity of the alert. Possible values include: 0, 1, 2, 3, or 4.
	Severity *int `pulumi:"severity"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Time (in minutes) for which Alerts should be throttled or suppressed. Values must be between 0 and 10000 (inclusive).
	Throttling *int `pulumi:"throttling"`
	// Time window for which data needs to be fetched for query (must be greater than or equal to `frequency`). Values must be between 5 and 2880 (inclusive).
	TimeWindow int `pulumi:"timeWindow"`
	// A `trigger` block as defined below.
	Trigger ScheduledQueryRulesAlertTrigger `pulumi:"trigger"`
}

// The set of arguments for constructing a ScheduledQueryRulesAlert resource.
type ScheduledQueryRulesAlertArgs struct {
	// An `action` block as defined below.
	Action ScheduledQueryRulesAlertActionInput
	// List of Resource IDs referred into query.
	AuthorizedResourceIds pulumi.StringArrayInput
	// Should the alerts in this Metric Alert be auto resolved? Defaults to `false`.
	// > **Note:** `autoMitigationEnabled` and `throttling` are mutually exclusive and cannot both be set.
	AutoMitigationEnabled pulumi.BoolPtrInput
	// The resource URI over which log search query is to be run. Changing this forces a new resource to be created.
	DataSourceId pulumi.StringInput
	// The description of the scheduled query rule.
	Description pulumi.StringPtrInput
	// Whether this scheduled query rule is enabled. Default is `true`.
	Enabled pulumi.BoolPtrInput
	// Frequency (in minutes) at which rule condition should be evaluated. Values must be between 5 and 1440 (inclusive).
	Frequency pulumi.IntInput
	// Specifies the Azure Region where the resource should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the scheduled query rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Log search query.
	Query pulumi.StringInput
	// The type of query results. Possible values are `ResultCount` and `Number`. Default is `ResultCount`. If set to `ResultCount`, `query` must include an `AggregatedValue` column of a numeric type, for example, `Heartbeat | summarize AggregatedValue = count() by bin(TimeGenerated, 5m)`.
	QueryType pulumi.StringPtrInput
	// The name of the resource group in which to create the scheduled query rule instance. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// Severity of the alert. Possible values include: 0, 1, 2, 3, or 4.
	Severity pulumi.IntPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// Time (in minutes) for which Alerts should be throttled or suppressed. Values must be between 0 and 10000 (inclusive).
	Throttling pulumi.IntPtrInput
	// Time window for which data needs to be fetched for query (must be greater than or equal to `frequency`). Values must be between 5 and 2880 (inclusive).
	TimeWindow pulumi.IntInput
	// A `trigger` block as defined below.
	Trigger ScheduledQueryRulesAlertTriggerInput
}

func (ScheduledQueryRulesAlertArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduledQueryRulesAlertArgs)(nil)).Elem()
}

type ScheduledQueryRulesAlertInput interface {
	pulumi.Input

	ToScheduledQueryRulesAlertOutput() ScheduledQueryRulesAlertOutput
	ToScheduledQueryRulesAlertOutputWithContext(ctx context.Context) ScheduledQueryRulesAlertOutput
}

func (*ScheduledQueryRulesAlert) ElementType() reflect.Type {
	return reflect.TypeOf((**ScheduledQueryRulesAlert)(nil)).Elem()
}

func (i *ScheduledQueryRulesAlert) ToScheduledQueryRulesAlertOutput() ScheduledQueryRulesAlertOutput {
	return i.ToScheduledQueryRulesAlertOutputWithContext(context.Background())
}

func (i *ScheduledQueryRulesAlert) ToScheduledQueryRulesAlertOutputWithContext(ctx context.Context) ScheduledQueryRulesAlertOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduledQueryRulesAlertOutput)
}

// ScheduledQueryRulesAlertArrayInput is an input type that accepts ScheduledQueryRulesAlertArray and ScheduledQueryRulesAlertArrayOutput values.
// You can construct a concrete instance of `ScheduledQueryRulesAlertArrayInput` via:
//
//	ScheduledQueryRulesAlertArray{ ScheduledQueryRulesAlertArgs{...} }
type ScheduledQueryRulesAlertArrayInput interface {
	pulumi.Input

	ToScheduledQueryRulesAlertArrayOutput() ScheduledQueryRulesAlertArrayOutput
	ToScheduledQueryRulesAlertArrayOutputWithContext(context.Context) ScheduledQueryRulesAlertArrayOutput
}

type ScheduledQueryRulesAlertArray []ScheduledQueryRulesAlertInput

func (ScheduledQueryRulesAlertArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScheduledQueryRulesAlert)(nil)).Elem()
}

func (i ScheduledQueryRulesAlertArray) ToScheduledQueryRulesAlertArrayOutput() ScheduledQueryRulesAlertArrayOutput {
	return i.ToScheduledQueryRulesAlertArrayOutputWithContext(context.Background())
}

func (i ScheduledQueryRulesAlertArray) ToScheduledQueryRulesAlertArrayOutputWithContext(ctx context.Context) ScheduledQueryRulesAlertArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduledQueryRulesAlertArrayOutput)
}

// ScheduledQueryRulesAlertMapInput is an input type that accepts ScheduledQueryRulesAlertMap and ScheduledQueryRulesAlertMapOutput values.
// You can construct a concrete instance of `ScheduledQueryRulesAlertMapInput` via:
//
//	ScheduledQueryRulesAlertMap{ "key": ScheduledQueryRulesAlertArgs{...} }
type ScheduledQueryRulesAlertMapInput interface {
	pulumi.Input

	ToScheduledQueryRulesAlertMapOutput() ScheduledQueryRulesAlertMapOutput
	ToScheduledQueryRulesAlertMapOutputWithContext(context.Context) ScheduledQueryRulesAlertMapOutput
}

type ScheduledQueryRulesAlertMap map[string]ScheduledQueryRulesAlertInput

func (ScheduledQueryRulesAlertMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScheduledQueryRulesAlert)(nil)).Elem()
}

func (i ScheduledQueryRulesAlertMap) ToScheduledQueryRulesAlertMapOutput() ScheduledQueryRulesAlertMapOutput {
	return i.ToScheduledQueryRulesAlertMapOutputWithContext(context.Background())
}

func (i ScheduledQueryRulesAlertMap) ToScheduledQueryRulesAlertMapOutputWithContext(ctx context.Context) ScheduledQueryRulesAlertMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduledQueryRulesAlertMapOutput)
}

type ScheduledQueryRulesAlertOutput struct{ *pulumi.OutputState }

func (ScheduledQueryRulesAlertOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ScheduledQueryRulesAlert)(nil)).Elem()
}

func (o ScheduledQueryRulesAlertOutput) ToScheduledQueryRulesAlertOutput() ScheduledQueryRulesAlertOutput {
	return o
}

func (o ScheduledQueryRulesAlertOutput) ToScheduledQueryRulesAlertOutputWithContext(ctx context.Context) ScheduledQueryRulesAlertOutput {
	return o
}

// An `action` block as defined below.
func (o ScheduledQueryRulesAlertOutput) Action() ScheduledQueryRulesAlertActionOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) ScheduledQueryRulesAlertActionOutput { return v.Action }).(ScheduledQueryRulesAlertActionOutput)
}

// List of Resource IDs referred into query.
func (o ScheduledQueryRulesAlertOutput) AuthorizedResourceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.StringArrayOutput { return v.AuthorizedResourceIds }).(pulumi.StringArrayOutput)
}

// Should the alerts in this Metric Alert be auto resolved? Defaults to `false`.
// > **Note:** `autoMitigationEnabled` and `throttling` are mutually exclusive and cannot both be set.
func (o ScheduledQueryRulesAlertOutput) AutoMitigationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.BoolPtrOutput { return v.AutoMitigationEnabled }).(pulumi.BoolPtrOutput)
}

// The resource URI over which log search query is to be run. Changing this forces a new resource to be created.
func (o ScheduledQueryRulesAlertOutput) DataSourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.StringOutput { return v.DataSourceId }).(pulumi.StringOutput)
}

// The description of the scheduled query rule.
func (o ScheduledQueryRulesAlertOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether this scheduled query rule is enabled. Default is `true`.
func (o ScheduledQueryRulesAlertOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Frequency (in minutes) at which rule condition should be evaluated. Values must be between 5 and 1440 (inclusive).
func (o ScheduledQueryRulesAlertOutput) Frequency() pulumi.IntOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.IntOutput { return v.Frequency }).(pulumi.IntOutput)
}

// Specifies the Azure Region where the resource should exist. Changing this forces a new resource to be created.
func (o ScheduledQueryRulesAlertOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the scheduled query rule. Changing this forces a new resource to be created.
func (o ScheduledQueryRulesAlertOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Log search query.
func (o ScheduledQueryRulesAlertOutput) Query() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.StringOutput { return v.Query }).(pulumi.StringOutput)
}

// The type of query results. Possible values are `ResultCount` and `Number`. Default is `ResultCount`. If set to `ResultCount`, `query` must include an `AggregatedValue` column of a numeric type, for example, `Heartbeat | summarize AggregatedValue = count() by bin(TimeGenerated, 5m)`.
func (o ScheduledQueryRulesAlertOutput) QueryType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.StringPtrOutput { return v.QueryType }).(pulumi.StringPtrOutput)
}

// The name of the resource group in which to create the scheduled query rule instance. Changing this forces a new resource to be created.
func (o ScheduledQueryRulesAlertOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// Severity of the alert. Possible values include: 0, 1, 2, 3, or 4.
func (o ScheduledQueryRulesAlertOutput) Severity() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.IntPtrOutput { return v.Severity }).(pulumi.IntPtrOutput)
}

// A mapping of tags to assign to the resource.
func (o ScheduledQueryRulesAlertOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Time (in minutes) for which Alerts should be throttled or suppressed. Values must be between 0 and 10000 (inclusive).
func (o ScheduledQueryRulesAlertOutput) Throttling() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.IntPtrOutput { return v.Throttling }).(pulumi.IntPtrOutput)
}

// Time window for which data needs to be fetched for query (must be greater than or equal to `frequency`). Values must be between 5 and 2880 (inclusive).
func (o ScheduledQueryRulesAlertOutput) TimeWindow() pulumi.IntOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) pulumi.IntOutput { return v.TimeWindow }).(pulumi.IntOutput)
}

// A `trigger` block as defined below.
func (o ScheduledQueryRulesAlertOutput) Trigger() ScheduledQueryRulesAlertTriggerOutput {
	return o.ApplyT(func(v *ScheduledQueryRulesAlert) ScheduledQueryRulesAlertTriggerOutput { return v.Trigger }).(ScheduledQueryRulesAlertTriggerOutput)
}

type ScheduledQueryRulesAlertArrayOutput struct{ *pulumi.OutputState }

func (ScheduledQueryRulesAlertArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScheduledQueryRulesAlert)(nil)).Elem()
}

func (o ScheduledQueryRulesAlertArrayOutput) ToScheduledQueryRulesAlertArrayOutput() ScheduledQueryRulesAlertArrayOutput {
	return o
}

func (o ScheduledQueryRulesAlertArrayOutput) ToScheduledQueryRulesAlertArrayOutputWithContext(ctx context.Context) ScheduledQueryRulesAlertArrayOutput {
	return o
}

func (o ScheduledQueryRulesAlertArrayOutput) Index(i pulumi.IntInput) ScheduledQueryRulesAlertOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ScheduledQueryRulesAlert {
		return vs[0].([]*ScheduledQueryRulesAlert)[vs[1].(int)]
	}).(ScheduledQueryRulesAlertOutput)
}

type ScheduledQueryRulesAlertMapOutput struct{ *pulumi.OutputState }

func (ScheduledQueryRulesAlertMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScheduledQueryRulesAlert)(nil)).Elem()
}

func (o ScheduledQueryRulesAlertMapOutput) ToScheduledQueryRulesAlertMapOutput() ScheduledQueryRulesAlertMapOutput {
	return o
}

func (o ScheduledQueryRulesAlertMapOutput) ToScheduledQueryRulesAlertMapOutputWithContext(ctx context.Context) ScheduledQueryRulesAlertMapOutput {
	return o
}

func (o ScheduledQueryRulesAlertMapOutput) MapIndex(k pulumi.StringInput) ScheduledQueryRulesAlertOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ScheduledQueryRulesAlert {
		return vs[0].(map[string]*ScheduledQueryRulesAlert)[vs[1].(string)]
	}).(ScheduledQueryRulesAlertOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduledQueryRulesAlertInput)(nil)).Elem(), &ScheduledQueryRulesAlert{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduledQueryRulesAlertArrayInput)(nil)).Elem(), ScheduledQueryRulesAlertArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduledQueryRulesAlertMapInput)(nil)).Elem(), ScheduledQueryRulesAlertMap{})
	pulumi.RegisterOutputType(ScheduledQueryRulesAlertOutput{})
	pulumi.RegisterOutputType(ScheduledQueryRulesAlertArrayOutput{})
	pulumi.RegisterOutputType(ScheduledQueryRulesAlertMapOutput{})
}
