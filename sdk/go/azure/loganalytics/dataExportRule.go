// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package loganalytics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Log Analytics Data Export Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/loganalytics"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/operationalinsights"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
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
//				Name:              pulumi.String("exampleworkspace"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("PerGB2018"),
//				RetentionInDays:   pulumi.Int(30),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("examplestoracc"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = loganalytics.NewDataExportRule(ctx, "example", &loganalytics.DataExportRuleArgs{
//				Name:                  pulumi.String("dataExport1"),
//				ResourceGroupName:     example.Name,
//				WorkspaceResourceId:   exampleAnalyticsWorkspace.ID(),
//				DestinationResourceId: exampleAccount.ID(),
//				TableNames: pulumi.StringArray{
//					pulumi.String("Heartbeat"),
//				},
//				Enabled: pulumi.Bool(true),
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
// * `Microsoft.OperationalInsights`: 2020-08-01
//
// ## Import
//
// Log Analytics Data Export Rule can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:loganalytics/dataExportRule:DataExportRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/dataExports/dataExport1
// ```
type DataExportRule struct {
	pulumi.CustomResourceState

	// The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
	DestinationResourceId pulumi.StringOutput `pulumi:"destinationResourceId"`
	// Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The ID of the created Data Export Rule.
	ExportRuleId pulumi.StringOutput `pulumi:"exportRuleId"`
	// The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A list of table names to export to the destination resource, for example: `["Heartbeat", "SecurityEvent"]`.
	TableNames pulumi.StringArrayOutput `pulumi:"tableNames"`
	// The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
	WorkspaceResourceId pulumi.StringOutput `pulumi:"workspaceResourceId"`
}

// NewDataExportRule registers a new resource with the given unique name, arguments, and options.
func NewDataExportRule(ctx *pulumi.Context,
	name string, args *DataExportRuleArgs, opts ...pulumi.ResourceOption) (*DataExportRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationResourceId == nil {
		return nil, errors.New("invalid value for required argument 'DestinationResourceId'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.TableNames == nil {
		return nil, errors.New("invalid value for required argument 'TableNames'")
	}
	if args.WorkspaceResourceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceResourceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataExportRule
	err := ctx.RegisterResource("azure:loganalytics/dataExportRule:DataExportRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataExportRule gets an existing DataExportRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataExportRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataExportRuleState, opts ...pulumi.ResourceOption) (*DataExportRule, error) {
	var resource DataExportRule
	err := ctx.ReadResource("azure:loganalytics/dataExportRule:DataExportRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataExportRule resources.
type dataExportRuleState struct {
	// The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
	DestinationResourceId *string `pulumi:"destinationResourceId"`
	// Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
	Enabled *bool `pulumi:"enabled"`
	// The ID of the created Data Export Rule.
	ExportRuleId *string `pulumi:"exportRuleId"`
	// The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A list of table names to export to the destination resource, for example: `["Heartbeat", "SecurityEvent"]`.
	TableNames []string `pulumi:"tableNames"`
	// The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
	WorkspaceResourceId *string `pulumi:"workspaceResourceId"`
}

type DataExportRuleState struct {
	// The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
	DestinationResourceId pulumi.StringPtrInput
	// Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
	Enabled pulumi.BoolPtrInput
	// The ID of the created Data Export Rule.
	ExportRuleId pulumi.StringPtrInput
	// The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A list of table names to export to the destination resource, for example: `["Heartbeat", "SecurityEvent"]`.
	TableNames pulumi.StringArrayInput
	// The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
	WorkspaceResourceId pulumi.StringPtrInput
}

func (DataExportRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataExportRuleState)(nil)).Elem()
}

type dataExportRuleArgs struct {
	// The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
	DestinationResourceId string `pulumi:"destinationResourceId"`
	// Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
	Enabled *bool `pulumi:"enabled"`
	// The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A list of table names to export to the destination resource, for example: `["Heartbeat", "SecurityEvent"]`.
	TableNames []string `pulumi:"tableNames"`
	// The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
	WorkspaceResourceId string `pulumi:"workspaceResourceId"`
}

// The set of arguments for constructing a DataExportRule resource.
type DataExportRuleArgs struct {
	// The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
	DestinationResourceId pulumi.StringInput
	// Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
	Enabled pulumi.BoolPtrInput
	// The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
	ResourceGroupName pulumi.StringInput
	// A list of table names to export to the destination resource, for example: `["Heartbeat", "SecurityEvent"]`.
	TableNames pulumi.StringArrayInput
	// The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
	WorkspaceResourceId pulumi.StringInput
}

func (DataExportRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataExportRuleArgs)(nil)).Elem()
}

type DataExportRuleInput interface {
	pulumi.Input

	ToDataExportRuleOutput() DataExportRuleOutput
	ToDataExportRuleOutputWithContext(ctx context.Context) DataExportRuleOutput
}

func (*DataExportRule) ElementType() reflect.Type {
	return reflect.TypeOf((**DataExportRule)(nil)).Elem()
}

func (i *DataExportRule) ToDataExportRuleOutput() DataExportRuleOutput {
	return i.ToDataExportRuleOutputWithContext(context.Background())
}

func (i *DataExportRule) ToDataExportRuleOutputWithContext(ctx context.Context) DataExportRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataExportRuleOutput)
}

