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

// Manages a Log Analytics Linked Storage Account.
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
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("examplesa"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("GRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAnalyticsWorkspace, err := operationalinsights.NewAnalyticsWorkspace(ctx, "example", &operationalinsights.AnalyticsWorkspaceArgs{
//				Name:              pulumi.String("exampleworkspace"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("PerGB2018"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = loganalytics.NewLinkedStorageAccount(ctx, "example", &loganalytics.LinkedStorageAccountArgs{
//				DataSourceType:      pulumi.String("CustomLogs"),
//				ResourceGroupName:   example.Name,
//				WorkspaceResourceId: exampleAnalyticsWorkspace.ID(),
//				StorageAccountIds: pulumi.StringArray{
//					exampleAccount.ID(),
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
// * `Microsoft.OperationalInsights`: 2020-08-01
//
// ## Import
//
// Log Analytics Linked Storage Accounts can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:loganalytics/linkedStorageAccount:LinkedStorageAccount example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/linkedStorageAccounts/{dataSourceType}
// ```
type LinkedStorageAccount struct {
	pulumi.CustomResourceState

	// The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `CustomLogs`, `AzureWatson`, `Query`, `Ingestion` and `Alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
	DataSourceType pulumi.StringOutput `pulumi:"dataSourceType"`
	// The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The storage account resource ids to be linked.
	StorageAccountIds pulumi.StringArrayOutput `pulumi:"storageAccountIds"`
	// The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
	WorkspaceResourceId pulumi.StringOutput `pulumi:"workspaceResourceId"`
}

// NewLinkedStorageAccount registers a new resource with the given unique name, arguments, and options.
func NewLinkedStorageAccount(ctx *pulumi.Context,
	name string, args *LinkedStorageAccountArgs, opts ...pulumi.ResourceOption) (*LinkedStorageAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataSourceType == nil {
		return nil, errors.New("invalid value for required argument 'DataSourceType'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.StorageAccountIds == nil {
		return nil, errors.New("invalid value for required argument 'StorageAccountIds'")
	}
	if args.WorkspaceResourceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceResourceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LinkedStorageAccount
	err := ctx.RegisterResource("azure:loganalytics/linkedStorageAccount:LinkedStorageAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkedStorageAccount gets an existing LinkedStorageAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkedStorageAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkedStorageAccountState, opts ...pulumi.ResourceOption) (*LinkedStorageAccount, error) {
	var resource LinkedStorageAccount
	err := ctx.ReadResource("azure:loganalytics/linkedStorageAccount:LinkedStorageAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkedStorageAccount resources.
type linkedStorageAccountState struct {
	// The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `CustomLogs`, `AzureWatson`, `Query`, `Ingestion` and `Alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
	DataSourceType *string `pulumi:"dataSourceType"`
	// The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The storage account resource ids to be linked.
	StorageAccountIds []string `pulumi:"storageAccountIds"`
	// The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
	WorkspaceResourceId *string `pulumi:"workspaceResourceId"`
}

type LinkedStorageAccountState struct {
	// The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `CustomLogs`, `AzureWatson`, `Query`, `Ingestion` and `Alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
	DataSourceType pulumi.StringPtrInput
	// The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The storage account resource ids to be linked.
	StorageAccountIds pulumi.StringArrayInput
	// The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
	WorkspaceResourceId pulumi.StringPtrInput
}

func (LinkedStorageAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedStorageAccountState)(nil)).Elem()
}

type linkedStorageAccountArgs struct {
	// The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `CustomLogs`, `AzureWatson`, `Query`, `Ingestion` and `Alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
	DataSourceType string `pulumi:"dataSourceType"`
	// The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The storage account resource ids to be linked.
	StorageAccountIds []string `pulumi:"storageAccountIds"`
	// The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
	WorkspaceResourceId string `pulumi:"workspaceResourceId"`
}

// The set of arguments for constructing a LinkedStorageAccount resource.
type LinkedStorageAccountArgs struct {
	// The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `CustomLogs`, `AzureWatson`, `Query`, `Ingestion` and `Alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
	DataSourceType pulumi.StringInput
	// The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
	ResourceGroupName pulumi.StringInput
	// The storage account resource ids to be linked.
	StorageAccountIds pulumi.StringArrayInput
	// The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
	WorkspaceResourceId pulumi.StringInput
}

func (LinkedStorageAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedStorageAccountArgs)(nil)).Elem()
}

type LinkedStorageAccountInput interface {
	pulumi.Input

	ToLinkedStorageAccountOutput() LinkedStorageAccountOutput
	ToLinkedStorageAccountOutputWithContext(ctx context.Context) LinkedStorageAccountOutput
}

func (*LinkedStorageAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedStorageAccount)(nil)).Elem()
}

func (i *LinkedStorageAccount) ToLinkedStorageAccountOutput() LinkedStorageAccountOutput {
	return i.ToLinkedStorageAccountOutputWithContext(context.Background())
}

func (i *LinkedStorageAccount) ToLinkedStorageAccountOutputWithContext(ctx context.Context) LinkedStorageAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedStorageAccountOutput)
}

