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

// Manages a Log Analytics Linked Service.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/automation"
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
//				Name:     pulumi.String("resourcegroup-01"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := automation.NewAccount(ctx, "example", &automation.AccountArgs{
//				Name:              pulumi.String("automation-01"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				SkuName:           pulumi.String("Basic"),
//				Tags: pulumi.StringMap{
//					"environment": pulumi.String("development"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleAnalyticsWorkspace, err := operationalinsights.NewAnalyticsWorkspace(ctx, "example", &operationalinsights.AnalyticsWorkspaceArgs{
//				Name:              pulumi.String("workspace-01"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("PerGB2018"),
//				RetentionInDays:   pulumi.Int(30),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = loganalytics.NewLinkedService(ctx, "example", &loganalytics.LinkedServiceArgs{
//				ResourceGroupName: example.Name,
//				WorkspaceId:       exampleAnalyticsWorkspace.ID(),
//				ReadAccessId:      exampleAccount.ID(),
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
// Log Analytics Workspaces can be imported using the `resource id`, e.g.
//
// When `read_access_id` has been specified:
//
// ```sh
// $ pulumi import azure:loganalytics/linkedService:LinkedService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/linkedServices/Automation
// ```
//
// When `read_access_id` has been omitted:
//
// ```sh
// $ pulumi import azure:loganalytics/linkedService:LinkedService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/linkedServices/Cluster
// ```
type LinkedService struct {
	pulumi.CustomResourceState

	// The generated name of the Linked Service. The format for this attribute is always `<workspace name>/<linked service type>`(e.g. `workspace1/Automation` or `workspace1/Cluster`)
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the readable Resource that will be linked to the workspace. This should be used for linking to an Automation Account resource.
	ReadAccessId pulumi.StringOutput `pulumi:"readAccessId"`
	// The name of the resource group in which the Log Analytics Linked Service is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The ID of the Log Analytics Workspace that will contain the Log Analytics Linked Service resource.
	WorkspaceId pulumi.StringOutput `pulumi:"workspaceId"`
	// The ID of the writable Resource that will be linked to the workspace. This should be used for linking to a Log Analytics Cluster resource.
	//
	// > **Note:** You must define at least one of the above access resource id attributes (e.g. `readAccessId` or `writeAccessId`).
	WriteAccessId pulumi.StringPtrOutput `pulumi:"writeAccessId"`
}

