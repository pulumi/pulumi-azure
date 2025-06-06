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

// Manages an Office IRM Data Connector.
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
//				Name:     pulumi.String("example-rg"),
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
//			_, err = sentinel.NewDataConnectorOfficeIrm(ctx, "example", &sentinel.DataConnectorOfficeIrmArgs{
//				Name:                    pulumi.String("example"),
//				LogAnalyticsWorkspaceId: exampleLogAnalyticsWorkspaceOnboarding.WorkspaceId,
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
// Office IRM Data Connectors can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:sentinel/dataConnectorOfficeIrm:DataConnectorOfficeIrm example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
// ```
type DataConnectorOfficeIrm struct {
	pulumi.CustomResourceState

	// The ID of the Log Analytics Workspace that this Office IRM Data Connector resides in. Changing this forces a new Office IRM Data Connector to be created.
	LogAnalyticsWorkspaceId pulumi.StringOutput `pulumi:"logAnalyticsWorkspaceId"`
	// The name which should be used for this Office IRM Data Connector. Changing this forces a new Office IRM Data Connector to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the tenant that this Office IRM Data Connector connects to. Changing this forces a new Office IRM Data Connector to be created.
	//
	// > **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
}

// NewDataConnectorOfficeIrm registers a new resource with the given unique name, arguments, and options.
func NewDataConnectorOfficeIrm(ctx *pulumi.Context,
	name string, args *DataConnectorOfficeIrmArgs, opts ...pulumi.ResourceOption) (*DataConnectorOfficeIrm, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LogAnalyticsWorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'LogAnalyticsWorkspaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataConnectorOfficeIrm
	err := ctx.RegisterResource("azure:sentinel/dataConnectorOfficeIrm:DataConnectorOfficeIrm", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataConnectorOfficeIrm gets an existing DataConnectorOfficeIrm resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataConnectorOfficeIrm(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataConnectorOfficeIrmState, opts ...pulumi.ResourceOption) (*DataConnectorOfficeIrm, error) {
	var resource DataConnectorOfficeIrm
	err := ctx.ReadResource("azure:sentinel/dataConnectorOfficeIrm:DataConnectorOfficeIrm", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataConnectorOfficeIrm resources.
type dataConnectorOfficeIrmState struct {
	// The ID of the Log Analytics Workspace that this Office IRM Data Connector resides in. Changing this forces a new Office IRM Data Connector to be created.
	LogAnalyticsWorkspaceId *string `pulumi:"logAnalyticsWorkspaceId"`
	// The name which should be used for this Office IRM Data Connector. Changing this forces a new Office IRM Data Connector to be created.
	Name *string `pulumi:"name"`
	// The ID of the tenant that this Office IRM Data Connector connects to. Changing this forces a new Office IRM Data Connector to be created.
	//
	// > **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
	TenantId *string `pulumi:"tenantId"`
}

type DataConnectorOfficeIrmState struct {
	// The ID of the Log Analytics Workspace that this Office IRM Data Connector resides in. Changing this forces a new Office IRM Data Connector to be created.
	LogAnalyticsWorkspaceId pulumi.StringPtrInput
	// The name which should be used for this Office IRM Data Connector. Changing this forces a new Office IRM Data Connector to be created.
	Name pulumi.StringPtrInput
	// The ID of the tenant that this Office IRM Data Connector connects to. Changing this forces a new Office IRM Data Connector to be created.
	//
	// > **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
	TenantId pulumi.StringPtrInput
}

func (DataConnectorOfficeIrmState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataConnectorOfficeIrmState)(nil)).Elem()
}

type dataConnectorOfficeIrmArgs struct {
	// The ID of the Log Analytics Workspace that this Office IRM Data Connector resides in. Changing this forces a new Office IRM Data Connector to be created.
	LogAnalyticsWorkspaceId string `pulumi:"logAnalyticsWorkspaceId"`
	// The name which should be used for this Office IRM Data Connector. Changing this forces a new Office IRM Data Connector to be created.
	Name *string `pulumi:"name"`
	// The ID of the tenant that this Office IRM Data Connector connects to. Changing this forces a new Office IRM Data Connector to be created.
	//
	// > **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
	TenantId *string `pulumi:"tenantId"`
}

// The set of arguments for constructing a DataConnectorOfficeIrm resource.
type DataConnectorOfficeIrmArgs struct {
	// The ID of the Log Analytics Workspace that this Office IRM Data Connector resides in. Changing this forces a new Office IRM Data Connector to be created.
	LogAnalyticsWorkspaceId pulumi.StringInput
	// The name which should be used for this Office IRM Data Connector. Changing this forces a new Office IRM Data Connector to be created.
	Name pulumi.StringPtrInput
	// The ID of the tenant that this Office IRM Data Connector connects to. Changing this forces a new Office IRM Data Connector to be created.
	//
	// > **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
	TenantId pulumi.StringPtrInput
}

func (DataConnectorOfficeIrmArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataConnectorOfficeIrmArgs)(nil)).Elem()
}