// LinkedStorageAccountArrayInput is an input type that accepts LinkedStorageAccountArray and LinkedStorageAccountArrayOutput values.
// You can construct a concrete instance of `LinkedStorageAccountArrayInput` via:
//
//	LinkedStorageAccountArray{ LinkedStorageAccountArgs{...} }
type LinkedStorageAccountArrayInput interface {
	pulumi.Input

	ToLinkedStorageAccountArrayOutput() LinkedStorageAccountArrayOutput
	ToLinkedStorageAccountArrayOutputWithContext(context.Context) LinkedStorageAccountArrayOutput
}

type LinkedStorageAccountArray []LinkedStorageAccountInput

func (LinkedStorageAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedStorageAccount)(nil)).Elem()
}

func (i LinkedStorageAccountArray) ToLinkedStorageAccountArrayOutput() LinkedStorageAccountArrayOutput {
	return i.ToLinkedStorageAccountArrayOutputWithContext(context.Background())
}

func (i LinkedStorageAccountArray) ToLinkedStorageAccountArrayOutputWithContext(ctx context.Context) LinkedStorageAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedStorageAccountArrayOutput)
}

// LinkedStorageAccountMapInput is an input type that accepts LinkedStorageAccountMap and LinkedStorageAccountMapOutput values.
// You can construct a concrete instance of `LinkedStorageAccountMapInput` via:
//
//	LinkedStorageAccountMap{ "key": LinkedStorageAccountArgs{...} }
type LinkedStorageAccountMapInput interface {
	pulumi.Input

	ToLinkedStorageAccountMapOutput() LinkedStorageAccountMapOutput
	ToLinkedStorageAccountMapOutputWithContext(context.Context) LinkedStorageAccountMapOutput
}

type LinkedStorageAccountMap map[string]LinkedStorageAccountInput

func (LinkedStorageAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedStorageAccount)(nil)).Elem()
}

func (i LinkedStorageAccountMap) ToLinkedStorageAccountMapOutput() LinkedStorageAccountMapOutput {
	return i.ToLinkedStorageAccountMapOutputWithContext(context.Background())
}

func (i LinkedStorageAccountMap) ToLinkedStorageAccountMapOutputWithContext(ctx context.Context) LinkedStorageAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedStorageAccountMapOutput)
}

type LinkedStorageAccountOutput struct{ *pulumi.OutputState }

func (LinkedStorageAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedStorageAccount)(nil)).Elem()
}

func (o LinkedStorageAccountOutput) ToLinkedStorageAccountOutput() LinkedStorageAccountOutput {
	return o
}

func (o LinkedStorageAccountOutput) ToLinkedStorageAccountOutputWithContext(ctx context.Context) LinkedStorageAccountOutput {
	return o
}

// The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are `CustomLogs`, `AzureWatson`, `Query`, `Ingestion` and `Alerts`. Changing this forces a new Log Analytics Linked Storage Account to be created.
func (o LinkedStorageAccountOutput) DataSourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedStorageAccount) pulumi.StringOutput { return v.DataSourceType }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
func (o LinkedStorageAccountOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedStorageAccount) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The storage account resource ids to be linked.
func (o LinkedStorageAccountOutput) StorageAccountIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkedStorageAccount) pulumi.StringArrayOutput { return v.StorageAccountIds }).(pulumi.StringArrayOutput)
}

// The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
func (o LinkedStorageAccountOutput) WorkspaceResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedStorageAccount) pulumi.StringOutput { return v.WorkspaceResourceId }).(pulumi.StringOutput)
}

type LinkedStorageAccountArrayOutput struct{ *pulumi.OutputState }

func (LinkedStorageAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedStorageAccount)(nil)).Elem()
}

func (o LinkedStorageAccountArrayOutput) ToLinkedStorageAccountArrayOutput() LinkedStorageAccountArrayOutput {
	return o
}

func (o LinkedStorageAccountArrayOutput) ToLinkedStorageAccountArrayOutputWithContext(ctx context.Context) LinkedStorageAccountArrayOutput {
	return o
}

func (o LinkedStorageAccountArrayOutput) Index(i pulumi.IntInput) LinkedStorageAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LinkedStorageAccount {
		return vs[0].([]*LinkedStorageAccount)[vs[1].(int)]
	}).(LinkedStorageAccountOutput)
}

type LinkedStorageAccountMapOutput struct{ *pulumi.OutputState }

func (LinkedStorageAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedStorageAccount)(nil)).Elem()
}

func (o LinkedStorageAccountMapOutput) ToLinkedStorageAccountMapOutput() LinkedStorageAccountMapOutput {
	return o
}

func (o LinkedStorageAccountMapOutput) ToLinkedStorageAccountMapOutputWithContext(ctx context.Context) LinkedStorageAccountMapOutput {
	return o
}

func (o LinkedStorageAccountMapOutput) MapIndex(k pulumi.StringInput) LinkedStorageAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LinkedStorageAccount {
		return vs[0].(map[string]*LinkedStorageAccount)[vs[1].(string)]
	}).(LinkedStorageAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedStorageAccountInput)(nil)).Elem(), &LinkedStorageAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedStorageAccountArrayInput)(nil)).Elem(), LinkedStorageAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedStorageAccountMapInput)(nil)).Elem(), LinkedStorageAccountMap{})
	pulumi.RegisterOutputType(LinkedStorageAccountOutput{})
	pulumi.RegisterOutputType(LinkedStorageAccountArrayOutput{})
	pulumi.RegisterOutputType(LinkedStorageAccountMapOutput{})
}