// NewLinkedService registers a new resource with the given unique name, arguments, and options.
func NewLinkedService(ctx *pulumi.Context,
	name string, args *LinkedServiceArgs, opts ...pulumi.ResourceOption) (*LinkedService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LinkedService
	err := ctx.RegisterResource("azure:loganalytics/linkedService:LinkedService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkedService gets an existing LinkedService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkedService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkedServiceState, opts ...pulumi.ResourceOption) (*LinkedService, error) {
	var resource LinkedService
	err := ctx.ReadResource("azure:loganalytics/linkedService:LinkedService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkedService resources.
type linkedServiceState struct {
	// The generated name of the Linked Service. The format for this attribute is always `<workspace name>/<linked service type>`(e.g. `workspace1/Automation` or `workspace1/Cluster`)
	Name *string `pulumi:"name"`
	// The ID of the readable Resource that will be linked to the workspace. This should be used for linking to an Automation Account resource.
	ReadAccessId *string `pulumi:"readAccessId"`
	// The name of the resource group in which the Log Analytics Linked Service is created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The ID of the Log Analytics Workspace that will contain the Log Analytics Linked Service resource.
	WorkspaceId *string `pulumi:"workspaceId"`
	// The ID of the writable Resource that will be linked to the workspace. This should be used for linking to a Log Analytics Cluster resource.
	//
	// > **Note:** You must define at least one of the above access resource id attributes (e.g. `readAccessId` or `writeAccessId`).
	WriteAccessId *string `pulumi:"writeAccessId"`
}

type LinkedServiceState struct {
	// The generated name of the Linked Service. The format for this attribute is always `<workspace name>/<linked service type>`(e.g. `workspace1/Automation` or `workspace1/Cluster`)
	Name pulumi.StringPtrInput
	// The ID of the readable Resource that will be linked to the workspace. This should be used for linking to an Automation Account resource.
	ReadAccessId pulumi.StringPtrInput
	// The name of the resource group in which the Log Analytics Linked Service is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The ID of the Log Analytics Workspace that will contain the Log Analytics Linked Service resource.
	WorkspaceId pulumi.StringPtrInput
	// The ID of the writable Resource that will be linked to the workspace. This should be used for linking to a Log Analytics Cluster resource.
	//
	// > **Note:** You must define at least one of the above access resource id attributes (e.g. `readAccessId` or `writeAccessId`).
	WriteAccessId pulumi.StringPtrInput
}

func (LinkedServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceState)(nil)).Elem()
}

type linkedServiceArgs struct {
	// The ID of the readable Resource that will be linked to the workspace. This should be used for linking to an Automation Account resource.
	ReadAccessId *string `pulumi:"readAccessId"`
	// The name of the resource group in which the Log Analytics Linked Service is created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The ID of the Log Analytics Workspace that will contain the Log Analytics Linked Service resource.
	WorkspaceId string `pulumi:"workspaceId"`
	// The ID of the writable Resource that will be linked to the workspace. This should be used for linking to a Log Analytics Cluster resource.
	//
	// > **Note:** You must define at least one of the above access resource id attributes (e.g. `readAccessId` or `writeAccessId`).
	WriteAccessId *string `pulumi:"writeAccessId"`
}

// The set of arguments for constructing a LinkedService resource.
type LinkedServiceArgs struct {
	// The ID of the readable Resource that will be linked to the workspace. This should be used for linking to an Automation Account resource.
	ReadAccessId pulumi.StringPtrInput
	// The name of the resource group in which the Log Analytics Linked Service is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The ID of the Log Analytics Workspace that will contain the Log Analytics Linked Service resource.
	WorkspaceId pulumi.StringInput
	// The ID of the writable Resource that will be linked to the workspace. This should be used for linking to a Log Analytics Cluster resource.
	//
	// > **Note:** You must define at least one of the above access resource id attributes (e.g. `readAccessId` or `writeAccessId`).
	WriteAccessId pulumi.StringPtrInput
}

func (LinkedServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceArgs)(nil)).Elem()
}

type LinkedServiceInput interface {
	pulumi.Input

	ToLinkedServiceOutput() LinkedServiceOutput
	ToLinkedServiceOutputWithContext(ctx context.Context) LinkedServiceOutput
}

func (*LinkedService) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedService)(nil)).Elem()
}

func (i *LinkedService) ToLinkedServiceOutput() LinkedServiceOutput {
	return i.ToLinkedServiceOutputWithContext(context.Background())
}

func (i *LinkedService) ToLinkedServiceOutputWithContext(ctx context.Context) LinkedServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceOutput)
}

// LinkedServiceArrayInput is an input type that accepts LinkedServiceArray and LinkedServiceArrayOutput values.
// You can construct a concrete instance of `LinkedServiceArrayInput` via:
//
//	LinkedServiceArray{ LinkedServiceArgs{...} }
type LinkedServiceArrayInput interface {
	pulumi.Input

	ToLinkedServiceArrayOutput() LinkedServiceArrayOutput
	ToLinkedServiceArrayOutputWithContext(context.Context) LinkedServiceArrayOutput
}

type LinkedServiceArray []LinkedServiceInput

func (LinkedServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedService)(nil)).Elem()
}

func (i LinkedServiceArray) ToLinkedServiceArrayOutput() LinkedServiceArrayOutput {
	return i.ToLinkedServiceArrayOutputWithContext(context.Background())
}

func (i LinkedServiceArray) ToLinkedServiceArrayOutputWithContext(ctx context.Context) LinkedServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceArrayOutput)
}

