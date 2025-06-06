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

// Manages a Log Analytics (formally Operational Insights) Windows Performance Counter DataSource.
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
//				Name:              pulumi.String("example-law"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("PerGB2018"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = loganalytics.NewDataSourceWindowsPerformanceCounter(ctx, "example", &loganalytics.DataSourceWindowsPerformanceCounterArgs{
//				Name:              pulumi.String("example-lad-wpc"),
//				ResourceGroupName: example.Name,
//				WorkspaceName:     exampleAnalyticsWorkspace.Name,
//				ObjectName:        pulumi.String("CPU"),
//				InstanceName:      pulumi.String("*"),
//				CounterName:       pulumi.String("CPU"),
//				IntervalSeconds:   pulumi.Int(10),
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
// Log Analytics Windows Performance Counter DataSources can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:loganalytics/dataSourceWindowsPerformanceCounter:DataSourceWindowsPerformanceCounter example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/dataSources/datasource1
// ```
type DataSourceWindowsPerformanceCounter struct {
	pulumi.CustomResourceState

	// The friendly name of the performance counter.
	CounterName pulumi.StringOutput `pulumi:"counterName"`
	// The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
	InstanceName pulumi.StringOutput `pulumi:"instanceName"`
	// The time of sample interval in seconds. Supports values between 10 and 2147483647.
	IntervalSeconds pulumi.IntOutput `pulumi:"intervalSeconds"`
	// The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The object name of the Log Analytics Windows Performance Counter DataSource.
	ObjectName pulumi.StringOutput `pulumi:"objectName"`
	// The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	WorkspaceName pulumi.StringOutput `pulumi:"workspaceName"`
}

// NewDataSourceWindowsPerformanceCounter registers a new resource with the given unique name, arguments, and options.
func NewDataSourceWindowsPerformanceCounter(ctx *pulumi.Context,
	name string, args *DataSourceWindowsPerformanceCounterArgs, opts ...pulumi.ResourceOption) (*DataSourceWindowsPerformanceCounter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CounterName == nil {
		return nil, errors.New("invalid value for required argument 'CounterName'")
	}
	if args.InstanceName == nil {
		return nil, errors.New("invalid value for required argument 'InstanceName'")
	}
	if args.IntervalSeconds == nil {
		return nil, errors.New("invalid value for required argument 'IntervalSeconds'")
	}
	if args.ObjectName == nil {
		return nil, errors.New("invalid value for required argument 'ObjectName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.WorkspaceName == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataSourceWindowsPerformanceCounter
	err := ctx.RegisterResource("azure:loganalytics/dataSourceWindowsPerformanceCounter:DataSourceWindowsPerformanceCounter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataSourceWindowsPerformanceCounter gets an existing DataSourceWindowsPerformanceCounter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataSourceWindowsPerformanceCounter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataSourceWindowsPerformanceCounterState, opts ...pulumi.ResourceOption) (*DataSourceWindowsPerformanceCounter, error) {
	var resource DataSourceWindowsPerformanceCounter
	err := ctx.ReadResource("azure:loganalytics/dataSourceWindowsPerformanceCounter:DataSourceWindowsPerformanceCounter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataSourceWindowsPerformanceCounter resources.
type dataSourceWindowsPerformanceCounterState struct {
	// The friendly name of the performance counter.
	CounterName *string `pulumi:"counterName"`
	// The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
	InstanceName *string `pulumi:"instanceName"`
	// The time of sample interval in seconds. Supports values between 10 and 2147483647.
	IntervalSeconds *int `pulumi:"intervalSeconds"`
	// The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	Name *string `pulumi:"name"`
	// The object name of the Log Analytics Windows Performance Counter DataSource.
	ObjectName *string `pulumi:"objectName"`
	// The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	WorkspaceName *string `pulumi:"workspaceName"`
}

type DataSourceWindowsPerformanceCounterState struct {
	// The friendly name of the performance counter.
	CounterName pulumi.StringPtrInput
	// The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
	InstanceName pulumi.StringPtrInput
	// The time of sample interval in seconds. Supports values between 10 and 2147483647.
	IntervalSeconds pulumi.IntPtrInput
	// The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	Name pulumi.StringPtrInput
	// The object name of the Log Analytics Windows Performance Counter DataSource.
	ObjectName pulumi.StringPtrInput
	// The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	WorkspaceName pulumi.StringPtrInput
}

func (DataSourceWindowsPerformanceCounterState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataSourceWindowsPerformanceCounterState)(nil)).Elem()
}

type dataSourceWindowsPerformanceCounterArgs struct {
	// The friendly name of the performance counter.
	CounterName string `pulumi:"counterName"`
	// The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
	InstanceName string `pulumi:"instanceName"`
	// The time of sample interval in seconds. Supports values between 10 and 2147483647.
	IntervalSeconds int `pulumi:"intervalSeconds"`
	// The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	Name *string `pulumi:"name"`
	// The object name of the Log Analytics Windows Performance Counter DataSource.
	ObjectName string `pulumi:"objectName"`
	// The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	WorkspaceName string `pulumi:"workspaceName"`
}

// The set of arguments for constructing a DataSourceWindowsPerformanceCounter resource.
type DataSourceWindowsPerformanceCounterArgs struct {
	// The friendly name of the performance counter.
	CounterName pulumi.StringInput
	// The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
	InstanceName pulumi.StringInput
	// The time of sample interval in seconds. Supports values between 10 and 2147483647.
	IntervalSeconds pulumi.IntInput
	// The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	Name pulumi.StringPtrInput
	// The object name of the Log Analytics Windows Performance Counter DataSource.
	ObjectName pulumi.StringInput
	// The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	ResourceGroupName pulumi.StringInput
	// The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
	WorkspaceName pulumi.StringInput
}

func (DataSourceWindowsPerformanceCounterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataSourceWindowsPerformanceCounterArgs)(nil)).Elem()
}

type DataSourceWindowsPerformanceCounterInput interface {
	pulumi.Input

	ToDataSourceWindowsPerformanceCounterOutput() DataSourceWindowsPerformanceCounterOutput
	ToDataSourceWindowsPerformanceCounterOutputWithContext(ctx context.Context) DataSourceWindowsPerformanceCounterOutput
}

func (*DataSourceWindowsPerformanceCounter) ElementType() reflect.Type {
	return reflect.TypeOf((**DataSourceWindowsPerformanceCounter)(nil)).Elem()
}

func (i *DataSourceWindowsPerformanceCounter) ToDataSourceWindowsPerformanceCounterOutput() DataSourceWindowsPerformanceCounterOutput {
	return i.ToDataSourceWindowsPerformanceCounterOutputWithContext(context.Background())
}

func (i *DataSourceWindowsPerformanceCounter) ToDataSourceWindowsPerformanceCounterOutputWithContext(ctx context.Context) DataSourceWindowsPerformanceCounterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataSourceWindowsPerformanceCounterOutput)
}