type DataConnectorOfficeIrmInput interface {
	pulumi.Input

	ToDataConnectorOfficeIrmOutput() DataConnectorOfficeIrmOutput
	ToDataConnectorOfficeIrmOutputWithContext(ctx context.Context) DataConnectorOfficeIrmOutput
}

func (*DataConnectorOfficeIrm) ElementType() reflect.Type {
	return reflect.TypeOf((**DataConnectorOfficeIrm)(nil)).Elem()
}

func (i *DataConnectorOfficeIrm) ToDataConnectorOfficeIrmOutput() DataConnectorOfficeIrmOutput {
	return i.ToDataConnectorOfficeIrmOutputWithContext(context.Background())
}

func (i *DataConnectorOfficeIrm) ToDataConnectorOfficeIrmOutputWithContext(ctx context.Context) DataConnectorOfficeIrmOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataConnectorOfficeIrmOutput)
}

// DataConnectorOfficeIrmArrayInput is an input type that accepts DataConnectorOfficeIrmArray and DataConnectorOfficeIrmArrayOutput values.
// You can construct a concrete instance of `DataConnectorOfficeIrmArrayInput` via:
//
//	DataConnectorOfficeIrmArray{ DataConnectorOfficeIrmArgs{...} }
type DataConnectorOfficeIrmArrayInput interface {
	pulumi.Input

	ToDataConnectorOfficeIrmArrayOutput() DataConnectorOfficeIrmArrayOutput
	ToDataConnectorOfficeIrmArrayOutputWithContext(context.Context) DataConnectorOfficeIrmArrayOutput
}

type DataConnectorOfficeIrmArray []DataConnectorOfficeIrmInput

func (DataConnectorOfficeIrmArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataConnectorOfficeIrm)(nil)).Elem()
}

func (i DataConnectorOfficeIrmArray) ToDataConnectorOfficeIrmArrayOutput() DataConnectorOfficeIrmArrayOutput {
	return i.ToDataConnectorOfficeIrmArrayOutputWithContext(context.Background())
}

func (i DataConnectorOfficeIrmArray) ToDataConnectorOfficeIrmArrayOutputWithContext(ctx context.Context) DataConnectorOfficeIrmArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataConnectorOfficeIrmArrayOutput)
}

// DataConnectorOfficeIrmMapInput is an input type that accepts DataConnectorOfficeIrmMap and DataConnectorOfficeIrmMapOutput values.
// You can construct a concrete instance of `DataConnectorOfficeIrmMapInput` via:
//
//	DataConnectorOfficeIrmMap{ "key": DataConnectorOfficeIrmArgs{...} }
type DataConnectorOfficeIrmMapInput interface {
	pulumi.Input

	ToDataConnectorOfficeIrmMapOutput() DataConnectorOfficeIrmMapOutput
	ToDataConnectorOfficeIrmMapOutputWithContext(context.Context) DataConnectorOfficeIrmMapOutput
}

type DataConnectorOfficeIrmMap map[string]DataConnectorOfficeIrmInput

func (DataConnectorOfficeIrmMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataConnectorOfficeIrm)(nil)).Elem()
}

func (i DataConnectorOfficeIrmMap) ToDataConnectorOfficeIrmMapOutput() DataConnectorOfficeIrmMapOutput {
	return i.ToDataConnectorOfficeIrmMapOutputWithContext(context.Background())
}

