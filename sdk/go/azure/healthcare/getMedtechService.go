// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package healthcare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Healthcare Med Tech Service
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/healthcare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := healthcare.LookupMedtechService(ctx, &healthcare.LookupMedtechServiceArgs{
//				Name:        "tfexmedtech",
//				WorkspaceId: "tfexwks",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("azurermHealthcareMedtechServiceId", example.Id)
//			return nil
//		})
//	}
//
// ```
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This data source uses the following Azure API Providers:
//
// * `Microsoft.HealthcareApis`: 2022-12-01
func LookupMedtechService(ctx *pulumi.Context, args *LookupMedtechServiceArgs, opts ...pulumi.InvokeOption) (*LookupMedtechServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMedtechServiceResult
	err := ctx.Invoke("azure:healthcare/getMedtechService:getMedtechService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMedtechService.
type LookupMedtechServiceArgs struct {
	// The name of the Healthcare Med Tech Service.
	Name string `pulumi:"name"`
	// The id of the Healthcare Workspace in which the Healthcare Med Tech Service exists.
	WorkspaceId string `pulumi:"workspaceId"`
}

// A collection of values returned by getMedtechService.
type LookupMedtechServiceResult struct {
	// The Device Mappings of the Med Tech Service.
	DeviceMappingJson string `pulumi:"deviceMappingJson"`
	// The Consumer Group of the Event Hub of the Healthcare Med Tech Service.
	EventhubConsumerGroupName string `pulumi:"eventhubConsumerGroupName"`
	// The name of the Event Hub of the Healthcare Med Tech Service.
	EventhubName string `pulumi:"eventhubName"`
	// The namespace name of the Event Hub of the Healthcare Med Tech Service.
	EventhubNamespaceName string `pulumi:"eventhubNamespaceName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The `identity` block as defined below.
	Identities  []GetMedtechServiceIdentity `pulumi:"identities"`
	Name        string                      `pulumi:"name"`
	WorkspaceId string                      `pulumi:"workspaceId"`
}

func LookupMedtechServiceOutput(ctx *pulumi.Context, args LookupMedtechServiceOutputArgs, opts ...pulumi.InvokeOption) LookupMedtechServiceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupMedtechServiceResultOutput, error) {
			args := v.(LookupMedtechServiceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:healthcare/getMedtechService:getMedtechService", args, LookupMedtechServiceResultOutput{}, options).(LookupMedtechServiceResultOutput), nil
		}).(LookupMedtechServiceResultOutput)
}

// A collection of arguments for invoking getMedtechService.
type LookupMedtechServiceOutputArgs struct {
	// The name of the Healthcare Med Tech Service.
	Name pulumi.StringInput `pulumi:"name"`
	// The id of the Healthcare Workspace in which the Healthcare Med Tech Service exists.
	WorkspaceId pulumi.StringInput `pulumi:"workspaceId"`
}

func (LookupMedtechServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMedtechServiceArgs)(nil)).Elem()
}

// A collection of values returned by getMedtechService.
type LookupMedtechServiceResultOutput struct{ *pulumi.OutputState }

func (LookupMedtechServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMedtechServiceResult)(nil)).Elem()
}

func (o LookupMedtechServiceResultOutput) ToLookupMedtechServiceResultOutput() LookupMedtechServiceResultOutput {
	return o
}

func (o LookupMedtechServiceResultOutput) ToLookupMedtechServiceResultOutputWithContext(ctx context.Context) LookupMedtechServiceResultOutput {
	return o
}

// The Device Mappings of the Med Tech Service.
func (o LookupMedtechServiceResultOutput) DeviceMappingJson() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMedtechServiceResult) string { return v.DeviceMappingJson }).(pulumi.StringOutput)
}

// The Consumer Group of the Event Hub of the Healthcare Med Tech Service.
func (o LookupMedtechServiceResultOutput) EventhubConsumerGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMedtechServiceResult) string { return v.EventhubConsumerGroupName }).(pulumi.StringOutput)
}

// The name of the Event Hub of the Healthcare Med Tech Service.
func (o LookupMedtechServiceResultOutput) EventhubName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMedtechServiceResult) string { return v.EventhubName }).(pulumi.StringOutput)
}

// The namespace name of the Event Hub of the Healthcare Med Tech Service.
func (o LookupMedtechServiceResultOutput) EventhubNamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMedtechServiceResult) string { return v.EventhubNamespaceName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMedtechServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMedtechServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The `identity` block as defined below.
func (o LookupMedtechServiceResultOutput) Identities() GetMedtechServiceIdentityArrayOutput {
	return o.ApplyT(func(v LookupMedtechServiceResult) []GetMedtechServiceIdentity { return v.Identities }).(GetMedtechServiceIdentityArrayOutput)
}

func (o LookupMedtechServiceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMedtechServiceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupMedtechServiceResultOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMedtechServiceResult) string { return v.WorkspaceId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMedtechServiceResultOutput{})
}