// DataSourceWindowsPerformanceCounterArrayInput is an input type that accepts DataSourceWindowsPerformanceCounterArray and DataSourceWindowsPerformanceCounterArrayOutput values.
// You can construct a concrete instance of `DataSourceWindowsPerformanceCounterArrayInput` via:
//
//	DataSourceWindowsPerformanceCounterArray{ DataSourceWindowsPerformanceCounterArgs{...} }
type DataSourceWindowsPerformanceCounterArrayInput interface {
	pulumi.Input

	ToDataSourceWindowsPerformanceCounterArrayOutput() DataSourceWindowsPerformanceCounterArrayOutput
	ToDataSourceWindowsPerformanceCounterArrayOutputWithContext(context.Context) DataSourceWindowsPerformanceCounterArrayOutput
}

type DataSourceWindowsPerformanceCounterArray []DataSourceWindowsPerformanceCounterInput

func (DataSourceWindowsPerformanceCounterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataSourceWindowsPerformanceCounter)(nil)).Elem()
}

func (i DataSourceWindowsPerformanceCounterArray) ToDataSourceWindowsPerformanceCounterArrayOutput() DataSourceWindowsPerformanceCounterArrayOutput {
	return i.ToDataSourceWindowsPerformanceCounterArrayOutputWithContext(context.Background())
}

func (i DataSourceWindowsPerformanceCounterArray) ToDataSourceWindowsPerformanceCounterArrayOutputWithContext(ctx context.Context) DataSourceWindowsPerformanceCounterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataSourceWindowsPerformanceCounterArrayOutput)
}

// DataSourceWindowsPerformanceCounterMapInput is an input type that accepts DataSourceWindowsPerformanceCounterMap and DataSourceWindowsPerformanceCounterMapOutput values.
// You can construct a concrete instance of `DataSourceWindowsPerformanceCounterMapInput` via:
//
//	DataSourceWindowsPerformanceCounterMap{ "key": DataSourceWindowsPerformanceCounterArgs{...} }
type DataSourceWindowsPerformanceCounterMapInput interface {
	pulumi.Input

	ToDataSourceWindowsPerformanceCounterMapOutput() DataSourceWindowsPerformanceCounterMapOutput
	ToDataSourceWindowsPerformanceCounterMapOutputWithContext(context.Context) DataSourceWindowsPerformanceCounterMapOutput
}

type DataSourceWindowsPerformanceCounterMap map[string]DataSourceWindowsPerformanceCounterInput

func (DataSourceWindowsPerformanceCounterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataSourceWindowsPerformanceCounter)(nil)).Elem()
}

func (i DataSourceWindowsPerformanceCounterMap) ToDataSourceWindowsPerformanceCounterMapOutput() DataSourceWindowsPerformanceCounterMapOutput {
	return i.ToDataSourceWindowsPerformanceCounterMapOutputWithContext(context.Background())
}