func (i DataConnectorOfficeIrmMap) ToDataConnectorOfficeIrmMapOutputWithContext(ctx context.Context) DataConnectorOfficeIrmMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataConnectorOfficeIrmMapOutput)
}

type DataConnectorOfficeIrmOutput struct{ *pulumi.OutputState }

func (DataConnectorOfficeIrmOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataConnectorOfficeIrm)(nil)).Elem()
}

func (o DataConnectorOfficeIrmOutput) ToDataConnectorOfficeIrmOutput() DataConnectorOfficeIrmOutput {
	return o
}

func (o DataConnectorOfficeIrmOutput) ToDataConnectorOfficeIrmOutputWithContext(ctx context.Context) DataConnectorOfficeIrmOutput {
	return o
}

// The ID of the Log Analytics Workspace that this Office IRM Data Connector resides in. Changing this forces a new Office IRM Data Connector to be created.
func (o DataConnectorOfficeIrmOutput) LogAnalyticsWorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataConnectorOfficeIrm) pulumi.StringOutput { return v.LogAnalyticsWorkspaceId }).(pulumi.StringOutput)
}

// The name which should be used for this Office IRM Data Connector. Changing this forces a new Office IRM Data Connector to be created.
func (o DataConnectorOfficeIrmOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DataConnectorOfficeIrm) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the tenant that this Office IRM Data Connector connects to. Changing this forces a new Office IRM Data Connector to be created.
//
// > **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
func (o DataConnectorOfficeIrmOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v *DataConnectorOfficeIrm) pulumi.StringOutput { return v.TenantId }).(pulumi.StringOutput)
}

type DataConnectorOfficeIrmArrayOutput struct{ *pulumi.OutputState }

func (DataConnectorOfficeIrmArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataConnectorOfficeIrm)(nil)).Elem()
}

func (o DataConnectorOfficeIrmArrayOutput) ToDataConnectorOfficeIrmArrayOutput() DataConnectorOfficeIrmArrayOutput {
	return o
}

func (o DataConnectorOfficeIrmArrayOutput) ToDataConnectorOfficeIrmArrayOutputWithContext(ctx context.Context) DataConnectorOfficeIrmArrayOutput {
	return o
}

func (o DataConnectorOfficeIrmArrayOutput) Index(i pulumi.IntInput) DataConnectorOfficeIrmOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataConnectorOfficeIrm {
		return vs[0].([]*DataConnectorOfficeIrm)[vs[1].(int)]
	}).(DataConnectorOfficeIrmOutput)
}

type DataConnectorOfficeIrmMapOutput struct{ *pulumi.OutputState }

func (DataConnectorOfficeIrmMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataConnectorOfficeIrm)(nil)).Elem()
}

func (o DataConnectorOfficeIrmMapOutput) ToDataConnectorOfficeIrmMapOutput() DataConnectorOfficeIrmMapOutput {
	return o
}

func (o DataConnectorOfficeIrmMapOutput) ToDataConnectorOfficeIrmMapOutputWithContext(ctx context.Context) DataConnectorOfficeIrmMapOutput {
	return o
}

func (o DataConnectorOfficeIrmMapOutput) MapIndex(k pulumi.StringInput) DataConnectorOfficeIrmOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataConnectorOfficeIrm {
		return vs[0].(map[string]*DataConnectorOfficeIrm)[vs[1].(string)]
	}).(DataConnectorOfficeIrmOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataConnectorOfficeIrmInput)(nil)).Elem(), &DataConnectorOfficeIrm{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataConnectorOfficeIrmArrayInput)(nil)).Elem(), DataConnectorOfficeIrmArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataConnectorOfficeIrmMapInput)(nil)).Elem(), DataConnectorOfficeIrmMap{})
	pulumi.RegisterOutputType(DataConnectorOfficeIrmOutput{})
	pulumi.RegisterOutputType(DataConnectorOfficeIrmArrayOutput{})
	pulumi.RegisterOutputType(DataConnectorOfficeIrmMapOutput{})
}