// LinkedServiceMapInput is an input type that accepts LinkedServiceMap and LinkedServiceMapOutput values.
// You can construct a concrete instance of `LinkedServiceMapInput` via:
//
//	LinkedServiceMap{ "key": LinkedServiceArgs{...} }
type LinkedServiceMapInput interface {
	pulumi.Input

	ToLinkedServiceMapOutput() LinkedServiceMapOutput
	ToLinkedServiceMapOutputWithContext(context.Context) LinkedServiceMapOutput
}

type LinkedServiceMap map[string]LinkedServiceInput

func (LinkedServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedService)(nil)).Elem()
}

func (i LinkedServiceMap) ToLinkedServiceMapOutput() LinkedServiceMapOutput {
	return i.ToLinkedServiceMapOutputWithContext(context.Background())
}

func (i LinkedServiceMap) ToLinkedServiceMapOutputWithContext(ctx context.Context) LinkedServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceMapOutput)
}

type LinkedServiceOutput struct{ *pulumi.OutputState }

func (LinkedServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedService)(nil)).Elem()
}

func (o LinkedServiceOutput) ToLinkedServiceOutput() LinkedServiceOutput {
	return o
}

func (o LinkedServiceOutput) ToLinkedServiceOutputWithContext(ctx context.Context) LinkedServiceOutput {
	return o
}

// The generated name of the Linked Service. The format for this attribute is always `<workspace name>/<linked service type>`(e.g. `workspace1/Automation` or `workspace1/Cluster`)
func (o LinkedServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedService) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the readable Resource that will be linked to the workspace. This should be used for linking to an Automation Account resource.
func (o LinkedServiceOutput) ReadAccessId() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedService) pulumi.StringOutput { return v.ReadAccessId }).(pulumi.StringOutput)
}

// The name of the resource group in which the Log Analytics Linked Service is created. Changing this forces a new resource to be created.
func (o LinkedServiceOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedService) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The ID of the Log Analytics Workspace that will contain the Log Analytics Linked Service resource.
func (o LinkedServiceOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedService) pulumi.StringOutput { return v.WorkspaceId }).(pulumi.StringOutput)
}

// The ID of the writable Resource that will be linked to the workspace. This should be used for linking to a Log Analytics Cluster resource.
//
// > **Note:** You must define at least one of the above access resource id attributes (e.g. `readAccessId` or `writeAccessId`).
func (o LinkedServiceOutput) WriteAccessId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedService) pulumi.StringPtrOutput { return v.WriteAccessId }).(pulumi.StringPtrOutput)
}

type LinkedServiceArrayOutput struct{ *pulumi.OutputState }

func (LinkedServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedService)(nil)).Elem()
}

func (o LinkedServiceArrayOutput) ToLinkedServiceArrayOutput() LinkedServiceArrayOutput {
	return o
}

func (o LinkedServiceArrayOutput) ToLinkedServiceArrayOutputWithContext(ctx context.Context) LinkedServiceArrayOutput {
	return o
}

func (o LinkedServiceArrayOutput) Index(i pulumi.IntInput) LinkedServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LinkedService {
		return vs[0].([]*LinkedService)[vs[1].(int)]
	}).(LinkedServiceOutput)
}

type LinkedServiceMapOutput struct{ *pulumi.OutputState }

func (LinkedServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedService)(nil)).Elem()
}

func (o LinkedServiceMapOutput) ToLinkedServiceMapOutput() LinkedServiceMapOutput {
	return o
}

func (o LinkedServiceMapOutput) ToLinkedServiceMapOutputWithContext(ctx context.Context) LinkedServiceMapOutput {
	return o
}

func (o LinkedServiceMapOutput) MapIndex(k pulumi.StringInput) LinkedServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LinkedService {
		return vs[0].(map[string]*LinkedService)[vs[1].(string)]
	}).(LinkedServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceInput)(nil)).Elem(), &LinkedService{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceArrayInput)(nil)).Elem(), LinkedServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceMapInput)(nil)).Elem(), LinkedServiceMap{})
	pulumi.RegisterOutputType(LinkedServiceOutput{})
	pulumi.RegisterOutputType(LinkedServiceArrayOutput{})
	pulumi.RegisterOutputType(LinkedServiceMapOutput{})
}