func (i DataSourceWindowsPerformanceCounterMap) ToDataSourceWindowsPerformanceCounterMapOutputWithContext(ctx context.Context) DataSourceWindowsPerformanceCounterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataSourceWindowsPerformanceCounterMapOutput)
}

type DataSourceWindowsPerformanceCounterOutput struct{ *pulumi.OutputState }

func (DataSourceWindowsPerformanceCounterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataSourceWindowsPerformanceCounter)(nil)).Elem()
}

func (o DataSourceWindowsPerformanceCounterOutput) ToDataSourceWindowsPerformanceCounterOutput() DataSourceWindowsPerformanceCounterOutput {
	return o
}

func (o DataSourceWindowsPerformanceCounterOutput) ToDataSourceWindowsPerformanceCounterOutputWithContext(ctx context.Context) DataSourceWindowsPerformanceCounterOutput {
	return o
}

// The friendly name of the performance counter.
func (o DataSourceWindowsPerformanceCounterOutput) CounterName() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSourceWindowsPerformanceCounter) pulumi.StringOutput { return v.CounterName }).(pulumi.StringOutput)
}

// The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
func (o DataSourceWindowsPerformanceCounterOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSourceWindowsPerformanceCounter) pulumi.StringOutput { return v.InstanceName }).(pulumi.StringOutput)
}

// The time of sample interval in seconds. Supports values between 10 and 2147483647.
func (o DataSourceWindowsPerformanceCounterOutput) IntervalSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *DataSourceWindowsPerformanceCounter) pulumi.IntOutput { return v.IntervalSeconds }).(pulumi.IntOutput)
}

// The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
func (o DataSourceWindowsPerformanceCounterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSourceWindowsPerformanceCounter) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The object name of the Log Analytics Windows Performance Counter DataSource.
func (o DataSourceWindowsPerformanceCounterOutput) ObjectName() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSourceWindowsPerformanceCounter) pulumi.StringOutput { return v.ObjectName }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
func (o DataSourceWindowsPerformanceCounterOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSourceWindowsPerformanceCounter) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
func (o DataSourceWindowsPerformanceCounterOutput) WorkspaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *DataSourceWindowsPerformanceCounter) pulumi.StringOutput { return v.WorkspaceName }).(pulumi.StringOutput)
}

type DataSourceWindowsPerformanceCounterArrayOutput struct{ *pulumi.OutputState }

func (DataSourceWindowsPerformanceCounterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataSourceWindowsPerformanceCounter)(nil)).Elem()
}

func (o DataSourceWindowsPerformanceCounterArrayOutput) ToDataSourceWindowsPerformanceCounterArrayOutput() DataSourceWindowsPerformanceCounterArrayOutput {
	return o
}

func (o DataSourceWindowsPerformanceCounterArrayOutput) ToDataSourceWindowsPerformanceCounterArrayOutputWithContext(ctx context.Context) DataSourceWindowsPerformanceCounterArrayOutput {
	return o
}

func (o DataSourceWindowsPerformanceCounterArrayOutput) Index(i pulumi.IntInput) DataSourceWindowsPerformanceCounterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataSourceWindowsPerformanceCounter {
		return vs[0].([]*DataSourceWindowsPerformanceCounter)[vs[1].(int)]
	}).(DataSourceWindowsPerformanceCounterOutput)
}

type DataSourceWindowsPerformanceCounterMapOutput struct{ *pulumi.OutputState }

func (DataSourceWindowsPerformanceCounterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataSourceWindowsPerformanceCounter)(nil)).Elem()
}

func (o DataSourceWindowsPerformanceCounterMapOutput) ToDataSourceWindowsPerformanceCounterMapOutput() DataSourceWindowsPerformanceCounterMapOutput {
	return o
}

func (o DataSourceWindowsPerformanceCounterMapOutput) ToDataSourceWindowsPerformanceCounterMapOutputWithContext(ctx context.Context) DataSourceWindowsPerformanceCounterMapOutput {
	return o
}

func (o DataSourceWindowsPerformanceCounterMapOutput) MapIndex(k pulumi.StringInput) DataSourceWindowsPerformanceCounterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataSourceWindowsPerformanceCounter {
		return vs[0].(map[string]*DataSourceWindowsPerformanceCounter)[vs[1].(string)]
	}).(DataSourceWindowsPerformanceCounterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataSourceWindowsPerformanceCounterInput)(nil)).Elem(), &DataSourceWindowsPerformanceCounter{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataSourceWindowsPerformanceCounterArrayInput)(nil)).Elem(), DataSourceWindowsPerformanceCounterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataSourceWindowsPerformanceCounterMapInput)(nil)).Elem(), DataSourceWindowsPerformanceCounterMap{})
	pulumi.RegisterOutputType(DataSourceWindowsPerformanceCounterOutput{})
	pulumi.RegisterOutputType(DataSourceWindowsPerformanceCounterArrayOutput{})
	pulumi.RegisterOutputType(DataSourceWindowsPerformanceCounterMapOutput{})
}