// DataExportRuleArrayInput is an input type that accepts DataExportRuleArray and DataExportRuleArrayOutput values.
// You can construct a concrete instance of `DataExportRuleArrayInput` via:
//
//	DataExportRuleArray{ DataExportRuleArgs{...} }
type DataExportRuleArrayInput interface {
	pulumi.Input

	ToDataExportRuleArrayOutput() DataExportRuleArrayOutput
	ToDataExportRuleArrayOutputWithContext(context.Context) DataExportRuleArrayOutput
}

type DataExportRuleArray []DataExportRuleInput

func (DataExportRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataExportRule)(nil)).Elem()
}

func (i DataExportRuleArray) ToDataExportRuleArrayOutput() DataExportRuleArrayOutput {
	return i.ToDataExportRuleArrayOutputWithContext(context.Background())
}

func (i DataExportRuleArray) ToDataExportRuleArrayOutputWithContext(ctx context.Context) DataExportRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataExportRuleArrayOutput)
}

// DataExportRuleMapInput is an input type that accepts DataExportRuleMap and DataExportRuleMapOutput values.
// You can construct a concrete instance of `DataExportRuleMapInput` via:
//
//	DataExportRuleMap{ "key": DataExportRuleArgs{...} }
type DataExportRuleMapInput interface {
	pulumi.Input

	ToDataExportRuleMapOutput() DataExportRuleMapOutput
	ToDataExportRuleMapOutputWithContext(context.Context) DataExportRuleMapOutput
}

type DataExportRuleMap map[string]DataExportRuleInput

func (DataExportRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataExportRule)(nil)).Elem()
}

func (i DataExportRuleMap) ToDataExportRuleMapOutput() DataExportRuleMapOutput {
	return i.ToDataExportRuleMapOutputWithContext(context.Background())
}

func (i DataExportRuleMap) ToDataExportRuleMapOutputWithContext(ctx context.Context) DataExportRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataExportRuleMapOutput)
}

type DataExportRuleOutput struct{ *pulumi.OutputState }

func (DataExportRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataExportRule)(nil)).Elem()
}

func (o DataExportRuleOutput) ToDataExportRuleOutput() DataExportRuleOutput {
	return o
}

func (o DataExportRuleOutput) ToDataExportRuleOutputWithContext(ctx context.Context) DataExportRuleOutput {
	return o
}

// The destination resource ID. It should be a storage account, an event hub namespace or an event hub. If the destination is an event hub namespace, an event hub would be created for each table automatically.
func (o DataExportRuleOutput) DestinationResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExportRule) pulumi.StringOutput { return v.DestinationResourceId }).(pulumi.StringOutput)
}

// Is this Log Analytics Data Export Rule enabled? Possible values include `true` or `false`. Defaults to `false`.
func (o DataExportRuleOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DataExportRule) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The ID of the created Data Export Rule.
func (o DataExportRuleOutput) ExportRuleId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExportRule) pulumi.StringOutput { return v.ExportRuleId }).(pulumi.StringOutput)
}

// The name of the Log Analytics Data Export Rule. Changing this forces a new Log Analytics Data Export Rule to be created.
func (o DataExportRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExportRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Log Analytics Data Export should exist. Changing this forces a new Log Analytics Data Export Rule to be created.
func (o DataExportRuleOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExportRule) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A list of table names to export to the destination resource, for example: `["Heartbeat", "SecurityEvent"]`.
func (o DataExportRuleOutput) TableNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DataExportRule) pulumi.StringArrayOutput { return v.TableNames }).(pulumi.StringArrayOutput)
}

// The resource ID of the workspace. Changing this forces a new Log Analytics Data Export Rule to be created.
func (o DataExportRuleOutput) WorkspaceResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataExportRule) pulumi.StringOutput { return v.WorkspaceResourceId }).(pulumi.StringOutput)
}

type DataExportRuleArrayOutput struct{ *pulumi.OutputState }

func (DataExportRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataExportRule)(nil)).Elem()
}

func (o DataExportRuleArrayOutput) ToDataExportRuleArrayOutput() DataExportRuleArrayOutput {
	return o
}

func (o DataExportRuleArrayOutput) ToDataExportRuleArrayOutputWithContext(ctx context.Context) DataExportRuleArrayOutput {
	return o
}

func (o DataExportRuleArrayOutput) Index(i pulumi.IntInput) DataExportRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataExportRule {
		return vs[0].([]*DataExportRule)[vs[1].(int)]
	}).(DataExportRuleOutput)
}

type DataExportRuleMapOutput struct{ *pulumi.OutputState }

func (DataExportRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataExportRule)(nil)).Elem()
}

func (o DataExportRuleMapOutput) ToDataExportRuleMapOutput() DataExportRuleMapOutput {
	return o
}

func (o DataExportRuleMapOutput) ToDataExportRuleMapOutputWithContext(ctx context.Context) DataExportRuleMapOutput {
	return o
}

func (o DataExportRuleMapOutput) MapIndex(k pulumi.StringInput) DataExportRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataExportRule {
		return vs[0].(map[string]*DataExportRule)[vs[1].(string)]
	}).(DataExportRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataExportRuleInput)(nil)).Elem(), &DataExportRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataExportRuleArrayInput)(nil)).Elem(), DataExportRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataExportRuleMapInput)(nil)).Elem(), DataExportRuleMap{})
	pulumi.RegisterOutputType(DataExportRuleOutput{})
	pulumi.RegisterOutputType(DataExportRuleArrayOutput{})
	pulumi.RegisterOutputType(DataExportRuleMapOutput{})
}
